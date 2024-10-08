package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.UDm  reason: case insensitive filesystem */
public final class C14884UDm extends C249703kE {
    public View.OnClickListener A00;
    public final View A01;
    public final TextView A02;
    public final AnonymousClass3NM A03;
    public final IgImageView A04;

    public C14884UDm(View view) {
        super(view);
        this.A01 = view;
        this.A02 = DbU.A0G(view, R.id.question_see_all_text);
        this.A04 = DbT.A0b(view, R.id.question_see_all_arrow);
        AnonymousClass3NG r2 = new AnonymousClass3NG(view);
        r2.A04 = new C15848UjY(this, 28);
        r2.A07 = true;
        r2.A0C = true;
        AnonymousClass3NM A002 = r2.A00();
        this.A03 = A002;
        view.setOnTouchListener(A002);
    }
}
