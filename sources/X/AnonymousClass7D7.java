package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7D7  reason: invalid class name */
public final class AnonymousClass7D7 implements AnonymousClass7D2 {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        return new AnonymousClass7ED(2b1.A01(layoutInflater.inflate(R.layout.sticker_reaction_pill, viewGroup, false), false, false));
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r2, AnonymousClass7FW r3) {
        AnonymousClass7ED r22 = (AnonymousClass7ED) r2;
        0qQ.A0B(r22, 0);
        if (r3 != null) {
            r22.A00.getView();
        }
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        AnonymousClass7ED r32 = (AnonymousClass7ED) r3;
        if (r32 != null) {
            r32.A01.A00 = null;
        }
    }

    public AnonymousClass7D7(UserSession userSession) {
        this.A00 = userSession;
    }
}
