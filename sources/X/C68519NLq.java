package X;

/* renamed from: X.NLq  reason: case insensitive filesystem */
public final class C68519NLq extends 1P0 {
    public final /* synthetic */ C74551Pwk A00;
    public final /* synthetic */ C66351mM A01;

    public C68519NLq(C74551Pwk pwk, C66351mM r2) {
        this.A00 = pwk;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1177492887);
        int A032 = AnonymousClass0fD.A03(1586323673);
        C74551Pwk pwk = this.A00;
        String str = this.A01.A01;
        if (str != null) {
            pwk.DTM((C270214gN) null, str);
            AnonymousClass0fD.A0A(1361178306, A032);
            AnonymousClass0fD.A0A(1001056932, A03);
            return;
        }
        0qQ.A0F("itemId");
        throw AnonymousClass00P.createAndThrow();
    }
}
