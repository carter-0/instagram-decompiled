package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: X.71T  reason: invalid class name */
public final class AnonymousClass71T extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass71T(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1814628622);
        Object tag = view.getTag();
        tag.getClass();
        C3254972u.A02((C3253572b) obj, (AnonymousClass730) tag, (C320156rr) obj2);
        AnonymousClass0fD.A0A(-960849321, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1104655762);
        View A002 = C3254972u.A00(this.A00, viewGroup);
        AnonymousClass0fD.A0A(-395420675, A03);
        return A002;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{Integer.valueOf(i)});
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{obj, obj2});
    }
}
