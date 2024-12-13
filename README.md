# Proyecto de Gestión de Estudiantes

Este proyecto es una API REST desarrollada en Java utilizando Spring Boot. Permite gestionar la información de estudiantes, ofreciendo funcionalidades como crear, listar, actualizar, eliminar y buscar estudiantes por diversos criterios.

## Requisitos Previos

Para ejecutar este proyecto, asegúrate de tener instalado lo siguiente:

- **Java 17** o superior
- **Maven 3.8** o superior
- **Base de datos MySQL** (o cualquier base de datos compatible con JPA/Hibernate)
- **IntelliJ IDEA** (opcional, pero recomendado para facilitar el desarrollo)

## Configuración

1. Clona el repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd institucion
   ```

2. Ejecuta el comando Maven para descargar las dependencias:
   ```bash
   mvn clean install
   ```

## Ejecución

1. Ejecuta la aplicación desde IntelliJ IDEA o con el siguiente comando:
   ```bash
   mvn spring-boot:run
   ```

2. La aplicación estará disponible en `http://localhost:8080/estudiantes`.

## Endpoints Disponibles

### Estudiantes

| Método | Endpoint                   | Descripción                                   |
|--------|----------------------------|-----------------------------------------------|
| GET    | `/estudiantes`             | Lista todos los estudiantes                   |
| GET    | `/estudiantes/{id}`        | Obtiene un estudiante por su ID               |
| POST   | `/estudiantes`             | Crea un nuevo estudiante                      |
| PUT    | `/estudiantes/{id}`        | Actualiza un estudiante existente por su ID   |
| DELETE | `/estudiantes/{id}`        | Elimina un estudiante por su ID               |
| GET    | `/estudiantes/grado/{grado}`| Lista estudiantes por grado                   |
| GET    | `/estudiantes/rango`       | Lista estudiantes dentro de un rango de edades|

## Modelo de Datos

### Estudiante

| Campo             | Tipo      | Descripción                  |
|--------------------|-----------|------------------------------|
| `idEstudiante`    | `Long`    | Identificador único          |
| `nombre`          | `String`  | Nombre del estudiante        |
| `fechaNacimiento` | `Date`    | Fecha de nacimiento          |
| `edad`            | `int`     | Edad del estudiante          |
| `grado`           | `int`     | Grado escolar del estudiante |

## Notas

- Asegúrate de que tu base de datos esté configurada y en ejecución antes de iniciar la aplicación.
- Puedes usar herramientas como Postman o cURL para probar los endpoints.
