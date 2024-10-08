package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Jot  reason: case insensitive filesystem */
public final class C60646Jot extends C249703kE {
    public final ViewStub A00;
    public final TextView A01;
    public final TextView A02;
    public final Integer A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60646Jot(View view, Integer num) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = num;
        this.A00 = DbS.A0F(view, R.id.info_icon);
        this.A02 = AnonymousClass7TE.A0d(view, R.id.info_header);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.info_text);
    }
}
