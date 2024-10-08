package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LlO  reason: case insensitive filesystem */
public final class C64985LlO implements C66530MVi {
    public static final C70944OSr A08 = new C70944OSr(true);
    public MS0 A00;
    public final Activity A01;
    public final Context A02;
    public final UserSession A03;
    public final A99 A04;
    public final 1Av A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final boolean A07;

    public final boolean Esz() {
        return false;
    }

    public final void onDestroy() {
        this.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r0v38, types: [java.lang.Object, X.2jE] */
    public static final void A00(C64985LlO llO) {
        Object fmc;
        List list = llO.A06;
        list.clear();
        C70944OSr oSr = A08;
        list.add(oSr);
        Context context = llO.A02;
        C50989Fmc fmc2 = new C50989Fmc(context, (View.OnClickListener) new LY0(llO, 36), 2131974515);
        fmc2.A03 = R.drawable.instagram_new_story_pano_outline_24;
        fmc2.A02 = R.drawable.instagram_chevron_right_pano_outline_16;
        list.add(fmc2);
        C50989Fmc fmc3 = new C50989Fmc(context, (View.OnClickListener) new LY0(llO, 35), 2131971814);
        fmc3.A03 = R.drawable.instagram_reels_pano_outline_24;
        fmc3.A02 = R.drawable.instagram_chevron_right_pano_outline_16;
        list.add(fmc3);
        C50989Fmc fmc4 = new C50989Fmc(context, (View.OnClickListener) new LY0(llO, 34), 2131965365);
        fmc4.A03 = R.drawable.instagram_live_pano_outline_24;
        fmc4.A02 = R.drawable.instagram_chevron_right_pano_outline_16;
        list.add(fmc4);
        list.add(oSr);
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C46448DfA((CharSequence) context.getString(2131954546)));
        1Av r7 = llO.A05;
        LZJ.A01(llO, A1C, 5, 2131963040, r7.A1v());
        list.addAll(A1C);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        C46448DfA.A02(A1C2, 2131963029);
        A1C2.add(new FGF((CharSequence) context.getString(2131963028)));
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        String str = "left_side";
        DbV.A1V(str, context.getString(2131963030), A1C3);
        DbV.A1V("right_side", context.getString(2131963031), A1C3);
        if (r7.A1y()) {
            str = "right_side";
        }
        A1C2.add(new C70962OTj(new C71473OlH(0, llO, A1C3), str, A1C3));
        list.addAll(A1C2);
        UserSession userSession = llO.A03;
        if (182.A06(0Tu.A05, userSession, 36318874815175206L) || new Object().A01(userSession, false)) {
            list.add(oSr);
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            C62146Kaz kaz = new C62146Kaz(llO, context.getColor(2Yu.A06(llO.A01)));
            String A16 = AnonymousClass7TE.A16(context, 2131954564);
            String string = context.getString(2131954565);
            int i = 2131954562;
            if (new C227422jG(userSession).A00()) {
                i = 2131954563;
            }
            SpannableStringBuilder A0D = DbY.A0D(context, A16, i);
            AnonymousClass7AV.A05(A0D, kaz, A16);
            PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) new LZJ((Object) llO, 4), (CharSequence) string, (CharSequence) A0D, r7.A1m());
            pr9.A0C = true;
            C46448DfA.A02(A1C4, 2131962965);
            A1C4.add(pr9);
            list.addAll(A1C4);
        }
        if (llO.A07) {
            list.add(oSr);
            ArrayList A1C5 = AnonymousClass7TE.A1C();
            C46448DfA.A02(A1C5, 2131965519);
            if (C361358g6.A00.A02(context, userSession, r7)) {
                fmc = new FGF((CharSequence) context.getString(2131965517));
            } else {
                fmc = new C50989Fmc(context, (View.OnClickListener) new LY0(llO, 33), 2131965518);
            }
            A1C5.add(fmc);
            list.addAll(A1C5);
        }
    }

    public final List BRl() {
        return this.A06;
    }

    public final String getModuleName() {
        return "camera_settings";
    }

    public C64985LlO(Activity activity, Context context, UserSession userSession) {
        boolean A1Z = DbW.A1Z(userSession);
        this.A01 = activity;
        this.A02 = context;
        this.A03 = userSession;
        1Av A002 = 1Au.A00(userSession);
        this.A05 = A002;
        A99 a99 = new A99(activity);
        this.A04 = a99;
        this.A07 = C342017nu.A00(context, userSession).A00();
        A00(this);
        if (!DbT.A1a(A002.A01, AnonymousClass000.A00(794))) {
            a99.A00(A1Z);
        }
    }

    public final int C7q() {
        return 2131954567;
    }

    public final void onResume() {
        A00(this);
        MS0 ms0 = this.A00;
        if (ms0 != null) {
            ms0.DRL();
        }
    }

    public final void EiE(MS0 ms0) {
        this.A00 = ms0;
    }
}
