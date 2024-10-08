package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Apa  reason: case insensitive filesystem */
public final class C41176Apa implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C387649mY A02;

    public C41176Apa(View view, UserSession userSession, C387649mY r3) {
        this.A00 = view;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final void run() {
        if (!C387649mY.A03) {
            C62880wX r3 = C61170le.A00;
            if (!AnonymousClass0xl.A00(r3).A00.getBoolean("has_used_music_sticker_style_selector", false) && AnonymousClass0xl.A00(r3).A00.getInt("music_sticker_style_selector_tooltip_impressions", 0) < 3) {
                C315476jx r4 = new C315476jx(2131967769);
                View view = this.A00;
                AnonymousClass5Gt r2 = new AnonymousClass5Gt(AnonymousClass7TE.A0S(view), this.A02.A00, r4);
                r2.A03(view);
                r2.A02();
                r2.A04 = new C389259p9(1);
                r2.A00().A07(this.A01);
            }
        }
    }
}
