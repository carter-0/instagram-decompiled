package X;

import com.instagram.api.schemas.ThreadHeaderContextType;

/* renamed from: X.BHz  reason: case insensitive filesystem */
public final class C42121BHz extends AnonymousClass0T0 implements DRX {
    public final DRZ A00;
    public final ThreadHeaderContextType A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42121BHz) {
                C42121BHz bHz = (C42121BHz) obj;
                if (!0qQ.A0K(this.A00, bHz.A00) || this.A01 != bHz.A01 || !0qQ.A0K(this.A02, bHz.A02) || !0qQ.A0K(this.A03, bHz.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0C(this.A00) * 31)) + C41845B3m.A00(this.A03);
    }

    public C42121BHz(DRZ drz, ThreadHeaderContextType threadHeaderContextType, String str, String str2) {
        AnonymousClass7TG.A1Q(threadHeaderContextType, str);
        this.A00 = drz;
        this.A01 = threadHeaderContextType;
        this.A02 = str;
        this.A03 = str2;
    }
}
