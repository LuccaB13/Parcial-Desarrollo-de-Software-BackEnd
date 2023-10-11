# Trabajo Práctico: API REST sin paginación
Desarrollo de Software

Alumno: Burgos Lucca
legajo: 46558

UTN Facultad Regional Mendoza

## Descripción

Proyecto realizadp utilizando Java con la herramienta Spring Boot.
Se utilizó la base da datos H2 , se puede acceder localmente utilizando [http://localhost:8084/h2-console/](```http://localhost:8084/h2-console/```) (puerto 8084).

Se puede acceder Con Render creando un Web Service, y conectándose utilizando Postman.

El archivo [TpApiRest.postman_collection.json](TpApiRest.postman_collection.json) posee ejemplos de solicitudes a los servicios, tales como: create, save, update, delete, get one, get all.
También tiene una carpeta con ejemplo se carga de datos para las tablas de la base de datos, para que se vea su funcionamiento.

La collection de Postam posee dos variables que se puede modificar para ajustarla al render que se quiera o al local host:
  - La primera variable se llama __render-link__ (Para cambiar por links de render).
  * La segunda variable se llama __local-link__ (Para cambiar por links locales).
