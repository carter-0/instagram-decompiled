package X;

import java.io.IOException;
import java.util.ArrayList;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;
import libraries.fxcallauncher.model.FxUnifiedLauncherCallbackInfo;

/* renamed from: X.EsA  reason: case insensitive filesystem */
public abstract class C49267EsA {
    public static FxUnifiedLauncherCallbackInfo parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            FxUnifiedLauncherCallbackInfo fxUnifiedLauncherCallbackInfo = new FxUnifiedLauncherCallbackInfo();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("tokenString".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    fxUnifiedLauncherCallbackInfo.A01 = A0l;
                } else if ("addedAccounts".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            FxUnifiedLauncherAddedAccount parseFromJson = C49266Es9.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    fxUnifiedLauncherCallbackInfo.A03 = arrayList;
                } else if ("userID".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    fxUnifiedLauncherCallbackInfo.A02 = A0l2;
                } else if ("obId".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l3, 0);
                    fxUnifiedLauncherCallbackInfo.A00 = A0l3;
                }
                r5.A0z();
            }
            return fxUnifiedLauncherCallbackInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
