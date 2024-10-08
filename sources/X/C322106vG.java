package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.6vG  reason: invalid class name and case insensitive filesystem */
public final class C322106vG implements C252243on, C252203oj {
    public FrameLayout A00;
    public C273694n2 A01;
    public AnonymousClass6NS A02;
    public final 2cs A03;

    public final void A01(ViewGroup viewGroup, AnonymousClass4UE r11, 2bv r12) {
        C231002qi r0;
        C229382nI r4;
        AnonymousClass4UC r6;
        FrameLayout frameLayout;
        AnonymousClass4UE r62 = r11;
        0qQ.A0B(viewGroup, 0);
        2bv r5 = r12;
        0qQ.A0B(r12, 1);
        0qQ.A0B(r11, 2);
        2cs r3 = this.A03;
        if (!r3.A0C()) {
            r3.A01();
            A00(this);
        }
        r3.A05(0.0d);
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        if ((r12 instanceof C231002qi) && (r0 = (C231002qi) r5) != null && (r4 = (C229382nI) r0.A02.getValue()) != null && (r11 instanceof AnonymousClass4UC) && (r6 = (AnonymousClass4UC) r62) != null) {
            if (this.A00 == null) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.bloks_floating_banner, viewGroup, false);
                if ((inflate instanceof FrameLayout) && (frameLayout = (FrameLayout) inflate) != null) {
                    this.A00 = frameLayout;
                    viewGroup.addView(frameLayout);
                } else {
                    return;
                }
            }
            C273694n2 r1 = new C273694n2(context);
            this.A01 = r1;
            FrameLayout frameLayout2 = this.A00;
            if (frameLayout2 != null) {
                frameLayout2.addView(r1);
            }
            r4.A01.put(R.id.bloks_action_listener, new C49599EzI(context, r4, r5, r6, new C50886Fk4(this), (Map) null));
        }
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r6) {
        0qQ.A0B(r6, 0);
        if (r6.A09.A00 == -1.0d) {
            A00(this);
            C273694n2 r1 = this.A01;
            if (r1 != null) {
                r1.setTranslationY(0.0f);
            }
            r6.A05(0.0d);
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        int i;
        0qQ.A0B(r5, 0);
        float f = (float) r5.A09.A00;
        C273694n2 r0 = this.A01;
        if (r0 != null) {
            i = r0.getMeasuredHeight();
        } else {
            i = 0;
        }
        C273694n2 r2 = this.A01;
        if (r2 != null) {
            r2.setTranslationY((-f) * ((float) i));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C322106vG r2) {
        AnonymousClass6NS r0 = r2.A02;
        if (r0 != null) {
            r0.A05();
            r2.A02 = null;
            FrameLayout frameLayout = r2.A00;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            r2.A01 = null;
        }
    }

    public C322106vG() {
        2cs A022 = C61340me.A00().A02();
        A022.A09(C71392co.A02);
        A022.A05(0.0d);
        A022.A06 = true;
        A022.A0A(this);
        this.A03 = A022;
    }

    public final void onDestroyView() {
        A00(this);
        this.A01 = null;
        this.A00 = null;
    }
}
