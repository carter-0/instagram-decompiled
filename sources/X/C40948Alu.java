package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;

/* renamed from: X.Alu  reason: case insensitive filesystem */
public final class C40948Alu implements Runnable {
    public final /* synthetic */ PickerConfiguration A00;
    public final /* synthetic */ C371638yj A01;

    public C40948Alu(PickerConfiguration pickerConfiguration, C371638yj r2) {
        this.A01 = r2;
        this.A00 = pickerConfiguration;
    }

    public final void run() {
        C371638yj r0 = this.A01;
        r0.A01.DX9(this.A00, r0.A05);
    }
}
