# Cacharrería Éxito - Backend

## Descripción del Proyecto

Este proyecto es el backend de una aplicación para la gestión de ventas y clientes para una tienda llamada **Cacharrería Éxito**. Está diseñado para permitir a los vendedores, administradores y personal financiero gestionar clientes, ventas y facturas de manera eficiente. 

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar el backend.
- **Spring Framework**: Utilizado para gestionar la lógica de la aplicación y facilitar la creación de un sistema escalable.
- **JDBC**: Para la conexión y manipulación de la base de datos.
- **MySQL**: Base de datos utilizada para almacenar la información de los clientes, ventas y facturas.

## Estructura del Proyecto

El backend está organizado en varios paquetes que cumplen diferentes funciones:

- **model**: Contiene las clases que representan las entidades del sistema, como `Cliente`.
- **repository**: Contiene las clases que se encargan de la interacción con la base de datos, como `ClienteRepository`.
- **controller**: Contiene las clases que manejan la lógica de negocio y las operaciones realizadas sobre las entidades, como `ClienteController`.
- **database**: Contiene la clase `DataBaseConnection`, que establece la conexión con la base de datos.

## Funcionalidades Implementadas

El sistema permitirá realizar las siguientes operaciones:

1. **Gestión de Clientes**:
   - Agregar un nuevo cliente.
   - Buscar clientes existentes.
   - Actualizar la información de un cliente.
   - Eliminar un cliente.

2. **Gestión de Ventas**:
   - Registrar nuevas ventas y generar facturas.
   - Buscar facturas existentes.
   - Eliminar facturas.

3. **Gestión de Usuarios** (Administradores):
   - Crear nuevos usuarios para la aplicación.
   - Editar usuarios existentes.
   - Eliminar usuarios inactivos.
   - Ver todos los módulos disponibles en la aplicación.

4. **Módulo Financiero**:
   - Revisar y filtrar las ventas por fechas.
   - Ver la información de los productos vendidos y su disponibilidad en bodega.

## Cómo Ejecutar el Proyecto

Para ejecutar el backend de la aplicación, asegúrate de tener **Java JDK** y **MySQL** instalados en tu máquina. Luego,
