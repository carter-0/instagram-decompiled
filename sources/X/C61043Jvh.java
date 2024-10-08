package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Jvh  reason: case insensitive filesystem */
public final class C61043Jvh extends AnonymousClass0T0 {
    public float A00;
    public String A01;
    public String A02;
    public final int A03;

    public C61043Jvh(String str, String str2, int i, float f) {
        this.A03 = 1;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this.A03 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61043Jvh)) {
                return false;
            }
            C61043Jvh jvh = (C61043Jvh) obj;
            if (jvh.A03 != 1 || !0qQ.A0K(this.A02, jvh.A02) || !0qQ.A0K(this.A01, jvh.A01) || Float.compare(this.A00, jvh.A00) != 0) {
                return false;
            }
            return true;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61043Jvh)) {
                return false;
            }
            C61043Jvh jvh2 = (C61043Jvh) obj;
            if (jvh2.A03 != 0 || !0qQ.A0K(this.A01, jvh2.A01) || Float.compare(this.A00, jvh2.A00) != 0 || !0qQ.A0K(this.A02, jvh2.A02)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int A002;
        int hashCode;
        if (this.A03 != 0) {
            A002 = ((AnonymousClass7TG.A0E(this.A02) * 31) + C41845B3m.A00(this.A01)) * 31;
            hashCode = Float.floatToIntBits(this.A00);
        } else {
            A002 = AnonymousClass7TF.A00(AnonymousClass7TE.A0O(this.A01), this.A00);
            hashCode = this.A02.hashCode();
        }
        return A002 + hashCode;
    }

    public final String toString() {
        if (1 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CommerceMediaProductSuggestionInput(productId=");
        A1A.append(this.A02);
        A1A.append(Pxd.A00(116));
        A1A.append(this.A01);
        A1A.append(", confidenceLevel=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }

    public static void A00(Iterator it, Map map) {
        C61043Jvh jvh = (C61043Jvh) it.next();
        map.put(jvh.A01, new Float(jvh.A00));
    }

    public C61043Jvh(String str, String str2, float f) {
        this.A03 = 0;
        this.A01 = str;
        this.A00 = f;
        this.A02 = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61043Jvh() {
        this((String) null, (String) null, 1, 0.0f);
        this.A03 = 1;
        this.A03 = 1;
    }
}
