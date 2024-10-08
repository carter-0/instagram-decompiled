package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.Mve  reason: case insensitive filesystem */
public final class C67834Mve extends C249403jg {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass77W A01;

    public C67834Mve(View view, AnonymousClass77W r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(414156977);
        if (i == 0) {
            AnonymousClass77W r0 = this.A01;
            ArrayList arrayList = r0.A02;
            AnonymousClass0eM r3 = r0.A03;
            arrayList.add(C70866OPf.A01(this.A00, (RecyclerView) r3.getValue(), true));
            ((RecyclerView) r3.getValue()).A16(this);
        }
        AnonymousClass0fD.A0A(-1466567577, A03);
    }
}
