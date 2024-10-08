package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.3rx  reason: invalid class name and case insensitive filesystem */
public final class C254113rx extends C249703kE {
    public TextView A00;
    public EditPhoneNumberView A01;
    public final ViewStub A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final ViewGroup A06;

    public C254113rx(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.dismiss_button);
        0qQ.A07(requireViewById);
        ImageView imageView = (ImageView) requireViewById;
        this.A03 = imageView;
        imageView.getDrawable().mutate().setColorFilter(AnonymousClass37O.A00(view.getContext().getColor(R.color.grey_5)));
        this.A05 = (TextView) view.requireViewById(R.id.title);
        this.A04 = (TextView) view.requireViewById(R.id.message);
        this.A02 = (ViewStub) view.requireViewById(R.id.inline_edit_view);
        View requireViewById2 = view.requireViewById(R.id.megaphone_content);
        0qQ.A07(requireViewById2);
        View requireViewById3 = view.requireViewById(R.id.button_placeholder);
        0qQ.A07(requireViewById3);
        TextView textView = null;
        ViewGroup A002 = C17006VEg.A00((ViewGroup) requireViewById2, (ViewGroup) requireViewById3, (ViewGroup) null, (C16584Uxe) null, C16584Uxe.ONE_BUTTON_PRIMARY);
        this.A06 = A002;
        this.A00 = A002 != null ? (TextView) A002.findViewById(R.id.primary_button) : textView;
    }
}
