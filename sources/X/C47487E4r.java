package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.E4r  reason: case insensitive filesystem */
public final class C47487E4r extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C51875G5m, C230792qH {
    public static final String __redex_internal_original_name = "SuspectedBrandedContentReviewFragment";
    public RectF A00;
    public Dw6 A01;
    public Reel A02;
    public SpinnerImageView A03;
    public String A04 = "feed";
    public String A05;
    public String A06;
    public ViewGroup A07;
    public IgFrameLayout A08;
    public String A09;
    public String A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);
    public final 1wn A0C = FXZ.A00(this, 2);

    public final void DR1(C17633VbP vbP, C270374gd r25) {
        Integer num;
        AnonymousClass0eM r2;
        C309516Yo r4;
        AnonymousClass535 r8;
        List list;
        boolean z;
        String str = vbP.A01;
        int hashCode = str.hashCode();
        String str2 = "notifSource";
        String str3 = null;
        if (hashCode != 1671672458) {
            if (hashCode == 2082785123 && str.equals("branded_content_violation_edit")) {
                r2 = this.A0B;
                UserSession A0l = AnonymousClass7TE.A0l(r2);
                Integer num2 = AnonymousClass05K.A0m;
                String str4 = this.A05;
                if (str4 != null) {
                    LinkedHashMap A0p = DbY.A0p("media_type", this.A04, AnonymousClass7TE.A1L("notif_source", str4));
                    Dw6 dw6 = this.A01;
                    if (dw6 != null) {
                        str3 = dw6.A04;
                    }
                    JVF.A03(this, A0l, num2, (Integer) null, (Integer) null, (String) null, (String) null, str3, (Throwable) null, A0p);
                    num = AnonymousClass05K.A0M;
                    if (C347037wA.A04(AnonymousClass7TE.A0l(r2))) {
                        Dw6 dw62 = this.A01;
                        if (dw62 != null) {
                            r8 = dw62.A00;
                        } else {
                            r8 = null;
                        }
                        boolean A032 = AnonymousClass430.A03(DbW.A0S(r2, 0), 36316126036758506L);
                        r4 = DbZ.A0P(this, r2);
                        C49892FBu.A02();
                        if (!A032 || r8 == null) {
                            list = 0sn.A00;
                        } else {
                            User user = r8.A00;
                            boolean A1X = AnonymousClass7TG.A1X(r8.A02);
                            Boolean bool = r8.A01;
                            if (bool != null) {
                                z = bool.booleanValue();
                            } else {
                                z = true;
                            }
                            list = AnonymousClass7TE.A1I(new BrandedContentTag(user, A1X, z));
                        }
                        String str5 = this.A04;
                        String str6 = this.A06;
                        if (str6 == null) {
                            str2 = "violationMediaId";
                        } else {
                            r4.A0B((Bundle) null, LSU.A03((BrandedContentGatingInfoIntf) null, str5, str6, list, false, true, A032, false, false));
                        }
                    } else {
                        r4 = DbZ.A0P(this, r2);
                        r4.A0B((Bundle) null, C49892FBu.A01());
                    }
                    r4.A0A = "brandedcontent_violation";
                    r4.A04();
                    F9Z.A00(AnonymousClass7TE.A0l(r2), r25, num, AnonymousClass05K.A15);
                    return;
                }
            } else {
                return;
            }
        } else if (str.equals("dismiss")) {
            num = AnonymousClass05K.A0C;
            r2 = this.A0B;
            UserSession A0l2 = AnonymousClass7TE.A0l(r2);
            Integer num3 = AnonymousClass05K.A0n;
            String str7 = this.A05;
            if (str7 != null) {
                LinkedHashMap A0p2 = DbY.A0p("media_type", this.A04, AnonymousClass7TE.A1L("notif_source", str7));
                Dw6 dw63 = this.A01;
                if (dw63 != null) {
                    str3 = dw63.A04;
                }
                JVF.A03(this, A0l2, num3, (Integer) null, (Integer) null, (String) null, (String) null, str3, (Throwable) null, A0p2);
                String str8 = this.A09;
                if (str8 != null) {
                    1OC A002 = Dd3.A00(AnonymousClass7TE.A0l(r2), "hide", str8, this.A0A, (Map) null);
                    A002.A00 = C47697EDg.A00(this, 6);
                    1ES.A03(A002);
                } else {
                    onBackPressed();
                }
                F9Z.A00(AnonymousClass7TE.A0l(r2), r25, num, AnonymousClass05K.A15);
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DR2(C270374gd r1) {
    }

    public final void DR3(C270374gd r1) {
    }

    public final void DcR(C50901Fkg fkg, Reel reel, List list) {
        String str;
        AnonymousClass3HX r0;
        List list2;
        1Xj r02;
        Dw6 dw6 = this.A01;
        if (dw6 == null || (r0 = dw6.A03) == null || (list2 = r0.A1j) == null || (r02 = (1Xj) 00k.A0O(list2, 0)) == null) {
            str = null;
        } else {
            str = r02.getId();
        }
        String valueOf = String.valueOf(str);
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add(valueOf);
        this.A00 = 0nA.A0F(fkg.A06);
        AnonymousClass3K2 A072 = 1OP.A07(requireActivity(), AnonymousClass7TE.A0l(this.A0B));
        RectF rectF = this.A00;
        if (rectF != null) {
            Reel reel2 = reel;
            A072.A0U((RectF) null, rectF, this, reel2, AnonymousClass3BQ.BRANDED_CONTENT, new FkR(1, this, reel2, A1F), (String) null, (List) null, -1, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131969154);
    }

    public final String getModuleName() {
        return "brandedcontent_violation";
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C47487E4r r18) {
        /*
            r12 = r18
            X.Dw6 r0 = r12.A01
            if (r0 == 0) goto L_0x00eb
            X.4gd r5 = r0.A02
            if (r5 == 0) goto L_0x00eb
            android.content.Context r0 = r12.requireContext()
            android.widget.LinearLayout r8 = X.C18685Vwj.A01(r0, r5)
            android.content.Context r0 = r12.requireContext()
            X.0eM r4 = r12.A0B
            r4.getValue()
            X.C18685Vwj.A02(r0, r8, r12, r12, r5)
            r0 = 2131436153(0x7f0b2279, float:1.8494168E38)
            android.widget.TextView r9 = X.AnonymousClass7TE.A0d(r8, r0)
            X.DbT.A1H(r9)
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r4)
            android.content.Context r2 = r12.requireContext()
            r3 = 0
            r7 = 1
            X.0qQ.A0B(r11, r7)
            X.Uli r0 = r5.A02
            java.lang.String r10 = r0.A0B
            X.0qQ.A07(r10)
            X.JdR r6 = new X.JdR
            r6.<init>(r3, r1, r11, r2)
            r0 = 36316126036758506(0x810553000a0fea, double:3.029802566723572E-306)
            boolean r0 = X.AnonymousClass430.A03(r11, r0)
            if (r0 == 0) goto L_0x0084
            r0 = 2131954165(0x7f1309f5, float:1.9544822E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r2, r0)
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r10)
        L_0x005b:
            X.AnonymousClass7AV.A05(r0, r6, r2)
            r9.setText(r0)
            android.view.ViewGroup r0 = r12.A07
            if (r0 != 0) goto L_0x006f
            java.lang.String r2 = "violationListContainer"
        L_0x0067:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006f:
            r0.addView(r8, r3)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.F9Z.A00(r2, r5, r1, r0)
            com.instagram.common.ui.base.IgFrameLayout r2 = r12.A08
            if (r2 != 0) goto L_0x0097
            java.lang.String r2 = "previewContainer"
            goto L_0x0067
        L_0x0084:
            r0 = 2131974839(0x7f135ab7, float:1.9586753E38)
            java.lang.String r1 = X.DbY.A0c(r2, r10, r0)
            r0 = 2131972981(0x7f135375, float:1.9582985E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r2, r0)
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r1)
            goto L_0x005b
        L_0x0097:
            X.Dw6 r1 = r12.A01
            r6 = 0
            if (r1 == 0) goto L_0x0120
            X.3HX r0 = r1.A03
        L_0x009e:
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "story"
            r12.A04 = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.reels.store.ReelStore r1 = X.1OP.A05(r0)
            X.Dw6 r0 = r12.A01
            if (r0 == 0) goto L_0x0128
            X.3HX r0 = r0.A03
            if (r0 == 0) goto L_0x0128
            com.instagram.model.reels.Reel r0 = r1.A0I(r0, r7)
            r12.A02 = r0
            android.view.LayoutInflater r1 = X.DbV.A0D(r2)
            r0 = 2131628864(0x7f0e1340, float:1.8885033E38)
            android.view.View r1 = X.DbU.A0A(r1, r2, r0, r3)
            X.Fkg r0 = new X.Fkg
            r0.<init>(r1)
            r1.setTag(r0)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r4)
            X.Fkg r15 = new X.Fkg
            r15.<init>(r1)
            com.instagram.model.reels.Reel r0 = r12.A02
            if (r0 == 0) goto L_0x0123
            java.util.List r17 = X.AnonymousClass7TE.A1I(r0)
            r14 = r12
            r18 = r3
            r16 = r0
            X.C48937Emb.A00(r12, r13, r14, r15, r16, r17, r18)
            r2.addView(r1)
        L_0x00eb:
            return
        L_0x00ec:
            if (r1 == 0) goto L_0x00eb
            X.1Xg r0 = r1.A01
            if (r0 == 0) goto L_0x00eb
            X.1Xn r0 = r0.A05
            X.1Xj r1 = X.1Xi.A02(r0)
            if (r1 != 0) goto L_0x012d
            android.content.Context r2 = r12.getContext()
            android.content.res.Resources r1 = X.DbV.A05(r12)
            r0 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r0 = r1.getString(r0)
            X.C59689JTv.A03(r2, r0, r6, r3)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r12.A03
            java.lang.String r2 = "spinner"
            if (r1 == 0) goto L_0x0067
            X.3uy r0 = X.C255943uy.FAILED
            r1.setLoadingStatus(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r12.A03
            if (r1 == 0) goto L_0x0067
            r0 = 5
            X.FPB.A01(r1, r0, r12)
            return
        L_0x0120:
            r0 = r6
            goto L_0x009e
        L_0x0123:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0128:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x012d:
            boolean r0 = r1.A5G()
            if (r0 == 0) goto L_0x016b
            java.lang.String r0 = "reel"
        L_0x0135:
            r12.A04 = r0
        L_0x0137:
            java.lang.String r3 = r1.getId()
            if (r3 == 0) goto L_0x0174
            X.H1t r2 = new X.H1t
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 139(0x8b, float:1.95E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r3)
            r2.setArguments(r1)
            android.os.Bundle r1 = r2.mArguments
            if (r1 == 0) goto L_0x015d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.DbU.A1D(r1, r0)
        L_0x015d:
            X.0s1 r1 = X.DbW.A0C(r12)
            r0 = 2131429059(0x7f0b06c3, float:1.847978E38)
            r1.A0A(r2, r0)
            r1.A00()
            return
        L_0x016b:
            boolean r0 = r1.A5Y()
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "igtv"
            goto L_0x0135
        L_0x0174:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47487E4r.A00(X.E4r):void");
    }

    public static final void A01(C47487E4r e4r) {
        String str;
        SpinnerImageView spinnerImageView = e4r.A03;
        if (spinnerImageView == null) {
            str = "spinner";
        } else {
            DbS.A1T(spinnerImageView);
            0lg A0X = DbT.A0X(e4r.A0B);
            String str2 = e4r.A06;
            if (str2 == null) {
                str = "violationMediaId";
            } else {
                1NY A0M = DbZ.A0M(A0X);
                A0M.A0A(002.A0S("business/branded_content/bc_policy_violation/", AnonymousClass3VO.A02(str2), '/'));
                C47697EDg.A01(e4r, DbU.A0S(A0M, Dw6.class, C49748F4n.class), 5);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final boolean onBackPressed() {
        if (!isAdded()) {
            return true;
        }
        DbT.A1I(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-820194015);
        C47487E4r.super.onCreate(bundle);
        this.A06 = requireArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_VIOLATION_MEDIA_ID", "");
        this.A05 = requireArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_SOURCE", "");
        this.A09 = requireArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_ID", (String) null);
        this.A0A = requireArguments().getString("com.instagram.brandedcontent.violation.ARGUMENT_EXTRA_NOTIF_TUUID", (String) null);
        DbX.A0R(this.A0B).A01(this.A0C, C64679Lg6.class);
        AnonymousClass0fD.A09(-369349547, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1666807704);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.violation_alert_fragment, viewGroup, false);
        this.A07 = DbS.A0E(inflate, R.id.branded_content_violation_alert_list);
        this.A08 = (IgFrameLayout) inflate.findViewById(R.id.branded_content_preview);
        SpinnerImageView spinnerImageView = (SpinnerImageView) inflate.findViewById(R.id.preview_image_spinner);
        this.A03 = spinnerImageView;
        if (this.A01 == null) {
            A01(this);
        } else if (spinnerImageView == null) {
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        } else {
            spinnerImageView.setLoadingStatus(C255943uy.SUCCESS);
            A00(this);
        }
        AnonymousClass0fD.A09(-407527416, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1104911829);
        super.onDestroy();
        DbX.A0R(this.A0B).A02(this.A0C, C64679Lg6.class);
        AnonymousClass0fD.A09(-1059074310, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1926945658);
        C47487E4r.super.onPause();
        AnonymousClass3K2 A062 = 1OP.A06(requireActivity());
        if (A062 != null) {
            A062.A0S();
        }
        AnonymousClass0fD.A09(-909248502, A022);
    }

    public final void onResume() {
        View view;
        ViewTreeObserver viewTreeObserver;
        int A022 = AnonymousClass0fD.A02(1955058591);
        super.onResume();
        AnonymousClass3K2 A062 = 1OP.A06(requireActivity());
        if (!(A062 == null || !A062.A0Z() || (view = this.mView) == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new WCB(2, this, A062));
        }
        AnonymousClass0fD.A09(2053579386, A022);
    }
}
