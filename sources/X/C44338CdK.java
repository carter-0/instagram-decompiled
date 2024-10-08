package X;

import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.api.schemas.SellerBadgeSurfaces;
import com.instagram.api.schemas.SellerBadgeType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CdK  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44338CdK {
    public static Map A00(SellerBadgeDictIntf sellerBadgeDictIntf) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (sellerBadgeDictIntf.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, sellerBadgeDictIntf.getDescription());
        }
        if (sellerBadgeDictIntf.getName() != null) {
            C41845B3m.A0z(sellerBadgeDictIntf.getName(), A1H);
        }
        String str = null;
        if (sellerBadgeDictIntf.C3O() != null) {
            List<SellerBadgeSurfaces> C3O = sellerBadgeDictIntf.C3O();
            if (C3O != null) {
                arrayList = AnonymousClass7TG.A0r(C3O);
                for (SellerBadgeSurfaces sellerBadgeSurfaces : C3O) {
                    0qQ.A0B(sellerBadgeSurfaces, 0);
                    arrayList.add(sellerBadgeSurfaces.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("surfaces", arrayList);
        }
        if (sellerBadgeDictIntf.CAT() != null) {
            SellerBadgeType CAT = sellerBadgeDictIntf.CAT();
            if (CAT != null) {
                str = CAT.A00;
            }
            C41845B3m.A11(str, A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
