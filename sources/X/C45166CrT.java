package X;

import com.instagram.feed.media.EffectPreview;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CrT  reason: case insensitive filesystem */
public abstract class C45166CrT {
    public static C45262CtQ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45262CtQ ctQ = new C45262CtQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                if ("effect_configs".equals(AnonymousClass7TE.A17(r4))) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            EffectPreview parseFromJson = C263064Hf.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    ctQ.A00 = arrayList;
                }
                r4.A0z();
            }
            return ctQ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
