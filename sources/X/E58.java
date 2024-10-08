package X;

import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.fragment.app.FragmentActivity;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public abstract class E58 extends AnonymousClass4DH implements AnonymousClass4DR, G8C, G69 {
    public static final String __redex_internal_original_name = "SimplePasswordCreationFragment";
    public EEK A00;
    public InlineErrorMessageView A01;
    public ProgressButton A02;
    public SearchEditText A03;
    public boolean A04 = false;
    public boolean A05;
    public final TextWatcher A06 = new C48054ESy(this, 0);

    public final void DaH(boolean z) {
    }

    public abstract String getModuleName();

    public final void APF() {
        this.A03.setEnabled(false);
    }

    public final void ARL() {
        this.A03.setEnabled(true);
    }

    public final EXD B6Y() {
        if (this instanceof C47287DuG) {
            return EXD.SAC;
        }
        if (this instanceof C47288DuH) {
            return ((C47288DuH) this).A01.A01();
        }
        return null;
    }

    public final C46634DiE BzS() {
        C48156EZy eZy;
        if (this instanceof C47287DuG) {
            eZy = C48156EZy.A0D;
        } else if (this instanceof C47288DuH) {
            eZy = C48156EZy.A0B;
        } else if (this instanceof C47286DuF) {
            return C46634DiE.A0Y;
        } else {
            return null;
        }
        return eZy.A00;
    }

    public final boolean Ca3() {
        String A0I = 0nA.A0I(this.A03);
        if (TextUtils.isEmpty(A0I) || A0I.length() < 6 || !this.A05) {
            return false;
        }
        return true;
    }

    public final void EuV(String str, Integer num) {
        InlineErrorMessageView inlineErrorMessageView = this.A01;
        inlineErrorMessageView.getClass();
        inlineErrorMessageView.A04(str);
        ProgressButton progressButton = this.A02;
        progressButton.getClass();
        progressButton.setShowProgressBar(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0104, code lost:
        if (X.1AW.A06(X.0Tu.A06, 18298046739645556L) != false) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = -850252178(0xffffffffcd522e6e, float:-2.20391136E8)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            android.view.View r5 = X.DbT.A0C(r10, r11, r0)
            android.view.ViewGroup r1 = X.Dba.A04(r5)
            r0 = 2131628946(0x7f0e1392, float:1.88852E38)
            r3 = 1
            r10.inflate(r0, r1, r3)
            r0 = 2131442903(0x7f0b3cd7, float:1.850786E38)
            android.widget.TextView r7 = X.DbU.A0G(r5, r0)
            r6 = r9
            boolean r8 = r9 instanceof X.C47287DuG
            if (r8 != 0) goto L_0x0045
            boolean r0 = r9 instanceof X.C47288DuH
            if (r0 != 0) goto L_0x0045
            boolean r0 = r9 instanceof X.C47286DuF
            if (r0 != 0) goto L_0x0045
            r0 = r6
            X.DuE r0 = (X.C47285DuE) r0
            android.content.Context r2 = r0.requireContext()
            r1 = 2131952082(0x7f1301d2, float:1.9540597E38)
            com.instagram.user.model.User r0 = r0.A01
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "targetUser"
        L_0x003d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0045:
            android.content.Context r1 = r9.requireContext()
            r0 = 2131956884(0x7f131494, float:1.9550336E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0058
        L_0x0051:
            java.lang.String r0 = X.DbY.A0b(r2, r0, r1)
            X.0qQ.A07(r0)
        L_0x0058:
            r7.setText(r0)
            r0 = 2131428844(0x7f0b05ec, float:1.8479344E38)
            android.widget.TextView r2 = X.DbU.A0G(r5, r0)
            if (r8 != 0) goto L_0x00b8
            boolean r0 = r9 instanceof X.C47288DuH
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r9 instanceof X.C47286DuF
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = ""
        L_0x006e:
            r2.setText(r0)
            r0 = 2131437477(0x7f0b27a5, float:1.8496854E38)
            android.view.View r1 = r5.requireViewById(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = (com.instagram.ui.widget.searchedittext.SearchEditText) r1
            r9.A03 = r1
            r0 = 129(0x81, float:1.81E-43)
            r1.setInputType(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r9.A03
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r0)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r9.A03
            android.text.TextWatcher r0 = r9.A06
            r1.addTextChangedListener(r0)
            r0 = 2131437480(0x7f0b27a8, float:1.849686E38)
            android.view.View r0 = r5.findViewById(r0)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = (com.instagram.ui.widget.inlineerror.InlineErrorMessageView) r0
            r9.A01 = r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r9.A03
            r0.setAllowTextSelection(r3)
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r9.A03
            r7 = 0
            X.FPM.A00(r0, r7, r9)
            if (r8 != 0) goto L_0x00d0
            boolean r0 = r9 instanceof X.C47288DuH
            if (r0 != 0) goto L_0x0106
            boolean r0 = r9 instanceof X.C47286DuF
            if (r0 != 0) goto L_0x00d0
            X.DuE r6 = (X.C47285DuE) r6
            com.instagram.common.session.UserSession r0 = r6.A00
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "currentUserSession"
            goto L_0x003d
        L_0x00b8:
            android.content.Context r1 = r9.requireContext()
            r0 = 2131956883(0x7f131493, float:1.9550334E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x006e
        L_0x00c4:
            X.6qt r1 = X.C319606qt.A01(r0)
            java.lang.String r0 = r6.A03
            if (r0 != 0) goto L_0x00f3
            java.lang.String r0 = "targetUserId"
            goto L_0x003d
        L_0x00d0:
            r0 = 2131440639(0x7f0b33ff, float:1.8503267E38)
            android.view.View r1 = r5.requireViewById(r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r9 instanceof X.C47286DuF
            if (r0 == 0) goto L_0x0125
            r0 = 2131972568(0x7f1351d8, float:1.9582147E38)
        L_0x00e0:
            java.lang.String r0 = r9.getString(r0)
            r1.setText(r0)
            r1.setVisibility(r7)
            r1.setChecked(r3)
            r9.A04 = r3
            X.FQO.A00(r1, r9, r7)
            goto L_0x0106
        L_0x00f3:
            boolean r0 = r1.A0K(r0)
            if (r0 != 0) goto L_0x0106
            X.0Tu r2 = X.0Tu.A06
            r0 = 18298046739645556(0x4101fa00000474, double:1.8921717636277545E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 != 0) goto L_0x00d0
        L_0x0106:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = X.Dba.A0O(r5)
            r9.A02 = r0
            X.0wW r3 = r9.getSession()
            com.instagram.ui.widget.searchedittext.SearchEditText r2 = r9.A03
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r9.A02
            X.EEK r0 = new X.EEK
            r0.<init>(r2, r3, r9, r1)
            r9.A00 = r0
            r9.registerLifecycleListener(r0)
            r0 = 589764706(0x23271862, float:9.058251E-18)
            X.AnonymousClass0fD.A09(r0, r4)
            return r5
        L_0x0125:
            r0 = 2131971940(0x7f134f64, float:1.9580874E38)
            goto L_0x00e0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E58.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1418512526);
        super.onDestroyView();
        this.A03.removeTextChangedListener(this.A06);
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        unregisterLifecycleListener(this.A00);
        AnonymousClass0fD.A09(-528660448, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2001062649);
        super.onResume();
        this.A03.requestFocus();
        0nA.A0Q(this.A03);
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            Dbb.A0w(this);
        }
        AnonymousClass0fD.A09(973628855, A022);
    }
}
