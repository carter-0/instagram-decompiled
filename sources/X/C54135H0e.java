package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import java.util.Map;

/* renamed from: X.H0e  reason: case insensitive filesystem */
public final class C54135H0e extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final List A0A = 0sr.A1P(new C54650HMh[]{C54650HMh.ONLY_ME, C54650HMh.CLOSE_FRIENDS, C54650HMh.FOLLOWERS_YOU_FOLLOW_BACK, C54650HMh.ALL_FOLLOWERS});
    public static final String __redex_internal_original_name = "MemuSettingsFragment";
    public C54678HOj A00;
    public String A01;
    public final String A02;
    public final String A03 = C51972G9s.A0n();
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C58672Ivh(this, 24));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C58672Ivh(this, 25));
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = DbS.A0I(new C58672Ivh(this, 29), new C58672Ivh(this, 30), new C58717IwQ(34, (Object) null, this), DbS.A0z(C53026GhH.class));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131966081);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String str = this.A03;
        0qQ.A0B(str, 0);
        C56512Hzj.A00(C54687HOs.A0I, (C56512Hzj) this.A07.getValue(), str);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHJ((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 47), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A01(C54135H0e h0e, Integer num) {
        Map map;
        C56025HrX hrX = new C56025HrX(h0e.requireActivity(), AnonymousClass7TE.A0l(h0e.A08));
        C54678HOj hOj = h0e.A00;
        if (hOj == null) {
            hOj = C54678HOj.SETTINGS;
        }
        String str = h0e.A03;
        String str2 = h0e.A01;
        if (str2 != null) {
            map = AnonymousClass7TF.A0w("ig_mifu_ifysession_id", str2);
        } else {
            map = null;
        }
        hrX.A01(new C56144HtW(hOj, (XSJ) null, num, str, (String) null, (String) null, (String) null, map, false, false, false), new C57572Icz(h0e, 2));
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public C54135H0e() {
        0eO r2 = 0eO.A02;
        this.A07 = AnonymousClass0eN.A00(r2, new C58672Ivh(this, 26));
        this.A08 = C227642jf.A02(this);
        this.A02 = "gen_ai_memu_settings";
        this.A04 = AnonymousClass0eN.A00(r2, new C58672Ivh(this, 23));
    }

    public static final void A00(DialogInterface.OnClickListener onClickListener, C54135H0e h0e, int i, int i2, int i3) {
        C358248ab A0H = Dba.A0H(h0e);
        A0H.A09(i);
        A0H.A08(i2);
        A0H.A0L(onClickListener, i3);
        A0H.A0C(I8Z.A00);
        A0H.A0g(new I9J(h0e, 1));
        DbT.A1V(A0H);
    }

    public final void onCreate(Bundle bundle) {
        Long l;
        String string;
        int A022 = AnonymousClass0fD.A02(509646177);
        C54135H0e.super.onCreate(bundle);
        AnonymousClass0eM r6 = this.A09;
        C53026GhH A0p = C51966G9m.A0p(r6);
        C54678HOj hOj = null;
        C51971G9r.A1Q(A0p, C318116oQ.A00(A0p), 44);
        C53026GhH A0p2 = C51966G9m.A0p(r6);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            l = Long.valueOf(bundle2.getLong("arg_mifu_content_id", -1));
        } else {
            l = null;
        }
        A0p2.A01 = l;
        Bundle bundle3 = this.mArguments;
        if (!(bundle3 == null || (string = bundle3.getString("arg_entry_point")) == null)) {
            hOj = C54678HOj.MEMU_IN_FEED_THREE_DOT_MENU;
            if (!string.equals(hOj.toString())) {
                hOj = C54678HOj.SETTINGS;
            }
        }
        this.A00 = hOj;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str = bundle4.getString("arg_mifu_session_id");
        }
        this.A01 = str;
        C53026GhH A0p3 = C51966G9m.A0p(r6);
        C56512Hzj hzj = (C56512Hzj) this.A07.getValue();
        0qQ.A0B(hzj, 0);
        A0p3.A00 = hzj;
        AnonymousClass0fD.A09(-1538828436, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-561014028);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 10), 1593098541);
        AnonymousClass0fD.A09(-940458047, A022);
        return A0H;
    }
}
