package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Jpx  reason: case insensitive filesystem */
public final class C60712Jpx extends C249703kE implements C66533MVn {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;

    public final View As8() {
        return this.A00;
    }

    public final View B8U() {
        return this.A01;
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

    public C60712Jpx(View view) {
        super(view);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.create_fundraiser_container);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.fundraiser_info_container);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.fundraiser_text_container);
        this.A07 = DbW.A0B(view, R.id.fundraiser_title_text);
        this.A06 = DbW.A0B(view, R.id.fundraiser_info_secondary_text);
        this.A04 = AnonymousClass7TE.A0b(view, R.id.remove_fundraiser);
        this.A05 = AnonymousClass7TE.A0b(view, R.id.suggested_fundraisers_container);
        this.A01 = view.findViewById(R.id.icon);
    }
}
