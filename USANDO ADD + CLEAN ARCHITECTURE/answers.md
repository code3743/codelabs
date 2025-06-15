**1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?**
ADD es una forma de diseñar la arquitectura de un sistema basada en lo que se espera de él, como que sea rápido, seguro o fácil de mantener. Sirve para tomar decisiones pensando primero en esos requisitos de calidad que el sistema debe cumplir.



**2. ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?**
ADD ayuda a definir cómo debe ser la arquitectura según los requisitos de calidad. Clean Architecture se usa después para implementar esa arquitectura de forma organizada, separando bien las partes del sistema. Juntos permiten pasar de un buen diseño a una buena implementación.



**3. ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?**
Primero se identifican los requisitos y lo que el sistema necesita (como rapidez o seguridad). Luego se eligen técnicas para lograr esos objetivos (como usar caché para rendimiento), se definen los módulos principales y cómo se comunican entre ellos.



**4. ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?**
Se identifican preguntando qué espera el cliente o usuario del sistema: ¿Debe ser rápido? ¿Seguro? ¿Disponible siempre? Son importantes porque guían todo el diseño para que el sistema funcione bien y cumpla con lo esperado.



**5. ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?**
Porque mientras ADD dice qué se necesita, Clean Architecture ayuda a organizar el código de forma clara. Permite que los cambios en tecnología no afecten la lógica del sistema, lo que hace que el sistema sea más mantenible y escalable.



**6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?**
Hay que pensar en separar bien las responsabilidades: lo que hace el sistema (dominio), cómo se usa (aplicación), qué herramientas externas usa (infraestructura) y cómo se presenta (API o UI). También se busca que las capas no dependan unas de otras directamente.



**7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?**
ADD traduce lo que necesita el negocio (como rapidez o disponibilidad) en decisiones técnicas, por ejemplo, usar réplicas para que el sistema no se caiga, o agregar caché para mejorar la velocidad.



**8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?**
Se logra un sistema bien diseñado desde el inicio (gracias a ADD) y bien organizado en el código (gracias a Clean Architecture). En microservicios esto es clave para poder escalar, mantener y cambiar cosas sin romper todo.



**9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?**
Se hacen pruebas, revisiones y ajustes. Por ejemplo, si se quería buen rendimiento, se hacen pruebas de carga para ver si el sistema responde rápido, y si no, se optimiza.



**10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?**
Se pueden usar pruebas automáticas, análisis de rendimiento, revisiones de código, o herramientas como SonarQube para ver la calidad del código. También es útil hacer revisiones entre equipos (peer reviews) o pruebas de seguridad si aplica.

