package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import java.io.IOException;

/* renamed from: X.Enh  reason: case insensitive filesystem */
public abstract class C49005Enh {
    public static ProductOnboardingNextStepInfo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ProductOnboardingNextStepInfo productOnboardingNextStepInfo = new ProductOnboardingNextStepInfo();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("index".equals(A17)) {
                    productOnboardingNextStepInfo.A00 = r3.A1D();
                } else if ("step".equals(A17)) {
                    productOnboardingNextStepInfo.A02 = AnonymousClass7TG.A0l(r3);
                } else if (ReactProgressBarViewManager.PROP_PROGRESS.equals(A17)) {
                    productOnboardingNextStepInfo.A01 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return productOnboardingNextStepInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
