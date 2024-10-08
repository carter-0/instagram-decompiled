package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.android.R;

public final class FM2 implements View.OnClickListener {
    public final /* synthetic */ C352098Br A00;
    public final /* synthetic */ Runnable A01;

    public FM2(C352098Br r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1187460392);
        C352098Br r0 = this.A00;
        Runnable runnable = this.A01;
        Activity activity = r0.A00;
        C358248ab A0X = DbS.A0X(activity);
        A0X.A05 = activity.getResources().getQuantityString(R.plurals.story_drafts_confirmation_title, 1);
        A0X.A0K(C50023FJi.A00(runnable, 28), 2131974404);
        A0X.A0O((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, 2131954722);
        A0X.A0s(true);
        DbT.A1V(A0X);
        AnonymousClass0fD.A0C(271663559, A05);
    }
}
