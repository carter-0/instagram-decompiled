package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class K95 extends C47567E8f {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K95(04x r1, Integer num, Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(r1, num, str, i);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        String str;
        if (this.A00 != 0) {
            View view2 = view;
            0qQ.A0B(view2, 0);
            C295095nZ r12 = (C295095nZ) this.A01;
            String A10 = DbT.A10(r12.A02);
            C60058JeZ jeZ = (C60058JeZ) this.A03;
            if (r12.A00) {
                str = r12.A04;
            } else {
                0qQ.A07(view2.getContext());
                AnonymousClass5w9 r1 = AnonymousClass5w8.A05;
                AnonymousClass5w9.A00(jeZ.A0J);
                str = null;
            }
            UserSession userSession = jeZ.A0J;
            String str2 = jeZ.A0N;
            C295105na.A02(userSession, "default_privacy_instruction_view_click", A10, str, str2, r12.A01.toString(), false, C363558jv.A00(userSession), r12.A05);
            jeZ.A05(r12, (IgdsSwitch) this.A02, str, str2, false);
            return;
        }
        UserSession userSession2 = (UserSession) this.A02;
        C295095nZ r3 = (C295095nZ) this.A01;
        boolean z = r3.A00;
        String valueOf = String.valueOf(r3.A02);
        C61942KSr kSr = (C61942KSr) this.A03;
        kSr.requireContext();
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        AnonymousClass5w9.A00(userSession2);
        C295105na.A02(userSession2, "default_privacy_instruction_view_click", valueOf, (String) null, "video_feed", String.valueOf(r3.A01), z, C363558jv.A00(userSession2), r3.A05);
        C61942KSr.A05(r3, kSr, false);
    }
}
