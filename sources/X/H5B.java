package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.instagram.android.R;

public final class H5B extends C14097Tpp {
    public final C307786Rm A00;
    public final C276544tV A01;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        C276544tV r5 = this.A01;
        C307786Rm r6 = this.A00;
        AnonymousClass7TF.A1B(r5, 0, r6);
        C276544tV A07 = r5.A07(41);
        C276544tV A072 = r5.A07(35);
        C276544tV A073 = r5.A07(43);
        int color = context.getColor(R.color.body_parametric_default_progress_color);
        if (A07 != null) {
            color = AnonymousClass6TP.A00(r6, A07, color);
        }
        int color2 = context.getColor(R.color.body_parametric_default_progress_color);
        if (A072 != null) {
            color2 = AnonymousClass6TP.A00(r6, A072, color2);
        }
        int color3 = context.getColor(R.color.black_10_transparent);
        if (A073 != null) {
            color3 = AnonymousClass6TP.A00(r6, A073, color3);
        }
        return new C52870Ge3(context, new C56119Ht6(r5.A02(46, 0.0f), color, color2, color3));
    }

    public static final void A00(SeekBar seekBar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = seekBar.getContext().getSystemService(Vibrator.class);
            0qQ.A0C(systemService, C273654mx.A00(347));
            ((Vibrator) systemService).vibrate(VibrationEffect.createPredefined(2));
            return;
        }
        seekBar.performHapticFeedback(4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (X.0qQ.A0I(r0, r1) == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r15, X.C307786Rm r16, X.C276544tV r17, java.lang.Object r18) {
        /*
            r14 = this;
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            r9 = 0
            r10 = r16
            r11 = r17
            X.C51973G9u.A1E(r15, r10, r11)
            int r0 = r15.getChildCount()
            r7 = 0
            if (r0 <= 0) goto L_0x0090
            r13 = 0
            android.view.View r0 = X.AnonymousClass046.A00(r15, r9)
            boolean r0 = r0 instanceof android.widget.SeekBar
            if (r0 == 0) goto L_0x0090
            android.view.View r3 = X.AnonymousClass046.A00(r15, r9)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.SeekBar"
            X.0qQ.A0C(r3, r0)
            android.widget.SeekBar r3 = (android.widget.SeekBar) r3
            java.lang.Object r2 = X.C307476Qg.A06(r10, r11)
            X.Hk3 r2 = (X.C55583Hk3) r2
            r0 = 46
            r5 = 0
            float r4 = r11.A02(r0, r5)
            r0 = 44
            float r1 = r11.A02(r0, r5)
            if (r2 == 0) goto L_0x0099
            java.lang.Float r0 = r2.A01
        L_0x003c:
            boolean r0 = X.0qQ.A0I(r0, r4)
            if (r0 == 0) goto L_0x004c
            if (r2 == 0) goto L_0x0097
            java.lang.Float r0 = r2.A00
        L_0x0046:
            boolean r0 = X.0qQ.A0I(r0, r1)
            if (r0 != 0) goto L_0x0076
        L_0x004c:
            if (r2 == 0) goto L_0x005a
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r2.A01 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r2.A00 = r0
        L_0x005a:
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r4
            int r0 = (int) r0
        L_0x0062:
            r3.setMax(r0)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r4
        L_0x006c:
            r6 = r3
            X.GeD r6 = (X.C52878GeD) r6
            float r1 = r1 * r0
            int r2 = (int) r1
            r0 = 0
            X.C52878GeD.A01(r6, r2, r0)
        L_0x0076:
            android.content.Context r1 = r15.getContext()
            java.lang.String r0 = "android.permission.VIBRATE"
            int r0 = X.02K.A00(r1, r0)
            if (r0 != 0) goto L_0x0087
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r13 = 1
        L_0x0087:
            X.Tpg r8 = new X.Tpg
            r12 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            r3.setOnSeekBarChangeListener(r8)
        L_0x0090:
            return r7
        L_0x0091:
            r0 = 1120403456(0x42c80000, float:100.0)
            goto L_0x006c
        L_0x0094:
            r0 = 100
            goto L_0x0062
        L_0x0097:
            r0 = r7
            goto L_0x0046
        L_0x0099:
            r0 = r7
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H5B.A0K(android.view.View, X.6Rm, X.4tV, java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void A0L(View view, C307786Rm r5, C276544tV r6, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        C51973G9u.A1E(viewGroup, r5, r6);
        if (viewGroup.getChildCount() > 0 && (AnonymousClass046.A00(viewGroup, 0) instanceof SeekBar)) {
            View A002 = AnonymousClass046.A00(viewGroup, 0);
            0qQ.A0C(A002, "null cannot be cast to non-null type android.widget.SeekBar");
            ((SeekBar) A002).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
            viewGroup.setTag(R.id.IS_INITIAL_PROGRESS_SET, false);
        }
    }

    public H5B(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        AnonymousClass7TG.A1O(r4, r5);
        C55583Hk3 hk3 = (C55583Hk3) C307476Qg.A06(r4, r5);
        if (hk3 != null) {
            hk3.A01 = null;
            hk3.A00 = null;
        }
    }
}
