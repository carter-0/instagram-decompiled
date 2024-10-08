package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ki  reason: invalid class name and case insensitive filesystem */
public final class C249993ki extends AnonymousClass0T0 {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public String A03;
    public String A04;
    public List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C249993ki) {
                C249993ki r5 = (C249993ki) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || this.A02 != r5.A02 || this.A00 != r5.A00 || this.A01 != r5.A01 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A05.hashCode() * 31) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SurfaceContent(storiesItems=");
        sb.append(this.A05);
        sb.append(", nextAdRequestIndex=");
        sb.append(this.A02);
        sb.append(", adsPoolThreshold=");
        sb.append(this.A00);
        sb.append(", earliestRequestPosition=");
        sb.append(this.A01);
        sb.append(", calculationStrategy=");
        sb.append(this.A03);
        sb.append(C273654mx.A00(442));
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C249993ki() {
        ArrayList arrayList = new ArrayList();
        String str = C238523Ce.A04.A00;
        0qQ.A0B(str, 5);
        this.A05 = arrayList;
        this.A03 = str;
        this.A04 = "cross_session";
    }
}
