


public class Operacion {

    public static int NroReg = 1;
    public static RegistroCliente[] Cuenta = new RegistroCliente[200];

    public class RegistroCliente {

        String NombreUsuario, Contraseña, Rut;
        int SaldoAhorro, SaldoCorriente;

        public RegistroCliente() {
        }

        public RegistroCliente(String NombreUsuario, String Contraseña, String Rut, int SaldoAhorro, int SaldoCorriente) {
            this.NombreUsuario = NombreUsuario;
            this.Contraseña = Contraseña;
            this.Rut = Rut;
            this.SaldoAhorro = SaldoAhorro;
            this.SaldoCorriente = SaldoCorriente;
        }

        public String getNombreUsuario() {
            return NombreUsuario;
        }

        public void setNombreUsuario(String NombreUsuario) {
            this.NombreUsuario = NombreUsuario;
        }

        public String getContraseña() {
            return Contraseña;
        }

        public void setContraseña(String Contraseña) {
            this.Contraseña = Contraseña;
        }

        public String getRut() {
            return Rut;
        }

        public void setRut(String Rut) {
            this.Rut = Rut;
        }

        public int getSaldoAhorro() {
            return SaldoAhorro;
        }

        public void setSaldoAhorro(int SaldoAhorro) {
            this.SaldoAhorro = SaldoAhorro;
        }

        public int getSaldoCorriente() {

            return SaldoCorriente;
        }

        public void setSaldoCorriente(int SaldoCorriente) {
            this.SaldoCorriente = SaldoCorriente;
        }

    }

    public void IngresarCliente(String NombreUs, String psw, String RutCliente, int SalCorriente, int SalAhorro) {

        Cuenta[NroReg] = new RegistroCliente();
        Cuenta[NroReg].NombreUsuario = NombreUs;
        Cuenta[NroReg].Rut = RutCliente;
        Cuenta[NroReg].Contraseña = psw;
        Cuenta[NroReg].SaldoAhorro = SalAhorro;
        Cuenta[NroReg].SaldoCorriente = SalCorriente;
        NroReg++;

    }

    public void DepositarAhorro(String rut, int MontoAhorro) {

        for (int i = 1; i <= 200; i++) {
            if (Cuenta[i].Rut.equals(rut)) {
                Cuenta[i].SaldoAhorro = Cuenta[i].SaldoAhorro + MontoAhorro;
                return;

            }

        }

    }

    public void DepositarCorriente(String rutcli, int MontoCorriente) {

        for (int i = 1; i <= 200; i++) {
            if (Cuenta[i].Rut.equals(rutcli)) {
                Cuenta[i].SaldoCorriente = Cuenta[i].SaldoCorriente + MontoCorriente;
                return;

            }

        }

    }

    public void RetiroAhorro(String rut, int MontoAhorro) {

        for (int j = 1; (j <= 200); j++) {
            if (Cuenta[j].Rut.equals(rut) && Cuenta[j].SaldoAhorro >= 0) {
                Cuenta[j].SaldoAhorro = Cuenta[j].SaldoAhorro - MontoAhorro;
                return;

            } else {
                System.out.println("Saldo Insuficiente");
  
            }

        }

    }

    public void RetiroCorriente(String rutcli, int MontoCorriente) {

        for (int j = 1; (j <= 200); j++) {
            if (Cuenta[j].Rut.equals(rutcli) && (Cuenta[j].SaldoCorriente >= -500000)) {
                Cuenta[j].SaldoCorriente = Cuenta[j].SaldoCorriente - MontoCorriente;
                return;

            } else {
                System.out.println("Saldo Insuficiente");
                
            }

        }

    }

}
