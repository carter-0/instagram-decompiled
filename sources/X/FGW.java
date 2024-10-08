package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class FGW {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C49856F9w A03;
    public final boolean A04;

    private final void A00(C331157Pu r5, boolean z) {
        String str;
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A05, userSession, 36311332852662779L)) {
            C49856F9w.A00(this.A03, "message_setting_icebreaker_impression");
            OyN.A00(userSession).A05();
            FragmentActivity fragmentActivity = this.A00;
            String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131962677);
            if (z) {
                str = fragmentActivity.getString(2131959446);
            } else {
                str = null;
            }
            A04(r5, this, A16, str, 62);
        }
    }

    private final void A01(C331157Pu r5, boolean z) {
        String str;
        UserSession userSession = this.A02;
        C66777McN A002 = C66778McO.A00(userSession);
        if (!A002.A02) {
            A002.A05();
        }
        if (!AnonymousClass7OG.A00(userSession)) {
            0qQ.A0B(userSession, 0);
            0Tu r2 = 0Tu.A06;
            if (!DbY.A1Z(r2, userSession, 36315215503101029L) && !182.A06(r2, userSession, 36316194755579993L)) {
                return;
            }
        }
        C49856F9w.A00(this.A03, "message_settings_response_suggestions_impression");
        FragmentActivity fragmentActivity = this.A00;
        String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131960248);
        if (z) {
            str = fragmentActivity.getString(2131960247);
        } else {
            str = null;
        }
        A04(r5, this, A16, str, 64);
    }

    private final void A02(C331157Pu r4, boolean z) {
        String str;
        UserSession userSession = this.A02;
        if (DcI.A00(userSession)) {
            C49856F9w.A00(this.A03, "message_setting_saved_replies_impression");
            C66777McN A002 = C66778McO.A00(userSession);
            if (!A002.A02) {
                A002.A05();
            }
            FragmentActivity fragmentActivity = this.A00;
            String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131960245);
            if (z) {
                str = fragmentActivity.getString(2131960244);
            } else {
                str = null;
            }
            A04(r4, this, A16, str, 65);
        }
    }

    private final void A03(C331157Pu r5, boolean z) {
        String str;
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A06, userSession, 36314055862061441L)) {
            C49856F9w.A00(this.A03, "message_setting_welcome_message_impression");
            C48834Ekw.A00(this.A01, userSession).A00();
            FragmentActivity fragmentActivity = this.A00;
            String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131976828);
            if (z) {
                str = fragmentActivity.getString(2131960760);
            } else {
                str = null;
            }
            A04(r5, this, A16, str, 66);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.EbK, java.lang.Object] */
    public static void A04(Object obj, Object obj2, String str, String str2, int i) {
        FPE fpe = new FPE(i, obj, obj2);
        ? obj3 = new Object();
        obj3.A02 = str;
        obj3.A01 = str2;
        obj3.A00 = fpe;
        C46846DmN.A01.add(obj3);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.EbK, java.lang.Object] */
    public final void A05() {
        String str;
        C331127Pr A0W = DbS.A0W(this.A02);
        boolean z = this.A04;
        if (!z) {
            DbZ.A0z(this.A00, A0W, 2131959532);
        }
        C331157Pu A002 = A0W.A00();
        Fragment r6 = new AnonymousClass4DH();
        r6.A03 = z;
        List list = C46846DmN.A01;
        list.clear();
        if (z) {
            A00(A002, z);
            A02(A002, z);
            A03(A002, z);
            A01(A002, z);
        } else {
            A01(A002, z);
            A02(A002, z);
            A00(A002, z);
            A03(A002, z);
        }
        C49856F9w.A00(this.A03, "message_setting_message_control_impression");
        FragmentActivity fragmentActivity = this.A00;
        String A16 = AnonymousClass7TE.A16(fragmentActivity, 2131966245);
        if (z) {
            str = fragmentActivity.getString(2131959740);
        } else {
            str = null;
        }
        FPE fpe = new FPE(63, (Object) A002, (Object) this);
        ? obj = new Object();
        obj.A02 = A16;
        obj.A01 = str;
        obj.A00 = fpe;
        list.add(obj);
        A002.A02(fragmentActivity, r6);
    }

    public FGW(FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r5;
        this.A03 = new C49856F9w(r5, userSession);
        this.A04 = 182.A06(0Tu.A06, userSession, 36319076679031699L);
    }
}
