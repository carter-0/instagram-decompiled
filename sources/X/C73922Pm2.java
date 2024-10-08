package X;

import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.Pm2  reason: case insensitive filesystem */
public final class C73922Pm2 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73922Pm2(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C270354gb A00(C73922Pm2 pm2) {
        C270354gb r1 = new C270354gb();
        r1.A0I((ConstraintLayout) ((PMQ) pm2.A01).A09.getValue());
        return r1;
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73922Pm2(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v153, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v154, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v155, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v168, types: [X.Ps0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r3 != 1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x04d7;
                case 1: goto L_0x04c9;
                case 2: goto L_0x04bb;
                case 3: goto L_0x04a8;
                case 4: goto L_0x049a;
                case 5: goto L_0x048f;
                case 6: goto L_0x046a;
                case 7: goto L_0x0431;
                case 8: goto L_0x0423;
                case 9: goto L_0x01d4;
                case 10: goto L_0x040d;
                case 11: goto L_0x03ff;
                case 12: goto L_0x03d5;
                case 13: goto L_0x03ba;
                case 14: goto L_0x03b0;
                case 15: goto L_0x003e;
                case 16: goto L_0x038b;
                case 17: goto L_0x0379;
                case 18: goto L_0x0369;
                case 19: goto L_0x035b;
                case 20: goto L_0x0349;
                case 21: goto L_0x0323;
                case 22: goto L_0x0310;
                case 23: goto L_0x0302;
                case 24: goto L_0x02f2;
                case 25: goto L_0x02e4;
                case 26: goto L_0x02ce;
                case 27: goto L_0x02a3;
                case 28: goto L_0x0289;
                case 29: goto L_0x0277;
                case 30: goto L_0x0267;
                case 31: goto L_0x0239;
                case 32: goto L_0x002b;
                case 33: goto L_0x01b4;
                case 34: goto L_0x01a6;
                case 35: goto L_0x0186;
                case 36: goto L_0x0157;
                case 37: goto L_0x013f;
                case 38: goto L_0x0131;
                case 39: goto L_0x011f;
                case 40: goto L_0x00f7;
                case 41: goto L_0x00d7;
                case 42: goto L_0x00be;
                case 43: goto L_0x04eb;
                case 44: goto L_0x00b2;
                case 45: goto L_0x00a1;
                case 46: goto L_0x0093;
                case 47: goto L_0x007d;
                case 48: goto L_0x006b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.OZU r0 = (X.OZU) r0
            com.instagram.common.session.UserSession r3 = r0.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 36592777767027401(0x8200f0002602c9, double:3.204758234932724E-306)
            long r3 = X.182.A01(r2, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x0025
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
        L_0x002a:
            return r6
        L_0x002b:
            java.lang.Object r0 = r1.A01
            X.Neb r0 = (X.C69096Neb) r0
            android.app.Activity r1 = r0.A01
            java.lang.String r0 = "media_projection"
            java.lang.Object r6 = r1.getSystemService(r0)
            if (r6 != 0) goto L_0x002a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x003e:
            java.lang.Object r4 = r1.A01
            X.PMH r4 = (X.PMH) r4
            android.view.View r0 = r4.A02
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.N1V r6 = new X.N1V
            r6.<init>(r0)
            X.POX r0 = new X.POX
            r0.<init>(r4)
            r6.A00 = r0
            com.instagram.common.session.UserSession r3 = r4.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314919151078300(0x81043a000c0b9c, double:3.0290393273596714E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002a
            X.OA5 r0 = new X.OA5
            r0.<init>(r4)
            r6.A02 = r0
            return r6
        L_0x006b:
            X.PwZ r3 = X.C74540PwZ.A00
            java.lang.Object r2 = r1.A01
            X.ND0 r2 = (X.ND0) r2
            android.content.Context r1 = r2.A02
            X.Oqk r0 = new X.Oqk
            r0.<init>(r2)
            X.OT7 r6 = r3.AL4(r1, r0)
            return r6
        L_0x007d:
            java.lang.Object r0 = r1.A01
            X.Neq r0 = (X.C69111Neq) r0
            android.view.View r1 = r0.A0A
            r0 = 2131441500(0x7f0b375c, float:1.8505013E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r1, r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 0
            X.3M8 r6 = new X.3M8
            r6.<init>(r1, r0)
            return r6
        L_0x0093:
            java.lang.Object r0 = r1.A01
            X.Neq r0 = (X.C69111Neq) r0
            android.view.View r1 = r0.A0A
            r0 = 2131441501(0x7f0b375d, float:1.8505015E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x00a1:
            java.lang.Object r0 = r1.A01
            X.Neq r0 = (X.C69111Neq) r0
            X.Ocu r1 = r0.A0E
            X.PMu r0 = new X.PMu
            r0.<init>()
            r1.A05(r0)
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x00b2:
            java.lang.Object r0 = r1.A01
            X.Neq r0 = (X.C69111Neq) r0
            android.view.View r0 = r0.A0A
            X.PMO r6 = new X.PMO
            r6.<init>(r0)
            return r6
        L_0x00be:
            java.lang.Object r1 = r1.A01
            X.PMA r1 = (X.PMA) r1
            android.view.View r0 = r1.A00
            android.view.LayoutInflater r3 = X.DbV.A0D(r0)
            r2 = 2131627272(0x7f0e0d08, float:1.8881804E38)
            X.0eM r0 = r1.A02
            android.view.ViewGroup r1 = X.C66583MXo.A0C(r0)
            r0 = 0
            android.view.View r6 = X.DbW.A09(r3, r1, r2, r0)
            return r6
        L_0x00d7:
            java.lang.Object r2 = r1.A01
            X.PMA r2 = (X.PMA) r2
            X.0eM r0 = r2.A06
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131441190(0x7f0b3626, float:1.8504385E38)
            android.view.View r6 = X.AnonymousClass7TE.A0b(r1, r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            android.content.Context r0 = r6.getContext()
            X.DbV.A1B(r0, r6)
            X.0eM r0 = r2.A04
            X.Dba.A17(r6, r0)
            return r6
        L_0x00f7:
            java.lang.Object r0 = r1.A01
            X.PMA r0 = (X.PMA) r0
            android.view.View r0 = r0.A00
            android.content.Context r0 = r0.getContext()
            X.2tC r1 = X.AnonymousClass2t9.A00(r0)
            X.NNn r0 = new X.NNn
            r0.<init>()
            r1.A01(r0)
            X.H72 r0 = new X.H72
            r0.<init>()
            r1.A01(r0)
            X.EFk r0 = new X.EFk
            r0.<init>()
            X.2t9 r6 = X.DbU.A0U(r1, r0)
            return r6
        L_0x011f:
            java.lang.Object r0 = r1.A01
            X.PMA r0 = (X.PMA) r0
            X.0eM r0 = r0.A06
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131441189(0x7f0b3625, float:1.8504383E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0131:
            java.lang.Object r0 = r1.A01
            X.PMA r0 = (X.PMA) r0
            android.view.View r1 = r0.A00
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x013f:
            java.lang.Object r3 = r1.A01
            X.PM9 r3 = (X.PM9) r3
            android.view.View r0 = r3.A00
            android.view.LayoutInflater r2 = X.DbV.A0D(r0)
            r1 = 2131627008(0x7f0e0c00, float:1.8881268E38)
            X.0eM r0 = r3.A02
            android.view.ViewGroup r0 = X.C66583MXo.A0C(r0)
            android.view.View r6 = X.DbT.A0C(r2, r0, r1)
            return r6
        L_0x0157:
            java.lang.Object r2 = r1.A01
            X.PM9 r2 = (X.PM9) r2
            X.0eM r0 = r2.A05
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131437472(0x7f0b27a0, float:1.8496844E38)
            androidx.recyclerview.widget.RecyclerView r6 = X.DbZ.A0F(r1, r0)
            android.view.View r0 = r2.A00
            android.content.Context r0 = r0.getContext()
            X.DbV.A1B(r0, r6)
            X.0eM r0 = r2.A03
            X.Dba.A17(r6, r0)
            r0 = 1
            r6.setNestedScrollingEnabled(r0)
            X.3AQ r1 = new X.3AQ
            r1.<init>()
            r0 = 0
            r1.A00 = r0
            r6.setItemAnimator(r1)
            return r6
        L_0x0186:
            java.lang.Object r0 = r1.A01
            X.PM9 r0 = (X.PM9) r0
            android.view.View r0 = r0.A00
            android.content.Context r0 = r0.getContext()
            X.2tC r1 = X.AnonymousClass2t9.A00(r0)
            X.NQG r0 = X.NQG.A00
            r1.A01(r0)
            X.NQH r0 = X.NQH.A00
            r1.A01(r0)
            r0 = 1
            r1.A09 = r0
            X.2t9 r6 = r1.A00()
            return r6
        L_0x01a6:
            java.lang.Object r0 = r1.A01
            X.PM9 r0 = (X.PM9) r0
            android.view.View r1 = r0.A00
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x01b4:
            java.lang.Object r0 = r1.A01
            X.Neb r0 = (X.C69096Neb) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36595900206418197(0x8203c7000a0915, double:3.206732878176518E-306)
            int r2 = X.DbS.A04(r2, r3, r0)
            X.Nig[] r1 = X.C69280Nig.values()
            if (r2 < 0) goto L_0x01d1
            int r0 = r1.length
            if (r2 >= r0) goto L_0x01d1
            r6 = r1[r2]
            return r6
        L_0x01d1:
            X.Nig r6 = X.C69280Nig.A04
            return r6
        L_0x01d4:
            java.lang.Object r5 = r1.A01
            X.PMN r5 = (X.PMN) r5
            android.view.View r0 = r5.A04
            android.view.LayoutInflater r4 = X.DbV.A0D(r0)
            r2 = 2131626406(0x7f0e09a6, float:1.8880047E38)
            X.0eM r3 = r5.A06
            android.view.ViewGroup r1 = X.C66583MXo.A0C(r3)
            r0 = 0
            android.view.View r6 = X.DbW.A09(r4, r1, r2, r0)
            r1 = 2131437548(0x7f0b27ec, float:1.8496998E38)
            com.instagram.common.ui.base.IgTextView r2 = X.JTO.A0X(r6, r1)
            r5.A00 = r2
            if (r2 != 0) goto L_0x0201
            java.lang.String r0 = "primaryButtonView"
        L_0x01f9:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0201:
            r1 = 49
            X.C71396Ojv.A00(r2, r1, r5)
            r2.setVisibility(r0)
            X.2eS.A01(r2)
            r1 = 2131437549(0x7f0b27ed, float:1.8497E38)
            com.instagram.common.ui.base.IgTextView r2 = X.JTO.A0X(r6, r1)
            r5.A01 = r2
            if (r2 != 0) goto L_0x021a
            java.lang.String r0 = "secondaryButtonView"
            goto L_0x01f9
        L_0x021a:
            r1 = 50
            X.C71396Ojv.A00(r2, r1, r5)
            r2.setVisibility(r0)
            X.2eS.A01(r2)
            X.PMN.A00(r5)
            android.view.View r2 = X.C66581MXm.A0B(r3)
            X.N9R r1 = r5.A02
            if (r1 == 0) goto L_0x0232
            int r0 = r1.A00
        L_0x0232:
            X.0nA.A0X(r2, r0)
            r0 = 1
            r5.A03 = r0
            return r6
        L_0x0239:
            java.lang.Object r3 = r1.A01
            X.PM3 r3 = (X.PM3) r3
            android.view.View r1 = r3.A00
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            android.view.View r2 = r1.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.LayoutInflater r1 = X.DbV.A0D(r1)
            r0 = 2131626408(0x7f0e09a8, float:1.8880051E38)
            android.view.View r6 = X.DbT.A0C(r1, r2, r0)
            r0 = 2131440726(0x7f0b3456, float:1.8503444E38)
            android.view.View r2 = r6.findViewById(r0)
            X.61u r2 = (X.C3021461u) r2
            r1 = 53
            X.Ojv r0 = new X.Ojv
            r0.<init>(r3, r1)
            r2.setPrimaryActionOnClickListener(r0)
            return r6
        L_0x0267:
            X.4gb r6 = A00(r1)
            r3 = 2131443806(0x7f0b405e, float:1.850969E38)
            r2 = 2131443802(0x7f0b405a, float:1.8509682E38)
            r1 = 7
            r0 = 6
            r6.A0C(r3, r1, r2, r0)
            return r6
        L_0x0277:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            X.0eM r0 = r0.A09
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443805(0x7f0b405d, float:1.8509688E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0289:
            java.lang.Object r2 = r1.A01
            X.PMQ r2 = (X.PMQ) r2
            X.0eM r0 = r2.A09
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443806(0x7f0b405e, float:1.850969E38)
            android.view.View r6 = r1.findViewById(r0)
            X.N1V r0 = r2.A05
            X.JTQ.A1K(r6)
            r6.setOnTouchListener(r0)
            return r6
        L_0x02a3:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            X.0eM r0 = r0.A09
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131440725(0x7f0b3455, float:1.8503441E38)
            android.view.View r6 = r1.findViewById(r0)
            android.content.Context r2 = r6.getContext()
            r0 = 2131976580(0x7f136184, float:1.9590285E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131976582(0x7f136186, float:1.9590289E38)
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r0 = X.002.A0R(r1, r0)
            r6.setContentDescription(r0)
            return r6
        L_0x02ce:
            X.4gb r6 = A00(r1)
            r2 = 2131443806(0x7f0b405e, float:1.850969E38)
            r1 = 1050253722(0x3e99999a, float:0.3)
            X.6rh r0 = X.C270354gb.A02(r6, r2)
            X.6rk r0 = r0.A03
            r0.A02 = r1
            r6.A07(r2, r1)
            return r6
        L_0x02e4:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            android.view.View r1 = r0.A03
            r0 = 2131438065(0x7f0b29f1, float:1.8498046E38)
            X.3Nc r6 = X.C240903Nb.A00(r1, r0)
            return r6
        L_0x02f2:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            X.0eM r0 = r0.A0G
            android.view.View r6 = X.JTR.A0W(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r6, r0)
            return r6
        L_0x0302:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            android.view.View r1 = r0.A03
            r0 = 2131441101(0x7f0b35cd, float:1.8504204E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0310:
            java.lang.Object r2 = r1.A01
            X.PMQ r2 = (X.PMQ) r2
            android.view.View r1 = r2.A03
            r0 = 2131443800(0x7f0b4058, float:1.8509678E38)
            android.view.View r6 = r1.findViewById(r0)
            r0 = 52
            X.C71396Ojv.A00(r6, r0, r2)
            return r6
        L_0x0323:
            X.4gb r6 = A00(r1)
            r2 = 2131443806(0x7f0b405e, float:1.850969E38)
            r0 = 6
            r1 = 0
            r6.A0C(r2, r0, r1, r0)
            r0 = 7
            r6.A0C(r2, r0, r1, r0)
            r0 = 3
            r6.A0C(r2, r0, r1, r0)
            r0 = 4
            r6.A0C(r2, r0, r1, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.6rh r0 = X.C270354gb.A02(r6, r2)
            X.6rk r0 = r0.A03
            r0.A02 = r1
            r6.A07(r2, r1)
            return r6
        L_0x0349:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            X.0eM r0 = r0.A0F
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429422(0x7f0b082e, float:1.8480516E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x035b:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            android.view.View r1 = r0.A03
            r0 = 2131429387(0x7f0b080b, float:1.8480445E38)
            X.3Nc r6 = X.C240903Nb.A00(r1, r0)
            return r6
        L_0x0369:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            X.0eM r0 = r0.A0A
            android.view.View r6 = X.JTR.A0W(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r6, r0)
            return r6
        L_0x0379:
            java.lang.Object r0 = r1.A01
            X.PMQ r0 = (X.PMQ) r0
            X.0eM r0 = r0.A09
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131443803(0x7f0b405b, float:1.8509684E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x038b:
            java.lang.Object r2 = r1.A01
            X.Nef r2 = (X.C69100Nef) r2
            com.instagram.common.session.UserSession r9 = r2.A05
            android.app.Activity r7 = r2.A03
            android.view.View r1 = X.C66581MXm.A0A(r7)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r8 = X.AnonymousClass7TE.A0b(r1, r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            X.POf r11 = new X.POf
            r11.<init>(r2)
            X.OKx r10 = new X.OKx
            r10.<init>(r7)
            X.SJD r6 = new X.SJD
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x03b0:
            java.lang.Object r0 = r1.A01
            X.PMH r0 = (X.PMH) r0
            X.OqZ r6 = new X.OqZ
            r6.<init>(r0)
            return r6
        L_0x03ba:
            java.lang.Object r0 = r1.A01
            X.PMH r0 = (X.PMH) r0
            android.view.View r1 = r0.A02
            r0 = 2131430916(0x7f0b0e04, float:1.8483546E38)
            android.view.ViewGroup r1 = X.DbU.A0C(r1, r0)
            r0 = 0
            android.view.View r6 = r1.getChildAt(r0)
            r0 = 4
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r6, r0)
            return r6
        L_0x03d5:
            java.lang.Object r2 = r1.A01
            X.PMH r2 = (X.PMH) r2
            android.view.View r0 = r2.A02
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.N1V r6 = new X.N1V
            r6.<init>(r0)
            r1 = 0
            X.0eM r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            r0.setIsLongpressEnabled(r1)
            X.POa r0 = new X.POa
            r0.<init>(r2)
            r6.A01 = r0
            X.POY r0 = new X.POY
            r0.<init>(r2)
            r6.A00 = r0
            return r6
        L_0x03ff:
            java.lang.Object r0 = r1.A01
            X.PMH r0 = (X.PMH) r0
            android.view.View r1 = r0.A02
            r0 = 2131429380(0x7f0b0804, float:1.8480431E38)
            android.view.View r6 = r1.requireViewById(r0)
            return r6
        L_0x040d:
            java.lang.Object r0 = r1.A01
            X.Nee r0 = (X.C69099Nee) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 37159344081010784(0x84043a00090060, double:3.563057053275245E-306)
            double r0 = X.182.A00(r2, r3, r0)
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            return r6
        L_0x0423:
            java.lang.Object r0 = r1.A01
            X.PMN r0 = (X.PMN) r0
            android.view.View r1 = r0.A04
            r0 = 2131428963(0x7f0b0663, float:1.8479585E38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x0431:
            X.1YN r17 = X.AnonymousClass2bO.A00()
            java.lang.Object r3 = r1.A01
            X.NeY r3 = (X.C69093NeY) r3
            android.app.Activity r2 = r3.A03
            X.DbS.A1X(r2)
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.0iw r1 = r3.A04
            com.instagram.common.session.UserSession r0 = r3.A05
            com.instagram.quickpromotion.intf.QuickPromotionSlot r22 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0r
            X.AnonymousClass2bO.A00()
            r4 = 0
            X.575 r15 = new X.575
            r15.<init>(r3)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r16 = r4
            X.2bW r21 = X.2bV.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r19 = r1
            r20 = r0
            r18 = r2
            X.Dcb r6 = r17.A00(r18, r19, r20, r21, r22)
            return r6
        L_0x046a:
            java.lang.Object r0 = r1.A01
            X.NeY r0 = (X.C69093NeY) r0
            com.instagram.common.session.UserSession r3 = r0.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 37157956805984325(0x8402f700000045, double:3.5621797349624044E-306)
            double r5 = X.182.A00(r2, r3, r0)
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 * r0
            long r3 = (long) r5
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x048a
            r3 = 3000(0xbb8, double:1.482E-320)
        L_0x048a:
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            return r6
        L_0x048f:
            java.lang.Object r0 = r1.A01
            X.Nei r0 = (X.C69103Nei) r0
            android.app.Activity r0 = r0.A07
            java.lang.Object r6 = X.C66582MXn.A0o(r0)
            return r6
        L_0x049a:
            java.lang.Object r0 = r1.A01
            X.Nei r0 = (X.C69103Nei) r0
            android.app.Activity r1 = r0.A07
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r6 = r1.findViewById(r0)
            return r6
        L_0x04a8:
            java.lang.Object r0 = r1.A01
            X.Nel r0 = (X.C69106Nel) r0
            android.content.Context r1 = r0.A0A
            r0 = 2131969783(0x7f1346f7, float:1.9576499E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            X.9WJ r6 = new X.9WJ
            r6.<init>(r1, r0)
            return r6
        L_0x04bb:
            java.lang.Object r0 = r1.A01
            X.Nel r0 = (X.C69106Nel) r0
            android.content.Context r1 = r0.A0A
            r0 = 2131886099(0x7f120013, float:1.9406767E38)
            X.61R r6 = X.C303756Aq.A00(r1, r0)
            return r6
        L_0x04c9:
            java.lang.Object r0 = r1.A01
            X.Nel r0 = (X.C69106Nel) r0
            android.content.Context r1 = r0.A0A
            r0 = 2131886101(0x7f120015, float:1.9406771E38)
            X.61R r6 = X.C303756Aq.A00(r1, r0)
            return r6
        L_0x04d7:
            java.lang.Object r0 = r1.A01
            X.Nel r0 = (X.C69106Nel) r0
            X.PMQ r0 = r0.A0G
            X.0eM r0 = r0.A0B
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131436060(0x7f0b221c, float:1.849398E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r1, r0)
            return r6
        L_0x04eb:
            java.lang.Object r6 = r1.A01
            android.view.View r6 = (android.view.View) r6
            r6.requestApplyInsets()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73922Pm2.invoke():java.lang.Object");
    }
}
