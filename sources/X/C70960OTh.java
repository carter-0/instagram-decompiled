package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.ui.countertextview.CounterTextView;

/* renamed from: X.OTh  reason: case insensitive filesystem */
public final class C70960OTh {
    public IgTextView A00;
    public CounterTextView A01;
    public final Context A02;
    public final 2E6 A03;
    public final View A04;
    public final UserSession A05;

    public C70960OTh(Context context, View view, UserSession userSession) {
        0qQ.A0B(view, 3);
        this.A05 = userSession;
        this.A02 = context;
        this.A04 = view;
        this.A00 = DbX.A0Z(view, R.id.pre_subtitle_text);
        View requireViewById = view.requireViewById(R.id.counter_text);
        CounterTextView counterTextView = (CounterTextView) requireViewById;
        counterTextView.setAnimationStyle(C16495Uvr.STRAIGHT_TO_TARGET);
        counterTextView.setAnimationDuration(1000);
        Context context2 = counterTextView.getContext();
        counterTextView.A03 = new int[]{context2.getColor(R.color.igds_prism_lavender_05), context2.getColor(R.color.clips_spins_attribution_edit_icon_background_color), context2.getColor(R.color.igds_prism_yellow_05)};
        0qQ.A07(requireViewById);
        this.A01 = counterTextView;
        this.A03 = (2E6) userSession.A01(2E6.class, new C41655Ay7(userSession, 15));
    }

    public static final void A00(Context context, C70960OTh oTh, String str, int i, boolean z) {
        DbT.A18(context, oTh.A00, 2131954210);
        CounterTextView counterTextView = oTh.A01;
        Resources resources = context.getResources();
        Integer valueOf = Integer.valueOf(i);
        counterTextView.A06(i, DbV.A0v(resources, C253673rC.A04(AnonymousClass7TF.A0A(context), valueOf, IgNetworkConsentStorage.MAX_ENTRIES, true, true), R.plurals.broadcast_channel_member_count_subtitle, i), z);
        oTh.A03.A00.put(str, valueOf);
    }
}
