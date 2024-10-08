package com.google.android.material.theme;

import X.2Z4;
import X.AnonymousClass3Tj;
import X.C297835sR;
import X.C297855sT;
import X.C297865sU;
import X.C309286Xr;
import X.U47;
import X.U4G;
import X.U4J;
import X.U5W;
import X.U60;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.instagram.android.R;

public class MaterialComponentsViewInflater extends 2Z4 {
    public final U47 A02(Context context, AttributeSet attributeSet) {
        return new U60(context, attributeSet);
    }

    public final U4G A03(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final AnonymousClass3Tj A06(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.U63, android.widget.CompoundButton, android.view.View, X.U4J] */
    public final U4J A04(Context context, AttributeSet attributeSet) {
        ? u4j = new U4J(C297835sR.A00(context, attributeSet, R.attr.checkboxStyle, 2132018524), attributeSet, R.attr.checkboxStyle);
        Context context2 = u4j.getContext();
        TypedArray A00 = C297855sT.A00(context2, attributeSet, C297865sU.A0O, new int[0], R.attr.checkboxStyle, 2132018524);
        if (A00.hasValue(0)) {
            u4j.setButtonTintList(C309286Xr.A01(context2, A00, 0));
        }
        u4j.A00 = A00.getBoolean(1, false);
        A00.recycle();
        return u4j;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.U6B, android.widget.CompoundButton, android.view.View, X.U5W] */
    public final U5W A05(Context context, AttributeSet attributeSet) {
        ? u5w = new U5W(C297835sR.A00(context, attributeSet, R.attr.radioButtonStyle, 2132018525), attributeSet);
        Context context2 = u5w.getContext();
        TypedArray A00 = C297855sT.A00(context2, attributeSet, C297865sU.A0P, new int[0], R.attr.radioButtonStyle, 2132018525);
        if (A00.hasValue(0)) {
            u5w.setButtonTintList(C309286Xr.A01(context2, A00, 0));
        }
        u5w.A00 = A00.getBoolean(1, false);
        A00.recycle();
        return u5w;
    }
}
