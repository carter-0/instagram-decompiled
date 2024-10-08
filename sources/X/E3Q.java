package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class E3Q extends AnonymousClass4DH implements AnonymousClass0iw, AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatePasswordFragment";
    public CheckBox A00;
    public EditText A01;
    public UserSession A02;
    public ProgressButton A03;
    public int A04;
    public int A05;
    public C49634Ezr A06;
    public final TextWatcher A07 = new FKk(this, 10);
    public volatile boolean A08;

    public final void configureActionBar(2da r3) {
        r3.Eu4(true);
        Dbc.A0k(r3);
        r3.setTitle(requireActivity().getString(2131956880));
    }

    public final String getModuleName() {
        return "create_password";
    }

    public static void A00(E3Q e3q) {
        boolean z = true;
        e3q.A01.setEnabled(!e3q.A08);
        e3q.A03.setShowProgressBar(e3q.A08);
        boolean A1V = Dba.A1V(e3q.A01);
        ProgressButton progressButton = e3q.A03;
        if (A1V) {
            z = false;
        }
        progressButton.setEnabled(z);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        return this.A08;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1513898534);
        E3Q.super.onCreate(bundle);
        this.A02 = DbX.A0U(this);
        AnonymousClass0fD.A09(833851426, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(62035656);
        this.A05 = DbV.A0G(this).getAttributes().softInputMode;
        Dbb.A10(this);
        this.A04 = requireActivity().getResources().getDimensionPixelOffset(2Yu.A0H(requireActivity(), 0Pn.A01(this.A02)));
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_create_password, viewGroup, false);
        IgImageView A0b = DbT.A0b(inflate, R.id.user_avatar_image_view);
        UserSession userSession = this.A02;
        0eE r8 = AnonymousClass0t1.A01;
        DbU.A1S(this, A0b, r8.A01(userSession));
        DbU.A1H(DbU.A0G(inflate, R.id.username_text_view), r8.A01(this.A02));
        Dbb.A0m(requireActivity().getResources(), DbU.A0G(inflate, R.id.subtitle_textview), DbU.A0n(this.A02, r8), 2131956882);
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.create_button);
        this.A03 = progressButton;
        FP3.A00(progressButton, 5, this);
        EditText A0E = DbU.A0E(inflate, R.id.password_edittext);
        this.A01 = A0E;
        A0E.setTypeface(Typeface.DEFAULT);
        Dba.A10(this.A01);
        this.A01.setImeOptions(6);
        this.A01.setInputType(524416);
        FQe.A00(this.A01, this, 3);
        CheckBox checkBox = (CheckBox) inflate.requireViewById(R.id.remember_password_checkbox);
        this.A00 = checkBox;
        if (C319606qt.A01(this.A02).A0K(this.A02.A06)) {
            i = 8;
        }
        checkBox.setVisibility(i);
        this.A00.setChecked(true);
        this.A06 = new C49634Ezr(this.A03, (ScrollView) inflate.findViewById(R.id.scroll_view), this.A04);
        AnonymousClass0fD.A09(1670654861, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(212791645);
        super.onDestroyView();
        DbV.A0G(this).setSoftInputMode(this.A05);
        this.A01 = null;
        this.A00 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(73182095, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-2028163371);
        E3Q.super.onPause();
        this.A01.removeTextChangedListener(this.A07);
        DbV.A0G(this).setSoftInputMode(this.A05);
        AnonymousClass0fD.A09(1324876479, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(540239747);
        super.onResume();
        this.A01.addTextChangedListener(this.A07);
        Dbb.A10(this);
        AnonymousClass0fD.A09(-1387275431, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(249118226);
        E3Q.super.onStart();
        C49634Ezr ezr = this.A06;
        if (ezr != null) {
            ezr.A00.DmJ(getActivity());
        }
        AnonymousClass0fD.A09(-1565163683, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(230082091);
        E3Q.super.onStop();
        C49634Ezr ezr = this.A06;
        if (ezr != null) {
            ezr.A00.onStop();
        }
        AnonymousClass0fD.A09(609858429, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A00(this);
    }
}
