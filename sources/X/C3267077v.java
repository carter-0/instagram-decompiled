package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.77v  reason: invalid class name and case insensitive filesystem */
public abstract class C3267077v {
    public static final void A00(Context context, C270354gb r7, int i) {
        r7.A0E(i, 6, 0, 6, context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
        r7.A0C(i, 4, 0, 4);
        r7.A0C(i, 3, 0, 3);
    }

    public static final void A01(Context context, C270354gb r7, int i, int i2) {
        r7.A0E(i2, 6, 0, 6, context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
        r7.A0C(i2, 4, i, 4);
    }

    public static final void A03(C270354gb r7, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        C320086rk r1 = C270354gb.A02(r7, R.id.reaction_bottom_barrier).A03;
        r1.A0f = 1;
        r1.A0c = 3;
        r1.A0d = 0;
        r1.A14 = false;
        r1.A15 = new int[]{i5, i2, i3, i4};
        r7.A0C(i6, 3, R.id.reaction_bottom_barrier, 4);
        r7.A0C(i6, 4, 0, 4);
        int i7 = 6;
        if (z) {
            i7 = 7;
        }
        r7.A0C(i6, i7, i, i7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bb, code lost:
        if (r2.contains(X.AnonymousClass7GE.A03) != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0060, code lost:
        if (r2.contains(X.AnonymousClass7GE.A03) != false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r23, X.C270354gb r24, java.util.List r25, int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        /*
            r5 = r29
            r4 = 0
            r10 = 1
            r2 = 3
            r3 = 4
            r12 = r24
            r15 = r26
            r0 = r28
            r12.A0C(r0, r2, r15, r3)
            android.content.res.Resources r1 = r23.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r17 = r1.getDimensionPixelOffset(r0)
            int r1 = r1.getDimensionPixelOffset(r0)
            r12.A0C(r5, r2, r15, r3)
            float r1 = (float) r1
            float r6 = -r1
            X.6rh r1 = X.C270354gb.A02(r12, r5)
            X.6rl r1 = r1.A06
            r1.A09 = r6
            if (r32 == 0) goto L_0x013d
            r1 = 0
            r12.A08(r5, r1)
        L_0x0031:
            r13 = r27
            r12.A0C(r13, r2, r15, r3)
            android.content.res.Resources r1 = r23.getResources()
            int r17 = r1.getDimensionPixelSize(r0)
            if (r32 == 0) goto L_0x0130
            r1 = 6
            r12.A0C(r13, r1, r4, r1)
            r14 = 7
            r16 = r14
            r12.A0E(r13, r14, r15, r16, r17)
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x004c:
            r12.A08(r13, r1)
            X.7GE r7 = X.AnonymousClass7GE.REACTIONS
            r2 = r25
            boolean r1 = r2.contains(r7)
            if (r1 != 0) goto L_0x0062
            X.7GE r1 = X.AnonymousClass7GE.MULTIPLE_REACTIONS
            boolean r1 = r2.contains(r1)
            r11 = 0
            if (r1 == 0) goto L_0x0063
        L_0x0062:
            r11 = 1
        L_0x0063:
            android.content.res.Resources r8 = r23.getResources()
            int r22 = r8.getDimensionPixelOffset(r0)
            int r9 = r8.getDimensionPixelOffset(r0)
            r6 = 0
            r1 = r30
            if (r33 == 0) goto L_0x0111
            if (r11 == 0) goto L_0x010e
            r9 = 2131165200(0x7f070010, float:1.794461E38)
            int r9 = r8.getDimensionPixelOffset(r9)
        L_0x007d:
            int r21 = r8.getDimensionPixelOffset(r0)
            r18 = 3
            int r21 = r21 - r9
            r16 = r12
            r19 = r13
            r20 = r3
            r17 = r1
            r16.A0E(r17, r18, r19, r20, r21)
            X.6rh r3 = X.C270354gb.A02(r12, r1)
            X.6rl r3 = r3.A06
            r3.A09 = r6
        L_0x0098:
            if (r32 == 0) goto L_0x00f9
            if (r33 == 0) goto L_0x0108
            r19 = 7
            r17 = r12
            r18 = r1
            r20 = r15
            r21 = r19
            r17.A0E(r18, r19, r20, r21, r22)
            r3 = 1065353216(0x3f800000, float:1.0)
            r12.A08(r1, r3)
        L_0x00ae:
            boolean r3 = r2.contains(r7)
            if (r3 != 0) goto L_0x00bd
            X.7GE r3 = X.AnonymousClass7GE.MULTIPLE_REACTIONS
            boolean r3 = r2.contains(r3)
            r6 = r1
            if (r3 == 0) goto L_0x00be
        L_0x00bd:
            r6 = r5
        L_0x00be:
            android.content.res.Resources r3 = r23.getResources()
            int r21 = r3.getDimensionPixelOffset(r0)
            r7 = 2131436246(0x7f0b22d6, float:1.8494357E38)
            int[] r8 = new int[]{r15, r6}
            r3 = 5
            X.6rh r0 = X.C270354gb.A02(r12, r7)
            X.6rk r0 = r0.A03
            r0.A0f = r10
            r0.A0c = r3
            r0.A0d = r4
            r0.A14 = r4
            r0.A15 = r8
            r18 = 6
            r3 = 7
            int r21 = r21 + r31
            r17 = r6
            r19 = r7
            r20 = r3
            r16.A0E(r17, r18, r19, r20, r21)
            X.7GE r0 = X.AnonymousClass7GE.COMMENTS
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x00f5
            r5 = r1
        L_0x00f5:
            r12.A0C(r5, r3, r15, r3)
        L_0x00f8:
            return
        L_0x00f9:
            if (r33 == 0) goto L_0x0108
            r19 = 6
            r17 = r12
            r18 = r1
            r20 = r15
            r21 = r19
            r17.A0E(r18, r19, r20, r21, r22)
        L_0x0108:
            r12.A08(r1, r6)
            if (r32 == 0) goto L_0x00f8
            goto L_0x00ae
        L_0x010e:
            r9 = 0
            goto L_0x007d
        L_0x0111:
            r3 = 3
            r12.A0C(r1, r3, r5, r3)
            r18 = 6
            r20 = 7
            r16 = r12
            r17 = r1
            r19 = r5
            r21 = r22
            r16.A0E(r17, r18, r19, r20, r21)
            float r3 = (float) r9
            float r8 = -r3
            X.6rh r3 = X.C270354gb.A02(r12, r1)
            X.6rl r3 = r3.A06
            r3.A09 = r8
            goto L_0x0098
        L_0x0130:
            r14 = 6
            r16 = r14
            r12.A0E(r13, r14, r15, r16, r17)
            r1 = 7
            r12.A0C(r13, r1, r4, r1)
            r1 = 0
            goto L_0x004c
        L_0x013d:
            r14 = 6
            r13 = r5
            r16 = r14
            r12.A0E(r13, r14, r15, r16, r17)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3267077v.A02(android.content.Context, X.4gb, java.util.List, int, int, int, int, int, int, boolean, boolean):void");
    }
}
