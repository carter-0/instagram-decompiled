package X;

/* renamed from: X.4Aj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C261644Aj implements C62320sa {
    public final /* synthetic */ String A00;
    public final /* synthetic */ C258653zQ A01;

    public /* synthetic */ C261644Aj(String str, C258653zQ r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    public final Object invoke() {
        C258653zQ r1 = this.A01;
        String str = this.A00;
        0qQ.A0B(r1, 0);
        C2590740h r2 = new C2590740h(str, r3);
        for (Enum name : r1.A00) {
            r2.A01(name.name(), false);
        }
        return r2;
    }
}
