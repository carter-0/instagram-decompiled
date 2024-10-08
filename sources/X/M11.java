package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class M11 implements C66533MVn {
    public final IgSimpleImageView A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;

    public final View As8() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ View B8U() {
        return this.A00;
    }

    public final View B8V() {
        return this.A02;
    }

    public final TextView B8W() {
        return this.A06;
    }

    public final View B8c() {
        return this.A03;
    }

    public final TextView B8d() {
        return this.A07;
    }

    public final View Blc() {
        return this.A04;
    }

    public final View C2l() {
        return this.A05;
    }

    public M11(View view) {
        this.A01 = AnonymousClass7TE.A0b(view, R.id.create_container);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.info_container);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.text_container);
        View findViewById = view.findViewById(R.id.title_text);
        TextView textView = (TextView) findViewById;
        textView.setText(2131962857);
        0qQ.A07(findViewById);
        this.A07 = textView;
        this.A06 = DbW.A0B(view, R.id.secondary_text);
        this.A04 = AnonymousClass7TE.A0b(view, R.id.clear_button);
        this.A05 = AnonymousClass7TE.A0b(view, R.id.suggested_items_container);
        View findViewById2 = view.findViewById(R.id.icon);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) findViewById2;
        igSimpleImageView.setImageResource(R.drawable.instagram_donations_pano_outline_24);
        0qQ.A07(findViewById2);
        this.A00 = igSimpleImageView;
        AnonymousClass7TE.A0d(view, R.id.create_container_label).setText(2131956858);
    }
}
