package X;

import android.os.FileObserver;
import java.io.File;
import java.util.Set;

/* renamed from: X.3KK  reason: invalid class name */
public final class AnonymousClass3KK extends FileObserver {
    public final AnonymousClass3KG A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3KK(AnonymousClass3KG r2, String str) {
        super(str, 288);
        0qQ.A0B(str, 2);
        this.A00 = r2;
    }

    public final void onEvent(int i, String str) {
        if (str == null) {
            C318086oN.A00(i);
            return;
        }
        C318086oN.A00(i);
        AnonymousClass3KG r2 = this.A00;
        String str2 = str;
        int A05 = 00l.A05(str, '/', str.length() - 1);
        if (A05 != -1) {
            str2 = str.substring(A05 + 1);
            0qQ.A07(str2);
        }
        if (!00p.A0k(str2, ".pending", false) && !r2.A03.contains(str2)) {
            Set set = r2.A04;
            if (!set.contains(str) && !r2.A05.isEmpty()) {
                set.add(str);
                r2.A02.ATE(new C378679Qu(r2, str));
            }
        }
    }

    public AnonymousClass3KK(AnonymousClass3KG r2, File file) {
        super(file, 288);
        this.A00 = r2;
        file.getPath();
    }
}
