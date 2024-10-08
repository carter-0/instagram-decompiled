package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8NI  reason: invalid class name */
public final class AnonymousClass8NI implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8ME A00;

    public AnonymousClass8NI(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r8 = this.A00;
        FragmentActivity requireActivity = r8.A0l.requireActivity();
        UserSession userSession = r8.A0r;
        AnonymousClass80U r7 = r8.A1B;
        View view = r8.A0h;
        C40309AZy aZy = new C40309AZy(view);
        return new C19319WUb(view, requireActivity, userSession, r8.A0s, r8.A0z, aZy, r7, r8, "subscriber_chat_sticker_bundle_id");
    }
}
