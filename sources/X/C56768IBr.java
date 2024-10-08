package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

/* renamed from: X.IBr  reason: case insensitive filesystem */
public final class C56768IBr implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass9IZ A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public C56768IBr(Context context, AnonymousClass9IZ r2, UserSession userSession, User user) {
        this.A00 = context;
        this.A03 = user;
        this.A01 = r2;
        this.A02 = userSession;
    }

    public final void onClick(View view) {
        ProductType productType;
        int A05 = AnonymousClass0fD.A05(-1757462867);
        Context context = this.A00;
        User user = this.A03;
        String username = user.getUsername();
        if (this.A01.A01) {
            productType = ProductType.CLIPS;
        } else {
            productType = ProductType.FEED;
        }
        FGM.A02(context, (DialogInterface.OnDismissListener) null, productType, username);
        C272994ll.A00(this.A02).A00(Long.parseLong(user.getId()));
        AnonymousClass0fD.A0C(1366608844, A05);
    }
}
