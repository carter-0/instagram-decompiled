package X;

import android.content.Context;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.List;

public final class LPF {
    public L1G A00;
    public MVV A01;
    public MT1 A02;
    public GalleryView A03;
    public final Context A04;
    public final UserSession A05;
    public final C361568gR A06;
    public final LGD A07;
    public final MVI A08;
    public final LOJ A09;
    public final C63957LFd A0A;
    public final Boolean A0B;
    public final boolean A0C;

    public static final void A00(LPF lpf) {
        int i;
        Integer num = lpf.A0A.A02;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 10;
        }
        GalleryView galleryView = lpf.A03;
        if (galleryView == null) {
            0qQ.A0F("galleryView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            galleryView.setMaxMultiSelectCount(i);
        }
    }

    public final List A01() {
        GalleryView galleryView = this.A03;
        if (galleryView != null) {
            return AnonymousClass7TE.A1D(galleryView.A0Y);
        }
        0qQ.A0F("galleryView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        GalleryView galleryView = this.A03;
        if (galleryView == null) {
            0qQ.A0F("galleryView");
            throw AnonymousClass00P.createAndThrow();
        } else if (!GalleryView.A0A(galleryView)) {
        } else {
            if (C63272KuH.A00(galleryView.A07)) {
                C64586LeU leU = galleryView.A09;
                if (leU != null) {
                    leU.A00.A08();
                    return;
                }
                return;
            }
            AnonymousClass8XZ r2 = galleryView.A06;
            if (r2 != null) {
                ((AnonymousClass0vF) AnonymousClass8XZ.A0K.getValue()).ATE(new C357678Ze(r2));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void A03() {
        GalleryView galleryView = this.A03;
        if (galleryView == null) {
            0qQ.A0F("galleryView");
            throw AnonymousClass00P.createAndThrow();
        } else if (C2604245p.A03(AnonymousClass7TE.A0S(galleryView)) && !galleryView.A0M) {
            C339797kB r0 = galleryView.A0A;
            if (r0 != null) {
                r0.A00();
            }
            galleryView.A0A = null;
            GalleryView.A04(galleryView);
            galleryView.A0C();
        }
    }

    public final void A04() {
        GalleryView galleryView = this.A03;
        if (galleryView == null) {
            0qQ.A0F("galleryView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            galleryView.A0B();
        }
    }

    public final boolean A05() {
        boolean z;
        int top;
        LOJ loj = this.A09;
        if (loj.A02) {
            RecyclerView recyclerView = loj.A03;
            if (recyclerView.getChildCount() != 0) {
                top = recyclerView.computeVerticalScrollOffset();
                z = false;
            }
            return true;
        }
        GalleryView galleryView = this.A03;
        if (galleryView == null) {
            0qQ.A0F("galleryView");
            throw AnonymousClass00P.createAndThrow();
        }
        GridView gridView = galleryView.A0T;
        z = false;
        if (gridView.getVisibility() == 0 && gridView.getChildCount() != 0) {
            if (gridView.getFirstVisiblePosition() != 0) {
                return false;
            }
            top = gridView.getChildAt(0).getTop();
        }
        return true;
        if (top == 0) {
            return true;
        }
        return z;
    }

    public final boolean A06() {
        boolean z;
        LOJ loj = this.A09;
        loj.A05.A00();
        if (loj.A02) {
            LOJ.A00(loj);
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!AnonymousClass7TE.A1b(A01())) {
                return false;
            }
            A04();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019e, code lost:
        if (r0 != null) goto L_0x0124;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LPF(android.view.View r21, X.AnonymousClass07i r22, X.AnonymousClass8XO r23, com.instagram.common.session.UserSession r24, X.2Cn r25, X.MVI r26, X.C63957LFd r27, java.lang.Boolean r28, int r29, int r30, boolean r31, boolean r32, boolean r33) {
        /*
            r20 = this;
            r3 = 1
            r11 = r21
            r5 = r24
            X.AnonymousClass7TF.A1B(r5, r3, r11)
            r1 = r20
            r1.<init>()
            r1.A05 = r5
            r2 = r27
            r1.A0A = r2
            r0 = r26
            r1.A08 = r0
            r0 = r33
            r1.A0C = r0
            r0 = r28
            r1.A0B = r0
            android.content.Context r15 = X.AnonymousClass7TE.A0S(r11)
            r1.A04 = r15
            r0 = 2131435994(0x7f0b21da, float:1.8493846E38)
            android.view.View r10 = r11.findViewById(r0)
            boolean r12 = r2.A0B
            boolean r13 = r2.A0D
            boolean r14 = r2.A0A
            X.LGD r9 = new X.LGD
            r9.<init>(r10, r11, r12, r13, r14)
            r1.A07 = r9
            X.8gR r0 = new X.8gR
            r0.<init>(r5, r3)
            r1.A06 = r0
            X.Lzd r6 = new X.Lzd
            r6.<init>(r1)
            X.MVV r4 = r1.A01
            X.L2f r0 = new X.L2f
            r0.<init>(r1)
            X.LOJ r14 = new X.LOJ
            r17 = r9
            r18 = r0
            r19 = r4
            r16 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            r1.A09 = r14
            r0 = 2131433347(0x7f0b1783, float:1.8488477E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r11, r0)
            com.instagram.ui.widget.gallery.GalleryView r5 = (com.instagram.ui.widget.gallery.GalleryView) r5
            android.view.View r0 = r11.getRootView()
            int r0 = r0.getHeight()
            r5.setBottom(r0)
            r5.setClipChildren(r3)
            com.instagram.common.session.UserSession r0 = r1.A05
            r5.setUserSession(r0)
            java.lang.Boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.booleanValue()
            r5.setNestedScrollingEnabled(r0)
        L_0x0082:
            r0 = 2131433397(0x7f0b17b5, float:1.8488579E38)
            android.view.ViewGroup r7 = X.DbX.A0I(r5, r0)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x009d
            android.view.ViewGroup$MarginLayoutParams r4 = X.DbX.A0G(r7)
            int r0 = X.AnonymousClass2uJ.A00
            int r0 = -r0
            r4.bottomMargin = r0
            r7.setLayoutParams(r4)
        L_0x009d:
            int r0 = X.AnonymousClass2uJ.A00
            int r0 = r0 + r30
            r4 = 0
            r7.setPadding(r4, r4, r4, r0)
            r7.setClipToPadding(r4)
            r7.setClipChildren(r3)
            r0 = r31
            r5.setLeftAlignCheckBoxes(r0)
            r0 = r32
            r5.A0H = r0
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.intValue()
            r5.setMaxMultiSelectCount(r0)
        L_0x00bf:
            int r0 = r2.A01
            r5.setMaxMultiVideoCount(r0)
            r0 = r23
            r5.A05 = r0
            boolean r0 = r1.A0C
            r5.setRemoteMediaEnabled(r0)
            r0 = r29
            r5.A01 = r0
            r0 = r22
            if (r22 == 0) goto L_0x00d7
            r5.A04 = r0
        L_0x00d7:
            r5.A0F = r6
            X.Lzc r0 = new X.Lzc
            r0.<init>(r1, r2, r5)
            r5.A0E = r0
            r0 = r25
            r5.A08 = r0
            r5.A0L = r3
            float r0 = r2.A00
            r5.A00 = r0
            r5.A0C()
            boolean r0 = r2.A09
            r5.A0K = r0
            boolean r0 = r2.A0C
            r5.A0N = r0
            r1.A03 = r5
            java.lang.String r0 = r2.A07
            r9.A01(r0)
            java.lang.String r8 = r2.A05
            if (r8 == 0) goto L_0x01a1
            java.lang.String r7 = r2.A04
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x0195
            android.view.ViewGroup r6 = r9.A06
            if (r6 == 0) goto L_0x0193
            r0 = 2131435992(0x7f0b21d8, float:1.8493842E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r0 == 0) goto L_0x0116
            r0.setText(r8)
        L_0x0116:
            r0 = 2131435991(0x7f0b21d7, float:1.849384E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r6, r0)
        L_0x011d:
            if (r7 == 0) goto L_0x0127
            if (r0 == 0) goto L_0x0127
            r0.setText(r7)
        L_0x0124:
            r0.setVisibility(r4)
        L_0x0127:
            if (r6 == 0) goto L_0x012c
            r6.setVisibility(r4)
        L_0x012c:
            int r7 = r5.A02
            if (r7 == 0) goto L_0x018c
            int r0 = r5.A03
            if (r0 <= r3) goto L_0x0182
            r6 = 2131965945(0x7f1337f9, float:1.9568714E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = X.C51968G9o.A1Z(r0, r7)
        L_0x013f:
            java.lang.String r0 = r15.getString(r6, r0)
            X.0qQ.A07(r0)
        L_0x0146:
            android.widget.TextView r6 = r9.A0A
            if (r6 == 0) goto L_0x014d
            r6.setText(r0)
        L_0x014d:
            android.widget.ImageView r0 = r9.A07
            if (r0 == 0) goto L_0x0156
            r9.A00 = r3
            r0.setVisibility(r4)
        L_0x0156:
            r9.A02(r4)
            boolean r6 = r2.A0F
            android.view.View r3 = r9.A05
            if (r3 == 0) goto L_0x0166
            int r0 = X.DbW.A01(r6)
            r3.setVisibility(r0)
        L_0x0166:
            if (r6 == 0) goto L_0x0181
            r0 = 37
            X.LYA r0 = X.LYA.A00(r2, r5, r1, r0)
            if (r3 == 0) goto L_0x0173
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x0173:
            com.instagram.ui.widget.gallery.GalleryView r0 = r1.A03
            if (r0 == 0) goto L_0x01b3
            r0.setMaxMultiSelectCount(r4)
            com.instagram.ui.widget.gallery.GalleryView r0 = r1.A03
            if (r0 == 0) goto L_0x01b3
            r0.setMaxMultiVideoCount(r4)
        L_0x0181:
            return
        L_0x0182:
            if (r7 <= r3) goto L_0x018c
            r6 = 2131965944(0x7f1337f8, float:1.9568712E38)
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r7)
            goto L_0x013f
        L_0x018c:
            java.lang.String r0 = r2.A06
            if (r0 != 0) goto L_0x0146
            java.lang.String r0 = ""
            goto L_0x0146
        L_0x0193:
            r0 = 0
            goto L_0x011d
        L_0x0195:
            android.widget.TextView r6 = r9.A09
            if (r6 == 0) goto L_0x019c
            r6.setText(r8)
        L_0x019c:
            android.view.View r0 = r9.A03
            if (r0 == 0) goto L_0x0127
            goto L_0x0124
        L_0x01a1:
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x01ab
            android.view.ViewGroup r0 = r9.A06
        L_0x01a7:
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x012c
        L_0x01ab:
            android.view.View r0 = r9.A03
            X.AnonymousClass7TH.A0R(r0)
            android.widget.TextView r0 = r9.A09
            goto L_0x01a7
        L_0x01b3:
            java.lang.String r0 = "galleryView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPF.<init>(android.view.View, X.07i, X.8XO, com.instagram.common.session.UserSession, X.2Cn, X.MVI, X.LFd, java.lang.Boolean, int, int, boolean, boolean, boolean):void");
    }
}
