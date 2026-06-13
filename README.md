# Proyecto-de-Semestre
Repositorio para compartir la informacion a desarrollar
# Sistema Administrativo - Supermercado "El Ahorro"

**Proyecto del Taller de Panel Administrativo**  
Tecnología de Desarrollos de Sistemas Informáticos  
📅 I Semestre 2026
👨‍🏫 Profesor: Mag. Carlos Adolfo Beltrán Castro  
👨‍💻 Estudiantes: Sebastian David Ortiz Gomez - 1095580428

<img width="729" height="540" alt="{CAF8BC9B-A8CD-40DA-B677-151956EEA34A}" src="https://github.com/user-attachments/assets/e5979c8a-8770-4623-a8ee-ebbb9767b9f8" />


## 🚀 Descripción del Proyecto
Este sistema de escritorio desarrollado en **Java SE** y **Swing** surge como solución tecnológica para la cadena de supermercados en expansión **"El Ahorro"**. El proyecto resuelve problemáticas críticas de control operacional como:
- **Redundancia Masiva:** Migración de hojas de cálculo hacia una base de datos centralizada.
- **Fraudes Financieros:** Automatización lógica del programa de "Tarjeta de Fidelidad" (Relación 1:1).
- **Inconsistencia de Datos:** Restricciones únicas para documentos de identidad de clientes y empleados.

## 📂 Estructura del Proyecto
El sistema cuenta con una arquitectura de navegación moderna dividida en los siguientes submódulos:
1. ** Gestión de Clientes (CRUD Funcional):** Registro, consulta en tablas interactivas, edición y eliminación vinculada a la base de datos.
2. ** Sucursales y Empleados:** Organización del personal según la sede donde laboran.
3. ** Inventario (Productos y Categorías):** Control de existencias físicas y asignación de precios actuales.
4. ** Módulo Transaccional (Venta y Detalle):** Simulación de cajas de facturación con actualización automatizada de puntos de lealtad.
5. ** Salir:** Finalización segura del proceso con liberación de conexiones a la base de datos.

## 🧰 Lista de Tecnologías Usadas
- **Lenguaje Principal:** Java
- **Diseño de Interfaz:** Java Swing
- **Motor de Base de Datos:** PostgreSQL, SQLite
- **Conectividad:** JDBC (Java Database Connectivity Driver)
- **Control de Versiones:** GitHub

## 🔧 Instalación y ejecución
1. Disponer del entorno de ejecución **Java**
2. Un IDE de desarrollo  **Apache NetBeans**
3. Servidor de **PostgreSQL** activo en tu máquina local.

## 📋 Características Generales del Proyecto

El sistema está diseñado bajo el paradigma de Programación Orientada a Objetos (POO) y una arquitectura distribuida en capas, garantizando un control operativo robusto para el supermercado a través de las siguientes funcionalidades generales:

* **Persistencia de Datos Relacional:** Centralización de toda la información de la empresa en un motor PostgreSQL, eliminando la pérdida de datos y asegurando la integridad referencial mediante llaves primarias y foráneas.
* **Módulo de Clientes Automatizado:** Control total sobre los registros de los compradores mediante un CRUD funcional que interactúa con tablas dinámicas de Java Swing en tiempo real.
* **Sistema de Fidelización y Tarjeta de Puntos:** Lógica de negocio integrada directamente en el flujo de la venta. El sistema calcula automáticamente el total facturado y asigna **1 punto por cada $1.000 pesos de compra**, actualizando de forma inmediata el saldo en la ficha del cliente en la base de datos.
* **Control Transaccional de Ventas:** Procesamiento seguro de facturas (Cabecera y Detalle) utilizando transacciones SQL controladas (`commit` y `rollback`). Esto garantiza que si una venta falla, el sistema no deje datos corruptos ni descuadre el inventario.
* **Gestión de Inventario Dinámico (Descuento de Stock):** Automatización del inventario donde cada artículo vendido se resta automáticamente de las existencias físicas (`stock_actual`) en la tabla de productos de PostgreSQL tras confirmarse la compra.
* **Seguridad en Conexiones:** Cierre de recursos y canales de comunicación (`Connection`, `PreparedStatement`) mediante bloques `finally`, evitando fugas de memoria y saturación del servidor de base de datos.
