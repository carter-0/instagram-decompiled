package X;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3wO  reason: invalid class name and case insensitive filesystem */
public abstract class C256813wO {
    public static final Set A00 = Collections.emptySet();

    public static WMB A00(28S r10, C256633w6 r11, String str) {
        Set<Object> set;
        if (r10 == null) {
            return null;
        }
        List list = ((C256773wK) r11.A02(0).A03.get(0)).A07;
        if (list.isEmpty()) {
            set = A00;
        } else {
            HashSet hashSet = new HashSet();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DrmInitData drmInitData = ((C256733wG) list.get(i)).A02.A0O;
                if (drmInitData != null) {
                    for (DrmInitData.SchemeData schemeData : drmInitData.A03) {
                        if (schemeData.A04 != null) {
                            hashSet.add(schemeData.A03);
                        }
                    }
                }
            }
            set = hashSet;
        }
        for (Object obj : set) {
            27B.A01("DrmSessionManagerHelper", "DRM scheme %s for vid=%s", new Object[]{obj.toString(), str});
        }
        if (set.isEmpty()) {
            27B.A01("DrmSessionManagerHelper", "Not a protected video for vid=%s", new Object[]{str});
            return null;
        } else if (set.contains(AnonymousClass4T7.A04)) {
            return A01(new SwH(r10, str));
        } else {
            throw new Exception();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.X30} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.X30} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.X30} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.WMB A01(X.C13460Tan r10) {
        /*
            X.2BQ r0 = X.2BQ.A1H
            boolean r2 = X.2BY.A02(r0)
            java.lang.String r1 = "L3"
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.UUID r8 = X.AnonymousClass4T7.A04
            X.X30 r3 = X.WMG.A03
            r0 = -1
            X.4Sl r5 = new X.4Sl
            r5.<init>(r0)
            r0 = 0
            int[] r9 = new int[r0]
            java.lang.String r6 = ""
            if (r2 == 0) goto L_0x002d
            X.WMD r3 = new X.WMD
            r3.<init>()
            r8.getClass()
        L_0x0026:
            X.WMB r2 = new X.WMB
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x002d:
            r8.getClass()
            r3.getClass()
            r6 = r1
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256813wO.A01(X.Tan):X.WMB");
    }
}
