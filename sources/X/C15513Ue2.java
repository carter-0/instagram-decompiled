package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.Ue2  reason: case insensitive filesystem */
public final class C15513Ue2 extends C231632rz {
    public final C229382nI A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15513Ue2(C229382nI r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1337068595);
        AnonymousClass7TG.A1O(view, obj);
        C229382nI r0 = this.A00;
        C18249VoG.A01(r0, (C3034368u) obj, (VYT) view.getTag());
        AnonymousClass0fD.A0A(298257543, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 949605069);
        FrameLayout A002 = C18249VoG.A00(AnonymousClass7TE.A0S(viewGroup), viewGroup);
        AnonymousClass0fD.A0A(-100001234, A04);
        return A002;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
