package X;

import androidx.preference.PreferenceGroup;

/* renamed from: X.Whf  reason: case insensitive filesystem */
public final class C19910Whf implements Runnable {
    public final /* synthetic */ PreferenceGroup A00;

    public final void run() {
        synchronized (this) {
            this.A00.A05.clear();
        }
    }

    public C19910Whf(PreferenceGroup preferenceGroup) {
        this.A00 = preferenceGroup;
    }
}
