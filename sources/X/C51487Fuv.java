package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.Fuv  reason: case insensitive filesystem */
public final class C51487Fuv implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4UE A01;
    public final /* synthetic */ C59844JaK A02;

    public C51487Fuv(Context context, AnonymousClass4UE r2, C59844JaK jaK) {
        this.A02 = jaK;
        this.A00 = context;
        this.A01 = r2;
    }

    public final void run() {
        0hq supportFragmentManager;
        C59844JaK jaK = this.A02;
        FragmentActivity activity = jaK.getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && !supportFragmentManager.A0G) {
            AnonymousClass2bO.A00();
            Context context = this.A00;
            UserSession A0l = AnonymousClass7TE.A0l(jaK.A06);
            QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A03;
            AnonymousClass4UE r1 = this.A01;
            AnonymousClass7TG.A1O(A0l, quickPromotionSlot);
            F7D.A01(context, A0l, r1, quickPromotionSlot, (Integer) null);
        }
    }
}
