package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Orp  reason: case insensitive filesystem */
public final class C71848Orp implements C74382Ptx {
    public final /* synthetic */ C68449NIn A00;

    public C71848Orp(C68449NIn nIn) {
        this.A00 = nIn;
    }

    public final void DCc(Activity activity) {
        UserSession A0l = AnonymousClass7TE.A0l(this.A00.A1T);
        0qQ.A0B(A0l, 1);
        C310336ap A0a = DbS.A0a();
        DbT.A1D(activity.getApplicationContext().getResources(), A0a, 2131974153);
        A0a.A0L = true;
        A0a.A0G = AnonymousClass7TF.A0d(activity.getApplicationContext().getResources(), 2131965110);
        A0a.A0A(new C72729PHj(3, activity, A0l));
        Dbb.A1Q(A0a);
    }

    public final void DoB(Activity activity) {
        0eE r1 = AnonymousClass0t1.A01;
        C68449NIn nIn = this.A00;
        AnonymousClass0eM r3 = nIn.A1T;
        r1.A01(AnonymousClass7TE.A0l(r3)).A03.Eln(true);
        0qQ.A0B(AnonymousClass7TE.A0l(r3), 1);
        C310336ap A0a = DbS.A0a();
        DbT.A1D(activity.getApplicationContext().getResources(), A0a, 2131974154);
        Dbb.A1Q(A0a);
        C68449NIn.A0Q(nIn, "notes_song_title");
    }
}
