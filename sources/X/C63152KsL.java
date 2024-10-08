package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;

/* renamed from: X.KsL  reason: case insensitive filesystem */
public abstract class C63152KsL {
    public static final C352218Cl A00(Context context, C61084JwM jwM, UserSession userSession) {
        String str;
        C61084JwM jwM2 = jwM;
        0qQ.A0B(jwM2, 0);
        Bitmap bitmap = (Bitmap) jwM2.A01;
        String str2 = null;
        String str3 = null;
        C352218Cl A00 = C363868kT.A00(context, bitmap, (C363848kR) null, userSession, (byte[]) null, bitmap.getWidth(), bitmap.getHeight(), false);
        C60975JuX juX = (C60975JuX) jwM2.A00;
        String str4 = juX.A03;
        String str5 = juX.A04;
        String str6 = juX.A05;
        CameraTool cameraTool = juX.A00;
        String str7 = str4;
        if (str4 == null) {
            str7 = "";
        }
        String str8 = juX.A08;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = juX.A09;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = str5;
        if (str5 == null) {
            str10 = "";
        }
        String str11 = str6;
        if (str6 == null) {
            str11 = "";
        }
        String str12 = juX.A0A;
        if (str12 == null) {
            str12 = "";
        }
        LQu lQu = LQu.A00;
        C63968LFv lFv = juX.A01;
        if (lFv != null) {
            str3 = lFv.A02;
        }
        String A01 = lQu.A01(cameraTool, str3);
        if (A01 == null) {
            A01 = "";
        }
        A00.A0p = AnonymousClass7TE.A1I(new LMH(cameraTool, new LN5(str7, str8, str9, "", "", str12, A01, str10, str11)));
        A00.A0e = str4;
        A00.A0f = str5;
        A00.A0g = str6;
        if (lFv != null) {
            str = lFv.A00;
        } else {
            str = null;
        }
        A00.A0l = str;
        if (lFv != null) {
            str2 = lFv.A01;
        }
        A00.A0m = str2;
        A00.A0I = 0oY.A01(0oT.A01(bitmap, AnonymousClass05K.A00), 0);
        A00.A0i = juX.A06;
        return A00;
    }
}
