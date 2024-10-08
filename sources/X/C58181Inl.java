package X;

/* renamed from: X.Inl  reason: case insensitive filesystem */
public final class C58181Inl extends 0Yg implements C62320sa {
    public final int A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58181Inl(String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        StringBuilder sb;
        String str;
        switch (this.A00) {
            case 2:
                sb = AnonymousClass7TE.A1A();
                sb.append(this.A01);
                str = "_installed";
                break;
            case 3:
                sb = AnonymousClass7TE.A1A();
                sb.append(this.A01);
                str = "_uninstalled";
                break;
            case 4:
                return new C7895QcN(this.A01);
            default:
                return Boolean.valueOf(AnonymousClass7TF.A1R(this.A01.length()));
        }
        return AnonymousClass7TF.A0l(str, sb);
    }
}
