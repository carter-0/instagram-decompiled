package com.instagram.showreel.composition.ui;

import X.002;
import X.0qQ;
import X.0rw;
import X.0tS;
import X.A4P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass6K2;
import X.AnonymousClass6LO;
import X.AnonymousClass6LP;
import X.AnonymousClass6NN;
import X.AnonymousClass6Q8;
import X.C229392nJ;
import X.C3028165n;
import X.C3028265o;
import X.C307786Rm;
import X.C313266gA;
import X.C377209Ky;
import X.C52367GPo;
import X.C52845Gdb;
import X.C54705HPk;
import X.C54769HSb;
import X.C56988IKg;
import X.C59668JSn;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.ArrayList;
import java.util.List;

public class IgShowreelCompositionView extends C3028165n implements C3028265o {
    public int A00;
    public C52845Gdb A01;
    public final List A02 = new ArrayList();
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C377209Ky(this, 30));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgShowreelCompositionView(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void CIc(AnonymousClass6Q8 r7) {
        String A0t;
        0tS A002 = 0tS.A4E.A00();
        if (A002.A0c() || A002.A0d()) {
            C52845Gdb gdb = this.A01;
            if (gdb == null) {
                Context context = getContext();
                0qQ.A07(context);
                gdb = new C52845Gdb(context);
                this.A01 = gdb;
                gdb.setBorderColor(-9826899);
                addView(gdb, new FrameLayout.LayoutParams(-1, -1, 17));
            }
            gdb.setVisibility(0);
            gdb.setBorderEnabled(A002.A0d());
            if (!A002.A0c()) {
                A0t = null;
            } else {
                A0t = 0rw.A0t(002.A11("\n                Client name: ", r7.A01, "\n                Template name: ", r7.A04, "\n\n                "));
            }
            gdb.setInfoText(A0t);
            return;
        }
        C52845Gdb gdb2 = this.A01;
        if (gdb2 != null) {
            gdb2.setVisibility(8);
        }
    }

    public void setShowreelAnimation(UserSession userSession, IgShowreelComposition igShowreelComposition, AnonymousClass6LO r11, C229392nJ r12) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(igShowreelComposition, 1);
        0qQ.A0B(r11, 2);
        0qQ.A0B(r12, 3);
        setShowreelAnimation(userSession, igShowreelComposition, r11, r12, (AnonymousClass6NN) null, (C54705HPk) null, (C307786Rm) null);
    }

    public static /* synthetic */ void setShowreelAnimation$default(IgShowreelCompositionView igShowreelCompositionView, UserSession userSession, IgShowreelComposition igShowreelComposition, AnonymousClass6LO r5, C229392nJ r6, AnonymousClass6NN r7, C54705HPk hPk, C307786Rm r9, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                r7 = null;
            }
            if ((i & 32) != 0) {
                hPk = null;
            }
            if ((i & 64) != 0) {
                r9 = null;
            }
            igShowreelCompositionView.setShowreelAnimation(userSession, igShowreelComposition, r5, r6, r7, hPk, r9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShowreelAnimation");
    }

    public final void A04() {
        for (A4P a4p : this.A02) {
            C313266gA r1 = a4p.A00;
            Runnable runnable = r1.A07;
            if (runnable != null) {
                runnable.run();
            }
            r1.A07 = null;
        }
    }

    public final void A05() {
        for (A4P a4p : this.A02) {
            a4p.A00.A00();
        }
    }

    public final void DOf(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (i == 3) {
                reset();
            }
            ColorDrawable colorDrawable = this.A00;
            if (colorDrawable == null || this.A00 == 2) {
                colorDrawable = null;
            }
            setBackground(colorDrawable);
        }
    }

    public C52367GPo getController() {
        return (C52367GPo) this.A03.getValue();
    }

    public void reset() {
        for (A4P a4p : this.A02) {
            a4p.A00.A00();
        }
        getCompositionController().reset();
    }

    public final void A03(View view, Integer num, String str, int i, int i2, int i3, int i4) {
        C52367GPo controller = getController();
        String A002 = C54769HSb.A00(num);
        AnonymousClass6LP r0 = controller.A02;
        if (r0 != null) {
            r0.A0G(A002, i, i2);
        }
        super.A03(view, num, str, i, i2, i3, i4);
    }

    public final boolean CWX() {
        return getCompositionController().CWX();
    }

    public void Dyz() {
        getCompositionController().Dyz();
    }

    public void Dz8() {
        getCompositionController().Dz8();
    }

    public final void DzB() {
        getCompositionController().DzB();
    }

    public final void E2p() {
        getCompositionController().E2p();
    }

    public final void EIx() {
        getCompositionController().EIx();
    }

    public C59668JSn getCompositionController() {
        return getController();
    }

    public final AnonymousClass6K2 getVideoView() {
        return getCompositionController().getVideoView();
    }

    public final boolean isPlaying() {
        return getCompositionController().isPlaying();
    }

    public final void pause() {
        getCompositionController().pause();
    }

    public final void stop() {
        getCompositionController().stop();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgShowreelCompositionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public void setShowreelAnimation(UserSession userSession, IgShowreelComposition igShowreelComposition, AnonymousClass6LO r11, C229392nJ r12, AnonymousClass6NN r13, C54705HPk hPk, C307786Rm r15) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(igShowreelComposition, 1);
        0qQ.A0B(r11, 2);
        0qQ.A0B(r12, 3);
        getController().ElG(userSession, igShowreelComposition, r11, r12, new C56988IKg(r13, this), (C54705HPk) null, (C307786Rm) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgShowreelCompositionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
