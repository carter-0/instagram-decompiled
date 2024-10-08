package X;

/* renamed from: X.FqZ  reason: case insensitive filesystem */
public final class C51218FqZ implements Runnable {
    public final /* synthetic */ C47699EDi A00;

    public C51218FqZ(C47699EDi eDi) {
        this.A00 = eDi;
    }

    public final void run() {
        E5C e5c = (E5C) this.A00.A01;
        String str = E5C.__redex_internal_original_name;
        String phoneNumber = e5c.A07.getPhoneNumber();
        FGJ.A03.A05(e5c.getContext());
        DbT.A1J(e5c);
        AnonymousClass1Nd.A00(e5c.A02).A00(new AnonymousClass3DP(e5c.getContext(), e5c.A02.A06, phoneNumber));
    }
}
