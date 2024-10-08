package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDg  reason: case insensitive filesystem */
public abstract class C16980VDg {
    public static C17438VVr parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17438VVr vVr = new C17438VVr();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("customized_token".equals(A17)) {
                    vVr.A00 = AnonymousClass7TG.A0l(r4);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    vVr.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("next_question_choices".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17437VVq parseFromJson = C16979VDf.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vVr.A02 = arrayList;
                }
                r4.A0z();
            }
            return vVr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
