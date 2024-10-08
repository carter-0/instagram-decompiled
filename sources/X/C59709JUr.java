package X;

import com.instagram.music.common.model.DownloadedTrack;
import java.io.IOException;

/* renamed from: X.JUr  reason: case insensitive filesystem */
public abstract class C59709JUr {
    public static DownloadedTrack parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("track_file_path".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("partial_track_start_offset_ms".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("partial_track_duration_offset_ms".equals(A0q)) {
                    num2 = Integer.valueOf(r10.A1D());
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("track_file_path", r10, "DownloadedTrack");
            } else if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L("partial_track_start_offset_ms", r10, "DownloadedTrack");
            } else if (num2 != null || !(r10 instanceof 0c9)) {
                return new DownloadedTrack(str, num.intValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("partial_track_duration_offset_ms", r10, "DownloadedTrack");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
