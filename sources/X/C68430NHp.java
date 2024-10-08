package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.NHp  reason: case insensitive filesystem */
public final class C68430NHp extends C272124k8 {
    public final /* synthetic */ P34 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68430NHp(UserSession userSession, P34 p34) {
        super(userSession);
        this.A00 = p34;
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        ImageUrl imageUrl;
        int A03 = AnonymousClass0fD.A03(-2114746246);
        NGy nGy = (NGy) obj;
        int A032 = AnonymousClass0fD.A03(683553759);
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(userSession2, nGy);
        HashMap A1E = AnonymousClass7TE.A1E();
        P34 p34 = this.A00;
        Iterator it = p34.A02.iterator();
        while (it.hasNext()) {
            PendingRecipient A0k = C66580MXl.A0k(it);
            A1E.put(A0k.getId(), A0k);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A0o = DbY.A0o(nGy.A00);
        while (A0o.hasNext()) {
            N46 n46 = (N46) A0o.next();
            long j = n46.A00;
            String str = n46.A02;
            C272074k3 r12 = (C272074k3) n46.A01;
            User A0j = DbV.A0j(userSession2, str);
            String str2 = null;
            if (A0j != null) {
                str2 = A0j.getUsername();
                imageUrl = A0j.Bh3();
            } else {
                PendingRecipient pendingRecipient = (PendingRecipient) A1E.get(str);
                if (pendingRecipient != null) {
                    str2 = pendingRecipient.A0C;
                    imageUrl = pendingRecipient.A03;
                } else {
                    imageUrl = null;
                }
            }
            A1C.add(new OF4(p34.A01, imageUrl, r12, str2, j));
        }
        DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = p34.A00;
        if (directVisualMessageActionLogPriorityFragment != null) {
            directVisualMessageActionLogPriorityFragment.A00(A1C);
            AnonymousClass0fD.A0A(-1694484912, A032);
            AnonymousClass0fD.A0A(-1466986236, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(1501929736, A032);
        throw A0y;
    }

    public final void A02(UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(925857910);
        DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = this.A00.A00;
        if (directVisualMessageActionLogPriorityFragment != null) {
            SpinnerImageView spinnerImageView = directVisualMessageActionLogPriorityFragment.spinner;
            if (spinnerImageView != null) {
                DbS.A1T(spinnerImageView);
                AnonymousClass0fD.A0A(-145596468, A03);
                return;
            }
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1496553912, A03);
        throw A0y;
    }

    public final void A05(C268654dm r5, UserSession userSession) {
        int A03 = AnonymousClass0fD.A03(545225825);
        DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = this.A00.A00;
        if (directVisualMessageActionLogPriorityFragment != null) {
            SpinnerImageView spinnerImageView = directVisualMessageActionLogPriorityFragment.spinner;
            if (spinnerImageView != null) {
                spinnerImageView.setLoadingStatus(C255943uy.FAILED);
                SpinnerImageView spinnerImageView2 = directVisualMessageActionLogPriorityFragment.spinner;
                if (spinnerImageView2 != null) {
                    AnonymousClass0fU.A00((View.OnClickListener) directVisualMessageActionLogPriorityFragment.A03.getValue(), spinnerImageView2);
                    AnonymousClass0fD.A0A(-1168485525, A03);
                    return;
                }
            }
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(687436490, A03);
        throw A0y;
    }
}
