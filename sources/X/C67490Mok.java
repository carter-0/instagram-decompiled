package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mok  reason: case insensitive filesystem */
public final class C67490Mok implements C74506Pw1 {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C67100MiK A03;

    public final void Cog(N4G n4g, Map map) {
        int A012 = OPS.A01(Dba.A0e(map));
        UserSession userSession = this.A02;
        Iterator it = AnonymousClass7TE.A1D(map.keySet()).iterator();
        while (true) {
            N4G n4g2 = n4g;
            if (it.hasNext()) {
                String str = C66647MaG.A05(it).A00;
                if (str != null) {
                    C66671Mae.A01(n4g, userSession, str);
                }
            } else {
                AnonymousClass0iw r0 = this.A01;
                int i = n4g.A00;
                int size = map.size();
                boolean A1P = AnonymousClass7TF.A1P(A012);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "direct_thread_move_multiple");
                A0e.A9F("folder", DbS.A0j(i));
                A0e.A9F("thread_count", DbS.A0j(size));
                A0e.A9F("interop_thread_count", DbS.A0j(A012));
                A0e.A7p("is_interop", Boolean.valueOf(A1P));
                A0e.Cgf();
                OPR.A01(this.A00, n4g2, userSession, (String) null, map.size(), true);
                return;
            }
        }
    }

    public static void A01(0Aj r2, String str, int i) {
        r2.AAJ("action", str);
        r2.A9F("thread_count", Long.valueOf((long) i));
    }

    public final void AOd(List list) {
        C67100MiK miK = this.A03;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C67100MiK.A00(miK, (C254743sy) it.next(), false);
        }
        UserSession userSession = this.A02;
        int size = list.size();
        0Aj A0H = C66583MXo.A0H(userSession);
        A01(A0H, "multiple_thread_deleted", size);
        A0H.Cgf();
    }

    public final void AVo(Map map) {
        UserSession userSession = this.A02;
        boolean z = true;
        Iterator it = AnonymousClass7TE.A1D(map.keySet()).iterator();
        while (it.hasNext()) {
            C70170NyO.A00(userSession, C66647MaG.A05(it), true);
        }
        int A012 = OPS.A01(Dba.A0e(map));
        int size = map.size();
        if (A012 == 0) {
            z = false;
        }
        0Aj A0H = C66583MXo.A0H(userSession);
        A01(A0H, "multiple_thread_flag", size);
        A00(A0H, A012, z);
    }

    public final void Coz(List list) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = C66647MaG.A05(it).A00;
            if (str != null) {
                C66671Mae.A04(r3, userSession, str, true);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C3265677h.A0f(userSession, list.size());
    }

    public final void Cp2(List list) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = C66647MaG.A05(it).A00;
            if (str != null) {
                C66671Mae.A05(r3, userSession, str, true);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C3265677h.A0f(userSession, list.size());
    }

    public final void Cp7(List list) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = C66647MaG.A05(it).A00;
            if (str != null) {
                C66671Mae.A06(r3, userSession, str, true);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        int size = list.size();
        0Aj A0H = C66583MXo.A0H(userSession);
        A01(A0H, "multiple_thread_muted_video_chat", size);
        A0H.Cgf();
    }

    public final void FIX(Map map) {
        UserSession userSession = this.A02;
        boolean z = false;
        Iterator it = AnonymousClass7TE.A1D(map.keySet()).iterator();
        while (it.hasNext()) {
            C70170NyO.A00(userSession, C66647MaG.A05(it), false);
        }
        int A012 = OPS.A01(Dba.A0e(map));
        int size = map.size();
        if (A012 != 0) {
            z = true;
        }
        0Aj A0H = C66583MXo.A0H(userSession);
        A01(A0H, "multiple_thread_unflag", size);
        A00(A0H, A012, z);
    }

    public final void FIk(List list) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = C66647MaG.A05(it).A00;
            if (str != null) {
                C66671Mae.A04(r3, userSession, str, false);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        int size = list.size();
        0Aj A0H = C66583MXo.A0H(userSession);
        A01(A0H, "multiple_thread_unmuted_messages", size);
        A0H.Cgf();
    }

    public final void FIm(List list) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = C66647MaG.A05(it).A00;
            if (str != null) {
                C66671Mae.A05(r3, userSession, str, false);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C3265677h.A0f(userSession, list.size());
    }

    public final void FIp(List list) {
        UserSession userSession = this.A02;
        AnonymousClass0iw r3 = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = C66647MaG.A05(it).A00;
            if (str != null) {
                C66671Mae.A06(r3, userSession, str, false);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        int size = list.size();
        0Aj A0H = C66583MXo.A0H(userSession);
        A01(A0H, "multiple_thread_unmuted_video_chat", size);
        A0H.Cgf();
    }

    public C67490Mok(Context context, AnonymousClass0iw r3, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = new C67100MiK(context, userSession);
    }

    public static void A00(0Aj r2, int i, boolean z) {
        r2.A7p("is_interop", Boolean.valueOf(z));
        r2.A9F("interop_thread_count", Long.valueOf((long) i));
        r2.Cgf();
    }

    public final void Cm5(Map map) {
        int A012 = OPS.A01(Dba.A0e(map));
        UserSession userSession = this.A02;
        boolean z = true;
        Iterator it = AnonymousClass7TE.A1D(map.keySet()).iterator();
        while (it.hasNext()) {
            C66671Mae.A0E(userSession, C66647MaG.A05(it), true);
        }
        int size = map.size();
        if (A012 == 0) {
            z = false;
        }
        0Aj A0H = C66583MXo.A0H(userSession);
        A01(A0H, "multiple_thread_mark_unread", size);
        A00(A0H, A012, z);
    }
}
