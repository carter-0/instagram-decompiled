package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CfP  reason: case insensitive filesystem */
public abstract class C44467CfP {
    public static C61080JwI parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (r6.A1J() != 16L.A09) {
                if (C41846B3n.A1b(r6, "prompts_info")) {
                    if (r6.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r6.A1J() != 16L.A08) {
                            BHV parseFromJson = C44462CfK.parseFromJson(r6);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r6.A0z();
            }
            if (arrayList != null || !(r6 instanceof 0c9)) {
                return new C61080JwI((List) arrayList, 20);
            }
            AnonymousClass7TF.A1L("prompts_info", r6, "StoryTrendingPromptsFeaturedInjectedPromptsResponse");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
