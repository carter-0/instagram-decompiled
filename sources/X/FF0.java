package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;

public final class FF0 {
    public static final ArrayList A04;
    public static final ArrayList A05 = 0sr.A1L(new String[]{"add_to_your_story", "copy_link", "system_share_sheet", "clips_download", "save", "add_content_note", "add_to_wall"});
    public static final ArrayList A06 = 0sr.A1L(new String[]{"US", "CA", "JP", "KR", "AU"});
    public static final ArrayList A07;
    public static final ArrayList A08 = 0sr.A1L(new String[]{"copy_link", "system_share_sheet", "user_sms", "snapchat", "whatsapp", "messenger"});
    public static final ArrayList A09 = 0sr.A1L(new 0eP[]{AnonymousClass7TE.A1L("snapchat", "com.snapchat.android"), AnonymousClass7TE.A1L("twitter", "com.twitter.android"), AnonymousClass7TE.A1L("line", "jp.naver.line.android"), AnonymousClass7TE.A1L("kakaotalk", "com.kakao.talk"), AnonymousClass7TE.A1L("discord", "com.discord"), AnonymousClass7TE.A1L("band", "com.nhn.android.band"), AnonymousClass7TE.A1L("vk", "com.vkontakte.android"), AnonymousClass7TE.A1L("facebook", "com.facebook.katana"), AnonymousClass7TE.A1L("messenger", "com.facebook.orca")});
    public static final ArrayList A0A = 0sr.A1L(new String[]{"follow", "direct_message", "view_profile", "direct_sharesheet"});
    public static final ArrayList A0B = 0sr.A1L(new String[]{"add_to_your_story", "copy_link", "system_share_sheet", "messenger", "facebook", "whatsapp"});
    public static final ArrayList A0C = 0sr.A1L(new String[]{"add_to_your_story", "system_share_sheet", "copy_link", "user_sms", "messenger", "whatsapp", "snapchat", "facebook", "twitter"});
    public static final ArrayList A0D = 0sr.A1L(new 0eP[]{AnonymousClass7TE.A1L("snapchat", "com.snapchat.android"), AnonymousClass7TE.A1L("twitter", "com.twitter.android"), AnonymousClass7TE.A1L("line", "jp.naver.line.android"), AnonymousClass7TE.A1L("kakaotalk", "com.kakao.talk"), AnonymousClass7TE.A1L("discord", "com.discord"), AnonymousClass7TE.A1L("band", "com.nhn.android.band"), AnonymousClass7TE.A1L("vk", "com.vkontakte.android")});
    public final UserSession A00;
    public final ArrayList A01;
    public final Context A02;
    public final User A03;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (r4.equals("US") != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r4.equals("CA") != false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00de, code lost:
        r0 = new java.lang.String[]{"snapchat", "user_sms", "messenger", "whatsapp", "facebook", "twitter"};
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FF0(com.instagram.common.session.UserSession r21, android.content.Context r22) {
        /*
            r20 = this;
            r0 = 1
            r1 = r21
            X.0qQ.A0B(r1, r0)
            r3 = r20
            r3.<init>()
            r0 = r22
            r3.A02 = r0
            r3.A00 = r1
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r1)
            r3.A03 = r0
            X.4Cl r0 = r0.A03
            java.lang.String r4 = r0.BDj()
            if (r4 != 0) goto L_0x0021
            java.lang.String r4 = ""
        L_0x0021:
            java.util.ArrayList r0 = A04
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0038
            java.util.ArrayList r0 = A06
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0038
            java.util.ArrayList r1 = r3.A00()
        L_0x0035:
            r3.A01 = r1
            return
        L_0x0038:
            java.lang.String r7 = "add_content_note"
            r2 = 0
            java.lang.String r6 = "add_to_your_story"
            java.lang.String r5 = "copy_link"
            java.lang.String r1 = "system_share_sheet"
            java.lang.String r0 = "clips_download"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r5, r1, r0}
            java.util.ArrayList r1 = X.0sr.A1L(r0)
            int r5 = r4.hashCode()
            r0 = 2142(0x85e, float:3.002E-42)
            java.lang.String r6 = "snapchat"
            java.lang.String r12 = "twitter"
            java.lang.String r11 = "facebook"
            java.lang.String r10 = "messenger"
            java.lang.String r9 = "user_sms"
            java.lang.String r7 = "whatsapp"
            if (r5 == r0) goto L_0x00d6
            r0 = 2374(0x946, float:3.327E-42)
            if (r5 == r0) goto L_0x00bf
            r0 = 2407(0x967, float:3.373E-42)
            if (r5 == r0) goto L_0x00a5
            r0 = 2718(0xa9e, float:3.809E-42)
            if (r5 != r0) goto L_0x0073
            java.lang.String r0 = "US"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00de
        L_0x0073:
            java.lang.String r8 = "discord"
            java.lang.String[] r0 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
        L_0x0079:
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            r1.addAll(r0)
            com.instagram.common.session.UserSession r6 = r3.A00
            X.0Tu r0 = X.0Tu.A05
            r4 = 36320803255493479(0x81099400002367, double:3.0327604586852173E-306)
            boolean r0 = X.182.A06(r0, r6, r4)
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "barcelona"
            r1.add(r0)
        L_0x0094:
            boolean r0 = X.AnonymousClass4AJ.A0C(r6)
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "add_to_audio_note"
            r1.add(r2, r0)
        L_0x009f:
            java.lang.String r0 = "add_to_wall"
            r1.add(r0)
            goto L_0x0035
        L_0x00a5:
            java.lang.String r0 = "KR"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r13 = "kakaotalk"
            java.lang.String r15 = "band"
            r14 = r12
            r16 = r9
            r17 = r7
            r18 = r11
            r19 = r10
            java.lang.String[] r0 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19}
            goto L_0x0079
        L_0x00bf:
            java.lang.String r0 = "JP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r13 = "line"
            r14 = r12
            r15 = r9
            r16 = r11
            r17 = r10
            r18 = r7
            java.lang.String[] r0 = new java.lang.String[]{r13, r14, r15, r16, r17, r18}
            goto L_0x0079
        L_0x00d6:
            java.lang.String r0 = "CA"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0073
        L_0x00de:
            r4 = r6
            r5 = r9
            r6 = r10
            r8 = r11
            r9 = r12
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FF0.<init>(com.instagram.common.session.UserSession, android.content.Context):void");
    }

    public final void A02(String str) {
        double d;
        0qQ.A0B(str, 0);
        1Av A002 = 1Au.A00(this.A00);
        HashMap A022 = 1Av.A02(A002, "external_sharing_share_option_usage_count_map");
        Number number = (Number) A022.get(str);
        if (number != null) {
            d = number.doubleValue();
        } else {
            d = 0.0d;
        }
        A022.put(str, Double.valueOf(d + 1.0d));
        1Av.A05(A002, "external_sharing_share_option_usage_count_map", A022);
        HashMap A023 = 1Av.A02(A002, "external_sharing_share_option_timestamp_map");
        A023.put(str, Double.valueOf(DbS.A01()));
        1Av.A05(A002, "external_sharing_share_option_timestamp_map", A023);
    }

    static {
        String str = "direct_sharesheet";
        A07 = 0sr.A1L(new String[]{"system_share_sheet", str, "copy_link", "profile_card_download", "whatsapp", "user_sms", "invite", "snapchat", "barcelona", "messenger", "facebook", "twitter"});
        String[] strArr = new String[32];
        System.arraycopy(new String[]{"SM", "PM", "SJ", "VA", "AX"}, AnonymousClass7TF.A1X(new String[]{"FR", "GB", "IT", "DE", "ES", "NL", "BE", "PT", "SE", "CH", "AT", "DK", "FI", "NO", "IE", "LU", "MT", "IS", "AD", "JE", "IM", "FO", "GG", "GI", "GL", "MC", "LI"}, strArr) ? 1 : 0, strArr, 27, 5);
        A04 = 0sr.A1L(strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f4 A[LOOP:6: B:86:0x01ee->B:88:0x01f4, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A00() {
        /*
            r10 = this;
            java.util.ArrayList r4 = A0C
            com.instagram.common.session.UserSession r3 = r10.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330548536296114(0x811271000042b2, double:3.0389234135059E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5 = 1
            if (r0 == 0) goto L_0x005b
            java.util.ArrayList r0 = A0D
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x001c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r7 = r9.next()
            r0 = r7
            X.0eP r0 = (X.0eP) r0
            android.content.Context r1 = r10.A02
            java.lang.Object r6 = r0.A01
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = X.0oI.A02
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 128(0x80, float:1.794E-43)
            r1.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x003c }
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            X.DbV.A1U(r7, r8, r0)
            goto L_0x001c
        L_0x0041:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x0049:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r1.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            r6.add(r0)
            goto L_0x0049
        L_0x005b:
            r0 = 36330548536361651(0x811271000142b3, double:3.0389234135473456E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00b4
            java.util.ArrayList r0 = A09
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r0.iterator()
        L_0x0070:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r7 = r8.next()
            r0 = r7
            X.0eP r0 = (X.0eP) r0
            android.content.Context r1 = r10.A02
            java.lang.Object r6 = r0.A01
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = X.0oI.A02
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 128(0x80, float:1.794E-43)
            r1.getPackageInfo(r6, r0)     // Catch:{ NameNotFoundException -> 0x0090 }
            r0 = 1
            goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            X.DbV.A1U(r7, r9, r0)
            goto L_0x0070
        L_0x0095:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x009d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r1.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            r6.add(r0)
            goto L_0x009d
        L_0x00af:
            java.util.List r6 = X.00k.A0W(r6)
            goto L_0x00b6
        L_0x00b4:
            X.0sn r6 = X.0sn.A00
        L_0x00b6:
            java.lang.String r7 = "add_to_channel"
            boolean r0 = r4.contains(r7)
            if (r0 != 0) goto L_0x00cc
            r0 = 36320756011377475(0x81098900082343, double:3.0327305813160196E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00cc
            r4.add(r7)
        L_0x00cc:
            java.lang.String r1 = "clips_download"
            boolean r0 = r4.contains(r1)
            r7 = 3
            if (r0 != 0) goto L_0x00d8
            r4.add(r7, r1)
        L_0x00d8:
            java.lang.String r1 = "profile_card_download"
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x00e3
            r4.add(r7, r1)
        L_0x00e3:
            java.lang.String r7 = "barcelona"
            boolean r0 = r4.contains(r7)
            if (r0 != 0) goto L_0x00f9
            r0 = 36320803255493479(0x81099400002367, double:3.0327604586852173E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00f9
            r4.add(r7)
        L_0x00f9:
            java.lang.String r1 = "add_content_note"
            boolean r0 = r4.contains(r1)
            r8 = 0
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "add_to_your_story"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0181
            r0 = 0
        L_0x010b:
            r4.add(r0, r1)
        L_0x010e:
            java.lang.String r7 = "add_to_audio_note"
            boolean r0 = r4.contains(r7)
            if (r0 != 0) goto L_0x011f
            boolean r0 = X.AnonymousClass4AJ.A0C(r3)
            if (r0 == 0) goto L_0x011f
            r4.add(r8, r7)
        L_0x011f:
            java.lang.String r1 = "add_to_wall"
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L_0x012a
            r4.add(r1)
        L_0x012a:
            r0 = 36321950011893607(0x810a9f00022767, double:3.0334856720502757E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0140
            r0 = 36320652936094446(0x810971004422ee, double:3.032665396091981E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01e6
        L_0x0140:
            X.OC6 r0 = X.C70166NyK.A00(r3)
            X.02m r9 = r0.A00
            r1 = 145754014(0x8b0079e, float:1.05944055E-33)
            java.lang.String r0 = "HSCROLL_RANKING_REQUEST_MADE"
            r9.markerPoint(r1, r0)
            r0 = 36884899965239885(0x830a9f0001024d, double:3.389497489363976E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01cd
            java.util.List r0 = X.DbX.A0x(r1)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x016b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            java.lang.String r0 = X.DbV.A12(r0)
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r0)
            r2.add(r0)
            goto L_0x016b
        L_0x0181:
            int r0 = r4.size()
            goto L_0x010b
        L_0x0186:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x018e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r1 = r2.next()
            boolean r0 = r6.contains(r1)
            X.DbV.A1U(r1, r9, r0)
            goto L_0x018e
        L_0x01a0:
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x01cd
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r9)
            boolean r0 = X.AnonymousClass4AJ.A0C(r3)
            if (r0 == 0) goto L_0x01b3
            r4.add(r8, r7)
        L_0x01b3:
            X.OC6 r0 = X.C70166NyK.A00(r3)
            X.02m r1 = r0.A00
            r2 = 145754014(0x8b0079e, float:1.05944055E-33)
            java.lang.String r0 = "HSCROLL_SERVER_RANKING_RENDERED"
            r1.markerPoint(r2, r0)
            X.OC6 r0 = X.C70166NyK.A00(r3)
            X.02m r1 = r0.A00
            java.lang.String r0 = "is_server_ranking"
            r1.markerAnnotate(r2, r0, r5)
            return r4
        L_0x01cd:
            X.OC6 r0 = X.C70166NyK.A00(r3)
            X.02m r1 = r0.A00
            r2 = 145754014(0x8b0079e, float:1.05944055E-33)
            java.lang.String r0 = "HSCROLL_STATIC_RANKING_RENDERED"
            r1.markerPoint(r2, r0)
            X.OC6 r0 = X.C70166NyK.A00(r3)
            X.02m r1 = r0.A00
            java.lang.String r0 = "is_server_ranking"
            r1.markerAnnotate(r2, r0, r8)
        L_0x01e6:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r4.iterator()
        L_0x01ee:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0200
            java.lang.Object r1 = r2.next()
            boolean r0 = r6.contains(r1)
            X.DbV.A1U(r1, r3, r0)
            goto L_0x01ee
        L_0x0200:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FF0.A00():java.util.ArrayList");
    }

    public final ArrayList A01(2FW r7, boolean z) {
        if (r7 == 2FW.A15) {
            return A08;
        }
        if (r7 == 2FW.A1P) {
            if (z) {
                return A0A;
            }
        } else if (r7 != 2FW.A1R) {
            if (r7 == 2FW.A0W || r7 == 2FW.A1D || r7 == 2FW.A1e) {
                UserSession userSession = this.A00;
                if (182.A06(0Tu.A05, userSession, 36314859023829850L)) {
                    1Av A002 = 1Au.A00(userSession);
                    C51563Fw9 fw9 = new C51563Fw9(1, 1Av.A02(A002, "external_sharing_share_option_usage_count_map"), 1Av.A02(A002, "external_sharing_share_option_timestamp_map"));
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    A1C.addAll(this.A01);
                    01V.A1D(A1C, fw9);
                    return A1C;
                }
            }
            if (r7 == 2FW.A0H) {
                return A0B;
            }
            if (r7 == 2FW.A10) {
                return 0sr.A1L(new String[]{"add_to_your_story"});
            }
            return A00();
        }
        ArrayList arrayList = A07;
        if (arrayList.contains("add_to_your_story")) {
            arrayList.remove("add_to_your_story");
        }
        UserSession userSession2 = this.A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession2, 36327426096314807L)) {
            arrayList.add("add_to_your_story");
        } else {
            arrayList.add(4, "add_to_your_story");
        }
        if (182.A06(r2, userSession2, 36327426096380344L)) {
            return arrayList;
        }
        arrayList.remove("invite");
        return arrayList;
    }
}
