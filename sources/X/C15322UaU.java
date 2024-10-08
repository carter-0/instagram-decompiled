package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.android.R;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

/* renamed from: X.UaU  reason: case insensitive filesystem */
public final class C15322UaU extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, X7h, X3L, X3S {
    public static final String __redex_internal_original_name = "PromoteAudienceFragment";
    public View A00;
    public View A01;
    public View A02;
    public WGU A03;
    public C18643Vvl A04;
    public C17939ViU A05;
    public IgSimpleImageView A06;
    public AnonymousClass5Gv A07;
    public SpinnerImageView A08;
    public boolean A09;
    public ViewStub A0A;
    public TextView A0B;
    public C18654Vw9 A0C;
    public PromoteAudience A0D;
    public IgdsBanner A0E;
    public IgdsStepperHeader A0F;
    public SpinnerImageView A0G;
    public boolean A0H;
    public final AnonymousClass0eM A0I = C20694WxQ.A00(this, 29);
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K = C227642jf.A02(this);
    public final AnonymousClass0eM A0L = C20694WxQ.A00(this, 32);
    public final AnonymousClass0eM A0M = C20694WxQ.A00(this, 33);
    public final AnonymousClass0eM A0N = AnonymousClass1YB.A00(new C20694WxQ(this, 34));
    public final AnonymousClass0eM A0O = AnonymousClass1YB.A00(new C20694WxQ(this, 28));
    public final AnonymousClass0eM A0P = C20694WxQ.A00(this, 31);

    public final void Dab(PromoteState promoteState, Integer num) {
        WGU wgu;
        AnonymousClass7TF.A1H(promoteState, num);
        boolean z = false;
        switch (num.intValue()) {
            case 0:
                promoteState.A0C(false);
                return;
            case 1:
                if (promoteState.A00) {
                    PromoteState A0O2 = C13990Tnq.A0O(this.A0L);
                    String str = A00(this).A1Z;
                    if (str != null) {
                        z = W3x.A0S(A00(this), str);
                    }
                    A0O2.A0D(z);
                    A05();
                    A02();
                    C17939ViU viU = this.A05;
                    if (viU != null) {
                        viU.A00();
                        return;
                    } else {
                        A01();
                        return;
                    }
                } else {
                    AvJ().A06((C15623Ufp) this.A0J.getValue());
                    return;
                }
            case 2:
                A05();
                return;
            case 3:
                String str2 = A00(this).A1Z;
                if (str2 != null) {
                    z = W3x.A0S(A00(this), str2);
                }
                if (A00(this).A0i == XIGIGBoostDestination.LEAD_GENERATION && A00(this).A1Z != null && !z && (wgu = this.A03) != null) {
                    wgu.A0F(C16678UzE.AUDIENCE_SELECTION, "lead_gen_invalid_custom_audience");
                }
                A05();
                A02();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A04();
                C13990Tnq.A0O(this.A0L).A0C(false);
                AnonymousClass7TF.A0D().post(new M20(this));
                C17939ViU viU2 = this.A05;
                if (viU2 != null) {
                    viU2.A00();
                }
                A03();
                return;
            case 13:
                A04();
                return;
            default:
                return;
        }
    }

    public final void configureActionBar(2da r7) {
        0qQ.A0B(r7, 0);
        r7.Eom(2131970201);
        r7.Eu4(true);
        C18643Vvl A002 = C18643Vvl.A00(this, r7);
        this.A04 = A002;
        A002.A01(new C18887WAz(this, 68), AnonymousClass05K.A0Y);
        C18643Vvl vvl = this.A04;
        if (vvl == null) {
            0qQ.A0F("actionBarButtonController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            vvl.A02(true);
        }
    }

    public final String getModuleName() {
        return "promote_audience";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        WGU wgu;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("should_open_special_category", false);
        } else {
            z = false;
        }
        this.A0H = z;
        A00(this).A2P = true;
        WT6 wt6 = (WT6) this.A0M.getValue();
        long j = wt6.A00;
        if (j != 0) {
            wt6.A01.flowEndCancel(j, CancelReason.USER_CANCELLED);
            wt6.A00 = 0;
        }
        1QP r5 = wt6.A01;
        long flowStartForMarker = r5.flowStartForMarker(468328260, "boost_audience_rendered", true);
        wt6.A00 = flowStartForMarker;
        r5.flowMarkPoint(flowStartForMarker, "navigation_start");
        AnonymousClass0eM r3 = this.A0L;
        C13990Tnq.A0O(r3).A0A(this);
        PromoteData A002 = A00(this);
        if (W2F.A03(requireActivity(), A002)) {
            A002.A21.clear();
        } else {
            A002.A27.clear();
        }
        AnonymousClass0eM r1 = this.A0N;
        this.A03 = JTU.A0D(r1);
        boolean A032 = C18803W2r.A03(AnonymousClass7TE.A0l(r1));
        int i = R.id.main_container_stub;
        if (A032) {
            i = R.id.main_container_stub_v2;
        }
        this.A0A = DbU.A0D(view, i);
        this.A0G = DbX.A0k(view);
        if (this.A0H || !C13990Tnq.A0O(r3).A00) {
            C13990Tnq.A0O(r3).A0C(false);
            SpinnerImageView spinnerImageView = this.A0G;
            if (spinnerImageView == null) {
                0qQ.A0F("loadingSpinner");
                throw AnonymousClass00P.createAndThrow();
            } else {
                DbS.A1T(spinnerImageView);
                AvJ().A06((C15623Ufp) this.A0J.getValue());
            }
        } else {
            A01();
        }
        String str = A00(this).A1V;
        if (str == null || (wgu = this.A03) == null) {
            WGU wgu2 = this.A03;
            if (wgu2 != null) {
                C13988Tno.A1J(wgu2, C16678UzE.AUDIENCE_SELECTION);
                return;
            }
            return;
        }
        String obj = C16678UzE.AUDIENCE_SELECTION.toString();
        Long A0q = DbV.A0q(str);
        0Aj A0H2 = C13990Tnq.A0H(wgu, wgu.A05, "promoted_posts_start_step");
        C13989Tnp.A1G(A0H2, wgu, "step", obj);
        0bb r12 = new 0bb();
        C13990Tnq.A17(r12, wgu);
        r12.A05("prefill_audience", A0q);
        C13989Tnp.A1D(A0H2, r12);
    }

    public static final PromoteData A00(C15322UaU uaU) {
        return (PromoteData) AnonymousClass7TE.A14(uaU.A0P);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01fd: MOVE  (r2v5 X.X7g) = (r2v4 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02b8  */
    private final void A01() {
        /*
            r13 = this;
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r13.A0G
            if (r0 != 0) goto L_0x000e
            java.lang.String r12 = "loadingSpinner"
        L_0x0006:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            X.JTO.A1X(r0)
            android.view.ViewStub r0 = r13.A0A
            if (r0 != 0) goto L_0x0018
            java.lang.String r12 = "mainContainerStub"
            goto L_0x0006
        L_0x0018:
            android.view.View r5 = r0.inflate()
            r0 = 2131428222(0x7f0b037e, float:1.8478082E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r13.A08 = r0
            r0 = 2131441765(0x7f0b3865, float:1.850555E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = (com.instagram.igds.components.stepperheader.IgdsStepperHeader) r0
            r13.A0F = r0
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r4 = com.instagram.business.promote.model.PromoteLaunchOrigin.HEC_APPEAL
            r6 = 8
            java.lang.String r12 = "stepperHeader"
            if (r0 == r4) goto L_0x02e2
            X.0eM r0 = r13.A0L
            r0.getValue()
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 != 0) goto L_0x02e2
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r3 = r13.A0F
            if (r3 == 0) goto L_0x0006
            r2 = 1
            r1 = 4
            boolean r0 = r13.A09
            r3.A03(r2, r1, r2, r0)
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = r13.A0F
            if (r0 == 0) goto L_0x0006
            r0.A01()
        L_0x0061:
            r0 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r0 = X.DbU.A0G(r5, r0)
            r13.A0B = r0
            X.0eM r3 = r13.A0N
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = X.C18803W2r.A03(r0)
            java.lang.String r12 = "headerView"
            android.widget.TextView r2 = r13.A0B
            if (r0 == 0) goto L_0x02d8
            if (r2 == 0) goto L_0x0006
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            boolean r1 = r0.A0D()
            r0 = 2131953967(0x7f13092f, float:1.954442E38)
            if (r1 == 0) goto L_0x008c
            r0 = 2131953968(0x7f130930, float:1.9544422E38)
        L_0x008c:
            r2.setText(r0)
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            X.DbX.A1D(r5, r0, r6)
        L_0x0095:
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x00b2
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r5, r0)
            if (r1 == 0) goto L_0x00b2
            r0 = 2131953961(0x7f130929, float:1.9544408E38)
            X.DbU.A1G(r1, r13, r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x00b2:
            r0 = 2131430923(0x7f0b0e0b, float:1.848356E38)
            android.view.View r0 = r5.requireViewById(r0)
            r13.A00 = r0
            r0 = 2131437746(0x7f0b28b2, float:1.84974E38)
            android.view.View r0 = r5.requireViewById(r0)
            r13.A01 = r0
            r0 = 2131428252(0x7f0b039c, float:1.8478143E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.igds.components.banner.IgdsBanner r0 = (com.instagram.igds.components.banner.IgdsBanner) r0
            r13.A0E = r0
            r0 = 2131438696(0x7f0b2c68, float:1.8499326E38)
            android.view.View r7 = r5.findViewById(r0)
            r2 = 0
            if (r7 == 0) goto L_0x010c
            r7.setVisibility(r2)
            r0 = 70
            X.C18887WAz.A00(r7, r0, r13)
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r7, r0)
            if (r1 == 0) goto L_0x00f0
            r0 = 2131970786(0x7f134ae2, float:1.9578533E38)
            r1.setText(r0)
        L_0x00f0:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            boolean r6 = X.C18803W2r.A03(r0)
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r7, r0)
            if (r6 == 0) goto L_0x02bb
            if (r1 == 0) goto L_0x010c
            r1.setVisibility(r2)
            r0 = 2131954027(0x7f13096b, float:1.9544542E38)
            r1.setText(r0)
        L_0x010c:
            r0 = 2131438697(0x7f0b2c69, float:1.8499328E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x02b8
            X.WBB.A01(r1, r2, r13)
            r0 = 2131438694(0x7f0b2c66, float:1.8499322E38)
            X.DbX.A1D(r1, r0, r2)
        L_0x011e:
            r13.A02 = r1
            r13.A04()
            X.WGU r6 = r13.A03
            if (r6 == 0) goto L_0x012e
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "regulated_category_switch"
            r6.A0H(r1, r0)
        L_0x012e:
            com.instagram.business.promote.model.PromoteData r7 = A00(r13)
            X.0eM r8 = r13.A0L
            com.instagram.business.promote.model.PromoteState r6 = X.C13990Tnq.A0O(r8)
            androidx.fragment.app.FragmentActivity r1 = r13.requireActivity()
            X.ViU r0 = new X.ViU
            r0.<init>(r5, r1, r7, r6)
            r13.A05 = r0
            r0.A00()
            r13.A03()
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            com.instagram.model.mediatype.ProductType r1 = r0.A17
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            r9 = 1
            if (r1 != r0) goto L_0x021e
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            java.util.List r1 = r0.A20
            if (r1 == 0) goto L_0x021e
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            boolean r0 = r1.contains(r0)
            if (r0 != r9) goto L_0x021e
        L_0x0164:
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = r0.A0v
            if (r0 != r4) goto L_0x01a1
            X.1Av r6 = X.DbX.A0h(r3)
            com.instagram.common.ui.base.IgSimpleImageView r3 = r13.A06
            if (r3 == 0) goto L_0x01a1
            X.0xa r1 = r6.A01
            java.lang.String r0 = "has_seen_hec_appeal_tooltip"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x01a1
            X.5Gv r0 = r13.A07
            if (r0 != 0) goto L_0x0199
            androidx.fragment.app.FragmentActivity r1 = r13.requireActivity()
            r0 = 2131970190(0x7f13488e, float:1.9577324E38)
            X.5Gt r0 = X.AnonymousClass7TG.A0e(r1, r0)
            r0.A03(r3)
            r0.A02()
            X.5Gv r0 = r0.A00()
            r13.A07 = r0
        L_0x0199:
            X.Wmn r0 = new X.Wmn
            r0.<init>(r13, r6)
            r3.post(r0)
        L_0x01a1:
            X.UzE r6 = X.C16678UzE.AUDIENCE_SELECTION
            X.Vw9 r0 = new X.Vw9
            r0.<init>(r5, r6)
            r13.A0C = r0
            r0.A01()
            r8.getValue()
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 == 0) goto L_0x020b
            android.content.Context r2 = r13.requireContext()
            r1 = 2131970439(0x7f134987, float:1.957783E38)
        L_0x01c1:
            java.lang.String r1 = X.C51967G9n.A0p(r2, r1)
            X.Vw9 r0 = r13.A0C
            if (r0 == 0) goto L_0x02eb
            X.C18165Vmf.A01(r13, r0, r1)
            r13.A05()
            r13.A02()
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x01d9
            A07(r13)
        L_0x01d9:
            X.0eM r0 = r13.A0M
            java.lang.Object r5 = r0.getValue()
            X.WT6 r5 = (X.WT6) r5
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01f5
            X.1QP r2 = r5.A01
            java.lang.String r0 = "promote_audience_rendered"
            r2.flowMarkPoint(r3, r0)
            long r0 = r5.A00
            r2.flowEndSuccess(r0)
        L_0x01f5:
            androidx.fragment.app.FragmentActivity r2 = r13.getActivity()
            boolean r0 = r2 instanceof X.X7g
            if (r0 == 0) goto L_0x020a
            X.X7g r2 = (X.X7g) r2
            if (r2 == 0) goto L_0x020a
            java.lang.String r1 = "promote_audience"
            java.lang.String r0 = r6.toString()
            r2.Clv(r1, r0)
        L_0x020a:
            return
        L_0x020b:
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = r0.A0v
            android.content.Context r2 = r13.requireContext()
            r1 = 2131970410(0x7f13496a, float:1.957777E38)
            if (r0 != r4) goto L_0x01c1
            r1 = 2131970371(0x7f134943, float:1.9577691E38)
            goto L_0x01c1
        L_0x021e:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r0.A0i
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            boolean r0 = r0.A2d
            boolean r0 = X.W3E.A01(r1, r6, r0)
            if (r0 == 0) goto L_0x0164
            android.view.View r1 = r13.A01
            java.lang.String r12 = "placementSelectionSection"
            if (r1 == 0) goto L_0x0006
            r0 = 2131432667(0x7f0b14db, float:1.8487098E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 2131442937(0x7f0b3cf9, float:1.8507928E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r6, r0)
            r0 = 2131442935(0x7f0b3cf7, float:1.8507924E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r6, r0)
            r0 = 2131442936(0x7f0b3cf8, float:1.8507926E38)
            android.view.View r7 = X.AnonymousClass7TF.A0F(r6, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r7 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r7
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            boolean r0 = r0.A2e
            r7.setChecked(r0)
            r0 = 2131970184(0x7f134888, float:1.9577312E38)
            r1.setText(r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r6 = X.DbU.A0m(r13, r0)
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r0.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r1 != r0) goto L_0x029b
            r11 = 2131970180(0x7f134884, float:1.9577304E38)
        L_0x027b:
            java.lang.String r11 = X.DbV.A0z(r13, r6, r11)
            int r1 = X.Dbb.A04(r13)
            X.UsT r0 = new X.UsT
            r0.<init>((X.C15322UaU) r13, (int) r1)
            X.AnonymousClass7AV.A07(r0, r10, r6, r11)
            X.WYN r0 = new X.WYN
            r0.<init>(r13, r9)
            r7.A07 = r0
            android.view.View r0 = r13.A01
            if (r0 == 0) goto L_0x0006
            r0.setVisibility(r2)
            goto L_0x0164
        L_0x029b:
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r0.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            if (r1 != r0) goto L_0x02a9
            r11 = 2131970192(0x7f134890, float:1.9577328E38)
            goto L_0x027b
        L_0x02a9:
            com.instagram.business.promote.model.PromoteData r0 = A00(r13)
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r0.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            r11 = 0
            if (r1 != r0) goto L_0x027b
            r11 = 2131970215(0x7f1348a7, float:1.9577375E38)
            goto L_0x027b
        L_0x02b8:
            r1 = 0
            goto L_0x011e
        L_0x02bb:
            if (r1 == 0) goto L_0x02c6
            r1.setVisibility(r2)
            r0 = 2131970787(0x7f134ae3, float:1.9578535E38)
            r1.setText(r0)
        L_0x02c6:
            r0 = 2131438688(0x7f0b2c60, float:1.849931E38)
            android.view.View r0 = r7.findViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0
            if (r0 == 0) goto L_0x010c
            r13.A06 = r0
            r0.setVisibility(r2)
            goto L_0x010c
        L_0x02d8:
            if (r2 == 0) goto L_0x0006
            r0 = 2131970189(0x7f13488d, float:1.9577322E38)
            r2.setText(r0)
            goto L_0x0095
        L_0x02e2:
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = r13.A0F
            if (r0 == 0) goto L_0x0006
            r0.setVisibility(r6)
            goto L_0x0061
        L_0x02eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15322UaU.A01():void");
    }

    private final void A03() {
        View view = this.A00;
        if (view != null) {
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.primary_text);
            A0R.setText(2131970353);
            A0R.setVisibility(0);
            View view2 = this.A00;
            if (view2 != null) {
                TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.secondary_text);
                A0R2.setText(2131970352);
                A0R2.setVisibility(0);
                View view3 = this.A00;
                if (view3 != null) {
                    C18887WAz.A00(view3, 69, this);
                    return;
                }
            }
        }
        0qQ.A0F("createAudienceRow");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (A00(r5).A21.contains(com.instagram.business.promote.model.SpecialRequirementCategory.A08) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04() {
        /*
            r5 = this;
            android.view.View r4 = r5.A02
            if (r4 == 0) goto L_0x00b1
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r0 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r2 = com.instagram.business.promote.model.SpecialRequirementCategory.A04
            boolean r0 = r0.contains(r2)
            r3 = 8
            if (r0 != 0) goto L_0x0040
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A05
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0040
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A06
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0040
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r1 = r1.contains(r0)
            r0 = 8
            if (r1 == 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r4.setVisibility(r0)
            r0 = 2131438698(0x7f0b2c6a, float:1.849933E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 == 0) goto L_0x005e
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r0 = r0.A21
            boolean r0 = r0.contains(r2)
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
        L_0x005e:
            r0 = 2131438699(0x7f0b2c6b, float:1.8499332E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x007a
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A05
            boolean r0 = r1.contains(r0)
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
        L_0x007a:
            r0 = 2131438700(0x7f0b2c6c, float:1.8499334E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x0096
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A06
            boolean r0 = r1.contains(r0)
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
        L_0x0096:
            r0 = 2131438701(0x7f0b2c6d, float:1.8499336E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r2 == 0) goto L_0x00b1
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00ae
            r3 = 0
        L_0x00ae:
            r2.setVisibility(r3)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15322UaU.A04():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r3 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (A00(r6).A0C() != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (X.182.A06(X.0Tu.A06, X.DbT.A0X(r6.A0N), 36315838273293919L) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05() {
        /*
            r6 = this;
            X.Vw9 r5 = r6.A0C
            if (r5 == 0) goto L_0x0063
            com.instagram.business.promote.model.PromoteData r1 = A00(r6)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.business.promote.model.PromoteAudience r0 = r1.A08()
            com.instagram.api.schemas.AudienceValidationResponse r0 = X.W3x.A03(r0)
            boolean r0 = X.W3x.A0L(r0)
            r4 = 1
            if (r0 == 0) goto L_0x002f
            X.0eM r0 = r6.A0N
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315838273293919(0x81051000000e5f, double:3.029620583949837E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            X.0eM r1 = r6.A0L
            com.instagram.business.promote.model.PromoteState r0 = X.C13990Tnq.A0O(r1)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0045
            com.instagram.business.promote.model.PromoteState r0 = X.C13990Tnq.A0O(r1)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0045
            r2 = 1
            if (r3 == 0) goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            com.instagram.business.promote.model.PromoteData r0 = A00(r6)
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.HEC_APPEAL
            if (r1 != r0) goto L_0x005b
            com.instagram.business.promote.model.PromoteData r0 = A00(r6)
            boolean r1 = r0.A0C()
            r0 = 0
            if (r1 == 0) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            if (r2 == 0) goto L_0x0064
            if (r0 == 0) goto L_0x0064
        L_0x0060:
            r5.A04(r4)
        L_0x0063:
            return
        L_0x0064:
            r4 = 0
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15322UaU.A05():void");
    }

    public final C18784W1k AvJ() {
        return (C18784W1k) this.A0O.getValue();
    }

    public final C16678UzE Bhi() {
        return C16678UzE.AUDIENCE_SELECTION;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00b1: MOVE  (r1v5 X.X7g) = (r1v2 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void CtD() {
        /*
            r9 = this;
            X.0eM r1 = r9.A0L
            r1.getValue()
            com.instagram.business.promote.model.PromoteData r0 = A00(r9)
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 == 0) goto L_0x0038
            X.0eM r0 = r9.A0I
            java.lang.Object r0 = r0.getValue()
            X.Ugp r0 = (X.C15684Ugp) r0
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0037
            r1.getValue()
            com.instagram.business.promote.model.PromoteData r0 = A00(r9)
            com.instagram.business.promote.model.PromoteState.A00(r0)
            X.WGU r2 = r9.A03
            if (r2 == 0) goto L_0x0034
            com.instagram.business.promote.model.PromoteData r1 = A00(r9)
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            r2.A0B(r0, r1)
        L_0x0034:
            X.DbT.A1J(r9)
        L_0x0037:
            return
        L_0x0038:
            com.instagram.business.promote.model.PromoteData r0 = A00(r9)
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.HEC_APPEAL
            if (r1 != r0) goto L_0x00a9
            X.WGU r2 = r9.A03
            if (r2 == 0) goto L_0x004d
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "done_button"
            r2.A0F(r1, r0)
        L_0x004d:
            com.instagram.business.promote.model.PromoteData r0 = A00(r9)
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0037
            X.W1k r6 = r9.AvJ()
            r0 = 13
            X.Ufn r5 = new X.Ufn
            r5.<init>(r9, r0)
            com.instagram.business.promote.model.PromoteData r2 = r6.A03
            com.instagram.business.promote.model.PromoteAudience r1 = r2.A06()
            if (r1 == 0) goto L_0x0037
            com.instagram.common.session.UserSession r0 = r6.A08
            java.lang.String r8 = r2.A1A
            java.lang.String r7 = r2.A1S
            r4 = 0
            com.google.common.collect.ImmutableList r3 = r2.A03()
            java.lang.String r1 = r1.A06
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "ads/promote/create_appeal/"
            X.C51968G9o.A1K(r2, r0, r7)
            java.lang.String r0 = "fb_auth_token"
            r2.A9m(r0, r8)
            java.lang.String r0 = "regulated_category"
            r2.A9m(r0, r4)
            java.lang.String r0 = "regulated_target_spec_string"
            r2.A0G(r0, r1)
            java.lang.Class<X.UX7> r1 = X.UX7.class
            java.lang.Class<X.VmV> r0 = X.C18155VmV.class
            r2.A0R(r1, r0)
            if (r3 == 0) goto L_0x00a1
            java.lang.String r1 = X.C51970G9q.A0k(r3)
            java.lang.String r0 = "regulated_categories"
            r2.A9m(r0, r1)
        L_0x00a1:
            X.1OC r0 = r2.A0M()
            X.C18784W1k.A02(r6, r5, r0)
            return
        L_0x00a9:
            androidx.fragment.app.FragmentActivity r1 = r9.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x00be
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x00be
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = r0.toString()
            r1.Clw(r0)
        L_0x00be:
            X.WGU r2 = r9.A03
            if (r2 == 0) goto L_0x00cb
            com.instagram.business.promote.model.PromoteData r1 = A00(r9)
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            r2.A0B(r0, r1)
        L_0x00cb:
            r0 = 1
            r9.A09 = r0
            X.C13990Tnq.A0h()
            X.UaV r2 = new X.UaV
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            X.0eM r0 = r9.A0N
            X.Dbc.A0S(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15322UaU.CtD():void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x002e: MOVE  (r1v2 X.X7g) = (r1v1 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean onBackPressed() {
        /*
            r3 = this;
            X.0eM r1 = r3.A0L
            r1.getValue()
            com.instagram.business.promote.model.PromoteData r0 = A00(r3)
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 == 0) goto L_0x001a
            com.instagram.business.promote.model.PromoteState r1 = X.C13990Tnq.A0O(r1)
            com.instagram.business.promote.model.PromoteData r0 = A00(r3)
            r1.A06(r0)
        L_0x001a:
            X.WGU r2 = r3.A03
            if (r2 == 0) goto L_0x0025
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "back_button"
            r2.A0F(r1, r0)
        L_0x0025:
            r2 = 0
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x003b
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x003b
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = r0.toString()
            r1.Clw(r0)
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15322UaU.onBackPressed():boolean");
    }

    public C15322UaU() {
        Bundle bundle = this.mArguments;
        this.A0H = bundle != null ? bundle.getBoolean("should_open_special_category", false) : false;
        this.A0J = C20694WxQ.A00(this, 30);
    }

    private final void A02() {
        PromoteData A002 = A00(this);
        0qQ.A0B(A002, 0);
        AudienceValidationResponse A032 = W3x.A03(A002.A08());
        this.A0D = A00(this).A08();
        IgdsBanner igdsBanner = this.A0E;
        if (igdsBanner != null) {
            if (A032 != null && W3x.A0L(A032)) {
                PromoteAudience promoteAudience = this.A0D;
                0qQ.A0A(promoteAudience);
                if (!W3x.A0O(promoteAudience) && !C18175Vmp.A01(this.A0D)) {
                    if (182.A06(0Tu.A05, DbT.A0X(this.A0N), 36315838273293919L)) {
                        WGU wgu = this.A03;
                        if (wgu != null) {
                            wgu.A0H(C16678UzE.AUDIENCE_SELECTION, "audience_validation_banner");
                        }
                        igdsBanner.setVisibility(0);
                        igdsBanner.setBody(A032.A02, false);
                        String A0H2 = W3x.A0H(A032);
                        igdsBanner.setAction((CharSequence) W3x.A0G(A032));
                        igdsBanner.A00 = new C19393WXk(A0H2, this, 0);
                        return;
                    }
                    return;
                }
            }
            igdsBanner.setVisibility(8);
        }
    }

    public static final void A06(C15322UaU uaU) {
        A00(uaU).A2q = false;
        A00(uaU).A1m = new ArrayList();
        A00(uaU).A1m.add(PromoteAudience.A0E);
        C310336ap A0X = DbV.A0X();
        A0X.A0H = "promote_fetch_available_audience_error_alert";
        A0X.A0D = uaU.getString(2131970550);
        DbY.A1N(A0X);
        C17939ViU viU = uaU.A05;
        if (viU != null) {
            viU.A00();
        } else {
            uaU.A01();
        }
        C13990Tnq.A1H(A00(uaU), C13990Tnq.A0O(uaU.A0L));
    }

    public static final void A07(C15322UaU uaU) {
        FragmentActivity activity = uaU.getActivity();
        if (activity != null) {
            C13990Tnq.A0h();
            boolean z = uaU.A0H;
            Bundle bundle = new Bundle();
            bundle.putBoolean("should_show_boost_package_text", z);
            C15375UbT ubT = new C15375UbT();
            ubT.setArguments(bundle);
            C331127Pr A0f = DbX.A0f(uaU.A0N);
            0qQ.A0C(ubT, AnonymousClass000.A00(7));
            A0f.A0T = ubT;
            A0f.A0U = ubT;
            A0f.A00().A02(activity, ubT);
        }
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
            r0 = -273394222(0xffffffffefb455d2, float:-1.116221E29)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x0020
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0020
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = r0.toString()
            r1.Clx(r0)
        L_0x0020:
            r0 = 2131628412(0x7f0e117c, float:1.8884116E38)
            android.view.View r1 = r5.inflate(r0, r6, r2)
            r0 = -1356755969(0xffffffffaf218bff, float:-1.4692601E-10)
            X.AnonymousClass0fD.A09(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15322UaU.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1659107221);
        this.A08 = null;
        this.A05 = null;
        this.A02 = null;
        this.A0E = null;
        C13990Tnq.A0O(this.A0L).A0B(this);
        this.A03 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(1970606577, A022);
    }
}
