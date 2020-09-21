
package Modelos;

import java.util.ArrayList;

/**
 * Clase para representar un Repositorio en Git.
 * Un Repositorio queda determinado por su nombre, autor, y las 4 zonas de trabajo: Workspace, Index,
 * Local Repository y Remote Repository. 
 * Cabe destacar que la Clase Repositorio tiene a 2 clases ListaArchivos y 2 clases ListaCommits, 
 * es decir, hay una relación de agregación entre 
 * Repositorio y ListaArchivos, y entre Repositorio y ListaCommits
 * @author Jennifer Velozo
 */
public class Repositorio {
    //Atributos 
    public String nombreRepo; //nombre del repositorio
    public String autorRepo; //autor del repositorio
    public ListaArchivos workspace; //zona de trabajo Workspace
    public ListaArchivos index; //zona de trabajo Index
    public ListaCommits localR; //zona de trabajo Local Repository
    public ListaCommits remoteR; //zona de trabajo Remote Repository
   
    /**
     * Permite obtener el nombre del repositorio.
     * @return string que representa el nombre del repositorio
     */
    public String getNombreRepo(){
        return this.nombreRepo;
    }
    /**
     * Permite obtener el autor del repositorio.
     * @return string que representa el autor del repositorio
     */
    public String getAutorRepo(){
        return this.autorRepo;
    }
    /**
     * Permite obtener la zona de trabajo workspace del repositorio.
     * @return ListaArchivos que representa la zona de trabajo workspace del repositorio
     */
    public ListaArchivos getWorkspace(){
        return this.workspace;
    }
    /**
     * Permite obtener la zona de trabajo index del repositorio.
     * @return ListaArchivos que representa la zona de trabajo index del repositorio
     */
    public ListaArchivos getIndex(){
        return this.index;
    }
    /**
     * Permite obtener la zona de trabajo local repository del repositorio.
     * @return ListaCommits que representa la zona de trabajo local repository del repositorio
     */
    public ListaCommits getLocalR(){
        return this.localR;
    }
    /**
     * Permite obtener la zona de trabajo remote repository del repositorio.
     * @return ListaCommits que representa la zona de trabajo remote repository del repositorio
     */
    public ListaCommits getRemoteR(){
        return this.remoteR;
    }
    /**
     * Permite modificar el nombre del repositorio.
     * @param nombre nuevo nombre del repositorio
     */
    public void setNombreRepo(String nombre){
        this.nombreRepo=nombre;
    }
    /**
     * Permite modificar el autor del repositorio.
     * @param autor nuevo autor del repositorio
     */
    public void setAutorRepo(String autor){
        this.autorRepo=autor;
    }
    /**
     * Permite modificar la zona de trabajo workspace del repositorio.
     * @param workspace nueva zona de trabajo workspace
     */
    public void setWorkspace(ListaArchivos workspace){
        this.workspace=workspace;
    }
    /**
     * Permite modificar la zona de trabajo index del repositorio.
     * @param index nueva zona de trabajo index
     */
    public void setIndex(ListaArchivos index){
        this.index=index;
    }
    /**
     * Permite modificar la zona de trabajo local repository del repositorio.
     * @param localR nueva zona de trabajo local repository
     */
    public void setLocalR(ListaCommits localR){
        this.localR=localR;
    }
    /**
     * Permite modificar la zona de trabajo remote repository del repositorio.
     * @param remoteR nueva zona de trabajo remote repository
     */
    public void setRemoteR(ListaCommits remoteR){
        this.remoteR=remoteR;
    }
    /** 
      * Inicializa un nuevo repositorio
      * @param nombre nombre del repositorio
      * @param autor autor del repositorio
      */
    public void gitInit(String nombre, String autor){
        //Se inicializa vacía la zona de trabajo Workspace
        ListaArchivos myWS=new ListaArchivos(new ArrayList<>());

        //Se inicializa vacía la zona de trabajo Index
        ListaArchivos myIndex= new ListaArchivos(new ArrayList<>());
        
        //Se iniciliza vacía la zona de trabajo Local Repository
        ListaCommits myLocalR= new ListaCommits(new ArrayList<>());

        //Se inicializa vacía la zona de trabajo Remote Repository
        ListaCommits myRemoteR= new ListaCommits(new ArrayList<>());
        
        //Se asignan los datos correspondientes al repositorio
        this.setNombreRepo(nombre);
        this.setAutorRepo(autor);
        this.setWorkspace(myWS);
        this.setIndex(myIndex);
        this.setLocalR(myLocalR);
        this.setRemoteR(myRemoteR);
    }
    
    /** 
      * Agrega al Index uno o más archivos de texto plano del Workspace.
      * @param archivosIngresados un arreglo estático de strings, que corresponde los nombres de archivos ingresados por el usuario
      */
    public void gitAdd(String [] archivosIngresados){
        //Se crea una lista con aquellos archivos que pertenecen al Workspace
        ListaArchivos archivos=this.getWorkspace().archivosQueEstan(archivosIngresados);
        for(int i=0;i<archivos.cantidadArchivos;i++){
            this.getIndex().agregarArchivo(archivos.listaArchivos.get(i));
        }
    }
    
    /** 
      * Crea un nuevo commit en el Local Repository con el contenido del Index, 
      * solicitando un mensaje descriptivo para dicho commit.
      * @param mensaje mensaje descriptivo del commit
      * @param autor autor del commit
      */
    public void gitCommit(String mensaje, String autor){
        //Se obtienen los cambios, que corresponden a los archivos del Index
        ListaArchivos cambios=this.getIndex();
        /**
         * Si la cantidad de archivos en el index es distinto a 0,
         * se crea un commit
         * */
        if (cambios.cantidadArchivos!=0){
            //Se crea un objeto de tipo Commit en base a los datos anteriores
            Commit commit=new Commit(autor,mensaje,cambios);
            this.getLocalR().agregarCommit(commit);
        }
        //Luego de hacer un commit, el Index queda vacío
        ListaArchivos myIndex= new ListaArchivos(new ArrayList<>());
        this.setIndex(myIndex);
    }
    
    /**
     * Toma todos los commits del Local Repository y los envía al Remote Repository.
     */
    public void gitPush(){
        //Si hay commits en el local repository, se copiane  en el remote repository
        if(this.getLocalR().cantidadCommits!=0){
            ListaCommits enviarARemoteR=this.getLocalR();
            for(int i=0;i<enviarARemoteR.cantidadCommits;i++){
                if(this.getRemoteR().estaCommit(enviarARemoteR.listaCommits.get(i))==0){
                    this.getRemoteR().agregarCommit(enviarARemoteR.listaCommits.get(i));
                }
            }
        }
    }
    /**
     * Toma todos los archivos del Remote Repository y los copia en el Workspace.
     */
    public void gitPull(){
        //Se crea una lista de archivos para enviarlos al Workspace
        ListaArchivos enviarAWS=new ListaArchivos(new ArrayList<>());
        for(int i=0;i<this.getRemoteR().cantidadCommits;i++){
            //Se obtienen los archivos del commit analizado, que corresponde a los cambios de este
            ListaArchivos archivosCommit=this.getRemoteR().listaCommits.get(i).cambios;
            //Se agregan los archivos a la lista de archivos que será enviada al Workspace
            for(int j=0;j<archivosCommit.cantidadArchivos;j++){
                enviarAWS.agregarArchivo(archivosCommit.listaArchivos.get(j));
            }
        }
        //Se agregan los archivos en el Workspace
        for (int i=0;i<enviarAWS.cantidadArchivos;i++){
            int posicion=this.getWorkspace().estaArchivo(enviarAWS.listaArchivos.get(i).nombreArchivo);
            //Si el archivo analizado el Remote Repostiroy no está en el Workspace, entonces se agrega
            if (posicion==-1){
                this.getWorkspace().agregarArchivo(enviarAWS.listaArchivos.get(i));
            }
            else{
                //Se sobreescribe el contenido del archivo en caso de haber cambios en él.
                this.getWorkspace().listaArchivos.get(posicion).contenido=enviarAWS.listaArchivos.get(i).contenido;
            }
        }
    }
    
    /**
     * Permite representar un repositorio a través de un string.
     * @return un string que representa el estado actual del repositorio Git
     */
    public String gitStatus(){
        String statusString=
                "\nNombre del repositorio: "+ this.getNombreRepo()+
                "\nAutor del repositorio: "+ this.getAutorRepo()+
                "\nNumero de archivos en el Workspace: "+ this.getWorkspace().cantidadArchivos+
                "\nNumero de commits en Local Repository: "+this.getLocalR().cantidadCommits;
        if(!this.getLocalR().listaCommits.equals(this.getRemoteR().listaCommits)){
            statusString+="\nEl Remote Repository no está al día";
        }
        else{
            statusString+="\nEl Remote Repository está al día";
        }
        return statusString;
    }
    
    /**
     * Crea un archivo, solicitando el nombre y contenido al usuario.
     * @param nombreArchivo nombre del archivo ingresado por el usuario
     * @param contenidoArchivo contenido del archivo ingresado por el usuario
     */
    public void crearArchivo(String nombreArchivo, String contenidoArchivo){
        //Se crea un nuevo objeto de tipo Archivo
        Archivo archivo=new Archivo(nombreArchivo,contenidoArchivo);
        //Se agrega el nuevo archivo a la zona de trabajo Workspace
        if(this.getWorkspace().estaArchivo(archivo.nombreArchivo)==-1){
            this.getWorkspace().agregarArchivo(archivo);
        }
        
    }
   
}
