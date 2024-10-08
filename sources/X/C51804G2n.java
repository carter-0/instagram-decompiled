package X;

/* renamed from: X.G2n  reason: case insensitive filesystem */
public final class C51804G2n extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51804G2n(C67573Mq7 mq7, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = mq7;
        if (27 - i != 0) {
            this.A03 = str;
            this.A02 = str2;
        } else {
            this.A02 = str;
            this.A03 = str2;
        }
    }

    public static IllegalStateException A00(C51804G2n g2n) {
        return new IllegalStateException(002.A0R("Argument not found for ", g2n.A03));
    }

    public static AnonymousClass0eM A01(Object obj, String str, 0eO r3, int i) {
        return AnonymousClass0eN.A00(r3, new C51804G2n(obj, str, str, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03df, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0459, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0460, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x050b, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0037;
                case 2: goto L_0x004f;
                case 3: goto L_0x0067;
                case 4: goto L_0x007f;
                case 5: goto L_0x0097;
                case 6: goto L_0x00af;
                case 7: goto L_0x00c7;
                case 8: goto L_0x00df;
                case 9: goto L_0x00f7;
                case 10: goto L_0x010f;
                case 11: goto L_0x0127;
                case 12: goto L_0x013f;
                case 13: goto L_0x0157;
                case 14: goto L_0x016f;
                case 15: goto L_0x0187;
                case 16: goto L_0x019f;
                case 17: goto L_0x01b7;
                case 18: goto L_0x01cf;
                case 19: goto L_0x01e7;
                case 20: goto L_0x01ff;
                case 21: goto L_0x03e0;
                case 22: goto L_0x0217;
                case 23: goto L_0x022f;
                case 24: goto L_0x0438;
                case 25: goto L_0x0247;
                case 26: goto L_0x0449;
                case 27: goto L_0x04ae;
                case 28: goto L_0x04be;
                case 29: goto L_0x04d2;
                case 30: goto L_0x025f;
                case 31: goto L_0x0277;
                case 32: goto L_0x028f;
                case 33: goto L_0x02a7;
                case 34: goto L_0x02bf;
                case 35: goto L_0x02d7;
                case 36: goto L_0x02ef;
                case 37: goto L_0x0307;
                case 38: goto L_0x04e2;
                case 39: goto L_0x04ee;
                case 40: goto L_0x031f;
                case 41: goto L_0x0337;
                case 42: goto L_0x034f;
                case 43: goto L_0x0367;
                case 44: goto L_0x037f;
                case 45: goto L_0x0397;
                case 46: goto L_0x03af;
                case 47: goto L_0x03c7;
                case 48: goto L_0x04fa;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0e r0 = new X.G0e
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x001f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzi r0 = new X.Fzi
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0037:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzj r0 = new X.Fzj
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x004f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzk r0 = new X.Fzk
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0067:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzl r0 = new X.Fzl
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x007f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzm r0 = new X.Fzm
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0097:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzo r0 = new X.Fzo
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x00af:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzp r0 = new X.Fzp
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x00c7:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzq r0 = new X.Fzq
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x00df:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzr r0 = new X.Fzr
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x00f7:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzs r0 = new X.Fzs
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x010f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzt r0 = new X.Fzt
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0127:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzu r0 = new X.Fzu
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x013f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.Fzv r0 = new X.Fzv
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0157:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G00 r0 = new X.G00
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x016f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G01 r0 = new X.G01
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0187:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G02 r0 = new X.G02
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x019f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G03 r0 = new X.G03
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x01b7:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G04 r0 = new X.G04
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x01cf:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G05 r0 = new X.G05
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x01e7:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G06 r0 = new X.G06
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x01ff:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G07 r0 = new X.G07
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0217:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0E r0 = new X.G0E
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x022f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0F r0 = new X.G0F
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0247:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0J r0 = new X.G0J
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x025f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0L r0 = new X.G0L
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0277:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0M r0 = new X.G0M
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x028f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0N r0 = new X.G0N
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x02a7:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0O r0 = new X.G0O
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x02bf:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0P r0 = new X.G0P
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x02d7:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0Q r0 = new X.G0Q
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x02ef:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0R r0 = new X.G0R
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0307:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0S r0 = new X.G0S
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x031f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0V r0 = new X.G0V
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0337:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0W r0 = new X.G0W
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x034f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0X r0 = new X.G0X
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0367:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0Y r0 = new X.G0Y
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x037f:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0Z r0 = new X.G0Z
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x0397:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0a r0 = new X.G0a
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x03af:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0b r0 = new X.G0b
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x03c7:
            java.lang.Object r3 = r5.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r5.A02
            X.0eO r1 = X.0eO.A02
            X.G0c r0 = new X.G0c
            r0.<init>(r3, r2)
            java.lang.Object r0 = X.DbU.A0k(r1, r0)
            if (r0 != 0) goto L_0x03df
            java.lang.IllegalStateException r0 = A00(r5)
            throw r0
        L_0x03df:
            return r0
        L_0x03e0:
            java.lang.Object r3 = r5.A01
            X.7SQ r3 = (X.AnonymousClass7SQ) r3
            java.lang.String r2 = r5.A03
            java.lang.String r0 = r5.A02
            r9 = 0
            android.net.Uri r1 = X.DbT.A09(r0)
            java.lang.String r0 = "collection_id"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0509
            X.9H7 r4 = r3.A00
            android.content.Context r0 = r4.A02
            if (r0 != 0) goto L_0x03fe
            java.lang.String r0 = "context"
            goto L_0x0459
        L_0x03fe:
            android.content.Context r3 = r0.getApplicationContext()
            com.instagram.common.session.UserSession r5 = r4.A10
            X.3sy r0 = r4.A0b
            com.instagram.model.direct.DirectThreadKey r6 = X.C66647MaG.A03(r0)
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            java.util.List r10 = X.AnonymousClass7TE.A1I(r2)
            com.instagram.model.direct.messageid.MessageIdentifier r7 = new com.instagram.model.direct.messageid.MessageIdentifier
            r7.<init>(r1, r9)
            X.1NY r2 = X.C71151OeJ.A03(r5, r6, r7, r8, r9, r10)
            java.lang.Class<X.NHZ> r1 = X.NHZ.class
            java.lang.Class<X.OQJ> r0 = X.OQJ.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r0 = 42
            X.EDg r0 = X.C47697EDg.A00(r3, r0)
            r1.A00 = r0
            X.1ES.A03(r1)
            X.7H6 r0 = r4.A0D
            if (r0 != 0) goto L_0x0433
            java.lang.String r0 = "directAggregatedMediaViewerController"
            goto L_0x0459
        L_0x0433:
            r0.A0h()
            goto L_0x0509
        L_0x0438:
            java.lang.Object r1 = r5.A01
            X.MqG r1 = (X.C67582MqG) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.4AD r2 = r1.A0B
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r5.A03
            r2.DUV(r1, r0)
            goto L_0x0509
        L_0x0449:
            java.lang.String r2 = r5.A03
            if (r2 == 0) goto L_0x0509
            java.lang.Object r1 = r5.A01
            X.NKp r1 = (X.C68496NKp) r1
            java.lang.String r3 = r5.A02
            X.MfP r7 = r1.A02
            if (r7 != 0) goto L_0x0461
            java.lang.String r0 = "dailyPromptsLogger"
        L_0x0459:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0461:
            java.lang.String r8 = r1.A0C
            if (r8 != 0) goto L_0x0468
            java.lang.String r0 = "threadId"
            goto L_0x0459
        L_0x0468:
            com.instagram.model.direct.DirectThreadKey r0 = r1.A08
            if (r0 != 0) goto L_0x046f
            java.lang.String r0 = "threadKey"
            goto L_0x0459
        L_0x046f:
            java.lang.String r9 = r0.A01
            int r15 = r1.A00
            java.lang.String r6 = r1.A0D
            if (r6 != 0) goto L_0x047a
            java.lang.String r0 = "userType"
            goto L_0x0459
        L_0x047a:
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x04ab
            java.lang.String r4 = "ACTIVE"
        L_0x0480:
            java.lang.String r0 = "daily_prompt_status"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r0, r4)
            java.lang.String r0 = "user_type"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r0, r6)
            java.lang.String r0 = "daily_prompt_submission_id"
            java.util.LinkedHashMap r14 = X.DbY.A0q(r0, r3, r5, r4)
            java.lang.String r10 = "daily_prompt_response_reported"
            java.lang.String r11 = "tap"
            r0 = 1072(0x430, float:1.502E-42)
            java.lang.String r12 = X.C66579MXk.A00(r0)
            r0 = 289(0x121, float:4.05E-43)
            java.lang.String r13 = X.C66579MXk.A00(r0)
            X.C66930MfP.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.UzD r0 = X.C16677UzD.IGD_PROMPT_RESPONSE
            X.C68496NKp.A02(r1, r0, r2, r3)
            goto L_0x0509
        L_0x04ab:
            java.lang.String r4 = "ENDED"
            goto L_0x0480
        L_0x04ae:
            java.lang.Object r0 = r5.A01
            X.Mq7 r0 = (X.C67573Mq7) r0
            X.1QP r4 = r0.A01
            long r2 = r0.A00
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r5.A03
            r4.flowAnnotate(r2, r1, r0)
            goto L_0x0509
        L_0x04be:
            java.lang.Object r6 = r5.A01
            X.Mq7 r6 = (X.C67573Mq7) r6
            X.1QP r4 = r6.A01
            long r2 = r6.A00
            java.lang.String r1 = r5.A03
            java.lang.String r0 = r5.A02
            r4.flowEndFail(r2, r1, r0)
            r0 = 0
            r6.A00 = r0
            goto L_0x0509
        L_0x04d2:
            java.lang.Object r0 = r5.A01
            X.Mq7 r0 = (X.C67573Mq7) r0
            X.1QP r4 = r0.A01
            long r2 = r0.A00
            java.lang.String r1 = r5.A03
            java.lang.String r0 = r5.A02
            r4.flowMarkPoint(r2, r1, r0)
            goto L_0x0509
        L_0x04e2:
            java.lang.Object r2 = r5.A01
            X.RBs r2 = (X.C8834RBs) r2
            java.lang.String r1 = r5.A03
            java.lang.String r0 = r5.A02
            X.C51804G2n.super.A0p(r1, r0)
            goto L_0x0509
        L_0x04ee:
            java.lang.Object r2 = r5.A01
            X.RBs r2 = (X.C8834RBs) r2
            java.lang.String r1 = r5.A03
            java.lang.String r0 = r5.A02
            X.C51804G2n.super.A0q(r1, r0)
            goto L_0x0509
        L_0x04fa:
            java.lang.Object r0 = r5.A01
            X.GaS r0 = (X.C52654GaS) r0
            java.lang.String r2 = r5.A03
            java.lang.String r1 = r5.A02
            X.0sL r0 = r0.A04
            if (r0 == 0) goto L_0x0509
            r0.invoke(r2, r1)
        L_0x0509:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51804G2n.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51804G2n(Object obj, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }
}
