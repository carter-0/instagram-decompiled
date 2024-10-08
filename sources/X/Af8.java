package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class Af8 implements C336287eN {
    public final C363288jT A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public final Object E5m(String str) {
        0qQ.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C363288jT r4 = this.A00;
        String str2 = this.A02;
        r4.A08((1UV) null, str2, str, linkedHashSet);
        List list = this.A04;
        if (list != null) {
            01N A1H = 0jo.A1H();
            A1H.addAll(list);
            C336427eb.A00((1UV) null, str, 0jo.A1I(A1H), linkedHashSet);
        }
        ArrayList A0U = 00k.A0U(linkedHashSet);
        r4.A09(str2, A0U);
        return new A62(str, A0U, linkedHashSet);
    }

    public Af8(UserSession userSession, String str, String str2, List list) {
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = list;
        this.A03 = str2;
        C363288jT A002 = C363288jT.A00(userSession);
        0qQ.A07(A002);
        this.A00 = A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r1 > r2.size()) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AIL(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            java.util.List r10 = (java.util.List) r10
            com.instagram.common.session.UserSession r3 = r8.A01
            java.lang.String r2 = r8.A03
            X.01N r4 = X.0jo.A1H()
            if (r10 != 0) goto L_0x000e
            X.0sn r10 = X.0sn.A00
        L_0x000e:
            r7 = 0
            X.Axs r1 = X.C41640Axs.A00
            java.lang.Class<X.A4R> r0 = X.A4R.class
            java.lang.Object r1 = r3.A01(r0, r1)
            X.A4R r1 = (X.A4R) r1
            monitor-enter(r1)
            android.util.LruCache r0 = r1.A00     // Catch:{ all -> 0x00b9 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x00b9 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x00b9 }
            monitor-exit(r1)
            if (r9 == 0) goto L_0x00b4
            boolean r0 = r9 instanceof X.A62
            if (r0 == 0) goto L_0x00b4
            X.A62 r9 = (X.A62) r9
            if (r2 == 0) goto L_0x0081
            r1 = 2131954802(0x7f130c72, float:1.9546114E38)
            X.DfA r0 = new X.DfA
            r0.<init>((int) r1)
            r4.add(r0)
            java.lang.String r6 = r9.A00
            java.lang.Integer r0 = X.00y.A0l(r6)
            if (r0 == 0) goto L_0x004d
            int r1 = r0.intValue()
            if (r1 <= 0) goto L_0x004d
            int r0 = r2.size()
            r5 = 1
            if (r1 <= r0) goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x0056:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9bn r0 = (X.C381459bn) r0
            if (r5 == 0) goto L_0x0073
            int r0 = r0.A00
            int r0 = r0 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.00p.A0k(r0, r6, r7)
            if (r0 == 0) goto L_0x0056
        L_0x0073:
            r3.add(r1)
            goto L_0x0056
        L_0x0077:
            r1 = 24
            X.JwI r0 = new X.JwI
            r0.<init>((java.util.List) r3, (int) r1)
            r4.add(r0)
        L_0x0081:
            r1 = 2131969339(0x7f13453b, float:1.9575598E38)
            X.DfA r0 = new X.DfA
            r0.<init>((int) r1)
            r4.add(r0)
            java.util.List r0 = r9.A01
            r4.addAll(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r10.iterator()
        L_0x0099:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r1 = r2.next()
            java.util.Set r0 = r9.A02
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0099
            r3.add(r1)
            goto L_0x0099
        L_0x00b1:
            r4.addAll(r3)
        L_0x00b4:
            X.01N r0 = X.0jo.A1I(r4)
            return r0
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Af8.AIL(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object ARG() {
        return 0sn.A00;
    }
}
