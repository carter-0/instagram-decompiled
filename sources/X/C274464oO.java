package X;

import java.io.IOException;

/* renamed from: X.4oO  reason: invalid class name and case insensitive filesystem */
public abstract class C274464oO {
    public static C274534oW parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            C274514oU r3 = null;
            C274514oU r4 = null;
            C274514oU r5 = null;
            C274514oU r6 = null;
            C274514oU r7 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("media_destination".equals(A0q)) {
                    r3 = C274474oP.parseFromJson(r8);
                } else if ("ufi_like_destination".equals(A0q)) {
                    r4 = C274474oP.parseFromJson(r8);
                } else if ("ufi_reply_destination".equals(A0q)) {
                    r5 = C274474oP.parseFromJson(r8);
                } else if ("ufi_repost_destination".equals(A0q)) {
                    r6 = C274474oP.parseFromJson(r8);
                } else if ("ufi_reshare_destination".equals(A0q)) {
                    r7 = C274474oP.parseFromJson(r8);
                }
                r8.A0z();
            }
            return new C274534oW(r3, r4, r5, r6, r7);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
