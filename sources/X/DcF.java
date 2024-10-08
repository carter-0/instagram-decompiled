package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class DcF implements C3250670x, CallerContextable {
    public static final String __redex_internal_original_name = "ProfileContactActionButton";
    public final Context A00;
    public final C319866rM A01;
    public final C3250770y A02;
    public final User A03;
    public final ArrayList A04;

    public DcF(Context context, C319866rM r4, User user, ArrayList arrayList) {
        0qQ.A0B(r4, 3);
        this.A00 = context;
        this.A04 = arrayList;
        this.A01 = r4;
        this.A03 = user;
        if (DbT.A1b(arrayList)) {
            if (user.A1d()) {
                r4.FKA(DcF.class, user.getId());
            }
            this.A02 = C3250770y.CONTACT;
            return;
        }
        throw AnonymousClass7TE.A0z("Cannot create a bundled action button without Business actions to bundle");
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        return AnonymousClass7TE.A16(this.A00, 2131956559);
    }

    public final C3250770y Aiv() {
        return this.A02;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        this.A01.CzT(this.A04);
    }
}
