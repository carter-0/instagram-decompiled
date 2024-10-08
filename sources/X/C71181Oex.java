package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.instagram.wellbeing.limitedprofile.activity.LimitedInteractionsReminderActivity;

/* renamed from: X.Oex  reason: case insensitive filesystem */
public final class C71181Oex implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass921 A00;

    public C71181Oex(AnonymousClass921 r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass921 r0 = this.A00;
        Context context = r0.A01;
        Intent putExtra = C66580MXl.A0A(context, LimitedInteractionsReminderActivity.class).putExtra("IgSessionManager.SESSION_TOKEN_KEY", r0.A05.A05).putExtra("LimitedInteractionsSettingsFragment.SHOULD_SHOW_BOTTOM_SHEET", true);
        0qQ.A07(putExtra);
        putExtra.setFlags(268435456);
        0kR.A0B(context, putExtra);
    }
}
