# Proyecto de Aplicación Bancaria
Este proyecto es una aplicación de gestión bancaria desarrollada en Java que permite a los clientes realizar diversas operaciones bancarias, 
como transferencias, retiros, consultas de saldo, consultar el historial de operaciones, entre otras. 
La aplicación cuenta con una interfaz gráfica de usuario (GUI) intuitiva y fácil de usar. 

### Características
- _Gestión de cuentas:_ Los clientes pueden crear nuevas cuentas bancarias, consultar su saldo actual, realizar transferencias entre cuentas y realizar retiros.  
- _Seguridad:_ El acceso a la aplicación está protegido por un sistema de autenticación seguro que requiere que los usuarios ingresen sus credenciales (nombre de usuario y contraseña) para acceder a sus cuentas.  
- _Registro de transacciones:_ Todas las transacciones realizadas por los clientes, como transferencias y retiros, quedan registradas en el sistema para mantener un registro preciso de las actividades financieras.

### Tecnologías utilizadas
- _Java:_ El proyecto está desarrollado en el lenguaje de programación Java, lo que permite una amplia compatibilidad y portabilidad en diferentes sistemas operativos.
- _Swing:_ La interfaz gráfica de usuario (GUI) se implementa utilizando la biblioteca Swing de Java, que proporciona componentes de interfaz de usuario ricos y personalizables.
- _MySQL:_ Se utiliza MySQL como sistema de gestión de bases de datos para almacenar y gestionar la información de las cuentas de los clientes, así como los registros de transacciones.
- _Maven:_ Maven se utiliza como herramienta de gestión de proyectos y construcción. Facilita la gestión de dependencias, la compilación y el empaquetado del proyecto, así como la automatización de tareas relacionadas con la construcción y el despliegue.

### Instalación
1. Clona el repositorio del proyecto en tu máquina local:  
``` git clone https://github.com/ang3lfco/banco.git ```
2. Importa el proyecto en tu IDE de Java preferido (por ejemplo, IntelliJ IDEA, Eclipse).
3. Configura la conexión a la base de datos MySQL en el archivo de configuración correspondiente.  
``` src/main/java/ux/ConexionBD. ```
4. Ejecuta la aplicación y comienza a explorar sus características.

### Contribuciones
Las contribuciones son bienvenidas. Si encuentras algún error o brecha de seguridad, no dudes en abrir un issue o enviar un pull request.

### Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles
