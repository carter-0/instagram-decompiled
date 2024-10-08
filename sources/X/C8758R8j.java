package X;

/* renamed from: X.R8j  reason: case insensitive filesystem */
public final class C8758R8j extends 1P0 {
    public final /* synthetic */ C10922S1a A00;

    public C8758R8j(C10922S1a s1a) {
        this.A00 = s1a;
    }

    public final void onFailInBackground(C268654dm r4) {
        int i;
        int A0D = AnonymousClass7TG.A0D(r4, -606236361);
        C13686Tf3 tf3 = this.A00.A01;
        1XQ r0 = (1XQ) r4.A00();
        if (r0 != null) {
            i = r0.mStatusCode;
        } else {
            i = -1;
        }
        tf3.E0I(i);
        AnonymousClass0fD.A0A(-1362078103, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(510094648);
        C8767R8s r8s = (C8767R8s) obj;
        int A0D = AnonymousClass7TG.A0D(r8s, 312574586);
        this.A00.A01.E0J(r8s.A00);
        AnonymousClass0fD.A0A(622237410, A0D);
        AnonymousClass0fD.A0A(206214564, A03);
    }
}
