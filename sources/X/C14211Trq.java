package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.reels.interactive.view.AvatarView;
import java.util.ArrayList;

/* renamed from: X.Trq  reason: case insensitive filesystem */
public final class C14211Trq extends AnonymousClass3NK implements TextWatcher, View.OnFocusChangeListener, AnonymousClass8Z3 {
    public int A00 = -1;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public EditText A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public C252063oV A09;
    public AvatarView A0A;
    public C19477WaP A0B;
    public AnonymousClass17L A0C;
    public String A0D = "unknown";
    public String A0E;
    public boolean A0F;
    public CharSequence A0G = "";
    public final Context A0H;
    public final ViewStub A0I;
    public final FragmentActivity A0J;
    public final UserSession A0K;
    public final C314636ib A0L;
    public final C20963X6q A0M;
    public final AnonymousClass8Z5 A0N;
    public final String A0O;
    public final String A0P;
    public final ArrayList A0Q = new ArrayList();
    public final Runnable A0R = new C14210Trp(this);

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r1 == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqe(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            X.0qQ.A0B(r11, r1)
            android.widget.TextView r0 = r10.A06
            if (r0 != 0) goto L_0x0012
            java.lang.String r4 = "cancelButton"
        L_0x000a:
            X.0qQ.A0F(r4)
        L_0x000d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            r7 = 1
            if (r11 != r0) goto L_0x0019
            A01(r10, r7)
        L_0x0018:
            return r7
        L_0x0019:
            android.widget.TextView r0 = r10.A07
            java.lang.String r4 = "sendButton"
            if (r0 == 0) goto L_0x000a
            if (r11 != r0) goto L_0x0018
            r0.setEnabled(r1)
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto L_0x000a
            X.WaP r0 = r10.A0B
            if (r0 == 0) goto L_0x0035
            boolean r1 = r0.A08()
            r0 = 2131971030(0x7f134bd6, float:1.9579028E38)
            if (r1 != 0) goto L_0x0038
        L_0x0035:
            r0 = 2131971046(0x7f134be6, float:1.957906E38)
        L_0x0038:
            r2.setText(r0)
            boolean r0 = r10.A0F
            if (r0 == 0) goto L_0x004b
            android.widget.TextView r2 = r10.A07
            if (r2 == 0) goto L_0x000a
            android.content.Context r1 = r10.A0H
            r0 = 2131100697(0x7f060419, float:1.7813783E38)
            X.DbT.A17(r1, r2, r0)
        L_0x004b:
            android.widget.TextView r3 = r10.A07
            if (r3 == 0) goto L_0x000a
            java.lang.Runnable r2 = r10.A0R
            r0 = 750(0x2ee, double:3.705E-321)
            r3.postDelayed(r2, r0)
            X.WaP r0 = r10.A0B
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x00b9
        L_0x0060:
            X.WaP r0 = r10.A0B
            if (r0 == 0) goto L_0x0018
            java.lang.String r3 = "stickerModel"
            X.UNR r0 = r0.A00
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r10.A0E
            if (r0 == 0) goto L_0x0018
            android.widget.EditText r0 = r10.A05
            if (r0 != 0) goto L_0x007a
            java.lang.String r3 = "stickerAnswerView"
        L_0x0076:
            X.0qQ.A0F(r3)
            goto L_0x000d
        L_0x007a:
            java.lang.String r9 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r8 = r10.A0E
            java.lang.String r2 = "Required value was null."
            if (r8 == 0) goto L_0x00ce
            X.WaP r1 = r10.A0B
            if (r1 == 0) goto L_0x0076
            X.UNR r0 = r1.A00
            java.lang.String r6 = r0.A08
            if (r6 == 0) goto L_0x00c8
            java.lang.String r5 = r10.A0O
            java.lang.String r4 = r10.A0D
            java.lang.String r3 = r10.A0P
            int r2 = r10.A00
            boolean r0 = r1.A08()
            X.1Oj r1 = new X.1Oj
            r1.<init>()
            r1.A02 = r8
            r1.A03 = r6
            r1.A05 = r9
            r1.A04 = r5
            r1.A01 = r4
            r1.A06 = r3
            r1.A00 = r2
            r1.A07 = r0
            com.instagram.common.session.UserSession r0 = r10.A0K
            X.1Ou r0 = X.1Ou.A01(r0)
            r0.A0A(r1)
            return r7
        L_0x00b9:
            com.instagram.common.session.UserSession r0 = r10.A0K
            X.0xY r1 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r0 = "has_ever_responded_to_story_question"
            r1.E5T(r0, r7)
            r1.apply()
            goto L_0x0060
        L_0x00c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14211Trq.Dqe(android.view.View):boolean");
    }

    public final void DzC(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        if (r1 == false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            r2 = 0
            X.0qQ.A0B(r8, r2)
            android.widget.EditText r0 = r7.A05
            if (r0 == 0) goto L_0x00cc
            int r1 = r0.getLineCount()
            r0 = 3
            if (r1 <= r0) goto L_0x0047
            int r1 = r8.length()
            java.lang.CharSequence r0 = r7.A0G
            r8.replace(r2, r1, r0)
        L_0x0018:
            A00(r7)
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L_0x0095
            android.widget.EditText r0 = r7.A05
            if (r0 == 0) goto L_0x00cc
            java.lang.String r6 = X.AnonymousClass7TF.A0f(r0)
            int r5 = r6.length()
            r4 = 1
            int r5 = r5 - r4
            r3 = 0
            r1 = 0
        L_0x002f:
            if (r2 > r5) goto L_0x004f
            r0 = r5
            if (r1 != 0) goto L_0x0035
            r0 = r2
        L_0x0035:
            boolean r0 = X.Dbc.A13(r6, r0)
            if (r1 != 0) goto L_0x0042
            if (r0 != 0) goto L_0x003f
            r1 = 1
            goto L_0x002f
        L_0x003f:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0042:
            if (r0 == 0) goto L_0x004f
            int r5 = r5 + -1
            goto L_0x002f
        L_0x0047:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r8)
            r7.A0G = r0
            goto L_0x0018
        L_0x004f:
            java.lang.String r0 = X.Dba.A0c(r6, r5, r2)
            int r0 = r0.length()
            if (r0 > 0) goto L_0x005a
            r4 = 0
        L_0x005a:
            android.widget.TextView r0 = r7.A07
            java.lang.String r5 = "sendButton"
            if (r0 == 0) goto L_0x00ce
            if (r4 != 0) goto L_0x0064
            r3 = 8
        L_0x0064:
            r0.setVisibility(r3)
            android.widget.TextView r0 = r7.A07
            if (r0 == 0) goto L_0x00ce
            r0.setEnabled(r4)
            android.widget.TextView r2 = r7.A07
            if (r2 == 0) goto L_0x00ce
            X.WaP r0 = r7.A0B
            if (r0 == 0) goto L_0x007f
            boolean r1 = r0.A08()
            r0 = 2131969581(0x7f13462d, float:1.9576089E38)
            if (r1 != 0) goto L_0x0082
        L_0x007f:
            r0 = 2131973082(0x7f1353da, float:1.958319E38)
        L_0x0082:
            r2.setText(r0)
            boolean r0 = r7.A0F
            android.widget.TextView r2 = r7.A07
            if (r0 == 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00ce
            android.content.Context r1 = r7.A0H
            r0 = 2131099989(0x7f060155, float:1.7812347E38)
        L_0x0092:
            X.DbT.A17(r1, r2, r0)
        L_0x0095:
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L_0x00cb
            android.widget.EditText r0 = r7.A05
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = X.DbV.A12(r0)
            boolean r3 = X.C51966G9m.A1X(r0)
            java.util.ArrayList r0 = r7.A0Q
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r0)
        L_0x00af:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r2)
            android.view.View r1 = (android.view.View) r1
            int r0 = X.DbW.A00(r3)
            r1.setVisibility(r0)
            goto L_0x00af
        L_0x00c3:
            if (r2 == 0) goto L_0x00ce
            android.content.Context r1 = r7.A0H
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            goto L_0x0092
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.String r5 = "stickerAnswerView"
        L_0x00ce:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14211Trq.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass8Z5 r1 = this.A0N;
        AnonymousClass3E6 r0 = r1.A07;
        if (z) {
            r0.A9Y(r1);
            0nA.A0Q(view);
            return;
        }
        r0.EEH(r1);
        0nA.A0N(view);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r0 == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C14211Trq r5) {
        /*
            android.view.View r0 = r5.A01
            if (r0 == 0) goto L_0x0053
            java.util.ArrayList r0 = r5.A0Q
            boolean r0 = r0.isEmpty()
            r4 = 1
            r1 = r0 ^ 1
            r3 = 8388611(0x800003, float:1.1754948E-38)
            java.lang.String r2 = "stickerAnswerView"
            android.widget.EditText r0 = r5.A05
            if (r1 == 0) goto L_0x0020
            if (r0 != 0) goto L_0x0050
        L_0x0018:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0020:
            if (r0 == 0) goto L_0x0018
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = X.AnonymousClass000.A00(r4)
            X.0qQ.A0C(r1, r0)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.gravity = r4
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L_0x0018
            r0.setLayoutParams(r1)
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = X.DbV.A12(r0)
            boolean r1 = X.C51966G9m.A1X(r0)
            android.widget.EditText r0 = r5.A05
            if (r0 == 0) goto L_0x0018
            if (r1 == 0) goto L_0x0050
            r3 = 17
        L_0x0050:
            r0.setGravity(r3)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14211Trq.A00(X.Trq):void");
    }

    public static final void A01(C14211Trq trq, boolean z) {
        String str;
        View view = trq.A01;
        if (view != null) {
            view.setVisibility(8);
            if (z && trq.A01 != null) {
                EditText editText = trq.A05;
                if (editText != null) {
                    DbS.A1C(editText);
                }
                str = "stickerAnswerView";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            EditText editText2 = trq.A05;
            if (editText2 != null) {
                editText2.clearFocus();
                TextView textView = trq.A07;
                if (textView == null) {
                    str = "sendButton";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                textView.removeCallbacks(trq.A0R);
                trq.A0L.A00 = false;
                trq.A0M.DbC();
                return;
            }
            str = "stickerAnswerView";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DMp() {
        TextView textView = this.A08;
        if (textView == null) {
            0qQ.A0F("stickerQuestionView");
            throw AnonymousClass00P.createAndThrow();
        }
        textView.clearFocus();
        A01(this, false);
    }

    public C14211Trq(ViewStub viewStub, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass3E6 r6, C314636ib r7, C20963X6q x6q, String str, String str2) {
        C51974G9v.A1P(viewStub, r6, userSession, r7);
        C51972G9s.A1E(str, str2);
        this.A0I = viewStub;
        this.A0K = userSession;
        this.A0L = r7;
        this.A0M = x6q;
        this.A0O = str;
        this.A0P = str2;
        this.A0J = fragmentActivity;
        Context A0S = AnonymousClass7TE.A0S(viewStub);
        this.A0H = A0S;
        this.A0N = new AnonymousClass8Z5(A0S, r6, this);
    }
}
