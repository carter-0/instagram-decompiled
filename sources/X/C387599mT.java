package X;

import android.content.Context;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9mT  reason: invalid class name and case insensitive filesystem */
public final class C387599mT extends C353358Hh {
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C380619Yw r52 = (C380619Yw) r5;
        0qQ.A0B(r52, 0);
        IgImageView igImageView = r52.A0A;
        igImageView.A09();
        AnonymousClass518 A01 = A01(i);
        if (A01 != null) {
            Context context = this.A01;
            C16609Uy5 uy5 = ((C64541Ldi) A01).A00;
            igImageView.setImageDrawable(context.getDrawable(uy5.A01));
            igImageView.setContentDescription(context.getString(uy5.A00));
            2eS.A01(igImageView);
            A07(r52, i);
            int i2 = -65536;
            if (i != this.A00) {
                i2 = -1;
            }
            igImageView.setColorFilter(i2);
            return;
        }
        throw AnonymousClass7TE.A0z("Sticker style should not be null.");
    }
}
