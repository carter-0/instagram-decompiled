package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.ALf  reason: case insensitive filesystem */
public final class C39963ALf implements TextWatcher, View.OnFocusChangeListener, C358538b4, C252213ok, B21, C358588b9 {
    public View A00;
    public View A01;
    public RecyclerView A02;
    public IgSimpleImageView A03;
    public IgSimpleImageView A04;
    public C358598bA A05;
    public ConstrainedEditText A06;
    public User A07;
    public List A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public int A0C;
    public View A0D;
    public 2Fk A0E;
    public AnonymousClass4DH A0F;
    public AnonymousClass0iw A0G;
    public final Context A0H;
    public final View A0I;
    public final FragmentActivity A0J;
    public final UserSession A0K;
    public final TargetViewSizeProvider A0L;
    public final AnonymousClass80U A0M;
    public final AnonymousClass8MF A0N;
    public final boolean A0O;
    public final int A0P;
    public final int A0Q;
    public final ViewStub A0R;
    public final AnonymousClass2gO A0S = new C40058APo(this, 1);
    public final AnonymousClass3E6 A0T;
    public final C354538Mk A0U;
    public final C3499582p A0V;
    public final C358548b5 A0W;
    public final C358408ar A0X;
    public final C358418as A0Y;
    public final C358358am A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;

    public final void DMp() {
    }

    public final void DRH(User user, int i) {
        User user2 = user;
        if (!user.A2G()) {
            FragmentActivity fragmentActivity = this.A0J;
            UserSession userSession = this.A0K;
            AnonymousClass7TG.A1O(fragmentActivity, userSession);
            FGc.A02(fragmentActivity, fragmentActivity, userSession, user2, (C336187eD) null, "story", (C62320sa) null, (C62320sa) null);
            C49241Erk.A00(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession), userSession, user, "story", "click", AnonymousClass000.A00(84));
            return;
        }
        Integer num = AnonymousClass05K.A0C;
        int i2 = i;
        if (C45156CrJ.A00(user, num) != null) {
            this.A0B = true;
            C41147Ap7 ap7 = new C41147Ap7(this, user, i2);
            F8S.A01(this.A0J, C45156CrJ.A00(user, num), this.A0K, user, ap7);
            return;
        }
        A01(this, user, i2);
    }

    public final boolean Dbf(AnonymousClass05V r2) {
        return false;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r6.A0N.AFr() == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C39963ALf r6) {
        /*
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.WT5 r0 = X.C63414Kwa.A00(r3)
            java.util.List r5 = r0.A00()
            com.instagram.ui.text.ConstrainedEditText r0 = r6.A06
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r4 = 1
            if (r0 <= r4) goto L_0x004e
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36325270021485359(0x810da40000332f, double:3.035585259484705E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004e
        L_0x0026:
            X.8b5 r3 = r6.A0W
            if (r4 == 0) goto L_0x0031
            r0 = 1
            r3.A02 = r0
        L_0x002d:
            r3.A03(r5)
            return
        L_0x0031:
            java.util.List r2 = r6.A08
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0040
            X.8MF r0 = r6.A0N
            boolean r1 = r0.AFr()
            r0 = 1
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r3.A01 = r0
            java.util.List r0 = r3.A06
            r0.clear()
            if (r2 == 0) goto L_0x002d
            r0.addAll(r2)
            goto L_0x002d
        L_0x004e:
            r4 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39963ALf.A00(X.ALf):void");
    }

    public static void A01(C39963ALf aLf, User user, int i) {
        String str;
        String BiY;
        C337257fy r0 = aLf.A0W.A05;
        if (r0 == null || (BiY = r0.BiY()) == null || BiY.length() == 0) {
            str = "";
        } else {
            str = 00p.A0g(BiY, "@", "", false);
        }
        aLf.A07 = user;
        aLf.A06.getText().replace(0, aLf.A06.getText().length(), user.getUsername());
        aLf.A0M.E3H(new Object());
        C63414Kwa.A00(aLf.A0K).A01(user);
        aLf.A0Y.A02(user.getId(), str, i);
    }

    public static void A02(C39963ALf aLf, boolean z) {
        C15268UYi uYi = new C15268UYi();
        C331127Pr r2 = new C331127Pr(aLf.A0K);
        r2.A0U = new C72955PQn(1, aLf, z);
        C331157Pu A002 = r2.A00();
        uYi.A00 = new C17340VRt(aLf, A002);
        A002.A02(aLf.A0J, uYi);
    }

    public final void A03() {
        UserSession userSession = this.A0K;
        1Av A002 = 1Au.A00(userSession);
        0xa r5 = A002.A01;
        int i = r5.getInt("mention_sharing_privacy_toast_seen_count", 0);
        if (!this.A0A && i < 3 && this.A0c && !A002.A1h() && 182.A06(0Tu.A05, userSession, 36319265657199709L)) {
            1xC r6 = 1xC.A01;
            C310336ap r7 = new C310336ap();
            Context context = this.A0H;
            r7.A0D = context.getString(2131966135);
            r7.A01 = 5000;
            r7.A0J = true;
            r7.A02 = context.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size);
            r7.A0R = true;
            r7.A0D(context.getString(2131973150));
            r7.A0A(new WYE(this, 0));
            r7.A0L = true;
            r6.A00(new AnonymousClass3GP(r7.A00()));
            this.A0A = true;
            AnonymousClass7TG.A1L(r5.AR4(), r5, "mention_sharing_privacy_toast_seen_count", 0);
        }
    }

    public final void A04() {
        boolean z;
        SpannableStringBuilder A012;
        0qm r0;
        if (this.A00 == null) {
            View inflate = this.A0R.inflate();
            this.A00 = inflate;
            inflate.getClass();
            this.A0D = ((ViewStub) inflate.requireViewById(R.id.mention_sharing_privacy_message_stub)).inflate();
            View view = this.A00;
            view.getClass();
            this.A06 = (ConstrainedEditText) view.requireViewById(R.id.mention_composer);
            View view2 = this.A00;
            view2.getClass();
            this.A03 = (IgSimpleImageView) view2.requireViewById(R.id.valentines_left_heart);
            View view3 = this.A00;
            view3.getClass();
            this.A04 = (IgSimpleImageView) view3.requireViewById(R.id.valentines_right_heart);
            this.A06.A07.add(this);
            this.A06.addTextChangedListener(new C39962ALe(false));
            this.A06.addTextChangedListener(this);
            UserSession userSession = this.A0K;
            if (!C346897vw.A01(userSession)) {
                this.A06.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
            }
            ConstrainedEditText constrainedEditText = this.A06;
            Context context = this.A0H;
            constrainedEditText.setHint(AnonymousClass91M.A02(context, userSession));
            this.A06.setOnFocusChangeListener(this);
            ConstrainedEditText constrainedEditText2 = this.A06;
            AnonymousClass7TF.A1H(context, userSession);
            if (C346897vw.A01(userSession)) {
                A012 = AJB.A00(AnonymousClass7TF.A0A(context), AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_orange), AnonymousClass7TF.A03(context, R.attr.igds_color_text_on_white));
            } else if (AnonymousClass7TF.A0R(0Tu.A05, userSession, 36323028048554742L).booleanValue()) {
                A012 = AnonymousClass91M.A00(context, "");
            } else {
                A012 = AnonymousClass91M.A01(context, "");
            }
            constrainedEditText2.setText(A012);
            ConstrainedEditText constrainedEditText3 = this.A06;
            boolean A013 = C346897vw.A01(userSession);
            AnonymousClass0qq A002 = AnonymousClass0qo.A00(context);
            if (A013) {
                r0 = 0qm.A0Y;
            } else {
                r0 = 0qm.A0V;
            }
            constrainedEditText3.setTypeface(A002.A02(r0));
            C306486Mi.A00(this.A06, (float) AnonymousClass7TH.A01(context), false);
            if (182.A06(0Tu.A05, userSession, 36323028048554742L)) {
                this.A03.setVisibility(0);
                this.A04.setVisibility(0);
            }
            View view4 = this.A00;
            view4.getClass();
            this.A01 = view4.requireViewById(R.id.mention_tagging_container);
            View view5 = this.A00;
            view5.getClass();
            RecyclerView recyclerView = (RecyclerView) view5.requireViewById(R.id.mention_tagging_recycler_view);
            this.A02 = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            if (this.A0O) {
                View view6 = this.A00;
                view6.getClass();
                this.A05 = new C358598bA(view6.requireViewById(R.id.mention_sharing_privacy_setting_toggle), userSession, 2131966133);
            }
        }
        View view7 = this.A0I;
        View view8 = this.A00;
        view8.getClass();
        C294975nL.A04((C295005nO) null, new View[]{view7, view8, this.A01}, false);
        if (this.A0b || (this.A0a && !1Au.A00(this.A0K).A1h())) {
            z = false;
        } else {
            z = true;
        }
        UserSession userSession2 = this.A0K;
        1Am A014 = 1Al.A01(userSession2);
        1An r8 = 1An.A34;
        Class<?> cls = getClass();
        boolean z2 = A014.A04(r8, cls).getBoolean("has_seen_mention_sharing_enabled_nux", false);
        if (z && !z2 && 182.A06(0Tu.A05, userSession2, 36319265657199709L)) {
            View view9 = this.A0D;
            view9.getClass();
            C294975nL.A01(view9, 1).A0C(750);
            View view10 = this.A0D;
            view10.getClass();
            C294975nL.A02(view10, 3000);
            0xY AR4 = 1Al.A01(userSession2).A04(r8, cls).AR4();
            AR4.E5T("has_seen_mention_sharing_enabled_nux", true);
            AR4.apply();
        }
        this.A06.requestFocus();
        this.A02.setAdapter(this.A0W);
        C358598bA r02 = this.A05;
        if (r02 != null) {
            r02.A01.setChecked(1Au.A00(r02.A00).A1h());
        }
        C358418as r03 = this.A0Y;
        r03.A00 = false;
        r03.A01 = false;
        r03.A00();
        C358408ar r2 = this.A0X;
        r2.A01 = false;
        C358598bA r04 = this.A05;
        if (r04 != null) {
            r2.A00(r04.A01, AnonymousClass05K.A01, true);
        }
        this.A09 = 182.A06(0Tu.A05, userSession2, 36317453180998809L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b4, code lost:
        if (r6.A0N.AFr() == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d5, code lost:
        if (X.182.A06(X.AnonymousClass7TF.A0H(r3), r3, 36325270021485359L) != false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCS(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.A0c
            if (r0 == 0) goto L_0x00dc
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.1Av r0 = X.1Au.A00(r3)
            boolean r0 = r0.A1h()
            if (r0 != 0) goto L_0x00dc
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319265657199709(0x81082e00001c5d, double:3.031788075332826E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00dc
            X.1Am r2 = X.1Al.A01(r3)
            X.1An r1 = X.1An.A34
            java.lang.Class r0 = r6.getClass()
            X.0xa r2 = r2.A04(r1, r0)
            r1 = 0
            r0 = 3228(0xc9c, float:4.523E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x00dc
            androidx.fragment.app.FragmentActivity r0 = r6.A0J
            X.8ab r3 = new X.8ab
            r3.<init>((android.app.Activity) r0)
            r0 = 2131966124(0x7f1338ac, float:1.9569077E38)
            r3.A09(r0)
            r0 = 2131966123(0x7f1338ab, float:1.9569075E38)
            r3.A08(r0)
            r1 = 3
            X.W5n r0 = new X.W5n
            r0.<init>(r6, r1)
            r3.A0g(r0)
            r2 = 2131963115(0x7f132ceb, float:1.9562974E38)
            r1 = 4
            X.AKK r0 = new X.AKK
            r0.<init>(r6, r1)
            r3.A0I(r0, r2)
            r2 = 2131968772(0x7f134304, float:1.9574448E38)
            r1 = 5
            X.AKK r0 = new X.AKK
            r0.<init>(r6, r1)
            r3.A0H(r0, r2)
            android.app.Dialog r0 = r3.A02()
            X.AnonymousClass0fN.A00(r0)
        L_0x0073:
            X.8Mk r1 = r6.A0U
            X.6nz r0 = X.C317876nz.A0a
            java.lang.String r0 = "mention_sticker_id"
            r1.DnE(r0)
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x00a7
            X.8MF r0 = r6.A0N
            boolean r0 = r0.AFr()
            if (r0 == 0) goto L_0x00a7
            X.8am r1 = r6.A0Z
            X.82p r0 = r6.A0V
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            java.lang.String r0 = r0.A05()
            X.0r6 r1 = r1.A00(r0)
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r0, r1)
            r6.A0E = r2
            androidx.fragment.app.FragmentActivity r1 = r6.A0J
            X.2gO r0 = r6.A0S
            r2.A06(r1, r0)
        L_0x00a7:
            X.8b5 r5 = r6.A0W
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x00b6
            X.8MF r0 = r6.A0N
            boolean r1 = r0.AFr()
            r0 = 1
            if (r1 != 0) goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            r5.A01 = r0
            com.instagram.ui.text.ConstrainedEditText r0 = r6.A06
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r4 = 1
            if (r0 <= r4) goto L_0x00da
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36325270021485359(0x810da40000332f, double:3.035585259484705E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00da
        L_0x00d7:
            r5.A02 = r4
            return
        L_0x00da:
            r4 = 0
            goto L_0x00d7
        L_0x00dc:
            r6.A04()
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39963ALf.DCS(java.lang.Object):void");
    }

    public final void DDW() {
        if (!this.A0B) {
            this.A0N.Dn8(new C387369m6((QP8) null, this.A07, AnonymousClass7TF.A0f(this.A06), this.A06.getTextSize(), AnonymousClass81W.A00(this.A0L)), "mention_sticker");
            View view = this.A00;
            if (view != null) {
                C315596kB.A08(new View[]{this.A0I, view, this.A01}, false);
                this.A06.clearFocus();
                this.A06.getText().replace(0, this.A06.getText().length(), "");
                this.A07 = null;
            }
            C354538Mk r1 = this.A0U;
            C317876nz r0 = C317876nz.A0a;
            r1.Dn9("mention_sticker_id");
            2Fk r12 = this.A0E;
            if (this.A09 && r12 != null) {
                r12.A08(this.A0S);
            }
        }
    }

    public final void DIL() {
        this.A0M.E3H(new C356378Tq((C387339m3) null));
    }

    public final void DIN(C387339m3 r3) {
        this.A0M.E3H(new C356378Tq(r3));
    }

    public final void DLf() {
        View currentFocus;
        Context context = this.A0H;
        UserSession userSession = this.A0K;
        if (C267044ar.A01(context, userSession)) {
            boolean A062 = 182.A06(0Tu.A05, userSession, 36325270021550896L);
            C48145EZn eZn = C48145EZn.STORY_POST_CAPTURE_FLOW;
            C49947FGb.A06(eZn, userSession, true);
            C48958Emw.A00(this.A0J, eZn, userSession, false, A062);
        } else {
            C48145EZn eZn2 = C48145EZn.STORY_POST_CAPTURE_FLOW;
            C49947FGb.A06(eZn2, userSession, false);
            C49947FGb.A03(eZn2, C48142EZk.SYSTEM_SHARE_SHEET, userSession, false);
            C46395DeI.A0S(this.A0F, eZn2, this.A0G, userSession, EWV.A0J, new Ai0());
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive() && (currentFocus = this.A0J.getCurrentFocus()) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public final void DMr(int i, boolean z) {
        if (this.A0C > i) {
            this.A06.clearFocus();
            this.A0M.E3H(new Object());
        }
        this.A0C = i;
        this.A06.DMr(i, z);
        int i2 = AnonymousClass81Y.A00;
        View view = this.A01;
        int i3 = 0;
        if (z) {
            i3 = i - i2;
        }
        0nA.A0T(view, i3);
    }

    public final void onFocusChange(View view, boolean z) {
        if (!this.A0B) {
            AnonymousClass3E6 r0 = this.A0T;
            if (z) {
                r0.A9Y(this);
                0nA.A0Q(view);
                return;
            }
            r0.EEH(this);
            0nA.A0N(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0045, code lost:
        if (r19 == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39963ALf(android.view.View r6, androidx.fragment.app.FragmentActivity r7, X.AnonymousClass4DH r8, com.instagram.common.session.UserSession r9, X.AnonymousClass3E6 r10, X.C354538Mk r11, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r12, X.C3499582p r13, X.AnonymousClass80U r14, X.AnonymousClass8MF r15, X.C358358am r16, X.C337257fy r17, boolean r18, boolean r19) {
        /*
            r5 = this;
            r5.<init>()
            r3 = 0
            r5.A0A = r3
            r5.A0B = r3
            r1 = 1
            X.APo r0 = new X.APo
            r0.<init>(r5, r1)
            r5.A0S = r0
            r5.A0J = r7
            android.content.Context r2 = r6.getContext()
            r5.A0H = r2
            r5.A0T = r10
            r5.A0V = r13
            r0 = r16
            r5.A0Z = r0
            r5.A0U = r11
            r5.A0G = r8
            r5.A0F = r8
            X.8b5 r0 = new X.8b5
            r4 = r17
            r0.<init>(r8, r9, r5, r4)
            r5.A0W = r0
            r0.setHasStableIds(r1)
            r5.A0M = r14
            r5.A0K = r9
            r5.A0N = r15
            r5.A0L = r12
            r0 = r18
            r5.A0b = r0
            r1 = r19
            r5.A0a = r1
            if (r18 != 0) goto L_0x0047
            r0 = 1
            if (r19 != 0) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r5.A0c = r0
            if (r0 == 0) goto L_0x005a
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319265657199709(0x81082e00001c5d, double:3.031788075332826E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 != 0) goto L_0x005a
            r3 = 1
        L_0x005a:
            r5.A0O = r3
            X.0iw r1 = r5.A0G
            X.8as r0 = new X.8as
            r0.<init>(r1, r9)
            r5.A0Y = r0
            X.8ar r0 = new X.8ar
            r0.<init>(r7, r9)
            r5.A0X = r0
            android.content.res.Resources r2 = r2.getResources()
            int r0 = X.AnonymousClass7TE.A0I(r2)
            r5.A0P = r0
            int r1 = X.AnonymousClass81W.A00(r12)
            int r0 = X.AnonymousClass7TE.A0G(r2)
            int r0 = r0 * 4
            int r1 = r1 - r0
            r5.A0Q = r1
            r0 = 2131442628(0x7f0b3bc4, float:1.8507301E38)
            android.view.View r0 = r6.requireViewById(r0)
            r5.A0I = r0
            r0 = 2131436106(0x7f0b224a, float:1.8494073E38)
            android.view.View r0 = r6.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r5.A0R = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39963ALf.<init>(android.view.View, androidx.fragment.app.FragmentActivity, X.4DH, com.instagram.common.session.UserSession, X.3E6, X.8Mk, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.82p, X.80U, X.8MF, X.8am, X.7fy, boolean, boolean):void");
    }

    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ConstrainedEditText constrainedEditText = this.A06;
        if (length > 0) {
            constrainedEditText.setHint("");
            this.A0W.A02(editable);
            this.A0Y.A01();
        } else {
            constrainedEditText.setHint(AnonymousClass91M.A02(this.A0H, this.A0K));
            this.A0W.A02 = false;
            A00(this);
        }
        AnonymousClass91M.A06(this.A06, this.A0P, this.A0Q);
    }

    public final void Diq(ConstrainedEditText constrainedEditText, int i, int i2) {
        AnonymousClass7TH.A0S(constrainedEditText, i, i2);
    }
}
