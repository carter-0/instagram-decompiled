package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DuE  reason: case insensitive filesystem */
public final class C47285DuE extends E58 {
    public static final String __redex_internal_original_name = "PasswordCreationForUnlinkingFragment";
    public UserSession A00;
    public User A01;
    public String A02;
    public String A03;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.0Js] */
    public final void DUM() {
        C49580Eyp eyp = new C49580Eyp(requireContext(), AnonymousClass07i.A00(this), C47697EDg.A00(this, 1), AnonymousClass7TF.A0f(this.A03));
        08y r3 = 09i.A0A;
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("targetUserId");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r3.A0A(new Object(), (0Jv) null, eyp, str);
        }
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final String getModuleName() {
        return "password_creation_unlinking";
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("currentUserSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(1412811580);
        C47285DuE.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        String string = requireArguments.getString("child_user_id_key");
        if (string != null) {
            this.A03 = string;
            UserSession userSession = this.A00;
            if (userSession == null) {
                str = "currentUserSession";
            } else {
                0BQ A002 = AnonymousClass0BO.A00(userSession);
                String str2 = this.A03;
                if (str2 == null) {
                    str = "targetUserId";
                } else {
                    User BNw = A002.BNw(str2);
                    if (BNw != null) {
                        this.A01 = BNw;
                        String string2 = requireArguments.getString("main_user_id_key");
                        if (string2 != null) {
                            this.A02 = string2;
                            Dbc.A0p(this);
                            AnonymousClass0fD.A09(1025407240, A022);
                            return;
                        }
                        illegalStateException = AnonymousClass7TE.A0z("No MAIN_USER_ID_KEY in the argument!");
                        i = -1059155806;
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("No targetUser in the argument!");
                        i = -1356892011;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        illegalStateException = AnonymousClass7TE.A0z("No CHILD_USER_ID_KEY in the argument!");
        i = -370070264;
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
