package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.7RL  reason: invalid class name */
public final class AnonymousClass7RL extends C327997Da {
    public final AnonymousClass7EZ A01(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        AnonymousClass7EZ A01 = super.createViewHolder(layoutInflater, viewGroup);
        C328217Dy r1 = A01.A07;
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.direct.messagethread.commondecorations.RootSwitcher.Frame");
        ViewGroup.LayoutParams layoutParams = ((C328207Dx) r1).A00.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(0);
        marginLayoutParams.setMarginStart(0);
        return A01;
    }

    public final Class modelClass() {
        return N6A.class;
    }
}
