package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;

public final class QEY extends 2Rw {
    public S61[] A00;
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r3, int i) {
        0qQ.A0B((Object) null, 0);
        throw AnonymousClass7TE.A11(DialogModule.KEY_TITLE);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A0C = JTP.A0C(viewGroup, 0);
        C11426STk.A05();
        View A0D = DbT.A0D(Pxi.A0F(A0C, R.style.BSCIGTheme), viewGroup, R.layout.msc_pivot_bar_item, false);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A07(A0D.findViewById(R.id.item_title));
        0qQ.A07(A0D.findViewById(R.id.selected_indicator));
        C11426STk.A03().A00(AnonymousClass7TE.A0S(A0D), 18);
        throw AnonymousClass00P.createAndThrow();
    }

    public QEY(0sP r1, S61[] s61Arr) {
        this.A00 = s61Arr;
        this.A01 = r1;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-917264102);
        int length = this.A00.length;
        AnonymousClass0fD.A0A(-1475726058, A03);
        return length;
    }
}
