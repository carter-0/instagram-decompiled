package com.bloks.foa.components.bottomsheet;

import X.AnonymousClass972;
import X.C14597Tz1;
import X.C14640Tzm;
import X.C14916UFa;
import X.C20941X5k;
import X.C70652Tj;
import android.view.View;
import java.util.Collections;
import java.util.List;

public abstract class ViewDragHelper$Callback {
    public final void A00(View view) {
        C14597Tz1 tz1 = ((C14916UFa) this).A00;
        List<C20941X5k> list = tz1.A0H;
        if (!list.isEmpty()) {
            for (C20941X5k DYF : list) {
                DYF.DYF(view, tz1.getHeight());
            }
        }
    }

    public final void A01(View view, float f) {
        C14916UFa uFa = (C14916UFa) this;
        if (view != null) {
            C14597Tz1 tz1 = uFa.A00;
            int height = tz1.getHeight();
            C14640Tzm tzm = tz1.A05;
            tzm.A09.abortAnimation();
            tzm.A09.fling(0, 0, 0, (int) f, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE);
            int finalY = tzm.A09.getFinalY();
            tzm.A09.abortAnimation();
            int top = height - (view.getTop() + finalY);
            List list = tz1.A06;
            if (list == null) {
                list = Collections.emptyList();
            }
            C70652Tj A00 = C14597Tz1.A00(view, tz1, list, top, height);
            if (A00 != null) {
                tz1.A04 = A00;
                int Bdk = height - A00.Bdk(view, height);
                try {
                    int i = tz1.A00;
                    if (tzm.A0A) {
                        tzm.A07.getXVelocity(tzm.A02);
                        C14640Tzm.A06(tzm, Bdk, (int) tzm.A07.getYVelocity(tzm.A02), i);
                        tz1.postInvalidateOnAnimation();
                        return;
                    }
                    throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                } catch (NullPointerException unused) {
                }
            }
        }
    }
}
