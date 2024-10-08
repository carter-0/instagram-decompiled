package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectVisualMessageTarget;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.NtO  reason: case insensitive filesystem */
public abstract class C69860NtO {
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.LMK] */
    public static LMK parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            ? obj = new Object();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                HashSet hashSet = null;
                if ("direct_share_targets".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        hashSet = AnonymousClass7TE.A1F();
                        while (r8.A1J() != 16L.A08) {
                            DirectShareTarget parseFromJson = C330897Or.parseFromJson(r8);
                            if (parseFromJson != null) {
                                hashSet.add(parseFromJson);
                            }
                        }
                    }
                    obj.A00 = hashSet;
                } else if ("targets".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        hashSet = AnonymousClass7TE.A1F();
                        while (r8.A1J() != 16L.A08) {
                            DirectVisualMessageTarget parseFromJson2 = O17.parseFromJson(r8);
                            if (parseFromJson2 != null) {
                                hashSet.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A01 = hashSet;
                }
                r8.A0z();
            }
            Set<DirectVisualMessageTarget> set = obj.A01;
            if (set == null) {
                return obj;
            }
            obj.A00 = AnonymousClass7TE.A1F();
            0qQ.A0A(set);
            for (DirectVisualMessageTarget directVisualMessageTarget : set) {
                Set set2 = obj.A00;
                if (set2 != null) {
                    List list = directVisualMessageTarget.A02;
                    set2.add(new DirectShareTarget(C66662MaV.A00(directVisualMessageTarget.A00, list), directVisualMessageTarget.A01, list, directVisualMessageTarget.A03));
                }
            }
            obj.A01 = null;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
