# HypeX — Parcial 1 (Aplicaciones Móviles)

**Cátedra:**  ACN4AV  
**Integrantes:** Chavez

## Descripción
App con pantalla de **Login** (email + contraseña + botones sociales) y **Welcome** que muestra el email.  
Se agregan **mensajes de error dinámicos** desde Java (requisito).

## Cómo ejecutar
1. Abrir el proyecto en Android Studio (Java, API 24+).
2. Ejecutar ▶ en emulador o dispositivo físico.
3. Login de demo: **demo@hypex.com** / **123456**.

## Requisitos cumplidos (verificar)
- **Layouts:** ConstraintLayout (root Login) + LinearLayout (formulario y sociales).
- **Widgets:** TextView, EditText, Button, ImageView.
- **Eventos:** onClick en Continuar / Google / Apple / Logout.
- **Dinámico:** mensajes de error agregados por código (Java).
- **2 pantallas:** Login → Welcome (muestra email) + “Cerrar sesión”.

## Archivos clave
- `app/src/main/res/layout/activity_login.xml`
- `app/src/main/res/layout/activity_welcome.xml`
- `app/src/main/java/.../MainActivity.java`
- `app/src/main/java/.../WelcomeActivity.java`
- `app/src/main/res/drawable/` (hypex_logo, ic_google, ic_apple)

## Créditos visuales
Basado en el mockup de Figma del equipo. (aun no fiel 100% al mockup)

