package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EGn  reason: case insensitive filesystem */
public final class C47776EGn extends C232232tF {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C47253Dte dte = (C47253Dte) r5;
        C46913DnT dnT = (C46913DnT) r6;
        AnonymousClass7TG.A1N(dte, dnT);
        U56 u56 = dnT.A00;
        u56.A00();
        DbY.A0z(u56);
        Context A0S = AnonymousClass7TE.A0S(u56);
        u56.A01(C66909Mes.A00(A0S, dte.A02));
        IgTextView igTextView = u56.A03;
        if (igTextView == null) {
            0qQ.A0F("headerText");
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setMaxLines(2);
        C266444Yx r0 = dte.A01;
        if (r0 != null) {
            u56.A03(C66909Mes.A00(A0S, r0).toString(), FP1.A00(dte, 5));
        }
    }

    public final Class modelClass() {
        return C47253Dte.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        return new C46913DnT(new U56(AnonymousClass7TE.A0S(viewGroup)));
    }
}
