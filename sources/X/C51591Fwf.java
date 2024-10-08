package X;

import androidx.paging.PagingDataAdapter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Fwf  reason: case insensitive filesystem */
public final class C51591Fwf implements AnonymousClass0eL, 0sP {
    public boolean A00;
    public final int A01;
    public final Object A02;

    public C51591Fwf(PagingDataAdapter pagingDataAdapter) {
        this.A01 = 0;
        this.A02 = pagingDataAdapter;
        this.A00 = true;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgdsButton igdsButton;
        switch (this.A01) {
            case 0:
                C63970LFx lFx = (C63970LFx) obj;
                0qQ.A0B(lFx, 0);
                if (!this.A00) {
                    if (lFx.A04.A02 instanceof C60332Jjb) {
                        PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) this.A02;
                        if (pagingDataAdapter.mStateRestorationPolicy == C231372rZ.PREVENT && !pagingDataAdapter.A00) {
                            pagingDataAdapter.setStateRestorationPolicy(C231372rZ.ALLOW);
                        }
                        pagingDataAdapter.A01.A01.A04.A00.remove(this);
                        break;
                    }
                } else {
                    this.A00 = false;
                    break;
                }
                break;
            case 1:
                E5H e5h = (E5H) this.A02;
                boolean z = this.A00;
                C370538wd r8 = (C370538wd) obj;
                String str = r8.A1J;
                if (!z) {
                    E5H.A0B(e5h, str, true);
                    if (e5h.A0J == null || e5h.A0K == null) {
                        E5H.A09(e5h, r8);
                    }
                    DbZ.A1Y(e5h);
                    UserSession userSession = e5h.A04;
                    EEP eep = e5h.A0A;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = eep.A0N().iterator();
                    while (it.hasNext()) {
                        DirectShareTarget A0f = DbT.A0f(it);
                        if (A0f.A0P == null) {
                            A1C.add(((PendingRecipient) AnonymousClass7TE.A13(DbT.A14(A0f))).getId());
                        }
                    }
                    EEP eep2 = e5h.A0A;
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Iterator it2 = eep2.A0N().iterator();
                    while (it2.hasNext()) {
                        DirectShareTarget A0f2 = DbT.A0f(it2);
                        if (A0f2.A0I()) {
                            A1C2.add(A0f2.A0L);
                        }
                    }
                    1OC A0F = DirectThreadApi.A0F(userSession, r8.A1D, A1C, A1C2);
                    UserSession userSession2 = e5h.A04;
                    0qQ.A0B(userSession2, 0);
                    ((C49687F1x) userSession2.A01(C49687F1x.class, new C46570DhC(userSession2, 13))).A00(A0F, new C51588Fwc(2, r8, e5h), new C51588Fwc(3, r8, e5h));
                    break;
                } else {
                    E5H.A0B(e5h, str, true);
                    E5H.A09(e5h, r8);
                    break;
                }
            default:
                E5H e5h2 = (E5H) this.A02;
                boolean z2 = this.A00;
                if (z2) {
                    C50338FYv fYv = e5h2.A09;
                    if (fYv != null) {
                        F0V A002 = E5H.A00(e5h2);
                        1Ln A003 = C50338FYv.A00(fYv);
                        if (DbT.A1Y(A003)) {
                            C50338FYv.A04(A003, fYv);
                            Dba.A1D(A003, "thread_create_error");
                            A003.A0p("direct_invite_skip_button");
                            C50338FYv.A05(A003, fYv, "invite_people");
                            A003.A0w(C50338FYv.A03(A002, fYv));
                            A003.Cgf();
                        }
                    }
                } else {
                    E5H.A0B(e5h2, (String) null, false);
                }
                IgdsButton igdsButton2 = e5h2.A0E;
                if (!(igdsButton2 == null || e5h2.A0D == null)) {
                    igdsButton2.setEnabled(true);
                    e5h2.A0D.setEnabled(true);
                }
                if (z2) {
                    igdsButton = e5h2.A0E;
                } else {
                    igdsButton = e5h2.A0D;
                }
                if (igdsButton != null) {
                    igdsButton.setLoading(false);
                }
                0KC.A0C(E5H.__redex_internal_original_name, "Creation of social channel flow api has failed");
                break;
        }
        return C60340gF.A00;
    }

    public C51591Fwf(E5H e5h, int i, boolean z) {
        this.A01 = i;
        this.A02 = e5h;
        this.A00 = z;
    }
}
