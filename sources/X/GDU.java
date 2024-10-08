package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GDU {
    public int A00 = -1;
    public final int A01;
    public final int A02;
    public final View A03;
    public final ClipsViewerConfig A04;
    public final Activity A05;
    public final Context A06;
    public final UserSession A07;

    public GDU(Activity activity, Context context, View view, ClipsViewerConfig clipsViewerConfig, UserSession userSession) {
        this.A03 = view;
        this.A06 = context;
        this.A04 = clipsViewerConfig;
        this.A05 = activity;
        this.A07 = userSession;
        this.A01 = 2Yu.A0G(context, R.attr.bottomSheetTopCornerRadius);
        this.A02 = ((0nA.A05(context) - 0Pn.A00(activity)) - 0nA.A0A(context)) - 0nA.A07(context);
    }
}
