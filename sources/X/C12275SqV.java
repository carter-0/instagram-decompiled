package X;

import java.util.Map;

/* renamed from: X.SqV  reason: case insensitive filesystem */
public final class C12275SqV implements C13721Tfn {
    public final /* synthetic */ C11349SOi A00;

    public C12275SqV(C11349SOi sOi) {
        this.A00 = sOi;
    }

    public final void DAH() {
        C11349SOi sOi = this.A00;
        Object obj = sOi.A06.get();
        if (sOi.A00 != null && obj != null) {
            synchronized (sOi) {
                Map map = sOi.A08;
                C8886REd rEd = C8886REd.OCR_DETECTOR_MODEL;
                RE9 re9 = RE9.DOWNLOAD_FAILED;
                map.put(rEd, re9);
                map.put(C8886REd.OCR_RECOGNIZER_MODEL, re9);
                map.put(C8886REd.OCR_CONFIGURATION, re9);
                C11349SOi.A01(sOi);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DAJ(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            this.A00.A05.logError("Model download callback succeeded but results null", (Throwable) null);
            DAH();
            return;
        }
        C11349SOi sOi = this.A00;
        synchronized (sOi) {
            Map map2 = sOi.A08;
            C8886REd rEd = C8886REd.OCR_DETECTOR_MODEL;
            RE9 re9 = RE9.AVAILABLE;
            map2.put(rEd, re9);
            C8886REd rEd2 = C8886REd.OCR_RECOGNIZER_MODEL;
            map2.put(rEd2, re9);
            C8886REd rEd3 = C8886REd.OCR_CONFIGURATION;
            map2.put(rEd3, re9);
            Map map3 = sOi.A07;
            map3.put(rEd, map.get(RE8.DETECTOR));
            map3.put(rEd2, map.get(RE8.RECOGNIZER));
            map3.put(rEd3, map.get(RE8.CONFIGURATION));
            C11349SOi.A00(sOi);
        }
    }
}
