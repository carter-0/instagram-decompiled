package X;

import java.io.File;
import java.util.ArrayList;

/* renamed from: X.3rO  reason: invalid class name and case insensitive filesystem */
public abstract class C253773rO {
    public static 01r A00(ArrayList arrayList, ArrayList arrayList2) {
        File file;
        int size = arrayList.size();
        if (size == arrayList2.size()) {
            01r r4 = new 01r(size);
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList2.get(i);
                Object obj = arrayList.get(i);
                if (str != null) {
                    file = new File(str);
                } else {
                    file = null;
                }
                r4.put(obj, file);
            }
            return r4;
        }
        throw new IllegalArgumentException(002.A02(size, arrayList2.size(), "processes has ", "; newestFilesUploaded has "));
    }
}
