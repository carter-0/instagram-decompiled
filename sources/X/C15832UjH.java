package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.UjH  reason: case insensitive filesystem */
public final class C15832UjH extends IgLinearLayout {
    public final ImageView A00 = DbS.A0G(this, R.id.chevron_icon);
    public final TextView A01 = AnonymousClass7TE.A0d(this, R.id.title_text);

    public C15832UjH(Context context) {
        super(context, (AttributeSet) null, 0);
        DbV.A0D(this).inflate(R.layout.promote_secondary_row_with_chevron, this, true);
    }
}
