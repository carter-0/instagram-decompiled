package com.instagram.closefriends.view;

import X.0nA;
import X.0qQ;
import X.0sr;
import X.2cs;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C252203oj;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CloseFriendsFacecloudView extends FrameLayout implements C252203oj {
    public static final List A03 = 0sr.A1P(new Integer[]{120, 20, 240, 300, 180, 60, 330, 210, 45, 255});
    public static final List A04 = 0sr.A1P(new Integer[]{110, 110, 130, 110, 130, 130, 90, 90, 90, 90});
    public static final List A05 = 0sr.A1P(new Integer[]{62, 52, 36, 36, 36, 62, 36, 36, 36, 36});
    public Integer A00;
    public final 2cs A01;
    public final List A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CloseFriendsFacecloudView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r3) {
        0qQ.A0B(r3, 0);
        if (this.A00 == AnonymousClass05K.A01) {
            this.A00 = AnonymousClass05K.A0C;
            0nA.A00(AnonymousClass7TE.A0S(this), 3.0f);
            Iterator it = this.A02.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("isAnimated");
            }
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r3) {
        0qQ.A0B(r3, 0);
        if (this.A00 == AnonymousClass05K.A01) {
            getWidth();
            getHeight();
            Iterator it = this.A02.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("isAnimated");
            }
        }
    }

    public /* synthetic */ CloseFriendsFacecloudView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloseFriendsFacecloudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A02 = new ArrayList();
        2cs A0J = AnonymousClass7TF.A0J();
        A0J.A04();
        A0J.A01();
        A0J.A0A(this);
        this.A01 = A0J;
        this.A00 = AnonymousClass05K.A00;
    }
}
