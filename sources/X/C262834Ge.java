package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Ge  reason: invalid class name and case insensitive filesystem */
public final class C262834Ge {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 43));
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9LN(this, 44));

    public final AnonymousClass9IV A00(Context context, 1Xj r20, 1Xj r21, AnonymousClass4DU r22, AnonymousClass3W1 r23, C262864Gh r24) {
        AnonymousClass9II r3;
        0qQ.A0B(r24, 6);
        1Xj r7 = r21;
        Context context2 = context;
        1Xj r9 = r20;
        AnonymousClass4DU r10 = r22;
        AnonymousClass3W1 r8 = r23;
        if (r7.A4n()) {
            r3 = new AnonymousClass9II(((C262734Fu) this.A01.getValue()).A00(context2, r9, r7, r10, r8));
        } else {
            r3 = new AnonymousClass9II(((C246293eL) this.A02.getValue()).A00(context2, r9, r7, r10, r8));
        }
        return new AnonymousClass9IV(24, (Object) r3, (Object) new AnonymousClass9IE((Object) new C377519Md(4, context2, r7, r8, r9, r10, this), 23));
    }

    public C262834Ge(UserSession userSession) {
        this.A00 = userSession;
    }
}
