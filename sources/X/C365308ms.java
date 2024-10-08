package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8ms  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C365308ms implements Runnable {
    public final /* synthetic */ AnonymousClass8K4 A00;

    public /* synthetic */ C365308ms(AnonymousClass8K4 r1) {
        this.A00 = r1;
    }

    public final void run() {
        float f;
        float f2;
        Integer num;
        Integer num2;
        int i;
        int i2;
        Rect bounds;
        Rect bounds2;
        String str;
        AnonymousClass8K4 r8 = this.A00;
        0qQ.A0B(r8.A0D, 1);
        02m.A0p.markerEnd(17634072, 2);
        C352218Cl A03 = r8.A0I.A02.A01.A03();
        if (A03 != null && A03.A08 == 1) {
            if (A03.A0v) {
                str = "preview";
            } else {
                str = "camera";
            }
            String str2 = A03.A0a;
            if (str2 == null) {
                str2 = new String();
            }
            C360908fL.A04(str, str2, (Throwable) null, true);
        }
        C357178Wv r7 = (C357178Wv) r8.A0j.get();
        if (r7 != null) {
            C357178Wv.A00(r7);
            AnonymousClass82Y r1 = r7.A03.A02.A01;
            C352218Cl A032 = r1.A03();
            A032.getClass();
            boolean z = false;
            if (r1.A0G != null) {
                z = true;
            }
            AnonymousClass8FL r6 = (AnonymousClass8FL) r7.A05.A00.A00();
            boolean z2 = r1.A0L;
            if (r6.A04 != null) {
                f = r6.A00;
                f2 = r6.A01;
            } else {
                f = 0.27499998f * ((float) r6.A0B);
                f2 = ((float) r6.A0A) * -0.23499998f;
            }
            RoundedCornerFrameLayout roundedCornerFrameLayout = r6.A0N;
            float rotation = roundedCornerFrameLayout.getRotation();
            float scaleX = roundedCornerFrameLayout.getScaleX();
            ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
            if (!(layoutParams instanceof FrameLayout.LayoutParams) || layoutParams == null) {
                new FrameLayout.LayoutParams(roundedCornerFrameLayout.getLayoutParams());
            }
            AnonymousClass8BH r4 = r6.A07;
            Drawable drawable = r6.A04;
            if (drawable == null || (bounds2 = drawable.getBounds()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(bounds2.width());
            }
            Drawable drawable2 = r6.A04;
            if (drawable2 == null || (bounds = drawable2.getBounds()) == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(bounds.height());
            }
            C352218Cl r3 = A032.A0L;
            if (r3 != null && ((num != null || z2) && A032.A08 == 1)) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = (int) (((float) r6.A0B) * 0.35f);
                }
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = (int) (((float) r6.A0A) * 0.35f);
                }
                float f3 = (float) i2;
                Bitmap A002 = AnonymousClass9y1.A00(r3.A0C, r3.A06(), (float) i, f3, (float) r3.A07, r3.A13);
                if (A002 != null && !z) {
                    A032.A0b = "dual";
                    C39890ADo aDo = new C39890ADo();
                    aDo.A0H = true;
                    aDo.A08 = r6.A0M;
                    aDo.A06 = r4;
                    aDo.A01(f, f2);
                    aDo.A03 = rotation;
                    aDo.A04 = scaleX;
                    aDo.A01 = 0.07f;
                    aDo.A00 = 1.75f;
                    C310416b1 r2 = new C310416b1(aDo);
                    AnonymousClass9XB r12 = new AnonymousClass9XB(r6.A0C, A002, r3.A06(), r6.A0B, r6.A0A, r3.A07, 50);
                    C294975nL.A00(roundedCornerFrameLayout).A0G();
                    roundedCornerFrameLayout.setVisibility(4);
                    AnonymousClass8BA r13 = r6.A0J;
                    List singletonList = Collections.singletonList("dual_photo");
                    0qQ.A07(singletonList);
                    r13.A0f(r12, r6.A0E, r2, (String) null, singletonList);
                    r6.A05 = r12;
                    r6.A0L.A0S(r6.A04);
                    r6.A04 = null;
                }
            }
            C3509286x r32 = r7.A04;
            AnonymousClass876 r22 = r32.A0H;
            if (r22.A01() != null) {
                AnonymousClass87I r14 = AnonymousClass87I.BIRTHDAY_HIGHLIGHTS;
                AnonymousClass87I r0 = r22.A01().A04;
                if (r0 == null) {
                    r0 = AnonymousClass87I.EMPTY;
                }
                if (r14.equals(r0)) {
                    r32.A06();
                }
            }
        }
        Runnable runnable = r8.A06;
        if (runnable != null) {
            runnable.run();
            r8.A06 = null;
        }
    }
}
