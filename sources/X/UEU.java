package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class UEU extends C249703kE {
    public ColorStateList A00;
    public boolean A01;
    public boolean A02;
    public final Drawable A03;
    public final SparseArray A04;

    public final View A00(int i) {
        SparseArray sparseArray = this.A04;
        View view = (View) sparseArray.get(i);
        if (view == null && (view = this.itemView.findViewById(i)) != null) {
            sparseArray.put(i, view);
        }
        return view;
    }

    public UEU(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.A04 = sparseArray;
        TextView A0d = AnonymousClass7TE.A0d(view, 16908310);
        sparseArray.put(16908310, A0d);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.A03 = view.getBackground();
        if (A0d != null) {
            this.A00 = A0d.getTextColors();
        }
    }
}
