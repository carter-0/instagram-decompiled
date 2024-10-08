package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;
import java.io.IOException;

/* renamed from: X.53A  reason: invalid class name */
public abstract class AnonymousClass53A {
    public static AnonymousClass53G parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            Boolean bool2 = null;
            AnonymousClass9IE r7 = null;
            DirectAnimatedMediaUser directAnimatedMediaUser = null;
            Boolean bool3 = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("is_random".equals(A0q)) {
                    bool2 = Boolean.valueOf(r12.A0d());
                } else if ("is_sticker".equals(A0q)) {
                    bool = Boolean.valueOf(r12.A0d());
                } else if ("images".equals(A0q)) {
                    r7 = AnonymousClass53B.parseFromJson(r12);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    directAnimatedMediaUser = AnonymousClass53E.parseFromJson(r12);
                } else if ("is_ai_generated".equals(A0q)) {
                    bool3 = Boolean.valueOf(r12.A0d());
                }
                r12.A0z();
            }
            if (str == null && (r12 instanceof 0c9)) {
                ((0c9) r12).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "DirectAnimatedMediaResponseItem");
            } else if (bool != null || !(r12 instanceof 0c9)) {
                return new AnonymousClass53G(r7, directAnimatedMediaUser, bool2, bool3, str, bool.booleanValue());
            } else {
                ((0c9) r12).A03.A00("is_sticker", "DirectAnimatedMediaResponseItem");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, AnonymousClass53G r6) {
        r5.A0c();
        String str = r6.A04;
        if (str != null) {
            r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        Boolean bool = r6.A03;
        if (bool != null) {
            r5.A0S("is_random", bool.booleanValue());
        }
        r5.A0S("is_sticker", r6.A05);
        AnonymousClass9IE r1 = r6.A00;
        if (r1 != null) {
            r5.A0q("images");
            r5.A0c();
            GifUrlImpl gifUrlImpl = (GifUrlImpl) r1.A00;
            if (gifUrlImpl != null) {
                r5.A0q("fixed_height");
                AnonymousClass53C.A00(r5, gifUrlImpl);
            }
            r5.A0Z();
        }
        DirectAnimatedMediaUser directAnimatedMediaUser = r6.A01;
        if (directAnimatedMediaUser != null) {
            r5.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            r5.A0c();
            String str2 = directAnimatedMediaUser.A00;
            if (str2 != null) {
                r5.A0R(Dbf.A02(31, 8, 105), str2);
            }
            r5.A0S("is_verified", directAnimatedMediaUser.A01);
            r5.A0Z();
        }
        Boolean bool2 = r6.A02;
        if (bool2 != null) {
            r5.A0S("is_ai_generated", bool2.booleanValue());
        }
        r5.A0Z();
    }
}
