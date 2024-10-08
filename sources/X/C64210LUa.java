package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.LUa  reason: case insensitive filesystem */
public final class C64210LUa implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C250973mM A03;
    public final /* synthetic */ C309426Yf A04;
    public final /* synthetic */ AnonymousClass6Z5 A05;
    public final /* synthetic */ String A06;

    public C64210LUa(Context context, AnonymousClass4DH r2, C255773uh r3, C250973mM r4, C309426Yf r5, AnonymousClass6Z5 r6, String str) {
        this.A01 = r2;
        this.A05 = r6;
        this.A06 = str;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C47656EBq eBq = new C47656EBq(2, this.A00, this.A02);
        Fragment fragment = this.A01;
        C228602lw A0I = JTU.A0I(fragment.requireContext(), fragment);
        AnonymousClass6Z5 r4 = this.A05;
        UserSession userSession = r4.A09;
        if (userSession == null) {
            str = "userSession";
        } else {
            String str2 = this.A06;
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("media/request_story_mention/");
            DbX.A1M(A0a, "media_id", str2);
            1OC A0U = DbT.A0U(A0a, true);
            A0U.A00 = eBq;
            A0I.schedule(A0U);
            C310016aI r1 = r4.A0L;
            if (r1 == null) {
                str = "reelViewerLogger";
            } else {
                C250973mM r2 = this.A03;
                C309426Yf r0 = this.A04;
                r1.A0Q(r2, "tap", AnonymousClass000.A00(3589), r0.A0B, r0.A0A);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
