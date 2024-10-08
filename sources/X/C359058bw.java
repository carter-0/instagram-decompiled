package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.HashSet;

/* renamed from: X.8bw  reason: invalid class name and case insensitive filesystem */
public final class C359058bw {
    public final 1E6 A00;
    public final AnonymousClass0eM A01;

    public static final C53401GnY A00(C359058bw r6, C383279fJ r7) {
        C250663lr reinterpretRequired;
        AnonymousClass3QO r4;
        C250663lr optionalTreeField = r7.getOptionalTreeField(3, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C383269fI.class, 1768082820);
        String str = null;
        if (!(optionalTreeField == null || (reinterpretRequired = optionalTreeField.reinterpretRequired(0, C43603C2d.class, 1552225453)) == null)) {
            1E6 r42 = r6.A00;
            Parcelable.Creator creator = User.CREATOR;
            User A012 = 1aC.A01(new 1E9(r42, new HashSet(), false), (ImmutablePandoUserDict) reinterpretRequired.reinterpret(ImmutablePandoUserDict.class));
            if (A012 != null) {
                1Xj A0E = ((C383589fp) r7.reinterpretRequired(0, C383589fp.class, -1310297315)).A0E(r42);
                0qQ.A07(A0E);
                String A08 = r7.A08("audience");
                if (A08 != null) {
                    r4 = (AnonymousClass3QO) AnonymousClass3QO.A01.get(A08);
                } else {
                    r4 = null;
                }
                C250663lr A04 = r7.A04(C383259fH.class, "caption", -602604897);
                if (A04 != null) {
                    str = A04.A07("text");
                }
                return new C53401GnY(A0E, r4, A012, str);
            }
        }
        return null;
    }

    public C359058bw(UserSession userSession) {
        this.A00 = 1E4.A00(userSession);
        this.A01 = AnonymousClass0eN.A01(new AnonymousClass9LV(userSession, 15));
    }
}
