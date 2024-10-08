package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.FlR  reason: case insensitive filesystem */
public final class C50938FlR implements G6O {
    public final void Cqa(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1N(context, userSession);
        SP0 A00 = SP0.A00(context);
        AnonymousClass7TE.A1Z(new C66160MFx(A00, (AnonymousClass4D7) null, 22), DbY.A0r(AnonymousClass12T.A00, 535));
        C46649DiU A04 = C46649DiU.A04("com.instagram.settings.about", DbY.A0m("is_managed", String.valueOf(A00.A03())));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbS.A18(context, A0N, 2131951981);
        A04.A0D(context, A0N);
    }
}
