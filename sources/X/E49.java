package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class E49 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectPaidPartnershipSettingsFragment";
    public int A00;
    public C254793t3 A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public IgTextView A07;
    public 2Dm A08;
    public IgdsListCell A09;
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C73897PlY(this, 26));
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131954217);
        r3.AA9(FP8.A00(this, 23), 2131960992);
        r3.Eu4(true);
    }

    public final String getModuleName() {
        return "direct_broadcast_channel_paid_partnership_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A09 = (IgdsListCell) view.requireViewById(R.id.paid_partnership_label_toggle);
        IgTextView A0a = DbT.A0a(view, R.id.paid_partnership_disclosure);
        this.A07 = A0a;
        if (A0a == null) {
            str = "paidPartnershipDisclosureView";
        } else {
            Context requireContext = requireContext();
            String A16 = AnonymousClass7TE.A16(requireContext, 2131954165);
            SpannableStringBuilder A0D = DbY.A0D(requireContext, A16, 2131954187);
            AnonymousClass7AV.A05(A0D, new C46684DjD(1, requireContext, this), A16);
            DbT.A1H(A0a);
            A0a.setText(A0D);
            IgdsListCell igdsListCell = this.A09;
            if (igdsListCell != null) {
                igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
                2Dm r4 = this.A08;
                if (r4 != null) {
                    C254793t3 r0 = this.A01;
                    str = "currentThreadId";
                    if (r0 != null) {
                        DirectThreadKey A002 = C327647Bq.A00(C300965yF.A01(r0));
                        String str2 = this.A03;
                        if (str2 == null) {
                            str = "currentMessageId";
                        } else {
                            C254703su BRz = r4.BRz(A002, str2);
                            2Dm r1 = this.A08;
                            if (r1 != null) {
                                C254793t3 r02 = this.A01;
                                if (r02 != null) {
                                    AnonymousClass3U9 B33 = r1.B33(C327647Bq.A00(C300965yF.A01(r02)));
                                    if (BRz == null || B33 == null) {
                                        DbT.A1J(this);
                                    }
                                    if (B33 != null) {
                                        this.A00 = B33.AdN();
                                        this.A04 = B33.C6k();
                                        if (BRz != null) {
                                            AnonymousClass9I4 r03 = BRz.A04;
                                            if (r03 != null) {
                                                z = r03.A00;
                                            } else {
                                                z = false;
                                            }
                                            this.A06 = z;
                                            this.A05 = z;
                                            IgdsListCell igdsListCell2 = this.A09;
                                            if (igdsListCell2 != null) {
                                                igdsListCell2.setChecked(z);
                                                IgdsListCell igdsListCell3 = this.A09;
                                                if (igdsListCell3 != null) {
                                                    FdT.A03(igdsListCell3, B33, this, 0);
                                                    C313756gx A0R = DbZ.A0R(this.A0A);
                                                    int i = this.A00;
                                                    C254793t3 r04 = this.A01;
                                                    if (r04 != null) {
                                                        String str3 = C300965yF.A01(r04).A00;
                                                        String str4 = this.A04;
                                                        String str5 = this.A02;
                                                        String A0u = DbU.A0u(this.A0B);
                                                        int C6a = B33.C6a();
                                                        C242243Te r05 = B33.A01.A0s;
                                                        if (r05 != null) {
                                                            String A003 = C329997La.A00(r05, A0u, C6a);
                                                            1Ln A0J = DbT.A0J(A0R);
                                                            if (DbT.A1Y(A0J)) {
                                                                DbW.A17(A0J, A0R);
                                                                DbV.A1M(A0J, "paid_partnership_sheet_rendered");
                                                                A0J.A0p(C66579MXk.A00(961));
                                                                A0J.A0i(DbZ.A0b(A0J, "thread_view", str3, str4, i));
                                                                A0J.A0v(A0R.A01);
                                                                A0J.A0w(DbY.A0p("user_type", A003, AnonymousClass7TE.A1L(C66579MXk.A00(357), str5)));
                                                                A0J.Cgf();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                                    }
                                                }
                                            }
                                        } else {
                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                        }
                                    } else {
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F("threadStore");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("paidPartnershipToggleView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final boolean onBackPressed() {
        String str;
        if (this.A05 == this.A06) {
            return false;
        }
        String str2 = this.A03;
        if (str2 == null) {
            str = "currentMessageId";
        } else {
            C254793t3 r0 = this.A01;
            if (r0 == null) {
                str = "currentThreadId";
            } else {
                String str3 = C300965yF.A01(r0).A00;
                String str4 = this.A02;
                boolean z = this.A05;
                1OS r1 = new 1OS((C66665MaY) null, (DefaultConstructorMarker) null, DbW.A1Y(str3) ? 1 : 0);
                r1.A02 = str3;
                r1.A00 = str2;
                r1.A01 = str4;
                r1.A03 = z;
                1Ou.A01(AnonymousClass7TE.A0l(this.A0B)).A0A(r1);
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(564182348);
        E49.super.onCreate(bundle);
        C254793t3 A002 = OXL.A00(requireArguments(), C66579MXk.A00(512));
        if (A002 != null) {
            this.A01 = A002;
            this.A03 = C320236s2.A01(requireArguments(), C66579MXk.A00(511));
            this.A02 = requireArguments().getString(C66579MXk.A00(510));
            this.A08 = 1bJ.A00(AnonymousClass7TE.A0l(this.A0B));
            AnonymousClass0fD.A09(-1034447419, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(685093403, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1584132024);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_thread_paid_partnership_settings, viewGroup, false);
        AnonymousClass0fD.A09(-333461636, A022);
        return inflate;
    }
}
