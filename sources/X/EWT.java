package X;

public enum EWT {
    FOLLOW_USER_FLOW("follow_button_profile", 0),
    UNFOLLOW_USER_FLOW("unfollow_button_profile", 1),
    EDIT_BIO_FLOW("edit_profile_bio_button_profile", 2),
    PIN_POST_FLOW("pin_post_button_profile", 3),
    EDIT_NAME_FLOW("edit_profile_name_button_profile", 4),
    EDIT_PROFILE_PIC_FLOW("edit_profile_picture_button_profile", 5),
    LIST_FOLLOW_USER_FLOW("list_follow_button_profile", 6);
    
    public long A00;
    public final String A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        EWT[] ewtArr;
        A03 = 0oU.A00(ewtArr);
    }

    /* access modifiers changed from: public */
    EWT(String str, int i) {
        this.A01 = r4;
        this.A02 = str;
        this.A00 = 0;
    }
}
