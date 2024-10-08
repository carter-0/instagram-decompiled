package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6ch  reason: invalid class name and case insensitive filesystem */
public final class C311446ch {
    public boolean A00;
    public final DialogInterface.OnDismissListener A01;
    public final DialogInterface.OnShowListener A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C310206ab A05;
    public final Set A06 = new HashSet();

    public C311446ch(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, UserSession userSession, AnonymousClass4DU r5, C310206ab r6) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r6, 4);
        0qQ.A0B(onDismissListener, 6);
        this.A03 = userSession;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = new C311456ci(onShowListener, this);
        this.A01 = new C311466cj(onDismissListener, this);
    }
}
