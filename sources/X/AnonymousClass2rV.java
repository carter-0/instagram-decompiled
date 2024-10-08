package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2rV  reason: invalid class name */
public class AnonymousClass2rV extends AnonymousClass2rW {
    public UserSession A00;
    public final Set A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.String A03(java.lang.Object r4) {
        /*
            r3 = this;
            X.1Xg r4 = (X.1Xg) r4
            X.1Xn r0 = r4.A05
            X.1Xj r2 = X.1Xi.A02(r0)
            if (r2 != 0) goto L_0x000d
            java.lang.String r0 = r4.A09
            return r0
        L_0x000d:
            com.instagram.common.session.UserSession r1 = r3.A00
            boolean r0 = r3.A02
            if (r1 == 0) goto L_0x001d
            if (r0 != 0) goto L_0x001f
            X.1Av r0 = X.1Au.A00(r1)
            boolean r0 = X.C228342lQ.A08(r1, r0)
        L_0x001d:
            if (r0 == 0) goto L_0x0030
        L_0x001f:
            boolean r0 = r2.CcK()
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r2.A2R()
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r2.A2R()
            return r0
        L_0x0030:
            java.lang.String r0 = r2.getId()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2rV.A03(java.lang.Object):java.lang.String");
    }

    public final void A05() {
        this.A01.clear();
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj) {
        1Xl r2 = ((1Xg) obj).A05;
        if (r2 instanceof 1Xl) {
            Set set = this.A01;
            0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.feed.media.ModelWithMedia");
            set.add(r2.BPf());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r0 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(X.1Xj r3) {
        /*
            r2 = this;
            com.instagram.common.session.UserSession r1 = r2.A00
            boolean r0 = r2.A02
            if (r1 == 0) goto L_0x0010
            if (r0 != 0) goto L_0x0012
            X.1Av r0 = X.1Au.A00(r1)
            boolean r0 = X.C228342lQ.A08(r1, r0)
        L_0x0010:
            if (r0 == 0) goto L_0x002d
        L_0x0012:
            boolean r0 = r3.CcK()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r3.A2R()
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = r3.A2R()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.Map r0 = r2.A04
            boolean r1 = r0.containsKey(r1)
        L_0x002c:
            return r1
        L_0x002d:
            java.util.Set r0 = r2.A01
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0046
            java.lang.String r1 = r3.getId()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.Map r0 = r2.A04
            boolean r0 = r0.containsKey(r1)
            r1 = 0
            if (r0 == 0) goto L_0x002c
        L_0x0046:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2rV.A0E(X.1Xj):boolean");
    }

    public AnonymousClass2rV(UserSession userSession) {
        this.A01 = new HashSet();
        this.A02 = 182.A06(0Tu.A05, userSession, 36312879040824667L);
        this.A00 = userSession;
    }

    public AnonymousClass2rV() {
        this.A01 = new HashSet();
        this.A02 = false;
    }
}
