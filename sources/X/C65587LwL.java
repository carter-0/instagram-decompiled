package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.LwL  reason: case insensitive filesystem */
public final class C65587LwL implements X4V {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public C65587LwL(Context context, AnonymousClass4DH r2, UserSession userSession, User user) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = user;
        this.A01 = r2;
    }

    public final void D1d(boolean z, boolean z2) {
        AnonymousClass4Hy AqD;
        String Bgt;
        Context context = this.A00;
        Activity activity = (Activity) C334957c9.A00(context, Activity.class);
        if (activity != null) {
            DbX.A10(activity, AnonymousClass37D.A00);
        }
        if (z) {
            0eE r0 = AnonymousClass0t1.A01;
            UserSession userSession = this.A02;
            DV3 Bya = DbS.A0h(userSession, r0).Bya();
            if ((Bya == null || !Bya.BAV()) && 182.A06(0Tu.A05, userSession, 36312775961609472L)) {
                User user = this.A03;
                AnonymousClass4DH r2 = this.A01;
                AnonymousClass4I0 Amx = user.A03.Amx();
                if (Amx != null && (AqD = Amx.AqD()) != null && (Bgt = AqD.Bgt()) != null) {
                    C46649DiU A04 = C46649DiU.A04("com.instagram.social_impact.fundraiser.component.nonprofit_profile_create", 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L(AnonymousClass000.A00(5138), Bgt)}));
                    FragmentActivity requireActivity = r2.requireActivity();
                    IgBloksScreenConfig A0N = DbS.A0N(userSession);
                    A0N.A0l = false;
                    A0N.A0k = false;
                    A0N.A0P = AnonymousClass05K.A01;
                    A04.A0D(requireActivity, A0N);
                    return;
                }
                return;
            }
        }
        UserSession userSession2 = this.A02;
        if (AnonymousClass7TE.A0q(userSession2).getInt("donation_sticker_profile_dialog_prompt_shown_count", 0) < 3) {
            User user2 = this.A03;
            int i = AnonymousClass7TE.A0q(userSession2).getInt("donation_sticker_profile_dialog_prompt_shown_count", 0);
            AnonymousClass4DH r7 = this.A01;
            AnonymousClass7TG.A1M(1Au.A00(userSession2).A01, "donation_sticker_profile_dialog_prompt_shown_count", i + 1);
            C358248ab A0Y = DbS.A0Y(context);
            A0Y.A09(2131969958);
            DbY.A0w(context, A0Y, user2.getFullName(), 2131969956);
            A0Y.A0I(new C18835W4z(5, context, r7, userSession2, user2), 2131969957);
            A0Y.A0G((DialogInterface.OnClickListener) null, 2131968513);
            DbT.A1V(A0Y);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession2), "ig_cg_view_create_story_profile_dialog_prompt");
            A0e.AAJ("source_name", AnonymousClass000.A00(2405));
            A0e.Cgf();
        }
    }
}
