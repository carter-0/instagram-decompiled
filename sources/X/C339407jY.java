package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7jY  reason: invalid class name and case insensitive filesystem */
public final class C339407jY implements C252243on, C339337jR {
    public C358088aL A00;
    public C339417jZ A01 = C339417jZ.A03;
    public C61443K7u A02;
    public FundraiserDisplayInfoModel A03;
    public NewFundraiserInfo A04;
    public AnonymousClass3NV A05 = AnonymousClass3NV.A08;
    public String A06;
    public String A07;
    public ArrayList A08 = new ArrayList();
    public Map A09 = new EnumMap(C339417jZ.class);
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public List A0D = 0sn.A00;
    public Map A0E;
    public final Context A0F;
    public final AnonymousClass4DH A0G;
    public final AnonymousClass0iw A0H;
    public final 1wn A0I;
    public final 1wn A0J;
    public final UserSession A0K;
    public final C357638Yz A0L;
    public final AnonymousClass8E7 A0M;
    public final C353398Hl A0N;
    public final C231002qi A0O;
    public final C230882qT A0P;
    public final C339617jt A0Q;
    public final String A0R;
    public final C339567jo A0S;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00b6, code lost:
        r12 = r5.getShortName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C339407jY(X.AnonymousClass4DH r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.C357638Yz r19, X.AnonymousClass8E7 r20, X.C353398Hl r21, com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive r22, X.C231002qi r23, X.C230882qT r24, java.lang.String r25) {
        /*
            r15 = this;
            r7 = 1
            r15.<init>()
            r1 = r16
            r15.A0G = r1
            r3 = r18
            r15.A0K = r3
            r2 = r19
            r15.A0L = r2
            r0 = r20
            r15.A0M = r0
            r0 = r21
            r15.A0N = r0
            r0 = r24
            r15.A0P = r0
            r0 = r23
            r15.A0O = r0
            r0 = r17
            r15.A0H = r0
            r0 = r25
            r15.A0R = r0
            android.content.Context r0 = r1.requireContext()
            r15.A0F = r0
            X.0sn r0 = X.0sn.A00
            r15.A0D = r0
            X.7jZ r0 = X.C339417jZ.A03
            r15.A01 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A08 = r0
            X.3NV r0 = X.AnonymousClass3NV.A08
            r15.A05 = r0
            java.lang.Class<X.7jZ> r1 = X.C339417jZ.class
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r1)
            r15.A09 = r0
            X.7jZ r8 = X.C339417jZ.A02
            X.8aL r1 = X.C358088aL.A0Y
            X.0eP r10 = new X.0eP
            r10.<init>(r8, r1)
            X.7jZ r4 = X.C339417jZ.A0A
            X.8aL r0 = X.C358088aL.A0W
            X.0eP r9 = new X.0eP
            r9.<init>(r4, r0)
            X.7jZ r4 = X.C339417jZ.A06
            X.8aL r0 = X.C358088aL.A0c
            X.0eP r6 = new X.0eP
            r6.<init>(r4, r0)
            X.7jZ r5 = X.C339417jZ.A04
            X.8aL r4 = X.C358088aL.A0a
            X.0eP r0 = new X.0eP
            r0.<init>(r5, r4)
            X.0eP[] r0 = new X.0eP[]{r10, r9, r6, r0}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r15.A0E = r0
            X.8aL r0 = X.C358088aL.A0d
            r15.A00 = r0
            boolean r0 = X.C347037wA.A04(r3)
            r15.A0C = r0
            X.7jk r6 = new X.7jk
            r6.<init>(r15)
            r15.A0J = r6
            X.7jl r5 = new X.7jl
            r5.<init>(r15)
            r15.A0I = r5
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.7jm> r0 = X.C339547jm.class
            r4.A01(r6, r0)
            java.lang.Class<X.7jn> r0 = X.C339557jn.class
            r4.A01(r5, r0)
            r9 = r22
            if (r22 == 0) goto L_0x00e3
            A01(r8, r15)
            java.lang.String r6 = r9.A01
            java.lang.String r10 = r9.A02
            com.instagram.user.model.User r5 = r9.A00
            r4 = 0
            if (r5 == 0) goto L_0x011b
            java.lang.String r11 = r5.B8Q()
        L_0x00b2:
            java.lang.String r0 = ""
            if (r5 == 0) goto L_0x00bc
            java.lang.String r12 = r5.getShortName()
            if (r12 != 0) goto L_0x00bd
        L_0x00bc:
            r12 = r0
        L_0x00bd:
            java.lang.String r13 = r9.A04
            if (r13 != 0) goto L_0x00c2
            r13 = r0
        L_0x00c2:
            java.lang.String r14 = r9.A03
            if (r14 != 0) goto L_0x00c7
            r14 = r0
        L_0x00c7:
            com.instagram.model.fundraiser.FundraiserDisplayInfoModel r9 = new com.instagram.model.fundraiser.FundraiserDisplayInfoModel
            r9.<init>(r10, r11, r12, r13, r14)
            r15.A06 = r6
            r15.A03 = r9
            A00(r1, r15, r7)
            com.instagram.common.session.UserSession r1 = r15.A0K
            X.0iw r0 = r15.A0H
            X.LTM.A01(r0, r1, r6)
            if (r5 == 0) goto L_0x00e0
            java.lang.String r4 = r5.B8Q()
        L_0x00e0:
            A08(r15, r4)
        L_0x00e3:
            X.7jo r1 = new X.7jo
            r1.<init>()
            r15.A0S = r1
            X.7jp r0 = new X.7jp
            r0.<init>(r15)
            r1.A02 = r0
            boolean r0 = r15.A0C
            if (r0 == 0) goto L_0x00f9
            X.8aL r0 = X.C358088aL.A0X
            r15.A00 = r0
        L_0x00f9:
            X.7jq r0 = new X.7jq
            r0.<init>(r15)
            r2.A0F(r0)
            X.7jr r2 = new X.7jr
            r2.<init>(r15)
            X.7jt r1 = new X.7jt
            r1.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            X.C227642jf.A04(r0, r3)
            r1.setArguments(r0)
            r1.A00 = r2
            r15.A0Q = r1
            return
        L_0x011b:
            r11 = r4
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C339407jY.<init>(X.4DH, X.0iw, com.instagram.common.session.UserSession, X.8Yz, X.8E7, X.8Hl, com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive, X.2qi, X.2qT, java.lang.String):void");
    }

    public static final void A02(C339407jY r2) {
        r2.A06 = null;
        r2.A04 = null;
        A00(C358088aL.A0Y, r2, false);
    }

    public final void A0A(View view) {
        0qQ.A0B(view, 0);
        C357638Yz r6 = this.A0L;
        AnonymousClass80L r5 = AnonymousClass80L.A00;
        C358088aL r1 = C358088aL.A0X;
        boolean z = this.A0C;
        r6.A0J(r5, r1, z);
        if (z) {
            r6.A0J(r5, C358088aL.A0d, false);
        }
        UserSession userSession = this.A0K;
        this.A0A = 182.A06(0Tu.A05, userSession, 36311255543382495L);
        r6.A0J(r5, C358088aL.A0c, true);
        C342437ob r0 = C339637jv.A00(userSession).A00;
        boolean z2 = false;
        if (r0 != null) {
            z2 = true;
        }
        r6.A0J(r5, C358088aL.A0a, z2);
        if (this.A0A) {
            if (!((Boolean) this.A09.getOrDefault(C339417jZ.A02, false)).booleanValue()) {
                A03(this);
            }
        }
        C339417jZ r02 = C339417jZ.A06;
        Map map = this.A09;
        if (!((Boolean) map.getOrDefault(r02, false)).booleanValue()) {
            A05(this);
        }
        if (z2 && !((Boolean) map.getOrDefault(C339417jZ.A04, false)).booleanValue()) {
            A04(this);
        }
        C63040xi r4 = 0tS.A4E;
        0tS A002 = r4.A00();
        0s0 r12 = A002.A1M;
        AnonymousClass0YZ[] r3 = 0tS.A4G;
        r12.Epx(A002, false, r3[96]);
        0tS A003 = r4.A00();
        A003.A1N.Epx(A003, false, r3[97]);
        A06(this);
    }

    public final void A0B(View view, C339337jR r10, String str, boolean z) {
        0qQ.A0B(view, 0);
        0qQ.A0B(str, 2);
        0qQ.A0B(r10, 3);
        C61360K4c k4c = new C61360K4c();
        Bundle bundle = new Bundle();
        bundle.putBoolean(AnonymousClass000.A00(412), z);
        bundle.putString(AnonymousClass000.A00(411), str);
        k4c.setArguments(bundle);
        k4c.A0A = r10;
        UserSession userSession = this.A0K;
        C331127Pr r5 = new C331127Pr(userSession);
        r5.A0U = new C40644AgJ(view);
        Context context = view.getContext();
        int i = 2131963866;
        if (182.A06(0Tu.A05, userSession, 36318221980342273L)) {
            i = 2131963867;
        }
        r5.A0d = context.getString(i);
        r5.A0a = false;
        r5.A03 = 0.33f;
        C331157Pu A002 = r5.A00();
        A002.A03(this.A0G.requireContext(), k4c);
        k4c.A0D = A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.view.View r3, X.AnonymousClass3NV r4) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r4, r0)
            r2.A05 = r4
            com.instagram.common.session.UserSession r1 = r2.A0K
            boolean r0 = X.C278264wZ.A02(r1)
            if (r0 == 0) goto L_0x0017
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2o3.A00(r1)
            boolean r0 = r0.A06
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.String r0 = r4.A01
            r2.A0B(r3, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C339407jY.A0C(android.view.View, X.3NV):void");
    }

    public final void A0D(AnonymousClass3NV r7, boolean z) {
        Context context;
        int i;
        0qQ.A0B(r7, 0);
        if (this.A05 != r7) {
            this.A05 = r7;
            int[] iArr = A2I.A00;
            Drawable drawable = null;
            switch (r7.ordinal()) {
                case 0:
                    C358088aL r4 = C358088aL.A0V;
                    A00(r4, this, false);
                    AnonymousClass8E8 A002 = this.A0M.A00();
                    AnonymousClass80L r1 = AnonymousClass80L.A00;
                    context = this.A0F;
                    A002.A09(context.getDrawable(R.drawable.instagram_users_outline_44), r1, r4);
                    i = 2131963865;
                    break;
                case 1:
                    C358088aL r42 = C358088aL.A0V;
                    A00(r42, this, true);
                    AnonymousClass8E8 A003 = this.A0M.A00();
                    AnonymousClass80L r12 = AnonymousClass80L.A00;
                    context = this.A0F;
                    A003.A09(context.getDrawable(R.drawable.instagram_eye_off_outline_44), r12, r42);
                    i = 2131963862;
                    break;
                case 2:
                    C358088aL r2 = C358088aL.A0V;
                    A00(r2, this, true);
                    context = this.A0F;
                    Drawable drawable2 = context.getDrawable(R.drawable.instagram_crown_badge_pano_outline_24);
                    if (drawable2 != null) {
                        drawable2.mutate();
                        drawable2.setTint(context.getColor(R.color.canvas_bottom_sheet_description_text_color));
                        drawable = drawable2;
                    }
                    this.A0M.A00().A09(drawable, AnonymousClass80L.A00, r2);
                    i = 2131963870;
                    break;
                case 3:
                    C358088aL r22 = C358088aL.A0V;
                    A00(r22, this, true);
                    context = this.A0F;
                    Drawable drawable3 = context.getDrawable(R.drawable.instagram_circle_star_pano_filled_24);
                    if (drawable3 != null) {
                        drawable3.mutate();
                        drawable3.setTint(context.getColor(R.color.canvas_bottom_sheet_description_text_color));
                        drawable = drawable3;
                    }
                    this.A0M.A00().A09(drawable, AnonymousClass80L.A00, r22);
                    i = 2131963853;
                    break;
                case 4:
                    C358088aL r23 = C358088aL.A0V;
                    A00(r23, this, true);
                    context = this.A0F;
                    Drawable drawable4 = context.getDrawable(R.drawable.instagram_user_requested_pano_filled_24);
                    if (drawable4 != null) {
                        drawable4.mutate();
                        drawable4.setTint(context.getColor(R.color.canvas_bottom_sheet_description_text_color));
                        drawable = drawable4;
                    }
                    this.A0M.A00().A09(drawable, AnonymousClass80L.A00, r23);
                    i = 2131963855;
                    break;
                case 5:
                    A00(C358088aL.A0V, this, true);
                    context = this.A0F;
                    i = 2131963848;
                    break;
                case 6:
                    C358088aL r43 = C358088aL.A0V;
                    A00(r43, this, true);
                    AnonymousClass8E8 A004 = this.A0M.A00();
                    AnonymousClass80L r13 = AnonymousClass80L.A00;
                    context = this.A0F;
                    A004.A09(context.getDrawable(R.drawable.instagram_app_instagram_outline_44), r13, r43);
                    i = 2131963858;
                    break;
                default:
                    throw new UnsupportedOperationException("You've selected a visibility option that is not supported by the broadcaster tools entrypoint.");
            }
            String string = context.getString(i);
            if (this.A05 == AnonymousClass3NV.A04) {
                this.A0A = false;
                this.A01 = C339417jZ.A03;
                A00(C358088aL.A0W, this, false);
                A02(this);
                A00(C358088aL.A0Y, this, false);
            } else {
                this.A0A = 182.A06(0Tu.A05, this.A0K, 36311255543382495L);
            }
            this.A0L.A0J(AnonymousClass80L.A00, C358088aL.A0Y, this.A0A);
            if (z && string != null) {
                C59689JTv.A09(context, string);
            }
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void CwQ(AnonymousClass3NV r2) {
        A0D(r2, true);
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C358088aL r2, C339407jY r3, boolean z) {
        C357638Yz r1 = r3.A0L;
        if (r1.A0V(r2) != z) {
            r1.A0L(r2);
        }
    }

    public static final void A01(C339417jZ r3, C339407jY r4) {
        C339417jZ r0 = r4.A01;
        if (r0 != r3) {
            Map map = r4.A0E;
            C358088aL r1 = (C358088aL) map.get(r0);
            if (r1 != null) {
                A00(r1, r4, false);
            }
            C358088aL r12 = (C358088aL) map.get(r3);
            if (r12 != null) {
                r4.A0L.A0K(r12);
            }
            r4.A01 = r3;
            A02(r4);
        }
    }

    public static final void A03(C339407jY r5) {
        if (182.A06(0Tu.A05, r5.A0K, 36311255543382495L)) {
            r5.A09.put(C339417jZ.A02, true);
            AnonymousClass8E7 r3 = r5.A0M;
            AnonymousClass8E8 A002 = r3.A00();
            C358088aL r4 = C358088aL.A0Y;
            A002.A08(r4, new C377149Ks(r5, 6));
            AnonymousClass8E8 A003 = r3.A00();
            C230882qT r2 = r5.A0P;
            A003.A07(r4, QPTooltipAnchor.LIVE_CREATE_FUNDRAISER_BUTTON, r5.A0O, r2);
        }
    }

    public static final void A04(C339407jY r6) {
        QPTooltipAnchor qPTooltipAnchor;
        UserSession userSession = r6.A0K;
        if (C339637jv.A00(userSession).A00 != null) {
            r6.A09.put(C339417jZ.A04, true);
            AnonymousClass8E7 r5 = r6.A0M;
            AnonymousClass8E8 A002 = r5.A00();
            C358088aL r4 = C358088aL.A0a;
            A002.A08(r4, new C377149Ks(r6, 7));
            if (C339637jv.A00(userSession).A01.isEmpty()) {
                qPTooltipAnchor = QPTooltipAnchor.LIVE_SCHEDULED_LIVE_CREATION_BUTTON;
            } else {
                qPTooltipAnchor = QPTooltipAnchor.LIVE_SCHEDULED_LIVE_MANAGEMENT_BUTTON;
            }
            r5.A00().A07(r4, qPTooltipAnchor, r6.A0O, r6.A0P);
            A06(r6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.0qQ.A0K(r4.A0L.A08.A00, X.AnonymousClass80L.A00) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C339407jY r4) {
        /*
            com.instagram.common.session.UserSession r0 = r4.A0K
            com.instagram.monetization.repository.MonetizationRepository r0 = X.AnonymousClass2o3.A00(r0)
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0019
            X.8Yz r0 = r4.A0L
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.80L r0 = X.AnonymousClass80L.A00
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            java.util.Map r2 = r4.A09
            X.7jZ r1 = X.C339417jZ.A06
            if (r0 == 0) goto L_0x0040
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r1, r0)
            X.8aL r3 = X.C358088aL.A0c
            boolean r0 = r4.A0B
            A00(r3, r4, r0)
            X.8E7 r0 = r4.A0M
            X.8E8 r2 = r0.A00()
            r1 = 8
            X.9Ks r0 = new X.9Ks
            r0.<init>(r4, r1)
            r2.A08(r3, r0)
            return
        L_0x0040:
            r3 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r0)
            X.8Yz r2 = r4.A0L
            X.80L r1 = X.AnonymousClass80L.A00
            X.8aL r0 = X.C358088aL.A0c
            r2.A0J(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C339407jY.A05(X.7jY):void");
    }

    public static final void A06(C339407jY r3) {
        String str;
        if (0qQ.A0K(r3.A0L.A08.A00, AnonymousClass80L.A00)) {
            UserSession userSession = r3.A0K;
            UpcomingEvent A002 = C339637jv.A00(userSession).A00(userSession);
            C339417jZ r1 = r3.A01;
            C339417jZ r0 = C339417jZ.A04;
            if (r1 != r0) {
                if (A002 != null) {
                    A01(r0, r3);
                    str = A002.getTitle();
                } else {
                    return;
                }
            } else if (A002 == null) {
                A01(C339417jZ.A03, r3);
                str = null;
            } else {
                return;
            }
            r3.A07 = str;
        }
    }

    public static final void A07(C339407jY r4) {
        C357638Yz r1 = r4.A0L;
        C358088aL r3 = C358088aL.A0Z;
        if (r1.A0U(r3)) {
            A00(r3, r4, C339667jy.A03.A00(r4.A0K).A01.getBoolean("ig_live_employee_only_mode", false));
        }
    }

    public static final void A08(C339407jY r5, String str) {
        Context context = r5.A0F;
        C358248ab r3 = new C358248ab(context);
        r3.A05 = context.getResources().getString(2131963890);
        String format = String.format("%s\n\n%s", Arrays.copyOf(new Object[]{context.getResources().getString(2131963888, new Object[]{str}), context.getResources().getString(2131963889)}, 2));
        0qQ.A07(format);
        r3.A0q(format);
        String string = context.getResources().getString(2131968772);
        0qQ.A07(string);
        r3.A0a((DialogInterface.OnClickListener) null, string);
        AnonymousClass0fN.A00(r3.A02());
    }

    public static final void A09(C339407jY r3, String str, ArrayList arrayList, boolean z) {
        Context context;
        int i;
        boolean z2 = false;
        if (r3.A0C) {
            if (!TextUtils.isEmpty(str) || !arrayList.isEmpty()) {
                if (z) {
                    context = r3.A0F;
                    i = 2131963886;
                }
                r3.A07 = str;
                r3.A08 = arrayList;
                C358088aL r1 = r3.A00;
                if (str != null || (!arrayList.isEmpty())) {
                    z2 = true;
                }
                A00(r1, r3, z2);
            }
            if (z) {
                context = r3.A0F;
                i = 2131963887;
            }
            r3.A07 = str;
            r3.A08 = arrayList;
            C358088aL r12 = r3.A00;
            z2 = true;
            A00(r12, r3, z2);
        } else if (str == null || TextUtils.isEmpty(str)) {
            if (z) {
                context = r3.A0F;
                i = 2131963978;
            }
            r3.A07 = str;
            r3.A08 = arrayList;
            C358088aL r122 = r3.A00;
            z2 = true;
            A00(r122, r3, z2);
        } else {
            if (z) {
                String str2 = r3.A07;
                context = r3.A0F;
                if (str2 == null) {
                    i = 2131963977;
                } else {
                    i = 2131963979;
                }
            }
            r3.A07 = str;
            r3.A08 = arrayList;
            C358088aL r1222 = r3.A00;
            z2 = true;
            A00(r1222, r3, z2);
        }
        C59689JTv.A09(context, context.getString(i));
        r3.A07 = str;
        r3.A08 = arrayList;
        C358088aL r12222 = r3.A00;
        z2 = true;
        A00(r12222, r3, z2);
    }
}
