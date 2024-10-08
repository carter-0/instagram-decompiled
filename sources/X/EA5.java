package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.nux.cal.model.FxAccountInfo;

public final class EA5 extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EA5(Context context, AnonymousClass0iw r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1559588265);
        AnonymousClass7TG.A1O(view, obj);
        Context context = this.A00;
        Object tag = view.getTag();
        if (tag != null) {
            C49777F6k.A01(context, this.A01, (C48245EbQ) tag, (FxAccountInfo) obj);
            AnonymousClass0fD.A0A(349385307, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(240053117, A03);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -2064730329);
        ViewGroup A002 = C49777F6k.A00(this.A00, viewGroup);
        AnonymousClass0fD.A0A(402917050, A04);
        return A002;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1H(r1);
    }
}
