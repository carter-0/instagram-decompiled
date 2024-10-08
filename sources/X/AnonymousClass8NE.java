package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;

/* renamed from: X.8NE  reason: invalid class name */
public final class AnonymousClass8NE implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass07i A00;
    public final /* synthetic */ AnonymousClass8ME A01;

    public AnonymousClass8NE(AnonymousClass07i r1, AnonymousClass8ME r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        AnonymousClass8ME r7 = this.A01;
        View view = r7.A0h;
        UserSession userSession = r7.A0r;
        Fragment fragment = r7.A0l;
        AnonymousClass3E6 r5 = r7.A0s;
        AnonymousClass80U r6 = r7.A1B;
        AnonymousClass07i r9 = this.A00;
        C279284yO r0 = r7.A05;
        Context requireContext = fragment.requireContext();
        if (r0 instanceof C363138jC) {
            str = "user_tagging_page";
        } else {
            str = "story_user_tag_page";
        }
        return new C39964ALg(view, AnonymousClass07i.A00(fragment), fragment, userSession, r5, r6, r7, AnonymousClass8C6.A01(requireContext, r9, userSession, str, false, true), ((NineSixteenLayoutConfigImpl) r7.A10).A0K.getWidth());
    }
}
