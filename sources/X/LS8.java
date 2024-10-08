package X;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class LS8 {
    public static final Comparator A07 = MAU.A00;
    public static final Comparator A08 = MAV.A00;
    public static final Comparator A09 = MAW.A00;
    public boolean A00;
    public final Handler A01 = new C60012JdL(Looper.getMainLooper(), this, 5);
    public final Fragment A02;
    public final C14312Ttm A03;
    public final C63730L4o A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final Map A06 = AnonymousClass7TE.A1E();

    public LS8(Fragment fragment, C14312Ttm ttm, C63730L4o l4o) {
        0qQ.A0B(l4o, 3);
        this.A02 = fragment;
        this.A03 = ttm;
        this.A04 = l4o;
    }

    public static final void A00(LS8 ls8) {
        String str;
        C14312Ttm ttm = ls8.A03;
        1Xj A072 = ttm.A07();
        if (A072 == null) {
            str = "unknown";
        } else {
            Map map = ls8.A06;
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (0qQ.A0K(((L9E) A1J.getKey()).A01.getId(), A072.getId())) {
                    Dbb.A1V(A1J, A1H);
                }
            }
            L8J l8j = (L8J) 00k.A0J(00k.A0g(A1H.values(), A08));
            str = "scroll";
            if (l8j != null && l8j.A00 >= 0.2f) {
                A01(ls8);
                L8J l8j2 = (L8J) ((Map.Entry) AnonymousClass7TE.A13(ls8.A05)).getValue();
                if (l8j2.A00 <= 0.25f || A07.compare(l8j2, l8j) >= 0) {
                    return;
                }
            }
        }
        ttm.A0C(str, true);
    }

    public static final void A01(LS8 ls8) {
        List list = ls8.A05;
        list.clear();
        list.addAll(ls8.A06.entrySet());
        01V.A1D(list, A09);
    }
}
