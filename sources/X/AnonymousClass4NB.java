package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.4NB  reason: invalid class name */
public final class AnonymousClass4NB {
    public final AnonymousClass4NA A00;
    public final Handler A01;
    public final HeroPlayerSetting A02;
    public final Runnable A03 = new AnonymousClass4NC(this);
    public volatile long A04 = -1;
    public volatile long A05 = -1;

    public AnonymousClass4NB(Handler handler, AnonymousClass4NA r4, HeroPlayerSetting heroPlayerSetting) {
        0qQ.A0B(handler, 2);
        this.A02 = heroPlayerSetting;
        this.A01 = handler;
        this.A00 = r4;
    }
}
