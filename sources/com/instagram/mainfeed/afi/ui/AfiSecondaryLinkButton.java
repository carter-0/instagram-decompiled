package com.instagram.mainfeed.afi.ui;

import X.0qQ;
import X.AnonymousClass7TG;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

public final class AfiSecondaryLinkButton extends IgdsButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AfiSecondaryLinkButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4lr, java.lang.Object] */
    public final void A01() {
        AnonymousClass7TG.A1O(this.A0B, this.A02);
        ? obj = new Object();
        this.A01 = obj;
        TextView textView = this.A0A;
        Resources resources = getResources();
        0qQ.A07(resources);
        obj.A03(resources, textView);
    }
}
