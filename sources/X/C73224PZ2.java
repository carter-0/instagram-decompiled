package X;

import com.facebook.msys.mci.AccountSession;
import java.util.Set;

/* renamed from: X.PZ2  reason: case insensitive filesystem */
public final class C73224PZ2 implements Runnable {
    public final /* synthetic */ AnonymousClass66i A00;
    public final /* synthetic */ boolean A01;

    public C73224PZ2(AnonymousClass66i r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        AnonymousClass66i r3 = this.A00;
        Set<C74333Pt9> set = r3.A02;
        boolean z = this.A01;
        for (C74333Pt9 Ct4 : set) {
            Ct4.Ct4(z);
        }
        C74333Pt9 pt9 = r3.A01;
        if (pt9 != null) {
            pt9.Ct4(z);
            return;
        }
        AccountSession accountSession = r3.A00;
        if (accountSession != null) {
            accountSession.invalidate();
        }
    }
}
