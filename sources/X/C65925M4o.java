package X;

import android.content.DialogInterface;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.M4o  reason: case insensitive filesystem */
public final class C65925M4o implements Runnable {
    public final /* synthetic */ C61496KAb A00;

    public C65925M4o(C61496KAb kAb) {
        this.A00 = kAb;
    }

    public final void run() {
        C61496KAb kAb = this.A00;
        AnonymousClass6Z5 r3 = kAb.A02.A00;
        C313056fm r2 = ((ReelViewerFragment) r3.A17).mViewPager;
        if (r2 != null) {
            r2.EJb(new J6L(r3, 18));
        }
        DialogInterface.OnDismissListener onDismissListener = kAb.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss((DialogInterface) null);
        }
        kAb.A01.A07();
    }
}
