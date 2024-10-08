package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fie  reason: case insensitive filesystem */
public final class C50798Fie implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        FragmentActivity fragmentActivity = this.A00;
        DbW.A0W(fragmentActivity, A0a, this.A01, ModalActivity.class, "direct_pick_video_call_recipients").A0C(fragmentActivity);
    }

    public C50798Fie(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
