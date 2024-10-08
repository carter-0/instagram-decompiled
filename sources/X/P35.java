package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

public final class P35 implements C74450Pv5 {
    public DirectVisualMessageActionLogPriorityFragment A00;
    public MYb A01;
    public final long A02;
    public final Context A03;
    public final UserSession A04;
    public final List A05;
    public final 1a8 A06 = C66580MXl.A0O();
    public final String A07;

    public P35(Context context, UserSession userSession, String str, List list, long j) {
        DbW.A1N(userSession, 2, list);
        this.A03 = context;
        this.A04 = userSession;
        this.A07 = str;
        this.A02 = j;
        this.A05 = list;
    }

    public static final 0eP A00(P35 p35, String str, HashMap hashMap) {
        ImageUrl imageUrl;
        String str2 = null;
        if (str == null) {
            return new 0eP((Object) null, (Object) null);
        }
        User A0j = DbV.A0j(p35.A04, str);
        if (A0j != null) {
            str2 = A0j.getUsername();
            imageUrl = A0j.Bh3();
        } else {
            PendingRecipient pendingRecipient = (PendingRecipient) hashMap.get(str);
            if (pendingRecipient != null) {
                str2 = pendingRecipient.A0C;
                imageUrl = pendingRecipient.A03;
            } else {
                imageUrl = null;
            }
        }
        return AnonymousClass7TE.A1L(str2, imageUrl);
    }

    public final AnonymousClass11X Ex0() {
        DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = this.A00;
        if (directVisualMessageActionLogPriorityFragment != null) {
            SpinnerImageView spinnerImageView = directVisualMessageActionLogPriorityFragment.spinner;
            if (spinnerImageView != null) {
                DbS.A1T(spinnerImageView);
                MYb mYb = this.A01;
                if (mYb == null) {
                    mYb = MYc.A01(this.A04, "MsysVisualMessageActionLogFetcherImpl").A01;
                    this.A01 = mYb;
                }
                PU8.A00(mYb.A09.A0M(new C72017Our(Long.parseLong(this.A07), 0)), this.A06, this, 42);
                return null;
            }
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void cleanup() {
        this.A06.A01();
    }

    public final void EU7(DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        this.A00 = directVisualMessageActionLogPriorityFragment;
    }
}
