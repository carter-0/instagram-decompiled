package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7fd  reason: invalid class name and case insensitive filesystem */
public final class C337067fd extends AnonymousClass3NK {
    public final /* synthetic */ C337057fc A00;

    public C337067fd(C337057fc r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void DP5(View view) {
        C337127fk r1 = this.A00.A00;
        if (r1 != null && r1.A07) {
            C317486nL r5 = r1.A04;
            if (C337097fg.A00(r5)) {
                UserSession userSession = r1.A03;
                AnonymousClass0iw r2 = r1.A02;
                ? r4 = r1.A06.A08;
                new C56807IDe(r2, userSession, r4, r5, r1.A05, r4.getWidth(), false);
            }
        }
    }

    public final boolean Dqe(View view) {
        C337127fk r5 = this.A00.A00;
        if (r5 == null) {
            return false;
        }
        IgImageView igImageView = r5.A06.A08;
        if (!igImageView.A0N) {
            return true;
        }
        int dimensionPixelSize = r5.A01.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        Context context = r5.A00;
        C306386Ly r2 = new C306386Ly(context, AnonymousClass8XF.A01(context));
        C317486nL r1 = r5.A04;
        r2.A0M(r1.A02);
        r2.A0A((float) dimensionPixelSize);
        r2.A09();
        r5.A05.DBs(r2, igImageView, r1);
        return true;
    }
}
