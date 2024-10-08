package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.HcJ  reason: case insensitive filesystem */
public abstract class C55110HcJ {
    public static final void A00(C55881Hp2 hp2) {
        IgImageView igImageView = hp2.A08;
        igImageView.setAlpha(1.0f);
        TextView textView = hp2.A03;
        textView.setAlpha(1.0f);
        IgImageView igImageView2 = hp2.A09;
        igImageView2.setAlpha(1.0f);
        View.OnClickListener onClickListener = hp2.A00;
        if (onClickListener != null) {
            AnonymousClass0fU.A00(onClickListener, igImageView2);
            AnonymousClass0fU.A00(hp2.A00, igImageView);
            AnonymousClass0fU.A00(hp2.A00, textView);
        }
    }
}
