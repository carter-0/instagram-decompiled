package X;

import com.instagram.settings.controlcenter.api.DataDownloadStatusCheckResponse;
import java.io.IOException;

/* renamed from: X.F7g  reason: case insensitive filesystem */
public final class C49795F7g {
    public static DataDownloadStatusCheckResponse parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("message_header".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r7);
                } else if (AnonymousClass000.A00(3591).equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r7);
                } else if ("email_hint".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r7);
                } else if ("content_status".equals(A17)) {
                    String A1Q = r7.A1Q();
                    DataDownloadStatusCheckResponse.JobStatus[] values = DataDownloadStatusCheckResponse.JobStatus.values();
                    int length = values.length;
                    int i = 0;
                    while (i < length) {
                        DataDownloadStatusCheckResponse.JobStatus jobStatus = values[i];
                        if (A1Q.equalsIgnoreCase(jobStatus.name())) {
                            r1.A00 = jobStatus;
                        } else {
                            i++;
                        }
                    }
                    throw new UnsupportedOperationException();
                } else {
                    1XY.A01(r7, r1, A17);
                }
                r7.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
