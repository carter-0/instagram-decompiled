package X;

import android.content.Context;

/* renamed from: X.ENm  reason: case insensitive filesystem */
public final class C47935ENm extends C49670F1c {
    public C49670F1c A00;

    public final void startDeviceValidation(Context context, String str) {
        C49670F1c f1c = this.A00;
        if (f1c != null) {
            f1c.startDeviceValidation(context, str);
        }
    }

    public C47935ENm() {
        try {
            this.A00 = (C49670F1c) Class.forName("com.instagram.nux.deviceverification.impl.VerificationPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            0KC.A0F("DeviceVerificationPlugin", "Failed to instantiate Device Verification Plugin", th);
        }
    }
}
