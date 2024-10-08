package X;

import android.os.SystemClock;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4SH  reason: invalid class name */
public final class AnonymousClass4SH {
    public final 28T A00;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public final AnonymousClass4OI A03;
    public final HeroPlayerSetting A04;
    public final Map A05 = new HashMap();

    public static void A00(AnonymousClass4SH r4) {
        Map map = r4.A05;
        AnonymousClass4SI r2 = AnonymousClass4SI.JUMP_BY_SEEKING_GENERAL_TARGET_BUFFER;
        27s r0 = r4.A00.A03;
        r0.A01();
        AnonymousClass4SJ r1 = new AnonymousClass4SJ(r4);
        r0.A01();
        map.put(r2, Arrays.asList(new AnonymousClass4SJ[]{r1, new AnonymousClass4SJ(r4)}));
        map.put(AnonymousClass4SI.JUMP_BY_PAUSE_LOADING, Arrays.asList(new AnonymousClass4SJ[]{new AnonymousClass4SJ(r4), new AnonymousClass4SJ(r4)}));
        map.put(AnonymousClass4SI.JUMP_BY_TRIMMING_BY_BUFFER_METER, Collections.singletonList(new AnonymousClass4SJ(r4)));
        map.put(AnonymousClass4SI.JUMP_BY_DISCONTINUITY_LOADING, Collections.singletonList(new AnonymousClass4SJ(r4)));
    }

    public AnonymousClass4SH(AnonymousClass4OI r2, 28T r3, HeroPlayerSetting heroPlayerSetting) {
        SystemClock.elapsedRealtime();
        this.A04 = heroPlayerSetting;
        this.A00 = r3;
        this.A03 = r2;
        A00(this);
    }
}
