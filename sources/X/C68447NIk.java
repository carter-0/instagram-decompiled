package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.writewithai.PromptPills;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.List;

/* renamed from: X.NIk  reason: case insensitive filesystem */
public final class C68447NIk extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "WriteWithAIFragment";
    public int A00;
    public int A01 = -1;
    public int A02;
    public IgEditText A03;
    public IgTextView A04;
    public IgTextView A05;
    public C252213ok A06;
    public AnonymousClass3E6 A07;
    public AnonymousClass7I3 A08;
    public PromptPills A09;
    public RewriteTextBubbleViewPager A0A;
    public C70834ONg A0B;
    public C70614ODl A0C;
    public IgdsMediaButton A0D;
    public String A0E = "";
    public List A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final String A0L;
    public final AnonymousClass0eM A0M = C227642jf.A02(this);
    public final AnonymousClass0eM A0N;
    public final String A0O;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r2 = 0
            r4 = r23
            X.0qQ.A0B(r4, r2)
            r3 = r22
            r0 = r24
            super.onViewCreated(r4, r0)
            X.0eM r0 = r3.A0M
            r17 = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r17)
            X.7I3 r0 = new X.7I3
            r0.<init>(r1)
            r3.A08 = r0
            android.os.Bundle r5 = r3.mArguments
            if (r5 == 0) goto L_0x004e
            r0 = 1473(0x5c1, float:2.064E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r5.getBoolean(r0)
            r3.A0K = r0
            java.lang.String r0 = "arg_is_e2ee"
            boolean r0 = r5.getBoolean(r0)
            r3.A0J = r0
            r0 = 547(0x223, float:7.67E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r5.getString(r1, r0)
            r3.A0E = r0
            r0 = 1471(0x5bf, float:2.061E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r5.getBoolean(r0)
            r3.A0H = r0
        L_0x004e:
            android.os.Bundle r1 = r3.mArguments
            r6 = 0
            if (r1 == 0) goto L_0x0360
            r0 = 1472(0x5c0, float:2.063E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            int r0 = r1.getInt(r0)
        L_0x005d:
            r3.A00 = r0
            X.7I3 r0 = r3.A08
            if (r0 == 0) goto L_0x009a
            boolean r5 = r3.A0K
            boolean r10 = r3.A0J
            java.lang.String r9 = r3.A0E
            java.lang.String r8 = r3.A0L
            boolean r1 = r3.A0H
            X.0wc r0 = r0.A01
            X.1Ln r7 = X.1Ln.A0J(r0)
            X.XSV r5 = X.AnonymousClass7I3.A00(r10, r5)
            if (r1 == 0) goto L_0x035c
            X.Nml r1 = X.C69503Nml.A0K
        L_0x007b:
            boolean r0 = X.DbT.A1Y(r7)
            if (r0 == 0) goto L_0x009a
            r0 = 27
            r7.A0Z(r0)
            r0 = 1
            r7.A0X(r0)
            java.lang.String r0 = "entry_point"
            r7.A0M(r1, r0)
            X.C66584MXp.A0o(r5, r7, r9, r10)
            java.lang.String r0 = "creation_session_id"
            r7.A0R(r0, r8)
            r7.Cgf()
        L_0x009a:
            android.content.Context r5 = r4.getContext()
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L_0x00af
            r6 = 1
        L_0x00af:
            r3.A0I = r6
            r0 = 2131429541(0x7f0b08a5, float:1.8480758E38)
            android.view.View r1 = r4.requireViewById(r0)
            if (r1 == 0) goto L_0x00bf
            r0 = 29
            X.C71395Oju.A00(r1, r0, r3)
        L_0x00bf:
            r0 = 2131428084(0x7f0b02f4, float:1.8477802E38)
            com.instagram.common.ui.base.IgTextView r1 = X.DbT.A0a(r4, r0)
            r3.A04 = r1
            if (r1 == 0) goto L_0x00cf
            r0 = 30
            X.C71395Oju.A00(r1, r0, r3)
        L_0x00cf:
            r0 = 2131237920(0x7f081c20, float:1.8092104E38)
            android.graphics.drawable.Drawable r7 = r5.getDrawable(r0)
            r0 = 2131237913(0x7f081c19, float:1.809209E38)
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r0)
            if (r8 == 0) goto L_0x00ec
            android.graphics.drawable.Drawable r6 = r8.mutate()
            if (r6 == 0) goto L_0x00ec
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r6, r1)
        L_0x00ec:
            if (r7 == 0) goto L_0x00fa
            android.graphics.drawable.Drawable r6 = r7.mutate()
            if (r6 == 0) goto L_0x00fa
            r1 = -1
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r6, r1)
        L_0x00fa:
            r0 = 2131439992(0x7f0b3178, float:1.8501955E38)
            android.view.View r6 = r4.requireViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager"
            X.0qQ.A0C(r6, r0)
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r6 = (com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager) r6
            r3.A0A = r6
            if (r6 == 0) goto L_0x0116
            r1 = 26
            X.Pla r0 = new X.Pla
            r0.<init>(r3, r1)
            r6.setApplyReWrite(r0)
        L_0x0116:
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r6 = r3.A0A
            if (r6 == 0) goto L_0x0126
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r17)
            X.OTG r0 = new X.OTG
            r0.<init>(r5, r3, r1)
            r6.setBotResponseFeedbackController(r0)
        L_0x0126:
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r1 = r3.A0A
            if (r1 == 0) goto L_0x0131
            X.P36 r0 = new X.P36
            r0.<init>(r3)
            r1.A01 = r0
        L_0x0131:
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x014d
            r0 = 1470(0x5be, float:2.06E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r11 = r1.getString(r0)
            if (r11 == 0) goto L_0x014d
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r9 = r3.A0A
            if (r9 == 0) goto L_0x014d
            r10 = 0
            java.lang.String r13 = ""
            r12 = r10
            r14 = r11
            r9.A0T(r10, r11, r12, r13, r14)
        L_0x014d:
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r1 = r3.A0A
            if (r1 == 0) goto L_0x0156
            X.3TG r0 = X.AnonymousClass3TG.DISABLED
            r1.setScrollMode(r0)
        L_0x0156:
            r0 = 2131442585(0x7f0b3b99, float:1.8507214E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r4, r0)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r17)
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r1 = r3.A0A
            X.ONg r0 = new X.ONg
            r0.<init>(r5, r9, r6, r1)
            r3.A0B = r0
            r0 = 2131431199(0x7f0b0f1f, float:1.848412E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.base.IgEditText r0 = (com.instagram.common.ui.base.IgEditText) r0
            r3.A03 = r0
            X.0lg r6 = X.DbT.A0X(r17)
            X.0Tu r10 = X.0Tu.A05
            r0 = 36323513380515035(0x810c0b000a2cdb, double:3.034474352661647E-306)
            boolean r0 = X.182.A06(r10, r6, r0)
            if (r0 == 0) goto L_0x01b9
            X.0xx r9 = X.DbW.A0E(r3)
            r6 = 0
            r1 = 45
            X.MFz r0 = new X.MFz
            r0.<init>(r3, r6, r1)
            X.AnonymousClass7TE.A1Z(r0, r9)
            X.0eM r0 = r3.A0N
            java.lang.Object r6 = r0.getValue()
            X.Mtq r6 = (X.C67737Mtq) r6
            java.util.List r0 = r6.A03
            java.util.List r0 = X.0jo.A1G(r0)
            java.util.ListIterator r0 = r0.listIterator()
            r6.A00 = r0
            android.os.Handler r1 = r6.A01
            java.lang.Runnable r0 = r6.A02
            r1.post(r0)
            com.instagram.common.ui.base.IgEditText r1 = r3.A03
            if (r1 == 0) goto L_0x01b9
            r0 = 64
            X.C71405Ok4.A01(r1, r0, r8, r3)
        L_0x01b9:
            r0 = 2131428083(0x7f0b02f3, float:1.84778E38)
            android.view.View r1 = r4.requireViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r1
            r3.A0D = r1
            if (r1 == 0) goto L_0x01cb
            X.5pk r0 = X.C296245pk.LARGE
            r1.setSize(r0)
        L_0x01cb:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r6 = r3.A0D
            com.instagram.common.ui.base.IgEditText r9 = r3.A03
            if (r9 == 0) goto L_0x01f4
            int r0 = r3.A00
            A04(r3, r0)
            r1 = 7
            X.Oz5 r0 = new X.Oz5
            r0.<init>(r3, r1)
            r3.A06 = r0
            r0 = 1
            X.3E5 r1 = X.AnonymousClass3E4.A01(r9, r2, r0)
            r3.A07 = r1
            X.3ok r0 = r3.A06
            r1.A9Y(r0)
            X.3E6 r0 = r3.A07
            if (r0 == 0) goto L_0x01f1
            X.JTP.A17(r3, r0)
        L_0x01f1:
            r9.requestFocus()
        L_0x01f4:
            com.instagram.common.ui.base.IgEditText r1 = r3.A03
            if (r1 == 0) goto L_0x0200
            X.W7a r0 = new X.W7a
            r0.<init>(r2, r8, r7, r3)
            r1.addTextChangedListener(r0)
        L_0x0200:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r3.A0D
            if (r1 == 0) goto L_0x0209
            r0 = 10
            X.C71399Ojy.A00(r1, r8, r3, r6, r0)
        L_0x0209:
            r0 = 2131444058(0x7f0b415a, float:1.8510202E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.direct.fragment.writewithai.PromptPills r0 = (com.instagram.direct.fragment.writewithai.PromptPills) r0
            r3.A09 = r0
            X.0lg r6 = X.DbT.A0X(r17)
            r0 = 36323513380580572(0x810c0b000b2cdc, double:3.034474352703093E-306)
            boolean r9 = X.182.A06(r10, r6, r0)
            r16 = 4
            r14 = 3
            r13 = 2
            r6 = 1
            r12 = 5
            if (r9 == 0) goto L_0x0346
            r9 = 8
            java.lang.String[] r11 = new java.lang.String[r9]
            android.content.Context r15 = r3.requireContext()
            r9 = 2131972152(0x7f135038, float:1.9581303E38)
            java.lang.String r9 = r15.getString(r9)
            r11[r2] = r9
            android.content.Context r15 = r3.requireContext()
            r9 = 2131965815(0x7f133777, float:1.956845E38)
            java.lang.String r9 = r15.getString(r9)
            r11[r6] = r9
            android.content.Context r15 = r3.requireContext()
            r9 = 2131952298(0x7f1302aa, float:1.9541035E38)
            java.lang.String r9 = r15.getString(r9)
            r11[r13] = r9
            android.content.Context r15 = r3.requireContext()
            r9 = 2131952342(0x7f1302d6, float:1.9541124E38)
            java.lang.String r9 = r15.getString(r9)
            r11[r14] = r9
            android.content.Context r15 = r3.requireContext()
            r9 = 2131965819(0x7f13377b, float:1.9568459E38)
            java.lang.String r9 = r15.getString(r9)
            r11[r16] = r9
            android.content.Context r15 = r3.requireContext()
            r9 = 2131965820(0x7f13377c, float:1.956846E38)
            java.lang.String r9 = r15.getString(r9)
            r11[r12] = r9
            r16 = 6
            android.content.Context r15 = r3.requireContext()
            r9 = 2131962511(0x7f132a8f, float:1.956175E38)
            java.lang.String r9 = r15.getString(r9)
            r11[r16] = r9
            r16 = 7
            android.content.Context r15 = r3.requireContext()
            r9 = 2131965821(0x7f13377d, float:1.9568463E38)
            java.lang.String r9 = r15.getString(r9)
        L_0x0297:
            r11[r16] = r9
            java.util.List r9 = X.0sr.A1P(r11)
            r3.A0G = r9
            X.0lg r9 = X.DbT.A0X(r17)
            boolean r0 = X.182.A06(r10, r9, r0)
            r9 = 4
            if (r0 == 0) goto L_0x0328
            r0 = 8
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 2131238245(0x7f081d65, float:1.8092763E38)
            X.G9w.A1Z(r1, r0, r2)
            r0 = 2131238277(0x7f081d85, float:1.8092828E38)
            X.G9w.A1Z(r1, r0, r6)
            r0 = 2131238284(0x7f081d8c, float:1.8092842E38)
            X.G9w.A1Z(r1, r0, r13)
            r0 = 2131238070(0x7f081cb6, float:1.8092408E38)
            X.G9w.A1Z(r1, r0, r14)
            r0 = 2131238283(0x7f081d8b, float:1.809284E38)
            X.G9w.A1Z(r1, r0, r9)
            r0 = 2131238743(0x7f081f57, float:1.8093773E38)
            X.G9w.A1Z(r1, r0, r12)
            r9 = 6
            r0 = 2131238766(0x7f081f6e, float:1.809382E38)
            X.G9w.A1Z(r1, r0, r9)
            r9 = 7
            r0 = 2131238362(0x7f081dda, float:1.8093E38)
        L_0x02dd:
            X.G9w.A1Z(r1, r0, r9)
            java.util.List r0 = X.0sr.A1P(r1)
            r3.A0F = r0
            java.util.List r0 = r3.A0G
            if (r0 != 0) goto L_0x02f4
            java.lang.String r0 = "prompts"
        L_0x02ec:
            X.0qQ.A0F(r0)
        L_0x02ef:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02f4:
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r0)
            r1 = 0
            java.util.Iterator r14 = r0.iterator()
        L_0x02fd:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0363
            java.lang.Object r13 = r14.next()
            int r11 = r1 + 1
            if (r1 >= 0) goto L_0x030f
            X.0sr.A1T()
            goto L_0x02ef
        L_0x030f:
            java.lang.String r13 = (java.lang.String) r13
            java.util.List r0 = r3.A0F
            if (r0 != 0) goto L_0x0318
            java.lang.String r0 = "promptIcons"
            goto L_0x02ec
        L_0x0318:
            int r9 = X.C51971G9r.A0I(r0, r1)
            r1 = 12
            X.N4G r0 = new X.N4G
            r0.<init>((java.lang.String) r13, (int) r9, (int) r1)
            r12.add(r0)
            r1 = r11
            goto L_0x02fd
        L_0x0328:
            java.lang.Integer[] r1 = new java.lang.Integer[r12]
            r0 = 2131238727(0x7f081f47, float:1.809374E38)
            X.G9w.A1Z(r1, r0, r2)
            r0 = 2131238277(0x7f081d85, float:1.8092828E38)
            X.G9w.A1Z(r1, r0, r6)
            r0 = 2131238743(0x7f081f57, float:1.8093773E38)
            X.G9w.A1Z(r1, r0, r13)
            r0 = 2131238362(0x7f081dda, float:1.8093E38)
            X.G9w.A1Z(r1, r0, r14)
            r0 = 2131238284(0x7f081d8c, float:1.8092842E38)
            goto L_0x02dd
        L_0x0346:
            java.lang.String[] r11 = new java.lang.String[r12]
            java.lang.String r9 = "Rephrase"
            r11[r2] = r9
            java.lang.String r9 = "Make funnier"
            r11[r6] = r9
            java.lang.String r9 = "Shorten"
            r11[r13] = r9
            java.lang.String r9 = "Make supportive"
            r11[r14] = r9
            java.lang.String r9 = "Add emojis"
            goto L_0x0297
        L_0x035c:
            X.Nml r1 = X.C69503Nml.A0L
            goto L_0x007b
        L_0x0360:
            r0 = 0
            goto L_0x005d
        L_0x0363:
            com.instagram.direct.fragment.writewithai.PromptPills r11 = r3.A09
            if (r11 == 0) goto L_0x0373
            int r9 = r3.A01
            r1 = 18
            X.PqR r0 = new X.PqR
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r3)
            r11.setPills(r12, r9, r0)
        L_0x0373:
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x03a9
            com.instagram.common.ui.base.IgTextView r0 = r3.A04
            r9 = -1
            if (r0 == 0) goto L_0x037f
            r0.setTextColor(r9)
        L_0x037f:
            r0 = 2131240079(0x7f08248f, float:1.8096483E38)
            android.graphics.drawable.Drawable r1 = r5.getDrawable(r0)
            com.instagram.common.ui.base.IgEditText r0 = r3.A03
            if (r0 == 0) goto L_0x038d
            r0.setBackground(r1)
        L_0x038d:
            if (r8 == 0) goto L_0x039a
            android.graphics.drawable.Drawable r1 = r8.mutate()
            if (r1 == 0) goto L_0x039a
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r1, r9)
        L_0x039a:
            if (r7 == 0) goto L_0x03a9
            android.graphics.drawable.Drawable r7 = r7.mutate()
            if (r7 == 0) goto L_0x03a9
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r7, r1)
        L_0x03a9:
            X.1Av r0 = X.DbX.A0h(r17)
            X.0xa r0 = r0.A01
            java.lang.String r7 = "has_seen_write_with_ai_disclaimer_igd"
            boolean r0 = r0.getBoolean(r7, r2)
            if (r0 == 0) goto L_0x046f
            X.0lg r4 = X.DbT.A0X(r17)
            r0 = 36323513380252889(0x810c0b00062cd9, double:3.034474352495865E-306)
            boolean r0 = X.182.A06(r10, r4, r0)
            if (r0 == 0) goto L_0x046e
            com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager r0 = r3.A0A
            if (r0 == 0) goto L_0x03d0
            java.lang.String r5 = r0.getTextToRewriteFromCurrentPage()
            if (r5 != 0) goto L_0x03d2
        L_0x03d0:
            java.lang.String r5 = ""
        L_0x03d2:
            X.ONg r4 = r3.A0B
            if (r4 == 0) goto L_0x046e
            r0 = 24
            X.Pla r8 = new X.Pla
            r8.<init>(r3, r0)
            r0 = 29
            X.PmE r7 = new X.PmE
            r7.<init>(r3, r0)
            com.instagram.common.session.UserSession r13 = r4.A05
            X.1vn r9 = X.1vm.A01(r13)
            X.0K0 r11 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r17 = 0
            java.lang.String r3 = "REPHRASE"
            java.lang.String r0 = "modifier_type"
            X.0Df r12 = X.C41845B3m.A03(r11, r3, r0)
            r0 = 36604988357153955(0x820c0b000914a3, double:3.212480261296857E-306)
            int r0 = X.DbS.A04(r10, r13, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "num_options"
            X.0Df.A00(r12, r1, r0)
            java.lang.String r1 = "IG_DIRECT"
            java.lang.String r0 = "caller"
            X.0Df r11 = X.C41845B3m.A03(r11, r1, r0)
            java.lang.String r0 = "content"
            X.0Df.A00(r11, r5, r0)
            java.lang.String r1 = "IGD__THREAD__WRITE_WITH_AI"
            java.lang.String r0 = "entrypoint"
            X.0Df.A00(r11, r1, r0)
            java.lang.String r0 = "plugin_request_options"
            r11.A0E(r12, r0)
            X.2IS r10 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "params"
            X.1vR r11 = X.C41847B3o.A04(r11, r10, r0)
            java.util.Map r13 = r10.getParamsCopy()
            java.util.Map r14 = r1.getParamsCopy()
            java.lang.Class<X.BiE> r15 = X.C42778BiE.class
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
            java.lang.String r12 = "GenAIWriteWithAIQuery"
            java.lang.String r20 = "xfb_genai_write_with_ai_query"
            com.facebook.pando.PandoGraphQLRequest r10 = new com.facebook.pando.PandoGraphQLRequest
            r18 = r2
            r19 = r17
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.5D7 r0 = r4.A00
            r0.A02(r3)
            r4.A00()
            X.DFX r3 = new X.DFX
            r11 = r3
            r12 = r8
            r13 = r7
            r14 = r4
            r15 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            X.DFB r2 = new X.DFB
            r2.<init>((X.C70834ONg) r4, (X.C62320sa) r8, (X.0sP) r7, (int) r6)
            r1 = 1316683298(0x4e7afe22, float:1.05273971E9)
            X.0nX r0 = new X.0nX
            r0.<init>(r1)
            r9.ATM(r2, r3, r10, r0)
        L_0x046e:
            return
        L_0x046f:
            r0 = 2131436281(0x7f0b22f9, float:1.8494428E38)
            android.view.View r1 = X.DbY.A0F(r4, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView"
            X.0qQ.A0C(r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = (com.instagram.common.ui.base.IgTextView) r1
            r3.A05 = r1
            if (r1 == 0) goto L_0x0484
            X.DbT.A1H(r1)
        L_0x0484:
            int r0 = X.Dbb.A04(r3)
            X.Ngs r4 = new X.Ngs
            r4.<init>((X.C68447NIk) r3, (int) r0)
            r0 = 2131958809(0x7f131c19, float:1.955424E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r5, r0)
            r0 = 2131958810(0x7f131c1a, float:1.9554243E38)
            android.text.SpannableStringBuilder r1 = X.DbW.A08(r5, r0)
            X.AnonymousClass7AV.A04(r1, r4, r2)
            com.instagram.common.ui.base.IgTextView r0 = r3.A05
            if (r0 == 0) goto L_0x04a5
            r0.setText(r1)
        L_0x04a5:
            X.1Av r0 = X.DbX.A0h(r17)
            X.0xa r0 = r0.A01
            X.DbX.A1V(r0, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68447NIk.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(Drawable drawable, C68447NIk nIk, IgdsMediaButton igdsMediaButton) {
        Editable editable;
        String str;
        C69503Nml nml;
        if (igdsMediaButton != null && igdsMediaButton.isEnabled()) {
            AnonymousClass7I3 r0 = nIk.A08;
            if (r0 != null) {
                boolean z = nIk.A0K;
                boolean z2 = nIk.A0J;
                String str2 = nIk.A0E;
                String str3 = nIk.A0L;
                boolean z3 = nIk.A0H;
                1Ln A0J2 = 1Ln.A0J(r0.A01);
                XSV A002 = AnonymousClass7I3.A00(z2, z);
                if (z3) {
                    nml = C69503Nml.A0K;
                } else {
                    nml = C69503Nml.A0L;
                }
                if (DbT.A1Y(A0J2)) {
                    A0J2.A0Z(27);
                    A0J2.A0X(0);
                    C66580MXl.A1L(A0J2, "generate");
                    A0J2.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    C66584MXp.A0o(A002, A0J2, str2, z2);
                    A0J2.A0R("creation_session_id", str3);
                    A0J2.Cgf();
                }
            }
            A02(nIk);
            IgEditText igEditText = nIk.A03;
            String str4 = null;
            if (igEditText != null) {
                editable = igEditText.getText();
            } else {
                editable = null;
            }
            String valueOf = String.valueOf(editable);
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager = nIk.A0A;
            if (rewriteTextBubbleViewPager != null) {
                str = rewriteTextBubbleViewPager.getAppliedPromptOfCurrentPage();
            } else {
                str = null;
            }
            boolean A0K2 = 0qQ.A0K(str, valueOf);
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager2 = nIk.A0A;
            if (A0K2) {
                if (rewriteTextBubbleViewPager2 != null) {
                    str4 = rewriteTextBubbleViewPager2.getTextToRewriteFromOriginalPage();
                }
            } else if (rewriteTextBubbleViewPager2 != null) {
                str4 = rewriteTextBubbleViewPager2.getTextToRewriteFromCurrentPage();
            }
            C70834ONg oNg = nIk.A0B;
            if (oNg != null) {
                oNg.A02(str4, valueOf, new C73665Phe(47, nIk, drawable), new C73934PmE(nIk, 31), true);
            }
        }
    }

    public static final void A01(C68447NIk nIk) {
        String str;
        C69503Nml nml;
        AnonymousClass7I3 r0 = nIk.A08;
        if (r0 != null) {
            boolean z = nIk.A0K;
            boolean z2 = nIk.A0J;
            String str2 = nIk.A0E;
            String str3 = nIk.A0L;
            boolean z3 = nIk.A0H;
            1Ln A0J2 = 1Ln.A0J(r0.A01);
            if (z3) {
                nml = C69503Nml.A0K;
            } else {
                nml = C69503Nml.A0L;
            }
            XSV A002 = AnonymousClass7I3.A00(z2, z);
            if (DbT.A1Y(A0J2)) {
                A0J2.A0Z(27);
                A0J2.A0X(0);
                C66580MXl.A1L(A0J2, "apply");
                A0J2.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                C66584MXp.A0o(A002, A0J2, str2, z2);
                A0J2.A0R("creation_session_id", str3);
                A0J2.Cgf();
            }
        }
        C70614ODl oDl = nIk.A0C;
        if (oDl != null) {
            PromptPills promptPills = nIk.A09;
            if (promptPills == null || promptPills.isEnabled()) {
                RewriteTextBubbleViewPager rewriteTextBubbleViewPager = nIk.A0A;
                if (rewriteTextBubbleViewPager == null || (str = rewriteTextBubbleViewPager.getTextToRewriteFromCurrentPage()) == null) {
                    str = "";
                }
                oDl.A01.invoke(str);
                oDl.A02.A00 = true;
                C331157Pu r02 = oDl.A00.A00;
                if (r02 != null) {
                    r02.A07();
                }
            }
        }
    }

    public static final void A02(C68447NIk nIk) {
        PromptPills promptPills = nIk.A09;
        if (promptPills != null) {
            promptPills.setEnabled(false);
        }
        PromptPills promptPills2 = nIk.A09;
        if (promptPills2 != null) {
            promptPills2.setAlpha(0.6f);
        }
        IgdsMediaButton igdsMediaButton = nIk.A0D;
        if (igdsMediaButton != null) {
            igdsMediaButton.setEnabled(false);
        }
        IgdsMediaButton igdsMediaButton2 = nIk.A0D;
        if (igdsMediaButton2 != null) {
            igdsMediaButton2.setAlpha(0.5f);
        }
        IgTextView igTextView = nIk.A04;
        if (igTextView != null) {
            igTextView.setEnabled(false);
        }
        IgTextView igTextView2 = nIk.A04;
        if (igTextView2 != null) {
            igTextView2.setAlpha(0.5f);
        }
    }

    public static final void A03(C68447NIk nIk) {
        PromptPills promptPills = nIk.A09;
        if (promptPills != null) {
            promptPills.setEnabled(true);
        }
        PromptPills promptPills2 = nIk.A09;
        if (promptPills2 != null) {
            promptPills2.setAlpha(1.0f);
        }
        IgdsMediaButton igdsMediaButton = nIk.A0D;
        if (igdsMediaButton != null) {
            igdsMediaButton.setEnabled(true);
        }
        IgdsMediaButton igdsMediaButton2 = nIk.A0D;
        if (igdsMediaButton2 != null) {
            igdsMediaButton2.setAlpha(1.0f);
        }
        IgTextView igTextView = nIk.A04;
        if (igTextView != null) {
            igTextView.setEnabled(true);
        }
        IgTextView igTextView2 = nIk.A04;
        if (igTextView2 != null) {
            igTextView2.setAlpha(1.0f);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.5n1] */
    public final void A05(Drawable drawable) {
        IgdsMediaButton igdsMediaButton = this.A0D;
        if (igdsMediaButton != null) {
            igdsMediaButton.setButtonStyle(C296235pj.CREATION_FLOW_NO_BG);
        }
        IgdsMediaButton igdsMediaButton2 = this.A0D;
        if (igdsMediaButton2 != null) {
            ? obj = new Object();
            obj.A01 = drawable;
            igdsMediaButton2.setStartAddOn(obj, (CharSequence) null);
        }
        IgdsMediaButton igdsMediaButton3 = this.A0D;
        if (igdsMediaButton3 != null) {
            igdsMediaButton3.setPadding(0, 0, 0, 0);
        }
    }

    public final String getModuleName() {
        return this.A0O;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0M);
    }

    public C68447NIk() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73899Pla(new C73899Pla(this, 27), 28));
        0Yh A0z = DbS.A0z(C67737Mtq.class);
        this.A0N = DbS.A0I(new C73899Pla(A002, 29), new C73665Phe(49, this, A002), new C73665Phe(48, A002, (Object) null), A0z);
        this.A0O = "write_with_ai_bottom_sheet_fragment";
        this.A0L = C51972G9s.A0n();
    }

    public static final void A04(C68447NIk nIk, int i) {
        double d;
        double A002 = (((double) AnonymousClass0nB.A00(nIk.requireContext())) * 0.95d) - ((double) i);
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager = nIk.A0A;
        if (i == 0) {
            if (rewriteTextBubbleViewPager != null) {
                d = 0.6d;
            } else {
                return;
            }
        } else if (rewriteTextBubbleViewPager != null) {
            d = 0.4d;
        } else {
            return;
        }
        rewriteTextBubbleViewPager.setTextBubbleMaxHeight((int) (A002 * d));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1840166696);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.write_with_ai_prompt, false);
        AnonymousClass0fD.A09(997779596, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1681850013);
        super.onDestroyView();
        this.A03 = null;
        this.A09 = null;
        this.A0D = null;
        this.A0C = null;
        this.A0A = null;
        this.A0B = null;
        AnonymousClass3E6 r0 = this.A07;
        if (r0 != null) {
            r0.onStop();
        }
        AnonymousClass3E6 r1 = this.A07;
        if (r1 != null) {
            r1.EEH(this.A06);
        }
        AnonymousClass0fD.A09(-991382011, A022);
    }
}
