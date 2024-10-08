package X;

import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NKe  reason: case insensitive filesystem */
public final class C68486NKe extends C273374mT {
    public static final String __redex_internal_original_name = "ZeroVideoSettingDrawerFragment";
    public View A00;
    public C249883kW A01;
    public 1Av A02;
    public boolean A03 = false;

    public final String getModuleName() {
        return "zero_video_setting_drawer";
    }

    public static void A00(C70724OHt oHt, C68486NKe nKe) {
        oHt.A04.setBackgroundDrawable(nKe.requireContext().getDrawable(R.drawable.video_setting_drawer_auto_play_disabled_border));
        oHt.A02.setImageResource(R.drawable.unselected_check);
        oHt.A03.setBackgroundDrawable(nKe.requireContext().getDrawable(R.drawable.video_setting_drawer_auto_play_enabled_border));
        oHt.A01.setImageResource(R.drawable.selected_check);
        oHt.A07.setText(Html.fromHtml(DbV.A05(nKe).getString(2131977011)));
    }

    public static void A01(C70724OHt oHt, C68486NKe nKe) {
        oHt.A03.setBackgroundDrawable(nKe.requireContext().getDrawable(R.drawable.video_setting_drawer_auto_play_disabled_border));
        oHt.A01.setImageResource(R.drawable.unselected_check);
        oHt.A04.setBackgroundDrawable(nKe.requireContext().getDrawable(R.drawable.video_setting_drawer_auto_play_enabled_border));
        oHt.A02.setImageResource(R.drawable.selected_check);
        oHt.A07.setText(Html.fromHtml(DbV.A05(nKe).getString(2131977012)));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(380672087);
        C68486NKe.super.onCreate(bundle);
        this.A02 = 1Au.A00(getSession());
        this.A01 = AnonymousClass1Qz.A00(getSession());
        AnonymousClass0fD.A09(-796977416, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1588502844);
        this.A00 = DbT.A0C(layoutInflater, viewGroup, R.layout.zero_rating_video_settings_drawer);
        this.A03 = C238173Av.A01(getSession(), this.A02);
        1R7 C82 = this.A01.C82();
        String str = C82.A06;
        if (TextUtils.isEmpty(str)) {
            str = getString(2131976988);
        }
        String A0e = AnonymousClass7TF.A0e(DbV.A05(this), str, 2131977013);
        String str2 = C82.A07;
        if (!AnonymousClass5He.A00(str2)) {
            A0e = AnonymousClass7TF.A0i(TextUtils.concat(new CharSequence[]{" ", AnonymousClass7TF.A0e(DbV.A05(this), str2, 2131977014)}), AnonymousClass7TF.A0n(A0e));
        }
        C70724OHt oHt = new C70724OHt(this.A00);
        oHt.A06.setText(A0e);
        C71409Ok8.A01(oHt.A03, 51, oHt, this);
        C71409Ok8.A01(oHt.A04, 52, oHt, this);
        C71406Ok5.A00(oHt.A05, 17, this);
        if (C238173Av.A01(getSession(), this.A02)) {
            A00(oHt, this);
        } else {
            A01(oHt, this);
        }
        C67648Mrb mrb = new C67648Mrb(DbV.A05(this));
        oHt.A00.setImageDrawable(mrb);
        mrb.A01.setDuration(3000).start();
        View view = this.A00;
        AnonymousClass0fD.A09(-1265127498, A022);
        return view;
    }
}
