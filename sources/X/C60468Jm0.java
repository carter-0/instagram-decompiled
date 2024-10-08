package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController;
import com.instagram.profile.bindergroup.AccountLinkModel;
import java.util.List;

/* renamed from: X.Jm0  reason: case insensitive filesystem */
public final class C60468Jm0 extends AnonymousClass3B3 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C60468Jm0(E3F e3f) {
        this.A00 = 1;
        this.A02 = e3f;
        this.A01 = AnonymousClass0eN.A01(new C51800G2j(e3f, 36));
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r8) {
        int i;
        switch (this.A00) {
            case 0:
                C51974G9v.A1O(rect, view, recyclerView, r8);
                super.getItemOffsets(rect, view, recyclerView, r8);
                Context context = ((View) this.A01).getContext();
                Resources resources = context.getResources();
                int A04 = RecyclerView.A04(view);
                int i2 = R.dimen.abc_button_padding_horizontal_material;
                if (A04 == 0) {
                    i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                }
                rect.left = resources.getDimensionPixelSize(i2);
                C60393Jkm jkm = ((GiphyClipsBrowserCategoriesViewController) this.A02).A00;
                if (jkm != null) {
                    if (RecyclerView.A04(view) == C51966G9m.A06(jkm.A01)) {
                        i = DbY.A01(context);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                2Rw r0 = recyclerView.A0A;
                if (r0 != null && RecyclerView.A03(view) != r0.getItemCount() - 1) {
                    i = DbS.A02((Context) this.A02, 5);
                    break;
                } else {
                    return;
                }
            default:
                super.getItemOffsets(rect, view, recyclerView, r8);
                return;
        }
        rect.right = i;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r11) {
        if (1 - this.A00 != 0) {
            super.onDrawOver(canvas, recyclerView, r11);
            return;
        }
        AnonymousClass7TG.A1N(canvas, recyclerView);
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        List A012 = E3F.A01((E3F) this.A02);
        int i = childCount - 1;
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int A03 = RecyclerView.A03(childAt);
            if (A03 < A012.size()) {
                int i3 = A03 + 1;
                if ((A012.get(i3) instanceof AccountLinkModel.AddFacebookLinkData) || (A012.get(i3) instanceof AccountLinkModel.AddFacebookPageLinkData)) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    0qQ.A0C(layoutParams, C273654mx.A00(9));
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    AnonymousClass0eM r2 = (AnonymousClass0eM) this.A01;
                    JTO.A0D(r2).setBounds(paddingLeft, bottom, width, JTT.A09(r2) + bottom);
                    JTQ.A0u(canvas, r2);
                    return;
                }
            }
        }
    }

    public C60468Jm0(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
