package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

/* renamed from: X.JfT  reason: case insensitive filesystem */
public final class C60087JfT extends AnonymousClass9YH {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    public final 2YL A02(C319836rJ r10, Class cls, String str) {
        C319836rJ r3 = r10;
        AnonymousClass7TG.A1O(cls, r10);
        if (cls.isAssignableFrom(ClipsSharingDraftViewModel.class)) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            return new ClipsSharingDraftViewModel(r3, userSession, AnonymousClass72U.A00(fragmentActivity, userSession), new LO6(fragmentActivity, AnonymousClass07i.A00(fragmentActivity), userSession), this.A02, 182.A06(0Tu.A05, userSession, 36325716698084515L));
        }
        throw AnonymousClass7TE.A0w(C273654mx.A00(522));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60087JfT(FragmentActivity fragmentActivity, AnonymousClass0g9 r3, UserSession userSession, String str) {
        super((Bundle) null, r3);
        C51972G9s.A1C(userSession, str);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }
}
