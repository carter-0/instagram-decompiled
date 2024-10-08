package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.Gxa  reason: case insensitive filesystem */
public final class C53992Gxa extends C243963aQ {
    public static final C246773fD A0C = new Object();
    public final UserSession A00;
    public final C246873fN A01;
    public final AnonymousClass4DU A02;
    public final C246613et A03;
    public final C246753fB A04;
    public final C232722uK A05;
    public final C243043Xe A06;
    public final CharSequence A07;
    public final boolean A08;
    public final 2WX A09;
    public final C246663ey A0A;
    public final AnonymousClass339 A0B;

    public C53992Gxa(2WX r2, UserSession userSession, C246873fN r4, AnonymousClass4DU r5, C246613et r6, C246753fB r7, C246663ey r8, AnonymousClass339 r9, C232722uK r10, C243043Xe r11, CharSequence charSequence, boolean z) {
        C51974G9v.A0d(2, r10, r7, r4, r9);
        C51973G9u.A0u(8, r5, userSession, charSequence);
        this.A0A = r8;
        this.A05 = r10;
        this.A03 = r6;
        this.A04 = r7;
        this.A01 = r4;
        this.A0B = r9;
        this.A06 = r11;
        this.A02 = r5;
        this.A00 = userSession;
        this.A07 = charSequence;
        this.A08 = z;
        this.A09 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0062, code lost:
        if (X.C263204Jn.A01(r4, r14) == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C244523bK A0X(X.C244463bE r21) {
        /*
            r20 = this;
            r0 = 0
            r3 = r21
            X.0qQ.A0B(r3, r0)
            r11 = r20
            X.3et r5 = r11.A03
            X.3ZH r6 = r5.A08
            boolean r4 = X.C246383eV.A00(r6)
            X.3es r1 = r5.A0A
            X.0sP r2 = r1.A0I
            android.content.Context r0 = X.C51967G9n.A09(r3)
            java.lang.Object r10 = r2.invoke(r0)
            X.3fX r10 = (X.C246953fX) r10
            X.0sa r0 = r1.A03
            java.lang.Object r8 = r0.invoke()
            X.9IB r8 = (X.AnonymousClass9IB) r8
            if (r4 == 0) goto L_0x00ba
            X.0sP r2 = r1.A0L
            X.339 r0 = r11.A0B
            java.lang.Object r12 = r2.invoke(r0)
            X.3fb r12 = (X.C246993fb) r12
        L_0x0032:
            X.0sa r0 = r1.A00
            boolean r16 = X.C51971G9r.A1b(r0)
            X.0sa r0 = r1.A0D
            boolean r17 = X.C51971G9r.A1b(r0)
            com.instagram.common.session.UserSession r4 = r11.A00
            X.2rm r13 = X.C231492rl.A00(r4)
            X.1Xj r9 = r6.A01
            boolean r6 = r13.A0Q
            X.0sa r0 = r1.A04
            java.lang.Object r14 = r0.invoke()
            X.9NR r14 = (X.AnonymousClass9NR) r14
            X.9Ib r0 = r14.A00
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 == 0) goto L_0x0064
            boolean r0 = X.C263204Jn.A01(r4, r14)
            r18 = 1
            if (r0 != 0) goto L_0x0066
        L_0x0064:
            r18 = 0
        L_0x0066:
            boolean r0 = r13.A0M
            if (r0 == 0) goto L_0x0077
            java.lang.String r2 = r5.A0J
            com.instagram.common.typedurl.ImageUrl r1 = r10.A02
            X.4DU r0 = r11.A02
            java.lang.String r0 = r0.getModuleName()
            X.C247013fd.A09(r1, r2, r0)
        L_0x0077:
            java.lang.String r2 = r5.A0J
            com.instagram.common.typedurl.ImageUrl r1 = r10.A02
            X.4DU r0 = r11.A02
            java.lang.String r0 = r0.getModuleName()
            X.9LN r15 = X.C246973fZ.A00(r3, r4, r1, r2, r0)
            X.3fa r4 = X.C246983fa.A00
            X.Irn r2 = X.C58430Irn.A00
            X.IJ2 r0 = new X.IJ2
            r0.<init>(r11)
            r1 = 4
            X.2WU r0 = X.C51971G9r.A0d(r0, r1)
            X.IyH r7 = new X.IyH
            r19 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.2WG r5 = X.C51969G9p.A0f(r3, r0, r2, r7)
            X.2WX r3 = r11.A09
            X.3aa r0 = X.C244063aa.MEDIA
            android.util.SparseArray r2 = X.C244083ac.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            X.9JS r1 = X.C51965G9l.A0d(r0, r2, r1)
            X.3XV r0 = X.2WX.A02
            if (r3 != r0) goto L_0x00b1
            r3 = 0
        L_0x00b1:
            X.2WX r0 = X.C51965G9l.A0X(r3, r1)
            X.3bK r0 = X.C51965G9l.A0W(r0, r4, r5)
            return r0
        L_0x00ba:
            r12 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53992Gxa.A0X(X.3bE):X.3bK");
    }

    public static final C55849HoW A00(SimpleZoomableViewContainer simpleZoomableViewContainer, C53992Gxa gxa) {
        C55849HoW hoW;
        if (Systrace.A0E(1)) {
            0fS.A01("createOrGetPrimitiveHolder", -1119584390);
        }
        try {
            Object tag = simpleZoomableViewContainer.getTag(R.id.litho_playable_media_primitive);
            if (!(tag instanceof C55849HoW) || (hoW = (C55849HoW) tag) == null) {
                Context context = simpleZoomableViewContainer.getContext();
                if (context != null) {
                    hoW = new C55849HoW(context, gxa.A00, simpleZoomableViewContainer);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            simpleZoomableViewContainer.setTag(R.id.litho_playable_media_primitive, hoW);
            return hoW;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-183864100);
            }
        }
    }

    public static final C246663ey A04(SimpleZoomableViewContainer simpleZoomableViewContainer, C53992Gxa gxa) {
        if (Systrace.A0E(1)) {
            0fS.A01("getBoundedLithoMediaViewHolder", 92048413);
        }
        try {
            C55849HoW A002 = A00(simpleZoomableViewContainer, gxa);
            C246663ey r2 = gxa.A0A;
            r2.A00 = simpleZoomableViewContainer.getContext();
            r2.A06 = A002.A03;
            r2.A09 = A002.A06;
            r2.A08 = A002.A05;
            r2.A01 = A002.A00;
            r2.A02 = A002.A01;
            r2.A07 = A002.A04;
            AnonymousClass3Ux r1 = A002.A02;
            0qQ.A0B(r1, 0);
            r2.A05 = r1;
            return r2;
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-272787291);
            }
        }
    }
}
