package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5FM  reason: invalid class name */
public final class AnonymousClass5FM implements AnonymousClass1GR {
    public boolean A00;
    public final UserSession A01;
    public final AnonymousClass49H A02;
    public final AnonymousClass3PS A03;
    public final Map A04 = new HashMap();
    public final Set A05;

    public final void DEO(C268654dm r6, AnonymousClass1QW r7) {
        String A0R;
        String str;
        0qQ.A0B(r6, 1);
        boolean z = this.A00;
        String str2 = null;
        Throwable A012 = r6.A01();
        if (z) {
            if (A012 != null) {
                str2 = A012.getMessage();
            }
            A0R = 002.A0R("error=", str2);
            str = "StreamingReelMediaResponseCallbackPartialFailure";
        } else {
            if (A012 != null) {
                str2 = A012.getMessage();
            }
            A0R = 002.A0R("error=", str2);
            str = "StreamingReelMediaResponseCallbackFailure";
        }
        0wb.A03(str, A0R);
        Set set = this.A05;
        1XQ r0 = (1XQ) r6.A00();
        if (r0 != null && r0.mStatusCode == 429) {
            1OH.A00(this.A01).A07.put("reels_media_stream", Long.valueOf(System.currentTimeMillis()));
        }
        AnonymousClass3G6.A00(this.A01).A03(r6, this.A02);
        this.A03.A02(set);
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DTy(1XR r1, AnonymousClass1QW r2, AnonymousClass2ZK r3) {
    }

    public final /* synthetic */ void DeX() {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final void D58(AnonymousClass1QW r3, AnonymousClass2ZK r4) {
        AnonymousClass3G6.A00(this.A01).A05(this.A02);
        HashSet hashSet = new HashSet(this.A05);
        hashSet.removeAll(this.A04.keySet());
        if (!hashSet.isEmpty()) {
            this.A03.A03(hashSet);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r0 == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DTw(X.1XR r12, X.AnonymousClass1QW r13, X.AnonymousClass2ZK r14) {
        /*
            r11 = this;
            X.3mF r12 = (X.C250903mF) r12
            r0 = 2
            X.0qQ.A0B(r12, r0)
            r0 = 1
            r11.A00 = r0
            com.instagram.common.session.UserSession r6 = r11.A01
            X.3G7 r1 = X.AnonymousClass3G6.A00(r6)
            X.49H r0 = r11.A02
            r1.A06(r0, r12)
            java.util.HashMap r7 = r12.A03(r6)
            X.0qQ.A07(r7)
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x0023:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r5 = r10.next()
            java.lang.Object r9 = r7.get(r5)
            X.3HX r9 = (X.AnonymousClass3HX) r9
            if (r9 == 0) goto L_0x0023
            X.1Ns r0 = X.AnonymousClass3P9.A01(r6, r9)
            r2 = 0
            r8 = 0
            if (r0 == 0) goto L_0x0062
            X.1Ns r0 = X.AnonymousClass3P9.A01(r6, r9)
            if (r0 == 0) goto L_0x009a
            java.lang.Integer r1 = r0.CAm()
        L_0x0047:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0062
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r0.A01(r6)
            X.1Ns r0 = X.AnonymousClass3P9.A01(r6, r9)
            if (r0 == 0) goto L_0x0098
            com.instagram.user.model.User r0 = r0.CCd()
        L_0x005b:
            boolean r0 = X.2PP.A00(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r6)
            com.instagram.model.reels.Reel r4 = r0.A0I(r9, r1)
            r4.A0Y(r2)
            X.1NN r0 = X.1NM.A00(r6)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324651546194122(0x810d14000030ca, double:3.035194133220127E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0092
            java.lang.Integer r1 = r9.A17
            java.util.List r0 = r9.A1j
            if (r0 == 0) goto L_0x008f
            int r0 = r0.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x008f:
            X.0qQ.A0K(r1, r8)
        L_0x0092:
            java.util.Map r0 = r11.A04
            r0.put(r5, r4)
            goto L_0x0023
        L_0x0098:
            r0 = r8
            goto L_0x005b
        L_0x009a:
            r1 = r8
            goto L_0x0047
        L_0x009c:
            java.util.Map r1 = r11.A04
            r1.keySet()
            X.3PS r0 = r11.A03
            r0.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5FM.DTw(X.1XR, X.1QW, X.2ZK):void");
    }

    public final void Den() {
        AnonymousClass3G6.A00(this.A01).A04(this.A02);
    }

    public AnonymousClass5FM(UserSession userSession, AnonymousClass49H r3, AnonymousClass3PS r4, Set set) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A05 = set;
        this.A03 = r4;
    }
}
