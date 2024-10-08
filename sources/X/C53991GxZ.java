package X;

import android.content.Context;
import android.widget.SeekBar;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.GxZ  reason: case insensitive filesystem */
public final class C53991GxZ extends C243963aQ {
    public static final C246773fD A0B = new Object();
    public final SeekBar.OnSeekBarChangeListener A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C246613et A03;
    public final C246753fB A04;
    public final C243043Xe A05;
    public final CharSequence A06;
    public final boolean A07;
    public final 2WX A08;
    public final C246663ey A09;
    public final AnonymousClass339 A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0089, code lost:
        if (X.C263204Jn.A01(r13, r3) == false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C244523bK A0X(X.C244463bE r32) {
        /*
            r31 = this;
            r3 = 0
            r11 = r32
            X.0qQ.A0B(r11, r3)
            r10 = 1
            r12 = r31
            com.instagram.common.session.UserSession r13 = r12.A01
            java.lang.Object[] r2 = new java.lang.Object[]{r13}
            r1 = 7
            X.Inj r0 = new X.Inj
            r0.<init>(r12, r1)
            java.lang.Object r2 = X.AnonymousClass3Zw.A00(r11, r0, r2)
            X.4Jr r2 = (X.C263224Jr) r2
            android.content.Context r1 = X.C243803a8.A00(r11)
            X.3et r9 = r12.A03
            X.3da r0 = r9.A0F
            X.9IP r19 = r2.A00(r1, r0, r3)
            X.4DU r8 = r12.A02
            java.lang.Object[] r2 = new java.lang.Object[]{r13, r8}
            r1 = 6
            X.Inj r0 = new X.Inj
            r0.<init>(r12, r1)
            java.lang.Object r7 = X.AnonymousClass3Zw.A00(r11, r0, r2)
            X.4Js r7 = (X.AnonymousClass4Js) r7
            X.3ZH r3 = r9.A08
            boolean r4 = X.C246383eV.A00(r3)
            X.3es r2 = r9.A0A
            X.0sP r1 = r2.A0I
            android.content.Context r0 = X.C51967G9n.A09(r11)
            java.lang.Object r6 = r1.invoke(r0)
            X.3fX r6 = (X.C246953fX) r6
            X.0sa r0 = r2.A03
            java.lang.Object r5 = r0.invoke()
            X.9IB r5 = (X.AnonymousClass9IB) r5
            r16 = 0
            if (r4 == 0) goto L_0x00f2
            X.0sP r1 = r2.A0L
            X.339 r0 = r12.A0A
            java.lang.Object r4 = r1.invoke(r0)
            X.3fb r4 = (X.C246993fb) r4
        L_0x0063:
            X.2rm r0 = X.C231492rl.A00(r13)
            X.1Xj r1 = r3.A01
            r17 = r1
            boolean r15 = r0.A0Q
            X.0sa r1 = r2.A04
            java.lang.Object r3 = r1.invoke()
            X.9NR r3 = (X.AnonymousClass9NR) r3
            boolean r14 = r9.A0T
            X.9Ib r1 = r3.A00
            java.lang.Object r1 = r1.A02
            X.0sa r1 = (X.C62320sa) r1
            boolean r1 = X.C51971G9r.A1b(r1)
            if (r1 == 0) goto L_0x008b
            boolean r1 = X.C263204Jn.A01(r13, r3)
            r29 = 1
            if (r1 != 0) goto L_0x008d
        L_0x008b:
            r29 = 0
        L_0x008d:
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x009c
            java.lang.String r2 = r9.A0J
            com.instagram.common.typedurl.ImageUrl r1 = r6.A02
            java.lang.String r0 = r8.getModuleName()
            X.C247013fd.A09(r1, r2, r0)
        L_0x009c:
            java.lang.String r1 = r9.A0J
            com.instagram.common.typedurl.ImageUrl r0 = r6.A02
            java.lang.String r2 = r8.getModuleName()
            X.9LN r27 = X.C246973fZ.A00(r11, r13, r0, r1, r2)
            X.3fa r8 = X.C246983fa.A00
            X.Iro r2 = X.C58431Iro.A00
            X.IJ3 r0 = new X.IJ3
            r0.<init>(r12)
            r1 = 4
            X.2WU r9 = X.C51967G9n.A0W(r0, r1, r10)
            X.IyI r0 = new X.IyI
            r24 = r7
            r25 = r4
            r26 = r3
            r28 = r14
            r30 = r15
            r20 = r11
            r21 = r17
            r22 = r6
            r23 = r12
            r17 = r0
            r18 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.2WG r4 = X.C51969G9p.A0f(r11, r9, r2, r0)
            X.2WX r3 = r12.A08
            X.3aa r0 = X.C244063aa.MEDIA
            android.util.SparseArray r2 = X.C244083ac.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            X.9JS r1 = X.C51965G9l.A0d(r0, r2, r1)
            X.3XV r0 = X.2WX.A02
            if (r3 != r0) goto L_0x00e9
            r3 = r16
        L_0x00e9:
            X.2WX r0 = X.C51965G9l.A0X(r3, r1)
            X.3bK r0 = X.C51965G9l.A0W(r0, r8, r4)
            return r0
        L_0x00f2:
            r4 = r16
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53991GxZ.A0X(X.3bE):X.3bK");
    }

    public static final C55850HoX A00(SimpleZoomableViewContainer simpleZoomableViewContainer, C53991GxZ gxZ) {
        C55850HoX hoX;
        if (Systrace.A0E(1)) {
            0fS.A01("createOrGetPrimitiveHolder", 844947392);
        }
        try {
            Object tag = simpleZoomableViewContainer.getTag(R.id.litho_playable_media_primitive);
            if (!(tag instanceof C55850HoX) || (hoX = (C55850HoX) tag) == null) {
                Context context = simpleZoomableViewContainer.getContext();
                if (context != null) {
                    hoX = new C55850HoX(context, gxZ.A01, simpleZoomableViewContainer);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            simpleZoomableViewContainer.setTag(R.id.litho_playable_media_primitive, hoX);
            return hoX;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(487231744);
            }
        }
    }

    public static final C246663ey A04(SimpleZoomableViewContainer simpleZoomableViewContainer, C53991GxZ gxZ) {
        if (Systrace.A0E(1)) {
            0fS.A01("getBoundedLithoMediaViewHolder", 1848140238);
        }
        try {
            C55850HoX A002 = A00(simpleZoomableViewContainer, gxZ);
            C246663ey r2 = gxZ.A09;
            r2.A00 = simpleZoomableViewContainer.getContext();
            r2.A06 = A002.A03;
            r2.A09 = A002.A06;
            r2.A03 = A002.A00;
            r2.A04 = A002.A01;
            r2.A0A.A01 = A002.A05;
            r2.A07 = A002.A04;
            AnonymousClass3Ux r1 = A002.A02;
            0qQ.A0B(r1, 0);
            r2.A05 = r1;
            return r2;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1199550309);
            }
        }
    }

    public C53991GxZ(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, 2WX r3, UserSession userSession, AnonymousClass4DU r5, C246613et r6, C246753fB r7, C246663ey r8, AnonymousClass339 r9, C243043Xe r10, CharSequence charSequence, boolean z) {
        C51972G9s.A1D(r7, r9);
        C51973G9u.A0s(6, onSeekBarChangeListener, r5, userSession);
        0qQ.A0B(charSequence, 9);
        this.A09 = r8;
        this.A03 = r6;
        this.A04 = r7;
        this.A0A = r9;
        this.A05 = r10;
        this.A00 = onSeekBarChangeListener;
        this.A02 = r5;
        this.A01 = userSession;
        this.A06 = charSequence;
        this.A07 = z;
        this.A08 = r3;
    }
}
