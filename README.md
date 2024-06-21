# Conversor de Monedas
Es una aplicación en consola creada en java  la cual permite convertir  entre distintos tipos de monedas gracias al consumo de la api de  [exchangerate](https://www.exchangerate-api.com/) y guardar un historial sobre las conversiones creadas


### Pre-requisitos 📋

_¿Que cosas necesitas para instalar el software y como instalarlas?_

```
Debes tener el JDK 17 de java o una version superior instalado en tu maquina
Necesitas descargar la libreria [GSON] (https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0) y colocarla en el proyecto al mismo nivel que  la carpeta SRC
Debes generar tu api key de [exchangerate](https://www.exchangerate-api.com/) y colocarla en el proyecto
ESta se debe colocar en el archivo [Main](src/Main.java) en la linea 15  donde cambiaras "API_KEY" por tu api key , dejandolo entre parentesis por ejemplo si tu clave es 1234
deberia mirarse como  ConnectionApi connection = new ConnectionApi("1234");
```

### Instalación 🔧

_Una serie de ejemplos paso a paso que te dice lo que debes ejecutar para tener un entorno de desarrollo ejecutandose_

_Dí cómo será ese paso_

```
Da un ejemplo
```

_Y repite_

```
hasta finalizar
```

_Finaliza con un ejemplo de cómo obtener datos del sistema o como usarlos para una pequeña demo_

## Ejecutando las pruebas ⚙️

_Explica como ejecutar las pruebas automatizadas para este sistema_

### Analice las pruebas end-to-end 🔩

_Explica que verifican estas pruebas y por qué_


```
Da un ejemplo
```

### Y las pruebas de estilo de codificación ⌨️

_Explica que verifican estas pruebas y por qué_

```
Da un ejemplo
```

## Despliegue 📦

_Agrega notas adicionales sobre como hacer deploy_

## Construido con 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - El framework web usado
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [ROME](https://rometools.github.io/rome/) - Usado para generar RSS


## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Roberto Gordillo Herrera** - *Desarrolador* - [Roberth_G](https://github.com/RoberthGo)

## Licencia 📄
Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE.md](LICENSE.md) para más detalles
