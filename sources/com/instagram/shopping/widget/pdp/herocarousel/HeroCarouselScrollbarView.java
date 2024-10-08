package com.instagram.shopping.widget.pdp.herocarousel;

import X.0qQ;
import X.2cs;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C19650WdE;
import X.C20850X1c;
import X.C252553pI;
import X.C64433Lbo;
import X.JTT;
import X.U1K;
import X.UEE;
import X.V3E;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class HeroCarouselScrollbarView extends View {
    public RecyclerView A00;
    public C20850X1c A01;
    public boolean A02;
    public int A03;
    public final 2cs A04;
    public final U1K A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HeroCarouselScrollbarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (C20850X1c) null);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A04.A09.A00 > 0.0d) {
            this.A05.draw(canvas);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (super.verifyDrawable(drawable) || 0qQ.A0K(this.A05, drawable)) {
            return true;
        }
        return false;
    }

    public static final void A00(RecyclerView recyclerView, HeroCarouselScrollbarView heroCarouselScrollbarView) {
        C252553pI r0 = recyclerView.A0D;
        if (r0 != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r0;
            0qQ.A0A(linearLayoutManager);
            int A1d = linearLayoutManager.A1d();
            if (A1d == -1) {
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) recyclerView.A0D;
                0qQ.A0A(linearLayoutManager2);
                A1d = linearLayoutManager2.A1a();
            }
            if (A1d == -1) {
                A1d = heroCarouselScrollbarView.A03;
            }
            heroCarouselScrollbarView.A03 = A1d;
            C20850X1c x1c = heroCarouselScrollbarView.A01;
            if (x1c != null) {
                C252553pI r02 = recyclerView.A0D;
                0qQ.A0A(r02);
                int A0U = r02.A0U();
                UEE uee = ((C19650WdE) x1c).A00;
                uee.A01 = A1d;
                uee.A00 = A0U;
                V3E v3e = uee.A07;
                if (uee.A03) {
                    A0U = uee.A02;
                }
                0qQ.A0B(v3e, 0);
                if (A0U > 1 && A1d >= 0 && A1d < A0U) {
                    v3e.A00.setVisibility(8);
                }
            }
        }
    }

    public static final void A01(HeroCarouselScrollbarView heroCarouselScrollbarView) {
        RecyclerView recyclerView = heroCarouselScrollbarView.A00;
        if (recyclerView != null) {
            int computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
            if (computeHorizontalScrollExtent < computeHorizontalScrollRange) {
                int width = (heroCarouselScrollbarView.getWidth() * computeHorizontalScrollExtent) / computeHorizontalScrollRange;
                int width2 = ((heroCarouselScrollbarView.getWidth() - width) * computeHorizontalScrollOffset) / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
                U1K u1k = heroCarouselScrollbarView.A05;
                if (!(u1k.A01 == width2 && u1k.A00 == width)) {
                    u1k.A01 = width2;
                    u1k.A00 = width;
                    U1K.A00(u1k);
                }
                2cs r3 = heroCarouselScrollbarView.A04;
                float f = 0.0f;
                if (heroCarouselScrollbarView.A02) {
                    f = 1.0f;
                }
                r3.A06((double) f);
                return;
            }
            U1K u1k2 = heroCarouselScrollbarView.A05;
            if (!(u1k2.A01 == 0 && u1k2.A00 == 0)) {
                u1k2.A01 = 0;
                u1k2.A00 = 0;
                U1K.A00(u1k2);
            }
            2cs r0 = heroCarouselScrollbarView.A04;
            r0.A04();
            r0.A01();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(-612923030);
        this.A05.setBounds(0, 0, i, i2);
        A01(this);
        AnonymousClass0fD.A0D(1751904989, A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeroCarouselScrollbarView(Context context, AttributeSet attributeSet, int i, C20850X1c x1c) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        U1K u1k = new U1K(context);
        this.A05 = u1k;
        this.A02 = true;
        u1k.setCallback(this);
        this.A01 = x1c;
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A08(0.0d, true);
        A0J.A06 = true;
        A0J.A0A(new C64433Lbo(this, 3));
        this.A04 = A0J;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HeroCarouselScrollbarView(Context context) {
        this(context, (AttributeSet) null, 0, (C20850X1c) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeroCarouselScrollbarView(Context context, AttributeSet attributeSet, int i, C20850X1c x1c, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, JTT.A01(i2, i), (i2 & 8) != 0 ? null : x1c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HeroCarouselScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (C20850X1c) null);
        0qQ.A0B(context, 1);
    }
}
