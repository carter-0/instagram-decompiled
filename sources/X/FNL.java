package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;

public final /* synthetic */ class FNL implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ DirectWellBeingUpsellBottomSheetData A01;
    public final /* synthetic */ 1Yk A02;

    public /* synthetic */ FNL(UserSession userSession, DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData, 1Yk r3) {
        this.A02 = r3;
        this.A01 = directWellBeingUpsellBottomSheetData;
        this.A00 = userSession;
    }

    public final void onClick(View view) {
        1Yk r1 = this.A02;
        DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = this.A01;
        UserSession userSession = this.A00;
        if (directWellBeingUpsellBottomSheetData.A09) {
            r1.A00.A0L((C332277Ui) null);
            Integer num = AnonymousClass05K.A0C;
            Integer num2 = AnonymousClass05K.A01;
            0qQ.A0B(userSession, 0);
            C49762F5o.A00(userSession, num, num2, (Integer) null);
        }
    }
}
