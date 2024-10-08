package X;

import android.transition.Scene;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8ic  reason: invalid class name and case insensitive filesystem */
public final class C362868ic implements C252203oj {
    public float A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public AnonymousClass2gO A02;
    public boolean A03;
    public final Scene A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final ViewGroup A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ViewGroup A0B;
    public final ViewGroup A0C;
    public final ViewGroup A0D;
    public final 2cs A0E;
    public final AnonymousClass85O A0F;
    public final C362068hI A0G;
    public final List A0H = new ArrayList();

    public C362868ic(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, AnonymousClass85O r11, C362068hI r12) {
        0qQ.A0B(viewGroup, 1);
        this.A0B = viewGroup;
        this.A0D = viewGroup2;
        this.A0C = viewGroup3;
        this.A0G = r12;
        this.A0F = r11;
        View requireViewById = viewGroup2.requireViewById(R.id.gallery_container);
        0qQ.A07(requireViewById);
        this.A09 = (ViewGroup) requireViewById;
        View requireViewById2 = viewGroup2.requireViewById(R.id.gallery_container_coordinator);
        0qQ.A07(requireViewById2);
        this.A0A = (ViewGroup) requireViewById2;
        View requireViewById3 = viewGroup2.requireViewById(R.id.gallery_app_bar);
        0qQ.A07(requireViewById3);
        this.A08 = (ViewGroup) requireViewById3;
        View requireViewById4 = viewGroup2.requireViewById(R.id.gallery_header);
        0qQ.A07(requireViewById4);
        this.A07 = requireViewById4;
        View requireViewById5 = viewGroup2.requireViewById(R.id.text_overlay_edit_text);
        0qQ.A07(requireViewById5);
        this.A05 = requireViewById5;
        View requireViewById6 = viewGroup2.requireViewById(R.id.gallery_background);
        0qQ.A07(requireViewById6);
        this.A06 = requireViewById6;
        2cs A022 = C61340me.A00().A02();
        A022.A09(C71392co.A04(40.0d, 8.0d));
        A022.A06 = true;
        this.A0E = A022;
        this.A04 = new Scene(viewGroup, requireViewById6);
    }

    public final void A00(C3502283u r3) {
        0qQ.A0B(r3, 0);
        List list = this.A0H;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final void A01(boolean z) {
        this.A03 = false;
        2cs r5 = this.A0E;
        if (r5.A09.A00 == 0.0d) {
            return;
        }
        if (z) {
            r5.A06(0.0d);
        } else {
            r5.A08(0.0d, true);
        }
    }

    public final void A02(boolean z) {
        this.A03 = true;
        int height = this.A09.getHeight();
        if (height != 0) {
            2cs r5 = this.A0E;
            double d = (double) height;
            if (r5.A09.A00 == d) {
                return;
            }
            if (z) {
                r5.A06(d);
            } else {
                r5.A08(d, true);
            }
        } else if (this.A01 == null) {
            this.A01 = new APD(this, z);
            this.A0D.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r20) {
        float f;
        int i = 0;
        2cs r0 = r20;
        0qQ.A0B(r0, 0);
        float f2 = (float) r0.A09.A00;
        ViewGroup viewGroup = this.A09;
        int height = viewGroup.getHeight();
        this.A00 = (float) Math.min(Math.max(AnonymousClass37Q.A04((double) f2, 0.0d, (double) height, 0.0d, 1.0d), 0.0d), 1.0d);
        ViewGroup viewGroup2 = this.A0D;
        viewGroup2.setTranslationY(0.0f);
        viewGroup2.setScaleX(1.0f);
        viewGroup2.setScaleY(1.0f);
        if (f2 < 0.0f) {
            f = 0.15f * f2;
        } else {
            float f3 = (float) height;
            if (f2 > f3) {
                f = f3 + ((f2 - f3) * 0.15f);
            } else {
                f = f2;
            }
        }
        float f4 = -f;
        this.A0C.setTranslationY(f4);
        this.A05.setTranslationY(f4);
        float f5 = ((float) height) - f;
        this.A07.setTranslationY(f5);
        viewGroup.setTranslationY(f5);
        this.A08.setTranslationY(f5);
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        ViewGroup viewGroup3 = this.A0A;
        if (i2 <= 0) {
            i = 4;
        }
        viewGroup3.setVisibility(i);
        List list = this.A0H;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C3502283u) list.get(i3)).DHa(this.A00, f2);
        }
    }
}
