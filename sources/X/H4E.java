package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.Arrays;
import java.util.List;

public final class H4E extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass323 A02;

    public H4E(1Xj r1, AnonymousClass323 r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1280411731);
        int A032 = AnonymousClass0fD.A03(-1986998978);
        UserSession userSession = this.A02.A02;
        for (SavedCollection A07 : C55124HcX.A00(userSession).A02(Arrays.asList(new C54665HMw[]{C54665HMw.PRODUCT_AUTO_COLLECTION}), (List) null)) {
            I7Q.A07(userSession, this.A01, A07, AnonymousClass05K.A01, this.A00);
        }
        AnonymousClass0fD.A0A(383444636, A032);
        AnonymousClass0fD.A0A(-1081764805, A03);
    }
}
