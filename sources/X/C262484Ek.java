package X;

/* renamed from: X.4Ek  reason: invalid class name and case insensitive filesystem */
public final class C262484Ek implements AnonymousClass2OT {
    public final /* synthetic */ 2G9 A00;
    public final /* synthetic */ Class A01;

    public C262484Ek(2G9 r1, Class cls) {
        this.A00 = r1;
        this.A01 = cls;
    }

    public final Object AJM() {
        try {
            return AnonymousClass4El.A00.A01(this.A01);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to create instance of ");
            sb.append(this.A01);
            sb.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
