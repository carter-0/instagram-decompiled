package X;

import com.instagram.api.schemas.Challenge;

/* renamed from: X.KPw  reason: case insensitive filesystem */
public final class C61883KPw extends C62791KmT {
    public final Challenge A00;
    public final C55621Hkg A01;

    public C61883KPw(Challenge challenge, C55621Hkg hkg) {
        0qQ.A0B(challenge, 1);
        this.A00 = challenge;
        this.A01 = hkg;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61883KPw) {
                C61883KPw kPw = (C61883KPw) obj;
                if (!0qQ.A0K(this.A00, kPw.A00) || !0qQ.A0K(this.A01, kPw.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }
}
