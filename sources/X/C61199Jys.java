package X;

import java.util.List;

/* renamed from: X.Jys  reason: case insensitive filesystem */
public final class C61199Jys extends AnonymousClass0T0 implements MQV {
    public final C333817aC A00;
    public final C333777a7 A01;
    public final MQW A02;
    public final List A03;
    public final List A04;

    public C61199Jys(C333817aC r2, C333777a7 r3, MQW mqw, List list, List list2) {
        0qQ.A0B(mqw, 2);
        this.A03 = list;
        this.A02 = mqw;
        this.A04 = list2;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61199Jys) {
                C61199Jys jys = (C61199Jys) obj;
                if (!0qQ.A0K(this.A03, jys.A03) || !0qQ.A0K(this.A02, jys.A02) || !0qQ.A0K(this.A04, jys.A04) || !0qQ.A0K(this.A00, jys.A00) || !0qQ.A0K(this.A01, jys.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03)))) + AnonymousClass7TG.A0C(this.A01);
    }
}
