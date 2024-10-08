package X;

import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.497  reason: invalid class name */
public final class AnonymousClass497 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.3ui} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.3ui} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.3ui} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.3ui} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C255783ui A00(X.AnonymousClass3WT r4, java.util.List r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L_0x001b
            java.util.Iterator r2 = r5.iterator()
        L_0x0007:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3ui r0 = (X.C255783ui) r0
            X.3WT r0 = r0.A11
            if (r0 != r4) goto L_0x0007
            r3 = r1
        L_0x0019:
            X.3ui r3 = (X.C255783ui) r3
        L_0x001b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass497.A00(X.3WT, java.util.List):X.3ui");
    }

    public static final List A01(AnonymousClass3WT r4, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((C255783ui) next).A11 == r4) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final MusicOverlayStickerModel A02(List list) {
        C255783ui A00 = A00(AnonymousClass3WT.MUSIC_OVERLAY, list);
        if (A00 != null) {
            return A00.A0u;
        }
        return null;
    }
}
