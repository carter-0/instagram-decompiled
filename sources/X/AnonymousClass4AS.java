package X;

import com.instagram.user.model.User;

/* renamed from: X.4AS  reason: invalid class name */
public final class AnonymousClass4AS extends AnonymousClass4AA {
    public final User A00;
    public final String A01;
    public final boolean A02;

    public AnonymousClass4AS(User user, String str, boolean z) {
        0qQ.A0B(str, 3);
        this.A00 = user;
        this.A02 = z;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4AS) {
                AnonymousClass4AS r5 = (AnonymousClass4AS) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || this.A02 != r5.A02 || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return ((hashCode + i) * 31) + this.A01.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        User user;
        AnonymousClass4AS r3 = (AnonymousClass4AS) obj;
        String id = this.A00.getId();
        if (r3 == null || (user = r3.A00) == null) {
            str = null;
        } else {
            str = user.getId();
        }
        if (!0qQ.A0K(id, str) || this.A02 != r3.A02 || !0qQ.A0K(this.A01, r3.A01)) {
            return false;
        }
        return true;
    }
}
