package X;

/* renamed from: X.KVs  reason: case insensitive filesystem */
public final class C62019KVs extends C62845KnL {
    public boolean A00;
    public final int A01;
    public final AnonymousClass3Q2 A02;
    public final String A03;
    public final C241063Ns A04;
    public final C262224Cq A05;
    public final boolean A06;

    public C62019KVs(AnonymousClass3Q2 r1, String str, C241063Ns r3, C262224Cq r4, int i, boolean z) {
        AnonymousClass7TG.A1O(r1, str);
        this.A02 = r1;
        this.A03 = str;
        this.A01 = i;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UploadRequest(pendingMedia=");
        A1A.append(this.A02);
        A1A.append(", source=");
        A1A.append(this.A03);
        A1A.append(", action=");
        A1A.append(this.A01);
        A1A.append(", response=");
        A1A.append(this.A04);
        A1A.append(", parentScope=");
        A1A.append(this.A05);
        A1A.append(", useSingularWorkerV2=");
        return G9t.A1C(A1A, this.A06);
    }
}
