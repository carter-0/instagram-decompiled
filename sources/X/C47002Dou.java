package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Dou  reason: case insensitive filesystem */
public final class C47002Dou extends C249703kE {
    public ImageUrl A00;
    public final ImageView A01;
    public final TextView A02;
    public final String A03;
    public final C62320sa A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47002Dou(View view, String str, C62320sa r4) {
        super(view);
        0qQ.A0B(r4, 3);
        this.A03 = str;
        this.A04 = r4;
        FP8.A01(view, 21, this);
        this.A01 = DbU.A0F(view, R.id.direct_share_facepile_view);
        this.A02 = DbU.A0G(view, R.id.direct_share_facepile_overflow_text);
    }
}
