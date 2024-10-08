package X;

import java.io.IOException;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;

/* renamed from: X.Es9  reason: case insensitive filesystem */
public abstract class C49266Es9 {
    public static FxUnifiedLauncherAddedAccount parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            FxUnifiedLauncherAddedAccount fxUnifiedLauncherAddedAccount = new FxUnifiedLauncherAddedAccount();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("userID".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    fxUnifiedLauncherAddedAccount.A02 = A0l;
                } else if ("obId".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    fxUnifiedLauncherAddedAccount.A01 = A0l2;
                } else if ("account_type".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    fxUnifiedLauncherAddedAccount.A00 = A0l3;
                }
                r4.A0z();
            }
            return fxUnifiedLauncherAddedAccount;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
