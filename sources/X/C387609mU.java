package X;

import android.content.Context;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9mU  reason: invalid class name and case insensitive filesystem */
public final class C387609mU extends C353358Hh {
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C380619Yw r52 = (C380619Yw) r5;
        0qQ.A0B(r52, 0);
        IgImageView igImageView = r52.A0A;
        AnonymousClass518 A01 = A01(i);
        if (A01 != null) {
            C347087wF r2 = (C347087wF) A01;
            Context context = this.A01;
            igImageView.setImageDrawable(context.getDrawable(r2.A02));
            igImageView.setContentDescription(context.getString(r2.A01));
            A07(r52, i);
            if (i != this.A00) {
                igImageView.setColorFilter(-1);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
