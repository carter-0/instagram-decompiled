package X;

/* renamed from: X.Ivx  reason: case insensitive filesystem */
public final class C58688Ivx extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58688Ivx(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C58688Ivx A00(Object obj, Object obj2, int i) {
        return new C58688Ivx(i, obj, obj2);
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [X.ARK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x047b, code lost:
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r1.FIG(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x021e, code lost:
        r1.invoke(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0227, code lost:
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0229, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0257, code lost:
        r2.A0E(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0247;
                case 1: goto L_0x022e;
                case 2: goto L_0x0223;
                case 3: goto L_0x0217;
                case 4: goto L_0x056a;
                case 5: goto L_0x020c;
                case 6: goto L_0x01a1;
                case 7: goto L_0x04ed;
                case 8: goto L_0x0199;
                case 9: goto L_0x0489;
                case 10: goto L_0x0187;
                case 11: goto L_0x0451;
                case 12: goto L_0x042b;
                case 13: goto L_0x03fb;
                case 14: goto L_0x0145;
                case 15: goto L_0x012a;
                case 16: goto L_0x0110;
                case 17: goto L_0x00fd;
                case 18: goto L_0x0366;
                case 19: goto L_0x0318;
                case 20: goto L_0x00ef;
                case 21: goto L_0x00ef;
                case 22: goto L_0x02e0;
                case 23: goto L_0x00e1;
                case 24: goto L_0x00cd;
                case 25: goto L_0x02c5;
                case 26: goto L_0x02a8;
                case 27: goto L_0x0297;
                case 28: goto L_0x00bd;
                case 29: goto L_0x0007;
                case 30: goto L_0x0007;
                case 31: goto L_0x0007;
                case 32: goto L_0x0007;
                case 33: goto L_0x027d;
                case 34: goto L_0x026a;
                case 35: goto L_0x0223;
                case 36: goto L_0x00ac;
                case 37: goto L_0x009b;
                case 38: goto L_0x0070;
                case 39: goto L_0x058e;
                case 40: goto L_0x005a;
                case 41: goto L_0x004a;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x0035;
                case 45: goto L_0x0035;
                case 46: goto L_0x0035;
                case 47: goto L_0x025c;
                case 48: goto L_0x0016;
                case 49: goto L_0x0016;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r3.A02
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            r0.dismiss()
        L_0x0013:
            X.0gF r10 = X.C60340gF.A00
        L_0x0015:
            return r10
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0022
            java.lang.Object r10 = r0.invoke()
            if (r10 != 0) goto L_0x0015
        L_0x0022:
            java.lang.Object r0 = r3.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0590
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0590
            X.2YQ r10 = r1.getDefaultViewModelCreationExtras()
            return r10
        L_0x0035:
            java.lang.Object r1 = r3.A01
            X.3jv r1 = (X.C249523jv) r1
            java.lang.Object r0 = r3.A02
            goto L_0x0046
        L_0x003c:
            java.lang.Object r1 = r3.A01
            X.3jv r1 = (X.C249523jv) r1
            java.lang.Object r0 = r3.A02
            X.ILu r0 = (X.C57028ILu) r0
            java.util.List r0 = r0.A00
        L_0x0046:
            r1.FIG(r0)
            goto L_0x0013
        L_0x004a:
            java.lang.Object r0 = r3.A02
            X.Hoz r0 = (X.C55878Hoz) r0
            X.2nF r2 = r0.A04
            java.lang.String r1 = r0.A07
            java.lang.Object r0 = r3.A01
            X.ILu r0 = (X.C57028ILu) r0
            r2.A05(r0, r1)
            goto L_0x0013
        L_0x005a:
            java.lang.Object r0 = r3.A02
            X.GVT r0 = (X.GVT) r0
            X.1Y8 r2 = X.C55115HcO.A00()
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A0o
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r2.A05(r1, r0)
            goto L_0x0013
        L_0x0070:
            java.lang.Object r0 = r3.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            r0.A02()
            java.lang.CharSequence r0 = r0.A00()
            java.lang.String r0 = X.DbV.A12(r0)
            java.lang.Object r4 = r3.A02
            X.Gw9 r4 = (X.C53903Gw9) r4
            r3 = 1
            r10 = 0
            X.0sK r2 = r4.A05
            if (r2 == 0) goto L_0x0015
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0099
            X.HtT r0 = r4.A00
            java.lang.String r0 = r0.A06
        L_0x0093:
            X.C51967G9n.A1N(r0, r10, r2, r3)
            X.0gF r10 = X.C60340gF.A00
            return r10
        L_0x0099:
            r3 = 0
            goto L_0x0093
        L_0x009b:
            java.lang.Object r2 = r3.A02
            X.2Wa r2 = (X.2Wa) r2
            java.lang.Object r1 = r3.A01
            r0 = 13
            X.J6f r0 = X.C59097J6f.A01(r1, r0)
            r2.A03(r0)
            goto L_0x0013
        L_0x00ac:
            java.lang.Object r0 = r3.A02
            X.Gte r0 = (X.C53749Gte) r0
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r1 = r0.A00
            java.lang.Object r0 = r3.A01
            X.HtT r0 = (X.C56141HtT) r0
            java.lang.String r0 = r0.A06
            r1.A0A(r0)
            goto L_0x0013
        L_0x00bd:
            java.lang.Object r2 = r3.A02
            X.Gtc r2 = (X.C53747Gtc) r2
            X.0sL r1 = r2.A01
            java.lang.Object r0 = r3.A01
            X.Hsc r0 = (X.C56089Hsc) r0
            X.HMN r0 = r0.A01
            X.Hsu r2 = r2.A00
            goto L_0x021e
        L_0x00cd:
            java.lang.Object r2 = r3.A02
            X.HtS r2 = (X.C56140HtS) r2
            X.F3q r1 = r2.A02
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            r1.A04(r0)
            X.01W r0 = r2.A04
            r0.A0T()
            goto L_0x0013
        L_0x00e1:
            java.lang.Object r0 = r3.A01
            X.DbS.A1U(r0)
            java.lang.Object r1 = r3.A02
            X.HtS r1 = (X.C56140HtS) r1
            r0 = 0
            r1.A00 = r0
            goto L_0x0013
        L_0x00ef:
            java.lang.Object r0 = r3.A01
            X.I1u r0 = (X.I1u) r0
            X.0sP r1 = r0.A06
            java.lang.Object r0 = r3.A02
            X.GsN r0 = (X.C53670GsN) r0
            X.HtS r0 = r0.A01
            goto L_0x0229
        L_0x00fd:
            java.lang.Object r0 = r3.A02
            X.Gst r0 = (X.C53702Gst) r0
            X.GgN r2 = r0.A01
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.C52970GgN.A03(r2, r1)
            goto L_0x0013
        L_0x0110:
            java.lang.Object r4 = r3.A01
            X.2Wb r4 = (X.2Wb) r4
            android.content.Context r2 = X.C243803a8.A00(r4)
            java.lang.Object r0 = r3.A02
            X.Gst r0 = (X.C53702Gst) r0
            com.meta.foa.session.FoaUserSession r1 = r0.A00
            r0 = 2131966026(0x7f13384a, float:1.9568878E38)
            java.lang.String r0 = X.C244013aV.A0E(r4, r0)
            X.C250563lf.A0T(r2, r1, r0)
            goto L_0x0013
        L_0x012a:
            java.lang.Object r2 = r3.A01
            X.Hpr r2 = (X.C55929Hpr) r2
            int r1 = r2.A00
            r0 = 0
            if (r1 != r0) goto L_0x0140
            java.lang.Object r0 = r3.A02
            X.Gvy r0 = (X.C53893Gvy) r0
            X.GgN r1 = r0.A01
            X.HIR r0 = X.HIR.A00
            r1.A0F(r0)
            goto L_0x0013
        L_0x0140:
            r2.A00()
            goto L_0x0013
        L_0x0145:
            java.lang.Object r0 = r3.A01
            X.2Wb r0 = (X.2Wb) r0
            android.content.Context r3 = X.C243803a8.A00(r0)
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 != 0) goto L_0x015e
            android.app.Activity r3 = X.C70782Va.A00(r3)
            if (r3 != 0) goto L_0x015e
            java.lang.String r0 = "Unable to find activity with context"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x015e:
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "package:"
            java.lang.String r0 = X.002.A0R(r0, r1)
            android.net.Uri r2 = X.DbT.A09(r0)
            r0 = 31
            java.lang.String r0 = X.Pxd.A00(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r1.setData(r2)
            X.0b6 r0 = X.0b6.A00()
            X.0R8 r0 = r0.A04()
            r0.A0G(r3, r1)
            goto L_0x0013
        L_0x0187:
            java.lang.Object r0 = r3.A01
            X.HtB r0 = (X.C56123HtB) r0
            if (r0 == 0) goto L_0x0013
            java.lang.String r2 = r0.A01
            java.lang.Object r1 = r3.A02
            X.GgP r1 = (X.C52972GgP) r1
            r0 = 0
            X.C52972GgP.A05(r1, r0, r0, r2, r0)
            goto L_0x0013
        L_0x0199:
            java.lang.Object r0 = r3.A02
            X.Gss r0 = (X.C53701Gss) r0
            X.0sP r1 = r0.A01
            goto L_0x0227
        L_0x01a1:
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r3.A02
            X.GwI r6 = (X.C53912GwI) r6
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
            r5 = 0
        L_0x01b2:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r4 = r9.next()
            int r8 = r5 + 1
            if (r5 >= 0) goto L_0x01c8
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01c8:
            X.I1k r4 = (X.C56556I1k) r4
            java.lang.Integer r7 = r4.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2 = 0
            if (r7 != r0) goto L_0x01fc
            java.lang.Integer r1 = r6.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x01fc
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01f1
            X.HtY r3 = r4.A01
            boolean r0 = r6.A03
            r1 = 1
            if (r0 == 0) goto L_0x01f1
            if (r3 == 0) goto L_0x01f1
            java.lang.String r0 = r3.A04
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 != r1) goto L_0x01f1
            r0 = 5
            X.J6n r2 = X.C59105J6n.A02(r6, r0)
        L_0x01f1:
            X.Imm r1 = new X.Imm
            r1.<init>(r6)
            X.GtZ r0 = new X.GtZ
            r0.<init>(r4, r2, r1, r5)
            r2 = r0
        L_0x01fc:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r1 = X.AnonymousClass7TF.A1W(r7, r0)
            X.HHf r0 = new X.HHf
            r0.<init>(r2, r4, r5, r1)
            r10.add(r0)
            r5 = r8
            goto L_0x01b2
        L_0x020c:
            java.lang.Object r0 = r3.A02
            X.GtZ r0 = (X.C53744GtZ) r0
            X.0sL r1 = r0.A03
            X.I1k r0 = r0.A01
            java.lang.Object r2 = r3.A01
            goto L_0x021e
        L_0x0217:
            java.lang.Object r1 = r3.A02
            X.0sL r1 = (X.0sL) r1
            java.lang.Object r0 = r3.A01
            r2 = 0
        L_0x021e:
            r1.invoke(r0, r2)
            goto L_0x0013
        L_0x0223:
            java.lang.Object r1 = r3.A02
            X.0sP r1 = (X.0sP) r1
        L_0x0227:
            java.lang.Object r0 = r3.A01
        L_0x0229:
            r1.invoke(r0)
            goto L_0x0013
        L_0x022e:
            java.lang.Object r0 = r3.A02
            X.GuQ r0 = (X.C53797GuQ) r0
            X.GgI r2 = r0.A00
            java.lang.Object r0 = r3.A01
            X.HtY r0 = (X.C56146HtY) r0
            java.lang.String r6 = r0.A04
            java.lang.String r7 = r0.A0A
            java.lang.Integer r4 = r0.A02
            java.lang.Integer r5 = r0.A01
            r8 = 1
            X.HHz r3 = new X.HHz
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0257
        L_0x0247:
            java.lang.Object r0 = r3.A02
            X.GuQ r0 = (X.C53797GuQ) r0
            X.GgI r2 = r0.A00
            java.lang.Object r1 = r3.A01
            X.Hsu r1 = (X.C56107Hsu) r1
            r0 = 1
            X.HHu r3 = new X.HHu
            r3.<init>(r1, r0)
        L_0x0257:
            r2.A0E(r3)
            goto L_0x0013
        L_0x025c:
            java.lang.Object r1 = r3.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r3.A01
            com.instagram.api.schemas.MusicPageTabType r0 = (com.instagram.api.schemas.MusicPageTabType) r0
            X.GLN r10 = new X.GLN
            r10.<init>(r0, r1)
            return r10
        L_0x026a:
            java.lang.Object r4 = r3.A01
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            java.lang.Object r0 = r3.A02
            X.GvL r0 = (X.C53854GvL) r0
            X.HNN r2 = r0.A00
            java.lang.Integer r1 = r0.A02
            X.HNN r0 = r0.A01
            android.graphics.drawable.Drawable r10 = X.I61.A04(r4, r2, r0, r1)
            return r10
        L_0x027d:
            java.lang.Object r4 = r3.A01
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            java.lang.Object r0 = r3.A02
            X.Gsz r0 = (X.C53708Gsz) r0
            X.HNN r2 = r0.A00
            X.HNO r0 = X.HNO.A0g
            int r0 = X.I61.A00(r4, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            android.graphics.drawable.Drawable r10 = X.I61.A04(r4, r2, r0, r1)
            return r10
        L_0x0297:
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.A02
            X.Hrm r0 = (X.C56039Hrm) r0
            X.F3q r0 = r0.A00()
            java.lang.Object r10 = r1.invoke(r0)
            return r10
        L_0x02a8:
            java.lang.Object r0 = r3.A01
            X.I4X r0 = (X.I4X) r0
            X.0sa r0 = r0.A05
            r2 = 1
            if (r0 == 0) goto L_0x02b7
            boolean r2 = X.C51971G9r.A1b(r0)
            goto L_0x0477
        L_0x02b7:
            java.lang.Object r0 = r3.A02
            X.I0l r0 = (X.C56536I0l) r0
            r1 = 0
            X.HtS r0 = r0.A00
            if (r0 == 0) goto L_0x0477
            r0.A02(r1)
            goto L_0x0477
        L_0x02c5:
            java.lang.Object r0 = r3.A01
            X.I4X r0 = (X.I4X) r0
            X.0sa r0 = r0.A05
            if (r0 == 0) goto L_0x02d6
            boolean r0 = X.C51971G9r.A1b(r0)
        L_0x02d1:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            return r10
        L_0x02d6:
            java.lang.Object r1 = r3.A02
            X.HtS r1 = (X.C56140HtS) r1
            r0 = 0
            r1.A02(r0)
            r0 = 1
            goto L_0x02d1
        L_0x02e0:
            java.lang.Object r0 = r3.A02
            X.Gsx r0 = (X.C53706Gsx) r0
            X.HtS r0 = r0.A00
            X.F3q r4 = r0.A02
            java.lang.Object r2 = r3.A01
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L_0x030d
            X.G9A r0 = r4.A00
            if (r0 == 0) goto L_0x0306
            r0.ETe(r2)
            X.3dj r10 = X.C58243Iom.A00()
            return r10
        L_0x0306:
            java.lang.String r0 = "Must be attached to a fragment to update background!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x030d:
            java.lang.String r1 = "This function operates on Views and must run on the main thread, but it is running on "
            java.lang.String r0 = r0.getName()
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r0)
            throw r0
        L_0x0318:
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2 = 1120403456(0x42c80000, float:100.0)
            r1 = 0
            X.9JQ r0 = X.C51965G9l.A0b(r0, r2, r1)
            r8 = 0
            X.2WX r7 = X.C51974G9v.A0D(r8, r0, r2, r1)
            java.lang.Object r6 = r3.A02
            X.Guj r6 = (X.C53816Guj) r6
            java.lang.Object r5 = r3.A01
            X.3Y5 r5 = (X.AnonymousClass3Y5) r5
            X.0sP r0 = r6.A04
            java.lang.String r4 = r6.A01
            if (r4 == 0) goto L_0x0359
            java.lang.String r3 = r6.A02
            if (r3 == 0) goto L_0x0359
            X.2Wb r2 = X.C51973G9u.A0K(r5)
            r0 = 43
            X.J6n r1 = X.C59105J6n.A02(r6, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.2WX r1 = X.C51971G9r.A0Z(r7, r0, r1, r8)
            X.Gwk r0 = new X.Gwk
            r0.<init>(r1, r4, r3)
            r2.A00(r0)
            X.3mp r0 = r6.A00
            X.2Tp r10 = X.C51967G9n.A0Q(r0, r2, r5, r7)
            return r10
        L_0x0359:
            if (r0 == 0) goto L_0x0360
            java.lang.Object r10 = r0.invoke(r7)
            return r10
        L_0x0360:
            X.3XA r10 = new X.3XA
            r10.<init>()
            return r10
        L_0x0366:
            java.lang.Object r0 = r3.A01
            android.content.Context r8 = X.C51966G9m.A0Q(r0)
            java.lang.Object r2 = r3.A02
            X.Guh r2 = (X.C53814Guh) r2
            com.meta.foa.session.FoaUserSession r1 = r2.A00
            r0 = 29
            X.J6n r2 = X.C59105J6n.A02(r2, r0)
            r6 = 0
            r7 = 1
            X.0qQ.A0B(r1, r7)
            com.instagram.common.session.UserSession r4 = X.C56316HwT.A00(r1)
            X.6dr r0 = X.C312126dr.A01
            java.lang.String r3 = "memu_onboarding"
            X.AR0 r9 = new X.AR0
            r9.<init>(r8, r0, r4, r3)
            X.HQM.A00 = r9
            X.ILj r1 = new X.ILj
            r1.<init>(r2)
            X.AH3 r0 = r9.A08
            X.82T r0 = r0.A07
            r0.A01 = r1
            X.0qQ.A0B(r4, r7)
            X.7qZ r2 = new X.7qZ
            r2.<init>((java.lang.String) r3)
            X.7qb r0 = X.C343677qc.A00
            r2.A02(r0, r4)
            X.7qb r1 = X.B36.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2.A02(r1, r0)
            X.7qa r5 = new X.7qa
            r5.<init>(r2)
            X.C340267kz.A02 = r7
            X.ARK r4 = new X.ARK
            r4.<init>()
            X.AUZ r3 = new X.AUZ
            r3.<init>(r4, r9)
            X.ADN r2 = X.ADN.A00
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r1 = com.facebook.onecamera.configurations.AppSpecific.class
            X.7qq r0 = new X.7qq
            r0.<init>(r1)
            X.7qn[] r0 = new X.C343787qn[]{r0, r3}
            X.ATC r0 = r2.A00(r8, r5, r0)
            r4.A00 = r0
            X.AUb r10 = new X.AUb
            r10.<init>(r0)
            r10.A03(r7)
            r1 = 921600(0xe1000, float:1.291437E-39)
            X.7tn r0 = X.C40161AUb.A00(r10)
            r0.Ega(r1)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            X.7tn r0 = X.C40161AUb.A00(r10)
            r0.Efh(r1)
            X.7tn r0 = X.C40161AUb.A00(r10)
            r0.ElP(r6)
            X.7tn r0 = X.C40161AUb.A00(r10)
            r0.EUU(r6)
            return r10
        L_0x03fb:
            java.lang.Object r4 = r3.A02
            X.HIq r4 = (X.C54555HIq) r4
            androidx.fragment.app.Fragment r0 = X.C56604I4d.A09(r4)
            android.app.Application r11 = X.DbY.A05(r0)
            java.lang.Object r12 = r3.A01
            com.meta.foa.session.FoaUserSession r12 = (com.meta.foa.session.FoaUserSession) r12
            X.HMQ r14 = r4.A05
            boolean r3 = r4.A0D
            X.HtW r2 = r4.A06
            java.lang.String r15 = r2.A05
            java.lang.String r1 = r2.A06
            X.0eM r0 = r4.A0A
            java.lang.Object r13 = r0.getValue()
            X.I49 r13 = (X.I49) r13
            boolean r0 = r2.A0A
            X.Ghl r10 = new X.Ghl
            r16 = r1
            r17 = r3
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r10
        L_0x042b:
            java.lang.Object r13 = r3.A01
            com.meta.foa.session.FoaUserSession r13 = (com.meta.foa.session.FoaUserSession) r13
            java.lang.Object r0 = r3.A02
            X.HIq r0 = (X.C54555HIq) r0
            X.HtW r2 = r0.A06
            java.lang.String r14 = r2.A04
            java.lang.String r15 = r2.A03
            if (r15 != 0) goto L_0x043f
            java.lang.String r15 = X.C51972G9s.A0n()
        L_0x043f:
            java.util.Map r1 = r2.A07
            X.HOj r11 = r2.A00
            java.lang.String r0 = r2.A05
            X.XSJ r12 = r2.A01
            X.I49 r10 = new X.I49
            r16 = r0
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            return r10
        L_0x0451:
            java.lang.Object r0 = r3.A01
            X.HlT r0 = (X.C55670HlT) r0
            X.KHO r0 = r0.A00
            if (r0 == 0) goto L_0x0487
            X.MVV r0 = r0.A02
            if (r0 == 0) goto L_0x0487
            boolean r0 = r0.onBackPressed()
        L_0x0461:
            r2 = 1
            if (r0 != 0) goto L_0x0477
            java.lang.Object r1 = r3.A02
            X.HIq r1 = (X.C54555HIq) r1
            X.HtW r0 = r1.A06
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x047c
            X.GgN r1 = X.C54555HIq.A00(r1)
            X.HIS r0 = X.HIS.A00
        L_0x0474:
            r1.A0F(r0)
        L_0x0477:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        L_0x047c:
            r0 = 0
            r1.A0H(r0)
            X.GgN r1 = X.C54555HIq.A00(r1)
            X.HIa r0 = X.C54539HIa.A00
            goto L_0x0474
        L_0x0487:
            r0 = 0
            goto L_0x0461
        L_0x0489:
            java.lang.Object r5 = r3.A01
            X.3Y5 r5 = (X.AnonymousClass3Y5) r5
            java.lang.Integer r0 = X.AnonymousClass05K.A0X
            long r2 = X.I61.A02(r5, r0)
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r8 = 0
            r10.setShape(r8)
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r10.setOrientation(r0)
            r9 = 3
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r7 = X.C244013aV.A02(r5, r0)
            r0 = 2131099670(0x7f060016, float:1.78117E38)
            int r4 = X.C244013aV.A02(r5, r0)
            r6 = 1
            r0 = 2131100792(0x7f060478, float:1.7813975E38)
            int r0 = X.C244013aV.A02(r5, r0)
            r1 = 2
            int[] r0 = new int[]{r7, r4, r0}
            r10.setColors(r0)
            r0 = 8
            float[] r4 = new float[r0]
            r0 = 0
            r4[r8] = r0
            r4[r6] = r0
            r4[r1] = r0
            r4[r9] = r0
            float r1 = X.C51969G9p.A02(r5, r2)
            r0 = 4
            r4[r0] = r1
            float r1 = X.C51969G9p.A02(r5, r2)
            r0 = 5
            r4[r0] = r1
            float r1 = X.C51969G9p.A02(r5, r2)
            r0 = 6
            r4[r0] = r1
            float r1 = X.C51969G9p.A02(r5, r2)
            r0 = 7
            r4[r0] = r1
            r10.setCornerRadii(r4)
            return r10
        L_0x04ed:
            java.lang.Object r6 = r3.A02
            X.GuR r6 = (X.C53798GuR) r6
            java.lang.Object r2 = r3.A01
            X.JMS r2 = (X.JMS) r2
            X.01N r4 = X.0jo.A1H()
            boolean r0 = r2 instanceof X.C57569Icw
            r13 = 0
            if (r0 == 0) goto L_0x054e
            X.Icw r2 = (X.C57569Icw) r2
            java.util.List r1 = r2.A00
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x0510
            X.HHd r0 = new X.HHd
            r0.<init>(r1)
            r4.add(r0)
        L_0x0510:
            java.util.List r0 = r2.A01
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x051a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0565
            java.lang.Object r3 = r7.next()
            X.Icx r3 = (X.C57570Icx) r3
            int r2 = r4.size()
            java.lang.String r10 = r3.A03
            X.HtD r9 = r3.A00
            X.KhO r1 = r3.A01
            X.KhO r0 = X.C62532KhO.MEMU
            boolean r11 = X.AnonymousClass7TF.A1W(r1, r0)
            boolean r12 = r6.A01
            X.Gu6 r8 = new X.Gu6
            r8.<init>(r9, r10, r11, r12, r13)
            X.HHe r0 = new X.HHe
            r0.<init>(r8, r3, r2)
            boolean r0 = r4.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.add(r0)
            goto L_0x051a
        L_0x054e:
            boolean r0 = r2 instanceof X.C57571Icy
            if (r0 == 0) goto L_0x0565
            r3 = 6
        L_0x0553:
            int r2 = r4.size()
            r1 = 0
            X.HHe r0 = new X.HHe
            r0.<init>(r1, r1, r2)
            r4.add(r0)
            int r13 = r13 + 1
            if (r13 >= r3) goto L_0x0565
            goto L_0x0553
        L_0x0565:
            X.01N r10 = X.0jo.A1I(r4)
            return r10
        L_0x056a:
            java.lang.Object r0 = r3.A02
            X.GwC r0 = (X.C53906GwC) r0
            X.HMY r1 = r0.A01
            X.HMY r0 = X.HMY.SQUARE
            if (r1 != r0) goto L_0x058e
            java.lang.Object r3 = r3.A01
            X.3Y5 r3 = (X.AnonymousClass3Y5) r3
            android.content.Context r0 = X.C243803a8.A00(r3)
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            int r2 = r0.widthPixels
            r0 = 4627448617123184640(0x4038000000000000, double:24.0)
            int r0 = X.C51972G9s.A0B(r3, r0)
            int r2 = r2 - r0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            return r10
        L_0x058e:
            r10 = 0
            return r10
        L_0x0590:
            X.2YP r10 = X.AnonymousClass2YP.A00
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58688Ivx.invoke():java.lang.Object");
    }
}
