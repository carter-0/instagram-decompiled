package X;

import com.instagram.api.schemas.IGAdProfileProductTabDict;
import com.instagram.api.schemas.IGAdProfileProductTabFeatureModeEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CYg  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44167CYg {
    public static Map A00(IGAdProfileProductTabDict iGAdProfileProductTabDict) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        ArrayList arrayList = null;
        if (iGAdProfileProductTabDict.B4r() != null) {
            IGAdProfileProductTabFeatureModeEnum B4r = iGAdProfileProductTabDict.B4r();
            if (B4r != null) {
                str = B4r.A00;
            } else {
                str = null;
            }
            A1H.put(AnonymousClass000.A00(1347), str);
        }
        if (iGAdProfileProductTabDict.CZn() != null) {
            A1H.put(AnonymousClass000.A00(1522), iGAdProfileProductTabDict.CZn());
        }
        if (iGAdProfileProductTabDict.BUE() != null) {
            A1H.put(AnonymousClass000.A00(323), iGAdProfileProductTabDict.BUE());
        }
        if (iGAdProfileProductTabDict.Bga() != null) {
            List Bga = iGAdProfileProductTabDict.Bga();
            if (Bga != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = Bga.iterator();
                while (it.hasNext()) {
                    C41848B3p.A1W(arrayList, it);
                }
            }
            A1H.put("products", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
