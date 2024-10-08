package X;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* renamed from: X.Oe6  reason: case insensitive filesystem */
public final class C71148Oe6 {
    public static final C71148Oe6 A00 = new Object();

    public static final String A01(UserSession userSession, 1Xj r2, Hashtag hashtag, User user) {
        0qQ.A0B(userSession, 0);
        if (user.A2Q()) {
            return C231122qu.A0G(userSession, r2);
        }
        if (hashtag != null) {
            return 002.A0D(hashtag.getName(), '#');
        }
        return user.getUsername();
    }

    public static final String A02(String str) {
        0qQ.A0B(str, 0);
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String A11 = DbT.A11(fileExtensionFromUrl, O5D.A01);
        if (A11 != null || (A11 = O5D.A00.getMimeTypeFromExtension(fileExtensionFromUrl)) != null) {
            return A11;
        }
        throw DbW.A0c("Cannot get mime type from imageUrl: ", str);
    }

    public static final void A05(1a8 r20, C333547Zj r21, C74343PtJ ptJ, 2FW r23, C254783t2 r24, String str, String str2) {
        C333547Zj r4 = r21;
        0qQ.A0B(r4, 0);
        1a8 r3 = r20;
        String str3 = str;
        AnonymousClass7TG.A1Q(str3, r3);
        PU7.A00(r4.EMt((C70766OKm) null, (C254933tI) null, (OCA) null, (DirectShareTarget) null, r23, r24, (Integer) null, (Integer) null, str3, NetInfoModule.CONNECTION_TYPE_NONE, str2, (String) null, (String) null, (String) null, (List) null, false, true), r3, ptJ, 7);
    }

    public static final byte[] A07(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        0fO.A02(Bitmap.CompressFormat.PNG, bitmap, byteArrayOutputStream, 100);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        0qQ.A07(byteArray);
        return byteArray;
    }

    public static final int A00(C277994w4 r2) {
        String str;
        if (r2 != null) {
            str = r2.getOverlayType();
        } else {
            str = null;
        }
        if (str == null) {
            return 0;
        }
        if (str.equals("SENSITIVITY")) {
            return 2;
        }
        if (str.equals("MISINFORMATION")) {
            return 3;
        }
        0wb.A03("XmaShareSenderHelper_getXmaGatingTypeFromMediaOverlayInfo", "Unsupported media overlay type for XMA send");
        return 0;
    }

    public static final void A06(UserSession userSession, N2L n2l, C254783t2 r13, String str) {
        AnonymousClass19S A02 = 19E.A02(AnonymousClass12T.A00.AOJ(47, 3));
        1a8 r8 = new 1a8((C269794fh) null);
        UserSession userSession2 = userSession;
        N2L n2l2 = n2l;
        C254783t2 r2 = r13;
        String str2 = str;
        if (n2l != null) {
            AnonymousClass7TE.A1Z(new C73557Pf9(r2, userSession2, n2l2, str2, "XmaLinkPreviewHelper", (AnonymousClass4D7) null, 2), A02);
        } else if (str.length() > 0) {
            A05(r8, C67497Mor.A00(userSession), (C74343PtJ) null, 2FW.A17, AnonymousClass6W3.A03(r13), str, (String) null);
        }
    }

    public static final 0eP A03(1Xj r3, String str) {
        0eP r2;
        Bitmap A0I;
        boolean A1Z = AnonymousClass7TG.A1Z(r3, str);
        ImageInfo A1p = r3.A1p();
        if (A1p == null || A1p.Al9() == null || (r2 = A04(r3, str, A1Z)) == null) {
            ExtendedImageUrl A1l = r3.A1l();
            r2 = null;
            if (!(A1l == null || A1l.getHeight() == -1 || A1l.getWidth() == -1 || (A0I = 1NK.A00().A0I(A1l, str)) == null)) {
                return AnonymousClass7TE.A1L(A1l, A0I);
            }
        }
        return r2;
    }

    public static final 0eP A04(1Xj r6, String str, boolean z) {
        List<ExtendedImageUrl> Al9;
        Bitmap A0H;
        int width;
        AnonymousClass7TG.A1N(r6, str);
        ImageInfo A1p = r6.A1p();
        0eP r62 = null;
        if (A1p == null || (Al9 = A1p.Al9()) == null) {
            throw AnonymousClass7TE.A0y();
        }
        int i = 0;
        for (ExtendedImageUrl extendedImageUrl : Al9) {
            if (!(extendedImageUrl.getWidth() == -1 || extendedImageUrl.getHeight() == -1)) {
                1NK A002 = 1NK.A00();
                if (z) {
                    A0H = A002.A0I(extendedImageUrl, str);
                } else {
                    A0H = A002.A0H(extendedImageUrl, str);
                }
                if (A0H != null && (width = A0H.getWidth() * A0H.getHeight()) > i) {
                    r62 = AnonymousClass7TE.A1L(extendedImageUrl, A0H);
                    i = width;
                }
            }
        }
        return r62;
    }

    public final int A08(UserSession userSession, 1Xj r4) {
        Integer num;
        if (r4.A2A(userSession) != null) {
            User A2A = r4.A2A(userSession);
            if (A2A != null) {
                num = A2A.A0N();
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A0C) {
                return 1;
            }
        }
        return A00(r4.BQf());
    }

    public final byte[] A09(ImageUrl imageUrl, String str) {
        AnonymousClass7TG.A1N(imageUrl, str);
        Bitmap A0I = 1NK.A00().A0I(imageUrl, str);
        if (A0I != null) {
            return A07(A0I);
        }
        0wb.A03(str, AnonymousClass7TG.A0m(imageUrl, "Fetched header attribution bitmap is null with url: ", AnonymousClass7TE.A1A()));
        return null;
    }
}
