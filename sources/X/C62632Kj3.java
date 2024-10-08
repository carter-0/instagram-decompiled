package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Kj3  reason: case insensitive filesystem */
public enum C62632Kj3 {
    ;
    
    public final 2DQ A00;

    /* access modifiers changed from: public */
    static {
        C62632Kj3[] kj3Arr;
        A01 = 0oU.A00(kj3Arr);
    }

    public final LGS A01(UserSession userSession, String str, List list) {
        if (this instanceof KZK) {
            0qQ.A0B(list, 1);
            return new ERD(list, str);
        } else if (this instanceof KZJ) {
            0qQ.A0B(list, 1);
            return new ERC(list, str);
        } else if (this instanceof KZI) {
            0qQ.A0B(list, 1);
            return new ERB(list, str);
        } else if (this instanceof KZH) {
            0qQ.A0B(list, 1);
            return new ERA(list);
        } else if (this instanceof KZG) {
            0qQ.A0B(list, 1);
            return new ER9(list);
        } else if (this instanceof KZF) {
            AnonymousClass7TG.A1N(userSession, list);
            return new KZO(A00(userSession, list));
        } else if (this instanceof KZE) {
            AnonymousClass7TG.A1N(userSession, list);
            return new KZN(A00(userSession, list));
        } else if (this instanceof KZD) {
            0qQ.A0B(list, 1);
            return new KZY(list);
        } else if (this instanceof KZC) {
            AnonymousClass7TG.A1N(userSession, list);
            return new KZX(A00(userSession, list));
        } else if (this instanceof KZB) {
            0qQ.A0B(list, 1);
            return new KZW(list);
        } else if (this instanceof KZA) {
            AnonymousClass7TG.A1N(userSession, list);
            return new KZV(A00(userSession, list));
        } else if (this instanceof KZ9) {
            0qQ.A0B(list, 1);
            return new KZT(list);
        } else if (this instanceof KZ8) {
            0qQ.A0B(list, 1);
            return new KZS(list);
        } else if (this instanceof KZ7) {
            AnonymousClass7TG.A1N(userSession, list);
            return new KZR(A00(userSession, list));
        } else if (this instanceof KZ6) {
            AnonymousClass7TG.A1N(userSession, list);
            return new KZQ(A00(userSession, list));
        } else if (this instanceof KZ5) {
            0qQ.A0B(list, 1);
            return new C62070KZa(AnonymousClass819.BOTTOMSHEET_META_BUSINESS_SUITE_STORY, list);
        } else if (this instanceof KZ4) {
            return new KZM();
        } else {
            if (this instanceof KZ3) {
                return new KZL();
            }
            if (this instanceof KZ2) {
                0qQ.A0B(list, 1);
                return new KZP(list);
            } else if (this instanceof KZ1) {
                AnonymousClass7TG.A1N(userSession, list);
                return new KZU(A00(userSession, list));
            } else {
                0qQ.A0B(list, 1);
                return new KZZ(list);
            }
        }
    }

    /* access modifiers changed from: public */
    C62632Kj3(int i) {
        this.A00 = r1;
    }

    public static List A00(0lg r0, List list) {
        if (!C63434Kwu.A00(r0).booleanValue()) {
            return null;
        }
        return list;
    }
}
