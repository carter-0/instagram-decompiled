package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Anz  reason: case insensitive filesystem */
public final class C41077Anz implements Runnable {
    public final /* synthetic */ APX A00;
    public final /* synthetic */ AnonymousClass7U7 A01;

    public C41077Anz(APX apx, AnonymousClass7U7 r2) {
        this.A01 = r2;
        this.A00 = apx;
    }

    public final void run() {
        AnonymousClass7U7 r3 = this.A01;
        APX apx = this.A00;
        Fragment fragment = r3.A01;
        if (fragment.getActivity() != null) {
            fragment.mLifecycleRegistry.A09(apx);
            r3.A00 = apx;
        }
    }
}
