package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;

/* renamed from: X.2x8  reason: invalid class name */
public final class AnonymousClass2x8 implements 27S {
    public final /* synthetic */ C234042wt A00;

    public AnonymousClass2x8(C234042wt r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C234042wt r1 = this.A00;
        if (C234042wt.A02(r1) || C234042wt.A03(r1)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1375406354);
        C240233Kc r11 = (C240233Kc) obj;
        int A032 = AnonymousClass0fD.A03(775794940);
        0qQ.A0B(r11, 0);
        1Xj r7 = r11.A00;
        FBUserTag fBUserTag = r11.A01;
        C234042wt r0 = this.A00;
        UserSession userSession = r0.A0B;
        Fragment fragment = r0.A07;
        I6Q.A00(fragment, userSession, r7);
        I6Q.A05(r7, r0.A00, C301155ye.A00(), r0.A02, C233162v9.USER_TAG_CLICK);
        if (!fBUserTag.A04) {
            LTZ.A0D(fragment, userSession, r7, fBUserTag);
        }
        AnonymousClass0fD.A0A(-57938896, A032);
        AnonymousClass0fD.A0A(-250189979, A03);
    }
}
