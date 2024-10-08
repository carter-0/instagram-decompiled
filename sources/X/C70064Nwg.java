package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nwg  reason: case insensitive filesystem */
public abstract class C70064Nwg {
    public static C70700OGv parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C70700OGv oGv = new C70700OGv();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("poll_id".equals(A17)) {
                    oGv.A03 = AnonymousClass7TG.A0l(r5);
                } else if ("poll_question".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    oGv.A04 = A0l;
                } else if ("poll_author_picture".equals(A17)) {
                    oGv.A00 = 16h.A00(r5);
                } else if (AnonymousClass000.A00(5122).equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C70622ODt parseFromJson = C70063Nwf.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    oGv.A05 = arrayList;
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    oGv.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("action_log".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    oGv.A01 = A0l2;
                }
                r5.A0z();
            }
            return oGv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
