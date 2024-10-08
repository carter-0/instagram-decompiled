package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public abstract class I5N {
    public static AnonymousClass1MK A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(com.instagram.common.session.UserSession r4, java.lang.String r5, java.util.List r6, boolean r7) {
        /*
            r3 = 0
            if (r6 == 0) goto L_0x001a
            java.util.Iterator r2 = r6.iterator()
        L_0x0007:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r1 = r2.next()
            boolean r0 = X.0qQ.A0K(r1, r5)
            if (r0 != r7) goto L_0x0007
            r3 = r1
        L_0x0018:
            java.lang.String r3 = (java.lang.String) r3
        L_0x001a:
            X.17i r0 = X.17h.A00(r4)
            com.instagram.user.model.User r1 = r0.A02(r3)
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = r1.getShortName()
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = X.AnonymousClass50n.A08(r1)
            X.0qQ.A07(r0)
        L_0x0031:
            return r0
        L_0x0032:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5N.A00(com.instagram.common.session.UserSession, java.lang.String, java.util.List, boolean):java.lang.String");
    }

    public static final String A01(String str, List list, boolean z) {
        Object obj;
        0qQ.A0B(str, 1);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(DbS.A0q(obj), str) == z) {
                break;
            }
        }
        User user = (User) obj;
        if (user == null) {
            return null;
        }
        String shortName = user.getShortName();
        if (shortName != null) {
            return shortName;
        }
        String A08 = AnonymousClass50n.A08(user);
        0qQ.A07(A08);
        return A08;
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        DbU.A0w(fragmentActivity, Q21.A00(AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str), AnonymousClass7TE.A1L("blend_id", str2), AnonymousClass7TE.A1L(C273654mx.A00(992), (Object) null), AnonymousClass7TE.A1L(AnonymousClass000.A00(4531), str3), AnonymousClass7TE.A1L(AnonymousClass000.A00(4532), str4), AnonymousClass7TE.A1L(AnonymousClass000.A00(525), str5), AnonymousClass7TE.A1L("blend_membership_checked_status", Boolean.valueOf(z)), AnonymousClass7TE.A1L("blend_is_eligible_to_reinvite", Boolean.valueOf(z2))), userSession, ModalActivity.class, C273654mx.A00(468));
    }

    public static final boolean A03(UserSession userSession) {
        return GAW.A00(userSession).booleanValue();
    }
}
