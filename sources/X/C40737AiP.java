package X;

import java.io.File;

/* renamed from: X.AiP  reason: case insensitive filesystem */
public final class C40737AiP implements Runnable {
    public final /* synthetic */ String A00;

    public C40737AiP(String str) {
        this.A00 = str;
    }

    public final void run() {
        File A0t = AnonymousClass7TE.A0t(this.A00);
        if (A0t.exists() && A0t.getParent() != null) {
            File A0t2 = AnonymousClass7TE.A0t(A0t.getParent());
            if (A0t2.exists() && A0t2.isDirectory()) {
                File[] listFiles = A0t2.listFiles();
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
                A0t2.delete();
            }
        }
    }
}
