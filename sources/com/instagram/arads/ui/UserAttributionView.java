package com.instagram.arads.ui;

import X.0qQ;
import X.DbT;
import X.DbU;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UserAttributionView extends ConstraintLayout {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserAttributionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.user_attribution_view, this);
        this.A01 = DbT.A0a(this, R.id.attribution_primary_text);
        IgTextView A0a = DbT.A0a(this, R.id.attribution_secondary_text);
        this.A00 = A0a;
        this.A02 = DbU.A0X(this, R.id.avatar);
        DbT.A18(context, A0a, 2131974140);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r5.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAttribution(java.lang.String r5, java.lang.String r6, X.AnonymousClass0iw r7, android.view.View.OnClickListener r8) {
        /*
            r4 = this;
            r0 = 2
            X.0qQ.A0B(r7, r0)
            com.instagram.common.ui.base.IgTextView r3 = r4.A01
            if (r5 == 0) goto L_0x000f
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 1
        L_0x0010:
            r2 = 4
            r0 = 0
            if (r1 == 0) goto L_0x0015
            r0 = 4
        L_0x0015:
            r3.setVisibility(r0)
            r3.setText(r5)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A02
            if (r6 == 0) goto L_0x0026
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0026
            r2 = 0
        L_0x0026:
            r1.setVisibility(r2)
            if (r6 == 0) goto L_0x0039
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0039
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r6)
            r1.setUrl(r0, r7)
        L_0x0039:
            if (r8 == 0) goto L_0x003e
            r4.setOnClickListener(r8)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arads.ui.UserAttributionView.setAttribution(java.lang.String, java.lang.String, X.0iw, android.view.View$OnClickListener):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UserAttributionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UserAttributionView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ UserAttributionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
