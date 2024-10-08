package X;

import android.os.Bundle;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.domain.uistate.ContentNotesOverflowFragmentUiState;
import com.instagram.contentnotes.domain.uistate.NoteTextContent;
import com.instagram.contentnotes.domain.uistate.NoteTextStringLiteralContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GwL  reason: case insensitive filesystem */
public final class C53915GwL extends C251343mx {
    public final C53372Gmw A00;
    public final UserSession A01;
    public final AnonymousClass4GS A02;
    public final C59492JLq A03;
    public final C59553JNz A04;
    public final AnonymousClass4DU A05;
    public final 0sP A06;
    public final long A07;
    public final C376459Ib A08;
    public final 2WX A09;
    public final AnonymousClass33B A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D = true;

    public C53915GwL(C376459Ib r3, C53372Gmw gmw, 2WX r5, UserSession userSession, AnonymousClass4GS r7, C59492JLq jLq, AnonymousClass33B r9, C59553JNz jNz, AnonymousClass4DU r11, 0sP r12, long j, boolean z, boolean z2) {
        DbZ.A0t(1, gmw, r11, userSession);
        C51974G9v.A1N(r12, jNz, jLq);
        C51969G9p.A1P(r3, 10, r9);
        this.A00 = gmw;
        this.A05 = r11;
        this.A01 = userSession;
        this.A09 = r5;
        this.A06 = r12;
        this.A04 = jNz;
        this.A03 = jLq;
        this.A07 = j;
        this.A08 = r3;
        this.A0B = z;
        this.A0C = z2;
        this.A02 = r7;
        this.A0A = r9;
    }

    public static final void A00(C53372Gmw gmw, C70832Wc r71, C53915GwL gwL) {
        String str;
        C53915GwL gwL2 = gwL;
        UserSession userSession = gwL2.A01;
        AnonymousClass4DU r2 = gwL2.A05;
        String A0E = C244013aV.A0E(r71, 2131956636);
        C53372Gmw gmw2 = gmw;
        C51974G9v.A1K(userSession, r2, gmw2);
        String moduleName = r2.getModuleName();
        NoteTextStringLiteralContent noteTextStringLiteralContent = new NoteTextStringLiteralContent(A0E);
        boolean z = gmw2.A08;
        int i = gmw2.A01;
        0qQ.A0B(moduleName, 2);
        User A002 = AnonymousClass0eD.A00(userSession);
        if (A002 != null) {
            List<NotesPogThoughtBubbleUiState> list = (List) gmw2.A04;
            0qQ.A0B(list, 0);
            User A003 = AnonymousClass0eD.A00(userSession);
            boolean z2 = false;
            if (A003 != null) {
                String id = A003.getId();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (0qQ.A0K(((NotesPogThoughtBubbleUiState) it.next()).A06.getId(), id)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            01N A1H = 0jo.A1H();
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState : list) {
                Integer num = AnonymousClass05K.A01;
                String str2 = notesPogThoughtBubbleUiState.A0F;
                NoteTextContent noteTextContent = notesPogThoughtBubbleUiState.A05;
                ImageUrl imageUrl = notesPogThoughtBubbleUiState.A03;
                boolean z3 = notesPogThoughtBubbleUiState.A0N;
                String str3 = notesPogThoughtBubbleUiState.A0J;
                String str4 = notesPogThoughtBubbleUiState.A0H;
                Integer num2 = notesPogThoughtBubbleUiState.A07;
                User user = notesPogThoughtBubbleUiState.A06;
                boolean z4 = notesPogThoughtBubbleUiState.A0P;
                Long l = notesPogThoughtBubbleUiState.A0B;
                int i2 = notesPogThoughtBubbleUiState.A00;
                String str5 = notesPogThoughtBubbleUiState.A0C;
                String str6 = notesPogThoughtBubbleUiState.A0D;
                String str7 = notesPogThoughtBubbleUiState.A0I;
                List list2 = notesPogThoughtBubbleUiState.A0L;
                List list3 = notesPogThoughtBubbleUiState.A0K;
                boolean z5 = notesPogThoughtBubbleUiState.A0M;
                boolean z6 = notesPogThoughtBubbleUiState.A0S;
                Integer num3 = notesPogThoughtBubbleUiState.A08;
                boolean z7 = notesPogThoughtBubbleUiState.A0Q;
                String str8 = notesPogThoughtBubbleUiState.A0E;
                ImageUrl imageUrl2 = notesPogThoughtBubbleUiState.A04;
                int i3 = notesPogThoughtBubbleUiState.A01;
                boolean z8 = notesPogThoughtBubbleUiState.A0R;
                Integer num4 = notesPogThoughtBubbleUiState.A09;
                boolean z9 = notesPogThoughtBubbleUiState.A0T;
                boolean z10 = notesPogThoughtBubbleUiState.A0Z;
                boolean z11 = notesPogThoughtBubbleUiState.A0X;
                boolean z12 = notesPogThoughtBubbleUiState.A0U;
                boolean z13 = notesPogThoughtBubbleUiState.A0V;
                boolean z14 = notesPogThoughtBubbleUiState.A0O;
                boolean z15 = notesPogThoughtBubbleUiState.A0Y;
                boolean z16 = notesPogThoughtBubbleUiState.A0W;
                NoteCustomTheme noteCustomTheme = notesPogThoughtBubbleUiState.A02;
                String str9 = notesPogThoughtBubbleUiState.A0G;
                AnonymousClass7TF.A1H(str2, noteTextContent);
                ImageUrl imageUrl3 = imageUrl;
                C51973G9u.A0r(2, imageUrl3, str3, str4);
                0qQ.A0B(user, 7);
                C51973G9u.A0v(11, str5, list2, list3);
                0qQ.A0B(num3, 19);
                0qQ.A0B(num4, 25);
                A0r.add(new NotesPogThoughtBubbleUiState(noteCustomTheme, imageUrl3, imageUrl2, noteTextContent, user, num2, num, num3, num4, l, str2, str3, str4, str5, str6, str7, str8, str9, list2, list3, i2, i3, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16));
            }
            A1H.addAll(A0r);
            if (!z2 && 182.A06(0Tu.A05, userSession, 36323161192606637L)) {
                String str10 = gmw2.A06;
                Integer num5 = AnonymousClass05K.A01;
                A1H.add(0, C54897HXf.A00(noteTextStringLiteralContent, A002, num5, num5, str10, moduleName, gmw2.A05, gmw2.A07, (String) null, 0sn.A00, i, z, false, false, false, false, false));
            }
            ContentNotesOverflowFragmentUiState contentNotesOverflowFragmentUiState = new ContentNotesOverflowFragmentUiState(gmw2.A06, 0jo.A1I(A1H));
            AnonymousClass4GS r0 = gwL2.A02;
            Integer num6 = null;
            if (r0 != null) {
                str = r0.All();
                num6 = r0.Als();
            } else {
                str = null;
            }
            Bundle A0a = AnonymousClass7TE.A0a();
            C54157H1b h1b = new C54157H1b();
            DbU.A1D(A0a, userSession);
            A0a.putParcelable("notes", contentNotesOverflowFragmentUiState);
            A0a.putString("carousel_child_id", str);
            if (num6 != null) {
                A0a.putInt(AnonymousClass000.A00(69), num6.intValue());
            }
            h1b.setArguments(A0a);
            gwL2.A0A.DVn(h1b, h1b);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r39) {
        /*
            r38 = this;
            r19 = 0
            r8 = r39
            r0 = r19
            X.0qQ.A0B(r8, r0)
            X.GMQ r18 = X.GMP.A00(r8)
            r9 = r38
            boolean r0 = r9.A0B
            r17 = r0
            r1 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r17 != 0) goto L_0x001c
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x001c:
            X.2V5 r15 = X.C51968G9o.A0Z(r8, r1)
            X.2V5 r14 = X.C247343gB.A00(r8, r0)
            X.2V5 r13 = X.C247343gB.A00(r8, r0)
            X.2V5 r26 = X.C247343gB.A00(r8, r0)
            X.2V5 r27 = X.C247343gB.A00(r8, r0)
            long r0 = r9.A07
            r2 = 10
            X.I84 r5 = new X.I84
            r5.<init>((X.2V5) r15, (int) r2)
            r7 = 11
            X.I84 r4 = new X.I84
            r4.<init>((X.2V5) r14, (int) r7)
            r2 = 12
            X.I84 r3 = new X.I84
            r3.<init>((X.2V5) r13, (int) r2)
            boolean r2 = r9.A0D
            com.instagram.common.session.UserSession r12 = r9.A01
            r29 = r4
            r30 = r3
            r31 = r12
            r32 = r0
            r34 = r2
            r28 = r5
            X.JwM r0 = X.GMR.A03(r28, r29, r30, r31, r32, r34)
            java.lang.Object r6 = r0.A00
            android.animation.Animator r6 = (android.animation.Animator) r6
            java.lang.Object r5 = r0.A01
            android.animation.Animator r5 = (android.animation.Animator) r5
            java.lang.Object r4 = r0.A02
            android.animation.Animator r4 = (android.animation.Animator) r4
            X.IPs r3 = X.C57129IPs.A00
            X.Gmw r2 = r9.A00
            X.JLq r1 = r9.A03
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.GMm r0 = X.C52296GMm.A00
            boolean r0 = r1.equals(r0)
            r16 = 1
            if (r0 != 0) goto L_0x008a
            boolean r0 = r1 instanceof X.GMT
            if (r0 != 0) goto L_0x008c
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x008a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008a:
            r16 = 0
        L_0x008c:
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r12}
            r10 = 44
            X.GNG r0 = new X.GNG
            r0.<init>(r10, r8, r9)
            java.lang.Object r10 = X.AnonymousClass3Zw.A00(r8, r0, r11)
            X.GMY r20 = X.GMY.A00
            boolean r0 = r9.A0C
            r22 = r0
            boolean r36 = r1.equals(r3)
            X.9Ib r0 = r9.A08
            r21 = r0
            java.lang.String r11 = r2.A06
            java.lang.String r0 = "overflow_component"
            java.lang.String r32 = X.002.A0R(r11, r0)
            r0 = 0
            X.GPI r33 = X.GPI.A00
            r24 = r21
            r25 = r15
            r28 = r14
            r29 = r13
            r30 = r12
            r31 = r3
            r34 = r17
            r35 = r22
            r37 = r19
            r21 = r6
            r22 = r5
            r23 = r4
            X.2WX r4 = r20.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r3 = 2131956653(0x7f1313ad, float:1.9549868E38)
            X.2WX r6 = X.C51973G9u.A0U(r4, r8, r3)
            android.content.Context r3 = X.C243803a8.A00(r8)
            boolean r3 = X.2eO.A00(r3)
            X.3XV r11 = X.2WX.A02
            if (r3 == 0) goto L_0x0143
            X.MMv r5 = new X.MMv
            r5.<init>(r7, r8, r9)
            java.lang.Integer r3 = X.AnonymousClass05K.A1F
        L_0x00ea:
            r7 = 4
            X.2WX r3 = X.C51971G9r.A0Y(r0, r3, r5, r7)
            X.2WX r6 = r6.A00(r3)
            r3 = 0
            if (r16 == 0) goto L_0x0109
            r3 = 0
            X.2WX r5 = X.C52112GFg.A01(r11, r3)
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r19)
            X.9JS r3 = X.C51965G9l.A0d(r4, r3, r7)
            X.2WX r3 = X.C51965G9l.A0X(r5, r3)
        L_0x0109:
            X.2WX r6 = r6.A00(r3)
            r3 = 16
            X.Iwa r5 = new X.Iwa
            r5.<init>(r9, r3)
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            X.3at r3 = new X.3at
            r3.<init>(r4, r5, r0)
            if (r6 != r11) goto L_0x011e
            r6 = r0
        L_0x011e:
            X.2WX r3 = X.C51965G9l.A0X(r6, r3)
            X.2WX r0 = r9.A09
            X.2WX r5 = r3.A00(r0)
            X.2Wb r4 = X.C51972G9s.A0Q(r8)
            X.4DU r3 = r9.A05
            boolean r0 = r1 instanceof X.C57129IPs
            if (r0 == 0) goto L_0x0140
            java.lang.Object r1 = r2.A03
        L_0x0134:
            X.JwI r1 = (X.C61080JwI) r1
            X.Gry r0 = new X.Gry
            r0.<init>(r1, r3)
            X.2Tl r0 = X.C51967G9n.A0N(r0, r4, r8, r5)
            return r0
        L_0x0140:
            java.lang.Object r1 = r2.A02
            goto L_0x0134
        L_0x0143:
            r4 = 16
            X.J6W r5 = new X.J6W
            r3 = r18
            r5.<init>(r4, r3, r10, r9)
            java.lang.Integer r3 = X.AnonymousClass05K.A04
            goto L_0x00ea
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53915GwL.A0X(X.3Y5):X.3mp");
    }
}
