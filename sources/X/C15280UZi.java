package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.UZi  reason: case insensitive filesystem */
public final class C15280UZi extends AnonymousClass4DH implements AnonymousClass4DS, X3S {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceFragment";
    public Drawable A00;
    public Drawable A01;
    public SpannableStringBuilder A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public EditText A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public C18643Vvl A0P;
    public C18761Vzw A0Q;
    public SpinnerImageView A0R;
    public C252063oV A0S;
    public final C358618bC A0T = new WYN(this, 2);
    public final C358618bC A0U = new WYN(this, 3);
    public final AnonymousClass0eM A0V = C20702WxZ.A01(this, 0);
    public final AnonymousClass0eM A0W = C20702WxZ.A01(this, 1);
    public final AnonymousClass0eM A0X = C20702WxZ.A00(this, 2);
    public final AnonymousClass0eM A0Y = C20702WxZ.A01(this, 4);
    public final AnonymousClass0eM A0Z = C20702WxZ.A00(this, 5);
    public final AnonymousClass0eM A0a = C20702WxZ.A00(this, 3);
    public final AnonymousClass0eM A0b = C20702WxZ.A01(this, 6);

    public final void Dab(PromoteState promoteState, Integer num) {
        PromoteAudienceInfo promoteAudienceInfo;
        C18761Vzw vzw;
        0qQ.A0B(num, 1);
        if (num == AnonymousClass05K.A15) {
            A04(this);
            promoteAudienceInfo = A01(this).A0q;
            if (promoteAudienceInfo == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (num == AnonymousClass05K.A1F) {
            A04(this);
            promoteAudienceInfo = A01(this).A0p;
            if (promoteAudienceInfo == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            return;
        }
        if (promoteAudienceInfo.A00() && (vzw = this.A0Q) != null) {
            vzw.A02(promoteAudienceInfo);
        }
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        int i = 2131970342;
        if (A08(this)) {
            i = 2131970470;
        }
        C13992Tns.A0r(r5, i);
        C18643Vvl A002 = C18643Vvl.A00(this, r5);
        this.A0P = A002;
        A002.A01(new WBB(this, 3), AnonymousClass05K.A1F);
        C18643Vvl vvl = this.A0P;
        if (vvl == null) {
            0qQ.A0F("actionBarButtonController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            vvl.A02(true);
        }
    }

    public final String getModuleName() {
        return C273654mx.A00(3180);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        1OC A012;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0S = DbU.A0Y(view, R.id.main_container_stub);
        this.A0R = (SpinnerImageView) view.findViewById(R.id.loading_spinner);
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_error_outline_16);
        if (drawable != null) {
            this.A01 = drawable;
            DbX.A11(requireContext(), drawable, 2Yu.A03(getContext()));
            Drawable drawable2 = requireContext().getDrawable(R.drawable.instagram_circle_check_outline_16);
            if (drawable2 != null) {
                this.A00 = drawable2;
                DbX.A11(requireContext(), drawable2, 2Yu.A0H(getContext(), R.attr.igds_color_success));
                if (0qQ.A0K(PromoteAudienceInfo.A09, A01(this).A0q)) {
                    if (A08(this)) {
                        str = "ads/promote/audience_edit_screen_v2/";
                    } else {
                        str = "ads/promote/audience_create_screen/";
                    }
                    String A0R2 = 002.A0R("/api/v1/", str);
                    C15423UcZ ucZ = new C15423UcZ(C13990Tnq.A0M(this.A0Y), this, C51967G9n.A0q(A0R2, 0, DbX.A05(A0R2) - 1), 9);
                    AnonymousClass0eM r2 = this.A0V;
                    Object value = r2.getValue();
                    C18784W1k w1k = (C18784W1k) this.A0X.getValue();
                    if (value != null) {
                        A012 = W2V.A02(w1k.A08, w1k.A03.A1A, DbS.A0t(r2), w1k.A02.A03);
                    } else {
                        UserSession userSession = w1k.A08;
                        PromoteData promoteData = w1k.A03;
                        String str2 = promoteData.A1A;
                        String str3 = promoteData.A1S;
                        ImmutableList A032 = promoteData.A03();
                        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
                        xIGIGBoostDestination.getClass();
                        A012 = C18765W0j.A01(xIGIGBoostDestination, userSession, str2, str3, A032);
                    }
                    C18784W1k.A02(w1k, ucZ, A012);
                } else {
                    A03(this);
                    A04(this);
                }
                C13990Tnq.A0O(this.A0Z).A0A(this);
                C13988Tno.A1J(C13990Tnq.A0M(this.A0Y), this.A0W.getValue());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final PromoteData A01(C15280UZi uZi) {
        return (PromoteData) AnonymousClass7TE.A14(uZi.A0a);
    }

    public static final UserSession A02(C15280UZi uZi) {
        return (UserSession) AnonymousClass7TE.A14(uZi.A0b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c8, code lost:
        if (A07(r15) == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ec, code lost:
        if (A07(r15) != false) goto L_0x0109;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C15280UZi r15) {
        /*
            X.3oV r0 = r15.A0S
            if (r0 != 0) goto L_0x000e
            java.lang.String r14 = "mainContainerStub"
        L_0x0006:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            android.view.View r3 = r0.getView()
            r0 = 2131434977(0x7f0b1de1, float:1.8491783E38)
            android.widget.TextView r0 = X.DbU.A0G(r3, r0)
            r15.A0K = r0
            r0 = 2131428240(0x7f0b0390, float:1.8478119E38)
            android.view.View r5 = X.AnonymousClass7TE.A0b(r3, r0)
            X.0eM r1 = r15.A0W
            java.lang.Object r7 = r1.getValue()
            X.UzE r7 = (X.C16678UzE) r7
            androidx.fragment.app.FragmentActivity r6 = r15.requireActivity()
            com.instagram.business.promote.model.PromoteData r9 = A01(r15)
            X.0eM r0 = r15.A0X
            java.lang.Object r8 = r0.getValue()
            X.W1k r8 = (X.C18784W1k) r8
            X.Vzw r4 = new X.Vzw
            r4.<init>(r5, r6, r7, r8, r9)
            r15.A0Q = r4
            r0 = 2131428238(0x7f0b038e, float:1.8478115E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r3, r0)
            r0 = 2131428218(0x7f0b037a, float:1.8478074E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r2, r0)
            r0 = 2131428217(0x7f0b0379, float:1.8478072E38)
            android.widget.EditText r0 = X.DbU.A0E(r2, r0)
            r15.A0B = r0
            r0 = 2131441756(0x7f0b385c, float:1.8505533E38)
            android.widget.ImageView r2 = X.DbU.A0F(r2, r0)
            r15.A0C = r2
            if (r2 != 0) goto L_0x0066
            java.lang.String r14 = "audienceNameInputStatusIcon"
            goto L_0x0006
        L_0x0066:
            android.graphics.drawable.Drawable r0 = r15.A01
            if (r0 != 0) goto L_0x006d
            java.lang.String r14 = "errorIcon"
            goto L_0x0006
        L_0x006d:
            r2.setImageDrawable(r0)
            android.widget.EditText r4 = r15.A0B
            if (r4 != 0) goto L_0x0077
            java.lang.String r14 = "audienceNameInput"
            goto L_0x0006
        L_0x0077:
            r2 = 2
            X.W7Z r0 = new X.W7Z
            r0.<init>(r2, r5, r15)
            r4.addTextChangedListener(r0)
            r0 = 2131435695(0x7f0b20af, float:1.849324E38)
            android.view.View r6 = X.AnonymousClass7TE.A0b(r3, r0)
            r10 = 2131440547(0x7f0b33a3, float:1.850308E38)
            android.widget.TextView r0 = X.DbU.A0G(r6, r10)
            r15.A0M = r0
            r4 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r4)
            r15.A0L = r0
            android.widget.TextView r2 = r15.A0M
            if (r2 != 0) goto L_0x00a1
            java.lang.String r14 = "locationRowTitleView"
            goto L_0x0006
        L_0x00a1:
            r0 = 2131970333(0x7f13491d, float:1.9577614E38)
            r2.setText(r0)
            r5 = 8
            X.WBB.A01(r6, r5, r15)
            r0 = 2131434985(0x7f0b1de9, float:1.84918E38)
            android.view.View r0 = r3.requireViewById(r0)
            r15.A07 = r0
            r0 = 2131434984(0x7f0b1de8, float:1.8491797E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r3, r0)
            android.widget.TextView r0 = X.DbU.A0G(r2, r10)
            r15.A0I = r0
            r9 = 2131440491(0x7f0b336b, float:1.8502967E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r2, r4)
            r15.A0G = r0
            android.widget.TextView r0 = r15.A0I
            r11 = 0
            if (r0 != 0) goto L_0x00d4
            java.lang.String r14 = "interestRowTitleView"
            goto L_0x0006
        L_0x00d4:
            r7 = 2131970316(0x7f13490c, float:1.957758E38)
            r0.setText(r7)
            r0 = 6
            X.WBB.A01(r2, r0, r15)
            android.view.View r6 = r15.A07
            r8 = 0
            if (r6 == 0) goto L_0x010e
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            com.instagram.api.schemas.XIGIGBoostDestination r2 = r0.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r2 != r0) goto L_0x02ce
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            boolean r0 = X.C16900VAd.A00(r0)
            if (r0 != 0) goto L_0x02ce
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            if (r0 == 0) goto L_0x0109
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x0109
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02ce
        L_0x0109:
            r0 = 8
        L_0x010b:
            r6.setVisibility(r0)
        L_0x010e:
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r2 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            if (r0 != r2) goto L_0x0147
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            boolean r0 = X.C16900VAd.A00(r0)
            if (r0 != 0) goto L_0x0147
            android.widget.TextView r13 = r15.A0K
            java.lang.String r14 = "interestWarningText"
            if (r13 == 0) goto L_0x0006
            X.9F0 r12 = X.C375769Ez.A00
            androidx.fragment.app.FragmentActivity r6 = r15.requireActivity()
            com.instagram.common.session.UserSession r0 = A02(r15)
            android.text.SpannableStringBuilder r0 = r12.A06(r6, r0)
            r13.setText(r0)
            android.widget.TextView r0 = r15.A0K
            if (r0 == 0) goto L_0x0006
            X.DbT.A1H(r0)
            android.widget.TextView r0 = r15.A0K
            if (r0 == 0) goto L_0x0006
            r0.setVisibility(r8)
        L_0x0147:
            r0 = 2131434983(0x7f0b1de7, float:1.8491795E38)
            android.view.View r0 = r3.requireViewById(r0)
            r15.A08 = r0
            r0 = 2131434982(0x7f0b1de6, float:1.8491793E38)
            android.view.View r6 = X.AnonymousClass7TE.A0b(r3, r0)
            android.widget.TextView r0 = X.DbU.A0G(r6, r10)
            r15.A0J = r0
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r4)
            r15.A0H = r0
            android.widget.TextView r0 = r15.A0J
            if (r0 == 0) goto L_0x016a
            r0.setText(r7)
        L_0x016a:
            r0 = 7
            X.WBB.A01(r6, r0, r15)
            android.view.View r8 = r15.A08
            r6 = 8
            r7 = 0
            if (r8 == 0) goto L_0x019e
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            if (r0 != r2) goto L_0x02b5
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            boolean r0 = X.C16900VAd.A00(r0)
            if (r0 != 0) goto L_0x02b5
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            if (r0 == 0) goto L_0x0199
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x0199
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02b5
        L_0x0199:
            r2 = 8
        L_0x019b:
            r8.setVisibility(r2)
        L_0x019e:
            android.view.View r2 = r15.A08
            if (r2 == 0) goto L_0x01bc
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r15)
            if (r0 == 0) goto L_0x01ac
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r7 = r0.Aa9()
        L_0x01ac:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r7 != r0) goto L_0x01b9
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            boolean r0 = r0.A2y
            if (r0 == 0) goto L_0x01b9
            r6 = 0
        L_0x01b9:
            r2.setVisibility(r6)
        L_0x01bc:
            r0 = 2131427849(0x7f0b0209, float:1.8477326E38)
            android.view.View r2 = r3.findViewById(r0)
            r15.A03 = r2
            r6 = 0
            if (r2 == 0) goto L_0x02b2
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r2, r10)
        L_0x01cc:
            r15.A0E = r0
            if (r2 == 0) goto L_0x02af
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r2, r4)
        L_0x01d4:
            r15.A0D = r0
            android.widget.TextView r4 = r15.A0E
            if (r4 == 0) goto L_0x01e0
            r0 = 2131970308(0x7f134904, float:1.9577563E38)
            r4.setText(r0)
        L_0x01e0:
            if (r2 == 0) goto L_0x01e6
            r0 = 4
            X.WBB.A01(r2, r0, r15)
        L_0x01e6:
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r15)
            if (r0 == 0) goto L_0x01f0
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r6 = r0.Aa9()
        L_0x01f0:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r4 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r6 != r4) goto L_0x02aa
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            boolean r0 = r0.A2y
            if (r0 != 0) goto L_0x02aa
            boolean r0 = A07(r15)
            if (r0 == 0) goto L_0x02aa
            if (r2 == 0) goto L_0x0209
            r0 = 8
        L_0x0206:
            r2.setVisibility(r0)
        L_0x0209:
            r0 = 2131434976(0x7f0b1de0, float:1.8491781E38)
            android.view.View r0 = r3.requireViewById(r0)
            r15.A09 = r0
            boolean r0 = r15.A06()
            android.view.View r2 = r15.A09
            if (r0 == 0) goto L_0x02fe
            if (r2 == 0) goto L_0x02a7
            r0 = 2131442375(0x7f0b3ac7, float:1.8506788E38)
            android.view.View r12 = r2.findViewById(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r12 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r12
        L_0x0225:
            boolean r0 = A08(r15)
            r6 = 0
            r2 = 1
            if (r0 == 0) goto L_0x02a1
            if (r12 == 0) goto L_0x0240
            com.instagram.api.schemas.TargetingRelaxationConstants r7 = com.instagram.api.schemas.TargetingRelaxationConstants.EXPANSION
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            com.instagram.api.schemas.TargetingRelaxationConstants r0 = r0.A03
            boolean r0 = X.AnonymousClass7TF.A1W(r7, r0)
            r12.setChecked(r0)
        L_0x0240:
            X.0eM r0 = r15.A0Z
            com.instagram.business.promote.model.PromoteState r8 = X.C13990Tnq.A0O(r0)
            com.instagram.business.promote.model.PromoteData r7 = A01(r15)
            if (r12 == 0) goto L_0x029e
            boolean r0 = r12.isChecked()
            if (r0 != r2) goto L_0x029e
            com.instagram.api.schemas.TargetingRelaxationConstants r2 = com.instagram.api.schemas.TargetingRelaxationConstants.EXPANSION
        L_0x0254:
            X.0qQ.A0B(r7, r6)
            X.VuU r0 = X.C18167Vmh.A01(r7)
            r0.A03 = r2
            X.C18578VuU.A00(r0, r7, r8)
            if (r12 == 0) goto L_0x0266
            X.8bC r0 = r15.A0U
            r12.A07 = r0
        L_0x0266:
            android.view.View r0 = r15.A09
            if (r0 == 0) goto L_0x02f6
            android.widget.TextView r7 = X.AnonymousClass7TE.A0d(r0, r9)
            if (r7 == 0) goto L_0x02f6
            r0 = 2131970319(0x7f13490f, float:1.9577586E38)
            java.lang.String r2 = r15.getString(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r2)
            r15.A02 = r0
            r0 = 2131970321(0x7f134911, float:1.957759E38)
            java.lang.String r2 = X.DbU.A0m(r15, r0)
            java.lang.String r0 = "https://www.facebook.com/business/help/283579896000936"
            r15.A05(r2, r0)
            r0 = 2131970320(0x7f134910, float:1.9577588E38)
            java.lang.String r2 = X.DbU.A0m(r15, r0)
            java.lang.String r0 = "https://www.facebook.com/business/help/128066880933676?id=176276233019487"
            r15.A05(r2, r0)
            android.text.SpannableStringBuilder r0 = r15.A02
            if (r0 != 0) goto L_0x02f3
            java.lang.String r14 = "interestTargetingBody"
            goto L_0x0006
        L_0x029e:
            com.instagram.api.schemas.TargetingRelaxationConstants r2 = com.instagram.api.schemas.TargetingRelaxationConstants.A05
            goto L_0x0254
        L_0x02a1:
            if (r12 == 0) goto L_0x0240
            r12.setChecked(r2)
            goto L_0x0240
        L_0x02a7:
            r12 = 0
            goto L_0x0225
        L_0x02aa:
            if (r2 == 0) goto L_0x0209
            r0 = 0
            goto L_0x0206
        L_0x02af:
            r0 = r11
            goto L_0x01d4
        L_0x02b2:
            r0 = r11
            goto L_0x01cc
        L_0x02b5:
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r15)
            if (r0 == 0) goto L_0x02cc
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r2 = r0.Aa9()
        L_0x02bf:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r2 != r0) goto L_0x0199
            boolean r0 = A07(r15)
            r2 = 0
            if (r0 != 0) goto L_0x019b
            goto L_0x0199
        L_0x02cc:
            r2 = r11
            goto L_0x02bf
        L_0x02ce:
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r15)
            if (r0 == 0) goto L_0x02ee
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = r0.Aa9()
            if (r0 == 0) goto L_0x02ee
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r15)
            if (r0 == 0) goto L_0x02f1
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r2 = r0.Aa9()
        L_0x02e4:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.OFF
            if (r2 == r0) goto L_0x02ee
            boolean r0 = A07(r15)
            if (r0 != 0) goto L_0x0109
        L_0x02ee:
            r0 = 0
            goto L_0x010b
        L_0x02f1:
            r2 = r11
            goto L_0x02e4
        L_0x02f3:
            X.DbX.A1G(r7, r0)
        L_0x02f6:
            android.view.View r0 = r15.A09
            if (r0 == 0) goto L_0x0303
            r0.setVisibility(r6)
            goto L_0x0303
        L_0x02fe:
            if (r2 == 0) goto L_0x0303
            r2.setVisibility(r5)
        L_0x0303:
            r0 = 2131427825(0x7f0b01f1, float:1.8477277E38)
            android.view.View r12 = X.AnonymousClass7TF.A0G(r3, r0)
            boolean r0 = A07(r15)
            if (r0 == 0) goto L_0x043e
            r0 = 2131427817(0x7f0b01e9, float:1.847726E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r12, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r8 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r8
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r15)
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = X.C13991Tnr.A0L(r0)
            r7 = 0
            boolean r0 = X.AnonymousClass7TF.A1W(r0, r4)
            r8.setChecked(r0)
            X.0eM r0 = r15.A0Y
            X.WGU r6 = X.C13990Tnq.A0M(r0)
            java.lang.Object r2 = r1.getValue()
            X.UzE r2 = (X.C16678UzE) r2
            java.lang.String r0 = "adv_audience_toggle"
            r6.A0H(r2, r0)
            r12.setVisibility(r7)
            X.8bC r0 = r15.A0T
            r8.A07 = r0
        L_0x0341:
            r0 = 2131436366(0x7f0b234e, float:1.84946E38)
            android.view.View r8 = r3.requireViewById(r0)
            r15.A0A = r8
            boolean r0 = A07(r15)
            if (r0 == 0) goto L_0x0395
            com.instagram.api.schemas.AdvantageAudienceData r2 = A00(r15)
            r0 = 0
            if (r2 == 0) goto L_0x0437
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r2 = r2.Aa9()
            if (r2 != r4) goto L_0x0437
            X.0eM r2 = r15.A0Y
            X.WGU r7 = X.C13990Tnq.A0M(r2)
            java.lang.Object r6 = r1.getValue()
            X.UzE r6 = (X.C16678UzE) r6
            java.lang.String r2 = "minimum_age_constraint"
            r7.A0H(r6, r2)
            if (r8 == 0) goto L_0x0378
            r2 = 0
            r8.setVisibility(r2)
        L_0x0374:
            android.widget.TextView r11 = X.AnonymousClass7TE.A0d(r8, r10)
        L_0x0378:
            r15.A0O = r11
            if (r8 == 0) goto L_0x0382
            android.view.View r0 = r8.findViewById(r9)
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0382:
            r15.A0N = r0
            android.widget.TextView r2 = r15.A0O
            if (r2 == 0) goto L_0x038e
            r0 = 2131970351(0x7f13492f, float:1.957765E38)
            r2.setText(r0)
        L_0x038e:
            if (r8 == 0) goto L_0x0395
            r0 = 9
            X.WBB.A01(r8, r0, r15)
        L_0x0395:
            r0 = 2131428249(0x7f0b0399, float:1.8478137E38)
            android.view.View r2 = r3.requireViewById(r0)
            r15.A04 = r2
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r15)
            r7 = 0
            if (r0 == 0) goto L_0x0434
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = r0.Aa9()
        L_0x03a9:
            r3 = 0
            r6 = 8
            if (r0 != r4) goto L_0x042c
            boolean r0 = A07(r15)
            if (r0 == 0) goto L_0x042c
            X.0eM r0 = r15.A0Y
            X.WGU r4 = X.C13990Tnq.A0M(r0)
            java.lang.Object r1 = r1.getValue()
            X.UzE r1 = (X.C16678UzE) r1
            java.lang.String r0 = "optional_suggestions"
            r4.A0H(r1, r0)
            if (r2 == 0) goto L_0x0432
            r2.setVisibility(r3)
        L_0x03ca:
            r0 = 2131428250(0x7f0b039a, float:1.847814E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r2, r0)
        L_0x03d1:
            r15.A0F = r5
            if (r5 == 0) goto L_0x03ea
            android.content.Context r4 = r15.requireContext()
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            boolean r1 = r0.A2y
            r0 = 2131970348(0x7f13492c, float:1.9577645E38)
            if (r1 == 0) goto L_0x03e7
            r0 = 2131970346(0x7f13492a, float:1.957764E38)
        L_0x03e7:
            X.DbT.A18(r4, r5, r0)
        L_0x03ea:
            if (r2 == 0) goto L_0x042a
            r0 = 2131429894(0x7f0b0a06, float:1.8481474E38)
            android.view.View r0 = r2.findViewById(r0)
        L_0x03f3:
            r15.A06 = r0
            if (r2 == 0) goto L_0x03fe
            r0 = 2131429901(0x7f0b0a0d, float:1.8481488E38)
            android.view.View r7 = r2.findViewById(r0)
        L_0x03fe:
            r15.A05 = r7
            android.view.View r1 = r15.A06
            if (r1 == 0) goto L_0x0412
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            boolean r0 = r0.A2y
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x040f
            r6 = 0
        L_0x040f:
            r1.setVisibility(r6)
        L_0x0412:
            android.view.View r1 = r15.A05
            if (r1 == 0) goto L_0x0423
            com.instagram.business.promote.model.PromoteData r0 = A01(r15)
            boolean r0 = r0.A2y
            if (r0 != 0) goto L_0x0420
            r3 = 8
        L_0x0420:
            r1.setVisibility(r3)
        L_0x0423:
            if (r2 == 0) goto L_0x0429
            r0 = 5
            X.WBB.A01(r2, r0, r15)
        L_0x0429:
            return
        L_0x042a:
            r0 = r7
            goto L_0x03f3
        L_0x042c:
            if (r2 == 0) goto L_0x0432
            r2.setVisibility(r5)
            goto L_0x03ca
        L_0x0432:
            r5 = r7
            goto L_0x03d1
        L_0x0434:
            r0 = r7
            goto L_0x03a9
        L_0x0437:
            if (r8 == 0) goto L_0x0378
            r8.setVisibility(r5)
            goto L_0x0374
        L_0x043e:
            r12.setVisibility(r5)
            goto L_0x0341
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15280UZi.A03(X.UZi):void");
    }

    private final void A05(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = this.A02;
        if (spannableStringBuilder == null) {
            0qQ.A0F("interestTargetingBody");
            throw AnonymousClass00P.createAndThrow();
        }
        Context requireContext = requireContext();
        UserSession A022 = A02(this);
        String A012 = SQU.A01(requireContext(), str2);
        0qQ.A07(A012);
        AnonymousClass7AV.A02(spannableStringBuilder, new C69192Ngq(requireContext, A022, (OAJ) null, A012, Dbb.A04(this)), str);
        this.A02 = spannableStringBuilder;
    }

    public static final boolean A08(C15280UZi uZi) {
        return AnonymousClass7TF.A1W(uZi.A0W.getValue(), C16678UzE.EDIT_AUDIENCE);
    }

    public static AdvantageAudienceData A00(C15280UZi uZi) {
        return A01(uZi).A0q.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r2.isEmpty() != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        if (A07(r10) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fb, code lost:
        if (A07(r10) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011b, code lost:
        if (A01(r10).A2y == false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C15280UZi r10) {
        /*
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            com.instagram.business.promote.model.PromoteAudienceInfo r1 = r0.A0q
            X.0qQ.A06(r1)
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0016
            X.Vzw r0 = r10.A0Q
            if (r0 == 0) goto L_0x0016
            r0.A02(r1)
        L_0x0016:
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            java.lang.String r1 = r0.A05
            android.widget.EditText r0 = r10.A0B
            if (r0 != 0) goto L_0x002c
            java.lang.String r8 = "audienceNameInput"
        L_0x0024:
            X.0qQ.A0F(r8)
        L_0x0027:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002c:
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = ""
        L_0x0030:
            r0.setText(r1)
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            java.util.List r2 = r0.A07
            r3 = 0
            if (r2 == 0) goto L_0x0045
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0046
        L_0x0045:
            r0 = 1
        L_0x0046:
            java.lang.String r8 = "locationRowTitleView"
            java.lang.String r5 = "locationRowSubtitleView"
            if (r0 != 0) goto L_0x02fe
            android.content.Context r0 = r10.requireContext()
            java.lang.String r1 = X.W3x.A0E(r0, r2)
            android.widget.TextView r0 = r10.A0L
            if (r0 == 0) goto L_0x0314
            r0.setText(r1)
            android.widget.TextView r0 = r10.A0L
            if (r0 == 0) goto L_0x0314
            r0.setVisibility(r3)
            android.widget.TextView r2 = r10.A0M
            if (r2 == 0) goto L_0x0024
            android.content.res.Resources r1 = X.DbV.A05(r10)
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
        L_0x006d:
            X.C13990Tnq.A0o(r1, r2, r0)
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            java.util.List r6 = r0.A08
            android.view.View r5 = r10.A07
            r4 = 8
            r2 = 1
            r7 = 0
            if (r5 == 0) goto L_0x00a6
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            if (r0 == 0) goto L_0x00a2
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = r0.Aa9()
            if (r0 == 0) goto L_0x00a2
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            if (r0 == 0) goto L_0x02fb
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r0.Aa9()
        L_0x0096:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.OFF
            if (r1 == r0) goto L_0x00a2
            boolean r1 = A07(r10)
            r0 = 8
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            r5.setVisibility(r0)
        L_0x00a6:
            if (r6 == 0) goto L_0x00af
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00af
            r2 = 0
        L_0x00af:
            java.lang.String r8 = "interestRowTitleView"
            java.lang.String r5 = "interestRowSubtitleView"
            if (r2 != 0) goto L_0x02e7
            android.content.Context r0 = r10.requireContext()
            java.lang.String r1 = X.W3x.A0D(r0, r6)
            android.widget.TextView r0 = r10.A0G
            if (r0 == 0) goto L_0x0314
            r0.setText(r1)
            android.widget.TextView r0 = r10.A0G
            if (r0 == 0) goto L_0x0314
            r0.setVisibility(r3)
            android.widget.TextView r2 = r10.A0I
            if (r2 == 0) goto L_0x0024
            android.content.res.Resources r1 = X.DbV.A05(r10)
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
        L_0x00d6:
            X.C13990Tnq.A0o(r1, r2, r0)
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            java.util.List r4 = r0.A08
            android.view.View r2 = r10.A08
            r5 = 0
            r6 = 8
            if (r2 == 0) goto L_0x0102
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            if (r0 == 0) goto L_0x02e4
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r0.Aa9()
        L_0x00f2:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r1 != r0) goto L_0x00fd
            boolean r1 = A07(r10)
            r0 = 0
            if (r1 != 0) goto L_0x00ff
        L_0x00fd:
            r0 = 8
        L_0x00ff:
            r2.setVisibility(r0)
        L_0x0102:
            android.view.View r2 = r10.A08
            if (r2 == 0) goto L_0x0122
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            if (r0 == 0) goto L_0x0110
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r5 = r0.Aa9()
        L_0x0110:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r5 != r0) goto L_0x011d
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            boolean r1 = r0.A2y
            r0 = 0
            if (r1 != 0) goto L_0x011f
        L_0x011d:
            r0 = 8
        L_0x011f:
            r2.setVisibility(r0)
        L_0x0122:
            if (r4 == 0) goto L_0x02d0
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x02d0
            android.content.Context r0 = r10.requireContext()
            java.lang.String r1 = X.W3x.A0D(r0, r4)
            android.widget.TextView r0 = r10.A0H
            if (r0 == 0) goto L_0x0139
            r0.setText(r1)
        L_0x0139:
            android.widget.TextView r0 = r10.A0H
            if (r0 == 0) goto L_0x0140
            r0.setVisibility(r3)
        L_0x0140:
            android.widget.TextView r2 = r10.A0J
            if (r2 == 0) goto L_0x014e
            android.content.res.Resources r1 = X.DbV.A05(r10)
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
        L_0x014b:
            X.C13990Tnq.A0o(r1, r2, r0)
        L_0x014e:
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            com.instagram.business.promote.model.PromoteAudienceInfo r5 = r0.A0q
            X.0qQ.A06(r5)
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L_0x02c7
            int r0 = r5.A00
            if (r0 == 0) goto L_0x02c7
            int r0 = r5.A01
            if (r0 == 0) goto L_0x02c7
            android.content.Context r4 = r10.requireContext()
            int r1 = r5.A01
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            int r2 = X.W3x.A00(r0, r1)
            int r1 = r5.A00
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L_0x0319
            java.lang.String r1 = X.W3x.A0F(r4, r0, r2, r1)
            android.widget.TextView r0 = r10.A0D
            if (r0 == 0) goto L_0x0184
            r0.setText(r1)
        L_0x0184:
            android.widget.TextView r0 = r10.A0D
            if (r0 == 0) goto L_0x018b
            r0.setVisibility(r3)
        L_0x018b:
            android.widget.TextView r0 = r10.A0E
            if (r0 == 0) goto L_0x0192
            X.C13992Tns.A0d(r0, r10)
        L_0x0192:
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = X.C13991Tnr.A0L(r0)
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r4 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.ON
            if (r0 != r4) goto L_0x02be
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            boolean r0 = r0.A2y
            if (r0 != 0) goto L_0x02be
            boolean r0 = A07(r10)
            if (r0 == 0) goto L_0x02be
            android.view.View r0 = r10.A03
            if (r0 == 0) goto L_0x01b3
            r0.setVisibility(r6)
        L_0x01b3:
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            r5 = 0
            if (r0 == 0) goto L_0x02bb
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r0.Aa9()
        L_0x01be:
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            if (r0 == 0) goto L_0x02b8
            java.lang.Integer r8 = r0.BT2()
        L_0x01c8:
            if (r1 != r4) goto L_0x02af
            boolean r0 = A07(r10)
            if (r0 == 0) goto L_0x02af
            X.0eM r0 = r10.A0Y
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.0eM r0 = r10.A0W
            java.lang.Object r1 = r0.getValue()
            X.UzE r1 = (X.C16678UzE) r1
            java.lang.String r0 = "minimum_age_constraint"
            r2.A0H(r1, r0)
            android.view.View r0 = r10.A0A
            if (r0 == 0) goto L_0x01ea
            r0.setVisibility(r3)
        L_0x01ea:
            if (r8 == 0) goto L_0x020f
            int r9 = r8.intValue()
            if (r9 == 0) goto L_0x020f
            android.widget.TextView r0 = r10.A0N
            if (r0 == 0) goto L_0x01f9
            r0.setVisibility(r3)
        L_0x01f9:
            android.widget.TextView r8 = r10.A0N
            if (r8 == 0) goto L_0x020f
            android.content.Context r2 = r10.requireContext()
            r1 = 2131970339(0x7f134923, float:1.9577626E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = X.DbY.A0c(r2, r0, r1)
            r8.setText(r0)
        L_0x020f:
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            if (r0 == 0) goto L_0x0219
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r7 = r0.Aa9()
        L_0x0219:
            r2 = 0
            if (r7 != r4) goto L_0x02a7
            boolean r0 = A07(r10)
            if (r0 == 0) goto L_0x02a7
            X.0eM r0 = r10.A0Y
            X.WGU r6 = X.C13990Tnq.A0M(r0)
            X.0eM r0 = r10.A0W
            java.lang.Object r1 = r0.getValue()
            X.UzE r1 = (X.C16678UzE) r1
            java.lang.String r0 = "optional_suggestions"
            r6.A0H(r1, r0)
            android.view.View r0 = r10.A04
            if (r0 == 0) goto L_0x023c
            r0.setVisibility(r3)
        L_0x023c:
            android.view.View r1 = r10.A06
            if (r1 == 0) goto L_0x024f
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            boolean r0 = r0.A2y
            r0 = r0 ^ 1
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
        L_0x024f:
            android.view.View r1 = r10.A05
            if (r1 == 0) goto L_0x0260
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            boolean r0 = r0.A2y
            if (r0 != 0) goto L_0x025d
            r2 = 8
        L_0x025d:
            r1.setVisibility(r2)
        L_0x0260:
            android.widget.TextView r3 = r10.A0F
            if (r3 == 0) goto L_0x0279
            android.content.Context r2 = r10.requireContext()
            com.instagram.business.promote.model.PromoteData r0 = A01(r10)
            boolean r1 = r0.A2y
            r0 = 2131970348(0x7f13492c, float:1.9577645E38)
            if (r1 == 0) goto L_0x0276
            r0 = 2131970346(0x7f13492a, float:1.957764E38)
        L_0x0276:
            X.DbT.A18(r2, r3, r0)
        L_0x0279:
            com.instagram.api.schemas.AdvantageAudienceData r0 = A00(r10)
            if (r0 == 0) goto L_0x0283
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r5 = r0.Aa9()
        L_0x0283:
            boolean r0 = A08(r10)
            if (r0 == 0) goto L_0x029f
            boolean r0 = A07(r10)
            if (r0 == 0) goto L_0x029f
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x02a0
            if (r5 == r4) goto L_0x02a0
            android.view.View r1 = r10.A09
            if (r1 == 0) goto L_0x029f
            r0 = 0
        L_0x029c:
            r1.setVisibility(r0)
        L_0x029f:
            return
        L_0x02a0:
            android.view.View r1 = r10.A09
            if (r1 == 0) goto L_0x029f
            r0 = 8
            goto L_0x029c
        L_0x02a7:
            android.view.View r0 = r10.A04
            if (r0 == 0) goto L_0x023c
            r0.setVisibility(r6)
            goto L_0x023c
        L_0x02af:
            android.view.View r0 = r10.A0A
            if (r0 == 0) goto L_0x020f
            r0.setVisibility(r6)
            goto L_0x020f
        L_0x02b8:
            r8 = r7
            goto L_0x01c8
        L_0x02bb:
            r1 = r7
            goto L_0x01be
        L_0x02be:
            android.view.View r0 = r10.A03
            if (r0 == 0) goto L_0x01b3
            r0.setVisibility(r3)
            goto L_0x01b3
        L_0x02c7:
            android.widget.TextView r0 = r10.A0D
            if (r0 == 0) goto L_0x018b
            r0.setVisibility(r6)
            goto L_0x018b
        L_0x02d0:
            android.widget.TextView r0 = r10.A0H
            if (r0 == 0) goto L_0x02d7
            r0.setVisibility(r6)
        L_0x02d7:
            android.widget.TextView r2 = r10.A0J
            if (r2 == 0) goto L_0x014e
            android.content.res.Resources r1 = X.DbV.A05(r10)
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            goto L_0x014b
        L_0x02e4:
            r1 = r7
            goto L_0x00f2
        L_0x02e7:
            android.widget.TextView r0 = r10.A0G
            if (r0 == 0) goto L_0x0314
            r0.setVisibility(r4)
            android.widget.TextView r2 = r10.A0I
            if (r2 == 0) goto L_0x0024
            android.content.res.Resources r1 = X.DbV.A05(r10)
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            goto L_0x00d6
        L_0x02fb:
            r1 = r7
            goto L_0x0096
        L_0x02fe:
            android.widget.TextView r1 = r10.A0L
            if (r1 == 0) goto L_0x0314
            r0 = 8
            r1.setVisibility(r0)
            android.widget.TextView r2 = r10.A0M
            if (r2 == 0) goto L_0x0024
            android.content.res.Resources r1 = X.DbV.A05(r10)
            r0 = 2131165220(0x7f070024, float:1.794465E38)
            goto L_0x006d
        L_0x0314:
            X.0qQ.A0F(r5)
            goto L_0x0027
        L_0x0319:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15280UZi.A04(X.UZi):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r2.A21.contains(com.instagram.business.promote.model.SpecialRequirementCategory.A08) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06() {
        /*
            r9 = this;
            com.instagram.business.promote.model.PromoteData r2 = A01(r9)
            boolean r8 = A08(r9)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            com.instagram.common.session.UserSession r5 = r2.A0y
            X.0qQ.A06(r5)
            com.instagram.api.schemas.XIGIGBoostDestination r3 = r2.A0i
            boolean r6 = r2.A2V
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x0026
            java.util.List r1 = r2.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r0 = r1.contains(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r7 = 1
        L_0x0027:
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r2.A0q
            if (r0 == 0) goto L_0x0035
            X.ULv r4 = new X.ULv
            r4.<init>(r0)
        L_0x0030:
            boolean r0 = X.W3x.A0M(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0035:
            r4 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15280UZi.A06():boolean");
    }

    public static boolean A07(C15280UZi uZi) {
        return C18803W2r.A06(A02(uZi));
    }

    public final AnonymousClass0wW getSession() {
        return A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-782613954);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_view, viewGroup, false);
        AnonymousClass0fD.A09(313303139, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(2096349025);
        super.onDestroy();
        A01(this).A0q = PromoteAudienceInfo.A09;
        A01(this).A0r.A00 = new HashMap();
        PendingLocation pendingLocation = A01(this).A0o;
        pendingLocation.A05 = new ArrayList();
        pendingLocation.A00 = 5;
        pendingLocation.A01 = null;
        pendingLocation.A02 = null;
        pendingLocation.A03 = null;
        pendingLocation.A04 = new ArrayList();
        AnonymousClass0fD.A09(-1716748294, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-242143617);
        super.onDestroyView();
        C13990Tnq.A0O(this.A0Z).A0B(this);
        C18761Vzw vzw = this.A0Q;
        if (vzw != null) {
            vzw.A0A.A00();
            vzw.A00 = C18598Vup.A01;
        }
        this.A0A = null;
        this.A0O = null;
        this.A0N = null;
        this.A04 = null;
        this.A0J = null;
        this.A0H = null;
        this.A07 = null;
        this.A08 = null;
        this.A03 = null;
        this.A0F = null;
        this.A06 = null;
        this.A05 = null;
        this.A09 = null;
        AnonymousClass0fD.A09(-600267763, A022);
    }
}
