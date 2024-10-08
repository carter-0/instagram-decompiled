package X;

/* renamed from: X.SMo  reason: case insensitive filesystem */
public abstract class C11314SMo {
    public static final SI3 A00 = new SI3();
    public static final SI3 A01;

    public static SI3 A01() {
        return A00;
    }

    static {
        SI3 si3;
        try {
            si3 = (SI3) Pxh.A0g("com.google.protobuf.ExtensionSchemaFull");
        } catch (Exception unused) {
            si3 = null;
        }
        A01 = si3;
    }

    public static SI3 A00() {
        SI3 si3 = A01;
        if (si3 != null) {
            return si3;
        }
        throw AnonymousClass7TE.A0z("Protobuf runtime is not correctly loaded.");
    }
}
