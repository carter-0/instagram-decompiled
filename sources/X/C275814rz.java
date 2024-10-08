package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.4rz  reason: invalid class name and case insensitive filesystem */
public final class C275814rz extends C275824s0 {
    public final Rect A00 = new Rect();
    public final Drawable A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ C2365334c A03;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = (com.instagram.model.reels.Reel) r1.Bkf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r0 = (com.instagram.model.reels.Reel) r1.Bkf(r5 + 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(int r5) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r5 <= 0) goto L_0x001a
            X.34c r0 = r4.A03
            X.34h r1 = r0.A0C
            int r0 = r1.getItemCount()
            if (r5 >= r0) goto L_0x001a
            java.lang.Object r0 = r1.Bkf(r5)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.A1O
            if (r0 != r2) goto L_0x001b
        L_0x001a:
            return r3
        L_0x001b:
            int r0 = r5 + 1
            java.lang.Object r0 = r1.Bkf(r0)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A1O
            if (r0 != r2) goto L_0x001a
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C275814rz.A00(int):boolean");
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        0qQ.A0B(rect, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(recyclerView, 2);
        int A032 = RecyclerView.A03(view);
        if (A00(A032)) {
            Context context = this.A02.getContext();
            0qQ.A07(context);
            rect.right = (int) 0nA.A04(context, 12);
        } else if (A00(A032 - 1)) {
            Context context2 = this.A02.getContext();
            0qQ.A07(context2);
            rect.left = (int) 0nA.A04(context2, 12);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r10) {
        0qQ.A0B(canvas, 0);
        0qQ.A0B(recyclerView, 1);
        canvas.save();
        Context context = this.A02.getContext();
        0qQ.A07(context);
        int A04 = (int) 0nA.A04(context, 30);
        int A042 = (int) 0nA.A04(context, 72);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (A00(RecyclerView.A03(childAt))) {
                if (recyclerView.A0D != null) {
                    RecyclerView.A0E(childAt, this.A00);
                }
                int round = this.A00.right + Math.round(childAt.getTranslationX());
                Drawable drawable = this.A01;
                if (drawable != null) {
                    drawable.setBounds(round - drawable.getIntrinsicWidth(), A04, round, A042);
                    drawable.draw(canvas);
                }
            }
        }
        canvas.restore();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C275814rz(Context context, RecyclerView recyclerView, C2365334c r5) {
        super(context, 0);
        this.A02 = recyclerView;
        this.A03 = r5;
        this.A01 = recyclerView.getContext().getDrawable(R.drawable.highlight_divider_drawable);
    }
}
