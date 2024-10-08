package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9mV  reason: invalid class name and case insensitive filesystem */
public final class C387619mV extends C353358Hh {
    public final AnonymousClass0iw A00;

    public C387619mV(Context context, AnonymousClass0iw r8, AnonymousClass8DG r9, AnonymousClass8AM r10) {
        super(context, r9, r10, false, true);
        this.A00 = r8;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        C380619Yw r82 = (C380619Yw) r8;
        0qQ.A0B(r82, 0);
        IgImageView igImageView = r82.A0A;
        igImageView.A09();
        AnonymousClass518 A01 = A01(i);
        if (A01 != null) {
            Context context = this.A01;
            AnonymousClass6KJ r2 = ((AXK) A01).A00;
            Drawable drawable = context.getDrawable(r2.A01);
            if (drawable != null) {
                drawable.setTint(AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink));
                igImageView.setImageDrawable(drawable);
                A07(r82, i);
                if (r2 == AnonymousClass6KJ.MUSIC_ONLY) {
                    igImageView.setPadding(24, 24, 24, 24);
                } else {
                    igImageView.setPadding(0, 0, 0, 0);
                }
                if (i != this.A00) {
                    igImageView.setColorFilter(-1);
                } else {
                    igImageView.clearColorFilter();
                }
                int i2 = r2.A00;
                if (i2 != -1) {
                    View view = r82.itemView;
                    view.setContentDescription(view.getContext().getString(i2));
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
