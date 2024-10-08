package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

public final class E3B extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectWelcomeMessageSettingFragment";
    public Activity A00;
    public Context A01;
    public Bundle A02;
    public View A03;
    public EditText A04;
    public TextView A05;
    public Toast A06;
    public UserSession A07;
    public C49857F9x A08;
    public C50330FYk A09;
    public IgdsSwitch A0A;
    public String A0B = "business_setting";
    public boolean A0C;
    public final TextWatcher A0D = new FKk(this, 8);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.setTitle(A04().getString(2131960752));
        DbX.A1A(FP8.A00(this, 39), DbV.A0K(), r3);
    }

    public final String getModuleName() {
        return "direct_greeting_setting_fragment";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        if (r6.length() == 0) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r5 = 0
            r1 = r16
            X.0qQ.A0B(r1, r5)
            r0 = r17
            super.onViewCreated(r1, r0)
            r15.A01()
            java.lang.String r0 = r15.A0B
            java.lang.String r2 = "inbox_qp"
            boolean r0 = X.0qQ.A0K(r0, r2)
            r4 = 1
            if (r0 == 0) goto L_0x0020
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r15.A07()
            r0.setChecked(r4)
        L_0x0020:
            X.FYk r0 = r15.A06()
            java.lang.Boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0047
            java.lang.String r3 = A00(r15)
            android.widget.EditText r0 = r15.A05()
            r0.setText(r3)
            android.widget.EditText r1 = r15.A05()
            java.util.regex.Pattern r0 = X.0mp.A01
            int r0 = r3.length()
            r1.setSelection(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r15.A07()
            r0.setChecked(r4)
        L_0x0047:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r15.A07()
            boolean r0 = r0.isChecked()
            android.view.View r1 = r15.A03
            if (r1 == 0) goto L_0x00ca
            if (r0 != 0) goto L_0x00b8
            r0 = 8
            r1.setVisibility(r0)
        L_0x005a:
            X.F9x r7 = r15.A08
            if (r7 == 0) goto L_0x00cd
            X.FYk r0 = r15.A06()
            java.lang.Boolean r8 = r0.A03
            X.FYk r0 = r15.A06()
            java.lang.String r6 = r0.A05
            X.FYk r0 = r15.A06()
            java.lang.String r5 = r0.A04
            X.FYk r0 = r15.A06()
            java.lang.String r1 = r0.A05
            X.FYk r0 = r15.A06()
            java.lang.Boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = A00(r15)
            boolean r4 = X.0qQ.A0K(r0, r1)
        L_0x0086:
            java.lang.String r0 = r15.A0B
            boolean r3 = X.0qQ.A0K(r0, r2)
            r2 = 0
            if (r6 == 0) goto L_0x0096
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x0097
        L_0x0096:
            r0 = 1
        L_0x0097:
            java.lang.Boolean r9 = X.DbT.A0l(r0)
            int r0 = r5.length()
            if (r0 != 0) goto L_0x00a2
            r2 = 1
        L_0x00a2:
            java.lang.Boolean r10 = X.DbT.A0l(r2)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            if (r3 == 0) goto L_0x00b5
            java.lang.String r13 = "source_qp"
        L_0x00ae:
            r14 = 0
            java.lang.String r12 = "welcome_message_settings_screen_impression"
            X.C49857F9x.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x00b5:
            java.lang.String r13 = "source_business_options"
            goto L_0x00ae
        L_0x00b8:
            r1.setVisibility(r5)
            android.widget.EditText r0 = r15.A05()
            r0.requestFocus()
            android.widget.EditText r0 = r15.A05()
            X.0nA.A0Q(r0)
            goto L_0x005a
        L_0x00ca:
            java.lang.String r0 = "messageSection"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r0 = "directWelcomeMessageLogger"
        L_0x00cf:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3B.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final String A00(E3B e3b) {
        String string;
        UserSession userSession = e3b.A07;
        if (userSession != null) {
            User A0Q = AnonymousClass7TF.A0Q(userSession);
            if (A0Q.A0J() == 16V.A05) {
                string = DbW.A0h(e3b.A04(), A0Q.B8Q(), 2131960747);
            } else {
                string = e3b.A04().getString(2131960748);
            }
            0qQ.A07(string);
            return string;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(E3B e3b) {
        if (!0qQ.A0K(e3b.A0B, "inbox_qp")) {
            e3b.A01();
        } else if (e3b.A06().A03 != null) {
            String str = e3b.A06().A05;
            e3b.A05().setText(str);
            EditText A052 = e3b.A05();
            Pattern pattern = 0mp.A01;
            A052.setSelection(DbX.A05(str));
        }
    }

    public final Context A04() {
        Context context = this.A01;
        if (context != null) {
            return context;
        }
        0qQ.A0F("viewContext");
        throw AnonymousClass00P.createAndThrow();
    }

    public final EditText A05() {
        EditText editText = this.A04;
        if (editText != null) {
            return editText;
        }
        0qQ.A0F("messageItem");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C50330FYk A06() {
        C50330FYk fYk = this.A09;
        if (fYk != null) {
            return fYk;
        }
        0qQ.A0F("directWelcomeMessageSettingManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgdsSwitch A07() {
        IgdsSwitch igdsSwitch = this.A0A;
        if (igdsSwitch != null) {
            return igdsSwitch;
        }
        0qQ.A0F("messageToggle");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A07;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01() {
        A07().setChecked(DbX.A1a(A06().A03));
        String str = A06().A05;
        A05().setText(str);
        EditText A052 = A05();
        Pattern pattern = 0mp.A01;
        A052.setSelection(DbX.A05(str));
        if (A07().isChecked()) {
            View view = this.A03;
            if (view != null) {
                view.setVisibility(0);
            } else {
                0qQ.A0F("messageSection");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public static final void A02(E3B e3b) {
        e3b.A06().A02 = null;
        Toast toast = e3b.A06;
        if (toast != null) {
            toast.cancel();
        }
        e3b.A06 = null;
        e3b.A05().setEnabled(true);
        e3b.A07().setEnabled(true);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-3092669);
        E3B.super.onCreate(bundle);
        this.A00 = requireActivity();
        this.A02 = requireArguments();
        this.A01 = requireContext();
        08y r1 = 09i.A0A;
        Bundle bundle2 = this.A02;
        if (bundle2 != null) {
            UserSession A062 = r1.A06(bundle2);
            this.A07 = A062;
            C50330FYk A002 = C48834Ekw.A00(this, A062);
            0qQ.A0B(A002, 0);
            this.A09 = A002;
            Bundle bundle3 = this.A02;
            if (bundle3 != null) {
                this.A0B = bundle3.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "business_setting");
                UserSession userSession = this.A07;
                if (userSession != null) {
                    this.A08 = new C49857F9x(this, userSession);
                    AnonymousClass0fD.A09(1299708704, A022);
                    return;
                }
                str = "userSession";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        str = "bundle";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1021318755);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_welcome_message_setting, false);
        EditText editText = (EditText) A0D2.findViewById(R.id.welcome_message_message_edit_input);
        0qQ.A0B(editText, 0);
        this.A04 = editText;
        IgdsSwitch igdsSwitch = (IgdsSwitch) A0D2.findViewById(R.id.welcome_message_enable_toggle_switch);
        0qQ.A0B(igdsSwitch, 0);
        this.A0A = igdsSwitch;
        TextView A0d = AnonymousClass7TE.A0d(A0D2, R.id.welcome_message_edit_title);
        0qQ.A0B(A0d, 0);
        this.A05 = A0d;
        View findViewById = A0D2.findViewById(R.id.welcome_message_message_section);
        0qQ.A0B(findViewById, 0);
        this.A03 = findViewById;
        A05().addTextChangedListener(this.A0D);
        A05().setHint(A00(this));
        A07().A07 = new FdS(this, 9);
        AnonymousClass0fD.A09(-1947931894, A022);
        return A0D2;
    }
}
