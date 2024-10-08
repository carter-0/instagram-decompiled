package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lxg  reason: case insensitive filesystem */
public final class C65665Lxg implements C66463MSr {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass818 A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C311296cS A04;

    public C65665Lxg(FragmentActivity fragmentActivity, AnonymousClass818 r2, AnonymousClass4DH r3, C255773uh r4, C311296cS r5) {
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void DfE(Integer num) {
        String str;
        AnonymousClass819 r7;
        0qQ.A0B(num, 0);
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            FragmentActivity fragmentActivity = this.A00;
            AnonymousClass4DH r5 = this.A02;
            C311296cS r2 = this.A04;
            UserSession userSession = r2.A07;
            AnonymousClass818 r6 = this.A01;
            C255773uh r1 = this.A03;
            1Xj r0 = r1.A0b;
            if (r0 == null || (str = r0.getId()) == null) {
                str = "";
            }
            r5.getContext();
            C65644LxL lxL = new C65644LxL(r6, r5, r1, r2);
            0qQ.A0B(r6, 3);
            if (AnonymousClass8PU.A07(userSession)) {
                if (C64839Lj1.A0F.A00(r6, userSession)) {
                    if (C367998ru.A03(r6, AnonymousClass819.BOTTOMSHEET_UNIFIED_STORIES_FEED, userSession)) {
                        C62052KYa.A03.A03(fragmentActivity, r5, r6, (AnonymousClass819) null, userSession, lxL, str, "");
                        return;
                    }
                } else if (C368008rv.A00(r6) != num2 ? !(!C363018iu.A00(userSession) || C363558jv.A00(userSession)) : !(C363018iu.A00(userSession) || !C363558jv.A00(userSession))) {
                    if (C368008rv.A00(r6) == num2) {
                        r7 = AnonymousClass819.BOTTOMSHEET_MIGRATION_STORIES_WAVE2;
                    } else {
                        r7 = AnonymousClass819.BOTTOMSHEET_MIGRATION_FEED_WAVE2;
                    }
                    if (C367998ru.A03(r6, r7, userSession)) {
                        KYZ.A01.A00(fragmentActivity, r5, r6, r7, userSession, lxL, str, "", false);
                        return;
                    }
                }
            }
            C311296cS.A02(r6, r1, r2);
        }
    }
}
