package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9ib  reason: invalid class name and case insensitive filesystem */
public final class C385229ib extends C231632rz {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass8MJ A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(-59345855);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0B(obj3, 2);
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerWithContentViewBinder.Holder");
        C39754A7u a7u = (C39754A7u) tag;
        boolean z = this.A03;
        UserSession userSession = this.A01;
        JV7 jv7 = (JV7) obj3;
        AnonymousClass8MJ r12 = this.A02;
        AnonymousClass7TF.A1H(userSession, a7u);
        AnonymousClass7TF.A1C(jv7, 2, r12);
        AAT.A00(jv7, userSession);
        View view3 = a7u.A03;
        if (z) {
            Object tag2 = view3.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetRedesignItemViewBinder.Holder");
            C380549Yp r13 = (C380549Yp) tag2;
            0qQ.A0B(r13, 0);
            r13.A03.A02();
            r13.A00 = null;
            r13.A01.setVisibility(8);
            AAT.A01(a7u);
            C317876nz r14 = (C317876nz) jv7.A00;
            AAS.A00(userSession, r12, r13, r14, 0L, 359.0f);
            a7u.A02 = r14;
            a7u.A01 = r13.A00;
            view3.setVisibility(0);
            TextView textView = a7u.A05;
            textView.setVisibility(0);
            textView.setText(jv7.A02);
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = textView.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            textView.setLayoutParams(layoutParams);
            TextView textView2 = a7u.A04;
            textView2.setVisibility(0);
            textView2.setText(jv7.A01);
            textView2.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            Resources resources = textView2.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            layoutParams2.setMarginStart(dimensionPixelSize);
            layoutParams2.setMarginEnd(dimensionPixelSize);
            layoutParams2.bottomMargin = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            textView2.setLayoutParams(layoutParams2);
            27p.A01(userSession).A1j((Long) null, r14.A0Z, AED.A02(r14, false), AED.A00(r14));
        } else {
            Object tag3 = view3.getTag();
            0qQ.A0C(tag3, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetItemViewBinder.Holder");
            C380519Ym r10 = (C380519Ym) tag3;
            RectF rectF = AIM.A01;
            0qQ.A0B(r10, 0);
            r10.A02.A02();
            r10.A00 = null;
            r10.A03.setVisibility(4);
            AAT.A01(a7u);
            C317876nz r6 = (C317876nz) jv7.A00;
            AIM.A02(userSession, (C357638Yz) null, r12, r10, r6, 0L);
            a7u.A02 = r6;
            a7u.A00 = r10.A00;
            view3.setVisibility(0);
            TextView textView3 = a7u.A05;
            textView3.setVisibility(0);
            textView3.setText(jv7.A02);
            TextView textView4 = a7u.A04;
            textView4.setVisibility(0);
            textView4.setText(jv7.A01);
            27p.A01(userSession).A1j((Long) null, r6.A0Z, AED.A02(r6, false), AED.A00(r6));
        }
        AnonymousClass0fD.A0A(393702720, A032);
    }

    public C385229ib(Context context, UserSession userSession, AnonymousClass8MJ r3, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = z;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-576805549);
        0qQ.A0B(viewGroup, 1);
        Context context = this.A00;
        UserSession userSession = this.A01;
        boolean z = this.A03;
        AnonymousClass7TF.A1B(context, 0, userSession);
        LayoutInflater from = LayoutInflater.from(context);
        int i2 = R.layout.layout_asset_picker_section_sticker_with_content_horizontal;
        if (z) {
            i2 = R.layout.layout_asset_picker_section_sticker_with_content_vertical;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        0qQ.A0A(inflate);
        C39754A7u a7u = new C39754A7u(inflate, viewGroup, z);
        ((ViewGroup) inflate.requireViewById(R.id.sticker_placeholder)).addView(a7u.A03);
        inflate.setTag(a7u);
        AnonymousClass0fD.A0A(-168658130, A032);
        return inflate;
    }
}
