package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vqg  reason: case insensitive filesystem */
public abstract class C18380Vqg {
    public static final List A00;

    static {
        ArrayList arrayList = new ArrayList();
        A00 = arrayList;
        arrayList.add(new VFG());
        arrayList.add(new VFH());
        arrayList.add(new VFI());
        arrayList.add(new VFJ());
        arrayList.add(new VFK());
    }

    public static final void A00(AnonymousClass3Q2 r2) {
        if (r2.A1G == 1iA.A0a) {
            float f = r2.A02;
            if (f <= 0.0f) {
                C16519UwO uwO = C16519UwO.INVALID_ASPECT_RATIO;
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Cannot post media without a valid output aspect ratio. aspect ratio=%s", Float.valueOf(f));
                0qQ.A07(formatStrLocaleSafe);
                throw new C16696V1z(uwO, formatStrLocaleSafe);
            }
        }
    }
}
