package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;

/* renamed from: X.FNu  reason: case insensitive filesystem */
public final /* synthetic */ class C50079FNu implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectWellBeingUpsellBottomSheetData A02;
    public final /* synthetic */ 1Yk A03;

    public /* synthetic */ C50079FNu(FragmentActivity fragmentActivity, UserSession userSession, DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData, 1Yk r4) {
        this.A03 = r4;
        this.A02 = directWellBeingUpsellBottomSheetData;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void onClick(View view) {
        1Yk r4 = this.A03;
        DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        if (directWellBeingUpsellBottomSheetData.A02 == AnonymousClass05K.A00) {
            fragmentActivity.setResult(2);
            fragmentActivity.finish();
            r4.A00.A0L((C332277Ui) null);
            Integer num = AnonymousClass05K.A01;
            0qQ.A0B(userSession, 0);
            C49762F5o.A00(userSession, num, num, (Integer) null);
        }
    }
}
