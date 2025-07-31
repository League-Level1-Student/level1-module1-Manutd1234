package _06_vault;

public class SecretAgent {
	int findCode(Vault va) {
		for(int i = 0; i<=1000000; i++) {
			boolean val = va.tryCode(i);
			if(val == true) {
				return i;
			}
		}
		return -1;

	}
}
