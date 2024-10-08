package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.McD  reason: case insensitive filesystem */
public final class C66768McD extends C392289uY {
    public final C330437Mt A00;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        View inflate = View.inflate(context, R.layout.banner_message_island, (ViewGroup) null);
        0qQ.A07(inflate);
        View findViewById = inflate.findViewById(R.id.action);
        if (findViewById != null) {
            C71401Ok0.A01(findViewById, 32, this);
        }
        return inflate;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r4, boolean z) {
        0qQ.A0B(puH, 1);
        if (this.A00.A04()) {
            puH.DoM(this);
        } else {
            puH.onFailure();
        }
    }

    public C66768McD(C330437Mt r3) {
        this.A00 = r3;
        r3.A0D.add(new C3725691k(this));
    }
}
