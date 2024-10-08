package X;

import com.instagram.api.schemas.NativeInfoCardCommentLayout;
import java.io.IOException;

/* renamed from: X.Vlj  reason: case insensitive filesystem */
public abstract class C18115Vlj {
    public static UNG parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            UNM unm = null;
            UNN unn = null;
            NativeInfoCardCommentLayout nativeInfoCardCommentLayout = null;
            UNM unm2 = null;
            UNO uno = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("comment_text".equals(A17)) {
                    unm = C18116Vlk.parseFromJson(r8);
                } else if ("icon_text".equals(A17)) {
                    unn = C18117Vll.parseFromJson(r8);
                } else if ("layout".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    nativeInfoCardCommentLayout = (NativeInfoCardCommentLayout) NativeInfoCardCommentLayout.A01.get(str);
                    if (nativeInfoCardCommentLayout == null) {
                        nativeInfoCardCommentLayout = NativeInfoCardCommentLayout.UNRECOGNIZED;
                    }
                } else if ("user_name".equals(A17)) {
                    unm2 = C18116Vlk.parseFromJson(r8);
                } else if ("user_profile_pic".equals(A17)) {
                    uno = C18118Vlm.parseFromJson(r8);
                }
                r8.A0z();
            }
            return new UNG(nativeInfoCardCommentLayout, unm, unm2, unn, uno);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, UNG ung) {
        r2.A0c();
        C21031XAk xAk = ung.A01;
        if (xAk != null) {
            r2.A0q("comment_text");
            C18116Vlk.A00(r2, xAk.F6j());
        }
        C21032XAl xAl = ung.A03;
        if (xAl != null) {
            r2.A0q("icon_text");
            C18117Vll.A00(r2, xAl.F6k());
        }
        NativeInfoCardCommentLayout nativeInfoCardCommentLayout = ung.A00;
        if (nativeInfoCardCommentLayout != null) {
            r2.A0R("layout", nativeInfoCardCommentLayout.A00);
        }
        C21031XAk xAk2 = ung.A02;
        if (xAk2 != null) {
            r2.A0q("user_name");
            C18116Vlk.A00(r2, xAk2.F6j());
        }
        XAX xax = ung.A04;
        if (xax != null) {
            r2.A0q("user_profile_pic");
            C18118Vlm.A00(r2, xax.F6l());
        }
        r2.A0Z();
    }
}
