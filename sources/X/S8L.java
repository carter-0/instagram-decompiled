package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

public abstract class S8L {
    public static final C61073JwB A00(Map map) {
        Map map2 = map;
        if (map2.isEmpty()) {
            return null;
        }
        return new C61073JwB((Object) new QOt(DbT.A11("email", map2), DbT.A11("given-name", map2), DbT.A11("family-name", map2), DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map2), DbT.A11("address-line1", map2), DbT.A11("address-line2", map2), DbT.A11("address-line3", map2), DbT.A11("address-level1", map2), DbT.A11("address-level2", map2), DbT.A11("address-level3", map2), DbT.A11("address-level4", map2), DbT.A11("postal-code", map2), DbT.A11("street-address", map2), DbT.A11("tel", map2), DbU.A0r("tel-area-code", map2), DbU.A0r("tel-country-code", map2), DbU.A0r("tel-local", map2), DbU.A0r("tel-local-prefix", map2), DbU.A0r("tel-local-suffix", map2), DbU.A0r("tel-national", map2), DbU.A0r("country", map2), DbU.A0r("country-name", map2), 0), DbT.A11("ent_id", map2), DbT.A11("usage_frequency", map2), DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, map2), 0);
    }

    public static final Map A01(C61073JwB jwB) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        C61073JwB jwB2 = jwB;
        if (jwB == null) {
            return 0Yt.A0E();
        }
        QOt qOt = (QOt) jwB2.A00;
        String str22 = null;
        if (qOt != null) {
            str = qOt.A0M;
        } else {
            str = null;
        }
        0eP A1L = AnonymousClass7TE.A1L("email", str);
        if (qOt != null) {
            str2 = qOt.A04;
        } else {
            str2 = null;
        }
        0eP A1L2 = AnonymousClass7TE.A1L("given-name", str2);
        if (qOt != null) {
            str3 = qOt.A03;
        } else {
            str3 = null;
        }
        0eP A1L3 = AnonymousClass7TE.A1L("family-name", str3);
        if (qOt != null) {
            str4 = qOt.A05;
        } else {
            str4 = null;
        }
        0eP A1L4 = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4);
        if (qOt != null) {
            str5 = qOt.A0H;
        } else {
            str5 = null;
        }
        0eP A1L5 = AnonymousClass7TE.A1L("address-line1", str5);
        if (qOt != null) {
            str6 = qOt.A0I;
        } else {
            str6 = null;
        }
        0eP A1L6 = AnonymousClass7TE.A1L("address-line2", str6);
        if (qOt != null) {
            str7 = qOt.A0J;
        } else {
            str7 = null;
        }
        0eP A1L7 = AnonymousClass7TE.A1L("address-line3", str7);
        if (qOt != null) {
            str8 = qOt.A01;
        } else {
            str8 = null;
        }
        0eP A1L8 = AnonymousClass7TE.A1L("address-level1", str8);
        if (qOt != null) {
            str9 = qOt.A02;
        } else {
            str9 = null;
        }
        0eP A1L9 = AnonymousClass7TE.A1L("address-level2", str9);
        if (qOt != null) {
            str10 = qOt.A0D;
        } else {
            str10 = null;
        }
        0eP A1L10 = AnonymousClass7TE.A1L("address-level3", str10);
        if (qOt != null) {
            str11 = qOt.A0G;
        } else {
            str11 = null;
        }
        0eP A1L11 = AnonymousClass7TE.A1L("address-level4", str11);
        if (qOt != null) {
            str12 = qOt.A06;
        } else {
            str12 = null;
        }
        0eP A1L12 = AnonymousClass7TE.A1L("postal-code", str12);
        if (qOt != null) {
            str13 = qOt.A07;
        } else {
            str13 = null;
        }
        0eP A1L13 = AnonymousClass7TE.A1L("street-address", str13);
        if (qOt != null) {
            str14 = qOt.A08;
        } else {
            str14 = null;
        }
        0eP A1L14 = AnonymousClass7TE.A1L("tel", str14);
        if (qOt != null) {
            str15 = qOt.A09;
        } else {
            str15 = null;
        }
        0eP A1L15 = AnonymousClass7TE.A1L("tel-area-code", str15);
        if (qOt != null) {
            str16 = qOt.A0A;
        } else {
            str16 = null;
        }
        0eP A1L16 = AnonymousClass7TE.A1L("tel-country-code", str16);
        if (qOt != null) {
            str17 = qOt.A0B;
        } else {
            str17 = null;
        }
        0eP A1L17 = AnonymousClass7TE.A1L("tel-local", str17);
        if (qOt != null) {
            str18 = qOt.A0C;
        } else {
            str18 = null;
        }
        0eP A1L18 = AnonymousClass7TE.A1L("tel-local-prefix", str18);
        if (qOt != null) {
            str19 = qOt.A0E;
        } else {
            str19 = null;
        }
        0eP A1L19 = AnonymousClass7TE.A1L("tel-local-suffix", str19);
        if (qOt != null) {
            str20 = qOt.A0F;
        } else {
            str20 = null;
        }
        0eP A1L20 = AnonymousClass7TE.A1L("tel-national", str20);
        if (qOt != null) {
            str21 = qOt.A0K;
        } else {
            str21 = null;
        }
        0eP A1L21 = AnonymousClass7TE.A1L("country", str21);
        if (qOt != null) {
            str22 = qOt.A0L;
        }
        return 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, AnonymousClass7TE.A1L("country-name", str22), AnonymousClass7TE.A1L("ent_id", jwB2.A01), AnonymousClass7TE.A1L("usage_frequency", jwB2.A03), AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jwB2.A02)});
    }
}
