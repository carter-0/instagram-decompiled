package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.9Ys  reason: invalid class name and case insensitive filesystem */
public final class C380579Ys extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final /* synthetic */ C368348sT A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380579Ys(View view, C368348sT r3) {
        super(view);
        0qQ.A0B(view, 2);
        this.A08 = r3;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.context_menu_item);
        this.A07 = (TextView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_label);
        this.A05 = (ImageView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_start_icon);
        this.A04 = (ImageView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_end_icon);
        this.A03 = (FrameLayout) AnonymousClass7TE.A0b(view, R.id.context_menu_item_end_custom_layout);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.context_menu_item_divider);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.context_menu_item_top_divider);
        this.A06 = (TextView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_new_badge);
    }
}
