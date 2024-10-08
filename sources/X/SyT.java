package X;

import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import java.util.List;

public final /* synthetic */ class SyT implements C13647TeE {
    public final Object FP2(Object obj) {
        zzr zzr = (zzr) obj;
        List A01 = SAA.A01(zzr.A01);
        String str = zzr.A03;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        Rect A00 = SAA.A00(A01);
        String str2 = zzr.A04;
        if (str2 == null || str2.isEmpty()) {
            str2 = "und";
        }
        return new C10702Rwg(A00, str, str2, A01);
    }
}
