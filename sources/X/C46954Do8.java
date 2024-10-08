package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Do8  reason: case insensitive filesystem */
public final class C46954Do8 extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final RecyclerView A02;

    public C46954Do8(View view) {
        super(view);
        this.A01 = DbW.A0B(view, R.id.h_scroll_section_title);
        this.A00 = DbW.A0B(view, R.id.h_scroll_section_description);
        this.A02 = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.h_scroll_recycle_view);
    }
}
