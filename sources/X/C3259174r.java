package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;

/* renamed from: X.74r  reason: invalid class name and case insensitive filesystem */
public final class C3259174r extends C327997Da {
    public final AnonymousClass7EZ A01(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        return super.createViewHolder(layoutInflater, viewGroup);
    }

    /* renamed from: A03 */
    public final void bind(AnonymousClass7EZ r3, C66818MdA mdA) {
        0qQ.A0B(mdA, 0);
        0qQ.A0B(r3, 1);
        super.bind(mdA, r3);
        C328217Dy r1 = r3.A07;
        if (r1 instanceof C328207Dx) {
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.direct.messagethread.commondecorations.RootSwitcher.Frame");
            LinearLayout linearLayout = ((C328207Dx) r1).A00;
            View requireViewById = linearLayout.requireViewById(R.id.message_content_horizontal_placeholder_container);
            0qQ.A07(requireViewById);
            AnonymousClass7PV.A01(requireViewById);
            if (mdA.A00.A00.CU2()) {
                View requireViewById2 = linearLayout.requireViewById(R.id.message_pills_container);
                0qQ.A07(requireViewById2);
                ViewGroup.LayoutParams layoutParams = requireViewById2.getLayoutParams();
                0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams).gravity = 8388613;
            }
        }
    }

    public final Class modelClass() {
        return C66818MdA.class;
    }
}
