package X;

/* renamed from: X.6Y7  reason: invalid class name */
public final class AnonymousClass6Y7 extends V4M {
    public final /* bridge */ /* synthetic */ float A00(Object obj) {
        V4M v4m = AnonymousClass6Y6.A05;
        return ((AnonymousClass6Y6) obj).A00 * 10000.0f;
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, float f) {
        AnonymousClass6Y6 r2 = (AnonymousClass6Y6) obj;
        V4M v4m = AnonymousClass6Y6.A05;
        r2.A00 = f / 10000.0f;
        r2.invalidateSelf();
    }
}
