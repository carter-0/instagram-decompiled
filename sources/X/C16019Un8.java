package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;

/* renamed from: X.Un8  reason: case insensitive filesystem */
public final class C16019Un8 extends UBE {
    public final IgTextView A00;
    public final IgdsBulletCell A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16019Un8(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = DbX.A0Z(view, R.id.incentives_text_view);
        this.A01 = (IgdsBulletCell) AnonymousClass7TF.A0F(view, R.id.incentives_bullet_cell);
    }
}
