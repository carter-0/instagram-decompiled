package com.instagram.common.ui.widget.recyclerview;

import X.AnonymousClass0fD;
import X.AnonymousClass3AN;
import X.AnonymousClass3AW;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

public class LinearLayoutManagerCompat extends LinearLayoutManager {
    public int A00 = -1;
    public int A01 = -1;
    public boolean A02 = false;

    public final int A1L(AnonymousClass3AN r2, AnonymousClass3AW r3, int i) {
        this.A00 = -1;
        this.A01 = -1;
        return super.A1L(r2, r3, i);
    }

    public LinearLayoutManagerCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void A1R(AnonymousClass3AN r3, AnonymousClass3AW r4) {
        int A03 = AnonymousClass0fD.A03(1132530470);
        this.A00 = -1;
        this.A01 = -1;
        super.A1R(r3, r4);
        AnonymousClass0fD.A0A(-1557554311, A03);
    }

    public final int A1a() {
        int i;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1136396328);
        if (!this.A02) {
            i = super.A1a();
            i2 = 1558381145;
        } else {
            i = this.A00;
            if (i == -1) {
                i = super.A1a();
                this.A00 = i;
            }
            i2 = -792683111;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return i;
    }

    public final int A1b() {
        int i;
        int i2;
        int A03 = AnonymousClass0fD.A03(-489409562);
        if (!this.A02) {
            i = super.A1b();
            i2 = -567197391;
        } else {
            i = this.A01;
            if (i == -1) {
                i = super.A1b();
                this.A01 = i;
            }
            i2 = 1158809412;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return i;
    }

    public LinearLayoutManagerCompat(Context context) {
        super(context);
    }
}
