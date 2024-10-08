package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class KNM extends C60063Jel {
    public final View A00 = requireViewById(R.id.app_share_new_tag_section);
    public final TextView A01 = DbU.A0G(this, R.id.row_text);
    public final TextView A02 = DbU.A0G(this, R.id.share_table_button);
    public final IgdsSwitch A03 = ((IgdsSwitch) requireViewById(R.id.share_switch));
    public final GradientSpinnerAvatarView A04 = ((GradientSpinnerAvatarView) requireViewById(R.id.share_table_profile_picture));

    public IgdsSwitch getShareSwitch() {
        return this.A03;
    }

    public final void setChecked(boolean z) {
        this.A03.setChecked(z);
    }

    public void setEnabledState(boolean z) {
        IgdsSwitch igdsSwitch;
        boolean z2;
        if (z) {
            setAlpha(1.0f);
            igdsSwitch = this.A03;
            z2 = true;
        } else {
            setAlpha(0.3f);
            igdsSwitch = this.A03;
            z2 = false;
            igdsSwitch.setChecked(false);
        }
        igdsSwitch.setClickable(z2);
    }

    public KNM(Context context) {
        super(context);
        View.inflate(context, R.layout.share_to_threads_section, this);
    }
}
