package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.7NJ  reason: invalid class name */
public abstract class AnonymousClass7NJ implements AnonymousClass7NK {
    public final AnonymousClass7NF A00;
    public final AnonymousClass7NL A01;
    public final AnonymousClass7NM A02;
    public final AnonymousClass7NG A03;
    public final AnonymousClass7NH A04;

    public final boolean A02(C39752A7s a7s, String str, C62320sa r13, C62320sa r14, boolean z) {
        C321006tQ r5;
        C39752A7s a7s2 = a7s;
        ImageView imageView = a7s.A06;
        Drawable drawable = null;
        if (imageView != null) {
            drawable = imageView.getDrawable();
        }
        if (!(drawable instanceof C321006tQ) || (r5 = (C321006tQ) drawable) == null) {
            return false;
        }
        String str2 = str;
        this.A01.A00.add(str);
        C62320sa r7 = r13;
        C62320sa r8 = r14;
        boolean z2 = z;
        if (r5.A0A == null) {
            r5.A9D(new AZ7(a7s2, this, r5, str2, r7, r8, z2));
            return true;
        }
        A00(a7s2, this, r5, str2, r7, r8, z2);
        return true;
    }

    public void ADP(C39752A7s a7s, AnonymousClass7NZ r13, String str, boolean z) {
        Paint paint;
        int i;
        int i2;
        0qQ.A0B(a7s, 0);
        View view = a7s.A01;
        if (view == null) {
            return;
        }
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new C40028AOk(view, a7s, this));
            return;
        }
        float height = (float) view.getHeight();
        ShapeDrawable shapeDrawable = a7s.A00;
        if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
            Context context = view.getContext();
            boolean z2 = this instanceof AnonymousClass7NO;
            if (z2) {
                i = R.color.avatar_powerups_angry_bubble_from;
            } else if (this instanceof AnonymousClass7NP) {
                i = R.color.avatar_powerups_laugh_bubble_from;
            } else if (this instanceof AnonymousClass7NI) {
                i = R.color.avatar_powerups_heart_bubble_from;
            } else {
                i = R.color.avatar_powerups_cry_bubble_from;
            }
            int color = context.getColor(i);
            if (z2) {
                i2 = R.color.avatar_powerups_angry_bubble_to;
            } else if (this instanceof AnonymousClass7NP) {
                i2 = R.color.avatar_powerups_laugh_bubble_to;
            } else if (this instanceof AnonymousClass7NI) {
                i2 = R.color.avatar_powerups_heart_bubble_to;
            } else {
                i2 = R.color.avatar_powerups_cry_bubble_to;
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{color, context.getColor(i2)}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setAlpha(255);
            shapeDrawable.invalidateSelf();
        }
    }

    public boolean D27(C39752A7s a7s, AnonymousClass7NZ r7, String str, boolean z) {
        String A002;
        AnonymousClass7NH r4 = this.A04;
        AnonymousClass5FV CAI = CAI();
        0qQ.A0B(CAI, 0);
        if (!CAI.A01) {
            return true;
        }
        0wc r2 = r4.A00;
        0Aj A003 = r2.A00(r2.A00, "ig_click_avatar_power_up");
        if (!A003.isSampled()) {
            return true;
        }
        A003.A9F(C66579MXk.A00(112), Long.valueOf(System.currentTimeMillis()));
        if (((Boolean) r4.A02.invoke()).booleanValue()) {
            A002 = "unknown_avatar_power_up";
        } else {
            A002 = AnonymousClass7NH.A00(CAI);
        }
        A003.AAJ("item_id", A002);
        A003.Cgf();
        return true;
    }

    public AnonymousClass7NJ(AnonymousClass7NF r1, AnonymousClass7NL r2, AnonymousClass7NM r3, AnonymousClass7NG r4, AnonymousClass7NH r5) {
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final void A00(C39752A7s a7s, AnonymousClass7NJ r8, C321006tQ r9, String str, C62320sa r11, C62320sa r12, boolean z) {
        Context context;
        long[] jArr;
        int[] iArr;
        r11.invoke();
        C39752A7s a7s2 = a7s;
        ImageView imageView = a7s.A06;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        r9.A06();
        r9.A08();
        r9.A0I = new C377729My(r8, a7s2, r12, str, 2);
        if (z && imageView != null && (context = imageView.getContext()) != null) {
            AnonymousClass7NG r5 = r8.A03;
            AnonymousClass5FV CAI = r8.CAI();
            0qQ.A0B(CAI, 1);
            Object systemService = context.getSystemService("vibrator");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            Vibrator vibrator = (Vibrator) systemService;
            if (r5.A00) {
                Object systemService2 = context.getSystemService("vibrator");
                0qQ.A0C(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                if (((Vibrator) systemService2).hasAmplitudeControl()) {
                    C69857NtL ntL = C69857NtL.$redex_init_class;
                    int ordinal = CAI.ordinal();
                    if (ordinal == 5) {
                        jArr = new long[]{50, 150, 50, 150, 50, 25, 50, 25, 50, 25, 50};
                        iArr = new int[]{15, 0, 10, 0, 25, 0, 15, 0, 10, 0, 15};
                    } else if (ordinal == 6) {
                        jArr = new long[]{500, 200, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
                        iArr = new int[]{0, 150, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5};
                    } else if (ordinal == 8) {
                        jArr = new long[]{500, 100, 150, 100, 150, 100, 150, 100, 150, 100, 150, 100, 150};
                        iArr = new int[]{0, 30, 0, 30, 0, 30, 0, 30, 0, 30, 0, 15, 0};
                    } else if (ordinal == 7) {
                        jArr = new long[]{100, 150, 50, 50, 200, 150, 50, 50, 200, 150, 50, 50};
                        iArr = new int[]{0, 30, 10, 5, 0, 30, 10, 5, 0, 30, 10, 5};
                    }
                    VibrationEffect createWaveform = VibrationEffect.createWaveform(jArr, iArr, -1);
                    0qQ.A07(createWaveform);
                    vibrator.vibrate(createWaveform);
                    return;
                }
            }
            vibrator.vibrate(50);
        }
    }

    public final /* synthetic */ boolean CQX(String str) {
        return false;
    }
}
