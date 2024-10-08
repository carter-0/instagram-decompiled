package X;

import java.io.IOException;

/* renamed from: X.Kvt  reason: case insensitive filesystem */
public abstract class C63372Kvt {
    public static C60895JtF parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C60895JtF jtF = new C60895JtF();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("pts_us".equals(A17)) {
                    jtF.A04 = r4.A0y();
                } else if ("compare_pts_us".equals(A17)) {
                    jtF.A03 = r4.A0y();
                } else if ("frame_index".equals(A17)) {
                    jtF.A02 = r4.A1D();
                } else if ("compare_frame_index".equals(A17)) {
                    jtF.A01 = r4.A1D();
                } else if (C273654mx.A00(749).equals(A17)) {
                    jtF.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("compare_image_path".equals(A17)) {
                    jtF.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("ssim_score".equals(A17)) {
                    jtF.A00 = (float) r4.A0U();
                }
                r4.A0z();
            }
            return jtF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
