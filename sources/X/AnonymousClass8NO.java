package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8NO  reason: invalid class name */
public final class AnonymousClass8NO implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass07i A00;
    public final /* synthetic */ AnonymousClass8ME A01;

    public AnonymousClass8NO(AnonymousClass07i r1, AnonymousClass8ME r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r7 = this.A01;
        Context context = r7.A0f;
        UserSession userSession = r7.A0r;
        AnonymousClass07i r2 = this.A00;
        AnonymousClass4DH r3 = r7.A0l;
        String str = r7.A1p;
        return new AJ2(context, r2, r3, r7.A0o, userSession, AnonymousClass8ME.A0A(r7), r7, str);
    }
}
