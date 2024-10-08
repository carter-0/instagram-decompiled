package X;

import android.view.View;

/* renamed from: X.Plz  reason: case insensitive filesystem */
public final class C73919Plz extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73919Plz(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static View A00(C73919Plz plz) {
        return (View) ((PMG) plz.A01).A09.getValue();
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73919Plz(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x041d, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e3, code lost:
        r2 = new X.C73919Plz(r5, r0);
        r3 = r3.findViewById(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ed, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ef, code lost:
        X.O2G.A00(r3, r2, (X.C62320sa) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00f3, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0400;
                case 1: goto L_0x00ce;
                case 2: goto L_0x03ca;
                case 3: goto L_0x00b8;
                case 4: goto L_0x03b8;
                case 5: goto L_0x03a6;
                case 6: goto L_0x0391;
                case 7: goto L_0x037f;
                case 8: goto L_0x0096;
                case 9: goto L_0x006f;
                case 10: goto L_0x0010;
                case 11: goto L_0x0357;
                case 12: goto L_0x0345;
                case 13: goto L_0x0333;
                case 14: goto L_0x0321;
                case 15: goto L_0x0316;
                case 16: goto L_0x0308;
                case 17: goto L_0x02fe;
                case 18: goto L_0x02eb;
                case 19: goto L_0x02c8;
                case 20: goto L_0x02ba;
                case 21: goto L_0x02ac;
                case 22: goto L_0x029e;
                case 23: goto L_0x0290;
                case 24: goto L_0x0282;
                case 25: goto L_0x023a;
                case 26: goto L_0x022f;
                case 27: goto L_0x0224;
                case 28: goto L_0x0216;
                case 29: goto L_0x0208;
                case 30: goto L_0x01fa;
                case 31: goto L_0x01ee;
                case 32: goto L_0x01e2;
                case 33: goto L_0x01d6;
                case 34: goto L_0x01ca;
                case 35: goto L_0x01b8;
                case 36: goto L_0x01ac;
                case 37: goto L_0x01a0;
                case 38: goto L_0x0192;
                case 39: goto L_0x017b;
                case 40: goto L_0x016f;
                case 41: goto L_0x0163;
                case 42: goto L_0x014d;
                case 43: goto L_0x0146;
                case 44: goto L_0x013b;
                case 45: goto L_0x012d;
                case 46: goto L_0x011f;
                case 47: goto L_0x0102;
                case 48: goto L_0x00f4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.PMF r0 = (X.PMF) r0
            X.0sa r0 = r0.A0B
            java.lang.Object r3 = r0.invoke()
        L_0x000f:
            return r3
        L_0x0010:
            java.lang.Object r5 = r7.A01
            X.PMS r5 = (X.PMS) r5
            X.0eM r0 = r5.A0P
            android.view.View r1 = X.C66582MXn.A0D(r0)
            r0 = 2131443543(0x7f0b3f57, float:1.8509157E38)
            android.view.View r3 = r1.findViewById(r0)
            android.widget.RatingBar r3 = (android.widget.RatingBar) r3
            if (r3 == 0) goto L_0x000f
            r6 = 0
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r3)
            r0 = 2131240301(0x7f08256d, float:1.8096933E38)
            android.graphics.drawable.BitmapDrawable r4 = X.VG8.A00(r1, r0)
            r0 = 2131240302(0x7f08256e, float:1.8096935E38)
            android.graphics.drawable.BitmapDrawable r0 = X.VG8.A00(r1, r0)
            r2 = 1
            android.graphics.drawable.BitmapDrawable[] r0 = new android.graphics.drawable.BitmapDrawable[]{r4, r0}
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
            r0 = 16908288(0x1020000, float:2.387723E-38)
            r1.setId(r6, r0)
            r0 = 16908301(0x102000d, float:2.3877265E-38)
            r1.setId(r2, r0)
            r3.setProgressDrawableTiled(r1)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            int r1 = r3.getNumStars()
            int r0 = r4.getIntrinsicWidth()
            int r1 = r1 * r0
            int r0 = java.lang.Math.max(r6, r1)
            r2.width = r0
            r3.requestLayout()
            X.OlJ r0 = new X.OlJ
            r0.<init>(r3, r5)
            r3.setOnRatingBarChangeListener(r0)
            return r3
        L_0x006f:
            java.lang.Object r2 = r7.A01
            X.PMS r2 = (X.PMS) r2
            X.0eM r0 = r2.A0P
            android.view.View r1 = X.C66582MXn.A0D(r0)
            r0 = 2131443537(0x7f0b3f51, float:1.8509145E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L_0x000f
            r1 = 21
            X.SbI r0 = new X.SbI
            r0.<init>(r2, r1)
            X.AnonymousClass0fU.A00(r0, r3)
            r1 = 3
            X.MtH r0 = new X.MtH
            r0.<init>(r1)
            X.03v.A0B(r3, r0)
            return r3
        L_0x0096:
            java.lang.Object r2 = r7.A01
            X.PMS r2 = (X.PMS) r2
            X.0eM r0 = r2.A0P
            android.view.View r1 = X.C66582MXn.A0D(r0)
            r0 = 2131443534(0x7f0b3f4e, float:1.8509139E38)
            android.view.View r3 = r1.findViewById(r0)
            if (r3 == 0) goto L_0x000f
            r0 = 34
            X.C71396Ojv.A00(r3, r0, r2)
            r1 = 3
            X.MtH r0 = new X.MtH
            r0.<init>(r1)
            X.03v.A0B(r3, r0)
            return r3
        L_0x00b8:
            java.lang.Object r5 = r7.A01
            X.PMS r5 = (X.PMS) r5
            X.0eM r1 = r5.A0D
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            r4 = 2131429367(0x7f0b07f7, float:1.8480405E38)
            r0.findViewById(r4)
            android.view.View r3 = X.AnonymousClass7TE.A0c(r1)
            r0 = 2
            goto L_0x00e3
        L_0x00ce:
            java.lang.Object r5 = r7.A01
            X.PMS r5 = (X.PMS) r5
            X.0eM r1 = r5.A0D
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            r4 = 2131435370(0x7f0b1f6a, float:1.849258E38)
            r0.findViewById(r4)
            android.view.View r3 = X.AnonymousClass7TE.A0c(r1)
            r0 = 0
        L_0x00e3:
            X.Plz r2 = new X.Plz
            r2.<init>(r5, r0)
            r1 = 1
            android.view.View r3 = r3.findViewById(r4)
            if (r3 == 0) goto L_0x000f
            r0 = 0
            X.O2G.A00(r3, r2, r0, r1)
            return r3
        L_0x00f4:
            java.lang.Object r0 = r7.A01
            X.PMF r0 = (X.PMF) r0
            android.app.Activity r1 = r0.A01
            r0 = 2131436171(0x7f0b228b, float:1.8494205E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x0102:
            java.lang.Object r0 = r7.A01
            X.PMF r0 = (X.PMF) r0
            X.0eM r4 = r0.A09
            android.view.View r2 = X.AnonymousClass7TE.A0c(r4)
            android.app.Activity r1 = r0.A01
            X.Pl3 r0 = X.C73866Pl3.A00
            X.N1T r3 = new X.N1T
            r3.<init>(r1, r2, r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r4)
            android.view.View$OnTouchListener r0 = r3.A08
            r1.setOnTouchListener(r0)
            return r3
        L_0x011f:
            java.lang.Object r0 = r7.A01
            X.PMF r0 = (X.PMF) r0
            android.app.Activity r1 = r0.A01
            r0 = 2131431817(0x7f0b1189, float:1.8485374E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x012d:
            java.lang.Object r0 = r7.A01
            X.PMF r0 = (X.PMF) r0
            android.app.Activity r1 = r0.A01
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x013b:
            java.lang.Object r0 = r7.A01
            X.OFa r0 = (X.C70653OFa) r0
            X.0eM r0 = r0.A02
            java.lang.Object r3 = r0.getValue()
            return r3
        L_0x0146:
            java.lang.Object r0 = r7.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x014d:
            java.lang.Object r0 = r7.A01
            X.PM5 r0 = (X.PM5) r0
            X.0eM r0 = r0.A03
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131435734(0x7f0b20d6, float:1.8493319E38)
            X.3Nc r0 = X.C240903Nb.A00(r1, r0)
            android.view.View r3 = r0.A00()
            return r3
        L_0x0163:
            android.view.View r1 = A00(r7)
            r0 = 2131443799(0x7f0b4057, float:1.8509676E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x016f:
            android.view.View r1 = A00(r7)
            r0 = 2131443798(0x7f0b4056, float:1.8509674E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x017b:
            java.lang.Object r2 = r7.A01
            X.PMG r2 = (X.PMG) r2
            X.0eM r0 = r2.A09
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443797(0x7f0b4055, float:1.8509672E38)
            android.view.View r3 = r1.findViewById(r0)
            r0 = 39
            X.C71396Ojv.A00(r3, r0, r2)
            return r3
        L_0x0192:
            java.lang.Object r0 = r7.A01
            X.PMG r0 = (X.PMG) r0
            android.view.View r1 = r0.A03
            r0 = 2131429368(0x7f0b07f8, float:1.8480407E38)
            X.3Nc r3 = X.C240903Nb.A00(r1, r0)
            return r3
        L_0x01a0:
            android.view.View r1 = A00(r7)
            r0 = 2131443796(0x7f0b4054, float:1.850967E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01ac:
            android.view.View r1 = A00(r7)
            r0 = 2131443793(0x7f0b4051, float:1.8509664E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01b8:
            java.lang.Object r0 = r7.A01
            X.PMG r0 = (X.PMG) r0
            X.0eM r0 = r0.A0C
            android.view.View r1 = X.JTR.A0W(r0)
            r0 = 2131443785(0x7f0b4049, float:1.8509648E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01ca:
            android.view.View r1 = A00(r7)
            r0 = 2131443792(0x7f0b4050, float:1.8509662E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01d6:
            android.view.View r1 = A00(r7)
            r0 = 2131443791(0x7f0b404f, float:1.850966E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01e2:
            android.view.View r1 = A00(r7)
            r0 = 2131443790(0x7f0b404e, float:1.8509658E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01ee:
            android.view.View r1 = A00(r7)
            r0 = 2131443788(0x7f0b404c, float:1.8509654E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01fa:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            android.content.Context r1 = r0.A03
            r0 = 2131976516(0x7f136144, float:1.9590155E38)
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x0208:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            android.content.Context r1 = r0.A03
            r0 = 2131976559(0x7f13616f, float:1.9590242E38)
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x0216:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            android.content.Context r1 = r0.A03
            r0 = 2131238982(0x7f082046, float:1.8094258E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            return r3
        L_0x0224:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            android.app.Activity r0 = r0.A02
            java.lang.Object r3 = X.C66582MXn.A0o(r0)
            return r3
        L_0x022f:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.2Dm r3 = X.2L2.A00(r0)
            return r3
        L_0x023a:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            android.content.Context r6 = r0.A03
            r5 = 4
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            int r4 = X.2Yu.A0H(r6, r0)
            r3 = 0
            r0 = 2130970229(0x7f040675, float:1.7549162E38)
            int r2 = X.2Yu.A0H(r6, r0)
            r1 = 2131099673(0x7f060019, float:1.7811706E38)
            r0 = 2130970232(0x7f040678, float:1.7549168E38)
            int r0 = X.2Yu.A0H(r6, r0)
            int[] r1 = new int[]{r4, r2, r1, r0}
            int[] r2 = new int[r5]
        L_0x0260:
            r0 = r1[r3]
            int r0 = r6.getColor(r0)
            r2[r3] = r0
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0260
            X.Mre r1 = new X.Mre
            r1.<init>(r2)
            android.graphics.drawable.PaintDrawable r3 = new android.graphics.drawable.PaintDrawable
            r3.<init>()
            android.graphics.drawable.shapes.RectShape r0 = new android.graphics.drawable.shapes.RectShape
            r0.<init>()
            r3.setShape(r0)
            r3.setShaderFactory(r1)
            return r3
        L_0x0282:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            android.content.Context r1 = r0.A03
            r0 = 2131953296(0x7f130690, float:1.9543059E38)
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x0290:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            android.content.Context r1 = r0.A03
            r0 = 2131954435(0x7f130b03, float:1.954537E38)
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x029e:
            java.lang.Object r0 = r7.A01
            X.NeZ r0 = (X.C69094NeZ) r0
            android.content.Context r1 = r0.A03
            r0 = 2131238025(0x7f081c89, float:1.8092317E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            return r3
        L_0x02ac:
            java.lang.Object r0 = r7.A01
            X.PMO r0 = (X.PMO) r0
            android.view.View r1 = r0.A02
            r0 = 2131437137(0x7f0b2651, float:1.8496164E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x02ba:
            java.lang.Object r0 = r7.A01
            X.PMO r0 = (X.PMO) r0
            android.view.View r1 = r0.A02
            r0 = 2131434056(0x7f0b1a48, float:1.8489915E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x02c8:
            java.lang.Object r2 = r7.A01
            X.PMO r2 = (X.PMO) r2
            android.view.View r0 = r2.A03
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.N1V r3 = new X.N1V
            r3.<init>(r0)
            r1 = 0
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            r0.setIsLongpressEnabled(r1)
            X.POW r0 = new X.POW
            r0.<init>(r2)
            r3.A00 = r0
            return r3
        L_0x02eb:
            java.lang.Object r2 = r7.A01
            X.PMO r2 = (X.PMO) r2
            android.view.View r1 = r2.A02
            r0 = 2131427572(0x7f0b00f4, float:1.8476764E38)
            android.view.View r3 = r1.findViewById(r0)
            r0 = 36
            X.C71396Ojv.A00(r3, r0, r2)
            return r3
        L_0x02fe:
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.GC9 r3 = new X.GC9
            r3.<init>(r0)
            return r3
        L_0x0308:
            java.lang.Object r0 = r7.A01
            X.PMB r0 = (X.PMB) r0
            android.view.View r1 = r0.A01
            r0 = 2131429375(0x7f0b07ff, float:1.848042E38)
            X.3Nc r3 = X.C240903Nb.A00(r1, r0)
            return r3
        L_0x0316:
            java.lang.Object r0 = r7.A01
            X.PMB r0 = (X.PMB) r0
            X.0eM r0 = r0.A07
            android.view.View r3 = X.JTR.A0W(r0)
            return r3
        L_0x0321:
            java.lang.Object r0 = r7.A01
            X.PMB r0 = (X.PMB) r0
            X.0eM r0 = r0.A06
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429374(0x7f0b07fe, float:1.8480419E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x0333:
            java.lang.Object r0 = r7.A01
            X.PMB r0 = (X.PMB) r0
            X.0eM r0 = r0.A06
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429373(0x7f0b07fd, float:1.8480417E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x0345:
            java.lang.Object r0 = r7.A01
            X.PMB r0 = (X.PMB) r0
            X.0eM r0 = r0.A06
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429372(0x7f0b07fc, float:1.8480415E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x0357:
            java.lang.Object r3 = r7.A01
            X.PMS r3 = (X.PMS) r3
            android.view.View r1 = r3.A03
            r0 = 2131429394(0x7f0b0812, float:1.848046E38)
            android.view.ViewStub r2 = X.DbS.A0F(r1, r0)
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x037b
            boolean r1 = r3.A0R
            r0 = 2131627518(0x7f0e0dfe, float:1.8882303E38)
            if (r1 == 0) goto L_0x0372
            r0 = 2131627519(0x7f0e0dff, float:1.8882305E38)
        L_0x0372:
            r2.setLayoutResource(r0)
            X.2eb r3 = new X.2eb
            r3.<init>(r2)
            return r3
        L_0x037b:
            r0 = 2131627520(0x7f0e0e00, float:1.8882307E38)
            goto L_0x0372
        L_0x037f:
            java.lang.Object r0 = r7.A01
            X.PMS r0 = (X.PMS) r0
            X.0eM r0 = r0.A0P
            android.view.View r1 = X.C66582MXn.A0D(r0)
            r0 = 2131443533(0x7f0b3f4d, float:1.8509137E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x0391:
            java.lang.Object r0 = r7.A01
            X.PMS r0 = (X.PMS) r0
            android.view.View r0 = r0.A03
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            r0 = 15
            float r0 = X.0nA.A04(r1, r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L_0x03a6:
            java.lang.Object r0 = r7.A01
            X.PMS r0 = (X.PMS) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429365(0x7f0b07f5, float:1.84804E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x03b8:
            java.lang.Object r0 = r7.A01
            X.PMS r0 = (X.PMS) r0
            X.0eM r0 = r0.A0D
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429364(0x7f0b07f4, float:1.8480399E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x03ca:
            java.lang.Object r0 = r7.A01
            X.PMS r0 = (X.PMS) r0
            X.O9u r0 = r0.A03()
            X.Neh r0 = r0.A00
            android.app.Activity r3 = r0.A04
            com.instagram.common.session.UserSession r2 = r0.A06
            X.N9G r1 = r0.A01
            java.lang.String r0 = "endStateModel"
            if (r1 != 0) goto L_0x03e6
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03e6:
            java.lang.Integer r1 = r1.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x03fd
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x03f6
            com.instagram.bugreporter.source.BugReportSource r0 = com.instagram.bugreporter.source.BugReportSource.VIDEO_CALL_FULL
        L_0x03f2:
            X.FGP.A00(r3, r0, r2)
            goto L_0x041b
        L_0x03f6:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x03fd
            com.instagram.bugreporter.source.BugReportSource r0 = com.instagram.bugreporter.source.BugReportSource.VIDEO_CALL_NO_ANSWER
            goto L_0x03f2
        L_0x03fd:
            com.instagram.bugreporter.source.BugReportSource r0 = com.instagram.bugreporter.source.BugReportSource.VIDEO_CALL_FAILED
            goto L_0x03f2
        L_0x0400:
            java.lang.Object r0 = r7.A01
            X.PMS r0 = (X.PMS) r0
            X.O9u r0 = r0.A03()
            X.Neh r2 = r0.A00
            X.Ocu r1 = r2.A08
            X.PLq r0 = X.C72828PLq.A00
            r1.A03(r0)
            X.0sa r0 = r2.A0L
            r0.invoke()
            X.PPP r0 = X.PPP.A00
            r1.A03(r0)
        L_0x041b:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73919Plz.invoke():java.lang.Object");
    }
}
