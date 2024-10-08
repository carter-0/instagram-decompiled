package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class LSH {
    public static String A00 = "";
    public static Map A01;
    public static final LSH A02 = new Object();
    public static final List A03 = 0sr.A1P(new String[]{"music/clips_audio_browser/", "music/playlist/5003688406377283/", "music/stories_audio_browser/", "music/music_in_feed_audio_browser/", "music/trending/"});

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ae, code lost:
        r19 = X.DbV.A16(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b6, code lost:
        if (r19.hasNext() == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b8, code lost:
        r0 = r19.next();
        r12 = (java.util.Map) r13.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c2, code lost:
        if (r12 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c4, code lost:
        r11 = (java.util.Map) r8.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ca, code lost:
        if (r11 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d4, code lost:
        if (r12.size() != r11.size()) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d6, code lost:
        r18 = X.DbV.A16(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01de, code lost:
        if (r18.hasNext() == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e0, code lost:
        r0 = r18.next();
        r1 = X.C51966G9m.A14(r0, r12);
        r15 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e9, code lost:
        if (r1 == null) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01eb, code lost:
        r1 = r1.floatValue();
        r0 = X.C51966G9m.A14(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01f3, code lost:
        if (r0 == null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01f5, code lost:
        r15 = r0.floatValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f9, code lost:
        r15 = r1 - r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0207, code lost:
        if (((double) java.lang.Math.abs(r15)) <= 2.0E-5d) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0209, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0212, code lost:
        if ("server_loaded".equals(r3.A00()) == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0214, code lost:
        r7 = X.002.A0T(r7, r3.A03, '/');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x021c, code lost:
        if (r11 == false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0229, code lost:
        if (X.182.A06(X.0Tu.A05, r2, 36319355852037294L) != false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x022b, code lost:
        r26 = X.C51971G9r.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0231, code lost:
        if (r27 != null) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0233, code lost:
        r4.A07 = r9;
        r4.A0A = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0237, code lost:
        if (r26 == null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0239, code lost:
        r4.A01 = r26.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0241, code lost:
        if (X.AnonymousClass05K.A0Y != r9) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0243, code lost:
        r4.A00 = 4000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0245, code lost:
        if (r11 == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0247, code lost:
        A01 = r30;
        A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x024b, code lost:
        r1 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x024d, code lost:
        if (r29 == null) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x024f, code lost:
        r4.A9m(X.AnonymousClass000.A00(3751), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x025c, code lost:
        if (r6.contains(r5) == false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x025e, code lost:
        if (r30 == null) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0261, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0269, code lost:
        if (r8.equals("saved_original_audio") == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x026b, code lost:
        r0 = 5101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0274, code lost:
        if (r8.equals("saved_music") == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0276, code lost:
        r0 = 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0278, code lost:
        r0 = X.AnonymousClass000.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x027e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x028d, code lost:
        if (r1.equals(r0) == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0297, code lost:
        if (r1.equals("server_loaded") != false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0299, code lost:
        r0 = X.AnonymousClass05K.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r3 = X.JTO.A0v();
        r5 = new android.util.JsonWriter(r3);
        r5.beginArray();
        r9 = X.AnonymousClass7TF.A0u(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02ba, code lost:
        if (r9.hasNext() == false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02bc, code lost:
        r8 = X.AnonymousClass7TE.A1J(r9);
        r7 = X.AnonymousClass7TF.A0u((java.util.Map) r8.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02ce, code lost:
        if (r7.hasNext() == false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d0, code lost:
        r6 = X.AnonymousClass7TE.A1J(r7);
        r5.beginObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02e1, code lost:
        if (((java.lang.CharSequence) r8.getKey()).length() != 0) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02e3, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02e5, code lost:
        r5.name("concept").value(X.002.A0R(r2, X.DbT.A13(r6)));
        r5.name("score").value((java.lang.Number) r6.getValue());
        r5.endObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0309, code lost:
        r2 = X.002.A0C(X.DbT.A13(r8), '_');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0314, code lost:
        r5.endArray();
        r5.close();
        r4.A9m("contextual_rec_topics", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0324, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0325, code lost:
        X.0wb.A06("MusicSearchApiUtil", "Failed to generate contextual music recommendation data", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0104, code lost:
        r0 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        r4.A08(r0);
        r4.A0A(r7);
        r0 = X.C14245TsS.A00(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0110, code lost:
        if (r0 != null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0112, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0114, code lost:
        X.JTQ.A1D(r4, r0, r28);
        r4.A03 = X.002.A0R(r8, r7);
        r4.A0P(r6);
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0124, code lost:
        if (r1 == null) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0126, code lost:
        r9 = r1.getString("music_search_session_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012c, code lost:
        r8 = r3.A00();
        r6 = r8.hashCode();
        r1 = "audio_type";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0139, code lost:
        if (r6 == 406093421) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013e, code lost:
        if (r6 == 1358194848) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0143, code lost:
        if (r6 != 1365575312) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014b, code lost:
        if (r8.equals("artist_song_list") == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014d, code lost:
        if (r9 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014f, code lost:
        r4.A9m("artist_id", r3.A04);
        r1 = "search_session_id";
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015a, code lost:
        r4.A9m(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0167, code lost:
        if ("server_loaded".equals(r3.A00()) == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0169, code lost:
        r4.A9m("music_category", r3.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0170, code lost:
        r10 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0172, code lost:
        if (r27 == null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0174, code lost:
        r4.A9m("cursor", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0179, code lost:
        r6 = A03;
        r9 = r25;
        r8 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0183, code lost:
        if (r6.contains(r7) == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x018b, code lost:
        if (X.0qQ.A0K(A00, r7) != false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018d, code lost:
        A01 = null;
        A00 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0194, code lost:
        if (r9 != X.AnonymousClass05K.A0N) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019c, code lost:
        if (X.0qQ.A0K(r8, A01) != false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019e, code lost:
        r13 = A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a0, code lost:
        if (r13 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a2, code lost:
        if (r30 == null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ac, code lost:
        if (r13.size() != r8.size()) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1OC A02(com.instagram.api.schemas.MusicProduct r21, com.instagram.common.session.UserSession r22, X.1NU r23, com.instagram.music.common.model.MusicBrowseCategory r24, java.lang.Integer r25, java.lang.Long r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.Map r30) {
        /*
            r20 = this;
            r0 = 0
            r2 = r22
            X.0qQ.A0B(r2, r0)
            r3 = r24
            java.lang.String r1 = r3.A00()
            int r0 = r1.hashCode()
            java.lang.String r7 = "music/moods/"
            java.lang.String r6 = "music/genres/"
            java.lang.String r5 = "Required value was null."
            java.lang.String r4 = "feed/saved/audio/"
            switch(r0) {
                case -1865828127: goto L_0x00d8;
                case -1380604278: goto L_0x00cd;
                case -1249499312: goto L_0x00b8;
                case -745857242: goto L_0x00ad;
                case -666185738: goto L_0x00a2;
                case -337079261: goto L_0x0097;
                case 50511102: goto L_0x0082;
                case 104080476: goto L_0x006f;
                case 118647240: goto L_0x0064;
                case 372494411: goto L_0x0058;
                case 406093421: goto L_0x004d;
                case 921623681: goto L_0x0041;
                case 1358194848: goto L_0x003e;
                case 1365575312: goto L_0x0032;
                case 1394955557: goto L_0x0026;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.String r1 = "Unsupported MusicBrowseCategory: "
            java.lang.String r0 = r3.A00()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0026:
            java.lang.String r0 = "trending"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/trending/"
            goto L_0x00ec
        L_0x0032:
            java.lang.String r0 = "artist_song_list"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/search/"
            goto L_0x00ec
        L_0x003e:
            java.lang.String r0 = "saved_original_audio"
            goto L_0x004f
        L_0x0041:
            java.lang.String r0 = "server_loaded"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/music_browser/"
            goto L_0x00ec
        L_0x004d:
            java.lang.String r0 = "saved_music"
        L_0x004f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            r7 = r4
            goto L_0x00ec
        L_0x0058:
            java.lang.String r0 = "feed_browse"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/music_in_feed_audio_browser/"
            goto L_0x00ec
        L_0x0064:
            java.lang.String r0 = "notes_browse"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/notes_audio_browser/"
            goto L_0x00ec
        L_0x006f:
            java.lang.String r0 = "moods"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r3.A04
            if (r1 == 0) goto L_0x00ec
            r0 = 47
            java.lang.String r7 = X.002.A0S(r7, r1, r0)
            goto L_0x00ec
        L_0x0082:
            java.lang.String r0 = "category"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r4 = r3.A04
            if (r4 == 0) goto L_0x02a1
            java.lang.String r1 = "music/category/"
            r0 = 47
            java.lang.String r7 = X.002.A0S(r1, r4, r0)
            goto L_0x00ec
        L_0x0097:
            java.lang.String r0 = "boost_audio_browser"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/boost_audio_browser/"
            goto L_0x00ec
        L_0x00a2:
            java.lang.String r0 = "stories_browse"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/stories_audio_browser/"
            goto L_0x00ec
        L_0x00ad:
            java.lang.String r0 = "clips_browse"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/clips_audio_browser/"
            goto L_0x00ec
        L_0x00b8:
            java.lang.String r0 = "genres"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r3.A04
            if (r1 != 0) goto L_0x00c6
            r7 = r6
            goto L_0x00ec
        L_0x00c6:
            r0 = 47
            java.lang.String r7 = X.002.A0S(r6, r1, r0)
            goto L_0x00ec
        L_0x00cd:
            java.lang.String r0 = "browse"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r7 = "music/browse/"
            goto L_0x00ec
        L_0x00d8:
            java.lang.String r0 = "playlists"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r4 = r3.A04
            if (r4 == 0) goto L_0x0331
            java.lang.String r1 = "music/playlist/"
            r0 = 47
            java.lang.String r7 = X.002.A0S(r1, r4, r0)
        L_0x00ec:
            r5 = r7
            r6 = r23
            boolean r0 = r6 instanceof X.C12790T7a
            if (r0 == 0) goto L_0x029d
            java.lang.String r8 = "pando: "
        L_0x00f5:
            X.1NY r4 = X.DbU.A0M(r2)
            java.lang.String r1 = r3.A00()
            int r0 = r1.hashCode()
            switch(r0) {
                case 50511102: goto L_0x0287;
                case 406093421: goto L_0x0284;
                case 921623681: goto L_0x0291;
                case 1358194848: goto L_0x0281;
                default: goto L_0x0104;
            }
        L_0x0104:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0106:
            r4.A08(r0)
            r4.A0A(r7)
            java.lang.String r0 = X.C14245TsS.A00(r21)
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = ""
        L_0x0114:
            r1 = r28
            X.JTQ.A1D(r4, r0, r1)
            java.lang.String r0 = X.002.A0R(r8, r7)
            r4.A03 = r0
            r4.A0P(r6)
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x027e
            java.lang.String r0 = "music_search_session_id"
            java.lang.String r9 = r1.getString(r0)
        L_0x012c:
            java.lang.String r8 = r3.A00()
            int r6 = r8.hashCode()
            r0 = 406093421(0x18347e6d, float:2.3328283E-24)
            java.lang.String r1 = "audio_type"
            if (r6 == r0) goto L_0x026e
            r0 = 1358194848(0x50f468a0, float:3.28039793E10)
            if (r6 == r0) goto L_0x0263
            r0 = 1365575312(0x51650690, float:6.1478601E10)
            if (r6 != r0) goto L_0x015d
            java.lang.String r0 = "artist_song_list"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x015d
            if (r9 == 0) goto L_0x015d
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "artist_id"
            r4.A9m(r0, r1)
            java.lang.String r1 = "search_session_id"
            java.lang.String r0 = ""
        L_0x015a:
            r4.A9m(r1, r0)
        L_0x015d:
            java.lang.String r0 = r3.A00()
            java.lang.String r14 = "server_loaded"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0170
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "music_category"
            r4.A9m(r0, r1)
        L_0x0170:
            r10 = r27
            if (r27 == 0) goto L_0x0179
            java.lang.String r0 = "cursor"
            r4.A9m(r0, r10)
        L_0x0179:
            java.util.List r6 = A03
            boolean r0 = r6.contains(r7)
            r9 = r25
            r8 = r30
            if (r0 == 0) goto L_0x0261
            java.lang.String r0 = A00
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x0192
            r0 = 0
            A01 = r0
            A00 = r7
        L_0x0192:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r9 != r0) goto L_0x0261
            java.util.Map r0 = A01
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 != 0) goto L_0x0261
            java.util.Map r13 = A01
            if (r13 == 0) goto L_0x0209
            if (r30 == 0) goto L_0x0209
            int r1 = r13.size()
            int r0 = r8.size()
            if (r1 != r0) goto L_0x0209
            java.util.Iterator r19 = X.DbV.A16(r13)
        L_0x01b2:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r19.next()
            java.lang.Object r12 = r13.get(r0)
            java.util.Map r12 = (java.util.Map) r12
            if (r12 == 0) goto L_0x0209
            java.lang.Object r11 = r8.get(r0)
            java.util.Map r11 = (java.util.Map) r11
            if (r11 == 0) goto L_0x0209
            int r1 = r12.size()
            int r0 = r11.size()
            if (r1 != r0) goto L_0x0209
            java.util.Iterator r18 = X.DbV.A16(r12)
        L_0x01da:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r18.next()
            java.lang.Number r1 = X.C51966G9m.A14(r0, r12)
            r15 = 0
            if (r1 == 0) goto L_0x01fb
            float r1 = r1.floatValue()
            java.lang.Number r0 = X.C51966G9m.A14(r0, r11)
            if (r0 == 0) goto L_0x01f9
            float r15 = r0.floatValue()
        L_0x01f9:
            float r15 = r1 - r15
        L_0x01fb:
            float r0 = java.lang.Math.abs(r15)
            double r0 = (double) r0
            r16 = 4536524183238306033(0x3ef4f8b588e368f1, double:2.0E-5)
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 <= 0) goto L_0x01da
        L_0x0209:
            r11 = 1
        L_0x020a:
            java.lang.String r0 = r3.A00()
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x021c
            r1 = 47
            java.lang.String r0 = r3.A03
            java.lang.String r7 = X.002.A0T(r7, r0, r1)
        L_0x021c:
            if (r11 == 0) goto L_0x022f
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319355852037294(0x81084300081cae, double:3.0318451149113E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x022f
            java.lang.Long r26 = X.C51971G9r.A0m()
        L_0x022f:
            r2 = 4000(0xfa0, double:1.9763E-320)
            if (r27 != 0) goto L_0x0245
            r4.A07 = r9
            r4.A0A = r7
            if (r26 == 0) goto L_0x023f
            long r0 = r26.longValue()
            r4.A01 = r0
        L_0x023f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r0 != r9) goto L_0x0245
            r4.A00 = r2
        L_0x0245:
            if (r11 == 0) goto L_0x024b
            A01 = r30
            A00 = r5
        L_0x024b:
            r1 = r29
            if (r29 == 0) goto L_0x0258
            r0 = 3751(0xea7, float:5.256E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A9m(r0, r1)
        L_0x0258:
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L_0x032c
            if (r30 == 0) goto L_0x032c
            goto L_0x02a6
        L_0x0261:
            r11 = 0
            goto L_0x020a
        L_0x0263:
            java.lang.String r0 = "saved_original_audio"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x015d
            r0 = 5101(0x13ed, float:7.148E-42)
            goto L_0x0278
        L_0x026e:
            java.lang.String r0 = "saved_music"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x015d
            r0 = 5000(0x1388, float:7.006E-42)
        L_0x0278:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x015a
        L_0x027e:
            r9 = 0
            goto L_0x012c
        L_0x0281:
            java.lang.String r0 = "saved_original_audio"
            goto L_0x0289
        L_0x0284:
            java.lang.String r0 = "saved_music"
            goto L_0x0289
        L_0x0287:
            java.lang.String r0 = "category"
        L_0x0289:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0299
            goto L_0x0104
        L_0x0291:
            java.lang.String r0 = "server_loaded"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
        L_0x0299:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0106
        L_0x029d:
            java.lang.String r8 = "ig-json-parser:"
            goto L_0x00f5
        L_0x02a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x02a6:
            java.io.StringWriter r3 = X.JTO.A0v()     // Catch:{ IOException -> 0x0324 }
            android.util.JsonWriter r5 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0324 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0324 }
            r5.beginArray()     // Catch:{ IOException -> 0x0324 }
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r8)     // Catch:{ IOException -> 0x0324 }
        L_0x02b6:
            boolean r0 = r9.hasNext()     // Catch:{ IOException -> 0x0324 }
            if (r0 == 0) goto L_0x0314
            java.util.Map$Entry r8 = X.AnonymousClass7TE.A1J(r9)     // Catch:{ IOException -> 0x0324 }
            java.lang.Object r0 = r8.getValue()     // Catch:{ IOException -> 0x0324 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IOException -> 0x0324 }
            java.util.Iterator r7 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ IOException -> 0x0324 }
        L_0x02ca:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x0324 }
            if (r0 == 0) goto L_0x02b6
            java.util.Map$Entry r6 = X.AnonymousClass7TE.A1J(r7)     // Catch:{ IOException -> 0x0324 }
            r5.beginObject()     // Catch:{ IOException -> 0x0324 }
            java.lang.Object r0 = r8.getKey()     // Catch:{ IOException -> 0x0324 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ IOException -> 0x0324 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0324 }
            if (r0 != 0) goto L_0x0309
            java.lang.String r2 = ""
        L_0x02e5:
            java.lang.String r0 = "concept"
            android.util.JsonWriter r1 = r5.name(r0)     // Catch:{ IOException -> 0x0324 }
            java.lang.String r0 = X.DbT.A13(r6)     // Catch:{ IOException -> 0x0324 }
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ IOException -> 0x0324 }
            r1.value(r0)     // Catch:{ IOException -> 0x0324 }
            java.lang.String r0 = "score"
            android.util.JsonWriter r1 = r5.name(r0)     // Catch:{ IOException -> 0x0324 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ IOException -> 0x0324 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x0324 }
            r1.value(r0)     // Catch:{ IOException -> 0x0324 }
            r5.endObject()     // Catch:{ IOException -> 0x0324 }
            goto L_0x02ca
        L_0x0309:
            java.lang.String r1 = X.DbT.A13(r8)     // Catch:{ IOException -> 0x0324 }
            r0 = 95
            java.lang.String r2 = X.002.A0C(r1, r0)     // Catch:{ IOException -> 0x0324 }
            goto L_0x02e5
        L_0x0314:
            r5.endArray()     // Catch:{ IOException -> 0x0324 }
            r5.close()     // Catch:{ IOException -> 0x0324 }
            java.lang.String r1 = "contextual_rec_topics"
            java.lang.String r0 = r3.toString()     // Catch:{ IOException -> 0x0324 }
            r4.A9m(r1, r0)     // Catch:{ IOException -> 0x0324 }
            goto L_0x032c
        L_0x0324:
            r2 = move-exception
            java.lang.String r1 = "MusicSearchApiUtil"
            java.lang.String r0 = "Failed to generate contextual music recommendation data"
            X.0wb.A06(r1, r0, r2)
        L_0x032c:
            X.1OC r0 = r4.A0M()
            return r0
        L_0x0331:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LSH.A02(com.instagram.api.schemas.MusicProduct, com.instagram.common.session.UserSession, X.1NU, com.instagram.music.common.model.MusicBrowseCategory, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map):X.1OC");
    }

    public static final 1NY A00(MusicProduct musicProduct, UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("music/search_v2/");
        String A002 = C14245TsS.A00(musicProduct);
        if (A002 == null) {
            A002 = "";
        }
        JTQ.A1D(A0a, A002, str3);
        A0a.A9m("q", str);
        A0a.A9m("search_session_id", str4);
        A0a.A0H("from_typeahead", z);
        A0a.A0H("from_search", z2);
        C51972G9s.A18(A0a, userSession, C45699D1y.class);
        if (str2 == null) {
            str2 = "";
        }
        A0a.A0A = 002.A0g("music/search_v2/", str, str2);
        A0a.A03();
        return A0a;
    }

    public static final 1OC A01(MusicProduct musicProduct, UserSession userSession, Integer num, String str, String str2, int i) {
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("music/keyword_search/");
        String A002 = C14245TsS.A00(musicProduct);
        if (A002 == null) {
            A002 = "";
        }
        JTQ.A1D(A0b, A002, str2);
        A0b.A9m("q", str);
        A0b.A9m("search_session_id", "");
        A0b.A9m("num_keywords", String.valueOf(i));
        A0b.A0Q(K1P.class, LJO.class);
        String A0R = 002.A0R("music/keyword_search/", str);
        A0b.A07 = num;
        A0b.A0A = A0R;
        A0b.A01 = 86400000;
        if (AnonymousClass05K.A0Y == num) {
            A0b.A00 = 1500;
        }
        return A0b.A0M();
    }
}
