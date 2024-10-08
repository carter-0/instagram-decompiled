package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mj5  reason: case insensitive filesystem */
public final class C67147Mj5 extends C252233om {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C67147Mj5(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        if (i == 14167 && i2 == -1 && intent != null && (extras = intent.getExtras()) != null) {
            boolean z = extras.getBoolean("is_icebreaker_added");
            UserSession userSession = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            int i3 = 2131959279;
            if (z) {
                i3 = 2131959278;
            }
            0qQ.A0B(fragmentActivity, 1);
            C72729PHj pHj = new C72729PHj(1, fragmentActivity, userSession);
            C310336ap A0a = DbS.A0a();
            DbS.A19(fragmentActivity, A0a, i3);
            DbW.A0q(fragmentActivity, A0a, 2131959280);
            A0a.A06();
            A0a.A0A(pHj);
            A0a.A0L = true;
            DbY.A1N(A0a);
        }
    }
}
