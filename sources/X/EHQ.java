package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import java.io.File;

public final class EHQ extends 2Cn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public EHQ(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = obj2;
        this.A03 = obj5;
        this.A01 = obj;
        this.A05 = obj4;
    }

    public final void onFail(Exception exc) {
        if (1 - this.A00 != 0) {
            EHQ.super.onFail(exc);
            return;
        }
        W2A.A02((DialogInterface.OnDismissListener) this.A04, (0hq) this.A02);
        C59689JTv.A0A((Context) this.A01, "save_error");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        CreativeConfigIntf AsO;
        if (this.A00 != 0) {
            File A0T = Dba.A0T(obj);
            W2A.A02((DialogInterface.OnDismissListener) this.A04, (0hq) this.A02);
            1Xj r1 = ((C255773uh) this.A03).A0b;
            if (r1 != null) {
                UserSession userSession = (UserSession) this.A05;
                String path = A0T.getPath();
                0qQ.A07(path);
                if (!(r1.A0C.AsO() == null || (AsO = r1.A0C.AsO()) == null)) {
                    AnonymousClass9U5 r12 = new AnonymousClass9U5(path);
                    r12.A0A = 0sr.A1N(AsO.B3W());
                    r12.A07 = AsO.Bbn();
                    r12.A0B = true;
                    AnonymousClass8VQ.A04(userSession, r12);
                }
            }
            Context context = (Context) this.A01;
            C59730JVo.A08(context, A0T);
            C59689JTv.A07(context, 2131972636);
            return;
        }
        1WP r7 = (1WP) obj;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
        if (fragmentActivity != null) {
            r7.getSmartLockBroker(fragmentActivity, new C50520Fdg(this, 4), (0lg) this.A03);
        }
    }
}
