package X;

import android.util.Pair;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Dcq  reason: case insensitive filesystem */
public final class C46347Dcq implements 0mK {
    public final int A00;
    public final Object A01;

    public C46347Dcq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        User user;
        Object obj2 = obj;
        if (2 - this.A00 != 0) {
            ((C46551Dgt) this.A01).A00.A00();
            return;
        }
        Pair pair = (Pair) obj2;
        0qQ.A0B(pair, 0);
        C49703F2o f2o = (C49703F2o) this.A01;
        Number number = (Number) pair.first;
        Number number2 = (Number) pair.second;
        int intValue = number.intValue();
        if (intValue < f2o.A00 || number2.intValue() > f2o.A01) {
            0qQ.A0A(number2);
            int intValue2 = number2.intValue();
            if (intValue <= intValue2) {
                while (true) {
                    if (intValue < f2o.A00 || intValue > f2o.A01) {
                        SuggestBusinessFragment suggestBusinessFragment = f2o.A05;
                        if (intValue >= 0 && suggestBusinessFragment.A01 != null) {
                            C15474UdP udP = suggestBusinessFragment.A00;
                            udP.getClass();
                            V3U v3u = (V3U) udP.getItem(intValue);
                            if (!(v3u == null || (user = v3u.A01) == null)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("target_id", user.getId());
                                hashMap.put("index", String.valueOf(intValue - 1));
                                suggestBusinessFragment.A01.ClC(new C22030Xtl("pro_account_suggestions", suggestBusinessFragment.A05, "suggested_pro_account", (String) null, (String) null, (Map) null, hashMap, (Map) null));
                            }
                        }
                    }
                    if (intValue == intValue2) {
                        break;
                    }
                    intValue++;
                }
            }
            f2o.A00 = number.intValue();
            f2o.A01 = intValue2;
        }
    }
}
