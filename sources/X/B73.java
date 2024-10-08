package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

public final class B73 {
    public static B72 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            B72 b72 = new B72();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("inbox".equals(A0q)) {
                    b72.A05 = C370508wa.parseFromJson(r4);
                } else if ("spam_requests_total".equals(A0q)) {
                    b72.A00 = r4.A1D();
                } else if ("megaphone".equals(A0q)) {
                    b72.A08 = C48989EnR.parseFromJson(r4);
                } else if ("seq_id".equals(A0q)) {
                    b72.A01 = r4.A0y();
                } else if ("snapshot_at_ms".equals(A0q)) {
                    b72.A02 = r4.A0y();
                } else if ("viewer".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    b72.A09 = 1aC.A00(r4, true);
                } else if ("notes".equals(A0q)) {
                    b72.A03 = C272154kD.parseFromJson(r4);
                } else if ("inbox_nudge_thread".equals(A0q)) {
                    b72.A04 = C44682Cj1.parseFromJson(r4);
                } else if ("creator_bundle_hmr_change_notice".equals(A0q)) {
                    b72.A07 = C44723Cjr.parseFromJson(r4);
                } else if ("latest_story_request_info".equals(A0q)) {
                    b72.A06 = C44722Cjq.parseFromJson(r4);
                } else {
                    1XY.A01(r4, b72, A0q);
                }
                r4.A0z();
            }
            return b72;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
