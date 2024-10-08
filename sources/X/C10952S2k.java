package X;

/* renamed from: X.S2k  reason: case insensitive filesystem */
public final class C10952S2k {
    public final int A00;
    public final int A01;
    public final String A02;
    public final int A03;
    public final int A04;

    public C10952S2k(int i, int i2, int i3, int i4, String str) {
        this.A03 = i;
        this.A04 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A02 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ShowreelNativeRenderingComponentInfoData{x=");
        A1A.append(this.A03);
        A1A.append(", y=");
        A1A.append(this.A04);
        A1A.append(", width=");
        A1A.append(this.A01);
        A1A.append(", height=");
        A1A.append(this.A00);
        A1A.append(", mediaUrl='");
        A1A.append(this.A02);
        return AnonymousClass7TF.A0l("'}", A1A);
    }
}
