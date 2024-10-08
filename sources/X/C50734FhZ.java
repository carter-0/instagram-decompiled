package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.FhZ  reason: case insensitive filesystem */
public final class C50734FhZ implements AnonymousClass2qY {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final void DLW(Context context, AnonymousClass4UE r7, 2bv r8, String str) {
        int A022 = DbW.A02(1, r7, context);
        if (!DbT.A0F(this.A00).A0G) {
            AnonymousClass2bO.A00();
            UserSession userSession = this.A01;
            QuickPromotionSlot valueOf = QuickPromotionSlot.valueOf(DbY.A0k(this.A02));
            0qQ.A0B(userSession, 1);
            0qQ.A0B(valueOf, A022);
            F7D.A01(context, userSession, r7, valueOf, (Integer) null);
        }
    }

    public C50734FhZ(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }
}
