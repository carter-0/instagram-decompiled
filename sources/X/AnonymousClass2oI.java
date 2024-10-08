package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2oI  reason: invalid class name */
public final class AnonymousClass2oI {
    public final AnonymousClass0iw A00;
    public final C249763kK A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03 = new AnonymousClass2oJ(this);
    public final C229812oL A04;
    public final Set A05 = new LinkedHashSet();

    public AnonymousClass2oI(AnonymousClass0iw r2, UserSession userSession, C249763kK r4) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 2);
        this.A02 = userSession;
        this.A01 = r4;
        this.A00 = r2;
        this.A04 = AnonymousClass2oK.A00(userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass3O9 r18, java.util.Map r19, int r20) {
        /*
            r17 = this;
            r12 = r18
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.String r0 = r12.getId()
            java.lang.String r10 = "Required value was null."
            r13 = r17
            if (r0 == 0) goto L_0x016d
            java.util.Set r1 = r13.A05
            java.lang.String r0 = r12.getId()
            if (r0 == 0) goto L_0x017d
            boolean r0 = r1.add(r0)
            if (r0 != 0) goto L_0x016d
            java.lang.String r11 = "instagram_netego_sub_impression"
        L_0x0020:
            X.2oL r2 = r13.A04
            java.lang.String r1 = r12.getId()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A02(r0, r1)
            X.0iw r0 = r13.A00
            X.0xI r9 = X.0xI.A00(r0, r11)
            boolean r8 = r12 instanceof X.AnonymousClass5j1
            if (r8 == 0) goto L_0x0163
            r0 = 533(0x215, float:7.47E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
        L_0x003b:
            java.lang.String r1 = r12.getId()
            java.lang.String r0 = "id"
            r9.A0C(r0, r1)
            java.lang.String r1 = r12.getId()
            java.lang.String r0 = "netego_id"
            r9.A0C(r0, r1)
            java.lang.String r1 = r12.C9L()
            java.lang.String r0 = "tracking_token"
            r9.A0C(r0, r1)
            java.lang.String r0 = "type"
            r9.A0C(r0, r2)
            java.lang.Integer r7 = r12.BVp()
            java.lang.String r0 = "netego_subtype"
            r9.A08(r7, r0)
            java.lang.String r0 = "position"
            r14 = r20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9.A08(r1, r0)
            java.lang.String r0 = "m_ix"
            r9.A08(r1, r0)
            X.3kK r0 = r13.A01
            r16 = r0
            java.lang.String r3 = r16.getSessionId()
            r2 = 21
            r1 = 10
            r0 = 84
            java.lang.String r0 = X.Dbf.A02(r2, r1, r0)
            r9.A0C(r0, r3)
            boolean r6 = r12 instanceof X.1Xl
            if (r6 == 0) goto L_0x00a3
            r0 = r12
            X.1Xl r0 = (X.1Xl) r0
            X.1Xj r0 = r0.BPf()
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0177
            java.lang.String r1 = X.C292995jr.A03(r0)
            java.lang.String r0 = "media_id"
            r9.A0C(r0, r1)
        L_0x00a3:
            r15 = r19
            r9.A0F(r15)
            X.3Bb r5 = X.C238233Bb.A02
            X.0qQ.A07(r5)
            X.4ai r4 = X.C267004ai.AD
            int r0 = r5.A00(r4, r14)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "gap_to_last_ad"
            r9.A0C(r0, r1)
            X.4ai r3 = X.C267004ai.NETEGO
            int r0 = r5.A00(r3, r14)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "gap_to_last_netego"
            r9.A0C(r0, r1)
            X.4DU r2 = r13.A03
            r0 = 0
            X.3sc r1 = new X.3sc
            r1.<init>(r0, r2, r11)
            if (r8 == 0) goto L_0x014b
            r0 = 533(0x215, float:7.47E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x00db:
            X.0jB r8 = new X.0jB
            r8.<init>()
            r8.A0D(r15)
            java.lang.String r11 = r12.getId()
            r1.A5d = r11
            java.lang.String r11 = r12.getId()
            r1.A66 = r11
            r1.A32 = r7
            java.lang.String r7 = r12.C9L()
            r1.A7J = r7
            r1.A7M = r0
            r1.A09(r14)
            java.lang.String r0 = r16.getSessionId()
            r1.A6t = r0
            r1.A0E(r8)
            int r0 = r5.A00(r4, r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0Q(r0)
            int r0 = r5.A00(r3, r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0S(r0)
            if (r6 == 0) goto L_0x012f
            X.1Xl r12 = (X.1Xl) r12
            X.1Xj r0 = r12.BPf()
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = X.C292995jr.A03(r0)
            r1.A5u = r0
        L_0x012f:
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0139
            r1.A65 = r0
        L_0x0139:
            com.instagram.common.session.UserSession r3 = r13.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = X.C271764jY.A00(r3, r1, r2, r0)
            if (r0 != 0) goto L_0x014a
            X.0xN r0 = X.C60510iO.A00(r3)
            r0.EHF(r9)
        L_0x014a:
            return
        L_0x014b:
            boolean r0 = r12 instanceof X.C270464gm
            if (r0 == 0) goto L_0x015e
            r0 = r12
            X.4gm r0 = (X.C270464gm) r0
            java.lang.String r0 = r0.A07
            if (r0 != 0) goto L_0x00db
            X.1UQ r0 = X.1UQ.A0A
        L_0x0158:
            java.lang.String r0 = r0.toString()
            goto L_0x00db
        L_0x015e:
            X.1UQ r0 = r12.B5J()
            goto L_0x0158
        L_0x0163:
            X.1UQ r0 = r12.B5J()
            java.lang.String r2 = r0.toString()
            goto L_0x003b
        L_0x016d:
            java.lang.String r11 = "instagram_netego_impression"
            goto L_0x0020
        L_0x0171:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0177:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x017d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2oI.A00(X.3O9, java.util.Map, int):void");
    }
}
