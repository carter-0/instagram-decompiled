package X;

/* renamed from: X.KiE  reason: case insensitive filesystem */
public enum C62581KiE {
    START(0, "start"),
    CAMERA(0, "camera"),
    VIDEO_GALLERY(1, "video_gallery"),
    VIDEO_PREVIEW(2, "video_preview"),
    COVER_IMAGE(3, "cover_image"),
    POST_LIVE_COVER_IMAGE(3, "post_live_cover_image"),
    METADATA(4, "metadata"),
    READY_TO_PUBLISH(5, "ready_to_publish"),
    PUBLISHED(6, "published");
    
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        C62581KiE[] kiEArr;
        A02 = 0oU.A00(kiEArr);
    }

    /* access modifiers changed from: public */
    C62581KiE(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
