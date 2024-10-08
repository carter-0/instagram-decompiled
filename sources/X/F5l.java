package X;

import com.instagram.common.session.UserSession;

public abstract class F5l {
    public static final void A00(UserSession userSession) {
        DbV.A0k(userSession).Eds(true);
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        if (A0q.contains("hidden_word_spam_scam_consent_accepted")) {
            0xY AR4 = A0q.AR4();
            AR4.ED3("hidden_word_spam_scam_consent_accepted");
            AR4.apply();
        }
    }

    public static final boolean A01(UserSession userSession) {
        Boolean CXz = DbV.A0k(userSession).CXz();
        if (CXz != null && CXz.booleanValue()) {
            return true;
        }
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        if (A0q.contains("hidden_word_spam_scam_consent_accepted")) {
            return A0q.getBoolean("hidden_word_spam_scam_consent_accepted", false);
        }
        return false;
    }
}
