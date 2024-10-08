package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.clips.audio.rename.api.RenameOriginalAudioApiHandler;
import com.instagram.igds.components.form.IgFormField;

public final class K61 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "RenameOriginalAudioFragment";
    public RenameOriginalAudioApiHandler A00;
    public IgFormField A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final 0mM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final LWP A0D = new LWP((Object) this, 0);
    public final 0mK A0E;

    public final String getModuleName() {
        return "rename_original_audio";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgFormField igFormField = (IgFormField) view.requireViewById(R.id.input_field);
        igFormField.setLabelText(getString(2131972147));
        String str = this.A05;
        if (str == null) {
            0qQ.A0F("originalTitle");
            throw AnonymousClass00P.createAndThrow();
        }
        igFormField.setText(str);
        igFormField.setMaxLength(50);
        igFormField.setRuleChecker(new C50497Fcj(this, 0));
        igFormField.A0G(this.A0D);
        this.A01 = igFormField;
        igFormField.A0E();
        0lg A0X = DbT.A0X(this.A0C);
        Long A0i = C51972G9s.A0i(this.A02);
        String str2 = this.A06;
        0qQ.A0B(A0X, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0X), "instagram_rename_audio_page_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("containermodule", "rename_original_audio");
            A0e.A9F("container_id", A0i);
            A0e.AAJ("media_tap_token", str2);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public static final String A00(K61 k61) {
        IgFormField igFormField = k61.A01;
        if (igFormField != null) {
            return DbV.A12(igFormField.getText().toString());
        }
        0qQ.A0F("inputField");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(K61 k61) {
        IgFormField igFormField = k61.A01;
        if (igFormField == null) {
            0qQ.A0F("inputField");
            throw AnonymousClass00P.createAndThrow();
        }
        0nA.A0N(igFormField);
        C358248ab A0U = DbW.A0U(k61);
        A0U.A09(2131975992);
        A0U.A08(2131961521);
        Dba.A1M(A0U);
        Dba.A0t(LV3.A00(k61, 21), A0U, 2131954722);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final boolean onBackPressed() {
        if (this.A08) {
            return false;
        }
        String A002 = A00(this);
        String str = this.A05;
        if (str == null) {
            0qQ.A0F("originalTitle");
            throw AnonymousClass00P.createAndThrow();
        }
        A002.contentEquals(str);
        0lg A0X = DbT.A0X(this.A0C);
        Long A0i = C51972G9s.A0i(this.A02);
        String str2 = this.A06;
        0qQ.A0B(A0X, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(A0X), "instagram_rename_audio_exit_rename_page_unsuccessful");
        if (!A0e.isSampled()) {
            return false;
        }
        A0e.AAJ("containermodule", "rename_original_audio");
        A0e.A9F("container_id", A0i);
        A0e.AAJ("media_tap_token", str2);
        AnonymousClass7TH.A0V(A0e);
        return false;
    }

    public K61() {
        0Yh A0z = DbS.A0z(C60112Jft.class);
        this.A0B = DbS.A0I(new C20609Wvq(this, 45), new C20609Wvq(this, 46), new C58188Ins(0, (Object) null, this), A0z);
        C64889Ljp ljp = new C64889Ljp(this, 0);
        this.A0E = ljp;
        this.A0A = new 0mM(AnonymousClass7TF.A0D(), ljp, 300);
    }

    public static final void A02(K61 k61, CharSequence charSequence) {
        String obj = charSequence.toString();
        String str = k61.A05;
        if (str == null) {
            0qQ.A0F("originalTitle");
            throw AnonymousClass00P.createAndThrow();
        }
        DbU.A0L(k61, 2dZ.A0t).Ets(AnonymousClass7TF.A1P(obj.contentEquals(str) ? 1 : 0));
    }

    public static final void A03(K61 k61, String str) {
        if (C51966G9m.A1X(str)) {
            String str2 = k61.A05;
            if (str2 == null) {
                0qQ.A0F("originalTitle");
                throw AnonymousClass00P.createAndThrow();
            } else if (!str.contentEquals(str2)) {
                MGE.A01(k61, str, DbV.A0J(k61), 26);
            }
        }
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        C59922Jbl.A02(DbV.A05(this), A002, 2131972147);
        DbT.A1A(DbV.A05(this), C59904JbT.A00(new LY1(this, 36), r4, A002), 2131955705);
        r4.ARJ(true);
        r4.Eu5(new LY1(this, 35), true);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(25280910);
        K61.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("original_audio_current_title");
        if (string == null || 00l.A0W(string)) {
            string = C51967G9n.A0p(requireActivity(), 2131955706);
        }
        this.A05 = string;
        this.A04 = requireArguments.getString("original_audio_media_id");
        this.A02 = requireArguments.getString("audio_asset_id");
        this.A06 = requireArguments.getString(AnonymousClass000.A00(371));
        this.A07 = requireArguments.getBoolean("audio_page_via_notification");
        this.A00 = new RenameOriginalAudioApiHandler(AnonymousClass7TE.A0l(this.A0C));
        AnonymousClass0fD.A09(12208438, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-629311670);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_rename_original_audio, viewGroup, false);
        AnonymousClass0fD.A09(1820155017, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-15437734);
        K61.super.onPause();
        IgFormField igFormField = this.A01;
        if (igFormField == null) {
            0qQ.A0F("inputField");
            throw AnonymousClass00P.createAndThrow();
        }
        0nA.A0N(igFormField);
        AnonymousClass0fD.A09(2047808814, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1722046557);
        super.onResume();
        A02(this, A00(this));
        A03(this, A00(this));
        IgFormField igFormField = this.A01;
        if (igFormField != null) {
            igFormField.requestFocus();
            IgFormField igFormField2 = this.A01;
            if (igFormField2 != null) {
                0nA.A0M(igFormField2);
                AnonymousClass0fD.A09(1709218523, A022);
                return;
            }
        }
        0qQ.A0F("inputField");
        throw AnonymousClass00P.createAndThrow();
    }
}
