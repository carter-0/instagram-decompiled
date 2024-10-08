package X;

import com.facebook.msys.mci.AuthData;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

public final class N8R extends AnonymousClass0T0 implements C74246Pra {
    public final int A00;
    public final int A01;
    public final C61084JwM A02;
    public final AuthData A03;
    public final MessagingUser A04;
    public final OFH A05;
    public final MsysThreadId A06;
    public final Integer A07;
    public final Long A08;
    public final Long A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N8R) {
                N8R n8r = (N8R) obj;
                if (!0qQ.A0K(this.A06, n8r.A06) || !0qQ.A0K(this.A04, n8r.A04) || !0qQ.A0K(this.A03, n8r.A03) || this.A07 != n8r.A07 || this.A01 != n8r.A01 || this.A00 != n8r.A00 || !0qQ.A0K(this.A09, n8r.A09) || !0qQ.A0K(this.A08, n8r.A08) || !0qQ.A0K(this.A05, n8r.A05) || !0qQ.A0K(this.A02, n8r.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A06)));
        Integer num = this.A07;
        return (C51975G9x.A05(this.A05, (((((((AnonymousClass7TG.A0B(num, C70091Nx7.A00(num), A072) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public N8R(C61084JwM jwM, AuthData authData, MessagingUser messagingUser, OFH ofh, MsysThreadId msysThreadId, Integer num, Long l, Long l2, int i, int i2) {
        AnonymousClass7TG.A1U(msysThreadId, messagingUser, authData);
        0qQ.A0B(ofh, 9);
        this.A06 = msysThreadId;
        this.A04 = messagingUser;
        this.A03 = authData;
        this.A07 = num;
        this.A01 = i;
        this.A00 = i2;
        this.A09 = l;
        this.A08 = l2;
        this.A05 = ofh;
        this.A02 = jwM;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoadLocalMessagesSideEffect(msysThreadId=");
        A1A.append(this.A06);
        A1A.append(", currentUser=");
        A1A.append(this.A04);
        A1A.append(", authData=");
        A1A.append(this.A03);
        A1A.append(", loadType=");
        Integer num = this.A07;
        if (num != null) {
            str = C70091Nx7.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", limitOlder=");
        A1A.append(this.A01);
        A1A.append(", limitNewer=");
        A1A.append(this.A00);
        A1A.append(", minLoadedSortOrder=");
        A1A.append(this.A09);
        A1A.append(", maxLoadedSortOrder=");
        A1A.append(this.A08);
        A1A.append(", viewModelGenerators=");
        A1A.append(this.A05);
        C51975G9x.A1G(A1A, ", fetchNullStateHeaderOnly=");
        A1A.append(", messageHighlightModel=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
