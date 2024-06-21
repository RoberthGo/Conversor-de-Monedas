# Conversor de Monedas

![Java JDK](https://img.shields.io/badge/Java_JDK-v17.0-blue)
![IDE](https://img.shields.io/badge/IDE-Intellij_IDEA-blue)
![GSON](https://img.shields.io/badge/GSON-V2.11.0-blue)

Esta es una aplicación de consola creada en Java que permite convertir entre distintos tipos de monedas gracias al consumo de la API [ExchangeRate.](https://www.exchangerate-api.com/) Esto permite utilizar el cambio de moneda más actual en el mercado. Además, la aplicación guarda un historial de las conversiones realizadas en un archivo.

### Pre-requisitos 📋
Para ejecutar el programa, necesitas las siguientes tecnologías utilizadas durante su desarrollo:
* Java JDK: Debes tener instalada la versión 17 o superior del Java Development Kit. Puedes descargarlo [aquí](https://www.oracle.com/java/technologies/downloads/#java17).
  
* Biblioteca Gson 2.11.0 en adelante. Descarga [aquí](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0). (El archivo debe tener la extensión ".jar".) </br>
  \t Si usas IntelliJ IDEA, debes hacer clic derecho sobre la carpeta raíz del proyecto y, en el apartado "Open Modules Settings", importas la biblioteca.
  
* Clave Api: Puedes obtenerla registrándote en [ExchangeRate.](https://www.exchangerate-api.com/) Después de registrarte, recibirás un correo para activar tu clave API. </br>
  \t Luego, colócala en el archivo [Main.java](src/Main.java) en la línea 15, cambiarás "API_KEY" por tu clave API (dejándola entre comillas). </br>
  \t Por ejemplo, si tu clave es 1234, debería verse así: ConnectionApi connection = new ConnectionApi("1234");
    
* IDE IntelliJ IDEA: Descarga [aquí](https://www.jetbrains.com/idea/) </br>
  \t Yo recomendaría su uso, pues fue el IDE con el cual se creó la aplicación y facilita agregar la Biblioteca Gson.
   
## Autor ✒️
* **Roberto Gordillo Herrera** - [Roberth_G](https://github.com/RoberthGo)

## Licencia 📄
Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE.md](LICENSE.md) para más detalles
