package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* renamed from: X.6dC  reason: invalid class name and case insensitive filesystem */
public final class C311756dC {
    public final Context A00;
    public final EffectCollectionService A01;
    public final C312116dq A02;
    public final C262224Cq A03;

    public C311756dC(Context context, EffectCollectionService effectCollectionService, C312116dq r4, C262224Cq r5) {
        0qQ.A0B(effectCollectionService, 2);
        this.A00 = context;
        this.A01 = effectCollectionService;
        this.A02 = r4;
        this.A03 = r5;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.8Yi] */
    public final Object A00(C391589tK r14, 28D r15, UserSession userSession, AnonymousClass1Xo r17, String str, String str2, String str3, AnonymousClass4D7 r21) {
        AnonymousClass1Xo r8 = r17;
        String BpP = r8.BpP();
        C243373Ym r0 = C243373Ym.SAVED;
        ? obj = new Object();
        obj.A01 = BpP;
        obj.A00 = r0;
        return 1Eo.A00(r21, this.A03.ArX(), new C58098ImK(r14, r15, this, userSession, obj, r8, str, str3, str2, (AnonymousClass4D7) null));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.8Yi] */
    public final Object A01(C391589tK r14, 28D r15, UserSession userSession, AnonymousClass1Xo r17, String str, String str2, AnonymousClass4D7 r20) {
        AnonymousClass1Xo r8 = r17;
        String BpP = r8.BpP();
        C243373Ym r0 = C243373Ym.NOT_SAVED;
        ? obj = new Object();
        obj.A01 = BpP;
        obj.A00 = r0;
        return 1Eo.A00(r20, this.A03.ArX(), new C58098ImK(r14, r15, this, userSession, obj, r8, str, str2, (String) null, (AnonymousClass4D7) null));
    }
}
