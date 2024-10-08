package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3JH  reason: invalid class name */
public final class AnonymousClass3JH implements View.OnClickListener {
    public final /* synthetic */ 2dZ A00;
    public final /* synthetic */ WeakReference A01;

    public AnonymousClass3JH(2dZ r1, WeakReference weakReference) {
        this.A01 = weakReference;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-423020299);
        C227252iu r0 = (C227252iu) this.A01.get();
        if (r0 != null) {
            r0.EKl();
        } else {
            this.A00.A0O.setOnClickListener((View.OnClickListener) null);
        }
        AnonymousClass0fD.A0C(-254968727, A05);
    }
}
