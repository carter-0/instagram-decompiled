package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fvf  reason: case insensitive filesystem */
public final class C51533Fvf implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C65274LqT A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C51533Fvf(Activity activity, C65274LqT lqT, User user, String str, boolean z) {
        this.A02 = user;
        this.A01 = lqT;
        this.A00 = activity;
        this.A03 = str;
        this.A04 = z;
    }

    public final void run() {
        C331157Pu r8;
        Activity activity;
        Fragment fragment;
        List BcT;
        String fanClubId;
        int i;
        Integer C6b;
        User user = this.A02;
        C242043Sk BcS = user.A03.BcS();
        if (!(BcS == null || (BcT = BcS.BcT()) == null)) {
            boolean z = this.A04;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : BcT) {
                C2609247o r0 = (C2609247o) next;
                if (!z || ((C6b = r0.C6b()) != null && C6b.intValue() == 29)) {
                    A1C.add(next);
                }
            }
            if (A1C.size() == 1) {
                C2609247o r3 = (C2609247o) A1C.get(0);
                Integer C6b2 = r3.C6b();
                if (C6b2 != null) {
                    int intValue = C6b2.intValue();
                    if (intValue == 28 || intValue == 61) {
                        C65274LqT lqT = this.A01;
                        activity = this.A00;
                        FanClubInfoDict B3v = user.A03.B3v();
                        C331127Pr A0W = DbS.A0W(lqT.A00);
                        r8 = A0W.A00();
                        if (B3v == null || (fanClubId = B3v.getFanClubId()) == null) {
                            FGM.A01(activity);
                            return;
                        }
                        fragment = C71045OaN.A02(C69318NjJ.UNSPECIFIED, new Fb2(0, lqT, r8, A0W), r3.C6E(), fanClubId, (String) null);
                        r8.A02(activity, fragment);
                    } else if (intValue == 29) {
                        C65274LqT lqT2 = this.A01;
                        FragmentActivity fragmentActivity = this.A00;
                        String str = this.A03;
                        C2609047m AsV = r3.AsV();
                        if (AsV != null) {
                            i = AsV.AdN();
                        } else {
                            i = 1;
                        }
                        1as r4 = 1as.A04;
                        UserSession userSession = lqT2.A00;
                        DbS.A1X(fragmentActivity);
                        r4.A03(fragmentActivity, DbS.A0O("pinned_channel_navigator"), userSession, r3.C6E(), r3.BIn(), user.getId(), str, i);
                        return;
                    }
                }
                C65274LqT lqT3 = this.A01;
                Activity activity2 = this.A00;
                C2609247o r6 = (C2609247o) A1C.get(0);
                String str2 = this.A03;
                String BIn = r6.BIn();
                if (BIn != null) {
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    DbU.A1W("s", str2, A1C2);
                    DbU.A1W("st", DbX.A0t(r6.C6b()), A1C2);
                    DbU.A1W("cid", user.getId(), A1C2);
                    FH7.A0B(activity2, lqT3.A00, OXO.A01(BIn, 00k.A0a(A1C2)), "pinned_channel_navigator");
                    return;
                }
                return;
            }
        }
        C65274LqT lqT4 = this.A01;
        activity = this.A00;
        String str3 = this.A03;
        boolean z2 = this.A04;
        UserSession userSession2 = lqT4.A00;
        C331127Pr A0W2 = DbS.A0W(userSession2);
        DbZ.A0z(activity, A0W2, 2131955056);
        DbS.A1S(A0W2, true);
        A0W2.A03 = 0.5f;
        A0W2.A1O = true;
        r8 = A0W2.A00();
        String id = user.getId();
        AnonymousClass7TG.A1N(userSession2, id);
        Bundle A0a = AnonymousClass7TE.A0a();
        fragment = new E12();
        DbU.A1D(A0a, userSession2);
        A0a.putString(AnonymousClass000.A00(886), id);
        A0a.putString("ChannelsListFragment.ENTRY_POINT", str3);
        A0a.putBoolean(AnonymousClass000.A00(1496), z2);
        fragment.setArguments(A0a);
        r8.A02(activity, fragment);
    }
}
