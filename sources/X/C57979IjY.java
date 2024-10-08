package X;

import android.app.Activity;
import android.content.Context;
import androidx.cardview.widget.CardView;
import com.instagram.model.reels.Reel;

/* renamed from: X.IjY  reason: case insensitive filesystem */
public final class C57979IjY implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CardView A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ C230242pG A03;
    public final /* synthetic */ AnonymousClass3N9 A04;
    public final /* synthetic */ boolean A05;

    public C57979IjY(Context context, CardView cardView, Reel reel, C230242pG r4, AnonymousClass3N9 r5, boolean z) {
        this.A00 = context;
        this.A05 = z;
        this.A03 = r4;
        this.A02 = reel;
        this.A01 = cardView;
        this.A04 = r5;
    }

    public final void run() {
        Activity activity;
        Context context = this.A00;
        if ((context instanceof Activity) && (activity = (Activity) context) != null && !activity.isFinishing()) {
            if (this.A05) {
                C230242pG r1 = this.A03;
                if (r1 != null) {
                    String id = this.A02.getId();
                    0qQ.A07(id);
                    r1.CLl(id);
                    return;
                }
                return;
            }
            this.A01.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).withEndAction(new C57741Ifi(this.A04)).setDuration(250).start();
        }
    }
}
