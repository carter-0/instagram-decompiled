package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.react.uimanager.UIManagerHelper;
import com.instagram.common.session.UserSession;

public final class SVL implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public SVL(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void onShow(DialogInterface dialogInterface) {
        0wc r3;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                ((C20877X2e) this.A01).APe(new W0S(UIManagerHelper.A00((Context) this.A02), ((View) this.A03).getId()));
                return;
            case 1:
                r3 = (0wc) this.A02;
                str = ((UserSession) this.A03).A06;
                str2 = ((1Xj) this.A01).getId();
                if (str2 == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            default:
                r3 = (0wc) this.A02;
                str = ((UserSession) this.A03).A06;
                str2 = ((1Xj) this.A01).getId();
                if (str2 == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
        }
        0qQ.A0B(r3, 0);
        FEM.A00(r3, str, str2, "dialog_impression");
    }
}
