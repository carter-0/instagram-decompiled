package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import java.util.List;
import java.util.Map;

/* renamed from: X.NIj  reason: case insensitive filesystem */
public final class C68446NIj extends AnonymousClass4DH {
    public static final List A0I = 0sr.A1P(new String[]{"❤️", "🙌", "🔥", "👏", "😢", "😍", "😮", "😂"});
    public static final String __redex_internal_original_name = "DirectReplyComposerFragment";
    public int A00;
    public View A01;
    public IgTextView A02;
    public IgTextView A03;
    public AnonymousClass7L0 A04;
    public OE5 A05;
    public ComposerAutoCompleteTextView A06;
    public String A07 = "";
    public Map A08;
    public View A09;
    public RecyclerView A0A;
    public LithoView A0B;
    public IgTextView A0C;
    public IgImageView A0D;
    public IgImageView A0E;
    public IgImageView A0F;
    public final C71273OhE A0G = new C71273OhE(this, 22);
    public final AnonymousClass0eM A0H = C227642jf.A02(this);

    public final String getModuleName() {
        return "direct_reply_composer_fragment";
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r3 = 0
            r1 = r25
            X.0qQ.A0B(r1, r3)
            r4 = r24
            r0 = r26
            super.onViewCreated(r1, r0)
            android.view.View r1 = r4.A09
            java.lang.String r8 = "rootView"
            r15 = 0
            if (r1 == 0) goto L_0x0171
            r0 = 2131439869(0x7f0b30fd, float:1.8501705E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r4.A0C = r0
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439868(0x7f0b30fc, float:1.8501703E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r1, r0)
            r4.A0E = r0
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439867(0x7f0b30fb, float:1.8501701E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r1, r0)
            r4.A0D = r0
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439871(0x7f0b30ff, float:1.850171E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r1, r0)
            r4.A0F = r0
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439866(0x7f0b30fa, float:1.85017E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = (com.instagram.ui.widget.textview.ComposerAutoCompleteTextView) r0
            r4.A06 = r0
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439863(0x7f0b30f7, float:1.8501693E38)
            android.view.View r0 = r1.requireViewById(r0)
            r4.A01 = r0
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439865(0x7f0b30f9, float:1.8501697E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r4.A02 = r0
            X.0eM r5 = r4.A0H
            X.0lg r6 = X.AnonymousClass7TF.A0L(r5, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316306424860893(0x81057d000210dd, double:3.0299166448858864E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00a4
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439870(0x7f0b30fe, float:1.8501707E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r4.A03 = r0
            if (r0 == 0) goto L_0x0092
            r0.setVisibility(r3)
        L_0x0092:
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439899(0x7f0b311b, float:1.8501766E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbT.A0I(r1, r0)
            r4.A0A = r0
            if (r0 == 0) goto L_0x00a4
            r0.setVisibility(r3)
        L_0x00a4:
            X.0lg r6 = X.AnonymousClass7TF.A0L(r5, r3)
            r0 = 36316306424926430(0x81057d000310de, double:3.029916644927332E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00ec
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0171
            r0 = 2131439877(0x7f0b3105, float:1.8501722E38)
            android.view.View r1 = r1.requireViewById(r0)
            com.facebook.litho.LithoView r1 = (com.facebook.litho.LithoView) r1
            r4.A0B = r1
            r0 = 48
            X.PqK r13 = X.C74178PqK.A00(r4, r0)
            if (r1 == 0) goto L_0x00e5
            java.util.List r12 = A0I
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r5)
            X.Oru r10 = new X.Oru
            r10.<init>()
            android.content.Context r0 = r4.requireContext()
            int r14 = X.AnonymousClass0nB.A01(r0)
            X.7eg r9 = new X.7eg
            r9.<init>(r10, r11, r12, r13, r14)
            r1.setComponent(r9)
        L_0x00e5:
            com.facebook.litho.LithoView r0 = r4.A0B
            if (r0 == 0) goto L_0x00ec
            r0.setVisibility(r3)
        L_0x00ec:
            X.7L0 r0 = r4.A04
            if (r0 == 0) goto L_0x0112
            int r6 = r0.A04
            android.graphics.drawable.Drawable r1 = r0.A0F
            boolean r0 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x010d
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x00ff
            r1.setColor(r6)
        L_0x00ff:
            android.view.View r0 = r4.A01
            if (r0 != 0) goto L_0x010f
            java.lang.String r7 = "composerBar"
        L_0x0105:
            X.0qQ.A0F(r7)
        L_0x0108:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010d:
            r1 = r15
            goto L_0x00ff
        L_0x010f:
            r0.setBackground(r1)
        L_0x0112:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r4.A06
            java.lang.String r7 = "editText"
            if (r1 == 0) goto L_0x0105
            X.OhE r0 = r4.A0G
            r1.addTextChangedListener(r0)
            java.lang.String r1 = r4.A07
            int r0 = r1.length()
            r6 = 1
            if (r0 <= 0) goto L_0x013c
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r4.A06
            if (r0 == 0) goto L_0x0105
            r0.setText(r1)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r4.A06
            if (r1 == 0) goto L_0x0105
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r1)
            int r0 = X.DbX.A05(r0)
            r1.setSelection(r0)
        L_0x013c:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r4.A06
            if (r0 == 0) goto L_0x0105
            r0.requestFocus()
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r4.A06
            if (r0 == 0) goto L_0x0105
            X.0nA.A0Q(r0)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r4.A06
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            int r0 = r0.length()
            if (r0 > 0) goto L_0x0159
            r6 = 0
        L_0x0159:
            A00(r4, r6)
            X.OE5 r6 = r4.A05
            if (r6 == 0) goto L_0x01d5
            android.view.View r10 = r4.A09
            if (r10 == 0) goto L_0x0171
            r0 = 2131439864(0x7f0b30f8, float:1.8501695E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r10, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r4.A0F
            if (r9 != 0) goto L_0x0175
            java.lang.String r8 = "voice"
        L_0x0171:
            X.0qQ.A0F(r8)
            goto L_0x0108
        L_0x0175:
            X.Moq r8 = r6.A00
            X.7JI r0 = r8.A01
            if (r0 != 0) goto L_0x01d5
            com.instagram.common.session.UserSession r14 = r8.A06
            androidx.fragment.app.FragmentActivity r13 = r8.A05
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r0 = 2131439873(0x7f0b3101, float:1.8501713E38)
            android.view.View r12 = r1.findViewById(r0)
            boolean r0 = r12 instanceof android.view.ViewStub
            r11 = 0
            if (r0 == 0) goto L_0x01dc
            android.view.ViewStub r12 = (android.view.ViewStub) r12
        L_0x0192:
            X.2eb r6 = new X.2eb
            r6.<init>(r12)
            r0 = 2131439872(0x7f0b3100, float:1.8501711E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x01a5
            r11 = r1
            android.view.ViewStub r11 = (android.view.ViewStub) r11
        L_0x01a5:
            X.2eb r0 = new X.2eb
            r0.<init>(r11)
            X.7JE r17 = new X.7JE
            r19 = r15
            r20 = r10
            r21 = r7
            r22 = r6
            r23 = r0
            r18 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.PFR r0 = new X.PFR
            r0.<init>(r8)
            r18 = r15
            r20 = r3
            r19 = r3
            r16 = r0
            X.7JI r1 = X.AnonymousClass7JH.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            r8.A01 = r1
            X.7L0 r0 = r8.A09
            X.0eM r0 = r0.A0I
            r1.A0G(r0)
        L_0x01d5:
            com.instagram.common.ui.base.IgTextView r1 = r4.A0C
            if (r1 != 0) goto L_0x01de
            java.lang.String r8 = "sendButton"
            goto L_0x0171
        L_0x01dc:
            r12 = r15
            goto L_0x0192
        L_0x01de:
            r0 = 5
            X.C71402Ok1.A00(r1, r0, r4)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A0D
            if (r1 != 0) goto L_0x01e9
            java.lang.String r8 = "gallery"
            goto L_0x0171
        L_0x01e9:
            r0 = 6
            X.C71402Ok1.A00(r1, r0, r4)
            X.0lg r5 = X.AnonymousClass7TF.A0L(r5, r3)
            r0 = 36316306424795356(0x81057d000110dc, double:3.0299166448444405E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            java.lang.String r8 = "savedReply"
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A0E
            if (r0 == 0) goto L_0x027d
            if (r1 == 0) goto L_0x0171
            r0 = 7
            X.C71402Ok1.A00(r1, r0, r4)
        L_0x0206:
            int r1 = r4.A00
            r0 = 1
            if (r1 <= r0) goto L_0x0265
            com.instagram.common.ui.base.IgTextView r5 = r4.A02
            java.lang.String r8 = "description"
            if (r5 == 0) goto L_0x0171
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0263
            android.content.res.Resources r2 = r0.getResources()
            if (r2 == 0) goto L_0x0263
            r1 = 2131954366(0x7f130abe, float:1.954523E38)
            int r0 = r4.A00
            java.lang.String r0 = X.JTS.A0i(r2, r0, r1)
        L_0x0226:
            r5.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r4.A02
            if (r0 == 0) goto L_0x0171
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r3 = r4.A03
            if (r3 == 0) goto L_0x024c
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0249
            android.content.res.Resources r2 = r0.getResources()
            if (r2 == 0) goto L_0x0249
            r1 = 2131954365(0x7f130abd, float:1.9545227E38)
            int r0 = r4.A00
            java.lang.String r15 = X.JTS.A0i(r2, r0, r1)
        L_0x0249:
            r3.setText(r15)
        L_0x024c:
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0A
            if (r1 == 0) goto L_0x0257
            android.content.Context r0 = r4.getContext()
            X.DbV.A1A(r0, r1)
        L_0x0257:
            androidx.recyclerview.widget.RecyclerView r3 = r4.A0A
            if (r3 == 0) goto L_0x029a
            java.util.Map r0 = r4.A08
            if (r0 != 0) goto L_0x0285
            java.lang.String r8 = "selectedThreads"
            goto L_0x0171
        L_0x0263:
            r0 = r15
            goto L_0x0226
        L_0x0265:
            com.instagram.common.ui.base.IgTextView r3 = r4.A03
            if (r3 == 0) goto L_0x024c
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x0249
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x0249
            r0 = 2131954367(0x7f130abf, float:1.9545231E38)
            java.lang.String r15 = r1.getString(r0)
            goto L_0x0249
        L_0x027d:
            if (r1 == 0) goto L_0x0171
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0206
        L_0x0285:
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r2 = X.00k.A0U(r0)
            X.O8C r1 = new X.O8C
            r1.<init>(r4)
            X.MvG r0 = new X.MvG
            r0.<init>(r1, r2)
            r3.setAdapter(r0)
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68446NIj.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C68446NIj nIj, boolean z) {
        IgTextView igTextView = nIj.A0C;
        if (z) {
            if (igTextView != null) {
                igTextView.setVisibility(0);
                IgImageView igImageView = nIj.A0E;
                if (igImageView != null) {
                    igImageView.setVisibility(8);
                    IgImageView igImageView2 = nIj.A0D;
                    if (igImageView2 != null) {
                        igImageView2.setVisibility(8);
                        IgImageView igImageView3 = nIj.A0F;
                        if (igImageView3 != null) {
                            igImageView3.setVisibility(8);
                            return;
                        }
                    }
                    0qQ.A0F("gallery");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("savedReply");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("sendButton");
            throw AnonymousClass00P.createAndThrow();
        }
        if (igTextView != null) {
            igTextView.setVisibility(8);
            IgImageView igImageView4 = nIj.A0D;
            if (igImageView4 != null) {
                igImageView4.setVisibility(0);
                IgImageView igImageView5 = nIj.A0F;
                if (igImageView5 != null) {
                    igImageView5.setVisibility(0);
                    if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(nIj.A0H, 0), 36316306424795356L)) {
                        IgImageView igImageView6 = nIj.A0E;
                        if (igImageView6 != null) {
                            igImageView6.setVisibility(0);
                            return;
                        }
                        0qQ.A0F("savedReply");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    return;
                }
            }
            0qQ.A0F("gallery");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("sendButton");
        throw AnonymousClass00P.createAndThrow();
        0qQ.A0F("voice");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0H);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1732961807);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_reply_composer, viewGroup, false);
        this.A09 = inflate;
        if (inflate == null) {
            0qQ.A0F("rootView");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-1565206199, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1410852999);
        super.onDestroy();
        OE5 oe5 = this.A05;
        if (oe5 != null) {
            C67496Moq moq = oe5.A00;
            AnonymousClass7JI r0 = moq.A01;
            if (r0 != null) {
                r0.A0E();
            }
            moq.A01 = null;
        }
        AnonymousClass0fD.A09(-415952847, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1953282165);
        super.onDestroyView();
        this.A03 = null;
        this.A0A = null;
        this.A0B = null;
        AnonymousClass0fD.A09(917283291, A022);
    }
}
