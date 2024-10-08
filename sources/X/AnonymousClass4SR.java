package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.CameraCapturer;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4SR  reason: invalid class name */
public final class AnonymousClass4SR {
    public final AnonymousClass4OI A00;
    public final HeroPlayerSetting A01;
    public final Map A02;

    public AnonymousClass4SR(AnonymousClass4OI r8, HeroPlayerSetting heroPlayerSetting) {
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        this.A01 = heroPlayerSetting;
        this.A00 = r8;
        hashMap.put(AnonymousClass4SS.VOD, new AnonymousClass4ST(heroPlayerSetting.A0e, heroPlayerSetting.A0G, heroPlayerSetting.A05, heroPlayerSetting.A0I));
        hashMap.put(AnonymousClass4SS.LIVE_DEFAULT, new AnonymousClass4ST(1, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, 30000));
        hashMap.put(AnonymousClass4SS.LIVE_API_TIER, new AnonymousClass4ST(1, 6000, CameraCapturer.OPEN_CAMERA_TIMEOUT, 60000));
        hashMap.put(AnonymousClass4SS.LIVE_PREMIUM_TIER, new AnonymousClass4ST(1, 6000, CameraCapturer.OPEN_CAMERA_TIMEOUT, 60000));
    }
}
