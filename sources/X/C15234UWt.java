package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.UWt  reason: case insensitive filesystem */
public final class C15234UWt extends C46329Dbx {
    public C229122ms A00;
    public String A01;
    public final String A02;

    public final void A05() {
        String str = this.A01;
        if (str != null) {
            A0J(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        }
        A0J("tab_identifier", this.A02);
    }

    public final void A0T() {
        C229122ms r0 = this.A00;
        if (r0 == null || !r0.isLoading()) {
            C229122ms r02 = this.A00;
            if (r02 == null || !r02.CT5()) {
                this.A00.A05();
            } else {
                this.A00.A01();
            }
        } else {
            this.A00.A04();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15234UWt(UserSession userSession, String str) {
        super(userSession, "profile_media_tab", 31798595);
        AnonymousClass7TG.A1O(userSession, str);
        this.A02 = str;
    }
}
