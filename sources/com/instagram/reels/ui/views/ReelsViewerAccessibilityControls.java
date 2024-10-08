package com.instagram.reels.ui.views;

import X.0qQ;
import X.0sn;
import X.1Xj;
import X.2eQ;
import X.C255773uh;
import X.C273384mU;
import X.C294785n2;
import X.C294795n3;
import X.C294805n4;
import X.C294815n5;
import X.C294825n6;
import X.C294835n7;
import X.C294845n8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReelsViewerAccessibilityControls extends IgFrameLayout {
    public C273384mU A00;
    public final View.AccessibilityDelegate A01;
    public final ViewGroup A02;
    public final IgdsMediaButton A03;
    public final IgdsMediaButton A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReelsViewerAccessibilityControls(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setAccessibilityCaption(C255773uh r10) {
        0qQ.A0B(r10, 0);
        1Xj r2 = r10.A0b;
        if (r2 != null) {
            setImportantForAccessibility(1);
            StringBuilder sb = new StringBuilder();
            String AXm = r2.A0C.AXm();
            if (r10.A1a()) {
                sb = new StringBuilder(getContext().getString(2131976403));
                setAccessibilityDelegate(this.A01);
            } else if (!r10.A1a() && AXm != null) {
                sb = new StringBuilder(AXm);
            }
            0sn C5g = r2.A0C.C5g();
            if (C5g == null) {
                C5g = 0sn.A00;
            }
            if (C5g.size() == 1) {
                2eQ.A09(getContext().getString(2131971755, new Object[]{C5g.get(0)}), sb, true);
            } else if (C5g.size() > 1) {
                int size = C5g.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    2eQ.A09(getContext().getString(2131971754, new Object[]{Integer.valueOf(i2), C5g.get(i)}), sb, true);
                    i = i2;
                }
            }
            setContentDescription(sb);
        }
    }

    public final void setDelegate(C273384mU r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.5n1] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReelsViewerAccessibilityControls(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.reel_accessibility_controls, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reel_accessibility_controls_layout);
        this.A02 = viewGroup;
        this.A01 = new C294785n2(context);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) viewGroup.findViewById(R.id.previous_story_button);
        this.A04 = igdsMediaButton;
        Drawable drawable = context.getDrawable(R.drawable.chevron_left);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
            ? obj = new Object();
            obj.A01 = drawable;
            igdsMediaButton.setStartAddOn(obj, getResources().getString(2131971730));
        }
        igdsMediaButton.setAccessibilityDelegate(new C294795n3(context));
        igdsMediaButton.setOnClickListener(new C294805n4(this));
        igdsMediaButton.setOnLongClickListener(new C294815n5(this));
        IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) viewGroup.findViewById(R.id.next_story_button);
        this.A03 = igdsMediaButton2;
        Drawable drawable2 = context.getDrawable(R.drawable.chevron_right);
        if (drawable2 != null) {
            drawable2.setAutoMirrored(true);
            ? obj2 = new Object();
            obj2.A01 = drawable2;
            igdsMediaButton2.setStartAddOn(obj2, getResources().getString(2131971723));
        }
        igdsMediaButton2.setAccessibilityDelegate(new C294825n6(context));
        igdsMediaButton2.setOnClickListener(new C294835n7(this));
        igdsMediaButton2.setOnLongClickListener(new C294845n8(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReelsViewerAccessibilityControls(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReelsViewerAccessibilityControls(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
