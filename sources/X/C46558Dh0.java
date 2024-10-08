package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.Dh0  reason: case insensitive filesystem */
public final class C46558Dh0 extends AnonymousClass0T0 {
    public final ExploreTopicCluster A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46558Dh0) {
                C46558Dh0 dh0 = (C46558Dh0) obj;
                if (!0qQ.A0K(this.A02, dh0.A02) || !0qQ.A0K(this.A03, dh0.A03) || this.A01 != dh0.A01 || !0qQ.A0K(this.A00, dh0.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TG.A0E(this.A02) * 31);
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "GhostPill";
                break;
            case 2:
                str = "ManageInterest";
                break;
            case 3:
                str = "TopicPickerDefault";
                break;
            case 4:
                str = "TopicPickerFollowed";
                break;
            default:
                str = ServerW3CShippingAddressConstants.DEFAULT;
                break;
        }
        return ((A08 + str.hashCode() + intValue) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C46558Dh0(ExploreTopicCluster exploreTopicCluster, Integer num, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A00 = exploreTopicCluster;
    }
}
