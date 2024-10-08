package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;

public final class K8B extends MYR implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS {
    public static final String A08 = K8B.class.getName();
    public static final String __redex_internal_original_name = "VideoAdvancedSettingsFragment";
    public C63776L6i A00;
    public 1Av A01;
    public C363548ju A02;
    public 1Ng A03;
    public 1wn A04;
    public 1wn A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = C66299MMi.A00(this, new C66299MMi(this, 6), new C73666Phf(16, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 7);

    public final String getModuleName() {
        return "igtv_upload_adv_settings";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A0B(A02(this));
    }

    public static final IGTVUploadViewModel A01(K8B k8b) {
        return JTO.A0k(k8b.A07);
    }

    public static void A03(View.OnClickListener onClickListener, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C64779Lhv(onClickListener, i));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232222tE[]{new Object(), new Object(), new Object(), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(MOP.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final boolean onBackPressed() {
        JTO.A0k(this.A07).A04(this, C61945KSu.A00);
        return false;
    }

    public static LAR A00(K8B k8b) {
        return ((LAS) A01(k8b).A0I.getValue()).A02;
    }

    public static final ArrayList A02(K8B k8b) {
        String A0m;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C64265LXr lXr = C64265LXr.A00;
        A03(lXr, A1C, 2131964078);
        if (!A00(k8b).A06 && A00(k8b).A03) {
            A1C.add(new Li6(LY6.A00(k8b, 21), (String) null, 2131964023));
        }
        A1C.add(new Li6(LY6.A00(k8b, 22), (String) null, 2131964024));
        A1C.add(new Li7(2131964079, (Integer) null));
        AnonymousClass0eM r2 = k8b.A07;
        JTO.A0k(r2).A0I.getValue();
        A03(lXr, A1C, 2131964009);
        A1C.add(new C64797LiH(new C65369LsA(k8b, 33), 2131964090, JTO.A0k(r2).A0M.A0R, true));
        if (!A00(k8b).A06 && A00(k8b).A01) {
            A03(lXr, A1C, 2131964004);
            LY6 A002 = LY6.A00(k8b, 24);
            AnonymousClass0eM r7 = k8b.A06;
            r7.getValue();
            A1C.add(new Li6(A002, LSV.A00(k8b.requireContext(), JTO.A0k(r2).A0M.A08, JTO.A0k(r2).A0M.A0O, JTO.A0k(r2).A0M.A0f), 2131952328));
            LPL.A01(k8b, AnonymousClass7TE.A0l(r7), AnonymousClass05K.A0F, AnonymousClass05K.A0u, r7);
        }
        if (!A00(k8b).A06 && A00(k8b).A04) {
            A03(lXr, A1C, 2131964033);
            A1C.add(new C64797LiH(new C65369LsA(k8b, 34), 2131964036, JTO.A0k(r2).A0M.A0a, true));
            A1C.add(new Li7(2131964034, (Integer) null));
        }
        if (A00(k8b).A02) {
            A03(lXr, A1C, 2131963997);
            A1C.add(new C64797LiH(new C65369LsA(k8b, 35), 2131954772, JTO.A0k(r2).A0M.A0Q, true));
            String A0m2 = DbU.A0m(k8b, 2131976463);
            String A0m3 = DbU.A0m(k8b, 2131964896);
            SpannableStringBuilder A0B = DbZ.A0B(A0m2, A0m3);
            C62146Kaz kaz = new C62146Kaz(k8b, Dbb.A04(k8b));
            0qQ.A0A(A0B);
            AnonymousClass7AV.A05(A0B, kaz, A0m3);
            int i = 2131976464;
            if (A00(k8b).A06) {
                i = 2131955307;
            }
            Integer valueOf = Integer.valueOf(i);
            0qQ.A0B(A0B, 1);
            Li7 li7 = new Li7(-1, valueOf);
            li7.A00 = A0B;
            A1C.add(li7);
        }
        if (!A00(k8b).A06 && A00(k8b).A05) {
            A03(lXr, A1C, 2131964003);
            LY6 A003 = LY6.A00(k8b, 23);
            1Av r0 = k8b.A01;
            if (r0 != null) {
                if (r0.A24("feed")) {
                    1Av r02 = k8b.A01;
                    if (r02 != null) {
                        A0m = DbY.A0d(DbV.A05(k8b), r02.A0I("feed").size(), R.plurals.on_x_countries);
                        0qQ.A0A(A0m);
                    }
                } else {
                    A0m = DbU.A0m(k8b, 2131973425);
                }
                A1C.add(new Li6(A003, A0m, 2131973426));
                A1C.add(new Li7(2131973424, (Integer) null));
            }
            0qQ.A0F("userPreferences");
            throw AnonymousClass00P.createAndThrow();
        }
        if (!A00(k8b).A06 && A00(k8b).A00) {
            A03(lXr, A1C, 2131969722);
            boolean z = JTO.A0k(r2).A0M.A0X;
            boolean z2 = !JTO.A0k(r2).A0M.A0W;
            if (z2) {
                z = false;
            }
            A1C.add(new C64797LiH(new C65369LsA(k8b, 36), 2131962275, z, !z2));
            C65253Lpx lpx = new C65253Lpx(k8b);
            AnonymousClass5w9 r03 = AnonymousClass5w8.A05;
            SpannableStringBuilder A032 = JTT.A0R(k8b.A06).A03(k8b.requireContext(), k8b.requireActivity(), lpx, "video_advanced_setting_description");
            if (z2) {
                Li7 li72 = new Li7(-1, 2131973686);
                li72.A00 = A032;
                A1C.add(li72);
            }
        }
        return A1C;
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.setTitle(getString(2131964094));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00aa, code lost:
        if (X.C363558jv.A00(X.AnonymousClass7TE.A0l(r5)) == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = -1700024129(0xffffffff9aabb0bf, float:-7.100949E-23)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.K8B.super.onCreate(r7)
            android.os.Bundle r2 = r6.requireArguments()
            X.0eM r5 = r6.A06
            X.1Av r0 = X.DbX.A0h(r5)
            r6.A01 = r0
            X.1Ng r0 = X.DbX.A0R(r5)
            r6.A03 = r0
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            java.lang.String r0 = "igtv_creation_session_id_arg"
            java.lang.String r4 = r2.getString(r0, r1)
            java.lang.String r1 = "igtv_viewer_session_id_arg"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.0qQ.A0A(r4)
            X.L6h r0 = new X.L6h
            r0.<init>(r1, r4, r2)
            com.instagram.common.session.UserSession r4 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A02
            X.L6i r0 = new X.L6i
            r0.<init>(r4, r2, r1)
            r6.A00 = r0
            java.lang.String r0 = "igtv_upload_adv_settings"
            r6.setModuleNameV2(r0)
            X.LAR r0 = A00(r6)
            boolean r0 = r0.A01
            java.lang.String r4 = "eventBus"
            if (r0 == 0) goto L_0x0066
            r0 = 5
            X.LgJ r2 = new X.LgJ
            r2.<init>(r6, r0)
            X.1Ng r1 = r6.A03
            if (r1 == 0) goto L_0x00d6
            java.lang.Class<X.Lg6> r0 = X.C64679Lg6.class
            r1.A01(r2, r0)
            r6.A04 = r2
        L_0x0066:
            X.LAR r0 = A00(r6)
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x007f
            r0 = 6
            X.LgJ r2 = new X.LgJ
            r2.<init>(r6, r0)
            X.1Ng r1 = r6.A03
            if (r1 == 0) goto L_0x00d6
            java.lang.Class<X.LfR> r0 = X.C64639LfR.class
            r1.A01(r2, r0)
            r6.A05 = r2
        L_0x007f:
            X.LAR r0 = A00(r6)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00c3
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.8ju r0 = X.LJr.A00(r0)
            r6.A02 = r0
            X.0eM r4 = r6.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r4)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.AnonymousClass8PU.A07(r0)
            if (r0 == 0) goto L_0x00ac
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.C363558jv.A00(r0)
            r1 = 1
            if (r0 != 0) goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            X.Lsu r0 = r2.A0M
            r0.A0X = r1
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r4)
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.5w8 r0 = X.JTT.A0R(r5)
            boolean r1 = r0.A0B()
            X.Lsu r0 = r2.A0M
            r0.A0W = r1
        L_0x00c3:
            r0 = 29
            X.JFt r1 = new X.JFt
            r1.<init>(r6, r0)
            java.lang.String r0 = "request_key_audience_restrictions"
            X.06F.A00(r6, r0, r1)
            r0 = 63558368(0x3c9d2e0, float:1.1862133E-36)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x00d6:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K8B.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-400551161);
        1wn r2 = this.A04;
        if (r2 != null) {
            1Ng r1 = this.A03;
            if (r1 != null) {
                r1.A02(r2, C64679Lg6.class);
            }
            0qQ.A0F("eventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        1wn r22 = this.A05;
        if (r22 != null) {
            1Ng r12 = this.A03;
            if (r12 != null) {
                r12.A02(r22, C64639LfR.class);
            }
            0qQ.A0F("eventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        super.onDestroy();
        AnonymousClass0fD.A09(-2130197642, A022);
    }
}
