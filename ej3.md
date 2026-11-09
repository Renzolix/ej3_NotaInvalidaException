# Ejercicio 3: NotaInvalidaException

## Explicación Lógica
1. **Excepción Verificada (Checked):** Al extender de `java.lang.Exception`, el compilador exige declarar `throws NotaInvalidaException` en la firma de `asignarNota()` o gestionarla con `try-catch`.
2. **Validación de Negocio:** Se evalúa que la nota pertenezca al rango `[0.0, 10.0]`. De lo contrario, se interrumpe la asignación enviando el mensaje y el valor inválido a la capa superior.