package X;

/* renamed from: X.Ule  reason: case insensitive filesystem */
public final class C15962Ule extends C324596za {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C19742Wej A02;

    public C15962Ule(C19742Wej wej, boolean z, boolean z2) {
        this.A02 = wej;
        this.A00 = z;
        this.A01 = z2;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -1795616787);
        C19742Wej wej = this.A02;
        wej.A00 = AnonymousClass05K.A01;
        wej.A02.DkK(r4, this.A00);
        AnonymousClass0fD.A0A(-1663184689, A0D);
    }

    public final void onFinish() {
        AnonymousClass0fD.A0A(1301473624, AnonymousClass0fD.A03(-503756726));
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1077356137);
        this.A02.A02.DkL();
        AnonymousClass0fD.A0A(-224485703, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1679446473);
        AnonymousClass1XV r6 = (AnonymousClass1XV) obj;
        int A0D = AnonymousClass7TG.A0D(r6, 907386811);
        C19742Wej wej = this.A02;
        wej.A00 = AnonymousClass05K.A0C;
        wej.A02.DkM(r6, this.A00, this.A01);
        AnonymousClass0fD.A0A(-579817962, A0D);
        AnonymousClass0fD.A0A(1583739031, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(110326807);
        AnonymousClass0fD.A0A(1820023169, AnonymousClass0fD.A03(-769826958));
        AnonymousClass0fD.A0A(1733970637, A03);
    }
}
