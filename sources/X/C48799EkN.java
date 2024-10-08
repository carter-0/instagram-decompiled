package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.facebook.endtoend.EndToEnd;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EkN  reason: case insensitive filesystem */
public abstract class C48799EkN {
    public static final void A00(Context context, AnonymousClass0iw r13, UserSession userSession, C62320sa r15) {
        0qQ.A0B(context, 0);
        AnonymousClass7TF.A1B(userSession, 1, r13);
        0wc A01 = AnonymousClass0kN.A01(r13, userSession);
        if (new C49325Etg(userSession).A00.getBoolean("meta_ai_voice_disclaimer_accepted", false) || EndToEnd.isRunningEndToEndTest()) {
            r15.invoke();
            return;
        }
        Drawable drawable = context.getDrawable(R.drawable.meta_ai_voice_meta_ai_voice_nux_pf_image_ig);
        FGX A02 = FGX.A02(context, true);
        A02.A05(context.getString(2131966418), context.getString(2131966417), R.drawable.instagram_star_pano_outline_24);
        A02.A05(context.getString(2131966414), context.getString(2131966413), R.drawable.instagram_audio_wave_pano_outline_24);
        A02.A05(context.getString(2131966416), context.getString(2131966415), R.drawable.instagram_microphone_off_pano_outline_24);
        List A04 = A02.A04();
        if (drawable != null) {
            Object obj = new Object();
            F3t f3t = new F3t(context);
            f3t.A06 = AnonymousClass7TE.A16(context, 2131966420);
            f3t.A08 = A04;
            String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131966292);
            String A0d2 = AnonymousClass7TF.A0d(context.getResources(), 2131966291);
            SpannableStringBuilder A0C = DbS.A0C(DbV.A0w(context.getResources(), A0d, A0d2, 2131966419));
            AnonymousClass7AV.A04(A0C, new C46694DjN(context, userSession, 2EG.A0L, AnonymousClass000.A00(3257)), A0d);
            AnonymousClass7AV.A04(A0C, new C46694DjN(context, userSession, 2EG.A0I, AnonymousClass000.A00(299)), A0d2);
            f3t.A03 = A0C;
            f3t.A03(drawable);
            f3t.A05 = AnonymousClass05K.A00;
            f3t.A02(new C50026FJl(12, obj, (Object) r15, (Object) A01), AnonymousClass7TE.A16(context, 2131966412));
            f3t.A01 = new C50030FJp(1, A01, obj);
            f3t.A09 = true;
            f3t.A01();
            C48798EkM.A00(A01, new GLV(1, 14));
            DbX.A1V(new C49325Etg(userSession).A00, "meta_ai_voice_disclaimer_accepted", true);
            C331227Qb.A01(userSession, true);
            C48801EkP.A00(userSession);
        }
    }
}
