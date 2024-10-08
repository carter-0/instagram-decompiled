package com.instagram.ui.widget.dismissablecallout;

import X.0qQ;
import X.AnonymousClass0iw;
import X.C71382cm;
import X.C71406Ok5;
import X.C71622eP;
import X.C74281Ps9;
import X.DbU;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class DismissableCallout extends FrameLayout {
    public int A00;
    public View A01;
    public TextView A02;
    public CircularImageView A03;
    public C74281Ps9 A04;

    public DismissableCallout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextView getTextView() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public void setAvatar(ImageUrl imageUrl, AnonymousClass0iw r4) {
        this.A03.setUrl(imageUrl, r4);
        this.A03.setVisibility(0);
    }

    public void setButtonContentDescription(String str) {
        this.A01.setContentDescription(str);
    }

    private void A00(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutInflater.from(context).inflate(R.layout.dismissable_callout, this);
        this.A02 = DbU.A0G(this, R.id.dismissable_callout_info_banner);
        this.A01 = requireViewById(R.id.dismiss_button);
        this.A03 = DbU.A0X(this, R.id.dismissable_callout_avatar);
        this.A01.setOnClickListener(new C71406Ok5((Object) this, 1));
        setBackgroundResource(R.color.callout_background);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0R);
        TextView textView = this.A02;
        0qQ.A0B(obtainStyledAttributes, 1);
        textView.setText(C71622eP.A00(context, obtainStyledAttributes, 0));
        obtainStyledAttributes.recycle();
    }

    public void setOnDismissListener(C74281Ps9 ps9) {
        this.A04 = ps9;
    }

    public DismissableCallout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }

    public DismissableCallout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(attributeSet);
    }

    public DismissableCallout(Context context) {
        this(context, (AttributeSet) null);
    }
}
