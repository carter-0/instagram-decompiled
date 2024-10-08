package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;

/* renamed from: X.7b6  reason: invalid class name and case insensitive filesystem */
public final class C334337b6 {
    public static final C334337b6 A00 = new Object();

    public static final Editable A00(ComposerAutoCompleteTextView composerAutoCompleteTextView, String str, int i, int i2) {
        Editable replace;
        int i3 = new int[]{i, 0}[0];
        if (0 > i3) {
            i3 = 0;
        }
        if (i3 <= i2) {
            replace = composerAutoCompleteTextView.getText().replace(i3, i2, str);
        } else {
            replace = composerAutoCompleteTextView.getText().replace(composerAutoCompleteTextView.getText().length(), composerAutoCompleteTextView.getText().length(), str);
        }
        0qQ.A0A(replace);
        return replace;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0194  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(android.widget.TextView r17, X.C381459bn r18, X.C334397bC r19, X.C53335GmL r20, X.C52971GgO r21, X.0lr r22, java.lang.String r23, boolean r24) {
        /*
            r3 = 1
            r7 = r19
            if (r24 == 0) goto L_0x000e
            r0 = r23
            if (r23 == 0) goto L_0x000e
            r1 = r18
            r7.AK2(r1, r0, r3)
        L_0x000e:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r14 = r0.toString()
            X.0qQ.A07(r14)
            java.lang.CharSequence r0 = r17.getText()
            java.lang.String r6 = r0.toString()
            if (r24 == 0) goto L_0x01ec
            java.lang.String r15 = r7.EFM(r6)
        L_0x0027:
            r0 = r22
            long r17 = r0.A00()
            int r1 = r0.A00
            r6 = 0
            r0.A00 = r6
            X.7a4 r13 = r7.Bwp()
            r0 = r20
            boolean r0 = r0.A0d
            X.GlX r12 = new X.GlX
            r19 = r0
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r19)
            r2 = r21
            X.7a5 r0 = r2.A0B
            X.1Xl r15 = r0.A00
            if (r15 == 0) goto L_0x0123
            java.lang.String r0 = r12.A03
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            java.lang.String r9 = r0.toString()
            X.1Xj r8 = r15.BPf()
            boolean r0 = r8.A67()
            if (r0 == 0) goto L_0x008c
            com.instagram.common.session.UserSession r5 = r2.A0E
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318247752112180(0x81074100211834, double:3.0311443480566977E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x008c
            X.1Xy r0 = r8.A0C
            java.util.List r0 = r0.C0K()
            if (r0 == 0) goto L_0x01e9
            int r0 = r0.size()
        L_0x007a:
            int r5 = r0 + 1
            r0 = 3
            if (r5 <= r0) goto L_0x01d7
            r0 = 1063675494(0x3f666666, float:0.9)
        L_0x0082:
            X.05G r4 = r2.A0O
            X.7bj r1 = new X.7bj
            r1.<init>(r0)
            r4.Epw(r1)
        L_0x008c:
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x0123
            X.7a0 r9 = r2.A0C
            com.instagram.common.session.UserSession r0 = r9.A02
            X.7kd r8 = X.C340057kd.A00(r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            X.1Xj r4 = r15.BPf()
            java.lang.String r1 = "button"
            X.4DU r0 = r9.A03
            X.A7L r0 = X.C297085r9.A02(r0, r4, r5, r1, r3)
            r8.A01(r0)
            com.instagram.common.session.UserSession r3 = r2.A0E
            X.1Xj r0 = r15.BPf()
            boolean r0 = r0.CcK()
            if (r0 == 0) goto L_0x0129
            X.0Tu r4 = X.0Tu.A05
            r0 = 36311594845667969(0x81013400010281, double:3.0269370232322746E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x0129
        L_0x00c4:
            X.C52971GgO.A02(r12, r2, r15)
            X.7a8 r5 = r2.A07
            java.lang.String r8 = r2.A0J
            X.7a3 r3 = r2.A09
            X.0Ud r1 = r3.A0D
            java.lang.Object r0 = r1.getValue()
            r24 = 0
            if (r0 == 0) goto L_0x00d9
            r24 = 1
        L_0x00d9:
            r22 = 0
            X.GmL r4 = r2.A08
            int r6 = r4.A00
            X.1Xj r0 = r15.BPf()
            X.1iA r18 = r0.BR7()
            X.5OB r0 = r4.A01
            java.lang.String r4 = r12.A04
            r19 = r8
            r20 = r4
            r21 = r6
            r16 = r5
            r17 = r0
            r16.A02(r17, r18, r19, r20, r21, r22, r24)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r8 = r2.A0A
            r9 = 0
            java.lang.Object r0 = r1.getValue()
            X.7cr r0 = (X.C335377cr) r0
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = r0.A02
        L_0x0105:
            X.IkD r11 = new X.IkD
            r11.<init>(r2)
            X.IkC r10 = new X.IkC
            r10.<init>(r2)
            r13 = r9
            r14 = r9
            r16 = r0
            r8.A0F(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0116:
            r5.A03(r4)
            r3.A01()
            X.05G r1 = r2.A0P
            X.7cd r0 = X.C335237cd.A00
            r1.Epw(r0)
        L_0x0123:
            r7.D4r()
            return
        L_0x0127:
            r0 = 0
            goto L_0x0105
        L_0x0129:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36311594845733506(0x81013400020282, double:3.0269370232737205E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x0141
            r0 = 36312556918277285(0x810214000004a5, double:3.0275454418243615E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x00c4
        L_0x0141:
            long r10 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r0
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r8 = r0.A01
            r0 = 1209(0x4b9, float:1.694E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            r0 = 0
            long r8 = r8.getLong(r5, r0)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00c4
            X.0Tu r5 = X.0Tu.A06
            r0 = 36311594845733506(0x81013400020282, double:3.0269370232737205E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x01b8
            r0 = 37156019775995921(0x84013400040011, double:3.560954749397944E-306)
            double r0 = X.182.A00(r4, r3, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x0178:
            double r0 = r0.doubleValue()
        L_0x017c:
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r3
            int r3 = (int) r0
            long r0 = (long) r3
            X.7a8 r5 = r2.A07
            java.lang.String r10 = r2.A0J
            X.7a3 r3 = r2.A09
            X.0Ud r4 = r3.A0D
            java.lang.Object r4 = r4.getValue()
            r21 = 0
            if (r4 == 0) goto L_0x0196
            r21 = 1
        L_0x0196:
            X.GmL r8 = r2.A08
            int r9 = r8.A00
            X.1Xj r4 = r15.BPf()
            X.1iA r15 = r4.BR7()
            X.5OB r8 = r8.A01
            java.lang.String r4 = r12.A04
            r16 = r10
            r17 = r4
            r18 = r9
            r19 = r0
            r13 = r5
            r14 = r8
            r13.A02(r14, r15, r16, r17, r18, r19, r21)
            r2.A0J(r12, r0, r6)
            goto L_0x0116
        L_0x01b8:
            r0 = 36312556918277285(0x810214000004a5, double:3.0275454418243615E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x01d4
            r0 = 37156981848473626(0x8402140001001a, double:3.5615631679067996E-306)
            double r0 = X.182.A00(r4, r3, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            X.0qQ.A0A(r0)
            goto L_0x0178
        L_0x01d4:
            r0 = 0
            goto L_0x017c
        L_0x01d7:
            if (r5 != 0) goto L_0x01de
            r0 = 1058893988(0x3f1d70a4, float:0.615)
            goto L_0x0082
        L_0x01de:
            r4 = 1057384038(0x3f066666, float:0.525)
            r1 = 1035489772(0x3db851ec, float:0.09)
            float r0 = (float) r5
            float r0 = r0 * r1
            float r0 = r0 + r4
            goto L_0x0082
        L_0x01e9:
            r0 = 0
            goto L_0x007a
        L_0x01ec:
            int r5 = r6.length()
            int r5 = r5 - r3
            r4 = 0
            r2 = 0
        L_0x01f3:
            if (r4 > r5) goto L_0x0215
            r0 = r5
            if (r2 != 0) goto L_0x01f9
            r0 = r4
        L_0x01f9:
            char r1 = r6.charAt(r0)
            r0 = 32
            int r1 = X.0qQ.A00(r1, r0)
            r0 = 0
            if (r1 > 0) goto L_0x0207
            r0 = 1
        L_0x0207:
            if (r2 != 0) goto L_0x0210
            if (r0 != 0) goto L_0x020d
            r2 = 1
            goto L_0x01f3
        L_0x020d:
            int r4 = r4 + 1
            goto L_0x01f3
        L_0x0210:
            if (r0 == 0) goto L_0x0215
            int r5 = r5 + -1
            goto L_0x01f3
        L_0x0215:
            int r0 = r5 + 1
            java.lang.CharSequence r0 = r6.subSequence(r4, r0)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "\\n{2,}"
            X.11S r1 = new X.11S
            r1.<init>(r0)
            java.lang.String r0 = "\n"
            java.lang.String r15 = r1.A00(r2, r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334337b6.A04(android.widget.TextView, X.9bn, X.7bC, X.GmL, X.GgO, X.0lr, java.lang.String, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r32v0, types: [X.0r1, java.lang.Object] */
    public final C334347b7 A07(View view, AnonymousClass4DH r35, C53335GmL gmL, C52971GgO ggO, UserSession userSession, IgLinearLayout igLinearLayout, AnonymousClass4DU r40, C249763kK r41, C62320sa r42, C62320sa r43) {
        ViewStub viewStub;
        C335987ds r2;
        View view2 = view;
        Context context = view2.getContext();
        View findViewById = view2.findViewById(R.id.comment_composer_avatar);
        0qQ.A07(findViewById);
        CircularImageView circularImageView = (CircularImageView) findViewById;
        View findViewById2 = view2.findViewById(R.id.layout_comment_thread_edittext);
        0qQ.A07(findViewById2);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = (ComposerAutoCompleteTextView) findViewById2;
        View requireViewById = view2.requireViewById(R.id.layout_comment_thread_post_button_icon);
        0qQ.A07(requireViewById);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) requireViewById;
        IgImageView findViewById3 = view2.findViewById(R.id.comment_composer_animated_image_picker_button);
        0qQ.A07(findViewById3);
        IgImageView igImageView = findViewById3;
        IgImageView findViewById4 = view2.findViewById(R.id.comment_composer_imagine_create_button);
        0qQ.A07(findViewById4);
        IgImageView igImageView2 = findViewById4;
        IgImageView findViewById5 = view2.findViewById(R.id.visual_reply_icon);
        0qQ.A07(findViewById5);
        IgImageView igImageView3 = findViewById5;
        IgImageView findViewById6 = view2.findViewById(R.id.comment_composer_appreciation_gift_button);
        0qQ.A07(findViewById6);
        IgImageView igImageView4 = findViewById6;
        IgLinearLayout igLinearLayout2 = igLinearLayout;
        if (igLinearLayout != null) {
            viewStub = (ViewStub) igLinearLayout2.findViewById(R.id.carousel_comment_tooltip_banner_stub);
        } else {
            viewStub = null;
        }
        View findViewById7 = view2.findViewById(R.id.comment_composer_sticker_suggestion);
        0qQ.A07(findViewById7);
        View findViewById8 = view2.findViewById(R.id.story_comment_composer_background);
        0qQ.A07(findViewById8);
        View findViewById9 = view2.findViewById(R.id.story_comment_composer_divider);
        0qQ.A07(findViewById9);
        View findViewById10 = view2.findViewById(R.id.threads_crossposting_toggle_row);
        0qQ.A07(findViewById10);
        C334347b7 r13 = new C334347b7(view2, findViewById8, findViewById9, findViewById10, viewStub, igSimpleImageView, circularImageView, (CircularImageView) findViewById7, igImageView, igImageView2, igImageView3, igImageView4, composerAutoCompleteTextView);
        UserSession userSession2 = userSession;
        C317746nl r22 = new C317746nl(userSession2);
        0qQ.A0A(context);
        0qQ.A0B(context, 1);
        C334357b8 r8 = new C334357b8(r13);
        AnonymousClass4DU r29 = r40;
        C249763kK r28 = r41;
        C52971GgO ggO2 = ggO;
        C334407bD r14 = new C334407bD(new C334387bB(context, new C334377bA(r29, userSession2), r8, userSession2, r28, new J6O(r13, 30), new JJQ(r13, 38)), ggO2);
        AnonymousClass4DH r15 = r35;
        if (182.A06(0Tu.A05, userSession2, 36323053818358562L)) {
            C58188Ins ins = new C58188Ins(25, r28, userSession2);
            AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58680Ivp(new C58680Ivp(r15, 25), 26));
            C227862kA r3 = new C227862kA(new C58680Ivp(A002, 27), ins, new C58188Ins(23, (Object) null, A002), new 0Yh(C335987ds.class));
            Object value = r3.getValue();
            C227862kA r9 = new C227862kA(new C58680Ivp(r15, 32), new C58680Ivp(userSession2, 33), new C58188Ins(26, (Object) null, r15), new 0Yh(C335127cR.class));
            07U r21 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = r15.getViewLifecycleOwner();
            AnonymousClass0xx A003 = AnonymousClass07a.A00(viewLifecycleOwner);
            MHG mhg = new MHG(r9, value, viewLifecycleOwner, r21, (AnonymousClass4D7) null, 34);
            19B r92 = 19B.A00;
            1Eo.A05(r92, mhg, A003);
            AnonymousClass07Z viewLifecycleOwner2 = r15.getViewLifecycleOwner();
            1Eo.A05(r92, new MHG(value, r21, viewLifecycleOwner2, ggO2, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(viewLifecycleOwner2));
            r2 = (C335987ds) r3.getValue();
        } else {
            r2 = null;
        }
        0lr r82 = new C334417bE(r14, r2, ggO2);
        C334447bH r32 = new C334447bH(new C334427bF(r13));
        ? obj = new Object();
        07U r17 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner3 = r15.getViewLifecycleOwner();
        AnonymousClass0xx A004 = AnonymousClass07a.A00(viewLifecycleOwner3);
        AnonymousClass9KP r20 = new AnonymousClass9KP((Object) r82, (Object) r17, (Object) viewLifecycleOwner3, (Object) r13, (Object) r32, (AnonymousClass4D7) null, 2);
        19B r93 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        1Eo.A03(num, r93, r20, A004);
        UserSession userSession3 = ggO2.A0E;
        26t A005 = 26G.A00(userSession3);
        if (!ggO2.A03 && C334457bI.A00(userSession3) && A005.A00.getInt("key_avatar_comments_tooltip_view_count", 0) < 3) {
            ggO2.A03 = true;
            ggO2.A0P.Epw(new C334467bJ(new C389279pB(ggO2, A005)));
        }
        ComposerAutoCompleteTextView composerAutoCompleteTextView2 = r13.A0B;
        C53335GmL gmL2 = gmL;
        C62320sa r30 = r43;
        composerAutoCompleteTextView2.setOnFocusChangeListener(new C334477bK(context, gmL2, r13, ggO2, userSession2, r30));
        AnonymousClass0fU.A00(new C334487bL(r30), composerAutoCompleteTextView2);
        composerAutoCompleteTextView2.setDropDownWidth(0nA.A09(context));
        composerAutoCompleteTextView2.setDropDownAnchor(R.id.action_bar_wrapper);
        composerAutoCompleteTextView2.setDropDownVerticalOffset(-AnonymousClass3D4.A00(context));
        composerAutoCompleteTextView2.A02 = 1;
        composerAutoCompleteTextView2.A07 = true;
        composerAutoCompleteTextView2.setDropDownBackgroundResource(2Yu.A0H(context, R.attr.igds_color_primary_background));
        composerAutoCompleteTextView2.setSingleLine(true);
        C334497bM.A00(userSession2, composerAutoCompleteTextView2);
        boolean z = gmL2.A0d;
        if (z) {
            composerAutoCompleteTextView2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(60)});
        }
        composerAutoCompleteTextView2.setOnEditorActionListener(new C334507bN(r14, gmL2, ggO2, r82));
        composerAutoCompleteTextView2.addTextChangedListener(AnonymousClass4v0.A00(userSession2));
        IgImageView igImageView5 = r13.A08;
        int i = 8;
        if (gmL2.A0U) {
            i = 0;
        }
        igImageView5.setVisibility(i);
        if (!z) {
            IgSimpleImageView igSimpleImageView2 = r13.A04;
            igSimpleImageView2.getBackground().setColorFilter(1QE.A0B(context, (1QG) null).getDefaultColor(), PorterDuff.Mode.SRC_IN);
            igSimpleImageView2.setImageTintList(1QE.A0C(context, (1QG) null));
        }
        AnonymousClass07Z viewLifecycleOwner4 = r15.getViewLifecycleOwner();
        View view3 = view2;
        AnonymousClass4DH r19 = r15;
        C334407bD r202 = r14;
        C53335GmL gmL3 = gmL2;
        C334347b7 r222 = r13;
        C52971GgO ggO3 = ggO2;
        Context context2 = context;
        1Eo.A03(num, r93, new CommentComposerBinder$createAndBindViewHolder$$inlined$launchAndRepeatWithViewLifecycle$default$1(context2, view3, r17, viewLifecycleOwner4, r19, r202, gmL3, r222, ggO3, userSession2, r82, r29, r22, r28, (AnonymousClass4D7) null, r30, r42, obj), AnonymousClass07a.A00(viewLifecycleOwner4));
        return r13;
    }

    public final void A08(C334347b7 r3, CharSequence charSequence, C62320sa r5) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(r5, 2);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = r3.A0B;
        composerAutoCompleteTextView.setText(charSequence);
        composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.getText().length());
        composerAutoCompleteTextView.sendAccessibilityEvent(8);
        composerAutoCompleteTextView.post(new C336047dy(r3, r5));
    }

    public static final C381459bn A01(C335417cv r4) {
        String str;
        1Xj BPf;
        Integer num = r4.A04;
        1Xl r1 = r4.A03;
        if (r1 == null || (BPf = r1.BPf()) == null) {
            str = null;
        } else {
            str = BPf.A2n();
        }
        if (!r4.A0E || num == null || str == null || r4.A00 != null) {
            return null;
        }
        C381459bn r0 = new C381459bn(num.intValue(), str, "");
        return new C381459bn(r0.A00, r0.A01, "");
    }

    public static final CharSequence A02(Context context, C53335GmL gmL, C335417cv r8, UserSession userSession, User user, boolean z) {
        int i;
        String str;
        int i2;
        Object[] objArr;
        Integer num;
        if (!r8.A0E || (num = r8.A04) == null) {
            if (r8.A00 == null) {
                str = r8.A05;
                if (str == null || 0qQ.A0K(user.getUsername(), str)) {
                    if (AnonymousClass0BO.A00(userSession).CKD()) {
                        i2 = 2131956355;
                    }
                } else if (gmL.A0d || (z && !182.A06(0Tu.A05, userSession, 36323032344570629L))) {
                    i2 = 2131952286;
                    objArr = new Object[1];
                    objArr[0] = str;
                    return context.getString(i2, objArr);
                }
                i = 2131956369;
                return context.getString(i);
            } else if (AnonymousClass0BO.A00(userSession).CKD()) {
                i2 = 2131972161;
            } else {
                i = 2131972165;
                return context.getString(i);
            }
            objArr = new Object[1];
            str = user.getUsername();
            objArr[0] = str;
            return context.getString(i2, objArr);
        }
        int intValue = num.intValue();
        0qQ.A0B(context, 0);
        SpannableString spannableString = new SpannableString(context.getString(2131956424, new Object[]{002.A0O("❏ ", intValue + 1)}));
        int A04 = 00l.A04(spannableString, 10063, 0);
        if (A04 != -1) {
            spannableString.setSpan(C393839x5.A00(context, false, false), A04, A04 + 1, 33);
        }
        return spannableString;
    }

    public static final void A03(View view) {
        if (view.getVisibility() == 8) {
            C294975nL A01 = C294975nL.A01(view, 0);
            A01.A0U(0.75f, 1.0f, -1.0f);
            A01.A0V(0.75f, 1.0f, -1.0f);
            A01.A0F(true).A0E(C71392co.A04(90.0d, 1.0d)).A0H();
        }
        view.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(androidx.fragment.app.FragmentActivity r7, com.instagram.common.session.UserSession r8, X.C317966o8 r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            if (r9 == 0) goto L_0x00d4
            java.lang.String r1 = r9.A0a
            X.0qQ.A07(r1)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x00d0
            long r5 = r0.longValue()
        L_0x0013:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            X.7cV r0 = new X.7cV
            r0.<init>(r8)
            java.lang.String r4 = "comment"
            X.0wc r2 = r0.A00
            r0 = 677(0x2a5, float:9.49E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.0kJ r0 = r2.A00
            X.0Aj r3 = r2.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x006a
            X.N0W r2 = new X.N0W
            r2.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0 = 346(0x15a, float:4.85E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A05(r0, r1)
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A06(r0, r4)
            java.lang.String r0 = "composer_session_id"
            r2.A06(r0, r11)
            java.lang.String r0 = "input_text"
            r2.A06(r0, r10)
            java.lang.String r0 = "event_data"
            r3.AAK(r2, r0)
            java.lang.String r1 = "typeahead"
            java.lang.String r0 = "product"
            r3.AAJ(r0, r1)
        L_0x0067:
            r3.Cgf()
        L_0x006a:
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r5 = r0.A01(r7)
            X.7Pu r4 = X.C48943Emh.A00(r5)
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.K4b r3 = new X.K4b
            r3.<init>()
            r0 = 2649(0xa59, float:3.712E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r6 = new X.0eP
            r6.<init>(r0, r10)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r0 = 2647(0xa57, float:3.709E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r2 = new X.0eP
            r2.<init>(r0, r1)
            r0 = 549(0x225, float:7.7E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r11)
            X.0eP[] r0 = new X.0eP[]{r6, r2, r0}
            android.os.Bundle r0 = X.Q21.A00(r0)
            r3.setArguments(r0)
            if (r4 == 0) goto L_0x00ca
            X.7Pr r1 = new X.7Pr
            r1.<init>(r8)
            r0 = 1
            r1.A11 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0a = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L_0x00c4
            r0 = 1058642330(0x3f19999a, float:0.6)
        L_0x00c4:
            r1.A03 = r0
            r4.A0F(r3, r1)
        L_0x00c9:
            return
        L_0x00ca:
            if (r5 == 0) goto L_0x00c9
            r5.A0J(r3)
            return
        L_0x00d0:
            r5 = 0
            goto L_0x0013
        L_0x00d4:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1
            X.0qQ.A0B(r11, r0)
            X.7cV r0 = new X.7cV
            r0.<init>(r8)
            java.lang.String r5 = "comment"
            java.lang.String r4 = "surface"
            X.0wc r2 = r0.A00
            java.lang.String r1 = "contextual_recommendations_hint_click"
            X.0kJ r0 = r2.A00
            X.0Aj r3 = r2.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = "sticker_type"
            java.lang.String r0 = "GIPHY"
            X.0eP r2 = new X.0eP
            r2.<init>(r1, r0)
            java.lang.String r0 = "composer_session_id"
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r11)
            X.0eP r0 = new X.0eP
            r0.<init>(r4, r5)
            X.0eP[] r0 = new X.0eP[]{r2, r1, r0}
            java.util.LinkedHashMap r1 = X.0Yt.A06(r0)
            java.lang.String r0 = "extra_client_data"
            r3.A9H(r0, r1)
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334337b6.A05(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.6o8, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A06(AnonymousClass4DH r8, UserSession userSession, 1Xj r10, AnonymousClass4DU r11, boolean z) {
        Fragment A09;
        BottomSheetFragment A092;
        K7G k7g = new K7G();
        if (z) {
            k7g.A00(userSession, "avatar_tab");
        }
        0qQ.A0B(r8, 0);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r11, 4);
        AnonymousClass37D A01 = AnonymousClass37D.A00.A01(r8.getActivity());
        C331157Pu A002 = C48943Emh.A00(A01);
        if (A002 != null) {
            if (!(A01 == null || (A092 = A01.A09()) == null)) {
                A092.A0T(0);
            }
            C331127Pr r2 = new C331127Pr(userSession);
            r2.A11 = true;
            r2.A0a = true;
            r2.A03 = 0.8f;
            r2.A0T = k7g;
            View view = null;
            A002.A0F(k7g, r2);
            if (!(A01 == null || (A09 = A01.A09()) == null)) {
                view = A09.mView;
            }
            if (r10 != null && view != null) {
                C267154b3.A01(view, userSession, r10, r11, false);
            }
        } else if (A01 != null) {
            A01.A0J(k7g);
        }
    }
}
