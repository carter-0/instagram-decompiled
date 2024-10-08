package com.instagram.creation.photo.edit.ui.util;

import X.0qQ;
import X.AnonymousClass7TE;
import X.LYF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

public final class IgMultiListenerSimpleImageView extends IgSimpleImageView {
    public View.OnClickListener A00;
    public final List A01 = AnonymousClass7TE.A1C();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgMultiListenerSimpleImageView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        super.setOnClickListener(new LYF((Object) this, 44));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgMultiListenerSimpleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgMultiListenerSimpleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
