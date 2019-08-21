package Exercicios;

public class MetComparar {

	public boolean vogal(char letra) {
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
			return true;
		else
			return false;
	}
	
	public boolean SeCharNum(char num) {
		int k;
		boolean flag = false;
		for(k=0;k<=9;k++) {
			if(num == Integer.toString(k).charAt(0))
				flag = true;
		}
		return flag;
	}
	
	public boolean validarData(String dataVal) {
		boolean valida = true;
		if(dataVal.length() == 10) {
			int c;
			for(c = 0; c<=9;c++) {
				if(c == 2 || c== 5) {
					if(dataVal.charAt(c) != '/')
						valida = false;
				}
				else {
					if(!SeCharNum(dataVal.charAt(c))){
						valida = false;
					}
				}
			}
		}
		else {
			valida = false;
		}
		return valida;
	}
}
