package X;

import android.content.res.Resources;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2hl  reason: invalid class name and case insensitive filesystem */
public final class C226732hl {
    public final Resources A00;
    public final 1U1 A01;
    public final C226662he A02;
    public final Map A03;
    public final boolean A04;

    public final boolean A00(C226732hl r6, boolean z) {
        boolean A002;
        if (this == r6) {
            return true;
        }
        if (r6 != null && this.A00 == r6.A00 && AnonymousClass9DO.A00(this.A02, r6.A02)) {
            1U1 r2 = this.A01;
            1U1 r3 = r6.A01;
            if (!z) {
                A002 = AnonymousClass9DO.A00(r2, r3);
            } else if (r2 == r3) {
                return true;
            } else {
                if (r2.A02 == r3.A02 && AnonymousClass9DO.A00(r2.A0B, r3.A0B) && AnonymousClass9DO.A00(r2.A06, r3.A06) && r2.A0U == r3.A0U && AnonymousClass9DO.A00(r2.A0I, r3.A0I)) {
                    A002 = r2.A00(r3);
                }
            }
            if (A002) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C226732hl r5 = (C226732hl) obj;
            if (this.A00 != r5.A00 || !AnonymousClass9DO.A00(this.A02, r5.A02) || !AnonymousClass9DO.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C226732hl(Resources resources, 1U1 r3, C226662he r4, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A00 = resources;
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = z;
        this.A03 = linkedHashMap;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }
}
