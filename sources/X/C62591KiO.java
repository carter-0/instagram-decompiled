package X;

import com.instagram.android.R;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.KiO  reason: case insensitive filesystem */
public enum C62591KiO {
    POPULAR(2131953503, R.drawable.instagram_promote_pano_outline_24, "-1"),
    HAPPY(2131953500, R.drawable.instagram_face1_pano_outline_24, "0"),
    LOVE(2131953502, R.drawable.instagram_heart_pano_outline_24, RealtimeSubscription.GRAPHQL_MQTT_VERSION),
    SAD_OR_ANGRY(2131953505, R.drawable.instagram_face4_pano_outline_24, "2"),
    GREETING(2131953499, R.drawable.instagram_wave_pano_outline_24, "3"),
    REACTION(2131953504, R.drawable.instagram_thumb_up_pano_outline_24, "4"),
    CELEBRATING(2131953498, R.drawable.instagram_cake_pano_outline_24, "5"),
    LIFESTYLE(2131953501, R.drawable.instagram_basketball_pano_outline_24, "6");
    
    public final int A00;
    public final int A01;
    public final String A02;

    /* access modifiers changed from: public */
    static {
        C62591KiO[] kiOArr;
        A03 = 0oU.A00(kiOArr);
    }

    /* access modifiers changed from: public */
    C62591KiO(int i, int i2, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }
}
