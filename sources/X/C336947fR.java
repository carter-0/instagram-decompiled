package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7fR  reason: invalid class name and case insensitive filesystem */
public final class C336947fR extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C336947fR(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(2086997493);
        C39695A5l a5l = (C39695A5l) obj2;
        Object tag = view.getTag();
        tag.getClass();
        FCV.A02((C46448DfA) obj, (C46896DnC) tag, a5l.A00, a5l.A01);
        AnonymousClass0fD.A0A(-13880068, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-2038080600);
        View view = FCV.A00(this.A00, viewGroup, false).itemView;
        AnonymousClass0fD.A0A(-562385633, A03);
        return view;
    }
}
