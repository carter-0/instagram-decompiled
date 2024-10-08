package X;

/* renamed from: X.Iwf  reason: case insensitive filesystem */
public final class C58732Iwf extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C53820Gun A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58732Iwf(C53820Gun gun, float f, float f2) {
        super(1);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = gun;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C70762Uy A0a = C51968G9o.A0a(obj);
        A0a.A00.offsetLocation(this.A00, this.A01);
        return Boolean.valueOf(C52129GFx.A00(A0a, this.A02.A00));
    }
}
