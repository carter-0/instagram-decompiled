package com.instagram.avatars.pokes;

import X.07U;
import X.0qQ;
import X.19B;
import X.1Eo;
import X.1Er;
import X.AnonymousClass030;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0xx;
import X.AnonymousClass4D7;
import X.AnonymousClass5Gv;
import X.C262204Co;
import X.C294975nL;
import X.C46766Dkt;
import X.C60022JdY;
import X.C63909LBs;
import X.C71392co;
import X.MHH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PokeReceiverView extends IgLinearLayout implements AnonymousClass0iw {
    public Fragment A00;
    public C46766Dkt A01;
    public UserSession A02;
    public IgImageView A03;
    public AnonymousClass5Gv A04;
    public C262204Co A05;
    public C262204Co A06;
    public final AnonymousClass030 A07;
    public final C63909LBs A08;
    public final AtomicBoolean A09;
    public final String A0A;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PokeReceiverView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public static final void A00(PokeReceiverView pokeReceiverView) {
        PokeReceiverView pokeReceiverView2 = pokeReceiverView;
        Fragment fragment = pokeReceiverView.A00;
        1Er r6 = null;
        if (fragment != null) {
            07U r3 = 07U.A04;
            AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
            AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
            r6 = 1Eo.A04(19B.A00, new MHH(r3, pokeReceiverView2, viewLifecycleOwner, (AnonymousClass4D7) null, 36), A002);
        }
        pokeReceiverView2.A05 = r6;
    }

    public String getModuleName() {
        return this.A0A;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        int A052 = AnonymousClass0fD.A05(-638373174);
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (Integer.valueOf(action) != null) {
                if (action == 0) {
                    f = 0.8f;
                } else if (action == 3 || action == 1) {
                    f = 1.0f;
                }
                C294975nL A002 = C294975nL.A00(this);
                A002.A0G();
                C294975nL A0E = A002.A0E(C71392co.A02(10.0d));
                A0E.A0P(f, -1.0f);
                A0E.A0Q(f, -1.0f);
                A0E.A0H();
            }
            z = this.A07.A00.onTouchEvent(motionEvent);
        } else {
            z = false;
        }
        AnonymousClass0fD.A0C(-114563569, A052);
        return z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PokeReceiverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A08 = new C63909LBs(context);
        this.A0A = "PokeReceiverView";
        this.A07 = new AnonymousClass030(context, new C60022JdY(this));
        this.A09 = new AtomicBoolean(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PokeReceiverView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PokeReceiverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
