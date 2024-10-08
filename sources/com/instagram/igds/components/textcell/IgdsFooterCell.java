package com.instagram.igds.components.textcell;

import X.0qQ;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.accessibility.AccessibleTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsFooterCell extends LinearLayout {
    public View A00;
    public View A01;
    public final AccessibleTextView A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsFooterCell(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.accessibility.AccessibleTextView, android.widget.TextView, android.view.View] */
    public final void A00(CharSequence charSequence) {
        int i = 0;
        0qQ.A0B(charSequence, 0);
        ? r2 = this.A02;
        r2.setText(charSequence);
        if (charSequence.length() <= 0) {
            i = 8;
        }
        r2.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsFooterCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        setOrientation(1);
        View inflate = View.inflate(context, R.layout.igds_footercell_layout, this);
        this.A02 = (AccessibleTextView) inflate.requireViewById(R.id.igds_footer_text);
        this.A00 = inflate.requireViewById(R.id.igds_footercell_separator);
        this.A01 = inflate.requireViewById(R.id.igds_footercell_spacer);
    }

    public /* synthetic */ IgdsFooterCell(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }
}
