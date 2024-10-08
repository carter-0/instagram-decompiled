package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.statusbar.StatusBarModule;

/* renamed from: X.55H  reason: invalid class name */
public final class AnonymousClass55H extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ 1CY A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55H(1CY r4, int i, int i2, int i3, int i4) {
        super(721, 5, false, false);
        this.A04 = r4;
        this.A01 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }

    public final void run() {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A04.A04;
        int i = this.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "WIDTH", this.A03);
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, StatusBarModule.HEIGHT_KEY, this.A00);
        lightweightQuickPerformanceLogger.markerAnnotate(23396353, i, "BYTE_SIZE", this.A02);
    }
}
