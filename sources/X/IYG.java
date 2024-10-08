package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class IYG implements C233182vC {
    public final int A00;
    public final Object A01;

    public IYG(UserSession userSession, int i) {
        this.A00 = i;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ int ATm(Object obj) {
        if (2 - this.A00 != 0) {
            return -1;
        }
        1PW r2 = (1PW) obj;
        0qQ.A0B(r2, 0);
        return r2.A01;
    }

    public final /* bridge */ /* synthetic */ String ATn(Object obj) {
        switch (this.A00) {
            case 0:
                1Xj A0X = C51975G9x.A0X(obj);
                if (A0X != null) {
                    return C231122qu.A07((UserSession) this.A01, A0X);
                }
                return "";
            case 1:
                return C51972G9s.A0Y(obj).getId();
            default:
                return C51969G9p.A0m(obj).A0S;
        }
    }

    public final /* bridge */ /* synthetic */ Collection ATq(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
                List emptyList = Collections.emptyList();
                0qQ.A07(emptyList);
                return emptyList;
            default:
                return AnonymousClass7TE.A1C();
        }
    }

    public final /* bridge */ /* synthetic */ String ATt(Object obj) {
        List list;
        if (this.A00 != 0) {
            return null;
        }
        1Xj A0X = C51975G9x.A0X(obj);
        if (A0X != null) {
            list = A0X.A0e;
        } else {
            list = null;
        }
        return C243413Yr.A00(list);
    }

    public final /* bridge */ /* synthetic */ int ATy(Object obj) {
        if (2 - this.A00 != 0) {
            return -1;
        }
        C233472vm A002 = GV8.A00(obj);
        if (A002 != null) {
            return A002.A03();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ Boolean AU2(Object obj) {
        1Xj A0X;
        if (this.A00 != 0 || (A0X = C51975G9x.A0X(obj)) == null) {
            return null;
        }
        return Boolean.valueOf(C231122qu.A0R((UserSession) this.A01, A0X));
    }

    public final /* bridge */ /* synthetic */ String AU6(Object obj) {
        C53328GmE A02;
        String str;
        String id;
        switch (this.A00) {
            case 0:
                return C51971G9r.A0s(C51975G9x.A0X(obj));
            case 1:
                C267324bN A0Y = C51972G9s.A0Y(obj);
                1Xj A05 = A0Y.A05();
                if (A05 != null && (id = A05.getId()) != null) {
                    return id;
                }
                if (!A0Y.A0G() || (A02 = A0Y.A02()) == null || (str = A02.A09) == null) {
                    return "No media Id found";
                }
                return str;
            case 2:
                String id2 = C51969G9p.A0m(obj).A0K.getId();
                if (id2 != null) {
                    return id2;
                }
                throw AnonymousClass7TE.A0y();
            default:
                String id3 = C51969G9p.A0m(obj).A0K.getId();
                if (id3 != null) {
                    return id3;
                }
                throw AnonymousClass7TE.A0y();
        }
    }

    public final /* bridge */ /* synthetic */ int AU9(Object obj) {
        C233472vm r0;
        switch (this.A00) {
            case 0:
                return -1;
            case 1:
                C376489Ie r2 = (C376489Ie) obj;
                0qQ.A0B(r2, 0);
                r0 = (C233472vm) r2.A04;
                if (r0 == null) {
                    return -1;
                }
                break;
            case 2:
                C233472vm A002 = GV8.A00(obj);
                if (A002 != null) {
                    return A002.A07();
                }
                throw AnonymousClass7TE.A0y();
            default:
                r0 = GV8.A00(obj);
                if (r0 == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
        }
        return r0.A05();
    }

    public final /* bridge */ /* synthetic */ String AUE(Object obj) {
        if (1 - this.A00 != 0) {
            return null;
        }
        return C51972G9s.A0Y(obj).getId();
    }

    public final /* bridge */ /* synthetic */ String AUF(Object obj) {
        String str;
        if (1 - this.A00 != 0) {
            return null;
        }
        C53328GmE A02 = C51972G9s.A0Y(obj).A02();
        if (A02 == null || (str = A02.A0B) == null) {
            return "";
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ Collection AUG(Object obj) {
        if (this.A00 != 0) {
            1PW r2 = (1PW) obj;
            0qQ.A0B(r2, 0);
            return r2.A0I;
        }
        List emptyList = Collections.emptyList();
        0qQ.A07(emptyList);
        return emptyList;
    }

    public final /* bridge */ /* synthetic */ String AUT(Object obj) {
        String str;
        String C9L;
        switch (this.A00) {
            case 0:
                1Xj A0X = C51975G9x.A0X(obj);
                if (A0X != null) {
                    return C231122qu.A0F((UserSession) this.A01, A0X);
                }
                return "";
            case 1:
                C267324bN A0Y = C51972G9s.A0Y(obj);
                if (A0Y.A0G()) {
                    1Xj r0 = A0Y.A02;
                    if (r0 != null && (C9L = r0.C9L()) != null) {
                        return C9L;
                    }
                    C53328GmE A02 = A0Y.A02();
                    if (A02 != null) {
                        return A02.A0E;
                    }
                    return "No tracking token found";
                } else if (A0Y.A01 != C295365o2.BRAND_SURVEY) {
                    return A0Y.A06().A0j;
                } else {
                    C45427Cw7 A04 = A0Y.A04();
                    if (A04 != null) {
                        str = A04.A08;
                    } else {
                        str = null;
                    }
                    return String.valueOf(str);
                }
            default:
                return C51969G9p.A0m(obj).A0j;
        }
    }

    public final /* bridge */ /* synthetic */ int AUA(Object obj) {
        return -1;
    }

    public final /* bridge */ /* synthetic */ int AUB(Object obj) {
        return -1;
    }

    public final /* bridge */ /* synthetic */ int AUC(Object obj) {
        return -1;
    }

    public final /* bridge */ /* synthetic */ int AUD(Object obj) {
        return -1;
    }

    public final /* synthetic */ String AUK(Object obj) {
        return null;
    }
}
