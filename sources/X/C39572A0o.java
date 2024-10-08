package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.A0o  reason: case insensitive filesystem */
public abstract class C39572A0o {
    public static C384659hg parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(4796).equals(A17)) {
                    r1.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("fundraiser_id".equals(A17)) {
                    r1.A06 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(4448).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
                } else if ("time_left".equals(A17)) {
                    r1.A09 = AnonymousClass7TG.A0l(r4);
                } else if (C273654mx.A00(76).equals(A17)) {
                    r1.A00 = 1Xj.A00(r4);
                } else if ("bloks_app".equals(A17)) {
                    if (r4.A11() != 16L.A0G) {
                        r4.A1P();
                    }
                } else if ("sticker_description".equals(A17)) {
                    r1.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("nonprofit_beneficiary".equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    r1.A01 = 1aC.A00(r4, false);
                } else if ("charity_name".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("beneficiary_photo_url".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(261).equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r4);
                } else {
                    1XY.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
