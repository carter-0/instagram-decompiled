package X;

/* renamed from: X.44s  reason: invalid class name and case insensitive filesystem */
public final class C2602144s extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XplatMqttConnectionConfig(connectionTimeoutSeconds=");
        sb.append(this.A00);
        sb.append(", keepAliveSeconds=");
        sb.append(this.A02);
        sb.append(", keepAliveBgSeconds=");
        sb.append(this.A01);
        sb.append(", keepAliveTimeoutSeconds=");
        sb.append(this.A03);
        sb.append(", publishTimeoutSeconds=");
        sb.append(this.A06);
        sb.append(", preemptivePublishTimeoutSeconds=");
        sb.append(this.A05);
        sb.append(", personalizationEnabled=");
        sb.append(this.A09);
        sb.append(C273654mx.A00(1054));
        sb.append(this.A08);
        sb.append(", qplEnabled=");
        sb.append(this.A07);
        sb.append(", numFailuresForFallback=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C2602144s(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A06 = i5;
        this.A05 = i6;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A04 = i7;
    }

    public C2602144s() {
        this(10, 60, 60, 6, 10, 0, 0, false, false, true);
    }
}
