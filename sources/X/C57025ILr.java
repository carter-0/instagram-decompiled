package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.ILr  reason: case insensitive filesystem */
public final class C57025ILr implements C74439Puu {
    public final /* synthetic */ C53042Gha A00;

    public final void Dgi(Activity activity) {
        C53042Gha gha = this.A00;
        C55554Hja hja = gha.A01;
        if (hja != null) {
            IO9 io9 = hja.A00;
            C252063oV r0 = io9.A0F;
            if (r0 != null) {
                ((IgdsButton) r0.getView()).setText(2131974160);
                C252063oV r02 = io9.A0F;
                if (r02 != null) {
                    r02.getView().setOnClickListener((View.OnClickListener) null);
                    C252063oV r03 = io9.A0F;
                    if (r03 != null) {
                        r03.getView().setClickable(false);
                    }
                }
            }
            0qQ.A0F("spotifyButtonByPlaybackStub");
            throw AnonymousClass00P.createAndThrow();
        }
        C53042Gha.A00(activity, gha, AnonymousClass05K.A00);
    }

    public final void DwO(Activity activity) {
        C53042Gha gha = this.A00;
        Context applicationContext = activity.getApplicationContext();
        C54093GzO gzO = new C54093GzO();
        C331127Pr A0W = DbS.A0W(gha.A03);
        A0W.A0g = applicationContext.getResources().getString(2131974155);
        A0W.A1J = true;
        A0W.A0K = new ID2(2, (Object) activity, (Object) gha);
        A0W.A0h = applicationContext.getResources().getString(2131954722);
        C331157Pu r3 = gha.A00;
        if (r3 != null) {
            DbS.A1S(A0W, false);
            A0W.A1G = true;
            A0W.A0L = new C56800ICx(gha, 8);
            A0W.A1N = true;
            r3.A0H(gzO, A0W, true, true, false, true);
            return;
        }
        A0W.A0w = true;
        DbU.A0y(activity, gzO, A0W);
    }

    public C57025ILr(C53042Gha gha) {
        this.A00 = gha;
    }

    public final void Dgh(Activity activity) {
        C53042Gha.A00(activity, this.A00, AnonymousClass05K.A01);
    }
}
