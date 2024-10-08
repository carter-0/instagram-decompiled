package com.instagram.notifications.badging.ui.component;

import X.0Yt;
import X.0eP;
import X.0qQ;
import X.2aD;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass2g1;
import X.AnonymousClass9LU;
import X.C226242fw;
import X.C71122ap;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ToastingBadge extends C226242fw {
    public 2aD A00;
    public final AnonymousClass2g1 A01;
    public final boolean A02;
    public final TypedArray A03;
    public final Map A04;
    public final AnonymousClass0eM A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setUseCase(2aD r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final 2aD getUseCase() {
        2aD r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("useCase");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{new 0eP(0, AnonymousClass2g1.BOTTOM_NAVIGATION_BAR), new 0eP(1, AnonymousClass2g1.PROFILE_PAGE), new 0eP(2, AnonymousClass2g1.PROFILE_MENU), new 0eP(3, AnonymousClass2g1.ACCOUNT_SWITCHER), new 0eP(4, AnonymousClass2g1.ACTIVITY_FEED), new 0eP(5, AnonymousClass2g1.TOP_NAVIGATION_BAR)});
        this.A04 = A06;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A2J, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        this.A03 = obtainStyledAttributes;
        this.A02 = obtainStyledAttributes.getBoolean(2, false);
        AnonymousClass2g1 r0 = (AnonymousClass2g1) A06.get(Integer.valueOf(obtainStyledAttributes.getInt(0, -1)));
        this.A01 = r0 == null ? AnonymousClass2g1.INVALID : r0;
        this.A05 = AnonymousClass0eN.A01(new AnonymousClass9LU(this, 0));
    }

    public C71122ap getViewModelFactory() {
        return (C71122ap) this.A05.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastingBadge(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
