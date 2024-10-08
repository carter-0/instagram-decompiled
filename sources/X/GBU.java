package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class GBU extends GBR {
    public static int A03;
    public static C55759Hmu A04;
    public static C56132HtK A05;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static boolean A0A;
    public static final C56658I6n A0B = new Object();
    public static final ArrayList A0C = AnonymousClass7TE.A1C();
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final boolean A02() {
        return false;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        0qQ.A0B(r3, 0);
        C56658I6n.A03(this.A01, this.A02);
    }

    public static final void A00() {
        C56132HtK htK;
        C57463Ib7 ib7;
        if (A09 && (htK = A05) != null && (ib7 = htK.A02) != null) {
            C14044Tol tol = ib7.A01;
            if (tol != null) {
                tol.A0A("user_paused_video");
            }
            C57463Ib7.A01(ib7, true);
        }
    }

    public final Class modelClass() {
        return C54578HJn.class;
    }

    public GBU(Activity activity, JSx jSx, AnonymousClass0iw r3, UserSession userSession, C51987GAk gAk) {
        super(jSx, gAk);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = activity;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C54583HJs(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_viewer_suggested_creators, false), this.A02);
    }
}
