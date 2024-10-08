package X;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class DFB implements 2Kw {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DFB(C70834ONg oNg, C62320sa r2, 0sP r3, int i) {
        this.A00 = i;
        this.A03 = oNg;
        if (1 - i != 0) {
            this.A01 = r3;
            this.A02 = r2;
        } else {
            this.A02 = r2;
            this.A01 = r3;
        }
    }

    public final void invoke(Throwable th) {
        Handler handler;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("GraphQL error for event ");
                Object obj = this.A02;
                0wb.A06("attribution_sdk:GraphQLAttributionEventsClient", AnonymousClass7TF.A0i(obj, sb), th);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GraphQL error for event ");
                ((C46214DQs) this.A01).DEd(AnonymousClass7TF.A0i(obj, sb2), th);
                return;
            case 1:
                C70834ONg oNg = (C70834ONg) this.A03;
                oNg.A00.A03(false);
                handler = AnonymousClass7TF.A0D();
                runnable = new C45995DHz(oNg, (C62320sa) this.A02, (0sP) this.A01);
                break;
            case 2:
                C70834ONg oNg2 = (C70834ONg) this.A03;
                oNg2.A00.A03(false);
                handler = AnonymousClass7TF.A0D();
                runnable = new C45994DHy(oNg2, (C62320sa) this.A02, (0sP) this.A01);
                break;
            default:
                I3C.A02((FragmentActivity) this.A01, (UserSession) this.A02, (String) ((0rm) this.A03).A00);
                return;
        }
        handler.post(runnable);
    }

    public DFB(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
