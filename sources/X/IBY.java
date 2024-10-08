package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final /* synthetic */ class IBY implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C55835HoI A02;

    public /* synthetic */ IBY(Context context, 1Xj r2, C55835HoI hoI) {
        this.A02 = hoI;
        this.A00 = context;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        C55835HoI hoI = this.A02;
        Context context = this.A00;
        1Xj r4 = this.A01;
        r4.A3E().getClass();
        UserSession userSession = hoI.A03;
        String id = r4.getId();
        String moduleName = hoI.A02.getModuleName();
        0qQ.A0B(moduleName, 2);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("usertags/remove_category/");
        DbX.A1M(A0a, "media_to_untag", id);
        1OC A0T = DbT.A0T(A0a, "container_module", moduleName);
        H51.A00(A0T, hoI, r4, 11);
        1ES.A00(context, hoI.A01, A0T);
    }
}
