package com.instagram.creation.capture.quickcapture.controller.magicmediaremix;

import X.0qQ;
import X.0sr;
import X.19B;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass2t9;
import X.AnonymousClass2tC;
import X.AnonymousClass4D7;
import X.AnonymousClass80D;
import X.AnonymousClass8BA;
import X.AnonymousClass8BH;
import X.AnonymousClass8DA;
import X.AnonymousClass8K4;
import X.AnonymousClass8ME;
import X.AnonymousClass8QA;
import X.AnonymousClass8S5;
import X.AnonymousClass9Xv;
import X.C310416b1;
import X.C347017w8;
import X.C3510487j;
import X.C351948Bb;
import X.C355038Oi;
import X.C385739jS;
import X.C389549po;
import X.C389989qY;
import X.C395099zD;
import X.C39757A7x;
import X.C41023An7;
import X.C41603AxH;
import X.C41834B2p;
import X.C66300MMj;
import X.JY0;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class MagicMediaRemixEditController {
    public int A00;
    public final int A01;
    public final int A02;
    public final Activity A03;
    public final Context A04;
    public final View A05;
    public final AnonymousClass07Z A06;
    public final AnonymousClass2t9 A07;
    public final UserSession A08;
    public final AnonymousClass8S5 A09;
    public final AnonymousClass8QA A0A;
    public final AnonymousClass8K4 A0B;
    public final AnonymousClass8BA A0C;
    public final AnonymousClass80D A0D;
    public final C351948Bb A0E;
    public final C39757A7x A0F;
    public final JY0 A0G;
    public final List A0H = new ArrayList();
    public final AnonymousClass0eM A0I = AnonymousClass0eN.A01(new C66300MMj(this, 33));
    public final AnonymousClass0eM A0J = AnonymousClass0eN.A01(C41603AxH.A00);
    public final View A0K;
    public final View A0L;
    public final C351948Bb A0M;

    public MagicMediaRemixEditController(Activity activity, Context context, View view, View view2, AnonymousClass07Z r7, UserSession userSession, AnonymousClass8S5 r9, AnonymousClass8QA r10, AnonymousClass8K4 r11, AnonymousClass8BA r12, AnonymousClass80D r13, C351948Bb r14, C351948Bb r15, JY0 jy0) {
        0qQ.A0B(view, 1);
        0qQ.A0B(view2, 2);
        0qQ.A0B(context, 3);
        0qQ.A0B(activity, 6);
        0qQ.A0B(userSession, 7);
        JY0 jy02 = jy0;
        0qQ.A0B(jy02, 13);
        this.A04 = context;
        this.A0D = r13;
        this.A0E = r14;
        this.A03 = activity;
        this.A08 = userSession;
        this.A0C = r12;
        this.A09 = r9;
        this.A0B = r11;
        this.A0A = r10;
        this.A0M = r15;
        this.A0G = jy02;
        this.A06 = r7;
        this.A0F = C395099zD.A00(userSession);
        View requireViewById = view2.requireViewById(R.id.post_capture_texture_view_container);
        0qQ.A07(requireViewById);
        this.A05 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.post_capture_interactive_contents_container);
        0qQ.A07(requireViewById2);
        this.A0L = requireViewById2;
        View requireViewById3 = requireViewById.requireViewById(R.id.camera_photo_texture_view);
        0qQ.A07(requireViewById3);
        this.A0K = requireViewById3;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(view2.getContext());
        A002.A01(new C385739jS(this));
        this.A07 = A002.A00();
        int i = context.getResources().getDisplayMetrics().widthPixels;
        this.A02 = i;
        this.A01 = (i * 16) / 9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.JZl, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        if ((r2 instanceof X.C389549po) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        X.AnonymousClass07a.A00(r6);
        r8.A01 = r5;
        r8.A02 = r6;
        r8.A03 = r0;
        r8.A04 = r10;
        r8.A05 = r11;
        r8.A06 = r2;
        r8.A00 = 1;
        r13 = A01((X.C389549po) r2, r5, r8);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if (r13 != r7) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ad, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        r13 = X.1MF.A0D(r2);
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass07Z r20, com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController r21, java.util.List r22, X.AnonymousClass4D7 r23, int r24, int r25) {
        /*
            r5 = r21
            r6 = r20
            r9 = 1
            r3 = r23
            boolean r0 = X.C59814JZl.A01(r9, r3)
            if (r0 == 0) goto L_0x00cf
            r8 = r3
            X.JZl r8 = (X.C59814JZl) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cf
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001b:
            java.lang.Object r13 = r8.A07
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            if (r0 == 0) goto L_0x00b3
            if (r0 != r9) goto L_0x00d6
            java.lang.Object r2 = r8.A06
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            java.lang.Object r11 = r8.A05
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r10 = r8.A04
            android.graphics.Canvas r10 = (android.graphics.Canvas) r10
            java.lang.Object r0 = r8.A03
            java.lang.Object r6 = r8.A02
            X.07Z r6 = (X.AnonymousClass07Z) r6
            java.lang.Object r5 = r8.A01
            com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController r5 = (com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController) r5
            X.0eS.A00(r13)
        L_0x003e:
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
        L_0x0040:
            X.B2p r2 = (X.C41834B2p) r2
            double r24 = r2.Bsj()
            double r22 = r2.Bsk()
            double r16 = r2.Bsi()
            double r14 = r2.Bsg()
            int r1 = r5.A02
            double r3 = (double) r1
            double r20 = r3 * r16
            int r1 = r5.A01
            double r1 = (double) r1
            double r18 = r1 * r14
            double r3 = r3 * r24
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r20 / r16
            double r3 = r3 - r14
            double r1 = r1 * r22
            double r14 = r18 / r16
            double r1 = r1 - r14
            int r15 = (int) r3
            int r14 = (int) r1
            double r3 = r3 + r20
            int r12 = (int) r3
            double r1 = r1 + r18
            int r3 = (int) r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r15, r14, r12, r3)
            if (r13 == 0) goto L_0x007b
            r1 = 0
            r10.drawBitmap(r13, r1, r2, r1)
        L_0x007b:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = r11.next()
            X.B2K r1 = (X.B2K) r1
            X.9Qs r1 = (X.C378669Qs) r1
            android.graphics.drawable.Drawable r2 = r1.A0B
            boolean r1 = r2 instanceof X.C41834B2p
            if (r1 == 0) goto L_0x007b
            boolean r1 = r2 instanceof X.C389549po
            if (r1 == 0) goto L_0x00ae
            X.AnonymousClass07a.A00(r6)
            r1 = r2
            X.9po r1 = (X.C389549po) r1
            r8.A01 = r5
            r8.A02 = r6
            r8.A03 = r0
            r8.A04 = r10
            r8.A05 = r11
            r8.A06 = r2
            r8.A00 = r9
            java.lang.Object r13 = A01(r1, r5, r8)
            if (r13 != r7) goto L_0x003e
            return r7
        L_0x00ae:
            android.graphics.Bitmap r13 = X.1MF.A0D(r2)
            goto L_0x0040
        L_0x00b3:
            X.0eS.A00(r13)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = r24
            r1 = r25
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            X.0qQ.A07(r0)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r0)
            if (r22 == 0) goto L_0x00de
            java.util.Iterator r11 = r22.iterator()
            goto L_0x007b
        L_0x00cf:
            X.JZl r8 = new X.JZl
            r8.<init>(r5, r3, r9)
            goto L_0x001b
        L_0x00d6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00de:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController.A00(X.07Z, com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController, java.util.List, X.4D7, int, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C389549po r5, com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 8
            boolean r0 = X.ME8.A03(r3, r7)
            if (r0 == 0) goto L_0x0022
            r4 = r7
            X.ME8 r4 = (X.ME8) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r1) goto L_0x002a
            goto L_0x0060
        L_0x0022:
            r0 = 42
            X.ME8 r4 = new X.ME8
            r4.<init>(r6, r7, r3, r0)
            goto L_0x0016
        L_0x002a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0032:
            X.0eS.A00(r0)
            r4.A00 = r1     // Catch:{ all -> 0x006a }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C241503Pl.A01     // Catch:{ all -> 0x006a }
            X.4D7 r0 = X.1Ey.A02(r4)     // Catch:{ all -> 0x006a }
            X.3Pl r2 = new X.3Pl     // Catch:{ all -> 0x006a }
            r2.<init>(r0)     // Catch:{ all -> 0x006a }
            X.8vW r0 = r5.A00     // Catch:{ all -> 0x006a }
            android.graphics.Bitmap r1 = r0.A01     // Catch:{ all -> 0x006a }
            r0 = 0
            if (r1 != 0) goto L_0x004a
            r0 = 1
        L_0x004a:
            if (r0 == 0) goto L_0x004d
            goto L_0x0051
        L_0x004d:
            r2.resumeWith(r5)     // Catch:{ all -> 0x006a }
            goto L_0x0059
        L_0x0051:
            X.AYu r0 = new X.AYu     // Catch:{ all -> 0x006a }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x006a }
            r5.A9D(r0)     // Catch:{ all -> 0x006a }
        L_0x0059:
            java.lang.Object r0 = r2.A00()     // Catch:{ all -> 0x006a }
            if (r0 != r3) goto L_0x0063
            return r3
        L_0x0060:
            X.0eS.A00(r0)     // Catch:{ all -> 0x006a }
        L_0x0063:
            X.9po r0 = (X.C389549po) r0     // Catch:{ all -> 0x006a }
            android.graphics.Bitmap r3 = X.1MF.A0D(r0)     // Catch:{ all -> 0x006a }
            return r3
        L_0x006a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController.A01(X.9po, com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController, X.4D7):java.lang.Object");
    }

    public static final void A03(MagicMediaRemixEditController magicMediaRemixEditController, boolean z) {
        float dimensionPixelSize;
        float f;
        AnonymousClass9Xv r1;
        float f2 = 0.5f;
        boolean z2 = z;
        if (!z) {
            f2 = 2.0f;
        }
        MagicMediaRemixEditController magicMediaRemixEditController2 = magicMediaRemixEditController;
        View view = magicMediaRemixEditController2.A0K;
        int width = (int) (((float) view.getWidth()) * f2);
        int height = (int) (((float) view.getHeight()) * f2);
        if (!z2) {
            dimensionPixelSize = 0.0f;
            f = 0.0f;
        } else {
            dimensionPixelSize = (float) magicMediaRemixEditController2.A04.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            f = ((float) (magicMediaRemixEditController2.A02 - width)) / 2.0f;
        }
        MagicMediaRemixEditController magicMediaRemixEditController3 = magicMediaRemixEditController2;
        magicMediaRemixEditController3.A02(view, f, dimensionPixelSize, width, height);
        AnonymousClass8BA r62 = magicMediaRemixEditController3.A0C;
        String str = magicMediaRemixEditController2.A0D.A2X;
        AnonymousClass8ME r2 = (AnonymousClass8ME) r62.A1g.get();
        0qQ.A0B(str, 1);
        InteractiveDrawableContainer interactiveDrawableContainer = r2.A1m;
        int width2 = (int) (((float) interactiveDrawableContainer.getWidth()) * f2);
        int height2 = (int) (((float) interactiveDrawableContainer.getHeight()) * f2);
        int width3 = interactiveDrawableContainer.getWidth();
        int height3 = interactiveDrawableContainer.getHeight();
        ViewGroup.LayoutParams layoutParams = interactiveDrawableContainer.getLayoutParams();
        layoutParams.width = width3;
        layoutParams.height = height3;
        interactiveDrawableContainer.setLayoutParams(layoutParams);
        Context context = r2.A0f;
        float dimensionPixelSize2 = (float) context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        if (dimensionPixelSize2 > 0.0f) {
            r1 = new AnonymousClass9Xv(interactiveDrawableContainer, f2, dimensionPixelSize2);
        } else {
            r1 = null;
        }
        interactiveDrawableContainer.setOutlineProvider(r1);
        boolean z3 = false;
        if (dimensionPixelSize2 > 0.0f) {
            z3 = true;
        }
        interactiveDrawableContainer.setClipToOutline(z3);
        interactiveDrawableContainer.animate().translationY((float) context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material)).translationX((float) (width3 / 4)).setDuration(150);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(interactiveDrawableContainer.A0V(C389549po.class));
        arrayList.addAll(interactiveDrawableContainer.A0V(C347017w8.class));
        Class<C389989qY> cls = C389989qY.class;
        arrayList.addAll(interactiveDrawableContainer.A0V(cls));
        interactiveDrawableContainer.A0b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Drawable drawable = (Drawable) it.next();
            Drawable drawable2 = drawable;
            if (!(drawable instanceof C41834B2p)) {
                break;
            }
            C41834B2p b2p = (C41834B2p) drawable2;
            double Bsj = b2p.Bsj();
            double Bsk = b2p.Bsk();
            if (!(width2 == 0 || height2 == 0)) {
                double d = (double) width2;
                double d2 = (double) height2;
                double intrinsicWidth = (double) (((float) drawable2.getIntrinsicWidth()) * f2);
                boolean z4 = !(drawable2 instanceof C347017w8);
                boolean z5 = z4;
                interactiveDrawableContainer.A0K(drawable2, new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) new ArrayList(0sr.A1P(new Float[]{Float.valueOf(((float) ((Bsj * d) - (intrinsicWidth / (((double) drawable2.getIntrinsicWidth()) / d)))) + ((float) ((d / 2.0d) * -1.0d))), Float.valueOf(((float) ((d2 * Bsk) - (((double) (((float) drawable2.getIntrinsicHeight()) * f2)) / (((double) drawable2.getIntrinsicHeight()) / d2)))) + ((float) (-1.0d * (d2 / 2.0d))))})), -1.0f, 1.0f, f2, -1.0f, -1.0f, z4 ? 1 : 0, true, false, z5, true, false, false, true, true, true, true, true, true, false, false), false, false, true);
            }
        }
        Iterator it2 = interactiveDrawableContainer.A0V(cls).iterator();
        while (it2.hasNext()) {
            interactiveDrawableContainer.A0o((Drawable) it2.next(), f2);
        }
        ((C355038Oi) r62.A1f.get()).Eck(z2);
        MagicMediaRemixEditController magicMediaRemixEditController4 = magicMediaRemixEditController2;
        int i = height;
        magicMediaRemixEditController4.A02(magicMediaRemixEditController2.A0L, f, dimensionPixelSize, width, i);
        if (!z2) {
            1Eo.A05(19B.A00, new MagicMediaRemixEditController$updateContainerWithNewMedia$1(magicMediaRemixEditController4, (AnonymousClass4D7) null, width, i), AnonymousClass07a.A00(magicMediaRemixEditController4.A06));
        }
    }

    private final void A02(View view, float f, float f2, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
        view.animate().translationY(f2).translationX(f).withEndAction(new C41023An7(view, this)).setDuration(150);
    }
}
