package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.AAw  reason: case insensitive filesystem */
public abstract class C39825AAw {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.A9t] */
    public static C39798A9t parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("reply_text".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    obj.A05 = A0l;
                } else if ("note_id".equals(A17)) {
                    obj.A00 = r5.A0y();
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l2, 0);
                    obj.A07 = A0l2;
                } else if ("subtitle".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l3, 0);
                    obj.A06 = A0l3;
                } else if ("profile_pic_url".equals(A17)) {
                    obj.A02 = 16W.parseFromJson(r5);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    obj.A03 = 1aC.A00(r5, false);
                } else if ("media_code".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r5);
                } else if (AnonymousClass000.A00(88).equals(A17)) {
                    obj.A01 = 16h.A00(r5);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, C39798A9t a9t) {
        r3.A0c();
        a9t.A00();
        r3.A0R("reply_text", a9t.A00());
        r3.A0Q("note_id", a9t.A00);
        a9t.A02();
        r3.A0R(DialogModule.KEY_TITLE, a9t.A02());
        a9t.A01();
        r3.A0R("subtitle", a9t.A01());
        if (a9t.A02 != null) {
            r3.A0q("profile_pic_url");
            16W.A00(r3, a9t.A02);
        }
        if (a9t.A03 != null) {
            r3.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            User user = a9t.A03;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r3, user);
        }
        String str = a9t.A04;
        if (str != null) {
            r3.A0R("media_code", str);
        }
        if (a9t.A01 != null) {
            r3.A0q(AnonymousClass000.A00(88));
            16h.A01(r3, a9t.A01);
        }
        r3.A0Z();
    }
}
