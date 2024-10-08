package com.instagram.leadgen.core.ui;

import X.0qQ;
import X.2eS;
import X.C13989Tnp;
import X.C62320sa;
import X.DbT;
import X.DbU;
import X.JTT;
import X.WBA;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LeadGenCreativesSectionHeaderRow extends ConstraintLayout {
    public final IgTextView A00;
    public final IgImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.lead_gen_view_creatives_section_header_row, this);
        this.A00 = DbT.A0a(this, R.id.title_text_view);
        this.A01 = DbT.A0b(this, R.id.chevron);
    }

    public final void A0D(String str, C62320sa r5, boolean z) {
        0qQ.A0B(str, 0);
        this.A00.setText(str);
        int i = R.drawable.instagram_chevron_down_outline_16;
        if (z) {
            i = R.drawable.instagram_chevron_up_outline_16;
        }
        IgImageView igImageView = this.A01;
        Context context = getContext();
        DbU.A13(context, igImageView, i);
        setOnClickListener(new WBA((Object) r5, 20));
        C13989Tnp.A0z(context, this, str, 2131964682);
        2eS.A01(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LeadGenCreativesSectionHeaderRow(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ LeadGenCreativesSectionHeaderRow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
