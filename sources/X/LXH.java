package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public final class LXH implements View.OnClickListener {
    public final /* synthetic */ UpcomingEvent A00;
    public final /* synthetic */ C63820L8b A01;

    public LXH(UpcomingEvent upcomingEvent, C63820L8b l8b) {
        this.A01 = l8b;
        this.A00 = upcomingEvent;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-155420106);
        C63820L8b l8b = this.A01;
        UpcomingEvent upcomingEvent = this.A00;
        AnonymousClass36U A002 = AnonymousClass36R.A00(l8b.A00.requireContext(), l8b.A01, (AnonymousClass36P) l8b.A03.getValue());
        AnonymousClass36W r7 = AnonymousClass36W.FOLLOWERS_SHARE;
        JWU jwu = new JWU(r7);
        jwu.A07 = true;
        jwu.A0A = false;
        AnonymousClass36U.A03((Bundle) null, EXF.A0F, A002, new MediaCaptureConfig(jwu), r7, upcomingEvent, (String) null, (List) null, -1, 10001, true, false);
        AnonymousClass0fD.A0C(1398752621, A05);
    }
}
