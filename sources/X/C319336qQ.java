package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6qQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C319336qQ implements View.OnClickListener {
    public final /* synthetic */ C323366xN A00;
    public final /* synthetic */ User A01;

    public /* synthetic */ C319336qQ(C323366xN r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onClick(View view) {
        int i;
        FragmentActivity fragmentActivity;
        Integer num;
        C323366xN r0 = this.A00;
        User user = this.A01;
        C323346xL r4 = r0.A0H;
        AnonymousClass4DU r8 = r0.A0F;
        0qQ.A0B(r8, 0);
        UserDetailFragment userDetailFragment = r4.A07;
        if (userDetailFragment.getActivity() != null && userDetailFragment.getContext() != null) {
            Context requireContext = userDetailFragment.requireContext();
            C323336xK r2 = r4.A09;
            if (r2 != null) {
                i = r2.A00;
            } else {
                i = 0;
            }
            UserSession userSession = r4.A02;
            0Tu r3 = 0Tu.A05;
            if (!182.A06(r3, userSession, 36318887703550565L) && r2 != null) {
                r2.A00 = 0;
            }
            String str = null;
            C321406u6.A03(r8, userSession, (Integer) null, (Integer) null, (Integer) null, "self_profile_switcher", user.getId(), (String) null, (String) null, (String) null, 0oI.A0A(requireContext));
            C319986rY r13 = C319986rY.SELF;
            User user2 = r4.A08.A03;
            if (user2 != null) {
                str = user2.getId();
            }
            C319976rX.A02((C3263576k) null, (C69445Nlp) null, userDetailFragment, userSession, r13, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, Long.valueOf((long) i), (Long) null, "tap_toolbar_barcelona", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
            0xY AR4 = 1Au.A00(userSession).A01.AR4();
            AR4.E5T("threads_profile_glyph_tapped", true);
            AR4.apply();
            if (i > 0) {
                boolean A06 = 182.A06(r3, userSession, 36318887703026269L);
                fragmentActivity = r4.A00;
                num = AnonymousClass05K.A01;
                if (!A06) {
                    if (0oI.A0A(fragmentActivity)) {
                        FH7.A02(fragmentActivity, 002.A0R("barcelona://activity_feed", 002.A0R("?glyph_type=", C49200Er5.A00(num))));
                        return;
                    } else {
                        C49965FGy.A03(fragmentActivity, userSession, "self_profile_switcher", (String) null);
                        return;
                    }
                }
            } else if (182.A06(r3, userSession, 36318887703157343L)) {
                fragmentActivity = r4.A00;
                num = AnonymousClass05K.A00;
            } else {
                C49965FGy.A01(r4.A00, userSession, AnonymousClass05K.A00, user.getId(), user.getUsername(), "self_profile_switcher");
                return;
            }
            String C6p = user.A03.C6p();
            if (C6p == null || !0oI.A0A(fragmentActivity)) {
                if (0oI.A0A(fragmentActivity)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("barcelona://mainfeed");
                    String A0R = 002.A0R("glyph_type=", C49200Er5.A00(num));
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(0sr.A1P(new String[]{A0R, null, null}));
                    boolean z = false;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (str2 != null) {
                            char c = '&';
                            if (!z) {
                                c = '?';
                            }
                            sb.append(c);
                            sb.append(str2);
                            z = true;
                        }
                    }
                    C6p = sb.toString();
                    0qQ.A07(C6p);
                } else {
                    C49965FGy.A03(fragmentActivity, userSession, "self_profile_switcher", (String) null);
                    return;
                }
            }
            FH7.A02(fragmentActivity, C6p);
        }
    }
}
