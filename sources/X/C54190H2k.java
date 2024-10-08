package X;

/* renamed from: X.H2k  reason: case insensitive filesystem */
public final class C54190H2k extends C321676uZ {
    public Boolean A00;
    public Integer A01;
    public Integer A02;

    public final void A05() {
        super.A05();
        Integer num = this.A02;
        if (num != null) {
            A0G("remix_privacy_threshold", num.intValue());
        }
        Boolean bool = this.A00;
        if (bool != null) {
            A0K("is_video_remixable", bool.booleanValue());
        }
        Integer num2 = this.A01;
        if (num2 != null) {
            A0G("associated_clips_count", num2.intValue());
        }
    }
}
