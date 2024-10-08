package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cm2  reason: case insensitive filesystem */
public abstract class C44852Cm2 {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.DHR, java.lang.Object] */
    public static DHR parseFromJson(16F r4) {
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
                if ("item_id".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                } else {
                    if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if (C66579MXk.A00(39).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        obj.A01 = arrayList;
                    } else if ("timestamp".equals(A17)) {
                        r4.A0y();
                    } else if ("client_context".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("canonical".equals(A17)) {
                        r4.A0d();
                    }
                    r4.A1P();
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
