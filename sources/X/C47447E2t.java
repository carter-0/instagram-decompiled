package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.E2t  reason: case insensitive filesystem */
public final class C47447E2t extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "InterestPickerFragment";
    public int A00;
    public TextView A01;
    public C46847DmO A02;
    public C51950G8t A03;
    public String A04 = "";
    public boolean A05;
    public boolean A06;
    public 2el A07;
    public SpinnerImageView A08;
    public User A09;
    public boolean A0A;
    public final HashMap A0B = AnonymousClass7TE.A1E();
    public final HashMap A0C = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A0D = AnonymousClass1YB.A00(new C41562AwU(this, 14));
    public final AnonymousClass0eM A0E = C227642jf.A02(this);
    public final boolean A0F = C61670oa.A0A();

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        if (this.A05) {
            r3.Etr(false);
            return;
        }
        r3.Eu4(true);
        r3.Eom(2131976058);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.recycler_view);
        recyclerView.addOnLayoutChangeListener(new FPP(this, 1));
        C46847DmO dmO = this.A02;
        if (dmO == null) {
            0qQ.A0F("interestAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter(dmO);
        DbV.A1B(getActivity(), recyclerView);
        if (!this.A0A) {
            AnonymousClass0eM r2 = this.A0E;
            C47691EDa.A00(this, FEE.A00(AnonymousClass7TE.A0l(r2)), 12);
            1NY A0b = AnonymousClass7TG.A0b(AnonymousClass7TF.A0L(r2, 0));
            A0b.A0A(AnonymousClass000.A00(1487));
            A0b.A0Q(C47317Duk.class, F4R.class);
            A0b.A0G("caller", "INTEREST_NUX");
            C47691EDa.A00(this, A0b.A0M(), 10);
            this.A0A = true;
        }
    }

    public static final void A00(C47447E2t e2t, long j, boolean z) {
        int i;
        UserSession A0l = AnonymousClass7TE.A0l(e2t.A0E);
        if (z) {
            0qQ.A0B(A0l, 0);
            1NY A0a = AnonymousClass7TG.A0a(A0l);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("interest_nux/");
            A1A.append("select");
            A1A.append('/');
            A1A.append(j);
            A1A.append('/');
            Dba.A1H(A0a, A1A.toString());
            e2t.schedule(A0a.A0M());
            if (e2t.A05) {
                i = e2t.A00 + 1;
            } else {
                return;
            }
        } else {
            0qQ.A0B(A0l, 0);
            1NY A0a2 = AnonymousClass7TG.A0a(A0l);
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            A1A2.append("interest_nux/");
            A1A2.append("unselect");
            A1A2.append('/');
            A1A2.append(j);
            A1A2.append('/');
            Dba.A1H(A0a2, A1A2.toString());
            e2t.schedule(A0a2.A0M());
            if (e2t.A05) {
                i = e2t.A00 - 1;
            } else {
                return;
            }
        }
        e2t.A00 = i;
    }

    public final void A02(boolean z) {
        SpinnerImageView spinnerImageView = this.A08;
        if (spinnerImageView == null) {
            0qQ.A0F("loadingSpinner");
            throw AnonymousClass00P.createAndThrow();
        } else {
            spinnerImageView.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    public final void afterOnPause() {
        Integer num;
        C296865qm r13;
        Long l;
        if (this.A06) {
            User A0l = DbX.A0l(AnonymousClass0t1.A01, this.A0E);
            A0l.A03.EYD(AnonymousClass7TE.A0v());
            C46847DmO dmO = this.A02;
            String str = "interestAdapter";
            if (dmO != null) {
                List<C51954G8x> list = dmO.A03;
                if (list != null) {
                    ArrayList<ExploreTopicCluster> A0p = AnonymousClass7TF.A0p(list);
                    for (C51954G8x g8x : list) {
                        C46847DmO dmO2 = this.A02;
                        if (dmO2 != null) {
                            List list2 = dmO2.A03;
                            if (list2 != null) {
                                ArrayList A1C = AnonymousClass7TE.A1C();
                                for (Object next : list2) {
                                    HashMap hashMap = dmO2.A02;
                                    String B6N = ((C51954G8x) next).B6N();
                                    if (B6N != null) {
                                        l = 00y.A0n(10, B6N);
                                    } else {
                                        l = null;
                                    }
                                    Boolean bool = (Boolean) hashMap.get(l);
                                    if (bool != null && bool.booleanValue()) {
                                        A1C.add(next);
                                    }
                                }
                                boolean contains = A1C.contains(g8x);
                                String B6N2 = g8x.B6N();
                                if (B6N2 == null) {
                                    B6N2 = "";
                                }
                                String name = g8x.getName();
                                if (name == null) {
                                    name = "";
                                }
                                String name2 = g8x.getName();
                                if (name2 == null) {
                                    name2 = "";
                                }
                                Integer num2 = AnonymousClass05K.A1F;
                                if (contains) {
                                    r13 = C296865qm.INTERESTED;
                                } else {
                                    r13 = C296865qm.SUGGESTED;
                                }
                                A0p.add(new ExploreTopicCluster(r13, num2, B6N2, name, name2, (String) null, (String) null, (String) null, (String) null, 0, 0, false, false));
                            }
                        }
                    }
                    C46556Dgy dgy = (C46556Dgy) this.A0D.getValue();
                    ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
                    for (ExploreTopicCluster exploreTopicCluster : A0p) {
                        0qQ.A0B(exploreTopicCluster, 0);
                        String str2 = exploreTopicCluster.A06;
                        String str3 = exploreTopicCluster.A09;
                        if (exploreTopicCluster.A01 == C296865qm.SUGGESTED) {
                            num = AnonymousClass05K.A0N;
                        } else {
                            num = AnonymousClass05K.A0Y;
                        }
                        A0p2.add(new C46558Dh0(exploreTopicCluster, num, str2, str3));
                    }
                    C46556Dgy.A01(dgy, AnonymousClass05K.A01, A0p2);
                    C46556Dgy.A00(dgy);
                }
                str = "interestList";
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        super.afterOnPause();
    }

    public final String getModuleName() {
        if (this.A05) {
            return C273654mx.A00(765);
        }
        return AnonymousClass000.A00(5022);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public final void A01(String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str2, str3);
        AnonymousClass0eM r3 = this.A0E;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0P(this, r3), AnonymousClass000.A00(3303));
        A0e.A9F("viewer_id", Long.valueOf(Dbb.A08(r3)));
        DbS.A1K(A0e, getModuleName());
        A0e.AAJ("action_type", str);
        A0e.AAJ("topic_name", str2);
        A0e.AAJ(AnonymousClass000.A00(3134), str3);
        DbX.A1L(A0e);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(740055529);
        Bundle requireArguments = requireArguments();
        this.A07 = DbY.A0U();
        Context requireContext = requireContext();
        2el r1 = this.A07;
        if (r1 == null) {
            str = "viewpointManager";
        } else {
            this.A02 = new C46847DmO(requireContext, r1, this);
            boolean z = requireArguments.getBoolean("IS_SIGN_UP_FLOW");
            this.A05 = z;
            C46847DmO dmO = this.A02;
            str = "interestAdapter";
            if (dmO != null) {
                dmO.A05 = z;
                dmO.A06 = this.A0F;
                C47447E2t.super.onCreate(bundle);
                AnonymousClass0fD.A09(-2050480513, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0135, code lost:
        if (r0 == null) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            r0 = -1547503580(0xffffffffa3c2f824, float:-2.1138614E-17)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r6 = 0
            X.0qQ.A0B(r11, r6)
            r0 = 2131628056(0x7f0e1018, float:1.8883394E38)
            android.view.View r4 = r11.inflate(r0, r12, r6)
            r0 = 2131434967(0x7f0b1dd7, float:1.8491763E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r4, r0)
            X.61u r2 = (X.C3021461u) r2
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = X.DbX.A0k(r4)
            r10.A08 = r0
            r0 = 2131442980(0x7f0b3d24, float:1.8508015E38)
            android.view.View r9 = X.AnonymousClass7TF.A0F(r4, r0)
            com.google.android.material.appbar.MaterialToolbar r9 = (com.google.android.material.appbar.MaterialToolbar) r9
            r0 = 2131442989(0x7f0b3d2d, float:1.8508033E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r4, r0)
            X.G8t r0 = X.C49047EoR.A00(r10)
            r10.A03 = r0
            X.0eE r0 = X.AnonymousClass0t1.A01
            X.0eM r8 = r10.A0E
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r8)
            r10.A09 = r0
            boolean r0 = r10.A05
            r7 = 0
            if (r0 == 0) goto L_0x00a2
            r0 = 2131434969(0x7f0b1dd9, float:1.8491767E38)
            com.instagram.igds.components.button.IgdsButton r1 = X.DbU.A0b(r4, r0)
            r0 = 2131973919(0x7f13571f, float:1.9584887E38)
            r1.setText((int) r0)
            r0 = 60
            X.FP0.A00(r1, r0, r10)
            r1.setVisibility(r6)
            r2.setVisibility(r6)
            android.content.Context r1 = r10.getContext()
            if (r1 == 0) goto L_0x006b
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x006b:
            r2.setPrimaryActionText(r7)
            r1 = 61
            X.FP0 r0 = new X.FP0
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.setPrimaryActionOnClickListener(r0)
            r0 = 2131964428(0x7f13320c, float:1.9565637E38)
            java.lang.String r0 = r10.getString(r0)
            r9.setTitle((java.lang.CharSequence) r0)
            r0 = 2131428074(0x7f0b02ea, float:1.8477782E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r4, r0)
            com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
            r1 = 1
            X.FSy r0 = new X.FSy
            r0.<init>(r5, r9, r1)
            r2.A02(r0)
        L_0x0094:
            X.2el r0 = r10.A07
            if (r0 != 0) goto L_0x0139
            java.lang.String r9 = "viewpointManager"
        L_0x009a:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a2:
            r1 = 8
            r2.setVisibility(r1)
            r9.setVisibility(r1)
            r5.setVisibility(r1)
            r0 = 2131434966(0x7f0b1dd6, float:1.849176E38)
            X.DbT.A1F(r4, r0, r1)
            r0 = 2131437015(0x7f0b25d7, float:1.8495917E38)
            X.DbT.A1F(r4, r0, r6)
            r0 = 2131435830(0x7f0b2136, float:1.8493513E38)
            android.widget.TextView r0 = X.DbU.A0G(r4, r0)
            r10.A01 = r0
            X.0lg r5 = X.DbT.A0X(r8)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327078203242651(0x810f490008389b, double:3.03672876090898E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r5 = 1
            java.lang.String r9 = "manageSubtitle"
            if (r0 == 0) goto L_0x010a
            com.instagram.user.model.User r0 = r10.A09
            if (r0 != 0) goto L_0x00dd
            java.lang.String r9 = "user"
            goto L_0x009a
        L_0x00dd:
            X.4Cl r0 = r0.A03
            X.16q r0 = r0.C31()
            if (r0 == 0) goto L_0x010a
            java.lang.Boolean r0 = r0.CSM()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r5)
            if (r0 == 0) goto L_0x010a
            X.0lg r0 = X.AnonymousClass7TF.A0L(r8, r6)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "supervision/guardians/"
            r2.A0A(r0)
            java.lang.Class<X.DuZ> r1 = X.C47306DuZ.class
            java.lang.Class<X.F4L> r0 = X.F4L.class
            X.1OC r1 = X.DbT.A0R(r7, r2, r1, r0, r6)
            r0 = 11
            X.C47691EDa.A00(r10, r1, r0)
            goto L_0x0125
        L_0x010a:
            android.widget.TextView r2 = r10.A01
            if (r2 == 0) goto L_0x009a
            android.content.Context r1 = r10.getContext()
            if (r1 == 0) goto L_0x011b
            r0 = 2131976059(0x7f135f7b, float:1.9589228E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x011b:
            r2.setText(r7)
            android.widget.TextView r0 = r10.A01
            if (r0 == 0) goto L_0x009a
            r0.setVisibility(r6)
        L_0x0125:
            boolean r1 = r10.A0F
            android.widget.TextView r0 = r10.A01
            if (r1 == 0) goto L_0x0135
            if (r0 == 0) goto L_0x009a
            r5 = 8388611(0x800003, float:1.1754948E-38)
        L_0x0130:
            r0.setGravity(r5)
            goto L_0x0094
        L_0x0135:
            if (r0 != 0) goto L_0x0130
            goto L_0x009a
        L_0x0139:
            X.Dba.A0z(r4, r0, r10)
            r0 = 1024767638(0x3d14b696, float:0.03630694)
            X.AnonymousClass0fD.A09(r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47447E2t.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
