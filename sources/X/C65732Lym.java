package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Lym  reason: case insensitive filesystem */
public final class C65732Lym implements C315626kE {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C252063oV A03;
    public final /* synthetic */ Reel A04;
    public final /* synthetic */ C230242pG A05;

    public C65732Lym(View view, AnonymousClass0iw r2, UserSession userSession, C252063oV r4, Reel reel, C230242pG r6) {
        this.A00 = view;
        this.A04 = reel;
        this.A02 = userSession;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void Df0() {
        View view = this.A00;
        Reel reel = this.A04;
        C63408KwU.A00(view, this.A01, this.A02, reel, this.A05, false);
        this.A03.setVisibility(0);
    }
}
