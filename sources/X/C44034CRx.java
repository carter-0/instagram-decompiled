package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;
import java.util.LinkedHashMap;

/* renamed from: X.CRx  reason: case insensitive filesystem */
public final class C44034CRx extends 17P implements AnonymousClass560 {
    public final IGStoryTextAlignmentTypeEnum C4r() {
        return (IGStoryTextAlignmentTypeEnum) A0N(-1783100079, C46147DOa.A00);
    }

    public final C2811355z FFH() {
        return new C2811355z(C4r());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.560, X.CRx] */
    public final TreeUpdaterJNI FHC() {
        String str;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (C4r() != null) {
            IGStoryTextAlignmentTypeEnum C4r = C4r();
            if (C4r != null) {
                str = C4r.A00;
            } else {
                str = null;
            }
            A0t.put("text_alignment", str);
        }
        return C41846B3n.A0P(this, A0t);
    }
}
