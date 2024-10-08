package X;

import java.util.HashMap;

/* renamed from: X.Dtu  reason: case insensitive filesystem */
public final class C47266Dtu extends AnonymousClass0T0 implements G5E {
    public final EV3 A00;
    public final String A01;
    public final String A02;
    public final HashMap A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47266Dtu) {
                C47266Dtu dtu = (C47266Dtu) obj;
                if (!0qQ.A0K(this.A02, dtu.A02) || this.A00 != dtu.A00 || !0qQ.A0K(this.A03, dtu.A03) || !0qQ.A0K(this.A01, dtu.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02))) + AnonymousClass7TG.A0E(this.A01);
    }

    public C47266Dtu(EV3 ev3, String str, String str2, HashMap hashMap) {
        AnonymousClass7TG.A1U(str, ev3, hashMap);
        this.A02 = str;
        this.A00 = ev3;
        this.A03 = hashMap;
        this.A01 = str2;
    }
}
