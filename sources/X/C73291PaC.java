package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PaC  reason: case insensitive filesystem */
public final class C73291PaC implements Runnable {
    public final /* synthetic */ AnonymousClass3JD A00;
    public final /* synthetic */ C68466NJe A01;
    public final /* synthetic */ List A02;

    public C73291PaC(AnonymousClass3JD r1, C68466NJe nJe, List list) {
        this.A01 = nJe;
        this.A00 = r1;
        this.A02 = list;
    }

    public final void run() {
        C250663lr A0U;
        C68466NJe nJe = this.A01;
        if (!nJe.mDetached) {
            AnonymousClass3JD r0 = this.A00;
            if (r0 == null || (A0U = C41845B3m.A0U(r0)) == null || !A0U.getCoercedBooleanField(0, "xfb_delete_thread_subscriptions(data:{\"client_mutation_id\":$client_mutation_id,\"subscription_ids\":$subscription_ids})")) {
                C68466NJe.A01(nJe);
                return;
            }
            C67797Mv1 mv1 = nJe.A00;
            if (mv1 != null) {
                ImmutableList immutableList = mv1.A00;
                List list = this.A02;
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    DbV.A1U(next, A1C, 00k.A0u(list, ((C250663lr) next).getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID)) ? 1 : 0);
                }
                if (DbT.A1b(A1C)) {
                    C67797Mv1 mv12 = nJe.A00;
                    if (mv12 != null) {
                        ImmutableList copyOf = ImmutableList.copyOf((Collection) A1C);
                        0qQ.A0B(copyOf, 0);
                        mv12.A00 = copyOf;
                        mv12.notifyDataSetChanged();
                        C68466NJe.A02(nJe, false);
                        return;
                    }
                } else {
                    DbZ.A17(nJe);
                    return;
                }
            }
            0qQ.A0F("itemAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
