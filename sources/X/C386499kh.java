package X;

import java.io.File;

/* renamed from: X.9kh  reason: invalid class name and case insensitive filesystem */
public final class C386499kh extends 0ng {
    public final /* synthetic */ AnonymousClass8HG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386499kh(AnonymousClass8HG r4) {
        super(78, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        File file = AnonymousClass457.A01;
        if (file == null) {
            file = AnonymousClass1F2.A00().AXT((1LJ) null, 2066873147);
            AnonymousClass457.A01 = file;
        }
        File A0t = AnonymousClass7TE.A0t(file.getAbsolutePath());
        if (A0t.isDirectory() && A0t.listFiles() != null) {
            for (File delete : A0t.listFiles()) {
                delete.delete();
            }
        }
    }
}
