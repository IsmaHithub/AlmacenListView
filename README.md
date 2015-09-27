# AlmacenListView
Requisitos previos:

Descarga de GitHub para Windows. Incluye la instalación del control de versiones Git (este paso es opcional): https://windows.github.com/.
Crear cuenta de usuario en GitHub: https://github.com/join.
Crear un repositorio indicando el nombre y la descripción (opcional). Esta opción permitirá subir los proyectos y almacenarlos.
Comprobar inicio de sesión en GitHub desde Android Studio a través de la ruta File > Settings > Version Control > GitHub, e indicar los datos de la cuenta de usuario creada. A continuación pulsar sobre el botón “Test” para comprobar que los datos de conexión son correctos:
Settings Version Control GitHub
A continuación, solicitará que ingrese y confirme una nueva contraseña (Master Password), que permite cifrar el archivo que almacenará las diferentes contraseñas almacenadas en Android Studio.
Al finalizar la instalación de GitHub, se deberá seguir la ruta File > Version Control > Git (esta opción no será necesaria si no se ha realizado el paso 1), e indicar el ejecutable del control de versiones Git instalado en pasos anteriores. Posteriormente se pulsará en el botón “Test” para comprobar que todo funcione correctamente:Settings Version Control Git
¿Cómo usar GitHub desde el entorno Android Studio?

Pasos para exportar un proyecto de Android Studio al repositorio GitHub:

Seleccionaremos el proyecto que se desea compartir con la plataforma GitHub.
A continuación, seguiremos la secuencia siguiente VCS > Import into Version Control > Share project on GitHub pass: skosko (es la del debug keystore):Opción de menú para exportar proyecto de Android Studio a GitHub
Tras pulsar en la opción indicada en el paso anterior, se mostrará una ventana para la creación de un nuevo repositorio, pulsando posteriormente en el botón “Share”. Tras indicar en la nueva ventana los archivos que se incluirán en el proyecto, se pulsará en “OK”. El proyecto ya estará listo para ser compartido y gestionado mediante GitHub:Ventanas Import GitHub
Nota: Si no se han realizado los pasos 4 y 5 del apartado “Requisitos previos”, se solicitarán los datos de inicio de sesión antes de poder compartir el proyecto con el repositorio de GitHub.

Una vez haya finalizado este proceso, ya estarán disponibles, en el menú VCS, las opciones de Git para actualizar o deshacer los cambios (Commit, Push, Revert o Pull).

Pasos para importar un proyecto almacenado en el repositorio GitHub:

Se inicia Android Studio (en caso de tener abierto el editor con un proyecto, será posible cerrarlo desde File > Close Project). Desde la pantalla de bienvenida de Android Studio (Android Launcher), se seleccionará la opción “Check out project from Version Control” (es posible acceder a esta opción si se selecciona la secuencia VCS > Checkout from Version Control > GitHub desde el editor de Android Studio), y en el desplegable que se mostrará, se seleccionará la opción “GitHub”. Este listado hace referencia a los repositorios y controles de versiones que soporta Android Studio:
Control Versiones Android Launcher
El siguiente paso será comprobar que el repositorio creado existe (apartado de “Requisitos previos”), para ello se pulsará sobre el botón “Test”, situado junto al campo que contiene la URL del usuario y repositorio seleccionado. Una vez muestre un mensaje de confirmación de que la prueba ha sido correcta, comprobamos que el resto de datos introducidos en el formulario (directorio local de proyectos Android Studio y nombre del directorio) son válidos:Clonar repositorio
Por último, pulsaremos el botón “Clone”, que posibilitará la clonación de los proyectos almacenados en el repositorio de GitHub dentro del directorio local de nuestro PC.
Android StudioGitHubIDE
Publicaciones rela
