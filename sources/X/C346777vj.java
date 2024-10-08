package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7vj  reason: invalid class name and case insensitive filesystem */
public final class C346777vj extends C231632rz {
    public final float A00 = 1.0f;
    public final int A01 = 3;
    public final UserSession A02;
    public final C357638Yz A03;
    public final AnonymousClass8MJ A04;
    public final boolean A05;

    public C346777vj(UserSession userSession, C357638Yz r4, AnonymousClass8MJ r5, boolean z) {
        this.A02 = userSession;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = z;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(1428692424);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj4, 2);
        0qQ.A0B(obj3, 3);
        UserSession userSession = this.A02;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StaticStickerGridRowViewBinder.Holder");
        A50 a50 = (A50) tag;
        C3251571g r9 = (C3251571g) obj4;
        AnonymousClass6u8 r8 = (AnonymousClass6u8) obj3;
        C357638Yz r14 = this.A03;
        AnonymousClass8MJ r15 = this.A04;
        boolean z = this.A05;
        C39770A8k a8k = A2A.A00;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(a50, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(r8, 3);
        0qQ.A0B(r15, 5);
        boolean z2 = false;
        if (r8.A00 == 0) {
            z2 = true;
        }
        if (z && z2) {
            C39770A8k a8k2 = A2A.A00;
            a8k2.A00.cancel();
            a8k2.A00 = new AnimatorSet();
            a8k2.A01 = new ArrayList();
        }
        View view3 = a50.A00;
        Resources resources = view3.getResources();
        boolean z3 = r8.A04;
        int i2 = R.dimen.abc_edit_text_inset_top_material;
        if (z3) {
            i2 = R.dimen.asset_picker_static_sticker_last_row_padding;
        }
        0nA.A0X(view3, resources.getDimensionPixelSize(i2));
        ArrayList arrayList = a50.A01;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj5 = arrayList.get(i3);
            0qQ.A07(obj5);
            View view4 = (View) obj5;
            Object tag2 = view4.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetItemViewBinder.Holder");
            C380519Ym r10 = (C380519Ym) tag2;
            long j = (long) (r8.A01 + i3 + 1);
            if (i3 < r9.A01()) {
                C317876nz r11 = (C317876nz) r9.A02(i3);
                Long valueOf = Long.valueOf(j);
                AIM.A02(userSession, r14, r15, r10, r11, valueOf);
                if (z) {
                    view4.setVisibility(4);
                    A2A.A00.A00(view4, r8, i3);
                }
                27p.A01(userSession).A1j(valueOf, r11.A0Z, AED.A02(r11, false), AED.A00(r11));
            } else {
                RectF rectF = AIM.A01;
                0qQ.A0B(r10, 0);
                r10.A02.A02();
                r10.A00 = null;
                r10.A03.setVisibility(4);
            }
        }
        if (z && r8.A04) {
            C39770A8k a8k3 = A2A.A00;
            AnimatorSet animatorSet = a8k3.A00;
            animatorSet.playSequentially(a8k3.A01);
            animatorSet.start();
        }
        AnonymousClass0fD.A0A(-1842899096, A032);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.View, java.lang.Object, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1765967555);
        0qQ.A0B(viewGroup, 1);
        int i2 = this.A01;
        float f = this.A00;
        C39770A8k a8k = A2A.A00;
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_horizontal_container, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(1));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        viewGroup2.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        A50 a50 = new A50(viewGroup2);
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = false;
            if (i3 < i2 - 1) {
                z = true;
            }
            ? A002 = AIM.A00(context, f, z);
            a50.A01.add(A002);
            viewGroup2.addView(A002);
        }
        viewGroup2.setTag(a50);
        AnonymousClass0fD.A0A(-1845303968, A032);
        return viewGroup2;
    }
}
