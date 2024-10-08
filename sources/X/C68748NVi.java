package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;

/* renamed from: X.NVi  reason: case insensitive filesystem */
public final class C68748NVi extends C70800OLv {
    public final N49 A00;
    public final N49 A01;
    public final UserSession A02;
    public final C69064Ne1 A03;
    public final OMD A04;
    public final GroupLinkPreviewResponse$Success A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C68748NVi(N49 n49, N49 n492, UserSession userSession, C69318NjJ njJ, C69064Ne1 ne1, OMD omd, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success, String str) {
        super(n49, n492, userSession, njJ, ne1, omd, groupLinkPreviewResponse$Success);
        String str2;
        this.A02 = userSession;
        this.A03 = ne1;
        this.A00 = n49;
        this.A01 = n492;
        this.A06 = str;
        this.A05 = groupLinkPreviewResponse$Success;
        this.A04 = omd;
        this.A07 = groupLinkPreviewResponse$Success.A07;
        boolean z = false;
        if (groupLinkPreviewResponse$Success.A0G || !((str2 = groupLinkPreviewResponse$Success.A0A) == null || str2.length() == 0)) {
            z = true;
        }
        this.A08 = z;
    }
}
