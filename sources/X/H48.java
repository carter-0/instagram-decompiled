package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class H48 extends C231632rz implements C231652s1 {
    public AnonymousClass310 A00;
    public final AnonymousClass2s3 A01;
    public final UserSession A02;

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        boolean z = obj instanceof AnonymousClass3OA;
        AnonymousClass2s3 r1 = this.A01;
        if (z) {
            obj = 1Xi.A01(((AnonymousClass3OA) obj).A0K);
        }
        return r1.getIdentifier(i, obj, obj2);
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        boolean z = obj instanceof AnonymousClass3OA;
        AnonymousClass2s3 r1 = this.A01;
        if (z) {
            obj = 1Xi.A01(((AnonymousClass3OA) obj).A0K);
        }
        return r1.getViewModelHash(i, obj, obj2);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        AnonymousClass3OA r4 = (AnonymousClass3OA) obj;
        AnonymousClass3W1 r5 = (AnonymousClass3W1) obj2;
        AnonymousClass7TG.A1T(r3, r4, r5);
        AnonymousClass310 r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.BRO().E4A(r5, r4);
        this.A01.buildRowViewTypes(r3, 1Xi.A01(r4.A0K), r5);
    }

    public final int getViewTypeCount() {
        return AnonymousClass2s3.A0a;
    }

    public H48(UserSession userSession, AnonymousClass2s3 r2) {
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void AHO(1Xj r2, AnonymousClass3W1 r3, int i) {
        AnonymousClass7TG.A1O(r2, r3);
        this.A01.AHO(r2, r3, i);
    }

    public final void E3r(1Xj r2, AnonymousClass3W1 r3, Integer num, int i) {
        AnonymousClass7TG.A1U(r2, r3, num);
        this.A01.E3r(r2, r3, num, i);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass2s3 r1;
        int A03 = AnonymousClass0fD.A03(-776065386);
        AnonymousClass7TG.A1U(view, obj, obj2);
        if (obj instanceof AnonymousClass3OA) {
            AnonymousClass3OA r6 = (AnonymousClass3OA) obj;
            1wN.A00(this.A02).A01(r6);
            r1 = this.A01;
            obj = 1Xi.A01(r6.A0K);
        } else {
            r1 = this.A01;
        }
        r1.bindView(i, view, obj, obj2);
        AnonymousClass0fD.A0A(-369051828, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1158352407);
        View createView = this.A01.createView(i, viewGroup);
        AnonymousClass0fD.A0A(964187140, A04);
        return createView;
    }

    public H48() {
    }
}
