package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

/* renamed from: X.UaT  reason: case insensitive filesystem */
public final class C15321UaT extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, X7h, X6O, X3L, X3S, B1D {
    public static final String __redex_internal_original_name = "PromoteDestinationFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewStub A04;
    public ViewStub A05;
    public WGU A06;
    public C18784W1k A07;
    public C18643Vvl A08;
    public C15684Ugp A09;
    public PromoteData A0A;
    public PromoteState A0B;
    public IgLinearLayout A0C;
    public C252063oV A0D;
    public C252063oV A0E;
    public C252063oV A0F;
    public SpinnerImageView A0G;
    public boolean A0H;
    public WT6 A0I;
    public C18654Vw9 A0J;
    public final AnonymousClass0eM A0K = C227642jf.A02(this);

    public final void DFD() {
    }

    public final void Dab(PromoteState promoteState, Integer num) {
        String str;
        PromoteState promoteState2 = promoteState;
        0qQ.A0B(promoteState, 0);
        int A032 = C51967G9n.A03(num, 1);
        if (A032 == 2 || A032 == 0) {
            A01();
            FragmentActivity requireActivity = requireActivity();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0K);
            XAI requireActivity2 = requireActivity();
            0qQ.A0C(requireActivity2, AnonymousClass000.A00(86));
            ArrayList BHp = requireActivity2.BHp();
            PromoteData promoteData = this.A0A;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                View view = this.A00;
                if (view == null) {
                    str = "mainContainer";
                } else {
                    VAJ.A00(view, requireActivity, promoteData, promoteState2, A0l, BHp);
                    A00();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r1 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 2131970441(0x7f134989, float:1.9577833E38)
            r6.Eom(r0)
            X.3JR r2 = new X.3JR
            r2.<init>()
            com.instagram.business.promote.model.PromoteState r0 = r5.A0B
            if (r0 != 0) goto L_0x001d
            java.lang.String r4 = "promoteState"
        L_0x0015:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001d:
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            java.lang.String r4 = "promoteData"
            if (r0 == 0) goto L_0x0015
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 != 0) goto L_0x0034
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            if (r0 == 0) goto L_0x0015
            boolean r1 = r0.A2t
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            if (r1 == 0) goto L_0x0037
        L_0x0034:
            r0 = 2131237906(0x7f081c12, float:1.8092076E38)
        L_0x0037:
            r2.A01(r0)
            X.3Jb r0 = new X.3Jb
            r0.<init>(r2)
            r6.ErG(r0)
            com.instagram.business.promote.model.PromoteData r1 = r5.A0A
            if (r1 == 0) goto L_0x0015
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A0h
            if (r0 == 0) goto L_0x005c
            com.instagram.common.session.UserSession r3 = r1.A0y
            X.0qQ.A06(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324642956325061(0x810d12000130c5, double:3.035188700952344E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0078
        L_0x005c:
            X.Vvl r3 = X.C18643Vvl.A00(r5, r6)
            r5.A08 = r3
            java.lang.String r4 = "actionBarButtonController"
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r1 = 18
            X.WBB r0 = new X.WBB
            r0.<init>(r5, r1)
            r3.A01(r0, r2)
            X.Vvl r1 = r5.A08
            if (r1 == 0) goto L_0x0015
            r0 = 1
            r1.A02(r0)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15321UaT.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "promote_destination";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0476: MOVE  (r2v31 X.X7g) = (r2v30 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0263  */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r7 = 0
            r1 = r20
            X.0qQ.A0B(r1, r7)
            r0 = 2131435794(0x7f0b2112, float:1.849344E38)
            android.view.ViewStub r2 = X.DbU.A0D(r1, r0)
            r0 = r19
            r0.A05 = r2
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = X.DbX.A0k(r1)
            r0.A0G = r2
            com.instagram.business.promote.model.PromoteState r2 = r0.A0B
            java.lang.String r18 = "promoteState"
            if (r2 == 0) goto L_0x03c3
            r2.A0A(r0)
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.0qQ.A0C(r3, r2)
            com.instagram.base.activity.BaseFragmentActivity r3 = (com.instagram.base.activity.BaseFragmentActivity) r3
            r3.A0a()
            android.view.ViewStub r2 = r0.A05
            r8 = 0
            if (r2 != 0) goto L_0x003d
            java.lang.String r17 = "mainContainerStub"
        L_0x0035:
            X.0qQ.A0F(r17)
        L_0x0038:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            android.view.View r3 = r2.inflate()
            r0.A00 = r3
            java.lang.String r16 = "mainContainer"
            if (r3 == 0) goto L_0x0466
            r2 = 2131441765(0x7f0b3865, float:1.850555E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r3, r2)
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r5 = (com.instagram.igds.components.stepperheader.IgdsStepperHeader) r5
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0466
            r2 = 2131433769(0x7f0b1929, float:1.8489333E38)
            android.view.ViewStub r2 = X.DbU.A0D(r3, r2)
            r0.A04 = r2
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0466
            r2 = 2131438711(0x7f0b2c77, float:1.8499357E38)
            android.view.View r2 = r3.requireViewById(r2)
            r0.A01 = r2
            if (r2 != 0) goto L_0x006f
            java.lang.String r17 = "previewHolder"
            goto L_0x0035
        L_0x006f:
            r6 = 2131438006(0x7f0b29b6, float:1.8497927E38)
            X.3oV r2 = X.DbU.A0Y(r2, r6)
            r0.A0D = r2
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0466
            r2 = 2131438712(0x7f0b2c78, float:1.8499359E38)
            android.view.View r2 = r3.requireViewById(r2)
            r0.A02 = r2
            if (r2 == 0) goto L_0x01d0
            android.view.View r3 = r2.findViewById(r6)
        L_0x008b:
            java.lang.String r4 = X.AnonymousClass000.A00(r7)
            X.0qQ.A0C(r3, r4)
            X.3oV r2 = X.2b1.A01(r3, r7, r7)
            r0.A0E = r2
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0466
            r2 = 2131438713(0x7f0b2c79, float:1.849936E38)
            android.view.View r2 = r3.requireViewById(r2)
            r0.A03 = r2
            if (r2 == 0) goto L_0x01cd
            android.view.View r2 = r2.findViewById(r6)
        L_0x00ab:
            X.0qQ.A0C(r2, r4)
            X.3oV r2 = X.2b1.A01(r2, r7, r7)
            r0.A0F = r2
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0466
            r2 = 2131442793(0x7f0b3c69, float:1.8507636E38)
            android.view.View r2 = r3.requireViewById(r2)
            com.instagram.common.ui.base.IgLinearLayout r2 = (com.instagram.common.ui.base.IgLinearLayout) r2
            r0.A0C = r2
            com.instagram.business.promote.model.PromoteState r2 = r0.A0B
            if (r2 == 0) goto L_0x03c3
            com.instagram.business.promote.model.PromoteData r2 = r0.A0A
            java.lang.String r17 = "promoteData"
            if (r2 == 0) goto L_0x0035
            boolean r2 = com.instagram.business.promote.model.PromoteState.A02(r2)
            if (r2 != 0) goto L_0x01c6
            com.instagram.business.promote.model.PromoteData r2 = r0.A0A
            if (r2 == 0) goto L_0x0035
            com.instagram.business.promote.model.PromoteLaunchOrigin r3 = r2.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r2 = com.instagram.business.promote.model.PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE
            if (r3 == r2) goto L_0x01c6
            r4 = 4
            r3 = 1
            boolean r2 = r0.A0H
            r5.A03(r7, r4, r3, r2)
        L_0x00e4:
            com.instagram.business.promote.model.PromoteData r2 = r0.A0A
            if (r2 == 0) goto L_0x0035
            X.UyC r3 = r2.A12
            X.UyC r2 = X.C16616UyC.BOOSTED_ELIGIBLE
            if (r3 != r2) goto L_0x0177
            android.view.ViewStub r2 = r0.A04
            if (r2 == 0) goto L_0x01c3
            android.view.View r9 = r2.inflate()
            if (r9 == 0) goto L_0x00fb
            r9.setVisibility(r7)
        L_0x00fb:
            X.WGU r11 = r0.A06
            if (r11 == 0) goto L_0x0131
            X.UzE r10 = X.C16678UzE.OBJECTIVE
            com.instagram.business.promote.model.PromoteData r2 = r0.A0A
            if (r2 == 0) goto L_0x0035
            X.UyC r3 = r2.A12
            java.lang.String r6 = "multi_boost_banner"
            com.facebook.common.callercontext.CallerContext r2 = X.WGU.A07
            X.UGS r4 = new X.UGS
            r4.<init>()
            X.C13990Tnq.A18(r4, r11)
            if (r3 == 0) goto L_0x011e
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = "media_boosted_status"
            r4.A06(r2, r3)
        L_0x011e:
            X.0wc r3 = r11.A05
            java.lang.String r2 = "promoted_posts_view_component"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r2)
            java.lang.String r2 = "component"
            r3.AAJ(r2, r6)
            X.C13990Tnq.A10(r3, r11, r10)
            X.C13988Tno.A18(r3, r4)
        L_0x0131:
            if (r9 == 0) goto L_0x0177
            r2 = 2131433771(0x7f0b192b, float:1.8489337E38)
            android.widget.TextView r6 = X.AnonymousClass7TE.A0d(r9, r2)
            if (r6 == 0) goto L_0x0163
            com.instagram.business.promote.model.PromoteData r2 = r0.A0A
            if (r2 == 0) goto L_0x0035
            com.instagram.model.mediatype.ProductType r2 = r2.A17
            if (r2 == 0) goto L_0x0153
            int r3 = r2.ordinal()
            r2 = 13
            if (r3 == r2) goto L_0x01bf
            r2 = 9
            r4 = 2131970793(0x7f134ae9, float:1.9578547E38)
            if (r3 == r2) goto L_0x0156
        L_0x0153:
            r4 = 2131970549(0x7f1349f5, float:1.9578052E38)
        L_0x0156:
            java.lang.String r3 = r0.getString(r4)
            X.0qQ.A0A(r3)
            r2 = 2131970583(0x7f134a17, float:1.9578121E38)
            X.DbX.A1F(r6, r0, r3, r2)
        L_0x0163:
            r2 = 2131433770(0x7f0b192a, float:1.8489335E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r9, r2)
            if (r3 == 0) goto L_0x0177
            r2 = 2131970582(0x7f134a16, float:1.957812E38)
            X.DbU.A1G(r3, r0, r2)
            r2 = 20
            X.WBB.A01(r3, r2, r0)
        L_0x0177:
            r0.A01()
            r5.A01()
            A02(r0)
            X.0eM r6 = r0.A0K
            X.1Av r2 = X.DbX.A0h(r6)
            long r12 = java.lang.System.currentTimeMillis()
            X.0xa r4 = r2.A01
            java.lang.String r9 = "promote_meta_pro_banner_last_seen_timestamp"
            r2 = 0
            long r4 = r4.getLong(r9, r2)
            long r12 = r12 - r4
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            r4 = 7
            long r10 = r10.toMillis(r4)
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            boolean r5 = X.Pxf.A1R(r4)
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            com.instagram.api.schemas.DEPProgramLevelContentResponse r4 = r4.A0R
            if (r4 == 0) goto L_0x01bd
            boolean r4 = r4.A03
        L_0x01ad:
            if (r5 == 0) goto L_0x02bb
            if (r4 == 0) goto L_0x02bb
            X.1Av r13 = X.DbX.A0h(r6)
            android.view.View r5 = r0.A00
            if (r5 != 0) goto L_0x01d3
            r17 = r16
            goto L_0x0035
        L_0x01bd:
            r4 = 0
            goto L_0x01ad
        L_0x01bf:
            r4 = 2131970696(0x7f134a88, float:1.957835E38)
            goto L_0x0156
        L_0x01c3:
            r9 = r8
            goto L_0x00fb
        L_0x01c6:
            r2 = 8
            r5.setVisibility(r2)
            goto L_0x00e4
        L_0x01cd:
            r2 = r8
            goto L_0x00ab
        L_0x01d0:
            r3 = r8
            goto L_0x008b
        L_0x01d3:
            r4 = 2131428886(0x7f0b0616, float:1.847943E38)
            android.view.ViewStub r4 = X.JTR.A0X(r5, r4)
            android.view.View r11 = r4.inflate()
            r4 = 8
            r11.setVisibility(r4)
            r4 = 2131434790(0x7f0b1d26, float:1.8491404E38)
            android.widget.ImageView r10 = X.DbX.A0J(r11, r4)
            android.content.Context r5 = r0.requireContext()
            r4 = 2131237543(0x7f081aa7, float:1.809134E38)
            X.DbU.A13(r5, r10, r4)
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            com.instagram.api.schemas.DEPProgramLevelContentResponse r5 = r4.A0R
            r4 = 2131428889(0x7f0b0619, float:1.8479435E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r11, r4)
            if (r5 == 0) goto L_0x0451
            java.lang.String r12 = r5.A02
            java.lang.String r5 = r5.A00
            if (r12 == 0) goto L_0x0451
            if (r5 == 0) goto L_0x0451
            r4 = 2131428891(0x7f0b061b, float:1.847944E38)
            X.DbX.A1E(r11, r12, r4)
            r10.setText(r5)
        L_0x0214:
            r4 = 19
            X.WBB.A01(r10, r4, r0)
            r11.setVisibility(r7)
            long r4 = java.lang.System.currentTimeMillis()
            X.0xY r10 = X.AnonymousClass7TE.A0p(r13)
            r10.E5c(r9, r4)
            r10.apply()
            X.0lg r9 = X.AnonymousClass7TF.A0L(r6, r7)
            r4 = 20
            X.WxQ r5 = new X.WxQ
            r5.<init>(r9, r4)
            java.lang.Class<X.VMU> r4 = X.VMU.class
            java.lang.Object r12 = r9.A01(r4, r5)
            X.VMU r12 = (X.VMU) r12
            X.UGV r10 = new X.UGV
            r10.<init>()
            java.lang.String r5 = "banner"
            java.lang.String r4 = "event_target"
            r10.A06(r4, r5)
            java.lang.String r5 = "IG_APP"
            java.lang.String r4 = "surface"
            r10.A06(r4, r5)
            java.lang.String r5 = "IG_BOOST"
            java.lang.String r4 = "entry_point"
            r10.A06(r4, r5)
            java.lang.String r5 = "ig_boost"
            java.lang.String r4 = "lead_source"
            r10.A06(r4, r5)
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            r11 = 0
            if (r4 == 0) goto L_0x0035
            com.instagram.api.schemas.DEPProgramLevelContentResponse r4 = r4.A0R
            if (r4 == 0) goto L_0x026b
            java.lang.String r5 = r4.A01
            if (r5 != 0) goto L_0x026d
        L_0x026b:
            java.lang.String r5 = ""
        L_0x026d:
            java.util.Locale r4 = java.util.Locale.ROOT
            X.0qQ.A08(r4)
            java.lang.String r14 = X.Pxf.A0n(r4, r5)
            X.V1O[] r13 = X.V1O.values()
            r9 = 0
            int r5 = r13.length
        L_0x027c:
            if (r9 >= r5) goto L_0x028b
            r15 = r13[r9]
            java.lang.String r4 = r15.name()
            boolean r4 = X.0qQ.A0K(r4, r14)
            if (r4 == 0) goto L_0x044d
            r11 = r15
        L_0x028b:
            X.UGW r9 = new X.UGW
            r9.<init>()
            java.lang.String r4 = "program"
            r9.A01(r11, r4)
            X.0wc r5 = r12.A00
            java.lang.String r4 = "sbg_engagement_entry_point_impression"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r4)
            boolean r4 = r5.isSampled()
            if (r4 == 0) goto L_0x02b0
            java.lang.String r4 = "event_data"
            r5.AAK(r10, r4)
            java.lang.String r4 = "extra_data"
            r5.AAK(r9, r4)
            r5.Cgf()
        L_0x02b0:
            X.WGU r9 = r0.A06
            if (r9 == 0) goto L_0x02bb
            X.UzE r5 = X.C16678UzE.OBJECTIVE
            java.lang.String r4 = "call_center_bottom_banner"
            r9.A0H(r5, r4)
        L_0x02bb:
            androidx.fragment.app.FragmentActivity r10 = r0.requireActivity()
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            r4 = 86
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.0qQ.A0C(r5, r4)
            X.XAI r5 = (X.XAI) r5
            java.util.ArrayList r14 = r5.BHp()
            com.instagram.business.promote.model.PromoteData r11 = r0.A0A
            if (r11 == 0) goto L_0x0035
            com.instagram.business.promote.model.PromoteState r12 = r0.A0B
            if (r12 == 0) goto L_0x03c3
            android.view.View r9 = r0.A00
            if (r9 == 0) goto L_0x0466
            X.VAJ.A00(r9, r10, r11, r12, r13, r14)
            X.1Av r4 = X.DbX.A0h(r6)
            r9 = 1
            X.0xa r10 = r4.A01
            X.0xY r4 = r10.AR4()
            java.lang.String r5 = "has_seen_promote_nux"
            r4.E5T(r5, r9)
            r4.apply()
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            boolean r4 = r4.A2U
            if (r4 != 0) goto L_0x0354
            boolean r4 = r10.getBoolean(r5, r7)
            if (r4 == 0) goto L_0x030e
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            boolean r4 = r4.A2D
            if (r4 == 0) goto L_0x0354
        L_0x030e:
            boolean r4 = r10.getBoolean(r5, r7)
            if (r4 != 0) goto L_0x031f
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            boolean r4 = r4.A2D
            if (r4 != 0) goto L_0x031f
            X.DbX.A1V(r10, r5, r9)
        L_0x031f:
            X.C13990Tnq.A0h()
            X.UZM r10 = new X.UZM
            r10.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            X.UzE r5 = X.C16678UzE.OBJECTIVE
            java.lang.String r4 = "step"
            r7.putSerializable(r4, r5)
            java.lang.String r4 = "is_enter_flow_nux"
            r7.putBoolean(r4, r9)
            r10.setArguments(r7)
            X.6Yo r9 = X.DbZ.A0P(r0, r6)
            r9.A0B(r8, r10)
            r7 = 2130771974(0x7f010006, float:1.7147053E38)
            r6 = 2130772120(0x7f010098, float:1.714735E38)
            r5 = 2130772119(0x7f010097, float:1.7147347E38)
            r4 = 2130771975(0x7f010007, float:1.7147055E38)
            r9.A0A(r7, r6, r5, r4)
            r9.A07()
        L_0x0354:
            com.instagram.business.promote.model.PromoteData r5 = r0.A0A
            if (r5 == 0) goto L_0x0035
            com.instagram.api.schemas.XIGIGBoostDestination r6 = r5.A0g
            if (r6 == 0) goto L_0x0406
            java.lang.String r4 = r5.A1W
            if (r4 == 0) goto L_0x0406
            com.instagram.api.schemas.XIGIGBoostCallToAction r4 = r5.A0c
            if (r4 == 0) goto L_0x0406
            com.instagram.api.schemas.XIGIGBoostDestination r4 = r5.A0i
            if (r6 != r4) goto L_0x0406
            X.WGU r5 = r0.A06
            if (r5 == 0) goto L_0x03a5
            X.UzE r4 = X.C16678UzE.OBJECTIVE
            java.lang.String r10 = r4.toString()
            java.lang.String r11 = java.lang.String.valueOf(r6)
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            java.lang.String r4 = r4.A1W
            if (r4 == 0) goto L_0x0403
            java.lang.String r12 = X.DbY.A0j(r4)
        L_0x0382:
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            com.instagram.api.schemas.XIGIGBoostCallToAction r4 = r4.A0c
            java.lang.String r13 = java.lang.String.valueOf(r4)
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            com.instagram.api.schemas.XIGIGBoostDestination r4 = r4.A0h
            java.lang.String r15 = java.lang.String.valueOf(r4)
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            com.instagram.api.schemas.DestinationRecommendationReason r4 = r4.A0S
            java.lang.String r16 = java.lang.String.valueOf(r4)
            r9 = r5
            r14 = r8
        L_0x03a2:
            r9.A0X(r10, r11, r12, r13, r14, r15, r16)
        L_0x03a5:
            X.UzE r6 = X.C16678UzE.OBJECTIVE
            X.Vw9 r4 = new X.Vw9
            r4.<init>(r1, r6)
            r0.A0J = r4
            r4.A01()
            X.Vw9 r8 = r0.A0J
            if (r8 == 0) goto L_0x0484
            android.content.Context r7 = r0.requireContext()
            com.instagram.business.promote.model.PromoteState r4 = r0.A0B
            if (r4 == 0) goto L_0x03c3
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 != 0) goto L_0x03c8
            r18 = r17
        L_0x03c3:
            X.0qQ.A0F(r18)
            goto L_0x0038
        L_0x03c8:
            boolean r5 = com.instagram.business.promote.model.PromoteState.A02(r4)
            r4 = 2131970410(0x7f13496a, float:1.957777E38)
            if (r5 == 0) goto L_0x03d4
            r4 = 2131970439(0x7f134987, float:1.957783E38)
        L_0x03d4:
            java.lang.String r4 = r7.getString(r4)
            X.C18165Vmf.A01(r0, r8, r4)
            r0.A00()
            r4 = r21
            super.onViewCreated(r1, r4)
            X.WT6 r7 = r0.A0I
            if (r7 != 0) goto L_0x03ea
            java.lang.String r18 = "userFlowLogger"
            goto L_0x03c3
        L_0x03ea:
            long r4 = r7.A00
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x03fc
            X.1QP r3 = r7.A01
            java.lang.String r1 = "promote_goal_screen_rendered"
            r3.flowMarkPoint(r4, r1)
            long r1 = r7.A00
            r3.flowEndSuccess(r1)
        L_0x03fc:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r0.A0G
            if (r1 != 0) goto L_0x046b
            java.lang.String r18 = "loadingSpinner"
            goto L_0x03c3
        L_0x0403:
            r12 = r8
            goto L_0x0382
        L_0x0406:
            boolean r4 = r5.A2g
            if (r4 != 0) goto L_0x0416
            boolean r4 = r5.A2i
            if (r4 != 0) goto L_0x0416
            com.instagram.api.schemas.XIGIGBoostDestination r4 = r5.A0h
            if (r4 == 0) goto L_0x0442
            com.instagram.api.schemas.DestinationRecommendationReason r4 = r5.A0S
            if (r4 == 0) goto L_0x0442
        L_0x0416:
            X.WGU r6 = r0.A06
            if (r6 == 0) goto L_0x03a5
            X.UzE r4 = X.C16678UzE.OBJECTIVE
            java.lang.String r10 = r4.toString()
            com.instagram.api.schemas.XIGIGBoostDestination r4 = r5.A0i
            java.lang.String r11 = java.lang.String.valueOf(r4)
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            java.lang.String r5 = r4.A1E
            com.instagram.api.schemas.XIGIGBoostDestination r4 = r4.A0h
            java.lang.String r15 = java.lang.String.valueOf(r4)
            com.instagram.business.promote.model.PromoteData r4 = r0.A0A
            if (r4 == 0) goto L_0x0035
            com.instagram.api.schemas.DestinationRecommendationReason r4 = r4.A0S
            java.lang.String r16 = java.lang.String.valueOf(r4)
            r9 = r6
            r12 = r8
            r13 = r8
            r14 = r5
            goto L_0x03a2
        L_0x0442:
            X.WGU r5 = r0.A06
            if (r5 == 0) goto L_0x03a5
            X.UzE r4 = X.C16678UzE.OBJECTIVE
            X.C13988Tno.A1J(r5, r4)
            goto L_0x03a5
        L_0x044d:
            int r9 = r9 + 1
            goto L_0x027c
        L_0x0451:
            r4 = 2131428891(0x7f0b061b, float:1.847944E38)
            android.widget.TextView r5 = X.DbU.A0G(r11, r4)
            r4 = 2131963544(0x7f132e98, float:1.9563844E38)
            r5.setText(r4)
            r4 = 2131963543(0x7f132e97, float:1.9563842E38)
            r10.setText(r4)
            goto L_0x0214
        L_0x0466:
            X.0qQ.A0F(r16)
            goto L_0x0038
        L_0x046b:
            X.JTO.A1X(r1)
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            boolean r0 = r2 instanceof X.X7g
            if (r0 == 0) goto L_0x0483
            X.X7g r2 = (X.X7g) r2
            if (r2 == 0) goto L_0x0483
            java.lang.String r1 = "promote_destination"
            java.lang.String r0 = r6.toString()
            r2.Clv(r1, r0)
        L_0x0483:
            return
        L_0x0484:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15321UaT.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        boolean z;
        C18654Vw9 vw9 = this.A0J;
        if (vw9 != null) {
            PromoteData promoteData = this.A0A;
            String str = "promoteData";
            if (promoteData != null) {
                if (AnonymousClass9F0.A04(promoteData)) {
                    PromoteData promoteData2 = this.A0A;
                    if (promoteData2 != null) {
                        XIGIGBoostDestination xIGIGBoostDestination = promoteData2.A0i;
                        if (xIGIGBoostDestination != null && xIGIGBoostDestination == XIGIGBoostDestination.DIRECT_MESSAGE && promoteData2.A0j == null) {
                            z = false;
                            vw9.A04(z);
                            return;
                        }
                    }
                }
                PromoteState promoteState = this.A0B;
                if (promoteState == null) {
                    str = "promoteState";
                } else {
                    z = promoteState.A05;
                    vw9.A04(z);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        if (r2 != 2) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0479, code lost:
        if (r10 == false) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04b1, code lost:
        if (r7.A2C != false) goto L_0x04b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        if (r8 == 5) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x055f, code lost:
        if (X.182.A06(r8, r3, 36324642956259524L) != false) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x058b, code lost:
        if (r1 != null) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05a9, code lost:
        if (r0 != false) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05d5, code lost:
        r0 = X.182.A06(r8, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05e5, code lost:
        if (r0 != false) goto L_0x04b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0601, code lost:
        if (r0.isEmpty() == false) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c2, code lost:
        if (r11 == 5) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026c, code lost:
        if (r8 == 5) goto L_0x026e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x025f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x028a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C15321UaT r31) {
        /*
            r0 = r31
            android.view.View r1 = r0.A00
            if (r1 != 0) goto L_0x0010
            java.lang.String r0 = "mainContainer"
        L_0x0008:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0010:
            com.instagram.business.promote.model.PromoteData r7 = r0.A0A
            if (r7 != 0) goto L_0x0017
            java.lang.String r0 = "promoteData"
            goto L_0x0008
        L_0x0017:
            com.instagram.business.promote.model.PromoteState r6 = r0.A0B
            if (r6 != 0) goto L_0x001e
            java.lang.String r0 = "promoteState"
            goto L_0x0008
        L_0x001e:
            androidx.fragment.app.FragmentActivity r12 = r31.requireActivity()
            r21 = 0
            com.instagram.common.session.UserSession r0 = r7.A0y
            r30 = r0
            X.0eE r2 = X.AnonymousClass0t1.A01
            X.0qQ.A0A(r30)
            com.instagram.user.model.User r0 = r2.A01(r0)
            java.lang.String r20 = r0.getUsername()
            r16 = 0
            X.U5O r19 = new X.U5O
            r0 = r19
            r0.<init>(r12)
            X.U5O r5 = new X.U5O
            r5.<init>(r12)
            X.U5O r4 = new X.U5O
            r4.<init>(r12)
            X.U5O r3 = new X.U5O
            r3.<init>(r12)
            X.U5O r10 = new X.U5O
            r10.<init>(r12)
            X.UjH r0 = new X.UjH
            r0.<init>(r12)
            r0 = 2131431447(0x7f0b1017, float:1.8484623E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r1, r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r9 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r9
            com.instagram.api.schemas.XIGIGBoostDestination r1 = com.instagram.api.schemas.XIGIGBoostDestination.POST_ENGAGEMENT
            r0 = r19
            r0.setTag(r1)
            r1 = 2131953989(0x7f130945, float:1.9544465E38)
            r0.setPrimaryText((int) r1)
            com.instagram.common.session.UserSession r0 = r7.A0y
            X.0qQ.A06(r0)
            int r2 = X.C18803W2r.A01(r0)
            if (r2 == 0) goto L_0x0081
            r0 = 1
            if (r2 == r0) goto L_0x0081
            r0 = 2
            r1 = 2131970373(0x7f134945, float:1.9577695E38)
            if (r2 == r0) goto L_0x0084
        L_0x0081:
            r1 = 2131970372(0x7f134944, float:1.9577693E38)
        L_0x0084:
            r0 = r19
            r0.setPrimaryTextDescription((int) r1)
            r2 = 1
            r19.A02()
            com.instagram.api.schemas.XIGIGBoostDestination r18 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            r0 = r18
            r5.setTag(r0)
            com.instagram.common.session.UserSession r11 = r7.A0y
            X.0qQ.A06(r11)
            int r1 = X.C18803W2r.A01(r11)
            if (r1 == r2) goto L_0x044f
            r0 = 2
            if (r1 == r0) goto L_0x044f
            int r8 = X.C18803W2r.A00(r11)
            r0 = 4
            if (r8 == r0) goto L_0x00af
            r1 = 5
            r0 = 2131970413(0x7f13496d, float:1.9577776E38)
            if (r8 != r1) goto L_0x00b2
        L_0x00af:
            r0 = 2131953990(0x7f130946, float:1.9544467E38)
        L_0x00b2:
            java.lang.String r1 = X.C51967G9n.A0p(r12, r0)
        L_0x00b6:
            r5.setPrimaryText((java.lang.CharSequence) r1)
            com.instagram.common.session.UserSession r13 = r7.A0y
            X.0qQ.A06(r13)
            int r8 = X.C18803W2r.A01(r13)
            if (r8 == r2) goto L_0x0436
            r0 = 2
            if (r8 == r0) goto L_0x0432
            int r8 = X.C18803W2r.A00(r13)
            if (r8 == 0) goto L_0x0436
            if (r8 == r2) goto L_0x0436
            if (r8 == r0) goto L_0x00da
            r0 = 3
            if (r8 == r0) goto L_0x043a
            r0 = 4
            if (r8 == r0) goto L_0x00da
            r0 = 5
            if (r8 == r0) goto L_0x043a
        L_0x00da:
            X.W1e r22 = X.WGS.A00
            r8 = 64
            r0 = r20
            java.lang.String r25 = X.002.A0D(r0, r8)
            java.util.List r13 = r7.A1q
            X.0qQ.A06(r13)
            java.util.Set r8 = r7.A24
            X.0qQ.A06(r8)
            java.lang.String r0 = r7.A1X
            r26 = r0
            r27 = r13
            r28 = r8
            r29 = r2
            r23 = r12
            r24 = r7
            java.lang.String r0 = r22.A06(r23, r24, r25, r26, r27, r28, r29)
            r5.setSecondaryText((java.lang.String) r0)
            java.util.List r0 = r7.A1q
            X.0qQ.A06(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0134
            X.C13990Tnq.A0h()
            r0 = r21
            android.os.Bundle r13 = X.DbV.A0B(r1, r0)
            java.lang.String r0 = "profile_visit_primary_text"
            r13.putString(r0, r1)
            X.UZZ r8 = new X.UZZ
            r8.<init>()
            r8.setArguments(r13)
            r0 = 6
            X.WB4 r1 = new X.WB4
            r1.<init>(r0, r12, r8, r7)
            r0 = 2131970468(0x7f1349a4, float:1.9577888E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r12, r0)
            r5.setActionLabel(r0, r11, r1)
        L_0x0134:
            r13 = 2
            X.Weq r0 = new X.Weq
            r24 = r13
            r25 = r12
            r26 = r7
            r27 = r5
            r28 = r6
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28)
            r5.A9W(r0)
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r7.A0h
            r0 = r18
            if (r1 != r0) goto L_0x01a3
            boolean r0 = r7.A2C
            if (r0 != 0) goto L_0x01a3
            com.instagram.common.session.UserSession r14 = r7.A0y
            X.0Tu r8 = X.0Tu.A05
            r0 = 36326979418470502(0x810f3200003866, double:3.036666289021299E-306)
            boolean r0 = X.DbY.A1Y(r8, r14, r0)
            if (r0 == 0) goto L_0x016e
            boolean r0 = X.W3T.A04(r7)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = X.W3T.A05(r7)
            if (r0 != 0) goto L_0x01a3
        L_0x016e:
            r0 = 36324642956325061(0x810d12000130c5, double:3.035188700952344E-306)
            boolean r0 = X.182.A06(r8, r11, r0)
            if (r0 == 0) goto L_0x0405
            java.lang.String r11 = "boost_objective_recommendation_pill_pv"
            r15 = 2131970414(0x7f13496e, float:1.9577778E38)
            com.instagram.common.session.UserSession r8 = r7.A0y
            X.0qQ.A06(r8)
            r14 = 5
            X.WB4 r1 = new X.WB4
            r0 = r18
            r1.<init>(r14, r12, r0, r7)
            r5.setRecommendedButton(r8, r12, r15, r1)
        L_0x018e:
            X.WGU r14 = X.WGU.A00(r8)
            X.UzE r8 = X.C16678UzE.OBJECTIVE
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r7.A0h
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.instagram.api.schemas.DestinationRecommendationReason r0 = r7.A0S
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.A0K(r8, r11, r1, r0)
        L_0x01a3:
            com.instagram.api.schemas.XIGIGBoostDestination r17 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            r0 = r17
            r4.setTag(r0)
            com.instagram.common.session.UserSession r1 = r7.A0y
            X.0qQ.A06(r1)
            int r0 = X.C18803W2r.A01(r1)
            if (r0 == r2) goto L_0x03fc
            if (r0 == r13) goto L_0x03fc
            int r11 = X.C18803W2r.A00(r1)
            r0 = 4
            if (r11 == r0) goto L_0x01c4
            r8 = 5
            r0 = 2131970449(0x7f134991, float:1.957785E38)
            if (r11 != r8) goto L_0x01c7
        L_0x01c4:
            r0 = 2131953993(0x7f130949, float:1.9544473E38)
        L_0x01c7:
            java.lang.String r0 = X.C51967G9n.A0p(r12, r0)
        L_0x01cb:
            r4.setPrimaryText((java.lang.CharSequence) r0)
            com.instagram.common.session.UserSession r8 = r7.A0y
            X.0qQ.A06(r8)
            int r0 = X.C18803W2r.A01(r8)
            if (r0 == r2) goto L_0x03e3
            if (r0 == r13) goto L_0x03df
            int r8 = X.C18803W2r.A00(r8)
            if (r8 == 0) goto L_0x03e3
            if (r8 == r2) goto L_0x03e3
            if (r8 == r13) goto L_0x01ee
            r0 = 3
            if (r8 == r0) goto L_0x03e7
            r0 = 4
            if (r8 == r0) goto L_0x01ee
            r0 = 5
            if (r8 == r0) goto L_0x03e7
        L_0x01ee:
            java.lang.String r8 = r7.A1I
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r7.A0b
            r23 = r12
            r24 = r0
            r25 = r7
            r26 = r4
            r27 = r8
            java.lang.String r8 = r22.A04(r23, r24, r25, r26, r27)
            boolean r0 = r7.A2K
            if (r0 == 0) goto L_0x0212
            com.instagram.api.schemas.XIGIGBoostCallToAction r8 = com.instagram.api.schemas.XIGIGBoostCallToAction.SHOP_NOW
            r7.A0b = r8
            java.lang.String r0 = r7.A1I
            r24 = r8
            r27 = r0
            java.lang.String r8 = r22.A03(r23, r24, r25, r26, r27)
        L_0x0212:
            if (r8 == 0) goto L_0x021d
            int r0 = r8.length()
            if (r0 == 0) goto L_0x021d
            r4.setSecondaryText((java.lang.String) r8)
        L_0x021d:
            r0 = 44
            X.WBH r8 = new X.WBH
            r8.<init>((androidx.fragment.app.FragmentActivity) r12, (com.instagram.business.promote.model.PromoteData) r7, (int) r0)
            r0 = 2131970468(0x7f1349a4, float:1.9577888E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r12, r0)
            r4.setActionLabel(r0, r1, r8)
            r4.setSubtitleContainerOnClickListener(r8)
            r0 = 2131970825(0x7f134b09, float:1.9578612E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r12, r0)
            r4.setWarningText(r0)
            r0 = 2131970361(0x7f134939, float:1.957767E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r12, r0)
            r4.setSecondaryWarningText(r0)
            X.Wen r1 = new X.Wen
            r0 = r21
            r1.<init>(r0, r7, r4)
            r4.A9W(r1)
            com.instagram.api.schemas.XIGIGBoostDestination r11 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            r3.setTag(r11)
            com.instagram.common.session.UserSession r1 = r7.A0y
            X.0qQ.A06(r1)
            int r0 = X.C18803W2r.A01(r1)
            if (r0 == r2) goto L_0x03d6
            if (r0 == r13) goto L_0x03d6
            int r8 = X.C18803W2r.A00(r1)
            r0 = 4
            if (r8 == r0) goto L_0x026e
            r1 = 5
            r0 = 2131970370(0x7f134942, float:1.957769E38)
            if (r8 != r1) goto L_0x0271
        L_0x026e:
            r0 = 2131953985(0x7f130941, float:1.9544456E38)
        L_0x0271:
            java.lang.String r0 = X.C51967G9n.A0p(r12, r0)
        L_0x0275:
            r3.setPrimaryText((java.lang.CharSequence) r0)
            com.instagram.common.session.UserSession r14 = r7.A0y
            X.0qQ.A06(r14)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36328748944997957(0x8110ce00003e45, double:3.037785344722573E-306)
            boolean r0 = X.182.A06(r8, r14, r0)
            if (r0 == 0) goto L_0x03aa
            r0 = 36328748945063494(0x8110ce00013e46, double:3.0377853447640186E-306)
            boolean r1 = X.182.A06(r8, r14, r0)
            r0 = 2131953988(0x7f130944, float:1.9544463E38)
            if (r1 == 0) goto L_0x029b
            r0 = 2131953984(0x7f130940, float:1.9544454E38)
        L_0x029b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x02ab
            int r0 = r0.intValue()
            r3.setPrimaryTextDescription((int) r0)
            r3.A02()
        L_0x02ab:
            r0 = r30
            X.W3T.A02(r12, r7, r3, r0)
            boolean r0 = r7.A2h
            r3.A04(r0)
            X.WA8 r0 = new X.WA8
            r23 = r2
            r24 = r12
            r25 = r3
            r26 = r30
            r27 = r7
            r28 = r6
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28)
            X.AnonymousClass0fU.A00(r0, r3)
            X.Wes r0 = new X.Wes
            r23 = r12
            r24 = r7
            r25 = r6
            r26 = r3
            r27 = r30
            r28 = r20
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r3.A9W(r0)
            boolean r0 = r7.A2h
            if (r0 == 0) goto L_0x0306
            r0 = 36316585597604358(0x8105be00001206, double:3.030093194852992E-306)
            r13 = r30
            boolean r0 = X.182.A06(r8, r13, r0)
            if (r0 == 0) goto L_0x0306
            java.util.List r0 = r7.A1p
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x0306
            java.util.List r0 = r7.A1p
            r0.remove(r11)
            java.util.List r1 = r7.A1p
            r0 = r21
            r1.add(r0, r11)
        L_0x0306:
            com.instagram.api.schemas.XIGIGBoostDestination r13 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            r10.setTag(r13)
            r0 = 2131970377(0x7f134949, float:1.9577703E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r12, r0)
            r10.setPrimaryText((java.lang.CharSequence) r0)
            r0 = 2131970577(0x7f134a11, float:1.957811E38)
            java.lang.String r15 = X.AnonymousClass7TE.A16(r12, r0)
            com.instagram.common.session.UserSession r14 = r7.A0y
            r1 = 43
            X.WBH r0 = new X.WBH
            r0.<init>((androidx.fragment.app.FragmentActivity) r12, (com.instagram.business.promote.model.PromoteData) r7, (int) r1)
            r10.setActionLabel(r15, r14, r0)
            com.instagram.api.schemas.XIGIGBoostCallToAction r14 = r7.A0d
            com.instagram.leadgen.core.api.LeadForm r1 = r7.A16
            X.Weq r0 = new X.Weq
            r23 = r2
            r24 = r12
            r25 = r14
            r26 = r10
            r27 = r1
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            r10.A9W(r0)
            X.Wev r0 = new X.Wev
            r23 = r12
            r24 = r7
            r25 = r6
            r26 = r4
            r27 = r10
            r28 = r30
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r9.A02 = r0
            r9.removeAllViews()
            java.util.List r0 = r7.A1p
            java.util.Iterator r14 = r0.iterator()
        L_0x035e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0458
            java.lang.Object r0 = r14.next()
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
            if (r0 == 0) goto L_0x035e
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x03a8
            r0 = 7
            if (r1 == r0) goto L_0x0391
            r0 = 8
            if (r1 == r0) goto L_0x038f
            r0 = 10
            if (r1 == r0) goto L_0x038d
            r0 = 4
            if (r1 != r0) goto L_0x035e
            X.Vth r0 = X.C18529Vth.A00
            boolean r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x035e
            r0 = r10
        L_0x0389:
            r9.addView(r0)
            goto L_0x035e
        L_0x038d:
            r0 = r4
            goto L_0x0389
        L_0x038f:
            r0 = r5
            goto L_0x0389
        L_0x0391:
            r1 = r21
            r0 = r30
            X.0qQ.A0B(r0, r1)
            r0 = 36322495472609502(0x810b1e000028de, double:3.0338306236034017E-306)
            r12 = r30
            boolean r0 = X.182.A06(r8, r12, r0)
            if (r0 == 0) goto L_0x035e
            r0 = r19
            goto L_0x0389
        L_0x03a8:
            r0 = r3
            goto L_0x0389
        L_0x03aa:
            int r0 = X.C18803W2r.A01(r14)
            if (r0 == r2) goto L_0x03d1
            if (r0 == r13) goto L_0x03cc
            int r1 = X.C18803W2r.A00(r14)
            if (r1 == 0) goto L_0x03d1
            if (r1 == r2) goto L_0x03d1
            if (r1 == r13) goto L_0x02ab
            r0 = 3
            if (r1 == r0) goto L_0x03c7
            r0 = 4
            if (r1 == r0) goto L_0x02ab
            r0 = 5
            if (r1 == r0) goto L_0x03c7
            goto L_0x02ab
        L_0x03c7:
            r0 = 2131953986(0x7f130942, float:1.9544458E38)
            goto L_0x029b
        L_0x03cc:
            r0 = 2131953987(0x7f130943, float:1.954446E38)
            goto L_0x029b
        L_0x03d1:
            r0 = 2131970369(0x7f134941, float:1.9577687E38)
            goto L_0x029b
        L_0x03d6:
            r0 = 2131953985(0x7f130941, float:1.9544456E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r12, r0)
            goto L_0x0275
        L_0x03df:
            r0 = 2131953995(0x7f13094b, float:1.9544477E38)
            goto L_0x03ea
        L_0x03e3:
            r0 = 2131970448(0x7f134990, float:1.9577847E38)
            goto L_0x03ea
        L_0x03e7:
            r0 = 2131953994(0x7f13094a, float:1.9544475E38)
        L_0x03ea:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x01ee
            int r0 = r0.intValue()
            r4.setPrimaryTextDescription((int) r0)
            r4.A02()
            goto L_0x01ee
        L_0x03fc:
            r0 = 2131953993(0x7f130949, float:1.9544473E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r12, r0)
            goto L_0x01cb
        L_0x0405:
            r0 = 36324642956259524(0x810d12000030c4, double:3.035188700910898E-306)
            boolean r0 = X.182.A06(r8, r11, r0)
            if (r0 == 0) goto L_0x01a3
            java.lang.String r11 = "boost_objective_recommendation_pill_pv"
            com.instagram.common.session.UserSession r8 = r7.A0y
            X.0qQ.A06(r8)
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r2)
            r14 = 5
            X.WB4 r1 = new X.WB4
            r0 = r18
            r1.<init>(r14, r12, r0, r7)
            r23 = r5
            r24 = r12
            r25 = r8
            r26 = r21
            r28 = r1
            r23.setRecommendedTextV2(r24, r25, r26, r27, r28)
            goto L_0x018e
        L_0x0432:
            r0 = 2131953992(0x7f130948, float:1.954447E38)
            goto L_0x043d
        L_0x0436:
            r0 = 2131970412(0x7f13496c, float:1.9577774E38)
            goto L_0x043d
        L_0x043a:
            r0 = 2131953991(0x7f130947, float:1.9544469E38)
        L_0x043d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00da
            int r0 = r0.intValue()
            r5.setPrimaryTextDescription((int) r0)
            r5.A02()
            goto L_0x00da
        L_0x044f:
            r0 = 2131953990(0x7f130946, float:1.9544467E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r12, r0)
            goto L_0x00b6
        L_0x0458:
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r7.A0i
            if (r1 == 0) goto L_0x0605
            r10 = 1
            if (r1 == r11) goto L_0x05ec
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r1 == r0) goto L_0x05ec
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            if (r1 == r0) goto L_0x05ec
            android.view.View r1 = r9.findViewWithTag(r1)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r7.A0i
            if (r0 != r13) goto L_0x05e9
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r7.A0d
            if (r0 == 0) goto L_0x0477
            com.instagram.leadgen.core.api.LeadForm r0 = r7.A16
            if (r0 != 0) goto L_0x05e9
        L_0x0477:
            if (r1 == 0) goto L_0x0482
            if (r10 != 0) goto L_0x0482
        L_0x047b:
            int r0 = r1.getId()
        L_0x047f:
            r9.A02(r0)
        L_0x0482:
            java.lang.String r0 = r7.A1J
            if (r0 != 0) goto L_0x0541
            boolean r0 = r7.A2T
            if (r0 != 0) goto L_0x0541
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x0541
            boolean r0 = X.W3T.A04(r7)
            if (r0 != 0) goto L_0x04b3
            java.lang.String r0 = r7.A1J
            if (r0 != 0) goto L_0x04af
            boolean r0 = r7.A2T
            if (r0 != 0) goto L_0x04af
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x04af
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r7.A0h
            if (r0 != r11) goto L_0x04af
            com.instagram.api.schemas.DestinationRecommendationReason r0 = r7.A0S
            if (r0 == 0) goto L_0x04af
            int r0 = r0.ordinal()
            switch(r0) {
                case 9: goto L_0x05b5;
                case 10: goto L_0x04af;
                case 11: goto L_0x05c0;
                case 12: goto L_0x04b3;
                case 13: goto L_0x04b3;
                case 14: goto L_0x04af;
                case 15: goto L_0x05da;
                case 16: goto L_0x05cb;
                default: goto L_0x04af;
            }
        L_0x04af:
            boolean r0 = r7.A2C
            if (r0 == 0) goto L_0x04b9
        L_0x04b3:
            r6.A05(r11, r7)
            r3.setChecked(r2)
        L_0x04b9:
            boolean r0 = X.W3T.A05(r7)
            if (r0 != 0) goto L_0x05ab
            boolean r0 = r7.A2g
            if (r0 != 0) goto L_0x04e4
            java.lang.String r0 = r7.A1J
            if (r0 != 0) goto L_0x04e4
            boolean r0 = r7.A2T
            if (r0 != 0) goto L_0x04e4
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x04e4
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r7.A0h
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r1 != r0) goto L_0x04e4
            com.instagram.api.schemas.DestinationRecommendationReason r0 = r7.A0S
            if (r0 == 0) goto L_0x04e4
            int r1 = r0.ordinal()
            r0 = 9
            if (r1 == r0) goto L_0x058f
            switch(r1) {
                case 3: goto L_0x05ab;
                case 4: goto L_0x05ab;
                case 5: goto L_0x05ab;
                case 15: goto L_0x059e;
                case 17: goto L_0x05ab;
                default: goto L_0x04e4;
            }
        L_0x04e4:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r7.A0i
            if (r0 != 0) goto L_0x0511
            boolean r0 = r7.A2K
            if (r0 != 0) goto L_0x050e
            X.X9w r3 = r7.A0V
            if (r3 == 0) goto L_0x04f7
            r0 = r3
            X.UNC r0 = (X.UNC) r0
            com.instagram.api.schemas.LinkStickerType r0 = r0.A00
            r16 = r0
        L_0x04f7:
            com.instagram.api.schemas.LinkStickerType r1 = com.instagram.api.schemas.LinkStickerType.WEBSITE
            r0 = r16
            if (r0 != r1) goto L_0x0562
            if (r3 == 0) goto L_0x0562
            X.UNC r3 = (X.UNC) r3
            java.lang.String r1 = r3.A01
            if (r1 == 0) goto L_0x0562
            r7.A1I = r1
        L_0x0507:
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.LEARN_MORE
            r7.A0b = r0
            r4.setSecondaryText((java.lang.String) r1)
        L_0x050e:
            r4.setChecked(r2)
        L_0x0511:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r7.A0i
            if (r0 != 0) goto L_0x053f
            java.lang.String r3 = r7.A1Y
            if (r3 == 0) goto L_0x054b
            java.lang.String r1 = r7.A1K
            java.lang.String r0 = "aymt_dropoff"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x054b
            java.lang.String r9 = "aymt_pv_dropoff"
            boolean r0 = r3.equals(r9)
            if (r0 == 0) goto L_0x054b
            com.instagram.common.session.UserSession r0 = r7.A0y
            X.WGU r4 = X.WGU.A00(r0)
            X.UzE r3 = X.C16678UzE.OBJECTIVE
            java.lang.String r1 = r18.toString()
            java.lang.String r0 = "messaging_recommendation_subtitle"
            r4.A0K(r3, r0, r1, r9)
        L_0x053c:
            r5.setChecked(r2)
        L_0x053f:
            r6.A04 = r2
        L_0x0541:
            r0 = r31
            X.WT6 r5 = r0.A0I
            if (r5 != 0) goto L_0x0608
            java.lang.String r0 = "userFlowLogger"
            goto L_0x0008
        L_0x054b:
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r7.A0h
            r0 = r18
            if (r1 != r0) goto L_0x053f
            com.instagram.common.session.UserSession r3 = r7.A0y
            X.0qQ.A06(r3)
            r0 = 36324642956259524(0x810d12000030c4, double:3.035188700910898E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 == 0) goto L_0x053f
            goto L_0x053c
        L_0x0562:
            java.lang.String r3 = r7.A1Y
            if (r3 == 0) goto L_0x0511
            java.lang.String r1 = r7.A1K
            java.lang.String r0 = "aymt_dropoff"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0511
            java.lang.String r10 = "aymt_wv_dropoff"
            boolean r0 = r3.equals(r10)
            if (r0 == 0) goto L_0x0511
            com.instagram.common.session.UserSession r0 = r7.A0y
            X.WGU r9 = X.WGU.A00(r0)
            X.UzE r3 = X.C16678UzE.OBJECTIVE
            java.lang.String r1 = r17.toString()
            java.lang.String r0 = "messaging_recommendation_subtitle"
            r9.A0K(r3, r0, r1, r10)
            java.lang.String r1 = r7.A1I
            if (r1 == 0) goto L_0x0511
            goto L_0x0507
        L_0x058f:
            com.instagram.common.session.UserSession r9 = r7.A0y
            X.0qQ.A06(r9)
            r0 = 36320661521638151(0x81097300012307, double:3.0326708256243915E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            goto L_0x05a9
        L_0x059e:
            com.instagram.common.session.UserSession r9 = r7.A0y
            r0 = 36322014436272018(0x810aae00002792, double:3.033526414286599E-306)
            boolean r0 = X.DbY.A1Y(r8, r9, r0)
        L_0x05a9:
            if (r0 == 0) goto L_0x04e4
        L_0x05ab:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            r6.A05(r0, r7)
            r3.setChecked(r2)
            goto L_0x04e4
        L_0x05b5:
            com.instagram.common.session.UserSession r9 = r7.A0y
            X.0qQ.A06(r9)
            r0 = 36320661521638151(0x81097300012307, double:3.0326708256243915E-306)
            goto L_0x05d5
        L_0x05c0:
            com.instagram.common.session.UserSession r9 = r7.A0y
            X.0qQ.A06(r9)
            r0 = 36320661521572614(0x81097300002306, double:3.0326708255829456E-306)
            goto L_0x05d5
        L_0x05cb:
            com.instagram.common.session.UserSession r9 = r7.A0y
            X.0qQ.A06(r9)
            r0 = 36321318651569422(0x810a0c0000250e, double:3.033086397238977E-306)
        L_0x05d5:
            boolean r0 = X.182.A06(r8, r9, r0)
            goto L_0x05e5
        L_0x05da:
            com.instagram.common.session.UserSession r9 = r7.A0y
            r0 = 36322014436272018(0x810aae00002792, double:3.033526414286599E-306)
            boolean r0 = X.DbY.A1Y(r8, r9, r0)
        L_0x05e5:
            if (r0 != 0) goto L_0x04b3
            goto L_0x04af
        L_0x05e9:
            r10 = 0
            goto L_0x0477
        L_0x05ec:
            r6.A05(r1, r7)
            android.view.View r1 = r9.findViewWithTag(r11)
            if (r1 == 0) goto L_0x0482
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r7.A0j
            if (r0 != 0) goto L_0x047b
            java.util.List r0 = r7.A20
            if (r0 == 0) goto L_0x0482
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x047b
            goto L_0x0482
        L_0x0605:
            r0 = -1
            goto L_0x047f
        L_0x0608:
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0617
            X.1QP r1 = r5.A01
            java.lang.String r0 = "promote_destination_radio_group_rendered"
            r1.flowMarkPoint(r3, r0)
        L_0x0617:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15321UaT.A02(X.UaT):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0025: MOVE  (r1v1 X.X6R) = (r1v0 X.X6R)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A03(X.C15321UaT r5, com.instagram.common.typedurl.ImageUrl r6, java.lang.String r7, java.lang.String r8) {
        /*
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "promoteData"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            if (r0 == 0) goto L_0x0031
            X.WGU r2 = r5.A06
            if (r2 == 0) goto L_0x001d
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "destination_ads_preview_thumbnail"
            r2.A0F(r1, r0)
        L_0x001d:
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            boolean r0 = r1 instanceof X.X6R
            if (r0 == 0) goto L_0x0031
            X.X6R r1 = (X.X6R) r1
            if (r1 == 0) goto L_0x0031
            r5 = 0
            r2 = r6
            r3 = r7
            r4 = r8
            r6 = r5
            r1.CpG(r2, r3, r4, r5, r6)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15321UaT.A03(X.UaT, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String):void");
    }

    public final C18784W1k AvJ() {
        C18784W1k w1k = this.A07;
        if (w1k != null) {
            return w1k;
        }
        0qQ.A0F("promoteDataFetcher");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C16678UzE Bhi() {
        return C16678UzE.OBJECTIVE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x002a: MOVE  (r2v12 X.X7g) = (r2v3 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void CtD() {
        /*
            r18 = this;
            r0 = r18
            com.instagram.business.promote.model.PromoteState r1 = r0.A0B
            if (r1 == 0) goto L_0x01a4
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            java.lang.String r7 = "promoteData"
            if (r1 == 0) goto L_0x003d
            boolean r1 = com.instagram.business.promote.model.PromoteState.A02(r1)
            if (r1 != 0) goto L_0x0165
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            com.instagram.business.promote.model.PromoteLaunchOrigin r2 = r1.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = com.instagram.business.promote.model.PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE
            if (r2 == r1) goto L_0x0165
            X.0eM r3 = r0.A0K
            X.1Av r5 = X.DbX.A0h(r3)
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            boolean r1 = r2 instanceof X.X7g
            if (r1 == 0) goto L_0x0037
            X.X7g r2 = (X.X7g) r2
            if (r2 == 0) goto L_0x0037
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r1 = r1.toString()
            r2.Clw(r1)
        L_0x0037:
            X.W1k r2 = r0.A07
            if (r2 != 0) goto L_0x0045
            java.lang.String r7 = "promoteDataFetcher"
        L_0x003d:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0045:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.UzE r12 = X.C16678UzE.OBJECTIVE
            r2.A04(r12, r1)
            r1 = 1
            r0.A0H = r1
            X.WGU r2 = r0.A06
            if (r2 == 0) goto L_0x005c
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            r2.A0B(r12, r1)
        L_0x005c:
            X.WGU r8 = r0.A06
            if (r8 == 0) goto L_0x006f
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            com.instagram.api.schemas.XIGIGBoostDestination r10 = r1.A0h
            com.instagram.api.schemas.DestinationRecommendationReason r9 = r1.A0S
            com.instagram.api.schemas.XIGIGBoostDestination r11 = r1.A0i
            java.lang.String r13 = r1.A1S
            r8.A08(r9, r10, r11, r12, r13)
        L_0x006f:
            com.instagram.business.promote.model.PromoteState r1 = r0.A0B
            if (r1 == 0) goto L_0x01a4
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            boolean r1 = com.instagram.business.promote.model.PromoteState.A03(r1)
            r4 = 2
            if (r1 == 0) goto L_0x00b4
            X.0xa r2 = r5.A01
            java.lang.String r1 = "whatsapp_linking_in_goal_screen_has_not_engaged_count"
            r6 = 0
            int r1 = r2.getInt(r1, r6)
            if (r1 > r4) goto L_0x00b4
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r4 = X.AnonymousClass7TF.A0H(r5)
            r1 = 36326489792198436(0x810ec000003724, double:3.0363566473952775E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x00b4
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            com.instagram.business.promote.model.PromoteData r0 = r0.A0A
            if (r0 == 0) goto L_0x003d
            r0.A2m = r6
            X.C13990Tnq.A0h()
            X.UZc r1 = new X.UZc
            r1.<init>()
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.DbY.A14(r1, r2, r0)
            return
        L_0x00b4:
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r6 = r1.A0m
            if (r6 == 0) goto L_0x0154
            com.instagram.api.schemas.XIGIGBoostDestination r2 = r1.A0i
            if (r2 == 0) goto L_0x0154
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r6.A00
            if (r2 != r1) goto L_0x0154
            X.6Yo r4 = X.DbZ.A0P(r0, r3)
            X.1Wy r1 = X.C322576w3.A00()
            r1.A02()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            java.lang.String r10 = r1.A1K
            X.0qQ.A06(r10)
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            java.lang.String r9 = r1.A1S
            X.0qQ.A06(r9)
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            java.util.Currency r1 = r1.A1j
            java.lang.String r8 = r1.getCurrencyCode()
            X.0qQ.A07(r8)
            com.instagram.business.promote.model.PromoteData r0 = r0.A0A
            if (r0 == 0) goto L_0x003d
            int r7 = r0.A06
            com.instagram.common.typedurl.ImageUrl r0 = r0.A11
            java.lang.String r5 = r0.getUrl()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.String r2 = "currency"
            X.Ua6 r3 = new X.Ua6
            r3.<init>()
            java.lang.String r1 = r11.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r11 = new X.0eP
            r11.<init>(r0, r1)
            java.lang.String r0 = "entry_point"
            X.0eP r12 = new X.0eP
            r12.<init>(r0, r10)
            java.lang.String r0 = "media_id"
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r9)
            X.0eP r14 = new X.0eP
            r14.<init>(r2, r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "currency_offset"
            X.0eP r15 = new X.0eP
            r15.<init>(r0, r1)
            java.lang.String r0 = "boost_packages"
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r6)
            java.lang.String r1 = "media_url"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r5)
            r16 = r2
            r17 = r0
            X.0eP[] r0 = new X.0eP[]{r11, r12, r13, r14, r15, r16, r17}
            android.os.Bundle r0 = X.Q21.A00(r0)
            r3.setArguments(r0)
            r4.A0D(r3)
        L_0x0150:
            r4.A04()
            return
        L_0x0154:
            X.Vl8 r2 = X.C13990Tnq.A0N()
            r1 = 0
            X.UaU r1 = r2.A03(r1)
            X.6Yo r4 = X.DbZ.A0P(r0, r3)
            r4.A0D(r1)
            goto L_0x0150
        L_0x0165:
            X.Ugp r1 = r0.A09
            if (r1 != 0) goto L_0x016d
            java.lang.String r7 = "draftController"
            goto L_0x003d
        L_0x016d:
            boolean r1 = r1.A00()
            if (r1 != 0) goto L_0x01a3
            com.instagram.business.promote.model.PromoteState r1 = r0.A0B
            if (r1 == 0) goto L_0x01a4
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            com.instagram.business.promote.model.PromoteState.A00(r1)
            X.WGU r3 = r0.A06
            if (r3 == 0) goto L_0x018b
            com.instagram.business.promote.model.PromoteData r2 = r0.A0A
            if (r2 == 0) goto L_0x003d
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            r3.A0B(r1, r2)
        L_0x018b:
            X.WGU r2 = r0.A06
            if (r2 == 0) goto L_0x01a0
            com.instagram.business.promote.model.PromoteData r1 = r0.A0A
            if (r1 == 0) goto L_0x003d
            com.instagram.api.schemas.XIGIGBoostDestination r4 = r1.A0h
            com.instagram.api.schemas.DestinationRecommendationReason r3 = r1.A0S
            com.instagram.api.schemas.XIGIGBoostDestination r5 = r1.A0i
            java.lang.String r7 = r1.A1S
            X.UzE r6 = X.C16678UzE.OBJECTIVE
            r2.A08(r3, r4, r5, r6, r7)
        L_0x01a0:
            X.DbT.A1J(r0)
        L_0x01a3:
            return
        L_0x01a4:
            java.lang.String r7 = "promoteState"
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15321UaT.CtD():void");
    }

    public final void CyU() {
        C18784W1k w1k = this.A07;
        if (w1k == null) {
            0qQ.A0F("promoteDataFetcher");
            throw AnonymousClass00P.createAndThrow();
        } else {
            w1k.A05(this);
        }
    }

    public final void DFM(C15249UXj uXj) {
        String str;
        PromoteState promoteState = this.A0B;
        if (promoteState == null) {
            str = "promoteState";
        } else {
            XIGIGBoostDestination xIGIGBoostDestination = XIGIGBoostDestination.WHATSAPP_MESSAGE;
            PromoteData promoteData = this.A0A;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                promoteState.A05(xIGIGBoostDestination, promoteData);
                View view = this.A00;
                if (view == null) {
                    str = "mainContainer";
                } else {
                    U5O u5o = (U5O) AnonymousClass7TF.A0G(view, R.id.destination_option_group).findViewWithTag(XIGIGBoostDestination.DIRECT_MESSAGE);
                    if (u5o != null) {
                        u5o.setChecked(true);
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0K);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0027: MOVE  (r1v9 X.X7g) = (r1v8 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean onBackPressed() {
        /*
            r7 = this;
            com.instagram.business.promote.model.PromoteState r0 = r7.A0B
            java.lang.String r6 = "promoteState"
            if (r0 == 0) goto L_0x00af
            com.instagram.business.promote.model.PromoteData r0 = r7.A0A
            java.lang.String r5 = "promoteData"
            if (r0 == 0) goto L_0x00b3
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            r4 = 1
            com.instagram.business.promote.model.PromoteState r1 = r7.A0B
            if (r0 == 0) goto L_0x0035
            if (r1 == 0) goto L_0x00af
            com.instagram.business.promote.model.PromoteData r0 = r7.A0A
            if (r0 == 0) goto L_0x00b3
            r1.A06(r0)
        L_0x001e:
            r4 = 0
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x0034
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0034
            X.UzE r0 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = r0.toString()
            r1.Clw(r0)
        L_0x0034:
            return r4
        L_0x0035:
            if (r1 == 0) goto L_0x00af
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0085
            com.instagram.business.promote.model.PromoteData r1 = r7.A0A
            if (r1 == 0) goto L_0x00b3
            boolean r0 = r1.A2v
            if (r0 != 0) goto L_0x0085
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r3 = r1.A0t
            if (r3 == 0) goto L_0x0085
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = r3.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.ACTIVE_IMPRESSION
            if (r1 == r0) goto L_0x005f
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = r3.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.HAS_ENROLLED
            if (r1 != r0) goto L_0x0083
            com.instagram.business.promote.model.PromoteData r0 = r7.A0A
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r0.A2P
            if (r0 == 0) goto L_0x0083
        L_0x005f:
            r2 = 1
        L_0x0060:
            com.instagram.model.coupon.PromoteCouponType r1 = r3.A05
            com.instagram.model.coupon.PromoteCouponType r0 = com.instagram.model.coupon.PromoteCouponType.HERES_X
            if (r1 != r0) goto L_0x0085
            if (r2 == 0) goto L_0x0085
            X.C13990Tnq.A0h()
            X.UbW r1 = new X.UbW
            r1.<init>()
            X.VMW r0 = new X.VMW
            r0.<init>(r7)
            r1.A02 = r0
            X.0eM r0 = r7.A0K
            X.7Pr r0 = X.DbX.A0f(r0)
            r0.A0U = r1
            X.DbY.A13(r7, r1, r0)
            return r4
        L_0x0083:
            r2 = 0
            goto L_0x0060
        L_0x0085:
            com.instagram.business.promote.model.PromoteState r0 = r7.A0B
            if (r0 == 0) goto L_0x00af
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x001e
            com.instagram.business.promote.model.PromoteData r1 = r7.A0A
            if (r1 == 0) goto L_0x00b3
            boolean r0 = r1.A2v
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r1.A1b
            if (r0 != 0) goto L_0x001e
            boolean r0 = r1.A2m
            if (r0 != 0) goto L_0x001e
            X.C13990Tnq.A0h()
            X.UZE r1 = new X.UZE
            r1.<init>()
            X.37D r0 = X.DbX.A0i(r7)
            if (r0 == 0) goto L_0x0034
            r0.A0J(r1)
            return r4
        L_0x00af:
            X.0qQ.A0F(r6)
            goto L_0x00b6
        L_0x00b3:
            X.0qQ.A0F(r5)
        L_0x00b6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15321UaT.onBackPressed():boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a2, code lost:
        if (r0 != null) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a4, code lost:
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a7, code lost:
        r1 = r10.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a9, code lost:
        if (r1 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ab, code lost:
        r8 = "userFlowLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b1, code lost:
        if (r0 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ba, code lost:
        r2 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01c0, code lost:
        if (r2 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01c2, code lost:
        r1.A01.flowMarkPoint(r2, "promote_destination_preview_holder_rendered");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r10 = this;
            androidx.fragment.app.FragmentActivity r1 = r10.requireActivity()
            r0 = 86
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.XAI r1 = (X.XAI) r1
            java.util.ArrayList r1 = r1.BHp()
            com.instagram.api.schemas.AdsAPIInstagramPosition r0 = com.instagram.api.schemas.AdsAPIInstagramPosition.STREAM
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x01c9
            X.0rm r5 = new X.0rm
            r5.<init>()
            X.0rm r4 = new X.0rm
            r4.<init>()
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            java.lang.String r9 = "promoteData"
            if (r0 == 0) goto L_0x01b5
            java.util.List r0 = r0.A1w
            int r1 = r0.size()
            r0 = 2
            r3 = 0
            if (r1 < r0) goto L_0x0058
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            if (r0 == 0) goto L_0x01b5
            java.util.List r0 = r0.A1w
            java.lang.String r1 = X.AnonymousClass7TE.A19(r0, r3)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            r5.A00 = r0
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            if (r0 == 0) goto L_0x01b5
            java.util.List r1 = r0.A1w
            r0 = 1
            java.lang.String r1 = X.AnonymousClass7TE.A19(r1, r0)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r1)
            r4.A00 = r0
        L_0x0058:
            X.WGU r2 = r10.A06
            if (r2 == 0) goto L_0x0063
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "destination_ads_preview_thumbnail"
            r2.A0H(r1, r0)
        L_0x0063:
            X.3oV r0 = r10.A0D
            if (r0 != 0) goto L_0x0071
            java.lang.String r8 = "thumbnailImageViewStubHolder"
        L_0x0069:
            X.0qQ.A0F(r8)
        L_0x006c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0071:
            android.view.View r1 = r0.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            if (r0 == 0) goto L_0x01b5
            com.instagram.common.typedurl.ImageUrl r0 = r0.A11
            X.0qQ.A06(r0)
            r1.setUrl(r0, r10)
            java.lang.Object r1 = r5.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            if (r1 == 0) goto L_0x0098
            X.3oV r0 = r10.A0E
            if (r0 == 0) goto L_0x0098
            android.view.View r0 = r0.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            if (r0 == 0) goto L_0x0098
            r0.setUrl(r1, r10)
        L_0x0098:
            java.lang.Object r1 = r4.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            if (r1 == 0) goto L_0x00ad
            X.3oV r0 = r10.A0F
            if (r0 == 0) goto L_0x00ad
            android.view.View r0 = r0.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            if (r0 == 0) goto L_0x00ad
            r0.setUrl(r1, r10)
        L_0x00ad:
            android.view.View r1 = r10.A01
            java.lang.String r8 = "previewHolder"
            if (r1 == 0) goto L_0x0069
            r0 = 21
            X.WBB.A01(r1, r0, r10)
            android.view.View r2 = r10.A01
            if (r2 == 0) goto L_0x0069
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            if (r0 == 0) goto L_0x01b5
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r0.A0i
            r6 = 1050253722(0x3e99999a, float:0.3)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x00cc
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x00cc:
            r2.setAlpha(r0)
            android.view.View r2 = r10.A02
            if (r2 == 0) goto L_0x00e3
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            if (r0 == 0) goto L_0x01b5
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r0.A0i
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x00e0
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x00e0:
            r2.setAlpha(r0)
        L_0x00e3:
            android.view.View r1 = r10.A03
            if (r1 == 0) goto L_0x00f4
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            if (r0 == 0) goto L_0x01b5
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            if (r0 == 0) goto L_0x00f1
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00f1:
            r1.setAlpha(r6)
        L_0x00f4:
            android.view.View r1 = r10.A00
            if (r1 != 0) goto L_0x00fc
            java.lang.String r8 = "mainContainer"
            goto L_0x0069
        L_0x00fc:
            r0 = 2131438672(0x7f0b2c50, float:1.8499278E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r1, r0)
            android.content.Context r0 = r10.requireContext()
            int r0 = X.AnonymousClass7TG.A02(r0)
            r7.setPadding(r0, r0, r0, r0)
            X.0eM r6 = r10.A0K
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            boolean r0 = X.C18803W2r.A05(r0)
            if (r0 == 0) goto L_0x0143
            r0 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r7, r0)
            if (r2 == 0) goto L_0x0139
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            if (r0 != 0) goto L_0x012a
            r8 = r9
            goto L_0x0069
        L_0x012a:
            boolean r1 = r0.A0D()
            r0 = 2131953982(0x7f13093e, float:1.954445E38)
            if (r1 == 0) goto L_0x0136
            r0 = 2131953983(0x7f13093f, float:1.9544452E38)
        L_0x0136:
            X.DbU.A1G(r2, r10, r0)
        L_0x0139:
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            android.view.View r0 = r7.findViewById(r0)
            X.AnonymousClass7TH.A0R(r0)
        L_0x0143:
            X.0lg r6 = X.AnonymousClass7TF.A0L(r6, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323732423257522(0x810c3e00012db2, double:3.03461287617401E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x016e
            r0 = 2131438648(0x7f0b2c38, float:1.8499229E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r7, r0)
            r1.setVisibility(r3)
            r0 = 22
            X.WBB.A01(r1, r0, r10)
            X.WGU r2 = r10.A06
            if (r2 == 0) goto L_0x016e
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "boost_guidance_bottom_sheet_link"
            r2.A0H(r1, r0)
        L_0x016e:
            java.lang.Object r0 = r5.A00
            if (r0 == 0) goto L_0x01af
            java.lang.Object r0 = r4.A00
            if (r0 == 0) goto L_0x01af
            com.instagram.business.promote.model.PromoteData r0 = r10.A0A
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x01af
            android.view.View r1 = r10.A02
            if (r1 == 0) goto L_0x0189
            r0 = 56
            X.WBH.A01(r1, r0, r5, r10)
        L_0x0189:
            android.view.View r1 = r10.A03
            if (r1 == 0) goto L_0x0192
            r0 = 57
            X.WBH.A01(r1, r0, r4, r10)
        L_0x0192:
            com.instagram.common.ui.base.IgLinearLayout r0 = r10.A0C
            if (r0 == 0) goto L_0x0199
            r0.setVisibility(r3)
        L_0x0199:
            android.view.View r0 = r10.A02
            if (r0 == 0) goto L_0x01a0
            r0.setVisibility(r3)
        L_0x01a0:
            android.view.View r0 = r10.A03
            if (r0 == 0) goto L_0x01a7
        L_0x01a4:
            r0.setVisibility(r3)
        L_0x01a7:
            X.WT6 r1 = r10.A0I
            if (r1 != 0) goto L_0x01ba
            java.lang.String r8 = "userFlowLogger"
            goto L_0x0069
        L_0x01af:
            android.view.View r0 = r10.A01
            if (r0 != 0) goto L_0x01a4
            goto L_0x0069
        L_0x01b5:
            X.0qQ.A0F(r9)
            goto L_0x006c
        L_0x01ba:
            long r2 = r1.A00
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01c9
            X.1QP r1 = r1.A01
            java.lang.String r0 = "promote_destination_preview_holder_rendered"
            r1.flowMarkPoint(r2, r0)
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15321UaT.A01():void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(160889989);
        C15321UaT.super.onCreate(bundle);
        this.A0A = XAI.A00(this);
        this.A0B = XA9.A00(this);
        AnonymousClass0eM r3 = this.A0K;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        FragmentActivity activity = getActivity();
        this.A07 = new C18784W1k(activity, activity, A0l);
        this.A09 = new C15684Ugp(this);
        WGU A0D2 = JTU.A0D(r3);
        PromoteData promoteData = this.A0A;
        String str = "promoteData";
        if (promoteData != null) {
            A0D2.A00 = promoteData.A0n;
            this.A06 = A0D2;
            0lg A0R = DbY.A0R(r3);
            WT6 wt6 = (WT6) A0R.A01(WT6.class, new C20606Wvn(A0R, 19));
            this.A0I = wt6;
            if (wt6 == null) {
                str = "userFlowLogger";
            } else {
                long j = wt6.A00;
                if (j != 0) {
                    wt6.A01.flowMarkPoint(j, "promote_goal_screen_created");
                }
                PromoteData promoteData2 = this.A0A;
                if (promoteData2 != null) {
                    if (0qQ.A0K(promoteData2.A1K, "direct_inbox_setting_entrypoint")) {
                        PromoteData promoteData3 = this.A0A;
                        if (promoteData3 != null) {
                            promoteData3.A2h = true;
                        }
                    }
                    AnonymousClass0fD.A09(2111118256, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
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
            r0 = 1425894120(0x54fd6ae8, float:8.7073625E12)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x0020
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0020
            X.UzE r0 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = r0.toString()
            r1.Clx(r0)
        L_0x0020:
            r0 = 2131628443(0x7f0e119b, float:1.8884179E38)
            android.view.View r1 = r5.inflate(r0, r6, r2)
            r0 = -1240214895(0xffffffffb613d291, float:-2.2027273E-6)
            X.AnonymousClass0fD.A09(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15321UaT.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1512964252);
        PromoteState promoteState = this.A0B;
        if (promoteState == null) {
            0qQ.A0F("promoteState");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteState.A0B(this);
        this.A06 = null;
        this.A02 = null;
        this.A03 = null;
        this.A0C = null;
        this.A0E = null;
        this.A0F = null;
        this.A04 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-766470075, A022);
    }
}
