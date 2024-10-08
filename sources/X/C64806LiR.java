package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LiR  reason: case insensitive filesystem */
public final class C64806LiR implements C232262tL {
    public final UserSession A00;
    public final CharSequence A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_monetization";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64806LiR liR = (C64806LiR) obj;
        0qQ.A0B(liR, 0);
        if (0qQ.A0K(this.A02, liR.A02)) {
            if (Dba.A1X(liR.A01, this.A01.toString()) && this.A03 == liR.A03 && this.A04 == liR.A04) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C64806LiR(UserSession userSession, CharSequence charSequence, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = str;
        this.A01 = charSequence;
        this.A03 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A05 = z4;
        this.A00 = userSession;
    }
}
