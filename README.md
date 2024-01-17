# REGISTRO_D_PELICULAS_D_STREAMING

![peliculas](https://github.com/Yoswell/REGISTRO_D_PELICULAS_D_STREAMING/assets/113799193/bf05d794-f362-4061-9755-8ebec1f77366)

<strong>Instrucciones:</strong><br>Se deberá implementar un programa para gestionar películas por proveedor de streaming<br>

🐽 <strong>Registro de proveedores de streaming:</strong><br>
Debe existir una pantalla gráfica que nos permite incluir proveedores. Cada proveedor incluido se almacenará en un arreglo de objetos de la clase “Proveedor”, la cual funcionará como una pila (último elemento en entrar, primero en salir). Un atributo del elemento “Proveedor” será un arreglo de objetos de la clase “Película”, el cual se describe en la siguiente funcionalidad (Registro de películas). No se podrán usar colecciones o interfaces de Java como Stack, ArrayList o ninguna otra colección ya implementada. En esta pantalla se podrá incluir registros de proveedores con los siguientes campos:<br><br>

  🦴 ID del proveedor<br>
  🦴 Nombre del proveedor, por ejemplo (Netflix)<br><br>

🐽 <strong>Registro de películas:</strong><br>
En esta pantalla se debe mostrar una lista gráfica con los diferentes proveedores registrados. El usuario deberá seleccionar uno de los proveedores y a continuación ingresar los datos de la película, la cual se va a relacionar con el proveedor previamente seleccionado. Los campos por ingresar para una película serán los siguientes:<br><br>

  🦴 DNI (identificador unico en formato: 70aba303-60d8-4cb5-b3e7-4170c4be5642) generado aleatoriamente<br>
  🦴 Nombre de la pelicula<br>
  🦴 Categoria de la pelicula (Acción, terror...)<br>
  🦴 Audiencia de la pelicula (Niños, Adultos...)<br>
  🦴 Formato de la pelicula (2D, 3D, IMAX)<br><br>

El almacenamiento de las películas por proveedor se realizará mediante un arreglo de objetos de la clase “Película”, el cual funcionará como una cola (primero en entrar, primero en salir). No podrá utilizarse ninguna colección de Java como Queue, ArrayList ni ninguna otra colección. Se deberá utilizar una cola independiente con los diferentes registros de películas, dentro de cada elemento de la pila principal de proveedores. Al inicio la Pila de Proveedores estará vacía. Al incluir un primer proveedor, éste contendrá una cola de películas vacía, hasta que el usuario incluya las películas de ese proveedor

🐽 <strong>Eliminación de películas:</strong><br>
En esta pantalla se debe mostrar una lista gráfica con las diferentes películas registradas. El usuario deberá seleccionar uno de los proveedores registrados y a continuación se mostrarán las películas registradas relacionadas al proveedor seleccionado (se deben mostrar todos los campos de las películas). Al hacer clic en un botón “Eliminar película”, se eliminará la película que se registró de primero (recordemos que se trata de una cola). Luego, se refrescará la lista de películas en la pantalla

🐽 <strong>Eliminación de proveedores:</strong><br>
La eliminación de proveedores consiste en una acción que intentará eliminar de la pila el último elemento registrado (como en cualquier pila). La eliminación se hará efectiva únicamente si el último elemento de la pila no contiene ninguna película registrada (es decir, su cola de películas está vacía). En caso de existir al menos una película, se mostrará un mensaje (utilizando una etiqueta o un campo de texto en la pantalla) indicando que no se puede eliminar el proveedor debido a que tiene películas relacionadas. Si el proveedor es eliminado, se refrescará la lista de proveedores con los elementos existentes. Debe existir un menú con cada una de las opciones
