package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.P9l  reason: case insensitive filesystem */
public final class C72528P9l implements C333117Xs {
    public final Activity A00;
    public final C314326i1 A01;
    public final AvatarStore A02;
    public final AnonymousClass4DH A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final OJR A06;
    public final OBK A07;
    public final AnonymousClass7SM A08;
    public final C332257Ug A09;
    public final AnonymousClass7SN A0A;
    public final AnonymousClass0eK A0B;

    public final void Eu1(C327627Bo r16, String str, boolean z) {
        Boolean bool;
        Object obj;
        Fragment A002;
        AnonymousClass37E r4;
        Activity activity;
        AnonymousClass27H r1 = this.A02.A01.A00;
        if (0qQ.A0K(r1, C299715vi.A00)) {
            bool = AnonymousClass7TE.A0v();
        } else if (0qQ.A0K(r1, C297385rf.A00)) {
            bool = false;
        } else if (0qQ.A0K(r1, AnonymousClass27G.A00)) {
            bool = null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        OBK obk = this.A07;
        boolean z2 = z;
        Boolean valueOf = Boolean.valueOf(z2);
        AnonymousClass0eK r3 = this.A0B;
        boolean A1W = C66582MXn.A1W(r3);
        String str2 = str;
        boolean A082 = C66834MdS.A08(str2);
        if (r16 == C327627Bo.NUX_TYPE_AVATAR_UPDATE) {
            obj = NTF.A00;
        } else {
            UserSession userSession = obk.A01.A00;
            0Tu r5 = 0Tu.A05;
            if (!182.A06(r5, userSession, 36319858362752697L)) {
                Boolean A0v = AnonymousClass7TE.A0v();
                if ((0qQ.A0K(bool, A0v) && !A1W && 182.A06(r5, userSession, 36319214117592084L)) || (0qQ.A0K(bool, A0v) && A1W && 182.A06(r5, userSession, 36319214117657621L))) {
                    obj = NTE.A00;
                } else if (!((0qQ.A0K(bool, A0v) && A082) || valueOf == null || bool == null)) {
                    obj = new NTC(bool.booleanValue());
                }
            }
            obj = NTD.A00;
        }
        if (obj instanceof NTC) {
            A002 = 1as.A04.A02.A00(this.A04, this.A05, str2, z2, ((NTC) obj).A00, false, C66582MXn.A1W(r3));
            this.A0A.CLU();
            r4 = AnonymousClass37D.A00;
            activity = this.A00;
            AnonymousClass37D A012 = r4.A01(activity);
            if (A012 != null) {
                ((AnonymousClass37F) A012).A0H = new C72961PQt(0, this, bool);
            }
        } else if (obj instanceof NTE) {
            this.A08.A00();
            return;
        } else if (0qQ.A0K(obj, NTF.A00)) {
            A002 = C69762Nrl.A00("ig_direct_thread", "ig_direct_thread_moustache_nux");
            this.A0A.CLU();
            r4 = AnonymousClass37D.A00;
            activity = this.A00;
        } else if (!0qQ.A0K(obj, NTD.A00)) {
            throw AnonymousClass7TE.A1K();
        } else {
            return;
        }
        AnonymousClass37D A013 = r4.A01(activity);
        if (A013 != null) {
            0qQ.A0A(A002);
            A013.A0J(A002);
        }
        this.A09.Cyt();
    }

    public /* synthetic */ C72528P9l(Activity activity, C314326i1 r6, AnonymousClass4DH r7, AnonymousClass0iw r8, UserSession userSession, AnonymousClass7SM r10, C332257Ug r11, AnonymousClass7SN r12, AnonymousClass0eK r13) {
        OBK obk = new OBK(userSession);
        AvatarStore A002 = 25x.A00(userSession);
        OJR ojr = new OJR(userSession);
        0qQ.A0B(r8, 4);
        C51974G9v.A1N(r11, r12, r10);
        0qQ.A0B(r13, 8);
        DbW.A1P(A002, 10, r6);
        this.A05 = userSession;
        this.A00 = activity;
        this.A03 = r7;
        this.A04 = r8;
        this.A09 = r11;
        this.A0A = r12;
        this.A08 = r10;
        this.A0B = r13;
        this.A07 = obk;
        this.A02 = A002;
        this.A06 = ojr;
        this.A01 = r6;
    }
}
