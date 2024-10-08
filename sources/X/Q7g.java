package X;

import android.os.FileObserver;

public final class Q7g extends FileObserver {
    public final /* synthetic */ String A00;

    public final void onEvent(int i, String str) {
        String str2;
        if (str != null && 00l.A0d(str, this.A00, false)) {
            if (i == 8) {
                str2 = "CLOSE_WRITE";
            } else if (i == 16) {
                str2 = "CLOSE_NOWRITE";
            } else if (i == 32) {
                str2 = "OPEN";
            } else if (i == 256) {
                str2 = "CREATE";
            } else if (i != 512) {
                str2 = "UNKNOWN";
            } else {
                str2 = "DELETE";
            }
            0KC.A0O(C273654mx.A00(1284), AnonymousClass000.A00(201), new Object[]{str2, str});
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q7g(String str, String str2) {
        super(str2, 824);
        this.A00 = str;
    }
}
