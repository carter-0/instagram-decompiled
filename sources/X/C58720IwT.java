package X;

import android.graphics.RuntimeShader;

/* renamed from: X.IwT  reason: case insensitive filesystem */
public final class C58720IwT extends 0Yg implements 0sP {
    public final /* synthetic */ RuntimeShader A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58720IwT(RuntimeShader runtimeShader) {
        super(1);
        this.A00 = runtimeShader;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((C289005cr) obj).A00;
        this.A00.setFloatUniform("iResolution", (float) C51965G9l.A04(j), (float) C289005cr.A00(j));
        return C60340gF.A00;
    }
}
