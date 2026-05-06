package co.edu.uniquindio.smartlibrary2;

//TIP Para <b>ejecutar</b> el código, pulsar <shortcut actionId="Run"/> o
// Haz clic en el ícono <icon src="AllIcons.Actions.Execute"/> del margen.
public class Main {
    static void main() {
        //TIP Pulsa <shortcut actionId="ShowIntentionActions"/> con tu cursor en el texto resaltado
        // para ver cómo IntelliJ IDEA sugiere corregirlo.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Presione <shortcut actionId="Debug"/> para iniciar la depuración de su código. Hemos creado un punto de interrupción <icon src="AllIcons.Debugger.Db_set_breakpoint"/>
            // para ti, pero siempre puedes añadir más pulsando <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
}
