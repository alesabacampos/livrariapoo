public interface Promocional {
	boolean aplicaDescontoDe(double porcentagem);
	
	//Para o JAVA SE 8
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.1);
	}
}
