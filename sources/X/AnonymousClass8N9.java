package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8N9  reason: invalid class name */
public final class AnonymousClass8N9 implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass07i A00;
    public final /* synthetic */ AnonymousClass8ME A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass8N9(AnonymousClass07i r1, AnonymousClass8ME r2, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = z;
        this.A02 = z2;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        String str;
        AnonymousClass8ME r12 = this.A01;
        AnonymousClass4DH r5 = r12.A0l;
        FragmentActivity requireActivity = r5.requireActivity();
        View view = r12.A0h;
        AnonymousClass3E6 r7 = r12.A0s;
        UserSession userSession = r12.A0r;
        AnonymousClass07i r14 = this.A00;
        C279284yO r1 = r12.A05;
        Context requireContext = r5.requireContext();
        if (r1 instanceof C363138jC) {
            str = "user_tagging_page";
        } else {
            str = "story_user_tag_page";
        }
        C337257fy A012 = AnonymousClass8C6.A01(requireContext, r14, userSession, str, false, false);
        AnonymousClass80U r11 = r12.A1B;
        Class<C358358am> cls = C358358am.class;
        C354538Mk r8 = r12.A0z;
        boolean z = this.A03;
        boolean z2 = this.A02;
        return new C39963ALf(view, requireActivity, r5, userSession, r7, r8, r12.A10, r12.A13, r11, r12, (C358358am) userSession.A01(cls, new C66297MMg(userSession, 43)), A012, z, z2);
    }
}
