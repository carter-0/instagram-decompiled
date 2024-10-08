package X;

import android.os.Bundle;
import com.instagram.user.model.User;
import java.io.File;

/* renamed from: X.9rJ  reason: invalid class name and case insensitive filesystem */
public final class C390459rJ extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelDirectVisualMessageShareCameraFragment";
    public 28D A00;
    public 1iA A01 = 1iA.A0a;
    public User A02;
    public File A03;
    public File A04;
    public boolean A05 = true;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass80D A02(android.view.ViewGroup r10) {
        /*
            r9 = this;
            r3 = 0
            X.0qQ.A0B(r10, r3)
            java.io.File r2 = r9.A04
            if (r2 == 0) goto L_0x008e
            boolean r1 = r9.A05
            r6 = 1
            r0 = 1
            if (r1 == 0) goto L_0x000f
            r0 = 3
        L_0x000f:
            com.instagram.common.gallery.Medium r8 = X.C282665Eg.A03(r2, r0, r3)
            android.content.Context r1 = r9.requireContext()
            int r0 = X.0nA.A09(r1)
            float r3 = (float) r0
            int r0 = X.0nA.A08(r1)
            float r1 = (float) r0
            r0 = 0
            android.graphics.RectF r7 = X.AnonymousClass7TF.A0C(r3, r1)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r0, r0, r3, r1)
            java.io.File r3 = r9.A04
            com.instagram.common.session.UserSession r1 = r9.A00
            boolean r0 = r8.CeS()
            com.instagram.common.util.gradient.BackgroundGradientColors r0 = X.C39581A0x.A00(r1, r3, r0)
            r8.A0H = r0
            r5 = 0
            java.io.File r0 = r9.A03     // Catch:{ IOException -> 0x0043 }
            if (r0 == 0) goto L_0x008c
            java.lang.String r4 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0043 }
            goto L_0x004b
        L_0x0043:
            java.io.File r0 = r9.A03
            if (r0 == 0) goto L_0x008c
            java.lang.String r4 = r0.getAbsolutePath()
        L_0x004b:
            X.80D r3 = X.AnonymousClass80D.A00()
            X.AnonymousClass80D.A0F(r3, r9)
            X.80I r1 = X.AnonymousClass80H.A02
            com.instagram.common.session.UserSession r0 = r9.A00
            X.0qQ.A06(r0)
            X.AnonymousClass80D.A09(r0, r1, r3, r9)
            r3.A09 = r10
            X.28D r0 = r9.A00
            r3.A0B = r0
            r3.A0O = r9
            X.AnonymousClass80D.A02(r7, r2, r3)
            r3.A3y = r6
            X.AnonymousClass80D.A0A(r3)
            r3.A0P = r8
            r3.A0w = r5
            com.instagram.user.model.User r2 = r9.A02
            if (r2 == 0) goto L_0x0081
            X.1iA r1 = r9.A01
            X.1iA r0 = X.1iA.A0a
            boolean r0 = r1.equals(r0)
            X.82c r5 = new X.82c
            r5.<init>(r2, r4, r0)
        L_0x0081:
            r3.A19 = r5
            r3.A3Q = r6
            java.lang.String r0 = "activity_tab"
            r3.A2e = r0
            r3.A3U = r6
            return r3
        L_0x008c:
            r4 = r5
            goto L_0x004b
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390459rJ.A02(android.view.ViewGroup):X.80D");
    }

    public final String getModuleName() {
        return "reel_direct_visual_message_share_camera_fragment";
    }

    public final void onCreate(Bundle bundle) {
        28D r3;
        int A022 = AnonymousClass0fD.A02(1159947876);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get(C66579MXk.A00(599));
        if (!(obj instanceof 28D) || (r3 = (28D) obj) == null) {
            r3 = 28D.A5J;
        }
        this.A00 = r3;
        requireArguments.getString(C66579MXk.A00(602));
        String string = requireArguments.getString(C66579MXk.A00(605));
        if (string != null) {
            this.A02 = 17h.A00(AnonymousClass7TE.A0k(this)).A02(string);
        }
        String string2 = requireArguments.getString(C66579MXk.A00(600));
        if (string2 != null) {
            this.A03 = AnonymousClass7TE.A0t(string2);
        }
        1iA A002 = 1i9.A00(Integer.valueOf(requireArguments.getInt(C66579MXk.A00(601))));
        if (A002 == null) {
            A002 = this.A01;
        }
        this.A01 = A002;
        String string3 = requireArguments.getString(C66579MXk.A00(603));
        if (string3 != null) {
            this.A04 = AnonymousClass7TE.A0t(string3);
        }
        this.A05 = requireArguments.getBoolean(C66579MXk.A00(604));
        AnonymousClass0fD.A09(-1538594101, A022);
    }
}
