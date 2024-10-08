package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6rD  reason: invalid class name and case insensitive filesystem */
public final class C319786rD extends C249703kE {
    public ViewGroup A00;
    public final View A01;
    public final C322956wg A02;

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public C319786rD(View view, C322956wg r12) {
        super(view);
        this.A02 = r12;
        ViewStub viewStub = (ViewStub) view.requireViewById(R.id.create_highlight_button_view_stub);
        0qQ.A0B(viewStub, 0);
        View inflate = viewStub.inflate();
        0qQ.A0A(inflate);
        inflate.setTag(new C319796rE(inflate));
        this.A01 = inflate;
        inflate.setContentDescription(view.getResources().getString(2131956865));
        2eS.A04(inflate, AnonymousClass05K.A01);
        Object tag = this.A01.getTag();
        tag.getClass();
        C319796rE r4 = (C319796rE) tag;
        JVI jvi = new JVI(this);
        0qQ.A0B(r4, 0);
        ImageView imageView = r4.A01;
        imageView.setImageResource(R.drawable.highlights_tray_plus);
        imageView.setVisibility(0);
        ? r2 = r4.A03;
        r2.A0H(2, R.color.black);
        r2.setImageDrawable(new ColorDrawable(r2.getContext().getColor(R.color.fds_transparent)));
        TextView textView = r4.A02;
        textView.setText(2131956460);
        textView.setVisibility(0);
        r4.A04.setVisibility(8);
        View view2 = r4.itemView;
        0qQ.A06(view2);
        AnonymousClass3NG r1 = new AnonymousClass3NG(view2);
        r1.A0C = true;
        r1.A07 = true;
        r1.A04 = new C64851LjD(jvi, r4);
        r1.A00();
        this.A00 = (ViewGroup) view.requireViewById(R.id.tray_empty_state_container);
    }
}
