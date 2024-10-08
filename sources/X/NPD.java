package X;

public final class NPD extends AnonymousClass4AA {
    public final int A00;
    public final PHJ A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        NPD npd = (NPD) obj;
        0qQ.A0B(npd, 0);
        if (this.A00 == npd.A00 && 0qQ.A0K(this.A02, npd.A02) && 0qQ.A0K(this.A03, npd.A03) && this.A05 == npd.A05 && this.A04 == npd.A04) {
            return true;
        }
        return false;
    }

    public NPD(PHJ phj, String str, String str2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = phj;
    }
}
