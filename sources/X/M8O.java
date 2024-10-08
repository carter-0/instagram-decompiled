package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;

public final class M8O implements Runnable {
    public final /* synthetic */ C63829L8k A00;
    public final /* synthetic */ KAL A01;
    public final /* synthetic */ K68 A02;

    public M8O(C63829L8k l8k, KAL kal, K68 k68) {
        this.A02 = k68;
        this.A00 = l8k;
        this.A01 = kal;
    }

    public final void run() {
        String str;
        String str2;
        int i;
        int i2;
        K68 k68 = this.A02;
        C63829L8k l8k = this.A00;
        Map map = l8k.A03;
        0qQ.A06(map);
        Map map2 = l8k.A04;
        0qQ.A06(map2);
        KAL kal = this.A01;
        C64184LSr lSr = k68.A01;
        if (lSr != null) {
            UserSession A0l = AnonymousClass7TE.A0l(k68.A0C);
            String A0t = DbS.A0t(k68.A0B);
            Ki3 ki3 = (Ki3) k68.A0D.getValue();
            Set keySet = map.keySet();
            Set keySet2 = map2.keySet();
            String str3 = lSr.A01;
            C63830L8l l8l = lSr.A00;
            if (l8l == null) {
                str = null;
            } else {
                str = l8l.A03;
            }
            if (l8l != null) {
                str2 = l8l.A04;
                i2 = l8l.A02.getHeight();
                i = l8l.A02.getWidth();
            } else {
                str2 = null;
                i = 0;
                i2 = 0;
            }
            C63830L8l l8l2 = lSr.A00;
            l8l2.getClass();
            1OC A012 = AnonymousClass738.A01(ki3, A0l, A0t, str3, str, str2, C64184LSr.A02(l8l2), keySet, keySet2, i2, i);
            A012.A00 = kal;
            k68.schedule(A012);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
