package com.instagram.creation.capture.quickcapture.karaoke.editor;

import X.0qQ;
import X.AnonymousClass3AW;
import X.AnonymousClass52S;
import X.AnonymousClass52T;
import X.AnonymousClass7TF;
import X.C60651Joy;
import X.C64724Lh1;
import X.KG4;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;

public final class KaraokeStickerEditorController$layoutManager$1 extends LinearLayoutManager {
    public final /* synthetic */ C64724Lh1 A00;

    public final View A0Y(View view, int i) {
        0qQ.A0B(view, 0);
        return view;
    }

    public final boolean A0x(Rect rect, View view, RecyclerView recyclerView, boolean z, boolean z2) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KaraokeStickerEditorController$layoutManager$1(Context context, C64724Lh1 lh1) {
        super(context, 1, false);
        this.A00 = lh1;
    }

    public final void A1T(AnonymousClass3AW r3, RecyclerView recyclerView, int i) {
        AnonymousClass52S r0 = new AnonymousClass52S(this.A00.A0F);
        r0.A00 = i;
        A0t(r0);
    }

    public final boolean A1Y() {
        C60651Joy joy = ((KG4) this.A00.A0P.getValue()).A00;
        if (joy == null || AnonymousClass7TF.A0f(joy.A01) == null) {
            return true;
        }
        AnonymousClass52T r0 = this.A06;
        if (r0 == null || !r0.A05) {
            return false;
        }
        return true;
    }

    public final int A1h(AnonymousClass3AW r2) {
        return ((NineSixteenLayoutConfigImpl) this.A00.A0K).A04 * 2;
    }
}
