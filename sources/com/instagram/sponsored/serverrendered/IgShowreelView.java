package com.instagram.sponsored.serverrendered;

import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass620;
import X.AnonymousClass621;
import X.AnonymousClass623;
import X.AnonymousClass9J6;
import X.C3021861z;
import X.C377209Ky;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgShowreelView extends FrameLayout {
    public final IgShowreelCompositionView A00;
    public final ShowreelNativeMediaView A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgShowreelView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    private final AnonymousClass620 getConfigProvider() {
        return (AnonymousClass620) this.A02.getValue();
    }

    private final AnonymousClass9J6 getIntegrationPoint() {
        return (AnonymousClass9J6) this.A03.getValue();
    }

    public final IgShowreelCompositionView getShowreelCompositionView() {
        return this.A00;
    }

    public final ShowreelNativeMediaView getShowreelNativeView() {
        return this.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgShowreelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A03 = AnonymousClass0eN.A01(C3021861z.A00);
        this.A02 = AnonymousClass0eN.A01(new C377209Ky(context, 49));
        this.A01 = new ShowreelNativeMediaView(context, getIntegrationPoint(), (AnonymousClass623) null, (AnonymousClass621) getConfigProvider());
        this.A00 = new IgShowreelCompositionView(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgShowreelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgShowreelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
