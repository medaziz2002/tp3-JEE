package metier;

import java.util.List;

public interface ImetierCatalgue {

	public List<Produit> getProduitsParMotCle(String mc);
	public void addProduit(Produit p);
}
