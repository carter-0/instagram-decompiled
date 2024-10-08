package X;

import java.util.List;

/* renamed from: X.5Jm  reason: invalid class name */
public final class AnonymousClass5Jm {
    public AnonymousClass4VK A00;
    public AnonymousClass4VA A01 = new AnonymousClass4VA();
    public Integer A02;
    public String A03;
    public String A04;
    public String A05 = "";
    public List A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{ QPNode: ");
        sb.append(this.A03);
        sb.append(':');
        sb.append(this.A05);
        sb.append(':');
        sb.append(this.A02);
        sb.append(':');
        sb.append(this.A0A);
        sb.append(':');
        sb.append(this.A04);
        sb.append(':');
        sb.append(this.A08);
        sb.append(':');
        sb.append(this.A07);
        sb.append(':');
        sb.append(this.A0B);
        sb.append(":[");
        List list = this.A07;
        String str2 = null;
        if (list != null) {
            str = 00k.A0P(", ", "", "", list, C13385TXu.A00);
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(":[");
        List list2 = this.A06;
        if (list2 != null) {
            str2 = 00k.A0P(", ", "", "", list2, C13386TXv.A00);
        }
        sb.append(str2);
        sb.append("] contextual_filters");
        sb.append(this.A00);
        sb.append("] }");
        return sb.toString();
    }
}
