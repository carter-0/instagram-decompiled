package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.W4a  reason: case insensitive filesystem */
public final class C18813W4a implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C18813W4a(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = z;
        this.A02 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        UserSession userSession;
        int i = this.A00;
        VFY.A00((C17589Vah) this.A01, "cancel", "dialog", (String) null, this.A03);
        Object obj = this.A02;
        if (i != 0) {
            userSession = ((C19200WPg) obj).A07;
        } else {
            userSession = (UserSession) obj;
        }
        C49089EpE.A00(userSession).A00();
    }
}
