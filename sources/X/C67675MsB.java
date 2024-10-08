package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.MsB  reason: case insensitive filesystem */
public final class C67675MsB extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static BottomSheetFragment A00(MotionEvent motionEvent, C67675MsB msB) {
        Integer num;
        0qQ.A0B(motionEvent, 0);
        BottomSheetFragment bottomSheetFragment = (BottomSheetFragment) msB.A02;
        AnonymousClass37D bottomSheetNavigator = bottomSheetFragment.A04.getBottomSheetNavigator();
        if (bottomSheetNavigator != null) {
            float y = motionEvent.getY();
            if (Float.valueOf(y) == null) {
                num = AnonymousClass05K.A1F;
            } else {
                C7218Pzn pzn = ((AnonymousClass37F) ((AnonymousClass37D) msB.A01)).A0D;
                if (pzn == null || !pzn.A0J(y)) {
                    num = AnonymousClass05K.A0j;
                } else {
                    num = AnonymousClass05K.A0u;
                }
            }
            bottomSheetNavigator.A0T(num);
        }
        return bottomSheetFragment;
    }

    public C67675MsB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (X.AnonymousClass4AJ.A08(r3.A02) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        if (r0 == false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDoubleTap(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 2: goto L_0x001b;
                case 3: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.onDoubleTap(r10)
            return r0
        L_0x000a:
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = A00(r10, r9)
            X.7Pr r0 = r0.A03
            if (r0 == 0) goto L_0x0019
            X.Tht r0 = r0.A0W
            if (r0 == 0) goto L_0x0019
            r0.DA6()
        L_0x0019:
            r0 = 0
            return r0
        L_0x001b:
            java.lang.Object r6 = r9.A02
            X.50C r6 = (X.AnonymousClass50C) r6
            java.lang.Object r5 = r9.A01
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.4AB r4 = r6.A01
            if (r4 == 0) goto L_0x00d7
            X.4AL r3 = r6.A0D
            boolean r0 = X.AnonymousClass50C.A05(r4, r6)
            if (r0 != 0) goto L_0x00d7
            boolean r2 = r3.A09
            if (r2 != 0) goto L_0x003c
            com.instagram.common.session.UserSession r0 = r3.A02
            boolean r0 = X.AnonymousClass4AJ.A08(r0)
            r1 = 1
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x00d7
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x00d7
            boolean r0 = r4.A0Q
            if (r0 != 0) goto L_0x00d7
            java.util.List r8 = r4.A0J
            boolean r0 = X.AnonymousClass7TE.A1b(r8)
            if (r0 == 0) goto L_0x00d7
            if (r1 != 0) goto L_0x005d
            if (r2 == 0) goto L_0x00d7
            com.instagram.common.session.UserSession r0 = r3.A02
            boolean r0 = X.AnonymousClass4AJ.A05(r0)
            if (r0 == 0) goto L_0x00d7
        L_0x005d:
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A04()
            com.instagram.common.session.UserSession r7 = r3.A02
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r7)
            r0 = 36324329423777798(0x810cc900023006, double:3.0349904217069607E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0094
            X.OdF r2 = X.C71121OdF.A01
            java.lang.Object r0 = X.00k.A0J(r8)
            X.913 r0 = (X.AnonymousClass913) r0
            if (r0 == 0) goto L_0x0087
            X.4zZ r0 = r0.BWY()
            if (r0 == 0) goto L_0x0087
            java.lang.String r1 = r0.A0J
            if (r1 != 0) goto L_0x0089
        L_0x0087:
            java.lang.String r1 = ""
        L_0x0089:
            android.content.Context r0 = X.JTQ.A06(r6)
            boolean r0 = r2.A04(r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r8 = r6.A0B
            boolean r1 = X.AnonymousClass50C.A04(r4)
            r0 = 8
            X.Inz r7 = new X.Inz
            r7.<init>(r0, r4, r3, r5)
            com.instagram.common.ui.base.IgSimpleImageView r6 = r8.A06
            if (r1 == 0) goto L_0x00db
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r8.A0M
        L_0x00a8:
            if (r2 == 0) goto L_0x00d9
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r8)
            android.graphics.drawable.Drawable r0 = r8.A00
            if (r0 != 0) goto L_0x00d4
            r0 = 2130970232(0x7f040678, float:1.7549168E38)
            int r3 = X.AnonymousClass7TF.A03(r4, r0)
            r0 = 2130970231(0x7f040677, float:1.7549166E38)
            int r2 = X.AnonymousClass7TF.A03(r4, r0)
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            int r0 = X.AnonymousClass7TF.A03(r4, r0)
            r1 = 2131238010(0x7f081c7a, float:1.8092287E38)
            int[] r0 = new int[]{r3, r2, r0}
            android.graphics.drawable.BitmapDrawable r0 = X.AnonymousClass3JT.A04(r4, r0, r1)
            r8.A00 = r0
        L_0x00d4:
            X.C69990NvU.A00(r0, r5, r6, r7)
        L_0x00d7:
            r0 = 1
            return r0
        L_0x00d9:
            r0 = 0
            goto L_0x00d4
        L_0x00db:
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r8.A0N
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67675MsB.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
            case 2:
            case 4:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        if (r13 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        if (r13 != null) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLongPress(android.view.MotionEvent r32) {
        /*
            r31 = this;
            r3 = r31
            int r0 = r3.A00
            r1 = r32
            switch(r0) {
                case 1: goto L_0x0129;
                case 2: goto L_0x001d;
                case 3: goto L_0x000d;
                case 4: goto L_0x00e7;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onLongPress(r1)
        L_0x000c:
            return
        L_0x000d:
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = A00(r1, r3)
            X.7Pr r0 = r0.A03
            if (r0 == 0) goto L_0x000c
            X.Tht r0 = r0.A0W
            if (r0 == 0) goto L_0x000c
            r0.DPO()
            return
        L_0x001d:
            java.lang.Object r2 = r3.A02
            X.50C r2 = (X.AnonymousClass50C) r2
            java.lang.Object r1 = r3.A01
            X.6r6 r1 = (X.C319726r6) r1
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r0 = r2.A0B
            r30 = r0
            X.4AB r11 = r2.A01
            if (r11 == 0) goto L_0x000c
            X.4AL r0 = r2.A0D
            X.4AF r10 = r0.A05
            r0 = 1
            X.0qQ.A0B(r1, r0)
            com.instagram.common.session.UserSession r9 = r10.A03
            X.60k r0 = X.C3018660j.A01(r9)
            r0.A0I(r1, r11)
            X.60k r1 = X.C3018660j.A01(r9)
            X.Nmo r0 = X.C69506Nmo.A0F
            r8 = 0
            r1.A0B(r0)
            java.util.List r0 = r11.A0J
            java.util.Iterator r16 = r0.iterator()
        L_0x004e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r16.next()
            X.913 r0 = (X.AnonymousClass913) r0
            X.Oe5 r1 = X.C71147Oe5.A00
            X.4zZ r7 = r0.BWY()
            androidx.fragment.app.Fragment r15 = r10.A01
            android.content.Context r0 = r15.requireContext()
            X.N5y r6 = r1.A08(r0, r7)
            com.instagram.api.schemas.NotePogVideoDict r5 = r11.A08
            boolean r12 = r11.A0S
            boolean r4 = r11.A0R
            boolean r3 = r11.A0T
            boolean r26 = X.C71147Oe5.A06(r9, r11)
            X.0iw r2 = r10.A02
            X.4AD r1 = r10.A04
            r0 = 0
            X.AnonymousClass7TF.A1E(r9, r0, r7)
            com.instagram.user.model.User r13 = X.AnonymousClass7TF.A0Q(r9)
            java.lang.String r14 = r13.getId()
            com.instagram.user.model.User r13 = r6.A02
            boolean r24 = X.DbV.A1Z(r13, r14)
            androidx.fragment.app.FragmentActivity r17 = r15.requireActivity()
            r18 = r7
            r19 = r2
            r20 = r9
            r21 = r1
            r22 = r12
            r23 = r4
            r25 = r0
            X.PuF r4 = X.C71147Oe5.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.5y2 r13 = r7.A0A
            if (r13 == 0) goto L_0x00dd
            X.60F r1 = r13.A0B
            if (r1 == 0) goto L_0x00dd
            java.lang.String r12 = r1.A02
        L_0x00ac:
            X.60F r1 = r13.A0B
            if (r1 == 0) goto L_0x00e1
            java.lang.String r2 = r1.A03
        L_0x00b2:
            X.60F r1 = r13.A0B
            if (r1 == 0) goto L_0x00e5
            java.lang.Integer r1 = r1.A01
        L_0x00b8:
            boolean r28 = X.C71147Oe5.A07(r9, r8)
            r27 = r0
            r29 = r0
            r21 = r6
            r22 = r4
            r23 = r1
            r24 = r12
            r25 = r2
            r26 = r3
            r19 = r5
            r20 = r7
            r17 = r30
            r18 = r15
            X.OIR r0 = X.C71147Oe5.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r4.DUW(r0)
            goto L_0x004e
        L_0x00dd:
            r12 = r8
            if (r13 == 0) goto L_0x00e1
            goto L_0x00ac
        L_0x00e1:
            r2 = r8
            if (r13 == 0) goto L_0x00e5
            goto L_0x00b2
        L_0x00e5:
            r1 = r8
            goto L_0x00b8
        L_0x00e7:
            java.lang.Object r6 = r3.A02
            X.MzD r6 = (X.C68046MzD) r6
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r1 = r6.A04
            r0 = 0
            r1.performHapticFeedback(r0)
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r1)
            com.instagram.common.session.UserSession r0 = r6.A06
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r5, r0)
            r2 = 2131974542(0x7f13598e, float:1.958615E38)
            java.lang.Object r3 = r3.A01
            X.N3s r3 = (X.C68177N3s) r3
            r1 = 20
            X.Ok8 r0 = new X.Ok8
            r0.<init>((X.C68177N3s) r3, (X.C68046MzD) r6, (int) r1)
            r4.A03(r0, r2)
            r2 = 2131972204(0x7f13506c, float:1.9581409E38)
            r1 = 21
            X.Ok8 r0 = new X.Ok8
            r0.<init>((X.C68177N3s) r3, (X.C68046MzD) r6, (int) r1)
            r4.A02(r0, r2)
            X.FFy r1 = new X.FFy
            r1.<init>(r4)
            android.app.Activity r0 = X.C61270mF.A00(r5)
            r1.A03(r0)
            return
        L_0x0129:
            java.lang.Object r0 = r3.A01
            X.N5w r0 = (X.C68207N5w) r0
            android.view.View$OnLongClickListener r2 = r0.A02
            java.lang.Object r1 = r3.A02
            X.MxT r1 = (X.C67943MxT) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.ui.base.IgTextView r0 = r1.A01
            r2.onLongClick(r0)
            android.view.View r1 = r1.itemView
            r0 = 0
            r1.performHapticFeedback(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67675MsB.onLongPress(android.view.MotionEvent):void");
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C13823Tht tht;
        switch (this.A00) {
            case 0:
                0qQ.A0B(motionEvent, 0);
                C53915GwL gwL = (C53915GwL) this.A02;
                C53915GwL.A00(gwL.A00, (AnonymousClass3Y5) this.A01, gwL);
                break;
            case 2:
                AnonymousClass50C r5 = (AnonymousClass50C) this.A02;
                C319726r6 r4 = (C319726r6) this.A01;
                IgTextView igTextView = r5.A07;
                Typeface typeface = igTextView.getTypeface();
                if (typeface != null && typeface.isBold()) {
                    igTextView.setTypeface((Typeface) null, 0);
                    SpannableStringBuilder A0C = DbS.A0C(igTextView.getText());
                    C263324Kh.A05(A0C, ImageSpan.class);
                    igTextView.setText(A0C);
                }
                AnonymousClass4AB r1 = r5.A01;
                if (r1 == null) {
                    return true;
                }
                r5.A0D.A05.A01(r4, r1);
                return true;
            case 3:
                C331127Pr r0 = A00(motionEvent, this).A03;
                if (r0 == null || (tht = r0.A0W) == null) {
                    return false;
                }
                tht.Dkz();
                return false;
            case 4:
                C68046MzD mzD = (C68046MzD) this.A02;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                mzD.A04.performHapticFeedback(16);
                mzD.A0B.invoke(this.A01);
                return true;
        }
        return super.onSingleTapConfirmed(motionEvent);
    }
}
