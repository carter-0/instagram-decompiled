package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.H0y  reason: case insensitive filesystem */
public final class C54154H0y extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "UpdatesHubFragment";
    public View A00;
    public boolean A01;
    public final String A02 = AnonymousClass7TG.A0j();
    public final Set A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.setTitle(requireActivity().getString(2131963441));
        r5.Eoo(new C56800ICx(this, 1));
        r5.EVS(true);
        r5.Eu4(true);
        if (182.A06(0Tu.A05, DbT.A0X(this.A05), 36322289314900017L)) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A06 = R.drawable.instagram_settings_pano_outline_24;
            A0K.A05 = 2131973150;
            A0K.A0G = new C56800ICx(this, 2);
            this.A00 = C51970G9q.A0P(A0K, r5);
        }
    }

    public final String getModuleName() {
        return "reel_highlights_updates_hub";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.0rk] */
    public static final void A00(AnonymousClass5VN r15, C54154H0y h0y, String str, List list) {
        C54154H0y h0y2 = h0y;
        AnonymousClass0eM r5 = h0y2.A05;
        Reel A0L = Dba.A0L(AnonymousClass7TE.A0l(r5), str);
        if (A0L != null) {
            ((C53040GhW) h0y2.A06.getValue()).A05(A0L.getId());
            C319976rX.A05(h0y2, AnonymousClass7TE.A0l(r5), C319986rY.FOLLOWING, C273654mx.A00(408), DbX.A0l(AnonymousClass0t1.A01, r5).getId());
            String A032 = 2O0.A00(AnonymousClass7TE.A0l(r5)).A03(A0L);
            0qQ.A07(A032);
            ? obj = new Object();
            List A0K = A0L.A0K();
            0qQ.A07(A0K);
            Iterator it = A0K.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (0qQ.A0K(it.next(), A032)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            obj.A00 = i;
            if (i == -1) {
                obj.A00 = 0;
            }
            MME mme = new MME(h0y2, 41);
            AnonymousClass6VJ A042 = 1OP.A04(h0y2.requireContext(), AnonymousClass7TE.A0l(r5), A0L, new C57303IWm(r15, h0y2, A0L, list, mme, obj), AnonymousClass3PO.A00(DbW.A0S(r5, 0)), "reel_highlights_updates_hub", -1);
            Set set = h0y2.A03;
            A042.A06 = !set.contains(A0L.getId());
            A042.A04();
            String id = A0L.getId();
            0qQ.A07(id);
            set.add(id);
        }
    }

    public static final void A01(28D r5, C54154H0y h0y) {
        28D r1 = r5;
        C49805F7r.A00(h0y.requireActivity(), r1, AnonymousClass7TE.A0l(h0y.A05), AnonymousClass80E.MY_WEEK, (PendingRecipient) null, (Integer) null);
    }

    public static final void A02(C54154H0y h0y) {
        C331127Pr A0f = DbX.A0f(h0y.A05);
        String str = null;
        A0f.A0T = null;
        C331157Pu A002 = A0f.A00();
        FragmentActivity requireActivity = h0y.requireActivity();
        C53309Glv glv = ((C53377Gn7) ((C53040GhW) h0y.A06.getValue()).A0F.getValue()).A01;
        if (glv != null) {
            str = glv.A05;
        }
        K48 k48 = new K48();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(C273654mx.A00(376), str);
        k48.setArguments(A0a);
        A002.A02(requireActivity, k48);
        AnonymousClass37D A0i = DbX.A0i(h0y);
        if (A0i != null) {
            ((AnonymousClass37F) A0i).A0H = new C57394IZz(h0y, 0);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public C54154H0y() {
        MME mme = new MME(this, 46);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MME(new MME(this, 43), 44));
        this.A06 = DbS.A0I(new MME(A002, 45), mme, new MMX(0, (Object) null, (Object) A002), DbS.A0z(C53040GhW.class));
        this.A04 = AnonymousClass1YB.A00(new MME(this, 42));
        this.A01 = true;
        this.A05 = C227642jf.A02(this);
        this.A03 = DbS.A0y();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1231959380);
        C54154H0y.super.onCreate(bundle);
        AnonymousClass0fD.A09(574832368, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1256516128);
        ComposeView A0H = DbV.A0H(this, new C59111J6t(this, 19), -430707070);
        AnonymousClass0fD.A09(620568213, A022);
        return A0H;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-529643576);
        super.onResume();
        if (!this.A01) {
            ((C53040GhW) this.A06.getValue()).A06(false);
        }
        this.A01 = false;
        AnonymousClass0fD.A09(-56645241, A022);
    }
}
