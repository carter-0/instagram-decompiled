package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2pD  reason: invalid class name and case insensitive filesystem */
public final class C230212pD extends C252233om implements AnonymousClass0iw, C252243on, C230222pE, C230232pF {
    public static final String __redex_internal_original_name = "ReelNetegoController";
    public C317766nn A00;
    public AnonymousClass6UX A01;
    public AnonymousClass6VJ A02;
    public final C227812jx A03;
    public final UserSession A04;
    public final C228162kt A05;
    public final AnonymousClass4DU A06;
    public final C230252pH A07;
    public final C230262pI A08 = new C230262pI();
    public final C249763kK A09;
    public final C228472lj A0A;
    public final C228102kn A0B;

    public C230212pD(C227812jx r7, UserSession userSession, C228162kt r9, AnonymousClass4DU r10, C228102kn r11, C249763kK r12, C228472lj r13) {
        this.A04 = userSession;
        this.A06 = r10;
        this.A0B = r11;
        this.A03 = r7;
        this.A05 = r9;
        this.A09 = r12;
        this.A0A = r13;
        this.A07 = new C230252pH(this, userSession, (String) null, (String) null, (String) null);
    }

    public final void A04(RecyclerView recyclerView, Reel reel, Integer num, String str, String str2, List list, float f, int i, int i2, boolean z) {
        RecyclerView recyclerView2 = recyclerView;
        0qQ.A0B(recyclerView, 5);
        Reel reel2 = reel;
        if (1OP.A0B(reel2, this.A02)) {
            AnonymousClass6VJ r1 = this.A02;
            if (r1 != null) {
                r1.A05(AnonymousClass05K.A0C);
            }
            C252553pI r12 = recyclerView.A0D;
            int i3 = i;
            if (r12 != null) {
                r12.A1T((AnonymousClass3AW) null, recyclerView, i3);
            }
            int i4 = 0;
            boolean z2 = false;
            if (recyclerView.A0W(i3) != null) {
                z2 = true;
            }
            C51555Fw1 fw1 = new C51555Fw1(recyclerView2, reel2, this, num, str, str2, list, f, i3, i2, z);
            if (!z2) {
                i4 = 100;
            }
            recyclerView.postDelayed(fw1, (long) i4);
        }
    }

    public final void CLl(String str) {
    }

    public final void D0J(Reel reel) {
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final void DIR() {
    }

    public final /* synthetic */ void DR6() {
    }

    public final void DU2() {
    }

    public final void DVw() {
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final void DcY(C62539KhV khV, String str) {
        0qQ.A0B(khV, 0);
        int ordinal = khV.ordinal();
        if (ordinal == 0) {
            Bundle bundle = new Bundle();
            C227812jx r2 = this.A03;
            AnonymousClass6W8.A02(r2.requireActivity(), bundle, this.A04, TransparentModalActivity.class, C273654mx.A00(236)).A0C(r2.requireActivity());
        } else if (ordinal == 1) {
            new C2355930l(this.A03.requireActivity(), this.A04).CfX(C62574Ki7.UNKNOWN, false, false);
        }
    }

    public final void DcZ(Reel reel, AnonymousClass3BN r10, int i) {
        0qQ.A0B(reel, 0);
        0qQ.A0B(r10, 2);
        this.A07.A02(reel, r10, (Boolean) null, true, (Integer) null, i);
    }

    public final /* synthetic */ void Dca(C249703kE r13, AnonymousClass3O9 r14, Integer num, String str, String str2, List list, int i, boolean z) {
        String str3 = str;
        0qQ.A0B(str3, 1);
        List list2 = list;
        0qQ.A0B(list2, 3);
        0qQ.A0B(r13, 4);
        Dcb(r13, r14, num, str3, str2, "", list2, 0.0f, i, 0, z);
    }

    public final void Dcb(C249703kE r15, AnonymousClass3O9 r16, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
        String C9L;
        String id;
        Long l;
        String str4 = str;
        0qQ.A0B(str4, 0);
        List list2 = list;
        0qQ.A0B(list2, 2);
        C249703kE r4 = r15;
        0qQ.A0B(r15, 3);
        String str5 = str3;
        0qQ.A0B(str5, 10);
        UserSession userSession = this.A04;
        Reel A0M = ReelStore.A03(userSession).A0M(str4);
        if (A0M != null) {
            Integer num2 = num;
            String str6 = str2;
            float f2 = f;
            int i3 = i2;
            boolean z2 = z;
            if (r15.itemView.getParent() instanceof RecyclerView) {
                ViewParent parent = r15.itemView.getParent();
                0qQ.A0C(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                A04((RecyclerView) parent, A0M, num2, str6, str5, list2, f2, i, i3, z2);
            } else {
                A01(r4, A0M, num2, str6, str5, list2, f2, i3, z2);
            }
            if (r16 != null && (C9L = r16.C9L()) != null && (id = r16.getId()) != null) {
                String obj = r16.B5J().toString();
                Integer BVp = r16.BVp();
                if (BVp != null) {
                    l = Long.valueOf((long) BVp.intValue());
                } else {
                    l = null;
                }
                AnonymousClass3PI.A05(this, userSession, l, obj, id, C273654mx.A00(2223), C9L);
            }
        }
    }

    public final void Dcd(Reel reel, AnonymousClass3BN r9, Integer num, int i) {
        0qQ.A0B(reel, 0);
        0qQ.A0B(r9, 2);
        this.A07.A02(reel, r9, (Boolean) null, (Boolean) null, num, i);
    }

    public final void Dcf(List list, int i, String str) {
    }

    public final void Dci(String str) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public final void Du3(int i) {
    }

    public final void E0D(C249703kE r11, Reel reel, Integer num, String str, String str2, List list) {
        0qQ.A0B(r11, 0);
        0qQ.A0B(reel, 1);
        List list2 = list;
        0qQ.A0B(list2, 2);
        0qQ.A0B(str2, 5);
        A01(r11, reel, num, str, str2, list2, 0.0f, 0, false);
    }

    public static final ArrayList A00(C230212pD r4, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0M = ReelStore.A03(r4.A04).A0M((String) it.next());
            if (A0M != null) {
                arrayList.add(A0M);
            }
        }
        return arrayList;
    }

    private final void A01(C249703kE r26, Reel reel, Integer num, String str, String str2, List list, float f, int i, boolean z) {
        C249703kE r5 = r26;
        Reel reel2 = reel;
        if (1OP.A0B(reel2, this.A02)) {
            AnonymousClass6VJ r1 = this.A02;
            if (r1 != null) {
                r1.A05(AnonymousClass05K.A0C);
            }
            Integer num2 = num;
            String str3 = str;
            String str4 = str2;
            List list2 = list;
            if (r5 instanceof AnonymousClass3N2) {
                A02((RecyclerView) null, reel2, this, (AnonymousClass3N2) r5, num2, str3, str4, list2, f, i, z);
            } else if (r5 instanceof C47008Dp0) {
                C47008Dp0 dp0 = (C47008Dp0) r5;
                Context context = dp0.A00.getContext();
                UserSession userSession = this.A04;
                0qQ.A0B(userSession, 0);
                AnonymousClass3PP A002 = AnonymousClass3PO.A00(userSession);
                UserSession userSession2 = userSession;
                AnonymousClass6VJ A042 = 1OP.A04(context, userSession2, reel2, new PJK(new C50891FkM(reel2, this, dp0, num2, str4, str3, list2)), A002, this.A06.getModuleName(), -1);
                A042.A04();
                this.A05.EBt(A042);
                this.A02 = A042;
            }
        }
    }

    public static final void A02(RecyclerView recyclerView, Reel reel, C230212pD r19, AnonymousClass3N2 r20, Integer num, String str, String str2, List list, float f, int i, boolean z) {
        AnonymousClass3N2 r8 = r20;
        Context context = r8.BkN().getContext();
        C230212pD r7 = r19;
        UserSession userSession = r7.A04;
        1OP r0 = 1OP.$redex_init_class;
        0qQ.A0B(userSession, 0);
        AnonymousClass3PP A002 = AnonymousClass3PO.A00(userSession);
        Reel reel2 = reel;
        UserSession userSession2 = userSession;
        AnonymousClass6VJ A042 = 1OP.A04(context, userSession2, reel, new AnonymousClass6VH(new C50892FkO(recyclerView, reel2, r7, r8, num, str, str2, list, f, i, z), r8.Bkt(), reel2.A1P), A002, r7.A06.getModuleName(), -1);
        A042.A04();
        r8.Ei5(A042);
        r7.A05.EBt(A042);
        r7.A02 = A042;
    }

    public static final void A03(C230212pD r2) {
        C230262pI r0 = r2.A08;
        C230262pI A042 = r0.A04();
        r0.A05();
        AnonymousClass2f9.A00(r2.A04).A0L(A042);
    }

    public final void A05(RecyclerView recyclerView, Integer num, String str, String str2, boolean z) {
        String str3 = str;
        RecyclerView recyclerView2 = recyclerView;
        C2365834h r7 = recyclerView2.A0A;
        if (r7 != null) {
            C2365834h r72 = r7;
            List list = r72.A04;
            for (int i = 0; i < list.size(); i++) {
                AnonymousClass3BT r4 = (AnonymousClass3BT) list.get(i);
                if (!r4.A03.A0d() && !r4.A03.A1a) {
                    UserSession userSession = r72.A0A;
                    if ((r72.A00(userSession).A01.A01.A01 == 0 && r4.A04(userSession)) || !r4.A04(userSession)) {
                        AnonymousClass6VJ r1 = this.A02;
                        if (r1 != null) {
                            Reel reel = r4.A03;
                            if (str == null) {
                                str3 = "";
                            }
                            r1.A05(AnonymousClass05K.A0C);
                            C2365834h r12 = recyclerView2.A0A;
                            0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.reels.ui.ScrollableReelTrayAdapter");
                            C2365834h r13 = r12;
                            int CMG = r13.CMG(reel);
                            Integer num2 = num;
                            String str4 = str2;
                            boolean z2 = z;
                            if (recyclerView2.A0W(CMG) != null) {
                                List list2 = r13.A03;
                                0qQ.A07(list2);
                                A04(recyclerView2, reel, num2, str3, str4, list2, 0.0f, CMG, 0, z2);
                                return;
                            }
                            recyclerView2.A15(new C46860Dmc(reel, this, r13, num2, str3, str4, CMG, z2));
                            C252553pI r14 = recyclerView2.A0D;
                            0qQ.A0C(r14, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            if (CMG <= ((LinearLayoutManager) r14).A1d()) {
                                CMG = Math.max(CMG - 1, 0);
                            }
                            recyclerView2.A0p(CMG);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final /* synthetic */ int C8o() {
        return 0;
    }

    public final void DcK(int i) {
        this.A07.A01(i);
    }

    public final void EGP(long j, int i) {
        C230252pH r2 = this.A07;
        UserSession userSession = this.A04;
        r2.A04(new AnonymousClass3BN(userSession, 1OP.A05(userSession).A0U(false)), this.A0B, AnonymousClass05K.A0u, i, j, false);
    }

    public final void EGQ(long j) {
        C230252pH r2 = this.A07;
        UserSession userSession = this.A04;
        r2.A03(new AnonymousClass3BN(userSession, 1OP.A05(userSession).A0U(false)), this.A0B, (Double) null, AnonymousClass05K.A0u, j, false);
    }

    public final String getModuleName() {
        return this.A06.getModuleName();
    }

    public final void onDestroyView() {
        A03(this);
        AnonymousClass6VJ r1 = this.A02;
        if (r1 != null) {
            this.A05.FJ2(r1);
        }
        this.A00 = null;
        this.A01 = null;
    }

    public final void onPause() {
        A03(this);
        AnonymousClass6VJ r1 = this.A02;
        if (r1 != null) {
            r1.A05(AnonymousClass05K.A0N);
        }
        FragmentActivity requireActivity = this.A03.requireActivity();
        1OP r0 = 1OP.$redex_init_class;
        AnonymousClass3K2 A042 = AnonymousClass3K2.A04(requireActivity);
        if (A042 != null) {
            A042.A0S();
        }
    }
}
