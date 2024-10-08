package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.Jon  reason: case insensitive filesystem */
public final class C60640Jon extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgdsCheckBox A03;

    public C60640Jon(View view) {
        super(view);
        this.A01 = DbW.A0B(view, R.id.series_title);
        this.A00 = DbW.A0B(view, R.id.series_description);
        this.A02 = DbW.A0B(view, R.id.series_video_count);
        this.A03 = (IgdsCheckBox) AnonymousClass7TE.A0b(view, R.id.series_checkbox);
    }
}
