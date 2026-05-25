# Pawfect Care

## Requisitos Funcionales

### Gestión de Usuarios
- **RF01.** El sistema debe permitir a los dueños de las mascotas y a los veterinarios registrarse en la plataforma. Para ello se requiere que ingresen su nombre completo, teléfono, correo electrónico y contraseña. Además, si el usuario es un médico veterinario se le pedirá ingresar su especialidad. Por otro lado, si es dueño de mascota, deberá añadir su dirección.
- **RF02.** El sistema debe permitir a los usuarios iniciar sesión, ingresando su correo electrónico y contraseña.
- **RF03.** El sistema debe permitir a los dueños de las mascotas y a los veterinarios crear y editar su perfil.

### Gestión de Mascotas
- **RF04.** El sistema debe permitir a los dueños crear perfiles de sus mascotas.
- **RF05.** El sistema debe permitir a los dueños editar la información de sus mascotas.
- **RF06.** El sistema debe permitir a los dueños de mascotas visualizar los perfiles de sus mascotas.
- **RF07.** El sistema debe permitir a los dueños de mascotas eliminar el perfil de su mascota
- **RF08.** El veterinario debe poder buscar mascotas primero por el nombre del dueño y luego por nombre de mascota.

### Gestión de Citas Veterinarias
- **RF09.** El sistema debe permitir a los dueños de mascotas agendar citas veterinarias.
- **RF10.** El sistema debe permitir a los dueños de mascotas cancelar sus citas.
- **RF11.** El sistema debe permitir al médico veterinario gestionar y editar citas.
- **RF12.** El sistema debe permitir que, tanto médicos veterinarios como dueños de mascotas, busquen citas por su fecha.
- **RF13.** El sistema debe permitir a los veterinarios poder buscar, por su nombre, a un dueño de una mascota con los cuales se haya agendado una cita pendiente.

### Consultas Automatizadas
- **RF14.** El sistema debe permitir que el usuario interactúe con un chatbot ingresando información sobre su mascota, y el chatbot debe responder con una recomendación general de alimentación adecuada basada en esos datos.
- **RF15.** El sistema debe permitir que el usuario solicite recomendaciones básicas de higiene para su mascota, y el chatbot debe responder con prácticas de cuidado e higiene específicas según el tipo de mascota.
- **RF16.** El sistema debe permitir que el usuario seleccione o escriba una consulta relacionada con síntomas comunes, y el chatbot debe proporcionar información relevante y sugerir cuándo se debe acudir a un veterinario.
- **RF17.** El sistema debe permitir que el usuario consulte al chatbot sobre problemas de comportamiento o entrenamiento, y este debe proporcionar técnicas básicas de corrección y adiestramiento según el tipo de mascota.
- **RF18.** El sistema debe permitir que el chatbot brinde recomendaciones generales de cuidado adaptadas al tipo de mascota.

### Gestión de Historial Médico de las Mascotas
- **RF19.** El sistema debe permitir a los dueños visualizar el historial médico de sus mascotas.
- **RF20.** El sistema debe permitir a los veterinarios registrar diagnósticos y el historial médico de una mascota.
- **RF21.** El sistema debe permitir a los veterinarios registrar actualizaciones en los diagnósticos y en el historial médico de una mascota.

### Reviews y Feedback
- **RF22.** El sistema debe permitir a los dueños de las mascotas publicar reseñas sobre la atención veterinaria recibida.
- **RF23.** El sistema debe permitir a los dueños visualizar las reseñas publicadas por otros propietarios.

### Gestión de Servicios y Tarifas
- **RF24.** El sistema debe permitir a los veterinarios ingresar el tarifario de cada uno de los servicios que ofrecen.
- **RF25.** El sistema debe permitir a los dueños de mascotas visualizar una tarifa que mejor se adapte a sus necesidades para que la cita sea agendada y recibir el servicio al precio que él desee. 
- **RF26.** El sistema debe permitir a los veterinarios publicar sus horarios disponibles para la atención para que el dueño de la mascota elija el de su preferencia y la cita sea agendada. 

## Requisitos No Funcionales

Los Requisitos No Funcionales (RNF) establecen condiciones esenciales de calidad que el sistema debe cumplir, más allá de sus funciones básicas. A continuación se muestran los RNF alineados con los atributos de calidad definidos por Bass, Clements y Kazman (2012), los cuales se enfocan en las siguientes áreas.
1. **Disponibilidad**  
   Indica si el sistema está operable y accesible cuando los usuarios lo necesitan. Un sistema altamente disponible puede tolerar fallos y mantenerse en ejecución sin interrupciones.

2. **Seguridad**  
   Representa el grado de protección del sistema contra accesos no autorizados, uso indebido o ataques. Un sistema seguro protege tanto la información como sus servicios.

3. **Desempeño**  
   Evalúa la eficiencia con la que el sistema responde a solicitudes y realiza tareas, considerando el uso de recursos como CPU, memoria y tiempo de respuesta.

4. **Facilidad de prueba**  
   Mide cuán fácil es diseñar, ejecutar y evaluar pruebas efectivas del sistema. Esto incluye pruebas unitarias, de integración y de aceptación.

5. **Modificabilidad**  
   Describe el esfuerzo requerido para realizar cambios en el sistema, como agregar nuevas funcionalidades, corregir errores o adaptar el sistema a nuevos entornos.

6. **Usabilidad**  
   Indica qué tan fácil y eficiente es para los usuarios interactuar con el sistema. Incluye factores como intuición, accesibilidad y curva de aprendizaje.

7. **Interoperabilidad**  
   Se refiere a la capacidad del sistema para intercambiar información y trabajar conjuntamente con otros sistemas mediante interfaces bien definidas.

| Código | Descripción                                                                                            | Métrica (con Método de Evaluación)                                                                                                           | Atributo de Calidad       |
|--------|--------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|---------------------------|
| RNF01  | El sistema debe estar disponible 24/7 para todos los usuarios.                                         | Debe tener más del 99.9% de disponibilidad mensual                                                                                           | Disponibilidad            |
| RNF02  | El sistema debe requerir contraseñas robustas para el inicio de sesión.                                | El 100% de contraseñas cumplen con política de tener más de 6 caracteres entre mayúsculas, minúsculas, números y un símbolo.                 | Seguridad                 |
| RNF03  | El 95% de las operaciones CRUD deben completarse en menos de 3 segundos. Esto incluye agregar, editar o eliminar un registro de historial medico, un registro de mascota, el perfil del dueño de mascota y el perfil del médico veterinario encargado             | El tiempo de respuesta de una operación CRUD debe ser, como mínimo, menor a 3 segundos en un 95% de 100 operaciones simuladas con Apache JMeter.                                                        | Desempeño                 |
| RNF04  | La pantalla de inicio debe cargar en menos de 2 segundos en conexión de 20 Mbps.                       | El tiempo de carga de la pantalla de inicio debe ser menor a 2 segundos en al menos 3 navegadores modernos (Edge, Chrome y Opera).                                                      | Desempeño                 |
| RNF05  | El sistema debe soportar al menos 100 usuarios simultáneos sin degradación.                            | Debe existir menos del 10% de degradación en los tiempos de carga de la pantalla principal de la aplicación durante prueba de carga con 100 usuarios concurrentes.                                                  | Desempeño                 |
| RNF06  | El código debe estar documentado para facilitar su comprensión.                                        | El 60% del código del backend  debe estar documentado con JavaDoc y en inglés, colocando información de propósito como mínimo.                                                   | Modificabilidad           |
| RNF07  | El sistema debe permitir añadir nuevas funcionalidades sin modificar más del 30% del código existente. | Debe haber menos del 30% de líneas modificadas, respecto al total de líneas, para agregar nueva funcionalidad. Esto se puede medir con Git diff.                                                                    | Modificabilidad           |
| RNF08  | El sistema debe ser calificado como fácil de usar por los usuarios.                                    | El 80% de usuarios califican  la facilidad de uso de la interfaz con un 4 en escala de 1 a 5 en encuestas post-prueba                                        | Usabilidad                |
| RNF09  | El sistema debe ser compatible con navegadores modernos.                                               | Funcionalidad completa debe poder realizarse en 3 navegadores como mínimo (Chrome, Edge, Opera).                                                                | Interoperabilidad         |
| RNF10  | El sistema debe escalar horizontalmente si la carga supera el 80%.                                     | Latencia media de 3 segundos durante escalamiento automático con 200 usuarios simultáneos.                                                           | Escalabilidad             |                                                     | Escalabilidad             |

## Matriz User Stories vs Requisitos Funcionales

| **Requisito** | **US01** | **US02** | **US03** | **US04** | **US05** | **US06** | **US07** | **US08** | **US09** | **US10** | **US11** | **US12** | **US13** |
| :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: |
| **RF01** | ✔ |   |   |   |   |   |   |   |   |   |   |   |   |
| **RF02** |   | ✔ |   |   |   |   |   |   |   |   |   |   |   |
| **RF03** |   |   | ✔ |   |   |   |   |   |   |   |   |   |   |
| **RF04** |   |   |   | ✔ |   |   |   |   |   |   |   |   |   |
| **RF05** |   |   |   |   | ✔ |   |   |   |   |   |   |   |   |
| **RF06** |   |   |   |   |   | ✔ |   |   |   |   |   |   |   |
| **RF07** |   |   |   |   |   |   | ✔ |   |   |   |   |   |   |
| **RF08** |   |   |   |   |   |   |   | ✔ |   |   |   |   |   |
| **RF09** |   |   |   |   |   |   |   |   | ✔ |   |   |   |   |
| **RF10** |   |   |   |   |   |   |   |   |   | ✔ |   |   |   |
| **RF11** |   |   |   |   |   |   |   |   |   |   | ✔ |   |   |
| **RF12** |   |   |   |   |   |   |   |   |   |   |   | ✔ |   |
| **RF13** |   |   |   |   |   |   |   |   |   |   |   |   | ✔ |

| **Requisito** | **US14** | **US15** | **US16** | **US17** | **US18** | **US19** | **US20** | **US21** | **US22** | **US23** | **US24** | **US25** | **US26** |
| :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: | :------------: |
| **RF14** | ✔ |   |   |   |   |   |   |   |   |   |   |   |   |
| **RF15** |   | ✔ |   |   |   |   |   |   |   |   |   |   |   |
| **RF16** |   |   | ✔ |   |   |   |   |   |   |   |   |   |   |
| **RF17** |   |   |   | ✔ |   |   |   |   |   |   |   |   |   |
| **RF18** |   |   |   |   | ✔ |   |   |   |   |   |   |   |   |
| **RF19** |   |   |   |   |   | ✔ |   |   |   |   |   |   |   |
| **RF20** |   |   |   |   |   |   | ✔ |   |   |   |   |   |   |
| **RF21** |   |   |   |   |   |   |   | ✔ |   |   |   |   |   |
| **RF22** |   |   |   |   |   |   |   |   | ✔ |   |   |   |   |
| **RF23** |   |   |   |   |   |   |   |   |   | ✔ |   |   |   |
| **RF24** |   |   |   |   |   |   |   |   |   |   | ✔ |   |   |
| **RF25** |   |   |   |   |   |   |   |   |   |   |   | ✔ |   |
| **RF26** |   |   |   |   |   |   |   |   |   |   |   |   | ✔ |


## User Stories

### Gestión de Usuarios
**EP01: Como administrador, deseo gestionar los usuarios para asegurar que solo personas autorizadas tengan acceso al sistema.**

| User Story ID | Título                     | Descripción                                                                                                                                                    |
|---------------|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| US01          | Registro de Usuario        | Como visitante, deseo registrarme en la plataforma para poder utilizar las funcionalidades del sistema.                                                        |
| US02          | Autenticación de Usuarios | Como usuario registrado, deseo poder iniciar sesión, ingresando mi correo electrónico y contraseña para poder utilizar los servicios de la aplicación.     |
| US03          | Gestión de Cuentas de Usuarios | Como dueño de mascota y médico veterinario, deseo gestionar el perfil de mi cuenta para mantener la información actualizada.                                    |

---

### Gestión de Mascotas
**EP02: Como usuario, deseo gestionar la información de mis mascotas para mantener sus datos actualizados.**

| User Story ID | Título                     | Descripción                                                                                                                                                    |
|---------------|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| US04          | Creación de Perfil de Mascota | Como dueño, deseo crear un perfil de mi mascota para tener su información almacenada en la plataforma.                                                  |
| US05          | Edición de Perfil de Mascota | Como dueño, deseo editar el perfil de mi mascota para actualizar su información cuando sea necesario.                                                    |
| US06          | Visualización de Perfiles de Mascotas | Como dueño, deseo visualizar los perfiles de mis mascotas para revisar la información registrada.                                                    |
| US07          | Gestión de Perfiles de Mascotas | Como dueño de mascota, deseo gestionar y poder eliminar los perfiles de mis mascotas para asegurarme de que la información esté correctamente registrada y actualizada.      |
| US08          | Búsqueda de Mascotas por nombre del dueño y luego por el nombre de la mascota | Como médico veterinario, deseo buscar mascotas por su nombre para acceder rápidamente a su información en el sistema.                                                   |

---

### Gestión de Citas Veterinarias
**EP03: Como usuario, deseo gestionar las citas veterinarias de mis mascotas para asegurarme de que reciban atención médica a tiempo.**

| User Story ID | Título                     | Descripción                                                                                                                                                    |
|---------------|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| US09         | Agendamiento de Citas      | Como usuario, deseo agendar citas veterinarias para asegurar que mi mascota reciba atención médica en el momento adecuado.                                     |
| US10          | Cancelación de Citas       | Como usuario, deseo cancelar una cita si no puedo asistir para evitar problemas de horario y reorganizar la atención.                                        |
| US11          | Edición de Citas Veterinarias | Como médico veterinario, deseo editar las citas para hacer cambios en la fecha o estado cuando sea necesario.                                                 |
| US12          | Búsqueda de Citas por fecha   | Como dueño de mascota o médico veterinario, deseo poder buscar citas por fecha para acceder rápidamente a la información de la cita.                                                           |
| US13          | Búsqueda de dueños de mascota | Como  médico veterinario, deseo poder buscar citas de clientes agendados por su nombre para poder ubicarlos rápidamente.    |

---

### Consultas Automatizadas
**EP04: Como usuario, deseo realizar consultas simples para obtener información rápida sobre el cuidado y bienestar de mi mascota.**

| User Story ID | Título                                | Descripción                                                                                                                                      |
|---------------|----------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| US14         | Consulta sobre alimentación adecuada   | Como dueño, deseo consultar al asistente artificial (chatbot) sobre qué tipo de comida es ideal para mi mascota según su especie, edad y tamaño.                      |
| US15         | Consejos de higiene para mascotas      | Como dueño, deseo recibir recomendaciones básicas de higiene para mantener saludable a mi mascota mediante el asistente artificial (chatbot).                                            |
| US16         | Preguntas frecuentes sobre salud       | Como dueño de mascota, deseo obtener respuestas rápidas sobre síntomas comunes y saber cuándo debo acudir al veterinario.                                |
| US17          | Consejos de entrenamiento básico       | Como dueño de mascota, deseo consultar sobre técnicas de adiestramiento o corrección de comportamientos no deseados.                                     |
| US18          | Recomendaciones según tipo de mascota  | Como dueño, deseo que el chatbot me dé consejos generales adaptados al tipo de mascota que tengo (perro, gato, ave, etc).                    |

---

### Gestión de Historial Médico de las Mascotas
**EP05: Como usuario o administrador, deseo gestionar el historial médico de las mascotas para llevar un registro de sus atenciones y tratamientos.**

| User Story ID | Título                     | Descripción                                                                                                                                                    |
|---------------|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| US19          | Visualización del Historial Médico | Como dueño, deseo visualizar el historial médico de mi mascota para revisar su estado de salud y tratamientos previos.                                  |
| US20          | Creación del Historial Médico | Como doctor veterinario, deseo crear el historial médico de las mascotas para que los dueños tengan la información de sus mascotas en el sistema. |
| US21          | Actualización del Historial Médico | Como doctor veterinario, deseo actualizar el historial médico de las mascotas para que los dueños tengan la información más reciente sobre sus tratamientos. |


---

### Reviews y Feedback
**EP06: Como usuario dueño de una mascota, deseo poder dejar reseñas y comentarios sobre un doctor veterinario.**

| User Story ID | Título                     | Descripción                                                                                                                                                    |
|---------------|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| US22          | Publicar Reseñas | Como usuario dueño de una mascota, deseo dejar una reseña sobre un doctor veterinario para compartir mi experiencia con otros usuarios.                   |
| US23          | Visualización de Reseñas | Como dueño de una mascota, deseo ver las reseñas de otros usuarios sobre un doctor veterinario para conocer la calidad del servicio y su calificación general. |

---

### Gestión de Servicios y Tarifas
**EP07: Como médico veterinario, deseo ingresar tarifas por los servicios requeridos por un dueño de mascota para que él pueda conocer los precios que le ofrezco.**

| User Story ID | Título                           | Descripción                                                                                                                                                                  |
|---------------|----------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| US24          | Ofrecer tarifa por servicio      | Como médico veterinario, deseo ofrecer una tarifa personalizada para un servicio solicitado por un dueño de mascota mediante una cita, para que él pueda evaluar mi propuesta. |
| US25          | Visualización de Reseñas y Tarifas | Como dueño de una mascota, deseo ver las reseñas y tarifas ofrecidas por distintos veterinarios para un servicio específico solicitado en una cita, y así elegir la mejor opción. |
| US26          | Registro de horarios | Como médico veterinario, deseo publicar mis horarios disponibles para un servicio solicitado por un dueño de mascota mediante una cita, para que él pueda elegir.  |

---

### Navegación y Funcionalidades de la Landing Page
**EP08: Como visitante, deseo explorar la página principal de Pawfect Care para entender los servicios y características que ofrece la plataforma.**

| User Story ID | Título                                     | Descripción                                                                                                                                                      |
|---------------|-------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| TS01          | Barra de Navegación en la Landing Page     | Como visitante, deseo usar la barra de navegación para acceder fácilmente a las diferentes secciones de la plataforma.                                        |
| TS02          | Visualización de la Sección "Why Choose Us?" | Como visitante, deseo revisar la sección "Why Choose Us?" para entender los beneficios y servicios de la plataforma.                                     |
| TS03          | Envío de Mensajes de Contacto             | Como visitante, deseo enviar un mensaje de contacto a través de la landing page para comunicarme con el equipo de Pawfect Care.                             |
| TS04          | Visualización de Videos en la Sección de Características | Como visitante, deseo ver los videos informativos sobre los productos y servicios para conocer más sobre Pawfect Care.                                    |

---

### Funcionalidades de Idioma en la App Web
**EP09: Como usuario, deseo cambiar el idioma de la plataforma para navegar entre las versiones en inglés y español de la app web.**

| User Story ID | Título                     | Descripción                                                                                                                                                    |
|---------------|----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| TS05         | Cambio de Idioma en la App Web | Como usuario, deseo cambiar el idioma de la app web para poder utilizarla en inglés o español según mi preferencia.                                        |

<br><br>

## Impact Mapping.

Este Impact Map muestra cómo Pawfect Care alinea sus objetivos de negocio con los impactos deseados. Detalla los entregables específicos y las user stories que abordan estos impactos, asegurando que cada aspecto del desarrollo de la plataforma mejore la eficiencia y la experiencia del usuario.

[![Impactmap.png](https://i.postimg.cc/4df4zmDD/Impactmap.png)](https://postimg.cc/064qv22n)

## Product Backlog.

Con el fin de simplificar la complejidad de las tareas, hemos utilizado la escala de Fibonacci (1/2/3/5/8) para crear nuestro product backlog.
Historia de usuario base:
Tomamos como referencia US06: Como usuario, quiero agendar citas para que mi mascota reciba atención veterinaria a tiempo. (Posee 3 puntos de historia).
Asimismo, utilizamos la herramienta “Planning Poker Online” para poder votar en grupo y decidir la dificultad de cada historia de usuario, tomando como punto intermedio el User Story 06

| # Orden | User Story ID | Título                                   | Descripción                                                                                                     | Story Points |
|--------|----------------|-------------------------------------------|-----------------------------------------------------------------------------------------------------------------|--------------|
| 1      | US09           | Agendamiento de Citas                     | Como usuario, deseo agendar citas veterinarias para asegurar que mi mascota reciba atención médica en el momento adecuado. | 5            |
| 2      | US19           | Visualización del Historial Médico        | Como dueño, deseo visualizar el historial médico de mi mascota para revisar su estado de salud y tratamientos previos. | 3            |
| 3      | US20           | Actualización del Historial Médico        | Como doctor veterinario, deseo actualizar el historial médico de las mascotas para que los dueños tengan la información más reciente sobre sus tratamientos. | 3            |
| 4      | US07           | Búsqueda de Mascotas                      | Como médico veterinario, deseo buscar mascotas por su nombre para acceder rápidamente a su información en el sistema. | 2            |
| 5      | US05           | Edición de Perfil de Mascota              | Como dueño, deseo editar el perfil de mi mascota para actualizar su información cuando sea necesario.           | 2            |
| 6      | US06           | Visualización de Perfiles de Mascotas     | Como dueño, deseo visualizar los perfiles de mis mascotas para revisar la información registrada.               | 2            |
| 7      | US13           | Búsqueda de dueño de mascota                     | Como médico veterinario, deseo poder buscar citas de clientes agendados por su nombre para poder ubicarlos rápidamente. | 2            |
| 8      | US11           | Búsqueda de Citas por fecha               | Como dueño de mascota o médico veterinario, deseo poder buscar citas por fecha para acceder rápidamente a la información de la cita. | 2            |
| 9      | US12           | Edición de Citas Veterinarias             | Como médico veterinario, deseo editar las citas para hacer cambios en la fecha o estado cuando sea necesario.  | 3            |
|10      | US10           | Cancelación de Citas                      | Como usuario, deseo cancelar una cita si no puedo asistir para evitar problemas de horario y reorganizar la atención. | 2            |
|11      | US14           | Consulta sobre alimentación adecuada      | Como dueño, deseo consultar al chatbot sobre qué tipo de comida es ideal para mi mascota según su especie, edad y tamaño. | 5            |
|12      | US15           | Consejos de higiene para mascotas         | Como dueño, deseo recibir recomendaciones básicas de higiene para mantener saludable a mi mascota mediante el asistente artificial (chatbot). | 3            |
|13      | US16           | Preguntas frecuentes sobre salud          | Como dueño de mascota, deseo obtener respuestas rápidas sobre síntomas comunes y saber cuándo debo acudir al veterinario. | 3            |
|14      | US17           | Consejos de entrenamiento básico          | Como dueño de mascota, deseo consultar sobre técnicas de adiestramiento o corrección de comportamientos no deseados. | 3            |
|15      | US18           | Recomendaciones según tipo de mascota     | Como dueño, deseo que el chatbot me dé consejos generales adaptados al tipo de mascota que tengo (perro, gato, ave, etc). | 3            |
|16      | US23           | Ofrecer tarifa por servicio               | Como médico veterinario, deseo ofrecer una tarifa personalizada para un servicio solicitado por un dueño de mascota mediante una cita, para que él pueda evaluar mi propuesta. | 3            |
|17      | US24           | Visualización de Tarifas                  | Como dueño de una mascota, deseo ver las tarifas ofrecidas por distintos veterinarios para un servicio específico solicitado en una cita, y así elegir la mejor opción. | 3            |
|18      | US21           | Publicar Reseñas                          | Como usuario dueño de una mascota, deseo dejar una reseña sobre un doctor veterinario para compartir mi experiencia con otros usuarios. | 3            |
|19      | US22           | Visualización de Reseñas                  | Como dueño de una mascota, deseo ver las reseñas de otros usuarios sobre un doctor veterinario para conocer la calidad del servicio y su calificación general. | 3            |
|20      | US04           | Creación de Perfil de Mascota             | Como dueño, deseo crear un perfil de mi mascota para tener su información almacenada en la plataforma.         | 2            |
|21      | US08           | Gestión de Perfiles de Mascotas           | Como dueño de mascota, deseo gestionar y poder eliminar los perfiles de mis mascotas para asegurarme de que la información esté correctamente registrada y actualizada. | 2            |
|22      | US01           | Registro de Usuario                       | Como visitante, deseo registrarme en la plataforma para poder utilizar las funcionalidades del sistema.         | 3            |
|23      | US02           | Autenticación de Usuarios                 | Como usuario registrado, deseo poder iniciar sesión, ingresando mi correo electrónico y contraseña para poder utilizar los servicios de la aplicación. | 3            |
|24      | US03           | Gestión de Cuentas de Usuarios            | Como dueño de mascota y médico veterinario, deseo gestionar el perfil de mi cuenta para mantener la información actualizada. | 2            |



## Core Entities Unit Tests

#### PetCommandService Unit Test:

```java
package pe.upc.pawfectcarebackend.petmanagement;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pe.upc.pawfectcarebackend.medicalrecords.domain.model.aggregates.MedicalHistory;
import pe.upc.pawfectcarebackend.petmanagement.application.PetCommandServicelmpl;
import pe.upc.pawfectcarebackend.petmanagement.application.acl.ExternalMedicalHistoryService;
import pe.upc.pawfectcarebackend.petmanagement.domain.model.aggregates.Owner;
import pe.upc.pawfectcarebackend.petmanagement.domain.model.aggregates.Pet;
import pe.upc.pawfectcarebackend.petmanagement.domain.model.commands.CreatePetCommand;
import pe.upc.pawfectcarebackend.petmanagement.domain.model.commands.UpdatePetCommand;
import pe.upc.pawfectcarebackend.petmanagement.domain.model.valueobjects.PetGender;
import pe.upc.pawfectcarebackend.petmanagement.domain.services.PetCommandService;
import pe.upc.pawfectcarebackend.petmanagement.infrastructure.persistence.jpa.repositories.OwnerRepository;
import pe.upc.pawfectcarebackend.petmanagement.infrastructure.persistence.jpa.repositories.PetRepository;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class PetCommandServiceTest {
    /**
     * Test for handleCreatePetCommand method
     */
    @Test
    void handleCreatePetCommand() {
        /*
          Arrange
          Mock the dependencies
         */
        PetRepository petRepository = Mockito.mock(PetRepository.class);
        OwnerRepository ownerRepository = Mockito.mock(OwnerRepository.class);
        ExternalMedicalHistoryService medicalHistoryService = Mockito.mock(ExternalMedicalHistoryService.class);

        // Create an instance of the PetCommandService
        PetCommandService petCommandService = new PetCommandServicelmpl(petRepository, ownerRepository, medicalHistoryService);

        // Simulate the creation of an Owner
        Owner mockOwner = Mockito.mock(Owner.class);
        when(mockOwner.getId()).thenReturn(1L);
        when(ownerRepository.findById(1L)).thenReturn(Optional.of(mockOwner));

        // Create the command to add a pet
        CreatePetCommand command = new CreatePetCommand(
                "Buddy",
                LocalDate.of(2020, 1, 1),
                LocalDate.now(),
                "Golden Retriever",
                PetGender.MALE,
                1L
        );

        // Simulate the behavior of PetRepository
        Pet mockPet = new Pet(command);
        mockPet.setOwner(mockOwner);
        when(petRepository.save(any(Pet.class))).thenReturn(mockPet);

        // Simulate the behavior of ExternalMedicalHistoryService
        MedicalHistory mockMedicalHistory = Mockito.mock(MedicalHistory.class);
        when(medicalHistoryService.createMedicalHistory(any(String.class)))
                .thenReturn(Optional.of(mockMedicalHistory));

        /*
          Act
          Call the method to be tested
         */
        Long petId = petCommandService.handle(command);

        // Debugging: Print the created pet details
        System.out.println("\nCreated Pet: \n------------------------------\n");
        System.out.println("Created Pet Name: " + mockPet.getPetName());
        System.out.println("Created Pet Breed: " + mockPet.getAnimalBreed());
        System.out.println("Created Pet Gender: " + mockPet.getPetGender());
        System.out.println("Created Pet Owner ID: " + mockPet.getOwner().getId());
        System.out.println("------------------------------\n");

        /*
          Assert
          Verify the results
         */
        assertEquals(mockPet.getId(), petId);
        verify(ownerRepository, times(1)).findById(command.ownerId());
        verify(petRepository, times(1)).save(any(Pet.class));
        verify(medicalHistoryService, times(1)).createMedicalHistory(any(String.class));
    }


    /**
     * Test for handleUpdatePetCommand method
     */
    @Test
    void handleUpdatePetCommand() {
    /*
      Arrange
      Mock the dependencies
     */
        PetRepository petRepository = Mockito.mock(PetRepository.class);

        // Create an instance of the PetCommandService
        PetCommandService petCommandService = new PetCommandServicelmpl(petRepository, null, null);

        // Simulate the existing Pet
        Pet mockPet = Mockito.mock(Pet.class);
        when(mockPet.getId()).thenReturn(1L);
        when(mockPet.getPetName()).thenReturn("Buddy");
        when(mockPet.getAnimalBreed()).thenReturn("Golden Retriever");
        when(mockPet.getPetGender()).thenReturn(PetGender.MALE);
        when(petRepository.existsById(1L)).thenReturn(true);
        when(petRepository.findById(1L)).thenReturn(Optional.of(mockPet));

        // Mock the updateInformation method
        when(mockPet.updateInformation(
                anyString(),
                any(LocalDate.class),
                any(LocalDate.class),
                anyString(),
                any(PetGender.class)
        )).thenAnswer(invocation -> {
            System.out.println("\nBefore Update:");
            System.out.println("Pet Name: " + mockPet.getPetName());
            System.out.println("Pet Breed: " + mockPet.getAnimalBreed());
            System.out.println("Pet Gender: " + mockPet.getPetGender());

            // Simulate updating the pet
            when(mockPet.getPetName()).thenReturn("Updated Buddy");
            when(mockPet.getAnimalBreed()).thenReturn("Updated Breed");
            when(mockPet.getPetGender()).thenReturn(PetGender.FEMALE);

            System.out.println("\nAfter Update:");
            System.out.println("Pet Name: Updated Buddy");
            System.out.println("Pet Breed: Updated Breed");
            System.out.println("Pet Gender: FEMALE");

            return mockPet;
        });

        // Simulate the updated Pet
        when(petRepository.save(any(Pet.class))).thenReturn(mockPet);

        // Create the command to update a pet
        UpdatePetCommand command = new UpdatePetCommand(
                1L,
                "Updated Buddy",
                LocalDate.of(2020, 1, 1),
                LocalDate.now(),
                "Updated Breed",
                PetGender.FEMALE
        );

    /*
      Act
      Call the method to be tested
     */
        Optional<Pet> result = petCommandService.handle(command);

    /*
      Assert
      Verify the expected behavior
     */
        assertEquals(mockPet.getId(), result.get().getId());
        verify(petRepository, times(1)).existsById(command.id());
        verify(petRepository, times(1)).findById(command.id());
        verify(petRepository, times(1)).save(any(Pet.class));
    }

}
```

##### US04: Creación de Perfil de Mascota<br>
  Como dueño, deseo crear un perfil de mi mascota para tener su información almacenada en la plataforma.

[![Captura-de-pantalla-2025-05-16-200025.png](https://i.postimg.cc/1z504cF1/Captura-de-pantalla-2025-05-16-200025.png)](https://postimg.cc/bZWSBnLm)


##### US05: Edición de Perfil de Mascota<br>
    Como dueño, deseo editar el perfil de mi mascota para actualizar su información cuando sea necesario.

[![Captura-de-pantalla-2025-05-16-195441.png](https://i.postimg.cc/Xv0c36jq/Captura-de-pantalla-2025-05-16-195441.png)](https://postimg.cc/nX0QY5Qf)<br><br>


#### AppointmentCommandService & MedicalAppointmentCommandService  Unit Test:

```java
package pe.upc.pawfectcarebackend.appointmentsscheduling;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pe.upc.pawfectcarebackend.appointmentsscheduling.application.AppointmentCommandServicelmpl;
import pe.upc.pawfectcarebackend.appointmentsscheduling.application.acl.ExternalPetService;
import pe.upc.pawfectcarebackend.appointmentsscheduling.domain.model.aggregates.Appointment;
import pe.upc.pawfectcarebackend.appointmentsscheduling.domain.model.commands.CreateAppointmentCommand;
import pe.upc.pawfectcarebackend.appointmentsscheduling.domain.model.valueobjects.AppointmentStatus;
import pe.upc.pawfectcarebackend.appointmentsscheduling.domain.services.AppointmentCommandService;
import pe.upc.pawfectcarebackend.appointmentsscheduling.infrastructure.persistence.jpa.repositories.AppointmentRepository;
import pe.upc.pawfectcarebackend.appointmentsscheduling.infrastructure.persistence.jpa.repositories.MedicalAppointmentRepository;
import pe.upc.pawfectcarebackend.petmanagement.domain.model.aggregates.Pet;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class AppointmentCommandServiceTest {
    /**
     * Test for handleCreateAppointmentCommand method
     */
    @Test
    void handleCreateAppointmentCommand() {
        /*
          Arrange
          Mock the dependencies
         */
        AppointmentRepository appointmentRepository = Mockito.mock(AppointmentRepository.class);
        MedicalAppointmentRepository medicalAppointmentRepository = Mockito.mock(MedicalAppointmentRepository.class);
        ExternalPetService externalPetService = Mockito.mock(ExternalPetService.class);

        // Create an instance of the AppointmentCommandService
        AppointmentCommandService appointmentCommandService = new AppointmentCommandServicelmpl(
                appointmentRepository,
                externalPetService,
                medicalAppointmentRepository
        );

        // Simulate the creation of a Pet
        Pet mockPet = Mockito.mock(Pet.class);
        when(mockPet.getId()).thenReturn(1L);
        when(externalPetService.fetchPetById(1L)).thenReturn(Optional.of(mockPet));

        // Create the command to add an appointment
        CreateAppointmentCommand command = new CreateAppointmentCommand(
                "Vet Visit",
                LocalDateTime.of(2023, 10, 1, 10, 0),
                LocalDateTime.of(2023, 10, 1, 11, 0),
                true,
                AppointmentStatus.SCHEDULED, // Use the AppointmentStatus enum
                1L // Pass a Long instead of a long
        );

        // Simulate the behavior of AppointmentRepository
        Appointment mockAppointment = new Appointment(command);
        mockAppointment.setPet(mockPet);
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(mockAppointment);

        /*
          Act
          Call the method to be tested
         */
        Long appointmentId = appointmentCommandService.handle(command);

        // Debugging: Print the created appointment details
        System.out.println("\nCreated Appointment: \n------------------------------\n");
        System.out.println("Appointment Name: " + mockAppointment.getAppointmentName());
        System.out.println("Registration Date: " + mockAppointment.getRegistrationDate());
        System.out.println("End Date: " + mockAppointment.getEndDate());
        System.out.println("Is Medical: " + mockAppointment.isMedical());
        System.out.println("Pet ID: " + mockAppointment.getPet().getId());
        System.out.println("------------------------------\n");

        /*
          Assert
          Verify the results
         */
        assertEquals(mockAppointment.getId(), appointmentId);
        verify(externalPetService, times(1)).fetchPetById(command.petId());
        verify(appointmentRepository, times(1)).save(any(Appointment.class));
    }
}
```

```java
package pe.upc.pawfectcarebackend.appointmentsscheduling;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pe.upc.pawfectcarebackend.appointmentsscheduling.application.MedicalAppointmentCommandServiceImpl;
import pe.upc.pawfectcarebackend.appointmentsscheduling.domain.model.aggregates.Appointment;
import pe.upc.pawfectcarebackend.appointmentsscheduling.domain.model.aggregates.MedicalAppointment;
import pe.upc.pawfectcarebackend.appointmentsscheduling.domain.model.commands.CreateMedicalAppointmentCommand;
import pe.upc.pawfectcarebackend.appointmentsscheduling.infrastructure.persistence.jpa.repositories.AppointmentRepository;
import pe.upc.pawfectcarebackend.appointmentsscheduling.infrastructure.persistence.jpa.repositories.MedicalAppointmentRepository;
import pe.upc.pawfectcarebackend.petmanagement.application.acl.ExternalMedicalHistoryService;
import pe.upc.pawfectcarebackend.medicalrecords.domain.model.aggregates.MedicalHistory;
import pe.upc.pawfectcarebackend.petmanagement.domain.model.aggregates.Pet;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class MedicalAppointmentCommandServiceTest {

    @Test
    void handleCreateMedicalAppointmentCommand() {
        /*
          Arrange
          Mock the dependencies
         */
        MedicalAppointmentRepository medicalAppointmentRepository = Mockito.mock(MedicalAppointmentRepository.class);
        AppointmentRepository appointmentRepository = Mockito.mock(AppointmentRepository.class);
        ExternalMedicalHistoryService externalMedicalHistoryService = Mockito.mock(ExternalMedicalHistoryService.class);

        // Create an instance of the MedicalAppointmentCommandService
        MedicalAppointmentCommandServiceImpl medicalAppointmentCommandService = new MedicalAppointmentCommandServiceImpl(
                medicalAppointmentRepository,
                appointmentRepository,
                externalMedicalHistoryService
        );

        // Simulate the existing Appointment and Pet
        MedicalHistory mockMedicalHistory = Mockito.mock(MedicalHistory.class);
        when(mockMedicalHistory.getId()).thenReturn(1L);

        Pet mockPet = Mockito.mock(Pet.class);
        when(mockPet.getMedicalHistory()).thenReturn(mockMedicalHistory);

        Appointment mockAppointment = Mockito.mock(Appointment.class);
        when(mockAppointment.getPet()).thenReturn(mockPet);
        when(appointmentRepository.findById(1L)).thenReturn(Optional.of(mockAppointment));

        // Create the command to add a medical appointment
        CreateMedicalAppointmentCommand command = new CreateMedicalAppointmentCommand(
                "diagnosis",
                "Treatment Example",
                "Notes Example",
                1L,
                1L
        );

        // Simulate the behavior of MedicalAppointmentRepository
        MedicalAppointment mockMedicalAppointment = new MedicalAppointment(
                command.diagnosis(),
                command.treatment(),
                command.notes()
        );
        mockMedicalAppointment.setMedicalHistory(mockMedicalHistory);
        mockMedicalAppointment.setAppointment(mockAppointment);
        when(medicalAppointmentRepository.save(any(MedicalAppointment.class))).thenReturn(mockMedicalAppointment);

        /*
          Act
          Call the method to be tested
         */
        Long medicalAppointmentId = medicalAppointmentCommandService.handle(command);

        // Debugging: Print the created medical appointment details
        System.out.println("\nCreated Medical Appointment: \n------------------------------\n");
        System.out.println("Diagnosis: " + mockMedicalAppointment.getDiagnosis());
        System.out.println("Treatment: " + mockMedicalAppointment.getTreatment());
        System.out.println("Notes: " + mockMedicalAppointment.getNotes());
        System.out.println("Appointment ID: " + mockMedicalAppointment.getAppointment().getId());
        System.out.println("Medical History ID: " + mockMedicalAppointment.getMedicalHistory().getId());
        System.out.println("------------------------------\n");

        /*
          Assert
          Verify the results
         */
        assertEquals(mockMedicalAppointment.getId(), medicalAppointmentId);
        verify(appointmentRepository, times(1)).findById(command.appointmentId());
        verify(medicalAppointmentRepository, times(1)).save(any(MedicalAppointment.class));
        verify(externalMedicalHistoryService, times(1)).AddMedicalAppointmentToMedicalHistory(
                mockMedicalHistory.getId(),
                mockMedicalAppointment.getId()
        );
    }
}
```

#### US09:	Agendamiento de Citas<br>
    Como dueño de mascota, deseo agendar citas veterinarias para asegurar que mi mascota reciba atención médica en el momento adecuado.

[![Captura-de-pantalla-2025-05-16-201707.png](https://i.postimg.cc/Pq9Lhmz4/Captura-de-pantalla-2025-05-16-201707.png)](https://postimg.cc/Mc0ZmfLM)

[![Captura-de-pantalla-2025-05-16-201838.png](https://i.postimg.cc/PryPNGQN/Captura-de-pantalla-2025-05-16-201838.png)](https://postimg.cc/w7t6bGPd)<br><br>


## Core Integration Tests

Las Core Integration Tests aseguran que los componentes clave del sistema trabajan bien juntos. Usar Postman te permite verificar manualmente y de forma visual que la API cumple con lo esperado antes o junto a las pruebas automatizadas. Es especialmente útil en etapas de desarrollo, debugging o cuando se integra un nuevo módulo.

#### HTTP GETS 

[![Captura-de-pantalla-2025-05-17-015437.png](https://i.postimg.cc/Cx5BtjRc/Captura-de-pantalla-2025-05-17-015437.png)](https://postimg.cc/3kMx00CG)

[![Captura-de-pantalla-2025-05-17-015531.png](https://i.postimg.cc/rF8tG6MX/Captura-de-pantalla-2025-05-17-015531.png)](https://postimg.cc/5jR01RXn)

[![Captura-de-pantalla-2025-05-17-015352.png](https://i.postimg.cc/FH6dQ7cN/Captura-de-pantalla-2025-05-17-015352.png)](https://postimg.cc/K1nvPcJH)

[![Captura-de-pantalla-2025-05-17-015105.png](https://i.postimg.cc/MGjcZqbR/Captura-de-pantalla-2025-05-17-015105.png)](https://postimg.cc/cK01Xqz4)

[![Captura-de-pantalla-2025-05-17-015016.png](https://i.postimg.cc/BQMPMhn8/Captura-de-pantalla-2025-05-17-015016.png)](https://postimg.cc/D84zzPsF)

#### HTTP POSTS

[![Captura-de-pantalla-2025-05-17-020125.png](https://i.postimg.cc/zfnJPBFd/Captura-de-pantalla-2025-05-17-020125.png)](https://postimg.cc/wtj819PJ)

#### HTTP UPDATE

[![Captura-de-pantalla-2025-05-17-020504.png](https://i.postimg.cc/02M1Bj8p/Captura-de-pantalla-2025-05-17-020504.png)](https://postimg.cc/BX0z8qP6)

#### HTTP DELETE

[![Captura-de-pantalla-2025-05-17-020559.png](https://i.postimg.cc/kXtLyHcs/Captura-de-pantalla-2025-05-17-020559.png)](https://postimg.cc/HVdSYBF8)


## User Acceptance Tests

Pruebas de aceptación para las historias pertenecientes al core business son mostradas a continuación:

US01: Registro de Usuario

[![Captura-de-pantalla-2025-05-16-232803.png](https://i.postimg.cc/Dz8nc044/Captura-de-pantalla-2025-05-16-232803.png)](https://postimg.cc/Z9tGbTcJ)
<br>

US02: Autenticación de Usuarios

[![Captura-de-pantalla-2025-05-16-235349.png](https://i.postimg.cc/DZ1r82gR/Captura-de-pantalla-2025-05-16-235349.png)](https://postimg.cc/JD4DFCSQ)
<br>

US06: Visualización de Perfiles de Mascotas

[![Captura-de-pantalla-2025-05-17-003231.png](https://i.postimg.cc/G2vfdnsm/Captura-de-pantalla-2025-05-17-003231.png)](https://postimg.cc/1n5BrTHk)
<br>

US08: Gestión de Perfiles de Mascotas

[![Captura-de-pantalla-2025-05-17-000356.png](https://i.postimg.cc/4ydxjPmw/Captura-de-pantalla-2025-05-17-000356.png)](https://postimg.cc/vgJyVW76)
<br>

US09: Agendamiento de Citas

[![Captura-de-pantalla-2025-05-17-000651.png](https://i.postimg.cc/RZfZrNZr/Captura-de-pantalla-2025-05-17-000651.png)](https://postimg.cc/BjS0HZFN)
<br>

US10: Cancelación de citas

[![Captura-de-pantalla-2025-05-17-002801.png](https://i.postimg.cc/JnBLXFDf/Captura-de-pantalla-2025-05-17-002801.png)](https://postimg.cc/CBYXTm47)
<br>

## Automated Tests

Para la ejecución de las pruebas automatizadas se tomaron en cuenta las historias de usuario primarias que formaban parte del core bussines y se utilizó la herramienta Selenium.

US02: Autenticación de Usuarios

[![Captura-de-pantalla-2025-05-17-031953.png](https://i.postimg.cc/C57hFLPF/Captura-de-pantalla-2025-05-17-031953.png)](https://postimg.cc/GTBwKrnN)
<br>

US06: Visualización de Mascotas

[![Captura-de-pantalla-2025-05-17-032251.png](https://i.postimg.cc/yYW4JPWh/Captura-de-pantalla-2025-05-17-032251.png)](https://postimg.cc/0bgHF7Yr)
<br>

US08: Gestión de Perfiles de Mascotas

[![Captura-de-pantalla-2025-05-17-032518.png](https://i.postimg.cc/QCH4MfSH/Captura-de-pantalla-2025-05-17-032518.png)](https://postimg.cc/CnpHPH3g)
<br>

US09: Agendamiento de Citas

[![Captura-de-pantalla-2025-05-17-032758.png](https://i.postimg.cc/7YN9k8qm/Captura-de-pantalla-2025-05-17-032758.png)](https://postimg.cc/svv7YLQh)
<br>

[![Captura-de-pantalla-2025-05-17-032809.png](https://i.postimg.cc/GtFQt6G3/Captura-de-pantalla-2025-05-17-032809.png)](https://postimg.cc/Zvq3D7wX)
<br>

## 5.1.1.5 Quality Attributes Tests

Para realizar pruebas no funcionales tomamos en cuenta evaluar los atributos de calidad de escalabilidad y rendimiento. Decidimos utilizar Google Lighthouse porque es una herramienta automatizada de código abierto que permite auditar aplicaciones web en aspectos clave como el rendimiento de carga, optimización para dispositivos móviles, accesibilidad, buenas prácticas de desarrollo y SEO. Lighthouse proporciona métricas cuantitativas y sugerencias de mejora, lo que nos permite identificar cuellos de botella en el rendimiento y oportunidades para optimizar la experiencia del usuario. Además, su integración con navegadores como Chrome facilita su uso en entornos de desarrollo y pruebas continuas.

**Backend**

[![Captura-de-pantalla-2025-05-17-011514.png](https://i.postimg.cc/br5pW2Dt/Captura-de-pantalla-2025-05-17-011514.png)](https://postimg.cc/ctfp8Ccx)

[![Captura-de-pantalla-2025-05-17-011503.png](https://i.postimg.cc/ZK9T3j2F/Captura-de-pantalla-2025-05-17-011503.png)](https://postimg.cc/XpbS6KVp)

**Frontend**

[![Captura-de-pantalla-2025-05-17-030840.png](https://i.postimg.cc/pTVV3vTK/Captura-de-pantalla-2025-05-17-030840.png)](https://postimg.cc/5HGMFZ8t)

[![Captura-de-pantalla-2025-05-17-030732.png](https://i.postimg.cc/R07qjGTx/Captura-de-pantalla-2025-05-17-030732.png)](https://postimg.cc/rdp841bf)


## Software Development Environment Configuration

- Product UX/UI Design:
    - UXPressia: Se empleó para la creación de User Personas, Empathy Map e Impact Map.
    - Miro: Se utilizó para elaborar los As-Is Scenario Map y To-Be Scenario Map.
- Project Management:
    - Trello: Se utilizó esta herramienta para los Sprints y ADD Iterations.
- Software Documentation:
    - Visual Paradigm: Fue empleado para la elaboración del modelo C4 de la arquitectura de software.
    - LucidChart: Se empleó para la creación de los UML Diagrams.
    - Vertabelo: Se utilizó para elaborar nuestro Database Diagram.
    - Swagger: Se empleó para la documentación de la API.
- Software Development:
    - IntelliJ IDEA: Empleado para el desarrollo del frontend y backend.
- Software Testing:
    - Gherkin / Cucumber: Acceptance Tests
    - JUnit / Mockito: Unit Tests
    - Postman: Integration Tests
    - Google Light House: Performance Tests

## Assets

[![a1.png](https://i.postimg.cc/HWfYmvRg/a1.png)](https://postimg.cc/jC40QcRg)

[![execution-back-sprint3-1.png](https://i.postimg.cc/KYqbH0BD/execution-back-sprint3-1.png)](https://postimg.cc/3yvzyCLk)

[![background.png](https://i.postimg.cc/zD9zN26q/background.png)](https://postimg.cc/mhyfNjTn)

## Insights

[![insights-backend-s3.png](https://i.postimg.cc/hGx8C5Hk/insights-backend-s3.png)](https://postimg.cc/FfrJzDFp)

---


