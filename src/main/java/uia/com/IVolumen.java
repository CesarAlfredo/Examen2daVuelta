package uia.com.inventarios;

public interface IVolumen {


   public default void largo(String largo){
      this.largo(largo);
   }
   public default void alto(String alto){
      this.alto(alto);
   }
   public default void ancho(String ancho){
      this.ancho(ancho);
   }
   public default void volumen(String volumen){
      this.volumen(volumen);
   }

}
