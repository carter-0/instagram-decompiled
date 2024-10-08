package X;

import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Ih8  reason: case insensitive filesystem */
public final class C57829Ih8 implements Runnable {
    public final /* synthetic */ C56911IHg A00;
    public final /* synthetic */ C55777HnC A01;

    public C57829Ih8(C56911IHg iHg, C55777HnC hnC) {
        this.A00 = iHg;
        this.A01 = hnC;
    }

    public final void run() {
        C56911IHg iHg = this.A00;
        iHg.A0J.dismiss();
        C55777HnC hnC = this.A01;
        FragmentActivity fragmentActivity = iHg.A05;
        C358248ab A0X = DbS.A0X(fragmentActivity);
        A0X.A0j(new BitmapDrawable(fragmentActivity.getResources(), hnC.A01));
        A0X.A0d(new C56718I8y(iHg, hnC, 4), AnonymousClass7TE.A16(fragmentActivity, 2131973529));
        A0X.A0G(new C56718I8y(iHg, hnC, 5), 2131972565);
        A0X.A0H((DialogInterface.OnClickListener) null, 2131968513);
        A0X.A0s(true);
        DbT.A1V(A0X);
    }
}
