package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MbI  reason: case insensitive filesystem */
public final class C66711MbI implements AnonymousClass0lh {
    public Map A00 = AnonymousClass7TE.A1E();
    public Map A01 = AnonymousClass7TE.A1E();
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final UserSession A0A;
    public final 1Av A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final int A0E;

    public static final boolean A01(C66711MbI mbI, C67227MkN mkN) {
        0xa r1;
        String str;
        N4R n4r = (N4R) mbI.A01.get(mkN);
        if (n4r != null && mbI.A02(mkN, (C74514Pw9) n4r.A00)) {
            int ordinal = mkN.ordinal();
            if (ordinal == 0) {
                r1 = mbI.A0B.A01;
                str = "inbox_sender_reminder_impression_count";
            } else if (ordinal == 1) {
                r1 = mbI.A0B.A01;
                str = "inbox_receiver_reminder_impression_count";
            } else {
                throw new RuntimeException();
            }
            if (r1.getInt(str, 0) > mbI.A0E) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A02(C67227MkN mkN, C74514Pw9 pw9) {
        int i;
        if (pw9 != null) {
            long C7a = pw9.C7a();
            if (Long.valueOf(C7a) != null) {
                if (mkN == C67227MkN.SENDER) {
                    i = this.A04;
                } else {
                    i = this.A03;
                }
                int i2 = this.A08;
                long hours = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - C7a);
                if (((long) i) > hours || hours > ((long) i2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void A03(C67227MkN mkN, C74514Pw9 pw9, C74516PwB pwB) {
        2FW r1;
        String str;
        long j;
        String str2;
        User user;
        if (this.A0C && !A01(this, mkN)) {
            if (pwB.C6a() == 1003 || pwB.C6a() == 1004) {
                if (pw9 != null) {
                    r1 = pw9.Aqm();
                } else {
                    r1 = null;
                }
                if (r1 != 2FW.A0G && A02(mkN, pw9)) {
                    UserSession userSession = this.A0A;
                    List A0Y = 00k.A0Y(2L2.A00(userSession).Bk4(pwB.AxH(), true));
                    int size = A0Y.size();
                    int i = this.A07;
                    if (size >= i) {
                        List A0i = 00k.A0i(A0Y, C229632nm.A0C(0, i));
                        if (TimeUnit.MICROSECONDS.toHours(((C254703su) 00k.A0I(A0i)).C7c() - ((C254703su) 00k.A0K(A0i)).C7c()) < ((long) this.A06)) {
                            return;
                        }
                    }
                    if (182.A06(0Tu.A06, userSession, 36326103245207045L)) {
                        Object A0J = 00k.A0J(pwB.BkC());
                        if (!(A0J instanceof User) || (user = (User) A0J) == null || !user.A29() || !user.A2A()) {
                            return;
                        }
                    }
                    if (pw9 != null) {
                        str = pw9.getId();
                    } else {
                        str = null;
                    }
                    0xa r5 = this.A0B.A01;
                    if (!r5.C1t("inbox_recent_reminder_message_ids").contains(str) && !this.A0D) {
                        int ordinal = mkN.ordinal();
                        0Tu r2 = 0Tu.A05;
                        if (ordinal != 0) {
                            j = 36326103245862408L;
                        } else {
                            j = 36326103245796871L;
                        }
                        if (182.A06(r2, userSession, j)) {
                            this.A01.put(mkN, new N4R(pw9, pwB));
                            A00(this);
                            if (pw9 != null) {
                                str2 = pw9.getId();
                            } else {
                                str2 = null;
                            }
                            if (r5.C1t("inbox_recent_reminder_message_ids").size() > 100) {
                                0xY AR4 = r5.AR4();
                                AR4.ED3("inbox_recent_reminder_message_ids");
                                AR4.apply();
                            }
                            Set A0j = 00k.A0j(r5.C1t("inbox_recent_reminder_message_ids"));
                            A0j.add(str2);
                            0xY AR42 = r5.AR4();
                            AR42.E5h("inbox_recent_reminder_message_ids", A0j);
                            AR42.apply();
                        }
                    }
                }
            }
        }
    }

    public final boolean A04(String str) {
        String str2;
        C74514Pw9 pw9;
        if (!this.A0C) {
            return false;
        }
        Collection<N4R> values = this.A01.values();
        if (values != null && values.isEmpty()) {
            return false;
        }
        for (N4R n4r : values) {
            if (n4r == null || (pw9 = (C74514Pw9) n4r.A00) == null) {
                str2 = null;
            } else {
                str2 = pw9.getId();
            }
            if (0qQ.A0K(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final void onSessionWillEnd() {
        if (this.A0C) {
            A00(this);
            this.A02 = false;
        }
    }

    public C66711MbI(UserSession userSession, Context context) {
        AnonymousClass7TG.A1O(userSession, context);
        this.A0A = userSession;
        this.A09 = context;
        0Tu r2 = 0Tu.A05;
        this.A05 = DbS.A04(r2, userSession, 36607578222302812L);
        this.A0C = 182.A06(r2, userSession, 36326103245141508L);
        this.A07 = DbS.A04(r2, userSession, 36607578222433886L);
        this.A06 = DbS.A04(r2, userSession, 36607578222368349L);
        this.A0E = DbS.A04(r2, userSession, 36607578222040664L);
        this.A04 = DbS.A04(r2, userSession, 36607578222106201L);
        this.A03 = DbS.A04(r2, userSession, 36607578222171738L);
        this.A08 = DbS.A04(r2, userSession, 36607578222237275L);
        this.A0D = 182.A06(0Tu.A06, userSession, 36329479089438870L);
        this.A0B = 1Au.A00(userSession);
        Map map = this.A00;
        C67227MkN mkN = C67227MkN.SENDER;
        Boolean A0u = AnonymousClass7TE.A0u();
        map.put(mkN, A0u);
        this.A00.put(C67227MkN.RECEIVER, A0u);
    }

    public static final void A00(C66711MbI mbI) {
        String str;
        HashMap A1E = AnonymousClass7TE.A1E();
        Map map = mbI.A01;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            C67227MkN mkN = (C67227MkN) A16.next();
            N4R n4r = (N4R) map.get(mkN);
            if (!(n4r == null || (str = ((C74516PwB) n4r.A02).AxH().A00) == null)) {
                A1E.put(str, Double.valueOf((double) mkN.A00));
            }
        }
        1Av.A05(mbI.A0B, "inbox_reminder_thread_map", A1E);
    }
}
