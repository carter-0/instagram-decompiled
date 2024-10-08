package X;

import android.graphics.Canvas;

/* renamed from: X.AyB  reason: case insensitive filesystem */
public final class C41659AyB extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C306386Ly A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41659AyB(C306386Ly r2, float f, float f2) {
        super(1);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Canvas canvas = (Canvas) obj;
        AnonymousClass7TF.A12(canvas);
        canvas.translate(this.A00 + this.A01, 0.0f);
        C306386Ly r0 = this.A02;
        if (r0 != null) {
            r0.A0T(canvas);
        }
        canvas.restore();
        return C60340gF.A00;
    }
}
