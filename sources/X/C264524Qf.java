package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.4Qf  reason: invalid class name and case insensitive filesystem */
public abstract class C264524Qf {
    public static C290615fb A00(AnonymousClass4OI r8, AnonymousClass4OS r9, ServiceEventCallbackImpl serviceEventCallbackImpl, HeroPlayerSetting heroPlayerSetting, String str, boolean z) {
        C255653uU r1 = r8.A0K;
        String str2 = r1.A0G;
        if (str2 == null) {
            27B.A02("AbrMonitorFactory", "request.mVideoSource.mVideoId is null", new Object[0]);
        } else if (heroPlayerSetting.A1I) {
            return new C290615fb(serviceEventCallbackImpl, str2, str, r9.A0q, r1.A03(), z, heroPlayerSetting.A0w.A0a);
        }
        return null;
    }
}
