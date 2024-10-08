package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class KNL extends C60063Jel {
    public final View A00;
    public final IgdsSwitch A01;

    public IgdsSwitch getShareSwitch() {
        return this.A01;
    }

    public void setEnabledState(boolean z) {
        IgdsSwitch igdsSwitch;
        boolean z2;
        if (z) {
            setAlpha(1.0f);
            igdsSwitch = this.A01;
            z2 = true;
        } else {
            setAlpha(0.3f);
            igdsSwitch = this.A01;
            z2 = false;
            igdsSwitch.setChecked(false);
        }
        igdsSwitch.setClickable(z2);
    }

    public KNL(Context context) {
        super(context);
        View.inflate(context, R.layout.share_to_threads_section, this);
        GradientSpinnerAvatarView A0j = DbX.A0j(this, R.id.share_table_profile_picture);
        A0j.A05();
        Drawable drawable = context.getDrawable(R.drawable.unlinked_threads_icon);
        if (drawable != null) {
            A0j.A0D(drawable);
        }
        DbX.A1B(this, R.id.row_text);
        JTR.A1D(this, R.id.share_table_button);
        DbU.A0G(this, R.id.share_table_button).setText(2131975313);
        this.A00 = requireViewById(R.id.app_share_new_tag_section);
        this.A01 = (IgdsSwitch) requireViewById(R.id.share_switch);
    }
}
