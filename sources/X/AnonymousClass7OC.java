package X;

import com.instagram.user.model.User;

/* renamed from: X.7OC  reason: invalid class name */
public final class AnonymousClass7OC extends AnonymousClass0T0 implements C232262tL, C331837So {
    public final C328407Er A00;
    public final AnonymousClass7L0 A01;
    public final User A02;
    public final String A03;
    public final AnonymousClass0eM A04;
    public final 0sK A05;
    public final boolean A06;
    public final AnonymousClass0eM A07;

    public AnonymousClass7OC(C328407Er r4, AnonymousClass7L0 r5, User user, String str, 0sK r8, boolean z) {
        0qQ.A0B(r4, 4);
        0qQ.A0B(r8, 6);
        this.A03 = str;
        this.A02 = user;
        this.A06 = z;
        this.A00 = r4;
        this.A01 = r5;
        this.A05 = r8;
        0eO r2 = 0eO.A02;
        this.A04 = AnonymousClass0eN.A00(r2, new C73909Plk(this, 27));
        this.A07 = AnonymousClass0eN.A00(r2, C73781Pjg.A00);
    }

    public final long C7Z() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7OC) {
                AnonymousClass7OC r5 = (AnonymousClass7OC) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || this.A06 != r5.A06 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getType() {
        return 168;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04.getValue();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        User user = this.A02;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A06) {
            i4 = 1231;
        }
        int hashCode3 = (((i3 + i4) * 31) + this.A00.hashCode()) * 31;
        AnonymousClass7L0 r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.A05.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
