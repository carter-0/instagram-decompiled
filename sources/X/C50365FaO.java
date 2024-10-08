package X;

import android.content.Context;
import com.instagram.debug.devoptions.plugins.DeveloperOptionsPlugin;

/* renamed from: X.FaO  reason: case insensitive filesystem */
public final class C50365FaO implements DeveloperOptionsPlugin.OnPinnedDevOptionInteraction {
    public final /* synthetic */ C48014ERb A00;
    public final /* synthetic */ C47518E6c A01;

    public C50365FaO(C48014ERb eRb, C47518E6c e6c) {
        this.A01 = e6c;
        this.A00 = eRb;
    }

    public final void onPinnedDevOptionRemoved() {
        Context context = this.A01.getContext();
        if (context != null) {
            C48014ERb.A06(context, this.A00);
        }
    }

    public final void onPinnedDevOptionSelected() {
        C48014ERb.A07(this.A00);
    }
}
