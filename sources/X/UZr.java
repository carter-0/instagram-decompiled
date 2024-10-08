package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class UZr extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectAddYoursCameraFragment";
    public 28D A00 = 28D.A2D;
    public AnonymousClass80Q A01;
    public AnonymousClass80C A02;
    public final C41837B2s A03 = new WUO(2);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "direct_add_yours_camera_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0068, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r10.A04), 36324136150839120L) == false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r6 = 0
            X.0qQ.A0B(r11, r6)
            super.onViewCreated(r11, r12)
            android.os.Bundle r2 = r10.requireArguments()
            X.80C r0 = new X.80C
            r0.<init>()
            r10.A02 = r0
            r10.registerLifecycleListener(r0)
            r0 = 437(0x1b5, float:6.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.28D r0 = X.AnonymousClass7TH.A07(r2, r0)
            r10.A00 = r0
            r0 = 2131431713(0x7f0b1121, float:1.8485163E38)
            android.view.ViewGroup r9 = X.DbS.A0E(r11, r0)
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r5 = r2.getParcelable(r0)
            com.instagram.model.direct.camera.DirectCameraViewModel r5 = (com.instagram.model.direct.camera.DirectCameraViewModel) r5
            r0 = 798(0x31e, float:1.118E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r1)
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r0 = "UTF-8"
            java.lang.String r8 = java.net.URLDecoder.decode(r1, r0)
        L_0x004a:
            r0 = 1021(0x3fd, float:1.431E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L_0x006a
            X.0eM r0 = r10.A04
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324136150839120(0x810c9c000b2f50, double:3.034868195122293E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r7 = 1
            if (r0 != 0) goto L_0x006b
        L_0x006a:
            r7 = 0
        L_0x006b:
            X.80D r4 = new X.80D
            r4.<init>()
            X.B2s r0 = r10.A03
            r0.getClass()
            r4.A0l = r0
            X.0eM r0 = r10.A04
            X.C13992Tns.A0u(r10, r4, r0)
            X.80I r2 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r3 = 1
            X.80M r1 = X.AnonymousClass80M.A00
            X.AnonymousClass80D.A08(r0, r2, r1, r4)
            r4.A3h = r3
            X.2k2 r0 = r10.volumeKeyPressController
            r4.A0R = r0
            X.80C r0 = r10.A02
            X.C13991Tnr.A0v(r9, r4, r0)
            X.28D r0 = r10.A00
            r4.A0B = r0
            r4.A0O = r10
            r4.A3H = r3
            r4.A1I = r5
            r4.A3Q = r3
            r4.A3G = r3
            r4.A3i = r3
            r4.A3t = r6
            r4.A3s = r3
            r4.A44 = r6
            r4.A47 = r3
            r4.A3L = r6
            r0 = 3
            r4.A03 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4.A28 = r0
            r4.A3b = r3
            r4.A2O = r8
            r4.A46 = r7
            r4.A3J = r3
            X.8aL[] r0 = new X.C358088aL[r6]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r2 = X.C358098aM.A00(r1, r0)
            if (r5 == 0) goto L_0x00cc
            int r1 = r5.A00
            r0 = 9
            if (r1 != r0) goto L_0x00cc
            r2.A02 = r3
        L_0x00cc:
            r4.A0V = r2
            X.Wn3 r0 = new X.Wn3
            r0.<init>(r4, r10)
            X.AnonymousClass7TF.A17(r10, r0)
            return
        L_0x00d7:
            r8 = 0
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZr.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A01;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(266301787);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(502099686, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2033973308);
        super.onDestroyView();
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        AnonymousClass80C r0 = this.A02;
        if (r0 != null) {
            r0.onDestroyView();
        }
        this.A02 = null;
        AnonymousClass0fD.A09(-1809811321, A022);
    }
}
