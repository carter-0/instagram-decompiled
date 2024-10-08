package X;

/* renamed from: X.5yf  reason: invalid class name and case insensitive filesystem */
public final class C301165yf extends AnonymousClass0T0 {
    public final C376459Ib A00;
    public final C53251Gkz A01;
    public final String A02;
    public final String A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtraDataInfo(hideMediaReason=");
        sb.append(this.A03);
        sb.append(", accountType=");
        sb.append(this.A02);
        sb.append(", afiLoggingInfo=");
        sb.append(this.A01);
        sb.append(", iabLoggingInfo=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C301165yf(C376459Ib r1, C53251Gkz gkz, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = gkz;
        this.A00 = r1;
    }
}
