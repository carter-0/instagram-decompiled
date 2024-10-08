package X;

import java.util.Map;

/* renamed from: X.SqU  reason: case insensitive filesystem */
public final class C12274SqU implements C13721Tfn {
    public final /* synthetic */ C11349SOi A00;

    public C12274SqU(C11349SOi sOi) {
        this.A00 = sOi;
    }

    public final void DAH() {
        C11349SOi sOi = this.A00;
        Object obj = sOi.A06.get();
        if (sOi.A00 != null && obj != null) {
            synchronized (sOi) {
                sOi.A08.put(C8886REd.ID_DETECTOR_MODEL, RE9.DOWNLOAD_FAILED);
                C11349SOi.A01(sOi);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DAJ(Object obj) {
        if (obj == null) {
            this.A00.A05.logError("Model download callback succeeded but path null", (Throwable) null);
            DAH();
            return;
        }
        C11349SOi sOi = this.A00;
        synchronized (sOi) {
            Map map = sOi.A08;
            C8886REd rEd = C8886REd.ID_DETECTOR_MODEL;
            map.put(rEd, RE9.AVAILABLE);
            sOi.A07.put(rEd, obj);
            C11349SOi.A00(sOi);
        }
    }
}
