package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.PVs  reason: case insensitive filesystem */
public final class C73085PVs implements Runnable {
    public final /* synthetic */ C71036OZy A00;

    public C73085PVs(C71036OZy oZy) {
        this.A00 = oZy;
    }

    public final void run() {
        C71036OZy oZy = this.A00;
        if (oZy.A05.isAdded()) {
            View view = oZy.A04;
            Context context = oZy.A01;
            Resources A0A = AnonymousClass7TF.A0A(context);
            String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131968542);
            C310336ap A0X = DbV.A0X();
            A0X.A0H = "direct_inbox_music_note_unavailable";
            A0X.A0D = A0d;
            A0X.A02 = view.getHeight() + A0A.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            A0X.A0R = true;
            DbY.A1N(A0X);
        }
    }
}
