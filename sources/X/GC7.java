package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GC7 extends C52050GCw {
    public JTB A00;
    public GDW A01;
    public final Context A02;
    public final FragmentActivity A03;
    public final AnonymousClass4DH A04;
    public final ClipsViewerConfig A05;
    public final UserSession A06;
    public final AnonymousClass4DU A07;
    public final GC8 A08;
    public final C273424mY A09;
    public final C55925Hpn A0A;
    public final GD6 A0B;
    public final AnonymousClass0eM A0C = C58674Ivj.A00(this, 16);

    public GC7(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r4, ClipsViewerConfig clipsViewerConfig, UserSession userSession, AnonymousClass4DU r7, C273424mY r8, C55925Hpn hpn, GD6 gd6) {
        0qQ.A0B(userSession, 2);
        C51973G9u.A0t(5, r7, clipsViewerConfig, hpn);
        this.A04 = r4;
        this.A06 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = context;
        this.A07 = r7;
        this.A0B = gd6;
        this.A09 = r8;
        this.A05 = clipsViewerConfig;
        this.A0A = hpn;
        this.A08 = new GC8(context, this);
    }

    public final void onDestroyView() {
        this.A01 = null;
        super.onDestroyView();
    }
}
