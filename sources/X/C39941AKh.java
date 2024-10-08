package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.AKh  reason: case insensitive filesystem */
public final class C39941AKh implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ UpcomingEvent A03;

    public C39941AKh(Fragment fragment, AnonymousClass0iw r2, UserSession userSession, UpcomingEvent upcomingEvent) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = upcomingEvent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1pS A002 = C2601144i.A00();
        Fragment fragment = this.A00;
        A002.A01(fragment, fragment.requireActivity(), (FragmentActivity) null, this.A02, this.A03, this.A01.getModuleName(), true);
    }
}
