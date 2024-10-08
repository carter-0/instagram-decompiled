package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class NJm extends AnonymousClass4DH implements C74470PvQ, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ThreadDetailsPrivacyAndSafetyFragment";
    public Context A00;
    public RecyclerView A01;
    public C74449Pv4 A02;
    public NL8 A03;
    public N4P A04;
    public 0wc A05;
    public Capabilities A06;
    public C66965Mfy A07;
    public C254793t3 A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final 27S A0B = new Ot0(this, 5);
    public final 1wn A0C = C71932OtG.A00(this, 22);
    public final 1a8 A0D = C66580MXl.A0O();
    public final C358618bC A0E = new C72739PHt(this, 7);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = DbZ.A0F(view, R.id.recycler_view);
        this.A03 = new NL8(requireContext());
        if (this.A01 == null) {
            DbT.A1Q(0wj.A01, "ThreadDetailsPrivacyAndSafetyFragment - recycler view is null", 20134884);
        }
        RecyclerView recyclerView = this.A01;
        String str = "recyclerView";
        if (recyclerView != null) {
            DbU.A15(getContext(), recyclerView, 1, false);
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.A03);
                1a8 r2 = this.A0D;
                C74449Pv4 pv4 = this.A02;
                if (pv4 != null) {
                    PU8.A00(pv4.BNa().APA(), r2, this, 38);
                    C74449Pv4 pv42 = this.A02;
                    if (pv42 != null) {
                        C74550Pwj.A00(pv42);
                        return;
                    }
                }
                str = "clientInfra";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: X.NJm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v8, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: X.0iw} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x037e, code lost:
        if (r4 != false) goto L_0x0380;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0276, code lost:
        if (X.182.A06(r8, X.DbT.A0X(r14), 36325055273120334L) == false) goto L_0x0278;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.NJm r38) {
        /*
            r0 = r38
            X.N4P r3 = r0.A04
            if (r3 == 0) goto L_0x03e6
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x03e6
            androidx.fragment.app.FragmentActivity r12 = r0.getActivity()
            if (r12 == 0) goto L_0x03e6
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.3t3 r4 = r3.A0L
            r6 = 0
            X.0qQ.A0B(r4, r6)
            boolean r5 = r4 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            boolean r4 = r3.A0m
            if (r5 != 0) goto L_0x0024
            if (r4 == 0) goto L_0x0050
        L_0x0024:
            X.0eM r4 = r0.A0A
            X.0lg r8 = X.DbT.A0X(r4)
            X.0Tu r7 = X.0Tu.A06
            r4 = 36318389483870314(0x8107620000186a, double:3.0312339797912496E-306)
            boolean r4 = X.182.A06(r7, r8, r4)
            if (r4 == 0) goto L_0x0050
            r8 = 2131953180(0x7f13061c, float:1.9542824E38)
            r7 = 2131964884(0x7f1333d4, float:1.9566562E38)
            r4 = 2131963729(0x7f132f51, float:1.956422E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r1, r4)
            X.N3x r4 = new X.N3x
            r4.<init>(r8, r7, r5)
            java.util.List r4 = X.AnonymousClass7TE.A1I(r4)
            r2.addAll(r4)
        L_0x0050:
            X.0eM r5 = r3.A0c
            java.util.List r4 = X.JTO.A15(r5)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0105
            java.util.List r4 = X.JTO.A15(r5)
            java.lang.Object r9 = r4.get(r6)
            X.N9q r9 = (X.C68303N9q) r9
            com.instagram.user.model.User r5 = r9.A00
            java.lang.String r4 = r5.getUsername()
            X.DfA r8 = new X.DfA
            r8.<init>((java.lang.CharSequence) r4)
            X.0eM r7 = r0.A0A
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r15 = r5.getId()
            X.P2w r10 = new X.P2w
            r11 = r1
            r14 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            java.util.List r4 = X.AnonymousClass7TE.A1I(r10)
            A01(r8, r2, r4)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r7)
            r11 = 1
            X.0qQ.A0B(r13, r11)
            boolean r4 = X.DcS.A00(r13, r6)
            if (r4 == 0) goto L_0x0105
            X.FYl r4 = X.C69864NtS.A00(r13)
            java.lang.Boolean r14 = r4.A01
            java.lang.Boolean r10 = r4.A02
            if (r14 == 0) goto L_0x0105
            if (r10 == 0) goto L_0x0105
            r4 = 2131975289(0x7f135c79, float:1.9587666E38)
            java.lang.String r7 = r1.getString(r4)
            r4 = 2131975290(0x7f135c7a, float:1.9587668E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r4)
            X.PR7 r8 = new X.PR7
            r8.<init>(r7, r4)
            X.0qq r7 = X.AnonymousClass0qo.A00(r1)
            X.0qm r4 = X.0qm.A13
            android.graphics.Typeface r4 = r7.A02(r4)
            r8.A01 = r4
            int r4 = X.2Yu.A0D(r1)
            int r4 = r1.getColor(r4)
            r8.A00 = r4
            r7 = 62
            X.Ok4 r4 = new X.Ok4
            r4.<init>(r7, r1, r13)
            r8.A03 = r4
            r2.add(r8)
            boolean r14 = r14.booleanValue()
            boolean r10 = r10.booleanValue()
            if (r14 == 0) goto L_0x03cb
            r4 = 2131975287(0x7f135c77, float:1.9587662E38)
            java.lang.String r8 = X.DbY.A0b(r1, r5, r4)
        L_0x00e9:
            X.0qQ.A0A(r8)
            r4 = 2131975288(0x7f135c78, float:1.9587664E38)
            java.lang.String r7 = r1.getString(r4)
            r4 = 5
            X.Ol0 r5 = new X.Ol0
            r5.<init>(r4, r13, r9)
            X.PR9 r4 = new X.PR9
            r4.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r5, (java.lang.CharSequence) r7, (java.lang.CharSequence) r8, (boolean) r10)
            if (r14 != 0) goto L_0x0102
            r4.A0E = r11
        L_0x0102:
            r2.add(r4)
        L_0x0105:
            r5 = 2131959014(0x7f131ce6, float:1.9554656E38)
            X.DfA r4 = new X.DfA
            r4.<init>((int) r5)
            X.0eM r14 = r0.A0A
            com.instagram.common.session.UserSession r30 = X.AnonymousClass7TE.A0l(r14)
            X.OJg r5 = new X.OJg
            r5.<init>(r0)
            X.P2y r27 = new X.P2y
            r28 = r1
            r29 = r12
            r31 = r5
            r32 = r3
            r27.<init>(r28, r29, r30, r31, r32)
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r14)
            com.instagram.direct.capabilities.Capabilities r9 = r0.A06
            java.lang.String r18 = "threadCapabilities"
            if (r9 == 0) goto L_0x03c6
            X.Pv4 r8 = r0.A02
            if (r8 != 0) goto L_0x013d
            java.lang.String r4 = "clientInfra"
        L_0x0135:
            X.0qQ.A0F(r4)
        L_0x0138:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x013d:
            X.0wc r7 = r0.A05
            java.lang.String r17 = "typedLogger"
            if (r7 == 0) goto L_0x03c1
            X.8bC r5 = r0.A0E
            X.P2r r19 = new X.P2r
            r20 = r1
            r21 = r7
            r23 = r9
            r24 = r8
            r25 = r3
            r26 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r7 = 1
            com.instagram.common.session.UserSession r23 = X.AnonymousClass7TE.A0l(r14)
            com.instagram.direct.capabilities.Capabilities r5 = r0.A06
            if (r5 == 0) goto L_0x03c6
            X.1Av r26 = X.DbX.A0h(r14)
            X.P2i r20 = new X.P2i
            r21 = r1
            r22 = r12
            r24 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r11 = 2
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r14)
            X.P2b r30 = new X.P2b
            r21 = r30
            r22 = r1
            r23 = r12
            r24 = r0
            r26 = r3
            r21.<init>(r22, r23, r24, r25, r26)
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r14)
            X.1a8 r15 = r0.A0D
            X.P2a r31 = new X.P2a
            r21 = r31
            r23 = r15
            r25 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r14)
            X.P2U r10 = new X.P2U
            r10.<init>(r1, r12, r5, r3)
            com.instagram.common.session.UserSession r35 = X.AnonymousClass7TE.A0l(r14)
            X.Q2C r8 = X.Q2C.A03
            if (r8 != 0) goto L_0x01ab
            X.Q2C r8 = new X.Q2C
            r8.<init>(r1)
            X.Q2C.A03 = r8
        L_0x01ab:
            r9 = 9
            X.Pla r5 = new X.Pla
            r5.<init>(r0, r9)
            X.P2x r33 = new X.P2x
            r34 = r0
            r36 = r8
            r37 = r3
            r38 = r5
            r33.<init>(r34, r35, r36, r37, r38)
            r28 = r19
            r29 = r20
            r32 = r10
            X.PuA[] r5 = new X.C74394PuA[]{r27, r28, r29, r30, r31, r32, r33}
            java.util.List r5 = X.0sr.A1P(r5)
            A01(r4, r2, r5)
            r4 = 2131959012(0x7f131ce4, float:1.9554652E38)
            X.DfA r9 = new X.DfA
            r9.<init>((int) r4)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r14)
            X.0wc r4 = r0.A05
            if (r4 == 0) goto L_0x03c1
            X.P2X r8 = new X.P2X
            r8.<init>(r1, r4, r5, r3)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r14)
            X.P2O r4 = new X.P2O
            r4.<init>(r5, r3)
            X.PuA[] r4 = new X.C74394PuA[]{r8, r4}
            java.util.List r4 = X.0sr.A1P(r4)
            A01(r9, r2, r4)
            X.0lg r9 = X.DbT.A0X(r14)
            X.0Tu r8 = X.0Tu.A05
            r4 = 36314910560816009(0x81043800070b89, double:3.0290338948432084E-306)
            boolean r16 = X.182.A06(r8, r9, r4)
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            if (r16 != 0) goto L_0x0257
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r14)
            com.instagram.direct.capabilities.Capabilities r13 = r0.A06
            if (r13 == 0) goto L_0x03c6
            X.0wc r9 = r0.A05
            if (r9 == 0) goto L_0x03c1
            X.0gy r22 = X.AnonymousClass07i.A00(r0)
            X.Mfy r5 = r0.A07
            java.lang.String r4 = "restrictController"
            if (r5 == 0) goto L_0x0135
            X.P2v r4 = new X.P2v
            r26 = r13
            r27 = r5
            r28 = r3
            r29 = r5
            r20 = r1
            r21 = r12
            r23 = r0
            r24 = r9
            r19 = r4
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.instagram.common.session.UserSession r24 = X.C66581MXm.A0R(r4, r10, r14)
            com.instagram.direct.capabilities.Capabilities r5 = r0.A06
            if (r5 == 0) goto L_0x03c6
            X.P2p r4 = new X.P2p
            r19 = r4
            r20 = r0
            r22 = r0
            r23 = r15
            r25 = r5
            r26 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r10.add(r4)
        L_0x0257:
            r5 = 2131959013(0x7f131ce5, float:1.9554654E38)
            X.DfA r4 = new X.DfA
            r4.<init>((int) r5)
            A01(r4, r2, r10)
            boolean r4 = X.N4P.A05(r3)
            if (r4 == 0) goto L_0x0278
            X.0lg r9 = X.DbT.A0X(r14)
            r4 = 36325055273120334(0x810d720000324e, double:3.035449451753941E-306)
            boolean r5 = X.182.A06(r8, r9, r4)
            r4 = 1
            if (r5 != 0) goto L_0x0279
        L_0x0278:
            r4 = 0
        L_0x0279:
            java.lang.String r13 = "directThemedContext"
            if (r16 != 0) goto L_0x037e
            if (r4 != 0) goto L_0x0380
            r5 = 2131959015(0x7f131ce7, float:1.9554658E38)
            X.DfA r4 = new X.DfA
            r4.<init>((int) r5)
            X.PuA[] r5 = new X.C74394PuA[r11]
            android.content.Context r10 = r0.A00
            if (r10 == 0) goto L_0x03bc
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r14)
            com.instagram.direct.capabilities.Capabilities r9 = r0.A06
            if (r9 == 0) goto L_0x03c6
            boolean r8 = r0.A09
            X.P2t r19 = new X.P2t
            r20 = r10
            r21 = r12
            r22 = r0
            r25 = r9
            r27 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r5[r6] = r19
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r14)
            X.P2g r19 = new X.P2g
            r20 = r1
            r23 = r3
            r24 = r6
            r19.<init>(r20, r21, r22, r23, r24)
        L_0x02b7:
            r5[r7] = r19
            java.util.List r5 = X.0sr.A1P(r5)
            A01(r4, r2, r5)
        L_0x02c0:
            r4 = 2131959010(0x7f131ce2, float:1.9554648E38)
            X.DfA r9 = new X.DfA
            r9.<init>((int) r4)
            android.content.Context r10 = r0.A00
            if (r10 == 0) goto L_0x03bc
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r14)
            com.instagram.direct.capabilities.Capabilities r4 = r0.A06
            if (r4 == 0) goto L_0x03c6
            X.P2W r5 = new X.P2W
            r5.<init>(r10, r8, r4, r3)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r14)
            X.P2g r4 = new X.P2g
            r10 = r4
            r11 = r1
            r14 = r3
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            X.PuA[] r1 = new X.C74394PuA[]{r5, r4}
            java.util.List r1 = X.0sr.A1P(r1)
            A01(r9, r2, r1)
            X.NL8 r5 = r0.A03
            if (r5 == 0) goto L_0x03df
            java.util.ArrayList r4 = r5.A08
            r4.clear()
            r4.addAll(r2)
            r5.clear()
            int r8 = r4.size()
            r3 = 0
        L_0x0305:
            if (r3 >= r8) goto L_0x03df
            java.lang.Object r2 = r4.get(r3)
            X.0qQ.A07(r2)
            boolean r1 = r2 instanceof X.C46448DfA
            if (r1 == 0) goto L_0x031c
            X.A5l r9 = r5.A03
            X.7fR r1 = r5.A04
        L_0x0316:
            r5.addModel(r2, r9, r1)
        L_0x0319:
            int r3 = r3 + 1
            goto L_0x0305
        L_0x031c:
            boolean r1 = r2 instanceof X.PR9
            if (r1 == 0) goto L_0x0326
            X.NLR r1 = r5.A06
        L_0x0322:
            r5.addModel(r2, r1)
            goto L_0x0319
        L_0x0326:
            boolean r1 = r2 instanceof X.C50989Fmc
            if (r1 == 0) goto L_0x0342
            boolean r10 = X.AnonymousClass7TF.A1Q(r3)
            int r1 = r4.size()
            int r1 = r1 - r7
            boolean r11 = X.AnonymousClass7TF.A1S(r3, r1)
            X.FAT r9 = new X.FAT
            r12 = r6
            r13 = r6
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            X.NLQ r1 = r5.A05
            goto L_0x0316
        L_0x0342:
            boolean r1 = r2 instanceof X.FGF
            if (r1 == 0) goto L_0x0349
            X.Mg4 r1 = r5.A07
            goto L_0x0322
        L_0x0349:
            boolean r1 = r2 instanceof X.C68182N3x
            if (r1 == 0) goto L_0x0357
            r1 = r2
            X.N3x r1 = (X.C68182N3x) r1
            int r1 = r1.A00
            if (r1 != r7) goto L_0x0357
            X.NLG r1 = r5.A01
            goto L_0x0322
        L_0x0357:
            r1 = 13
            boolean r1 = X.JV5.A01(r1, r2)
            if (r1 == 0) goto L_0x0362
            X.NLF r1 = r5.A00
            goto L_0x0322
        L_0x0362:
            boolean r1 = r2 instanceof X.PR7
            if (r1 == 0) goto L_0x03d4
            boolean r10 = X.AnonymousClass7TF.A1Q(r3)
            int r1 = r4.size()
            int r1 = r1 - r7
            boolean r11 = X.AnonymousClass7TF.A1S(r3, r1)
            X.FAT r9 = new X.FAT
            r12 = r6
            r13 = r6
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            X.NLJ r1 = r5.A02
            goto L_0x0316
        L_0x037e:
            if (r4 == 0) goto L_0x02c0
        L_0x0380:
            r5 = 2131972483(0x7f135183, float:1.9581975E38)
            X.DfA r4 = new X.DfA
            r4.<init>((int) r5)
            X.PuA[] r5 = new X.C74394PuA[r11]
            android.content.Context r10 = r0.A00
            if (r10 == 0) goto L_0x03bc
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r14)
            com.instagram.direct.capabilities.Capabilities r9 = r0.A06
            if (r9 == 0) goto L_0x03c6
            X.0wc r8 = r0.A05
            if (r8 == 0) goto L_0x03c1
            X.P2q r19 = new X.P2q
            r20 = r10
            r21 = r12
            r22 = r0
            r23 = r8
            r25 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r5[r6] = r19
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r14)
            X.P2g r19 = new X.P2g
            r20 = r1
            r23 = r3
            r24 = r7
            r19.<init>(r20, r21, r22, r23, r24)
            goto L_0x02b7
        L_0x03bc:
            X.0qQ.A0F(r13)
            goto L_0x0138
        L_0x03c1:
            X.0qQ.A0F(r17)
            goto L_0x0138
        L_0x03c6:
            X.0qQ.A0F(r18)
            goto L_0x0138
        L_0x03cb:
            r4 = 2131975286(0x7f135c76, float:1.958766E38)
            java.lang.String r8 = r1.getString(r4)
            goto L_0x00e9
        L_0x03d4:
            java.lang.String r1 = "invalid item type "
            java.lang.String r0 = X.C66581MXm.A0y(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x03df:
            X.NL8 r0 = r0.A03
            if (r0 == 0) goto L_0x03e6
            r0.notifyDataSetChanged()
        L_0x03e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJm.A00(X.NJm):void");
    }

    public final void CgA() {
        C74449Pv4 pv4 = this.A02;
        if (pv4 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C74550Pwj.A00(pv4);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public static final void A01(C46448DfA dfA, ArrayList arrayList, List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C74394PuA puA = (C74394PuA) it.next();
            if (puA.isEnabled()) {
                A1C.addAll(puA.getItems());
            }
        }
        if (DbT.A1b(A1C)) {
            arrayList.add(dfA);
            arrayList.addAll(A1C);
        }
    }

    public final void APp() {
        A00(this);
    }

    public final void Cfo() {
        DbX.A1I(this);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131959016);
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        Context context;
        String str;
        int A022 = AnonymousClass0fD.A02(1155096157);
        NJm.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Context requireContext = requireContext();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A06 = capabilities;
            C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A002 != null) {
                this.A08 = A002;
                this.A09 = requireArguments.getBoolean(AnonymousClass000.A00(429), false);
                int i2 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", 0);
                if (i2 != 0) {
                    context = new ContextThemeWrapper(requireContext, i2);
                } else {
                    context = requireContext;
                }
                this.A00 = context;
                AnonymousClass0eM r5 = this.A0A;
                this.A05 = DbW.A0J(DbT.A0X(r5), __redex_internal_original_name);
                UserSession A0l = AnonymousClass7TE.A0l(r5);
                C254793t3 r1 = this.A08;
                if (r1 == null) {
                    str = "threadId";
                } else {
                    Capabilities capabilities2 = this.A06;
                    if (capabilities2 == null) {
                        str = "threadCapabilities";
                    } else {
                        this.A02 = C330397Mp.A01(requireContext, A0l, capabilities2, r1);
                        C66965Mfy mfy = new C66965Mfy(AnonymousClass7TE.A0l(r5), this, (C231002qi) null);
                        this.A07 = mfy;
                        registerLifecycleListener(mfy);
                        C74449Pv4 pv4 = this.A02;
                        if (pv4 == null) {
                            str = "clientInfra";
                        } else {
                            C74550Pwj.A01(pv4);
                            AnonymousClass0fD.A09(1126365759, A022);
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalArgumentException = C66580MXl.A0p();
            i = 105514340;
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("threadCapabilities can't be null");
            i = 1490756647;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-580150304);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_privacy_safety_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-2091044266, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(131745429);
        super.onDestroy();
        C66965Mfy mfy = this.A07;
        if (mfy == null) {
            0qQ.A0F("restrictController");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(mfy);
        AnonymousClass0fD.A09(-1066806462, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2015308316);
        super.onDestroyView();
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter((2Rw) null);
        this.A03 = null;
        AnonymousClass0fD.A09(734064262, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1716684091);
        NJm.super.onPause();
        1Ng A0R = DbX.A0R(this.A0A);
        A0R.A02(this.A0C, 2Kd.class);
        A0R.A02(this.A0B, 27U.class);
        AnonymousClass0fD.A09(-442409296, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(703484576);
        super.onResume();
        1Ng A0R = DbX.A0R(this.A0A);
        A0R.A01(this.A0C, 2Kd.class);
        A0R.A01(this.A0B, 27U.class);
        AnonymousClass0fD.A09(-991577570, A022);
    }
}
