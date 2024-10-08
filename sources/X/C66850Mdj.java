package X;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* renamed from: X.Mdj  reason: case insensitive filesystem */
public abstract class C66850Mdj {
    public static final int A00(Context context, int i, boolean z, boolean z2) {
        if (!z || !z2 || i <= 0) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(i);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        String string = context.getString(2131959224, new Object[]{C253673rC.A03(resources, valueOf)});
        0qQ.A07(string);
        return C66849Mdi.A01(context, string) + (context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material) * 2) + context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    public static final ImmutableList A01(ImmutableList immutableList, int i) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        PriorityQueue priorityQueue = new PriorityQueue(i, new C73428PcS((0sL) C74201Pqh.A00, 6));
        C249803kO A0J = C66580MXl.A0J(immutableList);
        DirectCountBasedReaction directCountBasedReaction = null;
        while (A0J.hasNext()) {
            DirectCountBasedReaction directCountBasedReaction2 = (DirectCountBasedReaction) A0J.next();
            if (directCountBasedReaction2.A00 > 0) {
                if (directCountBasedReaction2.A02) {
                    directCountBasedReaction = directCountBasedReaction2;
                }
                if (priorityQueue.size() == i) {
                    DirectCountBasedReaction directCountBasedReaction3 = (DirectCountBasedReaction) priorityQueue.peek();
                    if (directCountBasedReaction3 != null && directCountBasedReaction2.A00 > directCountBasedReaction3.A00) {
                        priorityQueue.poll();
                    }
                }
                priorityQueue.add(directCountBasedReaction2);
            }
        }
        while (!priorityQueue.isEmpty()) {
            DirectCountBasedReaction directCountBasedReaction4 = (DirectCountBasedReaction) priorityQueue.poll();
            if (directCountBasedReaction4 != null && directCountBasedReaction4.A01.length() > 0) {
                A1C.add(directCountBasedReaction4);
            }
        }
        if (directCountBasedReaction != null && !A1C.contains(directCountBasedReaction)) {
            A1C.set(0, directCountBasedReaction);
        }
        return DbU.A0K(00k.A0Y(A1C));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.instagram.model.direct.messageid.MessageIdentifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: com.instagram.model.direct.messageid.MessageIdentifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.instagram.model.direct.messageid.MessageIdentifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: com.instagram.model.direct.messageid.MessageIdentifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: com.instagram.model.direct.messageid.MessageIdentifier} */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.79G, X.79H] */
    /* JADX WARNING: type inference failed for: r14v4, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e3, code lost:
        if (r2.isEmpty() != false) goto L_0x00e5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass79G A02(android.content.res.Resources r40, com.google.common.collect.ImmutableList r41, com.instagram.common.session.UserSession r42, X.AnonymousClass9HC r43, X.C329967Kx r44, X.2FW r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53) {
        /*
            r0 = 0
            r5 = r40
            r8 = r42
            boolean r6 = X.AnonymousClass7TF.A1U(r0, r8, r5)
            r1 = 10
            r13 = r45
            X.0qQ.A0B(r13, r1)
            r14 = 0
            r29 = r53
            r2 = r41
            r10 = r43
            r12 = r44
            r4 = r46
            r17 = r47
            r19 = r48
            r25 = r49
            r26 = r50
            r27 = r51
            if (r52 != 0) goto L_0x00cc
            if (r41 == 0) goto L_0x00cc
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x00cc
            int r6 = r2.size()
            r1 = 3
            if (r6 <= r1) goto L_0x0037
            r6 = 3
        L_0x0037:
            java.util.Iterator r3 = r2.iterator()
            r48 = 0
        L_0x003d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r3.next()
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r1 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r1
            int r1 = r1.A00
            int r48 = r48 + r1
            goto L_0x003d
        L_0x004e:
            com.google.common.collect.ImmutableList r1 = A01(r2, r6)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x005a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r3.next()
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r1 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r1
            java.lang.String r1 = r1.A01
            r6.add(r1)
            goto L_0x005a
        L_0x006c:
            com.google.common.collect.ImmutableList r45 = X.DbU.A0K(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r48)
            r31 = 0
            java.lang.String r40 = X.C253673rC.A03(r5, r1)
            X.0sn r3 = X.0sn.A00
            if (r46 != 0) goto L_0x00c7
            r38 = r14
        L_0x0080:
            X.0sm r47 = X.0Yt.A0E()
            java.util.Iterator r4 = r2.iterator()
        L_0x0088:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00c5
            java.lang.Object r2 = r4.next()
            r1 = r2
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r1 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r1
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x0088
        L_0x0099:
            com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction r2 = (com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction) r2
            if (r2 == 0) goto L_0x009f
            java.lang.String r14 = r2.A01
        L_0x009f:
            r1 = 2
            X.0qQ.A0B(r3, r1)
            X.79G r6 = new X.79G
            r30 = r6
            r32 = r8
            r33 = r31
            r34 = r10
            r35 = r31
            r36 = r12
            r37 = r13
            r39 = r31
            r41 = r17
            r42 = r31
            r43 = r19
            r44 = r14
            r46 = r3
            r52 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return r6
        L_0x00c5:
            r2 = r14
            goto L_0x0099
        L_0x00c7:
            com.instagram.model.direct.messageid.MessageIdentifier r38 = X.C66580MXl.A0i(r4, r14)
            goto L_0x0080
        L_0x00cc:
            X.0sn r3 = X.0sn.A00
            r7 = 0
            if (r46 == 0) goto L_0x00d5
            com.instagram.model.direct.messageid.MessageIdentifier r14 = X.C66580MXl.A0i(r4, r14)
        L_0x00d5:
            X.0sm r23 = X.0Yt.A0E()
            if (r52 == 0) goto L_0x00e5
            if (r41 == 0) goto L_0x00e5
            boolean r1 = r2.isEmpty()
            r28 = 1
            if (r1 == 0) goto L_0x00e7
        L_0x00e5:
            r28 = 0
        L_0x00e7:
            java.lang.String r16 = ""
            X.0qQ.A0B(r3, r6)
            X.79G r6 = new X.79G
            r9 = r7
            r11 = r7
            r15 = r7
            r18 = r7
            r20 = r7
            r21 = r3
            r22 = r3
            r24 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66850Mdj.A02(android.content.res.Resources, com.google.common.collect.ImmutableList, com.instagram.common.session.UserSession, X.9HC, X.7Kx, X.2FW, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):X.79G");
    }
}
