package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.dismissablecallout.DismissableCallout;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class IOA implements C252243on, C334397bC, C59608JQc, C59607JQb, AnonymousClass7Q6 {
    public int A00;
    public C334387bB A01;
    public C56015HrN A02;
    public 1Xj A03;
    public TextWatcher A04;
    public View A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final View.OnLayoutChangeListener A0B = new ID7(this, 2);
    public final AnonymousClass4DH A0C;
    public final C59607JQb A0D;
    public final UserSession A0E;
    public final 0lr A0F = new H80(this, 0);
    public final C247733gp A0G;
    public final AnonymousClass4DU A0H;
    public final 0Rd A0I;
    public final C249763kK A0J;
    public final boolean A0K;
    public final C234072ww A0L;
    public final C55991Hqx A0M;
    public final 1a8 A0N = 1a8.A00();
    public final CharSequence A0O;
    public final String A0P;
    public final boolean A0Q;

    public IOA(Context context, AnonymousClass4DH r4, C234072ww r5, C59607JQb jQb, UserSession userSession, C247733gp r8, AnonymousClass4DU r9, C249763kK r10, CharSequence charSequence, String str, int i, int i2, int i3, boolean z, boolean z2) {
        0qQ.A0B(userSession, 2);
        this.A0A = context;
        this.A0E = userSession;
        this.A0C = r4;
        this.A0P = str;
        this.A0D = jQb;
        this.A0H = r9;
        this.A0L = r5;
        this.A0J = r10;
        this.A0O = charSequence;
        this.A0Q = z;
        this.A0K = z2;
        this.A08 = i;
        this.A07 = i2;
        this.A09 = i3;
        this.A0I = new 0Rd(userSession);
        this.A0M = new C55991Hqx(userSession, this);
        this.A0G = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f1, code lost:
        if (r3.isSponsoredEligible() == false) goto L_0x01f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.IOA r38) {
        /*
            r9 = 1
            r10 = r38
            r10.A06(r9)
            java.lang.CharSequence r0 = r10.A07()
            java.lang.String r4 = r0.toString()
            int r3 = r4.length()
            int r3 = r3 - r9
            r2 = 0
            r1 = 0
        L_0x0015:
            if (r2 > r3) goto L_0x002d
            r0 = r3
            if (r1 != 0) goto L_0x001b
            r0 = r2
        L_0x001b:
            boolean r0 = X.Dbc.A13(r4, r0)
            if (r1 != 0) goto L_0x0028
            if (r0 != 0) goto L_0x0025
            r1 = 1
            goto L_0x0015
        L_0x0025:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            int r3 = r3 + -1
            goto L_0x0015
        L_0x002d:
            java.lang.String r14 = X.Dba.A0c(r4, r3, r2)
            int r0 = r14.length()
            if (r0 == 0) goto L_0x004e
            X.1Xj r8 = r10.A03
            if (r8 != 0) goto L_0x004f
            android.content.Context r3 = r10.A0A
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r3)
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 0
            java.lang.String r0 = "postCommentWithText mMedia == null"
            X.C59689JTv.A00(r3, r2, r0, r1)
        L_0x004e:
            return
        L_0x004f:
            X.HrN r0 = r10.A02
            r7 = 0
            if (r0 != 0) goto L_0x005e
            java.lang.String r21 = "viewHolder"
        L_0x0056:
            X.0qQ.A0F(r21)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005e:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r0.A0D
            if (r1 == 0) goto L_0x0067
            java.lang.String r0 = ""
            r1.setText(r0)
        L_0x0067:
            X.0Rd r11 = r10.A0I
            boolean r0 = r11.A02(r8)
            java.lang.String r21 = "mentionThumbnailSelectionDelegate"
            if (r0 == 0) goto L_0x0079
            X.7bB r0 = r10.A01
            if (r0 == 0) goto L_0x0056
            java.lang.String r14 = r0.EFM(r14)
        L_0x0079:
            com.instagram.common.session.UserSession r6 = r10.A0E
            X.0lr r1 = r10.A0F
            long r4 = r1.A00()
            int r13 = r1.A00
            r20 = 0
            r0 = r20
            r1.A00 = r0
            X.3gp r15 = r10.A0G
            boolean r0 = r11.A02(r8)
            if (r0 == 0) goto L_0x0117
            X.7bB r0 = r10.A01
            if (r0 == 0) goto L_0x0056
            X.7a4 r0 = r0.A00
            java.util.List r12 = r0.A02
        L_0x0099:
            X.1yr r0 = X.1yr.A00(r6)
            r0.A04(r14)
            long r2 = r8.A18()
            r16 = 1
            long r2 = r2 + r16
            long r0 = X.AnonymousClass7TG.A0I()
            long r18 = java.lang.Math.max(r2, r0)
            X.D9g r0 = X.C65211bM.A00
            X.DDf r2 = r0.A00()
            java.lang.String r0 = "\\n{2,}"
            X.11S r1 = new X.11S
            r1.<init>(r0)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.A00(r14, r0)
            r2.A0t = r0
            com.instagram.user.model.User r0 = X.DbT.A0j(r6)
            r2.A09 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r2.A0g = r0
            com.instagram.user.model.User r1 = r8.A2A(r6)
            r0 = 0
            if (r1 == 0) goto L_0x0115
            X.17M r3 = r1.A02
            X.17M r1 = X.17M.A06
            boolean r1 = X.AnonymousClass7TF.A1W(r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x00e4:
            r2.A0U = r1
            r2.A02 = r7
            if (r15 == 0) goto L_0x0113
            java.lang.String r1 = r15.A0G
        L_0x00ec:
            r2.A0s = r1
            if (r15 == 0) goto L_0x00f6
            java.lang.String r0 = r15.A0F
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = r15.A0G
        L_0x00f6:
            r2.A0q = r0
            java.lang.String r0 = r8.getId()
            r2.A0n = r0
            X.1bK r0 = r2.A02()
            X.3gp r2 = new X.3gp
            r2.<init>(r0)
            r2.A02(r8)
            r2.A04 = r4
            r2.A00 = r13
            r2.A05 = r7
            if (r12 == 0) goto L_0x016f
            goto L_0x0119
        L_0x0113:
            r1 = r7
            goto L_0x00ec
        L_0x0115:
            r1 = r7
            goto L_0x00e4
        L_0x0117:
            r12 = r7
            goto L_0x0099
        L_0x0119:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x015e }
            r4 = 0
            int r3 = r12.size()     // Catch:{ IOException -> 0x015e }
        L_0x0122:
            if (r4 >= r3) goto L_0x015b
            java.lang.Object r14 = r12.get(r4)     // Catch:{ IOException -> 0x015e }
            X.N4G r14 = (X.N4G) r14     // Catch:{ IOException -> 0x015e }
            java.io.StringWriter r15 = new java.io.StringWriter     // Catch:{ IOException -> 0x015e }
            r15.<init>()     // Catch:{ IOException -> 0x015e }
            X.17W r13 = X.AnonymousClass7TF.A0K(r15)     // Catch:{ IOException -> 0x015e }
            int r1 = r14.A00     // Catch:{ IOException -> 0x015e }
            r0 = 69
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x015e }
            r13.A0P(r0, r1)     // Catch:{ IOException -> 0x015e }
            java.lang.String r1 = r14.A01     // Catch:{ IOException -> 0x015e }
            if (r1 == 0) goto L_0x014b
            r0 = 704(0x2c0, float:9.87E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x015e }
            r13.A0R(r0, r1)     // Catch:{ IOException -> 0x015e }
        L_0x014b:
            r13.A0Z()     // Catch:{ IOException -> 0x015e }
            r13.close()     // Catch:{ IOException -> 0x015e }
            java.lang.String r0 = r15.toString()     // Catch:{ IOException -> 0x015e }
            r5.add(r0)     // Catch:{ IOException -> 0x015e }
            int r4 = r4 + 1
            goto L_0x0122
        L_0x015b:
            r2.A0H = r5     // Catch:{ IOException -> 0x015e }
            goto L_0x016f
        L_0x015e:
            X.0wb r3 = X.0wb.A01
            r0 = 885(0x375, float:1.24E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2277(0x8e5, float:3.191E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.Ew0(r1, r0)
        L_0x016f:
            boolean r0 = r11.A02(r8)
            if (r0 == 0) goto L_0x017f
            X.7bB r0 = r10.A01
            if (r0 == 0) goto L_0x0056
            X.7a4 r0 = r0.A00
            java.util.List r0 = r0.A01
            r2.A0I = r0
        L_0x017f:
            X.4DH r15 = r10.A0C
            androidx.fragment.app.FragmentActivity r22 = r15.getActivity()
            android.content.Context r14 = r10.A0A
            X.4DU r3 = r10.A0H
            java.lang.String r26 = r3.getModuleName()
            java.lang.String r27 = X.C61970qY.A09(r14)
            boolean r1 = r10.A0K
            int r0 = r10.A08
            r18 = r0
            int r11 = r10.A07
            int r0 = r10.A09
            r23 = r6
            r24 = r2
            r25 = r8
            r28 = r18
            r29 = r11
            r30 = r0
            r31 = r1
            r32 = r20
            r33 = r20
            r34 = r20
            X.1OC r13 = X.C56631I5k.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.JQb r5 = r10.A0D
            X.3kK r4 = r10.A0J
            java.lang.String r34 = X.HWY.A00(r4)
            r12 = 10
            X.3pr r4 = X.C252883pr.Posting
            r2.A06 = r4
            r8.A3y(r6, r2)
            X.H4g r4 = new X.H4g
            r24 = r15
            r25 = r5
            r26 = r6
            r27 = r2
            r28 = r8
            r29 = r3
            r30 = r18
            r31 = r11
            r32 = r0
            r33 = r1
            r21 = r4
            r23 = r14
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r13.A00 = r4
            X.1ES.A03(r13)
            boolean r0 = r8.CcK()
            if (r0 == 0) goto L_0x01f3
            boolean r0 = r3.isSponsoredEligible()
            r13 = 1
            if (r0 != 0) goto L_0x01f4
        L_0x01f3:
            r13 = 0
        L_0x01f4:
            X.7kd r4 = X.C340057kd.A00(r6)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r0 = "button"
            X.A7L r0 = X.C297085r9.A02(r3, r8, r1, r0, r9)
            r4.A01(r0)
            if (r13 == 0) goto L_0x026d
            X.0wc r1 = X.C51972G9s.A0a(r3, r6)
            java.lang.String r0 = "instagram_ad_comment"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x02b0
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.0qQ.A07(r0)
            X.1QM r0 = r0.A02
            java.lang.String r9 = r0.A00
            java.lang.String r1 = r3.getModuleName()
            java.lang.String r0 = "source_of_action"
            X.C51972G9s.A16(r7, r8, r0, r1)
            java.lang.String r0 = X.C294185m0.A08(r8)
            X.DbS.A1J(r7, r0)
            java.lang.String r0 = X.C294185m0.A07(r6, r8, r3)
            X.C51965G9l.A1L(r7, r0)
            java.lang.String r1 = X.C51965G9l.A0t(r8)
            java.lang.String r0 = "inventory_source"
            X.C51974G9v.A0p(r7, r8, r0, r1)
            X.G9w.A18(r7, r6, r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = "is_from_inline_composer"
            r7.A9F(r0, r1)
            long r3 = r2.A04
            double r0 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "comment_compose_duration"
            r7.A8D(r0, r1)
            X.G9w.A19(r7, r8, r9, r11)
            java.lang.String r0 = r8.getId()
            java.lang.String r4 = X.C231122qu.A0H(r6, r0)
            if (r4 == 0) goto L_0x02ad
            java.lang.Long r1 = X.00y.A0n(r12, r4)     // Catch:{ NumberFormatException -> 0x029b }
            java.lang.String r0 = "host_profile_id"
            r7.A9F(r0, r1)     // Catch:{ NumberFormatException -> 0x029b }
            goto L_0x02ad
        L_0x026d:
            java.lang.Integer r29 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = r2.A0c
            java.lang.String r4 = r2.A0F
            long r0 = r2.A04
            r25 = r22
            r27 = r8
            r28 = r3
            r30 = r11
            r31 = r4
            r32 = r7
            r33 = r7
            r35 = r18
            r36 = r0
            r38 = r9
            X.3sc r4 = X.C254513sb.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
            boolean r1 = r8.A5D()
            r0 = -1
            if (r1 == 0) goto L_0x0297
            r0 = 0
        L_0x0297:
            X.C233822wX.A0E(r6, r4, r8, r3, r0)
            goto L_0x02b0
        L_0x029b:
            X.0wj r3 = X.0wj.A01
            r1 = 817902424(0x30c03358, float:1.3984431E-9)
            r0 = 448(0x1c0, float:6.28E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r0, r4)
            X.DbT.A1Q(r3, r0, r1)
        L_0x02ad:
            r7.Cgf()
        L_0x02b0:
            r0 = r20
            r5.DYS(r2, r0)
            r10.D4r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IOA.A03(X.IOA):void");
    }

    public final boolean A08() {
        A06(false);
        if (TextUtils.getTrimmedLength(A07()) == 0) {
            C56015HrN hrN = this.A02;
            if (hrN != null) {
                View view = hrN.A00;
                if (view != null) {
                    view.setEnabled(false);
                }
                hrN.A08.setEnabled(false);
                return false;
            }
        } else {
            C56015HrN hrN2 = this.A02;
            if (hrN2 != null) {
                View view2 = hrN2.A00;
                if (view2 != null) {
                    if (view2.getVisibility() == 8) {
                        if (182.A06(0Tu.A05, hrN2.A0B, 36323032343522039L)) {
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            0qQ.A0C(layoutParams, AnonymousClass000.A00(6));
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.gravity = 80;
                            layoutParams2.bottomMargin = (int) C61380mr.A00(AnonymousClass7TE.A0S(view2), 10.0f);
                            view2.setLayoutParams(layoutParams2);
                        }
                        if (view2 instanceof IgSimpleImageView) {
                            ImageView imageView = (ImageView) view2;
                            Drawable drawable = imageView.getDrawable();
                            Context A0S = AnonymousClass7TE.A0S(imageView);
                            drawable.setTint(1QE.A0C(A0S, (1QG) null).getDefaultColor());
                            imageView.setBackgroundTintList(1QE.A0B(A0S, (1QG) null));
                        }
                        C294975nL A012 = C294975nL.A01(view2, 0);
                        A012.A0U(0.75f, 1.0f, -1.0f);
                        A012.A0V(0.75f, 1.0f, -1.0f);
                        A012.A0F(true).A0E(C71392co.A04(90.0d, 1.0d)).A0H();
                    }
                    view2.setVisibility(0);
                }
                C56015HrN hrN3 = this.A02;
                if (hrN3 != null) {
                    View view3 = hrN3.A00;
                    if (view3 != null) {
                        view3.setEnabled(true);
                    }
                    hrN3.A08.setEnabled(true);
                    return true;
                }
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        UserSession userSession = this.A0E;
        this.A02 = new C56015HrN(view, this.A0C, userSession, this);
        C57054IMu iMu = new C57054IMu(this);
        Context context = this.A0A;
        AnonymousClass4DU r4 = this.A0H;
        this.A01 = new C334387bB(context, new C334377bA(r4, userSession), iMu, userSession, this.A0J, new J6O(this, 16), JJQ.A00(this, 36));
        this.A04 = new C334447bH(new C57053IMt(this));
        C56015HrN hrN = this.A02;
        if (hrN != null) {
            hrN.A0D.setOnEditorActionListener(new IEI(this, 0));
            C56015HrN hrN2 = this.A02;
            if (hrN2 != null) {
                hrN2.A0D.setSingleLine(true);
                C56015HrN hrN3 = this.A02;
                if (hrN3 != null) {
                    C334497bM.A00(userSession, hrN3.A0D);
                    C56015HrN hrN4 = this.A02;
                    if (hrN4 != null) {
                        hrN4.A0D.setText(this.A0O);
                        C56015HrN hrN5 = this.A02;
                        if (hrN5 != null) {
                            hrN5.A0D.setDropDownWidth(0nA.A09(context));
                            C56015HrN hrN6 = this.A02;
                            if (hrN6 != null) {
                                hrN6.A0D.setDropDownVerticalOffset(-AnonymousClass3D4.A00(context));
                                C56015HrN hrN7 = this.A02;
                                if (hrN7 != null) {
                                    ComposerAutoCompleteTextView composerAutoCompleteTextView = hrN7.A0D;
                                    composerAutoCompleteTextView.A07 = true;
                                    composerAutoCompleteTextView.setDropDownBackgroundResource(2Yu.A0C(context));
                                    AnonymousClass4v0 A002 = AnonymousClass4v0.A00(userSession);
                                    C56015HrN hrN8 = this.A02;
                                    if (hrN8 != null) {
                                        hrN8.A0D.addTextChangedListener(A002);
                                        C56015HrN hrN9 = this.A02;
                                        if (hrN9 != null) {
                                            C56800ICx.A00(hrN9.A08, 14, this);
                                            C56015HrN hrN10 = this.A02;
                                            if (hrN10 != null) {
                                                GradientSpinnerAvatarView gradientSpinnerAvatarView = hrN10.A03;
                                                if (gradientSpinnerAvatarView != null) {
                                                    gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r4, DbT.A0j(userSession).Bh3());
                                                    gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                                                }
                                                C56015HrN hrN11 = this.A02;
                                                if (hrN11 != null) {
                                                    hrN11.A0D.A02 = 1;
                                                    if (this.A0I.A00()) {
                                                        C56015HrN hrN12 = this.A02;
                                                        if (hrN12 != null) {
                                                            hrN12.A0D.setOnFocusChangeListener(new ID5(this, 3));
                                                        }
                                                    }
                                                    C56015HrN hrN13 = this.A02;
                                                    if (hrN13 != null) {
                                                        hrN13.A0D.setDropDownAnchor(R.id.action_bar_wrapper);
                                                        C56015HrN hrN14 = this.A02;
                                                        if (hrN14 != null) {
                                                            hrN14.A06.addOnLayoutChangeListener(this.A0B);
                                                            A02(this);
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DBs(Drawable drawable, View view, C317486nL r4) {
        0qQ.A0B(r4, 0);
        A05(this, r4.A02);
    }

    public final void DYQ() {
    }

    public final void DYR(C247733gp r1, Map map) {
    }

    public final void DYS(C247733gp r1, boolean z) {
    }

    public final void DYT(C247733gp r1, String str) {
    }

    public final void DdQ() {
    }

    public final void DdR() {
    }

    public final void DdS() {
    }

    public final void DdT(HMF hmf, String str, List list, List list2, Set set) {
    }

    public final void E4L(C381459bn r1) {
    }

    public final String EFM(String str) {
        0qQ.A0B(str, 0);
        C334387bB r0 = this.A01;
        if (r0 != null) {
            return r0.EFM(str);
        }
        0qQ.A0F("mentionThumbnailSelectionDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final void onDestroyView() {
        this.A05 = null;
        C56015HrN hrN = this.A02;
        if (hrN != null) {
            hrN.A06.removeOnLayoutChangeListener(this.A0B);
            C56015HrN hrN2 = this.A02;
            if (hrN2 != null) {
                hrN2.A0D.setOnEditorActionListener((TextView.OnEditorActionListener) null);
                C56015HrN hrN3 = this.A02;
                if (hrN3 != null) {
                    hrN3.A0D.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    C56015HrN hrN4 = this.A02;
                    if (hrN4 != null) {
                        hrN4.A0D.setAdapter((ListAdapter) null);
                        C56015HrN hrN5 = this.A02;
                        if (hrN5 != null) {
                            hrN5.A08.setOnClickListener((View.OnClickListener) null);
                            C56015HrN hrN6 = this.A02;
                            if (hrN6 != null) {
                                IgImageView igImageView = hrN6.A02;
                                if (igImageView != null) {
                                    igImageView.setOnClickListener((View.OnClickListener) null);
                                }
                                AnonymousClass4v0 A002 = AnonymousClass4v0.A00(this.A0E);
                                C56015HrN hrN7 = this.A02;
                                if (hrN7 != null) {
                                    hrN7.A0D.removeTextChangedListener(A002);
                                    this.A0N.A01();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ComposerAutoCompleteTextView composerAutoCompleteTextView;
        Context context;
        String string;
        float f;
        0qQ.A0B(view, 0);
        this.A05 = view;
        if (this.A03 != null) {
            A04(this);
        }
        UserSession userSession = this.A0E;
        boolean CKD = AnonymousClass0BO.A00(userSession).CKD();
        C56015HrN hrN = this.A02;
        if (CKD) {
            if (hrN != null) {
                composerAutoCompleteTextView = hrN.A0D;
                context = this.A0A;
                string = AnonymousClass7TF.A0e(AnonymousClass7TF.A0A(context), DbU.A0n(userSession, AnonymousClass0t1.A01), 2131956355);
            }
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        if (hrN != null) {
            composerAutoCompleteTextView = hrN.A0D;
            context = this.A0A;
            string = AnonymousClass7TF.A0A(context).getString(2131956369);
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
        composerAutoCompleteTextView.setHint(string);
        C55991Hqx hqx = this.A0M;
        C56015HrN hrN2 = this.A02;
        if (hrN2 != null) {
            hqx.A00((C55801Hnh) hrN2.A0E.getValue(), this.A0H);
            A08();
            boolean z = this.A0Q;
            C56015HrN hrN3 = this.A02;
            if (hrN3 != null) {
                hrN3.A0D.requestFocus();
                C56015HrN hrN4 = this.A02;
                if (hrN4 != null) {
                    ComposerAutoCompleteTextView composerAutoCompleteTextView2 = hrN4.A0D;
                    composerAutoCompleteTextView2.setSelection(composerAutoCompleteTextView2.getText().length());
                    C56015HrN hrN5 = this.A02;
                    if (z) {
                        if (hrN5 != null) {
                            0nA.A0R(hrN5.A0D);
                        }
                    } else if (hrN5 != null) {
                        0nA.A0Q(hrN5.A0D);
                    }
                    C247733gp r3 = this.A0G;
                    if (r3 != null) {
                        C56015HrN hrN6 = this.A02;
                        if (hrN6 != null) {
                            hrN6.A00(AnonymousClass05K.A01, r3.A0G);
                            C56015HrN hrN7 = this.A02;
                            if (hrN7 != null) {
                                hrN7.A0C.A01.setVisibility(8);
                                User user = r3.A08;
                                if (user != null) {
                                    C56015HrN hrN8 = this.A02;
                                    if (hrN8 != null) {
                                        DismissableCallout dismissableCallout = hrN8.A0C;
                                        dismissableCallout.A02.setText(AnonymousClass7TF.A0e(AnonymousClass7TF.A0A(context), user.getUsername(), 2131972170));
                                        C71392co r0 = C315596kB.A02;
                                        C294975nL A012 = C294975nL.A01(dismissableCallout, 0);
                                        A012.A0G();
                                        A012.A0M(dismissableCallout.getAlpha(), 1.0f);
                                        if (dismissableCallout.getVisibility() == 0) {
                                            f = dismissableCallout.getY();
                                        } else {
                                            f = (float) dismissableCallout.A00;
                                        }
                                        A012.A0T(f, 0.0f);
                                        A012.A04 = 0;
                                        A012.A0F(true).A0H();
                                        String format = String.format(Locale.getDefault(), "@%s ", Arrays.copyOf(new Object[]{user.getUsername()}, 1));
                                        0qQ.A07(format);
                                        C56015HrN hrN9 = this.A02;
                                        if (hrN9 != null) {
                                            ComposerAutoCompleteTextView composerAutoCompleteTextView3 = hrN9.A0D;
                                            0lr r2 = this.A0F;
                                            composerAutoCompleteTextView3.removeTextChangedListener(r2);
                                            C56015HrN hrN10 = this.A02;
                                            if (hrN10 != null) {
                                                hrN10.A0D.setText("");
                                                C56015HrN hrN11 = this.A02;
                                                if (hrN11 != null) {
                                                    hrN11.A0D.append(format);
                                                    C56015HrN hrN12 = this.A02;
                                                    if (hrN12 != null) {
                                                        hrN12.A0D.addTextChangedListener(r2);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final Editable A00(IOA ioa, String str, int i, int i2) {
        String str2 = null;
        C56015HrN hrN = ioa.A02;
        if (i > i2) {
            if (hrN != null) {
                Editable text = hrN.A0D.getText();
                C56015HrN hrN2 = ioa.A02;
                if (hrN2 != null) {
                    int length = hrN2.A0D.length();
                    C56015HrN hrN3 = ioa.A02;
                    if (hrN3 != null) {
                        Editable replace = text.replace(length, hrN3.A0D.length(), str);
                        1Xj r0 = ioa.A03;
                        if (r0 != null) {
                            str2 = r0.getId();
                        }
                        0f9 AEf = 0wj.A01.AEf("Exception handling onEmojiSelect - start index is greater than end index", 817896325);
                        if (str2 != null) {
                            AEf.ABQ("Media Id", str2);
                        }
                        AEf.report();
                        return replace;
                    }
                }
            }
        } else if (hrN != null) {
            return hrN.A0D.getText().replace(i, i2, str);
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(IOA ioa) {
        C56015HrN hrN = ioa.A02;
        if (hrN != null) {
            int height = ioa.A00 - hrN.A06.getHeight();
            if (height > 0) {
                C56015HrN hrN2 = ioa.A02;
                if (hrN2 != null) {
                    hrN2.A0D.setDropDownHeight(height);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(IOA ioa) {
        1Xj r4 = ioa.A03;
        if (r4 != null && !ioa.A06) {
            C56015HrN hrN = ioa.A02;
            if (hrN == null) {
                0qQ.A0F("viewHolder");
                throw AnonymousClass00P.createAndThrow();
            }
            C267154b3.A01(hrN.A07, ioa.A0E, r4, ioa.A0H, false);
            ioa.A06 = true;
        }
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.07Z, X.4DH] */
    public static final void A04(IOA ioa) {
        View view;
        ViewStub A0F2;
        AnonymousClass7a4 r0;
        IOA ioa2 = ioa;
        1Xj r15 = ioa2.A03;
        if (r15 != null) {
            C247733gp r6 = ioa2.A0G;
            if (r6 != null) {
                r6.A02(r15);
            }
            String str = null;
            if (r6 == null) {
                C56015HrN hrN = ioa2.A02;
                if (hrN != null) {
                    Integer num = AnonymousClass05K.A00;
                    String A2n = r15.A2n();
                    if (A2n != null) {
                        hrN.A00(num, A2n);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                0qQ.A0F("viewHolder");
                throw AnonymousClass00P.createAndThrow();
            }
            UserSession userSession = ioa2.A0E;
            if (2R8.A02(userSession, r15) && ioa2.A05 != null) {
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36323874157112907L) || (0qQ.A0K(ioa2.A0P, "activity_feed") && 182.A06(r2, userSession, 36323874157178444L))) {
                    View view2 = ioa2.A05;
                    if (view2 == null || (A0F2 = DbS.A0F(view2, R.id.layout_comment_composer_quick_replies_stub)) == null) {
                        view = null;
                    } else {
                        view = A0F2.inflate();
                        AnonymousClass7TF.A16(view);
                    }
                    LithoView lithoView = new LithoView(ioa2.A0A);
                    0sP j6o = new J6O(ioa2, 17);
                    String str2 = r6.A0G;
                    String A2n2 = r15.A2n();
                    User A11 = C51966G9m.A11(r15);
                    if (A11 != null) {
                        str = A11.getId();
                    }
                    lithoView.setComponent(new C53763Gts(userSession, str2, A2n2, str, j6o));
                    0qQ.A0C(view, C273654mx.A00(25));
                    ((ViewGroup) view).addView(lithoView);
                }
            }
            C56015HrN hrN2 = ioa2.A02;
            if (hrN2 != null) {
                ComposerAutoCompleteTextView composerAutoCompleteTextView = hrN2.A0D;
                Context context = ioa2.A0A;
                UserSession userSession2 = ioa2.A0E;
                composerAutoCompleteTextView.setAdapter(C336207eF.A00(context, ioa2, ioa2.A0H, new C228602lw(context, AnonymousClass07i.A00(ioa2.A0C), (Integer) null), userSession2, (C336397eY) null, r15, (C336187eD) null, (Runnable) null, AnonymousClass000.A00(4625), AnonymousClass3VO.A04(r15), true, true, false, false));
                if (AnonymousClass4CM.A00(userSession2).A02(r15)) {
                    C333737a2 A002 = C333727a1.A00(userSession2);
                    String id = r15.getId();
                    if (id != null) {
                        AnonymousClass9JD r02 = (AnonymousClass9JD) A002.A00.get(id);
                        if (r02 != null && (r0 = (AnonymousClass7a4) r02.A00) != null) {
                            ioa2.DfK(r0);
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                return;
            }
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A05(IOA ioa, String str) {
        C56015HrN hrN = ioa.A02;
        if (hrN != null) {
            int selectionStart = hrN.A0D.getSelectionStart();
            if (selectionStart < 0) {
                selectionStart = 0;
            }
            C56015HrN hrN2 = ioa.A02;
            if (hrN2 != null) {
                int selectionEnd = hrN2.A0D.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                A00(ioa, str, selectionStart, selectionEnd);
                return;
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A06(boolean z) {
        1Xj r1;
        if (this.A0I.A00() && (r1 = this.A03) != null) {
            String A2n = r1.A1e(this.A0E).A2n();
            if (A2n != null) {
                AK2((C381459bn) null, A2n, z);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final CharSequence A07() {
        CharSequence charSequence;
        C56015HrN hrN = this.A02;
        if (hrN == null) {
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        ComposerAutoCompleteTextView composerAutoCompleteTextView = hrN.A0D;
        if (composerAutoCompleteTextView == null || (charSequence = composerAutoCompleteTextView.getText()) == null) {
            charSequence = "";
        }
        return charSequence;
    }

    public final void AK2(C381459bn r2, String str, boolean z) {
        C334387bB r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("mentionThumbnailSelectionDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.AK2(r2, str, z);
        }
    }

    public final AnonymousClass7a4 Bwp() {
        C334387bB r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        0qQ.A0F("mentionThumbnailSelectionDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D4r() {
        C334387bB r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("mentionThumbnailSelectionDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.D4r();
        }
    }

    public final void DfK(AnonymousClass7a4 r2) {
        C334387bB r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("mentionThumbnailSelectionDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A00 = r2;
        }
    }

    public final void DrU(C381459bn r2) {
        if (this.A0I.A00()) {
            C334387bB r0 = this.A01;
            if (r0 == null) {
                0qQ.A0F("mentionThumbnailSelectionDelegate");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.DrU(r2);
            }
        }
    }

    public final void EuB(1Xj r2) {
        C334387bB r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("mentionThumbnailSelectionDelegate");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.EuB(r2);
        }
    }

    public final void onPause() {
        C56015HrN hrN = this.A02;
        String str = "viewHolder";
        if (hrN != null) {
            hrN.A0D.removeTextChangedListener(this.A0F);
            C56015HrN hrN2 = this.A02;
            if (hrN2 != null) {
                ComposerAutoCompleteTextView composerAutoCompleteTextView = hrN2.A0D;
                TextWatcher textWatcher = this.A04;
                if (textWatcher == null) {
                    str = "carouselTagDeletionTextWatcher";
                } else {
                    composerAutoCompleteTextView.removeTextChangedListener(textWatcher);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        C56015HrN hrN = this.A02;
        String str = "viewHolder";
        if (hrN != null) {
            hrN.A0D.addTextChangedListener(this.A0F);
            if (this.A0I.A00()) {
                C56015HrN hrN2 = this.A02;
                if (hrN2 != null) {
                    ComposerAutoCompleteTextView composerAutoCompleteTextView = hrN2.A0D;
                    TextWatcher textWatcher = this.A04;
                    if (textWatcher == null) {
                        str = "carouselTagDeletionTextWatcher";
                    } else {
                        composerAutoCompleteTextView.addTextChangedListener(textWatcher);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
