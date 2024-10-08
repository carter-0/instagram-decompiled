package X;

import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.user.model.User;

/* renamed from: X.N5y  reason: case insensitive filesystem */
public final class C68209N5y extends AnonymousClass0T0 implements C232262tL {
    public final long A00;
    public final NoteAudienceItem A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68209N5y) {
                C68209N5y n5y = (C68209N5y) obj;
                if (!(0qQ.A0K(this.A03, n5y.A03) && this.A00 == n5y.A00 && 0qQ.A0K(this.A02, n5y.A02) && 0qQ.A0K(this.A01, n5y.A01) && this.A06 == n5y.A06 && this.A05 == n5y.A05 && 0qQ.A0K(this.A04, n5y.A04) && this.A07 == n5y.A07 && this.A08 == n5y.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A00);
    }

    public final int hashCode() {
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A01, C51975G9x.A05(this.A02, C51972G9s.A07(this.A00, AnonymousClass7TE.A0O(this.A03))) * 31))))));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C68209N5y n5y = (C68209N5y) obj;
        if (n5y == null || this.A00 != n5y.A00) {
            return false;
        }
        return true;
    }

    public C68209N5y(NoteAudienceItem noteAudienceItem, User user, String str, String str2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1P(str, user);
        0qQ.A0B(str2, 8);
        this.A03 = str;
        this.A00 = j;
        this.A02 = user;
        this.A01 = noteAudienceItem;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = str2;
        this.A07 = z3;
        this.A08 = z4;
    }
}
