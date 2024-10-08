package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;

public final class H0X extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AvoidedTopicDetailFragment";
    public 2da A00;
    public final String A01 = "avoided_topic_detail_fragment";
    public final AnonymousClass0eM A02 = C58702IwB.A00(this, 30);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
        DbW.A1B(r2, 2131952408);
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public H0X() {
        0eO r3 = 0eO.A02;
        this.A03 = C51975G9x.A0r(this, "creator_ai_creator_fbid", r3, 37);
        this.A04 = C51975G9x.A0r(this, "creator_ai_entry_point_extra", r3, 38);
        C58702IwB A012 = C58702IwB.A01(this, 37);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, C58702IwB.A01(C58702IwB.A01(this, 34), 35));
        this.A08 = DbS.A0I(C58702IwB.A01(A002, 36), A012, new C58689Ivy(30, A002, (Object) null), DbS.A0z(C53028GhJ.class));
        this.A05 = C58702IwB.A00(this, 31);
        this.A06 = C58702IwB.A00(this, 32);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-385125130);
        H0X.super.onCreate(bundle);
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A05)).A9Y((C252213ok) this.A06.getValue());
        AnonymousClass0fD.A09(878233537, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        Object value;
        C53399GnW gnW;
        int A022 = AnonymousClass0fD.A02(524754749);
        0qQ.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        String str7 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AnonymousClass000.A00(2947));
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString(AnonymousClass000.A00(2948));
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString(AnonymousClass000.A00(2949));
        } else {
            str3 = null;
        }
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str4 = bundle5.getString(C66579MXk.A00(116));
        } else {
            str4 = null;
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            str5 = bundle6.getString(C66579MXk.A00(284));
        } else {
            str5 = null;
        }
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            str6 = bundle7.getString(C66579MXk.A00(283));
        } else {
            str6 = null;
        }
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            str7 = bundle8.getString(C66579MXk.A00(115));
        }
        int A042 = DbS.A04(0Tu.A05, DbT.A0X(this.A07), 36604468665717818L);
        C53028GhJ ghJ = (C53028GhJ) this.A08.getValue();
        String str8 = "";
        if (!(str5 == null || str7 == null)) {
            if (str6 == null) {
                str6 = str8;
            }
            ghJ.A00 = new C61037Jvb(str7, str6, str5, 7);
        }
        if (str4 != null) {
            list = AnonymousClass7TE.A1I(str4);
        } else {
            list = null;
        }
        ghJ.A03 = list;
        if (!(str == null && (str4 == null || str4.length() == 0))) {
            if (str2 != null) {
                str8 = str2;
            } else if (str4 != null) {
                str8 = str4;
            }
            if (str3 == null) {
                str3 = "REDIRECT";
            }
            ghJ.A05 = 00l.A0W(str8);
            ghJ.A01 = DbV.A12(str8);
            05G r5 = ghJ.A09;
            do {
                value = r5.getValue();
                gnW = (C53399GnW) value;
            } while (!r5.AIY(value, C53399GnW.A00((C61042Jvg) null, (C61082JwK) null, gnW, new C61046Jvk(str3, ((C61046Jvk) gnW.A04).A01, 7), (C54617HLa) null, (C54617HLa) null, 55)));
            ghJ.A02 = str;
            C53028GhJ.A00(ghJ);
            ghJ.A01();
        }
        ComposeView A012 = GTX.A01(this, AnonymousClass5PI.A04(new C59147J8d(this, str2, str4, str, A042, 1), 1513389523, true), false, false);
        AnonymousClass0fD.A09(989438118, A022);
        return A012;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1776336884);
        super.onDestroy();
        AnonymousClass0eM r2 = this.A05;
        ((AnonymousClass3E6) AnonymousClass7TE.A14(r2)).EEH((C252213ok) this.A06.getValue());
        ((AnonymousClass3E6) AnonymousClass7TE.A14(r2)).onDestroy();
        AnonymousClass0fD.A09(163390451, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1033332867);
        H0X.super.onStart();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A05)).DmJ(getActivity());
        AnonymousClass0fD.A09(232239225, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(366914195);
        H0X.super.onStop();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A05)).onStop();
        AnonymousClass0fD.A09(1010543054, A022);
    }
}
