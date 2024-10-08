package X;

import java.io.File;
import java.io.IOException;
import java.util.Set;

/* renamed from: X.42X  reason: invalid class name */
public final class AnonymousClass42X extends 0ng {
    public final /* synthetic */ 2Nn A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ Set A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42X(2Nn r4, Set set, Set set2) {
        super(96, 5, false, false);
        this.A00 = r4;
        this.A02 = set;
        this.A01 = set2;
    }

    public final void run() {
        File[] listFiles;
        try {
            File A012 = this.A00.A01();
            Set set = this.A02;
            Set set2 = this.A01;
            if (A012.exists() && (listFiles = A012.listFiles()) != null) {
                for (File file : listFiles) {
                    if (!file.isDirectory()) {
                        file.delete();
                    } else if (!set.contains(file.getName())) {
                        0mb.A01(new AWP(set2), file.getPath(), (Set) null);
                    }
                }
            }
        } catch (IOException unused) {
        }
    }
}
