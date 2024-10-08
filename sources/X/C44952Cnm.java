package X;

import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cnm  reason: case insensitive filesystem */
public abstract class C44952Cnm {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.CvT, java.lang.Object] */
    public static C45387CvT parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("product_type".equals(A17)) {
                    obj.A00 = C272504kq.A00(AnonymousClass7TG.A0l(r4));
                } else if ("is_eligible_for_partner_program_onboarding".equals(A17)) {
                    r4.A0d();
                } else if ("next_steps".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            ProductOnboardingNextStepInfo parseFromJson = C49005Enh.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("onboarding_intro_video_url".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("tax_information_country_string".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
