package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* renamed from: X.M8i  reason: case insensitive filesystem */
public final class C66023M8i implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C66023M8i(CachingVideoSaver cachingVideoSaver, String str, String str2) {
        this.A00 = cachingVideoSaver;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void run() {
        MV5 mv5 = (MV5) this.A00.A02.get(this.A01);
        if (mv5 != null) {
            mv5.Doe(this.A02);
        }
    }
}
