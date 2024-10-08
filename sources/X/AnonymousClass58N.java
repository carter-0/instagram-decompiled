package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58N  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass58N {
    public static Map A01(C272054k1 r4) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (r4.ApJ() != null) {
            CommentPrompt ApJ = r4.ApJ();
            if (ApJ != null) {
                treeUpdaterJNI = ApJ.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("comment_prompt", treeUpdaterJNI);
        }
        if (r4.BdV() != null) {
            C272034jz BdV = r4.BdV();
            if (BdV != null) {
                treeUpdaterJNI2 = BdV.FHC();
            }
            linkedHashMap.put("poll", treeUpdaterJNI2);
        }
        return 0Yt.A0B(linkedHashMap);
    }

    public static C272054k1 A00(C272054k1 r8, C272054k1 r9) {
        Object r0;
        TreeUpdaterJNI treeUpdaterJNI;
        CommentPrompt ApJ = r8.ApJ();
        C272034jz BdV = r8.BdV();
        if (r9.ApJ() != null) {
            ApJ = r9.ApJ();
        }
        if (r9.BdV() != null) {
            BdV = r9.BdV();
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        new 1E9(new 1hu((UserSession) null), 6, false);
        if (r8 instanceof AnonymousClass58O) {
            TreeUpdaterJNI treeUpdaterJNI3 = TreeUpdaterJNI.$redex_init_class;
            if (ApJ != null) {
                treeUpdaterJNI = ApJ.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP r2 = new 0eP("comment_prompt", treeUpdaterJNI);
            if (BdV != null) {
                treeUpdaterJNI2 = BdV.FHC();
            }
            TreeJNI treeJNI = (TreeJNI) r8;
            r0 = new TreeUpdaterJNI(0Yt.A06(new 0eP[]{r2, new 0eP("poll", treeUpdaterJNI2)}), treeJNI).applyToTree(treeJNI);
            0qQ.A07(r0);
        } else {
            C272024jy r22 = null;
            1E9 r02 = new 1E9(new 1hu((UserSession) null), 6, false);
            if (ApJ != null) {
                treeUpdaterJNI2 = ApJ.F20();
            }
            if (BdV != null) {
                r22 = BdV.FGJ(r02);
            }
            r0 = new C272044k0(treeUpdaterJNI2, r22);
        }
        return (C272054k1) r0;
    }
}
