package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.Collection;
import java.util.List;

/* renamed from: X.GEj  reason: case insensitive filesystem */
public final class C52089GEj implements C233782wS {
    public final Context A00;
    public final UserSession A01;
    public final String A02;

    public final void D1r() {
    }

    public final void Dwr(Collection collection, int i) {
    }

    public C52089GEj(UserSession userSession, Context context, String str) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void D6A(Object obj, List list, int i) {
        C257643xj r0;
        IgShowreelComposition Bw9;
        C267324bN A0Y = C51972G9s.A0Y(obj);
        C295365o2 r1 = A0Y.A01;
        if (GDZ.A01(r1) && A0Y.A06().A08()) {
            UserSession userSession = this.A01;
            Context context = this.A00;
            AnonymousClass6UO r7 = AnonymousClass6UO.REELS_CAROUSEL_TO_VIDEO_FORMAT;
            C257643xj r12 = A0Y.A06().A06;
            if (r12 == null) {
                r12 = new C257633xi((IgShowreelComposition) null, (IgShowreelNativeAnimation) null);
            }
            IgShowreelNativeAnimationIntf BwB = r12.BwB();
            if (BwB != null) {
                0nY.A00().ATE(new H8L(context, userSession, new AnonymousClass6Q6(C51966G9m.A1B(A0Y), A0Y.ByO(userSession)), BwB, r7));
                return;
            }
            throw AnonymousClass7TE.A0z(AnonymousClass000.A00(1239));
        } else if (GDZ.A01(r1) && C51968G9o.A1V(A0Y) && (r0 = A0Y.A06().A06) != null && (Bw9 = r0.Bw9()) != null) {
            AnonymousClass6OH.A00(this.A01).A01(Bw9.AqT(), this.A02, Bw9.Acn());
        }
    }
}
