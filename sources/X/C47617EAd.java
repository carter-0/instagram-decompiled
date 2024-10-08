package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.EAd  reason: case insensitive filesystem */
public final class C47617EAd extends C231632rz {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final G82 A02;
    public final boolean A03;
    public final boolean A04;

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(-467235598);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            G82 g82 = this.A02;
            boolean z = this.A04;
            boolean z2 = this.A03;
            boolean z3 = this.A00;
            F8B.A01(view.getContext(), this.A01, g82, (C46974DoS) tag, (F06) obj3, z, z2, z3);
            AnonymousClass0fD.A0A(-1015584410, A032);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(210962906, A032);
        throw A0y;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47617EAd(AnonymousClass0iw r1, G82 g82, boolean z, boolean z2) {
        this.A02 = g82;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, -1533217654);
        View A002 = F8B.A00(viewGroup);
        AnonymousClass0fD.A0A(-2094308655, A042);
        return A002;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
