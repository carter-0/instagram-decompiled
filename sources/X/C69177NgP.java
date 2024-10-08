package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;

/* renamed from: X.NgP  reason: case insensitive filesystem */
public final class C69177NgP extends C47518E6c {
    public static final String __redex_internal_original_name = "FullscreenBannerFragment";
    public FullscreenBannerViewModel A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        FullscreenBannerViewModel fullscreenBannerViewModel = this.A00;
        if (fullscreenBannerViewModel == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        } else {
            bundle.putParcelable("BANNER_VIEW_MODEL", fullscreenBannerViewModel);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e0, code lost:
        if (r2 <= 0) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r10 = 0
            r1 = r17
            X.0qQ.A0B(r1, r10)
            r5 = r16
            r0 = r18
            super.onViewCreated(r1, r0)
            android.content.Context r0 = r5.getContext()
            int r0 = X.2Yu.A02(r0)
            r1.setBackgroundResource(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel r0 = r5.A00
            java.lang.String r8 = "viewModel"
            if (r0 == 0) goto L_0x0123
            java.lang.Integer r1 = r0.A00
            if (r1 == 0) goto L_0x00f8
            android.content.Context r0 = r5.requireContext()
            android.graphics.drawable.Drawable r1 = X.JTP.A0E(r0, r1)
        L_0x002e:
            if (r1 == 0) goto L_0x0038
            X.OTE r0 = new X.OTE
            r0.<init>((android.graphics.drawable.Drawable) r1)
            r3.add(r0)
        L_0x0038:
            com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel r0 = r5.A00
            if (r0 == 0) goto L_0x0123
            java.lang.String r6 = r0.A03
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r11 = r1.getDimensionPixelSize(r0)
            int r13 = X.Dbb.A07(r5, r0)
            android.content.res.Resources r0 = X.DbV.A05(r5)
            r1 = 2131165203(0x7f070013, float:1.7944616E38)
            int r14 = r0.getDimensionPixelSize(r1)
            int r15 = X.Dbb.A07(r5, r1)
            X.F0T r9 = new X.F0T
            r12 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4 = 2132018636(0x7f1405cc, float:1.9675584E38)
            if (r6 == 0) goto L_0x0075
            X.FAZ r2 = new X.FAZ
            r2.<init>((java.lang.CharSequence) r6)
            r0 = 1
            r2.A01 = r0
            r2.A03 = r4
            r2.A05 = r9
            r3.add(r2)
        L_0x0075:
            com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel r0 = r5.A00
            if (r0 == 0) goto L_0x0123
            java.lang.String r7 = r0.A02
            android.content.res.Resources r0 = X.DbV.A05(r5)
            r6 = 2131165205(0x7f070015, float:1.794462E38)
            int r13 = r0.getDimensionPixelSize(r6)
            int r14 = X.Dbb.A07(r5, r1)
            int r15 = X.Dbb.A07(r5, r1)
            X.F0T r9 = new X.F0T
            r11 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4 = 2132018624(0x7f1405c0, float:1.967556E38)
            if (r7 == 0) goto L_0x00a8
            X.FAZ r2 = new X.FAZ
            r2.<init>((java.lang.CharSequence) r7)
            r0 = 1
            r2.A01 = r0
            r2.A03 = r4
            r2.A05 = r9
            r3.add(r2)
        L_0x00a8:
            com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel r0 = r5.A00
            if (r0 == 0) goto L_0x0123
            java.util.List r0 = r0.A04
            java.util.Iterator r8 = r0.iterator()
        L_0x00b2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r2 = r8.next()
            com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel$SectionBulletPoint r2 = (com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel.SectionBulletPoint) r2
            java.lang.Integer r4 = r2.A00
            if (r4 == 0) goto L_0x00eb
            java.lang.String r7 = r2.A03
            java.lang.String r2 = r2.A02
            android.content.Context r0 = r5.requireContext()
            android.graphics.drawable.Drawable r0 = X.JTP.A0E(r0, r4)
        L_0x00ce:
            if (r7 == 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            X.OFh r4 = new X.OFh
            r4.<init>(r0, r7, r2)
            if (r2 == 0) goto L_0x00e2
            int r2 = r2.length()
            r0 = 2132018631(0x7f1405c7, float:1.9675574E38)
            if (r2 > 0) goto L_0x00e5
        L_0x00e2:
            r0 = 2132018625(0x7f1405c1, float:1.9675562E38)
        L_0x00e5:
            r4.A00 = r0
            r3.add(r4)
            goto L_0x00b2
        L_0x00eb:
            java.lang.String r0 = r2.A01
            android.graphics.drawable.Drawable r0 = r5.A06(r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r7 = r2.A03
            java.lang.String r2 = r2.A02
            goto L_0x00ce
        L_0x00f8:
            java.lang.String r0 = r0.A01
            android.graphics.drawable.Drawable r1 = r5.A06(r0)
            goto L_0x002e
        L_0x0100:
            r5.setItems(r3)
            X.3Ar r0 = r5.getScrollingViewProxy()
            android.view.ViewGroup r4 = r0.CEd()
            int r3 = X.Dbb.A07(r5, r1)
            android.content.res.Resources r0 = X.DbV.A05(r5)
            int r2 = r0.getDimensionPixelSize(r6)
            int r1 = X.Dbb.A07(r5, r1)
            int r0 = r5.getBottomPadding()
            r4.setPadding(r3, r2, r1, r0)
            return
        L_0x0123:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69177NgP.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final Drawable A06(String str) {
        String queryParameter;
        int i;
        if (str == null) {
            return null;
        }
        Uri A09 = DbT.A09(str);
        if (!"ls".equals(A09.getScheme()) || (queryParameter = A09.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) == null) {
            return null;
        }
        switch (queryParameter.hashCode()) {
            case -2062403837:
                if (queryParameter.equals("warning-pano")) {
                    i = R.drawable.instagram_warning_pano_outline_24;
                    break;
                } else {
                    return null;
                }
            case -1168125356:
                if (queryParameter.equals("delete-pano")) {
                    i = R.drawable.instagram_delete_pano_outline_24;
                    break;
                } else {
                    return null;
                }
            case -353460394:
                if (queryParameter.equals("shield-pano")) {
                    i = R.drawable.instagram_shield_pano_outline_24;
                    break;
                } else {
                    return null;
                }
            case 1176723660:
                if (queryParameter.equals("illo-heart-circle-refresh")) {
                    i = R.drawable.ig_illustrations_illo_heart_circle_refresh;
                    break;
                } else {
                    return null;
                }
            case 1185340721:
                if (queryParameter.equals("info-pano")) {
                    i = R.drawable.instagram_info_pano_outline_24;
                    break;
                } else {
                    return null;
                }
            case 1884213401:
                if (queryParameter.equals("heart-pano")) {
                    i = R.drawable.instagram_heart_pano_outline_24;
                    break;
                } else {
                    return null;
                }
            case 2071845985:
                if (queryParameter.equals("illo-messages-refresh")) {
                    i = R.drawable.ig_illustrations_illo_messages_refresh;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            return null;
        }
        return AnonymousClass2dd.A00(DbV.A05(this), valueOf.intValue());
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1041735554);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A00 = (FullscreenBannerViewModel) C320236s2.A00(bundle, FullscreenBannerViewModel.class, "BANNER_VIEW_MODEL");
        AnonymousClass0fD.A09(-670486298, A02);
    }
}
