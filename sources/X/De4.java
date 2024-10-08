package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class De4 extends 1P0 {
    public final /* synthetic */ UserDetailFragment A00;
    public final /* synthetic */ User A01;

    public De4(UserDetailFragment userDetailFragment, User user) {
        this.A00 = userDetailFragment;
        this.A01 = user;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        List list;
        ImmutableList immutableList;
        ImmutableList immutableList2;
        int A03 = AnonymousClass0fD.A03(1070717987);
        C318496p3 r11 = (C318496p3) obj;
        int A032 = AnonymousClass0fD.A03(-1230573251);
        De4.super.onSuccess(r11);
        if (!(r11 == null || (list = r11.A00) == null || ImmutableList.copyOf((Collection) list) == null)) {
            List list2 = r11.A00;
            if (list2 != null) {
                immutableList = ImmutableList.copyOf((Collection) list2);
            } else {
                immutableList = null;
            }
            if (!immutableList.isEmpty()) {
                List list3 = r11.A00;
                if (list3 != null) {
                    immutableList2 = ImmutableList.copyOf((Collection) list3);
                } else {
                    immutableList2 = null;
                }
                UserDetailFragment userDetailFragment = this.A00;
                if (userDetailFragment.A09 != null) {
                    UserSession userSession = userDetailFragment.A0I;
                    User user = this.A01;
                    if (1AW.A06(0Tu.A05, 2324140338693800685L) || FFT.A03(userSession, user)) {
                        userDetailFragment.A11.A07 = immutableList2;
                        userDetailFragment.A09.EuC(true);
                        FPH.A00(userDetailFragment.A09.C7y(), this, immutableList2, user, 47);
                        IgTextView C7y = userDetailFragment.A09.C7y();
                        User user2 = userDetailFragment.A10.A03;
                        if (!(userDetailFragment.getActivity() == null || user2 == null)) {
                            1Av A002 = 1Au.A00(userDetailFragment.A0I);
                            String id = user2.getId();
                            0xa r6 = A002.A01;
                            Set C1t = r6.C1t("featured_accounts_tooltip_shown_account_set");
                            if (C1t.size() < 2 && !C1t.contains(id)) {
                                AnonymousClass5Gv r1 = userDetailFragment.A0W;
                                if (r1 == null) {
                                    r1 = C319536ql.A00(userDetailFragment.requireActivity(), C7y, C226262fy.BELOW_ANCHOR, userDetailFragment.getString(2131962220));
                                    userDetailFragment.A0W = r1;
                                }
                                if (!UserDetailFragment.A0i(userDetailFragment)) {
                                    r1.A07(userDetailFragment.A0I);
                                    Set A0j = 00k.A0j(r6.C1t("featured_accounts_tooltip_shown_account_set"));
                                    A0j.add(id);
                                    0xY AR4 = r6.AR4();
                                    AR4.ED3("featured_accounts_tooltip_shown_account_set");
                                    0xY A0e = DbU.A0e(AR4, r6);
                                    A0e.E5h("featured_accounts_tooltip_shown_account_set", A0j);
                                    A0e.apply();
                                }
                            }
                        }
                    }
                }
                i = 1887638252;
                AnonymousClass0fD.A0A(i, A032);
                AnonymousClass0fD.A0A(2017180963, A03);
            }
        }
        i = -1126817241;
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(2017180963, A03);
    }
}
