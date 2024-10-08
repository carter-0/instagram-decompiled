package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.android.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.E4q  reason: case insensitive filesystem */
public final class C47486E4q extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C51875G5m, C230792qH {
    public static final String __redex_internal_original_name = "BrandedContentApproveMediaFragment";
    public RectF A00;
    public ViewGroup A01;
    public SpinnerImageView A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void DR2(C270374gd r1) {
    }

    public final void DR3(C270374gd r1) {
    }

    public final void DcR(C50901Fkg fkg, Reel reel, List list) {
        HashSet A1F = AnonymousClass7TE.A1F();
        String str = this.A06;
        if (str == null) {
            0qQ.A0F("mediaId");
            throw AnonymousClass00P.createAndThrow();
        }
        A1F.add(str);
        this.A00 = 0nA.A0F(fkg.A06);
        AnonymousClass3K2 A072 = 1OP.A07(requireActivity(), AnonymousClass7TE.A0l(this.A07));
        RectF rectF = this.A00;
        if (rectF != null) {
            Reel reel2 = reel;
            A072.A0U((RectF) null, rectF, this, reel2, AnonymousClass3BQ.BRANDED_CONTENT, new FkR(0, this, reel2, A1F), (String) null, (List) null, -1, true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131969154);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final void A00(C47486E4q e4q) {
        SpinnerImageView spinnerImageView = e4q.A02;
        if (spinnerImageView == null) {
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        DbS.A1T(spinnerImageView);
        AnonymousClass7TE.A1Z(new MH8((Object) e4q, (AnonymousClass4D7) null, 14), DbV.A0J(e4q));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if (r0 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        if (r0 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        X.JVF.A04(r11, r4, r3, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DR1(X.C17633VbP r12, X.C270374gd r13) {
        /*
            r11 = this;
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r11.A02
            r3 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r10 = "spinner"
        L_0x0007:
            X.0qQ.A0F(r10)
        L_0x000a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000f:
            X.DbS.A1T(r0)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "branded_content_pending_tag_accept"
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r9 = "creatorId"
            java.lang.String r10 = "entryPoint"
            java.lang.String r8 = "mediaId"
            java.lang.String r5 = "entrypoint"
            java.lang.String r6 = "media_id"
            java.lang.String r7 = "action_type"
            if (r0 == 0) goto L_0x0060
            X.0xx r2 = X.DbV.A0J(r11)
            r1 = 15
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r11, (X.AnonymousClass4D7) r3, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            X.0eM r0 = r11.A07
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A03
            r0 = 2619(0xa3b, float:3.67E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r7, r0)
            java.lang.String r0 = r11.A06
            if (r0 == 0) goto L_0x009f
            X.0eP r1 = X.AnonymousClass7TE.A1L(r6, r0)
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x0007
            java.util.LinkedHashMap r1 = X.DbY.A0q(r5, r0, r2, r1)
            java.lang.String r0 = r11.A03
            if (r0 != 0) goto L_0x00a4
        L_0x005c:
            X.0qQ.A0F(r9)
            goto L_0x000a
        L_0x0060:
            java.lang.String r1 = r12.A01
            java.lang.String r0 = "branded_content_pending_tag_reject"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a7
            X.0xx r2 = X.DbV.A0J(r11)
            r1 = 16
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r11, (X.AnonymousClass4D7) r3, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            X.0eM r0 = r11.A07
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A03
            r0 = 2977(0xba1, float:4.172E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r7, r0)
            java.lang.String r0 = r11.A06
            if (r0 == 0) goto L_0x009f
            X.0eP r1 = X.AnonymousClass7TE.A1L(r6, r0)
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x0007
            java.util.LinkedHashMap r1 = X.DbY.A0q(r5, r0, r2, r1)
            java.lang.String r0 = r11.A03
            if (r0 != 0) goto L_0x00a4
            goto L_0x005c
        L_0x009f:
            X.0qQ.A0F(r8)
            goto L_0x000a
        L_0x00a4:
            X.JVF.A04(r11, r4, r3, r0, r1)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47486E4q.DR1(X.VbP, X.4gd):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean onBackPressed() {
        DbT.A1I(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1663580439);
        C47486E4q.super.onCreate(bundle);
        this.A06 = C320236s2.A01(requireArguments(), AnonymousClass000.A00(4304));
        this.A04 = C320236s2.A01(requireArguments(), Dbp.A01());
        this.A03 = C320236s2.A01(requireArguments(), AnonymousClass000.A00(2081));
        this.A05 = C320236s2.A01(requireArguments(), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        AnonymousClass0fD.A09(584884575, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(767701589);
        0qQ.A0B(layoutInflater, 0);
        C47486E4q.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.violation_alert_fragment, false);
        this.A01 = DbS.A0E(A09, R.id.branded_content_violation_alert_list);
        this.A02 = (SpinnerImageView) A09.findViewById(R.id.preview_image_spinner);
        A00(this);
        AnonymousClass0fD.A09(-1095375345, A022);
        return A09;
    }

    public final void onResume() {
        View view;
        ViewTreeObserver viewTreeObserver;
        int A022 = AnonymousClass0fD.A02(-291522482);
        super.onResume();
        AnonymousClass3K2 A062 = 1OP.A06(requireActivity());
        if (!(A062 == null || !A062.A0Z() || (view = this.mView) == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(new WCB(1, this, A062));
        }
        AnonymousClass0fD.A09(-24996400, A022);
    }
}
