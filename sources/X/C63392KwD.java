package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.KwD  reason: case insensitive filesystem */
public abstract class C63392KwD {
    public static final C11224SFy A00(UserSession userSession, String str, String str2, String str3, int i, boolean z) {
        C62637KjI kjI;
        0qQ.A0B(str, 0);
        String str4 = str3;
        AnonymousClass7TF.A1D(str2, 1, str4);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 6);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        int A04 = DbS.A04(0Tu.A05, userSession, 36609382108960616L);
        if (A04 == 0) {
            A04 = LTE.A00(i);
        }
        1iA r3 = 1iA.A0Q;
        A1H2.put("image_compression", C64193LTa.A07(userSession2, (Double) null, (Double) null, 0mf.A00(str4), 0, 0, A04));
        A1H2.put("upload_id", str);
        JTR.A1N(r3, A1H2);
        A1H.put("X-Auth-Type", "instagram");
        A1H.put("X_FB_PHOTO_WATERFALL_ID", AnonymousClass6SR.A02());
        int i2 = 0;
        C62637KjI[] kjIArr = (C62637KjI[]) C62637KjI.A02.toArray(new C62637KjI[0]);
        int length = kjIArr.length;
        while (true) {
            if (i2 >= length) {
                kjI = C62637KjI.A0L;
                break;
            }
            kjI = kjIArr[i2];
            if (0qQ.A0K(kjI.A01, str2)) {
                break;
            }
            i2++;
        }
        C11348SOh sOh = new C11348SOh(kjI);
        sOh.A07 = A1H;
        sOh.A02(new C11181SEh(2));
        sOh.A01(new C11180SEg(1024, z));
        sOh.A06 = AnonymousClass000.A00(1775);
        sOh.A09 = true;
        return new C11224SFy(sOh);
    }
}
