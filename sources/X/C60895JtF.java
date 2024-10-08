package X;

/* renamed from: X.JtF  reason: case insensitive filesystem */
public final class C60895JtF extends AnonymousClass0T0 {
    public float A00 = -100.0f;
    public int A01 = -1;
    public int A02 = -1;
    public long A03 = 0;
    public long A04 = 0;
    public String A05 = null;
    public String A06 = null;

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VideoFrame(ptsUs=");
        A1A.append(this.A04);
        A1A.append(", comparePtsUs=");
        A1A.append(this.A03);
        A1A.append(", frameIndex=");
        A1A.append(this.A02);
        A1A.append(", compareFrameIndex=");
        A1A.append(this.A01);
        A1A.append(", imagePath=");
        A1A.append(this.A06);
        A1A.append(", compareImagePath=");
        A1A.append(this.A05);
        A1A.append(", ssim=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
