package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.4Pa  reason: invalid class name and case insensitive filesystem */
public final class C264214Pa implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ AnonymousClass4PZ A01;

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public C264214Pa(DisplayManager displayManager, AnonymousClass4PZ r2) {
        this.A01 = r2;
        this.A00 = displayManager;
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            AnonymousClass4PZ.A00(this.A01);
        }
    }
}
