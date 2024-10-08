package X;

/* renamed from: X.EGa  reason: case insensitive filesystem */
public final class C47763EGa extends AnonymousClass4AA {
    public final String A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47763EGa eGa = (C47763EGa) obj;
        if (!this.A01.equals(eGa.A01) || !this.A00.equals(eGa.A00)) {
            return false;
        }
        return true;
    }

    public C47763EGa(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
