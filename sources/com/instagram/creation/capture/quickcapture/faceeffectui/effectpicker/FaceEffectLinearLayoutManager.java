package com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker;

import X.AnonymousClass3AW;
import X.C228432lf;
import X.C67783Mun;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class FaceEffectLinearLayoutManager extends LinearLayoutManager {
    public float A00 = 350.0f;
    public C228432lf A01;
    public C67783Mun A02;
    public final Context A03;

    public FaceEffectLinearLayoutManager(Context context) {
        super(context, 0, false);
        this.A03 = context;
    }

    public final void A1T(AnonymousClass3AW r3, RecyclerView recyclerView, int i) {
        C67783Mun mun = new C67783Mun(this.A03, this);
        this.A02 = mun;
        mun.A00 = i;
        A0t(mun);
    }

    public final int Ba9() {
        return 0;
    }

    public final int BaB() {
        return 0;
    }
}
