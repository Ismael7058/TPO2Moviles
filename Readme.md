# TPO2Moviles

## Descripción de la app
Aplicación Android desarrollada en Java que detecta el evento de **desbloqueo de pantalla** y, al producirse, muestra un mensaje y **intenta realizar una llamada telefónica** automáticamente.

### Archivos
- `MainActivity` — Activity principal; gestiona permisos y registra el receiver.
- `UnlockScreen` — BroadcastReceiver; detecta desbloqueo y dispara la llamada.

### Funcionamiento general
- `MainActivity` solicita el permiso `android.permission.CALL_PHONE`.
- Se registra el receiver `UnlockScreen` para escuchar `Intent.ACTION_USER_PRESENT` (usuario presente/desbloqueo).
- Al detectarse el desbloqueo, `UnlockScreen` intenta iniciar un `Intent.ACTION_CALL` hacia un número predefinido (`tel:2664553747`).
- Si no hay permisos, se informa con un mensaje.

### Permisos utilizados
- `android.permission.CALL_PHONE`


## Integrantes del grupo
- Miranda Salmin, Ismael Ariel - DNI: 44993241
- Quiroga, Maximo Tomas - DNI: 44642650
- Zegarra, Juan Cruz - DNI: 43057480
