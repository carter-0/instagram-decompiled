package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Lxz  reason: case insensitive filesystem */
public final class C65684Lxz implements MVG {
    public View A00 = AnonymousClass7TF.A0G(this.A05, R.id.chevron_icon);
    public TextView A01;
    public IgSimpleImageView A02 = DbX.A0Y(this.A05, R.id.icon);
    public View A03 = AnonymousClass7TF.A0G(this.A05, R.id.info_icon);
    public TextView A04 = AnonymousClass7TG.A0R(this.A05, R.id.inline_subtitle);
    public final View A05;

    public final View AnA() {
        return this.A00;
    }

    public final View AqN() {
        return this.A05;
    }

    public final View BGz() {
        return this.A03;
    }

    public final TextView Bql() {
        return this.A04;
    }

    public C65684Lxz(View view) {
        this.A05 = view;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.title);
    }
}
