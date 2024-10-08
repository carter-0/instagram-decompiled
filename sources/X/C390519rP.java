package X;

import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.9rP  reason: invalid class name and case insensitive filesystem */
public final class C390519rP extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelPollShareResultCameraFragment";
    public RectF A00;
    public 28D A01 = 28D.A5J;
    public 1Xj A02;
    public File A03;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 0);
        1Xj r3 = this.A02;
        if (r3 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int A09 = AnonymousClass7TG.A09(r3);
        File file = this.A03;
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            0qQ.A07(absolutePath);
            long A0P = AnonymousClass7TE.A0P(currentTimeMillis);
            File file2 = this.A03;
            if (file2 != null) {
                Medium medium = new Medium(Uri.fromFile(file2), absolutePath, 0, A09, 0, 0, A0P, currentTimeMillis);
                AnonymousClass80D A002 = AnonymousClass80D.A00();
                AnonymousClass80D.A0F(A002, this);
                AnonymousClass80I r2 = AnonymousClass80H.A02;
                UserSession userSession = this.A00;
                0qQ.A06(userSession);
                AnonymousClass80D.A09(userSession, r2, A002, this);
                A002.A09 = viewGroup2;
                A002.A0B = this.A01;
                A002.A0O = this;
                AnonymousClass80D.A04(this.A00, A002, false, true);
                A002.A3H = true;
                A002.A3y = true;
                AnonymousClass80D.A0A(A002);
                A002.A0P = medium;
                A002.A0w = null;
                A002.A0x = new C3498382a(r3);
                A002.A3Q = true;
                return A002;
            }
        }
        0qQ.A0F("mediaFile");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "reel_poll_share_result_camera_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(365150284);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AnonymousClass7TH.A07(requireArguments, AnonymousClass000.A00(2460));
        this.A00 = (RectF) requireArguments.getParcelable(AnonymousClass000.A00(2461));
        this.A02 = AnonymousClass7TH.A0B(this, requireArguments.getString(AnonymousClass000.A00(2463)));
        String string = requireArguments.getString(AnonymousClass000.A00(2462));
        if (string != null) {
            this.A03 = AnonymousClass7TE.A0t(string);
            AnonymousClass0fD.A09(1908467804, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1436678609, A022);
        throw A0y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.exists() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r2 = this;
            r0 = -1800396180(0xffffffff94b0226c, float:-1.7785036E-26)
            int r1 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x0022
            java.io.File r0 = r2.A03
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "mediaFile"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            X.VJ3.A00(r2)
        L_0x0025:
            r0 = -147423081(0xfffffffff7368097, float:-3.7015865E33)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390519rP.onResume():void");
    }
}
