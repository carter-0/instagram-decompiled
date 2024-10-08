package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FJr  reason: case insensitive filesystem */
public final class C50032FJr implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C62320sa A03;

    public C50032FJr(AnonymousClass0iw r1, UserSession userSession, String str, C62320sa r4) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = r4;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        UserSession userSession = this.A01;
        27r A012 = 27p.A01(userSession);
        A012.A1Q(A012.A04.A0C, "META_CLOUD_ALBUM_NUX_DISMISS");
        AnonymousClass9PQ.A06(this.A00, userSession, AnonymousClass05K.A01, this.A02);
        C62320sa r0 = this.A03;
        if (r0 != null) {
            r0.invoke();
        }
    }
}
