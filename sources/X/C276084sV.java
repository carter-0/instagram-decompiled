package X;

import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4sV  reason: invalid class name and case insensitive filesystem */
public abstract class C276084sV {
    public static C376559Il parseFromJson(16F r12) {
        String str;
        String str2;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            RIXUCoverChainingType rIXUCoverChainingType = null;
            RIXUChainingSourceType rIXUChainingSourceType = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("chaining_type".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                    rIXUCoverChainingType = (RIXUCoverChainingType) RIXUCoverChainingType.A01.get(str2);
                    if (rIXUCoverChainingType == null) {
                        rIXUCoverChainingType = RIXUCoverChainingType.UNRECOGNIZED;
                    }
                } else if ("contextual_path".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                    rIXUChainingSourceType = (RIXUChainingSourceType) RIXUChainingSourceType.A01.get(str);
                    if (rIXUChainingSourceType == null) {
                        rIXUChainingSourceType = RIXUChainingSourceType.UNRECOGNIZED;
                    }
                } else if ("disable_android_flash_cache_read".equals(A0q)) {
                    bool = Boolean.valueOf(r12.A0d());
                } else if ("disable_ios_shared_cache".equals(A0q)) {
                    bool2 = Boolean.valueOf(r12.A0d());
                } else if ("enable_prefetch".equals(A0q)) {
                    bool3 = Boolean.valueOf(r12.A0d());
                } else if ("injected_clips".equals(A0q)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r12.A1J() != 16L.A08) {
                            C276014sL parseFromJson = C275974sH.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("prefetch_page_size".equals(A0q)) {
                    num = Integer.valueOf(r12.A1D());
                }
                r12.A0z();
            }
            if (arrayList != null || !(r12 instanceof 0c9)) {
                return new C376559Il(rIXUChainingSourceType, rIXUCoverChainingType, bool, bool2, bool3, num, (List) arrayList);
            }
            ((0c9) r12).A03.A00("injected_clips", "RIXUChainingBehaviorDefinition");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
