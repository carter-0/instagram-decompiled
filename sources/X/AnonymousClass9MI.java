package X;

/* renamed from: X.9MI  reason: invalid class name */
public final class AnonymousClass9MI extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MI(AnonymousClass0eM r2, AnonymousClass0eM r3, AnonymousClass0eM r4, int i) {
        super(0);
        this.A00 = i;
        switch (i) {
            case 9:
            case 10:
            case 11:
                this.A02 = r2;
                this.A01 = r3;
                this.A03 = r4;
                break;
            case 17:
                this.A02 = r2;
                this.A03 = r3;
                this.A01 = r4;
                break;
            default:
                this.A01 = r2;
                this.A03 = r3;
                this.A02 = r4;
                break;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0243, code lost:
        if (X.AnonymousClass3eZ.A01(r5, r3, false) != false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0287, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02a8, code lost:
        if (X.182.A06(X.0Tu.A05, (X.0lg) r11.A03, 36324333718614024L) == false) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02aa, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02af, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0825;
                case 1: goto L_0x07ec;
                case 2: goto L_0x07b9;
                case 3: goto L_0x0780;
                case 4: goto L_0x0747;
                case 5: goto L_0x0713;
                case 6: goto L_0x06df;
                case 7: goto L_0x06ab;
                case 8: goto L_0x0677;
                case 9: goto L_0x0651;
                case 10: goto L_0x062b;
                case 11: goto L_0x0605;
                case 12: goto L_0x05dd;
                case 13: goto L_0x05b5;
                case 14: goto L_0x058d;
                case 15: goto L_0x0565;
                case 16: goto L_0x050c;
                case 17: goto L_0x04e8;
                case 18: goto L_0x04c4;
                case 19: goto L_0x0488;
                case 20: goto L_0x044f;
                case 21: goto L_0x0415;
                case 22: goto L_0x03d9;
                case 23: goto L_0x039f;
                case 24: goto L_0x0365;
                case 25: goto L_0x032c;
                case 26: goto L_0x02f3;
                case 27: goto L_0x02cc;
                case 28: goto L_0x02b0;
                case 29: goto L_0x0288;
                case 30: goto L_0x0262;
                case 31: goto L_0x0246;
                case 32: goto L_0x021d;
                case 33: goto L_0x0027;
                case 34: goto L_0x0200;
                case 35: goto L_0x01df;
                case 36: goto L_0x01ce;
                case 37: goto L_0x01b7;
                case 38: goto L_0x019c;
                case 39: goto L_0x0181;
                case 40: goto L_0x0166;
                case 41: goto L_0x014a;
                case 42: goto L_0x0127;
                case 43: goto L_0x00fd;
                case 44: goto L_0x00e4;
                case 45: goto L_0x00aa;
                case 46: goto L_0x0091;
                case 47: goto L_0x0078;
                case 48: goto L_0x0059;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A02
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0i
            java.lang.Object r4 = r0.getValue()
            X.3YK r4 = (X.AnonymousClass3YK) r4
            java.lang.Object r3 = r11.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r0 = r11.A03
            X.33W r0 = (X.AnonymousClass33W) r0
            android.content.Context r2 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A02
            X.3YL r0 = new X.3YL
            r0.<init>(r2, r1)
            X.9IE r5 = r4.A00(r3, r0)
        L_0x0026:
            return r5
        L_0x0027:
            java.lang.Object r4 = r11.A02
            X.4Fw r4 = (X.C262754Fw) r4
            java.lang.Object r3 = r11.A01
            X.0iw r3 = (X.AnonymousClass0iw) r3
            java.lang.Object r0 = r11.A03
            X.3TC r0 = (X.AnonymousClass3TC) r0
            com.instagram.common.session.UserSession r2 = r0.A02
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.1Xj r1 = r4.A0D
            X.3W1 r0 = r4.A0G
            int r0 = r0.A02
            X.1Xj r0 = r1.A1c(r0)
            if (r0 != 0) goto L_0x004a
            r0 = r1
        L_0x004a:
            r5 = 0
            boolean r0 = X.C243193Xt.A05(r3, r2, r0, r1, r5)
            if (r0 == 0) goto L_0x0026
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L_0x0059:
            java.lang.Object r0 = r11.A02
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0V
            java.lang.Object r2 = r0.getValue()
            X.GV6 r2 = (X.GV6) r2
            java.lang.Object r1 = r11.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r11.A03
            X.33W r0 = (X.AnonymousClass33W) r0
            X.310 r0 = r0.A03
            X.41J r0 = r0.BQP()
            X.TsG r5 = r2.A00(r0, r1)
            return r5
        L_0x0078:
            java.lang.Object r4 = r11.A03
            X.33W r4 = (X.AnonymousClass33W) r4
            java.lang.Object r3 = r11.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r11.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            java.lang.String r1 = r3.getId()
            com.instagram.common.typedurl.ImageUrl r0 = r3.A1Q()
            X.3YB r5 = r4.A02(r0, r3, r2, r1)
            return r5
        L_0x0091:
            java.lang.Object r0 = r11.A03
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0Y
            java.lang.Object r2 = r0.getValue()
            X.A8e r2 = (X.C39764A8e) r2
            java.lang.Object r1 = r11.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r11.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.JwK r5 = r2.A00(r1, r0)
            return r5
        L_0x00aa:
            java.lang.Object r0 = r11.A03
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0I
            java.lang.Object r6 = r0.getValue()
            java.lang.Object r5 = r11.A01
            java.lang.Object r1 = r11.A02
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            r0 = 29
            X.Inr r4 = new X.Inr
            r4.<init>(r0, r6, r5)
            r0 = 30
            X.Inz r3 = new X.Inz
            r3.<init>(r0, r5, r6, r1)
            r0 = 31
            X.Inz r2 = new X.Inz
            r2.<init>(r0, r5, r6, r1)
            r0 = 43
            X.JwM r1 = new X.JwM
            r1.<init>((X.C62320sa) r4, (X.C62320sa) r3, (X.C62320sa) r2, (int) r0)
            r0 = 12
            X.9IE r5 = new X.9IE
            r5.<init>((java.lang.Object) r1, (int) r0)
            return r5
        L_0x00e4:
            java.lang.Object r0 = r11.A03
            X.33Z r0 = (X.AnonymousClass33Z) r0
            X.0eM r0 = r0.A0J
            java.lang.Object r2 = r0.getValue()
            X.Hqr r2 = (X.C55986Hqr) r2
            java.lang.Object r1 = r11.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r11.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.Jvv r5 = r2.A00(r1, r0)
            return r5
        L_0x00fd:
            java.lang.Object r0 = r11.A03
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0108
            r0.invoke()
            goto L_0x0285
        L_0x0108:
            java.lang.Object r0 = r11.A01
            X.5Oz r0 = (X.C284945Oz) r0
            java.lang.Object r2 = r0.getValue()
            X.4ch r2 = (X.C268064ch) r2
            if (r2 == 0) goto L_0x0285
            java.lang.Object r1 = r11.A02
            X.0sP r1 = (X.0sP) r1
            boolean r0 = r2.COx()
            if (r0 == 0) goto L_0x0285
            X.5VN r0 = X.C289425dZ.A00(r2)
            r1.invoke(r0)
            goto L_0x0285
        L_0x0127:
            java.lang.Object r0 = r11.A03
            X.3Yc r0 = (X.C243273Yc) r0
            X.3Yb r0 = r0.A01
            X.324 r4 = r0.BQk()
            java.lang.Object r3 = r11.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r11.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            int r1 = r2.getPosition()
            X.324 r0 = r0.BQk()
            X.JQg r0 = r0.CBn()
            r4.DgX(r3, r2, r0, r1)
            goto L_0x0285
        L_0x014a:
            java.lang.Object r0 = r11.A03
            X.3Yc r0 = (X.C243273Yc) r0
            X.3Yb r0 = r0.A01
            X.3vK r4 = r0.BRA()
            java.lang.Object r3 = r11.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r11.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            int r1 = r2.getPosition()
            r0 = 0
            r4.D4g(r3, r2, r1, r0)
            goto L_0x0285
        L_0x0166:
            java.lang.Object r0 = r11.A03
            X.3Yc r0 = (X.C243273Yc) r0
            X.3Yb r0 = r0.A01
            X.41G r3 = r0.BRE()
            java.lang.Object r2 = r11.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r11.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            int r0 = r1.getPosition()
            r3.DQy(r2, r1, r0)
            goto L_0x0285
        L_0x0181:
            java.lang.Object r0 = r11.A03
            X.3Yc r0 = (X.C243273Yc) r0
            X.3Yb r0 = r0.A01
            X.41G r3 = r0.BRE()
            java.lang.Object r2 = r11.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r11.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            int r0 = r1.getPosition()
            r3.Dji(r2, r1, r0)
            goto L_0x0285
        L_0x019c:
            java.lang.Object r0 = r11.A03
            X.3Yc r0 = (X.C243273Yc) r0
            X.3Yb r0 = r0.A01
            X.324 r3 = r0.BQk()
            java.lang.Object r2 = r11.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r11.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            int r0 = r1.getPosition()
            r3.DgZ(r2, r1, r0)
            goto L_0x0285
        L_0x01b7:
            java.lang.Object r2 = r11.A01
            X.3YT r2 = (X.AnonymousClass3YT) r2
            java.lang.Object r0 = r11.A03
            X.5Es r0 = (X.C282785Es) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            java.lang.Object r0 = r11.A02
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r2.Et2(r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x01ce:
            java.lang.Object r2 = r11.A01
            X.3YT r2 = (X.AnonymousClass3YT) r2
            java.lang.Object r1 = r11.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r11.A03
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            java.util.List r5 = r2.Bqk(r1, r0)
            return r5
        L_0x01df:
            java.lang.Object r0 = r11.A02
            X.4WX r0 = (X.AnonymousClass4WX) r0
            X.9Ig r0 = r0.A03
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r11.A01
            X.2Wb r0 = (X.2Wb) r0
            android.content.Context r1 = X.C243803a8.A00(r0)
            java.lang.Object r0 = r11.A03
            X.5e6 r0 = (X.C289725e6) r0
            boolean r0 = r0.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r5 = r2.invoke(r1, r0)
            return r5
        L_0x0200:
            java.lang.Object r0 = r11.A03
            X.4y4 r0 = (X.C279094y4) r0
            X.0eM r0 = r0.A04
            java.lang.Object r2 = r0.getValue()
            X.4Jd r2 = (X.AnonymousClass4Jd) r2
            java.lang.Object r1 = r11.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r11.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r0 = r0.getModuleName()
            X.9IB r5 = r2.A00(r1, r0)
            return r5
        L_0x021d:
            java.lang.Object r0 = r11.A03
            X.4nl r0 = (X.C274134nl) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.3eZ r4 = X.C246413eY.A00(r5)
            java.lang.Object r3 = r11.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r11.A02
            X.0iw r2 = (X.AnonymousClass0iw) r2
            r1 = 0
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            boolean r0 = r4.A02(r2, r3, r3)
            if (r0 == 0) goto L_0x02aa
            boolean r0 = X.AnonymousClass3eZ.A01(r5, r3, r1)
            r1 = 1
            if (r0 == 0) goto L_0x02ab
            goto L_0x02aa
        L_0x0246:
            java.lang.Object r3 = r11.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r11.A03
            X.7Mo r0 = (X.C330387Mo) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.Object r1 = r11.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.OLB r5 = new X.OLB
            r5.<init>(r3, r1, r2)
            return r5
        L_0x0262:
            java.lang.Object r2 = r11.A01
            X.37D r2 = (X.AnonymousClass37D) r2
            java.lang.Object r0 = r11.A02
            X.B2B r0 = (X.B2B) r0
            X.OIA r1 = r0.AcR()
            X.7I2 r0 = r1.A06
            r2.A0P(r0)
            java.lang.Object r3 = r11.A03
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.Integer r4 = r1.A07
            r7 = 1
            r5 = 255(0xff, float:3.57E-43)
            r6 = r5
            r2.A0N(r3, r4, r5, r6, r7)
            X.7Sa r0 = r1.A03
            r0.A02()
        L_0x0285:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0288:
            java.lang.Object r2 = r11.A01
            X.9HW r2 = (X.AnonymousClass9HW) r2
            java.lang.Object r1 = r11.A02
            X.3t2 r1 = (X.C254783t2) r1
            r0 = 55
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x02aa
            java.lang.Object r3 = r11.A03
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324333718614024(0x810cca00003008, double:3.034993137778684E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x02ab
        L_0x02aa:
            r1 = 0
        L_0x02ab:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L_0x02b0:
            java.lang.Object r1 = r11.A03
            X.0lg r1 = (X.0lg) r1
            java.lang.Class<com.facebook.msys.mci.AccountSession> r0 = com.facebook.msys.mci.AccountSession.class
            r1.A03(r0)
            java.lang.Class<com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession> r0 = com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession.class
            r1.A03(r0)
            java.lang.Object r0 = r11.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x02ca
            r0.run()
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x02ca:
            r5 = 0
            return r5
        L_0x02cc:
            java.lang.Object r1 = r11.A03
            X.7P7 r1 = (X.AnonymousClass7P7) r1
            X.7Wl r3 = r1.A08
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.768 r2 = (X.AnonymousClass768) r2
            X.9HC r0 = r1.A09
            X.PAz r1 = new X.PAz
            r1.<init>(r3, r0, r2)
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.7DR r0 = (X.AnonymousClass7DR) r0
            X.NY3 r5 = new X.NY3
            r5.<init>(r0, r1)
            return r5
        L_0x02f3:
            java.lang.Object r2 = r11.A03
            X.7P7 r2 = (X.AnonymousClass7P7) r2
            com.instagram.common.session.UserSession r6 = r2.A07
            X.7Wl r5 = r2.A08
            X.9HC r4 = r2.A09
            java.lang.Object r1 = r11.A02
            X.7ZX r1 = (X.AnonymousClass7ZX) r1
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.7BA r3 = (X.AnonymousClass7BA) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder>"
            X.0qQ.A0C(r3, r0)
            X.0iw r2 = r2.A06
            r0 = 3
            X.0qQ.A0B(r1, r0)
            r0 = 4
            X.0qQ.A0B(r3, r0)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            X.PB5 r1 = X.C395159zJ.A00(r6, r5, r1, r4)
            X.PAl r0 = X.C395119zF.A00(r2, r6, r5, r4)
            X.NZ6 r5 = new X.NZ6
            r5.<init>(r3, r1, r0)
            return r5
        L_0x032c:
            java.lang.Object r1 = r11.A03
            X.7P7 r1 = (X.AnonymousClass7P7) r1
            com.instagram.common.session.UserSession r6 = r1.A07
            X.7Wl r5 = r1.A08
            java.lang.Object r4 = r11.A02
            X.7ZX r4 = (X.AnonymousClass7ZX) r4
            X.9HC r3 = r1.A09
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r2, r0)
            X.0iw r1 = r1.A06
            r0 = 2
            X.0qQ.A0B(r4, r0)
            r0 = 4
            X.0qQ.A0B(r2, r0)
            r0 = 5
            X.0qQ.A0B(r1, r0)
            X.PB5 r1 = X.C395159zJ.A00(r6, r5, r4, r3)
            X.PB5 r0 = X.C395159zJ.A00(r6, r5, r4, r3)
            X.NZ7 r5 = new X.NZ7
            r5.<init>(r2, r1, r0)
            return r5
        L_0x0365:
            java.lang.Object r2 = r11.A03
            X.7P7 r2 = (X.AnonymousClass7P7) r2
            com.instagram.common.session.UserSession r6 = r2.A07
            X.7Wl r5 = r2.A08
            X.9HC r4 = r2.A09
            java.lang.Object r1 = r11.A02
            X.7ZX r1 = (X.AnonymousClass7ZX) r1
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.7BA r3 = (X.AnonymousClass7BA) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visualthumbnail.VisualThumbnailContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r3, r0)
            X.0iw r2 = r2.A06
            r0 = 3
            X.0qQ.A0B(r1, r0)
            r0 = 4
            X.0qQ.A0B(r3, r0)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            X.PB5 r1 = X.C395159zJ.A00(r6, r5, r1, r4)
            X.7RY r0 = new X.7RY
            r0.<init>(r2, r6, r5, r4)
            X.NZB r5 = new X.NZB
            r5.<init>(r3, r1, r0)
            return r5
        L_0x039f:
            java.lang.Object r2 = r11.A03
            X.7P7 r2 = (X.AnonymousClass7P7) r2
            com.instagram.common.session.UserSession r6 = r2.A07
            X.7Wl r5 = r2.A08
            X.9HC r4 = r2.A09
            java.lang.Object r1 = r11.A02
            X.7ZX r1 = (X.AnonymousClass7ZX) r1
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.7BA r3 = (X.AnonymousClass7BA) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.visual.VisualContentViewHolder>"
            X.0qQ.A0C(r3, r0)
            X.0iw r2 = r2.A06
            r0 = 3
            X.0qQ.A0B(r1, r0)
            r0 = 4
            X.0qQ.A0B(r3, r0)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            X.PB5 r1 = X.C395159zJ.A00(r6, r5, r1, r4)
            X.7RW r0 = new X.7RW
            r0.<init>(r2, r6, r5, r4)
            X.NZA r5 = new X.NZA
            r5.<init>(r3, r1, r0)
            return r5
        L_0x03d9:
            java.lang.Object r3 = r11.A03
            X.7P7 r3 = (X.AnonymousClass7P7) r3
            android.content.Context r4 = r3.A04
            com.instagram.common.session.UserSession r6 = r3.A07
            X.7Wl r7 = r3.A08
            X.9HC r8 = r3.A09
            java.lang.Object r2 = r11.A02
            X.7ZX r2 = (X.AnonymousClass7ZX) r2
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.7BA r1 = (X.AnonymousClass7BA) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.media.MediaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r1, r0)
            X.0iw r5 = r3.A06
            r0 = 4
            X.0qQ.A0B(r2, r0)
            r0 = 5
            X.0qQ.A0B(r1, r0)
            r0 = 6
            X.0qQ.A0B(r5, r0)
            X.PB5 r0 = X.C395159zJ.A00(r6, r7, r2, r8)
            X.77K r3 = new X.77K
            r3.<init>(r4, r5, r6, r7, r8)
            X.NZ8 r5 = new X.NZ8
            r5.<init>(r1, r0, r3)
            return r5
        L_0x0415:
            java.lang.Object r1 = r11.A03
            X.7P7 r1 = (X.AnonymousClass7P7) r1
            com.instagram.common.session.UserSession r6 = r1.A07
            X.7Wl r5 = r1.A08
            X.9HC r4 = r1.A09
            java.lang.Object r3 = r11.A02
            X.7ZX r3 = (X.AnonymousClass7ZX) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.quotedreply.expandabletext.ExpandableTextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r2, r0)
            X.0iw r1 = r1.A06
            r0 = 3
            X.0qQ.A0B(r3, r0)
            r0 = 4
            X.0qQ.A0B(r2, r0)
            r0 = 5
            X.0qQ.A0B(r1, r0)
            X.PB5 r1 = X.C395159zJ.A00(r6, r5, r3, r4)
            X.749 r0 = new X.749
            r0.<init>(r6, r5, r4)
            X.NZ9 r5 = new X.NZ9
            r5.<init>(r2, r1, r0)
            return r5
        L_0x044f:
            java.lang.Object r1 = r11.A03
            X.7P7 r1 = (X.AnonymousClass7P7) r1
            com.instagram.common.session.UserSession r6 = r1.A07
            X.7Wl r5 = r1.A08
            java.lang.Object r4 = r11.A02
            X.7ZX r4 = (X.AnonymousClass7ZX) r4
            X.9HC r3 = r1.A09
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r2, r0)
            X.0iw r1 = r1.A06
            r0 = 2
            X.0qQ.A0B(r4, r0)
            r0 = 4
            X.0qQ.A0B(r2, r0)
            r0 = 5
            X.0qQ.A0B(r1, r0)
            X.PAl r1 = X.C395119zF.A00(r1, r6, r5, r3)
            X.PB5 r0 = X.C395159zJ.A00(r6, r5, r4, r3)
            X.NZ0 r5 = new X.NZ0
            r5.<init>(r2, r1, r0)
            return r5
        L_0x0488:
            java.lang.Object r1 = r11.A03
            X.7P7 r1 = (X.AnonymousClass7P7) r1
            com.instagram.common.session.UserSession r4 = r1.A07
            X.7Wl r5 = r1.A08
            X.9HC r6 = r1.A09
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r2, r0)
            X.0iw r1 = r1.A06
            java.lang.Object r7 = r11.A02
            X.7Pg r7 = (X.C331037Pg) r7
            r8 = 0
            r0 = 3
            X.0qQ.A0B(r2, r0)
            r0 = 4
            X.0qQ.A0B(r1, r0)
            r0 = 5
            X.0qQ.A0B(r7, r0)
            X.PAl r0 = X.C395119zF.A00(r1, r4, r5, r6)
            X.74o r3 = new X.74o
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.NZ5 r5 = new X.NZ5
            r5.<init>(r2, r0, r3)
            return r5
        L_0x04c4:
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.PAl r2 = (X.C72554PAl) r2
            java.lang.Object r0 = r11.A03
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.78H r1 = (X.AnonymousClass78H) r1
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.7BA r0 = (X.AnonymousClass7BA) r0
            X.NZd r5 = new X.NZd
            r5.<init>(r0, r2, r1)
            return r5
        L_0x04e8:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.PB5 r2 = (X.PB5) r2
            java.lang.Object r0 = r11.A03
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.78H r1 = (X.AnonymousClass78H) r1
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.7BA r0 = (X.AnonymousClass7BA) r0
            X.NZe r5 = new X.NZe
            r5.<init>(r0, r2, r1)
            return r5
        L_0x050c:
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            com.instagram.common.session.UserSession r5 = r0.A07
            X.7Wl r6 = r0.A08
            X.9HC r7 = r0.A09
            X.0iw r3 = r0.A06
            java.lang.Object r8 = r11.A02
            X.7Pg r8 = (X.C331037Pg) r8
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.notesxma.NotesXmaContentViewHolder>"
            X.0qQ.A0C(r2, r0)
            r9 = 0
            r4 = 1
            r0 = 3
            X.0qQ.A0B(r3, r0)
            r0 = 4
            X.0qQ.A0B(r8, r0)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            X.74P r1 = new X.74P
            r1.<init>(r6, r4, r9, r9)
            X.7DX r0 = new X.7DX
            r0.<init>(r6)
            X.77l r1 = X.C3259074q.A00(r0, r1, r6, r7)
            X.74o r4 = new X.74o
            r10 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.PBJ r0 = new X.PBJ
            r0.<init>(r6)
            X.7DY[] r0 = new X.AnonymousClass7DY[]{r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            X.Olp r0 = new X.Olp
            r0.<init>(r1, r3)
            X.NYv r5 = new X.NYv
            r5.<init>(r2, r4, r0)
            return r5
        L_0x0565:
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r5 = r0.A08
            X.9HC r4 = r0.A09
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.78H r3 = (X.AnonymousClass78H) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.Class<X.NaB> r1 = X.C68874NaB.class
            X.768 r0 = X.AnonymousClass768.A00(r5, r4)
            X.7Ro r5 = new X.7Ro
            r5.<init>(r2, r3, r0, r1)
            return r5
        L_0x058d:
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r5 = r0.A08
            X.9HC r4 = r0.A09
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.78H r3 = (X.AnonymousClass78H) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.Class<X.7Rm> r1 = X.C331567Rm.class
            X.768 r0 = X.AnonymousClass768.A00(r5, r4)
            X.7Ro r5 = new X.7Ro
            r5.<init>(r2, r3, r0, r1)
            return r5
        L_0x05b5:
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r5 = r0.A08
            X.9HC r4 = r0.A09
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.78H r3 = (X.AnonymousClass78H) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.Class<X.NaD> r1 = X.C68876NaD.class
            X.768 r0 = X.AnonymousClass768.A00(r5, r4)
            X.7Ro r5 = new X.7Ro
            r5.<init>(r2, r3, r0, r1)
            return r5
        L_0x05dd:
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r5 = r0.A08
            X.9HC r4 = r0.A09
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.78H r3 = (X.AnonymousClass78H) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.Class<X.NaC> r1 = X.C68875NaC.class
            X.768 r0 = X.AnonymousClass768.A00(r5, r4)
            X.7Ro r5 = new X.7Ro
            r5.<init>(r2, r3, r0, r1)
            return r5
        L_0x0605:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.78H r3 = (X.AnonymousClass78H) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7DR r2 = (X.AnonymousClass7DR) r2
            java.lang.Class<X.9oi> r1 = X.C388989oi.class
            java.lang.Object r0 = r11.A03
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.78D r0 = (X.AnonymousClass78D) r0
            X.75O r5 = new X.75O
            r5.<init>(r2, r0, r3, r1)
            return r5
        L_0x062b:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.78H r3 = (X.AnonymousClass78H) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7DR r2 = (X.AnonymousClass7DR) r2
            java.lang.Class<X.75M> r1 = X.AnonymousClass75M.class
            java.lang.Object r0 = r11.A03
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.78D r0 = (X.AnonymousClass78D) r0
            X.75O r5 = new X.75O
            r5.<init>(r2, r0, r3, r1)
            return r5
        L_0x0651:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.78H r3 = (X.AnonymousClass78H) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7DR r2 = (X.AnonymousClass7DR) r2
            java.lang.Class<X.75R> r1 = X.AnonymousClass75R.class
            java.lang.Object r0 = r11.A03
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.78D r0 = (X.AnonymousClass78D) r0
            X.75O r5 = new X.75O
            r5.<init>(r2, r0, r3, r1)
            return r5
        L_0x0677:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.74o r3 = (X.C3258874o) r3
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r1 = r0.A08
            X.9HC r0 = r0.A09
            X.75T r2 = new X.75T
            r2.<init>(r1, r0)
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.7BA r1 = (X.AnonymousClass7BA) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.voice.VoiceContentViewHolder<com.instagram.direct.messagethread.environment.composite.DirectItemEnvironment>, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>"
            X.0qQ.A0C(r1, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.NYm r5 = new X.NYm
            r5.<init>(r1, r3, r2)
            return r5
        L_0x06ab:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.PAd r3 = (X.C72546PAd) r3
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r1 = r0.A08
            X.9HC r0 = r0.A09
            X.75T r2 = new X.75T
            r2.<init>(r1, r0)
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.7BA r1 = (X.AnonymousClass7BA) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.selfiereaction.SelfieReactionContentViewHolder<com.instagram.direct.messagethread.environment.composite.DirectItemEnvironment>, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>"
            X.0qQ.A0C(r1, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.NYk r5 = new X.NYk
            r5.<init>(r1, r3, r2)
            return r5
        L_0x06df:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.PB3 r3 = (X.PB3) r3
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r1 = r0.A08
            X.9HC r0 = r0.A09
            X.PAX r2 = new X.PAX
            r2.<init>(r1, r0)
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.7BA r1 = (X.AnonymousClass7BA) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.stickerreaction.StickerReactionContentViewHolder, com.instagram.direct.messagethread.placeholder.PlaceholderContentViewHolder>"
            X.0qQ.A0C(r1, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.9oX r5 = new X.9oX
            r5.<init>(r1, r3, r2)
            return r5
        L_0x0713:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.PB3 r3 = (X.PB3) r3
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r1 = r0.A08
            X.9HC r0 = r0.A09
            X.75T r2 = new X.75T
            r2.<init>(r1, r0)
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.7BA r1 = (X.AnonymousClass7BA) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.stickerreaction.StickerReactionContentViewHolder, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>"
            X.0qQ.A0C(r1, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.NYl r5 = new X.NYl
            r5.<init>(r1, r3, r2)
            return r5
        L_0x0747:
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.PAl r3 = (X.C72554PAl) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentDefinition<com.instagram.direct.messagethread.interaction.ItemInteractionListener>"
            X.0qQ.A0C(r3, r0)
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r1 = r0.A08
            X.9HC r0 = r0.A09
            X.75T r2 = new X.75T
            r2.<init>(r1, r0)
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.7BA r1 = (X.AnonymousClass7BA) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.animatedsticker.AnimatedStickerContentViewHolder, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>"
            X.0qQ.A0C(r1, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.NYg r5 = new X.NYg
            r5.<init>(r1, r3, r2)
            return r5
        L_0x0780:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.PB5 r3 = (X.PB5) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.gif.GifContentDefinition<com.instagram.direct.messagethread.interaction.ItemInteractionListener>"
            X.0qQ.A0C(r3, r0)
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r1 = r0.A08
            X.9HC r0 = r0.A09
            X.75T r2 = new X.75T
            r2.<init>(r1, r0)
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.7BA r1 = (X.AnonymousClass7BA) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.expiredplaceholder.ExpiredPlaceholderContentViewHolder>"
            X.0qQ.A0C(r1, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.NYi r5 = new X.NYi
            r5.<init>(r1, r3, r2)
            return r5
        L_0x07b9:
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r4 = r0.getValue()
            X.PAj r4 = (X.C72552PAj) r4
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.7BA r3 = (X.AnonymousClass7BA) r3
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.replytoauthor.ReplyToAuthorContentViewHolder>"
            X.0qQ.A0C(r3, r0)
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r2 = r0.A08
            X.9HC r1 = r0.A09
            r0 = 1
            X.0qQ.A0B(r4, r0)
            r0 = 2
            X.0qQ.A0B(r3, r0)
            X.768 r0 = X.AnonymousClass768.A00(r2, r1)
            X.NZf r5 = new X.NZf
            r5.<init>(r3, r0, r4)
            return r5
        L_0x07ec:
            java.lang.Object r1 = r11.A03
            X.7P7 r1 = (X.AnonymousClass7P7) r1
            com.instagram.common.session.UserSession r6 = r1.A07
            X.7Wl r5 = r1.A08
            X.9HC r4 = r1.A09
            java.lang.Object r3 = r11.A02
            X.7ZX r3 = (X.AnonymousClass7ZX) r3
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r2 = r0.getValue()
            X.7BA r2 = (X.AnonymousClass7BA) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.text.TextContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>"
            X.0qQ.A0C(r2, r0)
            X.0iw r1 = r1.A06
            r0 = 3
            X.0qQ.A0B(r3, r0)
            r0 = 4
            X.0qQ.A0B(r2, r0)
            r0 = 5
            X.0qQ.A0B(r1, r0)
            X.768 r1 = X.AnonymousClass768.A00(r5, r4)
            X.PB5 r0 = X.C395159zJ.A00(r6, r5, r3, r4)
            X.NZN r5 = new X.NZN
            r5.<init>(r2, r1, r0)
            return r5
        L_0x0825:
            java.lang.Object r0 = r11.A03
            X.7P7 r0 = (X.AnonymousClass7P7) r0
            X.7Wl r4 = r0.A08
            X.9HC r5 = r0.A09
            X.0iw r1 = r0.A06
            com.instagram.common.session.UserSession r2 = r0.A07
            java.lang.Object r0 = r11.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r6 = r0.getValue()
            X.P8b r6 = (X.C72492P8b) r6
            java.lang.Object r0 = r11.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r3 = r0.getValue()
            X.7DR r3 = (X.AnonymousClass7DR) r3
            X.NYE r5 = X.NYE.A00(r1, r2, r3, r4, r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MI.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MI(AnonymousClass7P7 r2, AnonymousClass0eM r3, AnonymousClass0eM r4, int i) {
        super(0);
        this.A00 = i;
        this.A03 = r2;
        switch (i) {
            case 0:
            case 4:
                this.A01 = r3;
                this.A02 = r4;
                break;
            default:
                this.A02 = r3;
                this.A01 = r4;
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MI(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }
}
