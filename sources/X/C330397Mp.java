package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7Mp  reason: invalid class name and case insensitive filesystem */
public abstract class C330397Mp {
    public static final int A00(N4P n4p) {
        String str;
        if (n4p == null || (str = n4p.A0N) == null) {
            return -1;
        }
        Locale locale = Locale.US;
        0qQ.A08(locale);
        String upperCase = str.toUpperCase(locale);
        0qQ.A07(upperCase);
        if (upperCase.equals("general")) {
            return 1;
        }
        return upperCase.equals("primary") ? 0 : -1;
    }

    public static final C74449Pv4 A01(Context context, UserSession userSession, Capabilities capabilities, C254793t3 r8) {
        C74542Pwb pwb;
        C74449Pv4 p2j;
        0qQ.A0B(userSession, 1);
        boolean z = r8 instanceof MsysThreadId;
        if (182.A06(0Tu.A05, userSession, 36313278472849258L)) {
            pwb = C67055MhS.A00(userSession);
        } else {
            pwb = null;
        }
        if (z) {
            p2j = new P2K(new PCP(userSession), new PF4(context, userSession, capabilities, C300965yF.A03(r8)), pwb);
        } else {
            C254763t0 A01 = C300965yF.A01(r8);
            PCT pct = new PCT(A01);
            p2j = new P2J(new AnonymousClass7Z9(userSession, pct, 1bJ.A00(userSession)), new PF3(context, userSession, capabilities, A01), pwb);
        }
        return p2j;
    }

    public static final String A02(Context context, UserSession userSession, N4P n4p, boolean z) {
        if (z) {
            return n4p.A0P;
        }
        String str = n4p.A0P;
        if (str == null) {
            str = "";
        }
        List A09 = n4p.A09();
        if (A09 == null) {
            A09 = new ArrayList();
        }
        return AnonymousClass48N.A08(context, userSession, str, A09, false);
    }

    public static final String A03(C254743sy r1) {
        0qQ.A0B(r1, 0);
        if (C66647MaG.A0F(r1)) {
            return C66647MaG.A03(r1).A01;
        }
        return "-1";
    }

    public static final ArrayList A05(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PendingRecipient(((C68303N9q) it.next()).A00));
        }
        return arrayList;
    }

    public static final void A06(FragmentActivity fragmentActivity, AnonymousClass0iw r9, UserSession userSession, Capabilities capabilities, MessagingUser messagingUser, Long l) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        MessagingUser messagingUser2 = messagingUser;
        0qQ.A0B(messagingUser, 3);
        if (capabilities.A00(C376179Gx.THREAD_DETAILS_OPEN_USER_PROFILE)) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            AnonymousClass0iw r1 = r9;
            if (l != null) {
                C49056Eoa.A00(fragmentActivity2, r1, userSession2, messagingUser2, l.longValue());
            } else {
                C48838El0.A00(fragmentActivity2, r1, userSession2, messagingUser2, "direct_thread_user_row", (String) null, true, false);
            }
        }
    }

    public static final boolean A07(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36313278472849258L);
    }

    public static final ArrayList A04(UserSession userSession, N4P n4p, C67350MmR mmR, boolean z) {
        List<C68303N9q> A0a;
        C68303N9q A07;
        C67350MmR mmR2 = mmR;
        0qQ.A0B(mmR2, 3);
        C73427PcR pcR = C73427PcR.A00;
        ArrayList arrayList = new ArrayList();
        N4P n4p2 = n4p;
        if (n4p2.A09 == 29) {
            A0a = n4p2.A09();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll((Collection) n4p2.A0a.getValue());
            if (!182.A06(0Tu.A06, userSession, 36313222638602054L)) {
                arrayList2.addAll((Collection) n4p2.A0Y.getValue());
                arrayList2.addAll((Collection) n4p2.A0Z.getValue());
            }
            A0a = 00k.A0a(arrayList2);
        }
        int size = A0a.size();
        boolean A00 = OPx.A00(n4p2.A0A);
        if ((size == 0 || (A00 && z)) && (A07 = n4p2.A07()) != null && !A07.A0D && A08(A07, mmR2)) {
            arrayList.add(A07);
        }
        if (size > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            boolean z2 = true;
            for (C68303N9q n9q : A0a) {
                if (A08(n9q, mmR2)) {
                    if (!n9q.A07 || !182.A06(0Tu.A05, userSession, 36328869204082320L)) {
                        User user = n9q.A00;
                        User user2 = user;
                        if (user.BIW() == 1) {
                            arrayList6.add(n9q);
                        } else if (n9q.A0C) {
                            arrayList9.add(n9q);
                        } else if (n9q.A0B) {
                            arrayList10.add(n9q);
                        } else if (n9q.A08) {
                            arrayList8.add(n9q);
                        } else if (n9q.A0A) {
                            arrayList7.add(n9q);
                        } else if (user2.B6o() == FollowStatus.A05) {
                            arrayList3.add(n9q);
                        } else if (user2.B6o() == FollowStatus.A07) {
                            arrayList4.add(n9q);
                        } else if (user2.B6o() == FollowStatus.A06) {
                            arrayList5.add(n9q);
                        } else {
                            if (user2.B6o() == FollowStatus.A08 && !(n4p2.A08() instanceof MsysThreadId)) {
                                C294695ms.A00(userSession).A0G(user2, false);
                            }
                            z2 = false;
                        }
                    } else {
                        arrayList11.add(n9q);
                    }
                }
            }
            if (z2) {
                01V.A1D(arrayList11, pcR);
                Collections.sort(arrayList3, pcR);
                Collections.sort(arrayList4, pcR);
                Collections.sort(arrayList6, pcR);
                Collections.sort(arrayList9, pcR);
                Collections.sort(arrayList10, pcR);
                Collections.sort(arrayList8, pcR);
                Collections.sort(arrayList7, pcR);
                arrayList.addAll(arrayList11);
                arrayList.addAll(arrayList3);
                arrayList.addAll(arrayList4);
                arrayList.addAll(arrayList5);
                arrayList.addAll(arrayList6);
                arrayList.addAll(arrayList9);
                arrayList.addAll(arrayList10);
                arrayList.addAll(arrayList8);
                arrayList.addAll(arrayList7);
            } else {
                arrayList.addAll(A0a);
                return arrayList;
            }
        }
        return arrayList;
    }

    public static final boolean A08(C68303N9q n9q, C67350MmR mmR) {
        boolean z;
        int ordinal = mmR.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 && !n9q.A08) {
                z = n9q.A0A;
            }
            return true;
        }
        if (!n9q.A07 && !n9q.A0C) {
            z = n9q.A0B;
        }
        return true;
        if (z) {
            return true;
        }
        return false;
    }
}
