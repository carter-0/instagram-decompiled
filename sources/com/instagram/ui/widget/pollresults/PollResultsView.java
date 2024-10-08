package com.instagram.ui.widget.pollresults;

import X.0qQ;
import X.DbU;
import X.DbV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PollResultsView extends LinearLayout {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PollResultsView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = DbV.A0D(this).inflate(R.layout.poll_results, this, true);
        this.A04 = DbU.A0G(inflate, R.id.row_newsfeed_winning_poll_percentage);
        this.A05 = DbU.A0G(inflate, R.id.row_newsfeed_winning_poll_option);
        this.A01 = DbU.A0F(inflate, R.id.row_newsfeed_winning_poll_background);
        this.A02 = DbU.A0G(inflate, R.id.row_newsfeed_losing_poll_percentage);
        this.A03 = DbU.A0G(inflate, R.id.row_newsfeed_losing_poll_option);
        this.A00 = DbU.A0F(inflate, R.id.row_newsfeed_losing_poll_background);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PollResultsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PollResultsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
