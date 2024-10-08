package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;
import java.util.LinkedHashMap;

/* renamed from: X.55z  reason: invalid class name and case insensitive filesystem */
public final class C2811355z extends AnonymousClass0T0 implements AnonymousClass560 {
    public final IGStoryTextAlignmentTypeEnum A00;

    public final C2811355z FFH() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2811355z) && this.A00 == ((C2811355z) obj).A00);
    }

    public final int hashCode() {
        IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum = this.A00;
        if (iGStoryTextAlignmentTypeEnum == null) {
            return 0;
        }
        return iGStoryTextAlignmentTypeEnum.hashCode();
    }

    public final IGStoryTextAlignmentTypeEnum C4r() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        String str;
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C4r() != null) {
            IGStoryTextAlignmentTypeEnum C4r = C4r();
            if (C4r != null) {
                str = C4r.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("text_alignment", str);
        }
        return new TreeUpdaterJNI("XDTStoryAdTextOptimizationInfoDict", 0Yt.A0B(linkedHashMap));
    }

    public C2811355z(IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum) {
        this.A00 = iGStoryTextAlignmentTypeEnum;
    }
}
