package X;

/* renamed from: X.3Zw  reason: invalid class name */
public abstract class AnonymousClass3Zw {
    public static final Object A00(AnonymousClass3Y5 r5, C62320sa r6, Object[] objArr) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(objArr, 1);
        2V1 r4 = r5.A05;
        String A08 = r4.A08();
        int i = r5.A00;
        r5.A00 = i + 1;
        C243703Zx r1 = new C243703Zx(objArr);
        Object A07 = r4.A07(r1, A08, i);
        if (A07 != null) {
            return A07;
        }
        Object invoke = r6.invoke();
        r4.A0D(r1, invoke, A08, i);
        return invoke;
    }
}
