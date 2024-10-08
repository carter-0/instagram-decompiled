package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;

/* renamed from: X.DmL  reason: case insensitive filesystem */
public final class C46845DmL extends 2Rw {
    public final UserSession A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C73907Pli(this, 34));
    public final 0xG A03 = DbS.A0O("direct_recipients_pogs_adapter");
    public final 0sP A04;

    public final void onBindViewHolder(C249703kE r5, int i) {
        DirectShareTarget directShareTarget;
        0qQ.A0B(r5, 0);
        if ((r5 instanceof C47014Dp6) && (directShareTarget = (DirectShareTarget) 00k.A0O(this.A01, i)) != null) {
            C47014Dp6 dp6 = (C47014Dp6) r5;
            PendingRecipient pendingRecipient = (PendingRecipient) 00k.A0J(DbW.A0m(directShareTarget));
            if (pendingRecipient != null) {
                dp6.A03.A04(pendingRecipient.A03, dp6.A02);
                dp6.A01.setText(AnonymousClass50n.A03(directShareTarget, dp6.A04));
                FPE.A01(dp6.A00, 69, directShareTarget, dp6);
            }
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0D = DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.direct_recipient_pog, false);
        0sP r2 = this.A04;
        return new C47014Dp6(A0D, this.A03, (AnonymousClass170) this.A02.getValue(), r2);
    }

    public C46845DmL(0sP r4, UserSession userSession) {
        this.A00 = userSession;
        this.A04 = r4;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-304813874);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-314365021, A032);
        return size;
    }

    public final long getItemId(int i) {
        int i2;
        List A14;
        PendingRecipient pendingRecipient;
        Long A10;
        int A032 = AnonymousClass0fD.A03(1363029818);
        DirectShareTarget directShareTarget = (DirectShareTarget) 00k.A0O(this.A01, i);
        long j = 0;
        if (directShareTarget == null || (A14 = DbT.A14(directShareTarget)) == null || (pendingRecipient = (PendingRecipient) 00k.A0J(A14)) == null) {
            i2 = 1615489647;
        } else {
            String str = pendingRecipient.A0B;
            if (!(str == null || (A10 = AnonymousClass7TE.A10(str)) == null)) {
                j = A10.longValue();
            }
            i2 = -1139738791;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return j;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(-674672279, AnonymousClass0fD.A03(2071250855));
        return 1;
    }
}
