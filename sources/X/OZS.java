package X;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;

public final class OZS {
    public View A00;
    public final Context A01;
    public final ViewGroup A02;
    public final IGAIAgentType A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final AnonymousClass7LD A06;
    public final AnonymousClass9HO A07;
    public final AnonymousClass9HC A08;
    public final AnonymousClass7LQ A09;
    public final AnonymousClass7L2 A0A;
    public final C40478Acn A0B;
    public final boolean A0C;
    public final C262224Cq A0D;

    public static final void A01(Context context, View view) {
        view.measure(0, 0);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.direct_text_message_text_view);
        int measuredWidth = (A0d.getMeasuredWidth() - A0d.getCompoundPaddingLeft()) - A0d.getCompoundPaddingRight();
        A0d.setText(DbS.A0C(C252993q2.A00(C66580MXl.A0D(A0d.getText()), new 0rN(Layout.Alignment.ALIGN_NORMAL, A0d.getPaint(), (String) null, A0d.getLineSpacingExtra(), A0d.getLineSpacingMultiplier(), measuredWidth, false), "…", (int) ((((double) AnonymousClass0nB.A00(context)) * 0.4d) / ((double) A0d.getLineHeight())))));
    }

    public static View A00(C232262tL r2, C327997Da r3, OZS ozs) {
        AnonymousClass7EZ A012 = r3.createViewHolder(ozs.A06.A00, ozs.A02);
        0qQ.A07(A012);
        r3.bind(r2, A012);
        View view = A012.itemView;
        0qQ.A06(view);
        return view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: com.instagram.ui.widget.framelayout.MediaFrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: com.instagram.ui.widget.framelayout.MediaFrameLayout} */
    /* JADX WARNING: type inference failed for: r7v3, types: [X.P7k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.74r, X.7Da] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A02() {
        /*
            r29 = this;
            r0 = r29
            X.7LQ r3 = r0.A09
            X.3su r1 = r3.A0e
            X.2FW r4 = r1.A10
            X.0qQ.A07(r4)
            X.O03 r2 = X.O03.$redex_init_class
            int r2 = r4.ordinal()
            switch(r2) {
                case 2: goto L_0x0028;
                case 3: goto L_0x006e;
                case 11: goto L_0x0028;
                case 14: goto L_0x015a;
                case 20: goto L_0x0106;
                case 21: goto L_0x0106;
                case 57: goto L_0x01cd;
                case 69: goto L_0x00b7;
                case 96: goto L_0x0028;
                default: goto L_0x0014;
            }
        L_0x0014:
            X.0wj r2 = X.0wj.A01
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unknown message type for share message to story: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r4, r0, r1)
            r0 = 20134884(0x1333be4, float:3.2920077E-38)
            X.DbT.A1Q(r2, r1, r0)
            r11 = 0
            return r11
        L_0x0028:
            X.Acn r6 = r0.A0B
            X.9HC r10 = r0.A08
            X.0iw r2 = r0.A04
            X.7DQ r5 = X.C395129zG.A00(r2, r10)
            java.util.List r4 = java.util.Collections.emptyList()
            X.768 r2 = new X.768
            r2.<init>(r6, r10, r4)
            X.76L r9 = new X.76L
            r9.<init>(r5, r2)
            java.lang.String r8 = r1.A0h()
            android.content.Context r7 = r0.A01
            com.instagram.common.session.UserSession r6 = r0.A05
            X.7L2 r5 = r0.A0A
            com.instagram.api.schemas.IGAIAgentType r2 = r0.A03
            X.9HO r1 = r0.A07
            r11 = r7
            r12 = r6
            r13 = r1
            r14 = r10
            r15 = r3
            r16 = r5
            X.79c r4 = X.AnonymousClass79S.A02(r11, r12, r13, r14, r15, r16)
            X.7Fl r2 = X.AnonymousClass7FX.A02(r7, r2, r6, r3, r5)
            X.748 r1 = new X.748
            r1.<init>(r2, r4, r8)
            android.view.View r11 = A00(r1, r9, r0)
            A01(r7, r11)
            r1 = 2131431794(0x7f0b1172, float:1.8485327E38)
            goto L_0x01c6
        L_0x006e:
            android.content.Context r9 = r0.A01
            com.instagram.common.session.UserSession r8 = r0.A05
            X.Acn r2 = r0.A0B
            X.9HC r7 = r0.A08
            X.0iw r4 = r0.A04
            X.7DQ r12 = X.C395129zG.A00(r4, r7)
            r10 = r4
            r11 = r8
            r13 = r2
            r14 = r7
            X.77Q r6 = X.AnonymousClass77J.A00(r9, r10, r11, r12, r13, r14)
            java.lang.String r5 = r1.A0h()
            X.Md6 r10 = X.Md8.A05
            X.7L2 r2 = r0.A0A
            r11 = r9
            r12 = r4
            r13 = r8
            r15 = r3
            r16 = r2
            X.Mcv r4 = r10.A00(r11, r12, r13, r14, r15, r16)
            com.instagram.api.schemas.IGAIAgentType r1 = r0.A03
            X.7Fl r2 = X.AnonymousClass7FX.A02(r9, r1, r8, r3, r2)
            X.Md9 r1 = new X.Md9
            r1.<init>(r2, r4, r5)
            android.view.View r11 = A00(r1, r6, r0)
            r1 = 2131435895(0x7f0b2177, float:1.8493645E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r11, r1)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r2 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r2
            boolean r1 = r0.A0C
            if (r1 == 0) goto L_0x01ca
            r1 = 1
            r2.A03 = r1
            goto L_0x01ca
        L_0x00b7:
            android.content.Context r7 = r0.A01
            com.instagram.common.session.UserSession r9 = r0.A05
            X.0iw r8 = r0.A04
            X.Acn r11 = r0.A0B
            X.9HC r12 = r0.A08
            r10 = 0
            X.NOm r4 = X.C70037NwF.A00(r7, r8, r9, r10, r11, r12)
            java.lang.String r6 = r1.A0h()
            r2 = 3
            X.76s r13 = new X.76s
            r13.<init>(r10, r10, r10, r2)
            X.7L2 r2 = r0.A0A
            X.7FE r16 = X.C66582MXn.A0U(r9, r12, r3, r2, r1)
            r14 = r7
            r15 = r9
            r17 = r12
            r18 = r3
            X.7Fr r5 = r13.A01(r14, r15, r16, r17, r18)
            com.instagram.api.schemas.IGAIAgentType r1 = r0.A03
            X.7Fl r2 = X.AnonymousClass7FX.A02(r7, r1, r9, r3, r2)
            X.741 r1 = new X.741
            r1.<init>(r2, r5, r6)
            X.N6K r3 = new X.N6K
            r3.<init>(r1)
            android.view.ViewGroup r2 = r0.A02
            X.7LD r1 = r0.A06
            android.view.LayoutInflater r1 = r1.A00
            X.Myr r1 = r4.createViewHolder(r1, r2)
            r4.bind(r1, r3)
            android.view.View r11 = X.JTO.A0F(r1)
            r1 = 2131437847(0x7f0b2917, float:1.8497604E38)
            goto L_0x01c6
        L_0x0106:
            X.Acn r12 = r0.A0B
            X.9HC r13 = r0.A08
            X.0iw r9 = r0.A04
            X.7DQ r11 = X.C395129zG.A00(r9, r13)
            com.instagram.common.session.UserSession r10 = r0.A05
            r14 = 0
            r15 = 0
            X.74O r6 = X.AnonymousClass74O.A00(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r5 = r1.A0h()
            r2 = 3
            X.76s r9 = new X.76s
            r9.<init>(r14, r14, r14, r2)
            android.content.Context r8 = r0.A01
            X.7L2 r7 = r0.A0A
            r4 = 41
            X.Ple r2 = new X.Ple
            r2.<init>(r0, r4)
            X.0t0 r17 = X.AnonymousClass0eN.A01(r2)
            X.2FW r1 = r1.A10
            r12 = r10
            r14 = r3
            r15 = r7
            r16 = r1
            X.7FE r15 = X.AnonymousClass7FD.A04(r12, r13, r14, r15, r16, r17)
            r14 = r10
            r16 = r13
            r17 = r3
            r13 = r8
            r12 = r9
            X.7Fr r4 = r12.A01(r13, r14, r15, r16, r17)
            com.instagram.api.schemas.IGAIAgentType r1 = r0.A03
            X.7Fl r2 = X.AnonymousClass7FX.A02(r8, r1, r10, r3, r7)
            X.741 r1 = new X.741
            r1.<init>(r2, r4, r5)
            android.view.View r11 = A00(r1, r6, r0)
            r1 = 2131436183(0x7f0b2297, float:1.849423E38)
            goto L_0x01c6
        L_0x015a:
            X.9HC r9 = r0.A08
            X.0iw r2 = r0.A04
            X.7DQ r6 = X.C395129zG.A00(r2, r9)
            X.Acn r4 = r0.A0B
            com.instagram.common.session.UserSession r5 = r0.A05
            r18 = 0
            r13 = 0
            r20 = 1
            X.74o r2 = new X.74o
            r17 = r9
            r19 = r13
            r14 = r2
            r15 = r5
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.74r r4 = new X.74r
            r4.<init>(r6, r2)
            java.lang.String r6 = r1.A0h()
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r7 = r0.A01
            X.7L2 r10 = r0.A0A
            int r1 = r10.A01
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r7, r1)
            X.2FW r11 = X.2FW.A1k
            X.Pjp r1 = X.C73790Pjp.A00
            X.0t0 r12 = X.AnonymousClass0eN.A01(r1)
            X.7FE r8 = new X.7FE
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.7Fq r2 = X.Md5.A00(r2, r5, r8, r9, r3)
            com.instagram.api.schemas.IGAIAgentType r1 = r0.A03
            X.7Fl r1 = X.AnonymousClass7FX.A02(r7, r1, r5, r3, r10)
            X.MdA r3 = new X.MdA
            r3.<init>(r1, r2, r6)
            android.view.ViewGroup r2 = r0.A02
            X.7LD r1 = r0.A06
            android.view.LayoutInflater r1 = r1.A00
            X.7EZ r1 = r4.createViewHolder(r1, r2)
            r4.bind(r1, r3)
            android.view.View r11 = X.JTO.A0F(r1)
            r1 = 2131436196(0x7f0b22a4, float:1.8494256E38)
        L_0x01c6:
            android.view.View r2 = r11.findViewById(r1)
        L_0x01ca:
            r0.A00 = r2
            return r11
        L_0x01cd:
            X.9HC r15 = r0.A08
            r11 = 0
            X.7D1 r9 = new X.7D1
            r9.<init>(r11, r15)
            X.0iw r7 = r0.A04
            X.Acn r6 = r0.A0B
            com.instagram.common.session.UserSession r4 = r0.A05
            X.7D3 r8 = new X.7D3
            r8.<init>(r7, r4, r6)
            android.content.Context r2 = r0.A01
            X.7B9 r13 = new X.7B9
            r13.<init>(r2, r6)
            r5 = 0
            X.7BA r10 = new X.7BA
            r12 = r11
            r14 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r21 = r11
            r23 = r11
            r24 = r11
            r25 = r11
            r26 = r11
            r27 = r11
            r28 = r5
            r20 = r9
            r22 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.17i r13 = X.17h.A00(r4)
            boolean r8 = r1.A1Q()
            if (r8 == 0) goto L_0x0280
            X.A8K r16 = X.C68848NZg.A00
            r17 = r7
            r18 = r4
            r19 = r10
            r20 = r6
            r21 = r15
            r22 = r11
            r23 = r5
            X.NZg r6 = r16.A00(r17, r18, r19, r20, r21, r22, r23)
            X.9HO r1 = r0.A07
            X.7Am r11 = new X.7Am
            r11.<init>(r1)
            X.P6w r10 = new X.P6w
            r10.<init>()
            X.P5e r9 = new X.P5e
            r9.<init>(r11)
            X.P5Q r8 = new X.P5Q
            r8.<init>(r11, r5)
            r7 = 1
            X.MdU r1 = new X.MdU
            r1.<init>(r11, r7)
            X.7AO r7 = X.C66583MXo.A0T(r1, r8, r9, r10)
            X.7L2 r1 = r0.A0A
            r8 = r2
            r9 = r4
            r10 = r15
            r11 = r3
            r12 = r1
            r14 = r5
            X.2tL r4 = r7.AWb(r8, r9, r10, r11, r12, r13, r14)
            X.N7t r4 = (X.C68256N7t) r4
            android.view.ViewGroup r3 = r0.A02
            X.7LD r1 = r0.A06
            android.view.LayoutInflater r1 = r1.A00
            X.7AS r1 = r6.createViewHolder(r1, r3)
            X.0qQ.A0A(r4)
            r6.bind(r1, r4)
            android.view.View r11 = X.JTO.A0F(r1)
            r1 = 2131436247(0x7f0b22d7, float:1.849436E38)
            android.view.View r1 = r11.findViewById(r1)
            X.AnonymousClass7TH.A0R(r1)
            A01(r2, r11)
            r1 = 2131431794(0x7f0b1172, float:1.8485327E38)
            android.view.View r1 = r11.findViewById(r1)
            r0.A00 = r1
            return r11
        L_0x0280:
            X.7CR r9 = X.AnonymousClass7CQ.A01
            boolean r8 = r9.A04(r1)
            if (r8 == 0) goto L_0x02c8
            X.7D1 r8 = new X.7D1
            r8.<init>(r11, r15)
            X.7Bn r1 = new X.7Bn
            r1.<init>(r8)
            r8 = r2
            r9 = r7
            r10 = r4
            r12 = r1
            r13 = r6
            r14 = r15
            X.NY4 r6 = X.C70040NwI.A00(r8, r9, r10, r11, r12, r13, r14)
            X.P7k r7 = new X.P7k
            r7.<init>()
            X.17i r13 = X.17h.A00(r4)
            X.7L2 r1 = r0.A0A
            r9 = r4
            r10 = r15
            r11 = r3
            r12 = r1
            r14 = r5
            X.N6Z r1 = r7.AWb(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r11 = A00(r1, r6, r0)
            r1 = 2131438802(0x7f0b2cd2, float:1.8499541E38)
        L_0x02b7:
            android.view.View r1 = r11.findViewById(r1)
            r0.A00 = r1
            r0 = 2131436247(0x7f0b22d7, float:1.849436E38)
            android.view.View r0 = r11.findViewById(r0)
            X.AnonymousClass7TH.A0R(r0)
            return r11
        L_0x02c8:
            boolean r8 = r9.A05(r1)
            if (r8 == 0) goto L_0x033f
            X.7D1 r8 = new X.7D1
            r8.<init>(r11, r15)
            X.7D3 r1 = new X.7D3
            r1.<init>(r7, r4, r6)
            X.7B9 r13 = new X.7B9
            r13.<init>(r2, r6)
            X.7BA r10 = new X.7BA
            r20 = r8
            r22 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.NYy r6 = X.C70042NwK.A00(r7, r10, r6, r15)
            X.9HO r1 = r0.A07
            X.7Am r10 = new X.7Am
            r10.<init>(r1)
            X.P6u r20 = new X.P6u
            r20.<init>()
            X.7B2 r9 = r10.A0B
            r1 = 1
            X.P5Q r8 = new X.P5Q
            r8.<init>(r10, r1)
            r7 = 3
            X.MdU r1 = new X.MdU
            r1.<init>(r10, r7)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r5)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r5)
            X.7AO r7 = new X.7AO
            r17 = r1
            r18 = r8
            r19 = r9
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.17i r13 = X.17h.A00(r4)
            X.7L2 r1 = r0.A0A
            r8 = r2
            r9 = r4
            r10 = r15
            r11 = r3
            r12 = r1
            r14 = r5
            X.2tL r3 = r7.AWb(r8, r9, r10, r11, r12, r13, r14)
            android.view.ViewGroup r2 = r0.A02
            X.7LD r1 = r0.A06
            android.view.LayoutInflater r1 = r1.A00
            X.7AS r1 = r6.createViewHolder(r1, r2)
            r6.bind(r3, r1)
            android.view.View r11 = X.JTO.A0F(r1)
            r1 = 2131436177(0x7f0b2291, float:1.8494217E38)
            goto L_0x02b7
        L_0x033f:
            X.2FW r3 = r1.A10
            X.0qQ.A07(r3)
            X.0wj r2 = X.0wj.A01
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unknown message type for share message to story: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            r0 = 20134884(0x1333be4, float:3.2920077E-38)
            X.DbT.A1Q(r2, r1, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZS.A02():android.view.View");
    }

    public OZS(Context context, ViewGroup viewGroup, IGAIAgentType iGAIAgentType, AnonymousClass0iw r6, UserSession userSession, AnonymousClass7LD r8, AnonymousClass9HC r9, AnonymousClass7LQ r10, AnonymousClass7L2 r11, C262224Cq r12, boolean z) {
        this.A01 = context;
        this.A05 = userSession;
        this.A09 = r10;
        this.A08 = r9;
        this.A02 = viewGroup;
        this.A06 = r8;
        this.A0A = r11;
        this.A04 = r6;
        this.A0C = z;
        this.A0D = r12;
        this.A03 = iGAIAgentType;
        this.A0B = new C40478Acn(userSession, r12);
        Context context2 = C60960kU.A00;
        0qQ.A07(context2);
        this.A07 = new AnonymousClass9HO(C73918Ply.A01(context2, 28));
    }
}
