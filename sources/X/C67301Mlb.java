package X;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

/* renamed from: X.Mlb  reason: case insensitive filesystem */
public final class C67301Mlb extends C249703kE {
    public final View A00;
    public final View A01;
    public final EditText A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final AnimatedHintsTextLayout A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67301Mlb(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A01 = AnonymousClass7TF.A0G(view, R.id.search_row);
        this.A03 = DbX.A0J(view, R.id.action_button);
        this.A05 = DbX.A0J(view, R.id.search_bar_glyph);
        this.A04 = DbX.A0J(view, R.id.custom_action_button_v2);
        this.A07 = (AnimatedHintsTextLayout) AnonymousClass7TF.A0F(view, R.id.animated_hints_text_layout);
        EditText editText = (EditText) AnonymousClass7TF.A0F(view, R.id.search_edit_text);
        this.A02 = editText;
        this.A06 = AnonymousClass7TG.A0R(view, R.id.action_text);
        editText.setTextIsSelectable(false);
        editText.setFocusable(false);
        editText.setFocusableInTouchMode(false);
        editText.setEnabled(false);
        editText.setClickable(false);
        editText.setLongClickable(false);
        editText.clearFocus();
    }
}
