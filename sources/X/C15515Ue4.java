package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Ue4  reason: case insensitive filesystem */
public final class C15515Ue4 extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15515Ue4(Context context, AnonymousClass0iw r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1861433085);
        AnonymousClass7TG.A1O(view, obj);
        Context context = this.A00;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.adtools.binder.HighlightsHubImageTextArrowViewBinder.Holder");
        C18144VmK.A01(context, (C14875UDd) tag, (WOP) obj, this.A01);
        AnonymousClass0fD.A0A(-180251906, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -332907975);
        ViewGroup A002 = C18144VmK.A00(this.A00, viewGroup);
        AnonymousClass0fD.A0A(2136086873, A04);
        return A002;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
