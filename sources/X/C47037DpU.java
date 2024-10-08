package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.DpU  reason: case insensitive filesystem */
public final class C47037DpU extends C249703kE {
    public static final List A05 = 0sr.A1P(new Integer[]{Integer.valueOf(R.id.item_1), Integer.valueOf(R.id.item_2), Integer.valueOf(R.id.item_3)});
    public final Context A00;
    public final View A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgdsButton A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47037DpU(Context context, View view) {
        super(view);
        AnonymousClass7TG.A1O(context, view);
        this.A00 = context;
        this.A01 = view;
        this.A03 = DbX.A0b(view, R.id.image);
        this.A02 = DbX.A0Z(view, R.id.title);
        this.A04 = (IgdsButton) AnonymousClass7TF.A0F(view, R.id.cta_button);
    }
}
