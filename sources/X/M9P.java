package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class M9P implements Runnable {
    public final /* synthetic */ C65164LoT A00;
    public final /* synthetic */ MV7 A01;
    public final /* synthetic */ FilterGroupModel A02;
    public final /* synthetic */ C62461KgB[] A03;

    public M9P(C65164LoT loT, MV7 mv7, FilterGroupModel filterGroupModel, C62461KgB[] kgBArr) {
        this.A00 = loT;
        this.A02 = filterGroupModel;
        this.A03 = kgBArr;
        this.A01 = mv7;
    }

    public final void run() {
        C65164LoT loT = this.A00;
        Context context = loT.A0A;
        UserSession userSession = loT.A0C;
        C364808m2 r7 = loT.A0I;
        C65164LoT.A00(new C64423Lbe(context, userSession, loT.A0H, this.A01, this.A02, r7, this.A03), loT);
    }
}
