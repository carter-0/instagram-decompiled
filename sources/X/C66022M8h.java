package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* renamed from: X.M8h  reason: case insensitive filesystem */
public final class C66022M8h implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ Exception A01;
    public final /* synthetic */ String A02;

    public C66022M8h(CachingVideoSaver cachingVideoSaver, Exception exc, String str) {
        this.A00 = cachingVideoSaver;
        this.A02 = str;
        this.A01 = exc;
    }

    public final void run() {
        MV5 mv5 = (MV5) this.A00.A02.get(this.A02);
        if (mv5 != null) {
            mv5.DEG(this.A01);
        }
    }
}
