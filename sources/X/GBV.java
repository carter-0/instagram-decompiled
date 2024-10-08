package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

public final class GBV extends GBR {
    public static int A04;
    public static int A05;
    public static C230012om A06;
    public static List A07 = AnonymousClass7TE.A1C();
    public static boolean A08;
    public static final C46575DhH A09 = new Object();
    public static final HashMap A0A = AnonymousClass7TE.A1E();
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C51981GAe A03;

    public final boolean A02() {
        return false;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        0qQ.A0B(r3, 0);
        if (!A08) {
            A04 = 0;
            A06 = null;
            A07.clear();
        }
    }

    public final Class modelClass() {
        return GZ7.class;
    }

    public GBV(Activity activity, JSx jSx, AnonymousClass0iw r3, UserSession userSession, C51987GAk gAk, C51981GAe gAe) {
        super(jSx, gAk);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = activity;
        this.A03 = gAe;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46578DhK(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_viewer_suggested_users, false));
    }
}
