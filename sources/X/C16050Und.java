package X;

import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Und  reason: case insensitive filesystem */
public final class C16050Und extends C14772U8i {
    public final int A00;
    public final PromoteData A01;
    public final UserSession A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final WYX A06;

    public C16050Und(C319836rJ r7, WYX wyx, PromoteData promoteData) {
        super(r7, new VOI(wyx));
        int size;
        this.A01 = promoteData;
        this.A06 = wyx;
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        this.A02 = userSession;
        Number number = (Number) r7.A00("lead_form_custom_question_index");
        if (number != null) {
            size = number.intValue();
        } else {
            size = promoteData.A1t.size();
        }
        this.A00 = size;
        int i = 0;
        this.A05 = AnonymousClass7TF.A1T(size, promoteData.A1t.size());
        this.A03 = AnonymousClass7TF.A0j(LeadGenEntryPoint.PROMOTE.A00);
        this.A04 = true;
        if (this.A05) {
            List list = promoteData.A1t;
            0qQ.A06(list);
            GSY gsy = (GSY) 00k.A0O(list, this.A00);
            if (gsy != null) {
                this.A08.Epw(gsy.A03);
                List list2 = (List) gsy.A00;
                if (list2 != null) {
                    for (Object next : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        05G[] r1 = this.A0A;
                        if (i < r1.length) {
                            r1[i].Epw(next);
                        }
                        i = i2;
                    }
                }
            }
        }
    }
}
