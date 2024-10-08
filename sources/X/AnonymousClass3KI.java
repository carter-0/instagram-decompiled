package X;

import android.os.Build;
import java.io.File;
import java.util.TreeSet;

/* renamed from: X.3KI  reason: invalid class name */
public abstract class AnonymousClass3KI {
    public static final AnonymousClass3KK[] A00(AnonymousClass3KG r4) {
        if (Build.VERSION.SDK_INT < 29) {
            return new AnonymousClass3KK[]{new AnonymousClass3KK(r4, AnonymousClass3KJ.A01), new AnonymousClass3KK(r4, AnonymousClass3KJ.A02)};
        }
        AnonymousClass3KK r3 = new AnonymousClass3KK(r4, new File(AnonymousClass3KJ.A01));
        AnonymousClass3KK r2 = new AnonymousClass3KK(r4, new File(AnonymousClass3KJ.A02));
        File file = AnonymousClass3KJ.A00;
        if (file != null) {
            return new AnonymousClass3KK[]{r3, r2, new AnonymousClass3KK(r4, file)};
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final File[] A01(File[] fileArr, int i) {
        TreeSet treeSet = new TreeSet(new C41284ArP(C41765Azu.A00));
        for (File file : fileArr) {
            if (treeSet.size() > i) {
                File file2 = (File) treeSet.first();
                0qQ.A0A(file2);
                long lastModified = file2.lastModified();
                0qQ.A0A(file);
                if (lastModified < file.lastModified()) {
                    treeSet.pollFirst();
                }
            }
            treeSet.add(file);
        }
        Object[] array = treeSet.toArray(new File[treeSet.size()]);
        0qQ.A07(array);
        return (File[]) array;
    }
}
