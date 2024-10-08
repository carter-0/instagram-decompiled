package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Tqb  reason: case insensitive filesystem */
public final class C14141Tqb implements C20980X7u {
    public final int A00;

    public C14141Tqb(int i) {
        this.A00 = i;
    }

    public final void AHn(UserSession userSession) {
        String str;
        int i = this.A00;
        0xY A0Y = C13989Tnp.A0Y(userSession);
        switch (i) {
            case 0:
                str = "recent_effect_searches";
                break;
            case 1:
                str = AnonymousClass000.A00(3837);
                break;
            case 2:
                str = "recent_keyword_searches_with_ts";
                break;
            case 3:
                str = "recent_map_hashtag_searches_with_ts";
                break;
            case 4:
                str = "recent_map_query_searches_with_ts";
                break;
            case 5:
                str = "recent_map_location_searches_with_ts";
                break;
            case 6:
                str = AnonymousClass000.A00(3838);
                break;
            case 7:
                str = "recent_tagged_users";
                break;
            default:
                str = AnonymousClass000.A00(3839);
                break;
        }
        A0Y.ED3(str);
        A0Y.apply();
    }

    public final String B8G(UserSession userSession) {
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        int i2 = this.A00;
        1Av A0Z = C13989Tnp.A0Z(userSession);
        switch (i2) {
            case 0:
                r2 = A0Z.A6w;
                r1 = 1Av.A8a;
                i = 15;
                break;
            case 1:
                r2 = A0Z.A6x;
                r1 = 1Av.A8a;
                i = 11;
                break;
            case 2:
                r2 = A0Z.A6y;
                r1 = 1Av.A8a;
                i = 13;
                break;
            case 3:
                r2 = A0Z.A6z;
                r1 = 1Av.A8a;
                i = 17;
                break;
            case 4:
                r2 = A0Z.A71;
                r1 = 1Av.A8a;
                i = 18;
                break;
            case 5:
                r2 = A0Z.A70;
                r1 = 1Av.A8a;
                i = 16;
                break;
            case 6:
                r2 = A0Z.A72;
                r1 = 1Av.A8a;
                i = 12;
                break;
            case 7:
                r2 = A0Z.A75;
                r1 = 1Av.A8a;
                i = 10;
                break;
            default:
                r2 = A0Z.A74;
                r1 = 1Av.A8a;
                i = 9;
                break;
        }
        return (String) Pxe.A0s(A0Z, r2, r1, i);
    }

    public final void EKG(UserSession userSession, String str) {
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        int i2 = this.A00;
        AnonymousClass7TG.A1N(userSession, str);
        1Av A002 = 1Au.A00(userSession);
        switch (i2) {
            case 0:
                r2 = A002.A6w;
                r1 = 1Av.A8a;
                i = 15;
                break;
            case 1:
                r2 = A002.A6x;
                r1 = 1Av.A8a;
                i = 11;
                break;
            case 2:
                r2 = A002.A6y;
                r1 = 1Av.A8a;
                i = 13;
                break;
            case 3:
                r2 = A002.A6z;
                r1 = 1Av.A8a;
                i = 17;
                break;
            case 4:
                r2 = A002.A71;
                r1 = 1Av.A8a;
                i = 18;
                break;
            case 5:
                r2 = A002.A70;
                r1 = 1Av.A8a;
                i = 16;
                break;
            case 6:
                r2 = A002.A72;
                r1 = 1Av.A8a;
                i = 12;
                break;
            case 7:
                r2 = A002.A75;
                r1 = 1Av.A8a;
                i = 10;
                break;
            default:
                r2 = A002.A74;
                r1 = 1Av.A8a;
                i = 9;
                break;
        }
        DbS.A1a(A002, str, r2, r1, i);
    }
}
