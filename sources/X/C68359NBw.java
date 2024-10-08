package X;

import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* renamed from: X.NBw  reason: case insensitive filesystem */
public final class C68359NBw extends AnonymousClass8GD {
    public final /* synthetic */ float A00;
    public final /* synthetic */ IgLiteCameraProxy A01;
    public final /* synthetic */ boolean A02;

    public C68359NBw(IgLiteCameraProxy igLiteCameraProxy, float f, boolean z) {
        this.A01 = igLiteCameraProxy;
        this.A02 = z;
        this.A00 = f;
    }

    public final void A01(Exception exc) {
        0KC.A0C("IgLiteCameraProxy", AnonymousClass7TG.A0m(exc, "Camera failed to switch before stopping Dual ", C51975G9x.A0l(exc)));
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        0KC.A0C("IgLiteCameraProxy", AnonymousClass7TG.A0m(obj, "Camera switch before stopping Dual ", AnonymousClass7TE.A1A()));
        IgLiteCameraProxy.A01(this.A01, this.A00, this.A02);
    }
}
