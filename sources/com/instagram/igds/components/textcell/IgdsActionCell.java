package com.instagram.igds.components.textcell;

import X.0nA;
import X.0qQ;
import X.2eS;
import X.C69276Nic;
import X.DbT;
import X.JTS;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsActionCell extends FrameLayout {
    public final IgTextView A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00(View.OnClickListener onClickListener, C69276Nic nic, CharSequence charSequence) {
        int i;
        0qQ.A0B(nic, 1);
        IgTextView igTextView = this.A00;
        igTextView.setText(charSequence);
        setOnClickListener(onClickListener);
        int ordinal = nic.ordinal();
        Context context = getContext();
        if (ordinal == 1) {
            i = R.attr.igds_color_primary_button;
        } else if (ordinal != 2) {
            i = R.attr.igds_color_primary_text;
        } else {
            i = R.attr.igds_color_error_or_destructive;
        }
        JTS.A0u(context, igTextView, i);
        setContentDescription(charSequence);
    }

    public final void setActionText(CharSequence charSequence) {
        this.A00.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = View.inflate(context, R.layout.igds_actioncell_layout, this);
        this.A00 = DbT.A0a(inflate, R.id.igds_actioncell_label);
        0nA.A0l(inflate, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        2eS.A01(this);
    }

    public /* synthetic */ IgdsActionCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsActionCell(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
