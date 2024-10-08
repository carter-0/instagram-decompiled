package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class E36 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MultipleAccountRecoveryFragment";
    public AnonymousClass0aP A00;
    public C50515Fdb A01;
    public C47579E8r A02;
    public String A03;
    public String A04;
    public List A05;
    public C49922FEx A06;
    public ProgressButton A07;
    public String A08;
    public List A09;

    public static void A00(DialogInterface.OnDismissListener onDismissListener, UserSession userSession, E36 e36, String str, String str2, boolean z) {
        E36 e362 = e36;
        FragmentActivity activity = e36.getActivity();
        if (activity != null) {
            Integer num = AnonymousClass05K.A05;
            C358248ab A0X = DbS.A0X(activity);
            A0X.A09(2131971939);
            Resources resources = activity.getResources();
            int i = 2131971938;
            boolean z2 = z;
            if (z) {
                i = 2131971931;
            }
            A0X.A0q(DbU.A07(resources, str, i).toString());
            A0X.A0I(new C50003FIo(activity, e362, userSession, num, str2, 0, z2), 2131971926);
            A0X.A0H((DialogInterface.OnClickListener) null, 2131968513);
            A0X.A0f(onDismissListener);
            A0X.A07(R.drawable.instagram_lock_outline_96);
            DbT.A1V(A0X);
        }
    }

    public final void A03(User user) {
        Context requireContext = requireContext();
        AnonymousClass0aP r0 = this.A00;
        String str = this.A03;
        String id = user.getId();
        String str2 = this.A04;
        1NY A0N = DbU.A0N(r0);
        DbU.A1O(A0N, DbT.A0t(requireContext, A0N, "accounts/account_recovery_nonce_login/"));
        A0N.A9m("login_nonce", str);
        DbS.A1P(A0N, id);
        A0N.A9m("recovery_handle_type", str2);
        1OC A0K = Dbb.A0K(A0N, EM4.class, FCB.class);
        A0K.A00 = new EM7(this, this, this.A00, this.A01, this, C46634DiE.A0v);
        schedule(A0K);
    }

    public final String getModuleName() {
        return "multiple_account_recovery";
    }

    public static void A01(E36 e36) {
        int i;
        String[] strArr;
        String num;
        ProgressButton progressButton;
        int i2;
        C47579E8r e8r = e36.A02;
        e8r.getClass();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : e8r.A07) {
            if (e8r.A03.contains(next)) {
                A1C.add(next);
            }
        }
        int A012 = DbT.A01(ImmutableList.copyOf((Collection) e36.A02.A06), A1C.size());
        ProgressButton progressButton2 = e36.A07;
        progressButton2.getClass();
        progressButton2.setEnabled(AnonymousClass7TF.A1P(A012));
        if (A012 == 0) {
            progressButton = e36.A07;
            i2 = 2131965539;
        } else if (A1C.isEmpty()) {
            progressButton = e36.A07;
            i2 = 2131968361;
        } else {
            ProgressButton progressButton3 = e36.A07;
            Resources A052 = DbV.A05(e36);
            if (A012 == 1) {
                i = 2131965540;
                strArr = new String[1];
                num = ((User) A1C.get(0)).getUsername();
            } else {
                i = 2131965538;
                strArr = new String[1];
                num = Integer.toString(A012);
            }
            strArr[0] = num;
            progressButton3.setText((CharSequence) 0bC.A01(A052, strArr, i));
            return;
        }
        progressButton.setText(i2);
    }

    private boolean A02() {
        int floor;
        C70902Xm r4 = C70902Xm.A00;
        0w6 r1 = C70902Xm.A01;
        AnonymousClass0YZ[] r2 = C70902Xm.A03;
        if (!AnonymousClass7TE.A1a(2XO.A00((2XO) r1.CDM(r4, r2[0])))) {
            return false;
        }
        if (AnonymousClass7TE.A1a(((2XO) C70902Xm.A02.CDM(r4, r2[1])).A01(this.A00))) {
            boolean A062 = 1AW.A06(0Tu.A06, 2324143383825681188L);
            C48069EUn eUn = C48069EUn.IG4A_MULTIPLE_AR_FDID_BACKTEST;
            String[] strArr = eUn.A02;
            Date date = eUn.A01;
            Date date2 = eUn.A00;
            Context requireContext = requireContext();
            AnonymousClass0aP r22 = this.A00;
            0qQ.A0B(r22, 2);
            C68358NBv nBv = new C68358NBv(requireContext, r22);
            1Uk A002 = new C64791Ub(requireContext).A00().A00("fdid_oe_exposure_time");
            1Uf A003 = new C64791Ub(requireContext).A00();
            AnonymousClass95S r0 = AGj.A00;
            Date time = Calendar.getInstance().getTime();
            0qQ.A07(time);
            1Uk A004 = A003.A00("fdid_oe");
            String A005 = nBv.A00();
            if (time.before(date) || time.after(date2) || A062 || A005 == null) {
                return false;
            }
            int i = A004.getInt(AGj.A01("ig4a_multiple_ar_fdid_backtest"), -1);
            if (i == -1) {
                i = DbZ.A04(A004, 002.A0R(A005, "ig4a_multiple_ar_fdid_backtest"), "ig4a_multiple_ar_fdid_backtest");
            }
            if (i < 0 || (floor = (int) Math.floor((double) (i / 5000))) >= 2 || floor < 0) {
                return false;
            }
            1Ln r3 = new 1Ln(AnonymousClass7TE.A0e(new AnonymousClass0kM(r22).A00(), "fdid_offline_experiment_exposure"), 153);
            0qQ.A0A(r3);
            if (!strArr[floor].equals("not_in_experiment") && A002 != null) {
                if (System.currentTimeMillis() - A002.getLong(AGj.A00("ig4a_multiple_ar_fdid_backtest"), -1) >= C47272Du0.A00 && DbT.A1Y(r3)) {
                    r3.A0R("exp_name", "ig4a_multiple_ar_fdid_backtest");
                    r3.A0R("exp_group", strArr[floor]);
                    r3.A0R("family_device_id", A005);
                    r3.Cgf();
                    1W3 AR0 = A002.AR0();
                    AR0.A08(AGj.A00("ig4a_multiple_ar_fdid_backtest"), System.currentTimeMillis());
                    AR0.A0B();
                }
            }
            if (floor == 1) {
                return true;
            }
            return false;
        }
        return AnonymousClass7TE.A1a(((2XO) AnonymousClass2Xr.A01.CDM(AnonymousClass2Xr.A00, AnonymousClass2Xr.A02[0])).A01(this.A00));
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void configureActionBar(2da r3) {
        int i = 2131967734;
        if (A02()) {
            i = 2131967735;
        }
        DbW.A1B(r3, i);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1213763255);
        E36.super.onCreate(bundle);
        this.A00 = Dba.A0D(this);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("lookup_users");
        if (parcelableArrayList == null) {
            parcelableArrayList = AnonymousClass7TE.A1C();
        }
        this.A09 = parcelableArrayList;
        this.A03 = requireArguments().getString("login_nonce", "");
        this.A04 = requireArguments().getString("recovery_handle_type", "");
        this.A08 = requireArguments().getString("recovery_handle", "");
        this.A01 = new C50515Fdb(getActivity());
        AnonymousClass0aP r1 = this.A00;
        AnonymousClass7TG.A1N(r1, "multiple_users_recover");
        C49938FFr.A01(r1, "multiple_users_recover");
        this.A06 = C49922FEx.A00(this.mArguments);
        AnonymousClass0fD.A09(-1609641360, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int A022 = AnonymousClass0fD.A02(1931520013);
        if (A02()) {
            inflate = layoutInflater.inflate(R.layout.fragment_multiple_account_recovery_legacy, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(R.layout.fragment_multiple_account_recovery, viewGroup, false);
            TextView A0G = DbU.A0G(inflate, R.id.choose_accounts_text);
            Resources A052 = DbV.A05(this);
            int i = 2131955107;
            if (Dbj.A00().equals(this.A04)) {
                i = 2131955108;
            }
            Dbb.A0m(A052, A0G, this.A08, i);
        }
        TextView A0G2 = DbU.A0G(inflate, R.id.help_center);
        String string = getString(2131963317);
        AnonymousClass7AV.A07(new AnonymousClass7AK(Integer.valueOf(A0G2.getCurrentTextColor())), A0G2, string, DbV.A0z(this, string, 2131963316));
        FP0.A00(A0G2, 67, this);
        if (A02()) {
            C47569E8h e8h = new C47569E8h(this, this);
            List list = this.A09;
            List<Object> list2 = e8h.A01;
            list2.clear();
            if (list != null) {
                list2.addAll(list);
                e8h.A06();
                for (Object A082 : list2) {
                    e8h.A08(e8h.A00, A082);
                }
                e8h.A07();
            }
            ((AbsListView) inflate.requireViewById(16908298)).setAdapter(e8h);
        } else {
            C47579E8r e8r = new C47579E8r(requireContext(), this, this.A00, this);
            this.A02 = e8r;
            List list3 = this.A09;
            List list4 = e8r.A07;
            list4.clear();
            List list5 = e8r.A06;
            list5.clear();
            if (list3 != null) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    User A0k = DbT.A0k(it);
                    if (!e8r.A02.CO7(A0k.getId())) {
                        AnonymousClass3EO r4 = e8r.A01;
                        String id = A0k.getId();
                        if (!r4.A02.containsKey(id) && !r4.A01.containsKey(id)) {
                            list4.add(A0k);
                        }
                    }
                    list5.add(A0k);
                }
                e8r.A03 = AnonymousClass7TE.A1F();
                if (!list4.isEmpty()) {
                    e8r.A03.add(list4.get(0));
                }
                C47579E8r.A00(e8r);
            }
            ((AbsListView) inflate.requireViewById(16908298)).setAdapter(this.A02);
            this.A07 = Dba.A0O(inflate);
            A01(this);
            FP0.A00(this.A07, 68, this);
        }
        AnonymousClass0fD.A09(-700889618, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        02m.A0p.markerEnd(725095506, 2);
    }
}
