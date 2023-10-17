package ma.ensa.list.service;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import ma.ensa.list.beans.Produit;
import ma.ensa.list.dao.IDao;

public class ProduitService implements IDao<Produit> {

    private List<Produit> Produits;

    public ProduitService() {
        this.Produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        Log.d("Create : ", o.toString());
        return Produits.add(o);
    }

    @Override
    public Produit findById(int id) {
        Log.d("FindById : ", id+"");
        for(Produit f : Produits)
            if(f.getId() == id)
                return f;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        Log.d("findAll : ", Produits.size()+"");
        return Produits;
    }

    @Override
    public boolean delete(Produit o) {
        Log.d("Delete : ", o.toString());
        return Produits.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        Produit f = findById(o.getId());
        f.setNom(o.getNom());

        return false;
    }
}
