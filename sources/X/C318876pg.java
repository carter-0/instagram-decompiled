package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6pg  reason: invalid class name and case insensitive filesystem */
public final class C318876pg extends 1P0 {
    public final C317776no A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03 = true;

    public C318876pg(C317776no r2, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = z;
    }

    public final void A00(AnonymousClass3HO r11) {
        int A032 = AnonymousClass0fD.A03(-904297177);
        0qQ.A0B(r11, 0);
        boolean z = this.A03;
        C239753Ia A002 = r11.FH3();
        UserSession userSession = this.A01;
        List A012 = AnonymousClass3P8.A01(userSession, A002);
        boolean z2 = this.A02;
        0qQ.A0B(userSession, 1);
        ArrayList arrayList = new ArrayList();
        int size = A012.size();
        for (int i = 0; i < size; i++) {
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A033 = ReelStore.A03(userSession);
            0qQ.A07(A033);
            arrayList.add(A033.A0I((AnonymousClass3HX) A012.get(i), z2));
        }
        this.A00.DJS(r11, arrayList, z);
        AnonymousClass0fD.A0A(1749849110, A032);
    }

    public final void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(929918617);
        this.A00.DJQ(this.A03);
        AnonymousClass0fD.A0A(1116213663, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-100387146);
        this.A00.DJP(this.A03);
        AnonymousClass0fD.A0A(1218678329, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(692742360);
        this.A00.DJR(this.A03);
        AnonymousClass0fD.A0A(-1056062266, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(2021745168);
        A00((AnonymousClass3HO) obj);
        AnonymousClass0fD.A0A(968696506, A032);
    }
}
