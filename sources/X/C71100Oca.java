package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Oca  reason: case insensitive filesystem */
public abstract class C71100Oca {
    public static final List A00 = 0sr.A1P(new String[]{"❤️", "😍", "🔥", "😭", "😔", "🥺", "🙏", "😂"});

    public static final String A00(UserSession userSession, int i) {
        0qQ.A0B(userSession, 0);
        1Av A002 = 1Au.A00(userSession);
        String A13 = DbV.A13(A002, A002.A0w, 1Av.A8a, 158);
        if (i == 29) {
            if (A13 != null) {
                ImmutableList immutableList = C254853tA.A03;
                if (!A13.equals("❤")) {
                    return A13;
                }
            }
        } else if (A13 != null) {
            return A13;
        }
        ImmutableList immutableList2 = C254853tA.A03;
        return "❤";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r0 != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.view.ViewGroup r15, X.AnonymousClass0iw r16, com.instagram.common.session.UserSession r17, X.0sL r18, int r19, int r20) {
        /*
            r2 = 3
            r14 = 1
            r9 = r17
            X.0qQ.A0B(r9, r14)
            r8 = r16
            X.0Tu r3 = X.DbS.A0J(r8, r2)
            r0 = 36886111148180152(0x830bb9002202b8, double:3.390263446332443E-306)
            java.lang.String r7 = X.182.A04(r3, r9, r0)
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            int r5 = r7.length()
            r3 = 0
            r4 = 0
        L_0x0020:
            if (r4 >= r5) goto L_0x0034
            char r1 = r7.charAt(r4)
            r0 = 92
            if (r1 == r0) goto L_0x0031
            r0 = 85
            if (r1 == r0) goto L_0x0031
            r6.append(r1)
        L_0x0031:
            int r4 = r4 + 1
            goto L_0x0020
        L_0x0034:
            java.lang.String r0 = X.DbT.A10(r6)
            java.util.List r0 = X.DbX.A0x(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r0)     // Catch:{ IllegalArgumentException -> 0x0064 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ IllegalArgumentException -> 0x0064 }
        L_0x0044:
            boolean r0 = r5.hasNext()     // Catch:{ IllegalArgumentException -> 0x0064 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = X.AnonymousClass7TE.A18(r5)     // Catch:{ IllegalArgumentException -> 0x0064 }
            X.I0g r0 = X.I0g.A03     // Catch:{ IllegalArgumentException -> 0x0064 }
            int r0 = X.I5S.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0064 }
            char[] r1 = java.lang.Character.toChars(r0)     // Catch:{ IllegalArgumentException -> 0x0064 }
            X.0qQ.A07(r1)     // Catch:{ IllegalArgumentException -> 0x0064 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0064 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0064 }
            r4.add(r0)     // Catch:{ IllegalArgumentException -> 0x0064 }
            goto L_0x0044
        L_0x0064:
            java.util.List r4 = A00
        L_0x0066:
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x008e
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x008e
        L_0x0070:
            java.util.List r0 = X.00k.A0d(r4, r2)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x007c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            X.6nL r0 = X.C336957fS.A01(r0)
            r2.add(r0)
            goto L_0x007c
        L_0x008e:
            java.util.Iterator r1 = r4.iterator()
        L_0x0092:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            boolean r0 = X.0mp.A0D(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0092
            java.util.List r4 = A00
            goto L_0x0070
        L_0x00a7:
            java.util.Iterator r4 = r2.iterator()
        L_0x00ab:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r10 = r4.next()
            X.6nL r10 = (X.C317486nL) r10
            android.content.Context r0 = r15.getContext()
            r1 = r19
            com.instagram.common.ui.base.IgFrameLayout r2 = X.C337077fe.A00(r0, r1, r1)
            java.lang.Object r12 = r2.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.emojigrid.EmojiGridRowItemViewBinder.Holder"
            X.0qQ.A0C(r12, r0)
            X.7fc r12 = (X.C337057fc) r12
            X.PRJ r11 = new X.PRJ
            r0 = r18
            r11.<init>(r3, r15, r0)
            r13 = 1065353216(0x3f800000, float:1.0)
            X.C337077fe.A03(r8, r9, r10, r11, r12, r13, r14)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 16
            r1.gravity = r0
            r0 = r20
            r1.setMarginEnd(r0)
            int r0 = r15.getChildCount()
            int r0 = r0 + -1
            r15.addView(r2, r0)
            goto L_0x00ab
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71100Oca.A03(android.view.ViewGroup, X.0iw, com.instagram.common.session.UserSession, X.0sL, int, int):void");
    }

    public static final ArrayList A01() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C249803kO A0J = C66580MXl.A0J(C254853tA.A04);
        while (A0J.hasNext()) {
            A1C.add(((C254853tA) AnonymousClass7TF.A0a(A0J)).A02);
        }
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r2.length() == 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A02(com.instagram.common.session.UserSession r7) {
        /*
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r7)
            r0 = 36328121879772107(0x81103c00003bcb, double:3.037388786148756E-306)
            boolean r6 = X.182.A06(r2, r7, r0)
            java.lang.String r4 = "failed to parse reaction set"
            java.lang.String r3 = "DirectReactionSetUtil"
            X.1Av r5 = X.1Au.A00(r7)
            X.0s0 r2 = r5.A0x
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.String r2 = X.DbV.A13(r5, r2, r1, r0)
            if (r6 == 0) goto L_0x00b1
            r5 = 0
            if (r2 == 0) goto L_0x002b
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r0 == 0) goto L_0x0060
            java.util.ArrayList r3 = A01()
        L_0x0032:
            X.NSr r0 = new X.NSr
            r0.<init>(r7)
            java.util.ArrayList r0 = r0.A02()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0043:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.AZg r0 = (X.C40291AZg) r0
            X.6nL r0 = r0.A04
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r0.A02
        L_0x0056:
            boolean r0 = X.00k.A0u(r3, r0)
            X.DbV.A1U(r1, r4, r0)
            goto L_0x0043
        L_0x005e:
            r0 = 0
            goto L_0x0056
        L_0x0060:
            X.16F r0 = X.16P.A00(r2)     // Catch:{ IOException -> 0x0076 }
            X.O8A r0 = X.C70141Nxv.parseFromJson(r0)     // Catch:{ IOException -> 0x0076 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x0076 }
            java.util.List r0 = r0.A00     // Catch:{ IOException -> 0x0076 }
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)     // Catch:{ IOException -> 0x0076 }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ IOException -> 0x0076 }
            goto L_0x0032
        L_0x0076:
            r0 = move-exception
            X.0wb.A06(r3, r4, r0)
            java.util.ArrayList r3 = A01()
            goto L_0x0032
        L_0x007f:
            r0 = 5
            java.util.List r1 = X.00k.A0d(r4, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ca
            java.util.Iterator r2 = r1.iterator()
        L_0x008e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r2.next()
            int r1 = r5 + 1
            if (r5 >= 0) goto L_0x00a4
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a4:
            X.AZg r0 = (X.C40291AZg) r0
            X.6nL r0 = r0.A04
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = r0.A02
            r3.add(r1, r0)
        L_0x00af:
            r5 = r1
            goto L_0x008e
        L_0x00b1:
            if (r2 == 0) goto L_0x00c6
            X.16F r0 = X.16P.A00(r2)     // Catch:{ IOException -> 0x00c2 }
            X.O8A r0 = X.C70141Nxv.parseFromJson(r0)     // Catch:{ IOException -> 0x00c2 }
            java.util.List r0 = r0.A00     // Catch:{ IOException -> 0x00c2 }
            com.google.common.collect.ImmutableList r3 = X.DbU.A0K(r0)     // Catch:{ IOException -> 0x00c2 }
            return r3
        L_0x00c2:
            r0 = move-exception
            X.0wb.A06(r3, r4, r0)
        L_0x00c6:
            java.util.ArrayList r3 = A01()
        L_0x00ca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71100Oca.A02(com.instagram.common.session.UserSession):java.util.List");
    }
}
