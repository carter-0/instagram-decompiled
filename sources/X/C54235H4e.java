package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.H4e  reason: case insensitive filesystem */
public abstract class C54235H4e extends 1P0 {
    public final C267324bN A00;
    public final UserSession A01;
    public final GBE A02;
    public final Context A03;
    public final AnonymousClass6ST A04;

    public C54235H4e(Context context, C267324bN r3, UserSession userSession, GBE gbe, int i) {
        this.A03 = context;
        this.A00 = r3;
        this.A02 = gbe;
        this.A01 = userSession;
        AnonymousClass6ST A0h = DbV.A0h(context);
        this.A04 = A0h;
        DbU.A18(context, A0h, i);
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, 1915580558);
        C48769Ejs.A00(this.A03, r4, 2131975944);
        AnonymousClass0fD.A0A(615786986, A0D);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1013453822);
        this.A04.dismiss();
        AnonymousClass0fD.A0A(-1345216683, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-454957159);
        AnonymousClass0fN.A00(this.A04);
        AnonymousClass0fD.A0A(-2080387008, A032);
    }
}
