package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductItemWithAR;

public final class OLE {
    public final Context A00;
    public final SparseArray A01;
    public final ONT A02;
    public final C70753OJz A03;

    public /* synthetic */ OLE(Context context, UserSession userSession) {
        C70753OJz oJz = new C70753OJz(userSession);
        ONT ont = new ONT(userSession);
        this.A00 = context;
        this.A03 = oJz;
        this.A02 = ont;
        this.A01 = C353968Kc.A00(userSession);
    }

    public final AnonymousClass87G A00(Integer num) {
        if (num == null) {
            AnonymousClass87G r0 = AnonymousClass87G.A0T;
            0qQ.A08(r0);
            return r0;
        }
        SparseArray sparseArray = this.A01;
        int intValue = num.intValue();
        return new AnonymousClass87G(new AnonymousClass8YE(this.A00.getDrawable(((C353978Kd) sparseArray.get(intValue)).A01), (CameraAREffect) null, AnonymousClass87I.FILTER, (ImageUrl) null, (ProductItemWithAR) null, (AnonymousClass8YF) null, ((C353978Kd) sparseArray.get(intValue)).A04, num.toString()));
    }
}
