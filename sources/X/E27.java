package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E27 extends AnonymousClass4DH {
    public static final CallerContext A08 = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "ReelsShareToFbUpsellFragment";
    public EWO A00;
    public IgLinearLayout A01;
    public IgdsBottomButtonLayout A02;
    public IgdsHeadline A03;
    public FBQ A04;
    public boolean A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r2 != 5) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r2 == 5) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014f, code lost:
        if (r5 != 5) goto L_0x0151;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C60951Ju9 r11, X.E27 r12, java.lang.Integer r13, boolean r14, boolean r15) {
        /*
            r7 = 4
            r1 = 4
            r2 = 0
            java.lang.String r10 = "headlineView"
            r4 = 0
            com.instagram.igds.components.headline.IgdsHeadline r0 = r12.A03
            if (r11 == 0) goto L_0x01a1
            if (r0 == 0) goto L_0x01b6
            r0.setVisibility(r2)
        L_0x000f:
            com.instagram.igds.components.headline.IgdsHeadline r6 = r12.A03
            if (r6 == 0) goto L_0x01b6
            r3 = 1
            r6.A02 = r3
            java.lang.String r9 = "designVariant"
            if (r15 == 0) goto L_0x018d
            X.EWO r0 = r12.A00
            if (r0 == 0) goto L_0x01ba
            int r2 = r0.ordinal()
            r0 = 3
            if (r2 == r0) goto L_0x0188
            if (r2 == r7) goto L_0x0183
            r0 = 5
            r5 = 2131971884(0x7f134f2c, float:1.958076E38)
            if (r2 == r0) goto L_0x0030
        L_0x002d:
            r5 = 2131971830(0x7f134ef6, float:1.958065E38)
        L_0x0030:
            r6.setHeadline((int) r5)
            java.lang.String r8 = ""
            if (r11 == 0) goto L_0x01ac
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = r11.A01
            if (r0 == 0) goto L_0x01ac
            int r2 = r0.ordinal()
            if (r2 == r3) goto L_0x0138
            r0 = 2
            if (r2 == r0) goto L_0x0118
            r0 = 3
            if (r2 == r0) goto L_0x00f8
            if (r2 == r7) goto L_0x00d8
            r0 = 5
            if (r2 != r0) goto L_0x01ac
            android.content.res.Resources r5 = X.DbV.A05(r12)
            r2 = 2131971863(0x7f134f17, float:1.9580717E38)
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0058
            r8 = r0
        L_0x0058:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            android.text.Spanned r8 = X.0bC.A00(r5, r0, r2)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            X.0qQ.A07(r2)
            r0 = 2131971871(0x7f134f1f, float:1.9580734E38)
        L_0x006a:
            android.text.SpannableStringBuilder r7 = A00(r2, r12, r0)
            r0 = 2131971873(0x7f134f21, float:1.9580738E38)
        L_0x0071:
            java.lang.String r6 = X.DbU.A0m(r12, r0)
            com.instagram.igds.components.headline.IgdsHeadline r5 = r12.A03
            if (r5 == 0) goto L_0x01b6
            android.content.Context r2 = r12.requireContext()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.FGX r3 = new X.FGX
            r3.<init>((android.content.Context) r2, (java.lang.Boolean) r0, (int) r1)
            if (r15 == 0) goto L_0x00d4
            X.EWO r0 = r12.A00
            if (r0 == 0) goto L_0x01ba
            int r2 = r0.ordinal()
            r0 = 3
            if (r2 == r0) goto L_0x00d0
            if (r2 == r1) goto L_0x009b
            r1 = 5
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
            if (r2 != r1) goto L_0x009e
        L_0x009b:
            r0 = 2131238690(0x7f081f22, float:1.8093666E38)
        L_0x009e:
            r3.A05(r4, r8, r0)
            r0 = 2131238943(0x7f08201f, float:1.8094179E38)
            r3.A05(r4, r7, r0)
            r0 = 2131238703(0x7f081f2f, float:1.8093692E38)
            r3.A05(r4, r6, r0)
            java.util.List r0 = r3.A04()
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00b9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r1 = r2.next()
            com.instagram.igds.components.bulletcell.IgdsBulletCell r1 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r1
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r4, r0)
            r3.add(r1)
            goto L_0x00b9
        L_0x00d0:
            r0 = 2131238555(0x7f081e9b, float:1.8093392E38)
            goto L_0x009e
        L_0x00d4:
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
            goto L_0x009e
        L_0x00d8:
            android.content.res.Resources r5 = X.DbV.A05(r12)
            r2 = 2131971862(0x7f134f16, float:1.9580715E38)
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x00e4
            r8 = r0
        L_0x00e4:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            android.text.Spanned r8 = X.0bC.A00(r5, r0, r2)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            X.0qQ.A07(r2)
            r0 = 2131971869(0x7f134f1d, float:1.958073E38)
            goto L_0x006a
        L_0x00f8:
            android.content.res.Resources r5 = X.DbV.A05(r12)
            r2 = 2131971862(0x7f134f16, float:1.9580715E38)
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0104
            r8 = r0
        L_0x0104:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            android.text.Spanned r8 = X.0bC.A00(r5, r0, r2)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            X.0qQ.A07(r2)
            r0 = 2131971868(0x7f134f1c, float:1.9580727E38)
            goto L_0x006a
        L_0x0118:
            android.content.res.Resources r5 = X.DbV.A05(r12)
            r2 = 2131971862(0x7f134f16, float:1.9580715E38)
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0124
            r8 = r0
        L_0x0124:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            android.text.Spanned r8 = X.0bC.A00(r5, r0, r2)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            X.0qQ.A07(r2)
            r0 = 2131971870(0x7f134f1e, float:1.9580732E38)
            goto L_0x006a
        L_0x0138:
            android.content.res.Resources r6 = X.DbV.A05(r12)
            if (r15 == 0) goto L_0x0151
            X.EWO r0 = r12.A00
            if (r0 == 0) goto L_0x01ba
            int r5 = r0.ordinal()
            r0 = 3
            if (r5 == r0) goto L_0x017f
            if (r5 == r7) goto L_0x017b
            r0 = 5
            r2 = 2131971866(0x7f134f1a, float:1.9580723E38)
            if (r5 == r0) goto L_0x0154
        L_0x0151:
            r2 = 2131971864(0x7f134f18, float:1.958072E38)
        L_0x0154:
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L_0x0159
            r8 = r0
        L_0x0159:
            java.lang.Object[] r0 = new java.lang.Object[]{r8}
            android.text.Spanned r8 = X.0bC.A00(r6, r0, r2)
            android.content.res.Resources r2 = X.DbV.A05(r12)
            X.0qQ.A07(r2)
            r0 = 2131971872(0x7f134f20, float:1.9580736E38)
            android.text.SpannableStringBuilder r7 = A00(r2, r12, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r0 = 2131971875(0x7f134f23, float:1.9580742E38)
            if (r13 != r2) goto L_0x0071
            r0 = 2131971877(0x7f134f25, float:1.9580746E38)
            goto L_0x0071
        L_0x017b:
            r2 = 2131971865(0x7f134f19, float:1.9580721E38)
            goto L_0x0154
        L_0x017f:
            r2 = 2131971867(0x7f134f1b, float:1.9580725E38)
            goto L_0x0154
        L_0x0183:
            r5 = 2131971883(0x7f134f2b, float:1.9580758E38)
            goto L_0x0030
        L_0x0188:
            r5 = 2131971885(0x7f134f2d, float:1.9580762E38)
            goto L_0x0030
        L_0x018d:
            if (r14 != 0) goto L_0x002d
            if (r11 == 0) goto L_0x019f
            com.instagram.share.facebook.model.FBReelsAudienceType r2 = r11.A01
        L_0x0193:
            com.instagram.share.facebook.model.FBReelsAudienceType r0 = com.instagram.share.facebook.model.FBReelsAudienceType.A08
            r5 = 2131971881(0x7f134f29, float:1.9580754E38)
            if (r2 != r0) goto L_0x0030
            r5 = 2131971882(0x7f134f2a, float:1.9580756E38)
            goto L_0x0030
        L_0x019f:
            r2 = 0
            goto L_0x0193
        L_0x01a1:
            if (r0 == 0) goto L_0x01b6
            r0.setVisibility(r7)
            goto L_0x000f
        L_0x01a8:
            r5.setBulletList(r3)
            return
        L_0x01ac:
            com.instagram.igds.components.headline.IgdsHeadline r1 = r12.A03
            if (r1 == 0) goto L_0x01b6
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x01b6:
            X.0qQ.A0F(r10)
            goto L_0x01bd
        L_0x01ba:
            X.0qQ.A0F(r9)
        L_0x01bd:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E27.A02(X.Ju9, X.E27, java.lang.Integer, boolean, boolean):void");
    }

    public final String getModuleName() {
        return "reels_share_to_fb_upsell_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = DbZ.A0U(requireView(), R.id.headline);
        this.A02 = DbT.A0c(requireView(), R.id.bottom_buttons);
        this.A01 = (IgLinearLayout) requireView().requireViewById(R.id.custom_button_container);
        07U r9 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C59845JaL(viewLifecycleOwner, r9, this, (AnonymousClass4D7) null, 8), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass0eM r3 = this.A07;
        2D6 A002 = 2D5.A00(AnonymousClass7TE.A0l(r3));
        FBQ fbq = this.A04;
        String str = "params";
        if (fbq != null) {
            if (!fbq.A01()) {
                A002.A01(A002.A04.getInt("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT", 0) + 1);
                A002.A02(System.currentTimeMillis());
            }
            27r A012 = 27p.A01(AnonymousClass7TE.A0l(r3));
            FBQ fbq2 = this.A04;
            if (fbq2 != null) {
                C59793JYm jYm = fbq2.A03;
                Boolean A0v = AnonymousClass7TE.A0v();
                String str2 = fbq2.A06;
                EWO ewo = this.A00;
                if (ewo == null) {
                    str = "designVariant";
                } else {
                    String str3 = ewo.A01;
                    C697329a r2 = A012.A0G;
                    0qQ.A0B(str3, 3);
                    0Aj A0e = AnonymousClass7TE.A0e(r2.A01, AnonymousClass000.A00(3291));
                    if (A0e.isSampled()) {
                        A0e.A8M(AnonymousClass80P.SHARE_TO_FB_PRIMER, "tool_type");
                        A0e.AAJ("legacy_falco_event_name", "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_PRIMER_IMPRESSION");
                        AnonymousClass283 r22 = r2.A04;
                        String str4 = r22.A0L;
                        if (str4 == null) {
                            str4 = "";
                        }
                        A0e.AAJ("camera_session_id", str4);
                        DbS.A1F(r22.A09, A0e);
                        Dbc.A0V(A0e);
                        Dbb.A1B(jYm, A0e);
                        if (str2 == null) {
                            str2 = 27x.A08.getModuleName();
                        }
                        DbS.A1K(A0e, str2);
                        A0e.A7p("is_crosspost", A0v);
                        DbY.A1C(A0e);
                        Dba.A19(A0e, str3);
                    }
                    C368278sM r23 = C368278sM.VIEW;
                    UserSession A0l = AnonymousClass7TE.A0l(r3);
                    FBQ fbq3 = this.A04;
                    if (fbq3 != null) {
                        A01(r23, A0l, this, fbq3, (String) null);
                        UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                        FBQ fbq4 = this.A04;
                        if (fbq4 != null) {
                            C367998ru.A01(fbq4.A01, fbq4.A02, A0l2);
                            UserSession A0l3 = AnonymousClass7TE.A0l(r3);
                            FBQ fbq5 = this.A04;
                            if (fbq5 != null) {
                                C49887FBn A013 = C49797F7i.A01(A0l3, fbq5.A00);
                                if (A013 != null) {
                                    A013.A00();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C368278sM r8, UserSession userSession, E27 e27, FBQ fbq, String str) {
        long j;
        AnonymousClass819 r4 = fbq.A02;
        if (r4.ordinal() == 4) {
            j = (long) DbT.A00(2D5.A00(userSession).A04, "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT");
        } else {
            j = 0;
        }
        boolean A1Z = Dbb.A1Z(C363388je.A00(userSession), __redex_internal_original_name);
        AnonymousClass818 r3 = fbq.A01;
        0bb r2 = new 0bb();
        r2.A06("waterfall_id", fbq.A07);
        r2.A09(Boolean.valueOf(A1Z));
        r2.A05(AnonymousClass000.A00(161), Long.valueOf(j));
        r2.A06("ig_media_id", e27.A06);
        r2.A06(C66579MXk.A00(171), str);
        C368288sN.A00(r3, r8, r4, r2, userSession);
    }

    public static final void A03(E27 e27) {
        String str;
        AnonymousClass0eM r4 = e27.A07;
        if (C367288qV.A04((BBV) null, AnonymousClass7TE.A0l(r4))) {
            27r A012 = 27p.A01(AnonymousClass7TE.A0l(r4));
            FBQ fbq = e27.A04;
            str = "params";
            if (fbq != null) {
                C59793JYm jYm = fbq.A03;
                String str2 = fbq.A06;
                EWO ewo = e27.A00;
                if (ewo == null) {
                    str = "designVariant";
                } else {
                    A012.A19(jYm, true, str2, ewo.A01, true);
                    C368278sM r2 = C368278sM.ACCEPT;
                    UserSession A0l = AnonymousClass7TE.A0l(r4);
                    FBQ fbq2 = e27.A04;
                    if (fbq2 != null) {
                        A01(r2, A0l, e27, fbq2, (String) null);
                        C367288qV.A01.A0C(AnonymousClass7TE.A0l(r4), "UPSELL", true, true);
                        Intent putExtra = DbS.A09().putExtra("ARG_MEDIA_ID", e27.A06);
                        0qQ.A07(putExtra);
                        e27.requireActivity().setResult(1, putExtra);
                        DbZ.A15(e27);
                        return;
                    }
                }
            }
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = e27.A02;
            if (igdsBottomButtonLayout == null) {
                str = "bottomButtons";
            } else {
                igdsBottomButtonLayout.setVisibility(8);
                IgLinearLayout igLinearLayout = e27.A01;
                if (igLinearLayout == null) {
                    str = "customButtonContainer";
                } else {
                    igLinearLayout.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(E27 e27) {
        C368278sM r3;
        AnonymousClass0eM r1 = e27.A07;
        27r A012 = 27p.A01(AnonymousClass7TE.A0l(r1));
        FBQ fbq = e27.A04;
        String str = "params";
        if (fbq != null) {
            C59793JYm jYm = fbq.A03;
            Boolean A0v = AnonymousClass7TE.A0v();
            String str2 = fbq.A06;
            EWO ewo = e27.A00;
            if (ewo == null) {
                str = "designVariant";
            } else {
                A012.A19(jYm, A0v, str2, ewo.A01, false);
                FBQ fbq2 = e27.A04;
                if (fbq2 != null) {
                    if (fbq2.A01()) {
                        r3 = C368278sM.OTHER;
                    } else {
                        r3 = C368278sM.DECLINE;
                    }
                    UserSession A0l = AnonymousClass7TE.A0l(r1);
                    FBQ fbq3 = e27.A04;
                    if (fbq3 != null) {
                        A01(r3, A0l, e27, fbq3, (String) null);
                        Intent putExtra = DbS.A09().putExtra("ARG_MEDIA_ID", e27.A06);
                        0qQ.A07(putExtra);
                        e27.requireActivity().setResult(2, putExtra);
                        DbT.A1J(e27);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A05(E27 e27) {
        IgLinearLayout igLinearLayout = e27.A01;
        if (igLinearLayout != null) {
            DbX.A1B(igLinearLayout, R.id.footer_above_action);
            IgLinearLayout igLinearLayout2 = e27.A01;
            if (igLinearLayout2 != null) {
                TextView A0R = AnonymousClass7TG.A0R(igLinearLayout2, R.id.bb_footer);
                Resources A052 = DbV.A05(e27);
                0qQ.A07(A052);
                A0R.setText(A00(A052, e27, 2131971879));
                A0R.setVisibility(0);
                return;
            }
        }
        0qQ.A0F("customButtonContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(E27 e27, boolean z) {
        String str;
        int i;
        int i2;
        IgdsBottomButtonLayout igdsBottomButtonLayout = e27.A02;
        if (igdsBottomButtonLayout == null) {
            str = "bottomButtons";
        } else {
            igdsBottomButtonLayout.setVisibility(8);
            IgLinearLayout igLinearLayout = e27.A01;
            str = "customButtonContainer";
            if (igLinearLayout != null) {
                igLinearLayout.setVisibility(0);
                IgLinearLayout igLinearLayout2 = e27.A01;
                if (igLinearLayout2 != null) {
                    DbT.A1F(igLinearLayout2, R.id.bb_primary_action_container, 8);
                    IgLinearLayout igLinearLayout3 = e27.A01;
                    if (igLinearLayout3 != null) {
                        TextView A0R = AnonymousClass7TG.A0R(igLinearLayout3, R.id.bb_primary_action_above);
                        A0R.setVisibility(0);
                        IgLinearLayout igLinearLayout4 = e27.A01;
                        if (igLinearLayout4 != null) {
                            View requireViewById = igLinearLayout4.requireViewById(R.id.bb_primary_action_container_above);
                            0qQ.A07(requireViewById);
                            requireViewById.setVisibility(0);
                            IgLinearLayout igLinearLayout5 = e27.A01;
                            if (igLinearLayout5 != null) {
                                DbT.A1F(igLinearLayout5, R.id.bb_secondary_action, 8);
                                IgLinearLayout igLinearLayout6 = e27.A01;
                                if (igLinearLayout6 != null) {
                                    TextView A0R2 = AnonymousClass7TG.A0R(igLinearLayout6, R.id.bb_secondary_action_grey_below);
                                    A0R2.setVisibility(0);
                                    FP4.A01(requireViewById, 15, e27);
                                    FP4.A01(A0R2, 16, e27);
                                    if (z) {
                                        i = 2131971887;
                                    } else {
                                        FBQ fbq = e27.A04;
                                        if (fbq == null) {
                                            str = "params";
                                        } else if (fbq.A01()) {
                                            DbU.A1G(A0R, e27, 2131971890);
                                            i2 = 2131971889;
                                            DbU.A1G(A0R2, e27, i2);
                                            return;
                                        } else {
                                            i = 2131952881;
                                        }
                                    }
                                    DbU.A1G(A0R, e27, i);
                                    i2 = 2131968513;
                                    DbU.A1G(A0R2, e27, i2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public static final SpannableStringBuilder A00(Resources resources, E27 e27, int i) {
        String A0m = DbU.A0m(e27, 2131971831);
        SpannableStringBuilder A0B = Dbb.A0B(resources, A0m, i);
        AnonymousClass7AV.A05(A0B, new C46679Dj8(e27, 13), A0m);
        return A0B;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-529128341);
        E27.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r6 = this.A07;
        0lg A0X = DbT.A0X(r6);
        0Tu r5 = 0Tu.A05;
        this.A05 = 182.A06(r5, A0X, 36317629275182492L);
        this.A04 = new FBQ(AnonymousClass818.valueOf(C320236s2.A01(requireArguments, "ARG_UPSELL_ENTRY_POINT")), AnonymousClass819.valueOf(C320236s2.A01(requireArguments, "ARG_UPSELL_VARIANT")), C59793JYm.valueOf(C320236s2.A01(requireArguments, "ARG_MEDIA_SOURCE_TYPE")), requireArguments.getString("ARG_WATERFALL_ID"), requireArguments.getString("ARG_MODULE_NAME"), (String) null, (String) null, requireArguments.getInt("ARG_NUX_ATTEMPT_QPL_INSTANCE_KEY"));
        0lg A0R = DbY.A0R(r6);
        long j = 36596583105825321L;
        if (182.A01(r5, A0R, 36596583105825321L) == EWO.UPSELL_DESIGN_VARIANT_0.A00) {
            j = 36599104251956662L;
        }
        EWO ewo = (EWO) EWO.A02.get(Long.valueOf(182.A01(r5, A0R, j)));
        if (ewo == null) {
            ewo = EWO.UPSELL_DESIGN_VARIANT_1;
        }
        this.A00 = ewo;
        this.A06 = requireArguments.getString("ARG_MEDIA_ID");
        AnonymousClass0fD.A09(1873880389, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(910060484);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_share_to_fb_upsell_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(182780355, A022);
        return inflate;
    }
}
