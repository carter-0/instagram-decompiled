package X;

import android.os.Process;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class S31 {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public boolean A03 = true;
    public final String A04;
    public final Map A05;

    public S31(MediaComposition mediaComposition, String str, String str2, Map map) {
        this.A04 = str;
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A05 = A1E;
        A1E.put("waterfall_id", str);
        A1E.put(C273654mx.A00(638), str);
        A1E.put("retry_id", C9610Rdo.A00(String.valueOf(System.currentTimeMillis())));
        A1E.put("is_videolite_flow", "true");
        A1E.put("process_id", String.valueOf(Process.myPid()));
        if (str2 != null) {
            this.A05.put("asset_id", C9610Rdo.A00(str2));
            this.A05.put("video_original_file_path", str2);
        }
        if (mediaComposition != null) {
            this.A05.put("media_composition", mediaComposition.toString());
            this.A05.put("media_composition_hash", mediaComposition.A05());
        }
        if (map != null) {
            this.A05.putAll(map);
        }
    }

    public final HashMap A00() {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(this.A05);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            if (value != null) {
                A1E.put(key, value);
            }
        }
        long j = this.A02;
        long j2 = 0;
        if (0 < j) {
            j2 = j;
        }
        long j3 = this.A00;
        if (j3 < 0) {
            j3 = this.A01;
        }
        long j4 = j3 - j2;
        if (j4 > 0) {
            A1E.put(TraceFieldType.Duration, String.valueOf(j4));
        }
        return A1E;
    }
}
