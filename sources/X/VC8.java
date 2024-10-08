package X;

import com.instagram.common.session.UserSession;

public abstract class VC8 {
    public static final void A00(UserSession userSession, AnonymousClass4DU r3, String str, String str2, String str3, int i) {
        DbW.A1N(str, 0, userSession);
        C254523sc A0O = C13991Tnr.A0O(r3, "question_impression");
        A0O.A6t = str;
        A0O.A6G = str2;
        A0O.A6X = str3;
        A0O.A0Z = i;
        C51972G9s.A1A(A0O);
        if (!C271764jY.A00(userSession, A0O, r3, AnonymousClass05K.A01)) {
            C13991Tnr.A1F(userSession, A0O);
        }
    }
}
