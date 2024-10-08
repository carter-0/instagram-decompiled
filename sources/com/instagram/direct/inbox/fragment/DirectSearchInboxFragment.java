package com.instagram.direct.inbox.fragment;

import X.0Aj;
import X.0B0;
import X.0Tu;
import X.0eO;
import X.0gy;
import X.0lg;
import X.0qQ;
import X.0wc;
import X.182;
import X.1Wj;
import X.1YN;
import X.1wn;
import X.28D;
import X.2Yu;
import X.2bV;
import X.2da;
import X.2el;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass07i;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass2bO;
import X.AnonymousClass30Y;
import X.AnonymousClass3BQ;
import X.AnonymousClass4DH;
import X.AnonymousClass4DJ;
import X.AnonymousClass4DS;
import X.AnonymousClass57Z;
import X.AnonymousClass6W8;
import X.AnonymousClass7BY;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C227642jf;
import X.C231002qi;
import X.C240423Kv;
import X.C267044ar;
import X.C273434mZ;
import X.C273654mx;
import X.C294875nB;
import X.C337257fy;
import X.C46730DkJ;
import X.C48145EZn;
import X.C49951FGg;
import X.C51967G9n;
import X.C66580MXl;
import X.C66581MXm;
import X.C66583MXo;
import X.C66650MaJ;
import X.C67058MhZ;
import X.C67710MtP;
import X.C68963Nbq;
import X.C69495Nmd;
import X.C71046OaO;
import X.C71395Oju;
import X.C71874OsH;
import X.C71892Osa;
import X.C71932OtG;
import X.C72208OyY;
import X.C72759PIv;
import X.C72761PIx;
import X.C72918PPc;
import X.C73467Pd9;
import X.C73916Plr;
import X.C73928Pm8;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbX;
import X.DbY;
import X.Dc2;
import X.DcL;
import X.FZN;
import X.NWH;
import X.OJj;
import X.OO3;
import X.OPY;
import X.P0L;
import X.PE1;
import X.PE2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;
import java.util.Map;

public class DirectSearchInboxFragment extends AnonymousClass4DH implements C294875nB, C273434mZ, AnonymousClass4DS, C240423Kv {
    public int A00;
    public RectF A01;
    public View A02;
    public 0wc A03;
    public 2el A04 = 2el.A00();
    public C68963Nbq A05;
    public C72208OyY A06;
    public C71874OsH A07;
    public AnonymousClass7BY A08;
    public Dc2 A09;
    public DirectShareTarget A0A;
    public DirectThreadKey A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public C66650MaJ A0F;
    public FZN A0G;
    public C231002qi A0H;
    public String A0I = "";
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final OJj A0N = new Object();
    public final AnonymousClass0eM A0O;
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q = C227642jf.A02(this);
    public final 1wn A0R;
    public final String A0S;
    public TouchInterceptorFrameLayout localTouchInterceptorFrameLayout;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TF.A0L(r6.A0Q, 0), 36320438184321466L) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(int r7) {
        /*
            r6 = this;
            r5 = 0
            r0 = 40
            if (r7 != r0) goto L_0x0019
            X.0eM r0 = r6.A0Q
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320438184321466(0x81093f001021ba, double:3.032529586206013E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            return r5
        L_0x0019:
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x0018
            X.OsH r0 = r6.A02()
            if (r0 == 0) goto L_0x0018
            int r0 = r0.A02()
            if (r0 != 0) goto L_0x0018
            X.7BY r4 = r6.A08
            if (r4 == 0) goto L_0x0018
            r3 = 3
            X.7Bb r1 = r4.A01
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.A01
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            X.7Bc r2 = r1.A00
            X.7Bd r1 = r4.A00     // Catch:{ all -> 0x0060 }
            X.7Bb r0 = r1.A03     // Catch:{ all -> 0x0060 }
            r0.A00()     // Catch:{ all -> 0x0060 }
            java.util.List r1 = r1.A00     // Catch:{ all -> 0x0060 }
            int r0 = r1.size()     // Catch:{ all -> 0x0060 }
            int r0 = java.lang.Math.min(r3, r0)     // Catch:{ all -> 0x0060 }
            java.util.List r0 = r1.subList(r5, r0)     // Catch:{ all -> 0x0060 }
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x0059
            r2.close()
        L_0x0059:
            if (r0 == 0) goto L_0x0018
            int r5 = r0.size()
            return r5
        L_0x0060:
            r1 = move-exception
            if (r2 == 0) goto L_0x006b
            r2.close()     // Catch:{ all -> 0x0067 }
            throw r1
        L_0x0067:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
        L_0x006b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxFragment.A00(int):int");
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.07Z, com.instagram.direct.inbox.fragment.DirectSearchInboxFragment, androidx.fragment.app.Fragment] */
    public final C71874OsH A02() {
        Context requireContext;
        UserSession A0l;
        0gy A002;
        int i;
        2el r5;
        boolean z;
        boolean z2;
        C71874OsH osH = this.A07;
        if (osH == null) {
            boolean z3 = this instanceof NWH;
            C72208OyY oyY = this.A06;
            if (z3) {
                if (oyY != null) {
                    requireContext = requireContext();
                    A0l = AnonymousClass7TE.A0l(this.A0Q);
                    A002 = AnonymousClass07i.A00(this);
                    i = this.A00;
                    r5 = this.A04;
                    z = this.A0E;
                    z2 = true;
                }
                osH = null;
                this.A07 = osH;
            } else {
                if (oyY != null) {
                    requireContext = requireContext();
                    A0l = AnonymousClass7TE.A0l(this.A0Q);
                    A002 = AnonymousClass07i.A00(this);
                    i = this.A00;
                    r5 = this.A04;
                    z = this.A0E;
                    z2 = false;
                }
                osH = null;
                this.A07 = osH;
            }
            osH = new C71874OsH(requireContext, A002, this, A0l, r5, oyY, this, this, this, i, z, z2);
            this.A07 = osH;
        }
        return osH;
    }

    public final void A04(Bundle bundle, Integer num) {
        AnonymousClass6W8 r1;
        int i;
        0lg r3;
        Class<ModalActivity> cls;
        FragmentActivity fragmentActivity;
        int i2;
        switch (C51967G9n.A03(num, 0)) {
            case 0:
                bundle.putString(AnonymousClass000.A00(221), this.A0D);
                r3 = DbT.A0X(this.A0Q);
                cls = ModalActivity.class;
                fragmentActivity = requireActivity();
                i2 = 2266;
                break;
            case 1:
            case 2:
                r1 = DbS.A0b(requireActivity(), bundle, DbT.A0X(this.A0Q), ModalActivity.class, C273654mx.A00(2269));
                r1.A0E(this);
                r1.A0J = ModalActivity.A08;
                i = 3704;
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 27:
                bundle.putString(AnonymousClass000.A00(221), this.A0D);
                bundle.putParcelable("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY", 0B0.A00(this.A0B));
                bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ON_DIRECT_SEND_SUCCESS_EXIT_BOUNDS", 0B0.A00(this.A01));
                bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_MSYS_ENABLED", this.A0E);
                r3 = DbT.A0X(this.A0Q);
                cls = ModalActivity.class;
                fragmentActivity = requireActivity();
                i2 = 664;
                break;
            case 14:
                r1 = DbS.A0b(requireActivity(), bundle, DbT.A0X(this.A0Q), ModalActivity.class, C273654mx.A00(2268));
                r1.A0E(this);
                r1.A0J = ModalActivity.A08;
                i = 3703;
                break;
            default:
                return;
        }
        r1 = DbS.A0b(fragmentActivity, bundle, r3, cls, C273654mx.A00(i2));
        r1.A0E(this);
        r1.A0J = ModalActivity.A08;
        i = 289;
        r1.A0D(this, i);
    }

    public final void Cj6(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
        DirectSearchResult directSearchResult2 = directSearchResult;
        0qQ.A0B(directSearchResult2, 0);
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        PE1 A012 = A01(directSearchResult2, i6, i7, i8, i5, false);
        C72208OyY oyY = this.A06;
        if (oyY != null) {
            oyY.A08(A012, directSearchResult2, i6, (long) i7, (long) i8, (long) i4);
        }
        C72208OyY oyY2 = this.A06;
        if (oyY2 != null) {
            oyY2.A07(C69495Nmd.INVITE_CONTACT);
        }
    }

    public final void Cj7(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        PE1 A012;
        DirectSearchResult directSearchResult2 = directSearchResult;
        int A022 = DbW.A02(0, directSearchResult, view);
        if (182.A06(0Tu.A05, AnonymousClass7TF.A0L(this.A0Q, 0), 36326515562460979L) && this.A05 != null && (A012 = A01(directSearchResult2, i, i2, i3, i4, false)) != null) {
            FZN fzn = this.A0G;
            if (fzn == null) {
                fzn = new FZN(new PE2(this, A022));
                this.A0G = fzn;
            }
            this.A04.A05(view, DbU.A0a(fzn, AnonymousClass30Y.A00(A012, (Object) null, A012.A0A)));
        }
    }

    public final void D8N(DirectShareTarget directShareTarget) {
        C337257fy r1;
        0qQ.A0B(directShareTarget, 0);
        AnonymousClass7BY r0 = this.A08;
        if (r0 != null) {
            r0.A03(directShareTarget);
        }
        C71874OsH A022 = A02();
        if (A022 != null && (r1 = A022.A04) != null) {
            A022.A02.Dam(r1);
        }
    }

    public final /* synthetic */ void D9P(DirectShareTarget directShareTarget) {
    }

    public final void Dk7(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    public final void DpB(View view, C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        PE1 A012;
        DirectSearchResult directSearchResult2 = directSearchResult;
        AnonymousClass7TG.A1N(directSearchResult, str);
        0qQ.A0B(view, 6);
        if (this.A05 != null && (A012 = A01(directSearchResult2, i, i2, i3, i4, z)) != null) {
            FZN fzn = this.A0G;
            if (fzn == null) {
                fzn = new FZN(new PE2(this, 3));
                this.A0G = fzn;
            }
            this.A04.A05(view, DbU.A0a(fzn, AnonymousClass30Y.A00(A012, (Object) null, A012.A0A)));
        }
    }

    public final void DpC(RectF rectF, 28D r14, DirectShareTarget directShareTarget) {
        AnonymousClass7TG.A1T(directShareTarget, rectF, r14);
        Context requireContext = requireContext();
        boolean isResumed = isResumed();
        AnonymousClass0eM r0 = this.A0Q;
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        FragmentActivity requireActivity = requireActivity();
        DirectCameraViewModel A032 = C71046OaO.A03(AnonymousClass7TE.A0l(r0), directShareTarget);
        DirectThreadKey directThreadKey = this.A0B;
        String str = this.A0D;
        OPY.A00(requireActivity, requireContext, rectF, this.A01, r14, A0l, this, directThreadKey, A032, str, isResumed);
        DbT.A1J(this);
    }

    public final void EIL() {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C71874OsH A022 = A02();
        if (A022 != null) {
            str = A022.A03();
        } else {
            str = null;
        }
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view;
        AnonymousClass0eM r4 = this.A0Q;
        0lg A0X = DbT.A0X(r4);
        C72208OyY oyY = this.A06;
        if (oyY != null) {
            C68963Nbq nbq = (C68963Nbq) C73467Pd9.A00(A0X, oyY);
            this.A05 = nbq;
            if (nbq != null) {
                nbq.A00 = null;
                nbq.A01 = null;
                nbq.A00();
            }
            if (!(bundle == null || (string = bundle.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY")) == null)) {
                this.A0I = string;
            }
            if (getContext() != null) {
                0lg A0L2 = AnonymousClass7TF.A0L(r4, 0);
                0Tu r2 = 0Tu.A05;
                if (!182.A06(r2, A0L2, 36320438185632202L) && 182.A06(r2, A0L2, 36320438184976833L)) {
                    C49951FGg.A04(requireContext(), AnonymousClass7TE.A0l(r4), new P0L(this));
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r13 == null) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.PE1 A01(com.instagram.model.direct.DirectSearchResult r52, int r53, int r54, int r55, int r56, boolean r57) {
        /*
            r51 = this;
            r16 = r54
            r2 = r52
            boolean r3 = r2 instanceof com.instagram.model.direct.DirectShareTarget
            java.lang.String r4 = ""
            java.lang.String r7 = "Required value was null."
            r11 = 0
            r0 = r51
            r1 = r53
            r17 = r55
            r18 = r56
            if (r3 == 0) goto L_0x008c
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            X.OsH r3 = r0.A02()
            if (r3 == 0) goto L_0x007c
            X.PPc r3 = r3.A02
            java.lang.String r3 = r3.A06
            if (r3 == 0) goto L_0x007c
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r3 = r2.A04
            if (r3 != 0) goto L_0x002f
            com.instagram.direct.model.thread.DiscoverableThreadInfo r3 = r2.A06
            if (r3 != 0) goto L_0x002f
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r3 = r2.A05
            if (r3 == 0) goto L_0x007c
        L_0x002f:
            X.OsH r3 = r0.A02()
            if (r3 == 0) goto L_0x003b
            X.PPc r3 = r3.A02
            java.lang.String r13 = r3.A06
        L_0x0039:
            if (r13 != 0) goto L_0x003c
        L_0x003b:
            r13 = r4
        L_0x003c:
            java.lang.String r10 = r2.A09()
            X.3t2 r8 = X.DbS.A0c(r2)
            java.util.List r15 = X.DbT.A14(r2)
            boolean r20 = r2.A0E()
            int r3 = r0.A00(r1)
            int r16 = r54 - r3
            X.0eM r3 = r0.A0Q
            java.lang.String r4 = X.DbU.A0u(r3)
            boolean r3 = r0.A0J
            java.lang.Integer r9 = r2.A04(r4, r3)
            X.OsH r3 = r0.A02()
            if (r3 == 0) goto L_0x0068
            java.lang.String r11 = r3.A03()
        L_0x0068:
            X.Nbq r0 = r0.A05
            if (r0 == 0) goto L_0x0087
            java.lang.String r12 = r0.A01
            com.instagram.model.direct.DirectShareTargetLoggingInfo r7 = r2.A08
            r6 = 0
            X.PE1 r5 = new X.PE1
            r21 = r57
            r14 = r6
            r19 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r5
        L_0x007c:
            X.OsH r3 = r0.A02()
            if (r3 == 0) goto L_0x003b
            X.PPc r3 = r3.A02
            java.lang.String r13 = r3.A08
            goto L_0x0039
        L_0x0087:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x008c:
            boolean r3 = r2 instanceof com.instagram.model.direct.DirectMessageSearchMessage
            if (r3 == 0) goto L_0x00de
            com.instagram.model.direct.DirectMessageSearchMessage r2 = (com.instagram.model.direct.DirectMessageSearchMessage) r2
            java.lang.String r3 = r2.A07
            java.lang.String r2 = r2.A09
            X.3t0 r22 = X.C66580MXl.A0g(r2)
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1C()
            int r2 = r0.A00(r1)
            int r16 = r54 - r2
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            X.OsH r2 = r0.A02()
            if (r2 == 0) goto L_0x00db
            java.lang.String r25 = r2.A03()
        L_0x00b0:
            X.Nbq r2 = r0.A05
            if (r2 == 0) goto L_0x0161
            java.lang.String r2 = r2.A01
            X.OsH r0 = r0.A02()
            if (r0 != 0) goto L_0x015b
            r0 = r11
        L_0x00bd:
            r34 = 0
            X.PE1 r19 = new X.PE1
            r20 = r11
            r21 = r11
            r24 = r3
            r26 = r2
            r27 = r0
            r28 = r11
            r30 = r16
            r31 = r17
            r32 = r18
            r33 = r1
            r35 = r34
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r19
        L_0x00db:
            r25 = r11
            goto L_0x00b0
        L_0x00de:
            boolean r3 = r2 instanceof com.instagram.model.direct.DirectMessageSearchThread
            if (r3 == 0) goto L_0x0117
            com.instagram.model.direct.DirectMessageSearchThread r2 = (com.instagram.model.direct.DirectMessageSearchThread) r2
            java.lang.String r4 = r2.A08
            java.lang.String r2 = r2.A06
            java.lang.String r3 = X.002.A0R(r4, r2)
            X.3t0 r22 = X.C66580MXl.A0g(r4)
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1C()
            int r2 = r0.A00(r1)
            int r16 = r54 - r2
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            X.OsH r2 = r0.A02()
            if (r2 == 0) goto L_0x0114
            java.lang.String r25 = r2.A03()
        L_0x0106:
            X.Nbq r2 = r0.A05
            if (r2 == 0) goto L_0x0166
            java.lang.String r2 = r2.A01
            X.OsH r0 = r0.A02()
            if (r0 != 0) goto L_0x015b
            r0 = r11
            goto L_0x00bd
        L_0x0114:
            r25 = r11
            goto L_0x0106
        L_0x0117:
            boolean r3 = r2 instanceof com.instagram.model.direct.DirectSearchResharedContent
            if (r3 == 0) goto L_0x0170
            com.instagram.model.direct.DirectSearchResharedContent r2 = (com.instagram.model.direct.DirectSearchResharedContent) r2
            X.1Xj r2 = r2.A01
            if (r2 == 0) goto L_0x020f
            java.lang.String r3 = r2.getId()
            if (r3 != 0) goto L_0x0128
            r3 = r4
        L_0x0128:
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L_0x012f
            r4 = r2
        L_0x012f:
            X.3t0 r22 = X.C66580MXl.A0g(r4)
            java.util.ArrayList r29 = X.AnonymousClass7TE.A1C()
            int r2 = r0.A00(r1)
            int r16 = r54 - r2
            java.lang.Integer r23 = X.AnonymousClass05K.A1F
            X.OsH r2 = r0.A02()
            if (r2 == 0) goto L_0x0158
            java.lang.String r25 = r2.A03()
        L_0x0149:
            X.Nbq r2 = r0.A05
            if (r2 == 0) goto L_0x016b
            java.lang.String r2 = r2.A01
            X.OsH r0 = r0.A02()
            if (r0 != 0) goto L_0x015b
            r0 = r11
            goto L_0x00bd
        L_0x0158:
            r25 = r11
            goto L_0x0149
        L_0x015b:
            X.PPc r0 = r0.A02
            java.lang.String r0 = r0.A08
            goto L_0x00bd
        L_0x0161:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0166:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x016b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x0170:
            boolean r3 = r2 instanceof com.instagram.model.direct.DirectSearchPrompt
            r33 = 0
            if (r3 == 0) goto L_0x01ba
            com.instagram.model.direct.DirectSearchPrompt r2 = (com.instagram.model.direct.DirectSearchPrompt) r2
            java.lang.String r6 = r2.A03
            java.lang.Integer r22 = X.AnonymousClass05K.A0B
            X.Nbq r0 = r0.A05
            if (r0 == 0) goto L_0x01b5
            java.lang.String r5 = r0.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r33)
            com.instagram.model.direct.DirectShareTargetLoggingInfo r4 = new com.instagram.model.direct.DirectShareTargetLoggingInfo
            r4.<init>()
            r4.A01 = r11
            r4.A00 = r0
            X.9VB r3 = r2.A00
            java.lang.String r0 = r2.A02
            r31 = -1
            X.PE1 r18 = new X.PE1
            r19 = r3
            r20 = r4
            r21 = r11
            r23 = r6
            r24 = r11
            r25 = r5
            r26 = r11
            r27 = r0
            r28 = r11
            r29 = r16
            r30 = r17
            r32 = r1
            r34 = r33
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r18
        L_0x01b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x01ba:
            boolean r3 = r2 instanceof com.instagram.direct.inbox.DirectInviteContactViewModel
            if (r3 == 0) goto L_0x020f
            com.instagram.direct.inbox.DirectInviteContactViewModel r2 = (com.instagram.direct.inbox.DirectInviteContactViewModel) r2
            java.lang.String r39 = X.AnonymousClass7TG.A0j()
            int r5 = r2.A00
            int r4 = r2.A03
            java.lang.Integer r38 = X.AnonymousClass05K.A0E
            X.OsH r2 = r0.A02()
            if (r2 == 0) goto L_0x0207
            java.lang.String r40 = r2.A03()
        L_0x01d4:
            X.Nbq r0 = r0.A05
            if (r0 == 0) goto L_0x020a
            java.lang.String r3 = r0.A01
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r33)
            com.instagram.model.direct.DirectShareTargetLoggingInfo r0 = new com.instagram.model.direct.DirectShareTargetLoggingInfo
            r0.<init>()
            r0.A01 = r11
            r0.A00 = r2
            X.PE1 r34 = new X.PE1
            r35 = r11
            r36 = r0
            r37 = r11
            r41 = r3
            r42 = r11
            r43 = r11
            r44 = r11
            r45 = r5
            r46 = r4
            r47 = r18
            r48 = r1
            r49 = r33
            r50 = r33
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return r34
        L_0x0207:
            r40 = r11
            goto L_0x01d4
        L_0x020a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r7)
            throw r0
        L_0x020f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxFragment.A01(com.instagram.model.direct.DirectSearchResult, int, int, int, int, boolean):X.PE1");
    }

    public final AnonymousClass4DJ B7u() {
        return this;
    }

    public final TouchInterceptorFrameLayout C8v() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.localTouchInterceptorFrameLayout;
        if (touchInterceptorFrameLayout != null) {
            return touchInterceptorFrameLayout;
        }
        0qQ.A0F("localTouchInterceptorFrameLayout");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        if (r0.length() != 0) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dk6(X.C67058MhZ r36, com.instagram.model.direct.DirectSearchResult r37, java.lang.String r38, int r39, int r40, int r41, int r42, int r43) {
        /*
            r35 = this;
            r6 = r37
            r10 = r38
            r4 = r39
            X.AnonymousClass7TG.A1R(r6, r10)
            r15 = r35
            X.Dc2 r2 = r15.A09
            if (r2 == 0) goto L_0x0019
            X.1xC r1 = X.1xC.A01
            X.3GR r0 = new X.3GR
            r0.<init>(r2)
            r1.A00(r0)
        L_0x0019:
            X.OsH r0 = r15.A02()
            r24 = 0
            if (r0 == 0) goto L_0x01b8
            java.lang.String r27 = r0.A03()
        L_0x0025:
            r9 = 0
            r11 = r40
            r20 = r42
            r8 = r43
            r16 = r6
            r17 = r8
            r18 = r4
            r19 = r11
            r21 = r9
            X.PE1 r7 = r15.A01(r16, r17, r18, r19, r20, r21)
            r0 = 7
            if (r8 == r0) goto L_0x01b4
            r0 = 18
            if (r8 == r0) goto L_0x01b4
            r14 = 0
            r0 = 35
            if (r8 == r0) goto L_0x004a
            r0 = 36
            if (r8 != r0) goto L_0x01b5
        L_0x004a:
            r13 = 1
        L_0x004b:
            X.OyY r5 = r15.A06
            if (r5 == 0) goto L_0x0062
            if (r27 != 0) goto L_0x0053
            java.lang.String r27 = ""
        L_0x0053:
            long r2 = (long) r4
            long r0 = (long) r11
            r25 = r5
            r26 = r6
            r28 = r8
            r29 = r2
            r31 = r0
            r25.A0A(r26, r27, r28, r29, r31)
        L_0x0062:
            X.OyY r12 = r15.A06
            if (r12 == 0) goto L_0x0086
            if (r14 != 0) goto L_0x01b1
            if (r13 != 0) goto L_0x01b1
            int r0 = r15.A00(r8)
            int r4 = r39 - r0
        L_0x0070:
            long r4 = (long) r4
            long r2 = (long) r11
            r0 = r41
            long r0 = (long) r0
            r25 = r12
            r26 = r7
            r27 = r6
            r28 = r8
            r29 = r4
            r31 = r2
            r33 = r0
            r25.A08(r26, r27, r28, r29, r31, r33)
        L_0x0086:
            boolean r0 = r6 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto L_0x01a8
            r2 = r6
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            java.lang.String r0 = r2.A07()
            r15.A0C = r0
            if (r0 != 0) goto L_0x009c
            X.7BY r0 = r15.A08
            if (r0 == 0) goto L_0x009c
            r0.A02(r2)
        L_0x009c:
            java.lang.String r3 = r15.A0C
            if (r3 == 0) goto L_0x00ed
            androidx.fragment.app.FragmentActivity r0 = r15.getActivity()
            if (r0 == 0) goto L_0x00ed
            android.view.View r0 = r15.A02
            if (r0 == 0) goto L_0x00ad
            X.0nA.A0N(r0)
        L_0x00ad:
            r15.A0A = r2
            X.OJj r13 = r15.A0N
            androidx.fragment.app.FragmentActivity r14 = r15.requireActivity()
            X.0eM r0 = r15.A0Q
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r0)
            X.7BY r4 = r15.A08
            X.OyY r1 = r15.A06
            X.OsH r0 = r15.A02()
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r0.A03()
            if (r0 == 0) goto L_0x00d3
            int r0 = r0.length()
            r21 = 1
            if (r0 == 0) goto L_0x00d5
        L_0x00d3:
            r21 = 0
        L_0x00d5:
            r17 = r1
            r18 = r4
            r19 = r2
            r20 = r3
            r13.A00(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x00e0:
            X.Nbq r0 = r15.A05
            if (r0 == 0) goto L_0x00ec
            if (r7 == 0) goto L_0x00ec
            r0.A02(r7)
            r0.A01()
        L_0x00ec:
            return
        L_0x00ed:
            boolean r0 = r2.A0R()
            if (r0 == 0) goto L_0x016d
            monitor-enter(r15)
            java.lang.String r0 = r2.A08()     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r2.A0O     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x01c6
            X.1a8 r0 = X.C70375O4c.A00     // Catch:{ all -> 0x01c8 }
            X.0eM r0 = r15.A0Q     // Catch:{ all -> 0x01c8 }
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)     // Catch:{ all -> 0x01c8 }
            java.lang.String r5 = r2.A08()     // Catch:{ all -> 0x01c8 }
            if (r5 == 0) goto L_0x01c1
            java.lang.String r4 = r2.A0O     // Catch:{ all -> 0x01c8 }
            if (r4 == 0) goto L_0x01bc
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01c8 }
            java.util.List r0 = r2.A0Q     // Catch:{ all -> 0x01c8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01c8 }
        L_0x011a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x012c
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.C66580MXl.A0k(r1)     // Catch:{ all -> 0x01c8 }
            java.lang.Long r0 = r0.A08     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0166
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01c8 }
        L_0x012c:
            X.OF7 r3 = new X.OF7     // Catch:{ all -> 0x01c8 }
            r3.<init>(r15, r6, r2, r10)     // Catch:{ all -> 0x01c8 }
            X.0qQ.A0B(r11, r9)     // Catch:{ all -> 0x01c8 }
            java.lang.String r0 = "direct_thread"
            X.MYg r0 = X.MYc.A01(r11, r0)     // Catch:{ all -> 0x01c8 }
            X.MYb r1 = r0.A01     // Catch:{ all -> 0x01c8 }
            java.lang.Long r5 = X.DbV.A0q(r5)     // Catch:{ all -> 0x01c8 }
            java.lang.Long r4 = X.DbV.A0q(r4)     // Catch:{ all -> 0x01c8 }
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r11)     // Catch:{ all -> 0x01c8 }
            java.lang.Long r0 = r0.BST()     // Catch:{ all -> 0x01c8 }
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)     // Catch:{ all -> 0x01c8 }
            java.util.ArrayList r2 = X.00k.A0S(r0, r8)     // Catch:{ all -> 0x01c8 }
            X.1aU r1 = r1.A0A     // Catch:{ all -> 0x01c8 }
            X.Ov5 r0 = new X.Ov5     // Catch:{ all -> 0x01c8 }
            r0.<init>(r5, r4, r2)     // Catch:{ all -> 0x01c8 }
            X.1aU r2 = r1.A0M(r0)     // Catch:{ all -> 0x01c8 }
            X.1a8 r1 = X.C70375O4c.A00     // Catch:{ all -> 0x01c8 }
            r0 = 6
            X.PU7.A00(r2, r1, r3, r0)     // Catch:{ all -> 0x01c8 }
            goto L_0x016a
        L_0x0166:
            r8.add(r0)     // Catch:{ all -> 0x01c8 }
            goto L_0x011a
        L_0x016a:
            monitor-exit(r15)
            goto L_0x00e0
        L_0x016d:
            X.0eM r0 = r15.A0Q
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r0)
            X.0wc r4 = r15.A03
            if (r4 != 0) goto L_0x0181
            java.lang.String r0 = "typedLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0181:
            androidx.fragment.app.FragmentActivity r14 = r15.requireActivity()
            java.lang.String r3 = r15.A0D
            X.OsH r0 = r15.A02()
            if (r0 == 0) goto L_0x0191
            java.lang.String r24 = r0.A03()
        L_0x0191:
            r1 = 5
            X.P4D r0 = new X.P4D
            r0.<init>(r15, r1)
            r16 = r15
            r20 = r15
            r17 = r4
            r19 = r0
            r21 = r2
            r22 = r3
            r23 = r10
            X.OPY.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x01a8:
            X.OyY r0 = r15.A06
            if (r0 == 0) goto L_0x00e0
            r0.A09(r6)
            goto L_0x00e0
        L_0x01b1:
            r4 = -1
            goto L_0x0070
        L_0x01b4:
            r14 = 1
        L_0x01b5:
            r13 = 0
            goto L_0x004b
        L_0x01b8:
            r27 = r24
            goto L_0x0025
        L_0x01bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x01c8 }
            goto L_0x01c5
        L_0x01c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x01c8 }
        L_0x01c5:
            throw r0     // Catch:{ all -> 0x01c8 }
        L_0x01c6:
            monitor-exit(r15)
            return
        L_0x01c8:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxFragment.Dk6(X.MhZ, com.instagram.model.direct.DirectSearchResult, java.lang.String, int, int, int, int, int):void");
    }

    public final void Dnr(C67058MhZ mhZ, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        String str;
        Reel reel2 = reel;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gradientSpinnerAvatarView;
        boolean A1Z = AnonymousClass7TG.A1Z(reel2, gradientSpinnerAvatarView2);
        DirectSearchResult directSearchResult2 = directSearchResult;
        0qQ.A0B(directSearchResult2, 6);
        C71874OsH A022 = A02();
        if (A022 == null || (str = A022.A03()) == null) {
            str = "";
        }
        this.A0I = str;
        C66650MaJ maJ = this.A0F;
        if (maJ != null) {
            maJ.A02(reel2, AnonymousClass3BQ.DIRECT_INBOX_SEARCH, gradientSpinnerAvatarView2);
        }
        int i6 = i;
        int i7 = i2;
        int i8 = i5;
        PE1 A012 = A01(directSearchResult2, i8, i6, i7, i4, A1Z);
        C72208OyY oyY = this.A06;
        if (oyY != null) {
            oyY.A08(A012, directSearchResult2, i8, (long) i6, (long) i7, (long) i3);
        }
        C72208OyY oyY2 = this.A06;
        if (oyY2 != null) {
            oyY2.A09(directSearchResult2);
        }
        C68963Nbq nbq = this.A05;
        if (!(nbq == null || A012 == null)) {
            nbq.A02(A012);
            nbq.A01();
        }
        this.A0M = A1Z;
    }

    public final void DpD(View view) {
        if (view != null) {
            this.A04.A04(view);
        }
    }

    public final void configureActionBar(2da r21) {
        AnonymousClass57Z r4;
        2da r2 = r21;
        if (this instanceof NWH) {
            0qQ.A0B(r2, 0);
            r2.Etr(true);
            r2.setTitle(requireContext().getString(2131960282));
            r2.Eu4(true);
            r4 = new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, (Drawable) null, (Drawable) null, new C71395Oju(this, 65), AnonymousClass05K.A00, -2, -2, -2, -2, -2, -2, -2, true);
        } else {
            0qQ.A0B(r2, 0);
            r2.Etr(false);
            r4 = new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, (Drawable) null, (Drawable) null, (View.OnClickListener) null, AnonymousClass05K.A00, -2, 2Yu.A0F(requireContext(), R.attr.statusBarBackgroundColor), -2, -2, -2, -2, -2, true);
        }
        r2.ErJ(r4);
    }

    public final String getModuleName() {
        return this.A0S;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0Q);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.OJj, java.lang.Object] */
    public DirectSearchInboxFragment() {
        C73928Pm8 pm8 = new C73928Pm8(this, 2);
        C73928Pm8 pm82 = new C73928Pm8(this, 4);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new C73928Pm8(pm82, 5));
        this.A0O = DbS.A0I(new C73928Pm8(A002, 6), pm8, new C73916Plr(10, (Object) null, A002), DbS.A0z(C46730DkJ.class));
        C73928Pm8 pm83 = new C73928Pm8(this, 3);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new C73928Pm8(new C73928Pm8(this, 7), 8));
        this.A0P = DbS.A0I(new C73928Pm8(A003, 9), pm83, new C73916Plr(11, (Object) null, A003), DbS.A0z(C67710MtP.class));
        this.A0R = C71932OtG.A00(this, 28);
        this.A0S = "DIRECT_SEARCH_INBOX_FRAGMENT";
    }

    public final void A03() {
        if (getActivity() != null) {
            if (1Wj.A00 != null) {
                DcL.A00().A02(requireActivity(), AnonymousClass7TE.A0l(this.A0Q), "800290354365306", (Map) null);
            }
            DbX.A1I(this);
        }
        C68963Nbq nbq = this.A05;
        if (nbq != null) {
            nbq.A01();
        }
    }

    public void afterOnResume() {
        super.afterOnResume();
        C231002qi r0 = this.A0H;
        if (r0 != null) {
            r0.Dh3();
        }
        if (this.A0L) {
            C71874OsH A022 = A02();
            if (A022 != null) {
                A022.A05.A02(false, 0.0f);
            }
            this.A0L = false;
        }
        C66583MXo.A0z(this);
        C71874OsH osH = this.A07;
        if (osH != null) {
            String A032 = osH.A03();
            this.A0I = A032;
            osH.A04(A032);
            String str = this.A0I;
            osH.Dhw(str, str);
            if (this.A0M) {
                C72918PPc pPc = osH.A02;
                if (pPc.A0j) {
                    pPc.A0P.notifyDataSetChanged();
                }
                this.A0M = false;
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (((i == 289 || i == 3703 || i == 3704) && i2 == -1) || i == 3702) {
            A03();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(445880360);
        DirectSearchInboxFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r4 = this.A0Q;
        this.A03 = AnonymousClass0kN.A01(this, DbT.A0X(r4));
        this.A06 = C72208OyY.A00(AnonymousClass7TE.A0l(r4));
        Parcelable.Creator creator = RectF.CREATOR;
        0qQ.A08(creator);
        this.A01 = (RectF) 0B0.A01(creator, requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ON_DIRECT_SEND_SUCCESS_EXIT_BOUNDS"), RectF.class);
        this.A0D = requireArguments.getString(AnonymousClass000.A00(221), (String) null);
        Parcelable.Creator creator2 = DirectThreadKey.CREATOR;
        0qQ.A08(creator2);
        this.A0B = (DirectThreadKey) 0B0.A01(creator2, requireArguments.getParcelable("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY"), DirectThreadKey.class);
        this.A00 = requireArguments.getInt("DirectInboxSearchFragment.DIRECT_CONTAINER_MARGIN_BOTTOM_PX");
        this.A0E = requireArguments.getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_MSYS_ENABLED");
        0lg A0X = DbT.A0X(r4);
        0Tu r6 = 0Tu.A05;
        this.A0J = 182.A06(r6, A0X, 36313944192977219L);
        this.A0K = 182.A06(r6, DbT.A0X(r4), 36315958532443976L);
        this.A08 = AnonymousClass7BY.A00(AnonymousClass7TE.A0l(r4));
        if (C267044ar.A01(requireContext(), AnonymousClass7TE.A0l(r4))) {
            if (182.A06(0Tu.A06, DbY.A0R(r4), 36326515562264369L)) {
                ((C46730DkJ) this.A0O.getValue()).A0E(C48145EZn.DIRECT_MESSAGE_SEARCH);
            }
        }
        C72208OyY oyY = this.A06;
        if (oyY != null) {
            if (oyY.A06 != null) {
                oyY.A06(0);
            }
            oyY.A06 = AnonymousClass7TF.A0b();
            0Aj A0e = AnonymousClass7TE.A0e(oyY.A0C, "direct_inbox_search_start");
            if (A0e.isSampled()) {
                C66580MXl.A1H(A0e, oyY.A06);
                A0e.Cgf();
            }
            OO3 oo3 = oyY.A01;
            if (oo3 != null) {
                boolean z = oyY.A0A;
                oo3.A0C = z;
                if (oo3.A07 != null) {
                    boolean z2 = oo3.A0D;
                    if (!oo3.A0B) {
                        oo3.A0D = z2;
                        oo3.A02(C69495Nmd.ABANDON, (Long) null, (String) null, false);
                    }
                    oo3.A00();
                }
                oo3.A0B = false;
                String A0b = AnonymousClass7TF.A0b();
                oo3.A07 = A0b;
                if (A0b != null) {
                    0Aj A0e2 = AnonymousClass7TE.A0e(oo3.A0E, "universal_search_start");
                    if (A0e2.isSampled()) {
                        C66580MXl.A1H(A0e2, A0b);
                        if (oo3.A0H) {
                            C66581MXm.A1G(A0e2, z);
                        }
                        A0e2.Cgf();
                    }
                }
            }
        }
        this.A0F = new C66650MaJ(this, AnonymousClass7TE.A0l(r4), (Runnable) null);
        1YN A002 = AnonymousClass2bO.A00();
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0K;
        AnonymousClass2bO.A00();
        this.A0H = A002.A01(this, this, A0l, 2bV.A04(new C72759PIv(this, 2), new C72761PIx(this, 2)), quickPromotionSlot);
        DbX.A0R(r4).A01(this.A0R, C71892Osa.class);
        AnonymousClass0fD.A09(1947264495, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: X.NOJ} */
    /* JADX WARNING: type inference failed for: r2v12, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v14, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v17, types: [X.2tF] */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0447  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r42, android.view.ViewGroup r43, android.os.Bundle r44) {
        /*
            r41 = this;
            r0 = 1100834305(0x419d6601, float:19.674807)
            int r18 = X.AnonymousClass0fD.A02(r0)
            r6 = r41
            android.content.Context r2 = r6.requireContext()
            r19 = 0
            r10 = 0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = new com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout
            r0 = r19
            r1.<init>(r2, r0, r10)
            r6.localTouchInterceptorFrameLayout = r1
            X.2qi r7 = r6.A0H
            if (r7 == 0) goto L_0x0372
            X.OsH r0 = r6.A02()
            if (r0 == 0) goto L_0x0372
            androidx.fragment.app.FragmentActivity r9 = r6.requireActivity()
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r13 = r6.localTouchInterceptorFrameLayout
            if (r13 == 0) goto L_0x047f
            r0.A00 = r13
            com.instagram.common.session.UserSession r1 = r0.A0D
            X.0iw r3 = r0.A0B
            r4 = 23592971(0x168000b, float:4.26117E-38)
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.Dfq r2 = X.C46486Dfp.A00(r9, r3, r1, r4)
            r0.A03 = r2
            X.P1W r4 = new X.P1W
            r4.<init>(r9, r0)
            r6.registerLifecycleListener(r2)
            androidx.fragment.app.FragmentActivity r5 = r6.getActivity()
            boolean r2 = r5 instanceof com.instagram.base.activity.IgFragmentActivity
            if (r2 == 0) goto L_0x0053
            com.instagram.base.activity.IgFragmentActivity r5 = (com.instagram.base.activity.IgFragmentActivity) r5
            X.3on r2 = r0.A0C
            r5.registerOnActivityResultListener(r2)
        L_0x0053:
            X.2tC r5 = X.AnonymousClass2t9.A00(r9)
            X.1YN r2 = X.AnonymousClass2bO.A00()
            java.util.List r7 = r2.A05(r6, r1, r7)
            java.util.List r2 = r5.A0C
            r2.addAll(r7)
            X.5nB r7 = r0.A0I
            boolean r11 = r0.A0M
            X.O8G r2 = X.C70167NyL.A00(r1)
            X.0xa r8 = r2.A00
            java.lang.String r2 = "debug_overlay_enabled"
            r8.getBoolean(r2, r10)
            java.lang.String r24 = "inbox_search"
            X.EGN r2 = new X.EGN
            r20 = r2
            r21 = r6
            r22 = r1
            r23 = r7
            r25 = r11
            r20.<init>(r21, r22, r23, r24, r25)
            r5.A01(r2)
            X.Dfu r2 = new X.Dfu
            r2.<init>(r3, r1, r7)
            r5.A01(r2)
            X.Mjl r2 = new X.Mjl
            r2.<init>()
            r5.A01(r2)
            android.content.Context r8 = r0.A07
            X.EG8 r2 = new X.EG8
            r2.<init>(r8, r0)
            r5.A01(r2)
            X.Uhf r2 = new X.Uhf
            r2.<init>()
            r5.A01(r2)
            boolean r2 = r0.A0N
            r17 = r2
            if (r2 == 0) goto L_0x0478
            X.NOJ r2 = new X.NOJ
            r2.<init>(r0)
        L_0x00b4:
            r5.A01(r2)
            X.NOU r2 = new X.NOU
            r2.<init>(r8, r0, r1, r4)
            r5.A01(r2)
            X.NOY r2 = new X.NOY
            r2.<init>(r8, r3, r1, r7)
            r5.A01(r2)
            X.WVq r4 = new X.WVq
            r4.<init>(r0, r10)
            r11 = 0
            X.Tw5 r3 = new X.Tw5
            r3.<init>(r4, r11)
            r5.A01(r3)
            X.PPY r12 = new X.PPY
            r12.<init>(r0)
            r2 = 2131972978(0x7f135372, float:1.9582979E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            X.MnI r3 = new X.MnI
            r3.<init>(r11, r12, r4)
            r5.A01(r3)
            X.0qQ.A0B(r1, r10)
            X.0Tu r14 = X.0Tu.A06
            r2 = 36320438183469486(0x81093f000321ae, double:3.032529585667217E-306)
            boolean r4 = X.182.A06(r14, r1, r2)
            X.O7S r3 = new X.O7S
            r3.<init>(r0)
            X.NQ3 r2 = new X.NQ3
            r2.<init>(r8, r3, r7, r4)
            r5.A01(r2)
            r2 = 36320438184387003(0x81093f001121bb, double:3.0325295862474585E-306)
            boolean r28 = X.182.A06(r14, r1, r2)
            X.0Tu r2 = X.0Tu.A05
            r3 = 36320438184518076(0x81093f001321bc, double:3.0325295863303496E-306)
            boolean r29 = X.182.A06(r2, r1, r3)
            r3 = 37164863114576249(0x84093f00120179, double:3.56654731232541E-306)
            double r3 = X.182.A00(r2, r1, r3)
            java.math.BigDecimal r12 = new java.math.BigDecimal
            r12.<init>(r3)
            long r24 = r12.longValue()
            r3 = 36601913162273144(0x82093f00231178, double:3.210535495671416E-306)
            long r26 = X.182.A01(r2, r1, r3)
            X.O7R r4 = new X.O7R
            r4.<init>(r0)
            X.NQ5 r3 = new X.NQ5
            r20 = r3
            r21 = r8
            r22 = r4
            r20.<init>(r21, r22, r23, r24, r26, r28, r29)
            r5.A01(r3)
            X.O7Q r4 = new X.O7Q
            r4.<init>(r0)
            X.EHC r3 = new X.EHC
            r3.<init>(r8, r4, r7)
            r5.A01(r3)
            X.Fwg r7 = new X.Fwg
            r7.<init>(r0, r10)
            r16 = 1
            X.Fwb r4 = new X.Fwb
            r3 = r16
            r4.<init>(r0, r3)
            X.EH7 r3 = new X.EH7
            r3.<init>(r4, r7)
            r5.A01(r3)
            X.O7P r4 = r0.A0H
            X.NQA r3 = new X.NQA
            r3.<init>(r1, r4)
            X.2t9 r7 = X.DbU.A0U(r5, r3)
            r3 = 4
            androidx.recyclerview.widget.GridLayoutManager r5 = new androidx.recyclerview.widget.GridLayoutManager
            r5.<init>(r9, r3)
            X.MuZ r3 = new X.MuZ
            r3.<init>(r7, r0)
            r5.A01 = r3
            int r15 = r0.A06
            boolean r3 = r0.A0O
            if (r3 == 0) goto L_0x044b
            X.OCu r4 = new X.OCu
            r4.<init>()
            int r3 = X.AnonymousClass7TG.A02(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.A00 = r3
        L_0x0196:
            java.lang.Integer r12 = r4.A01
            java.lang.Integer r3 = r4.A00
            X.OCv r11 = new X.OCv
            r11.<init>(r12, r3)
        L_0x019f:
            X.Dfq r12 = r0.A03
            X.OyY r3 = r0.A0F
            r40 = r3
            r3 = 36320438183993782(0x81093f000b21b6, double:3.032529585998784E-306)
            boolean r33 = X.182.A06(r2, r1, r3)
            r3 = 36320438184124855(0x81093f000d21b7, double:3.032529586081675E-306)
            boolean r34 = X.182.A06(r2, r1, r3)
            r3 = 36320438185304518(0x81093f001f21c6, double:3.032529586827699E-306)
            boolean r35 = X.182.A06(r2, r1, r3)
            r3 = 36320438184583613(0x81093f001421bd, double:3.0325295863717955E-306)
            boolean r36 = X.182.A06(r2, r1, r3)
            r3 = 36320438184649150(0x81093f001521be, double:3.0325295864132414E-306)
            boolean r37 = X.182.A06(r2, r1, r3)
            r3 = 36601913161421174(0x82093f00161176, double:3.210535495132627E-306)
            long r31 = X.182.A01(r2, r1, r3)
            r3 = 36320438185370055(0x81093f002021c7, double:3.0325295868691446E-306)
            boolean r38 = X.182.A06(r2, r1, r3)
            r3 = 36320438185501129(0x81093f002221c9, double:3.0325295869520363E-306)
            boolean r39 = X.182.A06(r2, r1, r3)
            com.instagram.ui.widget.search.SearchController r3 = new com.instagram.ui.widget.search.SearchController
            r26 = r40
            r27 = r12
            r28 = r11
            r29 = r0
            r30 = r15
            r20 = r3
            r21 = r9
            r22 = r13
            r23 = r7
            r24 = r5
            r25 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39)
            r0.A05 = r3
            X.4DH r15 = r0.A0A
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r13 = r0.A0J
            boolean r12 = r0.A0L
            boolean r9 = r0.A0R
            boolean r11 = r0.A0P
            boolean r5 = r0.A0Q
            X.PPc r4 = new X.PPc
            r20 = r4
            r21 = r8
            r22 = r15
            r24 = r1
            r25 = r40
            r26 = r13
            r27 = r3
            r28 = r17
            r29 = r12
            r30 = r9
            r31 = r11
            r32 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.A02 = r4
            com.instagram.ui.widget.search.SearchController r3 = r0.A05
            r6.registerLifecycleListener(r3)
            com.instagram.ui.widget.search.SearchController r3 = r0.A05
            X.OIK r3 = r3.mViewHolder
            if (r3 == 0) goto L_0x0260
            androidx.recyclerview.widget.RecyclerView r3 = r3.A01
            if (r3 == 0) goto L_0x0260
            X.2el r5 = r0.A0E
            X.3DZ r4 = X.AnonymousClass3DZ.A00(r6)
            com.instagram.ui.widget.search.SearchController r3 = r0.A05
            X.OIK r3 = r3.mViewHolder
            if (r3 != 0) goto L_0x0447
            r3 = 0
        L_0x0251:
            r5.A06(r3, r4)
            com.instagram.ui.widget.search.SearchController r3 = r0.A05
            X.OIK r3 = r3.mViewHolder
            if (r3 != 0) goto L_0x0443
            r4 = 0
        L_0x025b:
            X.3jg r3 = r0.A09
            r4.A15(r3)
        L_0x0260:
            r3 = 36323358761626734(0x810be700092c6e, double:3.034376571054085E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            if (r3 != 0) goto L_0x035b
            r15 = 5
            if (r9 == 0) goto L_0x027b
            r3 = 36595419169425551(0x8203570000088f, double:3.206428668445388E-306)
            java.lang.Long r3 = X.AnonymousClass7TF.A0Y(r2, r1, r3)
            int r15 = r3.intValue()
        L_0x027b:
            r3 = 36328508427222402(0x81109600063d82, double:3.0376332403128244E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            if (r3 == 0) goto L_0x028f
            r3 = 36609983403988939(0x821096000717cb, double:3.21563914902874E-306)
            int r15 = X.DbS.A04(r2, r1, r3)
        L_0x028f:
            X.07i r3 = r0.A08
            X.2lw r7 = new X.2lw
            r7.<init>(r8, r3)
            X.OTw r5 = new X.OTw
            r5.<init>()
            r3 = r16
            r5.A06 = r3
            boolean r3 = r0.A0S
            r5.A0B = r3
            r5.A03 = r15
            r3 = 36595419169491088(0x82035700010890, double:3.206428668486834E-306)
            if (r9 == 0) goto L_0x0437
            java.lang.Long r3 = X.AnonymousClass7TF.A0Y(r14, r1, r3)
        L_0x02b0:
            int r3 = r3.intValue()
            r5.A02 = r3
            boolean r3 = r0.A0T
            if (r3 == 0) goto L_0x0426
            r3 = 36598996877249879(0x82069800010d57, double:3.208691225279766E-306)
            java.lang.Long r3 = X.AnonymousClass7TF.A0Y(r2, r1, r3)
        L_0x02c3:
            int r3 = r3.intValue()
            r5.A01 = r3
            boolean r3 = X.AnonymousClass9B8.A0B(r1)
            if (r3 == 0) goto L_0x0423
            boolean r3 = X.AnonymousClass9B8.A07(r1)
            if (r3 == 0) goto L_0x0420
            r3 = 36601316159852681(0x8208b400051089, double:3.2101579489367795E-306)
            long r3 = X.182.A01(r2, r1, r3)
            int r9 = (int) r3
        L_0x02df:
            r5.A00 = r9
            r5.A08 = r12
            r5.A09 = r11
            boolean r3 = X.AnonymousClass9B8.A0B(r1)
            r5.A07 = r3
            r3 = 36320438183272877(0x81093f000021ad, double:3.032529585542881E-306)
            boolean r3 = X.182.A06(r14, r1, r3)
            r5.A0C = r3
            r3 = 36320438183535023(0x81093f000421af, double:3.032529585708663E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            r5.A0A = r3
            X.0eM r3 = r13.A0O
            java.lang.Object r4 = r3.getValue()
            X.DkJ r4 = (X.C46730DkJ) r4
            r5.A04 = r4
            r3 = r40
            X.OO3 r3 = r3.A01
            if (r3 == 0) goto L_0x041d
            java.lang.String r9 = r3.A07
        L_0x0313:
            r5.A05 = r9
            boolean r3 = r5.A06
            r27 = r3
            int r3 = r5.A03
            r23 = r3
            int r3 = r5.A02
            r24 = r3
            int r3 = r5.A01
            r17 = r3
            int r3 = r5.A00
            r16 = r3
            boolean r15 = r5.A0B
            boolean r14 = r5.A08
            boolean r13 = r5.A09
            boolean r12 = r5.A07
            boolean r11 = r5.A0C
            boolean r5 = r5.A0A
            X.N3d r3 = new X.N3d
            r20 = r3
            r21 = r4
            r22 = r9
            r25 = r17
            r26 = r16
            r28 = r15
            r29 = r14
            r30 = r13
            r31 = r12
            r32 = r11
            r33 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.7eL r4 = X.C67562Mpw.A04(r8, r1, r7, r3)
            r0.A04 = r4
            X.PPc r3 = r0.A02
            r4.EcJ(r3)
        L_0x035b:
            r3 = 36320438183666097(0x81093f000621b1, double:3.032529585791555E-306)
            boolean r2 = X.182.A06(r2, r1, r3)
            if (r2 == 0) goto L_0x036c
            r3 = 3
            r2 = r40
            r2.A05(r3)
        L_0x036c:
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            r0.A01 = r1
        L_0x0372:
            X.2qi r0 = r6.A0H
            if (r0 == 0) goto L_0x0379
            r0.Dh3()
        L_0x0379:
            X.0eM r0 = r6.A0Q
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r10)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323358761626734(0x810be700092c6e, double:3.034376571054085E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x040d
            X.07U r5 = X.07U.A05
            X.07Z r4 = r6.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 18
            X.MHI r3 = new X.MHI
            r7 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            X.19B r0 = X.19B.A00
            X.07Z r4 = X.JTP.A0I(r6, r0, r3, r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 19
            X.MHI r3 = new X.MHI
            r3.<init>(r4, r5, r6, r7, r8)
            X.07Z r4 = X.JTP.A0I(r6, r0, r3, r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 20
            X.MHI r3 = new X.MHI
            r3.<init>(r4, r5, r6, r7, r8)
            X.07Z r4 = X.JTP.A0I(r6, r0, r3, r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 21
            X.MHI r3 = new X.MHI
            r3.<init>(r4, r5, r6, r7, r8)
            X.07Z r4 = X.JTP.A0I(r6, r0, r3, r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 22
            X.MHI r3 = new X.MHI
            r3.<init>(r4, r5, r6, r7, r8)
            X.07Z r4 = X.JTP.A0I(r6, r0, r3, r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 23
            X.MHI r3 = new X.MHI
            r3.<init>(r4, r5, r6, r7, r8)
            X.07Z r4 = X.JTP.A0I(r6, r0, r3, r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 24
            X.MHI r3 = new X.MHI
            r3.<init>(r4, r5, r6, r7, r8)
            X.07Z r4 = X.JTP.A0I(r6, r0, r3, r1)
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 25
            X.MHI r3 = new X.MHI
            r3.<init>(r4, r5, r6, r7, r8)
            X.1Eo.A05(r0, r3, r1)
        L_0x040d:
            r0 = 1
            r6.A0L = r0
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = r6.C8v()
            r1 = 2047316844(0x7a07936c, float:1.7598754E35)
            r0 = r18
            X.AnonymousClass0fD.A09(r1, r0)
            return r2
        L_0x041d:
            r9 = 0
            goto L_0x0313
        L_0x0420:
            r9 = 0
            goto L_0x02df
        L_0x0423:
            r9 = 0
            goto L_0x02df
        L_0x0426:
            r3 = 36598996877249879(0x82069800010d57, double:3.208691225279766E-306)
            X.0tM r3 = X.AnonymousClass0yP.A00(r3)
            java.lang.Object r3 = r3.getDefaultValue()
            java.lang.Number r3 = (java.lang.Number) r3
            goto L_0x02c3
        L_0x0437:
            X.0tM r3 = X.AnonymousClass0yP.A00(r3)
            java.lang.Object r3 = r3.getDefaultValue()
            java.lang.Number r3 = (java.lang.Number) r3
            goto L_0x02b0
        L_0x0443:
            androidx.recyclerview.widget.RecyclerView r4 = r3.A01
            goto L_0x025b
        L_0x0447:
            androidx.recyclerview.widget.RecyclerView r3 = r3.A01
            goto L_0x0251
        L_0x044b:
            r3 = 36320438183666097(0x81093f000621b1, double:3.032529585791555E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            if (r3 == 0) goto L_0x019f
            r3 = 36320438183928245(0x81093f000a21b5, double:3.032529585957338E-306)
            boolean r3 = X.182.A06(r2, r1, r3)
            X.OCu r4 = new X.OCu
            if (r3 == 0) goto L_0x0471
            r4.<init>()
            r3 = 2131953205(0x7f130635, float:1.9542874E38)
        L_0x0469:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.A01 = r3
            goto L_0x0196
        L_0x0471:
            r4.<init>()
            r3 = 2131972857(0x7f1352f9, float:1.9582733E38)
            goto L_0x0469
        L_0x0478:
            X.EFm r2 = new X.EFm
            r2.<init>()
            goto L_0x00b4
        L_0x047f:
            java.lang.String r0 = "localTouchInterceptorFrameLayout"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.fragment.DirectSearchInboxFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(268699104);
        super.onDestroy();
        this.A0C = null;
        this.A0A = null;
        this.A0M = false;
        DbX.A0R(this.A0Q).A02(this.A0R, C71892Osa.class);
        AnonymousClass0fD.A09(1553653846, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(93204761);
        super.onDestroyView();
        this.localTouchInterceptorFrameLayout = null;
        C71874OsH osH = this.A07;
        if (osH != null) {
            C337257fy r0 = osH.A04;
            if (r0 != null) {
                r0.DDU();
            }
            IgFragmentActivity activity = osH.A0A.getActivity();
            if (activity instanceof IgFragmentActivity) {
                activity.unregisterOnActivityResultListener(osH.A0C);
            }
            osH.A03 = null;
            this.A07 = null;
        }
        AnonymousClass0fD.A09(833059175, A022);
    }
}
