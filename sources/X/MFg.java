package X;

import com.instagram.common.session.UserSession;

public final class MFg extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFg(UserSession userSession, String str, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A02 = 0;
        this.A04 = userSession;
        this.A05 = str;
        this.A03 = i;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MFg, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MFg, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        Object obj2;
        String str;
        int i;
        Object obj3;
        int i2;
        AnonymousClass4D7 r7 = r12;
        switch (this.A02) {
            case 0:
                ? mFg = new MFg((UserSession) this.A04, this.A05, r12, this.A03);
                mFg.A01 = obj;
                return mFg;
            case 1:
                obj2 = this.A01;
                str = this.A05;
                i = this.A03;
                obj3 = this.A04;
                i2 = 1;
                break;
            default:
                obj2 = this.A01;
                str = this.A05;
                i = this.A03;
                obj3 = this.A04;
                i2 = 2;
                break;
        }
        return new MFg(obj2, obj3, str, r7, i, i2);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.MFg, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        if (r0 != r5) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ca, code lost:
        X.0eS.A00(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cf, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A02
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x004f;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1Hj r5 = X.1Hj.A02
            int r0 = r13.A00
            r4 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r4) goto L_0x01ca
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0013:
            X.0eS.A00(r14)
            java.lang.Object r0 = r13.A01
            X.GCB r0 = (X.GCB) r0
            X.3oV r0 = r0.A00
            if (r0 == 0) goto L_0x01cd
            android.view.View r6 = r0.getView()
            com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView r6 = (com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView) r6
            if (r6 == 0) goto L_0x01cd
            java.lang.String r0 = r13.A05
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.L6z r3 = new X.L6z
            r3.<init>(r0)
            int r0 = r13.A03
            r3.A00 = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0 = 10
            long r0 = r2.toNanos(r0)
            r3.A01 = r0
            java.lang.Object r2 = r13.A04
            r1 = 4
            X.Lw2 r0 = new X.Lw2
            r0.<init>(r2, r1)
            r13.A00 = r4
            java.lang.Object r0 = r6.A00(r3, r0, r13)
            goto L_0x00d7
        L_0x004f:
            X.1Hj r5 = X.1Hj.A02
            int r0 = r13.A00
            r4 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r4) goto L_0x0074
            X.0eS.A00(r14)
        L_0x005b:
            return r14
        L_0x005c:
            X.0eS.A00(r14)
            java.lang.Object r3 = r13.A01
            com.meta.metaai.imagine.service.ImagineNetworkService r3 = (com.meta.metaai.imagine.service.ImagineNetworkService) r3
            java.lang.String r2 = r13.A05
            int r1 = r13.A03
            java.lang.Object r0 = r13.A04
            X.HMY r0 = (X.HMY) r0
            r13.A00 = r4
            java.lang.Object r14 = com.meta.metaai.imagine.service.ImagineNetworkService.A03(r0, r3, r2, r13, r1)
            if (r14 != r5) goto L_0x005b
            return r5
        L_0x0074:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0079:
            X.1Hj r5 = X.1Hj.A02
            int r0 = r13.A00
            r4 = 4
            r6 = 3
            r8 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0188
            if (r0 != r12) goto L_0x01ca
            java.lang.Object r0 = r13.A01
            X.02o r3 = X.JTO.A1H(r0, r14)
        L_0x008b:
            X.3Ii r14 = (X.C239803Ii) r14
            boolean r0 = r14 instanceof X.C239793Ih
            r2 = 0
            if (r0 == 0) goto L_0x00e7
            X.3Ih r14 = (X.C239793Ih) r14
            java.lang.Object r0 = r14.A00
            X.K12 r0 = (X.K12) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r11 = X.00k.A0J(r0)
            X.3HX r11 = (X.AnonymousClass3HX) r11
        L_0x00a2:
            java.lang.Object r10 = r13.A04
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            int r9 = r13.A03
            r7 = 0
            if (r11 == 0) goto L_0x00ac
            r12 = 0
        L_0x00ac:
            X.0qQ.A0B(r10, r7)
            X.02m r4 = X.02m.A0p
            r1 = 17629205(0x10d0015, float:2.589767E-38)
            java.lang.String r0 = "is_empty_effect_stories"
            r4.markerAnnotate(r1, r9, r0, r12)
            r4.markerEnd(r1, r9, r8)
            if (r11 == 0) goto L_0x00da
            X.1OP r0 = X.1OP.$redex_init_class
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r10)
            X.0qQ.A07(r0)
            com.instagram.model.reels.Reel r0 = r0.A0I(r11, r7)
            X.3Ih r0 = X.C41845B3m.A0d(r0)
            r13.A01 = r2
            r13.A00 = r8
        L_0x00d3:
            java.lang.Object r0 = r3.emit(r0, r13)
        L_0x00d7:
            if (r0 != r5) goto L_0x01cd
            return r5
        L_0x00da:
            X.LL9 r0 = X.LL9.A00
            X.5sO r0 = X.C41845B3m.A0c(r0)
            r13.A01 = r2
            r13.A00 = r6
            goto L_0x00d3
        L_0x00e5:
            r11 = 0
            goto L_0x00a2
        L_0x00e7:
            boolean r0 = r14 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01c5
            X.5sO r14 = (X.C297815sO) r14
            java.lang.Object r1 = r14.A00
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.ar.features.effectinfo.effectstories.models.EffectStoriesResponse>"
            X.0qQ.A0C(r1, r0)
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r0 = r1.A00
            X.4do r1 = new X.4do
            r1.<init>(r0)
        L_0x0101:
            boolean r0 = r1 instanceof X.C268674do
            r9 = 0
            if (r0 == 0) goto L_0x014f
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r1 = r1.A00
            X.1XT r1 = (X.AnonymousClass1XT) r1
            if (r1 == 0) goto L_0x016e
            int r0 = r1.getStatusCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r1.getErrorMessage()
        L_0x011a:
            if (r1 == 0) goto L_0x0122
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r9 = X.0mp.A04(r1, r0)
        L_0x0122:
            java.lang.Object r1 = r13.A04
            int r10 = r13.A03
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.02m r8 = X.02m.A0p
            r7 = 17629205(0x10d0015, float:2.589767E-38)
            if (r9 == 0) goto L_0x0136
            java.lang.String r0 = "failure_reason"
            r8.markerAnnotate(r7, r10, r0, r9)
        L_0x0136:
            if (r11 == 0) goto L_0x0141
            int r1 = r11.intValue()
            java.lang.String r0 = "failure_code"
            r8.markerAnnotate(r7, r10, r0, r1)
        L_0x0141:
            r8.markerEnd(r7, r10, r6)
            X.LL9 r0 = X.LL9.A00
            X.5sO r0 = X.C41845B3m.A0c(r0)
            r13.A01 = r2
            r13.A00 = r4
            goto L_0x00d3
        L_0x014f:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x01bb
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r1 = r1.A00
            boolean r0 = r1 instanceof X.AnonymousClass7BR
            if (r0 != 0) goto L_0x016e
            boolean r0 = r1 instanceof X.C69248NiA
            if (r0 == 0) goto L_0x0168
            X.NiA r1 = (X.C69248NiA) r1
            int r0 = r1.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            goto L_0x0122
        L_0x0168:
            java.lang.String r1 = r1.getMessage()
            r11 = r2
            goto L_0x011a
        L_0x016e:
            r11 = r2
            goto L_0x0122
        L_0x0170:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 == 0) goto L_0x01c0
            r0 = 22
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.4dn r1 = (X.C268664dn) r1
            java.lang.Throwable r0 = r1.A00
            X.4dn r1 = new X.4dn
            r1.<init>(r0)
            goto L_0x0101
        L_0x0188:
            X.0eS.A00(r14)
            java.lang.Object r3 = r13.A01
            X.02o r3 = (X.02o) r3
            java.lang.Object r0 = r13.A04
            X.0lg r0 = (X.0lg) r0
            java.lang.String r1 = r13.A05
            boolean r7 = X.DbW.A1S(r12, r0, r1)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "creatives/single_effect_stories/"
            r2.A0A(r0)
            java.lang.String r0 = "effect_id"
            r2.A9m(r0, r1)
            java.lang.Class<X.K12> r1 = X.K12.class
            java.lang.Class<X.LHG> r0 = X.LHG.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r13.A01 = r3
            r13.A00 = r12
            r0 = -5
            java.lang.Object r14 = r1.A02(r13, r0, r6, r7)
            if (r14 != r5) goto L_0x008b
            return r5
        L_0x01bb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01c0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01c5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01ca:
            X.0eS.A00(r14)
        L_0x01cd:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFg) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFg(Object obj, Object obj2, String str, AnonymousClass4D7 r5, int i, int i2) {
        super(2, r5);
        this.A02 = i2;
        this.A01 = obj;
        this.A05 = str;
        this.A03 = i;
        this.A04 = obj2;
    }
}
