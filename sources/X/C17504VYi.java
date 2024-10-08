package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;
import java.util.HashSet;

/* renamed from: X.VYi  reason: case insensitive filesystem */
public final class C17504VYi {
    public final AdsProductPageFragment A00;
    public final C19226WQh A01;
    public final C17539VZs A02;
    public final HashSet A03 = new HashSet();

    public C17504VYi(Context context, AnonymousClass07i r5, UserSession userSession, AdsProductPageFragment adsProductPageFragment) {
        0qQ.A0B(userSession, 2);
        long j = C19226WQh.A04;
        C19226WQh A002 = C17088VHk.A00(userSession);
        C17539VZs vZs = new C17539VZs(context, userSession, new C228602lw(context, r5, (Integer) null));
        0qQ.A0B(A002, 1);
        this.A01 = A002;
        this.A02 = vZs;
        this.A00 = adsProductPageFragment;
    }
}
