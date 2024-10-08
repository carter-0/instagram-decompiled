package X;

import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.Juy  reason: case insensitive filesystem */
public final class C61002Juy extends AnonymousClass0T0 {
    public static final C61002Juy A02 = new C61002Juy("direct_thread", "add_to_cowatch");
    public static final C61002Juy A03 = C64010LIx.A01(UserStoryTarget.A01);
    public static final C61002Juy A04 = new C61002Juy("blast_candidates", "blast_candidates");
    public static final C61002Juy A05 = C64010LIx.A01(UserStoryTarget.A02);
    public static final C61002Juy A06 = new C61002Juy("close_friends_blast", "close_friends_blast");
    public static final C61002Juy A07 = C64010LIx.A01(UserStoryTarget.A03);
    public static final C61002Juy A08 = C64010LIx.A01(UserStoryTarget.A04);
    public static final C61002Juy A09 = C64010LIx.A01(UserStoryTarget.A05);
    public static final C61002Juy A0A = C64010LIx.A01(UserStoryTarget.A06);
    public static final C61002Juy A0B = C64010LIx.A01(UserStoryTarget.A08);
    public static final C61002Juy A0C = C64010LIx.A01(UserStoryTarget.A09);
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61002Juy) {
                C61002Juy juy = (C61002Juy) obj;
                if (!0qQ.A0K(this.A01, juy.A01) || !0qQ.A0K(this.A00, juy.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public C61002Juy(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }
}
