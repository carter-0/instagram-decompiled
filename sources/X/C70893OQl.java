package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;
import java.io.IOException;

/* renamed from: X.OQl  reason: case insensitive filesystem */
public abstract class C70893OQl {
    public static DirectAnimatedMedia parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            GifUrlImpl gifUrlImpl = null;
            Boolean bool2 = null;
            DirectAnimatedMediaUser directAnimatedMediaUser = null;
            Boolean bool3 = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if ("gif_url".equals(A17)) {
                    gifUrlImpl = AnonymousClass53C.parseFromJson(r13);
                } else if ("is_random".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r13);
                } else if ("is_sticker".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    directAnimatedMediaUser = AnonymousClass53E.parseFromJson(r13);
                } else {
                    bool3 = C41847B3o.A0z(r13, bool3, A17, C273654mx.A00(313));
                }
                r13.A0z();
            }
            if (str == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r13, "DirectAnimatedMedia");
            } else if (gifUrlImpl == null && (r13 instanceof 0c9)) {
                AnonymousClass7TF.A1L("gif_url", r13, "DirectAnimatedMedia");
            } else if (bool != null || !(r13 instanceof 0c9)) {
                return new DirectAnimatedMedia(directAnimatedMediaUser, gifUrlImpl, bool2, bool3, str, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L("is_sticker", r13, "DirectAnimatedMedia");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, DirectAnimatedMedia directAnimatedMedia) {
        r3.A0c();
        String str = directAnimatedMedia.A05;
        if (str != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
        if (gifUrlImpl != null) {
            r3.A0q("gif_url");
            AnonymousClass53C.A00(r3, gifUrlImpl);
        }
        Boolean bool = directAnimatedMedia.A04;
        if (bool != null) {
            r3.A0S("is_random", bool.booleanValue());
        }
        r3.A0S("is_sticker", directAnimatedMedia.A06);
        DirectAnimatedMediaUser directAnimatedMediaUser = directAnimatedMedia.A01;
        if (directAnimatedMediaUser != null) {
            r3.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            r3.A0c();
            String str2 = directAnimatedMediaUser.A00;
            if (str2 != null) {
                r3.A0R(Dbf.A01(), str2);
            }
            r3.A0S(AnonymousClass000.A00(1534), directAnimatedMediaUser.A01);
            r3.A0Z();
        }
        Boolean bool2 = directAnimatedMedia.A03;
        if (bool2 != null) {
            r3.A0S(C273654mx.A00(313), bool2.booleanValue());
        }
        r3.A0Z();
    }
}
