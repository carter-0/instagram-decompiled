package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class E30 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CommentPollCreationFragment";
    public int A00;
    public ViewGroup A01;
    public EditText A02;
    public ArrayList A03 = AnonymousClass7TE.A1C();
    public boolean A04;
    public boolean A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new C58710IwJ(this, 44));
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final String getModuleName() {
        return "comment_poll_creation";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.instagram.ui.widget.textview.IgAutoCompleteTextView} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ba, code lost:
        if (r5 < r12.A03.size()) goto L_0x00bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r3 = 0
            r4 = r26
            X.0qQ.A0B(r4, r3)
            r12 = r25
            r0 = r27
            super.onViewCreated(r4, r0)
            boolean r0 = r12.A05
            r5 = 2131438954(0x7f0b2d6a, float:1.849985E38)
            android.view.View r2 = r4.findViewById(r5)
            if (r0 == 0) goto L_0x00d3
            X.0qQ.A07(r2)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r2 = (com.instagram.ui.widget.textview.IgAutoCompleteTextView) r2
            r0 = 10
            r2.setMaxLines(r0)
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "args_poll_question_text"
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            r1 = 1
            r2.A02 = r1
            r2.setDropDownAnchor(r5)
            android.content.Context r10 = X.AnonymousClass7TE.A0S(r2)
            int r0 = X.0nA.A09(r10)
            r2.setDropDownWidth(r0)
            int r0 = X.2Yu.A0C(r10)
            r2.setDropDownBackgroundResource(r0)
            r2.A07 = r1
            X.0eM r0 = r12.A09
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r0)
            X.0gy r0 = X.AnonymousClass07i.A00(r12)
            r11 = 0
            X.2lw r13 = new X.2lw
            r13.<init>(r10, r0, r11)
            r0 = 2904(0xb58, float:4.07E-42)
            java.lang.String r19 = X.AnonymousClass000.A00(r0)
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r11
            r21 = r3
            r22 = r1
            r23 = r3
            r24 = r3
            X.7eF r0 = X.C336207eF.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2.setAdapter(r0)
        L_0x0077:
            r12.A02 = r2
            r2.requestFocus()
            android.text.Editable r0 = r2.getText()
            int r0 = r0.length()
            r2.setSelection(r0)
            X.0nA.A0R(r2)
            r0 = 32768(0x8000, float:4.5918E-41)
            r2.sendAccessibilityEvent(r0)
            r0 = 2131437350(0x7f0b2726, float:1.8496596E38)
            android.view.ViewGroup r0 = X.DbS.A0E(r4, r0)
            r12.A01 = r0
            java.util.ArrayList r2 = r12.A03
            int r0 = r2.size()
            r6 = 3
            if (r0 < r6) goto L_0x00ad
            r1 = 4
            int r0 = r2.size()
            int r0 = r0 + 1
            int r6 = java.lang.Math.min(r1, r0)
        L_0x00ad:
            r5 = 0
        L_0x00ae:
            if (r5 >= r6) goto L_0x00ec
            r0 = 2
            if (r5 < r0) goto L_0x00bc
            java.util.ArrayList r0 = r12.A03
            int r0 = r0.size()
            r2 = 0
            if (r5 >= r0) goto L_0x00bd
        L_0x00bc:
            r2 = 1
        L_0x00bd:
            android.view.ViewGroup r1 = r12.A01
            if (r1 == 0) goto L_0x00d0
            java.util.ArrayList r0 = r12.A03
            java.lang.Object r0 = X.00k.A0O(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            com.instagram.common.ui.base.IgLinearLayout r0 = A00(r12, r0, r5, r2)
            r1.addView(r0)
        L_0x00d0:
            int r5 = r5 + 1
            goto L_0x00ae
        L_0x00d3:
            android.widget.EditText r2 = (android.widget.EditText) r2
            r1 = 1
            X.UsV r0 = new X.UsV
            r0.<init>(r2, r1)
            r2.addTextChangedListener(r0)
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "args_poll_question_text"
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            goto L_0x0077
        L_0x00ec:
            X.0eM r9 = r12.A09
            X.0lg r5 = X.AnonymousClass7TF.A0L(r9, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318840455633399(0x8107cb000319f7, double:3.031519176150142E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0184
            r0 = 2131430508(0x7f0b0c6c, float:1.8482719E38)
            android.view.ViewGroup r8 = X.DbS.A0E(r4, r0)
            r7 = 0
            r8.setVisibility(r3)
            X.0eM r6 = r12.A08
            java.lang.Object r0 = r6.getValue()
            int r5 = X.DbS.A05(r0)
        L_0x0114:
            if (r7 >= r5) goto L_0x0184
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r7)
            int r10 = X.AnonymousClass7TE.A0M(r0)
            android.view.LayoutInflater r1 = X.DbV.A0E(r12)
            r0 = 2131624599(0x7f0e0297, float:1.8876382E38)
            android.view.View r2 = r1.inflate(r0, r8, r3)
            r0 = 25
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r2, r0)
            r0 = 2131443425(0x7f0b3ee1, float:1.8508918E38)
            android.view.View r1 = r2.findViewById(r0)
            android.graphics.drawable.Drawable r11 = r1.getBackground()
            java.lang.String r0 = X.C273654mx.A00(r3)
            X.0qQ.A0C(r11, r0)
            android.graphics.drawable.GradientDrawable r11 = (android.graphics.drawable.GradientDrawable) r11
            android.content.Context r0 = r12.requireContext()
            int r0 = r0.getColor(r10)
            r11.setColor(r0)
            X.FNH r0 = new X.FNH
            r0.<init>(r12, r7, r3)
            X.AnonymousClass0fU.A00(r0, r1)
            int r0 = r12.A00
            if (r7 != r0) goto L_0x0179
            r0 = 2131441028(0x7f0b3584, float:1.8504056E38)
            android.view.View r1 = r2.findViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1
            android.content.Context r0 = r12.requireContext()
            r9.getValue()
            X.0qQ.A0A(r1)
            X.FC0.A01(r0, r1, r10)
        L_0x0179:
            java.util.List r0 = r12.A06
            r0.add(r2)
            r8.addView(r2)
            int r7 = r7 + 1
            goto L_0x0114
        L_0x0184:
            r0 = 2131430967(0x7f0b0e37, float:1.848365E38)
            android.view.View r2 = r4.findViewById(r0)
            android.os.Bundle r1 = r12.requireArguments()
            java.lang.String r0 = "args_should_show_delete_poll_button"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x01dd
            r2.setVisibility(r3)
            r0 = 35
            X.FP5.A01(r2, r0, r12)
        L_0x019f:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x01dc
            r0 = 2131429582(0x7f0b08ce, float:1.848084E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r4, r0)
            r2.setVisibility(r3)
            r0 = 2131427513(0x7f0b00b9, float:1.8476644E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r2, r0)
            r0 = 39
            X.FP5.A01(r1, r0, r12)
            r0 = 2131427514(0x7f0b00ba, float:1.8476646E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r2, r0)
            com.instagram.actionbar.ActionButton r2 = (com.instagram.actionbar.ActionButton) r2
            r0 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r2.setButtonResource(r0)
            android.content.Context r1 = r2.getContext()
            int r0 = X.2Yu.A0D(r1)
            android.graphics.ColorFilter r0 = X.DbV.A06(r1, r0)
            r2.setColorFilter(r0)
            r0 = 40
            X.FP5.A01(r2, r0, r12)
        L_0x01dc:
            return
        L_0x01dd:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x019f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E30.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(E30 e30) {
        Editable editable;
        StoryPollColorType storyPollColorType;
        Object hint;
        String obj;
        E30 e302 = e30;
        C60120Jg1 jg1 = (C60120Jg1) e302.A07.getValue();
        Context requireContext = e302.requireContext();
        EditText editText = e302.A02;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String A12 = DbV.A12(String.valueOf(editable));
        Context requireContext2 = e302.requireContext();
        ViewGroup viewGroup = e302.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                EditText editText2 = (EditText) viewGroup.getChildAt(i).findViewById(R.id.option_row_edit_text);
                0qQ.A0A(editText2);
                if (!FC0.A02(editText2)) {
                    hint = editText2.getText();
                } else if (!0qQ.A0K(editText2.getHint(), requireContext2.getString(2131969544))) {
                    hint = editText2.getHint();
                }
                if (!(hint == null || (obj = hint.toString()) == null)) {
                    A1C.add(new C272004jw(Float.valueOf(0.0f), 0, obj));
                }
            }
        }
        int A0M = AnonymousClass7TE.A0M(((List) e302.A08.getValue()).get(e302.A00));
        new 1E9(new 1hu((UserSession) null), 6, false);
        if (A0M == 2Yu.A0H(requireContext, R.attr.igds_color_gradient_pink)) {
            storyPollColorType = StoryPollColorType.PINK;
        } else if (A0M == 2Yu.A0H(requireContext, R.attr.igds_color_gradient_lavender)) {
            storyPollColorType = StoryPollColorType.LAVENDER;
        } else if (A0M == 2Yu.A0H(requireContext, R.attr.igds_color_gradient_purple)) {
            storyPollColorType = StoryPollColorType.PURPLE;
        } else if (A0M == R.color.activator_card_progress_bad) {
            storyPollColorType = StoryPollColorType.ORANGE;
        } else if (A0M == R.color.igds_active_badge) {
            storyPollColorType = StoryPollColorType.GREEN;
        } else if (A0M == 2Yu.A0H(requireContext, R.attr.igds_color_gradient_blue)) {
            storyPollColorType = StoryPollColorType.BLUE;
        } else {
            storyPollColorType = StoryPollColorType.BLACK;
        }
        C272024jy A002 = C44982CoL.A00(PollType.COMMENT_POLL, (C258223yf) null, storyPollColorType, false, true, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, 0, (String) null, (String) null, A12, (List) null, A1C);
        jg1.A00.A0B(C63013Kq3.A00(LQD.A00().A00, A002));
        String str = A002.A0D;
        if (str != null) {
            jg1.A01.Epw(str);
        }
        DbT.A1J(e302);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public E30() {
        0Yh A0z = DbS.A0z(C60120Jg1.class);
        this.A07 = DbS.A0I(new C58710IwJ(this, 45), new C58710IwJ(this, 46), new C58188Ins(10, (Object) null, this), A0z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (r4 == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.common.ui.base.IgLinearLayout A00(X.E30 r9, java.lang.String r10, int r11, boolean r12) {
        /*
            android.view.LayoutInflater r2 = X.DbV.A0E(r9)
            r1 = 2131624604(0x7f0e029c, float:1.8876392E38)
            android.view.ViewGroup r0 = r9.A01
            r6 = 0
            android.view.View r8 = r2.inflate(r1, r0, r6)
            r0 = 6
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r8, r0)
            com.instagram.common.ui.base.IgLinearLayout r8 = (com.instagram.common.ui.base.IgLinearLayout) r8
            r0 = 2131437337(0x7f0b2719, float:1.849657E38)
            android.view.View r7 = r8.findViewById(r0)
            android.widget.EditText r7 = (android.widget.EditText) r7
            r5 = r11
            if (r10 == 0) goto L_0x0093
            r7.setText(r10)
        L_0x0027:
            X.0qQ.A0A(r7)
            boolean r0 = X.FC0.A02(r7)
            r3 = 1
            r4 = r0 ^ 1
            r2 = 2131437883(0x7f0b293b, float:1.8497677E38)
            android.view.View r1 = r8.findViewById(r2)
            if (r11 <= r3) goto L_0x003d
            r0 = 0
            if (r4 != 0) goto L_0x003f
        L_0x003d:
            r0 = 8
        L_0x003f:
            r1.setVisibility(r0)
            android.content.Context r1 = r9.requireContext()
            if (r12 != 0) goto L_0x008f
            r0 = 2131231444(0x7f0802d4, float:1.807897E38)
        L_0x004b:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x009e
            r8.setBackground(r0)
            r0 = 2131437882(0x7f0b293a, float:1.8497675E38)
            android.view.View r1 = r8.findViewById(r0)
            r0 = 38
            X.FP5.A01(r1, r0, r7)
            android.view.View r0 = r8.findViewById(r2)
            X.FO5 r4 = new X.FO5
            r4.<init>(r5, r6, r7, r8, r9)
            X.AnonymousClass0fU.A00(r4, r0)
            if (r12 == 0) goto L_0x0077
            X.UsV r2 = new X.UsV
            r2.<init>(r7, r3)
        L_0x0073:
            r7.addTextChangedListener(r2)
            return r8
        L_0x0077:
            X.UsX r2 = new X.UsX
            r2.<init>()
            X.UsV r0 = new X.UsV
            r0.<init>(r7, r3)
            java.util.List r1 = r2.A00
            r1.add(r0)
            X.ET1 r0 = new X.ET1
            r0.<init>(r7, r9, r8, r11)
            r1.add(r0)
            goto L_0x0073
        L_0x008f:
            r0 = 2131231443(0x7f0802d3, float:1.8078967E38)
            goto L_0x004b
        L_0x0093:
            android.content.Context r0 = r9.requireContext()
            X.0qQ.A0A(r7)
            X.FC0.A00(r0, r7, r11, r12)
            goto L_0x0027
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E30.A00(X.E30, java.lang.String, int, boolean):com.instagram.common.ui.base.IgLinearLayout");
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        C59922Jbl.A02(DbV.A05(this), A002, 2131952333);
        C59904JbT.A01(FP5.A00(this, 36), r4, A002);
        DbX.A1A(FP5.A00(this, 37), DbX.A0M(), r4);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-46115024);
        E30.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("args_poll_options_text_list");
        if (stringArrayList == null) {
            stringArrayList = AnonymousClass7TE.A1C();
        }
        this.A03 = stringArrayList;
        List list = (List) this.A08.getValue();
        Context requireContext = requireContext();
        StoryPollColorType storyPollColorType = (StoryPollColorType) StoryPollColorType.A01.get(requireArguments.getString("args_selected_poll_type_color"));
        if (storyPollColorType == null) {
            storyPollColorType = StoryPollColorType.UNRECOGNIZED;
        }
        this.A00 = list.indexOf(Integer.valueOf(HWU.A00(requireContext, storyPollColorType)));
        this.A04 = requireArguments.getBoolean(AnonymousClass000.A00(254), false);
        this.A05 = requireArguments.getBoolean("args_caption_is_poll_question", false);
        AnonymousClass0fD.A09(2063787434, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r0 = -649791456(0xffffffffd944f820, float:-3.46511948E15)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0016
            boolean r1 = r4.A05
            r0 = 2131624603(0x7f0e029b, float:1.887639E38)
            if (r1 == 0) goto L_0x0019
        L_0x0016:
            r0 = 2131624425(0x7f0e01e9, float:1.887603E38)
        L_0x0019:
            android.view.View r1 = X.DbT.A0D(r5, r6, r0, r2)
            r0 = 1553066677(0x5c91eab5, float:3.28575478E17)
            X.AnonymousClass0fD.A09(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E30.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1580115329);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(408792230, A022);
    }
}
