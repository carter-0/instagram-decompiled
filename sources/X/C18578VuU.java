package X;

import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import java.util.List;

/* renamed from: X.VuU  reason: case insensitive filesystem */
public final class C18578VuU {
    public int A00;
    public int A01;
    public AdvantageAudienceData A02;
    public TargetingRelaxationConstants A03;
    public String A04;
    public String A05;
    public List A06;
    public List A07;
    public List A08;

    public final PromoteAudienceInfo A01() {
        1XQ r1 = new 1XQ();
        r1.A04 = this.A04;
        r1.A05 = this.A05;
        r1.A01 = this.A01;
        r1.A00 = this.A00;
        r1.A06 = this.A06;
        r1.A07 = this.A07;
        r1.A08 = this.A08;
        r1.A03 = this.A03;
        r1.A02 = this.A02;
        return r1;
    }

    public static void A00(C18578VuU vuU, PromoteData promoteData, PromoteState promoteState) {
        promoteData.A0q = vuU.A01();
        PromoteState.A01(promoteState, AnonymousClass05K.A15);
    }
}
