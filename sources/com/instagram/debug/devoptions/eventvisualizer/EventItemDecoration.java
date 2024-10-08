package com.instagram.debug.devoptions.eventvisualizer;

import X.0qQ;
import X.AnonymousClass3AW;
import X.AnonymousClass3B3;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13989Tnp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class EventItemDecoration extends AnonymousClass3B3 {
    public final int dividerHeight;
    public final int leftOffset;
    public final Paint paint;
    public final int rightOffset;

    public EventItemDecoration(Context context) {
        0qQ.A0B(context, 1);
        this.dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        this.leftOffset = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        this.rightOffset = AnonymousClass7TF.A02(context, R.dimen.abc_edit_text_inset_top_material);
        Paint paint2 = new Paint();
        this.paint = paint2;
        AnonymousClass7TE.A1N(context, paint2, R.color.fds_white_alpha60);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r5) {
        0qQ.A0B(rect, 0);
        rect.left = this.leftOffset;
        rect.right = this.rightOffset;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r15) {
        Canvas canvas2 = canvas;
        AnonymousClass7TG.A1N(canvas, recyclerView);
        int paddingLeft = recyclerView.getPaddingLeft();
        int A0G = C13989Tnp.A0G(recyclerView);
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                canvas2.drawRect((float) paddingLeft, (float) bottom, (float) A0G, (float) (this.dividerHeight + bottom), this.paint);
                i++;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }
}
