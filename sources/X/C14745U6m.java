package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.U6m  reason: case insensitive filesystem */
public final class C14745U6m extends ConstraintLayout {
    public final IgTextView A00 = DbT.A0a(this, R.id.description_text_view);
    public final IgTextView A01 = DbT.A0a(this, R.id.header_text_view);

    public C14745U6m(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.lead_gen_view_creatives_bullet_point, this);
    }

    public final void A0D(String str, String str2) {
        0qQ.A0B(str2, 1);
        IgTextView igTextView = this.A01;
        int i = 0;
        if (str == null) {
            i = 8;
        }
        igTextView.setVisibility(i);
        igTextView.setText(str);
        this.A00.setText(str2);
    }
}
