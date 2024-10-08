package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.KGr  reason: case insensitive filesystem */
public final class C61667KGr extends C232232tF {
    public final boolean A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60535Jn6(DbT.A0D(layoutInflater, viewGroup, R.layout.ai_sticker_error_message, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C64760Lhc lhc = (C64760Lhc) r5;
        C60535Jn6 jn6 = (C60535Jn6) r6;
        AnonymousClass7TG.A1N(lhc, jn6);
        View view = jn6.A00;
        TextView A0B = DbW.A0B(view, R.id.error_message);
        A0B.setText(lhc.A00);
        if (this.A00) {
            Context context = A0B.getContext();
            DbU.A14(context, (ImageView) AnonymousClass7TE.A0b(view, R.id.icon), 2Yu.A0B(context));
            DbY.A12(A0B, context);
        }
    }

    public final Class modelClass() {
        return C64760Lhc.class;
    }

    public C61667KGr(boolean z) {
        this.A00 = z;
    }

    public C61667KGr() {
        this(false);
    }
}
