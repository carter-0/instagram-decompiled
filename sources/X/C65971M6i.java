package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* renamed from: X.M6i  reason: case insensitive filesystem */
public final class C65971M6i implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ String A01;

    public C65971M6i(CachingVideoSaver cachingVideoSaver, String str) {
        this.A00 = cachingVideoSaver;
        this.A01 = str;
    }

    public final void run() {
        MV5 mv5 = (MV5) this.A00.A02.get(this.A01);
        if (mv5 != null) {
            mv5.onFinish();
        }
    }
}
