package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.Aam  reason: case insensitive filesystem */
public final class C40353Aam implements C346647vW {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;

    public C40353Aam(Context context, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        View inflate = LayoutInflater.from(context).inflate(R.layout.legacy_story_shortcut_button, viewGroup, false);
        viewGroup.addView(inflate);
        this.A00 = inflate;
        this.A01 = (ImageView) AnonymousClass7TF.A0F(inflate, R.id.legacy_story_shortcut_button_icon);
        this.A02 = AnonymousClass7TG.A0R(inflate, R.id.legacy_story_shortcut_button_label);
    }

    public final void A8L(C62567Khx khx) {
    }

    public final IgdsMediaButton ACY() {
        return null;
    }

    public final void EZN(Drawable drawable, String str) {
        0qQ.A0B(drawable, 0);
        this.A01.setImageDrawable(drawable);
        this.A00.getContentDescription();
    }

    public final void Ecw(C296245pk r1) {
    }

    public final void Er0(C296255pl r1) {
    }

    public final View ACh() {
        View view = this.A00;
        0qQ.A06(view);
        return view;
    }

    public final int BEE() {
        return 30;
    }

    public final int BER() {
        return 30;
    }

    public final void ERY(0sP r2, 0sP r3) {
        View view = this.A00;
        0qQ.A06(view);
        C355098Oo.A02(view, r2, r3);
    }

    public final void setEnabled(boolean z) {
        this.A00.setEnabled(z);
    }

    public final void setLabel(String str) {
        this.A02.setText(str);
    }

    public final void setVisibility(int i) {
        this.A00.setVisibility(i);
    }
}
