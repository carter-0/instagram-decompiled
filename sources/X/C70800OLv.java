package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;

/* renamed from: X.OLv  reason: case insensitive filesystem */
public abstract class C70800OLv {
    public boolean A00;
    public final C69318NjJ A01;
    public final GroupLinkPreviewResponse$Success A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final C262224Cq A06;
    public final N49 A07;
    public final N49 A08;
    public final AnonymousClass12V A09;
    public final UserSession A0A;
    public final C69064Ne1 A0B;
    public final OMD A0C;

    public final boolean A00() {
        boolean A1W;
        if (this instanceof C68750NVk) {
            C68750NVk nVk = (C68750NVk) this;
            GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = nVk.A07;
            if (!groupLinkPreviewResponse$Success.A0G && !groupLinkPreviewResponse$Success.A0D) {
                A1W = nVk.A00;
            }
            return false;
        }
        if (!(this instanceof C68749NVj) && !(this instanceof C68748NVi)) {
            C68751NVl nVl = (C68751NVl) this;
            GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success2 = nVl.A05;
            if (!groupLinkPreviewResponse$Success2.A0D) {
                A1W = C51966G9m.A1W(nVl.A00, String.valueOf(groupLinkPreviewResponse$Success2.A04));
            }
        }
        return false;
        if (A1W) {
            return false;
        }
        return true;
    }

    public C70800OLv(N49 n49, N49 n492, UserSession userSession, C69318NjJ njJ, C69064Ne1 ne1, OMD omd, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success) {
        this.A0A = userSession;
        this.A0B = ne1;
        this.A01 = njJ;
        this.A07 = n49;
        this.A08 = n492;
        this.A02 = groupLinkPreviewResponse$Success;
        this.A0C = omd;
        this.A05 = groupLinkPreviewResponse$Success.A0B;
        this.A03 = groupLinkPreviewResponse$Success.A06;
        this.A04 = groupLinkPreviewResponse$Success.A09;
        AnonymousClass12T r1 = AnonymousClass12T.A00;
        this.A09 = r1;
        this.A06 = DbY.A0r(r1, 483063461);
    }
}
