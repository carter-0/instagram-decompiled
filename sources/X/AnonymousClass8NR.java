package X;

import android.view.View;

/* renamed from: X.8NR  reason: invalid class name */
public final class AnonymousClass8NR implements AnonymousClass0eK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C71662eb A04;
    public final /* synthetic */ AnonymousClass8ME A05;
    public final /* synthetic */ C3499982t A06;

    public AnonymousClass8NR(View view, View view2, View view3, View view4, C71662eb r5, AnonymousClass8ME r6, C3499982t r7) {
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A01 = view;
        this.A03 = view2;
        this.A02 = view3;
        this.A00 = view4;
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [X.07Z, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        if (r2 == X.28D.A2R) goto L_0x0083;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object get() {
        /*
            r41 = this;
            r2 = r41
            X.8ME r7 = r2.A05
            X.82p r0 = r7.A13
            r24 = r0
            X.80U r0 = r7.A1B
            r23 = r0
            X.4DH r0 = r7.A0l
            r20 = r0
            X.0gy r22 = X.AnonymousClass07i.A00(r20)
            X.0hq r21 = r20.getChildFragmentManager()
            X.0qQ.A07(r21)
            android.view.View r0 = r7.A0h
            r19 = r0
            android.content.Context r9 = r7.A0f
            X.2eb r8 = r2.A04
            android.view.View r5 = r2.A01
            android.view.View r4 = r2.A03
            android.view.View r3 = r2.A02
            android.view.View r1 = r2.A00
            X.A7T r0 = new X.A7T
            r11 = r5
            r12 = r4
            r13 = r3
            r14 = r1
            r15 = r8
            r16 = r7
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.A53 r6 = new X.A53
            r6.<init>(r9, r8, r0)
            boolean r0 = r7.A1w
            r1 = r19
            if (r0 == 0) goto L_0x0140
            android.view.ViewParent r1 = r19.getParent()
            r0 = 0
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.view.View r1 = (android.view.View) r1
            r0 = 2131432747(0x7f0b152b, float:1.848726E38)
        L_0x0054:
            android.view.View r5 = r1.requireViewById(r0)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            X.0qQ.A0A(r5)
            com.instagram.common.session.UserSession r4 = r7.A0r
            X.82t r0 = r2.A06
            r18 = r0
            X.2xu r15 = r7.A1h
            X.3E6 r14 = r7.A0s
            java.lang.Class<X.6oG> r0 = X.C318046oG.class
            java.util.EnumSet r3 = java.util.EnumSet.allOf(r0)
            X.0qQ.A07(r3)
            X.28D r2 = r7.A0k
            X.28D r0 = X.28D.A2K
            if (r2 == r0) goto L_0x0083
            X.28D r0 = X.28D.A2S
            if (r2 == r0) goto L_0x0083
            X.28D r0 = X.28D.A2H
            if (r2 == r0) goto L_0x0083
            X.28D r0 = X.28D.A2R
            r9 = 0
            if (r2 != r0) goto L_0x0084
        L_0x0083:
            r9 = 1
        L_0x0084:
            if (r9 == 0) goto L_0x0093
            X.0Tu r8 = X.0Tu.A05
            r0 = 2342154896117072683(0x208101780000032b, double:4.058706662517219E-152)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x0097
        L_0x0093:
            X.28D r0 = X.28D.A2T
            if (r2 != r0) goto L_0x00a1
        L_0x0097:
            X.6oG r0 = X.C318046oG.MUSIC_OVERLAY
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.MUSIC_PICK_STICKER
            r3.remove(r0)
        L_0x00a1:
            if (r9 == 0) goto L_0x00f1
            X.0Tu r8 = X.0Tu.A05
            r0 = 36327018073176188(0x810f3b0000387c, double:3.0366907344128246E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x00f1
            X.6oG r0 = X.C318046oG.MUSIC_PICK_STICKER
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.POLLING
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.POLL_STICKER_V2
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.SLIDER
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.QUIZ
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.REACTION_STICKER
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.QUESTION
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.QUESTION_RESPONSE_RESHARE
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.PROMPT
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.POLAROID_STICKER
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.SECRET_STICKER
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.NOTIFY_ME
            r3.remove(r0)
            X.6oG r0 = X.C318046oG.PRODUCT
            r3.remove(r0)
        L_0x00f1:
            X.MBG r11 = new X.MBG
            r11.<init>(r7)
            X.8Yz r13 = r7.A0t
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12 = r7.A10
            androidx.fragment.app.FragmentActivity r17 = r20.requireActivity()
            X.0iw r10 = r7.A0o
            X.8C9 r9 = r7.A17
            r0 = 11
            X.9LJ r8 = new X.9LJ
            r8.<init>(r7, r0)
            r0 = 12
            X.9LJ r1 = new X.9LJ
            r1.<init>(r7, r0)
            java.util.Map r0 = r7.A0L
            X.JY9 r16 = new X.JY9
            r30 = r6
            r31 = r24
            r32 = r9
            r33 = r23
            r34 = r18
            r35 = r15
            r36 = r0
            r37 = r3
            r38 = r11
            r39 = r8
            r40 = r1
            r23 = r2
            r24 = r10
            r25 = r4
            r26 = r14
            r27 = r13
            r28 = r7
            r29 = r12
            r18 = r19
            r19 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r16
        L_0x0140:
            r0 = 2131428174(0x7f0b034e, float:1.8477985E38)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8NR.get():java.lang.Object");
    }
}
