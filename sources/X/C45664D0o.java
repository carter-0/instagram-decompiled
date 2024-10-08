package X;

import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import java.io.IOException;

/* renamed from: X.D0o  reason: case insensitive filesystem */
public abstract class C45664D0o {
    public static C61080JwI parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            C61080JwI jwI = new C61080JwI(45);
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("graduation_strategy".equals(AnonymousClass7TE.A17(r3))) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    MediaTrialGraduationStrategy mediaTrialGraduationStrategy = (MediaTrialGraduationStrategy) MediaTrialGraduationStrategy.A01.get(str);
                    if (mediaTrialGraduationStrategy == null) {
                        mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.UNRECOGNIZED;
                    }
                    jwI.A00 = mediaTrialGraduationStrategy;
                }
                r3.A0z();
            }
            return jwI;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(C61080JwI jwI, 17Z r2) {
        r2.A0c();
        MediaTrialGraduationStrategy mediaTrialGraduationStrategy = (MediaTrialGraduationStrategy) jwI.A00;
        if (mediaTrialGraduationStrategy != null) {
            r2.A0R("graduation_strategy", mediaTrialGraduationStrategy.A00);
        }
        r2.A0Z();
    }
}
