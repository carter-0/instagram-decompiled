package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* renamed from: X.M6j  reason: case insensitive filesystem */
public final class C65972M6j implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ String A01;

    public C65972M6j(CachingVideoSaver cachingVideoSaver, String str) {
        this.A00 = cachingVideoSaver;
        this.A01 = str;
    }

    public final void run() {
        MV5 mv5 = (MV5) this.A00.A02.get(this.A01);
        if (mv5 != null) {
            mv5.onStart();
        }
    }
}
