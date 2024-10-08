package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Hzc  reason: case insensitive filesystem */
public final class C56506Hzc {
    public final C58840Ae A00;
    public final C56087Hsa A01;

    public static final void A00(C56506Hzc hzc, String str, int i) {
        XSV xsv;
        C69503Nml nml;
        1Ln A0J = 1Ln.A0J(hzc.A00);
        if (DbT.A1Y(A0J)) {
            A0J.A0Z(39);
            A0J.A0X(i);
            C56087Hsa hsa = hzc.A01;
            if (hsa.A01.intValue() != 0) {
                xsv = XSV.A05;
            } else {
                xsv = XSV.A06;
            }
            A0J.A0M(xsv, "thread_type");
            if (hsa.A00.intValue() != 0) {
                nml = C69503Nml.A06;
            } else {
                nml = C69503Nml.A05;
            }
            A0J.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (str != null) {
                A0J.A0R("prompt_id", str);
            }
            A0J.Cgf();
        }
    }

    public C56506Hzc(FoaUserSession foaUserSession, C56087Hsa hsa) {
        AnonymousClass7TG.A1O(foaUserSession, hsa);
        this.A01 = hsa;
        this.A00 = AnonymousClass0kN.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }
}
