package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.text.TightTextView;
import java.util.HashMap;

/* renamed from: X.90a  reason: invalid class name and case insensitive filesystem */
public final class C3722390a implements C328007Db, C74455PvA, C328017Dc, C328027Dd {
    public FrameLayout A00;
    public C328087Dj A01;
    public final Context A02 = this.A00.getContext();
    public final Drawable A03 = C328037De.A00();
    public final ForegroundColorSpan A04;
    public final StyleSpan A05 = new StyleSpan(1);
    public final ImageView A06;
    public final TightTextView A07;
    public final AnonymousClass9HC A08;
    public final AnonymousClass7RW A09;

    /* JADX WARNING: type inference failed for: r2v1, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public C3722390a(View view, AnonymousClass9HC r6, AnonymousClass7RW r7) {
        0qQ.A0B(view, 1);
        this.A00 = (FrameLayout) view.requireViewById(R.id.message_content_visual_bubble_container);
        ? r2 = (TightTextView) view.requireViewById(R.id.direct_visual_message_digest);
        this.A07 = r2;
        this.A06 = (ImageView) view.requireViewById(R.id.direct_visual_message_icon);
        Context context = view.getContext();
        0qQ.A07(context);
        r2.setMaxWidth(AnonymousClass7PV.A00(context, false));
        this.A04 = new ForegroundColorSpan(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text)));
        this.A08 = r6;
        this.A09 = r7;
    }

    public final void DQc() {
    }

    public final View BJd() {
        return this.A00;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public final void DOd() {
        AnonymousClass7RW r1 = this.A09;
        HashMap hashMap = r1.A05;
        if (hashMap.containsKey(this)) {
            ((C332967Xd) r1.A02).DQa((String) hashMap.get(this));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public final void DOe() {
        this.A07.setText(2131959246);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.text.TightTextView, android.view.View] */
    public final void FHQ(int i) {
        AnonymousClass7PT.A00(this.A07.getBackground(), i);
        AnonymousClass7PT.A00(this.A06.getDrawable(), i);
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
