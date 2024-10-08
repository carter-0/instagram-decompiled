package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.AKb  reason: case insensitive filesystem */
public final class C39935AKb implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;

    public C39935AKb(Context context, UserSession userSession, 1Xj r3) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        1Xj r5 = this.A02;
        AnonymousClass6ST r6 = new AnonymousClass6ST(context, true);
        Activity activity = (Activity) C334957c9.A00(context, Activity.class);
        if (activity != null) {
            r6.setOwnerActivity(activity);
        }
        String A16 = AnonymousClass7TE.A16(context, 2131964909);
        Class<CDM> cls = CDM.class;
        Class<C45617CzT> cls2 = C45617CzT.class;
        int i2 = 2131964910;
        if (ProductType.CLIPS == r5.A1v()) {
            i2 = 2131964911;
        }
        AnonymousClass3YV.A04(userSession, r5, r6, cls, cls2, "remove_coauthor_attribution/", A16, new C377729My(userSession, r6, r5, AnonymousClass7TE.A16(context, i2), 3));
    }
}
