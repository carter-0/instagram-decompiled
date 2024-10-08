package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.AOk  reason: case insensitive filesystem */
public final class C40028AOk implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C39752A7s A01;
    public final /* synthetic */ AnonymousClass7NJ A02;

    public C40028AOk(View view, C39752A7s a7s, AnonymousClass7NJ r3) {
        this.A00 = view;
        this.A01 = a7s;
        this.A02 = r3;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Paint paint;
        int i9;
        int i10;
        view.removeOnLayoutChangeListener(this);
        View view2 = this.A00;
        float A03 = AnonymousClass7TE.A03(view2);
        ShapeDrawable shapeDrawable = this.A01.A00;
        if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
            Context context = view2.getContext();
            AnonymousClass7NJ r5 = this.A02;
            boolean z = r5 instanceof AnonymousClass7NO;
            if (z) {
                i9 = R.color.avatar_powerups_angry_bubble_from;
            } else if (r5 instanceof AnonymousClass7NP) {
                i9 = R.color.avatar_powerups_laugh_bubble_from;
            } else if (r5 instanceof AnonymousClass7NI) {
                i9 = R.color.avatar_powerups_heart_bubble_from;
            } else {
                i9 = R.color.avatar_powerups_cry_bubble_from;
            }
            int color = context.getColor(i9);
            if (z) {
                i10 = R.color.avatar_powerups_angry_bubble_to;
            } else if (r5 instanceof AnonymousClass7NP) {
                i10 = R.color.avatar_powerups_laugh_bubble_to;
            } else if (r5 instanceof AnonymousClass7NI) {
                i10 = R.color.avatar_powerups_heart_bubble_to;
            } else {
                i10 = R.color.avatar_powerups_cry_bubble_to;
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, A03, new int[]{color, context.getColor(i10)}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setAlpha(255);
            shapeDrawable.invalidateSelf();
        }
    }
}
