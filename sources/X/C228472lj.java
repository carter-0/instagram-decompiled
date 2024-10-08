package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.facebook.systrace.Systrace;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2lj  reason: invalid class name and case insensitive filesystem */
public final class C228472lj implements C252243on {
    public int A00;
    public long A01;
    public C233922wh A02;
    public AnonymousClass2v8 A03;
    public C233312vV A04;
    public C233302vU A05;
    public AnonymousClass2rI A06;
    public C233102ux A07;
    public AnonymousClass3PG A08;
    public C233002un A09;
    public C233002un A0A;
    public C249383je A0B;
    public C233812wV A0C;
    public AnonymousClass2v7 A0D;
    public AnonymousClass2vG A0E;
    public C233902wf A0F;
    public C233972wm A0G;
    public AnonymousClass35D A0H;
    public String A0I = "";
    public String A0J = "";
    public List A0K;
    public C62320sa A0L;
    public boolean A0M;
    public boolean A0N;
    public AnonymousClass3DX A0O;
    public final Handler A0P = new Handler(Looper.getMainLooper());
    public final UserSession A0Q;
    public final AnonymousClass0qK A0R;
    public final AnonymousClass4DU A0S;
    public final AnonymousClass2lU A0T;
    public final C228782mK A0U;
    public final AnonymousClass2lC A0V;
    public final C228512ln A0W;
    public final C228542lq A0X;
    public final C228392lb A0Y;
    public final AnonymousClass2l3 A0Z;
    public final C228302lG A0a;
    public final C228492ll A0b;
    public final C228052ki A0c;
    public final C228532lp A0d;
    public final C228722mD A0e;
    public final C228552lr A0f;
    public final AnonymousClass2lH A0g;
    public final AnonymousClass2lI A0h;
    public final C228522lo A0i;
    public final AnonymousClass2lZ A0j;
    public final 1PG A0k;
    public final C249763kK A0l;
    public final C228762mH A0m;
    public final C227802jw A0n;
    public final C228462li A0o;
    public final AnonymousClass0eM A0p = AnonymousClass0eN.A01(C228752mG.A00);
    public final C62320sa A0q;

    public final void A05(AnonymousClass9IV r7) {
        C233972wm r0;
        this.A0a.A00("FEED_REQUEST_FINISHED");
        int ordinal = ((AnonymousClass3PG) r7.A01).ordinal();
        if (ordinal == 2) {
            this.A0n.A0V(false, true);
        } else if (ordinal == 0) {
            if (!182.A06(0Tu.A05, C238243Bc.A00(this.A0Q).A02, 36317620685313392L) && (r0 = this.A0G) != null) {
                r0.A03 = true;
                r0.A00 = 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r0.mStatusCode != 429) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass9IV r11, X.C268654dm r12, X.AnonymousClass1GU r13, java.lang.String r14, boolean r15) {
        /*
            r10 = this;
            r4 = 0
            r2 = 1
            r1 = 2
            java.lang.Object r0 = r11.A01
            X.3PG r0 = (X.AnonymousClass3PG) r0
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x01c8
            if (r0 == r4) goto L_0x0012
            if (r0 == r2) goto L_0x01c8
        L_0x0011:
            return
        L_0x0012:
            r3 = 0
            if (r15 == 0) goto L_0x0040
            java.lang.Throwable r0 = r12.A01()
            if (r0 == 0) goto L_0x0023
            java.lang.String r6 = r0.toString()
        L_0x001f:
            X.2l3 r5 = r10.A0Z
            monitor-enter(r5)
            goto L_0x0025
        L_0x0023:
            r6 = r3
            goto L_0x001f
        L_0x0025:
            X.1Gs r0 = r5.A0H     // Catch:{ all -> 0x01c5 }
            X.1Gu r0 = r0.A02     // Catch:{ all -> 0x01c5 }
            X.1Gw r1 = r0.A03     // Catch:{ all -> 0x01c5 }
            r0 = 0
            r1.A06(r0)     // Catch:{ all -> 0x01c5 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r1 = "feed_request_error"
            X.0rq r0 = r5.A00     // Catch:{ all -> 0x01c5 }
            X.18g.A05(r0, r1, r6)     // Catch:{ all -> 0x01c5 }
        L_0x0038:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x01c5 }
            r5.A0O = r0     // Catch:{ all -> 0x01c5 }
            X.AnonymousClass2l3.A01(r5)     // Catch:{ all -> 0x01c5 }
            monitor-exit(r5)
        L_0x0040:
            X.2lG r1 = r10.A0a
            java.lang.String r0 = "FEED_REQUEST_FAILED"
            r1.A00(r0)
            java.lang.Throwable r6 = r12.A01()
            if (r6 == 0) goto L_0x0051
            java.lang.Throwable r3 = r6.getCause()
        L_0x0051:
            boolean r5 = r3 instanceof java.lang.SecurityException
            boolean r0 = r12 instanceof X.C268674do
            if (r0 == 0) goto L_0x0066
            X.4do r12 = (X.C268674do) r12
            java.lang.Object r0 = r12.A00
            X.1XQ r0 = (X.1XQ) r0
            if (r0 == 0) goto L_0x0066
            int r3 = r0.mStatusCode
            r0 = 429(0x1ad, float:6.01E-43)
            r1 = 1
            if (r3 == r0) goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            boolean r0 = r6 instanceof java.io.IOException
            if (r5 != 0) goto L_0x0190
            if (r1 != 0) goto L_0x0151
            if (r0 == 0) goto L_0x0092
            X.1FI r5 = X.1FI.A06
            X.1FI r3 = X.1FI.A0M
            X.1FI r1 = X.1FI.A0G
            X.1FI r0 = X.1FI.A0J
            X.1FI[] r0 = new X.1FI[]{r5, r3, r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            X.1FS r0 = r13.A00
            X.1FI r0 = r0.A04
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0092
            r1 = 47
            X.9M1 r0 = new X.9M1
            r0.<init>(r1, r13, r10)
            r10.A0L = r0
        L_0x0092:
            X.2jw r7 = r10.A0n
            boolean r0 = r7.isVisible()
            if (r0 == 0) goto L_0x0151
            com.instagram.common.session.UserSession r6 = r10.A0Q
            java.lang.Class<X.Eb5> r1 = X.C48224Eb5.class
            X.Fwm r0 = new X.Fwm
            r0.<init>(r6)
            java.lang.Object r0 = r6.A01(r1, r0)
            X.Eb5 r0 = (X.C48224Eb5) r0
            X.0xa r5 = r0.A00
            java.lang.String r3 = "cold_start_time"
            r0 = 0
            long r8 = r5.getLong(r3, r0)
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0151
            X.2ll r1 = r10.A0b
            X.1FS r0 = r13.A00
            X.0qQ.A0B(r0, r4)
            X.1QP r8 = r1.A04
            int r1 = r0.A01
            r0 = 974460658(0x3a1516f2, float:5.687318E-4)
            long r0 = r8.generateFlowId(r0, r1)
            boolean r3 = r8.isOngoingFlow(r0)
            if (r3 == 0) goto L_0x00dd
            java.lang.String r5 = "FEED_ERROR_DISPLAYED"
            r8.flowMarkPoint(r0, r5)
            r3 = 0
            r8.flowEndFail(r0, r5, r3)
            X.2lk r3 = X.C228492ll.A09
            X.C228482lk.A01(r3, r0)
        L_0x00dd:
            X.0Tu r5 = X.0Tu.A05
            r0 = 36329380305322061(0x8111610002404d, double:3.03818461953382E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0182
            X.6ap r3 = new X.6ap
            r3.<init>()
            android.content.Context r1 = r7.requireContext()
            r0 = 2131956760(0x7f131418, float:1.9550085E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0D = r0
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            r3.A07(r0)
            X.6ar r0 = X.C310356ar.ICON
            r3.A0B(r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131972371(0x7f135113, float:1.9581748E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r3.A0G = r0
            X.IVN r0 = new X.IVN
            r0.<init>(r10)
            r3.A0A(r0)
            r3.A01()
            android.content.Context r0 = r7.requireContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165770(0x7f07024a, float:1.7945766E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r3.A02 = r0
            r3.A0R = r2
            r3.A0J = r2
            r0 = 36610855282088103(0x821161000318a7, double:3.2161905282494225E-306)
            long r5 = X.182.A01(r5, r6, r0)
            int r0 = (int) r5
            r3.A01 = r0
            X.Dc2 r3 = r3.A00()
            X.1xC r1 = X.1xC.A01
            X.3GP r0 = new X.3GP
            r0.<init>(r3)
            r1.A00(r0)
        L_0x0151:
            X.2rI r0 = r10.A06
            if (r0 == 0) goto L_0x0158
            r0.notifyDataSetChangedSmart()
        L_0x0158:
            X.2jw r1 = r10.A0n
            X.1FS r0 = r13.A00
            java.lang.String r0 = r0.A09
            r1.A0U(r4, r0)
            r1.A0V(r4, r2)
            com.instagram.common.session.UserSession r0 = r10.A0Q
            X.3Bd r0 = X.C238243Bc.A00(r0)
            com.instagram.common.session.UserSession r5 = r0.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36317620685313392(0x8106af00091570, double:3.030747788488149E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0011
            X.2wm r0 = r10.A0G
            if (r0 == 0) goto L_0x0011
            r0.A03 = r2
            r0.A00 = r4
            return
        L_0x0182:
            androidx.fragment.app.FragmentActivity r3 = r7.getActivity()
            r1 = 2131956760(0x7f131418, float:1.9550085E38)
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x01b1
        L_0x0190:
            X.2jw r1 = r10.A0n
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L_0x0151
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r0.isFinishing()
            if (r0 == r2) goto L_0x01b5
            androidx.fragment.app.FragmentActivity r3 = r1.getActivity()
            r1 = 2131972964(0x7f135364, float:1.958295E38)
            r0 = 1109(0x455, float:1.554E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
        L_0x01b1:
            X.C59689JTv.A01(r3, r0, r1, r4)
            goto L_0x0151
        L_0x01b5:
            r0 = 873(0x369, float:1.223E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1059(0x423, float:1.484E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
            goto L_0x0151
        L_0x01c5:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x01c8:
            X.2l3 r2 = r10.A0Z
            java.lang.String r1 = "cancel"
            java.lang.String r0 = " - "
            java.lang.String r3 = X.002.A0g(r1, r0, r14)
            java.lang.String r1 = "feed_cache_fail_reason"
            X.0rq r0 = r2.A00
            X.18g.A05(r0, r1, r3)
            X.1Gs r0 = r2.A0H
            X.0qQ.A0B(r3, r4)
            X.1H4 r2 = r0.A01
            X.1Gq r1 = r2.A01
            java.lang.String r0 = "CACHED_FEED_FAILED"
            r1.A03(r0, r3)
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r2.A00()
            X.1Gx r0 = X.1Gx.A03
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228472lj.A06(X.9IV, X.4dm, X.1GU, java.lang.String, boolean):void");
    }

    public final boolean A0A(1FI r2, String str, Map map) {
        0qQ.A0B(r2, 0);
        return this.A0f.A0B(r2, str, map);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C18625VvI vvI;
        0qQ.A0B(view, 0);
        C233972wm r1 = this.A0G;
        if (r1 != null) {
            r1.A03 = true;
            r1.A00 = 0;
        }
        C233922wh r12 = this.A02;
        if (r12 != null) {
            this.A0n.A0A().A1w.EBt(r12);
        }
        AnonymousClass2v8 r13 = this.A03;
        if (r13 != null) {
            this.A0n.A0A().A1w.EBt(r13);
        }
        C249383je r14 = this.A0B;
        if (r14 != null) {
            this.A0n.A0A().A1w.EBt(r14);
        }
        C233302vU r2 = this.A05;
        if (r2 != null) {
            C63040xi r15 = 0tS.A4E;
            Context context = view.getContext();
            0qQ.A07(context);
            if (r15.A01(context).A0T() && (vvI = r2.A00) != null) {
                View inflate = ((ViewStub) view.requireViewById(R.id.feed_sponsored_pool_debug_overlay)).inflate();
                0qQ.A0A(inflate);
                vvI.A02(inflate);
            }
        }
        C233002un r3 = this.A09;
        if (r3 != null) {
            UserSession userSession = this.A0Q;
            AnonymousClass3DW A002 = AnonymousClass3DV.A00(userSession);
            AnonymousClass3DX r0 = new AnonymousClass3DX(userSession, r3);
            A002.A00(r0);
            this.A0O = r0;
        }
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public /* synthetic */ C228472lj(Context context, AnonymousClass07i r21, UserSession userSession, AnonymousClass4DU r23, AnonymousClass2lU r24, AnonymousClass2lC r25, C228392lb r26, C228322lL r27, AnonymousClass2l3 r28, C228302lG r29, C228052ki r30, AnonymousClass2lH r31, AnonymousClass2lI r32, C228312lJ r33, AnonymousClass2lZ r34, C228232l0 r35, C249763kK r36, C227802jw r37, C228462li r38) {
        UserSession userSession2 = userSession;
        C228492ll A002 = C228482lk.A00(userSession2);
        C228512ln A003 = C228502lm.A00(userSession2);
        C249763kK r1 = r36;
        0qQ.A0B(r1, 6);
        C228052ki r7 = r30;
        0qQ.A0B(r7, 9);
        AnonymousClass2lI r6 = r32;
        0qQ.A0B(r6, 13);
        0qQ.A0B(A002, 14);
        0qQ.A0B(A003, 22);
        this.A0Q = userSession2;
        C227802jw r5 = r37;
        this.A0n = r5;
        AnonymousClass4DU r9 = r23;
        this.A0S = r9;
        AnonymousClass2l3 r12 = r28;
        this.A0Z = r12;
        this.A0l = r1;
        C228302lG r13 = r29;
        this.A0a = r13;
        this.A0o = r38;
        this.A0c = r7;
        this.A0V = r25;
        AnonymousClass2lH r14 = r31;
        this.A0g = r14;
        this.A0h = r6;
        this.A0b = A002;
        this.A0T = r24;
        AnonymousClass2lZ r4 = r34;
        this.A0j = r4;
        this.A0Y = r26;
        this.A0W = A003;
        1UX.A00(r5.requireContext(), userSession2);
        this.A0i = new C228522lo(userSession2);
        this.A0d = new C228532lp(r5, userSession2, r9, r12);
        C228542lq r10 = new C228542lq(userSession2);
        this.A0X = r10;
        AnonymousClass07i r72 = r21;
        Context context2 = context;
        this.A0f = new C228552lr(context2, r72, userSession2, r9, r10, r27, r12, r13, r14, r33, r4, r35, r1);
        this.A0e = new C228722mD(r72, userSession2);
        AnonymousClass9LY r15 = new AnonymousClass9LY(this, 28);
        this.A0q = r15;
        this.A0m = new C228762mH(r15);
        this.A0R = new C228772mJ(this);
        1PG A004 = 1PG.A00(userSession2);
        0qQ.A07(A004);
        this.A0k = A004;
        this.A0U = new C228782mK(userSession2);
    }

    public static final AnonymousClass0qK A00(C228472lj r4) {
        if (182.A06(0Tu.A05, r4.A0Q, 36325768238150868L)) {
            return r4.A0m;
        }
        return r4.A0R;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private final java.lang.Integer A01(X.AnonymousClass1GU r31, X.1XM r32, X.AnonymousClass3PG r33, int r34, boolean r35) {
        /*
            r30 = this;
            r8 = r30
            X.2rI r6 = r8.A06
            r29 = r32
            if (r6 == 0) goto L_0x0041
            java.util.List r5 = r29.A00()
            int r4 = r5.size()
            r3 = 0
        L_0x0011:
            if (r3 >= r4) goto L_0x0041
            java.lang.Object r2 = r5.get(r3)
            X.1Xg r2 = (X.1Xg) r2
            X.1UQ r0 = r2.A06
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0029
            r0 = 13
            if (r1 == r0) goto L_0x0029
        L_0x0026:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0029:
            X.1Xn r0 = r2.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.CcK()
            if (r0 != 0) goto L_0x0026
            X.2rX r0 = r6.A00
            X.2rW r0 = (X.AnonymousClass2rW) r0
            boolean r0 = r0.A0B(r2)
            if (r0 != 0) goto L_0x0026
        L_0x0041:
            r9 = 0
            r7 = 1
            com.instagram.common.session.UserSession r11 = r8.A0Q
            X.0Tu r6 = X.0Tu.A05
            r4 = 36317620685575540(0x8106af000d1574, double:3.030747788653932E-306)
            boolean r0 = X.182.A06(r6, r11, r4)
            if (r0 == 0) goto L_0x00d4
            X.2jw r0 = r8.A0n
            boolean r2 = r0.A0P
        L_0x0056:
            X.2jw r0 = r8.A0n
            r28 = r0
            androidx.fragment.app.FragmentActivity r3 = r28.getActivity()
            r1 = 1
            if (r3 == 0) goto L_0x00d2
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = r0.A01(r3)
            if (r0 == 0) goto L_0x00d2
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r7) goto L_0x00d2
        L_0x006f:
            if (r1 == 0) goto L_0x007d
            r0 = 36317620688459146(0x8106af0039158a, double:3.030747790477536E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            r1 = 1
            if (r0 != 0) goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            r27 = r31
            r0 = r27
            X.1FS r10 = r0.A00
            boolean r0 = r10.A01()
            r25 = r35
            if (r0 != 0) goto L_0x01f5
            r0 = r28
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x01f5
            X.2lo r12 = r8.A0i
            X.2rI r0 = r8.A06
            if (r0 == 0) goto L_0x00cc
            java.util.List r15 = r0.A07()
        L_0x009c:
            if (r2 != 0) goto L_0x00a2
            r24 = 0
            if (r1 == 0) goto L_0x00a4
        L_0x00a2:
            r24 = 1
        L_0x00a4:
            X.2lG r0 = r8.A0a
            java.lang.String r3 = "CACHE_LOADED"
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.google.common.collect.EvictingQueue r0 = r0.A06
            java.util.Iterator r2 = r0.iterator()
        L_0x00b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.add(r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00b3
            r1.clear()
            goto L_0x00b3
        L_0x00cc:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            goto L_0x009c
        L_0x00d2:
            r1 = 0
            goto L_0x006f
        L_0x00d4:
            X.2lI r0 = r8.A0h
            boolean r2 = r0.A01()
            goto L_0x0056
        L_0x00dc:
            java.lang.String r0 = "SCROLL_FEED"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "LIKE"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "CAROUSEL_SWIPE"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "SINGLE_TAP"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "SAVE"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "TOUCH"
            boolean r0 = r1.contains(r0)
            r23 = 0
            if (r0 == 0) goto L_0x0110
        L_0x010e:
            r23 = 1
        L_0x0110:
            long r2 = r8.A01
            boolean r0 = X.14i.A08()
            r22 = 1
            r21 = r0 ^ 1
            boolean r0 = r15.isEmpty()
            r20 = r0 ^ 1
            java.util.List r0 = r29.A00()
            java.util.Iterator r13 = r0.iterator()
        L_0x0128:
            boolean r0 = r13.hasNext()
            java.lang.String r1 = "Required value was null."
            r14 = 0
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r13.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r13 = r0.getId()
            if (r13 != 0) goto L_0x014c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x014b:
            r13 = r14
        L_0x014c:
            java.util.Iterator r15 = r15.iterator()
        L_0x0150:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r0 = r15.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x0150
            java.lang.String r14 = r0.getId()
            if (r14 != 0) goto L_0x0170
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0170:
            if (r13 == 0) goto L_0x017c
            if (r14 == 0) goto L_0x017c
            boolean r0 = r13.equals(r14)
            r19 = 1
            if (r0 != 0) goto L_0x017e
        L_0x017c:
            r19 = 0
        L_0x017e:
            java.util.List r0 = r12.A04
            r26 = r0
            boolean r0 = r26.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a2
            if (r35 != 0) goto L_0x01a2
            r0 = r26
            java.lang.Object r0 = r0.get(r9)
            X.1XM r0 = (X.1XM) r0
            java.lang.String r1 = r0.A0I
            r0 = r29
            java.lang.String r0 = r0.A0I
            boolean r0 = X.0qQ.A0K(r1, r0)
            r18 = 1
            if (r0 != 0) goto L_0x01a4
        L_0x01a2:
            r18 = 0
        L_0x01a4:
            androidx.fragment.app.FragmentActivity r1 = r28.getActivity()
            if (r1 == 0) goto L_0x0342
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r14 = r0.A01(r1)
        L_0x01b0:
            com.instagram.common.session.UserSession r15 = r12.A02
            X.0Tu r0 = X.0Tu.A06
            r16 = 2342161158181754827(0x2081072a002417cb, double:4.064016362171637E-152)
            r13 = r0
            r0 = r16
            boolean r0 = X.182.A06(r13, r15, r0)
            if (r0 == 0) goto L_0x02d4
            if (r14 == 0) goto L_0x02d4
            X.37F r14 = (X.AnonymousClass37F) r14
            boolean r0 = r14.A0g
            if (r0 != r7) goto L_0x02d4
            boolean r0 = r14.A0c
            if (r0 == 0) goto L_0x02d4
        L_0x01ce:
            java.util.List r1 = r12.A03
            r0 = r27
            r1.add(r0)
            r1 = r29
            r0 = r26
            r0.add(r1)
            X.353 r0 = r12.A00
            if (r0 == 0) goto L_0x01f0
            X.2jw r1 = r0.A00
            X.3Az r0 = r1.A0B
            if (r0 == 0) goto L_0x01f0
            r0.A07()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A0P(r0)
        L_0x01f0:
            r12.A01 = r7
        L_0x01f2:
            r14 = 1
            if (r22 != 0) goto L_0x01f6
        L_0x01f5:
            r14 = 0
        L_0x01f6:
            if (r35 != 0) goto L_0x0209
            java.lang.String r1 = r10.A0A
            X.3kK r0 = r8.A0l
            java.lang.String r0 = r0.getSessionId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0209
        L_0x0206:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x0209:
            X.2rI r1 = r8.A06
            r4 = 0
            if (r1 == 0) goto L_0x0345
            X.2vV r0 = r8.A04
            if (r0 == 0) goto L_0x0345
            boolean r0 = X.C233312vV.A00(r10)
            if (r0 != r7) goto L_0x0345
            X.2vV r12 = r8.A04
            r2 = 10
            if (r12 == 0) goto L_0x0255
            java.util.List r5 = r1.A07()
            X.2wV r0 = r8.A0C
            if (r0 == 0) goto L_0x0253
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x022c:
            java.util.List r13 = r29.A00()
            int r0 = X.0Yv.A1E(r13, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L_0x023d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0257
            java.lang.Object r0 = r13.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            r1.add(r0)
            goto L_0x023d
        L_0x0253:
            r3 = r4
            goto L_0x022c
        L_0x0255:
            r5 = r4
            goto L_0x025b
        L_0x0257:
            java.lang.String r5 = r12.A02(r3, r5, r1)
        L_0x025b:
            X.2vV r0 = r8.A04
            if (r0 == 0) goto L_0x0345
            java.lang.Integer r1 = r0.A05
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            if (r1 == r3) goto L_0x0268
            r0 = 1
            if (r5 == 0) goto L_0x0269
        L_0x0268:
            r0 = 0
        L_0x0269:
            if (r0 != 0) goto L_0x0345
            X.2ln r4 = r8.A0W
            int r0 = r1.intValue()
            switch(r0) {
                case 0: goto L_0x02c4;
                case 1: goto L_0x02c7;
                default: goto L_0x0274;
            }
        L_0x0274:
            java.lang.String r6 = "FAILURE"
        L_0x0276:
            r1 = 976041859(0x3a2d3783, float:6.607698E-4)
            X.02m r0 = r4.A00
            com.facebook.quicklog.MarkerEditor r1 = r0.withMarker(r1)
            java.lang.String r0 = "replacement_ineligible"
            com.facebook.quicklog.PointEditor r4 = r1.pointEditor(r0)
            java.lang.String r1 = "invalidation_reason"
            java.lang.String r0 = "null"
            if (r5 != 0) goto L_0x028c
            r5 = r0
        L_0x028c:
            com.facebook.quicklog.PointEditor r1 = r4.addPointData(r1, r5)
            java.lang.String r0 = "eager_refresh_state"
            com.facebook.quicklog.PointEditor r0 = r1.addPointData(r0, r6)
            r0.markerEditingCompleted()
            X.2vV r4 = r8.A04
            if (r4 == 0) goto L_0x02cc
            java.util.List r1 = r29.A00()
            int r0 = X.0Yv.A1E(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x02ae:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02ca
            java.lang.Object r0 = r1.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            r2.add(r0)
            goto L_0x02ae
        L_0x02c4:
            java.lang.String r6 = "NOT_HANDLED"
            goto L_0x0276
        L_0x02c7:
            java.lang.String r6 = "SUCCESS"
            goto L_0x0276
        L_0x02ca:
            r4.A08 = r2
        L_0x02cc:
            X.2vV r0 = r8.A04
            if (r0 == 0) goto L_0x0206
            r0.A05 = r3
            goto L_0x0206
        L_0x02d4:
            if (r35 == 0) goto L_0x02dc
            if (r20 == 0) goto L_0x02dc
            boolean r0 = r12.A05
            if (r0 != 0) goto L_0x01ce
        L_0x02dc:
            if (r18 != 0) goto L_0x01ce
            if (r20 == 0) goto L_0x033e
            X.1FI r1 = r10.A04
            r0 = 3
            X.0qQ.A0B(r1, r0)
            if (r21 == 0) goto L_0x033e
            if (r24 == 0) goto L_0x033e
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x033e
            if (r35 == 0) goto L_0x033e
            X.3Bd r0 = X.C238243Bc.A00(r15)
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = "defer"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x030a
            boolean r0 = X.182.A06(r6, r15, r4)
            if (r0 != 0) goto L_0x0338
            goto L_0x01ce
        L_0x030a:
            X.3Bd r0 = X.C238243Bc.A00(r15)
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = "defer_on_slow_network"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x033a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x033a
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            X.3Bd r0 = X.C238243Bc.A00(r15)
            com.instagram.common.session.UserSession r2 = r0.A02
            r0 = 36599095662677406(0x8206af00130d9e, double:3.208753697581911E-306)
            long r1 = X.182.A01(r6, r2, r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x033a
        L_0x0338:
            if (r19 == 0) goto L_0x01ce
        L_0x033a:
            if (r23 == 0) goto L_0x033e
            goto L_0x01ce
        L_0x033e:
            r22 = 0
            goto L_0x01f2
        L_0x0342:
            r14 = 0
            goto L_0x01b0
        L_0x0345:
            boolean r13 = r10.A00()
            if (r13 == 0) goto L_0x03fb
            if (r35 == 0) goto L_0x03a0
            X.2l3 r2 = r8.A0Z
            monitor-enter(r2)
            X.1Gs r0 = r2.A0H     // Catch:{ all -> 0x03ad }
            X.1Gu r12 = r0.A02     // Catch:{ all -> 0x03ad }
            X.1Gw r1 = r12.A03     // Catch:{ all -> 0x03ad }
            java.lang.String r0 = "FEED_REQUEST_SUCCEEDED"
            r1.A05(r0, r4)     // Catch:{ all -> 0x03ad }
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r1.A00()     // Catch:{ all -> 0x03ad }
            X.1Gx r0 = X.1Gx.A08     // Catch:{ all -> 0x03ad }
            r1.A00(r0)     // Catch:{ all -> 0x03ad }
            boolean r0 = r2.A03     // Catch:{ all -> 0x03ad }
            if (r0 != 0) goto L_0x037b
            boolean r0 = r2.A0Q     // Catch:{ all -> 0x03ad }
            if (r0 == 0) goto L_0x037b
            android.os.Handler r5 = r2.A0B     // Catch:{ all -> 0x03ad }
            java.lang.Runnable r3 = r2.A0K     // Catch:{ all -> 0x03ad }
            r0 = 20000(0x4e20, double:9.8813E-320)
            r5.postDelayed(r3, r0)     // Catch:{ all -> 0x03ad }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x03ad }
            r2.A0O = r0     // Catch:{ all -> 0x03ad }
        L_0x0379:
            monitor-enter(r2)     // Catch:{ all -> 0x03ad }
            goto L_0x0380
        L_0x037b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ all -> 0x03ad }
            r2.A0O = r0     // Catch:{ all -> 0x03ad }
            goto L_0x0379
        L_0x0380:
            X.1H2 r1 = r12.A01     // Catch:{ all -> 0x039c }
            java.lang.String r0 = "NETWORK_FEED_UI_RENDER_START"
            r1.A05(r0, r4)     // Catch:{ all -> 0x039c }
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r1.A00()     // Catch:{ all -> 0x039c }
            X.1Gx r0 = X.1Gx.A07     // Catch:{ all -> 0x039c }
            r1.A00(r0)     // Catch:{ all -> 0x039c }
            android.os.MessageQueue r1 = r2.A0D     // Catch:{ all -> 0x039c }
            X.3VQ r0 = new X.3VQ     // Catch:{ all -> 0x039c }
            r0.<init>(r2)     // Catch:{ all -> 0x039c }
            r1.addIdleHandler(r0)     // Catch:{ all -> 0x039c }
            monitor-exit(r2)     // Catch:{ all -> 0x03ad }
            goto L_0x039f
        L_0x039c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03ad }
            throw r0     // Catch:{ all -> 0x03ad }
        L_0x039f:
            monitor-exit(r2)
        L_0x03a0:
            if (r14 == 0) goto L_0x03f2
            X.2l3 r2 = r8.A0Z
            monitor-enter(r2)
            java.lang.String r1 = "is_feed_deferred"
            X.0rq r0 = r2.A00     // Catch:{ all -> 0x03ad }
            X.18g.A06(r0, r1, r7)     // Catch:{ all -> 0x03ad }
            goto L_0x03b0
        L_0x03ad:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x03b0:
            monitor-exit(r2)
            r0 = 36317620684920174(0x8106af0003156e, double:3.030747788239476E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 == 0) goto L_0x03f2
            X.1Gs r0 = r2.A0H
            X.1Gu r5 = r0.A02
            X.1H1 r1 = r5.A02
            java.lang.String r0 = "FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_SKIPPED"
            r1.A05(r0, r4)
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r1.A00()
            X.1Gx r3 = X.1Gx.A06
            r0.A00(r3)
            X.1H2 r1 = r5.A01
            java.lang.String r0 = "NETWORK_FEED_UI_RENDER_SKIPPED"
            r1.A05(r0, r4)
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r0 = r1.A00()
            r0.A00(r3)
            com.instagram.common.session.UserSession r3 = r2.A0F
            r0 = 2342160629899531639(0x208106af00111577, double:4.063568423659297E-152)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x04ab
            java.lang.Integer r0 = X.AnonymousClass05K.A02
        L_0x03ed:
            r2.A0O = r0
            X.AnonymousClass2l3.A01(r2)
        L_0x03f2:
            X.0wX r0 = X.C61170le.A00
            X.18g r0 = X.C638918c.A01(r0)
            r0.A0E()
        L_0x03fb:
            if (r35 == 0) goto L_0x0417
            X.2rI r2 = r8.A06
            if (r2 == 0) goto L_0x0417
            X.2lr r0 = r8.A0f
            X.3Do r0 = X.C228552lr.A01(r0)
            java.lang.String r0 = r0.A03
            boolean r0 = X.0mp.A0B(r0)
            r0 = r0 ^ 1
            r1 = r0 ^ 1
            X.2rX r0 = r2.A00
            X.2rU r0 = (X.C231352rU) r0
            r0.A02 = r1
        L_0x0417:
            if (r13 == 0) goto L_0x0420
            X.2lG r1 = r8.A0a
            java.lang.String r0 = "NETWORK_LOADED"
            r1.A02(r0)
        L_0x0420:
            r2 = r34
            if (r2 != r7) goto L_0x0426
            r8.A0M = r9
        L_0x0426:
            if (r14 != 0) goto L_0x0464
            java.lang.Integer r24 = java.lang.Integer.valueOf(r2)
            r22 = r33
            r20 = r10
            r21 = r29
            r23 = r8
            r26 = r9
            r27 = r9
            boolean r5 = A03(r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x043c:
            java.lang.String r1 = r10.A09
            r4 = 1
            r0 = r28
            r0.A0V(r9, r7)
            r0.A0U(r7, r1)
            X.2wm r0 = r8.A0G
            if (r14 == 0) goto L_0x04af
            if (r0 == 0) goto L_0x0461
            X.3Bd r0 = X.C238243Bc.A00(r11)
            com.instagram.common.session.UserSession r2 = r0.A02
            r0 = 36317620685313392(0x8106af00091570, double:3.030747788488149E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x0461
            r8.A02(r9)
        L_0x0461:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        L_0x0464:
            X.2ll r4 = r8.A0b
            X.1QP r12 = r4.A04
            int r1 = r10.A01
            r0 = 974460658(0x3a1516f2, float:5.687318E-4)
            long r0 = r12.generateFlowId(r0, r1)
            boolean r3 = r12.isOngoingFlow(r0)
            if (r3 == 0) goto L_0x04a9
            java.lang.String r3 = "FEED_DEFERRED"
            r12.flowMarkPoint(r0, r3)
            r5 = 0
            com.instagram.common.session.UserSession r13 = r4.A05
            java.util.List r3 = r29.A00()
            java.util.Iterator r4 = r3.iterator()
        L_0x0487:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x049c
            java.lang.Object r3 = r4.next()
            X.1Xg r3 = (X.1Xg) r3
            boolean r3 = X.AnonymousClass3VN.A00(r13, r3)
            if (r3 == 0) goto L_0x0487
            int r5 = r5 + 1
            goto L_0x0487
        L_0x049c:
            java.lang.String r3 = "DEFERRED_FEED_ITEM_COUNT"
            r12.flowAnnotate(r0, r3, r5)
            r12.flowEndSuccess(r0)
            X.2lk r3 = X.C228492ll.A09
            X.C228482lk.A01(r3, r0)
        L_0x04a9:
            r5 = 1
            goto L_0x043c
        L_0x04ab:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x03ed
        L_0x04af:
            if (r0 == 0) goto L_0x04ca
            X.1FI r3 = r10.A04
            boolean r0 = X.1FT.A00(r11, r3)
            if (r0 == 0) goto L_0x04ca
            r0 = r29
            java.lang.Boolean r1 = r0.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x04d3
            r8.A02(r9)
        L_0x04ca:
            X.2lo r0 = r8.A0i
            r0.A01 = r9
            if (r5 == 0) goto L_0x04eb
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x04d3:
            if (r34 != 0) goto L_0x04ca
            X.1FI r0 = X.1FI.A0G
            if (r3 != r0) goto L_0x04da
            r4 = 0
        L_0x04da:
            if (r4 == 0) goto L_0x04ca
            r0 = 36326433957623557(0x810eb300003705, double:3.036321337385296E-306)
            boolean r0 = X.182.A06(r6, r11, r0)
            if (r0 == 0) goto L_0x04ca
            r8.A02(r7)
            goto L_0x04ca
        L_0x04eb:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228472lj.A01(X.1GU, X.1XM, X.3PG, int, boolean):java.lang.Integer");
    }

    private final void A02(int i) {
        C233972wm r6 = this.A0G;
        if (r6 == null) {
            return;
        }
        if (i > 0) {
            r6.A00 = i;
            return;
        }
        long A012 = 182.A01(0Tu.A05, this.A0Q, 36599095662808479L);
        if (A012 > 0) {
            long max = Math.max(0, A012);
            if (max >= 100) {
                r6.A03 = false;
                this.A0P.postDelayed(new C57795Iga(r6), max);
                return;
            }
            return;
        }
        r6.A03 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.1FS r29, X.1XM r30, X.AnonymousClass3PG r31, X.C228472lj r32, java.lang.Integer r33, boolean r34, boolean r35, boolean r36) {
        /*
            r5 = r32
            X.2wf r0 = r5.A0F
            if (r0 != 0) goto L_0x0013
            r0 = 445(0x1bd, float:6.24E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "loadFeedResponse()"
            X.0wb.A03(r1, r0)
            r10 = 0
        L_0x0012:
            return r10
        L_0x0013:
            com.instagram.common.session.UserSession r3 = r5.A0Q
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319278542101600(0x81083100001c60, double:3.031796223796665E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r6 = r30
            r4 = r31
            r28 = r34
            if (r0 == 0) goto L_0x0069
            X.3PG r0 = X.AnonymousClass3PG.NETWORK
            if (r4 != r0) goto L_0x0069
            if (r34 != 0) goto L_0x0069
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r0 = r6.A00()
            java.util.Iterator r1 = r0.iterator()
        L_0x003b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r1.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x016e
            r9.add(r0)
            goto L_0x003b
        L_0x0059:
            X.585 r8 = X.AnonymousClass584.A00(r3)
            X.589 r7 = X.AnonymousClass589.IG_FEED_TIMELINE
            java.lang.String r1 = r6.A04
            X.9Uw r0 = new X.9Uw
            r0.<init>(r7, r1, r9)
            r8.A01(r0)
        L_0x0069:
            java.util.List r25 = r6.A00()
            X.1PG r1 = X.1PG.A00(r3)
            X.2mL r0 = X.C228792mL.A00
            X.2vA r1 = r1.A03(r0)
            r31 = r29
            r0 = r31
            java.lang.String r0 = r0.A0A
            r1.A0a = r0
            X.2wf r8 = r5.A0F
            if (r8 == 0) goto L_0x0160
            java.lang.Boolean r1 = r6.A09
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r29 = X.0qQ.A0K(r1, r0)
            X.1sV r0 = r6.A04
            r30 = r0
            java.lang.Integer r0 = r6.A0E
            r16 = r0
            r7 = 0
            if (r35 == 0) goto L_0x0156
            r0 = 36317620684920174(0x8106af0003156e, double:3.030747788239476E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0156
            r14 = r7
        L_0x00a5:
            r12 = r7
            r11 = r7
        L_0x00a7:
            java.lang.String r15 = r6.A0G
            if (r35 == 0) goto L_0x014e
            X.3PG r0 = X.AnonymousClass3PG.CACHED
            if (r4 == r0) goto L_0x014e
            r13 = r7
        L_0x00b0:
            boolean r0 = r6.A08
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r10 = r6.A0D
            java.lang.String r9 = r6.A0F
            long r26 = java.lang.System.currentTimeMillis()
            long r0 = r6.mResponseTimestamp
            long r26 = r26 - r0
            r23 = r13
            r24 = r9
            r20 = r16
            r21 = r10
            r22 = r15
            r16 = r4
            r17 = r11
            r18 = r7
            r13 = r14
            r14 = r30
            r15 = r31
            r11 = r8
            boolean r10 = r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29)
        L_0x00dc:
            if (r34 == 0) goto L_0x00fb
            r0 = 36317620684920174(0x8106af0003156e, double:3.030747788239476E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00f9
            java.util.List r0 = r6.A00()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00f9
            X.3UH r0 = r6.A03
            if (r0 == 0) goto L_0x00fb
        L_0x00f9:
            r5.A08 = r4
        L_0x00fb:
            r0 = 36599095664119204(0x8206af00290da4, double:3.20875369849371E-306)
            long r8 = X.182.A01(r2, r3, r0)
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0126
            if (r10 == 0) goto L_0x0126
            X.3PG r0 = X.AnonymousClass3PG.NETWORK
            if (r4 != r0) goto L_0x0126
            X.1Av r4 = X.1Au.A00(r3)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xa r4 = r4.A01
            X.0xY r6 = r4.AR4()
            java.lang.String r4 = "last_feed_update_time"
            r6.E5c(r4, r0)
            r6.apply()
        L_0x0126:
            X.3Bd r0 = X.C238243Bc.A00(r3)
            com.instagram.common.session.UserSession r3 = r0.A02
            r0 = 36317620685313392(0x8106af00091570, double:3.030747788488149E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0012
            if (r34 == 0) goto L_0x0141
            if (r33 == 0) goto L_0x0141
            int r0 = r33.intValue()
            if (r0 == 0) goto L_0x0012
        L_0x0141:
            if (r36 != 0) goto L_0x0012
            X.2wm r1 = r5.A0G
            if (r1 == 0) goto L_0x0012
            r0 = 1
            r1.A03 = r0
            r0 = 0
            r1.A00 = r0
            return r10
        L_0x014e:
            java.lang.String r13 = r6.A04
            if (r35 != 0) goto L_0x00b0
            java.lang.Boolean r7 = r6.A0A
            goto L_0x00b0
        L_0x0156:
            X.3UH r14 = r6.A03
            if (r35 != 0) goto L_0x00a5
            X.Cvx r12 = r6.A02
            X.4gd r11 = r6.A08
            goto L_0x00a7
        L_0x0160:
            r0 = 445(0x1bd, float:6.24E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "finishLoadingFeed()"
            X.0wb.A03(r1, r0)
            r10 = 0
            goto L_0x00dc
        L_0x016e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228472lj.A03(X.1FS, X.1XM, X.3PG, X.2lj, java.lang.Integer, boolean, boolean, boolean):boolean");
    }

    public final void A04() {
        if (Systrace.A0E(1)) {
            0fS.A01("MainFeedDeliveryController.start", -1117460952);
        }
        try {
            this.A0f.A09(this, false);
            C62670v5.A0B.A03(A00(this));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1825362048);
            }
        }
    }

    public final void A08(DQq dQq, boolean z) {
        Long l;
        C241313Os r1 = C228552lr.A01(this.A0f).A01;
        if (r1 == null) {
            return;
        }
        if (r1 != C241313Os.LOADING || z) {
            C228732mE r3 = this.A0e.A02;
            C228742mF r8 = r3.A02;
            CFN cfn = r8.A01;
            if ((cfn == null || !cfn.A00) && !r8.A03) {
                CHE che = new CHE(dQq, r8);
                long currentTimeMillis = System.currentTimeMillis();
                UserSession userSession = r3.A01;
                0Tu r4 = 0Tu.A05;
                if (((long) r8.A00) > 182.A01(r4, userSession, 36607887459554952L) || ((l = r8.A02) != null && currentTimeMillis - l.longValue() >= TimeUnit.SECONDS.toMillis(182.A01(r4, userSession, 36607887459686025L)))) {
                    1XQ r12 = new 1XQ();
                    r12.A00 = true;
                    che.A00(r12);
                    return;
                }
                r8.A03 = true;
                1NY r5 = new 1NY(userSession, -2);
                r5.A05();
                r5.A0A("feed/new_feed_posts_exist/");
                if (182.A06(r4, userSession, 36326412483049214L)) {
                    r5.A9m("can_source_bumpable_post", "true");
                }
                r5.A0Q(CFN.class, D1U.class);
                1OC A0M2 = r5.A0M();
                A0M2.A00 = che;
                r3.A00.schedule(A0M2);
            }
        }
    }

    public final void A09(Integer num) {
        C228522lo r5 = this.A0i;
        List list = r5.A04;
        C57960IjF ijF = new C57960IjF(this, num, list, r5.A03);
        if (182.A06(0Tu.A05, this.A0Q, 2342156515320268834L)) {
            if (!(!list.isEmpty())) {
                return;
            }
            if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0u) {
                r5.A01 = false;
                this.A0n.A0D();
                this.A0P.postDelayed(ijF, 500);
                return;
            } else if (num != AnonymousClass05K.A15) {
                r5.A01 = false;
            }
        }
        ijF.run();
    }

    public final void onDestroy() {
        C233812wV r0 = this.A0C;
        if (r0 != null) {
            r0.A0B();
        }
    }

    public final void onDestroyView() {
        C233922wh r1 = this.A02;
        if (r1 != null) {
            this.A0n.A0A().A1w.FJ2(r1);
        }
        C249383je r12 = this.A0B;
        if (r12 != null) {
            this.A0n.A0A().A1w.FJ2(r12);
        }
        AnonymousClass3DX r13 = this.A0O;
        if (r13 != null) {
            AnonymousClass3DV.A00(this.A0Q).A01(r13);
        }
    }

    public final void onPause() {
        C233812wV r0 = this.A0C;
        if (r0 != null) {
            r0.A0Z.Dpe();
        }
    }

    public final void onResume() {
        C233002un r0 = this.A09;
        if (r0 != null) {
            r0.A04();
        }
        C233812wV r02 = this.A0C;
        if (r02 != null) {
            r02.A0Z.Dpk();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:329:0x069b, code lost:
        if (r1 != 1) goto L_0x069d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x070b, code lost:
        if (r1 == X.AnonymousClass05K.A01) goto L_0x070d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d0, code lost:
        if (X.AnonymousClass3OE.A00(r7.A00).A00() == false) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x06ae  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass9IV r33, X.AnonymousClass1GU r34, X.1XM r35, int r36, boolean r37) {
        /*
            r32 = this;
            r28 = r37
            r4 = 0
            r30 = r34
            r0 = r30
            X.0qQ.A0B(r0, r4)
            r3 = 1
            r6 = r32
            com.instagram.common.session.UserSession r0 = r6.A0Q
            r29 = r0
            boolean r0 = r29.hasEnded()
            r5 = r35
            if (r0 != 0) goto L_0x002a
            if (r37 == 0) goto L_0x002a
            X.35D r7 = r6.A0H
            if (r7 == 0) goto L_0x002a
            boolean r0 = r5.mFromDiskCache
            java.util.List r1 = r5.A00()
            if (r0 == 0) goto L_0x0149
            r7.A02(r1)
        L_0x002a:
            X.3VK r1 = X.AnonymousClass3VI.A00(r29)
            X.3VL r7 = X.AnonymousClass3VL.FEED
            int r0 = r5.mResponseId
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.util.Map r0 = r1.A00
            java.lang.Object r1 = r0.get(r7)
            X.3VM r1 = (X.AnonymousClass3VM) r1
            if (r1 != 0) goto L_0x0048
            X.3VM r1 = new X.3VM
            r1.<init>(r7)
            r0.put(r7, r1)
        L_0x0048:
            java.lang.String r0 = r1.A03
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x005a
            r1.A03 = r2
            java.util.List r0 = r1.A04
            int r0 = r0.size()
            r1.A00 = r0
        L_0x005a:
            boolean r0 = r29.hasEnded()
            r31 = r33
            if (r0 != 0) goto L_0x069d
            r15 = 0
            r20 = 2
            r18 = r36
            if (r36 != 0) goto L_0x012a
            if (r37 == 0) goto L_0x0071
            java.util.List r0 = r5.A00()
            r6.A0K = r0
        L_0x0071:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327975850883926(0x81101a00003b56, double:3.0372964368918594E-306)
            r7 = r29
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0340
            X.2rI r0 = r6.A06
            if (r0 == 0) goto L_0x0123
            java.util.ArrayList r0 = r0.A06()
        L_0x0088:
            X.2lr r7 = r6.A0f
            android.content.Context r1 = r7.A0G
            com.instagram.common.session.UserSession r10 = r7.A0J
            X.1Ua r13 = X.1UX.A00(r1, r10)
            X.0qQ.A07(r13)
            java.util.List r1 = r5.A00()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            java.util.Iterator r17 = r9.iterator()
            r11 = 0
            r16 = 0
        L_0x00af:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0235
            java.lang.Object r0 = r17.next()
            int r14 = r16 + 1
            if (r16 < 0) goto L_0x0332
            X.1Xg r0 = (X.1Xg) r0
            boolean r1 = X.AnonymousClass3VN.A00(r10, r0)
            if (r1 != 0) goto L_0x00e0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = r0.getId()
            if (r1 == 0) goto L_0x00dd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r8.add(r0)
        L_0x00da:
            r12.add(r1)
        L_0x00dd:
            r16 = r14
            goto L_0x00af
        L_0x00e0:
            boolean r1 = X.AnonymousClass3VP.A04(r0)
            if (r1 == 0) goto L_0x00dd
            X.1Xn r0 = r0.A05
            X.1Xj r1 = X.1Xi.A02(r0)
            if (r1 == 0) goto L_0x00dd
            boolean r0 = r1.A5D()
            if (r0 == 0) goto L_0x011e
            X.1Xy r0 = r1.A0C
            java.lang.String r0 = r0.BOq()
            if (r0 == 0) goto L_0x011e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x011e
            X.1Xy r0 = r1.A0C
            java.lang.String r0 = r0.BOq()
        L_0x0108:
            if (r0 == 0) goto L_0x0117
            boolean r0 = r13.A03(r0)
            if (r0 == 0) goto L_0x0117
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r8.add(r0)
        L_0x0117:
            java.lang.String r1 = r1.getId()
            if (r1 == 0) goto L_0x00dd
            goto L_0x00da
        L_0x011e:
            java.lang.String r0 = r1.getId()
            goto L_0x0108
        L_0x0123:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x0088
        L_0x012a:
            r0 = r18
            if (r0 != r3) goto L_0x0071
            java.util.List r0 = r6.A0K
            if (r0 == 0) goto L_0x0071
            java.util.List r0 = r5.A00()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.List r0 = r6.A0K
            if (r0 == 0) goto L_0x067b
            r1.removeAll(r0)
            r6.A0K = r15
            r5.A01(r1)
            goto L_0x0071
        L_0x0149:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002a
            java.util.Iterator r8 = r1.iterator()
        L_0x0153:
            boolean r0 = r8.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r2 = r8.next()
            r0 = r2
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r0 == 0) goto L_0x0153
        L_0x0169:
            X.1Xg r2 = (X.1Xg) r2
            if (r2 == 0) goto L_0x002a
            X.1Xn r0 = r2.A05
            X.1Xj r2 = X.1Xi.A02(r0)
            if (r2 == 0) goto L_0x002a
            r8 = r2
            r9 = r2
            int r0 = r2.A0w()
            X.1Xj r0 = r2.A1c(r0)
            if (r0 == 0) goto L_0x0182
            r8 = r0
        L_0x0182:
            java.util.Map r10 = r7.A05
            java.lang.String r0 = r8.A30()
            java.lang.String r11 = "Required value was null."
            if (r0 == 0) goto L_0x09bd
            java.lang.Object r12 = r10.get(r0)
            java.util.List r12 = (java.util.List) r12
            java.lang.String r0 = "network"
            if (r12 != 0) goto L_0x01f2
            java.lang.String r1 = r8.A30()
            if (r1 == 0) goto L_0x09b7
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.ArrayList r0 = X.0sr.A1M(r0)
            java.util.List r0 = java.util.Collections.synchronizedList(r0)
            X.0qQ.A07(r0)
            r10.put(r1, r0)
            int r0 = r2.A0w()
            X.1Xj r0 = r2.A1c(r0)
            if (r0 == 0) goto L_0x01b9
            r9 = r0
        L_0x01b9:
            boolean r0 = r9.A50()
            if (r0 == 0) goto L_0x01d2
            boolean r0 = r9.A5h()
            if (r0 != 0) goto L_0x01d2
            com.instagram.common.session.UserSession r0 = r7.A00
            X.3OF r0 = X.AnonymousClass3OE.A00(r0)
            boolean r1 = r0.A00()
            r0 = 1
            if (r1 != 0) goto L_0x01d3
        L_0x01d2:
            r0 = 0
        L_0x01d3:
            X.AnonymousClass35D.A01(r2, r9, r7, r0)
            if (r0 == 0) goto L_0x01e6
            X.2xS r1 = r7.A01
            X.4WS r0 = new X.4WS
            r0.<init>(r7)
            r1.A0B(r9, r0)
            goto L_0x002a
        L_0x01e4:
            r2 = 0
            goto L_0x0169
        L_0x01e6:
            X.30x r1 = r7.A03
            X.3VH r0 = new X.3VH
            r0.<init>(r9, r7)
            r1.A03(r9, r0)
            goto L_0x002a
        L_0x01f2:
            r12.add(r0)
            boolean r0 = r8.A50()
            if (r0 == 0) goto L_0x0233
            boolean r0 = r8.A5h()
            if (r0 != 0) goto L_0x0233
            com.instagram.common.session.UserSession r0 = r7.A00
            X.3OF r0 = X.AnonymousClass3OE.A00(r0)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0233
        L_0x020d:
            X.AnonymousClass35D.A01(r2, r8, r7, r1)
            X.2l3 r2 = r7.A02
            java.lang.String r1 = "are_network_and_cache_first_media_same"
            X.0rq r0 = r2.A00
            X.18g.A06(r0, r1, r3)
            r2.A02 = r3
            java.util.Map r1 = r7.A04
            java.lang.String r0 = r8.A30()
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x002a
            boolean r1 = r0.booleanValue()
            r0 = 0
            r2.A04(r0, r0, r0, r1)
            goto L_0x002a
        L_0x0233:
            r1 = 0
            goto L_0x020d
        L_0x0235:
            int r26 = r8.size()
            if (r26 <= 0) goto L_0x0340
            X.2lx r7 = r7.A0P
            r0 = 36592580196369016(0x8200c200050278, double:3.2046332904528083E-306)
            long r0 = X.182.A01(r2, r10, r0)
            int r13 = (int) r0
            X.46L r17 = new X.46L
            r0 = r17
            r0.<init>(r13, r4)
            X.1UQ r1 = X.1UQ.A0Y
            X.WMn r16 = new X.WMn
            r0 = r16
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r0 = r7.A02
            monitor-enter(r0)
            java.util.Iterator r14 = r12.iterator()     // Catch:{ all -> 0x033a }
        L_0x0263:
            boolean r12 = r14.hasNext()     // Catch:{ all -> 0x033a }
            if (r12 == 0) goto L_0x027a
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x033a }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x033a }
            java.util.Map r12 = r7.A04     // Catch:{ all -> 0x033a }
            r12.remove(r13)     // Catch:{ all -> 0x033a }
            java.util.Map r12 = r7.A03     // Catch:{ all -> 0x033a }
            r12.remove(r13)     // Catch:{ all -> 0x033a }
            goto L_0x0263
        L_0x027a:
            java.util.Map r14 = r7.A04     // Catch:{ all -> 0x033a }
            java.util.Collection r12 = r14.values()     // Catch:{ all -> 0x033a }
            r1.addAll(r12)     // Catch:{ all -> 0x033a }
            java.util.Map r12 = r7.A03     // Catch:{ all -> 0x033a }
            java.util.Collection r13 = r12.values()     // Catch:{ all -> 0x033a }
            r1.addAll(r13)     // Catch:{ all -> 0x033a }
            monitor-exit(r0)
            java.util.HashSet r25 = new java.util.HashSet
            r25.<init>()
            r22 = r7
            r23 = r17
            r24 = r1
            r27 = r4
            r21 = r16
            java.util.ArrayList r13 = X.C228612lx.A00(r21, r22, r23, r24, r25, r26, r27)
            monitor-enter(r0)
            java.util.Iterator r7 = r13.iterator()     // Catch:{ all -> 0x033a }
        L_0x02a5:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x033a }
            if (r1 == 0) goto L_0x02ba
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x033a }
            X.1Xg r1 = (X.1Xg) r1     // Catch:{ all -> 0x033a }
            java.lang.String r1 = r1.A09     // Catch:{ all -> 0x033a }
            r14.remove(r1)     // Catch:{ all -> 0x033a }
            r12.remove(r1)     // Catch:{ all -> 0x033a }
            goto L_0x02a5
        L_0x02ba:
            monitor-exit(r0)
            java.util.Iterator r19 = r13.iterator()
        L_0x02bf:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x033d
            java.lang.Object r7 = r19.next()
            int r14 = r11 + 1
            if (r11 < 0) goto L_0x0332
            java.lang.Object r0 = r8.get(r11)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r9.get(r1)
            X.1Xg r0 = (X.1Xg) r0
            r9.set(r1, r7)
            X.1Xn r0 = r0.A05
            X.1Xj r11 = X.1Xi.A02(r0)
            if (r11 == 0) goto L_0x032d
            X.0uX r13 = X.0uX.A00(r10)
            monitor-enter(r13)
            java.lang.String r7 = r11.getId()     // Catch:{ all -> 0x032f }
            r7.getClass()     // Catch:{ all -> 0x032f }
            com.instagram.user.model.User r0 = r11.A2A(r10)     // Catch:{ all -> 0x032f }
            r0.getClass()     // Catch:{ all -> 0x032f }
            java.lang.String r1 = r0.getId()     // Catch:{ all -> 0x032f }
            com.instagram.model.mediatype.ProductType r0 = r11.A1v()     // Catch:{ all -> 0x032f }
            r0.getClass()     // Catch:{ all -> 0x032f }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x032f }
            X.0tj r12 = new X.0tj     // Catch:{ all -> 0x032f }
            r12.<init>(r7, r1, r0)     // Catch:{ all -> 0x032f }
            X.0JR r0 = X.C62510tr.A00()     // Catch:{ all -> 0x032f }
            long r0 = r0.now()     // Catch:{ all -> 0x032f }
            X.0tt r11 = r12.A02     // Catch:{ all -> 0x032f }
            r7 = 1065353216(0x3f800000, float:1.0)
            r11.A02(r7, r0)     // Catch:{ all -> 0x032f }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r16
            r7 = 0
            r11.A02(r7, r0)     // Catch:{ all -> 0x032f }
            r11.A03(r0)     // Catch:{ all -> 0x032f }
            r12.A07 = r3     // Catch:{ all -> 0x032f }
            r13.A05(r12)     // Catch:{ all -> 0x032f }
            monitor-exit(r13)
        L_0x032d:
            r11 = r14
            goto L_0x02bf
        L_0x032f:
            r1 = move-exception
            monitor-exit(r13)
            throw r1
        L_0x0332:
            X.0sr.A1T()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x033a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x033d:
            r5.A01(r9)
        L_0x0340:
            java.util.List r0 = r5.A00()
            java.util.Iterator r8 = r0.iterator()
        L_0x0348:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03bb
            java.lang.Object r7 = r8.next()
            r0 = r7
            X.1Xg r0 = (X.1Xg) r0
            X.1UQ r1 = r0.A06
            X.1UQ r0 = X.1UQ.A0c
            if (r1 != r0) goto L_0x0348
        L_0x035b:
            X.1Xg r7 = (X.1Xg) r7
            if (r7 == 0) goto L_0x0444
            com.instagram.direct.inbox.notes.NotesRepository r14 = X.AnonymousClass43C.A00(r29)
            X.1Xn r1 = r7.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.notes.model.NotesNetegoItem"
            X.0qQ.A0C(r1, r0)
            X.DHK r1 = (X.DHK) r1
            X.0qQ.A0C(r1, r0)
            X.0qQ.A0B(r1, r4)
            X.BBM r0 = r1.A00
            X.9J1 r1 = r0.A00
            if (r1 == 0) goto L_0x0444
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r1.A02
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r9 = r0.iterator()
        L_0x0384:
            boolean r0 = r9.hasNext()
            java.lang.String r13 = ""
            r17 = 0
            if (r0 == 0) goto L_0x03bd
            java.lang.Object r7 = r9.next()
            X.4zZ r7 = (X.C279864zZ) r7
            int r8 = r7.A01
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT
            int r0 = r0.A00
            if (r8 != r0) goto L_0x03a5
            java.lang.String r0 = r7.A0H
        L_0x039e:
            r13 = r0
        L_0x039f:
            java.util.HashMap r0 = r14.A0I
            r0.put(r13, r7)
            goto L_0x0384
        L_0x03a5:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.PROMPT_QUESTION
            int r0 = r0.A00
            if (r8 != r0) goto L_0x03b8
            X.5y2 r0 = r7.A0A
            if (r0 == 0) goto L_0x039f
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x039f
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x039e
            goto L_0x039f
        L_0x03b8:
            java.lang.String r0 = r7.A0K
            goto L_0x039e
        L_0x03bb:
            r7 = r15
            goto L_0x035b
        L_0x03bd:
            X.05G r12 = r14.A0Z
            java.lang.Object r0 = r12.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r11 = X.0Yt.A03(r0)
            if (r1 == 0) goto L_0x042f
            java.util.Iterator r16 = r1.iterator()
        L_0x03cf:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x042f
            java.lang.Object r10 = r16.next()
            X.Jw0 r10 = (X.C61062Jw0) r10
            java.lang.String r9 = r10.A04
            java.lang.Object r8 = r10.A01
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r7 = r8.iterator()
        L_0x03e5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x042c
            java.lang.Object r1 = r7.next()
            r0 = r1
            X.4zZ r0 = (X.C279864zZ) r0
            X.5y2 r0 = r0.A0A
            if (r0 == 0) goto L_0x03e5
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x03e5
        L_0x03fa:
            X.4zZ r1 = (X.C279864zZ) r1
            if (r1 == 0) goto L_0x040a
            X.5y2 r0 = r1.A0A
            if (r0 == 0) goto L_0x040a
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x040a
            java.lang.String r7 = r0.A03
            if (r7 != 0) goto L_0x040b
        L_0x040a:
            r7 = r13
        L_0x040b:
            java.lang.Object r1 = r10.A00
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r0 = r10.A03
            r19 = r0
            java.lang.String r10 = r10.A02
            X.4zc r0 = new X.4zc
            r23 = r9
            r24 = r7
            r25 = r19
            r26 = r10
            r27 = r8
            r21 = r0
            r22 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r11.put(r9, r0)
            goto L_0x03cf
        L_0x042c:
            r1 = r17
            goto L_0x03fa
        L_0x042f:
            r12.Epw(r11)
            X.05G r1 = r14.A0X
            java.util.HashMap r0 = r14.A0I
            java.util.Collection r0 = r0.values()
            X.0qQ.A07(r0)
            java.util.List r0 = X.00k.A0a(r0)
            r1.Epw(r0)
        L_0x0444:
            boolean r0 = r6.A0N
            if (r0 != 0) goto L_0x0460
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0460
            r6.A0N = r0
            r0 = 36326403892852476(0x810eac000036fc, double:3.0363023243030035E-306)
            r7 = r29
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0460
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            X.AnonymousClass2yJ.A00(r0)
        L_0x0460:
            X.2ll r1 = r6.A0b
            r0 = r30
            X.1FS r0 = r0.A00
            r19 = r0
            r0 = r31
            java.lang.Object r11 = r0.A01
            X.3PG r11 = (X.AnonymousClass3PG) r11
            r0 = r19
            r1.A0A(r0, r5, r11)
            X.2vV r0 = r6.A04
            if (r0 == 0) goto L_0x0691
            boolean r0 = X.C233312vV.A00(r19)
            if (r0 != r3) goto L_0x0691
            X.2vV r1 = r6.A04
            if (r1 == 0) goto L_0x0691
            X.2ln r9 = r6.A0W
            java.util.List r8 = r5.A00()
            r7 = 10
            int r0 = X.0Yv.A1E(r8, r7)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x0496:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04ac
            java.lang.Object r0 = r8.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            r13.add(r0)
            goto L_0x0496
        L_0x04ac:
            java.util.List r12 = r1.A08
            int r10 = r1.A00
            java.util.List r8 = r1.A07
            if (r8 == 0) goto L_0x04d7
            int r0 = X.0Yv.A1E(r8, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x04c1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x04d8
            java.lang.Object r0 = r8.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            r1.add(r0)
            goto L_0x04c1
        L_0x04d7:
            r1 = r15
        L_0x04d8:
            X.2rI r0 = r6.A06
            if (r0 == 0) goto L_0x0503
            java.util.List r8 = r0.A07()
            int r0 = X.0Yv.A1E(r8, r7)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x04ed:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0503
            java.lang.Object r0 = r8.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            r15.add(r0)
            goto L_0x04ed
        L_0x0503:
            r8 = 976041859(0x3a2d3783, float:6.607698E-4)
            X.02m r0 = r9.A00
            com.facebook.quicklog.MarkerEditor r8 = r0.withMarker(r8)
            r0 = 1611(0x64b, float:2.257E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.facebook.quicklog.PointEditor r17 = r8.pointEditor(r0)
            java.lang.String r14 = "refreshed_item_ids"
            int r0 = X.0Yv.A1E(r13, r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r16 = r13.iterator()
        L_0x0525:
            boolean r0 = r16.hasNext()
            r9 = 0
            if (r0 == 0) goto L_0x053c
            java.lang.Object r0 = r16.next()
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0538
            java.lang.String r9 = r0.getId()
        L_0x0538:
            r8.add(r9)
            goto L_0x0525
        L_0x053c:
            java.lang.String r8 = r8.toString()
            r0 = r17
            com.facebook.quicklog.PointEditor r14 = r0.addPointData(r14, r8)
            java.lang.String r8 = "unseen_media_ids"
            if (r12 == 0) goto L_0x056f
            int r0 = X.0Yv.A1E(r12, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            java.util.Iterator r16 = r12.iterator()
        L_0x0557:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0570
            java.lang.Object r0 = r16.next()
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x056d
            java.lang.String r0 = r0.getId()
        L_0x0569:
            r7.add(r0)
            goto L_0x0557
        L_0x056d:
            r0 = r9
            goto L_0x0569
        L_0x056f:
            r7 = r9
        L_0x0570:
            java.lang.String r0 = java.lang.String.valueOf(r7)
            com.facebook.quicklog.PointEditor r14 = r14.addPointData(r8, r0)
            java.lang.String r8 = "items_changed_after_seen_index"
            if (r1 == 0) goto L_0x05dc
            int r7 = r1.size()
            if (r10 < 0) goto L_0x05dc
            int r0 = r1.size()
            if (r7 > r0) goto L_0x05dc
            java.util.List r0 = r1.subList(r10, r7)
            if (r0 == 0) goto L_0x05dc
            java.util.List r7 = X.00k.A0X(r0)
        L_0x0592:
            if (r15 == 0) goto L_0x05aa
            int r1 = r15.size()
            if (r10 < 0) goto L_0x05aa
            int r0 = r15.size()
            if (r1 > r0) goto L_0x05aa
            java.util.List r0 = r15.subList(r10, r1)
            if (r0 == 0) goto L_0x05aa
            java.util.List r9 = X.00k.A0X(r0)
        L_0x05aa:
            boolean r0 = X.0qQ.A0K(r7, r9)
            r0 = r0 ^ 1
            com.facebook.quicklog.PointEditor r7 = r14.addPointData(r8, r0)
            X.0qQ.A0A(r7)
            r1 = 1
            if (r12 == 0) goto L_0x05de
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r12.iterator()
        L_0x05c3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x05e0
            java.lang.Object r8 = r10.next()
            r0 = r8
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x05c3
            boolean r0 = r0.CcK()
            if (r0 != 0) goto L_0x05c3
            r9.add(r8)
            goto L_0x05c3
        L_0x05dc:
            r7 = r9
            goto L_0x0592
        L_0x05de:
            X.0sn r9 = X.0sn.A00
        L_0x05e0:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r13.iterator()
        L_0x05e9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0602
            java.lang.Object r8 = r12.next()
            r0 = r8
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x05e9
            boolean r0 = r0.CcK()
            if (r0 != 0) goto L_0x05e9
            r10.add(r8)
            goto L_0x05e9
        L_0x0602:
            int r8 = r10.size()
            int r0 = r9.size()
            r15 = 0
            if (r8 >= r0) goto L_0x0644
            java.util.Iterator r14 = r10.iterator()
            r13 = 0
            r8 = 0
        L_0x0613:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0683
            java.lang.Object r0 = r14.next()
            int r12 = r13 + 1
            if (r13 < 0) goto L_0x09ab
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0642
            java.lang.String r10 = r0.getId()
        L_0x0629:
            java.lang.Object r0 = r9.get(r13)
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0640
            java.lang.String r0 = r0.getId()
        L_0x0635:
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 != 0) goto L_0x063e
            int r8 = r8 + 1
            r1 = 0
        L_0x063e:
            r13 = r12
            goto L_0x0613
        L_0x0640:
            r0 = r15
            goto L_0x0635
        L_0x0642:
            r10 = r15
            goto L_0x0629
        L_0x0644:
            java.util.Iterator r14 = r9.iterator()
            r13 = 0
            r8 = 0
        L_0x064a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0683
            java.lang.Object r0 = r14.next()
            int r12 = r13 + 1
            if (r13 < 0) goto L_0x09ab
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0679
            java.lang.String r9 = r0.getId()
        L_0x0660:
            java.lang.Object r0 = r10.get(r13)
            X.1Xj r0 = (X.1Xj) r0
            if (r0 == 0) goto L_0x0677
            java.lang.String r0 = r0.getId()
        L_0x066c:
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 != 0) goto L_0x0675
            int r8 = r8 + 1
            r1 = 0
        L_0x0675:
            r13 = r12
            goto L_0x064a
        L_0x0677:
            r0 = r15
            goto L_0x066c
        L_0x0679:
            r9 = r15
            goto L_0x0660
        L_0x067b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0683:
            java.lang.String r0 = "is_same_organic_items"
            com.facebook.quicklog.PointEditor r1 = r7.addPointData(r0, r1)
            java.lang.String r0 = "organic_items_mismatch_number"
            r1.addPointData(r0, r8)
            r7.markerEditingCompleted()
        L_0x0691:
            int r1 = r11.ordinal()
            r0 = r20
            if (r1 == r0) goto L_0x085d
            if (r1 == r4) goto L_0x0824
            if (r1 == r3) goto L_0x085d
        L_0x069d:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
        L_0x069f:
            r10 = 0
            r6.A0L = r10
            r0 = r31
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x06f4
            if (r0 != r3) goto L_0x06f3
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x06f3
            X.2lr r4 = r6.A0f
            com.instagram.common.session.UserSession r3 = r4.A0J
            r1 = -1
            X.3Yt r0 = new X.3Yt
            r0.<init>(r3, r1)
            r4.A07 = r0
            X.3Do r2 = X.C228552lr.A01(r4)
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x06d3
            r2.A03 = r1
            r0 = 0
            if (r1 == 0) goto L_0x06d1
            r0 = 1
        L_0x06d1:
            r2.A04 = r0
        L_0x06d3:
            boolean r0 = X.C228552lr.A04(r5, r4)
            if (r0 == 0) goto L_0x06f3
            boolean r0 = r4.A0b
            if (r0 != 0) goto L_0x09a1
            X.1UN r0 = r4.A0R
            X.0eM r0 = r0.A06
            java.lang.Object r2 = r0.getValue()
            X.1Uy r2 = (X.1Uy) r2
            com.instagram.mainfeed.network.FeedCacheCoordinator r2 = (com.instagram.mainfeed.network.FeedCacheCoordinator) r2
            X.1Hb r1 = X.AnonymousClass1HI.A02
            X.4dz r0 = new X.4dz
            r0.<init>(r2)
            r1.Eym(r0)
        L_0x06f3:
            return
        L_0x06f4:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            if (r1 == r8) goto L_0x0703
            X.2ll r7 = r6.A0b
            r0 = r30
            X.1FS r2 = r0.A00
            java.lang.String r0 = "No new items delivered"
            r7.A0C(r2, r0)
        L_0x0703:
            X.0qQ.A0B(r1, r4)
            if (r1 == r8) goto L_0x070d
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r0 = 0
            if (r1 != r2) goto L_0x070e
        L_0x070d:
            r0 = 1
        L_0x070e:
            r2 = 0
            if (r0 == 0) goto L_0x0810
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x071b
            r28 = 0
            if (r37 != 0) goto L_0x071b
            r28 = 1
        L_0x071b:
            X.2lr r9 = r6.A0f
            long r0 = java.lang.System.currentTimeMillis()
            if (r28 == 0) goto L_0x0808
            com.instagram.common.session.UserSession r7 = r9.A0J
            X.3Yt r4 = new X.3Yt
            r4.<init>(r7, r0)
            r9.A07 = r4
        L_0x072c:
            X.2ls r4 = r9.A0S
            long r7 = r5.A00
            if (r28 == 0) goto L_0x0805
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0736:
            r4.A00 = r7
            if (r0 == 0) goto L_0x073c
            r4.A01 = r0
        L_0x073c:
            X.4ZJ r1 = r5.A01
            if (r1 == 0) goto L_0x07ff
            boolean r0 = r1.A02
            if (r0 != r3) goto L_0x07ff
            java.lang.String r0 = r1.A01
            r9.A0C = r0
            java.lang.String r0 = r1.A00
            r9.A0B = r0
            r0 = r30
            boolean r0 = r0 instanceof X.AnonymousClass1GS
            if (r0 != 0) goto L_0x0755
            X.C228552lr.A03(r9)
        L_0x0755:
            r0 = r30
            X.1FS r3 = r0.A00
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x07fc
            java.util.Map r1 = r3.A0D
            java.lang.String r0 = "cached_feed_item_ids"
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x07fc
            X.1FI r1 = r3.A04
            X.1FI r0 = X.1FI.A0G
            int r3 = r6.A00
            if (r1 != r0) goto L_0x0773
            int r3 = r3 + 1
        L_0x0773:
            r6.A00 = r3
        L_0x0775:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36321468976670107(0x810a2f0013259b, double:3.033181463437961E-306)
            r0 = r29
            boolean r0 = X.182.A06(r7, r0, r3)
            if (r0 == 0) goto L_0x06f3
            X.1Xe r5 = r5.A06
            if (r5 == 0) goto L_0x06f3
            java.lang.Boolean r1 = r5.A00
            if (r1 == 0) goto L_0x07b1
            boolean r8 = r1.booleanValue()
            X.1PG r0 = r6.A0k
            X.1PO r4 = r0.A01
            r4.A02 = r1
            com.instagram.common.session.UserSession r3 = r4.A03
            r0 = 36321468976866718(0x810a2f0016259e, double:3.0331814635622985E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x07b1
            X.0xa r0 = r4.A04
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "peak_throttling_check_result"
            r1.E5T(r0, r8)
            r1.apply()
        L_0x07b1:
            r3 = 36321468976801181(0x810a2f0015259d, double:3.0331814635208526E-306)
            r0 = r29
            boolean r0 = X.182.A06(r7, r0, r3)
            if (r0 == 0) goto L_0x06f3
            java.lang.Integer r0 = r5.A02
            if (r0 == 0) goto L_0x07fa
            int r1 = r0.intValue()
        L_0x07c6:
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L_0x07ce
            int r2 = r0.intValue()
        L_0x07ce:
            X.1PG r0 = r6.A0k
            X.1PO r5 = r0.A01
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = r1 * 1000
            long r0 = (long) r0
            long r0 = r0 + r3
            r5.A01 = r0
            int r0 = r2 * 1000
            long r0 = (long) r0
            long r3 = r3 + r0
            r5.A00 = r3
            X.0xa r0 = r5.A04
            X.0xY r3 = r0.AR4()
            long r1 = r5.A01
            java.lang.String r0 = "real_time_peak_epoch_start_time_millis"
            r3.E5c(r0, r1)
            long r1 = r5.A00
            java.lang.String r0 = "real_time_peak_epoch_end_time_millis"
            r3.E5c(r0, r1)
            r3.apply()
            return
        L_0x07fa:
            r1 = 0
            goto L_0x07c6
        L_0x07fc:
            r3 = 0
            goto L_0x0773
        L_0x07ff:
            r9.A0C = r10
            r9.A0B = r10
            goto L_0x0755
        L_0x0805:
            r0 = 0
            goto L_0x0736
        L_0x0808:
            X.3Yt r4 = r9.A07
            if (r4 == 0) goto L_0x072c
            r4.A00 = r0
            goto L_0x072c
        L_0x0810:
            r0 = r30
            X.1FS r0 = r0.A00
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x0775
            X.2lr r0 = r6.A0f
            X.3Do r0 = X.C228552lr.A01(r0)
            r0.A03 = r1
            r0.A04 = r3
            goto L_0x0775
        L_0x0824:
            r0 = 36323839797440060(0x810c5700012e3c, double:3.034680780039408E-306)
            r7 = r29
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x084d
            if (r37 == 0) goto L_0x084d
            X.1Av r1 = X.1Au.A00(r29)
            r0 = r19
            X.1FI r0 = r0.A04
            java.lang.String r2 = r0.name()
            X.0xa r0 = r1.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "last_feed_head_load_fetch_reason"
            r1.E5g(r0, r2)
            r1.apply()
        L_0x084d:
            X.3PG r26 = X.AnonymousClass3PG.NETWORK
            r23 = r6
            r24 = r30
            r25 = r5
            r27 = r18
            java.lang.Integer r1 = r23.A01(r24, r25, r26, r27, r28)
            goto L_0x069f
        L_0x085d:
            if (r37 == 0) goto L_0x0985
            java.util.List r0 = r5.A00()
            boolean r0 = r0.isEmpty()
            X.2l3 r8 = r6.A0Z
            X.1Gs r9 = r8.A0H
            if (r0 == 0) goto L_0x088d
            java.lang.String r7 = "empty"
            X.0qQ.A0B(r7, r4)
            X.1H4 r2 = r9.A01
            X.1Gq r1 = r2.A01
            java.lang.String r0 = "CACHED_FEED_FAILED"
            r1.A03(r0, r7)
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r2.A00()
            X.1Gx r0 = X.1Gx.A03
        L_0x0881:
            r1.A00(r0)
            java.lang.String r1 = "feed_cache_fail_reason"
            X.0rq r0 = r8.A00
            X.18g.A05(r0, r1, r7)
            goto L_0x069d
        L_0x088d:
            r9.A06()
            r0 = r31
            java.lang.Object r7 = r0.A01
            X.3PG r7 = (X.AnonymousClass3PG) r7
            X.2wf r0 = r6.A0F
            if (r0 != 0) goto L_0x08a5
            r0 = 445(0x1bd, float:6.24E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "showCachedContent()"
            X.0wb.A03(r1, r0)
        L_0x08a5:
            X.2wf r0 = r6.A0F
            if (r0 == 0) goto L_0x0972
            X.3PG r0 = r6.A08
            if (r0 != 0) goto L_0x0972
            java.lang.String r0 = "FEED_LOAD_FROM_DISK_FINISHED"
            X.AnonymousClass2l3.A02(r8, r0)
            X.1H4 r0 = r9.A01
            X.1H7 r8 = r0.A00
            X.1Gq r1 = r8.A01
            java.lang.String r0 = "CACHED_FEED_UI_RENDER_START"
            r1.A02(r0)
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r8.A00()
            X.1Gx r0 = X.1Gx.A07
            r1.A00(r0)
            X.35D r1 = r6.A0H
            if (r1 == 0) goto L_0x08d1
            java.util.List r0 = r5.A00()
            r1.A02(r0)
        L_0x08d1:
            X.2lG r1 = r6.A0a
            java.lang.String r0 = "CACHE_LOADED"
            r1.A02(r0)
            r12 = 0
            r8 = r19
            r9 = r5
            r10 = r7
            r11 = r6
            r13 = r3
            r14 = r3
            r15 = r4
            boolean r0 = A03(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0932
            X.2lr r7 = r6.A0f
            X.3Do r0 = X.C228552lr.A01(r7)
            X.3Os r1 = r0.A01
            X.3Os r0 = X.C241313Os.LOADING
            if (r1 == r0) goto L_0x08fb
            X.3Do r0 = X.C228552lr.A01(r7)
            X.3Os r0 = r0.A01
            if (r0 != 0) goto L_0x0932
        L_0x08fb:
            X.3Bd r11 = X.C238243Bc.A00(r29)
            com.instagram.common.session.UserSession r7 = r11.A02
            r0 = 36317620686951808(0x8106af00221580, double:3.03074778952429E-306)
            boolean r12 = X.182.A06(r2, r7, r0)
            r0 = 36599095663988131(0x8206af00270da3, double:3.208753698410819E-306)
            long r9 = X.182.A01(r2, r7, r0)
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x096f
            if (r12 == 0) goto L_0x0932
            long r0 = r11.A00
            long r8 = java.lang.System.currentTimeMillis()
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0932
        L_0x0925:
            X.2jw r0 = r6.A0n
            X.2kj r0 = r0.A0A()
            X.3Ay r0 = r0.A0w()
            r0.A03(r4)
        L_0x0932:
            X.2rI r9 = r6.A06
            if (r9 == 0) goto L_0x0953
            X.2lp r8 = r6.A0d
            X.2jx r1 = r8.A00
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0953
            X.3Ar r0 = r1.getScrollingViewProxy()
            android.view.ViewGroup r7 = r0.CEd()
            X.JTo r1 = new X.JTo
            r1.<init>(r9, r8)
            X.JTp r0 = new X.JTp
            r0.<init>(r9, r8)
            X.0nA.A0o(r7, r0, r1)
        L_0x0953:
            r0 = 36317620684920174(0x8106af0003156e, double:3.030747788239476E-306)
            r7 = r29
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0965
            X.2jw r0 = r6.A0n
            r0.A0V(r4, r3)
        L_0x0965:
            long r0 = java.lang.System.currentTimeMillis()
            r6.A01 = r0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x069f
        L_0x096f:
            if (r12 == 0) goto L_0x0932
            goto L_0x0925
        L_0x0972:
            java.lang.String r7 = "dropped"
            X.1H4 r2 = r9.A01
            X.1Gq r1 = r2.A01
            java.lang.String r0 = "CACHED_FEED_DROPPED"
            r1.A03(r0, r7)
            com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow r1 = r2.A00()
            X.1Gx r0 = X.1Gx.A06
            goto L_0x0881
        L_0x0985:
            r0 = 36330651615576791(0x811289000142d7, double:3.038988601258067E-306)
            r7 = r29
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x0994
            X.3PG r11 = X.AnonymousClass3PG.NETWORK
        L_0x0994:
            r7 = r30
            r8 = r5
            r9 = r11
            r10 = r18
            r11 = r4
            java.lang.Integer r1 = r6.A01(r7, r8, r9, r10, r11)
            goto L_0x069f
        L_0x09a1:
            com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource r0 = r4.A06
            if (r0 != 0) goto L_0x09b3
            java.lang.String r0 = "mainFeedLocalDataSource"
            X.0qQ.A0F(r0)
            goto L_0x09ae
        L_0x09ab:
            X.0sr.A1T()
        L_0x09ae:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09b3:
            r0.A06()
            return
        L_0x09b7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L_0x09bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228472lj.A07(X.9IV, X.1GU, X.1XM, int, boolean):void");
    }
}
