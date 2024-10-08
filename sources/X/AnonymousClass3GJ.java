package X;

import android.hardware.SensorManager;

/* renamed from: X.3GJ  reason: invalid class name */
public final class AnonymousClass3GJ extends 0ng {
    public final /* synthetic */ AnonymousClass2BU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3GJ(AnonymousClass2BU r4) {
        super(660565823, 3, false, false);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass2BU r1 = this.A00;
        AnonymousClass0eM r0 = r1.A04;
        AnonymousClass2Ba r2 = r1.A03;
        C60240fb.A01(((SensorManager) r0.getValue()).getDefaultSensor(1), r2, (SensorManager) r0.getValue(), 2);
    }
}
