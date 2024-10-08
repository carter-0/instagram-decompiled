package X;

import com.instagram.api.schemas.CreatorSegmentation;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Mcb  reason: case insensitive filesystem */
public abstract /* synthetic */ class C66790Mcb {
    public static Map A00(AnonymousClass16x r3) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.Ase() != null) {
            CreatorSegmentation Ase = r3.Ase();
            if (Ase != null) {
                str = Ase.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("creator_segmentation", str);
        }
        if (r3.CQk() != null) {
            linkedHashMap.put("is_creator", r3.CQk());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
