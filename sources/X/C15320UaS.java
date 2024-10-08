package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;
import java.util.Set;

/* renamed from: X.UaS  reason: case insensitive filesystem */
public final class C15320UaS extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, X3L {
    public static final String __redex_internal_original_name = "PromoteReviewFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ViewStub A09;
    public ViewStub A0A;
    public WGU A0B;
    public C18784W1k A0C;
    public C18654Vw9 A0D;
    public C17924ViF A0E;
    public PromoteData A0F;
    public PromoteState A0G;
    public UserSession A0H;
    public IgImageView A0I;
    public IgdsStepperHeader A0J;
    public SpinnerImageView A0K;
    public boolean A0L;
    public boolean A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public C18643Vvl A0Q;
    public 1Av A0R;
    public boolean A0S;
    public final AnonymousClass0eM A0T = C227642jf.A02(this);
    public final 1wn A0U = new C19221WQb(this, 15);

    private final String A00(String str) {
        String str2 = str;
        PromoteData promoteData = this.A0F;
        String str3 = "promoteData";
        if (promoteData != null) {
            if (promoteData.A0i == XIGIGBoostDestination.PROFILE_VISITS) {
                C18779W1e w1e = WGS.A00;
                FragmentActivity requireActivity = requireActivity();
                if (str == null) {
                    str2 = "";
                }
                PromoteData promoteData2 = this.A0F;
                if (promoteData2 != null) {
                    List list = promoteData2.A1q;
                    0qQ.A06(list);
                    PromoteData promoteData3 = this.A0F;
                    if (promoteData3 != null) {
                        Set set = promoteData3.A24;
                        0qQ.A06(set);
                        PromoteData promoteData4 = this.A0F;
                        if (promoteData4 != null) {
                            String str4 = promoteData4.A1X;
                            if (this.A0G != null) {
                                return w1e.A06(requireActivity, promoteData, str2, str4, list, set, false);
                            }
                            str3 = "promoteState";
                        }
                    }
                }
            } else if (str == null) {
                return "";
            } else {
                return str2;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0A(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A0H;
        String str4 = "userSession";
        if (userSession != null) {
            if (C324536zU.A00(userSession)) {
                Context requireContext = requireContext();
                UserSession userSession2 = this.A0H;
                if (userSession2 != null) {
                    FFO.A03(FFO.A00(requireContext, userSession2, "boost_ad_payments", str));
                    return;
                }
            } else {
                UserSession userSession3 = this.A0H;
                if (userSession3 != null) {
                    AnonymousClass1Nd.A00(userSession3).A01(this.A0U, WQL.class);
                    PromoteState promoteState = this.A0G;
                    if (promoteState == null) {
                        str4 = "promoteState";
                    } else {
                        if (promoteState.A08) {
                            promoteState.A08 = false;
                            PromoteState.A01(promoteState, AnonymousClass05K.A06);
                        }
                        WGU wgu = this.A0B;
                        if (wgu != null) {
                            wgu.A0R(C16678UzE.SUMMARY.toString(), str2);
                            WGU.A06(wgu, wgu.A01, C16678UzE.REQUIRED_BILLING_WIZARD.toString(), str);
                        }
                        FragmentActivity requireActivity = requireActivity();
                        UserSession userSession4 = this.A0H;
                        if (userSession4 != null) {
                            C18676VwZ.A02(requireActivity, new WOG(this, str2, str, str3), userSession4, false);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str4);
        throw AnonymousClass00P.createAndThrow();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01fc: MOVE  (r2v6 X.X3Q) = (r2v3 X.X3Q)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f8  */
    public final void CtD() {
        /*
            r14 = this;
            r5 = 1
            A06(r14, r5)
            X.WGU r6 = r14.A0B
            java.lang.String r13 = "promoteData"
            if (r6 == 0) goto L_0x007e
            X.UzE r4 = X.C16678UzE.SUMMARY
            com.instagram.business.promote.model.PromoteData r1 = r14.A0F
            if (r1 == 0) goto L_0x012b
            boolean r2 = r1.A2v
            int r0 = r1.A08
            java.lang.String r10 = X.C13991Tnr.A0g(r1, r0)
            com.instagram.business.promote.model.PromoteData r1 = r14.A0F
            if (r1 == 0) goto L_0x012b
            int r0 = r1.A09
            java.lang.String r9 = java.lang.String.valueOf(r0)
            int r0 = r1.A07
            java.lang.String r8 = X.C13991Tnr.A0g(r1, r0)
            com.instagram.business.promote.model.PromoteData r0 = r14.A0F
            if (r0 == 0) goto L_0x012b
            int r0 = r0.A0A
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "create_promotion"
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            com.facebook.common.callercontext.CallerContext r0 = X.WGU.A07
            X.0wc r1 = r6.A05
            java.lang.String r0 = "promoted_posts_tap_component"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x007e
            X.UGQ r1 = new X.UGQ
            r1.<init>()
            X.C13990Tnq.A18(r1, r6)
            if (r11 == 0) goto L_0x0057
            java.lang.String r0 = "run_continuously"
            r1.A03(r0, r11)
        L_0x0057:
            if (r10 == 0) goto L_0x005e
            java.lang.String r0 = "default_recommended_daily_budget"
            r1.A06(r0, r10)
        L_0x005e:
            if (r9 == 0) goto L_0x0065
            java.lang.String r0 = "default_recommended_duration_in_days"
            r1.A06(r0, r9)
        L_0x0065:
            if (r8 == 0) goto L_0x006c
            java.lang.String r0 = "daily_budget_selected"
            r1.A06(r0, r8)
        L_0x006c:
            if (r7 == 0) goto L_0x0073
            java.lang.String r0 = "duration_in_days_selected"
            r1.A06(r0, r7)
        L_0x0073:
            java.lang.String r0 = "component"
            r2.AAJ(r0, r3)
            X.C13990Tnq.A10(r2, r6, r4)
            X.C13988Tno.A18(r2, r1)
        L_0x007e:
            com.instagram.business.promote.model.PromoteState r11 = r14.A0G
            java.lang.String r12 = "promoteState"
            if (r11 == 0) goto L_0x0143
            boolean r10 = r11.A05
            r9 = r10 ^ 1
            boolean r8 = r11.A02
            if (r8 != 0) goto L_0x008e
            int r9 = r9 + 1
        L_0x008e:
            boolean r3 = r11.A03
            if (r3 == 0) goto L_0x0127
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x0127
        L_0x0096:
            com.instagram.business.promote.model.PromoteData r2 = r14.A0F
            if (r2 == 0) goto L_0x012b
            com.instagram.api.schemas.NonDiscInfo r1 = r2.A0W
            boolean r0 = r1.A01
            r4 = 0
            if (r0 == 0) goto L_0x00a6
            boolean r1 = r1.A00
            r0 = 1
            if (r1 == 0) goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            java.lang.String r7 = "userSession"
            java.lang.String r6 = "create_promotion"
            if (r0 == 0) goto L_0x00e2
            X.WGU r2 = r14.A0B
            if (r2 == 0) goto L_0x00bc
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "non_discrimination_policy"
            r2.A0U(r1, r6, r0)
        L_0x00bc:
            X.C13990Tnq.A0h()
            X.UaR r2 = new X.UaR
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = r14.requireActivity()
            com.instagram.common.session.UserSession r0 = r14.A0H
            if (r0 == 0) goto L_0x0243
            X.DbY.A14(r2, r1, r0)
            com.instagram.business.promote.model.PromoteState r1 = r14.A0G
            if (r1 == 0) goto L_0x0143
            boolean r0 = r1.A08
            if (r0 == r4) goto L_0x00de
            r1.A08 = r4
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            com.instagram.business.promote.model.PromoteState.A01(r1, r0)
        L_0x00de:
            A06(r14, r4)
        L_0x00e1:
            return
        L_0x00e2:
            if (r9 <= 0) goto L_0x012f
            if (r9 <= r5) goto L_0x0104
            android.content.Context r1 = r14.requireContext()
            r0 = 2131970725(0x7f134aa5, float:1.957841E38)
        L_0x00ed:
            java.lang.String r0 = r1.getString(r0)
            r14.A07(r0)
        L_0x00f4:
            X.WGU r2 = r14.A0B
            if (r2 == 0) goto L_0x00de
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "has_incomplete_fields"
            r2.A0U(r1, r6, r0)
            goto L_0x00de
        L_0x0104:
            if (r10 != 0) goto L_0x010e
            android.content.Context r1 = r14.requireContext()
            r0 = 2131970724(0x7f134aa4, float:1.9578407E38)
            goto L_0x00ed
        L_0x010e:
            if (r8 != 0) goto L_0x0118
            android.content.Context r1 = r14.requireContext()
            r0 = 2131970722(0x7f134aa2, float:1.9578403E38)
            goto L_0x00ed
        L_0x0118:
            if (r3 == 0) goto L_0x011f
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x011f
            goto L_0x00f4
        L_0x011f:
            android.content.Context r1 = r14.requireContext()
            r0 = 2131970723(0x7f134aa3, float:1.9578405E38)
            goto L_0x00ed
        L_0x0127:
            int r9 = r9 + 1
            goto L_0x0096
        L_0x012b:
            X.0qQ.A0F(r13)
            goto L_0x0146
        L_0x012f:
            X.GSY r0 = r2.A0O
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x014b
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto L_0x0252
            X.ViF r0 = r14.A0E
            if (r0 != 0) goto L_0x0248
            java.lang.String r12 = "paymentInformationController"
        L_0x0143:
            X.0qQ.A0F(r12)
        L_0x0146:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x014b:
            boolean r0 = r2.A2N
            if (r0 != 0) goto L_0x01a2
            boolean r0 = r2.A0E()
            if (r0 == 0) goto L_0x01a2
            com.instagram.common.session.UserSession r3 = r14.A0H
            if (r3 == 0) goto L_0x0243
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321215572354214(0x8109f4000024a6, double:3.033021209528213E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01a2
            X.WGU r2 = r14.A0B
            if (r2 == 0) goto L_0x0175
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "update_account_spend_limit"
            r2.A0U(r1, r6, r0)
        L_0x0175:
            A06(r14, r4)
            com.instagram.business.promote.model.PromoteData r0 = r14.A0F
            if (r0 == 0) goto L_0x012b
            r0.A2N = r5
            X.C13990Tnq.A0h()
            X.UzE r0 = X.C16678UzE.SUMMARY
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "step"
            r3.putString(r0, r1)
            X.UaP r2 = new X.UaP
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r3, r2, r14)
            com.instagram.common.session.UserSession r0 = r14.A0H
            if (r0 == 0) goto L_0x0243
            X.DbY.A14(r2, r1, r0)
            return
        L_0x01a2:
            X.W2F r5 = X.C17137VJm.A00
            com.instagram.business.promote.model.PromoteData r2 = r14.A0F
            if (r2 == 0) goto L_0x012b
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r2.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            if (r1 != r0) goto L_0x01c1
            com.instagram.common.session.UserSession r3 = r2.A0y
            X.0qQ.A06(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319630729420331(0x81088300001e2b, double:3.032018948475175E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x01c2
        L_0x01c1:
            r0 = 0
        L_0x01c2:
            X.WGU r2 = r14.A0B
            if (r0 == 0) goto L_0x01e7
            if (r2 == 0) goto L_0x01d3
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "leadgen_is_disabled"
            r2.A0U(r1, r6, r0)
        L_0x01d3:
            androidx.fragment.app.FragmentActivity r3 = r14.getActivity()
            com.instagram.business.promote.model.PromoteData r2 = r14.A0F
            if (r2 == 0) goto L_0x012b
            r1 = 46
            X.WxM r0 = new X.WxM
            r0.<init>(r14, r1)
            r5.A04(r3, r2, r0)
            goto L_0x00de
        L_0x01e7:
            if (r2 == 0) goto L_0x01f4
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "proceed_create_promotion"
            r2.A0R(r1, r0)
        L_0x01f4:
            androidx.fragment.app.FragmentActivity r2 = r14.getActivity()
            boolean r0 = r2 instanceof X.X3Q
            if (r0 == 0) goto L_0x020a
            X.X3Q r2 = (X.X3Q) r2
            if (r2 == 0) goto L_0x020a
            X.UzE r1 = X.C16678UzE.SUMMARY
            X.WOf r0 = new X.WOf
            r0.<init>(r14)
            r2.AMi(r1, r0)
        L_0x020a:
            com.instagram.business.promote.model.PromoteData r0 = r14.A0F
            if (r0 == 0) goto L_0x012b
            java.lang.String r1 = r0.A1K
            java.lang.String r0 = "onboarding_checklist"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00e1
            com.instagram.common.session.UserSession r0 = r14.A0H
            if (r0 == 0) goto L_0x0243
            X.De2 r3 = new X.De2
            r3.<init>(r0, r14)
            java.lang.Integer r2 = X.AnonymousClass05K.A1I
            r1 = 21
            X.Ufn r0 = new X.Ufn
            r0.<init>(r14, r1)
            r3.A01(r0, r2)
            com.instagram.common.session.UserSession r0 = r14.A0H
            if (r0 == 0) goto L_0x0243
            X.De2 r3 = new X.De2
            r3.<init>(r0, r14)
            java.lang.Integer r2 = X.AnonymousClass05K.A03
            r1 = 22
            X.Ufn r0 = new X.Ufn
            r0.<init>(r14, r1)
            r3.A01(r0, r2)
            return
        L_0x0243:
            X.0qQ.A0F(r7)
            goto L_0x0146
        L_0x0248:
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "enter_billing_wizard_by_blocked_submit"
            r14.A0A(r2, r0, r1)
            return
        L_0x0252:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320UaS.CtD():void");
    }

    public final void configureActionBar(2da r6) {
        String str;
        0qQ.A0B(r6, 0);
        r6.Eom(2131970735);
        this.A0Q = C18643Vvl.A00(this, r6);
        if (this.A0G == null) {
            str = "promoteState";
        } else {
            PromoteData promoteData = this.A0F;
            str = "promoteData";
            if (promoteData != null) {
                if (!PromoteState.A02(promoteData)) {
                    PromoteData promoteData2 = this.A0F;
                    if (promoteData2 != null) {
                        if (promoteData2.A0v != PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE) {
                            C18643Vvl vvl = this.A0Q;
                            if (vvl == null) {
                                str = "actionBarButtonController";
                            } else {
                                WBB wbb = new WBB(this, 64);
                                F3V f3v = vvl.A02;
                                f3v.A02 = R.drawable.instagram_arrow_left_pano_outline_24;
                                f3v.A0A = wbb;
                                vvl.A01.Eu4(true);
                                vvl.A03(true);
                                return;
                            }
                        }
                    }
                }
                DbX.A1A(new WBB(this, 63), DbX.A0M(), r6);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "promote_review";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x09b9: MOVE  (r1v55 X.X6R) = (r1v46 X.X6R)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x08b7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0122  */
    public final void onViewCreated(android.view.View r30, android.os.Bundle r31) {
        /*
            r29 = this;
            r2 = 0
            r3 = r30
            X.0qQ.A0B(r3, r2)
            r4 = r29
            com.instagram.business.promote.model.PromoteData r5 = r4.A0F
            java.lang.String r16 = "promoteData"
            if (r5 == 0) goto L_0x07ce
            int r0 = r5.A0A
            java.lang.String r17 = "promoteState"
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A2v
            if (r0 != 0) goto L_0x0021
            com.instagram.business.promote.model.PromoteState r1 = r4.A0G
            if (r1 == 0) goto L_0x0a22
            int r0 = r5.A09
            r1.A08(r5, r0)
        L_0x0021:
            com.instagram.business.promote.model.PromoteData r5 = r4.A0F
            if (r5 == 0) goto L_0x07ce
            int r0 = r5.A07
            if (r0 != 0) goto L_0x0032
            com.instagram.business.promote.model.PromoteState r1 = r4.A0G
            if (r1 == 0) goto L_0x0a22
            int r0 = r5.A08
            r1.A07(r5, r0)
        L_0x0032:
            com.instagram.common.session.UserSession r0 = r4.A0H
            java.lang.String r18 = "userSession"
            if (r0 == 0) goto L_0x064c
            X.WGU r1 = X.WGU.A00(r0)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.business.promote.model.LinkingAuthState r0 = r0.A0n
            r1.A00 = r0
            r4.A0B = r1
            r0 = 2131441765(0x7f0b3865, float:1.850555E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = (com.instagram.igds.components.stepperheader.IgdsStepperHeader) r0
            r4.A0J = r0
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            boolean r0 = r0.A34
            r10 = 1
            if (r0 == 0) goto L_0x006c
            com.instagram.common.session.UserSession r6 = r4.A0H
            if (r6 == 0) goto L_0x064c
            X.0Tu r5 = X.0Tu.A05
            r0 = 36330320903029305(0x81123c00004239, double:3.038779457311364E-306)
            boolean r1 = X.182.A06(r5, r6, r0)
            r0 = 1
            if (r1 != 0) goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            r4.A0M = r0
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.business.promote.model.PromoteAudience r0 = r0.A07()
            com.instagram.api.schemas.AudienceValidationResponse r5 = X.W3x.A03(r0)
            if (r5 == 0) goto L_0x00c8
            com.instagram.common.session.UserSession r7 = r4.A0H
            if (r7 == 0) goto L_0x09d4
            X.0Tu r6 = X.0Tu.A05
            r0 = 36315838273293919(0x81051000000e5f, double:3.029620583949837E-306)
            boolean r0 = X.DbY.A1Y(r6, r7, r0)
            if (r0 == 0) goto L_0x00c8
            boolean r0 = X.W3x.A0L(r5)
            if (r0 == 0) goto L_0x0571
            r0 = 2131428252(0x7f0b039c, float:1.8478143E38)
            android.view.View r14 = X.AnonymousClass7TF.A0F(r3, r0)
            com.instagram.igds.components.banner.IgdsBanner r14 = (com.instagram.igds.components.banner.IgdsBanner) r14
            java.lang.String r1 = r5.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r14.setBody(r1, r0)
            java.lang.String r1 = X.W3x.A0H(r5)
            java.lang.String r0 = X.W3x.A0G(r5)
            if (r0 == 0) goto L_0x00b3
            r14.setAction((java.lang.CharSequence) r0)
        L_0x00b3:
            X.WXk r0 = new X.WXk
            r0.<init>(r1, r4, r10)
            r14.A00 = r0
            X.WGU r5 = r4.A0B
            if (r5 == 0) goto L_0x00c5
            X.UzE r1 = X.C16678UzE.SUMMARY
            java.lang.String r0 = "audience_validation_banner"
        L_0x00c2:
            r5.A0H(r1, r0)
        L_0x00c5:
            r14.setVisibility(r2)
        L_0x00c8:
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 == 0) goto L_0x0a22
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 != 0) goto L_0x0646
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE
            if (r1 == r0) goto L_0x0646
            r0 = 2131431448(0x7f0b1018, float:1.8484625E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A03 = r0
            r0 = 2131428241(0x7f0b0391, float:1.847812E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A0N = r0
            r0 = 2131429153(0x7f0b0721, float:1.847997E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A02 = r0
            r0 = 2131440696(0x7f0b3438, float:1.8503383E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A08 = r0
        L_0x0104:
            r0 = 2131428649(0x7f0b0529, float:1.8478948E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A01 = r0
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x011a
            r0 = 2131429154(0x7f0b0722, float:1.8479973E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A02 = r0
        L_0x011a:
            android.content.Context r5 = r4.requireContext()
            com.instagram.common.session.UserSession r1 = r4.A0H
            if (r1 == 0) goto L_0x064c
            X.0hq r0 = r4.mFragmentManager
            if (r0 == 0) goto L_0x0a5e
            X.UdT r6 = new X.UdT
            r6.<init>(r5, r0, r1)
            r0 = 2131437513(0x7f0b27c9, float:1.8496927E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbZ.A0F(r3, r0)
            r1.setAdapter(r6)
            android.content.Context r0 = r4.getContext()
            X.DbV.A1B(r0, r1)
            android.content.Context r20 = r4.requireContext()
            com.instagram.business.promote.model.PromoteData r1 = r4.A0F
            if (r1 == 0) goto L_0x07ce
            androidx.fragment.app.FragmentActivity r21 = r4.requireActivity()
            X.UzE r5 = X.C16678UzE.SUMMARY
            X.ViF r0 = new X.ViF
            r19 = r0
            r22 = r5
            r23 = r6
            r24 = r1
            r25 = r4
            r26 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r4.A0E = r0
            r0 = 2131437505(0x7f0b27c1, float:1.849691E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A0P = r0
            r0 = 2131438142(0x7f0b2a3e, float:1.8498203E38)
            android.view.ViewStub r0 = X.DbU.A0D(r3, r0)
            r4.A09 = r0
            r0 = 2131438141(0x7f0b2a3d, float:1.84982E38)
            android.view.ViewStub r0 = X.DbU.A0D(r3, r0)
            r4.A0A = r0
            r0 = 2131439986(0x7f0b3172, float:1.8501943E38)
            android.view.View r1 = r3.requireViewById(r0)
            r4.A07 = r1
            if (r1 != 0) goto L_0x018d
            java.lang.String r19 = "reviewScreenContentView"
        L_0x0185:
            X.0qQ.A0F(r19)
        L_0x0188:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x018d:
            r0 = 2131438653(0x7f0b2c3d, float:1.8499239E38)
            android.view.View r0 = r1.requireViewById(r0)
            r4.A04 = r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = X.DbX.A0k(r3)
            r4.A0K = r0
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.W1k r0 = X.C18784W1k.A01(r4, r0)
            r4.A0C = r0
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r1 = r4.A0J
            java.lang.String r19 = "stepperHeader"
            if (r1 == 0) goto L_0x0185
            r0 = 3
            r11 = 4
            r1.A03(r0, r11, r10, r2)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            r0.A2R = r10
            r0 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r6 = X.DbU.A0G(r3, r0)
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            boolean r1 = X.C18803W2r.A05(r0)
            r0 = 2131970730(0x7f134aaa, float:1.957842E38)
            if (r1 == 0) goto L_0x01d0
            r0 = 2131954026(0x7f13096a, float:1.954454E38)
        L_0x01d0:
            r6.setText(r0)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.common.session.UserSession r7 = r4.A0H
            if (r7 == 0) goto L_0x064c
            com.instagram.business.promote.model.PromoteAudience r0 = r0.A06()
            if (r0 == 0) goto L_0x027d
            boolean r0 = r0.A0C
            if (r0 != r10) goto L_0x027d
            X.0Tu r6 = X.0Tu.A05
            r0 = 36318539807791330(0x810785000118e2, double:3.031329045244206E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x027d
            android.view.View r0 = r4.A01
            r6 = 0
            if (r0 == 0) goto L_0x01fa
            r0.setVisibility(r2)
        L_0x01fa:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x0203
            r0 = 66
            X.WBB.A01(r1, r0, r4)
        L_0x0203:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x0a59
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            r0 = 2131970708(0x7f134a94, float:1.9578375E38)
            r1.setText(r0)
            com.instagram.business.promote.model.PromoteData r1 = r4.A0F
            if (r1 == 0) goto L_0x07ce
            boolean r0 = X.C18174Vmo.A00(r1)
            r7 = 8
            if (r0 == 0) goto L_0x0560
            java.lang.String r7 = r1.A1C
            java.lang.String r9 = ""
            if (r7 != 0) goto L_0x0227
            r7 = r9
        L_0x0227:
            java.lang.String r0 = r1.A1D
            if (r0 == 0) goto L_0x022c
            r9 = r0
        L_0x022c:
            r0 = 2131970706(0x7f134a92, float:1.957837E38)
            java.lang.String r8 = X.DbU.A0m(r4, r0)
            r0 = 2131970707(0x7f134a93, float:1.9578373E38)
            java.lang.String r1 = X.DbU.A0m(r4, r0)
            boolean r0 = r7.equals(r9)
            if (r0 != 0) goto L_0x024a
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r7, r1, r9}
            java.lang.String r0 = "%s: %s\n%s: %s"
            java.lang.String r7 = X.0mp.A06(r0, r1)
        L_0x024a:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x025d
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            if (r0 == 0) goto L_0x025d
            r0.setText(r7)
            r0.setVisibility(r2)
        L_0x025d:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x027d
            r0 = 2131432454(0x7f0b1406, float:1.8486666E38)
            android.view.View r7 = r1.findViewById(r0)
            if (r7 == 0) goto L_0x027d
            com.instagram.business.promote.model.PromoteData r1 = r4.A0F
            if (r1 == 0) goto L_0x07ce
            boolean r0 = X.C18174Vmo.A00(r1)
            if (r0 == 0) goto L_0x027a
            boolean r0 = r1.A2E
            if (r0 == 0) goto L_0x027a
            r6 = 8
        L_0x027a:
            r7.setVisibility(r6)
        L_0x027d:
            android.view.View r0 = r4.A03
            if (r0 == 0) goto L_0x0284
            r0.setVisibility(r2)
        L_0x0284:
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            r12 = 0
            if (r0 == 0) goto L_0x0a22
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 != 0) goto L_0x029d
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE
            if (r1 != r0) goto L_0x02a6
        L_0x029d:
            android.view.View r1 = r4.A03
            if (r1 == 0) goto L_0x02a6
            r0 = 68
            X.WBB.A01(r1, r0, r4)
        L_0x02a6:
            android.view.View r0 = r4.A03
            java.lang.String r7 = "Required value was null."
            if (r0 == 0) goto L_0x0a53
            r8 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r6 = X.DbU.A0G(r0, r8)
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            boolean r1 = X.C18803W2r.A05(r0)
            r0 = 2131970701(0x7f134a8d, float:1.957836E38)
            if (r1 == 0) goto L_0x02c3
            r0 = 2131954024(0x7f130968, float:1.9544536E38)
        L_0x02c3:
            r6.setText(r0)
            android.view.View r1 = r4.A03
            if (r1 == 0) goto L_0x055d
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r9 = X.AnonymousClass7TE.A0d(r1, r0)
        L_0x02d1:
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            boolean r0 = X.C18803W2r.A05(r0)
            r20 = 2
            r13 = 10
            r6 = 8
            if (r0 == 0) goto L_0x03cd
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            if (r0 == 0) goto L_0x03cd
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x0367
            if (r1 == r13) goto L_0x0349
            if (r1 == r10) goto L_0x0331
            r0 = 5
            if (r1 != r0) goto L_0x03cd
            if (r9 == 0) goto L_0x0318
            android.content.Context r12 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            com.instagram.user.model.User r11 = X.AnonymousClass7TF.A0Q(r0)
            com.instagram.common.session.UserSession r1 = r4.A0H
            if (r1 == 0) goto L_0x064c
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r0.A0e
            android.text.SpannableStringBuilder r0 = X.C18779W1e.A00(r12, r0, r1, r11)
        L_0x0312:
            r9.setText(r0)
        L_0x0315:
            r9.setVisibility(r2)
        L_0x0318:
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x056c
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 == 0) goto L_0x0a22
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x056c
            X.W1k r11 = r4.A0C
            if (r11 != 0) goto L_0x06e9
            java.lang.String r0 = "dataFetcher"
            X.0qQ.A0F(r0)
            goto L_0x0188
        L_0x0331:
            if (r9 == 0) goto L_0x0318
            android.content.res.Resources r12 = X.DbV.A05(r4)
            r11 = 2131954021(0x7f130965, float:1.954453E38)
            java.lang.String[] r1 = new java.lang.String[r10]
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.String r0 = r0.getUsername()
            goto L_0x0360
        L_0x0349:
            if (r9 == 0) goto L_0x0318
            android.content.res.Resources r12 = X.DbV.A05(r4)
            r11 = 2131954025(0x7f130969, float:1.9544538E38)
            java.lang.String[] r1 = new java.lang.String[r10]
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            java.lang.String r0 = r0.A1I
            if (r0 == 0) goto L_0x0a27
            java.lang.String r0 = X.C18779W1e.A02(r0)
        L_0x0360:
            r1[r2] = r0
            android.text.Spanned r0 = X.0bC.A01(r12, r1, r11)
            goto L_0x0312
        L_0x0367:
            if (r9 == 0) goto L_0x0318
            android.content.res.Resources r11 = X.DbV.A05(r4)
            r1 = 2131954023(0x7f130967, float:1.9544534E38)
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.String r0 = r0.getUsername()
            android.text.Spanned r0 = X.DbU.A07(r11, r0, r1)
            r9.setText(r0)
            r9.setVisibility(r2)
            android.content.Context r11 = r4.requireContext()
            com.instagram.business.promote.model.PromoteData r1 = r4.A0F
            if (r1 == 0) goto L_0x07ce
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 == 0) goto L_0x0a22
            boolean r0 = X.W3E.A08(r1, r10)
            if (r0 == 0) goto L_0x0318
            java.util.Set r0 = r1.A24
            if (r0 == 0) goto L_0x03a3
            boolean r0 = r0.isEmpty()
            r12 = 0
            if (r0 == 0) goto L_0x03a4
        L_0x03a3:
            r12 = 1
        L_0x03a4:
            java.lang.CharSequence r0 = r9.getText()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            r0 = 2131970415(0x7f13496f, float:1.957778E38)
            X.C13988Tno.A0s(r11, r1, r0)
            java.lang.String r0 = " | "
            r1.append(r0)
            r0 = 2131968777(0x7f134309, float:1.9574458E38)
            if (r12 == 0) goto L_0x03c5
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
        L_0x03c5:
            X.C13988Tno.A0s(r11, r1, r0)
            r9.setText(r1)
            goto L_0x0318
        L_0x03cd:
            if (r9 == 0) goto L_0x0318
            com.instagram.business.promote.model.PromoteData r1 = r4.A0F
            if (r1 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A0i
            if (r0 == 0) goto L_0x04c2
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x04a7
            if (r0 == r13) goto L_0x048d
            if (r0 == r10) goto L_0x0450
            r1 = 7
            if (r0 == r1) goto L_0x0448
            r1 = 12
            if (r0 == r1) goto L_0x0433
            if (r0 != r11) goto L_0x0a3f
            android.content.Context r1 = r4.requireContext()
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r0.A0d
            if (r0 == 0) goto L_0x0a39
            int r0 = X.C18677Vwa.A00(r0)
            java.lang.String r12 = r1.getString(r0)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970727(0x7f134aa7, float:1.9578413E38)
        L_0x0405:
            java.lang.String r1 = r1.getString(r0)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostDestination r11 = r0.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r11 != r0) goto L_0x04d3
            boolean r0 = X.0mp.A0B(r12)
            if (r0 == 0) goto L_0x04d3
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970535(0x7f1349e7, float:1.9578024E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0424:
            r9.setText(r0)
            android.view.View r1 = r4.A03
            if (r1 == 0) goto L_0x0315
            r0 = 2131432454(0x7f0b1406, float:1.8486666E38)
            X.DbX.A1D(r1, r0, r2)
            goto L_0x0315
        L_0x0433:
            X.W1e r12 = X.WGS.A00
            android.content.Context r11 = r4.requireContext()
            com.instagram.common.session.UserSession r1 = r4.A0H
            if (r1 == 0) goto L_0x064c
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r0.A0e
            java.lang.String r12 = r12.A05(r11, r0, r1)
            goto L_0x0484
        L_0x0448:
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970729(0x7f134aa9, float:1.9578417E38)
            goto L_0x0405
        L_0x0450:
            android.content.Context r13 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.String r12 = r0.getUsername()
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostCallToAction r11 = r0.A0e
            java.lang.String r1 = "@"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            if (r11 == 0) goto L_0x047d
            java.lang.String r1 = "\n"
            r0.append(r1)
            r1 = 2131970409(0x7f134969, float:1.9577768E38)
            X.C18677Vwa.A02(r13, r11, r0, r1)
        L_0x047d:
            java.lang.String r12 = r0.toString()
            X.0qQ.A0A(r12)
        L_0x0484:
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970726(0x7f134aa6, float:1.9578411E38)
            goto L_0x0405
        L_0x048d:
            java.lang.String r0 = r1.A1I
            if (r0 == 0) goto L_0x0a4d
            java.lang.String r12 = X.C18779W1e.A02(r0)
            android.content.Context r1 = r4.requireContext()
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r0.A0b
            if (r0 == 0) goto L_0x0a47
            int r0 = X.C18677Vwa.A00(r0)
            goto L_0x0405
        L_0x04a7:
            r1 = 64
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.String r0 = r0.getUsername()
            java.lang.String r12 = X.002.A0D(r0, r1)
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970728(0x7f134aa8, float:1.9578415E38)
            goto L_0x0405
        L_0x04c2:
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970704(0x7f134a90, float:1.9578367E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r0 = r4.A00(r0)
            goto L_0x0424
        L_0x04d3:
            com.instagram.business.promote.model.PromoteData r13 = r4.A0F
            if (r13 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostDestination r11 = r13.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            if (r11 != r0) goto L_0x052a
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r13.A0d
            if (r0 == 0) goto L_0x052a
            com.instagram.leadgen.core.api.LeadForm r0 = r13.A16
            if (r0 == 0) goto L_0x052a
            android.app.Activity r14 = X.DbT.A03(r4)
            com.instagram.business.promote.model.PromoteData r12 = r4.A0F
            if (r12 == 0) goto L_0x07ce
            com.instagram.leadgen.core.api.LeadForm r0 = r12.A16
            if (r0 == 0) goto L_0x0a33
            java.lang.String r11 = r0.A02
            com.instagram.api.schemas.XIGIGBoostCallToAction r15 = r12.A0d
            if (r15 == 0) goto L_0x0a2d
            X.AnonymousClass7TG.A1T(r14, r11, r15)
            r0 = 2131970376(0x7f134948, float:1.9577701E38)
            java.lang.String r13 = X.DbW.A0h(r14, r11, r0)
            java.lang.String r12 = "\n"
            r11 = 2131970375(0x7f134947, float:1.95777E38)
            int r0 = X.C18677Vwa.A00(r15)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r0 = X.DbW.A0h(r14, r0, r11)
            java.lang.String r0 = X.002.A0g(r13, r12, r0)
            X.0qQ.A07(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "%s\n%s"
        L_0x051f:
            java.lang.String r0 = X.0mp.A06(r0, r1)
        L_0x0523:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setText(r0)
            goto L_0x0315
        L_0x052a:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.MULTI_DESTINATION_MESSAGE
            if (r11 != r0) goto L_0x0549
            android.content.Context r12 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x064c
            com.instagram.user.model.User r11 = X.AnonymousClass7TF.A0Q(r0)
            com.instagram.common.session.UserSession r1 = r4.A0H
            if (r1 == 0) goto L_0x064c
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r0.A0e
            android.text.SpannableStringBuilder r0 = X.C18779W1e.A00(r12, r0, r1, r11)
            goto L_0x0523
        L_0x0549:
            if (r12 == 0) goto L_0x0556
            java.lang.String r0 = r4.A00(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "%s | %s"
            goto L_0x051f
        L_0x0556:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r0 = X.0mp.A06(r1, r0)
            goto L_0x0523
        L_0x055d:
            r9 = r12
            goto L_0x02d1
        L_0x0560:
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x025d
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            X.DbX.A1D(r1, r0, r7)
            goto L_0x025d
        L_0x056c:
            A02(r4)
            goto L_0x06f5
        L_0x0571:
            r0 = 2131443641(0x7f0b3fb9, float:1.8509356E38)
            android.view.View r14 = r3.requireViewById(r0)
            X.0qQ.A07(r14)
            r0 = 2131438657(0x7f0b2c41, float:1.8499247E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r14, r0)
            r0 = 2131438656(0x7f0b2c40, float:1.8499245E38)
            android.widget.TextView r13 = X.AnonymousClass7TG.A0R(r14, r0)
            r0 = 2131438655(0x7f0b2c3f, float:1.8499243E38)
            android.widget.TextView r12 = X.AnonymousClass7TG.A0R(r14, r0)
            java.lang.String r0 = r5.A03
            java.lang.String r11 = X.W3x.A0H(r5)
            java.lang.String r9 = X.W3x.A0G(r5)
            if (r0 == 0) goto L_0x059f
            r1.setText(r0)
        L_0x059f:
            if (r11 == 0) goto L_0x0637
            if (r9 == 0) goto L_0x0637
            java.lang.String r8 = r5.A02
            r13.setText(r8)
            r12.setText(r9)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.business.promote.model.PromoteAudience r0 = r0.A07()
            boolean r0 = X.C18175Vmp.A01(r0)
            if (r0 == 0) goto L_0x062a
            java.util.List r0 = r5.A05
            if (r0 == 0) goto L_0x062a
            java.util.Iterator r15 = r0.iterator()
        L_0x05c1:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x062a
            java.lang.Object r7 = r15.next()
            com.instagram.api.schemas.AudienceMessageEntityRange r7 = (com.instagram.api.schemas.AudienceMessageEntityRange) r7
            java.lang.Integer r1 = r7.BXp()
            java.lang.Integer r6 = r7.BMP()
            java.lang.String r0 = r7.getUrl()
            if (r1 == 0) goto L_0x05c1
            if (r6 == 0) goto L_0x05c1
            if (r0 == 0) goto L_0x05c1
            java.lang.Integer r0 = r7.BXp()
            if (r0 == 0) goto L_0x05c1
            int r5 = r0.intValue()
            int r1 = r1.intValue()
            int r0 = r6.intValue()
            int r1 = r1 + r0
            int r1 = r1 + -1
            X.2HY r0 = new X.2HY
            r0.<init>(r5, r1)
            X.0qQ.A0B(r8, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x061c
            java.lang.String r0 = ""
        L_0x0604:
            android.content.Context r6 = r4.requireContext()
            android.content.Context r5 = r4.getContext()
            r1 = 2130970309(0x7f0406c5, float:1.7549324E38)
            int r5 = X.JTP.A02(r5, r6, r1)
            X.UsP r1 = new X.UsP
            r1.<init>((com.instagram.api.schemas.AudienceMessageEntityRange) r7, (X.C15320UaS) r4, (int) r5)
            X.AnonymousClass7AV.A07(r1, r13, r0, r8)
            goto L_0x05c1
        L_0x061c:
            int r1 = r0.A00
            int r0 = r0.A01
            int r0 = r0 + 1
            java.lang.String r0 = r8.substring(r1, r0)
            X.0qQ.A07(r0)
            goto L_0x0604
        L_0x062a:
            int r1 = X.Dbb.A04(r4)
            X.UsQ r0 = new X.UsQ
            r0.<init>((X.C15320UaS) r4, (java.lang.String) r11, (int) r1)
            X.AnonymousClass7AV.A07(r0, r12, r9, r9)
            goto L_0x063c
        L_0x0637:
            java.lang.String r0 = r5.A02
            r13.setText(r0)
        L_0x063c:
            X.WGU r5 = r4.A0B
            if (r5 == 0) goto L_0x00c5
            X.UzE r1 = X.C16678UzE.SUMMARY
            java.lang.String r0 = "audience_validation_row"
            goto L_0x00c2
        L_0x0646:
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 != 0) goto L_0x0651
            r18 = r16
        L_0x064c:
            X.0qQ.A0F(r18)
            goto L_0x0188
        L_0x0651:
            java.lang.String r0 = r0.A1a
            if (r0 == 0) goto L_0x06b8
            com.instagram.common.session.UserSession r5 = r4.A0H
            if (r5 == 0) goto L_0x064c
            X.0Tu r6 = X.0Tu.A05
            r0 = 36323217027116036(0x810bc600002c04, double:3.0342869375788006E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 != 0) goto L_0x0675
            com.instagram.common.session.UserSession r5 = r4.A0H
            if (r5 == 0) goto L_0x064c
            r0 = 36323217027181573(0x810bc600012c05, double:3.0342869376202464E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x06b8
        L_0x0675:
            r0 = 2131428280(0x7f0b03b8, float:1.84782E38)
            android.view.View r1 = r3.requireViewById(r0)
            r4.A00 = r1
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            r7 = 0
            if (r0 == 0) goto L_0x07ce
            java.lang.String r6 = r0.A1a
            if (r6 == 0) goto L_0x06b8
            if (r1 == 0) goto L_0x06e7
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r1, r0)
        L_0x0690:
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x069b
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r7 = X.AnonymousClass7TE.A0d(r1, r0)
        L_0x069b:
            if (r5 == 0) goto L_0x06a7
            android.content.Context r1 = r4.requireContext()
            r0 = 2131953974(0x7f130936, float:1.9544434E38)
            X.DbT.A18(r1, r5, r0)
        L_0x06a7:
            if (r7 == 0) goto L_0x06ac
            r7.setText(r6)
        L_0x06ac:
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x06b3
            r0.setVisibility(r2)
        L_0x06b3:
            if (r7 == 0) goto L_0x06b8
            r7.setVisibility(r2)
        L_0x06b8:
            r0 = 2131431449(0x7f0b1019, float:1.8484628E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A03 = r0
            r0 = 2131428242(0x7f0b0392, float:1.8478123E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A0N = r0
            r0 = 2131429154(0x7f0b0722, float:1.8479973E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A02 = r0
            r0 = 2131440696(0x7f0b3438, float:1.8503383E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A08 = r0
            r0 = 2131428212(0x7f0b0374, float:1.8478062E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A0O = r0
            goto L_0x0104
        L_0x06e7:
            r5 = r7
            goto L_0x0690
        L_0x06e9:
            X.WGU r9 = r4.A0B
            r1 = 11
            X.UcZ r0 = new X.UcZ
            r0.<init>(r9, r4, r1)
            r11.A06(r0)
        L_0x06f5:
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x06fc
            r0.setVisibility(r2)
        L_0x06fc:
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x0713
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x070a
            r0 = 2131443954(0x7f0b40f2, float:1.850999E38)
            X.DbX.A1D(r1, r0, r2)
        L_0x070a:
            X.WGU r1 = r4.A0B
            if (r1 == 0) goto L_0x0713
            java.lang.String r0 = "boost_review_budget_warning_icon"
            r1.A0H(r5, r0)
        L_0x0713:
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 == 0) goto L_0x0a22
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 != 0) goto L_0x072f
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE
            if (r1 == r0) goto L_0x072f
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x0738
        L_0x072f:
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x0738
            r0 = 67
            X.WBB.A01(r1, r0, r4)
        L_0x0738:
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x0ae8
            android.widget.TextView r1 = X.DbU.A0G(r0, r8)
            r0 = 2131970242(0x7f1348c2, float:1.957743E38)
            r1.setText(r0)
            android.content.Context r14 = r4.getContext()
            if (r14 == 0) goto L_0x07c4
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x0ae2
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r11 = X.AnonymousClass7TG.A0R(r1, r0)
            com.instagram.business.promote.model.PromoteState r1 = r4.A0G
            if (r1 == 0) goto L_0x0a22
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x09f5
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x09f5
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            java.util.List r0 = r0.A1v
            int r0 = r0.size()
            if (r0 <= r10) goto L_0x09f2
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            java.util.List r0 = r0.A1v
            int r13 = r0.size()
        L_0x0779:
            com.instagram.business.promote.model.PromoteData r9 = r4.A0F
            if (r9 == 0) goto L_0x07ce
            boolean r0 = r9.A2v
            if (r0 == 0) goto L_0x09d8
            int r1 = r9.A07
            r12 = 2131970710(0x7f134a96, float:1.9578379E38)
            int r13 = r13 * r1
            java.lang.String r0 = X.C13991Tnr.A0g(r9, r13)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x078f:
            java.lang.String r13 = r14.getString(r12, r0)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x07be
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            int r15 = r0.A06
            java.util.Currency r12 = r0.A1j
            X.0qQ.A06(r12)
            r9 = 2131953962(0x7f13092a, float:1.954441E38)
            double r0 = (double) r1
            java.lang.String r0 = X.C13992Tns.A0P(r12, r0, r2, r15)
            java.lang.String r0 = X.DbY.A0c(r14, r0, r9)
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r0}
            java.lang.String r0 = "%s\n(%s)"
            java.lang.String r13 = X.0mp.A06(r0, r1)
        L_0x07be:
            r11.setText(r13)
            r11.setVisibility(r2)
        L_0x07c4:
            android.view.View r1 = r4.A08
            if (r1 == 0) goto L_0x081e
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 != 0) goto L_0x07d3
            r16 = r17
        L_0x07ce:
            X.0qQ.A0F(r16)
            goto L_0x0188
        L_0x07d3:
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x081e
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            java.util.Date r0 = r0.A1k
            if (r0 == 0) goto L_0x081e
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r1, r8)
            r0 = 2131970734(0x7f134aae, float:1.9578427E38)
            r1.setText(r0)
            r1.setVisibility(r2)
            android.view.View r1 = r4.A08
            if (r1 == 0) goto L_0x0adc
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r11 = X.AnonymousClass7TG.A0R(r1, r0)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            java.util.Date r9 = r0.A1k
            if (r9 == 0) goto L_0x094e
            java.lang.String r0 = "EEE, MMM dd 'at' hh:mm a z"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            r1.setTimeZone(r0)
            java.lang.String r0 = r1.format(r9)
        L_0x0811:
            r11.setText(r0)
            r11.setVisibility(r2)
            android.view.View r0 = r4.A08
            if (r0 == 0) goto L_0x081e
            r0.setVisibility(r2)
        L_0x081e:
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            boolean r0 = r0.A0D()
            android.view.ViewStub r1 = r4.A09
            if (r0 == 0) goto L_0x0911
            r12 = 0
            if (r1 == 0) goto L_0x090e
            android.view.View r1 = r1.inflate()
        L_0x0831:
            r4.A05 = r1
            if (r1 == 0) goto L_0x083a
            r0 = 70
            X.WBB.A01(r1, r0, r4)
        L_0x083a:
            android.view.View r0 = r4.A05
            if (r0 == 0) goto L_0x0aca
            r11 = 2131436003(0x7f0b21e3, float:1.8493864E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.DbT.A0b(r0, r11)
            r4.A0I = r1
            java.lang.String r13 = "mediaThumbnailView"
            if (r1 == 0) goto L_0x0a1d
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.common.typedurl.ImageUrl r0 = r0.A11
            X.0qQ.A06(r0)
            r1.setUrl(r0, r4)
            android.view.View r0 = r4.A05
            if (r0 == 0) goto L_0x0ac4
            r9 = 2131438110(0x7f0b2a1e, float:1.8498138E38)
            android.widget.TextView r1 = X.DbU.A0G(r0, r9)
            r0 = 2131970699(0x7f134a8b, float:1.9578356E38)
            r1.setText(r0)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            java.util.List r0 = r0.A1w
            int r1 = r0.size()
            r0 = r20
            if (r1 < r0) goto L_0x08b3
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            java.util.List r0 = r0.A1w
            java.lang.String r0 = X.AnonymousClass7TE.A19(r0, r10)
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            android.view.ViewStub r0 = r4.A0A
            if (r0 == 0) goto L_0x088d
            android.view.View r12 = r0.inflate()
        L_0x088d:
            r4.A06 = r12
            if (r12 == 0) goto L_0x0896
            r0 = 64
            X.WBH.A01(r12, r0, r1, r4)
        L_0x0896:
            android.view.View r0 = r4.A06
            if (r0 == 0) goto L_0x0abe
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r0, r11)
            r4.A0I = r0
            if (r0 == 0) goto L_0x0a1d
            r0.setUrl(r1, r4)
            android.view.View r0 = r4.A06
            if (r0 == 0) goto L_0x0ab8
            android.widget.TextView r1 = X.DbU.A0G(r0, r9)
            r0 = 2131970700(0x7f134a8c, float:1.9578358E38)
        L_0x08b0:
            r1.setText(r0)
        L_0x08b3:
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            java.lang.String r1 = r0.A1J
            android.view.View r0 = r4.A04
            if (r1 == 0) goto L_0x08fa
            if (r0 == 0) goto L_0x08c2
            r0.setVisibility(r2)
        L_0x08c2:
            android.view.View r0 = r4.A04
            if (r0 == 0) goto L_0x0ab2
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r0, r8)
            r0 = 2131970459(0x7f13499b, float:1.957787E38)
            r7.setText(r0)
            android.content.Context r1 = r4.requireContext()
            android.content.Context r0 = r4.getContext()
            int r0 = X.2Yu.A03(r0)
            X.DbT.A17(r1, r7, r0)
            android.view.View r1 = r4.A04
            if (r1 == 0) goto L_0x08e8
            r0 = 69
            X.WBB.A01(r1, r0, r4)
        L_0x08e8:
            X.Vw9 r0 = new X.Vw9
            r0.<init>(r3, r5)
            r4.A0D = r0
            r0.A01()
            X.Vw9 r12 = r4.A0D
            if (r12 != 0) goto L_0x0951
            java.lang.String r16 = "createPromotionButtonHolder"
            goto L_0x07ce
        L_0x08fa:
            if (r0 == 0) goto L_0x08ff
            r0.setVisibility(r6)
        L_0x08ff:
            android.view.View r1 = r4.A07
            if (r1 != 0) goto L_0x0907
            java.lang.String r16 = "reviewScreenContentView"
            goto L_0x07ce
        L_0x0907:
            r0 = 2131438654(0x7f0b2c3e, float:1.849924E38)
            X.DbT.A1F(r1, r0, r6)
            goto L_0x08e8
        L_0x090e:
            r1 = r12
            goto L_0x0831
        L_0x0911:
            r0 = 0
            if (r1 == 0) goto L_0x0918
            android.view.View r0 = r1.inflate()
        L_0x0918:
            r4.A05 = r0
            if (r0 == 0) goto L_0x091f
            X.WB8.A00(r0, r2, r4)
        L_0x091f:
            android.view.View r1 = r4.A05
            if (r1 == 0) goto L_0x0ad6
            r0 = 2131436003(0x7f0b21e3, float:1.8493864E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.DbT.A0b(r1, r0)
            r4.A0I = r1
            if (r1 != 0) goto L_0x0932
            java.lang.String r16 = "mediaThumbnailView"
            goto L_0x07ce
        L_0x0932:
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.common.typedurl.ImageUrl r0 = r0.A11
            X.0qQ.A06(r0)
            r1.setUrl(r0, r4)
            android.view.View r1 = r4.A05
            if (r1 == 0) goto L_0x0ad0
            r0 = 2131438110(0x7f0b2a1e, float:1.8498138E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            r0 = 2131970732(0x7f134aac, float:1.9578423E38)
            goto L_0x08b0
        L_0x094e:
            r0 = 0
            goto L_0x0811
        L_0x0951:
            androidx.fragment.app.FragmentActivity r20 = r4.requireActivity()
            com.instagram.common.session.UserSession r11 = r4.A0H
            if (r11 == 0) goto L_0x09d4
            com.instagram.business.promote.model.PromoteData r9 = r4.A0F
            if (r9 == 0) goto L_0x07ce
            com.instagram.api.schemas.XIGIGBoostDestination r8 = r9.A0i
            com.instagram.model.mediatype.ProductType r7 = r9.A17
            boolean r1 = r9.A2j
            boolean r0 = r9.A2D
            boolean r28 = r9.A0D()
            r21 = r8
            r22 = r4
            r23 = r12
            r24 = r11
            r25 = r7
            r26 = r1
            r27 = r0
            X.C18165Vmf.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            A03(r4)
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 == 0) goto L_0x0a22
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0992
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = r4.A0J
            if (r0 == 0) goto L_0x0185
            r0.A01()
            A03(r4)
            A04(r4)
        L_0x0992:
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 == 0) goto L_0x0a22
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 != 0) goto L_0x09aa
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE
            if (r1 != r0) goto L_0x09b1
        L_0x09aa:
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = r4.A0J
            if (r0 == 0) goto L_0x0185
            r0.setVisibility(r6)
        L_0x09b1:
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.X6R
            if (r0 == 0) goto L_0x09c0
            X.X6R r1 = (X.X6R) r1
            if (r1 == 0) goto L_0x09c0
            r1.AUk()
        L_0x09c0:
            X.WGU r0 = r4.A0B
            if (r0 == 0) goto L_0x09c7
            X.C13988Tno.A1J(r0, r5)
        L_0x09c7:
            java.lang.String r5 = "reviewScreenContentView"
            java.lang.String r1 = "loadingSpinner"
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A0K
            if (r0 != 0) goto L_0x0a08
            X.0qQ.A0F(r1)
            goto L_0x0188
        L_0x09d4:
            r16 = r18
            goto L_0x07ce
        L_0x09d8:
            int r1 = r9.A0I
            r12 = 2131970709(0x7f134a95, float:1.9578377E38)
            int r13 = r13 * r1
            java.lang.String r9 = X.C13991Tnr.A0g(r9, r13)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x07ce
            int r0 = r0.A0A
            java.lang.String r0 = X.W2x.A00(r14, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r0}
            goto L_0x078f
        L_0x09f2:
            r13 = 1
            goto L_0x0779
        L_0x09f5:
            r0 = 2131970703(0x7f134a8f, float:1.9578365E38)
            java.lang.String r13 = r14.getString(r0)
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x07be
            r0 = 2131432454(0x7f0b1406, float:1.8486666E38)
            X.DbX.A1D(r1, r0, r2)
            goto L_0x07be
        L_0x0a08:
            X.DbS.A1T(r0)
            android.view.View r0 = r4.A07
            if (r0 == 0) goto L_0x0a18
            r0.setVisibility(r6)
            X.W1k r9 = r4.A0C
            if (r9 != 0) goto L_0x0a63
            java.lang.String r5 = "dataFetcher"
        L_0x0a18:
            X.0qQ.A0F(r5)
            goto L_0x0188
        L_0x0a1d:
            X.0qQ.A0F(r13)
            goto L_0x0188
        L_0x0a22:
            X.0qQ.A0F(r17)
            goto L_0x0188
        L_0x0a27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0a2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0a33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0a39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0a3f:
            java.lang.String r1 = "Unknown XIGIGBoostDestination"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0a47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0a4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0a53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0a59:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a63:
            r0 = 2061(0x80d, float:2.888E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            int r0 = r1.length()
            int r0 = r0 - r10
            java.lang.String r2 = X.C51967G9n.A0q(r1, r2, r0)
            X.WGU r1 = r4.A0B
            r0 = 12
            X.UcZ r8 = new X.UcZ
            r8.<init>(r1, r4, r2, r0)
            com.instagram.common.session.UserSession r7 = r9.A08
            com.instagram.business.promote.model.PromoteData r13 = r9.A03
            java.lang.String r6 = r13.A1A
            X.WGU r0 = r9.A02
            java.lang.String r5 = r0.A03
            java.lang.String r2 = r13.A1S
            int r12 = r13.A06
            java.util.List r11 = r13.A1v
            int r0 = r11.size()
            int r1 = r13.A0I
            if (r0 <= r10) goto L_0x0a98
            int r0 = r11.size()
            int r1 = r1 * r0
        L_0x0a98:
            if (r12 == 0) goto L_0x0a9d
            int r0 = r13.A06
            int r1 = r1 / r0
        L_0x0a9d:
            double r0 = (double) r1
            java.lang.String r0 = java.lang.Double.toString(r0)
            X.1OC r0 = X.W2V.A03(r7, r6, r5, r2, r0)
            X.C18784W1k.A02(r9, r8, r0)
            X.C13991Tnr.A0w(r4)
            r0 = r31
            super.onViewCreated(r3, r0)
            return
        L_0x0ab2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0ab8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0abe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0ac4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0aca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0ad0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0ad6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0adc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0ae2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0ae8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320UaS.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C15320UaS uaS) {
        String str;
        if (uaS.A0G == null) {
            str = "promoteState";
        } else {
            PromoteData promoteData = uaS.A0F;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                PromoteState.A00(promoteData);
                C13990Tnq.A0h();
                C15321UaT uaT = new C15321UaT();
                FragmentActivity requireActivity = uaS.requireActivity();
                UserSession userSession = uaS.A0H;
                if (userSession == null) {
                    str = "userSession";
                } else {
                    DbY.A14(uaT, requireActivity, userSession);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.A0v == com.instagram.business.promote.model.PromoteLaunchOrigin.A05) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x026f, code lost:
        if (r14 == false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0159, code lost:
        if (r14 == false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C15320UaS r16) {
        /*
            r4 = r16
            android.view.View r0 = r4.A0N
            r7 = 0
            if (r0 == 0) goto L_0x000a
            r0.setVisibility(r7)
        L_0x000a:
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            java.lang.String r16 = "promoteState"
            if (r0 == 0) goto L_0x029b
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            java.lang.String r15 = "promoteData"
            if (r0 == 0) goto L_0x0297
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 != 0) goto L_0x0026
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x0297
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.CLIENT_SPEC_OVERRIDE
            if (r1 != r0) goto L_0x002f
        L_0x0026:
            android.view.View r1 = r4.A0N
            if (r1 == 0) goto L_0x002f
            r0 = 65
            X.WBB.A01(r1, r0, r4)
        L_0x002f:
            android.view.View r1 = r4.A0N
            java.lang.String r8 = "Required value was null."
            if (r1 == 0) goto L_0x0291
            r0 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.DbU.A0G(r1, r0)
            r0 = 2131970201(0x7f134899, float:1.9577346E38)
            r1.setText(r0)
            android.view.View r1 = r4.A0N
            if (r1 == 0) goto L_0x028b
            r0 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r1, r0)
            com.instagram.business.promote.model.PromoteData r1 = r4.A0F
            if (r1 == 0) goto L_0x0297
            java.lang.String r0 = r1.A1Z
            if (r0 != 0) goto L_0x027a
            r14 = 0
        L_0x0056:
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 == 0) goto L_0x029b
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x024d
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x0297
            com.instagram.business.promote.model.PromoteAudience r6 = r0.A06()
            java.lang.String r13 = "userSession"
            if (r6 == 0) goto L_0x015f
            java.lang.String r9 = r6.A07
            if (r9 == 0) goto L_0x0286
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0286
            boolean r0 = X.W3x.A0P(r6)
            if (r0 != 0) goto L_0x0231
            android.content.Context r2 = r4.getContext()
            if (r2 == 0) goto L_0x00f0
            com.instagram.api.schemas.AdvantageAudienceData r0 = r6.A02
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = X.C13991Tnr.A0L(r0)
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r1 != r0) goto L_0x0217
            r5 = 2
            com.instagram.api.schemas.AdvantageAudienceData r0 = r6.A02
            r1 = 0
            if (r0 == 0) goto L_0x00aa
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = r0.Aa9()
            if (r0 == 0) goto L_0x00aa
            int r0 = r0.ordinal()
            if (r0 != r5) goto L_0x00aa
            r1 = 2131970173(0x7f13487d, float:1.957729E38)
            r0 = 2131968777(0x7f134309, float:1.9574458E38)
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r1 = X.DbW.A0h(r2, r0, r1)
        L_0x00aa:
            java.lang.String r1 = X.C16903VAg.A00(r9, r1)
            java.lang.String r0 = X.W3x.A0A(r2, r6)
            java.lang.String r1 = X.C16903VAg.A00(r1, r0)
            java.lang.String r0 = X.W3x.A06(r2, r6)
            java.lang.String r11 = X.C16903VAg.A00(r1, r0)
            java.lang.String r12 = X.W3x.A08(r2, r6)
            java.lang.String r10 = X.W3x.A07(r2, r6)
            java.lang.String r9 = ""
            if (r10 != 0) goto L_0x00cb
            r10 = r9
        L_0x00cb:
            java.lang.String r5 = X.W3x.A09(r2, r6)
            if (r5 != 0) goto L_0x00d2
            r5 = r9
        L_0x00d2:
            r1 = 2131970174(0x7f13487e, float:1.9577292E38)
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00e1
            java.lang.String r0 = ", "
            java.lang.String r9 = X.002.A0R(r0, r5)
        L_0x00e1:
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r10, r9}
            java.lang.String r0 = r2.getString(r1, r0)
            X.0qQ.A07(r0)
        L_0x00ec:
            java.lang.String r9 = X.C16903VAg.A00(r11, r0)
        L_0x00f0:
            android.content.Context r10 = r4.requireContext()
            com.instagram.business.promote.model.PromoteData r11 = r4.A0F
            if (r11 == 0) goto L_0x0297
            com.instagram.common.session.UserSession r2 = r11.A0y
            X.0qQ.A06(r2)
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r11.A0i
            boolean r0 = r11.A2d
            boolean r0 = X.W3E.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0126
            r0 = 2131970184(0x7f134888, float:1.9577312E38)
            java.lang.String r5 = r10.getString(r0)
            java.lang.String r2 = ": "
            boolean r1 = r11.A2e
            r0 = 2131968751(0x7f1342ef, float:1.9574405E38)
            if (r1 == 0) goto L_0x011a
            r0 = 2131968777(0x7f134309, float:1.9574458E38)
        L_0x011a:
            java.lang.String r0 = r10.getString(r0)
            java.lang.String r0 = X.002.A0g(r5, r2, r0)
            java.lang.String r9 = X.C16903VAg.A00(r9, r0)
        L_0x0126:
            r3.setText(r9)
            android.view.View r1 = r4.A0N
            if (r1 == 0) goto L_0x0280
            r0 = 2131443956(0x7f0b40f4, float:1.8509995E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r1, r0)
            android.content.Context r2 = r4.requireContext()
            com.instagram.business.promote.model.PromoteData r1 = r4.A0F
            if (r1 == 0) goto L_0x0297
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r0 = X.W3x.A05(r2, r0, r6, r1)
            r5.setText(r0)
            if (r14 == 0) goto L_0x0149
            r7 = 8
        L_0x0149:
            r5.setVisibility(r7)
            com.instagram.business.promote.model.PromoteState r1 = r4.A0G
            if (r1 == 0) goto L_0x029b
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x0297
            java.lang.String r0 = r0.A1Z
            if (r0 == 0) goto L_0x015b
            r0 = 1
            if (r14 != 0) goto L_0x015c
        L_0x015b:
            r0 = 0
        L_0x015c:
            r1.A0D(r0)
        L_0x015f:
            com.instagram.business.promote.model.PromoteState r0 = r4.A0G
            if (r0 == 0) goto L_0x029b
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x0297
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 == 0) goto L_0x0212
            if (r6 == 0) goto L_0x0212
            boolean r0 = r6.A0D
            r6 = 1
            if (r0 != r6) goto L_0x0212
            com.instagram.common.session.UserSession r5 = r4.A0H
            if (r5 == 0) goto L_0x029f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326867749320745(0x810f1800003829, double:3.036595669001337E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0212
            android.view.View r7 = r4.A0O
            if (r7 == 0) goto L_0x0212
            r0 = 2131431885(0x7f0b11cd, float:1.8485512E38)
            android.widget.TextView r1 = X.DbU.A0G(r7, r0)
            r0 = 2131970811(0x7f134afb, float:1.9578584E38)
            X.DbU.A1G(r1, r4, r0)
            r0 = 2131431883(0x7f0b11cb, float:1.8485508E38)
            android.widget.TextView r9 = X.AnonymousClass7TG.A0R(r7, r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r8 = X.DbU.A0m(r4, r0)
            r0 = 2131970810(0x7f134afa, float:1.9578582E38)
            r5 = 0
            java.lang.String r2 = X.C13991Tnr.A0d(r4, r8, r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            int r0 = X.2Yu.A06(r0)
            int r1 = r1.getColor(r0)
            X.UsR r0 = new X.UsR
            r0.<init>((X.C15320UaS) r4, (int) r1)
            X.AnonymousClass7AV.A07(r0, r9, r8, r2)
            r0 = 2131442937(0x7f0b3cf9, float:1.8507928E38)
            android.widget.TextView r1 = X.DbU.A0G(r7, r0)
            r0 = 2131970813(0x7f134afd, float:1.9578588E38)
            X.DbU.A1G(r1, r4, r0)
            r0 = 2131442935(0x7f0b3cf7, float:1.8507924E38)
            android.widget.TextView r1 = X.DbU.A0G(r7, r0)
            r0 = 2131970812(0x7f134afc, float:1.9578586E38)
            X.DbU.A1G(r1, r4, r0)
            r0 = 2131442936(0x7f0b3cf8, float:1.8507926E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r7, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r2
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x0297
            java.util.Set r1 = r0.A25
            com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory r0 = com.instagram.api.schemas.XFBAdproRegionalRegulatedCategory.TAIWAN_FINSERV
            boolean r0 = r1.contains(r0)
            r2.setChecked(r0)
            r1 = 7
            X.WYN r0 = new X.WYN
            r0.<init>(r4, r1)
            r2.A07 = r0
            r7.setVisibility(r5)
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x0212
            r4.A0S = r6
            X.WGU r2 = r4.A0B
            if (r2 == 0) goto L_0x0212
            X.UzE r1 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = "taiwan_finserv_toggle"
            r2.A0H(r1, r0)
        L_0x0212:
            r0 = 0
            r3.setVisibility(r0)
            return
        L_0x0217:
            java.lang.String r0 = X.W3x.A07(r2, r6)
            java.lang.String r1 = X.C16903VAg.A00(r9, r0)
            java.lang.String r0 = X.W3x.A0A(r2, r6)
            java.lang.String r11 = X.C16903VAg.A00(r1, r0)
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x0297
            java.lang.String r0 = X.W3x.A0C(r2, r6, r0)
            goto L_0x00ec
        L_0x0231:
            com.instagram.common.session.UserSession r0 = r4.A0H
            if (r0 == 0) goto L_0x029f
            boolean r0 = X.C18803W2r.A03(r0)
            if (r0 == 0) goto L_0x00f0
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x024a
            r0 = 2131954037(0x7f130975, float:1.9544562E38)
            java.lang.String r9 = r1.getString(r0)
            goto L_0x00f0
        L_0x024a:
            r9 = 0
            goto L_0x00f0
        L_0x024d:
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x0276
            com.instagram.business.promote.model.PromoteState r1 = r4.A0G
            if (r1 == 0) goto L_0x029b
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0276
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x0297
            X.C13990Tnq.A1H(r0, r1)
            com.instagram.business.promote.model.PromoteState r1 = r4.A0G
            if (r1 == 0) goto L_0x029b
            com.instagram.business.promote.model.PromoteData r0 = r4.A0F
            if (r0 == 0) goto L_0x0297
            java.lang.String r0 = r0.A1Z
            if (r0 == 0) goto L_0x0271
            r0 = 1
            if (r14 != 0) goto L_0x0272
        L_0x0271:
            r0 = 0
        L_0x0272:
            r1.A0D(r0)
            goto L_0x0212
        L_0x0276:
            r4.A09()
            goto L_0x0212
        L_0x027a:
            boolean r14 = X.W3x.A0S(r1, r0)
            goto L_0x0056
        L_0x0280:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0286:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x028b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0291:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0297:
            X.0qQ.A0F(r15)
            goto L_0x02a2
        L_0x029b:
            X.0qQ.A0F(r16)
            goto L_0x02a2
        L_0x029f:
            X.0qQ.A0F(r13)
        L_0x02a2:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320UaS.A02(X.UaS):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r0.ordinal() != 1) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r3, 36315838273293919L) != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0098, code lost:
        if (r1.A2E != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C15320UaS r8) {
        /*
            X.Vw9 r5 = r8.A0D
            if (r5 != 0) goto L_0x000e
            java.lang.String r7 = "createPromotionButtonHolder"
        L_0x0006:
            X.0qQ.A0F(r7)
        L_0x0009:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            com.instagram.business.promote.model.PromoteData r2 = r8.A0F
            java.lang.String r7 = "promoteData"
            if (r2 == 0) goto L_0x0006
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r2.A0i
            r4 = 1
            if (r0 == 0) goto L_0x0031
            com.instagram.business.promote.model.PromoteState r0 = r8.A0G
            java.lang.String r6 = "promoteState"
            if (r0 == 0) goto L_0x009b
            boolean r1 = r0.A02
            if (r1 == 0) goto L_0x0036
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0036
            r0 = 2131970208(0x7f1348a0, float:1.957736E38)
            java.lang.String r0 = r8.getString(r0)
            r8.A07(r0)
        L_0x0031:
            r4 = 0
        L_0x0032:
            r5.A04(r4)
            return
        L_0x0036:
            X.UKM r0 = r2.A0Y
            if (r0 == 0) goto L_0x0049
            X.UKW r0 = r0.A00
            if (r0 == 0) goto L_0x0049
            com.instagram.api.schemas.ErrorLevel r0 = r0.A01
            if (r0 == 0) goto L_0x0049
            int r0 = r0.ordinal()
            if (r0 == r4) goto L_0x0031
            goto L_0x0032
        L_0x0049:
            java.lang.String r6 = "userSession"
            if (r1 == 0) goto L_0x006d
            com.instagram.business.promote.model.PromoteAudience r0 = r2.A07()
            com.instagram.api.schemas.AudienceValidationResponse r0 = X.W3x.A03(r0)
            boolean r0 = X.W3x.A0L(r0)
            if (r0 == 0) goto L_0x006d
            com.instagram.common.session.UserSession r3 = r8.A0H
            if (r3 == 0) goto L_0x009b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315838273293919(0x81051000000e5f, double:3.029620583949837E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0031
        L_0x006d:
            com.instagram.business.promote.model.PromoteData r0 = r8.A0F
            if (r0 == 0) goto L_0x0006
            com.instagram.common.session.UserSession r3 = r8.A0H
            if (r3 == 0) goto L_0x009b
            com.instagram.business.promote.model.PromoteAudience r0 = r0.A06()
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.A0C
            if (r0 != r4) goto L_0x0032
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318539807791330(0x810785000118e2, double:3.031329045244206E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0032
            com.instagram.business.promote.model.PromoteData r1 = r8.A0F
            if (r1 == 0) goto L_0x0006
            boolean r0 = X.C18174Vmo.A00(r1)
            if (r0 == 0) goto L_0x0031
            boolean r0 = r1.A2E
            if (r0 != 0) goto L_0x0032
            goto L_0x0031
        L_0x009b:
            X.0qQ.A0F(r6)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320UaS.A03(X.UaS):void");
    }

    public static final void A04(C15320UaS uaS) {
        CharSequence charSequence;
        View view = uaS.A0P;
        if (view != null) {
            TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.description_text);
            PromoteData promoteData = uaS.A0F;
            if (promoteData == null) {
                0qQ.A0F("promoteData");
                throw AnonymousClass00P.createAndThrow();
            }
            if (promoteData.A2v) {
                charSequence = Html.fromHtml(DbV.A05(uaS).getString(2131970733));
            } else {
                charSequence = promoteData.A1T;
                if (charSequence == null) {
                    throw new IllegalStateException("payment guidance message can not be null when ig_android_promote_payment_guidance is enabled");
                }
            }
            A0R2.setText(charSequence);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A06(C15320UaS uaS, boolean z) {
        String str;
        C18643Vvl vvl = uaS.A0Q;
        if (vvl == null) {
            str = "actionBarButtonController";
        } else {
            vvl.A03(!z);
            uaS.A0L = z;
            C18654Vw9 vw9 = uaS.A0D;
            if (vw9 == null) {
                str = "createPromotionButtonHolder";
            } else {
                vw9.A05(z);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final boolean A08() {
        PromoteData promoteData = this.A0F;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        } else if (promoteData.A0l != BoostFlowType.BOOST_AGAIN || promoteData.A0f == null) {
            return false;
        } else {
            return true;
        }
    }

    public final void A09() {
        View view = this.A0N;
        if (view != null) {
            AnonymousClass7TG.A0R(view, R.id.secondary_text).setText(AnonymousClass7TE.A16(requireContext(), 2131970702));
            View view2 = this.A0N;
            if (view2 != null) {
                AnonymousClass7TF.A16(view2.findViewById(R.id.error_icon));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        AnonymousClass0eM r4 = this.A0T;
        if (182.A06(0Tu.A05, DbT.A0X(r4), 36318544103348451L)) {
            return DbS.A0T(r4);
        }
        UserSession userSession = this.A0H;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0035: MOVE  (r1v3 X.X7g) = (r1v2 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean onBackPressed() {
        /*
            r5 = this;
            X.WGU r2 = r5.A0B
            if (r2 == 0) goto L_0x000b
            X.UzE r1 = X.C16678UzE.SUMMARY
            java.lang.String r0 = "back_button"
            r2.A0F(r1, r0)
        L_0x000b:
            com.instagram.business.promote.model.PromoteData r4 = r5.A0F
            java.lang.String r0 = "promoteData"
            if (r4 != 0) goto L_0x0019
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0019:
            boolean r0 = r4.A2A
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4.A2N
            if (r0 == 0) goto L_0x0043
            r1 = 1
            r4.A2A = r2
        L_0x0026:
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0042
            if (r1 != 0) goto L_0x0042
            r3 = 0
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x0042
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0042
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r0 = r0.toString()
            r1.Clw(r0)
        L_0x0042:
            return r3
        L_0x0043:
            r1 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320UaS.onBackPressed():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r1v1 X.X6R) = (r1v0 X.X6R)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A05(X.C15320UaS r6, com.instagram.common.typedurl.ImageUrl r7, java.lang.String r8, java.lang.String r9) {
        /*
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            boolean r0 = r1 instanceof X.X6R
            if (r0 == 0) goto L_0x0014
            X.X6R r1 = (X.X6R) r1
            if (r1 == 0) goto L_0x0014
            r5 = 0
            r6 = 1
            r2 = r7
            r3 = r8
            r4 = r9
            r1.CpG(r2, r3, r4, r5, r6)
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320UaS.A05(X.UaS, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String):void");
    }

    private final void A07(String str) {
        if (getContext() != null) {
            Context context = getContext();
            if (str == null || str.length() == 0) {
                str = getString(2131970713);
                0qQ.A0A(str);
            }
            C59689JTv.A09(context, str);
        }
    }

    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int A022 = AnonymousClass0fD.A02(-1573074213);
        C15320UaS.super.onCreate(bundle);
        this.A0F = XAI.A00(this);
        this.A0G = XA9.A00(this);
        AnonymousClass0eM r4 = this.A0T;
        String str = "userSession";
        if (182.A06(0Tu.A05, DbT.A0X(r4), 36318544103348451L)) {
            userSession = AnonymousClass7TE.A0l(r4);
        } else {
            PromoteData promoteData = this.A0F;
            if (promoteData == null) {
                str = "promoteData";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            userSession = promoteData.A0y;
            0qQ.A06(userSession);
        }
        this.A0H = userSession;
        if (userSession != null) {
            this.A0R = 1Au.A00(userSession);
            AnonymousClass0fD.A09(-562167088, A022);
            return;
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
            r0 = -2068708227(0xffffffff84b2047d, float:-4.185172E-36)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x0020
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0020
            X.UzE r0 = X.C16678UzE.SUMMARY
            java.lang.String r0 = r0.toString()
            r1.Clx(r0)
        L_0x0020:
            r0 = 2131628509(0x7f0e11dd, float:1.8884313E38)
            android.view.View r1 = r5.inflate(r0, r6, r2)
            r0 = -1883327872(0xffffffff8fbeb280, float:-1.8804202E-29)
            X.AnonymousClass0fD.A09(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15320UaS.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1220936352);
        super.onDestroy();
        this.A0B = null;
        AnonymousClass0fD.A09(128307284, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1219053633);
        this.A03 = null;
        this.A0N = null;
        this.A0O = null;
        this.A02 = null;
        this.A08 = null;
        this.A05 = null;
        this.A06 = null;
        this.A0P = null;
        this.A09 = null;
        this.A0A = null;
        this.A04 = null;
        this.A01 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(1521522159, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(2043669261);
        super.onResume();
        if (A08()) {
            PromoteState promoteState = this.A0G;
            if (promoteState == null) {
                str = "promoteState";
            } else if (!promoteState.A00) {
                C18784W1k w1k = this.A0C;
                if (w1k == null) {
                    str = "dataFetcher";
                } else {
                    w1k.A06(new C15423UcZ(this.A0B, this, 11));
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(1497563113, A022);
    }
}
