package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDh  reason: case insensitive filesystem */
public abstract class C16981VDh {
    public static C17439VVs parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17439VVs vVs = new C17439VVs();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("customized_token".equals(A17)) {
                    vVs.A00 = AnonymousClass7TG.A0l(r4);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    vVs.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("next_question_choices".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17438VVr parseFromJson = C16980VDg.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vVs.A02 = arrayList;
                }
                r4.A0z();
            }
            return vVs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
