package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.TrackSnippet;

public final class AN4 implements View.OnClickListener {
    public final /* synthetic */ C357918a4 A00;

    public AN4(C357918a4 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(695325484);
        C357918a4 r3 = this.A00;
        C3506785t r0 = r3.A0b;
        if ((r0 != null && r0.isPlaying()) || r3.A0l) {
            r3.A0l = false;
            C3506785t r02 = r3.A0b;
            if (r02 != null) {
                r02.pause();
            }
        } else if (r3.A10.A00 != null) {
            r3.A0l = true;
        } else {
            UserSession userSession = r3.A0v;
            29H r2 = 27p.A01(userSession).A03;
            29E r6 = r2.A0E;
            long A03 = r6.A03(17645025, r2.A0D);
            r2.A04 = A03;
            r6.A09(A03, "use_case", "music_editor_play_icon");
            TrackSnippet trackSnippet = r3.A0Q;
            if (trackSnippet != null) {
                C357918a4.A04(trackSnippet, r3);
            } else {
                29H r22 = 27p.A01(userSession).A03;
                r22.A04 = r22.A0E.A07("No music to play", "", 17645025, r22.A04);
            }
        }
        C357918a4.A05(r3);
        AnonymousClass0fD.A0C(-1336909982, A05);
    }
}
