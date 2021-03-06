package solid.singleresponsability;

import db.DB;
import db.WalletEntity;

public class WalletRepository {

    public WalletEntity getById(long id){
        return DB.walletEntityList.stream()
                .filter(walletEntity -> walletEntity.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addWallet(WalletEntity walletEntity){
        if (walletEntity.getId() == 0){
            throw new RuntimeException("Is must have an ID assinged");
        }
        if (getById(walletEntity.getId()) != null){
            throw new RuntimeException("There is already an wallet with ID " + walletEntity.getId());
        }
        DB.walletEntityList.add(walletEntity);
    }
}
