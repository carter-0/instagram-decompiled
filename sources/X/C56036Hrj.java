package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.Hrj  reason: case insensitive filesystem */
public final class C56036Hrj {
    public C234502xy A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final MusicDataSource A04;

    public final void A00() {
        Context context = this.A02;
        UserSession userSession = this.A03;
        C234502xy A002 = C234472xv.A00(context, userSession, (AnonymousClass4DU) null, new C234462xu(context, userSession), "OverrideMusicPlayer", C234472xv.A02(userSession));
        A002.ETw(this.A04, new IW7(), (String) null, 0, -1, -1, false, false);
        A002.seekTo(this.A01);
        this.A00 = A002;
    }

    public final void A01() {
        C234502xy r0;
        C234502xy r02 = this.A00;
        if (r02 == null) {
            A00();
        } else if (r02.isPlaying() && (r0 = this.A00) != null) {
            r0.pause();
        }
        C234502xy r1 = this.A00;
        if (r1 != null) {
            r1.seekTo(this.A01);
        }
        C234502xy r03 = this.A00;
        if (r03 != null) {
            r03.E2p();
        }
    }

    public C56036Hrj(Context context, UserSession userSession, MusicDataSource musicDataSource, int i) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = musicDataSource;
        this.A01 = i;
        A00();
    }
}
