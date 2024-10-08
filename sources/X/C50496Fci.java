package X;

/* renamed from: X.Fci  reason: case insensitive filesystem */
public final class C50496Fci implements X4E {
    public final String A00;

    public C50496Fci(String str) {
        this.A00 = str;
    }

    public final C17355VSi getState(C17355VSi vSi, CharSequence charSequence, boolean z) {
        AnonymousClass7TG.A1N(vSi, charSequence);
        if (charSequence.length() == 0) {
            vSi.A01 = "error";
            vSi.A00 = this.A00;
        }
        return vSi;
    }
}
