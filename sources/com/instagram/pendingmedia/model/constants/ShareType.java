package com.instagram.pendingmedia.model.constants;

import X.00k;
import X.01I;
import X.0kH;
import X.0oU;
import X.0qQ;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;

public enum ShareType {
    FOLLOWERS_SHARE(false, 0),
    DIRECT_SHARE(false, 1),
    REEL_SHARE(true, 2),
    DIRECT_STORY_SHARE(false, 3),
    REEL_SHARE_AND_DIRECT_STORY_SHARE(true, 4),
    NAMETAG_SELFIE(false, 5),
    NAMETAG_BACKGROUND_IMAGE(false, 6),
    UNKNOWN(false, 7),
    IGTV(false, 8),
    CLIPS(false, 9),
    POST_LIVE_IGTV(false, 10),
    POST_LIVE_IGTV_COVER_PHOTO(false, 11),
    CLIPS_PANAVIDEO(false, 12),
    MEDIA_KIT(false, 13),
    EXPRESSIVE_QUESTION_STICKER(false, 14),
    PROMPTS(false, 15),
    HIGHLIGHTS(false, 16),
    CUTOUT_STICKER(false, 17),
    STORY_TEMPLATE_ASSET(false, 18),
    STORY_TEMPLATE_BACKGROUND_ASSET(false, 19),
    CLIPS_REUSABLE_TEMPLATE_ASSETS(false, 20),
    CLIPS_WITH_TEMPLATE(false, 21),
    AUDIO_NOTE(false, 22),
    NOTE(false, 23),
    VIDEO_IN_NOTE_POG(false, 24),
    SHARE_TO_FRIENDS_STORY(true, 25),
    NOTE_MEDIA_REPLY(false, 26),
    WONDER_WALL(false, 27),
    CLIPS_UNDERLYING_SPINNABLE_VIDEO(false, 28),
    QUICKSNAP(false, 29),
    POTATO(false, 30),
    INVALID(false, 31),
    UNINITIALIZED(false, 32);
    
    public static final EnumSet A02 = null;
    public static final EnumSet A03 = null;
    public static final Set A04 = null;
    public final boolean A00;
    public final boolean A01;

    /* access modifiers changed from: public */
    static {
        int i;
        ShareType[] shareTypeArr;
        A05 = 0oU.A00(shareTypeArr);
        01I r5 = new 01I();
        for (ShareType obj : values()) {
            r5.add(obj.toString());
        }
        A04 = 0kH.A04(r5);
        ShareType[] values = values();
        ArrayList arrayList = new ArrayList();
        for (ShareType shareType : values) {
            if (shareType.A00) {
                arrayList.add(shareType);
            }
        }
        EnumSet copyOf = EnumSet.copyOf(00k.A0k(arrayList));
        0qQ.A07(copyOf);
        A02 = copyOf;
        ShareType[] values2 = values();
        ArrayList arrayList2 = new ArrayList();
        for (ShareType shareType2 : values2) {
            if (shareType2.A01) {
                arrayList2.add(shareType2);
            }
        }
        EnumSet copyOf2 = EnumSet.copyOf(00k.A0k(arrayList2));
        0qQ.A07(copyOf2);
        A03 = copyOf2;
    }

    /* access modifiers changed from: public */
    ShareType(boolean z, int i) {
        this.A01 = r2;
        this.A00 = z;
    }
}
