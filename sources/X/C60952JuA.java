package X;

import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* renamed from: X.JuA  reason: case insensitive filesystem */
public final class C60952JuA extends AnonymousClass0T0 {
    public final C62569Khz A00;
    public final UpcomingEvent A01;
    public final String A02;
    public final Date A03;
    public final Date A04;
    public final boolean A05;
    public final boolean A06;

    public C60952JuA(C62569Khz khz, UpcomingEvent upcomingEvent, String str, Date date, Date date2, boolean z, boolean z2) {
        0qQ.A0B(khz, 2);
        this.A01 = upcomingEvent;
        this.A00 = khz;
        this.A02 = str;
        this.A04 = date;
        this.A03 = date2;
        this.A05 = z;
        this.A06 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60952JuA) {
                C60952JuA juA = (C60952JuA) obj;
                if (!0qQ.A0K(this.A01, juA.A01) || this.A00 != juA.A00 || !0qQ.A0K(this.A02, juA.A02) || !0qQ.A0K(this.A04, juA.A04) || !0qQ.A0K(this.A03, juA.A03) || this.A05 != juA.A05 || this.A06 != juA.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A00, AnonymousClass7TG.A0C(this.A01) * 31);
        return DbS.A06(this.A06, AnonymousClass7TF.A09(this.A05, (((AnonymousClass7TF.A08(this.A02, A07) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31));
    }
}
