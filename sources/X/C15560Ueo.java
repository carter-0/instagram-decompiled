package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

/* renamed from: X.Ueo  reason: case insensitive filesystem */
public final class C15560Ueo extends C231632rz {
    public float A00 = -1.0f;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C267644bx A03;
    public final AnonymousClass32J A04;

    public C15560Ueo(AnonymousClass0iw r2, UserSession userSession, C267644bx r4, AnonymousClass32J r5) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return JTR.A0G(((1Xj) obj).getId());
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return C321466uD.A00(this.A02, (1Xj) obj);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        View view2 = view;
        Object obj4 = obj2;
        int A032 = AnonymousClass0fD.A03(1201602383);
        AnonymousClass7TG.A1U(view2, obj3, obj4);
        VZV vzv = (VZV) obj4;
        ? r8 = (IgMultiImageButton) view2;
        int i2 = vzv.A02;
        int i3 = vzv.A03;
        int i4 = vzv.A01;
        int i5 = vzv.A00;
        float f = this.A00;
        AnonymousClass32J r6 = this.A04;
        C267644bx r5 = this.A03;
        C321496uH.A02(this.A01, this.A02, (1Xj) obj3, r5, r6, (AnonymousClass726) null, r8, (String) null, (String) null, f, i2, i3, i4, i5, false, false, false);
        C321496uH.A01(AnonymousClass7TE.A0S(r8), r8, vzv.A04);
        AnonymousClass0fD.A0A(250249187, A032);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, 1241217306);
        ? A002 = C321496uH.A00(AnonymousClass7TE.A0S(viewGroup));
        AnonymousClass0fD.A0A(1627971993, A042);
        return A002;
    }
}
