package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class E53 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass70R, AnonymousClass4DS, AnonymousClass70S {
    public static final String __redex_internal_original_name = "ProfileInterestPickerFragment";
    public TextView A00;
    public AnonymousClass2t9 A01;
    public AnonymousClass2t9 A02;
    public C252063oV A03;
    public 2el A04;
    public 2el A05;
    public AnonymousClass3V7 A06;
    public String A07;
    public View A08;
    public final C355568Qm A09 = new C355568Qm(new C46804Dlg(this));
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;

    public final void DLB(View view, C61082JwK jwK, boolean z) {
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.Eom(2131970003);
        r5.Eu4(true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_check_pano_outline_24;
        A0K.A0P = true;
        A0K.A02 = Dbb.A06(this);
        A0K.A05 = 2131960992;
        DbX.A19(FPC.A00(this, 45), A0K, r5);
        A00(this, false);
    }

    public final String getModuleName() {
        return "profile_interest_picker";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass2ZP r4;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Activity rootActivity = getRootActivity();
        if (rootActivity instanceof AnonymousClass2ZP) {
            r4 = (AnonymousClass2ZP) rootActivity;
        } else {
            r4 = null;
        }
        if (r4 != null) {
            r4.Enj(8);
        }
        this.A00 = DbU.A0G(view2, R.id.drag_drop_text);
        this.A08 = view2.requireViewById(R.id.divider);
        this.A06 = new AnonymousClass3V7(0, DbS.A02(requireContext(), 8));
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view2, R.id.interest_picker_recycler_view);
        recyclerView.addOnLayoutChangeListener(new FPP(this, 2));
        2el r3 = this.A04;
        String str = "interestListViewpointManager";
        if (r3 != null) {
            Dba.A0z(view2, r3, this);
            AnonymousClass2tC A0S = DbV.A0S(this);
            Context requireContext = requireContext();
            AnonymousClass0eM r42 = this.A0A;
            UserSession A0l = AnonymousClass7TE.A0l(r42);
            Integer num = AnonymousClass05K.A0C;
            2el r10 = this.A04;
            if (r10 != null) {
                A0S.A01(new EGI(requireContext, A0l, r10, this, num));
                this.A01 = DbU.A0U(A0S, new C47759EFt(requireContext()));
                AnonymousClass3AQ r0 = new AnonymousClass3AQ();
                r0.A00 = false;
                recyclerView.setItemAnimator(r0);
                DbY.A16(this, recyclerView);
                AnonymousClass2t9 r02 = this.A01;
                if (r02 == null) {
                    str = "interestListAdapter";
                } else {
                    recyclerView.setAdapter(r02);
                    this.A03 = DbV.A0T(view2, R.id.selected_interest_row_stub, false);
                    UserSession A0l2 = AnonymousClass7TE.A0l(r42);
                    FragmentActivity requireActivity = requireActivity();
                    Integer num2 = AnonymousClass05K.A0N;
                    C355568Qm r8 = this.A09;
                    2el r102 = this.A05;
                    String str2 = "selectedListViewpointManager";
                    if (r102 != null) {
                        0qQ.A0B(A0l2, 0);
                        AnonymousClass2tC A002 = AnonymousClass2t9.A00(requireActivity);
                        A002.A01(new EGJ(requireActivity, r8, A0l2, r102, this, num2));
                        this.A02 = DbU.A0U(A002, new EGD(requireActivity, A0l2, this));
                        2el r03 = this.A05;
                        if (r03 != null) {
                            Dba.A0z(view2, r03, this);
                            C252063oV r04 = this.A03;
                            str2 = "selectedInterestViewStub";
                            if (r04 != null) {
                                View view3 = r04.getView();
                                0qQ.A0C(view3, C273654mx.A00(4));
                                RecyclerView recyclerView2 = (RecyclerView) view3;
                                0nA.A0c(recyclerView2, 0);
                                C252063oV r05 = this.A03;
                                if (r05 != null) {
                                    0nA.A0X(r05.getView(), DbS.A02(requireContext(), 16));
                                    AnonymousClass3AQ r06 = new AnonymousClass3AQ();
                                    r06.A00 = false;
                                    recyclerView2.setItemAnimator(r06);
                                    DbV.A1A(recyclerView2.getContext(), recyclerView2);
                                    AnonymousClass2t9 r07 = this.A02;
                                    if (r07 == null) {
                                        str2 = "selectedInterestListAdapter";
                                    } else {
                                        recyclerView2.setAdapter(r07);
                                        AnonymousClass3V7 r08 = this.A06;
                                        if (r08 == null) {
                                            str2 = "horizontalDividerItemDecoration";
                                        } else {
                                            recyclerView2.A11(r08);
                                            r8.A0A(recyclerView2);
                                            07U r103 = 07U.A05;
                                            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                                            AnonymousClass7TE.A1Z(new MH5(r103, this, viewLifecycleOwner, (AnonymousClass4D7) null, 10), AnonymousClass07a.A00(viewLifecycleOwner));
                                            DbZ.A1C(this, new C51648Fy7(this, (AnonymousClass4D7) null, 36), C48263Ebi.A00(r103, getViewLifecycleOwner().getLifecycle(), ((C46792DlR) this.A0B.getValue()).A07));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(E53 e53, boolean z) {
        2dZ.A0t.A03(e53.getActivity()).A0W(2Yu.A0D(e53.getContext()), 2Yu.A09(e53.getContext()), z);
    }

    public final void DLC(C61082JwK jwK) {
        Object value;
        ArrayList A0U;
        if (jwK != null) {
            C46792DlR dlR = (C46792DlR) this.A0B.getValue();
            05G r5 = dlR.A0A;
            do {
                value = r5.getValue();
                List list = (List) value;
                A0U = 00k.A0U(list);
                C51954G8x g8x = (C51954G8x) jwK.A00;
                int A002 = C46792DlR.A00(g8x.B6N(), list);
                if (A002 != -1) {
                    A0U.remove(A002);
                } else if (list.size() >= 10) {
                    dlR.A02((Boolean) null, "max_interests_selected_alert", (List) null);
                    DbX.A1X(dlR, C318116oQ.A00(dlR), 4);
                } else {
                    A0U.add(new C61082JwK(g8x, true));
                    E53 e53 = dlR.A04;
                    int size = A0U.size() - 1;
                    C252063oV r0 = e53.A03;
                    if (r0 == null) {
                        0qQ.A0F("selectedInterestViewStub");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C252553pI r02 = ((RecyclerView) r0.getView()).A0D;
                    if (r02 != null) {
                        r02.A1O(size);
                    }
                }
            } while (!r5.AIY(value, A0U));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r1 = this.A0B;
        boolean z = ((C46792DlR) r1.getValue()).A00;
        C46792DlR dlR = (C46792DlR) r1.getValue();
        Boolean valueOf = Boolean.valueOf(((C46792DlR) r1.getValue()).A00);
        if (z) {
            dlR.A02(valueOf, "back_unsaved_changes_alert", (List) null);
            C358248ab A0U = DbW.A0U(this);
            A0U.A09(2131975992);
            A0U.A08(2131975991);
            A0U.A0H((DialogInterface.OnClickListener) null, 2131968381);
            Dba.A0t(C50021FJg.A00(this, 22), A0U, 2131976948);
            return true;
        }
        dlR.A02(valueOf, "surface_exit", (List) null);
        return false;
    }

    public E53() {
        C51795G2e g2e = new C51795G2e(this, 16);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51795G2e(new C51795G2e(this, 13), 14));
        this.A0B = DbS.A0I(new C51795G2e(A002, 15), g2e, new MJ4(39, (Object) null, A002), DbS.A0z(C46792DlR.class));
    }

    public final void Cj4(C51954G8x g8x) {
        String A0k = DbS.A0k();
        if (A0k != null) {
            AnonymousClass0eM r3 = this.A0A;
            0Aj A0e = AnonymousClass7TE.A0e(DbX.A0P(this, r3), "ig_bio_interests_picker");
            A0e.A9F("viewer_id", Long.valueOf(Dbb.A08(r3)));
            DbS.A1K(A0e, "bio_interests_picker");
            A0e.AAJ("action_type", "pill_impression");
            A0e.AAJ("nav_chain", A0k);
            A0e.AAJ("topic_name", g8x.getName());
            DbV.A1I(A0e, this.A07);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1773498093);
        E53.super.onCreate(bundle);
        this.A07 = requireArguments().getString("entrypoint");
        this.A04 = C71682ef.A01((0lg) null, C71682ef.A00());
        this.A05 = C71682ef.A01((0lg) null, C71682ef.A00());
        AnonymousClass0fD.A09(1295336832, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1564540300);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.profile_interest_picker_layout, false);
        AnonymousClass0fD.A09(-1365362193, A022);
        return A0D;
    }
}
