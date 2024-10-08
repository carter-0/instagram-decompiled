package X;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.W4y  reason: case insensitive filesystem */
public final class C18834W4y implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass6ZF A02;
    public final /* synthetic */ C19201WPh A03;

    public C18834W4y(AnonymousClass0iw r1, UserSession userSession, AnonymousClass6ZF r3, C19201WPh wPh) {
        this.A03 = wPh;
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            W2A w2a = C19201WPh.A0Y;
            C19201WPh wPh = this.A03;
            Reel reel = wPh.A0G.A0H;
            C255773uh r11 = wPh.A0F;
            Activity activity = wPh.A04;
            Fragment fragment = wPh.A06;
            0hq r6 = wPh.A07;
            AnonymousClass0iw r7 = wPh.A09;
            w2a.A04(activity, wPh.A01, fragment, r6, r7, this.A00, this.A01, reel, r11, this.A02);
        } else if (i == 1) {
            C19201WPh wPh2 = this.A03;
            C255773uh r62 = wPh2.A0F;
            Activity activity2 = wPh2.A04;
            UserSession userSession = wPh2.A0B;
            W2A.A01(activity2, wPh2.A01, wPh2.A07, wPh2.A08, userSession, r62);
        }
        this.A03.A01 = null;
    }
}
