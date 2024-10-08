package X;

import com.instagram.user.model.User;

/* renamed from: X.Dtb  reason: case insensitive filesystem */
public final class C47250Dtb extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final User A01;
    public final String A02;

    public C47250Dtb(User user, String str, int i) {
        0qQ.A0B(user, 1);
        this.A01 = user;
        this.A00 = i;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47250Dtb) {
                C47250Dtb dtb = (C47250Dtb) obj;
                if (!0qQ.A0K(this.A01, dtb.A01) || this.A00 != dtb.A00 || !0qQ.A0K(this.A02, dtb.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A01) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A02);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GroupMentionViewModel(user=");
        A1A.append(this.A01);
        A1A.append(", position=");
        A1A.append(this.A00);
        A1A.append(", reelPk=");
        A1A.append(this.A02);
        return AnonymousClass7TG.A0p(A1A);
    }
}
