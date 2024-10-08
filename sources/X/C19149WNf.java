package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.WNf  reason: case insensitive filesystem */
public final class C19149WNf implements C21047XBo {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C15343Uat A02;
    public final /* synthetic */ String A03;

    public final void CuG() {
    }

    public final void Drz(boolean z) {
    }

    public final void DuN() {
    }

    public C19149WNf(Context context, Reel reel, C15343Uat uat, String str) {
        this.A02 = uat;
        this.A03 = str;
        this.A01 = reel;
        this.A00 = context;
    }

    public final void Cvt() {
        C15343Uat uat = this.A02;
        String str = this.A03;
        AnonymousClass738.A09(new WNS(str, uat, 2), AnonymousClass7TE.A0l(uat.A0C), str);
    }

    public final void DJJ() {
        C15343Uat uat = this.A02;
        String str = this.A03;
        C15343Uat.A01(uat, str);
        Reel A0S = C13991Tnr.A0S(str, uat.A0C);
        if (A0S != null) {
            C15343Uat.A00(A0S, uat, 0, false);
        }
    }

    public final void Djz() {
        C15343Uat uat = this.A02;
        C15343Uat.A02(uat, "add_highlight_to_main_grid_tap");
        C18596Vun vun = C18596Vun.A00;
        UserSession A0l = AnonymousClass7TE.A0l(uat.A0C);
        ImmutableList of = ImmutableList.of(this.A03);
        0qQ.A07(of);
        vun.A00(of, A0l, new WZV(this.A00, this.A01, uat));
    }

    public final void DuM() {
        C15343Uat uat = this.A02;
        C15343Uat.A02(uat, "remove_highlight_to_main_grid_tap");
        C18596Vun vun = C18596Vun.A00;
        UserSession A0l = AnonymousClass7TE.A0l(uat.A0C);
        String str = this.A03;
        ImmutableList of = ImmutableList.of(str);
        0qQ.A07(of);
        vun.A01(of, A0l, new C58210IoE(this.A00, uat, this.A01, str, 15));
    }
}
