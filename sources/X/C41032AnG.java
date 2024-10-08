package X;

import android.app.Activity;
import android.app.Dialog;
import java.lang.ref.WeakReference;

/* renamed from: X.AnG  reason: case insensitive filesystem */
public final class C41032AnG implements Runnable {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ AnonymousClass9SS A01;

    public C41032AnG(Dialog dialog, AnonymousClass9SS r2) {
        this.A01 = r2;
        this.A00 = dialog;
    }

    public final void run() {
        Activity activity;
        WeakReference weakReference = this.A01.A04;
        if (weakReference.get() != null && (activity = (Activity) weakReference.get()) != null && !activity.isFinishing()) {
            AnonymousClass0fN.A00(this.A00);
        }
    }
}
