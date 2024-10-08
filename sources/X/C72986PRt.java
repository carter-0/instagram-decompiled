package X;

import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.PRt  reason: case insensitive filesystem */
public final class C72986PRt implements C342997pV {
    public final /* synthetic */ C314436iG A00;

    public final void EuW(C335737dS r6) {
        0qQ.A0B(r6, 0);
        if (C335737dS.LWN_STORY_REPLY_RESPECTFUL == r6) {
            C314436iG r3 = this.A00;
            TextView A0R = AnonymousClass7TG.A0R(r3.A0Z, R.id.reel_viewer_composer_top_message);
            A0R.setText(AnonymousClass7TE.A16(AnonymousClass7TE.A0S(r3.A0X), 2131974506));
            1Yp.A04(AnonymousClass0kN.A02(r3.A0e), AnonymousClass05K.A01, false);
            A0R.setVisibility(0);
            r3.A0G = true;
        }
    }

    public C72986PRt(C314436iG r1) {
        this.A00 = r1;
    }

    public final void Cya() {
        C314436iG r1 = this.A00;
        r1.A0G = true;
        r1.A08();
    }

    public final void Cyt() {
        0nA.A0N(this.A00.A02);
    }
}
