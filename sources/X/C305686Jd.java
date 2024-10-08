package X;

/* renamed from: X.6Jd  reason: invalid class name and case insensitive filesystem */
public final class C305686Jd extends 0Yg implements 0sL {
    public static final C305686Jd A00 = new C305686Jd();

    public C305686Jd() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass5SX r6 = (AnonymousClass5SX) obj2;
        AnonymousClass5SV r0 = ((AnonymousClass5SX) obj).A05;
        C285635Sb r3 = AnonymousClass5SZ.A0V;
        C41578Aws aws = C41578Aws.A00;
        Object obj3 = r0.A02.get(r3);
        if (obj3 == null) {
            obj3 = aws.invoke();
        }
        float floatValue = ((Number) obj3).floatValue();
        AnonymousClass5SV r02 = r6.A05;
        C41579Awt awt = C41579Awt.A00;
        Object obj4 = r02.A02.get(r3);
        if (obj4 == null) {
            obj4 = awt.invoke();
        }
        return Integer.valueOf(Float.compare(floatValue, ((Number) obj4).floatValue()));
    }
}
