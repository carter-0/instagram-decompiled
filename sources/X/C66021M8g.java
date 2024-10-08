package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;

/* renamed from: X.M8g  reason: case insensitive filesystem */
public final class C66021M8g implements Runnable {
    public final /* synthetic */ CachingVideoSaver A00;
    public final /* synthetic */ MV5 A01;
    public final /* synthetic */ String A02;

    public C66021M8g(CachingVideoSaver cachingVideoSaver, MV5 mv5, String str) {
        this.A01 = mv5;
        this.A00 = cachingVideoSaver;
        this.A02 = str;
    }

    public final void run() {
        MV5 mv5 = this.A01;
        if (mv5 != null) {
            mv5.onStart();
            mv5.onFinish();
            Object obj = this.A00.A03.get(this.A02);
            if (obj != null) {
                mv5.Doe((String) obj);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
