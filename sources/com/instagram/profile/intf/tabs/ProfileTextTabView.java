package com.instagram.profile.intf.tabs;

import X.0mk;
import X.0qQ;
import X.AnonymousClass4Ed;
import X.C324826zy;
import X.C71662eb;
import X.DbU;
import X.JTQ;
import X.JTT;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ProfileTextTabView extends FrameLayout implements C324826zy {
    public TextView A00;
    public C71662eb A01;
    public final int A02;
    public final View A03;
    public final int[][] A04;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.2eb, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileTextTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A04 = new int[][]{new int[]{16842913}, new int[0]};
        this.A02 = context.getColor(R.color.grey_5);
        this.A03 = this;
        View.inflate(context, R.layout.profile_text_tab_view, this);
        this.A00 = DbU.A0G(this, R.id.profile_tab_text_view);
        View findViewById = findViewById(R.id.profile_tab_led_notification_stub);
        ? obj = new Object();
        obj.A00 = findViewById;
        this.A01 = obj;
    }

    public final void EHN(boolean z) {
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        0qQ.A0B(accessibilityNodeInfo, 0);
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
    }

    public void setActiveIcon(Drawable drawable) {
    }

    public void setEndIcon(Drawable drawable) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(String str) {
        0qQ.A0B(str, 0);
        this.A00.setText(str);
    }

    public void setTitleDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        TextView textView = this.A00;
        if (0mk.A02(textView.getContext())) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        AnonymousClass4Ed.A04(textView);
    }

    public View getView() {
        return this.A03;
    }

    public void setActiveColor(int i) {
        this.A00.setTextColor(new ColorStateList(this.A04, new int[]{i, this.A02}));
    }

    public void setBadgeCount(int i) {
        this.A01.A03(JTQ.A01(i));
    }

    public void setContentDescription(CharSequence charSequence) {
        this.A00.setContentDescription(charSequence);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setOnClickListener(onClickListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProfileTextTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProfileTextTabView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ ProfileTextTabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
