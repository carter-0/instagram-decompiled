package X;

import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.8jT  reason: invalid class name and case insensitive filesystem */
public final class C363288jT implements 0lm {
    public static final AnonymousClass2hV A09 = new C363298jU();
    public 1OC A00;
    public final C363368jb A01;
    public final C363368jb A02;
    public final UserSession A03;
    public final C363318jW A04 = new AnonymousClass2FB();
    public final C363348jZ A05;
    public final C363348jZ A06;
    public final 1wn A07;
    public final Set A08;

    public final synchronized void A07(AnonymousClass2hV r5, String str, Comparator comparator, List list) {
        A05();
        C293645l7 r0 = (C293645l7) this.A01.A05.get(str);
        if (r0 != null) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            Map map = r0.A03;
            if (map == null) {
                map = Collections.emptyMap();
            }
            for (Map.Entry entry : map.entrySet()) {
                builder.put((String) entry.getKey(), (Double) entry.getValue());
            }
            Collections.sort(list, new C336447ed(r5, comparator, builder.build()));
        }
    }

    public final synchronized void A08(1UV r5, String str, String str2, Set set) {
        Collection<User> collection;
        A05();
        Map map = null;
        C293645l7 r0 = (C293645l7) this.A01.A05.get(str);
        if (r0 == null) {
            0wb.A03("UsersBootstrapService", 002.A0R("Requested missing surface ", str));
        } else {
            map = r0.A03;
            if (map == null) {
                map = Collections.emptyMap();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            C363318jW r2 = this.A04;
            if (str2.length() > 0 && (collection = r2.A01[Character.toLowerCase(str2.charAt(0)) % 30]) != null) {
                for (User user : collection) {
                    if (C336437ec.A00(user, str2) && !user.CPV()) {
                        if ((map == null || map.containsKey(user.getId())) && (r5 == null || r5.apply(user))) {
                            set.add(user);
                        }
                    }
                }
            }
        } else {
            for (User user2 : this.A02.A05.values()) {
                if (!user2.CPV() && ((map == null || map.containsKey(user2.getId())) && (r5 == null || r5.apply(user2)))) {
                    set.add(user2);
                }
            }
        }
    }

    public final synchronized void A09(String str, List list) {
        A07(A09, str, (Comparator) null, list);
    }

    static {
        TimeUnit.HOURS.toMillis(1);
    }

    public static C363288jT A00(UserSession userSession) {
        return (C363288jT) userSession.A01(C363288jT.class, new C363308jV(userSession));
    }

    public static void A01(C363288jT r1) {
        r1.A01.A01();
        r1.A04.A01();
        r1.A02.A01();
    }

    public static void A03(C363288jT r3) {
        if (r3.A00 == null) {
            1NY r2 = new 1NY(r3.A03);
            r2.A08(AnonymousClass05K.A0N);
            r2.A0A("scores/bootstrap/users/");
            r2.A9m("surfaces", new JSONArray(r3.A08).toString());
            r2.A0R(AnonymousClass94F.class, AnonymousClass94G.class);
            1OC A0M = r2.A0M();
            A0M.A00 = new AnonymousClass94H(r3);
            r3.A00 = A0M;
            1ES.A03(A0M);
        }
    }

    public static boolean A04(C363288jT r7) {
        C363368jb r6 = r7.A02;
        long j = r6.A00;
        if (j == -1) {
            j = r6.A03.getLong("expiration_timestamp_ms", -1);
            r6.A00 = j;
        }
        if (j >= System.currentTimeMillis()) {
            for (Object obj : r7.A08) {
                if (r7.A01.A05.get(obj) == null) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A05() {
        C363368jb r1 = this.A02;
        synchronized (r1) {
            if ((!r1.A02 || !this.A01.A02) && !this.A08.isEmpty()) {
                A02(this);
                if (A04(this)) {
                    A03(this);
                }
            }
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        1OC r0 = this.A00;
        if (r0 != null) {
            r0.onCancel();
            this.A00 = null;
        }
        AnonymousClass1Nd.A00(this.A03).A02(this.A07, 2Cy.class);
        A01(this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.8jW, X.2FB] */
    public C363288jT(UserSession userSession) {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"autocomplete_user_list", "coefficient_ios_section_test_bootstrap_ranking", "coefficient_rank_recipient_user_suggestion", "coefficient_direct_recipients_ranking_variant_2", "coefficient_besties_list_ranking"}));
        this.A08 = hashSet;
        C363328jX r6 = new C363328jX(this);
        this.A07 = r6;
        C363338jY r5 = new C363338jY(this);
        this.A06 = r5;
        C363358ja r4 = new C363358ja(this);
        this.A05 = r4;
        this.A03 = userSession;
        0xa A032 = 1Al.A01(userSession).A03(1An.A3W);
        this.A02 = new C363368jb(r5, A032, "user:", (Comparator) null);
        this.A01 = new C363368jb(r4, A032, "surface:", (Comparator) null);
        hashSet.remove("disabled");
        AnonymousClass1Nd.A00(userSession).A01(r6, 2Cy.class);
    }

    public static void A02(C363288jT r3) {
        A01(r3);
        C363368jb r0 = r3.A02;
        r0.A03();
        for (Object A022 : r0.A05.values()) {
            r3.A04.A02(A022);
        }
        r3.A01.A03();
    }

    public final void A06() {
        A01(this);
        C363368jb r4 = this.A02;
        r4.A01();
        r4.A02();
        r4.A05(System.currentTimeMillis() - 1);
    }
}
