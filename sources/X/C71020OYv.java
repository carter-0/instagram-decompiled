package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.OYv  reason: case insensitive filesystem */
public final class C71020OYv {
    public View A00;
    public RecyclerView A01;
    public IgTextView A02;
    public C70677OFy A03;
    public String A04;
    public final Context A05;
    public final UserSession A06;
    public final C252063oV A07;
    public final OLZ A08;
    public final C329207Hz A09;
    public final C67807MvB A0A;
    public final C69319NjK A0B;
    public final String A0C;
    public final String A0D = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A0E = C73923Pm3.A00(this, 29);
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final boolean A0H;

    public C71020OYv(Context context, GiphyRequestSurface giphyRequestSurface, AnonymousClass0iw r14, UserSession userSession, AnonymousClass4D6 r16, C252063oV r17, C329207Hz r18, C69319NjK njK, DirectThreadKey directThreadKey, String str, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 1);
        String str2 = str;
        0qQ.A0B(str2, 11);
        this.A06 = userSession;
        C252063oV r2 = r17;
        this.A07 = r2;
        this.A05 = context;
        this.A09 = r18;
        this.A0C = str2;
        this.A0H = z3;
        this.A0B = njK;
        boolean z4 = z;
        boolean z5 = z2;
        this.A0G = AnonymousClass1YB.A00(new C52125GFt(this, 2, z5, z4));
        this.A0F = AnonymousClass1YB.A00(new C52125GFt(this, 1, z5, z4));
        AnonymousClass4D6 r7 = r16;
        this.A0A = new C67807MvB(context, userSession, new C70652OEz(r14, r7, this, z4), 0nA.A09(context) / DbX.A07(this.A0G));
        GiphyRequestSurface giphyRequestSurface2 = giphyRequestSurface;
        this.A08 = new OLZ(giphyRequestSurface2, r14, userSession, r7, new C70434O6l(this), directThreadKey, z4);
        r2.EeU(new C72245OzD(this, 2));
    }

    public static final void A00(C71020OYv oYv) {
        List A1J;
        C70677OFy oFy = oYv.A03;
        if (oFy == null) {
            0qQ.A0F("directGifCategoriesTabsManager");
            throw AnonymousClass00P.createAndThrow();
        } else if (oFy.A00 == 1) {
            C67542Mpc mpc = (C67542Mpc) oYv.A0E.getValue();
            synchronized (mpc) {
                A1J = C51966G9m.A1J(mpc.A01);
            }
            A01(oYv, (String) null, A1J, 2131960261);
        }
    }

    public static final void A01(C71020OYv oYv, String str, List list, int i) {
        oYv.A04 = str;
        C67807MvB mvB = oYv.A0A;
        DbW.A0z(mvB, list, mvB.A02);
        RecyclerView recyclerView = oYv.A01;
        if (recyclerView != null) {
            recyclerView.A0o(0);
        }
        View view = oYv.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        if (list.isEmpty()) {
            RecyclerView recyclerView2 = oYv.A01;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            View view2 = oYv.A00;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            IgTextView igTextView = oYv.A02;
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            IgTextView igTextView2 = oYv.A02;
            if (igTextView2 != null) {
                C66581MXm.A15(oYv.A05, igTextView2, i);
                return;
            }
            return;
        }
        IgTextView igTextView3 = oYv.A02;
        if (igTextView3 != null) {
            igTextView3.setVisibility(8);
        }
        RecyclerView recyclerView3 = oYv.A01;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(0);
        }
    }
}
