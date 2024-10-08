package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.OkM  reason: case insensitive filesystem */
public final class C71421OkM implements View.OnLongClickListener {
    public final /* synthetic */ ConstrainedImageView A00;
    public final /* synthetic */ C254853tA A01;
    public final /* synthetic */ C314226hr A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C71421OkM(ConstrainedImageView constrainedImageView, C254853tA r2, C314226hr r3, boolean z, boolean z2) {
        this.A04 = z;
        this.A02 = r3;
        this.A03 = z2;
        this.A01 = r2;
        this.A00 = constrainedImageView;
    }

    public final boolean onLongClick(View view) {
        boolean z = false;
        0qQ.A0B(view, 0);
        if (this.A04) {
            C314226hr r1 = this.A02;
            C314226hr.A02(view, r1.A01, r1);
        } else if (this.A03) {
            C314226hr.A09(this.A02);
            return false;
        } else {
            String str = this.A01.A02;
            if (C336957fS.A03(str) && C337097fg.A00(C336957fS.A01(str))) {
                C314226hr r2 = this.A02;
                UserSession userSession = r2.A0F;
                z = true;
                new C56807IDe(r2.A0E, userSession, this.A00, C336957fS.A01(str), new PRI(r2, 2), r2.A0A.getResources().getDimensionPixelSize(R.dimen.abc_star_medium), true);
                1Av r4 = r2.A0N.A05;
                0s0 r3 = r4.A4f;
                AnonymousClass0YZ[] r22 = 1Av.A8a;
                if (!AnonymousClass7TG.A1a(r4, r3, r22, 304)) {
                    AnonymousClass7TF.A1J(r4, r3, r22, 304, true);
                    return true;
                }
            }
        }
        return z;
    }
}
