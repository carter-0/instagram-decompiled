package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ESU extends C47518E6c implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PushNotificationOptionsRedesignFragment";
    public int A00 = 0;
    public 0hq A01;
    public UserSession A02;
    public AnonymousClass1b3 A03;
    public C49882FBg A04;
    public String A05;
    public boolean A06 = false;
    public String A07;
    public final C49681F1p A08 = new C49681F1p(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A08(2HA r2, C49681F1p f1p, ESU esu, String str, String str2, boolean z) {
        f1p.A00(str, str2, "radio");
        if (!AnonymousClass0oH.A01(esu.requireContext())) {
            C3726691w.A07(esu.requireContext());
        } else if (!z) {
            2Di r0 = esu.A03;
            if (r0 == null || !r0.A05.A00() || !esu.A05.equals("instagram_direct")) {
                C3726691w.A08(esu.requireContext(), r2);
            }
        }
    }

    public static void A09(ESU esu) {
        EQT eqt = new EQT(esu.A01, esu, esu.A08, 1);
        1OC A002 = F7X.A00(esu.A02, esu.A05);
        A002.A00 = eqt;
        esu.schedule(A002);
    }

    public static void A0A(String str, List list) {
        if (str != null && !str.equals("")) {
            list.add(new FGF((CharSequence) str));
        }
    }

    public final void configureActionBar(2da r2) {
        DbW.A1C(r2, this.A07);
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public static String A06(C49681F1p f1p, ESU esu, List list, List list2) {
        boolean z;
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str = ((AnonymousClass9JM) list.get(0)).A01;
        Iterator it = list.iterator();
        String str2 = "off";
        while (it.hasNext()) {
            AnonymousClass9JM r5 = (AnonymousClass9JM) it.next();
            String str3 = r5.A03;
            if (str3 == null) {
                str3 = "off";
            }
            if (Boolean.TRUE.equals(r5.A00)) {
                str2 = str3;
            }
            DbV.A1V(str3, r5.A04, A1C);
        }
        ESU esu2 = esu;
        2HA A032 = C3726691w.A03(esu.getContext(), esu.A02, str);
        Context requireContext = esu.requireContext();
        0qQ.A0B(A032, 1);
        Boolean A002 = 2Gm.A00(requireContext, A032, false);
        if (A032 == 2HA.A0c || A002 == null || Boolean.TRUE.equals(A002)) {
            z = true;
        } else {
            z = false;
            2Di r0 = esu.A03;
            if (r0 == null || !r0.A05.A00() || !esu.A05.equals("instagram_direct")) {
                str2 = "off";
            }
        }
        list2.add(new C70962OTj(new FQa(A032, f1p, esu2, str, A1C, z), str2, A1C));
        return str;
    }

    public static String A07(C49681F1p f1p, ESU esu, List list, List list2) {
        String str = ((AnonymousClass9JM) AnonymousClass7TE.A13(list)).A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9JM r0 = (AnonymousClass9JM) it.next();
            String str2 = r0.A04;
            Boolean bool = (Boolean) r0.A00;
            bool.getClass();
            list2.add(new PR9((CompoundButton.OnCheckedChangeListener) new C18920WCx(esu, f1p, str, 1), (CharSequence) str2, bool.booleanValue()));
        }
        return str;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass1b3 r0;
        int A022 = AnonymousClass0fD.A02(-1435794278);
        super.onCreate(bundle);
        this.A02 = DbX.A0U(this);
        Bundle requireArguments = requireArguments();
        this.A05 = DbU.A0l(requireArguments, TraceFieldType.ContentType);
        this.A07 = DbU.A0l(requireArguments, "page_title");
        this.A06 = requireArguments.getBoolean("scroll_to_video_chat");
        if (this.A07.equals(C273654mx.A00(1293))) {
            this.A07 = DbV.A05(this).getString(2131965135);
        }
        this.A01 = this.mFragmentManager;
        this.A04 = new C49882FBg(this.A02, this);
        if (AnonymousClass1b3.A00 != null) {
            r0 = 2DZ.A00(this.A02);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        AnonymousClass0fD.A09(452227114, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1137205713);
        super.onResume();
        A09(this);
        AnonymousClass0fD.A09(-2037051738, A022);
    }
}
