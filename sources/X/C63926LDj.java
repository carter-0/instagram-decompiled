package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.LDj  reason: case insensitive filesystem */
public final class C63926LDj {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final C65147LoB A02;
    public final C60394Jkn A03;
    public final AnonymousClass3Q2 A04;

    public final void A00(RecyclerView recyclerView, AudioOverlayTrack audioOverlayTrack) {
        C60394Jkn jkn = this.A03;
        0qQ.A0B(jkn, 2);
        int i = 8;
        if (audioOverlayTrack != null) {
            if (recyclerView == null) {
                return;
            }
        } else if (recyclerView != null) {
            recyclerView.setAdapter(jkn);
            if (jkn.getItemCount() != 0) {
                i = 0;
            }
        } else {
            return;
        }
        recyclerView.setVisibility(i);
    }

    public C63926LDj(AnonymousClass4DH r3, UserSession userSession, C65147LoB loB, AnonymousClass3Q2 r6) {
        C51972G9s.A1C(r3, loB);
        this.A01 = userSession;
        this.A00 = r3;
        this.A04 = r6;
        this.A02 = loB;
        this.A03 = new C60394Jkn(JTO.A1C(this, 52), userSession);
    }
}
