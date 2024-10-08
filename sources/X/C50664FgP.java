package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.FgP  reason: case insensitive filesystem */
public final class C50664FgP implements C3250670x {
    public G5W A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C3250770y A04;
    public final String A05;

    public final String Aix() {
        return "ai_message";
    }

    public final String Air() {
        return AnonymousClass7TE.A16(this.A01, 2131969891);
    }

    public final C3250770y Aiv() {
        return this.A04;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        Activity activity;
        G5W g5w = this.A00;
        if (g5w != null && (activity = (Activity) 0mE.A00(this.A01, Activity.class)) != null) {
            AnonymousClass1q4.A00();
            UserSession userSession = this.A03;
            new F3E(activity, userSession).A00(this.A02, g5w, this.A05);
        }
    }

    public C50664FgP(Context context, AnonymousClass0iw r3, UserSession userSession, String str, boolean z) {
        C3250770y r0;
        this.A01 = context;
        this.A05 = str;
        this.A02 = r3;
        this.A03 = userSession;
        if (str.equals(userSession.A06) || !z) {
            r0 = C3250770y.AI_MESSAGE;
        } else {
            r0 = C3250770y.OTHER;
        }
        this.A04 = r0;
    }

    public final Integer BEK() {
        return Integer.valueOf(R.drawable.instagram_gen_ai_pano_filled_16);
    }
}
