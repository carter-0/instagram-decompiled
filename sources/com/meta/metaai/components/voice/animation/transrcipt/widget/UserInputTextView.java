package com.meta.metaai.components.voice.animation.transrcipt.widget;

import X.0qQ;
import X.AnonymousClass3Tj;
import X.C70973OTu;
import X.C74285PsD;
import X.JTT;
import X.PS1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UserInputTextView extends AnonymousClass3Tj {
    public C74285PsD A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserInputTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        C74285PsD psD = this.A00;
        if (psD != null) {
            C70973OTu oTu = ((PS1) psD).A00;
            if (i == 0) {
                C70973OTu.A00(oTu);
                return;
            }
            oTu.A04 = false;
            Choreographer.getInstance().removeFrameCallback(oTu.A09);
        }
    }

    public final void setOnVisibilityChangeListener(C74285PsD psD) {
        this.A00 = psD;
    }

    public /* synthetic */ UserInputTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserInputTextView(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
