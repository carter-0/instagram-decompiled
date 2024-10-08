package X;

import android.os.Parcelable;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PEw  reason: case insensitive filesystem */
public final class C72666PEw implements C74484Pve {
    public final int A00;
    public final Object A01;

    public C72666PEw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure() {
        if (this.A00 != 0) {
            C72176Oxl.A02((AnonymousClass67Z) this.A01, "failed to fetch DirectThreadData.");
        }
    }

    public final /* synthetic */ void onStart() {
    }

    public final void onSuccess(AnonymousClass2Ep r7) {
        if (this.A00 != 0) {
            if (r7 != null) {
                C66990MgO.A00((AnonymousClass67Z) this.A01, r7);
            }
            ((AnonymousClass67Z) this.A01).A00();
            return;
        }
        C70584OCh oCh = (C70584OCh) this.A01;
        if (r7 != null) {
            List BRZ = r7.BRZ();
            0qQ.A0A(BRZ);
            ArrayList A0r = AnonymousClass7TG.A0r(BRZ);
            Iterator it = BRZ.iterator();
            while (it.hasNext()) {
                User A0k = DbT.A0k(it);
                Parcelable.Creator creator = PendingRecipient.CREATOR;
                0qQ.A0A(A0k);
                C66581MXm.A1M(A0k, A0r);
            }
            List A0a = 00k.A0a(A0r);
            oCh.A01.invoke(new DirectShareTarget(C66662MaV.A00(oCh.A00, A0a), (String) null, A0a, true));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ void onFailureInBackground(AnonymousClass1XT r1) {
    }

    public final /* synthetic */ void onSuccessInBackground(AnonymousClass2Ep r1) {
    }
}
