package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;

/* renamed from: X.LXa  reason: case insensitive filesystem */
public final class C64248LXa implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C310306am A01;
    public final /* synthetic */ UpcomingEvent A02;
    public final /* synthetic */ User A03;

    public C64248LXa(Context context, C310306am r2, UpcomingEvent upcomingEvent, User user) {
        this.A00 = context;
        this.A03 = user;
        this.A02 = upcomingEvent;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-986464403);
        Intent A09 = DbS.A09();
        Intent action = A09.setAction("android.intent.action.SEND");
        Context context = this.A00;
        String username = this.A03.getUsername();
        UpcomingEvent upcomingEvent = this.A02;
        String id = upcomingEvent.getId();
        Uri.Builder buildUpon = 0cp.A03(002.A0R(C66579MXk.A00(327), username)).buildUpon();
        if (id == null) {
            id = "";
        }
        action.putExtra("android.intent.extra.TEXT", DbW.A0h(context, buildUpon.appendQueryParameter("upcoming_event_id", id).build(), 2131965366)).setType("text/plain");
        0kR.A00(context, Intent.createChooser(A09, (CharSequence) null));
        this.A01.A04(upcomingEvent, C18810W3l.A04(upcomingEvent), "share_link", C273654mx.A00(898));
        AnonymousClass0fD.A0C(860472538, A05);
    }
}
