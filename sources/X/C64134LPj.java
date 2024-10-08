package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

/* renamed from: X.LPj  reason: case insensitive filesystem */
public abstract class C64134LPj {
    public static final String A00(UserSession userSession, String str, String str2) {
        0qQ.A0B(str, 0);
        File A0t = AnonymousClass7TE.A0t(str2);
        A02(A0t);
        try {
            String A00 = C9842RiE.A00(str2, str, 0);
            C11224SFy A01 = C64171LRw.A01(userSession, 1iA.A0Q, (AnonymousClass3Q2) null, (String) null);
            C12075SmU A0e = JTR.A0e(userSession);
            return A0e.FNE(A0e.Ewf(A01, new C11420SSw(A0t, "image/jpeg", A00), (C13816Thj) null)).A05;
        } catch (C8989RKf e) {
            0KC.A0G("FbUploadImageHelper", Pxd.A00(214), e);
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

    public static final void A01(UserSession userSession, String str, String str2, int i) {
        UserSession userSession2 = userSession;
        String str3 = str;
        int A02 = DbW.A02(0, str3, userSession2);
        String str4 = str2;
        File A0t = AnonymousClass7TE.A0t(str4);
        A02(A0t);
        try {
            String A00 = C9842RiE.A00(str4, str3, 0);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
            int A04 = DbS.A04(0Tu.A05, userSession2, 36609382109026153L);
            if (A04 == 0) {
                A04 = LTE.A00(i);
            }
            1iA r9 = 1iA.A0Q;
            A1H2.put("image_compression", C64193LTa.A07(userSession2, (Double) null, (Double) null, 0mf.A00(str4), 0, 0, A04));
            A1H2.put("upload_id", str3);
            JTR.A1N(r9, A1H2);
            A1H.put("X-Instagram-Rupload-Params", JTQ.A0c(A1H2));
            A1H.put("X_FB_PHOTO_WATERFALL_ID", AnonymousClass6SR.A02());
            C11348SOh sOh = new C11348SOh(C62637KjI.A0h);
            sOh.A07 = A1H;
            sOh.A02(new C11181SEh(A02));
            sOh.A01(new C11180SEg(1024, false));
            sOh.A06 = "i.instagram.com";
            sOh.A09 = true;
            C11224SFy sFy = new C11224SFy(sOh);
            C12075SmU A0e = JTR.A0e(userSession2);
            A0e.FNE(A0e.Ewf(sFy, new C11420SSw(A0t, "image/jpeg", A00), (C13816Thj) null));
        } catch (C8989RKf e) {
            0KC.A0G("FbUploadImageHelper", Pxd.A00(214), e);
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

    public static final void A02(File file) {
        if (!file.exists() || !file.isFile() || file.length() <= 0) {
            0KC.A0O("FbUploadImageHelper", "content file does not exist: %s", new Object[]{file.getCanonicalPath()});
            throw new FileNotFoundException(002.A0R("content file does not exist: ", file.getPath()));
        }
    }
}
