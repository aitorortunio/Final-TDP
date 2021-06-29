# Enunciado del problema a resolver

Winter is Coming: La aplicación “Winter is Coming” calcula cuales son las 5 palabras más usadas de un
conjunto de archivos de texto. La aplicación debe contar con un botón “Cargar Directorio” el cual permita indicar
el directorio donde se encuentran los archivos de texto. Luego, al clickear un botón con la etiqueta “Comenzar”,
calculará las 5 palabras más usada y las mostrará en pantalla. Junto a cada palabra se mostrará que
porcentaje, de todas las palabras contadas, representa esa palabra. La aplicación “Winter is Coming” también
tendrá una opción para elegir el idioma de los textos que aparezcan en pantalla, las opciones deben ser
“Español” e “Inglés”. Si el usuario selecciona “Inglés” todos los textos de los botones, pantalla, etc, deben
aparecer en inglés. Si el usuario selecciona “Español” todos los textos aparecerán en español. Los cambios se
deben ver reflejados luego de la selección del idioma.

Dos palabras, cuya única diferencia sea el uso de mayúsculas, se tratarán como la misma palabra. Esto es, si
se encuentra “Tecnología” y “tecnología”, se contará como 2 apariciones de la palabra “tecnología”. Sin
embargo, si la diferencia está en el uso de los acentos (o no uso), se tratarán como palabras diferentes. Por
ejemplo, si se tiene “Tecnología” y “tecnologia”, esto contará como 1 aparición de “Tecnología” y 1 aparición de
“tecnología”. Sólo se deberán tener en cuenta archivos con extensión .txt.
Estructura del proyecto: Toda la aplicación deberá estar dentro de un paquete denominado “got”. Dentro de
este paquete habrá dos subpaquetes, “src” y “jar”. En “src” estarán todos los archivos fuentes de “Winter is
Coming” y en “jar” estará el ejecutable de la aplicación. El ejecutable deberá ser un único archivo denominado
“got.jar”.

La implementación del manejo de idiomas se debe hacer usando archivos de propiedades. Para esto se
recomienda ver los siguientes artículos:
  ● https://docs.oracle.com/javase/tutorial/i18n/intro/steps.html  
  ● https://mkyong.com/java/java-properties-file-examples/
