package X;

import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;
import java.io.IOException;

/* renamed from: X.55x  reason: invalid class name and case insensitive filesystem */
public abstract class C2811255x {
    public static C2811355z parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("text_alignment".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    iGStoryTextAlignmentTypeEnum = (IGStoryTextAlignmentTypeEnum) IGStoryTextAlignmentTypeEnum.A01.get(str);
                    if (iGStoryTextAlignmentTypeEnum == null) {
                        iGStoryTextAlignmentTypeEnum = IGStoryTextAlignmentTypeEnum.UNRECOGNIZED;
                    }
                }
                r4.A0z();
            }
            return new C2811355z(iGStoryTextAlignmentTypeEnum);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
