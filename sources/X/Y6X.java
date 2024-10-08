package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.settings2.core.model.DerivedStringValue;
import com.instagram.settings2.core.model.EqualsValue;
import com.instagram.settings2.core.model.FbtLinkTokenValue;
import com.instagram.settings2.core.model.FbtLiteralValue;
import com.instagram.settings2.core.model.FbtTextTokenValue;
import com.instagram.settings2.core.model.FbtWithTokensValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.NotValue;
import java.util.Collections;
import java.util.List;

public final class Y6X extends 0Yg implements C62320sa {
    public static final Y6X A00 = new Y6X();

    public Y6X() {
        super(0);
    }

    public static KYI A00(XRZ xrz) {
        return new KYI(xrz);
    }

    public static KYJ A01(C66460MSo mSo) {
        return new KYJ(mSo);
    }

    public static KY2 A02(KYJ kyj, C66460MSo mSo) {
        return new KY2(0sr.A1P(new KYJ[]{kyj, new KYJ(mSo)}));
    }

    public static 0eP A03(C64185LSs lSs, C64185LSs lSs2, XRY xry, List list, List list2) {
        return new 0eP(xry, new C53400GnX(lSs, lSs2, xry, list, list2));
    }

    public static 0eP A05(C64185LSs lSs, XRZ xrz, XRY xry, List list) {
        List singletonList = Collections.singletonList(new KYI(xrz));
        0qQ.A07(singletonList);
        KY2 ky2 = new KY2(singletonList);
        List singletonList2 = Collections.singletonList(new KYI(xrz));
        0qQ.A07(singletonList2);
        return new 0eP(xry, new C53400GnX(lSs, (C64185LSs) ky2, xry, list, singletonList2));
    }

    public static 0eP A07(XRY xry, C66460MSo mSo, List list) {
        List singletonList = Collections.singletonList(new KYJ(mSo));
        0qQ.A07(singletonList);
        KY2 ky2 = new KY2(singletonList);
        List singletonList2 = Collections.singletonList(new KYJ(mSo));
        0qQ.A07(singletonList2);
        return new 0eP(xry, new C53400GnX(ky2, xry, list, singletonList2));
    }

    public static KYI[] A08(XRZ xrz, XRZ xrz2, XRZ xrz3, XRZ xrz4) {
        return new KYI[]{new KYI(xrz), new KYI(xrz2), new KYI(xrz3), new KYI(xrz4)};
    }

    public static KYJ[] A09(KYJ kyj, KYJ kyj2, C66460MSo mSo) {
        return new KYJ[]{kyj, kyj2, new KYJ(mSo)};
    }

    public static KYJ[] A0A(C66460MSo mSo, C66460MSo mSo2) {
        return new KYJ[]{new KYJ(mSo), new KYJ(mSo2)};
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        0eP[] r58 = new 0eP[56];
        XRY xry = XRY.A02;
        C21277XSh xSh = C21277XSh.ACCOUNT_PRIVACY_SETTING;
        KYJ A01 = A01(xSh);
        C21277XSh xSh2 = C21277XSh.ALLOW_PROFILE_PICTURE_EXPANSION;
        KYJ A012 = A01(xSh2);
        C21277XSh xSh3 = C21277XSh.SEO_INDEXING_OPT_OUT;
        KY2 A0U = C21053XCe.A0U(A09(A01, A012, xSh3));
        List A1P = 0sr.A1P(A09(A01(xSh), A01(xSh2), xSh3));
        List list = 0sn.A00;
        0eP A1L = AnonymousClass7TE.A1L(xry, new C53400GnX(A0U, xry, list, A1P));
        XRY xry2 = XRY.A03;
        KY2 A02 = C61083JwL.A02(2131972934);
        C21277XSh xSh4 = C21277XSh.FEATURED_CONTENT_REQUESTS_IN_SHOPS;
        KYJ A013 = A01(xSh4);
        XRZ xrz = XRZ.A0o;
        0eP A04 = A04(A02, C21053XCe.A0U(new C62860Kna[]{A013, A00(xrz)}), xry2, list, new C62860Kna[]{A00(xrz), A01(xSh4)});
        XRY xry3 = XRY.A04;
        KY2 A022 = C61083JwL.A02(2131972929);
        C21277XSh xSh5 = C21277XSh.ALLOW_NOTES_ON_POSTS_AND_REELS;
        0eP A03 = A03(A022, C21053XCe.A0T(A01(xSh5)), xry3, list, AnonymousClass7TE.A1I(A01(xSh5)));
        XRY xry4 = XRY.A05;
        KY2 A023 = C61083JwL.A02(2131972932);
        C21277XSh xSh6 = C21277XSh.ALLOW_REUSE_OF_POSTS;
        KYJ A014 = A01(xSh6);
        C21277XSh xSh7 = C21277XSh.ALLOW_REUSE_OF_REELS;
        C21277XSh xSh8 = xSh7;
        KY2 A024 = A02(A014, xSh8);
        List A1P2 = 0sr.A1P(A0A(xSh6, xSh8));
        String A002 = AnonymousClass000.A00(16);
        0eP A032 = A03(A023, A024, xry4, AnonymousClass7TE.A1I(new FbtWithTokensValue(2131972930, AnonymousClass7TE.A1I(new FbtLinkTokenValue(C21053XCe.A0S(A002), C61083JwL.A02(2131972931), "learn_more")))), A1P2);
        XRY xry5 = XRY.A06;
        KY2 A025 = C61083JwL.A02(2131972933);
        C21277XSh xSh9 = C21277XSh.ALLOW_PEOPLE_TO_DOWNLOAD_YOUR_REELS;
        KYJ A015 = A01(xSh9);
        C21278XSi xSi = C21278XSi.ALLOW_WEBSITE_EMBEDS;
        0eP A042 = A04(A025, A02(A015, xSi), xry5, list, A0A(xSh9, xSi));
        XRY xry6 = XRY.A07;
        KY2 A026 = C61083JwL.A02(2131972928);
        C21277XSh xSh10 = C21277XSh.POSTS_AND_REELS_TO_STORIES;
        KYJ A016 = A01(xSh10);
        C21277XSh xSh11 = C21277XSh.STORIES_IN_MESSAGES;
        0eP A043 = A04(A026, A02(A016, xSh11), xry6, list, A0A(xSh10, xSh11));
        XRY xry7 = XRY.A08;
        KY2 A027 = C61083JwL.A02(2131972948);
        XRZ xrz2 = XRZ.A1b;
        KYI A003 = A00(xrz2);
        XRZ xrz3 = XRZ.A1Y;
        KYI A004 = A00(xrz3);
        XRZ xrz4 = XRZ.A0V;
        KYI A005 = A00(xrz4);
        XRZ xrz5 = XRZ.A1F;
        0eP A044 = A04(A027, C21053XCe.A0U(new KYI[]{A003, A004, A005, A00(xrz5)}), xry7, list, A08(xrz4, xrz5, xrz3, xrz2));
        XRY xry8 = XRY.A09;
        IfValue A0F = C21055XCg.A0F(new C48011EQv(AnonymousClass0yP.A00(36327284361148737L), true), C61083JwL.A02(2131972904), 2131972903);
        C21248XQt xQt = C21248XQt.ACCOUNT_TYPE;
        NotValue notValue = new NotValue(C21053XCe.A0G(new DerivedStringValue(xQt), "personal"));
        XRZ xrz6 = XRZ.A0e;
        KYI A006 = A00(xrz6);
        XRZ xrz7 = XRZ.A1M;
        KYI A007 = A00(xrz7);
        XRZ xrz8 = XRZ.A0J;
        KYI A008 = A00(xrz8);
        XRZ xrz9 = XRZ.A0C;
        KYI A009 = A00(xrz9);
        XRZ xrz10 = XRZ.A0O;
        KYI A0010 = A00(xrz10);
        XRZ xrz11 = XRZ.A0w;
        0eP A045 = A04(A0F, C21053XCe.A0I(notValue, C21053XCe.A0U(new KYI[]{A006, A007, A008, A009, A0010, A00(xrz11)}), 0sr.A1P(new KYI[]{A00(xrz6), A00(xrz8), A00(xrz9), A00(xrz10)})), xry8, list, new KYI[]{A00(xrz9), A00(xrz8), A00(xrz10), A00(xrz6), A00(xrz11), A00(xrz7)});
        XRY xry9 = XRY.A0A;
        KY2 A028 = C61083JwL.A02(2131972918);
        C21277XSh xSh12 = C21277XSh.MESSAGE_REACHABILITY_LINKED_PAGE_DIRECT_MESSAGE;
        0eP A033 = A03(A028, C21053XCe.A0T(A01(xSh12)), xry9, AnonymousClass7TE.A1I(C21055XCg.A0E(C21053XCe.A0S(C66579MXk.A00(880)), 2131972917, 2131972916)), AnonymousClass7TE.A1I(A01(xSh12)));
        XRY xry10 = XRY.A0B;
        KY2 A029 = C61083JwL.A02(2131972940);
        XRZ xrz12 = XRZ.A0n;
        KYI A0011 = A00(xrz12);
        C21277XSh xSh13 = C21277XSh.CUSTOM_WORDS_HIDE_COMMENTS;
        KYJ A017 = A01(xSh13);
        C21277XSh xSh14 = C21277XSh.CUSTOM_WORDS_HIDE_MESSAGE_REQUESTS;
        0eP A046 = A04(A029, C21053XCe.A0U(new C62860Kna[]{A0011, A017, A01(xSh14)}), xry10, list, new C62860Kna[]{A00(xrz12), A01(xSh13), A01(xSh14)});
        0eP A07 = A07(XRY.A0C, C21278XSi.DAILY_LIMIT, list);
        0eP A034 = A03(C61083JwL.A02(2131972926), C21053XCe.A0T(A01(xSh9)), XRY.A0D, list, AnonymousClass7TE.A1I(A01(xSh9)));
        0eP A05 = A05(C61083JwL.A02(2131972898), XRZ.A1N, XRY.A0E, list);
        0eP A052 = A05(C61083JwL.A02(2131972907), XRZ.A1V, XRY.A0F, list);
        XRY xry11 = XRY.A0G;
        IfValue A0F2 = C21055XCg.A0F(new C48011EQv(AnonymousClass0yP.A00(36327284361148737L), true), C61083JwL.A02(2131972906), 2131972905);
        EqualsValue A018 = C21054XCf.A01(xQt, "personal");
        XRZ xrz13 = XRZ.A0P;
        KYI A0012 = A00(xrz13);
        XRZ xrz14 = XRZ.A0Q;
        KYI A0013 = A00(xrz14);
        KYI A0014 = A00(xrz7);
        XRZ xrz15 = XRZ.A1E;
        0eP A047 = A04(A0F2, C21053XCe.A0I(A018, C21053XCe.A0U(new KYI[]{A0012, A0013, A0014, A00(xrz15), A00(xrz11)}), 0sr.A1P(new KYI[]{A00(xrz13), A00(xrz14), A00(xrz15)})), xry11, list, new KYI[]{A00(xrz13), A00(xrz14), A00(xrz11), A00(xrz15), A00(xrz7)});
        0eP A072 = A07(XRY.A0H, C21278XSi.MESSAGE_REACHABILITY_GROUP_MESSAGE, list);
        XRY xry12 = XRY.A0I;
        KY2 A0210 = C61083JwL.A02(2131972915);
        XRZ xrz16 = XRZ.A0r;
        0eP A035 = A03(A0210, C21053XCe.A0T(A00(xrz16)), xry12, AnonymousClass7TE.A1I(new FbtWithTokensValue(2131972913, AnonymousClass7TE.A1I(new FbtLinkTokenValue(C21053XCe.A0S(C66579MXk.A00(876)), C61083JwL.A02(2131972914), "who_can_message_you")))), AnonymousClass7TE.A1I(A00(xrz16)));
        XRY xry13 = XRY.A0J;
        KY2 A0211 = C61083JwL.A02(2131972939);
        C21277XSh xSh15 = C21277XSh.HIDDEN_WORDS_HIDE_COMMENTS;
        KYJ A019 = A01(xSh15);
        C21277XSh xSh16 = C21277XSh.HIDDEN_WORDS_ADVANCED_COMMENT_FILTERING;
        KYJ A0110 = A01(xSh16);
        C21277XSh xSh17 = C21277XSh.HIDDEN_WORDS_HIDE_MESSAGE_REQUESTS;
        0eP A048 = A04(A0211, C21053XCe.A0U(A09(A019, A0110, xSh17)), xry13, list, A09(A01(xSh16), A01(xSh15), xSh17));
        XRY xry14 = XRY.A0K;
        KY2 A0212 = C61083JwL.A02(2131972901);
        XRZ xrz17 = XRZ.A0q;
        KYI A0015 = A00(xrz17);
        XRZ xrz18 = XRZ.A0K;
        KYI A0016 = A00(xrz18);
        XRZ xrz19 = XRZ.A1X;
        KYI A0017 = A00(xrz19);
        XRZ xrz20 = XRZ.A0N;
        KYI A0018 = A00(xrz20);
        XRZ xrz21 = XRZ.A1Q;
        KYI A0019 = A00(xrz21);
        XRZ xrz22 = XRZ.A1R;
        KYI A0020 = A00(xrz22);
        XRZ xrz23 = XRZ.A0G;
        KYI A0021 = A00(xrz23);
        XRZ xrz24 = XRZ.A1J;
        KYI A0022 = A00(xrz24);
        XRZ xrz25 = XRZ.A0j;
        KYI A0023 = A00(xrz25);
        XRZ xrz26 = XRZ.A0c;
        KYI A0024 = A00(xrz26);
        XRZ xrz27 = XRZ.A0Z;
        0eP A049 = A04(A0212, C21053XCe.A0U(new KYI[]{A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A00(xrz27)}), xry14, list, new KYI[]{A00(xrz23), A00(xrz18), A00(xrz20), A00(xrz27), A00(xrz26), A00(xrz25), A00(xrz17), A00(xrz24), A00(xrz21), A00(xrz22), A00(xrz19)});
        XRY xry15 = XRY.A0L;
        KY2 A0213 = C61083JwL.A02(2131972897);
        XRZ xrz28 = XRZ.A1L;
        KYI A0025 = A00(xrz28);
        XRZ xrz29 = XRZ.A0E;
        KYI A0026 = A00(xrz29);
        XRZ xrz30 = XRZ.A1c;
        KYI A0027 = A00(xrz30);
        XRZ xrz31 = XRZ.A1B;
        KYI A0028 = A00(xrz31);
        XRZ xrz32 = XRZ.A1Z;
        0eP A0410 = A04(A0213, C21053XCe.A0U(new KYI[]{A0025, A0026, A0027, A0028, A00(xrz32)}), xry15, list, new KYI[]{A00(xrz29), A00(xrz31), A00(xrz28), A00(xrz32), A00(xrz30)});
        0eP A073 = A07(XRY.A0M, C21278XSi.MESSAGE_REACHABILITY_IG_VERIFIED, list);
        0eP A053 = A05(C61083JwL.A02(2131972941), XRZ.A0f, XRY.A0N, list);
        XRY xry16 = XRY.A0O;
        KY2 A0214 = C61083JwL.A02(2131972911);
        XRZ xrz33 = XRZ.A0k;
        KYI A0029 = A00(xrz33);
        XRZ xrz34 = XRZ.A0A;
        KYI A0030 = A00(xrz34);
        XRZ xrz35 = XRZ.A0l;
        KYI A0031 = A00(xrz35);
        XRZ xrz36 = XRZ.A0m;
        0eP A0411 = A04(A0214, C21053XCe.A0U(new KYI[]{A0029, A0030, A0031, A00(xrz36)}), xry16, list, A08(xrz34, xrz33, xrz35, xrz36));
        XRY xry17 = XRY.A0P;
        C21278XSi xSi2 = C21278XSi.TAGS_MENTIONS_WHO_CAN_MENTION;
        KYJ A0111 = A01(xSi2);
        C21277XSh xSh18 = C21277XSh.TAGS_MENTIONS_WHO_CAN_BOOST;
        KYJ A0112 = A01(xSh18);
        C21277XSh xSh19 = C21277XSh.TAGS_MENTIONS_HOW_YOU_MANAGE_BOOSTS_RESHARE_MEDIA;
        0eP A06 = A06(C21053XCe.A0U(A09(A0111, A0112, xSh19)), xry17, list, A09(A01(xSh19), A01(xSh18), xSi2));
        XRY xry18 = XRY.A0Q;
        KY2 A0215 = C61083JwL.A02(2131972910);
        XRZ xrz37 = XRZ.A0b;
        KYI A0032 = A00(xrz37);
        XRZ xrz38 = XRZ.A1D;
        KYI A0033 = A00(xrz38);
        XRZ xrz39 = XRZ.A08;
        KYI A0034 = A00(xrz39);
        XRZ xrz40 = XRZ.A02;
        System.arraycopy(new 0eP[]{A1L, A04, A03, A032, A042, A043, A044, A045, A033, A046, A07, A034, A05, A052, A047, A072, A035, A048, A049, A0410, A073, A053, A0411, A06, A04(A0215, C21053XCe.A0U(new KYI[]{A0032, A0033, A0034, A00(xrz40)}), xry18, list, A08(xrz40, xrz39, xrz37, xrz38)), A07(XRY.A0R, xSh, list), A05(C61083JwL.A02(2131972947), XRZ.A10, XRY.A0S, list)}, 0, r58, 0, 27);
        XRY xry19 = XRY.A0T;
        C21278XSi xSi3 = C21278XSi.ACCOUNT_SCREEN_HEADER;
        KYJ A0113 = A01(xSi3);
        XRZ xrz41 = XRZ.A15;
        KYI A0035 = A00(xrz41);
        XRZ xrz42 = XRZ.A0y;
        KYI A0036 = A00(xrz42);
        XRZ xrz43 = XRZ.A1A;
        KYI A0037 = A00(xrz43);
        XRZ xrz44 = XRZ.A19;
        KYI A0038 = A00(xrz44);
        XRZ xrz45 = XRZ.A17;
        0eP A062 = A06(C21053XCe.A0U(new C62860Kna[]{A0113, A0035, A0036, A0037, A0038, A00(xrz45)}), xry19, list, new C62860Kna[]{A00(xrz42), A00(xrz41), A00(xrz45), A00(xrz44), A00(xrz43), A01(xSi3)});
        0eP A074 = A07(XRY.A0U, xSi2, list);
        XRY xry20 = XRY.A0V;
        C21278XSi xSi4 = C21278XSi.TAGS_MENTIONS_WHO_CAN_TAG;
        0eP A075 = A07(xry20, xSi4, list);
        XRY xry21 = XRY.A0W;
        XRZ xrz46 = XRZ.A18;
        KYI A0039 = A00(xrz46);
        XRZ xrz47 = XRZ.A14;
        KYI A0040 = A00(xrz47);
        XRZ xrz48 = XRZ.A0z;
        0eP A063 = A06(C21053XCe.A0U(new KYI[]{A0039, A0040, A00(xrz48)}), xry21, list, new KYI[]{A00(xrz48), A00(xrz47), A00(xrz46)});
        XRY xry22 = XRY.A0X;
        XRZ xrz49 = XRZ.A12;
        KYI A0041 = A00(xrz49);
        XRZ xrz50 = XRZ.A16;
        KYI A0042 = A00(xrz50);
        XRZ xrz51 = XRZ.A11;
        KYI A0043 = A00(xrz51);
        XRZ xrz52 = XRZ.A13;
        0eP A064 = A06(C21053XCe.A0U(new KYI[]{A0041, A0042, A0043, A00(xrz52)}), xry22, list, A08(xrz51, xrz49, xrz52, xrz50));
        XRY xry23 = XRY.A0Y;
        KY2 A0216 = C61083JwL.A02(2131972912);
        XRZ xrz53 = XRZ.A0v;
        KYI A0044 = A00(xrz53);
        XRZ xrz54 = XRZ.A0t;
        KYI A0045 = A00(xrz54);
        XRZ xrz55 = XRZ.A0u;
        KYI A0046 = A00(xrz55);
        XRZ xrz56 = XRZ.A0s;
        0eP A0412 = A04(A0216, C21053XCe.A0U(new KYI[]{A0044, A0045, A0046, A00(xrz56)}), xry23, list, A08(xrz56, xrz54, xrz55, xrz53));
        XRY xry24 = XRY.A0Z;
        KY2 A0217 = C61083JwL.A02(2131972908);
        XRZ xrz57 = XRZ.A0a;
        KYI A0047 = A00(xrz57);
        XRZ xrz58 = XRZ.A1C;
        KYI A0048 = A00(xrz58);
        XRZ xrz59 = XRZ.A0L;
        0eP A0413 = A04(A0217, C21053XCe.A0U(new KYI[]{A0047, A0048, A00(xrz59)}), xry24, list, new KYI[]{A00(xrz59), A00(xrz57), A00(xrz58)});
        0eP A076 = A07(XRY.A0a, C21278XSi.MESSAGE_REACHABILITY_OTHERS_ON_IG, list);
        XRY xry25 = XRY.A0b;
        KY2 A0218 = C61083JwL.A02(2131972909);
        C21277XSh xSh20 = C21277XSh.ARCHIVING_SAVE_STORY_TO_ARCHIVE;
        KYJ A0114 = A01(xSh20);
        C21277XSh xSh21 = C21277XSh.ARCHIVING_SAVE_LIVE_TO_ARCHIVE;
        0eP A0414 = A04(A0218, A02(A0114, xSh21), xry25, list, A0A(xSh21, xSh20));
        XRY xry26 = XRY.A0c;
        KY2 A0219 = C61083JwL.A02(2131972919);
        C21276XSg xSg = C21276XSg.ARCHIVING_SAVE_ORIGINAL_PHOTOS;
        KYJ A0115 = A01(xSg);
        C21277XSh xSh22 = C21277XSh.ARCHIVING_SAVE_STORY_TO_CAMERA_GALLERY;
        0eP A0415 = A04(A0219, A02(A0115, xSh22), xry26, list, A0A(xSh22, xSg));
        0eP A077 = A07(XRY.A0d, C21278XSi.SENSITIVE_CONTENT_CONTROL, list);
        0eP A054 = A05(C61083JwL.A02(2131972927), XRZ.A1H, XRY.A0e, list);
        XRY xry27 = XRY.A0f;
        C21277XSh xSh23 = C21277XSh.IS_SLEEP_MODE_ENABLED;
        KYJ A0116 = A01(xSh23);
        C21278XSi xSi5 = C21278XSi.SLEEP_MODE_WINDOW;
        0eP A065 = A06(A02(A0116, xSi5), xry27, list, A0A(xSh23, xSi5));
        XRY xry28 = XRY.A0g;
        0eP A1L2 = AnonymousClass7TE.A1L(xry28, new C53400GnX((C64185LSs) C61083JwL.A02(2131972936), (C64185LSs) C21053XCe.A0S(list), xry28, list, list));
        0eP A078 = A07(XRY.A0h, xSi4, list);
        XRY xry29 = XRY.A0i;
        KY2 A0220 = C61083JwL.A02(2131972937);
        C21277XSh xSh24 = C21277XSh.TAGS_MENTIONS_MANUALLY_APPROVE_TAGS;
        KYJ A0117 = A01(xSh24);
        XRZ xrz60 = XRZ.A1K;
        0eP A0416 = A04(A0220, C21053XCe.A0U(new C62860Kna[]{A0117, A00(xrz60)}), xry29, list, new C62860Kna[]{A00(xrz60), A01(xSh24)});
        XRY xry30 = XRY.A0j;
        KY2 A0221 = C61083JwL.A02(2131972938);
        C21277XSh xSh25 = C21277XSh.TAGS_MENTIONS_WHO_CAN_TAG_ON_OTHER_APPS;
        0eP A036 = A03(A0221, C21053XCe.A0T(A01(xSh25)), xry30, list, AnonymousClass7TE.A1I(A01(xSh25)));
        XRY xry31 = XRY.A0k;
        KY2 A0222 = C61083JwL.A02(2131972924);
        KYJ A0118 = A01(xSh7);
        C21277XSh xSh26 = C21277XSh.ALLOW_REUSE_OF_FEED_VIDEOS;
        0eP A037 = A03(A0222, C21053XCe.A0U(A09(A0118, A01(xSh26), xSh6)), xry31, AnonymousClass7TE.A1I(C21055XCg.A0E(C21053XCe.A0S(A002), 2131972923, 2131972922)), 0sr.A1P(A09(A01(xSh26), A01(xSh6), xSh7)));
        XRY xry32 = XRY.A0l;
        KY2 A0223 = C61083JwL.A02(2131972920);
        XRZ xrz61 = XRZ.A0Y;
        KYI A0049 = A00(xrz61);
        C21277XSh xSh27 = C21277XSh.ALLOW_POST_AND_REEL_SHARING_TO_STORIES;
        KYJ A0119 = A01(xSh27);
        C21276XSg xSg2 = C21276XSg.ALLOW_OTHERS_TO_SHARE_STORIES_IF_MENTIONED;
        KYJ A0120 = A01(xSg2);
        C21277XSh xSh28 = C21277XSh.ALLOW_STORY_SHARING_IN_MESSAGES;
        KYJ A0121 = A01(xSh28);
        KYJ A0122 = A01(xSh5);
        C21277XSh xSh29 = C21277XSh.ALLOW_POSTS_TO_BE_VISIBLE_IN_COLLECTIONS_SHARED_WITH_OTHERS;
        0eP A0417 = A04(A0223, C21053XCe.A0U(new C62860Kna[]{A0049, A0119, A0120, A0121, A0122, A01(xSh29)}), xry32, list, new C62860Kna[]{A00(xrz61), A01(xSh5), A01(xSh29), A01(xSh27), A01(xSh28), A01(xSg2)});
        0eP A0418 = A04(C61083JwL.A02(2131972935), A02(A01(xSg2), xSh11), XRY.A0m, list, A0A(xSh11, xSg2));
        XRY xry33 = XRY.A0n;
        KY2 A0224 = C61083JwL.A02(2131972899);
        XRZ xrz62 = XRZ.A0X;
        KYI A0050 = A00(xrz62);
        XRZ xrz63 = XRZ.A0x;
        KYI A0051 = A00(xrz63);
        XRZ xrz64 = XRZ.A1O;
        KYI A0052 = A00(xrz64);
        XRZ xrz65 = XRZ.A1U;
        KYI A0053 = A00(xrz65);
        XRZ xrz66 = XRZ.A0i;
        KYI A0054 = A00(xrz66);
        XRZ xrz67 = XRZ.A1T;
        0eP A0419 = A04(A0224, C21053XCe.A0U(new KYI[]{A0050, A0051, A0052, A0053, A0054, A00(xrz67)}), xry33, list, new KYI[]{A00(xrz62), A00(xrz66), A00(xrz63), A00(xrz64), A00(xrz67), A00(xrz65)});
        XRY xry34 = XRY.A0o;
        KY2 A0225 = C61083JwL.A02(2131972921);
        KYJ A0123 = A01(xSi);
        C21277XSh xSh30 = C21277XSh.ALLOW_REQUESTS_TO_FEATURE_YOUR_POSTS_IN_SHOPS;
        0eP A0420 = A04(A0225, A02(A0123, xSh30), xry34, list, A0A(xSh30, xSi));
        XRY xry35 = XRY.A0p;
        KY2 A0226 = C61083JwL.A02(2131972925);
        C21278XSi xSi6 = C21278XSi.SHARE_STORY_TO_FACEBOOK;
        KYJ A0124 = A01(xSi6);
        XRZ xrz68 = XRZ.A1P;
        0eP A0421 = A04(A0226, C21053XCe.A0U(new C62860Kna[]{A0124, A00(xrz68)}), xry35, list, new C62860Kna[]{A00(xrz68), A01(xSi6)});
        XRY xry36 = XRY.A0q;
        C21278XSi xSi7 = C21278XSi.WHO_CAN_REMIX_OR_REUSE_YOUR_CONTENT;
        0eP A079 = A07(xry36, xSi7, list);
        0eP A0710 = A07(XRY.A0r, xSi7, list);
        XRY xry37 = XRY.A0s;
        KY2 A0227 = C61083JwL.A02(2131972900);
        XRZ xrz69 = XRZ.A07;
        KYI A0055 = A00(xrz69);
        XRZ xrz70 = XRZ.A0M;
        KYI A0056 = A00(xrz70);
        XRZ xrz71 = XRZ.A0R;
        KYI A0057 = A00(xrz71);
        XRZ xrz72 = XRZ.A0H;
        KYI A0058 = A00(xrz72);
        XRZ xrz73 = XRZ.A0d;
        KYI A0059 = A00(xrz73);
        XRZ xrz74 = XRZ.A0h;
        0eP A0422 = A04(A0227, C21053XCe.A0U(new KYI[]{A0055, A0056, A0057, A0058, A0059, A00(xrz74)}), xry37, list, new KYI[]{A00(xrz69), A00(xrz72), A00(xrz70), A00(xrz71), A00(xrz73), A00(xrz74)});
        XRY xry38 = XRY.A0t;
        KY2 A0228 = C61083JwL.A02(2131972946);
        XRZ xrz75 = XRZ.A05;
        System.arraycopy(new 0eP[]{A062, A074, A075, A063, A064, A0412, A0413, A076, A0414, A0415, A077, A054, A065, A1L2, A078, A0416, A036, A037, A0417, A0418, A0419, A0420, A0421, A079, A0710, A0422, A03(A0228, C21053XCe.A0T(A00(xrz75)), xry38, AnonymousClass7TE.A1I(C21053XCe.A0H(new C48011EQv(AnonymousClass0yP.A00(36329208506498932L), true), new FbtWithTokensValue(2131972944, 0sr.A1P(new C64185LSs[]{new FbtTextTokenValue(new FbtLiteralValue(new C48011EQv(AnonymousClass0yP.A00(36892158460232607L), true)), DialogModule.KEY_MESSAGE), new FbtLinkTokenValue(C21053XCe.A0S("https://help.instagram.com/1731078377046291"), C61083JwL.A02(2131972945), "learn_more")})), C21055XCg.A0E(C21053XCe.A0S("https://help.instagram.com/1731078377046291"), 2131972943, 2131972942))), AnonymousClass7TE.A1I(A00(xrz75)))}, 0, r58, 27, 27);
        XRY xry39 = XRY.A0u;
        KY2 A0229 = C61083JwL.A02(2131972902);
        XRZ xrz76 = XRZ.A1S;
        KYI A0060 = A00(xrz76);
        XRZ xrz77 = XRZ.A0T;
        KYI A0061 = A00(xrz77);
        XRZ xrz78 = XRZ.A0F;
        KYI A0062 = A00(xrz78);
        XRZ xrz79 = XRZ.A04;
        KYI A0063 = A00(xrz79);
        XRZ xrz80 = XRZ.A0g;
        KYI A0064 = A00(xrz80);
        XRZ xrz81 = XRZ.A0p;
        KYI A0065 = A00(xrz81);
        XRZ xrz82 = XRZ.A1a;
        KYI A0066 = A00(xrz82);
        XRZ xrz83 = XRZ.A0W;
        KYI A0067 = A00(xrz83);
        XRZ xrz84 = XRZ.A0U;
        System.arraycopy(new 0eP[]{A04(A0229, C21053XCe.A0U(new KYI[]{A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A00(xrz84)}), xry39, list, new KYI[]{A00(xrz79), A00(xrz78), A00(xrz77), A00(xrz84), A00(xrz83), A00(xrz80), A00(xrz81), A00(xrz76), A00(xrz82)}), A07(XRY.A0v, C21278XSi.MESSAGE_REACHABILITY_YOUR_FOLLOWERS_ON_IG, list)}, 0, r58, 54, 2);
        return 0Yt.A06(r58);
    }

    public static 0eP A04(C64185LSs lSs, C64185LSs lSs2, XRY xry, List list, Object[] objArr) {
        return new 0eP(xry, new C53400GnX(lSs, lSs2, xry, list, 0sr.A1P(objArr)));
    }

    public static 0eP A06(C64185LSs lSs, XRY xry, List list, Object[] objArr) {
        return new 0eP(xry, new C53400GnX(lSs, xry, list, 0sr.A1P(objArr)));
    }
}
