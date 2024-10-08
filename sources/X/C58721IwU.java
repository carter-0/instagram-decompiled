package X;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;

/* renamed from: X.IwU  reason: case insensitive filesystem */
public final class C58721IwU extends 0Yg implements 0sP {
    public final /* synthetic */ RuntimeShader A00;
    public final /* synthetic */ C284945Oz A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58721IwU(RuntimeShader runtimeShader, C284945Oz r3) {
        super(1);
        this.A00 = runtimeShader;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5RU A0S = C51968G9o.A0S(obj);
        A0S.EOX(0.2f);
        A0S.ERg(true);
        RuntimeShader runtimeShader = this.A00;
        runtimeShader.setFloatUniform("iTime", C51971G9r.A02(this.A01));
        RenderEffect createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShader, "composable");
        0qQ.A07(createRuntimeShaderEffect);
        A0S.EiT(HRK.A00(createRuntimeShaderEffect));
        return C60340gF.A00;
    }
}
