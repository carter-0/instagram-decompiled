package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3rw  reason: invalid class name and case insensitive filesystem */
public final class C254103rw extends C249703kE {
    public TextView A00;
    public TextView A01;
    public ViewGroup A02;
    public C16584Uxe A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final IgImageView A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C254103rw(View view) {
        super(view);
        0qQ.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.dismiss_button);
        0qQ.A07(requireViewById);
        ImageView imageView = (ImageView) requireViewById;
        this.A04 = imageView;
        View requireViewById2 = view.requireViewById(R.id.megaphone_content);
        0qQ.A07(requireViewById2);
        this.A09 = (ViewGroup) requireViewById2;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.mutate().setColorFilter(AnonymousClass37O.A00(view.getContext().getColor(R.color.grey_5)));
            this.A07 = (TextView) view.requireViewById(R.id.title);
            this.A05 = (TextView) view.requireViewById(R.id.message);
            this.A08 = view.requireViewById(R.id.megaphone_icon);
            this.A06 = (TextView) view.requireViewById(R.id.megaphone_social_context_text);
            this.A0A = (ViewGroup) view.requireViewById(R.id.button_placeholder);
            A00(C16584Uxe.TWO_BUTTON_HORIZONTAL);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A00(C16584Uxe uxe) {
        ViewGroup viewGroup = this.A02;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup A002 = C17006VEg.A00(this.A09, this.A0A, viewGroup, this.A03, uxe);
        if (A002 != null) {
            this.A02 = A002;
            this.A03 = uxe;
            this.A01 = (TextView) A002.findViewById(R.id.secondary_button);
            ViewGroup viewGroup2 = this.A02;
            if (viewGroup2 == null) {
                0qQ.A0F("buttonLayout");
                throw AnonymousClass00P.createAndThrow();
            }
            TextView textView = (TextView) viewGroup2.requireViewById(R.id.primary_button);
            0qQ.A0B(textView, 0);
            this.A00 = textView;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
