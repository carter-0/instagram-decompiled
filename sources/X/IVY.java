package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;

public final class IVY implements MVB {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public final void onTextClick(View view) {
    }

    public IVY(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A04 = obj3;
        this.A01 = i;
    }

    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                C46521DgO dgO = (C46521DgO) this.A02;
                UserSession userSession = dgO.A03;
                0qQ.A0B(userSession, 0);
                C283115Ge.A00(userSession).A00(true);
                C46521DgO.A04(dgO, (C283155Gi) this.A04, 002.A0R(((AnonymousClass9JH) this.A03).A02, "_undo"), this.A01);
                return;
            case 1:
                C46521DgO dgO2 = (C46521DgO) this.A02;
                C283155Gi r3 = (C283155Gi) this.A04;
                int i = this.A01;
                C46521DgO.A04(dgO2, r3, "delete_notification_undo_clicked", i);
                C46521DgO.A0B.removeCallbacks((Runnable) this.A03);
                dgO2.A06.CNU(r3, i);
                return;
            default:
                GCW gcw = (GCW) this.A04;
                1Xj r5 = (1Xj) this.A02;
                AnonymousClass3W1 r7 = (AnonymousClass3W1) this.A03;
                int i2 = this.A01;
                HFY hfy = new HFY(gcw, 4);
                UserSession userSession2 = gcw.A03;
                boolean A022 = I56.A02(userSession2);
                1Y8 A002 = C55115HcO.A00();
                AnonymousClass4DU r6 = gcw.A04;
                FragmentActivity fragmentActivity = gcw.A00;
                if (A022) {
                    A002.A06(fragmentActivity, userSession2, r5, r6, r7, hfy, i2, SaveApiUtil.A09(userSession2, r5));
                } else {
                    A002.A01(fragmentActivity, userSession2, r5, r6, r7, hfy, gcw.A05, (String) null, "single_tap", i2);
                }
                GE2.A03(gcw.A06.A00, false);
                return;
        }
    }

    public final void onDismiss() {
    }

    public final void onShow() {
    }
}
