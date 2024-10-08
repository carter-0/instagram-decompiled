package X;

import android.os.SystemClock;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.IiY  reason: case insensitive filesystem */
public final class C57917IiY implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ AnonymousClass3N2 A02;

    public C57917IiY(UserSession userSession, Reel reel, AnonymousClass3N2 r3) {
        this.A01 = reel;
        this.A02 = r3;
        this.A00 = userSession;
    }

    public final void run() {
        Reel reel = this.A01;
        if (!reel.A0Z()) {
            GradientSpinner Bkt = this.A02.Bkt();
            RingSpec A002 = AnonymousClass3NW.A00(this.A00, reel);
            0qQ.A0B(A002, 0);
            if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(A002.getName())) {
                A002 = (RingSpec) AnonymousClass3Mk.A0A.getValue();
            }
            Bkt.A0E = C240863Mx.A00(A002);
            0qQ.A0B(A002, 0);
            Bkt.A0C = 00k.A0w(A002.BNn());
            Bkt.A0D = C240873My.A00(A002.Byj());
            Bkt.A0B = C240873My.A00(A002.B1X());
            int measuredWidth = Bkt.getMeasuredWidth();
            int measuredHeight = Bkt.getMeasuredHeight();
            Bkt.A0V.setShader(GradientSpinner.A00(Bkt, Bkt.A0C, Bkt.A0D, Bkt.A0B, Bkt.A0E, measuredWidth, measuredHeight));
            Bkt.A08 = SystemClock.elapsedRealtime();
            Bkt.invalidate();
        }
    }
}
