package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class NKQ extends AnonymousClass4DH implements C229122ms, C74470PvQ, JPL, C74492Pvm, AnonymousClass4DS, G82, AnonymousClass7WV {
    public static final String __redex_internal_original_name = "ThreadDetailsPeopleFragment";
    public int A00;
    public C313756gx A01;
    public ODR A02;
    public C74449Pv4 A03;
    public NLD A04;
    public C70613ODk A05;
    public OVU A06;
    public C70718OHn A07;
    public C66965Mfy A08;
    public C47167Dri A09;
    public N4P A0A;
    public boolean A0B;
    public RecyclerView A0C;
    public 2dZ A0D;
    public 0wc A0E;
    public Capabilities A0F;
    public C72180Oxp A0G;
    public C330957Ox A0H;
    public C254793t3 A0I;
    public boolean A0J;
    public final O7G A0K = new O7G(this);
    public final AnonymousClass0eM A0L = C227642jf.A02(this);
    public final Ot0 A0M = new Ot0(this, 3);
    public final 27S A0N = new Ot0(this, 4);
    public final 1a8 A0O = C66580MXl.A0O();
    public final C358618bC A0P = new C72739PHt(this, 6);

    public final void AHB() {
    }

    public final boolean CZf(User user) {
        return false;
    }

    public final boolean CbR(User user) {
        return true;
    }

    public final void CtI(User user) {
        0qQ.A0B(user, 0);
        OVU ovu = this.A06;
        if (ovu == null) {
            0qQ.A0F("groupRequestsController");
            throw AnonymousClass00P.createAndThrow();
        }
        N4P n4p = ovu.A00;
        if (n4p != null && (n4p.A08() instanceof DirectThreadKey)) {
            String A092 = C66647MaG.A09(n4p.A08());
            if (A092 != null) {
                Context context = ovu.A03;
                C358248ab A0Y = DbS.A0Y(context);
                A0Y.A05 = user.getUsername();
                A0Y.A08(2131972094);
                A0Y.A0s(true);
                A0Y.A0Y(new C71186Of4(user, ovu, A092, 2), C358278ae.RED, AnonymousClass7TE.A16(context, 2131972039), true);
                DbX.A16(C71212Ofd.A00, A0Y);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Cvz(C68303N9q n9q) {
    }

    public final void DRW(C68303N9q n9q) {
        C242243Te r2;
        if (isResumed()) {
            FragmentActivity requireActivity = requireActivity();
            User user = n9q.A00;
            AnonymousClass0eM r1 = this.A0L;
            String str = null;
            F7B.A00(requireActivity, this, this, AnonymousClass7TE.A0l(r1), user, __redex_internal_original_name, (String) null, false);
            N4P n4p = this.A0A;
            if (n4p != null && n4p.A09 == 29 && (r2 = n4p.A0E) != null) {
                String str2 = null;
                C254793t3 r0 = n4p.A0L;
                if (r0 != null) {
                    str = C300965yF.A07(r0);
                }
                N4P n4p2 = this.A0A;
                if (n4p2 != null) {
                    str2 = n4p2.A0Q;
                }
                C313756gx r8 = this.A01;
                if (r8 == null) {
                    0qQ.A0F("broadcastChatLogger");
                    throw AnonymousClass00P.createAndThrow();
                }
                C313756gx.A07(r8, str, str2, user.getId(), DialogModule.KEY_MESSAGE, C329997La.A00(r2, DbU.A0u(r1), n4p.A09), n4p.A06());
            }
        }
    }

    public final boolean Dw3(User user, boolean z) {
        0qQ.A0B(user, 0);
        OVU ovu = this.A06;
        if (ovu == null) {
            0qQ.A0F("groupRequestsController");
            throw AnonymousClass00P.createAndThrow();
        }
        N4P n4p = ovu.A00;
        if (n4p == null) {
            return true;
        }
        Set set = ovu.A07;
        int size = set.size();
        int i = -1;
        if (z) {
            i = 1;
        }
        if (DbT.A01(00k.A0a(n4p.A0T), size + i) > ovu.A02) {
            return false;
        }
        if (z) {
            set.add(user);
        } else {
            set.remove(user);
        }
        ovu.A01();
        return true;
    }

    public final void DwU(C68303N9q n9q) {
        UserSession A0l = AnonymousClass7TE.A0l(this.A0L);
        FragmentActivity requireActivity = requireActivity();
        Capabilities capabilities = this.A0F;
        Long l = null;
        if (capabilities == null) {
            0qQ.A0F("threadCapabilities");
            throw AnonymousClass00P.createAndThrow();
        }
        MessagingUser A002 = MessagingUser.A00(n9q.A00);
        N4P n4p = this.A0A;
        if (n4p != null) {
            l = n4p.A0M;
        }
        C330397Mp.A06(requireActivity, this, A0l, capabilities, A002, l);
    }

    public final boolean Etx(C254793t3 r10, String str, int i) {
        N4P n4p = this.A0A;
        if (n4p == null || !r10.equals(n4p.A0L)) {
            return false;
        }
        C330957Ox.A04.A01(requireContext(), AnonymousClass7TE.A0l(this.A0L), str, n4p.A0P, i);
        return true;
    }

    public final void configureActionBar(2da r8) {
        0qQ.A0B(r8, 0);
        r8.Eu4(true);
        int i = 2131959009;
        if (this.A0J) {
            i = 2131972171;
        }
        r8.Eom(i);
        N4P n4p = this.A0A;
        C47167Dri dri = this.A09;
        if (n4p != null && dri != null && !this.A0J) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0L);
            Capabilities capabilities = this.A0F;
            if (capabilities == null) {
                0qQ.A0F("threadCapabilities");
                throw AnonymousClass00P.createAndThrow();
            }
            boolean z = this.A0B;
            0qQ.A0B(A0l, 0);
            if (dri.A01 != 29 && FFK.A02(A0l, capabilities, dri, z)) {
                AnonymousClass3JR A0K2 = DbS.A0K();
                A0K2.A06 = R.drawable.instagram_user_follow_pano_outline_24;
                A0K2.A05 = 2131958570;
                DbX.A19(new C71405Ok4(61, dri, this), A0K2, r8);
            }
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A0C = DbZ.A0F(view2, R.id.recycler_view);
        Context requireContext = requireContext();
        AnonymousClass0eM r3 = this.A0L;
        this.A04 = new NLD(requireContext, this, AnonymousClass7TE.A0l(r3), this, new PRA(this), new PRC(this), this, this, this.A0J, false);
        if (this.A0C == null) {
            DbT.A1Q(0wj.A01, "ThreadDetailsPeopleFragment - recycler view is null", 20134884);
        }
        RecyclerView recyclerView = this.A0C;
        String str = "recyclerView";
        if (recyclerView != null) {
            recyclerView.setAdapter(this.A04);
            RecyclerView recyclerView2 = this.A0C;
            if (recyclerView2 != null) {
                DbU.A15(getContext(), recyclerView2, 1, false);
                this.A02 = new ODR(requireActivity(), AnonymousClass7TE.A0l(r3));
                1a8 r32 = this.A0O;
                C74449Pv4 pv4 = this.A03;
                if (pv4 == null) {
                    str = "clientInfra";
                } else {
                    PU8.A00(C66789Mca.A00(pv4.BNa().APA(), C74053PoI.A00, 4), r32, this, 31);
                    A01(this);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(NKQ nkq) {
        C74449Pv4 pv4 = nkq.A03;
        if (pv4 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C74550Pwj.A00(pv4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void APp() {
        /*
            r23 = this;
            r12 = r23
            X.N4P r15 = r12.A0A
            if (r15 == 0) goto L_0x021a
            android.content.Context r11 = r12.requireContext()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.0eM r0 = r12.A0L
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            boolean r3 = X.OXA.A02(r3, r15)
            java.lang.String r9 = "threadCapabilities"
            if (r3 != 0) goto L_0x0210
            com.instagram.common.session.UserSession r20 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r18 = r12.requireActivity()
            com.instagram.direct.capabilities.Capabilities r4 = r12.A0F
            if (r4 == 0) goto L_0x0119
            X.P2j r3 = new X.P2j
            r16 = r3
            r17 = r11
            r19 = r12
            r21 = r4
            r22 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22)
            boolean r6 = r3.isEnabled()
            r2.add(r3)
        L_0x0042:
            com.instagram.common.session.UserSession r19 = X.AnonymousClass7TE.A0l(r0)
            X.N4P r5 = r12.A0A
            if (r5 == 0) goto L_0x0222
            com.instagram.direct.capabilities.Capabilities r4 = r12.A0F
            if (r4 == 0) goto L_0x0119
            androidx.fragment.app.FragmentActivity r18 = r12.requireActivity()
            r22 = r6 ^ 1
            X.P2o r3 = new X.P2o
            r16 = r3
            r17 = r11
            r20 = r4
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.add(r3)
            boolean r3 = r12.A0J
            java.lang.String r6 = "groupRequestsController"
            if (r3 != 0) goto L_0x008a
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.direct.capabilities.Capabilities r14 = r12.A0F
            if (r14 == 0) goto L_0x0119
            X.3sy r17 = r15.A08()
            X.OVU r3 = r12.A06
            if (r3 == 0) goto L_0x020b
            X.OLT r4 = r3.A01
            X.8bC r3 = r12.A0P
            X.P2s r10 = new X.P2s
            r16 = r3
            r18 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r2.add(r10)
        L_0x008a:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.P2R r7 = new X.P2R
            r7.<init>(r11, r3, r15)
            X.3t3 r3 = r12.A0I
            java.lang.String r9 = "threadId"
            if (r3 == 0) goto L_0x0119
            boolean r3 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r3 == 0) goto L_0x00a0
            r2.add(r7)
        L_0x00a0:
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r0)
            X.OVU r5 = r12.A06
            if (r5 == 0) goto L_0x020b
            boolean r4 = r12.A0B
            X.P2e r3 = new X.P2e
            r16 = r3
            r17 = r11
            r19 = r5
            r20 = r15
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            com.instagram.common.session.UserSession r4 = X.C66581MXm.A0R(r3, r2, r0)
            X.3t3 r5 = r15.A0L
            r3 = 0
            X.0qQ.A0B(r4, r3)
            if (r5 == 0) goto L_0x00d1
            X.9HW r4 = X.AnonymousClass9HV.A00(r4)
            r3 = 34
            boolean r3 = r4.A00(r5, r3)
            if (r3 != 0) goto L_0x01a7
        L_0x00d1:
            X.3Te r3 = r15.A0E
            if (r3 == 0) goto L_0x00df
            java.util.List r3 = r3.A0E
            if (r3 == 0) goto L_0x00df
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01a7
        L_0x00df:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.MmR r4 = X.C67350MmR.DEFAULT
            X.P2f r3 = new X.P2f
            r3.<init>(r11, r6, r15, r4)
            com.instagram.common.session.UserSession r3 = X.C66581MXm.A0R(r3, r2, r0)
            X.P2P r8 = new X.P2P
            r8.<init>(r3, r15, r4)
        L_0x00f3:
            r2.add(r8)
        L_0x00f6:
            X.3t3 r3 = r12.A0I
            if (r3 == 0) goto L_0x0119
            boolean r3 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r3 != 0) goto L_0x0101
            r2.add(r7)
        L_0x0101:
            X.ODk r3 = r12.A05
            if (r3 == 0) goto L_0x0176
            java.util.Map r4 = r3.A00
            if (r4 == 0) goto L_0x0176
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0176
            X.3Te r6 = r15.A0E
            if (r6 == 0) goto L_0x015b
            X.6gx r10 = r12.A01
            if (r10 != 0) goto L_0x0121
            java.lang.String r9 = "broadcastChatLogger"
        L_0x0119:
            X.0qQ.A0F(r9)
        L_0x011c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0121:
            int r9 = r15.A06()
            java.lang.String r8 = X.C300965yF.A07(r5)
            java.lang.String r7 = r15.A0Q
            java.lang.String r5 = X.DbU.A0u(r0)
            int r3 = r15.A09
            java.lang.String r5 = X.C329997La.A00(r6, r5, r3)
            X.1Ln r6 = X.DbT.A0J(r10)
            boolean r3 = X.DbT.A1Y(r6)
            if (r3 == 0) goto L_0x015b
            java.lang.String r3 = "user_type"
            java.util.Map r5 = X.AnonymousClass7TF.A0w(r3, r5)
            X.DbW.A17(r6, r10)
            java.lang.String r3 = "member_list_rendered"
            X.C66581MXm.A1I(r6, r3)
            java.lang.String r3 = "people_section"
            r6.A0p(r3)
            java.lang.String r3 = "thread_details_people"
            java.lang.Long r3 = X.DbZ.A0b(r6, r3, r8, r7, r9)
            X.JTQ.A1C(r6, r3, r5)
        L_0x015b:
            X.MmR r3 = X.C67350MmR.MUTUAL_FOLLOWERS
            java.util.List r3 = r12.A00(r11, r15, r3, r4)
            r2.addAll(r3)
            X.MmR r3 = X.C67350MmR.FOLLOWERS
            java.util.List r3 = r12.A00(r11, r15, r3, r4)
            r2.addAll(r3)
            X.MmR r3 = X.C67350MmR.CREATORS
            java.util.List r3 = r12.A00(r11, r15, r3, r4)
            r2.addAll(r3)
        L_0x0176:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.OHn r3 = r12.A07
            if (r3 != 0) goto L_0x0181
            java.lang.String r9 = "pendingChannelMembersController"
            goto L_0x0119
        L_0x0181:
            X.P2Q r0 = new X.P2Q
            r0.<init>(r4, r3, r15)
            r2.add(r0)
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r2)
        L_0x018d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0213
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r3)
            X.PuA r2 = (X.C74394PuA) r2
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x018d
            java.util.List r0 = r2.getItems()
            r1.addAll(r0)
            goto L_0x018d
        L_0x01a7:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.MmR r6 = X.C67350MmR.ADMINS_AND_MODERATORS
            X.P2f r3 = new X.P2f
            r3.<init>(r11, r4, r15, r6)
            com.instagram.common.session.UserSession r4 = X.C66581MXm.A0R(r3, r2, r0)
            X.P2P r3 = new X.P2P
            r3.<init>(r4, r15, r6)
            com.instagram.common.session.UserSession r3 = X.C66581MXm.A0R(r3, r2, r0)
            boolean r3 = X.AnonymousClass7OI.A01(r3, r5)
            if (r3 != 0) goto L_0x01df
            X.3Te r4 = r15.A0E
            if (r4 == 0) goto L_0x00f6
            java.util.List r3 = r4.A0B
            if (r3 == 0) goto L_0x01d3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01df
        L_0x01d3:
            java.util.List r3 = r4.A0D
            if (r3 == 0) goto L_0x00f6
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01df
            goto L_0x00f6
        L_0x01df:
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.MmR r6 = X.C67350MmR.COLLABORATOR
            X.P2P r8 = new X.P2P
            r8.<init>(r3, r15, r6)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.P2f r3 = new X.P2f
            r3.<init>(r11, r4, r15, r6)
            r2.add(r3)
            java.util.List r3 = r8.getItems()
            boolean r3 = X.AnonymousClass7TE.A1b(r3)
            if (r3 != 0) goto L_0x00f3
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.P2N r8 = new X.P2N
            r8.<init>(r3, r15)
            goto L_0x00f3
        L_0x020b:
            X.0qQ.A0F(r6)
            goto L_0x011c
        L_0x0210:
            r6 = 0
            goto L_0x0042
        L_0x0213:
            X.NLD r0 = r12.A04
            if (r0 == 0) goto L_0x021a
            r0.A00(r1)
        L_0x021a:
            X.2dZ r0 = r12.A0D
            if (r0 != 0) goto L_0x0227
            java.lang.String r9 = "actionBarService"
            goto L_0x0119
        L_0x0222:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0227:
            r0.A0T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKQ.APp():void");
    }

    public final boolean CJz() {
        C70718OHn oHn = this.A07;
        if (oHn != null) {
            return C66580MXl.A1b(oHn.A07);
        }
        0qQ.A0F("pendingChannelMembersController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        C70718OHn oHn = this.A07;
        if (oHn != null) {
            return oHn.A03;
        }
        0qQ.A0F("pendingChannelMembersController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        C70718OHn oHn = this.A07;
        if (oHn != null) {
            return oHn.A02;
        }
        0qQ.A0F("pendingChannelMembersController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CgO() {
        C70718OHn oHn = this.A07;
        if (oHn == null) {
            0qQ.A0F("pendingChannelMembersController");
            throw AnonymousClass00P.createAndThrow();
        }
        oHn.A02 = false;
        N4P n4p = oHn.A00;
        if (n4p != null) {
            C300965yF.A06(n4p.A0L);
        }
    }

    public final void Cua(int i, String str, String str2) {
        C313756gx r8;
        int i2;
        Integer num;
        C72180Oxp oxp;
        int A062;
        Integer num2;
        String str3 = str2;
        String str4 = str;
        N4P n4p = this.A0A;
        if (n4p != null && n4p.A09 == 29) {
            String A032 = N4P.A03(n4p);
            String str5 = n4p.A0Q;
            int i3 = i;
            if (i3 != 2) {
                if (i3 == 3) {
                    oxp = this.A0G;
                    if (oxp != null) {
                        A062 = n4p.A06();
                        num2 = AnonymousClass05K.A00;
                    }
                    0qQ.A0F("moderatorRoleCreatorBroadcastChannelLogger");
                    throw AnonymousClass00P.createAndThrow();
                } else if (i3 == 6) {
                    r8 = this.A01;
                    if (r8 != null) {
                        i2 = n4p.A06();
                        num = AnonymousClass05K.A01;
                    }
                    0qQ.A0F("broadcastChatLogger");
                    throw AnonymousClass00P.createAndThrow();
                } else if (i3 == 7) {
                    oxp = this.A0G;
                    if (oxp != null) {
                        A062 = n4p.A06();
                        num2 = AnonymousClass05K.A01;
                    }
                    0qQ.A0F("moderatorRoleCreatorBroadcastChannelLogger");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    return;
                }
                HashMap A1E = AnonymousClass7TE.A1E();
                String str6 = "";
                if (str == null) {
                    str4 = str6;
                }
                A1E.put("error_message", str4);
                if (str2 != null) {
                    str6 = str3;
                }
                A1E.put(TraceFieldType.ErrorCode, str6);
                A1E.put("invite_status", C66584MXp.A0X(num2));
                C69871NtZ.A00(oxp.A00, A032, str5, "remove_moderator_error", "view", "remove_moderator", "thread_details_people", A1E, A062);
                return;
            }
            r8 = this.A01;
            if (r8 != null) {
                i2 = n4p.A06();
                num = AnonymousClass05K.A00;
            }
            0qQ.A0F("broadcastChatLogger");
            throw AnonymousClass00P.createAndThrow();
            1Ln A0J2 = DbT.A0J(r8);
            if (DbT.A1Y(A0J2)) {
                HashMap A1E2 = AnonymousClass7TE.A1E();
                if (str == null) {
                    str4 = "";
                }
                A1E2.put("error_message", str4);
                if (str2 == null) {
                    str3 = "";
                }
                A1E2.put(TraceFieldType.ErrorCode, str3);
                A1E2.put("invite_status", C66584MXp.A0X(num));
                DbW.A17(A0J2, r8);
                Dba.A1D(A0J2, "remove_collaborator_error");
                A0J2.A0p("remove_collaborator");
                JTQ.A1C(A0J2, DbZ.A0b(A0J2, "thread_details_people", A032, str5, i2), A1E2);
            }
        }
    }

    public final void Cub(int i) {
        C313756gx r4;
        int i2;
        Integer num;
        C72180Oxp oxp;
        int A062;
        Integer num2;
        N4P n4p = this.A0A;
        if (n4p != null && n4p.A09 == 29) {
            String A032 = N4P.A03(n4p);
            String str = n4p.A0Q;
            if (i != 2) {
                if (i == 3) {
                    oxp = this.A0G;
                    if (oxp != null) {
                        A062 = n4p.A06();
                        num2 = AnonymousClass05K.A00;
                    }
                    0qQ.A0F("moderatorRoleCreatorBroadcastChannelLogger");
                    throw AnonymousClass00P.createAndThrow();
                } else if (i == 6) {
                    r4 = this.A01;
                    if (r4 != null) {
                        i2 = n4p.A06();
                        num = AnonymousClass05K.A01;
                    }
                    0qQ.A0F("broadcastChatLogger");
                    throw AnonymousClass00P.createAndThrow();
                } else if (i == 7) {
                    oxp = this.A0G;
                    if (oxp != null) {
                        A062 = n4p.A06();
                        num2 = AnonymousClass05K.A01;
                    }
                    0qQ.A0F("moderatorRoleCreatorBroadcastChannelLogger");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    return;
                }
                C69871NtZ.A00(oxp.A00, A032, str, "remove_moderator_success", "view", "remove_moderator", "thread_details_people", DbY.A0m("invite_status", C66584MXp.A0X(num2)), A062);
                return;
            }
            r4 = this.A01;
            if (r4 != null) {
                i2 = n4p.A06();
                num = AnonymousClass05K.A00;
            }
            0qQ.A0F("broadcastChatLogger");
            throw AnonymousClass00P.createAndThrow();
            1Ln A0J2 = DbT.A0J(r4);
            if (DbT.A1Y(A0J2)) {
                DbW.A17(A0J2, r4);
                Dba.A1D(A0J2, "remove_collaborator_success");
                A0J2.A0p("remove_collaborator");
                A0J2.A0i(DbZ.A0b(A0J2, "thread_details_people", A032, str, i2));
                A0J2.A0w(AnonymousClass7TF.A0w("invite_status", C66584MXp.A0X(num)));
                A0J2.Cgf();
            }
        }
    }

    public final void DdO(C68303N9q n9q) {
        if (isResumed()) {
            N4P n4p = this.A0A;
            if (n4p != null) {
                C68303N9q n9q2 = n9q;
                String str = "directAdminToolSessionManager";
                if (n9q2.A08) {
                    C313756gx r8 = this.A01;
                    if (r8 == null) {
                        str = "broadcastChatLogger";
                    } else {
                        int A062 = n4p.A06();
                        String A032 = N4P.A03(n4p);
                        String str2 = n4p.A0Q;
                        1Ln A0J2 = DbT.A0J(r8);
                        if (DbT.A1Y(A0J2)) {
                            DbW.A17(A0J2, r8);
                            DbV.A1M(A0J2, C273654mx.A00(3256));
                            A0J2.A0p("remove_button");
                            A0J2.A0i(DbZ.A0b(A0J2, "thread_details_people", A032, str2, A062));
                            A0J2.Cgf();
                        }
                        Context requireContext = requireContext();
                        UserSession A0l = AnonymousClass7TE.A0l(this.A0L);
                        C330957Ox r3 = this.A0H;
                        if (r3 != null) {
                            C71094OcU.A00(requireContext, A0l, this, r3, n4p, n9q2);
                            return;
                        }
                    }
                } else if (n9q2.A0C) {
                    C72180Oxp oxp = this.A0G;
                    if (oxp == null) {
                        str = "moderatorRoleCreatorBroadcastChannelLogger";
                    } else {
                        int A063 = n4p.A06();
                        C69871NtZ.A00(oxp.A00, N4P.A03(n4p), n4p.A0Q, "remove_moderator_dialog_rendered", "tap", "remove_button", "thread_details_people", (HashMap) null, A063);
                        Context requireContext2 = requireContext();
                        UserSession A0l2 = AnonymousClass7TE.A0l(this.A0L);
                        C330957Ox r32 = this.A0H;
                        if (r32 != null) {
                            C71094OcU.A01(requireContext2, A0l2, this, r32, n4p, n9q2);
                            return;
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0z("User is neither Moderator nor Collaborator");
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: X.NKQ} */
    /* JADX WARNING: type inference failed for: r7v17, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r25v7, types: [X.OjM] */
    /* JADX WARNING: type inference failed for: r25v8, types: [X.OjM] */
    /* JADX WARNING: type inference failed for: r25v9, types: [X.OjM] */
    /* JADX WARNING: type inference failed for: r25v10, types: [X.OjM] */
    /* JADX WARNING: type inference failed for: r25v11, types: [X.FOZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0250, code lost:
        if (r1.A0B == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0252, code lost:
        r0 = 2131958928;
        r25 = new X.C71367OjM(3, r5, r4, r6, r13, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0274, code lost:
        if (r9.equals(X.N4P.A02(r3)) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c8, code lost:
        if (r7 != 61) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cc, code lost:
        if (r7 == 29) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        r0 = 2131959429;
        r25 = new X.FOZ(r1, r13, r6, r5, r4, r3, r6, 1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r2.A02(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f7, code lost:
        if (X.AnonymousClass9HV.A00(r4).A00(r12, 33) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0103, code lost:
        if (X.JTO.A15(r3.A0Z).contains(r1) != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010f, code lost:
        if (X.JTO.A15(r3.A0Y).contains(r1) != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011b, code lost:
        if (X.JTO.A15(r3.A0b).contains(r1) != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011d, code lost:
        r7 = 2131959428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0124, code lost:
        if (r10.contains(r9) == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0126, code lost:
        r7 = 2131959427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0129, code lost:
        r2.A04(new X.C71377Ojb(r5, r6, r4, r6, r13, r3, r1, r12, r9, r35, r36), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f2, code lost:
        if (X.AnonymousClass7TF.A1Z(r1.A02) != false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f6, code lost:
        if (r1.A08 == false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f8, code lost:
        r0 = 2131958943;
        r25 = new X.C71367OjM(0, r5, r4, r6, r13, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0214, code lost:
        if (r1.A0C == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0216, code lost:
        r0 = 2131958944;
        r25 = new X.C71367OjM(1, r5, r4, r6, r13, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0232, code lost:
        if (r1.A0A == false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0234, code lost:
        r0 = 2131958928;
        r25 = new X.C71367OjM(2, r5, r4, r6, r13, r3, r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DwP(X.C68303N9q r39) {
        /*
            r38 = this;
            r6 = r38
            boolean r0 = r6.isResumed()
            if (r0 == 0) goto L_0x01d3
            android.content.Context r5 = r6.requireContext()
            X.0eM r0 = r6.A0L
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r24 = r6.requireActivity()
            X.3t3 r0 = r6.A0I
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "threadId"
        L_0x001c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0024:
            boolean r11 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            boolean r9 = r6.A0B
            X.N4P r3 = r6.A0A
            if (r3 == 0) goto L_0x0278
            com.instagram.direct.capabilities.Capabilities r0 = r6.A0F
            r18 = r0
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "threadCapabilities"
            goto L_0x001c
        L_0x0035:
            X.7Ox r13 = r6.A0H
            if (r13 != 0) goto L_0x003c
            java.lang.String r0 = "directAdminToolSessionManager"
            goto L_0x001c
        L_0x003c:
            X.1a8 r1 = r6.A0O
            X.0wc r15 = r6.A0E
            if (r15 != 0) goto L_0x0045
            java.lang.String r0 = "typedLogger"
            goto L_0x001c
        L_0x0045:
            X.0gy r23 = X.AnonymousClass07i.A00(r6)
            X.Mfy r14 = r6.A08
            java.lang.String r0 = "restrictController"
            if (r14 == 0) goto L_0x001c
            r8 = 1
            X.0qQ.A0B(r4, r8)
            r0 = 10
            X.0qQ.A0B(r1, r0)
            java.lang.String r35 = X.C330397Mp.A02(r5, r4, r3, r11)
            X.3t3 r12 = r3.A0L
            X.Dg1 r2 = new X.Dg1
            r2.<init>(r5, r4)
            r1 = r39
            com.instagram.user.model.User r0 = r1.A00
            r37 = r0
            java.lang.String r10 = r37.getFullName()
            java.lang.String r17 = r37.getUsername()
            boolean r7 = r37.CPm()
            boolean r0 = r0.A06
            if (r10 == 0) goto L_0x0085
            boolean r16 = r10.isEmpty()
            if (r16 != 0) goto L_0x0085
            boolean r0 = X.AnonymousClass50n.A09(r10, r7, r0)
            if (r0 != 0) goto L_0x0087
        L_0x0085:
            r10 = r17
        L_0x0087:
            r2.A08(r10)
            r2.A05 = r8
            int r36 = X.C330397Mp.A00(r3)
            boolean r0 = r3.A0v
            if (r0 == 0) goto L_0x0145
            boolean r0 = X.N4P.A05(r3)
            if (r0 == 0) goto L_0x0145
            java.lang.String r7 = r4.A06
            java.util.List r10 = r3.A0S
            boolean r0 = r10.contains(r7)
            if (r0 != 0) goto L_0x00b2
            X.3Te r0 = r3.A0E
            if (r0 == 0) goto L_0x0145
            java.util.List r0 = r0.A0E
            if (r0 == 0) goto L_0x0145
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0145
        L_0x00b2:
            if (r9 != 0) goto L_0x0145
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0145
            java.lang.String r9 = r37.getId()
            int r7 = r3.A09
            r0 = 28
            if (r7 == r0) goto L_0x026c
            r0 = 29
            if (r7 == r0) goto L_0x01ec
            r0 = 61
            if (r7 == r0) goto L_0x026c
        L_0x00ca:
            r0 = 29
            if (r7 == r0) goto L_0x01f4
            r0 = 2131959429(0x7f131e85, float:1.9555498E38)
            X.FOZ r7 = new X.FOZ
            r25 = r7
            r26 = r1
            r27 = r13
            r28 = r6
            r29 = r5
            r30 = r4
            r31 = r3
            r32 = r6
            r33 = r8
            r34 = r11
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x00ea:
            r2.A02(r7, r0)
        L_0x00ed:
            X.9HW r7 = X.AnonymousClass9HV.A00(r4)
            r0 = 33
            boolean r0 = r7.A00(r12, r0)
            if (r0 == 0) goto L_0x0145
            X.0eM r0 = r3.A0Z
            java.util.List r0 = X.JTO.A15(r0)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0145
            X.0eM r0 = r3.A0Y
            java.util.List r0 = X.JTO.A15(r0)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0145
            X.0eM r0 = r3.A0b
            java.util.List r0 = X.JTO.A15(r0)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0145
            boolean r0 = r10.contains(r9)
            r7 = 2131959428(0x7f131e84, float:1.9555496E38)
            if (r0 == 0) goto L_0x0129
            r7 = 2131959427(0x7f131e83, float:1.9555494E38)
        L_0x0129:
            X.Ojb r0 = new X.Ojb
            r25 = r0
            r26 = r5
            r27 = r6
            r28 = r4
            r29 = r6
            r30 = r13
            r31 = r3
            r32 = r1
            r33 = r12
            r34 = r9
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r2.A04(r0, r7)
        L_0x0145:
            int r0 = r37.BIW()
            if (r0 == r8) goto L_0x0177
            boolean r7 = r37.isRestricted()
            r0 = 2131972302(0x7f1350ce, float:1.9581608E38)
            if (r7 == 0) goto L_0x0157
            r0 = 2131975971(0x7f135f23, float:1.958905E38)
        L_0x0157:
            java.lang.String r7 = X.AnonymousClass7TE.A16(r5, r0)
            r30 = 0
            X.ICi r0 = new X.ICi
            r29 = r14
            r25 = r4
            r26 = r3
            r27 = r15
            r28 = r6
            r19 = r0
            r20 = r14
            r21 = r1
            r22 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.A0A(r7, r0)
        L_0x0177:
            boolean r0 = r37.CXO()
            r7 = 2131953885(0x7f1308dd, float:1.9544254E38)
            if (r0 == 0) goto L_0x0183
            r7 = 2131975843(0x7f135ea3, float:1.958879E38)
        L_0x0183:
            r9 = 2
            X.FOW r0 = new X.FOW
            r8 = r0
            r10 = r24
            r11 = r1
            r12 = r18
            r13 = r3
            r14 = r4
            r15 = r6
            r16 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.A02(r0, r7)
            int r0 = r37.BIW()
            if (r0 != 0) goto L_0x01cb
            int r1 = r3.A09
            r0 = 29
            if (r1 == r0) goto L_0x01cb
            X.3sy r0 = r3.A08()
            boolean r0 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            X.0Tu r7 = X.0Tu.A05
            if (r0 == 0) goto L_0x01d4
            r0 = 36316993619563247(0x81061d000112ef, double:3.030351229582766E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x01df
        L_0x01b8:
            r1 = 2131972171(0x7f13504b, float:1.9581342E38)
        L_0x01bb:
            X.OjF r0 = new X.OjF
            r8 = r0
            r10 = r3
            r11 = r24
            r12 = r4
            r13 = r37
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r2.A02(r0, r1)
        L_0x01cb:
            X.FFy r0 = new X.FFy
            r0.<init>(r2)
            r0.A05(r5)
        L_0x01d3:
            return
        L_0x01d4:
            r0 = 36316993619497710(0x81061d000012ee, double:3.03035122954132E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x01b8
        L_0x01df:
            boolean r0 = r3.A0D()
            r1 = 2131972180(0x7f135054, float:1.958136E38)
            if (r0 == 0) goto L_0x01bb
            r1 = 2131972179(0x7f135053, float:1.9581358E38)
            goto L_0x01bb
        L_0x01ec:
            X.0eM r0 = r1.A02
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0145
        L_0x01f4:
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0212
            X.OjM r7 = new X.OjM
            r0 = 2131958943(0x7f131c9f, float:1.9554512E38)
            r26 = 0
            r25 = r7
            r27 = r5
            r28 = r4
            r29 = r6
            r30 = r13
            r31 = r3
            r32 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00ea
        L_0x0212:
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0230
            r0 = 2131958944(0x7f131ca0, float:1.9554514E38)
            X.OjM r7 = new X.OjM
            r25 = r7
            r26 = r8
            r27 = r5
            r28 = r4
            r29 = r6
            r30 = r13
            r31 = r3
            r32 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00ea
        L_0x0230:
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x024e
            r0 = 2131958928(0x7f131c90, float:1.9554482E38)
            X.OjM r7 = new X.OjM
            r26 = 2
            r25 = r7
            r27 = r5
            r28 = r4
            r29 = r6
            r30 = r13
            r31 = r3
            r32 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00ea
        L_0x024e:
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x00ed
            r0 = 2131958928(0x7f131c90, float:1.9554482E38)
            X.OjM r7 = new X.OjM
            r26 = 3
            r25 = r7
            r27 = r5
            r28 = r4
            r29 = r6
            r30 = r13
            r31 = r3
            r32 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00ea
        L_0x026c:
            java.lang.String r0 = X.N4P.A02(r3)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0145
            goto L_0x00ca
        L_0x0278:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKQ.DwP(X.N9q):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0L);
    }

    public final boolean isLoading() {
        C70613ODk oDk;
        C70718OHn oHn = this.A07;
        if (oHn == null) {
            0qQ.A0F("pendingChannelMembersController");
            throw AnonymousClass00P.createAndThrow();
        } else if (oHn.A04 || ((oDk = this.A05) != null && oDk.A01)) {
            return true;
        } else {
            return false;
        }
    }

    private final List A00(Context context, N4P n4p, C67350MmR mmR, Map map) {
        List A13 = C66580MXl.A13(mmR, map);
        if (A13 == null || A13.isEmpty()) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C72340P2f(context, AnonymousClass7TE.A0l(this.A0L), n4p, mmR));
        A1C.add(new P2M(mmR, A13));
        return A1C;
    }

    public final void A02() {
        if (isResumed()) {
            APp();
        }
    }

    public final boolean CWV() {
        C70613ODk oDk;
        if (CJz() || ((oDk = this.A05) != null && oDk.A01)) {
            return true;
        }
        return false;
    }

    public final void Cfo() {
        FragmentActivity activity = getActivity();
        if (activity != null && !C69959Nuz.A00(activity)) {
            activity.finish();
        }
    }

    public final void CgA() {
        A01(this);
    }

    public final void DiG(C68303N9q n9q) {
        String str;
        if (isResumed()) {
            AnonymousClass0eM r4 = this.A0L;
            C65274LqT lqT = new C65274LqT(AnonymousClass7TE.A0l(r4));
            FragmentActivity requireActivity = requireActivity();
            User user = n9q.A00;
            lqT.CpO(requireActivity, user, C273654mx.A00(2274), true);
            N4P n4p = this.A0A;
            if (n4p != null) {
                C242243Te r2 = n4p.A0E;
                if (n4p.A09 == 29 && r2 != null) {
                    String str2 = null;
                    C254793t3 r0 = n4p.A0L;
                    if (r0 != null) {
                        str = C300965yF.A07(r0);
                    } else {
                        str = null;
                    }
                    N4P n4p2 = this.A0A;
                    if (n4p2 != null) {
                        str2 = n4p2.A0Q;
                    }
                    C313756gx r6 = this.A01;
                    if (r6 == null) {
                        0qQ.A0F("broadcastChatLogger");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C313756gx.A07(r6, str, str2, user.getId(), "see_channels", C329997La.A00(r2, DbU.A0u(r4), n4p.A09), n4p.A06());
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        C70613ODk oDk;
        int A022 = AnonymousClass0fD.A02(-544842024);
        NKQ.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Capabilities capabilities = (Capabilities) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
        if (capabilities != null) {
            this.A0F = capabilities;
            C254793t3 A002 = OXL.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            if (A002 != null) {
                this.A0I = A002;
                this.A00 = requireArguments.getInt(AnonymousClass000.A00(105));
                requireArguments.getBoolean("DirectThreadDetailFragment.SHOULD_ALLOW_LEAVE_CONVERSATION", true);
                this.A0J = requireArguments.getBoolean("DirectThreadDetailFragment.SHOULD_SHOW_PRIVACY_SETTINGS_ONLY", true);
                Context requireContext = requireContext();
                AnonymousClass0eM r3 = this.A0L;
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                FragmentActivity requireActivity = requireActivity();
                C254793t3 r0 = this.A0I;
                String str = "threadId";
                if (r0 != null) {
                    this.A06 = new OVU(requireContext, requireActivity, this, A0l, this, r0 instanceof MsysThreadId);
                    0lg A0X = DbT.A0X(r3);
                    Context A052 = DbT.A05(requireContext());
                    0qQ.A0B(A0X, 0);
                    this.A0H = (C330957Ox) A0X.A01(C330957Ox.class, new AnonymousClass9M3(7, A0X, A052));
                    Context requireContext2 = requireContext();
                    UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                    C254793t3 r1 = this.A0I;
                    if (r1 != null) {
                        Capabilities capabilities2 = this.A0F;
                        if (capabilities2 == null) {
                            str = "threadCapabilities";
                        } else {
                            this.A03 = C330397Mp.A01(requireContext2, A0l2, capabilities2, r1);
                            this.A0E = DbW.A0J(DbT.A0X(r3), __redex_internal_original_name);
                            this.A0D = 2dZ.A0t.A03(getActivity());
                            this.A08 = new C66965Mfy(AnonymousClass7TE.A0l(r3), this, (C231002qi) null);
                            this.A01 = C66583MXo.A0P(r3);
                            this.A0G = C69867NtV.A00(AnonymousClass7TE.A0l(r3));
                            this.A07 = new C70718OHn(AnonymousClass7TE.A0l(r3), this);
                            if (this.A00 == 29) {
                                oDk = new C70613ODk(AnonymousClass7TE.A0l(r3));
                            } else {
                                oDk = null;
                            }
                            this.A05 = oDk;
                            C66965Mfy mfy = this.A08;
                            if (mfy == null) {
                                str = "restrictController";
                            } else {
                                registerLifecycleListener(mfy);
                                C74449Pv4 pv4 = this.A03;
                                if (pv4 == null) {
                                    str = "clientInfra";
                                } else {
                                    C74550Pwj.A01(pv4);
                                    AnonymousClass0fD.A09(825699321, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            illegalArgumentException = C66580MXl.A0p();
            i = -1329856178;
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("threadCapabilities can't be null");
            i = -1482394080;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(772286995);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_people_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1527071884, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1293098996);
        super.onDestroy();
        C66965Mfy mfy = this.A08;
        if (mfy == null) {
            0qQ.A0F("restrictController");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(mfy);
        AnonymousClass0fD.A09(1327905715, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-830407842);
        super.onDestroyView();
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter((2Rw) null);
        this.A04 = null;
        this.A0O.A01();
        AnonymousClass0fD.A09(347914924, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(420844138);
        NKQ.super.onPause();
        C74449Pv4 pv4 = this.A03;
        String str = "clientInfra";
        if (pv4 != null) {
            pv4.BNa().stop();
            C74449Pv4 pv42 = this.A03;
            if (pv42 != null) {
                C74542Pwb B4p = pv42.B4p();
                if (B4p != null) {
                    B4p.stop();
                }
                1Ng A0R = DbX.A0R(this.A0L);
                A0R.A02(this.A0M, 2Kb.class);
                A0R.A02(this.A0N, 27U.class);
                C66965Mfy mfy = this.A08;
                if (mfy == null) {
                    str = "restrictController";
                } else {
                    registerLifecycleListener(mfy);
                    C330957Ox r0 = this.A0H;
                    if (r0 == null) {
                        str = "directAdminToolSessionManager";
                    } else {
                        r0.A03.remove(this);
                        AnonymousClass0fD.A09(1354359665, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.NKQ, X.07Z, java.lang.Object, X.4DH] */
    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(1566087394);
        super.onResume();
        C74449Pv4 pv4 = this.A03;
        if (pv4 != null) {
            C74550Pwj.A01(pv4);
            C74449Pv4 pv42 = this.A03;
            if (pv42 != null) {
                C74542Pwb B4p = pv42.B4p();
                AnonymousClass0eM r2 = this.A0L;
                if (C330397Mp.A07(AnonymousClass7TE.A0l(r2)) && B4p != null) {
                    C73568Pfp.A02(B4p, this, DbW.A0E(this), 22);
                    B4p.start();
                }
                1Ng A0R = DbX.A0R(r2);
                A0R.A01(this.A0M, 2Kb.class);
                A0R.A01(this.A0N, 27U.class);
                C330957Ox r0 = this.A0H;
                if (r0 == null) {
                    str = "directAdminToolSessionManager";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                r0.A03.add(this);
                A01(this);
                AnonymousClass0fD.A09(-54275185, A022);
                return;
            }
        }
        str = "clientInfra";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
