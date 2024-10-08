package X;

import java.util.Set;

/* renamed from: X.KuM  reason: case insensitive filesystem */
public abstract class C63277KuM {
    public static final AnonymousClass3T1 A00(GVG gvg, JY2 jy2, AnonymousClass2U7 r4) {
        0qQ.A0B(jy2, 1);
        AnonymousClass3T1 A09 = C242173Sx.A09(new C59100J6i(gvg, 47), r4);
        0sl stringSet = JTS.A0V(jy2).getStringSet("suggestions_media_hide_prefs_key", (Set) null);
        if (stringSet == null) {
            stringSet = 0sl.A00;
        }
        MPB mpb = new MPB(6, (Object) stringSet, (Object) DbS.A0y());
        0qQ.A0B(A09, 0);
        return new AnonymousClass3T1(mpb, A09, false);
    }
}
