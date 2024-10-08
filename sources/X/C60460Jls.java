package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Jls  reason: case insensitive filesystem */
public final class C60460Jls extends AnonymousClass3B3 {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C60460Jls(Object obj, Object obj2, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
        this.A03 = obj2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r10) {
        String str;
        0wj r1;
        int i;
        int i2 = this.A01;
        0qQ.A0B(rect, 0);
        AnonymousClass7TG.A1U(view, recyclerView, r10);
        super.getItemOffsets(rect, view, recyclerView, r10);
        int A032 = RecyclerView.A03(view);
        if (i2 != 0) {
            if (A032 != -1) {
                view.setVisibility(0);
                2Rw r0 = recyclerView.A0A;
                if (r0 != null) {
                    int itemCount = r0.getItemCount();
                    try {
                        float f = this.A00;
                        Context context = (Context) this.A02;
                        int A06 = (Resources.getSystem().getDisplayMetrics().widthPixels - AnonymousClass7TE.A06(f, context.getResources().getDimension(R.dimen.media_thumbnail_preview_item_height))) / 2;
                        int A033 = DbS.A03(context.getResources(), R.dimen.abc_action_bar_elevation_material);
                        if (A032 == 0) {
                            rect.left = A06;
                            return;
                        }
                        rect.left = A033;
                        if (A032 == itemCount - 1) {
                            rect.right = A06;
                            return;
                        }
                        return;
                    } catch (Resources.NotFoundException e) {
                        e = e;
                        r1 = 0wj.A01;
                        i = 817897926;
                        str = "boost_media_picker_sub_tab_fragment";
                        AnonymousClass7TF.A19(r1.AEf(str, i), str, AnonymousClass7TF.A0m("attaching the new instance to thumbnail recycler view caused an exception: ", e), e);
                        return;
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        } else if (A032 != -1) {
            int i3 = 0;
            view.setVisibility(0);
            2Rw r02 = recyclerView.A0A;
            if (r02 != null) {
                i3 = r02.getItemCount();
            }
            try {
                Context context2 = (Context) this.A02;
                int A002 = (int) DbX.A00(context2);
                int A062 = AnonymousClass7TE.A06(this.A00, context2.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_width));
                int i4 = Resources.getSystem().getDisplayMetrics().widthPixels;
                int i5 = ((i4 - (A062 * 2)) - A002) / 2;
                if (i4 <= 0) {
                    return;
                }
                if (A032 == 0) {
                    rect.left = i5;
                    return;
                }
                rect.left = A002;
                if (A032 == i3 - 1) {
                    rect.right = i5;
                    return;
                }
                return;
            } catch (Resources.NotFoundException e2) {
                e = e2;
                r1 = 0wj.A01;
                i = 817897926;
                str = "boost_media_picker_ab_test_sub_tab_fragment";
                AnonymousClass7TF.A19(r1.AEf(str, i), str, AnonymousClass7TF.A0m("attaching the new instance to thumbnail recycler view caused an exception: ", e), e);
                return;
            }
        }
        view.setVisibility(4);
    }
}
