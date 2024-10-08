package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.NHr  reason: case insensitive filesystem */
public final class C68432NHr extends C272124k8 {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68432NHr(UserSession userSession, int i) {
        super(userSession);
        this.A00 = i;
    }

    public final void A01(UserSession userSession) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1045015871);
                i2 = -1787752785;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1920728188);
                i2 = 1502744282;
                break;
            default:
                super.A01(userSession);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void A02(UserSession userSession) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1394526274);
                i2 = 1855188204;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1060865643);
                i2 = -170470193;
                break;
            default:
                super.A02(userSession);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void A05(C268654dm r3, UserSession userSession) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(832195819);
                AnonymousClass7TG.A1N(userSession, r3);
                super.A05(r3, userSession);
                i = 634996676;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1760381478);
                i = 1777419726;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-1317390123);
                i = -669398458;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-719127213);
                CF4 cf4 = (CF4) obj;
                int A032 = AnonymousClass0fD.A03(-658557624);
                AnonymousClass7TG.A1N(userSession, cf4);
                17i A002 = 17h.A00(userSession);
                User user = cf4.A00;
                user.getClass();
                A002.A03(user);
                AnonymousClass0fD.A0A(1708953352, A032);
                i = 1812868370;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1951893562);
                AnonymousClass74W r6 = (AnonymousClass74W) obj;
                int A033 = AnonymousClass0fD.A03(583632617);
                AnonymousClass7TG.A1N(userSession, r6);
                C66584MXp.A14(userSession, r6);
                AnonymousClass0fD.A0A(1387108266, A033);
                i = -902069486;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-523712715);
                AnonymousClass74W r62 = (AnonymousClass74W) obj;
                int A034 = AnonymousClass0fD.A03(-991765555);
                AnonymousClass7TG.A1N(userSession, r62);
                C66584MXp.A14(userSession, r62);
                AnonymousClass0fD.A0A(4619439, A034);
                i = 500511806;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
