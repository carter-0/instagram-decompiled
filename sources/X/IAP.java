package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class IAP implements View.OnClickListener {
    public final /* synthetic */ C57248IUj A00;

    public IAP(C57248IUj iUj) {
        this.A00 = iUj;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1253475160);
        C57248IUj iUj = this.A00;
        boolean z = iUj.A01;
        boolean z2 = !z;
        if (z != z2) {
            iUj.A01 = z2;
            WeakReference weakReference = iUj.A00;
            if (!(weakReference == null || weakReference.get() == null)) {
                C17003VEd.A00((C17522VZb) weakReference.get(), z2);
            }
        }
        C55691Hlo hlo = C55691Hlo.A02;
        if (hlo == null) {
            hlo = new C55691Hlo();
            C55691Hlo.A02 = hlo;
        }
        int hashCode = iUj.hashCode();
        HashMap hashMap = hlo.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            hlo.A00.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
        AnonymousClass0fD.A0C(1080229391, A05);
    }
}
