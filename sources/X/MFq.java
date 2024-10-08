package X;

import com.instagram.user.model.User;
import com.meta.metaai.imagine.service.ImagineNetworkService;

public final class MFq extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02 = 1;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFq(HMY hmy, ImagineNetworkService imagineNetworkService, Integer num, String str, String str2, String str3, AnonymousClass4D7 r8, boolean z) {
        super(2, r8);
        this.A04 = imagineNetworkService;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = hmy;
        this.A08 = z;
        this.A01 = num;
        this.A07 = str3;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.MFq, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d A[PHI: r0 
      PHI: (r0v1 X.1Hj) = (r0v2 X.1Hj), (r0v4 X.1Hj) binds: [B:19:0x006b, B:22:0x008b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r8 = r15
            r3 = r16
            int r0 = r15.A02
            if (r0 == 0) goto L_0x0014
            X.1Hj r0 = X.1Hj.A02
            int r2 = r15.A00
            r1 = 1
            if (r2 == 0) goto L_0x006e
            if (r2 != r1) goto L_0x008e
            X.0eS.A00(r3)
        L_0x0013:
            return r3
        L_0x0014:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r15.A00
            r2 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r4) goto L_0x004b
            java.lang.Object r0 = r15.A01
            X.0eS.A00(r3)
            return r0
        L_0x0024:
            X.0eS.A00(r3)
            java.lang.Object r1 = r15.A04
            X.KWS r1 = (X.KWS) r1
            com.instagram.common.session.UserSession r9 = r1.A00
            java.lang.Object r1 = r15.A03
            java.lang.String r10 = X.DbS.A0q(r1)
            boolean r14 = r15.A08
            java.lang.String r11 = r15.A05
            java.lang.String r12 = r15.A07
            java.lang.String r13 = r15.A06
            X.1OC r3 = X.C49177Eqi.A00(r9, r10, r11, r12, r13, r14)
            r15.A00 = r4
            r1 = 1387110682(0x52ada11a, float:3.72866089E11)
            java.lang.Object r3 = r3.A00(r1, r15)
            if (r3 != r0) goto L_0x004e
            return r0
        L_0x004b:
            X.0eS.A00(r3)
        L_0x004e:
            boolean r1 = r3 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0013
            X.12T r1 = X.AnonymousClass12T.A00
            X.4CZ r1 = r1.A04
            java.lang.Object r11 = r15.A03
            boolean r14 = r15.A08
            java.lang.Object r10 = r15.A04
            r12 = 0
            r13 = 3
            X.JTc r9 = new X.JTc
            r9.<init>(r10, r11, r12, r13, r14)
            r15.A01 = r3
            r15.A00 = r2
            java.lang.Object r1 = X.1Eo.A00(r15, r1, r9)
            if (r1 == r0) goto L_0x008d
            return r3
        L_0x006e:
            X.0eS.A00(r3)
            java.lang.Object r3 = r15.A04
            com.meta.metaai.imagine.service.ImagineNetworkService r3 = (com.meta.metaai.imagine.service.ImagineNetworkService) r3
            java.lang.String r5 = r15.A06
            java.lang.String r6 = r15.A05
            java.lang.Object r2 = r15.A03
            X.HMY r2 = (X.HMY) r2
            boolean r9 = r15.A08
            java.lang.Object r4 = r15.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r7 = r15.A07
            r15.A00 = r1
            java.lang.Object r3 = com.meta.metaai.imagine.service.ImagineNetworkService.A02(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r0) goto L_0x0013
        L_0x008d:
            return r0
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.MFq, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.MFq, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        AnonymousClass4D7 r8 = r12;
        if (this.A02 != 0) {
            String str = this.A06;
            String str2 = this.A05;
            return new MFq((HMY) this.A03, (ImagineNetworkService) this.A04, (Integer) this.A01, str, str2, this.A07, r8, this.A08);
        }
        return new MFq((KWS) this.A04, (User) this.A03, this.A05, this.A07, this.A06, r12, this.A08);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFq) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFq(KWS kws, User user, String str, String str2, String str3, AnonymousClass4D7 r7, boolean z) {
        super(2, r7);
        this.A04 = kws;
        this.A03 = user;
        this.A08 = z;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
    }
}
