package X;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Jel  reason: case insensitive filesystem */
public abstract class C60063Jel extends LinearLayout {
    public abstract IgdsSwitch getShareSwitch();

    public abstract void setEnabledState(boolean z);

    public final void A00(AnonymousClass4DH r8, SimpleImageUrl simpleImageUrl, String str, String str2, boolean z) {
        if (this instanceof KNL) {
            ((KNL) this).A00.setVisibility(DbW.A01(z));
            return;
        }
        KNM knm = (KNM) this;
        knm.A00.setVisibility(DbW.A01(z ? 1 : 0));
        GradientSpinnerAvatarView gradientSpinnerAvatarView = knm.A04;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r8, new SimpleImageUrl(simpleImageUrl));
        Context context = knm.getContext();
        gradientSpinnerAvatarView.setBottomBadgeDrawable(context.getDrawable(R.drawable.avatar_bottom_badge_threads));
        gradientSpinnerAvatarView.A05();
        gradientSpinnerAvatarView.A01 = 0nA.A04(context, 3);
        TextView textView = knm.A01;
        JTR.A18(context, textView, context.getString(2131975313), str2, 2131954369);
        textView.setVisibility(0);
        TextView textView2 = knm.A02;
        textView2.setText(str);
        textView2.setVisibility(0);
    }

    public final C358618bC getListener() {
        return getShareSwitch().A07;
    }

    public final void setListener(C358618bC r2) {
        getShareSwitch().A07 = r2;
    }
}
