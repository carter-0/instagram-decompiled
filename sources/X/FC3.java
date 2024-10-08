package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class FC3 {
    public static final void A00(View view, C314466iJ r3) {
        DbX.A1D(view, R.id.bottom_divider, 0);
        view.setVisibility(8);
        r3.DUr();
    }

    public static final void A01(View view, C254403sQ r7, String str) {
        String A0h;
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.title);
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.message);
        Context context = view.getContext();
        0qQ.A0A(context);
        C254403sQ r2 = C254403sQ.MESSAGE_SEND_FAILED;
        if (r7 == r2) {
            A0h = context.getString(2131959791);
        } else {
            A0h = DbW.A0h(context, str, 2131959789);
        }
        0qQ.A0A(A0h);
        int i = 2131959788;
        if (r7 == r2) {
            i = 2131959790;
        }
        String A0h2 = DbW.A0h(context, str, i);
        0qQ.A0A(A0h2);
        A0d.setText(A0h);
        A0d.setContentDescription(A0h);
        A0d2.setText(A0h2);
        A0d2.setContentDescription(A0h2);
    }

    public static final void A02(UserSession userSession, 2Er r7) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(AnonymousClass000.A00(1130), String.valueOf(r7.Aie()));
        String C6C = r7.C6C();
        List BRZ = r7.BRZ();
        ArrayList A0r = AnonymousClass7TG.A0r(BRZ);
        Iterator it = BRZ.iterator();
        while (it.hasNext()) {
            DbY.A1W(A0r, it);
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "direct_thread_banner_impression");
        if (A0e.isSampled()) {
            A0e.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C);
            A0e.AAE(C263944Ny.A00(userSession.A06), "user_igid");
            A0e.AAe(AnonymousClass000.A00(3842), A0r);
            A0e.A9H("extra_data", A1E);
            A0e.Cgf();
        }
    }
}
