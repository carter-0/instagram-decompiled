package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.MgG  reason: case insensitive filesystem */
public final class C66982MgG extends LinearLayout {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgdsButton A04;
    public final IgdsButton A05;
    public final boolean A06;
    public final ImageView A07;

    public final void setButtonOnClickListener(View.OnClickListener onClickListener) {
        this.A04.setOnClickListener(onClickListener);
        this.A05.setOnClickListener(onClickListener);
    }

    public final void setDismissButtonOnClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public final void setDismissButtonVisibility(boolean z) {
        this.A07.setVisibility(DbW.A01(z ? 1 : 0));
    }

    public C66982MgG(Context context, boolean z) {
        super(context);
        View inflate = DbV.A0D(this).inflate(z ? R.layout.find_people_activation_list_row : R.layout.find_people_activation_card, this);
        this.A01 = DbU.A0F(inflate, R.id.find_people_card_image);
        this.A00 = DbU.A0F(inflate, R.id.find_people_card_completed_image);
        this.A03 = DbU.A0G(inflate, R.id.find_people_card_title);
        this.A02 = DbU.A0G(inflate, R.id.find_people_card_subtitle);
        this.A04 = DbU.A0b(inflate, R.id.find_people_card_button);
        this.A05 = DbU.A0b(inflate, R.id.find_people_card_secondary_button);
        this.A07 = DbU.A0F(inflate, R.id.find_people_dismiss_button);
        this.A06 = z;
    }
}
