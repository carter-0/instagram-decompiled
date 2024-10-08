package X;

import com.facebook.msys.mci.AuthData;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Set;

public final class N8U extends AnonymousClass0T0 implements C74247Prb {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C376489Ie A06;
    public final C53394GnR A07;
    public final C61066Jw4 A08;
    public final N4L A09;
    public final AuthData A0A;
    public final AnonymousClass7LZ A0B;
    public final MessagingUser A0C;
    public final OKP A0D;
    public final MsysThreadId A0E;
    public final C376369Hs A0F;
    public final Long A0G;
    public final Long A0H;
    public final String A0I;
    public final Set A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8U) {
                N8U n8u = (N8U) obj;
                if (!0qQ.A0K(this.A0C, n8u.A0C) || !0qQ.A0K(this.A0E, n8u.A0E) || !0qQ.A0K(this.A0A, n8u.A0A) || !0qQ.A0K(this.A0F, n8u.A0F) || this.A05 != n8u.A05 || !0qQ.A0K(this.A06, n8u.A06) || !0qQ.A0K(this.A0B, n8u.A0B) || !0qQ.A0K(this.A0D, n8u.A0D) || !0qQ.A0K(this.A07, n8u.A07) || !0qQ.A0K(this.A0H, n8u.A0H) || !0qQ.A0K(this.A0G, n8u.A0G) || this.A04 != n8u.A04 || this.A03 != n8u.A03 || this.A02 != n8u.A02 || this.A01 != n8u.A01 || !0qQ.A0K(this.A0J, n8u.A0J) || !0qQ.A0K(this.A08, n8u.A08) || !0qQ.A0K(this.A09, n8u.A09) || !0qQ.A0K(this.A0I, n8u.A0I) || this.A00 != n8u.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A07(this.A0E, AnonymousClass7TE.A0K(this.A0C)));
        int A073 = AnonymousClass7TF.A07(this.A0B, (((AnonymousClass7TF.A07(this.A0F, A072) + this.A05) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31);
        return ((((((AnonymousClass7TF.A07(this.A0J, (((((((((((((AnonymousClass7TF.A07(this.A0D, A073) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A0H)) * 31) + AnonymousClass7TG.A0C(this.A0G)) * 31) + this.A04) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + C41845B3m.A00(this.A0I)) * 31) + this.A00;
    }

    public N8U(C376489Ie r2, C53394GnR gnR, C61066Jw4 jw4, N4L n4l, AuthData authData, AnonymousClass7LZ r7, MessagingUser messagingUser, OKP okp, MsysThreadId msysThreadId, C376369Hs r11, Long l, Long l2, String str, Set set, int i, int i2, int i3, int i4, int i5, int i6) {
        AnonymousClass7TG.A1P(messagingUser, authData);
        this.A0C = messagingUser;
        this.A0E = msysThreadId;
        this.A0A = authData;
        this.A0F = r11;
        this.A05 = i;
        this.A06 = r2;
        this.A0B = r7;
        this.A0D = okp;
        this.A07 = gnR;
        this.A0H = l;
        this.A0G = l2;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A0J = set;
        this.A08 = jw4;
        this.A09 = n4l;
        this.A0I = str;
        this.A00 = i6;
    }

    public static final N8U A00(C376489Ie r1, C53394GnR gnR, C61066Jw4 jw4, N4L n4l, AuthData authData, AnonymousClass7LZ r6, MessagingUser messagingUser, OKP okp, MsysThreadId msysThreadId, C376369Hs r10, Long l, Long l2, String str, Set set, int i, int i2, int i3, int i4, int i5, int i6) {
        C51974G9v.A1O(messagingUser, msysThreadId, authData, r10);
        C51972G9s.A1E(r6, okp);
        0qQ.A0B(set, 15);
        return new N8U(r1, gnR, jw4, n4l, authData, r6, messagingUser, okp, msysThreadId, r10, l, l2, str, set, i, i2, i3, i4, i5, i6);
    }
}
