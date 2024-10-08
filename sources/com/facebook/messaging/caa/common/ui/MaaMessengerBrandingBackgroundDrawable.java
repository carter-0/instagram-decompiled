package com.facebook.messaging.caa.common.ui;

import X.0eP;
import X.0qQ;
import X.C51969G9p;
import X.C51970G9q;
import X.C69701NqN;
import X.N0B;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.instagram.android.R;

public final class MaaMessengerBrandingBackgroundDrawable extends N0B {
    public static final String COLOR_1 = "#0099FF";
    public static final String COLOR_2 = "#A033FF";
    public static final String COLOR_3 = "#FF5280";
    public static final String COLOR_4 = "#FF7061";
    public static final C69701NqN Companion = new Object();
    public static final float POSITION_1 = 0.0f;
    public static final float POSITION_2 = 0.6f;
    public static final float POSITION_3 = 0.9f;
    public static final float POSITION_4 = 1.0f;
    public final Context context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaaMessengerBrandingBackgroundDrawable(Context context2) {
        super(context2);
        0qQ.A0B(context2, 1);
        this.context = context2;
    }

    public Drawable getIconDrawable() {
        return this.context.getDrawable(R.drawable.messenger_logo_white);
    }

    public Drawable getBrandingDrawable() {
        0eP displayMetrics = getDisplayMetrics();
        int A0B = C51970G9q.A0B(displayMetrics);
        float A0A = ((float) C51969G9p.A0A(displayMetrics)) * 0.35f;
        RadialGradient radialGradient = new RadialGradient(0.0f, A0A, (float) Math.hypot((double) A0B, (double) A0A), new int[]{Color.parseColor(COLOR_1), Color.parseColor(COLOR_2), Color.parseColor(COLOR_3), Color.parseColor(COLOR_4)}, new float[]{0.0f, 0.6f, 0.9f, 1.0f}, Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(radialGradient);
        return shapeDrawable;
    }
}
