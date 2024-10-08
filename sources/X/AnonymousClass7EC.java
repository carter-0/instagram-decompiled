package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.7EC  reason: invalid class name */
public final class AnonymousClass7EC implements C2365734g {
    public final /* synthetic */ AnonymousClass7EB A00;

    public final void DKS(View view) {
        Drawable findDrawableByLayerId;
        0qQ.A0B(view, 0);
        AnonymousClass7EB r2 = this.A00;
        LinearLayout linearLayout = (LinearLayout) view.requireViewById(R.id.message_reactions_pill_container);
        0qQ.A0B(linearLayout, 0);
        r2.A04 = linearLayout;
        Drawable background = r2.A00().getBackground();
        if (background != null) {
            LayerDrawable layerDrawable = (LayerDrawable) background;
            r2.A01 = layerDrawable;
            if (layerDrawable == null || (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.message_reactions_pill_shadow_layer)) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            r2.A00 = findDrawableByLayerId;
            Context context = r2.A00().getContext();
            if (context != null) {
                LayerDrawable layerDrawable2 = r2.A01;
                if (layerDrawable2 != null) {
                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.message_reactions_pill_background_layer);
                    if (findDrawableByLayerId2 != null) {
                        findDrawableByLayerId2.setColorFilter(AnonymousClass37O.A00(2Yu.A0F(context, R.attr.reactionsMessagePillBackgroundColor)));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            LinearLayout linearLayout2 = (LinearLayout) view.requireViewById(R.id.reactions);
            0qQ.A0B(linearLayout2, 0);
            r2.A03 = linearLayout2;
            LinearLayout linearLayout3 = (LinearLayout) view.requireViewById(R.id.reactors);
            0qQ.A0B(linearLayout3, 0);
            r2.A05 = linearLayout3;
            TextView textView = (TextView) view.requireViewById(R.id.reactors_number);
            0qQ.A0B(textView, 0);
            r2.A06 = textView;
            LinearLayout linearLayout4 = (LinearLayout) view.requireViewById(R.id.reaction_add);
            0qQ.A0B(linearLayout4, 0);
            r2.A02 = linearLayout4;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AnonymousClass7EC(AnonymousClass7EB r1) {
        this.A00 = r1;
    }
}
