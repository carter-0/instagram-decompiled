package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GjP  reason: case insensitive filesystem */
public final class C53153GjP extends C249703kE {
    public final TextView A00;
    public final IgLinearLayout A01;
    public final IgImageView A02;
    public final IgImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53153GjP(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.twinbox_filter_text);
        this.A02 = DbX.A0b(view, R.id.twinbox_left_icon);
        this.A03 = DbX.A0b(view, R.id.twinbox_right_icon);
        this.A01 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.twinbox_right_icon_tappable_area);
    }

    public static final C367618rI A00(View view, Integer num, C62320sa r14, int i, boolean z) {
        Drawable drawable;
        Context context = view.getContext();
        String A16 = AnonymousClass7TE.A16(02K.A01(context), i);
        if (num != null) {
            drawable = context.getDrawable(num.intValue());
        } else {
            drawable = null;
        }
        return new C367618rI((Drawable) null, drawable, (C15048ULb) null, new IVF(r14, 1), (Integer) null, A16, 0, 0, 0, false, false, z, true, false, false, false);
    }
}
