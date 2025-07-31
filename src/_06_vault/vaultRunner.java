package _06_vault;

public class vaultRunner {
public static void main(String[] args) {
	Vault v = new Vault();
	SecretAgent Agent = new SecretAgent();
int r = Agent.findCode(v);
System.out.println(r);
}
}
