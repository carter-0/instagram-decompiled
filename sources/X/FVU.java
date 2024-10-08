package X;

import com.facebook.proxygen.TraceFieldType;

public final class FVU implements JPG {
    public final /* synthetic */ C13811The A00;
    public final /* synthetic */ C229382nI A01;
    public final /* synthetic */ FGH A02;
    public final /* synthetic */ C46471DfZ A03;

    public final void AUe(R9Q r9q) {
        0qQ.A0B(r9q, 0);
        FGH fgh = this.A02;
        02m r5 = fgh.A04;
        if (r5 == null) {
            0qQ.A0F("qpl");
            throw AnonymousClass00P.createAndThrow();
        }
        String Bpq = this.A00.Bpq();
        if (Bpq == null) {
            Bpq = "";
        }
        r5.markerAnnotate(896612552, TraceFieldType.FailureReason, 002.A0u("Failed to load ", Bpq, AnonymousClass000.A00(2059), r9q.A00.getMessage()));
        FGH.A01(fgh);
    }

    public FVU(C13811The the, C229382nI r2, FGH fgh, C46471DfZ dfZ) {
        this.A00 = the;
        this.A01 = r2;
        this.A02 = fgh;
        this.A03 = dfZ;
    }

    public final void Eyw() {
        this.A00.E0s(this.A01.A03, this.A03, C48721Ej6.A00(this.A02.A0D, false));
    }
}
