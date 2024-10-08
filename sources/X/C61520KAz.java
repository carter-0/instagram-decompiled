package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.KAz  reason: case insensitive filesystem */
public final class C61520KAz extends C252233om {
    public Activity A00;
    public Context A01;
    public ViewGroup A02;
    public TextView A03;
    public TextView A04;
    public AnonymousClass4D6 A05;
    public IgSimpleImageView A06;
    public IgdsSwitch A07;
    public C63648L1k A08;
    public String A09;
    public boolean A0A;
    public final WGU A0B;
    public final 1P0 A0C = new C61500KAf(this, 1);
    public final UserSession A0D;
    public final String A0E = "videox_sharesheet";

    public final void onDestroy() {
        this.A01 = null;
        this.A00 = null;
        this.A09 = null;
        this.A08 = null;
        this.A05 = null;
    }

    public final void onDestroyView() {
        this.A02 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A07 = null;
    }

    public C61520KAz(Activity activity, Context context, UserSession userSession, AnonymousClass4D6 r7, C63648L1k l1k, String str) {
        0qQ.A0B(userSession, 1);
        this.A0D = userSession;
        this.A01 = context;
        this.A00 = activity;
        this.A05 = r7;
        this.A09 = str;
        this.A08 = l1k;
        WGU A002 = WGU.A00(userSession);
        0qQ.A07(A002);
        this.A0B = A002;
    }

    public final boolean A00() {
        IgdsSwitch igdsSwitch = this.A07;
        if (igdsSwitch == null || !igdsSwitch.isChecked()) {
            return false;
        }
        return true;
    }
}
