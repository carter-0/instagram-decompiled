package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class I9M implements DialogInterface.OnShowListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ boolean A03;

    public I9M(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r3, boolean z) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = z;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AnonymousClass0iw A012;
        AnonymousClass5OC r6;
        C52236GKd gKd;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        String A2n = this.A02.A2n();
        boolean z = this.A03;
        if (A2n != null && (A012 = AnonymousClass6WL.A01(fragmentActivity)) != null) {
            if (z) {
                r6 = AnonymousClass5OC.DELETE_AND_MOVE_TO_DRAFTS_DIALOG;
                gKd = C52236GKd.A0d;
            } else {
                r6 = AnonymousClass5OC.MOVE_TO_DRAFTS_DIALOG;
                gKd = C52236GKd.A0s;
            }
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(A012, userSession), "instagram_clips_dialog_impression");
            if (A0e.isSampled()) {
                DbW.A16(A0e, A012);
                C51974G9v.A0l(A0e, 0, Long.parseLong(A2n));
                C51965G9l.A1O(A0e, "");
                C51965G9l.A19(gKd, A0e);
                C51965G9l.A1C(r6, A0e);
                C51973G9u.A10(A0e);
                DbX.A1L(A0e);
            }
        }
    }
}
