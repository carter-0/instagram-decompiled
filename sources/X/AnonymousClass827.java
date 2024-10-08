package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.827  reason: invalid class name */
public final class AnonymousClass827 implements C312136ds {
    public final /* synthetic */ C3496881i A00;

    public AnonymousClass827(C3496881i r1) {
        this.A00 = r1;
    }

    public final C344037rD B46() {
        C340297l2 r0 = this.A00.A02;
        if (r0 != null) {
            return r0.B46();
        }
        0f9 AEf = 0wj.A01.AEf(C3496881i.__redex_internal_original_name, 817892279);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "mCameraController is unexpectedly null");
        AEf.report();
        return null;
    }
}
