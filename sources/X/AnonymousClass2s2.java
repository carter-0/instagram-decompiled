package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.2s2  reason: invalid class name */
public final class AnonymousClass2s2 extends C231632rz {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
        if (this.A04) {
            r2.A7U(1);
        }
    }

    public final String getBinderGroupName() {
        return "Gap";
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (i == 0) {
            return this.A03;
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(1763085996);
        if (i == 0) {
            if (this.A03 != view.getLayoutParams().height) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = this.A03;
                view.setLayoutParams(layoutParams);
            }
            int i2 = this.A00;
            if (i2 != 0) {
                view.setBackgroundColor(view.getContext().getColor(i2));
            }
        }
        AnonymousClass0fD.A0A(-496761143, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A032 = AnonymousClass0fD.A03(1214308490);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            inflate = from.inflate(R.layout.gap_binder_layout, viewGroup, false);
            i2 = -2024317049;
        } else if (i == 1) {
            inflate = from.inflate(R.layout.divider_layout, viewGroup, false);
            View requireViewById = inflate.requireViewById(R.id.divider);
            int i3 = this.A01;
            if (i3 != 0) {
                requireViewById.setBackgroundColor(requireViewById.getContext().getColor(i3));
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) requireViewById.getLayoutParams();
            int i4 = this.A02;
            marginLayoutParams.leftMargin = i4;
            marginLayoutParams.rightMargin = i4;
            i2 = 803393162;
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(002.A0O(AnonymousClass000.A00(964), i));
            AnonymousClass0fD.A0A(1173193140, A032);
            throw illegalArgumentException;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return inflate;
    }
}
