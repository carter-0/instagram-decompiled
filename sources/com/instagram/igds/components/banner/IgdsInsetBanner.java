package com.instagram.igds.components.banner;

import X.0nA;
import X.0qQ;
import X.2eS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C71382cm;
import X.C71622eP;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbY;
import X.FP1;
import X.G76;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsInsetBanner extends FrameLayout {
    public G76 A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final MaterialCardView A06;
    public final IgdsButton A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsInsetBanner(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        0qQ.A0B(context, 1);
    }

    private final void setBorderStyle(int i) {
        int i2;
        MaterialCardView materialCardView = this.A06;
        if (i == 1) {
            materialCardView.setCardElevation(0.0f);
            i2 = (int) 0nA.A00(AnonymousClass7TE.A0S(this), 0.5f);
        } else {
            materialCardView.setCardElevation(0nA.A00(AnonymousClass7TE.A0S(this), 1.0f));
            i2 = 0;
        }
        materialCardView.setStrokeWidth(i2);
    }

    public static /* synthetic */ void setBody$default(IgdsInsetBanner igdsInsetBanner, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = AnonymousClass7TE.A0u();
        }
        igdsInsetBanner.setBody(charSequence, bool);
    }

    public static /* synthetic */ void setHeadline$default(IgdsInsetBanner igdsInsetBanner, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = AnonymousClass7TE.A0u();
        }
        igdsInsetBanner.setHeadline(charSequence, bool);
    }

    public static /* synthetic */ void setTextInternal$default(IgdsInsetBanner igdsInsetBanner, TextView textView, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = AnonymousClass7TE.A0u();
        }
        igdsInsetBanner.setTextInternal(textView, charSequence, bool);
    }

    public final G76 getCallback() {
        return this.A00;
    }

    public final void setAction(String str) {
        if (str != null) {
            this.A07.setText(str);
        }
        IgdsButton igdsButton = this.A07;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        igdsButton.setVisibility(i);
    }

    public final void setBody(int i) {
        setTextInternal(this.A04, DbY.A0f(this, i), AnonymousClass7TE.A0u());
    }

    public final void setBodyColor(int i) {
        this.A04.setTextColor(i);
    }

    public final void setDismissible(boolean z) {
        this.A01.setVisibility(DbW.A01(z ? 1 : 0));
    }

    public final void setHeadline(int i) {
        setTextInternal(this.A05, DbY.A0f(this, i), AnonymousClass7TE.A0u());
    }

    public final void setIconEnd(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setIconInternal(this.A02, drawable);
    }

    public final void setIconEndBackground(Drawable drawable) {
        this.A02.setBackground(drawable);
    }

    public final void setIconStart(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setIconInternal(this.A03, drawable);
    }

    public final void setIconStartBackground(Drawable drawable) {
        this.A03.setBackground(drawable);
    }

    private final void setIconInternal(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    private final void setTextInternal(TextView textView, CharSequence charSequence, Boolean bool) {
        textView.setText(charSequence);
        CharSequence text = textView.getText();
        int i = 0;
        if (text == null || text.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        if (AnonymousClass7TF.A1Y(bool, true)) {
            textView.setHighlightColor(textView.getContext().getColor(R.color.fds_transparent));
            DbT.A1H(textView);
        }
    }

    public final void setCallback(G76 g76) {
        this.A00 = g76;
    }

    public final void setAction(int i) {
        setAction(DbY.A0f(this, i));
    }

    public final void setBody(CharSequence charSequence, Boolean bool) {
        setTextInternal(this.A04, charSequence, bool);
    }

    public final void setHeadline(CharSequence charSequence, Boolean bool) {
        setTextInternal(this.A05, charSequence, bool);
    }

    public final void setIconEnd(Drawable drawable) {
        setIconInternal(this.A02, drawable);
    }

    public final void setIconStart(Drawable drawable) {
        setIconInternal(this.A03, drawable);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsInsetBanner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.layout_igds_inset_banner, this).setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.A06 = (MaterialCardView) findViewById(R.id.igds_inset_banner_card_view);
        this.A03 = DbS.A0G(this, R.id.igds_inset_banner_icon_start);
        this.A05 = AnonymousClass7TE.A0d(this, R.id.igds_inset_banner_headline);
        this.A04 = AnonymousClass7TE.A0d(this, R.id.igds_inset_banner_body_text);
        IgdsButton igdsButton = (IgdsButton) findViewById(R.id.igds_inset_banner_action);
        this.A07 = igdsButton;
        this.A02 = DbS.A0G(this, R.id.igds_inset_banner_icon_end);
        View findViewById = findViewById(R.id.igds_inset_banner_dismiss_action);
        this.A01 = findViewById;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A1U, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(5, 0);
                String A002 = C71622eP.A00(context, obtainStyledAttributes, 3);
                String A003 = C71622eP.A00(context, obtainStyledAttributes, 1);
                String A004 = C71622eP.A00(context, obtainStyledAttributes, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
                boolean z = obtainStyledAttributes.getBoolean(6, false);
                int i3 = obtainStyledAttributes.getInt(2, 0);
                obtainStyledAttributes.recycle();
                setIconStart(resourceId);
                setHeadline(A002, false);
                setBody(A003, false);
                setAction(A004);
                setIconEnd(resourceId2);
                setDismissible(z);
                setBorderStyle(i3);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        igdsButton.setOnClickListener(FP1.A00(this, 51));
        2eS.A01(findViewById);
        findViewById.setOnClickListener(FP1.A00(this, 52));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsInsetBanner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsInsetBanner(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsInsetBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        0qQ.A0B(context, 1);
    }
}
