package X;

import com.instagram.model.direct.DirectThreadKey;

public final class NMC extends 1P0 {
    public final /* synthetic */ C74551Pwk A00;
    public final /* synthetic */ 1jl A01;
    public final /* synthetic */ C66131jj A02;
    public final /* synthetic */ DirectThreadKey A03;

    public NMC(C74551Pwk pwk, 1jl r2, C66131jj r3, DirectThreadKey directThreadKey) {
        this.A03 = directThreadKey;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = pwk;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(-691434570, AnonymousClass0fD.A03(385528658));
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(-1151645557, AnonymousClass0fD.A03(1938284657));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1876386077);
        C300585xS r6 = (C300585xS) obj;
        int A0D = AnonymousClass7TG.A0D(r6, -1333946970);
        1ES.A03(1jl.A00(this.A01, this.A02, new DirectThreadKey(r6.A1D, this.A03.A02)));
        AnonymousClass0fD.A0A(88769579, A0D);
        AnonymousClass0fD.A0A(269692512, A032);
    }
}
