package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.tagging.model.Tag;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class K67 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, MUG, G6R {
    public static final String __redex_internal_original_name = "ClipsPeopleTagFragment";
    public View A00;
    public ListView A01;
    public TextView A02;
    public 28D A03;
    public 28D A04 = 28D.A5J;
    public ClipsSharingDraftViewModel A05;
    public C65707LyM A06;
    public C60264JiL A07;
    public K99 A08;
    public RoundedCornerFrameLayout A09;
    public Boolean A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public View A0L;
    public IgTextView A0M;
    public C252063oV A0N;
    public String A0O;
    public boolean A0P;
    public final AnonymousClass0eM A0Q = C227642jf.A02(this);

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019d, code lost:
        if (A05() == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (X.AnonymousClass7TE.A1b(A01()) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d3, code lost:
        if (r9.size() >= 20) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e5, code lost:
        if (X.AnonymousClass7TE.A1b(r9) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.AnonymousClass7TE.A1b(A00()) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0187, code lost:
        if ((requireActivity().getResources().getConfiguration().screenLayout & 15) != 1) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.util.List r9) {
        /*
            r8 = this;
            r2 = 0
            r8.A02()
            boolean r0 = A06(r8)
            r7 = 0
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = r8.A00()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x002c
            boolean r0 = r8.A05()
            if (r0 == 0) goto L_0x002c
            java.util.List r0 = r8.A01()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r6 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            boolean r0 = A06(r8)
            if (r0 != 0) goto L_0x003d
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x01e0
            boolean r0 = r8.A05()
            if (r0 == 0) goto L_0x01e0
        L_0x003d:
            r5 = 0
        L_0x003e:
            if (r1 != 0) goto L_0x004e
            X.LyM r0 = r8.A06
            if (r0 != 0) goto L_0x011e
            java.lang.String r5 = "clipsPeopleTaggingController"
        L_0x0046:
            X.0qQ.A0F(r5)
        L_0x0049:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004e:
            r8.A04(r2)
            boolean r0 = A06(r8)
            r3 = 1
            java.lang.String r6 = "taggedItemsAdapter"
            if (r0 == 0) goto L_0x0194
            X.K99 r0 = r8.A08
            if (r0 == 0) goto L_0x01db
            r0.A0A = r2
            r0.A08 = r3
        L_0x0062:
            X.K99 r0 = r8.A08
            if (r0 == 0) goto L_0x01db
            r0.A0D(r9)
            X.0eM r0 = r8.A0Q
            X.0lg r4 = X.AnonymousClass7TF.A0L(r0, r2)
            X.0Tu r3 = X.0Tu.A06
            r0 = 36321108199154800(0x8109db000f2470, double:3.032953306284546E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r0 = r0 ^ 1
            java.lang.String r5 = "clipsPeopleTaggingController"
            if (r0 == 0) goto L_0x009c
            X.K99 r3 = r8.A08
            if (r3 == 0) goto L_0x01db
            X.LyM r0 = r8.A06
            if (r0 == 0) goto L_0x0046
            X.JiL r0 = r0.A04
            X.05G r0 = r0.A0C
            java.util.Collection r1 = X.JTO.A13(r0)
            if (r1 != 0) goto L_0x0094
            X.0sn r1 = X.0sn.A00
        L_0x0094:
            java.util.List r0 = r3.A0J
            r0.clear()
            r0.addAll(r1)
        L_0x009c:
            X.K99 r1 = r8.A08
            if (r1 == 0) goto L_0x01db
            X.LyM r0 = r8.A06
            if (r0 == 0) goto L_0x0046
            X.JiL r0 = r0.A04
            X.2Fj r0 = r0.A06
            java.lang.Object r0 = r0.A02()
            java.lang.String r0 = (java.lang.String) r0
            r1.A04 = r0
            X.K99 r3 = r8.A08
            if (r3 == 0) goto L_0x01db
            X.LyM r0 = r8.A06
            if (r0 == 0) goto L_0x0046
            X.JiL r0 = r0.A04
            X.2Fj r0 = r0.A09
            java.util.List r1 = X.JTS.A0q(r0)
            java.util.List r0 = r3.A0I
            r0.clear()
            r0.addAll(r1)
            X.K99 r4 = r8.A08
            if (r4 == 0) goto L_0x01db
            X.LyM r0 = r8.A06
            if (r0 == 0) goto L_0x0046
            X.JiL r3 = r0.A04
            X.2Fj r0 = r3.A00
            java.lang.Object r0 = r0.A02()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x018e
            java.util.HashSet r1 = X.00k.A0V(r0)
        L_0x00e0:
            X.2Fj r0 = r3.A09
            java.lang.Object r0 = r0.A02()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 != 0) goto L_0x00ec
            X.0sn r0 = X.0sn.A00
        L_0x00ec:
            java.util.List r0 = X.00k.A0e(r0, r1)
            java.util.List r1 = X.00k.A0a(r0)
            java.util.List r0 = r4.A0G
            r0.clear()
            r0.addAll(r1)
            X.K99 r1 = r8.A08
            if (r1 == 0) goto L_0x01db
            X.28D r0 = r8.A04
            r1.A00 = r0
            java.lang.Boolean r0 = r8.A0A
            r1.A03 = r0
            android.widget.ListView r0 = r8.A01
            if (r0 == 0) goto L_0x010f
            r0.setAdapter(r1)
        L_0x010f:
            X.K99 r0 = r8.A08
            if (r0 == 0) goto L_0x01db
            r0.A0C()
            android.widget.ListView r0 = r8.A01
            if (r0 == 0) goto L_0x018d
            r0.setVisibility(r2)
            return
        L_0x011e:
            X.JiL r0 = r0.A04
            X.05G r0 = r0.A0C
            java.util.List r0 = X.JTO.A16(r0)
            if (r0 != 0) goto L_0x012a
            X.0sn r0 = X.0sn.A00
        L_0x012a:
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0146
            X.0eM r0 = r8.A0Q
            X.0lg r4 = X.AnonymousClass7TF.A0L(r0, r2)
            X.0Tu r3 = X.0Tu.A06
            r0 = 36321108199154800(0x8109db000f2470, double:3.032953306284546E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0146
            r7 = 1
        L_0x0146:
            if (r6 != 0) goto L_0x004e
            if (r5 != 0) goto L_0x004e
            if (r7 != 0) goto L_0x004e
            android.view.View r0 = r8.A00
            r1 = 8
            if (r0 == 0) goto L_0x0155
            r0.setVisibility(r1)
        L_0x0155:
            android.widget.TextView r0 = r8.A02
            if (r0 == 0) goto L_0x015c
            r0.setVisibility(r1)
        L_0x015c:
            android.widget.ListView r0 = r8.A01
            if (r0 == 0) goto L_0x0163
            r0.setVisibility(r1)
        L_0x0163:
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            android.graphics.RectF r0 = X.0nA.A01
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r2 = 1
            if (r0 != r2) goto L_0x0189
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r1 = r0 & 15
            r0 = 0
            if (r1 == r2) goto L_0x018a
        L_0x0189:
            r0 = 1
        L_0x018a:
            r8.A04(r0)
        L_0x018d:
            return
        L_0x018e:
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            goto L_0x00e0
        L_0x0194:
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x019f
            boolean r1 = r8.A05()
            r0 = 1
            if (r1 != 0) goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            r5 = 20
            r4 = 8
            if (r0 == 0) goto L_0x01be
            X.K99 r0 = r8.A08
            if (r0 == 0) goto L_0x01db
            r0.A0A = r3
            r0.A08 = r2
        L_0x01ae:
            android.widget.TextView r1 = r8.A02
            if (r1 == 0) goto L_0x0062
            int r0 = r9.size()
            if (r0 < r5) goto L_0x01b9
            r4 = 0
        L_0x01b9:
            r1.setVisibility(r4)
            goto L_0x0062
        L_0x01be:
            android.view.View r3 = r8.A00
            if (r3 == 0) goto L_0x01ae
            boolean r0 = r8.A07(r9)
            if (r0 != 0) goto L_0x01d5
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x01d5
            int r1 = r9.size()
            r0 = 0
            if (r1 < r5) goto L_0x01d7
        L_0x01d5:
            r0 = 8
        L_0x01d7:
            r3.setVisibility(r0)
            goto L_0x01ae
        L_0x01db:
            X.0qQ.A0F(r6)
            goto L_0x0049
        L_0x01e0:
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            r5 = 1
            if (r0 != 0) goto L_0x003e
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K67.A08(java.util.List):void");
    }

    public final void CuE() {
        A03(this, false);
    }

    public final void configureActionBar(2da r6) {
        View.OnClickListener A012;
        0qQ.A0B(r6, 0);
        boolean A062 = A06(this);
        Context requireContext = requireContext();
        int i = 2131955584;
        if (A062) {
            i = 2131952285;
        }
        r6.setTitle(requireContext.getString(i));
        AnonymousClass3JR A0K2 = DbS.A0K();
        A0K2.A06 = R.drawable.instagram_check_pano_outline_24;
        A0K2.A0P = true;
        A0K2.A02 = requireContext().getColor(1QE.A01(requireContext()));
        A0K2.A05 = 2131960992;
        if (this.A0I && this.A0F && this.A0G) {
            if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A0Q, 0), 36313012185925218L)) {
                A012 = LYG.A01(this, r6, 60);
                A0K2.A0G = A012;
                A0K2.A04 = R.id.clips_people_tagging_done_button;
                r6.AA3(new AnonymousClass3Jb(A0K2));
                DbX.A1A(LYD.A01(this, 40), DbX.A0M(), r6);
            }
        }
        A012 = LYD.A01(this, 41);
        A0K2.A0G = A012;
        A0K2.A04 = R.id.clips_people_tagging_done_button;
        r6.AA3(new AnonymousClass3Jb(A0K2));
        DbX.A1A(LYD.A01(this, 40), DbX.A0M(), r6);
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d9, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r1), 36313012185269849L) == false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r4 = 0
            r2 = r25
            X.0qQ.A0B(r2, r4)
            r3 = r24
            r0 = r26
            super.onViewCreated(r2, r0)
            r0 = 2131443730(0x7f0b4012, float:1.8509536E38)
            android.view.View r5 = r2.requireViewById(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r5 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r5
            r3.A09 = r5
            if (r5 == 0) goto L_0x0028
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r5.setCornerRadius(r0)
        L_0x0028:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r3.A09
            if (r1 == 0) goto L_0x0031
            r0 = 42
            X.LYD.A02(r1, r0, r3)
        L_0x0031:
            android.content.Context r16 = r3.requireContext()
            X.0eM r1 = r3.A0Q
            com.instagram.common.session.UserSession r20 = X.AnonymousClass7TE.A0l(r1)
            X.0hq r18 = X.DbV.A0I(r3)
            X.0qQ.A07(r18)
            X.JiL r7 = r3.A07
            r14 = 0
            if (r7 != 0) goto L_0x0051
            java.lang.String r7 = "clipsPeopleTaggingViewModel"
        L_0x0049:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0051:
            X.28D r6 = r3.A04
            java.lang.Boolean r5 = r3.A0A
            X.LyM r0 = new X.LyM
            r19 = r6
            r21 = r3
            r22 = r7
            r23 = r5
            r15 = r0
            r17 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r3.A06 = r0
            r0 = 2131442447(0x7f0b3b0f, float:1.8506934E38)
            android.view.View r5 = r2.requireViewById(r0)
            r3.A00 = r5
            if (r5 == 0) goto L_0x007f
            r0 = 2131440495(0x7f0b336f, float:1.8502975E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131974936(0x7f135b18, float:1.958695E38)
            r5.setText(r0)
        L_0x007f:
            android.view.View r5 = r3.A00
            if (r5 == 0) goto L_0x0088
            r0 = 43
            X.LYD.A02(r5, r0, r3)
        L_0x0088:
            r0 = 2131427751(0x7f0b01a7, float:1.8477127E38)
            X.3oV r0 = X.DbV.A0T(r2, r0, r4)
            r3.A0N = r0
            r3.A02()
            r0 = 2131442444(0x7f0b3b0c, float:1.8506928E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r3.A02 = r0
            r0 = 2131442481(0x7f0b3b31, float:1.8507003E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r3.A01 = r0
            android.content.Context r9 = r3.requireContext()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.LyM r12 = r3.A06
            java.lang.String r7 = "clipsPeopleTaggingController"
            if (r12 == 0) goto L_0x0049
            r22 = 1
            java.lang.String r0 = "clips_people_tagging"
            X.0xG r10 = X.DbS.A0O(r0)
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x00db
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x00db
            X.0lg r6 = X.DbT.A0X(r1)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36313012185269849(0x81027e00070659, double:3.027833354503672E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            r23 = 1
            if (r0 != 0) goto L_0x00dd
        L_0x00db:
            r23 = 0
        L_0x00dd:
            X.K99 r8 = new X.K99
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r4
            r21 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.A08 = r8
            android.widget.ListView r0 = r3.A01
            if (r0 == 0) goto L_0x00f8
            r0.setAdapter(r8)
        L_0x00f8:
            r0 = 2131442501(0x7f0b3b45, float:1.8507044E38)
            android.view.View r1 = r2.requireViewById(r0)
            r3.A0L = r1
            if (r1 == 0) goto L_0x0108
            r0 = 44
            X.LYD.A02(r1, r0, r3)
        L_0x0108:
            android.view.View r5 = r3.A0L
            if (r5 == 0) goto L_0x011f
            android.content.Context r4 = r3.requireContext()
            boolean r1 = A06(r3)
            r0 = 2131976520(0x7f136148, float:1.9590163E38)
            if (r1 == 0) goto L_0x011c
            r0 = 2131975015(0x7f135b67, float:1.958711E38)
        L_0x011c:
            X.DbU.A12(r4, r5, r0)
        L_0x011f:
            r0 = 2131442492(0x7f0b3b3c, float:1.8507025E38)
            android.view.View r2 = r2.requireViewById(r0)
            r0 = 9
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            com.instagram.common.ui.base.IgTextView r2 = (com.instagram.common.ui.base.IgTextView) r2
            r3.A0M = r2
            if (r2 == 0) goto L_0x0144
            boolean r1 = A06(r3)
            r0 = 2131976520(0x7f136148, float:1.9590163E38)
            if (r1 == 0) goto L_0x0141
            r0 = 2131975015(0x7f135b67, float:1.958711E38)
        L_0x0141:
            r2.setText(r0)
        L_0x0144:
            com.instagram.common.ui.base.IgTextView r1 = r3.A0M
            if (r1 == 0) goto L_0x014d
            r0 = 45
            X.LYD.A02(r1, r0, r3)
        L_0x014d:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r1 = r3.A09
            if (r1 == 0) goto L_0x0159
            X.M3m r0 = new X.M3m
            r0.<init>(r3)
            r1.post(r0)
        L_0x0159:
            X.LyM r0 = r3.A06
            if (r0 == 0) goto L_0x0049
            X.JiL r0 = r0.A04
            X.2Fj r0 = r0.A0A
            java.util.List r0 = X.JTS.A0q(r0)
            r3.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K67.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final List A00() {
        C65707LyM lyM = this.A06;
        if (lyM == null) {
            0qQ.A0F("clipsPeopleTaggingController");
            throw AnonymousClass00P.createAndThrow();
        }
        List A0q = JTS.A0q(lyM.A04.A0A);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0q) {
            JTR.A1R(((Tag) next).getId(), next, A1C, JTS.A0q(lyM.A04.A09));
        }
        return A1C;
    }

    private final List A01() {
        C65707LyM lyM = this.A06;
        if (lyM == null) {
            0qQ.A0F("clipsPeopleTaggingController");
            throw AnonymousClass00P.createAndThrow();
        }
        List A0q = JTS.A0q(lyM.A04.A0A);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0q) {
            DbV.A1U(next, A1C, JTQ.A1S((Tag) next, JTS.A0q(lyM.A04.A09)) ? 1 : 0);
        }
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ef, code lost:
        if (A05() == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f4, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r15 = this;
            X.LyM r0 = r15.A06
            java.lang.String r3 = "clipsPeopleTaggingController"
            if (r0 == 0) goto L_0x0100
            X.JiL r0 = r0.A04
            X.2Fj r0 = r0.A0A
            java.util.List r0 = X.JTS.A0q(r0)
            boolean r0 = r15.A07(r0)
            X.3oV r2 = r15.A0N
            if (r0 == 0) goto L_0x00f8
            r8 = 0
            if (r2 == 0) goto L_0x00c4
            boolean r0 = A06(r15)
            if (r0 == 0) goto L_0x00e6
            r14 = 0
        L_0x0020:
            r13 = 1
        L_0x0021:
            android.view.View r9 = r2.getView()
            r0 = 2131427734(0x7f0b0196, float:1.8477093E38)
            android.widget.TextView r10 = X.AnonymousClass7TE.A0d(r9, r0)
            r0 = 2131435016(0x7f0b1e08, float:1.8491862E38)
            android.widget.TextView r7 = X.AnonymousClass7TE.A0d(r9, r0)
            r0 = 2131427735(0x7f0b0197, float:1.8477095E38)
            android.view.View r11 = r9.findViewById(r0)
            r0 = 2131435017(0x7f0b1e09, float:1.8491864E38)
            android.view.View r6 = r9.findViewById(r0)
            X.LyM r0 = r15.A06
            if (r0 == 0) goto L_0x0100
            X.JiL r1 = r0.A04
            X.2Fj r0 = r1.A06
            java.lang.Object r0 = r0.A02()
            r12 = 0
            if (r0 != 0) goto L_0x00e3
            X.2Fj r0 = r1.A09
            java.lang.Object r0 = r0.A02()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0060
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e3
        L_0x0060:
            X.0eM r0 = r15.A0Q
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.28D r1 = r15.A04
            java.lang.Boolean r0 = r15.A0A
            boolean r5 = X.LTZ.A0F(r1, r2, r0)
            boolean r4 = A06(r15)
            if (r6 == 0) goto L_0x00c4
            if (r11 == 0) goto L_0x00c4
            android.content.Context r3 = r6.getContext()
            r2 = 17
            r1 = 8
            if (r14 == 0) goto L_0x00df
            r10.getClass()
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.gravity = r2
            r0 = 64
            X.C64273LXz.A00(r11, r0, r15)
            X.1QE.A0H(r11, r10)
            r0 = 2131952353(0x7f1302e1, float:1.9541146E38)
            X.DbU.A12(r3, r10, r0)
        L_0x0099:
            if (r13 == 0) goto L_0x00d6
            r7.getClass()
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.gravity = r2
            if (r5 == 0) goto L_0x00cc
            r0 = 2131952284(0x7f13029c, float:1.9541006E38)
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            r0 = 2131952285(0x7f13029d, float:1.9541008E38)
        L_0x00b0:
            r7.setText(r0)
            X.DbU.A12(r3, r7, r0)
            r0 = 65
            X.C64273LXz.A00(r6, r0, r15)
            X.1QE.A0H(r6, r7)
            r6.setVisibility(r8)
        L_0x00c1:
            r9.setVisibility(r8)
        L_0x00c4:
            X.3oV r0 = r15.A0N
            if (r0 == 0) goto L_0x00cb
            r0.setVisibility(r8)
        L_0x00cb:
            return
        L_0x00cc:
            if (r12 == 0) goto L_0x00d2
            r0 = 2131961441(0x7f132661, float:1.955958E38)
            goto L_0x00b0
        L_0x00d2:
            r0 = 2131964480(0x7f133240, float:1.9565743E38)
            goto L_0x00ab
        L_0x00d6:
            r6.setVisibility(r1)
            if (r14 != 0) goto L_0x00c1
            r9.setVisibility(r1)
            goto L_0x00c4
        L_0x00df:
            r11.setVisibility(r1)
            goto L_0x0099
        L_0x00e3:
            r12 = 1
            goto L_0x0060
        L_0x00e6:
            boolean r0 = r15.A0F
            if (r0 != 0) goto L_0x00f1
            boolean r1 = r15.A05()
            r0 = 1
            if (r1 != 0) goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            r14 = 1
            r13 = 0
            if (r0 != 0) goto L_0x0021
            goto L_0x0020
        L_0x00f8:
            if (r2 == 0) goto L_0x00cb
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x0100:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K67.A02():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.K67 r13, boolean r14) {
        /*
            X.LyM r0 = r13.A06
            java.lang.String r12 = "clipsPeopleTaggingController"
            if (r0 == 0) goto L_0x014d
            X.JiL r0 = r0.A04
            X.2Fj r0 = r0.A0A
            java.util.List r11 = X.JTS.A0q(r0)
            int r1 = r11.size()
            r0 = 20
            if (r1 >= r0) goto L_0x0123
            java.lang.String r8 = r13.A0B
            java.lang.String r10 = "cameraSessionId"
            if (r8 == 0) goto L_0x0149
            X.28D r7 = r13.A03
            java.lang.String r9 = "entryPoint"
            if (r7 == 0) goto L_0x0151
            X.0eM r2 = r13.A0Q
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r6 = "clips_people_tagging"
            r5 = 3
            X.0qQ.A0B(r0, r5)
            X.27r r0 = X.27p.A01(r0)
            X.29Z r1 = r0.A0F
            r4 = 2
            X.0Aj r3 = X.JTR.A0d(r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x006f
            X.80P r0 = X.AnonymousClass80P.TAG_ANOTHER_PERSON
            X.JTO.A1O(r0, r3)
            java.lang.String r0 = "IG_CAMERA_TAG_ANOTHER_PERSON_TAP"
            java.lang.String r1 = X.JTS.A0j(r3, r1, r0)
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            r3.AAJ(r0, r8)
            X.JTP.A1E(r3)
            X.8fP r1 = X.C360948fP.CLIPS
            java.lang.String r0 = "capture_type"
            r3.A8M(r1, r0)
            X.JTS.A15(r7, r3, r4)
            X.28t r0 = X.28t.A06
            X.JTO.A1P(r0, r3)
            X.DbS.A1K(r3, r6)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            X.C51965G9l.A1A(r0, r3)
            X.AnonymousClass7TH.A0V(r3)
        L_0x006f:
            if (r14 == 0) goto L_0x008a
            java.lang.String r4 = r13.A0B
            if (r4 == 0) goto L_0x0149
            java.lang.String r3 = r13.getModuleName()
            X.28D r1 = r13.A03
            if (r1 == 0) goto L_0x0151
            com.instagram.common.session.UserSession r0 = X.DbW.A0S(r2, r5)
            X.27r r0 = X.27p.A01(r0)
            X.29Z r0 = r0.A0F
            r0.A0T(r1, r4, r3)
        L_0x008a:
            r6 = 0
            r13.A04(r6)
            android.widget.ListView r1 = r13.A01
            if (r1 == 0) goto L_0x0097
            r0 = 8
            r1.setVisibility(r0)
        L_0x0097:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1D(r11)
            androidx.fragment.app.FragmentActivity r8 = r13.requireActivity()
            X.0lg r5 = X.DbT.A0X(r2)
            X.LyM r4 = r13.A06
            if (r4 == 0) goto L_0x014d
            java.lang.String r7 = r13.A0O
            if (r14 == 0) goto L_0x0145
            boolean r1 = r13.A0I
            if (r1 == 0) goto L_0x012e
            boolean r0 = r13.A0G
            if (r0 == 0) goto L_0x012e
            java.lang.Integer r10 = X.AnonymousClass05K.A00
        L_0x00b5:
            java.lang.String r1 = r13.A0C
            r0 = 1
            X.DbW.A1O(r5, r0, r10)
            X.6Yo r3 = X.DbS.A0M(r8, r5)
            java.lang.String r0 = "PeopleTagSearch"
            r3.A0A = r0
            android.os.Bundle r8 = X.AnonymousClass7TE.A0a()
            r2 = 0
            java.lang.String r0 = "peopleTags"
            r8.putParcelableArrayList(r0, r9)
            r0 = 1802(0x70a, float:2.525E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.putBoolean(r0, r14)
            int r0 = r10.intValue()
            switch(r0) {
                case 0: goto L_0x0127;
                case 1: goto L_0x0124;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            r0 = 99
            java.lang.String r9 = X.C66579MXk.A00(r0)
        L_0x00e3:
            r0 = 1675(0x68b, float:2.347E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.putString(r0, r9)
            r0 = 1121(0x461, float:1.571E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.putString(r0, r7)
            java.lang.String r0 = "for_post_in_group_id"
            r8.putString(r0, r2)
            java.lang.String r0 = "media_id"
            r8.putString(r0, r1)
            r0 = 1378(0x562, float:1.931E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.putBoolean(r0, r6)
            X.AnonymousClass0Dg.A00(r8, r5)
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.Uc7 r1 = new X.Uc7
            r1.<init>()
            r1.setArguments(r8)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.tagging.search.PeopleTagSearchFragment"
            X.0qQ.A0C(r1, r0)
            r1.A05 = r4
            r3.A0B(r2, r1)
            r3.A04()
        L_0x0123:
            return
        L_0x0124:
            r0 = 2075(0x81b, float:2.908E-42)
            goto L_0x0129
        L_0x0127:
            r0 = 2074(0x81a, float:2.906E-42)
        L_0x0129:
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            goto L_0x00e3
        L_0x012e:
            if (r1 == 0) goto L_0x0145
            X.0lg r3 = X.AnonymousClass7TF.A0L(r2, r6)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313012185663071(0x81027e000d065f, double:3.027833354752347E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0145
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x00b5
        L_0x0145:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x00b5
        L_0x0149:
            X.0qQ.A0F(r10)
            goto L_0x0154
        L_0x014d:
            X.0qQ.A0F(r12)
            goto L_0x0154
        L_0x0151:
            X.0qQ.A0F(r9)
        L_0x0154:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K67.A03(X.K67, boolean):void");
    }

    private final boolean A05() {
        if (!this.A0I || !this.A0G) {
            return false;
        }
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A0Q, 0), 36313012185925218L)) {
            return true;
        }
        return false;
    }

    public static final boolean A06(K67 k67) {
        if (!k67.A0F || !k67.A05()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (X.C271174i4.A04(X.AnonymousClass7TE.A0l(r5), true) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (X.182.A06(r4, X.DbT.A0X(r5), 36313012185269849L) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r6.A0K == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (A05() == false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A07(java.util.List r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0H
            r3 = 1
            if (r0 == 0) goto L_0x0011
            X.0eM r0 = r6.A0Q
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.C271174i4.A04(r0, r3)
            if (r0 == 0) goto L_0x0081
        L_0x0011:
            X.0eM r5 = r6.A0Q
            X.0lg r2 = X.DbT.A0X(r5)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36313012184811092(0x81027e00000654, double:3.027833354213552E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0081
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x0045
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x0036
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.C271174i4.A04(r0, r3)
            if (r0 != 0) goto L_0x0045
        L_0x0036:
            X.0lg r2 = X.DbT.A0X(r5)
            r0 = 36313012185269849(0x81027e00070659, double:3.027833354503672E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0081
        L_0x0045:
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x004d
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x0081
        L_0x004d:
            r2 = 0
            if (r3 == 0) goto L_0x005e
            boolean r0 = A06(r6)
            if (r0 == 0) goto L_0x005f
            java.util.List r0 = r6.A00()
            boolean r2 = X.AnonymousClass7TE.A1b(r0)
        L_0x005e:
            return r2
        L_0x005f:
            boolean r0 = r6.A0F
            if (r0 != 0) goto L_0x006a
            boolean r1 = r6.A05()
            r0 = 1
            if (r1 != 0) goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            r1 = 20
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r6.A01()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x005e
        L_0x0079:
            int r0 = r7.size()
            if (r0 >= r1) goto L_0x005e
            r2 = 1
            return r2
        L_0x0081:
            r3 = 0
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K67.A07(java.util.List):boolean");
    }

    public final void DLa() {
        if (this.A0J) {
            LM3.A00(new LM3(requireContext()), 2131961825, 2131961798);
        } else {
            A03(this, true);
        }
    }

    public final void DLd() {
        String str;
        C358248ab A0H2;
        int i;
        if (this.A0P) {
            JRL A002 = C63504KyF.A00(AnonymousClass7TE.A0l(this.A0Q));
            0qQ.A07(A002);
            A0H2 = Dba.A0H(this);
            A0H2.A09(A002.Aoa());
            i = A002.AoZ();
        } else {
            String str2 = "clipsPeopleTaggingController";
            if (A06(this)) {
                C65707LyM lyM = this.A06;
                if (lyM != null) {
                    if (JTS.A0q(lyM.A04.A0A).size() >= 20) {
                        C49926FFc.A00(requireActivity());
                        return;
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass0eM r5 = this.A0Q;
            UserSession A0l = AnonymousClass7TE.A0l(r5);
            C65707LyM lyM2 = this.A06;
            if (lyM2 != null) {
                if (LTZ.A0G(this.A04, A0l, this.A0A, JTS.A0q(lyM2.A04.A09).size())) {
                    FragmentActivity requireActivity = requireActivity();
                    C65707LyM lyM3 = this.A06;
                    if (lyM3 != null) {
                        C49926FFc.A01(requireActivity, JTS.A0q(lyM3.A04.A09).size());
                        return;
                    }
                } else {
                    List A1P = 0sr.A1P(new AnonymousClass3QO[]{AnonymousClass3QO.CLOSE_FRIENDS, AnonymousClass3QO.FOLLOWERS_ONLY, AnonymousClass3QO.FAN_CLUB});
                    C60264JiL jiL = this.A07;
                    if (jiL != null) {
                        if (A1P.contains(jiL.A01)) {
                            C60264JiL jiL2 = this.A07;
                            if (jiL2 != null) {
                                int ordinal = jiL2.A01.ordinal();
                                if (ordinal != 1) {
                                    i = 2131955220;
                                    if (ordinal != 6) {
                                        i = 2131961797;
                                    }
                                } else {
                                    i = 2131955218;
                                }
                                A0H2 = DbW.A0U(this);
                                A0H2.A09(2131955219);
                            }
                        } else if (this.A0K) {
                            UserSession A0l2 = AnonymousClass7TE.A0l(r5);
                            ClipsSharingDraftViewModel clipsSharingDraftViewModel = this.A05;
                            if (clipsSharingDraftViewModel == null) {
                                str2 = "sharingViewModel";
                            } else {
                                C293505kq A092 = clipsSharingDraftViewModel.A07.A09();
                                if (A092 == null || (str = A092.A0T) == null) {
                                    str = "";
                                }
                                LSk.A03(LK1.A01(this, A0l2, str), PublicKeyCredentialControllerUtility.JSON_KEY_USER, "share_sheet", "tap_invite_collaborators");
                                A0H2 = Dba.A0H(this);
                                A0H2.A09(2131956229);
                                i = 2131956235;
                            }
                        } else {
                            if (!A05()) {
                                if (LTZ.A0E(requireActivity(), AnonymousClass7TE.A0l(r5), this, this.A0A)) {
                                    return;
                                }
                            }
                            if (this.A0J) {
                                LM3.A00(new LM3(requireContext()), 2131961825, 2131961798);
                                return;
                            } else {
                                A03(this, true);
                                return;
                            }
                        }
                    }
                    0qQ.A0F("clipsPeopleTaggingViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        A0H2.A08(i);
        Dba.A1L(A0H2);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0Q);
    }

    private final void A04(boolean z) {
        int A012 = DbW.A01(z ? 1 : 0);
        IgTextView igTextView = this.A0M;
        if (igTextView != null) {
            igTextView.setVisibility(A012);
        }
        View view = this.A0L;
        if (view != null) {
            view.setVisibility(A012);
        }
    }

    public final String getModuleName() {
        if (A06(this)) {
            return "clips_collab_tagging";
        }
        return "clips_people_tagging";
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, X.K67, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1708520925);
        K67.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            FragmentActivity requireActivity = requireActivity();
            AnonymousClass0eM r3 = this.A0Q;
            this.A07 = JTO.A0L(new C61530KBj(AnonymousClass7TE.A0l(r3)), requireActivity).A00(C60264JiL.class);
            String string = bundle2.getString(AnonymousClass000.A00(23));
            if (string == null) {
                string = "";
            }
            this.A0B = string;
            Object obj = bundle2.get(AnonymousClass000.A00(210));
            String A002 = AnonymousClass000.A00(1626);
            0qQ.A0C(obj, A002);
            this.A03 = (28D) obj;
            if (bundle2.containsKey("ClipsConstants.ARG_CLIPS_SHARE_SHEET_ENTRY_POINT ")) {
                28D serializable = bundle2.getSerializable("ClipsConstants.ARG_CLIPS_SHARE_SHEET_ENTRY_POINT ");
                0qQ.A0C(serializable, A002);
                this.A04 = serializable;
            }
            28D r1 = this.A03;
            if (r1 == null) {
                str = "entryPoint";
            } else {
                this.A0I = AnonymousClass7TF.A1W(r1, 28D.A0J);
                this.A0E = bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_VIDEO_PREVIEW_URL");
                this.A0D = bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY");
                this.A0O = bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_AUDIO_CLUSTER_ID_FOR_COLLAB_CHECK");
                Serializable serializable2 = bundle2.getSerializable("ARGS_PRESELECTED_AUDIENCE");
                0qQ.A0C(serializable2, "null cannot be cast to non-null type com.instagram.model.mediatype.MediaAudience");
                AnonymousClass3QO r9 = (AnonymousClass3QO) serializable2;
                List A0t = JTT.A0t(bundle2.getParcelableArrayList("ClipsConstants.ARG_CLIPS_PEOPLE_TAG_LIST"));
                List A0t2 = JTT.A0t(bundle2.getStringArrayList("ClipsConstants.ARG_CLIPS_COLLABORATOR_TAG_IDS"));
                List A0t3 = JTT.A0t(bundle2.getStringArrayList("ClipsConstants.ARG_CLIPS_CONFIRMED_COLLABORATOR_TAG_IDS"));
                List A0t4 = JTT.A0t(bundle2.getParcelableArrayList("ClipsConstants.ARG_CLIPS_FB_USER_TAG_LIST"));
                this.A0C = bundle2.getString(AnonymousClass000.A00(99));
                C60264JiL jiL = this.A07;
                str = "clipsPeopleTaggingViewModel";
                if (jiL != null) {
                    0qQ.A0B(r9, 0);
                    jiL.A01 = r9;
                    C60264JiL jiL2 = this.A07;
                    if (jiL2 != null) {
                        jiL2.A05 = A0t;
                        jiL2.A0A.A0B(A0t);
                        C60264JiL jiL3 = this.A07;
                        if (jiL3 != null) {
                            jiL3.A03 = A0t2;
                            jiL3.A09.A0B(A0t2);
                            C60264JiL jiL4 = this.A07;
                            if (jiL4 != null) {
                                jiL4.A02 = A0t3;
                                jiL4.A00.A0B(A0t3);
                                C60264JiL jiL5 = this.A07;
                                if (jiL5 != null) {
                                    jiL5.A06.A0B(bundle2.getString("ClipsConstants.ARG_CLIPS_COLLABORATOR_TAG_ID"));
                                    C60264JiL jiL6 = this.A07;
                                    if (jiL6 != null) {
                                        jiL6.A04 = A0t4;
                                        jiL6.A0C.Epw(A0t4);
                                        C60264JiL jiL7 = this.A07;
                                        if (jiL7 != null) {
                                            jiL7.A0A.A06(this, new C64320LZv(this, 14));
                                            String A003 = AnonymousClass000.A00(100);
                                            if (bundle2.containsKey(A003)) {
                                                this.A0A = DbU.A0g(bundle2, A003);
                                            }
                                            this.A0J = bundle2.getBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_EXCLUSIVE_REELS");
                                            this.A0H = bundle2.getBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_CONTENT_SCHEDULING_MEDIA");
                                            FragmentActivity requireActivity2 = requireActivity();
                                            FragmentActivity requireActivity3 = requireActivity();
                                            UserSession A0l = AnonymousClass7TE.A0l(r3);
                                            FragmentActivity requireActivity4 = requireActivity();
                                            String str2 = this.A0B;
                                            if (str2 == null) {
                                                str = "cameraSessionId";
                                            } else {
                                                this.A05 = JTO.A0L(new C60087JfT(requireActivity4, requireActivity3, A0l, str2), requireActivity2).A00(ClipsSharingDraftViewModel.class);
                                                this.A0F = bundle2.getBoolean("ARG_CLIPS_SHARE_SHEET_IS_ADD_COLLABORATORS_MODE");
                                                this.A0G = bundle2.getBoolean("ARG_CLIPS_IS_ADD_COLLABORATORS_MODE_ENABLED_FOR_EDITIONS", false);
                                                this.A0K = bundle2.getBoolean("ARG_CLIPS_SHARE_SHEET_IS_TRIAL_REEL");
                                                this.A0P = bundle2.getBoolean("ARG_CLIPS_SHARE_SHEET_HAS_CLIPS_SPINS");
                                                AnonymousClass0fD.A09(165231375, A022);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-2099721280, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(159522917);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_people_tagging_fragment, false);
        AnonymousClass0fD.A09(284484343, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1967009559);
        this.A09 = null;
        this.A00 = null;
        this.A0N = null;
        this.A01 = null;
        this.A0L = null;
        this.A0M = null;
        this.A02 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-546758757, A022);
    }
}
