package X;

import java.util.Iterator;

/* renamed from: X.UOk  reason: case insensitive filesystem */
public final class C15092UOk extends AnonymousClass0T0 implements Comparable {
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public String A05;
    public String A06 = "";
    public boolean A07 = false;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15092UOk) {
                C15092UOk uOk = (C15092UOk) obj;
                if (!(0qQ.A0K(this.A06, uOk.A06) && Float.compare(this.A00, uOk.A00) == 0 && this.A04 == uOk.A04 && this.A02 == uOk.A02 && this.A07 == uOk.A07 && this.A03 == uOk.A03 && Float.compare(this.A01, uOk.A01) == 0 && 0qQ.A0K(this.A05, uOk.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C15092UOk() {
        String A0b = AnonymousClass7TF.A0b();
        0qQ.A0B(A0b, 8);
        this.A05 = A0b;
    }

    public final int A01() {
        return ((int) (((float) this.A04) / this.A01)) + this.A03;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A00((AnonymousClass7TF.A09(this.A07, (((AnonymousClass7TF.A00(AnonymousClass7TE.A0O(this.A06), this.A00) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31, this.A01));
    }

    public static void A00(StringBuilder sb, Iterator it) {
        sb.append(((C15092UOk) it.next()).A06);
        sb.append(" ");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0qQ.A00(((int) (((float) this.A04) / this.A01)) + this.A03, AnonymousClass7TE.A0M(obj));
    }
}
