package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.H3w  reason: case insensitive filesystem */
public final class C54227H3w extends 2Ru implements C231272rL {
    public final H45 A00;
    public final C229122ms A01;
    public final C231762sK A02;
    public final ArrayList A03 = AnonymousClass7TE.A1C();
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C55917Hpe A07;

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public C54227H3w(Context context, AnonymousClass0iw r4, UserSession userSession, C55917Hpe hpe, C229122ms r7) {
        AnonymousClass7TG.A1Q(userSession, r4);
        0qQ.A0B(hpe, 5);
        this.A04 = context;
        this.A06 = userSession;
        this.A05 = r4;
        this.A01 = r7;
        this.A07 = hpe;
        C231762sK r1 = new C231762sK(context);
        this.A02 = r1;
        H45 h45 = new H45(context, r4, userSession, hpe);
        this.A00 = h45;
        init(new C231642s0[]{r1, h45});
    }

    public final void updateListView() {
        notifyDataSetChangedSmart();
    }
}
