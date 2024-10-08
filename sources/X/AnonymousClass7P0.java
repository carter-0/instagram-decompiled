package X;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: X.7P0  reason: invalid class name */
public final class AnonymousClass7P0 implements 1aV {
    public final /* synthetic */ AnonymousClass7M6 A00;
    public final /* synthetic */ WeakReference A01;

    public AnonymousClass7P0(AnonymousClass7M6 r1, WeakReference weakReference) {
        this.A01 = weakReference;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Activity activity;
        if (((Boolean) obj).booleanValue() && (activity = (Activity) this.A01.get()) != null) {
            AnonymousClass7M6.A00(activity.getWindow(), this.A00);
        }
    }
}
