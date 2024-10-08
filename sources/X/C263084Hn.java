package X;

import com.instagram.feed.media.EffectActionSheet;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4Hn  reason: invalid class name and case insensitive filesystem */
public abstract class C263084Hn {
    public static EffectActionSheet parseFromJson(16F r8) {
        String A1P;
        String A1P2;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("primary_actions".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            if (!(r8.A11() == 16L.A0G || (A1P2 = r8.A1P()) == null)) {
                                arrayList.add(A1P2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("secondary_actions".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            if (!(r8.A11() == 16L.A0G || (A1P = r8.A1P()) == null)) {
                                arrayList2.add(A1P);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("primary_actions", "EffectActionSheet");
            } else if (arrayList2 != null || !(r8 instanceof 0c9)) {
                return new EffectActionSheet(arrayList, arrayList2);
            } else {
                ((0c9) r8).A03.A00("secondary_actions", "EffectActionSheet");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
