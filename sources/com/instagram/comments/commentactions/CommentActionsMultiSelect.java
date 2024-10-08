package com.instagram.comments.commentactions;

import X.0qQ;
import X.C56800ICx;
import X.DbS;
import X.DbW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CommentActionsMultiSelect extends IgLinearLayout {
    public final Set A00;
    public final View A01;
    public final View A02;
    public final View A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommentActionsMultiSelect(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setBlockButtonVisibility(boolean z) {
        this.A01.setVisibility(DbW.A01(z ? 1 : 0));
    }

    public final void setDeleteButtonVisibility(boolean z) {
        this.A02.setVisibility(DbW.A01(z ? 1 : 0));
    }

    public final void setRestrictButtonVisibility(boolean z) {
        this.A03.setVisibility(DbW.A01(z ? 1 : 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentActionsMultiSelect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = DbS.A0y();
        LayoutInflater.from(context).inflate(R.layout.comment_actions_multi_select_menu, this);
        setOrientation(1);
        View findViewById = findViewById(R.id.bulk_comment_actions_delete);
        this.A02 = findViewById;
        View findViewById2 = findViewById(R.id.bulk_comment_actions_restrict);
        this.A03 = findViewById2;
        View findViewById3 = findViewById(R.id.bulk_comment_actions_block);
        this.A01 = findViewById3;
        findViewById.setOnClickListener(new C56800ICx(this, 11));
        findViewById2.setOnClickListener(new C56800ICx(this, 12));
        findViewById3.setOnClickListener(new C56800ICx(this, 13));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentActionsMultiSelect(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommentActionsMultiSelect(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
