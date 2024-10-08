package X;

import com.instagram.api.schemas.HzwPageInfoImpl;
import java.util.List;

/* renamed from: X.JxI  reason: case insensitive filesystem */
public final class C61106JxI extends AnonymousClass0T0 implements YBI {
    public final HzwPageInfoImpl A00;
    public final List A01;
    public final C276014sL A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61106JxI) {
                C61106JxI jxI = (C61106JxI) obj;
                if (!0qQ.A0K(this.A02, jxI.A02) || !0qQ.A0K(this.A01, jxI.A01) || !0qQ.A0K(this.A00, jxI.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C61106JxI(C276014sL r1, HzwPageInfoImpl hzwPageInfoImpl, List list) {
        this.A02 = r1;
        this.A01 = list;
        this.A00 = hzwPageInfoImpl;
    }
}
