package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

public final class WUH implements MXG {
    public static final String __redex_internal_original_name = "UpcomingEventStickerListControllerImpl";
    public UA9 A00;
    public View A01;
    public RecyclerView A02;
    public final Context A03;
    public final UserSession A04;
    public final C71662eb A05;
    public final C19740Weh A06;
    public final AnonymousClass8MS A07;
    public final String A08;
    public final Set A09 = new HashSet();

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public final /* synthetic */ void close() {
    }

    public static final void A00(WUH wuh) {
        boolean z;
        UA9 ua9;
        C19740Weh weh = wuh.A06;
        if (weh.A01.A03.A03 != AnonymousClass05K.A0C || ((ua9 = weh.A02.A00) != null && AnonymousClass7TE.A1b(ua9.A00))) {
            z = false;
        } else {
            z = true;
        }
        View view = wuh.A01;
        if (z) {
            if (view != null) {
                view.setVisibility(0);
                RecyclerView recyclerView = wuh.A02;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else if (view != null) {
            view.setVisibility(8);
            RecyclerView recyclerView2 = wuh.A02;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final Set Acf() {
        return this.A09;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final void E0h() {
        Context context;
        C71662eb r1 = this.A05;
        if (r1.A00 == null) {
            View A012 = r1.A01();
            0qQ.A07(A012);
            this.A02 = DbT.A0I(A012, R.id.upcoming_event_sticker_list);
            this.A01 = A012.requireViewById(R.id.upcoming_event_sticker_list_empty_state);
            this.A09.add(A012);
            UserSession userSession = this.A04;
            AnonymousClass8MS r0 = this.A07;
            C19740Weh weh = this.A06;
            UA9 ua9 = new UA9(userSession, weh, r0);
            this.A00 = ua9;
            RecyclerView recyclerView = this.A02;
            if (recyclerView != null) {
                recyclerView.setAdapter(ua9);
            }
            RecyclerView recyclerView2 = this.A02;
            if (recyclerView2 != null) {
                context = recyclerView2.getContext();
            } else {
                context = null;
            }
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            RecyclerView recyclerView3 = this.A02;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView4 = this.A02;
            if (recyclerView4 != null) {
                JTQ.A0y(linearLayoutManager, recyclerView4, weh, C3251771i.A0J);
            }
        }
        UA9 ua92 = this.A00;
        if (ua92 != null) {
            ua92.A00.clear();
            ua92.notifyDataSetChanged();
            this.A06.A00(true);
            A00(this);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public WUH(Context context, ViewStub viewStub, AnonymousClass07i r5, UserSession userSession, AnonymousClass8MS r7) {
        this.A03 = context;
        this.A04 = userSession;
        this.A07 = r7;
        this.A05 = new C71662eb(viewStub);
        this.A06 = new C19740Weh(AnonymousClass7TE.A0S(viewStub), r5, userSession, this);
        this.A08 = "upcoming_event_sticker_list";
    }
}
