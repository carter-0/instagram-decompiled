package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

/* renamed from: X.JoZ  reason: case insensitive filesystem */
public final class C60626JoZ extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final MediaPickerItemView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60626JoZ(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = DbW.A0B(view, R.id.media_picker_gallery_folder_name);
        this.A00 = DbW.A0B(view, R.id.media_picker_gallery_folder_count);
        this.A02 = (MediaPickerItemView) AnonymousClass7TE.A0b(view, R.id.media_picker_gallery_item_preview);
    }
}
