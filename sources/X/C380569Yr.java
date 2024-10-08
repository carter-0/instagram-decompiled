package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.9Yr  reason: invalid class name and case insensitive filesystem */
public final class C380569Yr extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final /* synthetic */ C367578rE A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380569Yr(Context context, View view, C367578rE r5) {
        super(view);
        0qQ.A0B(view, 3);
        this.A06 = r5;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.context_menu_item);
        this.A03 = (TextView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_label);
        this.A05 = (TextView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_sub_label);
        this.A02 = (ImageView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_start_icon);
        ImageView imageView = (ImageView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_end_icon);
        this.A01 = imageView;
        this.A04 = (TextView) AnonymousClass7TE.A0b(view, R.id.context_menu_item_new_badge);
        imageView.setColorFilter(AnonymousClass7TF.A03(context, R.attr.igds_color_primary_icon));
    }
}
