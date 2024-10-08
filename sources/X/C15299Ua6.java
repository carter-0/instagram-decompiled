package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Ua6  reason: case insensitive filesystem */
public final class C15299Ua6 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BoostPackageFragment";
    public View A00;
    public View A01;
    public C15478UdT A02;
    public C18654Vw9 A03;
    public C18643Vvl A04;
    public IgdsStepperHeader A05;
    public IgRadioGroup A06;
    public SpinnerImageView A07;
    public Exception A08;
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new C20606Wvn(this, 24));
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C20606Wvn(this, 25));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new C20606Wvn(this, 26));
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new C20606Wvn(this, 27));
    public final AnonymousClass0eM A0D = AnonymousClass1YB.A00(new C20606Wvn(this, 28));
    public final AnonymousClass0eM A0E = AnonymousClass1YB.A00(new C20606Wvn(this, 29));
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        C13992Tns.A0r(r3, 2131954017);
        Context context = getContext();
        if (context != null) {
            this.A04 = new C18643Vvl(context, r3);
        }
    }

    public final String getModuleName() {
        return "boost_package_fragment";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, androidx.fragment.app.Fragment, X.Ua6, java.lang.Object, X.4DH] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x002c: MOVE  (r2v18 X.X6R) = (r2v2 X.X6R)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r12 = 0
            r6 = r16
            X.0qQ.A0B(r6, r12)
            r0 = r17
            super.onViewCreated(r6, r0)
            X.0eM r1 = r15.A0G
            java.lang.Object r2 = r1.getValue()
            X.U8z r2 = (X.C14788U8z) r2
            X.VRT r0 = new X.VRT
            r0.<init>(r15)
            r2.A02 = r0
            r0 = 2131435797(0x7f0b2115, float:1.8493446E38)
            android.view.View r0 = r6.findViewById(r0)
            r15.A01 = r0
            androidx.fragment.app.FragmentActivity r2 = r15.getActivity()
            boolean r0 = r2 instanceof X.X6R
            r5 = 0
            if (r0 == 0) goto L_0x0033
            X.X6R r2 = (X.X6R) r2
            if (r2 == 0) goto L_0x0033
            r2.AUk()
        L_0x0033:
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r0 = r6.findViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r15.A07 = r0
            X.0eM r3 = r15.A09
            java.lang.Object r0 = r3.getValue()
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r0 = (com.instagram.business.promote.model.IGBoostPackagesFlowInfo) r0
            java.lang.String r2 = r0.A03
            if (r2 == 0) goto L_0x0056
            r0 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r0 == 0) goto L_0x0056
            r0.setText(r2)
        L_0x0056:
            java.lang.Object r0 = r3.getValue()
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r0 = (com.instagram.business.promote.model.IGBoostPackagesFlowInfo) r0
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x006c
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r0 == 0) goto L_0x006c
            r0.setText(r2)
        L_0x006c:
            r0 = 2131441765(0x7f0b3865, float:1.850555E38)
            android.view.View r0 = r6.findViewById(r0)
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = (com.instagram.igds.components.stepperheader.IgdsStepperHeader) r0
            r15.A05 = r0
            android.view.View r0 = r15.A00
            if (r0 != 0) goto L_0x00ce
            android.view.View r2 = r15.A01
            r4 = 0
            if (r2 == 0) goto L_0x0174
            r0 = 2131431167(0x7f0b0eff, float:1.8484056E38)
            android.view.View r0 = r2.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x0174
            android.view.View r2 = r0.inflate()
        L_0x008f:
            r15.A00 = r2
            if (r2 == 0) goto L_0x0098
            r0 = 39
            X.C18887WAz.A00(r2, r0, r15)
        L_0x0098:
            android.view.View r2 = r15.A00
            if (r2 == 0) goto L_0x00b8
            r0 = 2131440466(0x7f0b3352, float:1.8502916E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r2, r0)
            if (r3 == 0) goto L_0x00b8
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L_0x00b2
            r0 = 2131954015(0x7f13095f, float:1.9544517E38)
            java.lang.String r4 = r2.getString(r0)
        L_0x00b2:
            r3.setText(r4)
            r3.setVisibility(r12)
        L_0x00b8:
            android.view.View r2 = r15.A00
            r3 = 8
            if (r2 == 0) goto L_0x00c4
            r0 = 2131440465(0x7f0b3351, float:1.8502914E38)
            X.DbX.A1D(r2, r0, r3)
        L_0x00c4:
            android.view.View r2 = r15.A00
            if (r2 == 0) goto L_0x00ce
            r0 = 2131440464(0x7f0b3350, float:1.8502912E38)
            X.DbX.A1D(r2, r0, r3)
        L_0x00ce:
            android.content.Context r4 = r15.getContext()
            if (r4 == 0) goto L_0x0171
            X.0eM r0 = r15.A0F
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0hq r2 = r15.getParentFragmentManager()
            X.UdT r0 = new X.UdT
            r0.<init>(r4, r2, r3)
        L_0x00e3:
            r15.A02 = r0
            r0 = 2131442177(0x7f0b3a01, float:1.8506386E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.DbZ.A0F(r6, r0)
            X.UdT r0 = r15.A02
            r2.setAdapter(r0)
            android.content.Context r0 = r2.getContext()
            X.DbV.A1B(r0, r2)
            X.UzE r4 = X.C16678UzE.BOOST_PACKAGES
            X.Vw9 r9 = new X.Vw9
            r9.<init>(r6, r4)
            r15.A03 = r9
            r9.A01()
            androidx.fragment.app.FragmentActivity r6 = r15.getActivity()
            if (r6 == 0) goto L_0x0130
            X.WOS r8 = new X.WOS
            r8.<init>(r15)
            X.0eM r0 = r15.A0F
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r0 = r1.getValue()
            X.U8z r0 = (X.C14788U8z) r0
            com.instagram.api.schemas.XIGIGBoostDestination r7 = r0.A01
            java.lang.Object r0 = r1.getValue()
            X.U8z r0 = (X.C14788U8z) r0
            com.instagram.model.mediatype.ProductType r11 = r0.A09
            r1.getValue()
            r1.getValue()
            r13 = r12
            r14 = r12
            X.C18165Vmf.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0130:
            X.0xx r2 = X.AnonymousClass07a.A00(r15)
            r1 = 42
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r15, (X.AnonymousClass4D7) r5, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            java.lang.Exception r0 = r15.A08
            if (r0 == 0) goto L_0x0167
            X.0eM r0 = r15.A0F
            X.WGU r3 = X.JTU.A0D(r0)
            java.lang.String r2 = r4.toString()
            java.lang.Exception r1 = r15.A08
            r0 = 4109(0x100d, float:5.758E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0Y(r2, r0, r1)
            r15.A08 = r5
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.M1x r2 = new X.M1x
            r2.<init>(r15)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
        L_0x0167:
            X.0eM r0 = r15.A0F
            X.WGU r0 = X.JTU.A0D(r0)
            X.C13988Tno.A1J(r0, r4)
            return
        L_0x0171:
            r0 = r5
            goto L_0x00e3
        L_0x0174:
            r2 = r5
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15299Ua6.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public C15299Ua6() {
        C20606Wvn wvn = new C20606Wvn(this, 33);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20606Wvn(new C20606Wvn(this, 30), 31));
        this.A0G = new C227862kA(new C20606Wvn(A002, 32), wvn, new C41566AwY(3, (Object) null, A002), new 0Yh(C14788U8z.class));
        this.A0F = C227642jf.A02(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0013: MOVE  (r1v2 X.X7g) = (r1v0 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r0 = 1635379555(0x6179e963, float:2.8812853E20)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x0020
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0020
            X.UzE r0 = X.C16678UzE.BOOST_PACKAGES
            java.lang.String r0 = r0.toString()
            r1.Clx(r0)
        L_0x0020:
            r0 = 2131624274(0x7f0e0152, float:1.8875723E38)
            android.view.View r1 = r5.inflate(r0, r6, r2)
            r0 = -973575140(0xffffffffc5f86c1c, float:-7949.5137)
            X.AnonymousClass0fD.A09(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15299Ua6.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1827007624);
        super.onDestroy();
        this.A04 = null;
        AnonymousClass0fD.A09(-2014071649, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1804246287);
        super.onDestroyView();
        this.A01 = null;
        this.A05 = null;
        this.A06 = null;
        this.A00 = null;
        this.A03 = null;
        this.A07 = null;
        this.A02 = null;
        ((C14788U8z) this.A0G.getValue()).A02 = null;
        AnonymousClass0fD.A09(-796676363, A022);
    }
}
