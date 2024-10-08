package X;

import com.instagram.autoplay.models.AutoplayGlobalConfig;

/* renamed from: X.Tpf  reason: case insensitive filesystem */
public final class C14088Tpf {
    public final C14078TpS A00;
    public final AnonymousClass3OF A01;

    public C14088Tpf(C14078TpS tpS, AnonymousClass3OF r3) {
        0qQ.A0B(r3, 2);
        this.A00 = tpS;
        this.A01 = r3;
    }

    public final int A00() {
        C14078TpS tpS = this.A00;
        if (tpS.A01().globalConfig.respectNativeAutoplayLimitations && !this.A01.A00()) {
            return 0;
        }
        int ordinal = this.A01.A00.ordinal();
        if (ordinal == 2) {
            return tpS.A01().globalConfig.androidMemoryRedMaxConcurrentVideos;
        }
        AutoplayGlobalConfig autoplayGlobalConfig = tpS.A01().globalConfig;
        if (ordinal != 1) {
            return autoplayGlobalConfig.androidMemoryGreenMaxConcurrentVideos;
        }
        return autoplayGlobalConfig.androidMemoryOrangeMaxConcurrentVideos;
    }
}
