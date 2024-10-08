package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.MxO  reason: case insensitive filesystem */
public final class C67938MxO extends C249703kE {
    public final IgSimpleImageView A00;
    public final IgdsListCell A01;

    public C67938MxO(View view) {
        super(view);
        this.A01 = (IgdsListCell) AnonymousClass7TF.A0F(view, R.id.folder_item_cell);
        this.A00 = DbX.A0Y(view, R.id.folder_drag_handle);
    }
}
