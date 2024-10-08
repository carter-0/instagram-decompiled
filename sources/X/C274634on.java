package X;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import java.util.List;
import java.util.Map;

/* renamed from: X.4on  reason: invalid class name and case insensitive filesystem */
public final class C274634on extends 2Rw implements C274644oo {
    public AnonymousClass2t9 A00;
    public C232312tT A01;
    public AnonymousClass7ZX A02;
    public AnonymousClass7LD A03;
    public AnonymousClass9HC A04;
    public AnonymousClass7L2 A05;
    public boolean A06 = true;
    public final Context A07;
    public final View.OnLongClickListener A08;
    public final 2cp A09;
    public final UserSession A0A;
    public final AnonymousClass7LE A0B;
    public final AnonymousClass7LH A0C;
    public final AnonymousClass7S7 A0D;
    public final AnonymousClass9HS A0E;
    public final Object A0F = new Object();
    public final 0sP A0G;

    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r17v6, types: [X.7OD] */
    /* JADX WARNING: type inference failed for: r8v15, types: [X.7OC] */
    /* JADX WARNING: type inference failed for: r17v7, types: [X.7OB] */
    /* JADX WARNING: type inference failed for: r17v8, types: [X.7OA] */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        if (r0.A2P == r7.A0U) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01be, code lost:
        if (r9 != null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c0, code lost:
        r9 = (X.AnonymousClass7O7) r7.A0Q.getValue();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FLu(X.AnonymousClass7L2 r29) {
        /*
            r28 = this;
            r3 = 0
            r2 = r28
            X.7L2 r6 = r2.A05
            r4 = r29
            r2.A05 = r4
            android.content.Context r5 = r2.A07
            int r1 = r4.A01
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r5, r1)
            X.7LD r1 = new X.7LD
            r1.<init>(r0)
            r2.A03 = r1
            X.7LE r8 = r2.A0B
            java.lang.String r5 = r4.A09
            X.7L2 r0 = r8.A04
            java.lang.String r0 = r0.A09
            boolean r0 = X.0qQ.A0K(r5, r0)
            r0 = r0 ^ 1
            r8.A04 = r4
            r8.A02 = r1
            if (r0 == 0) goto L_0x0045
            X.7LF r0 = r8.A0B
            com.instagram.common.session.UserSession r9 = r0.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36326695950694323(0x810ef0000137b3, double:3.03648702285821E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0045
            X.7LG r0 = r8.A09
            X.5Oz r0 = r0.A01
            r0.Epw(r4)
        L_0x0045:
            X.7P7 r0 = r8.A01
            if (r0 != 0) goto L_0x0051
            com.instagram.common.session.UserSession r0 = r8.A07
            boolean r0 = X.C331817Sm.A00(r0)
            if (r0 != 0) goto L_0x008d
        L_0x0051:
            X.7P7 r0 = X.AnonymousClass7LE.A02(r8)
            r0.A00 = r4
            X.7P7 r7 = X.AnonymousClass7LE.A02(r8)
            r0 = 29
            X.9Kr r1 = new X.9Kr
            r1.<init>(r7, r0)
            com.instagram.common.session.UserSession r0 = r7.A07
            boolean r0 = X.C331817Sm.A02(r0)
            if (r0 == 0) goto L_0x02f1
            X.0eO r0 = X.0eO.A03
            X.0eM r0 = X.AnonymousClass0eN.A00(r0, r1)
        L_0x0070:
            r7.A02 = r0
            X.7P7 r7 = X.AnonymousClass7LE.A02(r8)
            r0 = 28
            X.9Kr r1 = new X.9Kr
            r1.<init>(r7, r0)
            com.instagram.common.session.UserSession r0 = r7.A07
            boolean r0 = X.C331817Sm.A02(r0)
            if (r0 == 0) goto L_0x02e6
            X.0eO r0 = X.0eO.A03
            X.0eM r0 = X.AnonymousClass0eN.A00(r0, r1)
        L_0x008b:
            r7.A01 = r0
        L_0x008d:
            java.lang.String r0 = r6.A09
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x00a6
            X.2tT r0 = r2.A01
            if (r0 != 0) goto L_0x00a3
            java.lang.String r16 = "viewHolderPreloader"
        L_0x009b:
            X.0qQ.A0F(r16)
        L_0x009e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a3:
            r0.CJN(r5)
        L_0x00a6:
            X.2t9 r0 = r2.A00
            if (r0 != 0) goto L_0x00ad
            r2.notifyDataSetChanged()
        L_0x00ad:
            X.7ZX r7 = r2.A02
            if (r7 != 0) goto L_0x00b4
            java.lang.String r16 = "messageStore"
            goto L_0x009b
        L_0x00b4:
            java.lang.String r16 = "threadTheme"
            r7.A0F = r4
            com.instagram.common.session.UserSession r2 = r7.A0g
            X.7SD r1 = r7.A0H
            r0 = 1
            boolean r15 = X.C308556Us.A0D(r2, r1, r0)
            X.0mo r0 = r7.A0R()
            int r6 = r0.A01
            r5 = 0
        L_0x00c8:
            if (r5 >= r6) goto L_0x02fc
            X.0mo r0 = r7.A0R()
            java.lang.Object r8 = r0.A05(r5)
            X.0qQ.A07(r8)
            X.7So r8 = (X.C331837So) r8
            boolean r0 = r8 instanceof X.AnonymousClass7O6
            r2 = 0
            if (r0 == 0) goto L_0x014e
            X.7O6 r8 = (X.AnonymousClass7O6) r8
            boolean r1 = r8.A09
            boolean r0 = r7.A0U
            if (r1 == r0) goto L_0x0107
            int r1 = X.AnonymousClass7ZX.A01(r7, r5)
            r0 = -1
            if (r1 == r0) goto L_0x0107
            X.0mo r0 = r7.A0R()
            java.lang.Object r1 = r0.A05(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.rowdata.DirectMessageRowData"
            X.0qQ.A0C(r1, r0)
            X.7LQ r1 = (X.AnonymousClass7LQ) r1
            if (r1 == 0) goto L_0x0107
            X.3su r0 = r1.A0e
            if (r0 == 0) goto L_0x0107
            boolean r1 = r0.A2P
            boolean r0 = r7.A0U
            r9 = 1
            if (r1 != r0) goto L_0x0108
        L_0x0107:
            r9 = 0
        L_0x0108:
            java.lang.String r12 = r8.A06
            java.lang.String r11 = r8.A03
            long r0 = r8.A00
            boolean r10 = r8.A09
            if (r9 == 0) goto L_0x011b
            boolean r9 = r8.A09
            boolean r2 = r7.A0U
            if (r15 != 0) goto L_0x0142
            if (r2 != r9) goto L_0x0144
        L_0x011a:
            r2 = 0
        L_0x011b:
            int r13 = r4.A00
            X.7Bp r9 = r8.A01
            java.lang.Integer r14 = r8.A02
            boolean r27 = r4.A00()
            X.7O6 r8 = new X.7O6
            r21 = r12
            r22 = r11
            r23 = r13
            r24 = r0
            r26 = r10
            r18 = r2
            r19 = r9
            r20 = r14
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r27)
            X.AnonymousClass7ZX.A0K(r7, r8)
        L_0x013f:
            int r5 = r5 + 1
            goto L_0x00c8
        L_0x0142:
            if (r9 == 0) goto L_0x011a
        L_0x0144:
            X.7Kx r2 = r4.A04
            int r9 = r2.A0A
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r9)
            goto L_0x011b
        L_0x014e:
            boolean r0 = r8 instanceof X.AnonymousClass7O7
            java.lang.String r9 = "context"
            if (r0 == 0) goto L_0x01c9
            android.content.Context r2 = r7.A00
            if (r2 == 0) goto L_0x02e1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            int r10 = r4.A00
            X.7O7 r1 = new X.7O7
            r1.<init>(r2, r0, r10)
            X.1Ue r0 = new X.1Ue
            r0.<init>(r1)
            r7.A0Q = r0
            android.content.Context r2 = r7.A00
            if (r2 == 0) goto L_0x02e1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.7O7 r1 = new X.7O7
            r1.<init>(r2, r0, r10)
            X.1Ue r0 = new X.1Ue
            r0.<init>(r1)
            r7.A0R = r0
            android.content.Context r2 = r7.A00
            if (r2 == 0) goto L_0x02e1
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.7O7 r1 = new X.7O7
            r1.<init>(r2, r0, r10)
            X.1Ue r0 = new X.1Ue
            r0.<init>(r1)
            r7.A0P = r0
            X.7O7 r9 = r7.A08
            if (r9 == 0) goto L_0x01a3
            X.7O7 r8 = (X.AnonymousClass7O7) r8
            java.lang.String r2 = r8.A03
            java.lang.String r1 = r8.A02
            java.lang.Integer r0 = r8.A01
            if (r1 == 0) goto L_0x019c
            int r10 = r8.A00
        L_0x019c:
            X.7O7 r9 = new X.7O7
            r9.<init>(r0, r2, r1, r10)
            r7.A08 = r9
        L_0x01a3:
            boolean r0 = r7.A0U
            if (r0 == 0) goto L_0x01b3
            X.0eM r0 = r7.A0R
        L_0x01a9:
            java.lang.Object r9 = r0.getValue()
        L_0x01ad:
            X.7So r9 = (X.C331837So) r9
            r7.A0W(r9, r5)
            goto L_0x013f
        L_0x01b3:
            X.7SD r0 = r7.A0H
            X.4li r0 = r0.A0N
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x01be
            X.0eM r0 = r7.A0P
            goto L_0x01a9
        L_0x01be:
            if (r9 != 0) goto L_0x01ad
            X.0eM r0 = r7.A0Q
            java.lang.Object r9 = r0.getValue()
            X.7O7 r9 = (X.AnonymousClass7O7) r9
            goto L_0x01ad
        L_0x01c9:
            boolean r0 = r8 instanceof X.AnonymousClass7O8
            if (r0 == 0) goto L_0x0202
            android.content.Context r13 = r7.A00
            if (r13 == 0) goto L_0x02e1
            X.7O8 r8 = (X.AnonymousClass7O8) r8
            long r1 = r8.A02
            boolean r12 = r8.A06
            X.7SD r0 = r7.A0H
            boolean r11 = r0.A18
            X.7L2 r0 = r7.A0F
            if (r0 == 0) goto L_0x009b
            X.7Kx r0 = r0.A04
            int r10 = r0.A0L
            int r9 = r0.A04
            X.7Bp r0 = r8.A03
            r21 = r1
            r23 = r12
            r24 = r11
            r18 = r0
            r19 = r10
            r20 = r9
            r17 = r13
            X.7O8 r2 = X.C395219zP.A00(r17, r18, r19, r20, r21, r23, r24)
            r7.A0E = r2
        L_0x01fb:
            X.7So r2 = (X.C331837So) r2
            r7.A0W(r2, r5)
            goto L_0x013f
        L_0x0202:
            boolean r0 = r8 instanceof X.AnonymousClass7O9
            if (r0 == 0) goto L_0x023b
            android.content.Context r14 = r7.A00
            if (r14 == 0) goto L_0x02e1
            X.7O9 r8 = (X.AnonymousClass7O9) r8
            long r0 = r8.A04
            boolean r13 = r8.A09
            boolean r12 = r8.A08
            X.7L2 r2 = r7.A0F
            if (r2 == 0) goto L_0x009b
            X.7Kx r2 = r2.A04
            int r11 = r2.A0A
            boolean r10 = r8.A0A
            X.7SD r2 = r7.A0H
            boolean r9 = r2.A18
            X.7Bp r8 = r8.A05
            boolean r2 = r2.A0m
            r22 = r13
            r23 = r12
            r24 = r10
            r25 = r9
            r26 = r2
            r18 = r8
            r19 = r11
            r20 = r0
            r17 = r14
            X.7O9 r2 = X.AnonymousClass7O9.A00(r17, r18, r19, r20, r22, r23, r24, r25, r26)
            goto L_0x01fb
        L_0x023b:
            boolean r0 = r8 instanceof X.AnonymousClass7OA
            if (r0 == 0) goto L_0x025f
            X.7OA r8 = (X.AnonymousClass7OA) r8
            long r0 = r8.A01
            java.lang.String r10 = r8.A03
            X.7L2 r2 = r7.A0F
            if (r2 == 0) goto L_0x009b
            X.7Kx r2 = r2.A04
            int r9 = r2.A0A
            X.7Bp r8 = r8.A02
            X.7OA r2 = new X.7OA
            r21 = r0
            r18 = r8
            r19 = r10
            r20 = r9
            r17 = r2
            r17.<init>(r18, r19, r20, r21)
            goto L_0x01fb
        L_0x025f:
            boolean r0 = r8 instanceof X.AnonymousClass7OB
            if (r0 == 0) goto L_0x0286
            X.7OB r8 = (X.AnonymousClass7OB) r8
            java.lang.String r11 = r8.A04
            java.lang.String r10 = r8.A03
            X.7Kx r0 = r4.A04
            int r9 = r0.A0L
            long r0 = r8.A01
            X.7Bp r8 = r8.A02
            X.7OB r2 = new X.7OB
            r21 = r9
            r22 = r0
            r18 = r8
            r19 = r11
            r20 = r10
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22)
            r7.A0D = r2
            goto L_0x01fb
        L_0x0286:
            boolean r0 = r8 instanceof X.AnonymousClass7OC
            if (r0 == 0) goto L_0x02a9
            X.7OC r8 = (X.AnonymousClass7OC) r8
            java.lang.String r12 = r8.A03
            com.instagram.user.model.User r11 = r8.A02
            boolean r10 = r8.A06
            X.7Er r9 = r8.A00
            X.7L2 r0 = r7.A0F
            if (r0 == 0) goto L_0x009b
            X.7L0 r1 = r0.A07
            X.0sK r0 = r8.A05
            X.7OC r2 = new X.7OC
            r13 = r0
            r14 = r10
            r10 = r1
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7.A0A = r2
            goto L_0x01fb
        L_0x02a9:
            boolean r0 = r8 instanceof X.AnonymousClass7OD
            if (r0 == 0) goto L_0x013f
            X.7OD r8 = (X.AnonymousClass7OD) r8
            X.7L2 r0 = r7.A0F
            if (r0 == 0) goto L_0x009b
            int r14 = r0.A00
            X.7Kx r0 = r0.A04
            int r13 = r0.A04
            android.text.SpannableString r12 = r8.A03
            java.lang.String r11 = r8.A04
            java.lang.String r10 = r8.A05
            boolean r9 = r8.A06
            long r0 = r8.A02
            X.0qQ.A0B(r12, r3)
            r2 = 3
            X.0qQ.A0B(r10, r2)
            X.7OD r2 = new X.7OD
            r21 = r14
            r22 = r13
            r23 = r0
            r25 = r9
            r18 = r12
            r19 = r11
            r20 = r10
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r25)
            goto L_0x01fb
        L_0x02e1:
            X.0qQ.A0F(r9)
            goto L_0x009e
        L_0x02e6:
            java.lang.Object r1 = r1.invoke()
            X.1Ue r0 = new X.1Ue
            r0.<init>(r1)
            goto L_0x008b
        L_0x02f1:
            java.lang.Object r1 = r1.invoke()
            X.1Ue r0 = new X.1Ue
            r0.<init>(r1)
            goto L_0x0070
        L_0x02fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C274634on.FLu(X.7L2):void");
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C249703kE r3;
        0sP r1;
        0qQ.A0B(viewGroup, 0);
        int Ewo = AnonymousClass2Ro.A00.Ewo(i);
        C232312tT r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("viewHolderPreloader");
            throw AnonymousClass00P.createAndThrow();
        }
        C249703kE AX2 = r0.AX2(i);
        if (AX2 == null) {
            0eP r02 = (0eP) ((Map) this.A0B.A0G.getValue()).get(Integer.valueOf(i));
            if (r02 == null || (r1 = (0sP) r02.A00) == null) {
                r1 = new C58735Iwi(i, 16, this);
            }
            r3 = (C249703kE) r1.invoke(viewGroup);
        } else {
            r3 = AX2;
        }
        String name = r3.getClass().getName();
        0qQ.A07(name);
        boolean z = false;
        if (AX2 != null) {
            z = true;
        }
        AnonymousClass2Ro.A00.ASL(C320866t5.A00(r3, (Object) null, name, z, this.A0E.A01), Ewo);
        return r3;
    }

    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C249703kE r3) {
        0qQ.A0B(r3, 0);
        if ((r3 instanceof C331257Qe) || (r3 instanceof C331267Qf)) {
            r3.itemView.setMinimumHeight(0);
        }
    }

    public /* synthetic */ C274634on(Activity activity, Context context, View.OnLongClickListener onLongClickListener, AnonymousClass4DH r40, AnonymousClass0iw r41, UserSession userSession, AnonymousClass7TO r43, AnonymousClass9HO r44, C332807Wl r45, AnonymousClass9HC r46, AnonymousClass7LB r47, AnonymousClass7L2 r48, AnonymousClass7S7 r49, AnonymousClass9HS r50, C331037Pg r51, AnonymousClass7L3 r52, String str, 0sP r54, boolean z, boolean z2) {
        String A0g;
        UserSession userSession2 = userSession;
        1Av A002 = 1Au.A00(userSession2);
        AnonymousClass7L2 r2 = r48;
        Context context2 = context;
        AnonymousClass7LD r1 = new AnonymousClass7LD(new ContextThemeWrapper(context2, r2.A01));
        AnonymousClass4DH r8 = r40;
        0qQ.A0B(r8, 3);
        0qQ.A0B(userSession2, 4);
        C332807Wl r5 = r45;
        0qQ.A0B(r5, 5);
        AnonymousClass7TO r6 = r43;
        0qQ.A0B(r6, 8);
        AnonymousClass0iw r11 = r41;
        0qQ.A0B(r11, 11);
        0qQ.A0B(A002, 19);
        this.A07 = context2;
        this.A0A = userSession2;
        this.A04 = r46;
        this.A05 = r2;
        this.A08 = onLongClickListener;
        AnonymousClass7S7 r14 = r49;
        this.A0D = r14;
        AnonymousClass9HS r13 = r50;
        this.A0E = r13;
        this.A0G = r54;
        this.A03 = r1;
        2cp A003 = C61340me.A00();
        this.A09 = A003;
        AnonymousClass9HC r22 = this.A04;
        AnonymousClass7L3 r32 = r52;
        C331037Pg r31 = r51;
        Activity activity2 = activity;
        AnonymousClass7L2 r28 = this.A05;
        AnonymousClass7S7 r29 = r14;
        AnonymousClass9HS r30 = r13;
        C332807Wl r25 = r5;
        AnonymousClass9HC r26 = r22;
        AnonymousClass7LD r23 = this.A03;
        AnonymousClass7TO r222 = r6;
        UserSession userSession3 = userSession2;
        AnonymousClass0iw r20 = r11;
        AnonymousClass4DH r19 = r8;
        2cp r18 = A003;
        Context context3 = context2;
        this.A0B = new AnonymousClass7LE(activity2, context3, r18, r19, r20, userSession3, r222, r23, r44, r25, r26, r47, r28, r29, r30, r31, r32, str, z, z2);
        this.A0C = new AnonymousClass7LH(userSession2);
        0xa r10 = A002.A01;
        if (r10.getInt("should_show_like_direct_message_count", 0) < 2) {
            int i = 0;
            for (2FW r12 : 2FW.values()) {
                0qQ.A0B(r12, 0);
                if (r12 == 2FW.A1g) {
                    A0g = "should_show_like_direct_message_nux";
                } else if (r12 == 2FW.A0q) {
                    A0g = "should_show_like_direct_vm_message_nux";
                } else {
                    A0g = 002.A0g("should_show_like_direct_", r12.name(), "_message_nux");
                    0qQ.A07(A0g);
                }
                if (!r10.getBoolean(A0g, true)) {
                    i++;
                }
            }
            0xY AR4 = r10.AR4();
            if (i < 2) {
                AR4.E5Z("should_show_like_direct_message_count", i);
            } else {
                AR4.E5Z("should_show_like_direct_message_count", 2);
            }
            AR4.apply();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2t9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.2Rw AZJ() {
        /*
            r2 = this;
            java.lang.Object r1 = r2.A0F
            monitor-enter(r1)
            X.2t9 r0 = r2.A00     // Catch:{ all -> 0x000a }
            if (r0 != 0) goto L_0x0008
            r0 = r2
        L_0x0008:
            monitor-exit(r1)
            return r0
        L_0x000a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C274634on.AZJ():X.2Rw");
    }

    public final MessageListLayoutManager BLu(RecyclerView recyclerView) {
        return new DirectMessageListLinearLayoutManager(this.A07, (int) 182.A01(0Tu.A05, this.A0A, 36600873779597329L));
    }

    public final void E3i(List list) {
        C232312tT r4 = this.A01;
        if (r4 == null) {
            0qQ.A0F("viewHolderPreloader");
            throw AnonymousClass00P.createAndThrow();
        } else if (r4 instanceof AnonymousClass7LO) {
            AnonymousClass7LO r42 = (AnonymousClass7LO) r4;
            if (182.A06(0Tu.A05, r42.A01, 36320489722946033L)) {
                AnonymousClass7LO.A01(r42, list);
            }
        } else if (r4 instanceof C71949Ota) {
            C71949Ota ota = (C71949Ota) r4;
            if (182.A06(0Tu.A05, ota.A03, 36317835433875048L)) {
                C71949Ota.A00(ota, list);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("LegacyRecyclerViewMessageThreadViewHolderPreloader but was ");
            sb.append(r4);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void E3j(List list) {
        C232312tT r4 = this.A01;
        if (r4 == null) {
            0qQ.A0F("viewHolderPreloader");
            throw AnonymousClass00P.createAndThrow();
        } else if (r4 instanceof AnonymousClass7LO) {
            AnonymousClass7LO r42 = (AnonymousClass7LO) r4;
            if (182.A06(0Tu.A05, r42.A01, 36320489722880496L)) {
                AnonymousClass7LO.A01(r42, list);
            }
        } else if (r4 instanceof C71949Ota) {
            C71949Ota ota = (C71949Ota) r4;
            if (182.A06(0Tu.A05, ota.A03, 36317835433809511L)) {
                C71949Ota.A00(ota, list);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("LegacyRecyclerViewMessageThreadViewHolderPreloader but was ");
            sb.append(r4);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void EXs(boolean z) {
        this.A06 = z;
        AnonymousClass2t9 r0 = this.A00;
        if (r0 != null) {
            r0.A00 = z;
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        AnonymousClass7PL r62 = (AnonymousClass7PL) r6;
        0qQ.A0B(r62, 0);
        int Ewi = AnonymousClass2Ro.A00.Ewi(r62.mItemViewType);
        AnonymousClass7ZX r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("messageStore");
            throw AnonymousClass00P.createAndThrow();
        }
        C331837So A0S = r0.A0S(i);
        r62.itemView.setHapticFeedbackEnabled(this.A06);
        r62.itemView.setOnLongClickListener(this.A08);
        r62.A00 = A0S;
        r62.A03(A0S);
        String name = r62.getClass().getName();
        0qQ.A07(name);
        AnonymousClass2Ro.A00.ASI(C320866t5.A00(r62, A0S, name, false, false), Ewi);
        AnonymousClass7LH r2 = this.A0C;
        View view = r62.itemView;
        0qQ.A06(view);
        r2.A00(view, A0S, this.A0D.C6Q().A08);
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r2) {
        AnonymousClass7PL r22 = (AnonymousClass7PL) r2;
        0qQ.A0B(r22, 0);
        r22.A01();
        r22.A00 = null;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1856573148);
        AnonymousClass7ZX r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("messageStore");
            throw AnonymousClass00P.createAndThrow();
        }
        int itemCount = r0.getItemCount();
        AnonymousClass0fD.A0A(-2078939534, A032);
        return itemCount;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-212577595);
        AnonymousClass7ZX r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("messageStore");
            throw AnonymousClass00P.createAndThrow();
        }
        int type = ((C331837So) r0.A0R().A05(i)).getType();
        AnonymousClass0fD.A0A(-1244557443, A032);
        return type;
    }
}
