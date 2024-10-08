package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.modal.ModalActivity;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IBk  reason: case insensitive filesystem */
public final class C56761IBk implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C56761IBk(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        IllegalStateException illegalStateException;
        int i2;
        AnonymousClass8JI r12;
        28D r9;
        String str;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(1634034367);
                String pollId = ((C272034jz) this.A02).getPollId();
                if (pollId != null) {
                    ((0sL) this.A01).invoke(pollId, Boolean.valueOf(this.A03));
                }
                i = 1475141085;
                break;
            case 1:
                int A052 = AnonymousClass0fD.A05(-1238764645);
                C52538GWp gWp = (C52538GWp) this.A01;
                View view2 = view;
                0qQ.A0A(view2);
                C52435GSn gSn = (C52435GSn) this.A02;
                boolean z = this.A03;
                0qQ.A0B(view2, 0);
                C52536GWn gWn = gWp.A03;
                AnonymousClass4DU r13 = gWp.A04;
                UserSession userSession = gWn.A00;
                C51967G9n.A0X(userSession).A0B(view2, new String[0]);
                C52435GSn gSn2 = gWn.A01;
                1Xj BPf = gSn2.BPf();
                User A11 = C51966G9m.A11(BPf);
                if (A11 != null) {
                    C233822wX.A0J(userSession, new IT2(userSession, gSn2), HLF.BRAND, BPf, r13, (C249763kK) null, (Float) null, (Float) null, (Integer) null, (Integer) null, C273654mx.A00(964), (String) null, (String) null, (String) null, 0, A11.A2Q(), z);
                }
                1Xj BPf2 = gSn.BPf();
                User A112 = C51966G9m.A11(BPf2);
                if (A112 != null) {
                    String id = BPf2.getId();
                    if (id != null) {
                        SourceModelInfoParams sourceModelInfoParams = new SourceModelInfoParams(id, 0, 0);
                        if (A112.A2Q()) {
                            UserSession userSession2 = gWp.A02;
                            String A07 = C231122qu.A07(userSession2, BPf2);
                            if (A07 == null) {
                                0wb.A03("GridAdsDelegateHandler", "Grid Ad cannot navigate to PBIA due to null adId");
                            } else {
                                C309516Yo A0H = DbW.A0H(gWp.A01, userSession2);
                                A0H.A08();
                                A0H.A0D(C250563lf.A0A(sourceModelInfoParams, A07, z));
                                A0H.A04();
                            }
                        } else {
                            UserSession userSession3 = gWp.A02;
                            1a1 A022 = C46447Df9.A02();
                            C46474Dfc A012 = C46548Dgp.A01(userSession3, A112.getId(), Pxd.A00(624), r13.getModuleName());
                            A012.A04 = sourceModelInfoParams;
                            A012.A0U = z;
                            Bundle A013 = A022.A01(userSession3, A012.A04());
                            Context context = gWp.A00;
                            0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
                            DbV.A0Y((Activity) context, A013, userSession3, ModalActivity.class, "profile").A0C(context);
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                AnonymousClass0fD.A0C(-353390738, A052);
                return;
            case 2:
                A05 = AnonymousClass0fD.A05(528383240);
                C54164H1i.A01((IgdsListCell) this.A01, (C54164H1i) this.A02, this.A03);
                i = -1310053249;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(1309277112);
                C54164H1i.A01((IgdsListCell) this.A01, (C54164H1i) this.A02, this.A03);
                i = -311914338;
                break;
            case 4:
                A05 = AnonymousClass0fD.A05(-1857556041);
                IO9 io9 = (IO9) this.A02;
                UserSession userSession4 = io9.A0R;
                C331127Pr A0W = DbS.A0W(userSession4);
                GVT gvt = io9.A0V;
                DbZ.A0z(gvt.requireContext(), A0W, 2131953293);
                C331157Pu A002 = A0W.A00();
                FragmentActivity requireActivity = gvt.requireActivity();
                Parcelable parcelable = (Parcelable) ((List) this.A01).get(0);
                0qQ.A0B(parcelable, 0);
                C54156H1a h1a = new C54156H1a();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putParcelable("audio_part_metadata", parcelable);
                h1a.setArguments(A0a);
                A002.A02(requireActivity, h1a);
                C54689HOu hOu = C54689HOu.A0X;
                long j = io9.A0M;
                boolean z2 = this.A03;
                C320506sU r5 = io9.A0Q;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gvt, userSession4), "instagram_organic_partial_attribution_ufi_tap");
                if (A0e.isSampled()) {
                    C51973G9u.A12(A0e, "audio_page", j);
                    C51965G9l.A1C(hOu, A0e);
                    A0e.A9F("is_trending_label", Long.valueOf(G9t.A0k(z2 ? 1 : 0)));
                    DbY.A1C(A0e);
                    C51973G9u.A11(A0e, r5);
                    A0e.Cgf();
                }
                i = 1148276281;
                break;
            case 5:
                A05 = AnonymousClass0fD.A05(1048504287);
                AnonymousClass37E r2 = AnonymousClass37D.A00;
                H04 h04 = (H04) this.A02;
                Context context2 = h04.getContext();
                if (context2 != null) {
                    DbX.A14(context2, r2);
                    1Xj r132 = (1Xj) this.A01;
                    if (r132 != null) {
                        boolean z3 = this.A03;
                        if (z3) {
                            r12 = AnonymousClass8JI.SEQUENTIAL_REMIX;
                        } else {
                            r12 = AnonymousClass8JI.REMIX;
                        }
                        AnonymousClass0eM r22 = h04.A0B;
                        r22.getValue();
                        if (h04.A05 == null) {
                            str = "containerModuleName";
                        } else {
                            C52345GOp gOp = C52345GOp.A00;
                            UserSession A0l = AnonymousClass7TE.A0l(r22);
                            FragmentActivity activity = h04.getActivity();
                            if (activity != null) {
                                Fragment fragment = h04.mParentFragment;
                                if (fragment != null) {
                                    if (z3) {
                                        r9 = 28D.A1P;
                                    } else {
                                        r9 = h04.A02;
                                        if (r9 == null) {
                                            str = "entrypoint";
                                        }
                                    }
                                    String str2 = h04.A07;
                                    String str3 = h04.A08;
                                    String str4 = h04.A06;
                                    gOp.A0F(activity, fragment, r9, A0l, h04.A03, r12, r132, (1Xj) null, h04.A04, str2, str3, str4, h04.A09);
                                } else {
                                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                    i2 = -2009561592;
                                }
                            } else {
                                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                i2 = 1788458883;
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    i = -1315102968;
                    break;
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i2 = -2128258385;
                }
                AnonymousClass0fD.A0C(i2, A05);
                throw illegalStateException;
            default:
                A05 = AnonymousClass0fD.A05(98193819);
                GHU ghu = (GHU) this.A02;
                JTB jtb = ghu.A07;
                1Xj r4 = (1Xj) this.A01;
                jtb.DB9(r4);
                C52086GEg.A0D(C52236GKd.A1Q, ghu.A04, r4, ghu.A06, "dubbed_with_ai", this.A03);
                i = -1144186145;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
