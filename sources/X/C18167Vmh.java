package X;

import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.Vmh  reason: case insensitive filesystem */
public abstract class C18167Vmh {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.VuU] */
    public static final C18578VuU A00(PromoteAudienceInfo promoteAudienceInfo) {
        ? obj = new Object();
        obj.A04 = promoteAudienceInfo.A04;
        obj.A05 = promoteAudienceInfo.A05;
        obj.A01 = promoteAudienceInfo.A01;
        obj.A00 = promoteAudienceInfo.A00;
        obj.A06 = promoteAudienceInfo.A06;
        obj.A07 = promoteAudienceInfo.A07;
        obj.A08 = promoteAudienceInfo.A08;
        obj.A03 = promoteAudienceInfo.A03;
        obj.A02 = promoteAudienceInfo.A02;
        return obj;
    }

    public static C18578VuU A01(PromoteData promoteData) {
        PromoteAudienceInfo promoteAudienceInfo = promoteData.A0q;
        0qQ.A06(promoteAudienceInfo);
        return A00(promoteAudienceInfo);
    }
}
