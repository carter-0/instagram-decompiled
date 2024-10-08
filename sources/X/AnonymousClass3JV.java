package X;

/* renamed from: X.3JV  reason: invalid class name */
public class AnonymousClass3JV implements 2do {
    public float A00;
    public float A01;

    public final /* bridge */ /* synthetic */ Object CNj(float f, Object obj, Object obj2) {
        AnonymousClass3JV r4 = (AnonymousClass3JV) obj;
        AnonymousClass3JV r5 = (AnonymousClass3JV) obj2;
        float f2 = r4.A00;
        float f3 = this.A00;
        r5.A00 = ((f2 - f3) * f) + f3;
        float f4 = r4.A01;
        float f5 = this.A01;
        r5.A01 = ((f4 - f5) * f) + f5;
        return r5;
    }
}
