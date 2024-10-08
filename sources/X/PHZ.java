package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

public final class PHZ implements C66491MTu {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 2MD A01;
    public final /* synthetic */ C254783t2 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public PHZ(UserSession userSession, 2MD r2, C254783t2 r3, String str, String str2, boolean z, boolean z2) {
        this.A01 = r2;
        this.A00 = userSession;
        this.A02 = r3;
        this.A03 = str;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = str2;
    }

    public final void D1x(Context context) {
        FragmentActivity A062;
        if (1pE.A18 != null && (A062 = this.A01.A06()) != null) {
            1pE A012 = 1pE.A01(A062, O4K.A00, this.A00, "banner");
            A012.A0B = this.A02;
            A012.A0Y = this.A03;
            A012.A0w = this.A05;
            A012.A11 = this.A06;
            A012.A06();
        }
    }

    public final void onDismiss() {
        1Xc.A01().A04(this.A00, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, this.A04);
    }
}
