package X;

import android.os.Bundle;
import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.ArEffectPickerRecyclerView;

/* renamed from: X.PUr  reason: case insensitive filesystem */
public final class C73060PUr implements Runnable {
    public final /* synthetic */ C72286Ozv A00;

    public C73060PUr(C72286Ozv ozv) {
        this.A00 = ozv;
    }

    public final void run() {
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A00.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.performAccessibilityAction(64, (Bundle) null);
        }
    }
}
