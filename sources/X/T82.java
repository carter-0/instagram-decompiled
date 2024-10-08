package X;

public final class T82 implements C358108aN {
    public final int A00;
    public final Object A01;

    public T82(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure(String str, boolean z) {
        switch (this.A00) {
            case 3:
                ((C13721Tfn) this.A01).DAH();
                return;
            case 4:
                ((C241063Ns) this.A01).A0T(AnonymousClass7TE.A0u());
                return;
            default:
                ((1K2) this.A01).set(AnonymousClass7TE.A0u());
                return;
        }
    }

    public final void onSuccess() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 3:
                ((C13721Tfn) obj).DAJ((Object) null);
                return;
            case 4:
                ((C241063Ns) obj).A0T(AnonymousClass7TE.A0v());
                return;
            default:
                ((1K2) obj).set(AnonymousClass7TE.A0v());
                return;
        }
    }
}
