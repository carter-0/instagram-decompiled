package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.7eM  reason: invalid class name and case insensitive filesystem */
public final class C336277eM implements C336287eN {
    public final C363288jT A00;
    public final /* synthetic */ 1UV A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public final Object E5m(String str) {
        0qQ.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C363288jT r4 = this.A00;
        String str2 = this.A02;
        1UV r2 = this.A01;
        r4.A08(r2, str2, str, linkedHashSet);
        List list = this.A03;
        if (list != null) {
            01N A1H = 0jo.A1H();
            A1H.addAll(list);
            C336427eb.A00(r2, str, 0jo.A1I(A1H), linkedHashSet);
        }
        ArrayList A0U = 00k.A0U(linkedHashSet);
        r4.A09(str2, A0U);
        return new C336467ef(A0U, linkedHashSet);
    }

    public C336277eM(1UV r2, UserSession userSession, String str, List list) {
        this.A02 = str;
        this.A01 = r2;
        this.A03 = list;
        C363288jT A002 = C363288jT.A00(userSession);
        0qQ.A07(A002);
        this.A00 = A002;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AIL(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.util.List r7 = (java.util.List) r7
            X.1UV r4 = r5.A01
            if (r7 != 0) goto L_0x0037
            X.0sn r3 = X.0sn.A00
        L_0x0008:
            r7 = r3
        L_0x0009:
            if (r6 == 0) goto L_0x005d
            X.7ef r6 = (X.C336467ef) r6
            X.01N r4 = X.0jo.A1H()
            java.util.List r0 = r6.A00
            r4.addAll(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x001f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r2.next()
            java.util.Set r0 = r6.A01
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001f
            r3.add(r1)
            goto L_0x001f
        L_0x0037:
            if (r4 == 0) goto L_0x0009
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.apply(r1)
            if (r0 == 0) goto L_0x0042
            r3.add(r1)
            goto L_0x0042
        L_0x0056:
            r4.addAll(r3)
            X.01N r7 = X.0jo.A1I(r4)
        L_0x005d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336277eM.AIL(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object ARG() {
        return 0sn.A00;
    }
}
