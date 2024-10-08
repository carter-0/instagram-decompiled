package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.LIl  reason: case insensitive filesystem */
public abstract class C64005LIl {
    public static final View A00(ViewGroup viewGroup) {
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        View inflate = LayoutInflater.from(A0S).inflate(R.layout.suggestion_cell_panavision, viewGroup, false);
        A0S.getDrawable(R.drawable.creation_suggestion_pill_bg);
        0qQ.A07(inflate);
        return inflate;
    }

    public static C60636Joj A01(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        return new C60636Joj(A00(viewGroup));
    }
}
