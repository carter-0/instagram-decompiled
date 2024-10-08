package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9yf  reason: invalid class name and case insensitive filesystem */
public abstract class C394769yf {
    public static M1Y parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            M1Y m1y = new M1Y();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("start_time_ms".equals(A17)) {
                    m1y.A01 = r4.A1D();
                } else if ("end_time_ms".equals(A17)) {
                    m1y.A00 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("file_path".equals(A17)) {
                        m1y.A06 = AnonymousClass7TG.A0l(r4);
                    } else if (C273654mx.A00(IgNetworkConsentStorage.MAX_ENTRIES).equals(A17)) {
                        m1y.A03 = r4.A1D();
                    } else if ("trimmed_end_time_ms".equals(A17)) {
                        m1y.A02 = r4.A1D();
                    } else if ("waveform".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                arrayList.add(AnonymousClass7TF.A0U(r4));
                            }
                        }
                        m1y.A07 = arrayList;
                    } else if (AnonymousClass000.A00(4016).equals(A17)) {
                        m1y.A05 = r4.A1D();
                    } else if ("is_recording_segment".equals(A17)) {
                        m1y.A08 = r4.A0d();
                    } else if (AnonymousClass000.A00(367).equals(A17)) {
                        m1y.A04 = r4.A1D();
                    }
                }
                r4.A0z();
            }
            return m1y;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
