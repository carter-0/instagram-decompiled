package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4mJ  reason: invalid class name and case insensitive filesystem */
public final class C273304mJ extends C273274mG {
    public C273294mI A00;
    public final List A01 = new ArrayList();

    public C273304mJ(Looper looper) {
        super(new Handler(looper));
    }

    public final boolean A01() {
        if (!this.A01.isEmpty() || !super.A01()) {
            return false;
        }
        return true;
    }

    public final void run() {
        for (C273294mI r0 : this.A01) {
            this.A00 = r0;
            r0.CoZ();
        }
        super.run();
    }
}
