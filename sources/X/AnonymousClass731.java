package X;

import com.instagram.user.model.CreatorShoppingInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.731  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass731 {
    public static Map A00(CreatorShoppingInfo creatorShoppingInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<User> BN1 = creatorShoppingInfo.BN1();
        if (BN1 != null) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(BN1, 10));
            for (User A08 : BN1) {
                arrayList.add(A08.A08());
            }
            linkedHashMap.put("linked_merchant_accounts", arrayList);
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
