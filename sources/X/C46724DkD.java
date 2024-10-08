package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.DkD  reason: case insensitive filesystem */
public final class C46724DkD extends ConstraintLayout implements C3255072w {
    public final IgSimpleImageView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgdsButton A03;
    public final IgdsButton A04;

    public final void CLQ() {
        this.A00.setVisibility(8);
    }

    public final void EZe(int i, boolean z) {
        int i2;
        IgSimpleImageView igSimpleImageView = this.A00;
        igSimpleImageView.setImageResource(i);
        Context context = getContext();
        if (z) {
            i2 = 2Yu.A0H(context, R.attr.igdsPrimaryIcon);
        } else {
            i2 = R.color.fds_transparent;
        }
        DbU.A14(context, igSimpleImageView, i2);
    }

    public final IgdsButton getActionButton() {
        return this.A03;
    }

    public final IgTextView getBody() {
        return this.A01;
    }

    public final IgSimpleImageView getImageView() {
        return this.A00;
    }

    public final IgdsButton getTextButton() {
        return this.A04;
    }

    public final IgTextView getTitle() {
        return this.A02;
    }

    public void setAction(String str, View.OnClickListener onClickListener) {
        IgdsButton igdsButton = this.A03;
        igdsButton.setOnClickListener(onClickListener);
        igdsButton.setText(str);
        igdsButton.setVisibility(0);
    }

    public void setBody(int i) {
        this.A01.setText(i);
    }

    public void setDetailText(CharSequence charSequence) {
        if (charSequence != null) {
            IgTextView igTextView = this.A01;
            CharSequence text = igTextView.getText();
            if (text == null || text.length() == 0) {
                igTextView.setText(charSequence);
                return;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(10);
            igTextView.append(AnonymousClass7TF.A0i(charSequence, A1A));
        }
    }

    public void setHeadline(int i) {
        this.A02.setText(i);
    }

    public void setImageResource(int i) {
        this.A00.setImageResource(i);
    }

    public void setIsEmphasized(boolean z) {
        int i;
        IgTextView igTextView = this.A02;
        if (z) {
            0qQ.A0B(igTextView, 0);
            i = R.style.igds_headline_2_emphasized;
        } else {
            0qQ.A0B(igTextView, 0);
            i = R.style.igds_headline_2;
        }
        igTextView.setTextAppearance(i);
    }

    public C46724DkD(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        View inflate = View.inflate(context, R.layout.igds_prism_empty_state, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A00 = (IgSimpleImageView) inflate.requireViewById(R.id.igds_empty_state_image);
        this.A02 = DbT.A0a(inflate, R.id.igds_empty_state_title);
        IgTextView A0a = DbT.A0a(inflate, R.id.igds_empty_state_body_text);
        0qQ.A0A(A0a);
        C48948Emm.A00(A0a);
        this.A01 = A0a;
        this.A03 = DbU.A0b(inflate, R.id.igds_empty_state_primary_action_button);
        this.A04 = DbU.A0b(inflate, R.id.igds_empty_state_secondary_action_button);
    }

    public final void ENc(View.OnClickListener onClickListener, int i) {
        setAction(getResources().getString(i), onClickListener);
    }

    public void setBody(CharSequence charSequence) {
        this.A01.setText(charSequence);
    }

    public void setHeadline(CharSequence charSequence) {
        this.A02.setText(charSequence);
    }
}
