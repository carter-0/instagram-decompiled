package X;

import java.util.ArrayList;
import java.util.List;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;

/* renamed from: X.Ebb  reason: case insensitive filesystem */
public abstract class C48256Ebb {
    public String A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;

    public final List A00() {
        List list = this.A03;
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                if (0qQ.A0K(((FxUnifiedLauncherAddedAccount) next).A00, "FACEBOOK")) {
                    A1C.add(next);
                }
            }
            return A1C;
        }
        0qQ.A0F("addedAccounts");
        throw AnonymousClass00P.createAndThrow();
    }
}
