package X;

import android.content.Context;
import android.widget.SeekBar;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.4wq  reason: invalid class name and case insensitive filesystem */
public final class C278414wq extends C243963aQ {
    public static final C246773fD A0E = new Object();
    public final SeekBar.OnSeekBarChangeListener A00;
    public final UserSession A01;
    public final C246873fN A02;
    public final AnonymousClass4DU A03;
    public final C246613et A04;
    public final C246753fB A05;
    public final C232722uK A06;
    public final C243043Xe A07;
    public final CharSequence A08;
    public final boolean A09;
    public final boolean A0A;
    public final 2WX A0B;
    public final C246663ey A0C;
    public final AnonymousClass339 A0D;

    public C278414wq(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, 2WX r3, UserSession userSession, C246873fN r5, AnonymousClass4DU r6, C246613et r7, C246753fB r8, C246663ey r9, AnonymousClass339 r10, C232722uK r11, C243043Xe r12, CharSequence charSequence, boolean z, boolean z2) {
        0qQ.A0B(r11, 2);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r5, 5);
        0qQ.A0B(r10, 6);
        0qQ.A0B(onSeekBarChangeListener, 8);
        0qQ.A0B(r6, 9);
        0qQ.A0B(userSession, 10);
        0qQ.A0B(charSequence, 11);
        this.A0C = r9;
        this.A06 = r11;
        this.A04 = r7;
        this.A05 = r8;
        this.A02 = r5;
        this.A0D = r10;
        this.A07 = r12;
        this.A00 = onSeekBarChangeListener;
        this.A03 = r6;
        this.A01 = userSession;
        this.A08 = charSequence;
        this.A09 = z;
        this.A0A = z2;
        this.A0B = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00ad, code lost:
        if (X.C263204Jn.A01(r11, r2) == false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C244523bK A0X(X.C244463bE r39) {
        /*
            r38 = this;
            r13 = 0
            r8 = r39
            X.0qQ.A0B(r8, r13)
            r9 = 1
            r6 = r38
            com.instagram.common.session.UserSession r11 = r6.A01
            java.lang.Object[] r2 = new java.lang.Object[]{r11}
            r1 = 2
            X.9L2 r0 = new X.9L2
            r0.<init>(r6, r1)
            java.lang.Object r12 = X.AnonymousClass3Zw.A00(r8, r0, r2)
            X.4Jr r12 = (X.C263224Jr) r12
            X.4DU r15 = r6.A03
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r15}
            X.9L2 r0 = new X.9L2
            r0.<init>(r6, r9)
            java.lang.Object r14 = X.AnonymousClass3Zw.A00(r8, r0, r1)
            X.4Js r14 = (X.AnonymousClass4Js) r14
            X.3et r10 = r6.A04
            X.3ZH r1 = r10.A08
            X.1Xj r0 = r1.A01
            r21 = r0
            boolean r3 = X.C246383eV.A00(r1)
            X.3es r1 = r10.A0A
            X.0sP r2 = r1.A0I
            X.2V1 r0 = r8.A05
            android.content.Context r0 = r0.A0C
            X.0qQ.A07(r0)
            java.lang.Object r7 = r2.invoke(r0)
            X.3fX r7 = (X.C246953fX) r7
            X.0sa r0 = r1.A03
            java.lang.Object r5 = r0.invoke()
            X.9IB r5 = (X.AnonymousClass9IB) r5
            r16 = 0
            if (r3 == 0) goto L_0x0126
            X.0sP r2 = r1.A0L
            X.339 r0 = r6.A0D
            java.lang.Object r4 = r2.invoke(r0)
            X.3fb r4 = (X.C246993fb) r4
        L_0x005f:
            X.0sa r0 = r1.A00
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r30 = r0.booleanValue()
            X.0sa r0 = r1.A0D
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r31 = r0.booleanValue()
            boolean r0 = r10.A0T
            r20 = r0
            X.2rm r3 = X.C231492rl.A00(r11)
            boolean r0 = r3.A0Q
            r18 = r0
            X.0sa r0 = r1.A04
            java.lang.Object r2 = r0.invoke()
            X.9NR r2 = (X.AnonymousClass9NR) r2
            android.content.Context r1 = X.C243803a8.A00(r8)
            X.3da r0 = r10.A0F
            X.9IP r19 = r12.A00(r1, r0, r13)
            X.9Ib r0 = r2.A00
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00af
            boolean r0 = X.C263204Jn.A01(r11, r2)
            r32 = 1
            if (r0 != 0) goto L_0x00b1
        L_0x00af:
            r32 = 0
        L_0x00b1:
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x00c0
            java.lang.String r12 = r10.A0J
            com.instagram.common.typedurl.ImageUrl r1 = r7.A02
            java.lang.String r0 = r15.getModuleName()
            X.C247013fd.A09(r1, r12, r0)
        L_0x00c0:
            java.lang.String r10 = r10.A0J
            com.instagram.common.typedurl.ImageUrl r1 = r7.A02
            java.lang.String r0 = r15.getModuleName()
            X.9LN r28 = X.C246973fZ.A00(r8, r11, r1, r10, r0)
            X.3fa r12 = X.C246983fa.A00
            X.4wr r34 = X.C278424wr.A00
            X.4ws r1 = new X.4ws
            r1.<init>(r6)
            r10 = 5
            X.3aS r0 = X.C243983aS.A00
            X.2WU r11 = new X.2WU
            r11.<init>(r0, r1, r10, r9)
            X.4wt r17 = new X.4wt
            r23 = r6
            r24 = r14
            r25 = r4
            r26 = r3
            r27 = r2
            r29 = r20
            r33 = r18
            r18 = r5
            r20 = r8
            r22 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            long r36 = r8.A01()
            X.2WG r4 = new X.2WG
            r33 = r11
            r35 = r17
            r32 = r4
            r32.<init>(r33, r34, r35, r36)
            X.2WX r5 = r6.A0B
            X.3aa r0 = X.C244063aa.MEDIA
            android.util.SparseArray r3 = X.C244083ac.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            r0 = 4
            X.9JS r2 = new X.9JS
            r2.<init>(r1, r3, r0)
            X.3XV r0 = X.2WX.A02
            if (r5 != r0) goto L_0x011b
            r5 = r16
        L_0x011b:
            X.2WX r1 = new X.2WX
            r1.<init>(r5, r2)
            X.3bK r0 = new X.3bK
            r0.<init>(r1, r12, r4)
            return r0
        L_0x0126:
            r4 = r16
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278414wq.A0X(X.3bE):X.3bK");
    }

    public static final C278464wv A00(SimpleZoomableViewContainer simpleZoomableViewContainer, C278414wq r7) {
        C278464wv r2;
        if (Systrace.A0E(1)) {
            0fS.A01("createOrGetPrimitiveHolder", -1501218562);
        }
        try {
            Object tag = simpleZoomableViewContainer.getTag(R.id.litho_playable_media_primitive);
            if (!(tag instanceof C278464wv) || (r2 = (C278464wv) tag) == null) {
                Context context = simpleZoomableViewContainer.getContext();
                if (context != null) {
                    r2 = new C278464wv(context, r7.A01, simpleZoomableViewContainer);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            simpleZoomableViewContainer.setTag(R.id.litho_playable_media_primitive, r2);
            return r2;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(1430036219);
            }
        }
    }

    public static final C246663ey A04(SimpleZoomableViewContainer simpleZoomableViewContainer, C278414wq r7) {
        if (Systrace.A0E(1)) {
            0fS.A01("getBoundedLithoMediaViewHolder", -741347909);
        }
        try {
            C278464wv A002 = A00(simpleZoomableViewContainer, r7);
            C246663ey r2 = r7.A0C;
            r2.A00 = simpleZoomableViewContainer.getContext();
            r2.A06 = A002.A05;
            r2.A09 = A002.A09;
            r2.A08 = A002.A08;
            r2.A01 = A002.A00;
            r2.A02 = A002.A01;
            r2.A03 = A002.A02;
            r2.A04 = A002.A03;
            r2.A0A.A01 = A002.A07;
            r2.A07 = A002.A06;
            AnonymousClass3Ux r1 = A002.A04;
            0qQ.A0B(r1, 0);
            r2.A05 = r1;
            return r2;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-82358111);
            }
        }
    }
}
