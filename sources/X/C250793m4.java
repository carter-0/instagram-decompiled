package X;

import com.facebook.video.cache.igdatasource.IgHttpDataSource;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3m4  reason: invalid class name and case insensitive filesystem */
public final class C250793m4 extends 28N {
    public 0lg A00;
    public final HeroPlayerSetting A01;
    public final AtomicReference A02;
    public final AtomicReference A03;

    public C250793m4(HeroPlayerSetting heroPlayerSetting, AtomicReference atomicReference, AtomicReference atomicReference2) {
        0qQ.A0B(heroPlayerSetting, 1);
        0qQ.A0B(atomicReference, 2);
        0qQ.A0B(atomicReference2, 3);
        this.A01 = heroPlayerSetting;
        this.A02 = atomicReference;
        this.A03 = atomicReference2;
    }

    public final String A01() {
        return "IgHttpDataSourceFactory";
    }

    public final C257103wr A00(C257063wn r9, C257093wq r10, C250823m7 r11, String str, int i, int i2) {
        return new IgHttpDataSource(r11, i2, this.A01, this.A02, r9, this.A03, this.A00);
    }
}
