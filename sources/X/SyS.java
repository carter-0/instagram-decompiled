package X;

import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import java.util.Arrays;
import java.util.List;

public final /* synthetic */ class SyS implements C13647TeE {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.TeE, java.lang.Object] */
    public final Object FP2(Object obj) {
        zzl zzl = (zzl) obj;
        List A01 = SAA.A01(zzl.A04);
        String str = zzl.A07;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        Rect A00 = SAA.A00(A01);
        String str2 = zzl.A08;
        if (str2 == null || str2.isEmpty()) {
            str2 = "und";
        }
        return new R2x(A00, str, str2, A01, C9716RfZ.A00(new Object(), Arrays.asList(zzl.A0A)));
    }
}
