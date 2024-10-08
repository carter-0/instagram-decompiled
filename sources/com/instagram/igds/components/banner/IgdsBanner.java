package com.instagram.igds.components.banner;

import X.0qQ;
import X.2eS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C71382cm;
import X.C71622eP;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbY;
import X.FP1;
import X.G76;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsBanner extends LinearLayout {
    public G76 A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final View A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2.setVisibility(r0);
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r4 != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r0.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        if (r6 != 1) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r6 == 3) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r5.A02;
        r1 = 0;
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r3 == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDividerVisibility(int r6) {
        /*
            r5 = this;
            r4 = 0
            r2 = 3
            r1 = 1
            r0 = 2
            if (r6 == r0) goto L_0x0023
            if (r6 == r2) goto L_0x0023
            r3 = 0
            if (r6 == r1) goto L_0x000d
        L_0x000b:
            if (r6 != r2) goto L_0x000e
        L_0x000d:
            r4 = 1
        L_0x000e:
            android.view.View r2 = r5.A02
            r1 = 0
            r0 = 8
            if (r3 == 0) goto L_0x0016
            r0 = 0
        L_0x0016:
            r2.setVisibility(r0)
            android.view.View r0 = r5.A01
            if (r4 != 0) goto L_0x001f
            r1 = 8
        L_0x001f:
            r0.setVisibility(r1)
            return
        L_0x0023:
            r3 = 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.banner.IgdsBanner.setDividerVisibility(int):void");
    }

    public static /* synthetic */ void setBody$default(IgdsBanner igdsBanner, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = AnonymousClass7TE.A0u();
        }
        igdsBanner.setBody(charSequence, bool);
    }

    private final void setIconInternal(Drawable drawable) {
        ImageView imageView = this.A03;
        int visibility = imageView.getVisibility();
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(i);
        if (visibility != i) {
            int i2 = 1;
            if (imageView.getVisibility() == 0) {
                i2 = 8388611;
            }
            this.A05.setGravity(i2);
            this.A04.setGravity(i2);
        }
    }

    public static /* synthetic */ void setTextInternal$default(IgdsBanner igdsBanner, TextView textView, CharSequence charSequence, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = AnonymousClass7TE.A0u();
        }
        igdsBanner.setTextInternal(textView, charSequence, bool);
    }

    public final G76 getCallback() {
        return this.A00;
    }

    public final void setAction(int i) {
        setTextInternal(this.A04, DbY.A0f(this, i), AnonymousClass7TE.A0u());
    }

    public final void setBody(int i) {
        setTextInternal(this.A05, DbY.A0f(this, i), AnonymousClass7TE.A0u());
    }

    public final void setBodyColor(int i) {
        this.A05.setTextColor(i);
    }

    public final void setDismissible(boolean z) {
        this.A06.setVisibility(DbW.A01(z ? 1 : 0));
    }

    public final void setIcon(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setIconInternal(drawable);
    }

    public final void setIconBackground(Drawable drawable) {
        this.A03.setBackground(drawable);
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

    public final void setDividerColor(int i) {
        int color = getContext().getColor(i);
        this.A02.setBackgroundColor(color);
        this.A01.setBackgroundColor(color);
    }

    public final void setCallback(G76 g76) {
        this.A00 = g76;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        DbY.A0z(View.inflate(context, R.layout.layout_igds_banner, this));
        setOrientation(1);
        this.A02 = findViewById(R.id.banner_top_divider);
        this.A03 = DbS.A0G(this, R.id.banner_icon);
        this.A05 = AnonymousClass7TE.A0d(this, R.id.banner_body);
        TextView A0d = AnonymousClass7TE.A0d(this, R.id.banner_action);
        this.A04 = A0d;
        View findViewById = findViewById(R.id.banner_close);
        this.A06 = findViewById;
        this.A01 = findViewById(R.id.banner_bottom_divider);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A1N, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(3, 0);
                String A002 = C71622eP.A00(context, obtainStyledAttributes, 1);
                String A003 = C71622eP.A00(context, obtainStyledAttributes, 0);
                boolean z = obtainStyledAttributes.getBoolean(4, false);
                int i2 = obtainStyledAttributes.getInt(2, 1);
                obtainStyledAttributes.recycle();
                setIcon(resourceId);
                DbT.A1U(this, A002, false);
                setAction((CharSequence) A003);
                setDismissible(z);
                setDividerVisibility(i2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        2eS.A01(A0d);
        A0d.setOnClickListener(FP1.A00(this, 49));
        DbU.A12(context, findViewById, 2131956164);
        findViewById.setOnClickListener(FP1.A00(this, 50));
    }

    public final void setAction(CharSequence charSequence) {
        setTextInternal(this.A04, charSequence, AnonymousClass7TE.A0u());
    }

    public final void setBody(CharSequence charSequence, Boolean bool) {
        setTextInternal(this.A05, charSequence, bool);
    }

    public final void setIcon(Drawable drawable) {
        setIconInternal(drawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsBanner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
