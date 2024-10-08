package X;

import com.instagram.creation.capture.quickcapture.save.CachingVideoSaver;
import java.util.Map;

/* renamed from: X.LmJ  reason: case insensitive filesystem */
public final class C65040LmJ implements MV5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CachingVideoSaver A01;
    public final /* synthetic */ String A02;

    public final void DEG(Exception exc) {
        0qQ.A0B(exc, 0);
        CachingVideoSaver cachingVideoSaver = this.A01;
        Map map = cachingVideoSaver.A01;
        String str = this.A02;
        Number A14 = C51966G9m.A14(str, map);
        int i = this.A00;
        if (A14 != null && A14.intValue() == i) {
            11Z.A02(new C66022M8h(cachingVideoSaver, exc, str));
            cachingVideoSaver.A02.remove(str);
        }
    }

    public final void Doe(String str) {
        0qQ.A0B(str, 0);
        CachingVideoSaver cachingVideoSaver = this.A01;
        Map map = cachingVideoSaver.A01;
        String str2 = this.A02;
        Number A14 = C51966G9m.A14(str2, map);
        int i = this.A00;
        if (A14 != null && A14.intValue() == i) {
            cachingVideoSaver.A03.put(str2, str);
            11Z.A02(new C66023M8i(cachingVideoSaver, str2, str));
            cachingVideoSaver.A02.remove(str2);
        }
    }

    public C65040LmJ(CachingVideoSaver cachingVideoSaver, String str, int i) {
        this.A01 = cachingVideoSaver;
        this.A02 = str;
        this.A00 = i;
    }

    public final void onFinish() {
        CachingVideoSaver cachingVideoSaver = this.A01;
        Map map = cachingVideoSaver.A01;
        String str = this.A02;
        Number A14 = C51966G9m.A14(str, map);
        int i = this.A00;
        if (A14 != null && A14.intValue() == i) {
            cachingVideoSaver.A04.remove(str);
            11Z.A02(new C65971M6i(cachingVideoSaver, str));
        }
    }

    public final void onStart() {
        CachingVideoSaver cachingVideoSaver = this.A01;
        Map map = cachingVideoSaver.A01;
        String str = this.A02;
        Number A14 = C51966G9m.A14(str, map);
        int i = this.A00;
        if (A14 != null && A14.intValue() == i) {
            11Z.A02(new C65972M6j(cachingVideoSaver, str));
        }
    }
}
