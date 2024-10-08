package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Don  reason: case insensitive filesystem */
public final class C46995Don extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgdsButton A03;

    public C46995Don(View view) {
        super(view);
        this.A00 = view;
        this.A02 = DbT.A0b(view, R.id.sticker_image);
        this.A01 = DbU.A0G(view, R.id.sticker_name);
        this.A03 = DbU.A0b(view, R.id.button);
    }
}
