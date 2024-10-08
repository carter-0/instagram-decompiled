package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.UZb  reason: case insensitive filesystem */
public final class C15273UZb extends AnonymousClass4DH implements AnonymousClass4DS, X6O, X3L, B1D {
    public static final String __redex_internal_original_name = "PromoteWebsiteFragment";
    public XIGIGBoostCallToAction A00;
    public WGU A01;
    public C18654Vw9 A02;
    public C18643Vvl A03;
    public PromoteData A04;
    public UserSession A05;
    public String A06;
    public boolean A07;
    public C18784W1k A08;
    public PromoteState A09;
    public final 1wn A0A = new C19221WQb(this, 16);

    public final void DFD() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r4.A00 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 2131970829(0x7f134b0d, float:1.957862E38)
            X.C13992Tns.A0r(r5, r0)
            com.instagram.common.session.UserSession r3 = r4.A05
            if (r3 == 0) goto L_0x0048
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321348716340522(0x810a130000252a, double:3.033105410321282E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0042
            X.Vvl r3 = X.C18643Vvl.A00(r4, r5)
            r4.A03 = r3
            java.lang.Integer r2 = X.AnonymousClass05K.A1F
            r1 = 13
            X.WB8 r0 = new X.WB8
            r0.<init>((java.lang.Object) r4, (int) r1)
            r3.A01(r0, r2)
            X.Vvl r2 = r4.A03
            if (r2 == 0) goto L_0x0043
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x003e
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x003e
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r2.A02(r0)
        L_0x0042:
            return
        L_0x0043:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0048:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15273UZb.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "promote_website";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r7 = 0
            r6 = r19
            X.0qQ.A0B(r6, r7)
            r5 = r18
            r0 = r20
            super.onViewCreated(r6, r0)
            com.instagram.business.promote.model.PromoteData r1 = r5.A04
            java.lang.String r11 = "promoteData"
            if (r1 == 0) goto L_0x0198
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r1.A0b
            r5.A00 = r0
            java.lang.String r0 = r1.A1I
            r5.A06 = r0
            X.UzE r4 = X.C16678UzE.DESTINATION_WEBSITE
            X.Vw9 r0 = new X.Vw9
            r0.<init>(r6, r4)
            r5.A02 = r0
            r0.A01()
            X.Vw9 r2 = r5.A02
            if (r2 == 0) goto L_0x0109
            android.content.Context r1 = r5.requireContext()
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            java.lang.String r0 = r1.getString(r0)
            X.C18165Vmf.A01(r5, r2, r0)
            X.Vw9 r0 = r5.A02
            r8 = 0
            if (r0 == 0) goto L_0x0041
            r0.A04(r7)
        L_0x0041:
            com.instagram.common.session.UserSession r3 = r5.A05
            if (r3 == 0) goto L_0x0101
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321348716340522(0x810a130000252a, double:3.033105410321282E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            X.Vw9 r0 = r5.A02
            if (r1 == 0) goto L_0x00f7
            if (r0 == 0) goto L_0x005d
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A02
            if (r0 == 0) goto L_0x005d
        L_0x005a:
            r0.setVisibility(r8)
        L_0x005d:
            r0 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r6, r0)
            r0 = 2131970823(0x7f134b07, float:1.9578608E38)
            r1.setText(r0)
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r6, r0)
            r0 = 2131442936(0x7f0b3cf8, float:1.8507926E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r6, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r3 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r3
            r2 = 8
            r1.setVisibility(r2)
            r0 = 2131443981(0x7f0b410d, float:1.8510045E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r6, r0)
            com.instagram.igds.components.form.IgFormField r1 = (com.instagram.igds.components.form.IgFormField) r1
            java.lang.String r0 = r5.A06
            if (r0 == 0) goto L_0x0092
            r1.setText(r0)
            r1.requestFocus()
        L_0x0092:
            X.WXu r0 = new X.WXu
            r0.<init>(r5, r7)
            r1.setRuleChecker(r0)
            r1.requestFocus()
            r0 = 2131443982(0x7f0b410e, float:1.8510047E38)
            android.view.ViewGroup r7 = X.DbX.A0I(r6, r0)
            com.instagram.api.schemas.XIGIGBoostCallToAction r12 = com.instagram.api.schemas.XIGIGBoostCallToAction.LEARN_MORE
            com.instagram.api.schemas.XIGIGBoostCallToAction r13 = com.instagram.api.schemas.XIGIGBoostCallToAction.SHOP_NOW
            com.instagram.api.schemas.XIGIGBoostCallToAction r14 = com.instagram.api.schemas.XIGIGBoostCallToAction.WATCH_MORE
            com.instagram.api.schemas.XIGIGBoostCallToAction r15 = com.instagram.api.schemas.XIGIGBoostCallToAction.CONTACT_US
            com.instagram.api.schemas.XIGIGBoostCallToAction r16 = com.instagram.api.schemas.XIGIGBoostCallToAction.BOOK_TRAVEL
            com.instagram.api.schemas.XIGIGBoostCallToAction r17 = com.instagram.api.schemas.XIGIGBoostCallToAction.SIGN_UP
            com.instagram.api.schemas.XIGIGBoostCallToAction[] r0 = new com.instagram.api.schemas.XIGIGBoostCallToAction[]{r12, r13, r14, r15, r16, r17}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x00bc:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x010e
            java.lang.Object r9 = r10.next()
            com.instagram.api.schemas.XIGIGBoostCallToAction r9 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r9
            android.content.Context r0 = r5.requireContext()
            X.U5O r8 = new X.U5O
            r8.<init>(r0)
            r8.setTag(r9)
            android.content.Context r1 = r5.requireContext()
            int r0 = X.C18677Vwa.A00(r9)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r8.setPrimaryText((java.lang.CharSequence) r0)
            r1 = 1
            X.Weo r0 = new X.Weo
            r0.<init>(r1, r6, r9, r5)
            r8.A9W(r0)
            r7.addView(r8)
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r5.A00
            if (r0 != r9) goto L_0x00bc
            r8.setChecked(r1)
            goto L_0x00bc
        L_0x00f7:
            if (r0 == 0) goto L_0x005d
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A02
            if (r0 == 0) goto L_0x005d
            r8 = 8
            goto L_0x005a
        L_0x0101:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0109:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x010e:
            com.instagram.business.promote.model.PromoteData r0 = r5.A04
            if (r0 == 0) goto L_0x0198
            boolean r0 = X.W3E.A04(r0)
            if (r0 == 0) goto L_0x01a0
            r0 = 2131442937(0x7f0b3cf9, float:1.8507928E38)
            android.widget.TextView r9 = X.AnonymousClass7TG.A0R(r6, r0)
            r0 = 2131970451(0x7f134993, float:1.9577853E38)
            r9.setText(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r9.setTypeface(r0)
            com.instagram.business.promote.model.PromoteData r0 = r5.A04
            if (r0 == 0) goto L_0x0198
            com.instagram.common.session.UserSession r0 = r0.A0y
            X.0qQ.A06(r0)
            X.1Av r8 = X.1Au.A00(r0)
            X.0s0 r7 = r8.A40
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 113(0x71, float:1.58E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r8, r7, r1, r0)
            if (r0 != 0) goto L_0x014b
            X.Woi r0 = new X.Woi
            r0.<init>(r9, r5, r8)
            r9.post(r0)
        L_0x014b:
            android.content.Context r1 = r5.requireContext()
            r0 = 2131970450(0x7f134992, float:1.9577851E38)
            java.lang.String r8 = r1.getString(r0)
            java.lang.String r7 = "\n"
            r1 = 64
            com.instagram.common.session.UserSession r0 = r5.A05
            if (r0 == 0) goto L_0x01a8
            X.0t1 r0 = X.0eE.A00(r0)
            com.instagram.user.model.User r0 = r0.A00()
            java.lang.String r0 = r0.getUsername()
            java.lang.String r0 = X.002.A0D(r0, r1)
            java.lang.String r1 = X.002.A0g(r8, r7, r0)
            X.0qQ.A07(r1)
            r0 = 2131442935(0x7f0b3cf7, float:1.8507924E38)
            X.DbX.A1E(r6, r1, r0)
            com.instagram.business.promote.model.PromoteData r0 = r5.A04
            if (r0 == 0) goto L_0x0198
            java.util.List r0 = r0.A1x
            X.0qQ.A06(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r3.setChecked(r0)
            X.WYN r0 = new X.WYN
            r0.<init>(r5, r2)
            r3.A07 = r0
        L_0x0192:
            X.WGU r0 = r5.A01
            if (r0 != 0) goto L_0x01a4
            java.lang.String r11 = "promoteLogger"
        L_0x0198:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01a0:
            r3.setVisibility(r2)
            goto L_0x0192
        L_0x01a4:
            X.C13988Tno.A1J(r0, r4)
            return
        L_0x01a8:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15273UZb.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r4.A00 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r4.A00 == null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C15273UZb r4) {
        /*
            com.instagram.common.session.UserSession r3 = r4.A05
            if (r3 == 0) goto L_0x003d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321348716340522(0x810a130000252a, double:3.033105410321282E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0027
            X.Vw9 r2 = r4.A02
            if (r2 == 0) goto L_0x0026
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x0022
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0022
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r2.A04(r0)
        L_0x0026:
            return
        L_0x0027:
            X.Vvl r2 = r4.A03
            if (r2 == 0) goto L_0x0026
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x0038
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0038
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            r2.A02(r0)
            return
        L_0x003d:
            X.DbS.A14()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15273UZb.A00(X.UZb):void");
    }

    public static final void A01(C15273UZb uZb) {
        PromoteState promoteState = uZb.A09;
        if (promoteState != null) {
            XIGIGBoostDestination xIGIGBoostDestination = XIGIGBoostDestination.WHATSAPP_MESSAGE;
            PromoteData promoteData = uZb.A04;
            if (promoteData != null) {
                promoteState.A05(xIGIGBoostDestination, promoteData);
                PromoteState promoteState2 = uZb.A09;
                if (promoteState2 != null) {
                    PromoteData promoteData2 = uZb.A04;
                    if (promoteData2 != null) {
                        promoteState2.A04(xIGIGBoostDestination, promoteData2);
                        DbT.A1J(uZb);
                        return;
                    }
                }
            }
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("promoteState");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C15273UZb uZb) {
        String str;
        C358248ab A0U;
        int i;
        C15273UZb uZb2 = uZb;
        String str2 = uZb2.A06;
        if (str2 != null) {
            if (!00l.A0d(str2, "wa.me", false)) {
                String str3 = uZb2.A06;
                if (str3 == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (!00l.A0d(str3, "api.whatsapp.com", false)) {
                    C18643Vvl vvl = uZb2.A03;
                    if (vvl != null) {
                        vvl.A01.setIsLoading(true);
                    }
                    String str4 = uZb2.A06;
                    if (str4 != null) {
                        PromoteData promoteData = uZb2.A04;
                        if (promoteData != null) {
                            WGU wgu = uZb2.A01;
                            if (wgu == null) {
                                str = "promoteLogger";
                                0qQ.A0F(str);
                                throw AnonymousClass00P.createAndThrow();
                            }
                            C16678UzE uzE = C16678UzE.DESTINATION_WEBSITE;
                            C19131WMm wMm = new C19131WMm((Object) uZb2, 3);
                            2IS r6 = new 2IS();
                            2IS r1 = new 2IS();
                            r6.A04("destination_link", str4);
                            1vn A012 = 1vm.A01(promoteData.A0y);
                            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGPromoteWhatsAppLinkValidationQuery", r6.getParamsCopy(), r1.getParamsCopy(), Bq9.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "whatsapp_link_validation", new ArrayList());
                            A012.ATL(new C64388Lb5(0, wgu, wMm, uzE), new C45926DFg(wMm, 2), pandoGraphQLRequest);
                            return;
                        }
                        str = "promoteData";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
            PromoteData promoteData2 = uZb2.A04;
            if (promoteData2 != null) {
                boolean A042 = AnonymousClass9F0.A04(promoteData2);
                str = "promoteLogger";
                WGU wgu2 = uZb2.A01;
                if (A042) {
                    if (wgu2 != null) {
                        wgu2.A0H(C16678UzE.DESTINATION_WEBSITE, "reduce_hacky_way_promote_ctwa_dialog");
                        A0U = DbW.A0U(uZb2);
                        A0U.A04();
                        A0U.A09(2131970436);
                        A0U.A08(2131970434);
                        A0U.A0I(new W5U(uZb2, 13), 2131970435);
                        i = 14;
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                if (wgu2 != null) {
                    wgu2.A0H(C16678UzE.DESTINATION_WEBSITE, "reduce_hacky_way_promote_igwa_linking_dialog");
                    A0U = DbW.A0U(uZb2);
                    A0U.A04();
                    A0U.A09(2131970436);
                    A0U.A08(2131970437);
                    A0U.A0I(new W5U(uZb2, 15), 2131970438);
                    i = 16;
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
                DbX.A16(new W5U(uZb2, i), A0U);
                return;
            }
            str = "promoteData";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(C15273UZb uZb) {
        PromoteState promoteState = uZb.A09;
        String str = "promoteState";
        if (promoteState != null) {
            PromoteData promoteData = uZb.A04;
            str = "promoteData";
            if (promoteData != null) {
                promoteData.A0b = uZb.A00;
                promoteData.A1I = uZb.A06;
                promoteState.A04(XIGIGBoostDestination.WEBSITE_CLICK, promoteData);
                WGU wgu = uZb.A01;
                if (wgu == null) {
                    str = "promoteLogger";
                } else {
                    C16678UzE uzE = C16678UzE.DESTINATION_WEBSITE;
                    PromoteData promoteData2 = uZb.A04;
                    if (promoteData2 != null) {
                        String str2 = promoteData2.A1I;
                        XIGIGBoostCallToAction xIGIGBoostCallToAction = promoteData2.A0b;
                        CallerContext callerContext = WGU.A07;
                        0Aj A0e = AnonymousClass7TE.A0e(wgu.A05, "promoted_posts_tap_component");
                        if (A0e.isSampled()) {
                            0bb r2 = new 0bb();
                            C13990Tnq.A18(r2, wgu);
                            if (str2 != null) {
                                r2.A06("website", str2);
                            }
                            if (xIGIGBoostCallToAction != null) {
                                r2.A06(C66579MXk.A00(410), xIGIGBoostCallToAction.toString());
                            }
                            A0e.AAJ("component", "done_button");
                            C13990Tnq.A10(A0e, wgu, uzE);
                            C13988Tno.A18(A0e, r2);
                        }
                        DbT.A1J(uZb);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CyU() {
        C18784W1k w1k = this.A08;
        if (w1k == null) {
            0qQ.A0F("promoteDataFetcher");
            throw AnonymousClass00P.createAndThrow();
        } else {
            w1k.A05(this);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CtD() {
        A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-376728997);
        C15273UZb.super.onCreate(bundle);
        this.A04 = XAI.A00(this);
        this.A09 = XA9.A00(this);
        PromoteData promoteData = this.A04;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
        } else {
            UserSession userSession = promoteData.A0y;
            this.A05 = userSession;
            if (userSession != null) {
                this.A01 = WGU.A00(userSession);
                UserSession userSession2 = this.A05;
                if (userSession2 != null) {
                    FragmentActivity activity = getActivity();
                    this.A08 = new C18784W1k(activity, activity, userSession2);
                    UserSession userSession3 = this.A05;
                    if (userSession3 != null) {
                        AnonymousClass1Nd.A00(userSession3).A01(this.A0A, C376029Gg.class);
                        AnonymousClass0fD.A09(-43139459, A022);
                        return;
                    }
                    DbS.A14();
                } else {
                    DbS.A14();
                }
            } else {
                DbS.A14();
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(998903975);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_website_view, viewGroup, false);
        AnonymousClass0fD.A09(-33677029, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(391184275);
        super.onDestroy();
        UserSession userSession = this.A05;
        if (userSession != null) {
            AnonymousClass1Nd.A00(userSession).A02(this.A0A, C376029Gg.class);
            AnonymousClass0fD.A09(-581015385, A022);
            return;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(1579296605);
        super.onDestroyView();
        WGU wgu = this.A01;
        if (wgu == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A04;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                wgu.A0B(C16678UzE.DESTINATION_WEBSITE, promoteData);
                AnonymousClass0fD.A09(418542319, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DFM(C15249UXj uXj) {
        A01(this);
    }
}
