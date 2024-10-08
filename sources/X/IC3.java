package X;

import android.view.View;
import com.instagram.user.model.UpcomingEvent;

public final class IC3 implements View.OnClickListener {
    public final /* synthetic */ C17530VZj A00;
    public final /* synthetic */ C317626nZ A01;
    public final /* synthetic */ UpcomingEvent A02;
    public final /* synthetic */ String A03;

    public IC3(C17530VZj vZj, C317626nZ r2, UpcomingEvent upcomingEvent, String str) {
        this.A01 = r2;
        this.A02 = upcomingEvent;
        this.A03 = str;
        this.A00 = vZj;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1591588030);
        this.A01.DvJ(this.A00, this.A02, this.A03);
        AnonymousClass0fD.A0C(1071377522, A05);
    }
}
