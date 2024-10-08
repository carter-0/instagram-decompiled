package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;

/* renamed from: X.PQt  reason: case insensitive filesystem */
public final class C72961PQt implements C332277Ui {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72961PQt(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void D9V() {
        switch (this.A00) {
            case 0:
                boolean z = false;
                if (AnonymousClass7TF.A1Y(this.A01, false)) {
                    C72528P9l p9l = (C72528P9l) this.A02;
                    if (0qQ.A0K(p9l.A02.A01.A00, C299715vi.A00)) {
                        z = true;
                        C314326i1 r4 = p9l.A01;
                        if (r4.A02()) {
                            AnonymousClass4DH r0 = p9l.A03;
                            07U r3 = 07U.A05;
                            AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
                            AnonymousClass7TE.A1Z(new MHF(viewLifecycleOwner, r3, r4, p9l, (AnonymousClass4D7) null, 17), AnonymousClass07a.A00(viewLifecycleOwner));
                            r4.A00();
                            return;
                        }
                    }
                }
                C72528P9l p9l2 = (C72528P9l) this.A02;
                p9l2.A09.Cyg();
                if (z && p9l2.A06.A00()) {
                    p9l2.A08.A00();
                    return;
                }
                return;
            case 1:
                ((AnonymousClass37D) this.A01).A0J((Fragment) this.A02);
                return;
            case 2:
                C68467NJf nJf = (C68467NJf) this.A02;
                C74499Pvt pvt = nJf.A0P;
                if (pvt != null) {
                    long A0R = AnonymousClass7TE.A0R(nJf.A0h.getValue());
                    C68770NWf nWf = (C68770NWf) this.A01;
                    NoteAudience noteAudience = nWf.A06;
                    String str = nWf.A08;
                    String str2 = nWf.A0G;
                    pvt.E1B(nWf.A04, nWf.A05, noteAudience, str, str2, nWf.A0B, A0R, nWf.A0M);
                    return;
                }
                return;
            case 3:
                ((C332277Ui) this.A02).D9V();
                AnonymousClass9H7 r2 = ((C331697Sa) this.A01).A00;
                C328807Gh r5 = (C328807Gh) r2.A1Z.getValue();
                AnonymousClass4DH r42 = r2.A0u;
                FragmentActivity requireActivity = r42.requireActivity();
                UserSession userSession = r2.A10;
                C254783t2 r22 = r2.A1S;
                if (r5.A04 && !r5.A05) {
                    1pE.A01(requireActivity, r42, userSession, C273654mx.A00(288)).A08(requireActivity, r22, -1.0f);
                    return;
                }
                return;
            default:
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(((C70769OKp) this.A02).A00);
                if (A012 != null) {
                    A012.A0P((C332277Ui) null);
                }
                DbS.A1U(this.A01);
                return;
        }
    }

    public final void D9a() {
        if (3 - this.A00 == 0) {
            ((C332277Ui) this.A02).D9a();
        }
    }
}
