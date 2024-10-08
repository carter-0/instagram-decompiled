package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.MdM  reason: case insensitive filesystem */
public final class C66828MdM implements C328007Db, C328017Dc {
    public C66859Mds A00;
    public C328087Dj A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final AnonymousClass3NM A06;
    public final CircularImageView A07;
    public final IgdsButton A08;
    public final AnonymousClass7VY A09;
    public final AnonymousClass7VZ A0A;
    public final C333107Xr A0B;

    public final void A00(C66859Mds mds) {
        int intValue;
        if (!this.A0B.CPk()) {
            C331537Rj r4 = C331537Rj.DIRECT_THREAD_XMA;
            Integer num = mds.A04;
            if (num != null && (intValue = num.intValue()) != -1) {
                if (intValue == 0) {
                    this.A09.CNJ(mds.A02, r4, false, mds.A0A);
                } else if (intValue == 1) {
                    this.A09.CNJ(mds.A02, r4, true, mds.A0A);
                } else if (intValue == 2) {
                    this.A0A.DMg(mds.A06, true);
                } else if (intValue == 3) {
                    this.A0A.DMg(mds.A06, false);
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
        }
    }

    public final View BJd() {
        return this.A02;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public C66828MdM(View view, AnonymousClass7VY r5, AnonymousClass7VZ r6, C333107Xr r7) {
        C51972G9s.A1B(view, r7);
        this.A02 = view;
        this.A09 = r5;
        this.A0A = r6;
        this.A0B = r7;
        this.A07 = DbX.A0a(view, R.id.call_state_icon);
        this.A05 = C66582MXn.A0F(view);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.subtitle);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.text_button);
        this.A08 = JTR.A0n(view, R.id.igds_button);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A02 = 0.95f;
        A0m.A04 = new NQy(this, 1);
        this.A06 = A0m.A00();
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
