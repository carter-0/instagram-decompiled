package X;

import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.W5v  reason: case insensitive filesystem */
public final /* synthetic */ class C18850W5v implements Camera.AutoFocusCallback {
    public final /* synthetic */ Point A00;
    public final /* synthetic */ C365938nv A01;
    public final /* synthetic */ AnonymousClass9S6 A02;

    public /* synthetic */ C18850W5v(Point point, C365938nv r2, AnonymousClass9S6 r3) {
        this.A02 = r3;
        this.A00 = point;
        this.A01 = r2;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        Integer num;
        AnonymousClass9S6 r4 = this.A02;
        Point point = this.A00;
        C365938nv r2 = this.A01;
        r4.A07 = z;
        r4.A08 = false;
        if (r4.A0A) {
            r4.A04 = false;
        }
        if (z) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A0Y;
        }
        AnonymousClass9S6.A00(point, r4.A02, r4, num);
        AnonymousClass9S6.A00(point, r2, r4, num);
    }
}
