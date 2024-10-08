package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

public abstract class A03 {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, A44 a44, AnonymousClass2Ep r26, MessageIdentifier messageIdentifier, User user, String str, String str2) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(fragmentActivity2, userSession2);
        User user2 = user;
        String str3 = str;
        String str4 = str2;
        String str5 = "DEFAULT";
        FragmentActivity fragmentActivity3 = fragmentActivity2;
        UserSession userSession3 = userSession2;
        C49936FFp fFp = new C49936FFp((C3263576k) null, (C69445Nlp) null, (Boolean) null, (Boolean) null, str4, "direct_thread", user2.B6o().name(), str3, "DEFAULT", str5, AnonymousClass7TF.A0b(), user2.BIW());
        C48887Eln.A00(fragmentActivity2, (Fragment) null, fragmentActivity3, userSession3, (C49475EwG) null, (C331157Pu) null, (C331127Pr) null, user2, fFp, new Ah1(fragmentActivity2, userSession2, a44, r26, messageIdentifier), (G8B) null);
    }
}
