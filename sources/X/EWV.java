package X;

public enum EWV {
    A0A((C48142EZk) null, "BAND", "band", "share_to_band", "com.nhn.android.band", 0, false, false),
    A0B((C48142EZk) null, "BARCELONA", "barcelona", "share_to_barcelona", "com.instagram.barcelona", 1, true, false),
    A0C(r4, "COPY_LINK", "copy_link", (String) null, (String) null, 2, false, false),
    A0D((C48142EZk) null, "DISCORD", "discord", "share_to_discord", "com.discord", 3, false, false),
    A0E((C48142EZk) null, "FACEBOOK", "facebook", "share_to_facebook", "com.facebook.katana", 4, true, false),
    A0F((C48142EZk) null, "KAKAOTALK", "kakaotalk", "share_to_kakaotalk", "com.kakao.talk", 5, false, false),
    A0G((C48142EZk) null, "LINE", "line", "share_to_line", "jp.naver.line.android", 6, false, false),
    A0H(r18, "MESSENGER", "messenger", "share_to_messenger", "com.facebook.orca", 7, true, false),
    A0I((C48142EZk) null, "NAMETAG", "system_share_sheet", "system_share_sheet", (String) null, 8, false, true),
    A0J(r28, "SHARE_SHEET", "system_share_sheet", "share_to_system_sheet", (String) null, 9, false, true),
    A0L(r27, "SNAPCHAT", "snapchat", "share_to_snapchat", "com.snapchat.android", 10, false, false),
    A0O((C48142EZk) null, "X", "twitter", "share_to_twitter", "com.twitter.android", 11, false, false),
    A0K(r13, "SMS", "user_sms", (String) null, (String) null, 12, false, false),
    A0M((C48142EZk) null, "VK", "vk", "share_to_vk", "com.vkontakte.android", 13, false, false),
    A0N(AnonymousClass05K.A1F, "WHATSAPP", "whatsapp", "share_to_whatsapp", "com.whatsapp", 14, true, false);
    
    public final C48142EZk A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    /* access modifiers changed from: public */
    static {
        EWV[] ewvArr;
        A08 = 0oU.A00(ewvArr);
    }

    /* access modifiers changed from: public */
    EWV(Integer num, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        this.A05 = str2;
        this.A02 = r2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = num;
        this.A00 = r1;
    }
}
