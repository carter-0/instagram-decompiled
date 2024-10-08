package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UaV  reason: case insensitive filesystem */
public final class C15323UaV extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, X7h, X3L, X3S {
    public static final String __redex_internal_original_name = "PromoteBudgetDurationFragment";
    public View A00;
    public ViewStub A01;
    public TextView A02;
    public ConstraintLayout A03;
    public C18784W1k A04;
    public C18654Vw9 A05;
    public C18058Vkg A06;
    public C19338WUu A07;
    public PromoteData A08;
    public PromoteState A09;
    public IgdsBanner A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public View A0E;
    public View A0F;
    public ImageView A0G;
    public ImageView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public ConstraintLayout A0N;
    public UserSession A0O;
    public IgdsStepperHeader A0P;
    public SpinnerImageView A0Q;
    public boolean A0R;
    public final AnonymousClass0eM A0S = C20694WxQ.A00(this, 6);
    public final AnonymousClass0eM A0T = C20694WxQ.A00(this, 7);

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01a1, code lost:
        if (r1 != 1) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01e6, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r1.A0y, 36322160465291238L) == false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0203, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r11.A0y, 36322160465225701L) == false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r1 != r0.intValue()) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x034e, code lost:
        r1 = r5.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0350, code lost:
        if (r1 == null) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0352, code lost:
        r1.setAction(2131954400);
        r1.A00 = new X.C19392WXj(r5, 0);
        r1.setVisibility(0);
        X.C13990Tnq.A0M(r5.A0T).A0H(X.C16678UzE.BUDGET_DURATION, "similar_advertiser_budget_recommendation_banner");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x037e, code lost:
        if (r0 < r1) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0398, code lost:
        if (r0.A07 < r7) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03b0, code lost:
        if (r22 != false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x03de, code lost:
        if (r17 != false) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r5.A08 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        if (X.182.A06(r7, r13, 36325583554098242L) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f0, code lost:
        if (r0.A07 < r3) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0116, code lost:
        if (r0 == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0123, code lost:
        if (r0.A07 >= r6) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (r3 < r14.A07) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013f, code lost:
        if (X.182.A06(X.0Tu.A05, r14, 36326000165991883L) == false) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0170, code lost:
        if (X.182.A06(X.0Tu.A05, r14, 36326081770305007L) == false) goto L_0x0172;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C15323UaV r26) {
        /*
            r10 = 2
            com.instagram.api.schemas.XIGIGBoostDestination r25 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            r9 = 0
            com.instagram.api.schemas.XIGIGBoostDestination r24 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            r4 = 1
            r1 = r25
            r0 = r24
            com.instagram.api.schemas.XIGIGBoostDestination[] r0 = new com.instagram.api.schemas.XIGIGBoostDestination[]{r1, r0}
            java.util.List r2 = X.0sr.A1P(r0)
            com.instagram.api.schemas.XIGIGBoostDestination r12 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            com.instagram.api.schemas.XIGIGBoostDestination r11 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            com.instagram.api.schemas.XIGIGBoostDestination[] r0 = new com.instagram.api.schemas.XIGIGBoostDestination[]{r12, r11}
            java.util.List r1 = X.0sr.A1P(r0)
            r5 = r26
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            java.lang.String r23 = "promoteData"
            r8 = 0
            if (r0 == 0) goto L_0x008e
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r0.A0i
            boolean r17 = X.00k.A0u(r2, r0)
            boolean r16 = X.00k.A0u(r1, r0)
            com.instagram.business.promote.model.PromoteData r14 = r5.A08
            if (r14 == 0) goto L_0x008e
            int r3 = r14.A05
            int r7 = r14.A0J
            int r6 = r14.A0B
            if (r3 <= 0) goto L_0x0043
            int r0 = r14.A07
            r15 = 1
            if (r3 >= r0) goto L_0x0044
        L_0x0043:
            r15 = 0
        L_0x0044:
            int r1 = r14.A0K
            int r0 = r14.A0L
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = java.lang.Math.max(r7, r0)
            if (r15 != 0) goto L_0x006a
            java.util.Map r13 = r14.A23
            if (r13 == 0) goto L_0x006a
            int r1 = r14.A07
            int r0 = r14.A0A
            java.lang.Object r0 = X.C51968G9o.A10(r13, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x006a
            int r0 = r0.intValue()
            r22 = 1
            if (r1 == r0) goto L_0x006c
        L_0x006a:
            r22 = 0
        L_0x006c:
            java.lang.String r21 = "budgetRecommendationSuggestionText"
            if (r22 == 0) goto L_0x0082
            android.widget.TextView r1 = r5.A02
            if (r1 != 0) goto L_0x007c
            X.0qQ.A0F(r21)
        L_0x0077:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007c:
            r0 = 2131970249(0x7f1348c9, float:1.9577444E38)
            X.DbU.A1G(r1, r5, r0)
        L_0x0082:
            if (r15 == 0) goto L_0x0092
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0092
            r5.A0R = r4
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 != 0) goto L_0x0092
        L_0x008e:
            X.0qQ.A0F(r23)
            goto L_0x0077
        L_0x0092:
            if (r17 == 0) goto L_0x03a9
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0098:
            com.instagram.business.promote.model.PromoteData r1 = r5.A08
            if (r1 == 0) goto L_0x008e
            int r0 = r1.A07
            if (r0 > r2) goto L_0x03a4
            com.instagram.common.session.UserSession r2 = r1.A0y
            X.0qQ.A06(r2)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36603175880430462(0x820a650001137e, double:3.211334043718662E-306)
            long r0 = X.182.A01(r7, r2, r0)
            int r2 = (int) r0
            if (r2 != 0) goto L_0x00ca
            if (r15 == 0) goto L_0x00ca
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r13 = r0.A0y
            X.0qQ.A06(r13)
            r0 = 36325583554098242(0x810ded00003442, double:3.035783538771587E-306)
            boolean r0 = X.182.A06(r7, r13, r0)
            r15 = 1
            if (r0 == 0) goto L_0x00cb
        L_0x00ca:
            r15 = 0
        L_0x00cb:
            com.instagram.business.promote.model.PromoteData r13 = r5.A08
            if (r13 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r14 = r13.A0y
            X.0qQ.A06(r14)
            r0 = 36611082915289292(0x821196000218cc, double:3.21633448440246E-306)
            long r0 = X.182.A01(r7, r14, r0)
            int r7 = (int) r0
            if (r7 == r4) goto L_0x03a0
            if (r7 == r10) goto L_0x039c
            int r7 = r13.A0J
        L_0x00e4:
            r20 = 0
            if (r2 == r4) goto L_0x0392
            if (r2 != r10) goto L_0x00f4
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x008e
            int r0 = r0.A07
            if (r0 >= r3) goto L_0x00f4
        L_0x00f2:
            r20 = 1
        L_0x00f4:
            if (r16 == 0) goto L_0x038f
            int r13 = java.lang.Math.max(r6, r3)
        L_0x00fa:
            com.instagram.business.promote.model.PromoteData r1 = r5.A08
            if (r1 == 0) goto L_0x008e
            int r0 = r1.A07
            if (r0 > r13) goto L_0x0125
            com.instagram.common.session.UserSession r14 = r1.A0y
            X.0qQ.A06(r14)
            X.0Tu r13 = X.0Tu.A05
            r0 = 36326038820632029(0x810e57000035dd, double:3.036071451160765E-306)
            boolean r1 = X.182.A06(r13, r14, r0)
            if (r1 != 0) goto L_0x0118
            r0 = r15
            r15 = 1
            if (r0 != 0) goto L_0x0125
        L_0x0118:
            r15 = 0
            if (r1 == 0) goto L_0x0125
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x008e
            int r0 = r0.A07
            r19 = 1
            if (r0 < r6) goto L_0x0127
        L_0x0125:
            r19 = 0
        L_0x0127:
            if (r15 == 0) goto L_0x038b
            if (r16 == 0) goto L_0x0141
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r14 = r0.A0y
            X.0qQ.A06(r14)
            X.0Tu r13 = X.0Tu.A05
            r0 = 36326000165991883(0x810e4e000135cb, double:3.036047005810687E-306)
            boolean r0 = X.182.A06(r13, r14, r0)
            if (r0 != 0) goto L_0x038b
        L_0x0141:
            r18 = 1
        L_0x0143:
            if (r17 == 0) goto L_0x0172
            com.instagram.business.promote.model.PromoteData r13 = r5.A08
            if (r13 == 0) goto L_0x008e
            boolean r0 = r13.A2v
            if (r0 != 0) goto L_0x0172
            if (r20 != 0) goto L_0x0172
            if (r19 != 0) goto L_0x0172
            if (r18 != 0) goto L_0x0172
            int r1 = r13.A07
            int r0 = r13.A03
            if (r1 >= r0) goto L_0x0172
            int r1 = r13.A0A
            r0 = 4
            if (r1 >= r0) goto L_0x0172
            com.instagram.common.session.UserSession r14 = r13.A0y
            X.0qQ.A06(r14)
            X.0Tu r13 = X.0Tu.A05
            r0 = 36326081770305007(0x810e61000035ef, double:3.036098612706901E-306)
            boolean r0 = X.182.A06(r13, r14, r0)
            r17 = 1
            if (r0 != 0) goto L_0x0174
        L_0x0172:
            r17 = 0
        L_0x0174:
            int r15 = java.lang.Math.max(r7, r6)
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.A2v
            if (r0 == 0) goto L_0x0185
            com.instagram.igds.components.banner.IgdsBanner r0 = r5.A0A
            X.AnonymousClass7TH.A0R(r0)
        L_0x0185:
            com.instagram.business.promote.model.PromoteData r14 = r5.A08
            if (r14 == 0) goto L_0x008e
            X.XA0 r13 = r14.A0Z
            if (r13 == 0) goto L_0x0205
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r14.A0i
            if (r0 == 0) goto L_0x01a3
            int r1 = r0.ordinal()
            r0 = 8
            if (r1 == r0) goto L_0x0385
            r0 = 10
            if (r1 == r0) goto L_0x0385
            r0 = 12
            if (r1 == r0) goto L_0x01a4
            if (r1 == r4) goto L_0x01a4
        L_0x01a3:
            r15 = 0
        L_0x01a4:
            X.UNS r13 = (X.UNS) r13
            int r1 = r13.A00
            boolean r16 = X.C51970G9q.A1W(r1, r15)
            boolean r0 = r14.A2v
            if (r0 != 0) goto L_0x0382
            int r15 = r15 + 1
            int r0 = r14.A07
            if (r15 > r0) goto L_0x0378
            if (r0 >= r1) goto L_0x0378
        L_0x01b8:
            r0 = 1
        L_0x01b9:
            if (r18 != 0) goto L_0x0371
            if (r20 != 0) goto L_0x0371
            if (r19 != 0) goto L_0x0371
            if (r17 != 0) goto L_0x0371
            if (r16 == 0) goto L_0x0205
            if (r0 == 0) goto L_0x0205
            java.util.List r0 = r13.A02
            if (r0 == 0) goto L_0x0205
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0205
            com.instagram.business.promote.model.PromoteData r1 = r5.A08
            if (r1 == 0) goto L_0x008e
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A0i
            if (r0 == r12) goto L_0x01d9
            if (r0 != r11) goto L_0x01e8
        L_0x01d9:
            com.instagram.common.session.UserSession r12 = r1.A0y
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322160465291238(0x810ad0000227e6, double:3.033618763626365E-306)
            boolean r0 = X.DbY.A1Y(r11, r12, r0)
            if (r0 != 0) goto L_0x034e
        L_0x01e8:
            com.instagram.business.promote.model.PromoteData r11 = r5.A08
            if (r11 == 0) goto L_0x008e
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r11.A0i
            r0 = r25
            if (r1 == r0) goto L_0x01f6
            r0 = r24
            if (r1 != r0) goto L_0x0205
        L_0x01f6:
            com.instagram.common.session.UserSession r12 = r11.A0y
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322160465225701(0x810ad0000127e5, double:3.0336187635849195E-306)
            boolean r0 = X.DbY.A1Y(r11, r12, r0)
            if (r0 != 0) goto L_0x034e
        L_0x0205:
            r5.A02()
            if (r20 == 0) goto L_0x0274
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x034b
            r0 = 2131444093(0x7f0b417d, float:1.8510273E38)
            com.instagram.common.ui.base.IgTextView r13 = X.JTO.A0X(r1, r0)
        L_0x0215:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x0348
            r0 = 2131444091(0x7f0b417b, float:1.8510269E38)
            android.widget.TextView r12 = X.AnonymousClass7TE.A0d(r1, r0)
        L_0x0220:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x0345
            r0 = 2131444090(0x7f0b417a, float:1.8510267E38)
            android.view.View r11 = r1.findViewById(r0)
        L_0x022b:
            r5.A07(r13)
            r13 = r23
            if (r2 == r4) goto L_0x0330
            if (r2 != r10) goto L_0x0250
            if (r12 == 0) goto L_0x0250
            android.content.Context r10 = r5.requireContext()
            r2 = 2131970264(0x7f1348d8, float:1.9577474E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x03fd
            java.lang.String r0 = X.C13991Tnr.A0g(r0, r3)
        L_0x0247:
            r1[r9] = r0
            java.lang.String r0 = r10.getString(r2, r1)
            r12.setText(r0)
        L_0x0250:
            X.0eM r0 = r5.A0T
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "zero_outcome_warning_banner"
            r2.A0H(r1, r0)
            if (r11 == 0) goto L_0x0264
            r0 = 59
            X.C18887WAz.A00(r11, r0, r5)
        L_0x0264:
            X.Vkg r0 = r5.A06
            java.lang.String r13 = "reachAndOutcomeEstimationController"
            if (r0 == 0) goto L_0x03fd
            r0.A01()
            X.Vkg r0 = r5.A06
            if (r0 == 0) goto L_0x03fd
            r0.A00()
        L_0x0274:
            if (r19 == 0) goto L_0x02d4
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x032d
            r0 = 2131444093(0x7f0b417d, float:1.8510273E38)
            com.instagram.common.ui.base.IgTextView r2 = X.JTO.A0X(r1, r0)
        L_0x0281:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x032a
            r0 = 2131444091(0x7f0b417b, float:1.8510269E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r1, r0)
        L_0x028c:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x0297
            r0 = 2131444090(0x7f0b417a, float:1.8510267E38)
            android.view.View r8 = r1.findViewById(r0)
        L_0x0297:
            r5.A07(r2)
            if (r3 == 0) goto L_0x02b0
            android.content.Context r2 = r5.requireContext()
            r1 = 2131970264(0x7f1348d8, float:1.9577474E38)
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            r13 = r23
            if (r0 == 0) goto L_0x03fd
            java.lang.String r0 = X.C13991Tnr.A0g(r0, r6)
            X.DbX.A13(r2, r3, r0, r1)
        L_0x02b0:
            X.0eM r0 = r5.A0T
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "low_outcome_warning_banner"
            r2.A0H(r1, r0)
            if (r8 == 0) goto L_0x02c4
            r0 = 58
            X.C18887WAz.A00(r8, r0, r5)
        L_0x02c4:
            X.Vkg r0 = r5.A06
            java.lang.String r13 = "reachAndOutcomeEstimationController"
            if (r0 == 0) goto L_0x03fd
            r0.A01()
            X.Vkg r0 = r5.A06
            if (r0 == 0) goto L_0x03fd
            r0.A00()
        L_0x02d4:
            if (r17 == 0) goto L_0x0322
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            r2 = 8
            if (r1 == 0) goto L_0x02e2
            r0 = 2131444093(0x7f0b417d, float:1.8510273E38)
            X.DbX.A1D(r1, r0, r2)
        L_0x02e2:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x02ec
            r0 = 2131444090(0x7f0b417a, float:1.8510267E38)
            X.DbX.A1D(r1, r0, r2)
        L_0x02ec:
            com.instagram.igds.components.banner.IgdsBanner r0 = r5.A0A
            if (r0 == 0) goto L_0x02f3
            r0.setVisibility(r2)
        L_0x02f3:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x030f
            r0 = 2131444091(0x7f0b417b, float:1.8510269E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r1, r0)
            if (r3 == 0) goto L_0x030f
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r1 = 2131820899(0x7f110163, float:1.9274526E38)
            r0 = 4
            java.lang.String r0 = X.DbY.A0d(r2, r0, r1)
            r3.setText(r0)
        L_0x030f:
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x0322
            X.0eM r0 = r5.A0T
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "ad_duration_warning"
            r2.A0H(r1, r0)
            r5.A0C = r4
        L_0x0322:
            android.view.View r1 = r5.A0F
            if (r1 != 0) goto L_0x03ac
            java.lang.String r23 = "budgetRecommendationLayout"
            goto L_0x008e
        L_0x032a:
            r3 = r8
            goto L_0x028c
        L_0x032d:
            r2 = r8
            goto L_0x0281
        L_0x0330:
            if (r12 == 0) goto L_0x0250
            android.content.Context r10 = r5.requireContext()
            r2 = 2131970264(0x7f1348d8, float:1.9577474E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x03fd
            java.lang.String r0 = X.C13991Tnr.A0g(r0, r7)
            goto L_0x0247
        L_0x0345:
            r11 = r8
            goto L_0x022b
        L_0x0348:
            r12 = r8
            goto L_0x0220
        L_0x034b:
            r13 = r8
            goto L_0x0215
        L_0x034e:
            com.instagram.igds.components.banner.IgdsBanner r1 = r5.A0A
            if (r1 == 0) goto L_0x0205
            r0 = 2131954400(0x7f130ae0, float:1.9545298E38)
            r1.setAction((int) r0)
            X.WXj r0 = new X.WXj
            r0.<init>(r5, r9)
            r1.A00 = r0
            r1.setVisibility(r9)
            X.0eM r0 = r5.A0T
            X.WGU r11 = X.C13990Tnq.A0M(r0)
            X.UzE r1 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "similar_advertiser_budget_recommendation_banner"
            r11.A0H(r1, r0)
            goto L_0x0205
        L_0x0371:
            com.instagram.igds.components.banner.IgdsBanner r0 = r5.A0A
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0205
        L_0x0378:
            int r1 = r13.A01
            int r0 = r14.A0A
            if (r4 > r0) goto L_0x0382
            if (r0 >= r1) goto L_0x0382
            goto L_0x01b8
        L_0x0382:
            r0 = 0
            goto L_0x01b9
        L_0x0385:
            int r15 = java.lang.Math.max(r3, r15)
            goto L_0x01a4
        L_0x038b:
            r18 = 0
            goto L_0x0143
        L_0x038f:
            r13 = 0
            goto L_0x00fa
        L_0x0392:
            com.instagram.business.promote.model.PromoteData r0 = r5.A08
            if (r0 == 0) goto L_0x008e
            int r0 = r0.A07
            if (r0 >= r7) goto L_0x00f4
            goto L_0x00f2
        L_0x039c:
            int r7 = r13.A0L
            goto L_0x00e4
        L_0x03a0:
            int r7 = r13.A0K
            goto L_0x00e4
        L_0x03a4:
            r20 = 0
            r2 = 0
            goto L_0x00f4
        L_0x03a9:
            r2 = 0
            goto L_0x0098
        L_0x03ac:
            if (r18 != 0) goto L_0x03b2
            r0 = 8
            if (r22 == 0) goto L_0x03b3
        L_0x03b2:
            r0 = 0
        L_0x03b3:
            r1.setVisibility(r0)
            android.widget.TextView r1 = r5.A0K
            if (r1 != 0) goto L_0x03be
            java.lang.String r23 = "budgetRecommendationWarningText"
            goto L_0x008e
        L_0x03be:
            int r0 = X.C13988Tno.A0E(r18)
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r5.A0H
            if (r1 != 0) goto L_0x03cd
            java.lang.String r23 = "budgetRecommendationWarningIcon"
            goto L_0x008e
        L_0x03cd:
            int r0 = X.C13988Tno.A0E(r18)
            r1.setVisibility(r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x03e4
            if (r20 != 0) goto L_0x03e0
            if (r19 != 0) goto L_0x03e0
            r0 = 8
            if (r17 == 0) goto L_0x03e1
        L_0x03e0:
            r0 = 0
        L_0x03e1:
            r1.setVisibility(r0)
        L_0x03e4:
            com.instagram.business.promote.model.PromoteData r1 = r5.A08
            if (r1 == 0) goto L_0x008e
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.A03
            if (r0 == 0) goto L_0x03fb
            if (r20 != 0) goto L_0x03f0
            if (r19 == 0) goto L_0x03fb
        L_0x03f0:
            r0 = 1
        L_0x03f1:
            r1.A34 = r0
            android.widget.TextView r1 = r5.A02
            if (r1 != 0) goto L_0x0402
            r23 = r21
            goto L_0x008e
        L_0x03fb:
            r0 = 0
            goto L_0x03f1
        L_0x03fd:
            X.0qQ.A0F(r13)
            goto L_0x0077
        L_0x0402:
            int r0 = X.C13988Tno.A0E(r22)
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15323UaV.A05(X.UaV):void");
    }

    public static final void A06(C15323UaV uaV) {
        C255943uy r0;
        int i = 0;
        boolean A1P = AnonymousClass7TF.A1P(uaV.A0D ? 1 : 0);
        SpinnerImageView spinnerImageView = uaV.A0Q;
        if (spinnerImageView == null) {
            0qQ.A0F("loadingSpinner");
            throw AnonymousClass00P.createAndThrow();
        }
        if (A1P) {
            r0 = C255943uy.LOADING;
        } else {
            r0 = C255943uy.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(r0);
        View view = uaV.A0E;
        if (view != null) {
            if (!(!A1P)) {
                i = 8;
            }
            view.setVisibility(i);
        }
        C13991Tnr.A0w(uaV);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0035: MOVE  (r1v9 X.X7g) = (r1v0 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void CtD() {
        /*
            r15 = this;
            r6 = 1
            com.instagram.business.promote.model.PromoteState r0 = r15.A09
            if (r0 == 0) goto L_0x0102
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x0105
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 == 0) goto L_0x002c
            X.0eM r0 = r15.A0S
            java.lang.Object r0 = r0.getValue()
            X.Ugp r0 = (X.C15684Ugp) r0
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x002b
            com.instagram.business.promote.model.PromoteState r0 = r15.A09
            if (r0 == 0) goto L_0x0102
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x0105
            com.instagram.business.promote.model.PromoteState.A00(r0)
            X.DbT.A1J(r15)
        L_0x002b:
            return
        L_0x002c:
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            boolean r0 = r1 instanceof X.X7g
            r3 = 0
            if (r0 == 0) goto L_0x0042
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0042
            X.UzE r0 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = r0.toString()
            r1.Clw(r0)
        L_0x0042:
            X.0eM r8 = r15.A0T
            X.WGU r1 = X.C13990Tnq.A0M(r8)
            X.UzE r2 = X.C16678UzE.BUDGET_DURATION
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            java.lang.String r14 = "promoteData"
            if (r0 == 0) goto L_0x0107
            boolean r0 = r0.A2v
            java.lang.String r7 = "next_button"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.WGU.A03(r2, r1, r0, r7)
            X.WGU r5 = X.C13990Tnq.A0M(r8)
            com.instagram.business.promote.model.PromoteData r4 = r15.A08
            if (r4 == 0) goto L_0x0107
            boolean r1 = r4.A2v
            int r0 = r4.A08
            java.lang.String r12 = X.C13991Tnr.A0g(r4, r0)
            com.instagram.business.promote.model.PromoteData r4 = r15.A08
            if (r4 == 0) goto L_0x0107
            int r0 = r4.A09
            java.lang.String r11 = java.lang.String.valueOf(r0)
            int r0 = r4.A07
            java.lang.String r10 = X.C13991Tnr.A0g(r4, r0)
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x0107
            int r0 = r0.A0A
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            X.0wc r1 = r5.A05
            java.lang.String r0 = "promoted_posts_tap_component"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00cd
            X.UGQ r1 = new X.UGQ
            r1.<init>()
            X.C13990Tnq.A18(r1, r5)
            if (r13 == 0) goto L_0x00a6
            java.lang.String r0 = "run_continuously"
            r1.A03(r0, r13)
        L_0x00a6:
            if (r12 == 0) goto L_0x00ad
            java.lang.String r0 = "default_recommended_daily_budget"
            r1.A06(r0, r12)
        L_0x00ad:
            if (r11 == 0) goto L_0x00b4
            java.lang.String r0 = "default_recommended_duration_in_days"
            r1.A06(r0, r11)
        L_0x00b4:
            if (r10 == 0) goto L_0x00bb
            java.lang.String r0 = "daily_budget_selected"
            r1.A06(r0, r10)
        L_0x00bb:
            if (r9 == 0) goto L_0x00c2
            java.lang.String r0 = "duration_in_days_selected"
            r1.A06(r0, r9)
        L_0x00c2:
            java.lang.String r0 = "component"
            r4.AAJ(r0, r7)
            X.C13990Tnq.A10(r4, r5, r2)
            X.C13988Tno.A18(r4, r1)
        L_0x00cd:
            X.WGU r1 = X.C13990Tnq.A0M(r8)
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x0107
            r1.A0B(r2, r0)
            r15.A0B = r6
            com.instagram.business.promote.model.PromoteData r1 = r15.A08
            if (r1 == 0) goto L_0x0107
            com.instagram.common.session.UserSession r0 = r15.getSession()
            boolean r1 = X.C18174Vmo.A01(r1, r0)
            X.Vl8 r0 = X.C13990Tnq.A0N()
            if (r1 == 0) goto L_0x00fc
            X.UaQ r0 = r0.A02(r2)
        L_0x00f0:
            androidx.fragment.app.FragmentActivity r2 = r15.requireActivity()
            com.instagram.common.session.UserSession r1 = r15.getSession()
            X.Dbb.A0o(r3, r0, r2, r1)
            return
        L_0x00fc:
            X.UaS r0 = new X.UaS
            r0.<init>()
            goto L_0x00f0
        L_0x0102:
            java.lang.String r14 = "promoteState"
            goto L_0x0107
        L_0x0105:
            java.lang.String r14 = "promoteData"
        L_0x0107:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15323UaV.CtD():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36326051705599460L) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dab(com.instagram.business.promote.model.PromoteState r11, java.lang.Integer r12) {
        /*
            r10 = this;
            r6 = 1
            r0 = 4
            int r1 = X.C51967G9n.A03(r12, r6)
            java.lang.String r9 = "reachAndOutcomeEstimationController"
            if (r1 == r0) goto L_0x012e
            r0 = 5
            if (r1 == r0) goto L_0x012e
            r0 = 11
            if (r1 != r0) goto L_0x00e0
            X.Vkg r0 = r10.A06
            if (r0 == 0) goto L_0x015b
            android.widget.TextView r5 = r0.A0B
            com.instagram.business.promote.model.PromoteData r0 = r0.A0C
            com.instagram.api.schemas.Estimate r4 = r0.A0U
            r2 = 0
            if (r4 == 0) goto L_0x012b
            int r0 = r4.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0024:
            r3 = 0
            if (r4 == 0) goto L_0x002d
            int r0 = r4.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x002d:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r4 = "%,d - %,d"
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = java.lang.String.format(r0, r4, r1)
            r5.setText(r0)
            X.Vkg r5 = r10.A06
            if (r5 == 0) goto L_0x015b
            com.instagram.business.promote.model.PromoteData r8 = r5.A0C
            boolean r0 = com.instagram.business.promote.model.PromoteState.A03(r8)
            if (r0 == 0) goto L_0x0100
            com.instagram.common.session.UserSession r7 = r8.A0y
            X.0qQ.A06(r7)
            boolean r0 = X.C18803W2r.A04(r7)
            if (r0 == 0) goto L_0x0100
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326051705599460(0x810e5a000135e4, double:3.036079599666052E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0100
        L_0x0062:
            X.Vkg r5 = r10.A06
            if (r5 == 0) goto L_0x015b
            com.instagram.business.promote.model.PromoteData r1 = r5.A0C
            boolean r0 = com.instagram.business.promote.model.PromoteState.A03(r1)
            if (r0 == 0) goto L_0x008f
            com.instagram.api.schemas.Estimate r1 = r1.A0T
            if (r1 == 0) goto L_0x00ea
            int r0 = r1.A00
            int r1 = r1.A01
            if (r1 <= 0) goto L_0x00ea
            android.widget.TextView r2 = r5.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r0, r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = java.lang.String.format(r0, r4, r1)
            r2.setText(r0)
            r5.A00 = r3
        L_0x008f:
            X.Vkg r4 = r10.A06
            if (r4 == 0) goto L_0x015b
            com.instagram.business.promote.model.PromoteData r5 = r4.A0C
            boolean r0 = com.instagram.business.promote.model.PromoteState.A03(r5)
            if (r0 == 0) goto L_0x00dd
            com.instagram.common.session.UserSession r6 = r5.A0y
            X.0qQ.A06(r6)
            boolean r0 = X.C18803W2r.A04(r6)
            if (r0 == 0) goto L_0x00dd
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326051705533923(0x810e5a000035e3, double:3.036079599624606E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00dd
            android.view.View r0 = r4.A03
            r0.setVisibility(r3)
            android.view.View r0 = r4.A02
            r2 = 8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r4.A08
            r0.setVisibility(r3)
            android.view.View r1 = r4.A01
            boolean r0 = r4.A00
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            boolean r1 = r5.A2v
            android.widget.TextView r0 = r4.A07
            if (r1 == 0) goto L_0x00e1
            r0.setVisibility(r2)
            android.widget.TextView r0 = r4.A06
            r0.setVisibility(r3)
        L_0x00dd:
            A05(r10)
        L_0x00e0:
            return
        L_0x00e1:
            r0.setVisibility(r3)
            android.widget.TextView r0 = r4.A06
            r0.setVisibility(r2)
            goto L_0x00dd
        L_0x00ea:
            android.widget.TextView r4 = r5.A08
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r3)
            java.lang.String r1 = "%,d"
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            r4.setText(r0)
            r5.A00 = r6
            goto L_0x008f
        L_0x0100:
            android.view.View r0 = r5.A05
            r0.setVisibility(r3)
            android.view.View r0 = r5.A04
            r2 = 8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.A0B
            r0.setVisibility(r3)
            boolean r1 = r8.A2v
            android.widget.TextView r0 = r5.A0A
            if (r1 == 0) goto L_0x0121
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.A09
            r0.setVisibility(r3)
            goto L_0x0062
        L_0x0121:
            r0.setVisibility(r3)
            android.widget.TextView r0 = r5.A09
            r0.setVisibility(r2)
            goto L_0x0062
        L_0x012b:
            r1 = r2
            goto L_0x0024
        L_0x012e:
            com.instagram.business.promote.model.PromoteData r0 = r10.A08
            java.lang.String r2 = "promoteData"
            if (r0 == 0) goto L_0x0157
            int r1 = r0.A0I
            int r0 = r0.A0A
            r10.A03(r1, r0)
            r10.A01()
            com.instagram.business.promote.model.PromoteData r0 = r10.A08
            if (r0 == 0) goto L_0x0157
            boolean r0 = r0.A0E()
            r10.A08(r0)
            X.Vkg r0 = r10.A06
            if (r0 == 0) goto L_0x015b
            r0.A02()
            A05(r10)
            r10.A02()
            return
        L_0x0157:
            X.0qQ.A0F(r2)
            goto L_0x015e
        L_0x015b:
            X.0qQ.A0F(r9)
        L_0x015e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15323UaV.Dab(com.instagram.business.promote.model.PromoteState, java.lang.Integer):void");
    }

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        r6.Eom(2131970242);
        r6.Eu4(true);
        C18643Vvl A002 = C18643Vvl.A00(this, r6);
        A002.A01(new C18887WAz(this, 56), AnonymousClass05K.A0Y);
        A002.A02(true);
    }

    public final String getModuleName() {
        return "promote_budget_duration";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0379: MOVE  (r2v2 X.X7g) = (r2v1 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0225  */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r3 = 0
            r1 = r21
            X.0qQ.A0B(r1, r3)
            r2 = r20
            com.instagram.business.promote.model.PromoteData r4 = r2.A08
            java.lang.String r18 = "promoteData"
            r6 = 0
            if (r4 == 0) goto L_0x00ff
            r0 = 1
            r4.A2Q = r0
            r2.A0R = r3
            com.instagram.business.promote.model.PromoteState r4 = r2.A09
            java.lang.String r17 = "promoteState"
            if (r4 == 0) goto L_0x014e
            r4.A0A(r2)
            r4 = 2131429152(0x7f0b0720, float:1.8479969E38)
            android.view.View r4 = r1.findViewById(r4)
            r2.A0E = r4
            com.instagram.business.promote.model.PromoteData r4 = r2.A08
            if (r4 == 0) goto L_0x00ff
            com.instagram.common.session.UserSession r8 = r4.A0y
            X.0qQ.A06(r8)
            X.0Tu r7 = X.0Tu.A06
            r4 = 36327988735785818(0x81101d00003b5a, double:3.037304585355699E-306)
            boolean r4 = X.182.A06(r7, r8, r4)
            com.instagram.business.promote.model.PromoteData r5 = r2.A08
            if (r4 == 0) goto L_0x0111
            if (r5 == 0) goto L_0x00ff
            java.util.List r4 = X.W2x.A01
        L_0x0042:
            java.util.ArrayList r4 = X.00k.A0U(r4)
            r5.A1o = r4
            r4 = 2131441765(0x7f0b3865, float:1.850555E38)
            android.view.View r4 = r1.requireViewById(r4)
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r4 = (com.instagram.igds.components.stepperheader.IgdsStepperHeader) r4
            r2.A0P = r4
            r4 = 2131443107(0x7f0b3da3, float:1.8508273E38)
            android.widget.TextView r4 = X.DbU.A0G(r1, r4)
            r2.A0M = r4
            r4 = 2131443106(0x7f0b3da2, float:1.850827E38)
            android.widget.TextView r4 = X.DbU.A0G(r1, r4)
            r2.A0L = r4
            r4 = 2131429169(0x7f0b0731, float:1.8480003E38)
            android.view.ViewStub r4 = X.DbU.A0D(r1, r4)
            r2.A01 = r4
            r4 = 2131429157(0x7f0b0725, float:1.8479979E38)
            android.view.View r4 = X.DbY.A0F(r1, r4)
            r2.A0F = r4
            com.instagram.ui.widget.spinner.SpinnerImageView r4 = X.DbX.A0k(r1)
            r2.A0Q = r4
            r4 = 2131429166(0x7f0b072e, float:1.8479997E38)
            android.widget.TextView r4 = X.DbU.A0G(r1, r4)
            r2.A0K = r4
            r4 = 2131429165(0x7f0b072d, float:1.8479995E38)
            android.widget.ImageView r4 = X.DbU.A0F(r1, r4)
            r2.A0H = r4
            r4 = 2131429159(0x7f0b0727, float:1.8479983E38)
            android.widget.TextView r4 = X.DbU.A0G(r1, r4)
            r2.A02 = r4
            r4 = 2131429161(0x7f0b0729, float:1.8479987E38)
            android.view.View r4 = r1.requireViewById(r4)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2.A0N = r4
            r4 = 2131429163(0x7f0b072b, float:1.847999E38)
            android.widget.ImageView r4 = X.DbU.A0F(r1, r4)
            r2.A0G = r4
            r4 = 2131429164(0x7f0b072c, float:1.8479993E38)
            android.widget.TextView r4 = X.DbU.A0G(r1, r4)
            r2.A0J = r4
            r4 = 2131429162(0x7f0b072a, float:1.8479989E38)
            android.widget.TextView r4 = X.DbU.A0G(r1, r4)
            r2.A0I = r4
            android.view.View r5 = r2.A0E
            if (r5 == 0) goto L_0x00cb
            r4 = 2131441399(0x7f0b36f7, float:1.8504809E38)
            android.view.View r6 = r5.findViewById(r4)
            com.instagram.igds.components.banner.IgdsBanner r6 = (com.instagram.igds.components.banner.IgdsBanner) r6
        L_0x00cb:
            r2.A0A = r6
            r4 = 2131444089(0x7f0b4179, float:1.8510264E38)
            android.view.View r4 = r1.requireViewById(r4)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2.A03 = r4
            com.instagram.business.promote.model.PromoteState r4 = r2.A09
            if (r4 == 0) goto L_0x014e
            com.instagram.business.promote.model.PromoteData r4 = r2.A08
            if (r4 == 0) goto L_0x00ff
            boolean r4 = com.instagram.business.promote.model.PromoteState.A02(r4)
            java.lang.String r10 = "stepperHeader"
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r7 = r2.A0P
            if (r4 == 0) goto L_0x0107
            if (r7 == 0) goto L_0x0387
            r4 = 8
            r7.setVisibility(r4)
        L_0x00f1:
            com.instagram.business.promote.model.PromoteData r7 = r2.A08
            if (r7 == 0) goto L_0x00ff
            com.instagram.business.promote.model.PromoteState r6 = r2.A09
            if (r6 == 0) goto L_0x014e
            X.W1k r5 = r2.A04
            if (r5 != 0) goto L_0x01e4
            java.lang.String r18 = "promoteDataFetcher"
        L_0x00ff:
            X.0qQ.A0F(r18)
        L_0x0102:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0107:
            if (r7 == 0) goto L_0x0387
            r6 = 2
            r5 = 4
            boolean r4 = r2.A0B
            r7.A03(r6, r5, r0, r4)
            goto L_0x00f1
        L_0x0111:
            if (r5 == 0) goto L_0x00ff
            java.util.List r4 = X.W2x.A00
            goto L_0x0042
        L_0x0117:
            com.instagram.business.promote.model.PromoteState r5 = r2.A09
            if (r5 == 0) goto L_0x014e
            boolean r4 = r5.A05
            if (r4 == 0) goto L_0x021e
            boolean r4 = r5.A02
            if (r4 == 0) goto L_0x021e
            com.instagram.api.schemas.BudgetRecommendationType r4 = com.instagram.api.schemas.BudgetRecommendationType.MIN_CPC_SUGGESTION
            java.lang.String r8 = r4.A00
            com.instagram.api.schemas.BudgetRecommendationType r4 = com.instagram.api.schemas.BudgetRecommendationType.NO_CONVERSION_WARNING
            java.lang.String r9 = r4.A00
            com.instagram.api.schemas.BudgetRecommendationType r4 = com.instagram.api.schemas.BudgetRecommendationType.RECOMMENDED_DEFAULT_BUDGET_CPA_BASED
            java.lang.String r10 = r4.A00
            com.instagram.api.schemas.BudgetRecommendationType r4 = com.instagram.api.schemas.BudgetRecommendationType.RECOMMENDED_DEFAULT_BUDGET_PPP_BASED
            java.lang.String r11 = r4.A00
            com.instagram.api.schemas.BudgetRecommendationType r4 = com.instagram.api.schemas.BudgetRecommendationType.ZERO_OUTCOME_BUDGET_WARNING
            java.lang.String r12 = r4.A00
            com.instagram.api.schemas.BudgetRecommendationType r4 = com.instagram.api.schemas.BudgetRecommendationType.SIMILAR_ADVERTISER_BUDGET_RECOMMENDATION
            java.lang.String r13 = r4.A00
            com.instagram.api.schemas.BudgetRecommendationType r4 = com.instagram.api.schemas.BudgetRecommendationType.LOW_OUTCOME_BUDGET_WARNING
            java.lang.String r14 = r4.A00
            java.lang.String[] r4 = new java.lang.String[]{r8, r9, r10, r11, r12, r13, r14}
            java.util.List r16 = X.0sr.A1P(r4)
            X.W1k r8 = r2.A04
            r9 = 0
            if (r8 != 0) goto L_0x0152
            java.lang.String r17 = "promoteDataFetcher"
        L_0x014e:
            X.0qQ.A0F(r17)
            goto L_0x0102
        L_0x0152:
            X.0eM r4 = r2.A0T
            X.WGU r4 = X.C13990Tnq.A0M(r4)
            X.UcZ r6 = new X.UcZ
            r6.<init>(r4, r2, r0)
            com.instagram.business.promote.model.PromoteData r4 = r2.A08
            if (r4 != 0) goto L_0x0164
            r17 = r18
            goto L_0x014e
        L_0x0164:
            com.instagram.business.promote.model.PromoteAudience r4 = r4.A06()
            if (r4 == 0) goto L_0x016c
            java.lang.String r9 = r4.A06
        L_0x016c:
            com.instagram.business.promote.model.PromoteData r13 = r8.A03
            com.instagram.common.session.UserSession r10 = r13.A0y
            java.lang.String r15 = r13.A1A
            java.lang.String r14 = r13.A1S
            com.instagram.api.schemas.XIGIGBoostDestination r4 = r13.A0i
            java.lang.String r5 = r4.toString()
            X.WGU r4 = r8.A02
            java.lang.String r12 = r4.A03
            com.instagram.business.promote.model.PromoteAudience r4 = r13.A06()
            boolean r4 = X.W3x.A0P(r4)
            if (r4 == 0) goto L_0x01e1
            r11 = 0
        L_0x0189:
            java.util.List r4 = r13.A1n
            r19 = r4
            java.util.List r13 = r13.A1o
            X.1NY r10 = X.DbU.A0N(r10)
            java.lang.String r4 = "ads/promote/budget_recommendation_v2/"
            X.C13990Tnq.A1C(r10, r4, r15)
            X.JTO.A1W(r10, r14)
            java.lang.String r14 = X.C51970G9q.A0k(r16)
            java.lang.String r4 = "recommendation_types"
            r10.A9m(r4, r14)
            java.lang.String r4 = "destination"
            r10.A9m(r4, r5)
            java.lang.String r5 = X.C51970G9q.A0k(r19)
            java.lang.String r4 = "daily_budget_options_with_offset"
            r10.A9m(r4, r5)
            java.lang.String r5 = X.C51970G9q.A0k(r13)
            java.lang.String r4 = "duration_options"
            r10.A9m(r4, r5)
            java.lang.String r4 = "flow_id"
            r10.A0G(r4, r12)
            java.lang.String r4 = "audience_id"
            r10.A0G(r4, r11)
            java.lang.Class<X.CEL> r5 = X.CEL.class
            java.lang.Class<X.Cxo> r4 = X.C45514Cxo.class
            r10.A0R(r5, r4)
            java.lang.String r4 = "regulated_target_spec_string"
            r10.A0G(r4, r9)
            X.1OC r5 = r10.A0M()
            java.lang.String r4 = "/api/v1/ads/promote/budget_recommendation_v2/"
            java.lang.String r4 = X.W2x.A01(r4)
            r6.A02 = r4
            X.C18784W1k.A02(r8, r6, r5)
            goto L_0x0221
        L_0x01e1:
            java.lang.String r11 = r13.A1Z
            goto L_0x0189
        L_0x01e4:
            X.Vkg r4 = new X.Vkg
            r4.<init>(r1, r5, r7, r6)
            r2.A06 = r4
            r7 = 2131438693(0x7f0b2c65, float:1.849932E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r1, r7)
            androidx.fragment.app.FragmentActivity r8 = r2.requireActivity()
            com.instagram.business.promote.model.PromoteData r6 = r2.A08
            if (r6 == 0) goto L_0x00ff
            com.instagram.business.promote.model.PromoteState r5 = r2.A09
            if (r5 == 0) goto L_0x014e
            X.WUu r4 = new X.WUu
            r4.<init>(r9, r8, r6, r5)
            r2.A07 = r4
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r4 = r2.A0P
            if (r4 == 0) goto L_0x0387
            r4.A01()
            com.instagram.business.promote.model.PromoteData r4 = r2.A08
            if (r4 == 0) goto L_0x00ff
            com.instagram.api.schemas.PaymentInfo r4 = r4.A0X
            if (r4 == 0) goto L_0x0117
            java.lang.Integer r4 = r4.A01
            if (r4 == 0) goto L_0x0117
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0117
        L_0x021e:
            A04(r1, r2)
        L_0x0221:
            com.instagram.business.promote.model.PromoteData r4 = r2.A08
            if (r4 == 0) goto L_0x00ff
            int r5 = r4.A0I
            int r4 = r4.A0A
            r2.A03(r5, r4)
            r2.A01()
            X.UzE r6 = X.C16678UzE.BUDGET_DURATION
            X.Vw9 r4 = new X.Vw9
            r4.<init>(r1, r6)
            r2.A05 = r4
            r4.A01()
            X.Vw9 r9 = r2.A05
            if (r9 != 0) goto L_0x0243
            java.lang.String r18 = "nextButtonHolder"
            goto L_0x00ff
        L_0x0243:
            android.content.Context r8 = r2.requireContext()
            com.instagram.business.promote.model.PromoteState r4 = r2.A09
            if (r4 == 0) goto L_0x014e
            com.instagram.business.promote.model.PromoteData r4 = r2.A08
            if (r4 == 0) goto L_0x00ff
            boolean r5 = com.instagram.business.promote.model.PromoteState.A02(r4)
            r4 = 2131970410(0x7f13496a, float:1.957777E38)
            if (r5 == 0) goto L_0x025b
            r4 = 2131970439(0x7f134987, float:1.957783E38)
        L_0x025b:
            java.lang.String r4 = r8.getString(r4)
            X.C18165Vmf.A01(r2, r9, r4)
            com.instagram.business.promote.model.PromoteData r4 = r2.A08
            if (r4 == 0) goto L_0x00ff
            boolean r4 = r4.A0E()
            if (r4 == 0) goto L_0x026f
            r2.A08(r0)
        L_0x026f:
            com.instagram.business.promote.model.PromoteData r5 = r2.A08
            if (r5 == 0) goto L_0x00ff
            int r4 = r5.A09
            if (r4 == 0) goto L_0x02c1
            int r4 = r5.A08
            if (r4 == 0) goto L_0x02c1
            X.0eM r4 = r2.A0T
            X.WGU r10 = X.C13990Tnq.A0M(r4)
            java.lang.String r11 = r6.toString()
            com.instagram.business.promote.model.PromoteData r8 = r2.A08
            if (r8 == 0) goto L_0x00ff
            int r4 = r8.A08
            long r4 = (long) r4
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            int r4 = r8.A09
            long r4 = (long) r4
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            X.0wc r5 = r10.A05
            java.lang.String r4 = "promoted_posts_start_step"
            X.0Aj r8 = X.C13990Tnq.A0H(r10, r5, r4)
            java.lang.String r4 = "step"
            X.C13989Tnp.A1G(r8, r10, r4, r11)
            X.UGJ r5 = new X.UGJ
            r5.<init>()
            X.C13990Tnq.A17(r5, r10)
            java.lang.String r4 = "default_daily_budget_with_offset"
            r5.A05(r4, r9)
            java.lang.String r4 = "default_duration_in_days"
            r5.A05(r4, r12)
            X.C13989Tnp.A1D(r8, r5)
        L_0x02b9:
            X.Vkg r4 = r2.A06
            if (r4 != 0) goto L_0x02cb
            java.lang.String r18 = "reachAndOutcomeEstimationController"
            goto L_0x00ff
        L_0x02c1:
            X.0eM r4 = r2.A0T
            X.WGU r4 = X.C13990Tnq.A0M(r4)
            X.C13988Tno.A1J(r4, r6)
            goto L_0x02b9
        L_0x02cb:
            r4.A02()
            com.instagram.business.promote.model.PromoteData r8 = r2.A08
            if (r8 == 0) goto L_0x00ff
            com.instagram.business.boost.model.BoostFlowType r5 = r8.A0l
            com.instagram.business.boost.model.BoostFlowType r4 = com.instagram.business.boost.model.BoostFlowType.DRAFT
            if (r5 == r4) goto L_0x036c
            com.instagram.business.boost.model.BoostFlowType r4 = com.instagram.business.boost.model.BoostFlowType.BOOST_AGAIN
            if (r5 == r4) goto L_0x036c
            boolean r4 = r8.A0D()
            if (r4 != 0) goto L_0x036c
            com.instagram.common.session.UserSession r9 = r8.A0y
            X.0Tu r8 = X.0Tu.A05
            r4 = 36328108994870216(0x81103900003bc8, double:3.037380637684917E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r8, r9, r4)
            boolean r4 = X.C41845B3m.A14(r4)
            if (r4 == 0) goto L_0x036c
            android.view.View r7 = r1.findViewById(r7)
            r4 = 2131442937(0x7f0b3cf9, float:1.8507928E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r1, r4)
            r4 = 2131970748(0x7f134abc, float:1.9578456E38)
            X.DbU.A1G(r5, r2, r4)
            r7.setVisibility(r3)
            X.WUu r11 = r2.A07
            if (r11 != 0) goto L_0x0311
            java.lang.String r18 = "promoteScheduleController"
            goto L_0x00ff
        L_0x0311:
            android.view.View r7 = r11.A03
            r4 = 2131442936(0x7f0b3cf8, float:1.8507926E38)
            android.view.View r4 = r7.requireViewById(r4)
            com.instagram.igds.components.switchbutton.IgdsSwitch r4 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r4
            r11.A02 = r4
            r4 = 2131442935(0x7f0b3cf7, float:1.8507924E38)
            android.widget.TextView r4 = X.DbU.A0G(r7, r4)
            r11.A00 = r4
            androidx.fragment.app.FragmentActivity r9 = r11.A04
            com.instagram.business.promote.model.PromoteData r5 = r11.A05
            com.instagram.common.session.UserSession r10 = r5.A0y
            X.0qQ.A06(r10)
            r4 = 2131970747(0x7f134abb, float:1.9578454E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r9, r4)
            r4 = 2131970746(0x7f134aba, float:1.9578452E38)
            java.lang.String r13 = r9.getString(r4)
            X.OVW r8 = new X.OVW
            r14 = r3
            r15 = r0
            r16 = r3
            r17 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r11.A01 = r8
            r0 = 62
            X.C18887WAz.A00(r7, r0, r11)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r11.A02
            java.lang.String r18 = "toggleSwitch"
            if (r0 == 0) goto L_0x00ff
            X.C18921WCy.A00(r0, r11, r3)
            com.instagram.igds.components.switchbutton.IgdsSwitch r4 = r11.A02
            if (r4 == 0) goto L_0x00ff
            com.instagram.business.promote.model.PromoteState r0 = r11.A06
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0368
            java.util.Date r3 = r5.A1k
            r0 = 1
            if (r3 != 0) goto L_0x0369
        L_0x0368:
            r0 = 0
        L_0x0369:
            r4.setChecked(r0)
        L_0x036c:
            r0 = r22
            super.onViewCreated(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
            boolean r0 = r2 instanceof X.X7g
            if (r0 == 0) goto L_0x0386
            X.X7g r2 = (X.X7g) r2
            if (r2 == 0) goto L_0x0386
            java.lang.String r1 = "promote_budget_duration"
            java.lang.String r0 = r6.toString()
            r2.Clv(r1, r0)
        L_0x0386:
            return
        L_0x0387:
            X.0qQ.A0F(r10)
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15323UaV.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final String A00() {
        Context context;
        int i;
        PromoteData promoteData = this.A08;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != null) {
            int ordinal = xIGIGBoostDestination.ordinal();
            if (ordinal == 8) {
                context = getContext();
                if (context != null) {
                    i = 2131970262;
                }
            } else if (ordinal == 10) {
                context = getContext();
                if (context != null) {
                    i = 2131970263;
                }
            } else if ((ordinal == 12 || ordinal == 1) && (context = getContext()) != null) {
                i = 2131970261;
            }
            return context.getString(i);
        }
        return null;
    }

    private final void A01() {
        String str;
        TextView textView = this.A0L;
        if (textView == null) {
            str = "totalSpendLabelView";
        } else {
            PromoteData promoteData = this.A08;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                boolean z = promoteData.A2v;
                int i = 2131970279;
                if (z) {
                    i = 2131970269;
                }
                textView.setText(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A02() {
        List list;
        Object obj;
        String formatStrLocaleSafe;
        PromoteData promoteData = this.A08;
        String str = null;
        if (promoteData != null) {
            XA0 xa0 = promoteData.A0Z;
            if (xa0 != null && (list = ((UNS) xa0).A02) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int i = ((UMx) ((C21015X9r) obj)).A02;
                    PromoteData promoteData2 = this.A08;
                    if (promoteData2 != null) {
                        if (i == promoteData2.A0A) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                C21015X9r x9r = (C21015X9r) obj;
                if (x9r != null) {
                    UNS uns = (UNS) xa0;
                    int i2 = uns.A00;
                    PromoteData promoteData3 = this.A08;
                    if (promoteData3 != null) {
                        String A0g = C13991Tnr.A0g(promoteData3, i2);
                        PromoteData promoteData4 = this.A08;
                        if (promoteData4 != null) {
                            UserSession userSession = promoteData4.A0y;
                            0qQ.A06(userSession);
                            boolean A062 = 182.A06(0Tu.A05, userSession, 36322160465356775L);
                            Context context = getContext();
                            if (A062) {
                                if (context != null) {
                                    str = context.getString(2131970255);
                                }
                                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, A0g, Integer.valueOf(uns.A01), A00());
                            } else {
                                if (context != null) {
                                    str = context.getString(2131970254);
                                }
                                UMx uMx = (UMx) x9r;
                                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, A0g, Integer.valueOf(uMx.A01), Integer.valueOf(uMx.A00), A00());
                            }
                            IgdsBanner igdsBanner = this.A0A;
                            if (igdsBanner != null) {
                                igdsBanner.setBody(formatStrLocaleSafe, AnonymousClass7TE.A0u());
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A03(int i, int i2) {
        int i3;
        String string;
        PromoteData promoteData = this.A08;
        String str = "promoteData";
        if (promoteData != null) {
            if (promoteData.A1v.size() > 1) {
                PromoteData promoteData2 = this.A08;
                if (promoteData2 != null) {
                    i3 = promoteData2.A1v.size();
                }
            } else {
                i3 = 1;
            }
            TextView textView = this.A0M;
            if (textView == null) {
                str = "totalSpendValueView";
            } else {
                PromoteData promoteData3 = this.A08;
                if (promoteData3 != null) {
                    if (promoteData3.A2v) {
                        Context requireContext = requireContext();
                        PromoteData promoteData4 = this.A08;
                        if (promoteData4 != null) {
                            int i4 = promoteData4.A06;
                            Currency currency = promoteData4.A1j;
                            0qQ.A06(currency);
                            string = DbY.A0c(requireContext, W2x.A02(currency, promoteData4.A07 * i3, i4), 2131970257);
                        }
                    } else {
                        string = getString(2131970814, new Object[]{C13991Tnr.A0g(promoteData3, i * i3), W2x.A00(requireContext(), i2)});
                        0qQ.A0A(string);
                    }
                    textView.setText(string);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0102, code lost:
        if (r0.A26.contains(com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CONVERSION) != false) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.view.View r14, X.C15323UaV r15) {
        /*
            com.instagram.business.promote.model.PromoteData r1 = r15.A08
            java.lang.String r7 = "promoteData"
            if (r1 == 0) goto L_0x02cf
            com.instagram.business.promote.model.PromoteState r0 = r15.A09
            java.lang.String r6 = "promoteState"
            if (r0 == 0) goto L_0x0369
            boolean r4 = X.W3E.A05(r1)
            com.instagram.business.promote.model.PromoteData r1 = r15.A08
            if (r1 == 0) goto L_0x02cf
            com.instagram.business.promote.model.PromoteState r0 = r15.A09
            if (r0 == 0) goto L_0x0369
            boolean r3 = X.W3E.A07(r1)
            com.instagram.business.promote.model.PromoteData r1 = r15.A08
            if (r1 == 0) goto L_0x02cf
            com.instagram.business.promote.model.PromoteState r0 = r15.A09
            if (r0 == 0) goto L_0x0369
            boolean r2 = X.W3E.A06(r1)
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            boolean r0 = r0.A0D()
            r0 = r0 ^ 1
            r1 = 1
            if (r0 == 0) goto L_0x0366
            if (r4 != 0) goto L_0x003b
            if (r3 != 0) goto L_0x003b
            if (r2 == 0) goto L_0x0366
        L_0x003b:
            r0 = 1
        L_0x003c:
            com.instagram.business.promote.model.PromoteData r4 = r15.A08
            if (r4 == 0) goto L_0x02cf
            int r3 = r4.A07
            if (r3 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x005c
            com.instagram.business.promote.model.PromoteState r2 = r15.A09
            if (r2 == 0) goto L_0x0369
            boolean r0 = r4.A2v
            if (r1 == r0) goto L_0x005c
            r4.A2v = r1
            r2.A06 = r1
            r0 = 0
            r4.A0A = r0
            r4.A0I = r3
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            com.instagram.business.promote.model.PromoteState.A01(r2, r0)
        L_0x005c:
            com.instagram.business.promote.model.PromoteData r3 = r15.A08
            if (r3 == 0) goto L_0x02cf
            int r0 = r3.A07
            if (r0 != 0) goto L_0x006d
            com.instagram.business.promote.model.PromoteState r2 = r15.A09
            if (r2 == 0) goto L_0x0369
            int r0 = r3.A08
            r2.A07(r3, r0)
        L_0x006d:
            com.instagram.business.promote.model.PromoteData r3 = r15.A08
            if (r3 == 0) goto L_0x02cf
            int r0 = r3.A0A
            if (r0 != 0) goto L_0x0082
            boolean r0 = r3.A2v
            if (r0 != 0) goto L_0x0082
            com.instagram.business.promote.model.PromoteState r2 = r15.A09
            if (r2 == 0) goto L_0x0369
            int r0 = r3.A09
            r2.A08(r3, r0)
        L_0x0082:
            com.instagram.business.promote.model.PromoteState r0 = r15.A09
            if (r0 == 0) goto L_0x0369
            com.instagram.business.promote.model.PromoteData r2 = r15.A08
            if (r2 == 0) goto L_0x02cf
            boolean r0 = com.instagram.business.promote.model.PromoteState.A03(r2)
            if (r0 == 0) goto L_0x00c9
            java.util.List r0 = r2.A1y
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c9
            com.instagram.common.session.UserSession r4 = r15.getSession()
            X.0Tu r0 = X.0Tu.A05
            r2 = 36607861689685638(0x820ea800001686, double:3.2142973683598746E-306)
            long r4 = X.182.A01(r0, r4, r2)
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c9
            com.instagram.business.promote.model.PromoteData r2 = r15.A08
            if (r2 == 0) goto L_0x02cf
            java.util.List r0 = r2.A1y
            r2.A1n = r0
            int r0 = r2.A08
            r2.A0B(r0)
            com.instagram.business.promote.model.PromoteState r3 = r15.A09
            if (r3 == 0) goto L_0x0369
            com.instagram.business.promote.model.PromoteData r2 = r15.A08
            if (r2 == 0) goto L_0x02cf
            int r0 = r2.A08
            r3.A07(r2, r0)
        L_0x00c9:
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.List r0 = r0.A1y
            if (r0 == 0) goto L_0x011e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x011e
            com.instagram.common.session.UserSession r4 = r15.getSession()
            X.0Tu r0 = X.0Tu.A05
            r2 = 36328594326175177(0x8110aa00003dc9, double:3.0376875631564467E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x011e
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.Set r2 = r0.A26
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0104
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.Set r2 = r0.A26
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CONVERSION
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x011e
        L_0x0104:
            com.instagram.business.promote.model.PromoteData r2 = r15.A08
            if (r2 == 0) goto L_0x02cf
            java.util.List r0 = r2.A1y
            r2.A1n = r0
            int r0 = r2.A08
            r2.A0B(r0)
            com.instagram.business.promote.model.PromoteState r3 = r15.A09
            if (r3 == 0) goto L_0x0369
            com.instagram.business.promote.model.PromoteData r2 = r15.A08
            if (r2 == 0) goto L_0x02cf
            int r0 = r2.A08
            r3.A07(r2, r0)
        L_0x011e:
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.List r0 = r0.A1z
            if (r0 == 0) goto L_0x0354
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0354
            com.instagram.business.promote.model.PromoteData r2 = r15.A08
            if (r2 == 0) goto L_0x02cf
            java.util.List r0 = r2.A1z
            r2.A1n = r0
        L_0x0134:
            com.instagram.business.promote.model.PromoteData r3 = r15.A08
            if (r3 == 0) goto L_0x02cf
            com.instagram.business.promote.model.PromoteState r0 = r15.A09
            if (r0 == 0) goto L_0x0369
            com.instagram.common.session.UserSession r4 = r15.getSession()
            boolean r0 = com.instagram.business.promote.model.PromoteState.A03(r3)
            if (r0 == 0) goto L_0x019b
            com.instagram.business.boost.model.BoostFlowType r2 = r3.A0l
            com.instagram.business.boost.model.BoostFlowType r0 = com.instagram.business.boost.model.BoostFlowType.BOOST_AGAIN
            if (r2 == r0) goto L_0x019b
            com.instagram.business.boost.model.BoostFlowType r0 = com.instagram.business.boost.model.BoostFlowType.DRAFT
            if (r2 == r0) goto L_0x019b
            com.instagram.business.promote.model.PromoteLaunchOrigin r2 = r3.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.AB_TESTING_PICKER
            if (r2 == r0) goto L_0x019b
            java.util.Set r2 = r3.A26
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x019b
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x019b
            X.0Tu r0 = X.0Tu.A05
            r2 = 36605035601269936(0x820c16000114b0, double:3.21251013866604E-306)
            long r2 = X.182.A01(r0, r4, r2)
            int r4 = (int) r2
            if (r4 <= 0) goto L_0x019b
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.List r0 = r0.A1n
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x019b
            com.instagram.business.promote.model.PromoteData r3 = r15.A08
            if (r3 == 0) goto L_0x02cf
            java.util.List r2 = r3.A1n
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r4, r0)
            r3.A1n = r0
            com.instagram.business.promote.model.PromoteData r2 = r15.A08
            if (r2 == 0) goto L_0x02cf
            int r0 = r2.A08
            r2.A0B(r0)
        L_0x019b:
            com.instagram.business.promote.model.PromoteData r2 = r15.A08
            if (r2 == 0) goto L_0x02cf
            int r0 = r2.A0C
            if (r0 <= 0) goto L_0x01ed
            com.instagram.business.promote.model.PromoteState r0 = r15.A09
            if (r0 == 0) goto L_0x0369
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r2)
            if (r0 != 0) goto L_0x01ed
            com.instagram.common.session.UserSession r4 = r15.getSession()
            X.0Tu r0 = X.0Tu.A05
            r2 = 36610997015812282(0x821182000018ba, double:3.216280161227309E-306)
            long r2 = X.182.A01(r0, r4, r2)
            int r0 = (int) r2
            if (r0 == 0) goto L_0x01ed
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.List r2 = r0.A1n
            int r0 = r0.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = r2.indexOf(r0)
            if (r4 <= 0) goto L_0x01ed
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.List r0 = r0.A1n
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x01ed
            com.instagram.business.promote.model.PromoteData r3 = r15.A08
            if (r3 == 0) goto L_0x02cf
            java.util.List r2 = r3.A1n
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r4, r0)
            r3.A1n = r0
        L_0x01ed:
            android.content.Context r8 = r15.requireContext()
            com.instagram.common.session.UserSession r12 = r15.getSession()
            java.lang.String r0 = "budget_slider"
            X.VaL r9 = new X.VaL
            r9.<init>(r14, r0)
            android.content.Context r2 = r15.requireContext()
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.List r13 = X.W2x.A04(r2, r0)
            com.instagram.business.promote.model.PromoteData r10 = r15.A08
            if (r10 == 0) goto L_0x02cf
            com.instagram.business.promote.model.PromoteState r11 = r15.A09
            if (r11 == 0) goto L_0x0369
            X.VAH.A00(r8, r9, r10, r11, r12, r13)
            com.instagram.common.session.UserSession r0 = r15.getSession()
            boolean r0 = X.C18803W2r.A04(r0)
            if (r0 == 0) goto L_0x02a6
            com.instagram.common.session.UserSession r4 = r15.getSession()
            r5 = 0
            X.0Tu r0 = X.0Tu.A05
            r2 = 36330239298716193(0x81122900014221, double:3.038727850415158E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x02a6
            r0 = 2131431176(0x7f0b0f08, float:1.8484074E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r14, r0)
            com.instagram.igds.components.form.IgFormField r4 = (com.instagram.igds.components.form.IgFormField) r4
            r4.setPrismMode(r1)
            r0 = 2
            r4.setInputType(r0)
            android.widget.TextView r3 = r4.getTopLabel()
            android.content.res.Resources r2 = r4.getResources()
            r0 = 2131165292(0x7f07006c, float:1.7944797E38)
            float r0 = r2.getDimension(r0)
            r3.setTextSize(r5, r0)
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            int r2 = r0.A07
            int r0 = r0.A06
            int r2 = r2 / r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r4.setTextProperty(r0)
            X.WXw r0 = new X.WXw
            r0.<init>(r5, r14, r15)
            r4.setRuleChecker(r0)
            android.view.View r0 = r4.getPrismFormFieldContainer()
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbX.A0G(r0)
            r0 = 8
            r2.topMargin = r0
            android.view.View r0 = r4.getPrismFormFieldContainer()
            r0.setLayoutParams(r2)
            r0 = 2131431147(0x7f0b0eeb, float:1.8484015E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r14, r0)
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.Currency r0 = r0.A1j
            java.lang.String r0 = r0.getSymbol()
            r3.setText(r0)
            android.widget.EditText r2 = r4.getMEditText()
            r0 = 6
            r2.setImeOptions(r0)
            X.WDC r0 = new X.WDC
            r0.<init>(r15, r1)
            r2.setOnEditorActionListener(r0)
            r3.setVisibility(r5)
            r4.setVisibility(r5)
        L_0x02a6:
            android.content.Context r8 = r15.requireContext()
            com.instagram.common.session.UserSession r12 = r15.getSession()
            java.lang.String r0 = "duration_slider"
            X.VaL r9 = new X.VaL
            r9.<init>(r14, r0)
            android.content.Context r2 = r15.requireContext()
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            java.util.List r0 = r0.A1o
            X.0qQ.A06(r0)
            java.util.List r13 = X.W2x.A05(r2, r0)
            com.instagram.business.promote.model.PromoteData r10 = r15.A08
            if (r10 == 0) goto L_0x02cf
            com.instagram.business.promote.model.PromoteState r11 = r15.A09
            if (r11 != 0) goto L_0x02d7
            r7 = r6
        L_0x02cf:
            X.0qQ.A0F(r7)
        L_0x02d2:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02d7:
            X.VAH.A00(r8, r9, r10, r11, r12, r13)
            com.instagram.common.session.UserSession r0 = r15.getSession()
            boolean r0 = X.C18803W2r.A04(r0)
            if (r0 == 0) goto L_0x0353
            com.instagram.common.session.UserSession r5 = r15.getSession()
            r4 = 0
            X.0Tu r0 = X.0Tu.A05
            r2 = 36330239298781730(0x81122900024222, double:3.038727850456604E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x0353
            r0 = 2131431188(0x7f0b0f14, float:1.8484098E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r14, r0)
            com.instagram.igds.components.form.IgFormField r3 = (com.instagram.igds.components.form.IgFormField) r3
            r3.setPrismMode(r1)
            r2 = 2
            r3.setInputType(r2)
            android.widget.TextView r6 = r3.getTopLabel()
            android.content.res.Resources r5 = r3.getResources()
            r0 = 2131165292(0x7f07006c, float:1.7944797E38)
            float r0 = r5.getDimension(r0)
            r6.setTextSize(r4, r0)
            com.instagram.business.promote.model.PromoteData r0 = r15.A08
            if (r0 == 0) goto L_0x02cf
            int r0 = r0.A0A
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.setTextProperty(r0)
            X.WXw r0 = new X.WXw
            r0.<init>(r1, r14, r15)
            r3.setRuleChecker(r0)
            android.view.View r0 = r3.getPrismFormFieldContainer()
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbX.A0G(r0)
            r0 = 8
            r1.topMargin = r0
            android.view.View r0 = r3.getPrismFormFieldContainer()
            r0.setLayoutParams(r1)
            android.widget.EditText r1 = r3.getMEditText()
            r0 = 6
            r1.setImeOptions(r0)
            X.WDC r0 = new X.WDC
            r0.<init>(r15, r2)
            r1.setOnEditorActionListener(r0)
            r3.setVisibility(r4)
        L_0x0353:
            return
        L_0x0354:
            com.instagram.business.promote.model.PromoteData r3 = r15.A08
            if (r3 == 0) goto L_0x02cf
            java.util.List r2 = r3.A1n
            X.0qQ.A06(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r3.A1z = r0
            goto L_0x0134
        L_0x0366:
            r0 = 0
            goto L_0x003c
        L_0x0369:
            X.0qQ.A0F(r6)
            goto L_0x02d2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15323UaV.A04(android.view.View, X.UaV):void");
    }

    private final void A07(IgTextView igTextView) {
        Context context;
        int i;
        Object[] objArr;
        int i2;
        PromoteData promoteData = this.A08;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != null) {
            int ordinal = xIGIGBoostDestination.ordinal();
            if (ordinal != 8) {
                if (ordinal != 10) {
                    if ((ordinal == 12 || ordinal == 1) && igTextView != null) {
                        context = requireContext();
                        i = 2131970265;
                        objArr = new Object[1];
                        i2 = 2131970261;
                    } else {
                        return;
                    }
                } else if (igTextView != null) {
                    context = requireContext();
                    i = 2131970265;
                    objArr = new Object[1];
                    i2 = 2131970263;
                } else {
                    return;
                }
            } else if (igTextView != null) {
                context = requireContext();
                i = 2131970265;
                objArr = new Object[1];
                i2 = 2131970262;
            } else {
                return;
            }
            objArr[0] = getString(i2);
            igTextView.setText(context.getString(i, objArr));
        }
    }

    private final void A08(boolean z) {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(DbW.A01(z ? 1 : 0));
        } else if (z) {
            C13990Tnq.A0M(this.A0T).A0H(C16678UzE.BUDGET_DURATION, "ad_account_budget_limit_warning");
            ViewStub viewStub = this.A01;
            if (viewStub == null) {
                0qQ.A0F("budgetWarningViewStub");
                throw AnonymousClass00P.createAndThrow();
            }
            View inflate = viewStub.inflate();
            C18887WAz.A00(inflate.requireViewById(R.id.budget_ads_manager_link_text), 57, this);
            DbU.A0G(inflate, R.id.budget_warning_text).setText(2131970245);
            inflate.setVisibility(0);
            this.A00 = inflate;
        }
    }

    /* renamed from: A09 */
    public final UserSession getSession() {
        UserSession userSession = this.A0O;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final C18784W1k AvJ() {
        C18784W1k w1k = this.A04;
        if (w1k != null) {
            return w1k;
        }
        0qQ.A0F("promoteDataFetcher");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C16678UzE Bhi() {
        return C16678UzE.BUDGET_DURATION;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0033: MOVE  (r1v2 X.X7g) = (r1v1 X.X7g)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean onBackPressed() {
        /*
            r4 = this;
            com.instagram.business.promote.model.PromoteState r0 = r4.A09
            java.lang.String r3 = "promoteState"
            if (r0 == 0) goto L_0x003f
            com.instagram.business.promote.model.PromoteData r0 = r4.A08
            java.lang.String r2 = "promoteData"
            if (r0 == 0) goto L_0x0043
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 == 0) goto L_0x001d
            com.instagram.business.promote.model.PromoteState r1 = r4.A09
            if (r1 == 0) goto L_0x003f
            com.instagram.business.promote.model.PromoteData r0 = r4.A08
            if (r0 == 0) goto L_0x0043
            r1.A06(r0)
        L_0x001d:
            X.0eM r0 = r4.A0T
            X.WGU r1 = X.C13990Tnq.A0M(r0)
            X.UzE r3 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = "back_button"
            r1.A0F(r3, r0)
            r2 = 0
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x003e
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = r3.toString()
            r1.Clw(r0)
        L_0x003e:
            return r2
        L_0x003f:
            X.0qQ.A0F(r3)
            goto L_0x0046
        L_0x0043:
            X.0qQ.A0F(r2)
        L_0x0046:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15323UaV.onBackPressed():boolean");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1403050884);
        C15323UaV.super.onCreate(bundle);
        this.A09 = XA9.A00(this);
        PromoteData A002 = XAI.A00(this);
        this.A08 = A002;
        this.A04 = C18784W1k.A01(this, A002.A0y);
        PromoteData promoteData = this.A08;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A0O = promoteData.A0y;
        AnonymousClass0fD.A09(-1095580840, A022);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0013: MOVE  (r1v3 X.X7g) = (r1v0 X.X7g)
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
            r0 = 744876292(0x2c65e904, float:3.2672207E-12)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            boolean r0 = r1 instanceof X.X7g
            if (r0 == 0) goto L_0x0020
            X.X7g r1 = (X.X7g) r1
            if (r1 == 0) goto L_0x0020
            X.UzE r0 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r0 = r0.toString()
            r1.Clx(r0)
        L_0x0020:
            com.instagram.common.session.UserSession r0 = r4.getSession()
            boolean r1 = X.C18803W2r.A04(r0)
            r0 = 2131628418(0x7f0e1182, float:1.8884128E38)
            if (r1 == 0) goto L_0x0030
            r0 = 2131628419(0x7f0e1183, float:1.888413E38)
        L_0x0030:
            android.view.View r1 = r5.inflate(r0, r6, r2)
            r0 = 883076941(0x34a2af4d, float:3.03024E-7)
            X.AnonymousClass0fD.A09(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15323UaV.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-258871184);
        PromoteState promoteState = this.A09;
        if (promoteState == null) {
            0qQ.A0F("promoteState");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteState.A0B(this);
        this.A0E = null;
        this.A0A = null;
        this.A03 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-519571586, A022);
    }
}
