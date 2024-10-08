package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class OR5 {
    /* JADX WARNING: type inference failed for: r5v0, types: [X.Gyv, X.Nfa] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.Nfh, java.lang.Object, X.Mfb] */
    public static C69151Nfa parseFromJson(16F r7) {
        ArrayList arrayList;
        0qQ.A0B(r7, 0);
        try {
            ? gyv = new C54072Gyv();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (DialogModule.KEY_ITEMS.equals(A17)) {
                    ArrayList arrayList2 = null;
                    if (r7.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C18072Vl0 parseFromJson = C18226Vnq.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    gyv.A00 = arrayList2;
                } else {
                    C55140Hco.A00(r7, gyv, A17);
                }
                r7.A0z();
            }
            List<C18072Vl0> list = gyv.A00;
            if (list != null) {
                arrayList = AnonymousClass7TG.A0r(list);
                for (C18072Vl0 vl0 : list) {
                    0qQ.A0B(vl0, 1);
                    ? mfb = new C66942Mfb(2);
                    mfb.A00 = vl0;
                    arrayList.add(mfb);
                }
            } else {
                arrayList = 0sn.A00;
            }
            0qQ.A0B(arrayList, 0);
            gyv.A09 = arrayList;
            return gyv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
