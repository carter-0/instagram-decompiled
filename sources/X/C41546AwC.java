package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.AwC  reason: case insensitive filesystem */
public final class C41546AwC extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41546AwC(Activity activity, UserSession userSession, String str, AnonymousClass4D7 r5, C262224Cq r6, boolean z) {
        super(2, r5);
        this.A04 = r6;
        this.A07 = z;
        this.A06 = str;
        this.A03 = activity;
        this.A05 = userSession;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.AwC, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        AnonymousClass4D7 r5 = r10;
        if (this.A02 != 0) {
            boolean z = this.A07;
            String str = this.A06;
            return new C41546AwC((Activity) this.A03, (UserSession) this.A05, str, r5, (C262224Cq) this.A04, z);
        }
        boolean z2 = this.A07;
        String str2 = this.A06;
        return new C41546AwC((I12) this.A03, (C362088hK) this.A04, (C351818An) this.A01, str2, r5, (0sP) this.A05, z2);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.AwC, java.lang.Object, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            int r0 = r15.A02
            if (r0 == 0) goto L_0x0090
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 2
            r7 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0046
            if (r0 == r7) goto L_0x0076
            X.0eS.A00(r3)
        L_0x0014:
            boolean r0 = X.AnonymousClass7TE.A1a(r3)
            if (r0 == 0) goto L_0x002f
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x0032
            java.lang.String r11 = r15.A06
            java.lang.Object r7 = r15.A03
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r10 = r15.A05
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            X.28D r9 = X.28D.A11
            java.lang.String r12 = "push_notification_tap"
            X.AnonymousClass90V.A00(r7, r8, r9, r10, r11, r12)
        L_0x002f:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0032:
            java.lang.Object r7 = r15.A03
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r10 = r15.A05
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.String r13 = r15.A06
            X.28D r9 = X.28D.A11
            X.50r r11 = X.C2801950r.CLIPS
            r14 = 0
            r12 = r8
            X.C243473Yx.A03(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002f
        L_0x0046:
            X.0eS.A00(r3)
            java.lang.Object r5 = r15.A04
            X.4Cq r5 = (X.C262224Cq) r5
            java.lang.Object r10 = r15.A03
            java.lang.Object r11 = r15.A05
            java.lang.String r12 = r15.A06
            r14 = 44
            X.MGk r9 = new X.MGk
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            X.19B r4 = X.19B.A00
            X.2Q8 r3 = X.1Eo.A02(r4, r9, r5)
            r1 = 7
            X.IlT r0 = new X.IlT
            r0.<init>(r11, r12, r8, r1)
            X.2Q8 r1 = X.1Eo.A02(r4, r0, r5)
            r15.A01 = r1
            r15.A00 = r7
            java.lang.Object r3 = r3.A0E(r15)
            if (r3 != r2) goto L_0x007d
            return r2
        L_0x0076:
            java.lang.Object r1 = r15.A01
            X.2Q9 r1 = (X.AnonymousClass2Q9) r1
            X.0eS.A00(r3)
        L_0x007d:
            boolean r0 = X.AnonymousClass7TE.A1a(r3)
            if (r0 == 0) goto L_0x002f
            r15.A01 = r8
            r15.A00 = r6
            X.4Cp r1 = (X.C262214Cp) r1
            java.lang.Object r3 = r1.A0E(r15)
            if (r3 != r2) goto L_0x0014
            return r2
        L_0x0090:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 2
            r6 = 1
            r9 = 0
            if (r0 == 0) goto L_0x009f
            if (r0 == r6) goto L_0x00c2
            X.0eS.A00(r3)
            goto L_0x002f
        L_0x009f:
            X.0eS.A00(r3)
            java.lang.Object r7 = r15.A03
            if (r7 == 0) goto L_0x00c8
            java.lang.Object r4 = r15.A01
            r15.A00 = r6
            X.12T r3 = X.AnonymousClass12T.A00
            r1 = 1293268845(0x4d15b76d, float:1.56989136E8)
            r0 = 3
            X.0nV r3 = r3.AOJ(r1, r0)
            r1 = 8
            X.MGX r0 = new X.MGX
            r0.<init>(r7, r4, r9, r1)
            java.lang.Object r3 = X.1Eo.A00(r15, r3, r0)
            if (r3 != r2) goto L_0x00c5
            return r2
        L_0x00c2:
            X.0eS.A00(r3)
        L_0x00c5:
            r9 = r3
            X.8Cl r9 = (X.C352218Cl) r9
        L_0x00c8:
            boolean r0 = r15.A07
            java.lang.String r8 = "quickCaptureState"
            if (r0 == 0) goto L_0x00f6
            if (r9 == 0) goto L_0x00e2
            java.lang.Object r0 = r15.A01
            X.8An r0 = (X.C351818An) r0
            java.lang.String r3 = r15.A06
            X.80U r1 = r0.A04
            if (r1 == 0) goto L_0x0114
            X.8Tk r0 = new X.8Tk
            r0.<init>(r9, r3)
            r1.E3H(r0)
        L_0x00e2:
            java.lang.Object r0 = r15.A01
            X.8An r0 = (X.C351818An) r0
            X.C351818An.A03(r0, r6)
            java.lang.Object r0 = r15.A05
            X.0sP r0 = (X.0sP) r0
            r15.A00 = r5
            java.lang.Object r0 = r0.invoke(r15)
            if (r0 != r2) goto L_0x002f
            return r2
        L_0x00f6:
            if (r9 == 0) goto L_0x00e2
            java.lang.Object r7 = r15.A01
            X.8An r7 = (X.C351818An) r7
            java.lang.String r4 = r15.A06
            java.lang.Object r3 = r15.A04
            X.8hK r3 = (X.C362088hK) r3
            X.80U r1 = r7.A04
            if (r1 == 0) goto L_0x0114
            X.8Tj r0 = new X.8Tj
            r0.<init>(r3, r9, r4)
            r1.E3H(r0)
            X.8W6 r0 = r7.A01
            if (r0 != 0) goto L_0x011c
            java.lang.String r8 = "cameraCaptureDelegate"
        L_0x0114:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x011c:
            r0.A05(r9)
            X.8BA r0 = r7.A00
            if (r0 != 0) goto L_0x0126
            java.lang.String r8 = "delegate"
            goto L_0x0114
        L_0x0126:
            X.8ME r0 = X.AnonymousClass7TF.A0M(r0)
            java.lang.Class<X.9q0> r4 = X.C389669q0.class
            X.7w8 r3 = X.AnonymousClass8ME.A07(r0, r4)
            r1 = 0
            if (r3 == 0) goto L_0x00e2
            boolean r0 = r3.A0E(r4)
            if (r0 != r6) goto L_0x00e2
            java.util.ArrayList r0 = r3.A06(r4)
            java.lang.Object r0 = r0.get(r1)
            X.9q0 r0 = (X.C389669q0) r0
            r0.Euc()
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41546AwC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C41546AwC) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41546AwC(I12 i12, C362088hK r3, C351818An r4, String str, AnonymousClass4D7 r6, 0sP r7, boolean z) {
        super(2, r6);
        this.A03 = i12;
        this.A07 = z;
        this.A01 = r4;
        this.A05 = r7;
        this.A06 = str;
        this.A04 = r3;
    }
}
