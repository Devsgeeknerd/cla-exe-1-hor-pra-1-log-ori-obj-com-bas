package br.com.devsgeeknerd.consultorio;

import br.com.devsgeeknerd.consultorio.Dentista;

public class Programa {
  public static void programa(String[] args) {
    Dentista dentista1 = new Dentista("Paulo", "Geek", "Ortodontia", "CRO135799", true);
    Dentista dentista2 = new Dentista("Vanderley", "Nerd", "Endodontia", "CRO864220", true);

    dentista1.atenderPaciente();
    dentista1.marcarConsulta();
    dentista1.remarcarConsulta();
    dentista1.cancelarConsulta();
    dentista1.viajarCongresso();
    dentista1.atenderPaciente();

    dentista2.atenderPaciente();
    dentista2.marcarConsulta();
    dentista2.remarcarConsulta();
    dentista2.cancelarConsulta();
    dentista2.viajarCongresso();
  }
}
