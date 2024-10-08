package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.WNe  reason: case insensitive filesystem */
public final class C19148WNe implements C21047XBo {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C322936we A01;
    public final /* synthetic */ String A02;

    public final void Cvt() {
    }

    public final void DuN() {
    }

    public C19148WNe(Reel reel, C322936we r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = reel;
    }

    public final void CuG() {
        C322936we r0 = this.A01;
        28D r1 = 28D.A3z;
        AnonymousClass80E r3 = AnonymousClass80E.MY_WEEK;
        C49805F7r.A00(r0.A05, r1, r0.A0A, r3, (PendingRecipient) null, (Integer) null);
    }

    public final void DJJ() {
        C322936we r2 = this.A01;
        String str = this.A02;
        C322126vI r0 = r2.A07;
        r0.A07(str);
        if (r0.A0G.isEmpty()) {
            C322936we.A03(r2);
        }
    }

    public final void Djz() {
        C322936we r6 = this.A01;
        C322936we.A04(r6, "add_highlight_to_main_grid_tap");
        C18596Vun vun = C18596Vun.A00;
        UserSession userSession = r6.A0A;
        ImmutableList of = ImmutableList.of(this.A02);
        0qQ.A07(of);
        vun.A00(of, userSession, new WZU(1, this.A00, r6));
    }

    public final void Drz(boolean z) {
        C322936we r4 = this.A01;
        AnonymousClass7TE.A1Z(new JV6((Object) r4, (AnonymousClass4D7) null, 39, z), DbV.A0J(r4.A0C));
    }

    public final void DuM() {
        C322936we r6 = this.A01;
        C322936we.A04(r6, "remove_highlight_to_main_grid_tap");
        C18596Vun vun = C18596Vun.A00;
        UserSession userSession = r6.A0A;
        ImmutableList of = ImmutableList.of(this.A02);
        0qQ.A07(of);
        vun.A01(of, userSession, new MJ4(27, this.A00, r6));
    }
}
