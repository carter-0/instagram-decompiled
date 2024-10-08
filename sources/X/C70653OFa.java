package X;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.OFa  reason: case insensitive filesystem */
public final class C70653OFa {
    public final ViewGroup A00;
    public final C70845ONx A01;
    public final AnonymousClass0eM A02;
    public final Activity A03;

    public C70653OFa(Activity activity, UserSession userSession, 0sP r20) {
        Activity activity2 = activity;
        Activity parent = activity2.getParent();
        parent = parent == null ? activity2 : parent;
        this.A03 = parent;
        View A0A = C66581MXm.A0A(parent);
        C66580MXl.A1R(A0A);
        ViewGroup viewGroup = (ViewGroup) A0A;
        this.A00 = viewGroup;
        this.A02 = AnonymousClass1YB.A00(new C58691Iw0(7, activity2, this));
        C73919Plz plz = new C73919Plz(this, 44);
        0qQ.A0B(viewGroup, 4);
        UserSession userSession2 = userSession;
        C72192OyC A002 = C66953Mfm.A00(DbT.A05(activity2), userSession2);
        OLU olu = new OLU();
        C71111Ocu ocu = new C71111Ocu((Handler) null, (DefaultConstructorMarker) null, 1);
        OKY oky = new OKY(userSession2);
        olu.A00(new C69082NeM(new PMF(activity2, viewGroup, plz)));
        olu.A00(new C69089NeU(activity2, userSession2, ocu, new PM5(plz), r20));
        this.A01 = new C70845ONx(oky, A002.A0B, ocu, olu, A002.A06);
    }
}
