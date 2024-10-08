package X;

public enum EWQ {
    A05("BLOCK", true),
    A06("BLOCK_STORY", false),
    A07("COPY_URL", false),
    A0I("SHOW_QR_CODE", false),
    A09("DIRECT_MESSAGE", false),
    A0A("DIRECT_SHARE", false),
    A08("DIRECT_ACCEPT", false),
    A0E("REPORT", true),
    A0H("SEE_SHARED_ACTIVITY", false),
    A0D("REMOVE_FOLLOWER", false),
    A0F("RESTRICT", true),
    A04("ACCOUNT_DETAILS", false),
    A0C("MANAGE_NOTIFICATIONS", false),
    A0B("LEAVE_A_REVIEW", false),
    A0G("SAVE_TO_CREATOR_LIST", false),
    A0J("VIEW_PORTFOLIO", false);
    
    public final int A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        EWQ[] ewqArr;
        A02 = 0oU.A00(ewqArr);
    }

    /* access modifiers changed from: public */
    EWQ(String str, boolean z) {
        this.A01 = z;
        this.A00 = r2;
    }
}
