import javax.swing.JOptionPane

fun main(args: Array<String>){

    var n1 = JOptionPane.showInputDialog("Ingresa el primer valor").toInt()
    var n2 = JOptionPane.showInputDialog("Ingresa el segundo valor").toInt()

    var calculator = Calculator()
    var resultado = 0
    resultado = calculator.suma(n1,n2)
    JOptionPane.showMessageDialog(null, "El resultado de tu suma es $resultado")

    resultado = calculator.resta(n1,n2)
    JOptionPane.showMessageDialog(null, "El resultado de tu resta es $resultado")

    resultado = calculator.multiplicacion(n1,n2)
    JOptionPane.showMessageDialog(null, "El resultado de tu multiplicacion es $resultado")

    var resultadoD = calculator.division(n1.toDouble(),n2.toDouble())
    JOptionPane.showMessageDialog(null, "El resultado de tu division es $resultadoD")

}