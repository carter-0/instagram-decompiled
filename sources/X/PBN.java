package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;

public final class PBN implements C328007Db {
    public final Drawable A00 = C328037De.A00();
    public final LayoutInflater A01;
    public final View A02;
    public final ViewGroup A03;
    public final IgLinearLayout A04;
    public final IgLinearLayout A05;
    public final IgTextView A06;
    public final IgTextView A07;

    public PBN(LayoutInflater layoutInflater, IgLinearLayout igLinearLayout) {
        0qQ.A0B(igLinearLayout, 1);
        this.A05 = igLinearLayout;
        this.A01 = layoutInflater;
        this.A07 = DbX.A0Z(igLinearLayout, R.id.title_text);
        this.A06 = DbX.A0Z(igLinearLayout, R.id.subtitle_text);
        this.A02 = AnonymousClass7TF.A0G(igLinearLayout, R.id.title_separator);
        this.A03 = DbX.A0I(igLinearLayout, R.id.subitem_list_layout);
        this.A04 = (IgLinearLayout) AnonymousClass7TF.A0F(igLinearLayout, R.id.cta_button_list_layout);
    }

    public final View BJd() {
        return this.A05;
    }
}
