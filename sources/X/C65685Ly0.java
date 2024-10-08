package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Ly0  reason: case insensitive filesystem */
public final class C65685Ly0 implements MVG {
    public final View A00;
    public final View A01 = AnonymousClass7TE.A0b(this.A00, R.id.chevron_icon);
    public final View A02 = AnonymousClass7TE.A0b(this.A00, R.id.info_icon);
    public final TextView A03;
    public final TextView A04 = DbW.A0B(this.A00, R.id.secondary_text);
    public final IgSimpleImageView A05 = ((IgSimpleImageView) this.A00.findViewById(R.id.icon));

    public final View AnA() {
        return this.A01;
    }

    public final View AqN() {
        return this.A00;
    }

    public final View BGz() {
        return this.A02;
    }

    public final TextView Bql() {
        return this.A04;
    }

    public C65685Ly0(View view) {
        this.A00 = view;
        this.A03 = DbW.A0B(view, R.id.primary_text);
    }
}
