package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.4md  reason: invalid class name and case insensitive filesystem */
public final class C273474md extends AnonymousClass4DH implements AnonymousClass0j6, C240423Kv {
    public static final String __redex_internal_original_name = "DirectThreadFragment";
    public AnonymousClass7TI A00;
    public AnonymousClass9HS A01;
    public final AnonymousClass7TD A02 = new AnonymousClass7TD(this);
    public final AnonymousClass4DU A03 = C227942kP.A01("direct_thread", true, false);
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void onConfigurationChanged(Configuration configuration) {
        String str;
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass7TI r2 = this.A00;
        if (r2 == null) {
            str = "threadController";
        } else {
            AnonymousClass4DH r1 = r2.A0U;
            if (r1.isAdded()) {
                Configuration configuration2 = r1.requireContext().getResources().getConfiguration();
                0qQ.A07(configuration2);
                if (O3Z.A00(configuration2, configuration)) {
                    C274644oo r0 = r2.A0A;
                    if (r0 == null) {
                        str = "messageListAdapterHolder";
                    } else {
                        r0.AZJ().notifyDataSetChanged();
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        AnonymousClass7TI r3 = this.A00;
        if (r3 == null) {
            str = "threadController";
        } else {
            C332157Tw r2 = r3.A0j;
            AnonymousClass36V r0 = r2.A0E.A00;
            if (r0 != null) {
                r0.onSaveInstanceState(bundle);
                String str2 = r3.A0H;
                if (str2 == null) {
                    str = "threadViewerSessionId";
                } else {
                    bundle.putString("DirectThreadFragment.ARGUMENT_VIEWER_SESSION_ID", str2);
                    String str3 = r3.A0G;
                    if (str3 == null) {
                        str = "expiringMessageReplaySessionId";
                    } else {
                        bundle.putString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID", str3);
                        C333517Zg r02 = r3.A08;
                        if (r02 == null) {
                            str = "clientInfra";
                        } else {
                            bundle.putBoolean("DirectThreadFragment.ARGUMENT_SHOW_PERMISSIONS", r02.C6l().EtG());
                            Capabilities capabilities = r3.A06;
                            if (capabilities == null) {
                                str = "_capabilities";
                            } else {
                                bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
                                OKL okl = r2.A01;
                                if (okl != null) {
                                    bundle.putBoolean(C66579MXk.A00(229), okl.A00);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            } else {
                str = "captureFlowHelper";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        if (r3.A0N == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b1, code lost:
        if (((java.lang.Boolean) r1.A0K.getValue()).booleanValue() == false) goto L_0x01b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r4 = 0
            r5 = r26
            X.0qQ.A0B(r5, r4)
            r1 = r25
            X.9HS r0 = r1.A01
            r9 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "navigationPerfLogger"
        L_0x000f:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0017:
            X.34p r0 = r0.A06
            if (r0 == 0) goto L_0x0406
            r0.A08(r9)
            r13 = r27
            super.onViewCreated(r5, r13)
            X.7TI r3 = r1.A00
            if (r3 != 0) goto L_0x002a
            java.lang.String r0 = "threadController"
            goto L_0x000f
        L_0x002a:
            java.lang.String r1 = "DirectThreadController.onViewCreated"
            r0 = 764990748(0x2d98d51c, float:1.7375039E-11)
            X.0fh.A01(r1, r0)
            X.7Tw r6 = r3.A0j     // Catch:{ all -> 0x03fe }
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x03fe }
            X.2xe r0 = new X.2xe     // Catch:{ all -> 0x03fe }
            r0.<init>(r1)     // Catch:{ all -> 0x03fe }
            r6.A08 = r0     // Catch:{ all -> 0x03fe }
            X.4DH r14 = r3.A0U     // Catch:{ all -> 0x03fe }
            android.os.Bundle r1 = r14.requireArguments()     // Catch:{ all -> 0x03fe }
            r0 = 2234(0x8ba, float:3.13E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x03fe }
            float r12 = r1.getFloat(r0)     // Catch:{ all -> 0x03fe }
            android.os.Bundle r1 = r14.requireArguments()     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = "DirectThreadFragment.ARGUMENT_COMPOSER_HEIGHT"
            int r11 = r1.getInt(r0)     // Catch:{ all -> 0x03fe }
            r0 = 2131436216(0x7f0b22b8, float:1.8494296E38)
            android.view.View r2 = r5.requireViewById(r0)     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2     // Catch:{ all -> 0x03fe }
            r3.A04 = r2     // Catch:{ all -> 0x03fe }
            X.7Mt r0 = r3.A07     // Catch:{ all -> 0x03fe }
            java.lang.String r18 = "messageRecyclerView"
            if (r0 == 0) goto L_0x006c
            if (r2 == 0) goto L_0x03e6
            r0.A01 = r2     // Catch:{ all -> 0x03fe }
        L_0x006c:
            X.7Zg r1 = r3.A08     // Catch:{ all -> 0x03fe }
            java.lang.String r17 = "clientInfra"
            if (r1 == 0) goto L_0x03ee
            boolean r0 = r1 instanceof X.C333507Zf     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x0091
            X.7Zf r1 = (X.C333507Zf) r1     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x0091
            X.7ZX r0 = r1.A03     // Catch:{ all -> 0x03fe }
            if (r2 == 0) goto L_0x03e6
            X.0mm r1 = r0.A01     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = "sortedListCallback"
            if (r1 != 0) goto L_0x0089
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x03fe }
            goto L_0x03f1
        L_0x0089:
            boolean r0 = r1 instanceof X.AnonymousClass7LM     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x0091
            X.7LM r1 = (X.AnonymousClass7LM) r1     // Catch:{ all -> 0x03fe }
            r1.A00 = r2     // Catch:{ all -> 0x03fe }
        L_0x0091:
            r0 = 2131436217(0x7f0b22b9, float:1.8494298E38)
            android.view.View r2 = r5.requireViewById(r0)     // Catch:{ all -> 0x03fe }
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r2 = (com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent) r2     // Catch:{ all -> 0x03fe }
            r3.A0E = r2     // Catch:{ all -> 0x03fe }
            java.lang.String r16 = "nestedScrollingParent"
            if (r2 == 0) goto L_0x03ea
            X.7Ty r0 = r6.A0O     // Catch:{ all -> 0x03fe }
            boolean r0 = r0.CdC()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x00ad
            boolean r1 = r3.A0N     // Catch:{ all -> 0x03fe }
            r0 = 0
            if (r1 != 0) goto L_0x00ae
        L_0x00ad:
            r0 = 1
        L_0x00ae:
            r2.A0A = r0     // Catch:{ all -> 0x03fe }
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r1 = r3.A0E     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x03ea
            X.7Mv r0 = new X.7Mv     // Catch:{ all -> 0x03fe }
            r0.<init>(r3)     // Catch:{ all -> 0x03fe }
            r1.A07 = r0     // Catch:{ all -> 0x03fe }
            X.3E6 r1 = r3.A0e     // Catch:{ all -> 0x03fe }
            X.7TT r0 = r3.A0g     // Catch:{ all -> 0x03fe }
            r1.A9Y(r0)     // Catch:{ all -> 0x03fe }
            X.7UO r10 = r6.A0H     // Catch:{ all -> 0x03fe }
            X.7Zg r1 = r3.A08     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x03ee
            r0 = 2131431816(0x7f0b1188, float:1.8485372E38)
            android.view.View r8 = r5.requireViewById(r0)     // Catch:{ all -> 0x03fe }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x03fe }
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x03fe }
            r0 = 24
            X.9Ko r7 = new X.9Ko     // Catch:{ all -> 0x03fe }
            r7.<init>(r10, r0)     // Catch:{ all -> 0x03fe }
            X.7S7 r0 = r1.C6l()     // Catch:{ all -> 0x03fe }
            X.7SD r0 = r0.C6Q()     // Catch:{ all -> 0x03fe }
            int r2 = r0.A08     // Catch:{ all -> 0x03fe }
            X.0sa r0 = r10.A0C     // Catch:{ all -> 0x03fe }
            java.lang.Object r1 = r0.invoke()     // Catch:{ all -> 0x03fe }
            X.7Mt r1 = (X.C330437Mt) r1     // Catch:{ all -> 0x03fe }
            X.7Mw r0 = new X.7Mw     // Catch:{ all -> 0x03fe }
            r0.<init>(r8, r1, r7, r2)     // Catch:{ all -> 0x03fe }
            r10.A06 = r0     // Catch:{ all -> 0x03fe }
            r0 = 2131436251(0x7f0b22db, float:1.8494367E38)
            android.view.View r0 = r5.requireViewById(r0)     // Catch:{ all -> 0x03fe }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x03fe }
            r3.A03 = r0     // Catch:{ all -> 0x03fe }
            X.AnonymousClass7TI.A0C(r3, r4)     // Catch:{ all -> 0x03fe }
            X.4oo r1 = r3.A0A     // Catch:{ all -> 0x03fe }
            java.lang.String r16 = "messageListAdapterHolder"
            if (r1 == 0) goto L_0x03ea
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03e6
            com.instagram.direct.messagethread.store.intf.MessageListLayoutManager r8 = r1.BLu(r0)     // Catch:{ all -> 0x03fe }
            r3.A0B = r8     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03e6
            r0.setLayoutManager(r8)     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03e6
            r10 = 1
            r0.A0S = r10     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r2 = r3.A0d     // Catch:{ all -> 0x03fe }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x03fe }
            r0 = 36605508048262389(0x820c84000a14f5, double:3.2128089160464586E-306)
            long r0 = X.182.A01(r7, r2, r0)     // Catch:{ all -> 0x03fe }
            int r15 = (int) r0     // Catch:{ all -> 0x03fe }
            if (r15 < 0) goto L_0x0137
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03e6
            r0.setItemViewCacheSize(r15)     // Catch:{ all -> 0x03fe }
        L_0x0137:
            android.content.Context r20 = r14.requireContext()     // Catch:{ all -> 0x03fe }
            X.7Zg r0 = r3.A08     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ee
            X.7ZY r21 = r0.BSN()     // Catch:{ all -> 0x03fe }
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x03fe }
            X.3t2 r0 = r0.C6c()     // Catch:{ all -> 0x03fe }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x03fe }
            boolean r1 = r0 instanceof X.C254773t1     // Catch:{ all -> 0x03fe }
            X.7Zg r0 = r3.A08     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ee
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x03fe }
            X.7SD r0 = r0.C6Q()     // Catch:{ all -> 0x03fe }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x03fe }
            boolean r24 = X.C66642MaB.A01(r2, r0, r1)     // Catch:{ all -> 0x03fe }
            X.7U1 r0 = r6.A0M     // Catch:{ all -> 0x03fe }
            X.7L2 r0 = r0.A04     // Catch:{ all -> 0x03fe }
            X.7Kx r1 = r0.A04     // Catch:{ all -> 0x03fe }
            X.7N2 r0 = new X.7N2     // Catch:{ all -> 0x03fe }
            r19 = r0
            r22 = r21
            r23 = r1
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x03fe }
            r3.A09 = r0     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r1 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x03e6
            r1.A11(r0)     // Catch:{ all -> 0x03fe }
            r3.A0S(r12)     // Catch:{ all -> 0x03fe }
            r3.A0T(r11, r4, r4, r4)     // Catch:{ all -> 0x03fe }
            X.2nK r1 = r3.A0C     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x018e
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03e6
            r0.A15(r1)     // Catch:{ all -> 0x03fe }
        L_0x018e:
            X.9HC r1 = r3.A0u     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r11 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r11 == 0) goto L_0x03e6
            X.7N3 r15 = new X.7N3     // Catch:{ all -> 0x03fe }
            r15.<init>(r3)     // Catch:{ all -> 0x03fe }
            X.4oo r0 = r3.A0A     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ea
            boolean r0 = r0 instanceof X.AnonymousClass7N4     // Catch:{ all -> 0x03fe }
            X.0qQ.A0B(r2, r4)     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x01b3
            X.0eM r0 = r1.A0K     // Catch:{ all -> 0x03fe }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x03fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x03fe }
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x03fe }
            r0 = 1
            if (r1 != 0) goto L_0x01b4
        L_0x01b3:
            r0 = 0
        L_0x01b4:
            X.4CN r12 = new X.4CN     // Catch:{ all -> 0x03fe }
            r12.<init>(r2, r15, r0)     // Catch:{ all -> 0x03fe }
            r0 = 125(0x7d, double:6.2E-322)
            r12.A00 = r0     // Catch:{ all -> 0x03fe }
            r12.A02 = r0     // Catch:{ all -> 0x03fe }
            r12.A01 = r0     // Catch:{ all -> 0x03fe }
            r12.A03 = r0     // Catch:{ all -> 0x03fe }
            r11.setItemAnimator(r12)     // Catch:{ all -> 0x03fe }
            r12.A00 = r4     // Catch:{ all -> 0x03fe }
            r0 = 36323045229865758(0x810b9e00162b1e, double:3.034178292305953E-306)
            boolean r0 = X.182.A06(r7, r2, r0)     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x01d6
            r11.setItemAnimator(r9)     // Catch:{ all -> 0x03fe }
        L_0x01d6:
            X.7Pm r0 = X.AnonymousClass7N5.A00     // Catch:{ all -> 0x03fe }
            r11.setChildDrawingOrderCallback(r0)     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r1 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x03e6
            X.4oo r0 = r3.A0A     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ea
            X.2Rw r0 = r0.AZJ()     // Catch:{ all -> 0x03fe }
            r1.setAdapter(r0)     // Catch:{ all -> 0x03fe }
            X.3BD r11 = new X.3BD     // Catch:{ all -> 0x03fe }
            r11.<init>()     // Catch:{ all -> 0x03fe }
            r1 = 45
            r0 = 25
            r11.A02(r1, r0)     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r0 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03e6
            r0.setRecycledViewPool(r11)     // Catch:{ all -> 0x03fe }
            X.7Wa r11 = r3.A0p     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r1 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r1 == 0) goto L_0x03e6
            X.7Zg r0 = r3.A08     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ee
            r11.Dys(r5, r1, r0, r8)     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = r3.A0F     // Catch:{ all -> 0x03fe }
            if (r0 != 0) goto L_0x0215
            boolean r0 = r3.A15     // Catch:{ all -> 0x03fe }
            if (r0 != 0) goto L_0x0215
            X.AnonymousClass7TI.A0A(r3, r9)     // Catch:{ all -> 0x03fe }
        L_0x0215:
            X.7UL r1 = r6.A0N     // Catch:{ all -> 0x03fe }
            androidx.recyclerview.widget.RecyclerView r12 = r3.A04     // Catch:{ all -> 0x03fe }
            if (r12 == 0) goto L_0x03e6
            X.7UM r0 = r1.A06     // Catch:{ all -> 0x03fe }
            X.7Nz r11 = new X.7Nz     // Catch:{ all -> 0x03fe }
            r11.<init>(r0)     // Catch:{ all -> 0x03fe }
            r1.A01 = r11     // Catch:{ all -> 0x03fe }
            com.instagram.common.session.UserSession r6 = r1.A05     // Catch:{ all -> 0x03fe }
            java.util.Set r0 = X.AnonymousClass7O0.A00     // Catch:{ all -> 0x03fe }
            r0 = 36324677316587747(0x810d1a000930e3, double:3.0352104305208243E-306)
            boolean r0 = X.182.A06(r7, r6, r0)     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x0263
            java.util.Set r15 = X.AnonymousClass7O0.A00     // Catch:{ all -> 0x03fe }
        L_0x0235:
            r0 = 36322065975945141(0x810aba000127b5, double:3.0335590081834155E-306)
            boolean r0 = X.182.A06(r7, r6, r0)     // Catch:{ all -> 0x03fe }
            r11.A02(r8, r12, r15, r0)     // Catch:{ all -> 0x03fe }
            X.1Ng r6 = X.AnonymousClass1Nd.A00(r2)     // Catch:{ all -> 0x03fe }
            java.lang.Class<X.7O4> r1 = X.AnonymousClass7O4.class
            X.1wn r0 = r3.A0Z     // Catch:{ all -> 0x03fe }
            r6.A01(r0, r1)     // Catch:{ all -> 0x03fe }
            java.lang.Class<X.7O5> r1 = X.AnonymousClass7O5.class
            X.1wn r0 = r3.A0a     // Catch:{ all -> 0x03fe }
            r6.A01(r0, r1)     // Catch:{ all -> 0x03fe }
            X.AnonymousClass7TI.A0D(r3, r10)     // Catch:{ all -> 0x03fe }
            X.37E r1 = X.AnonymousClass37D.A00     // Catch:{ all -> 0x03fe }
            androidx.fragment.app.FragmentActivity r0 = r14.requireActivity()     // Catch:{ all -> 0x03fe }
            X.37D r1 = r1.A01(r0)     // Catch:{ all -> 0x03fe }
            if (r27 == 0) goto L_0x0273
            goto L_0x0266
        L_0x0263:
            java.util.Set r15 = X.AnonymousClass7O1.A00     // Catch:{ all -> 0x03fe }
            goto L_0x0235
        L_0x0266:
            if (r1 == 0) goto L_0x0273
            androidx.fragment.app.Fragment r0 = r1.A09()     // Catch:{ all -> 0x03fe }
            boolean r0 = r0 instanceof X.C68464NJc     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x0273
            r1.A0B()     // Catch:{ all -> 0x03fe }
        L_0x0273:
            boolean r0 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r2, r4)     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x02d1
            X.7Zg r0 = r3.A08     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ee
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x03fe }
            boolean r0 = r0.CWe()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x02d1
            java.lang.String r11 = r3.A12     // Catch:{ all -> 0x03fe }
            X.7Zg r0 = r3.A08     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ee
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x03fe }
            java.lang.String r8 = r0.C6C()     // Catch:{ all -> 0x03fe }
            X.0qQ.A0B(r11, r10)     // Catch:{ all -> 0x03fe }
            java.lang.String r1 = "igd_locked_chat"
            X.0xG r0 = new X.0xG     // Catch:{ all -> 0x03fe }
            r0.<init>(r1)     // Catch:{ all -> 0x03fe }
            X.0wc r6 = X.AnonymousClass0kN.A01(r0, r2)     // Catch:{ all -> 0x03fe }
            java.lang.String r1 = "igd_locked_chat_events"
            X.0kJ r0 = r6.A00     // Catch:{ all -> 0x03fe }
            X.0Aj r6 = r6.A00(r0, r1)     // Catch:{ all -> 0x03fe }
            boolean r0 = r6.isSampled()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x02c5
            java.lang.String r1 = "enter_locked_thread"
            java.lang.String r0 = "action"
            r6.AAJ(r0, r1)     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = "entry_point"
            r6.AAJ(r0, r11)     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = "thread_id"
            r6.AAJ(r0, r8)     // Catch:{ all -> 0x03fe }
            r6.Cgf()     // Catch:{ all -> 0x03fe }
        L_0x02c5:
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()     // Catch:{ all -> 0x03fe }
            X.Okq r0 = new X.Okq     // Catch:{ all -> 0x03fe }
            r0.<init>(r3)     // Catch:{ all -> 0x03fe }
            r1.addOnWindowFocusChangeListener(r0)     // Catch:{ all -> 0x03fe }
        L_0x02d1:
            X.7Yf r0 = r3.A0k     // Catch:{ all -> 0x03fe }
            X.7S2 r0 = r0.A09     // Catch:{ all -> 0x03fe }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x03fe }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x03fe }
        L_0x02db:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x03fe }
            X.7Ru r0 = (X.C331647Ru) r0     // Catch:{ all -> 0x03fe }
            r0.A04(r5)     // Catch:{ all -> 0x03fe }
            goto L_0x02db
        L_0x02eb:
            X.9HS r0 = r3.A0w     // Catch:{ all -> 0x03fe }
            X.34p r0 = r0.A06     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03f6
            r0.A05()     // Catch:{ all -> 0x03fe }
            androidx.fragment.app.FragmentActivity r8 = r14.requireActivity()     // Catch:{ all -> 0x03fe }
            X.7Zg r0 = r3.A08     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03ee
            X.2Er r6 = r0.Api()     // Catch:{ all -> 0x03fe }
            X.4kA r5 = X.AnonymousClass4k9.A00(r2)     // Catch:{ all -> 0x03fe }
            X.0s0 r3 = r5.A0L     // Catch:{ all -> 0x03fe }
            X.0YZ[] r12 = X.AnonymousClass4kA.A0c     // Catch:{ all -> 0x03fe }
            r11 = 20
            r0 = r12[r11]     // Catch:{ all -> 0x03fe }
            java.lang.Object r0 = r3.CDM(r5, r0)     // Catch:{ all -> 0x03fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x03fe }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x03fe }
            if (r0 != 0) goto L_0x03df
            if (r6 == 0) goto L_0x03df
            X.7LW r0 = X.AnonymousClass7LV.A00     // Catch:{ all -> 0x03fe }
            boolean r0 = r0.A02(r2, r6)     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03df
            X.0t1 r0 = X.0eE.A00(r2)     // Catch:{ all -> 0x03fe }
            com.instagram.user.model.User r0 = r0.A00()     // Catch:{ all -> 0x03fe }
            X.16V r1 = r0.A0J()     // Catch:{ all -> 0x03fe }
            X.16V r0 = X.16V.A05     // Catch:{ all -> 0x03fe }
            if (r1 == r0) goto L_0x03df
            r0 = 36316409504338272(0x81059500061160, double:3.0299818327624486E-306)
            boolean r0 = X.182.A06(r7, r2, r0)     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03df
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x03fe }
            r7.<init>()     // Catch:{ all -> 0x03fe }
            java.lang.String r1 = "bottom_sheet_content_fragment"
            java.lang.String r0 = "direct_invite_model_nux"
            r7.putString(r1, r0)     // Catch:{ all -> 0x03fe }
            java.lang.Class<com.instagram.modal.TransparentBackgroundModalActivity> r17 = com.instagram.modal.TransparentBackgroundModalActivity.class
            java.lang.String r18 = "bottom_sheet"
            X.6W8 r0 = new X.6W8     // Catch:{ all -> 0x03fe }
            r13 = r0
            r14 = r8
            r15 = r7
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x03fe }
            r0.A0C(r8)     // Catch:{ all -> 0x03fe }
            r1 = r12[r11]     // Catch:{ all -> 0x03fe }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x03fe }
            r3.Epx(r5, r0, r1)     // Catch:{ all -> 0x03fe }
            java.lang.String r5 = r6.BZP()     // Catch:{ all -> 0x03fe }
            java.lang.String r1 = "direct_thread_toggle"
            X.0xG r0 = new X.0xG     // Catch:{ all -> 0x03fe }
            r0.<init>(r1)     // Catch:{ all -> 0x03fe }
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r2)     // Catch:{ all -> 0x03fe }
            r0 = 3049(0xbe9, float:4.273E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x03fe }
            X.0kJ r1 = r2.A00     // Catch:{ all -> 0x03fe }
            X.0Aj r2 = r2.A00(r1, r0)     // Catch:{ all -> 0x03fe }
            boolean r0 = r2.isSampled()     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03df
            r0 = 16
            java.lang.String r1 = "action"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03fe }
            r2.A8k(r1, r0)     // Catch:{ all -> 0x03fe }
            X.9tO r1 = X.C391629tO.A0C     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = "restriction_type"
            r2.A8M(r1, r0)     // Catch:{ all -> 0x03fe }
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x03fe }
            java.lang.String r1 = "surface"
            r2.AAJ(r1, r0)     // Catch:{ all -> 0x03fe }
            X.9ZL r3 = new X.9ZL     // Catch:{ all -> 0x03fe }
            r3.<init>()     // Catch:{ all -> 0x03fe }
            if (r5 == 0) goto L_0x03a9
            goto L_0x03ac
        L_0x03a9:
            r0 = -1
            goto L_0x03b8
        L_0x03ac:
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r5)     // Catch:{ all -> 0x03fe }
            if (r0 == 0) goto L_0x03a9
            long r0 = r0.longValue()     // Catch:{ all -> 0x03fe }
        L_0x03b8:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = "id"
            r3.A05(r0, r1)     // Catch:{ all -> 0x03fe }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x03fe }
            r0 = 774(0x306, float:1.085E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x03fe }
            r3.A03(r0, r1)     // Catch:{ all -> 0x03fe }
            r0 = 1663(0x67f, float:2.33E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x03fe }
            r2.AAK(r3, r0)     // Catch:{ all -> 0x03fe }
            java.lang.String r0 = "thread_id"
            r2.AAJ(r0, r9)     // Catch:{ all -> 0x03fe }
            r2.Cgf()     // Catch:{ all -> 0x03fe }
        L_0x03df:
            r0 = -1485049256(0xffffffffa77bf258, float:-3.4964622E-15)
            X.0fh.A00(r0)
            return
        L_0x03e6:
            X.0qQ.A0F(r18)     // Catch:{ all -> 0x03fe }
            goto L_0x03f1
        L_0x03ea:
            X.0qQ.A0F(r16)     // Catch:{ all -> 0x03fe }
            goto L_0x03f1
        L_0x03ee:
            X.0qQ.A0F(r17)     // Catch:{ all -> 0x03fe }
        L_0x03f1:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x03fd
        L_0x03f6:
            java.lang.String r0 = "onViewCreated component shouldn't be null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03fe }
            r1.<init>(r0)     // Catch:{ all -> 0x03fe }
        L_0x03fd:
            throw r1     // Catch:{ all -> 0x03fe }
        L_0x03fe:
            r1 = move-exception
            r0 = -899441155(0xffffffffca639dfd, float:-3729279.2)
            X.0fh.A00(r0)
            throw r1
        L_0x0406:
            java.lang.String r0 = "onViewCreated component shouldn't be null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273474md.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final 0jB E4x() {
        AnonymousClass7TI r0 = this.A00;
        if (r0 != null) {
            return r0.E4x();
        }
        0qQ.A0F("threadController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        AnonymousClass7TI r2 = this.A00;
        if (r2 == null) {
            return this.A03.getModuleName();
        }
        C333517Zg r0 = r2.A08;
        if (r0 != null) {
            int i = r0.C6l().C6Q().A08;
            if (i == 28) {
                return "csc_direct_thread";
            }
            if (i == 29) {
                return "broadcast_chat_thread";
            }
            if (i == 32) {
                return "discoverable_chat_thread";
            }
            if (i == 1012) {
                return "agent_thread";
            }
            if (i == 1014) {
                return "ugc_agent_thread";
            }
            if (i == 61) {
                return "csc_direct_thread";
            }
            if (i == 62) {
                return "discoverable_chat_thread";
            }
        }
        return r2.A0y.getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A04.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass7TI r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("threadController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A0U(i, i2, intent);
        }
    }

    /* JADX WARNING: type inference failed for: r7v49 */
    /* JADX WARNING: type inference failed for: r25v7, types: [X.4on] */
    /* JADX WARNING: type inference failed for: r25v8, types: [X.7N4] */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0464, code lost:
        if (((java.lang.Boolean) r7.A04.get()).booleanValue() == false) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0608, code lost:
        if (r4.AvL().CVO() == false) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x073b, code lost:
        if (r27.longValue() > -1) goto L_0x073d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0375 A[Catch:{ all -> 0x0812, all -> 0x085d }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0383 A[Catch:{ all -> 0x0812, all -> 0x085d }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x038d A[Catch:{ all -> 0x081d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r50) {
        /*
            r49 = this;
            r0 = 1543306599(0x5bfcfd67, float:1.42420626E17)
            int r18 = X.AnonymousClass0fD.A02(r0)
            r2 = r49
            X.9HS r0 = r2.A01
            r19 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "navigationPerfLogger"
        L_0x0011:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0019:
            X.34p r1 = r0.A02
            r0 = r19
            r1.A08(r0)
            r5 = r50
            X.C273474md.super.onCreate(r5)
            X.7TI r0 = r2.A00
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = "threadController"
            goto L_0x0011
        L_0x002c:
            java.lang.String r2 = "DirectThreadController.onCreate"
            r1 = 919022921(0x36c72d49, float:5.935934E-6)
            X.0fh.A01(r2, r1)
            X.4DH r1 = r0.A0U     // Catch:{ all -> 0x085d }
            r48 = r1
            android.content.Context r24 = r48.requireContext()     // Catch:{ all -> 0x085d }
            android.os.Bundle r8 = r48.requireArguments()     // Catch:{ all -> 0x085d }
            X.0wX r1 = X.C61170le.A00     // Catch:{ all -> 0x085d }
            X.18g r4 = X.C638918c.A01(r1)     // Catch:{ all -> 0x085d }
            X.3tH r1 = r0.A0v     // Catch:{ all -> 0x085d }
            r43 = r1
            java.lang.String r2 = r1.A00     // Catch:{ all -> 0x085d }
            r3 = 0
            X.0qQ.A0B(r2, r3)     // Catch:{ all -> 0x085d }
            X.1Jv r1 = r4.A05     // Catch:{ all -> 0x085d }
            if (r1 == 0) goto L_0x0056
            r1.A0C = r2     // Catch:{ all -> 0x085d }
        L_0x0056:
            java.lang.String r1 = "direct_thread_fragment_request_code"
            int r1 = r8.getInt(r1, r3)     // Catch:{ all -> 0x085d }
            r0.A01 = r1     // Catch:{ all -> 0x085d }
            com.instagram.common.session.UserSession r2 = r0.A0d     // Catch:{ all -> 0x085d }
            X.0Tu r20 = X.0Tu.A05     // Catch:{ all -> 0x085d }
            r6 = 36314575552973497(0x8103ea00010ab9, double:3.0288220345346355E-306)
            r1 = r20
            X.182.A06(r1, r2, r6)     // Catch:{ all -> 0x085d }
            r1 = 4541(0x11bd, float:6.363E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)     // Catch:{ all -> 0x085d }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ all -> 0x085d }
            r0.A0M = r1     // Catch:{ all -> 0x085d }
            if (r1 == 0) goto L_0x007c
            r0.A02 = r3     // Catch:{ all -> 0x085d }
        L_0x007c:
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x085d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x085d }
            r0.A0H = r1     // Catch:{ all -> 0x085d }
            if (r50 == 0) goto L_0x008c
            goto L_0x07bb
        L_0x008a:
            r0.A0H = r1     // Catch:{ all -> 0x085d }
        L_0x008c:
            X.7Ya r4 = r0.A0f     // Catch:{ all -> 0x085d }
            if (r4 != 0) goto L_0x0094
            X.7Ya r4 = X.AnonymousClass7TI.A00(r8, r5, r0)     // Catch:{ all -> 0x085d }
        L_0x0094:
            X.3t2 r1 = r4.A02     // Catch:{ all -> 0x085d }
            r47 = r1
            X.7Zg r11 = r4.A00     // Catch:{ all -> 0x085d }
            r0.A08 = r11     // Catch:{ all -> 0x085d }
            java.lang.String r1 = r4.A03     // Catch:{ all -> 0x085d }
            r0.A0F = r1     // Catch:{ all -> 0x085d }
            X.7Tw r1 = r0.A0j     // Catch:{ all -> 0x085d }
            X.7U1 r6 = r1.A0M     // Catch:{ all -> 0x085d }
            r9 = 0
            X.7Ty r7 = r1.A0O     // Catch:{ all -> 0x085d }
            r36 = r7
            boolean r7 = r36.CXh()     // Catch:{ all -> 0x085d }
            if (r7 != 0) goto L_0x00b3
            java.lang.String r7 = r0.A0F     // Catch:{ all -> 0x085d }
            if (r7 == 0) goto L_0x00b4
        L_0x00b3:
            r9 = 1
        L_0x00b4:
            X.4DH r7 = r6.A07     // Catch:{ all -> 0x085d }
            android.content.Context r8 = r7.requireContext()     // Catch:{ all -> 0x085d }
            X.0eK r7 = r6.A0E     // Catch:{ all -> 0x085d }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x085d }
            X.9HC r7 = (X.AnonymousClass9HC) r7     // Catch:{ all -> 0x085d }
            X.7L2 r7 = X.C250563lf.A07(r8, r7, r9)     // Catch:{ all -> 0x085d }
            r6.A05(r7)     // Catch:{ all -> 0x085d }
            java.lang.String r8 = "CriticalControllerRegistry.onCreate"
            r16 = 1
            boolean r7 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r7 == 0) goto L_0x00d9
            r7 = 976859073(0x3a39afc1, float:7.0833793E-4)
            X.0fS.A01(r8, r7)     // Catch:{ all -> 0x085d }
        L_0x00d9:
            X.4DH r14 = r1.A09     // Catch:{ all -> 0x084f }
            android.content.Context r23 = r14.requireContext()     // Catch:{ all -> 0x084f }
            com.instagram.common.session.UserSession r9 = r1.A0A     // Catch:{ all -> 0x084f }
            X.7Tn r12 = r1.A0F     // Catch:{ all -> 0x084f }
            X.4DU r13 = r12.A08     // Catch:{ all -> 0x084f }
            java.lang.String r29 = r13.getModuleName()     // Catch:{ all -> 0x084f }
            X.0sa r8 = r12.A0J     // Catch:{ all -> 0x084f }
            java.lang.Object r10 = r8.invoke()     // Catch:{ all -> 0x084f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x084f }
            X.7L3 r7 = new X.7L3     // Catch:{ all -> 0x084f }
            r25 = r7
            r26 = r23
            r27 = r9
            r28 = r13
            r30 = r10
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x084f }
            r1.A07 = r7     // Catch:{ all -> 0x084f }
            X.5ju r7 = X.C293015jt.A00(r9)     // Catch:{ all -> 0x084f }
            X.7Pg r7 = r7.A00     // Catch:{ all -> 0x084f }
            if (r7 == 0) goto L_0x0159
            boolean r10 = r7.A0D()     // Catch:{ all -> 0x084f }
            if (r10 != 0) goto L_0x0118
            X.Tol r7 = r7.A06     // Catch:{ all -> 0x084f }
            if (r7 == 0) goto L_0x0159
            boolean r7 = r7.A01     // Catch:{ all -> 0x084f }
            if (r7 == 0) goto L_0x0159
        L_0x0118:
            X.5ju r7 = X.C293015jt.A00(r9)     // Catch:{ all -> 0x084f }
            X.7Pg r10 = r7.A00     // Catch:{ all -> 0x084f }
            if (r10 == 0) goto L_0x0159
            java.lang.Object r8 = r8.invoke()     // Catch:{ all -> 0x084f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x084f }
            r10.A07 = r8     // Catch:{ all -> 0x084f }
            X.Nhc r7 = r10.A00     // Catch:{ all -> 0x084f }
            if (r7 == 0) goto L_0x012e
            r7.A00 = r8     // Catch:{ all -> 0x084f }
        L_0x012e:
            r1.A06 = r10     // Catch:{ all -> 0x084f }
            X.OtJ r7 = r4.A01     // Catch:{ all -> 0x084f }
            r1.A05 = r7     // Catch:{ all -> 0x084f }
            X.0sa r7 = r12.A0F     // Catch:{ all -> 0x084f }
            X.7Tx r8 = new X.7Tx     // Catch:{ all -> 0x084f }
            r8.<init>(r7)     // Catch:{ all -> 0x084f }
            X.7L4 r7 = new X.7L4     // Catch:{ all -> 0x084f }
            r7.<init>(r9, r11, r8)     // Catch:{ all -> 0x084f }
            r1.A04 = r7     // Catch:{ all -> 0x084f }
            android.os.Bundle r14 = r14.requireArguments()     // Catch:{ all -> 0x084f }
            java.lang.String r7 = "DirectFragment.DIRECT_FRAGMENT_PRIVATE_REPLY_POST_LINK"
            java.lang.String r8 = r14.getString(r7)     // Catch:{ all -> 0x084f }
            r7 = 907(0x38b, float:1.271E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)     // Catch:{ all -> 0x084f }
            java.lang.String r10 = r14.getString(r7)     // Catch:{ all -> 0x084f }
            if (r8 == 0) goto L_0x016a
            goto L_0x0167
        L_0x0159:
            java.lang.Object r8 = r8.invoke()     // Catch:{ all -> 0x084f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x084f }
            X.7Pg r10 = new X.7Pg     // Catch:{ all -> 0x084f }
            r7 = r23
            r10.<init>(r7, r9, r13, r8)     // Catch:{ all -> 0x084f }
            goto L_0x012e
        L_0x0167:
            if (r10 == 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            r7 = 0
            goto L_0x0171
        L_0x016c:
            X.OKL r7 = new X.OKL     // Catch:{ all -> 0x084f }
            r7.<init>(r5, r8, r10)     // Catch:{ all -> 0x084f }
        L_0x0171:
            r1.A01 = r7     // Catch:{ all -> 0x084f }
            java.lang.String r7 = r12.A09     // Catch:{ all -> 0x084f }
            r35 = r7
            X.0sa r13 = r12.A0H     // Catch:{ all -> 0x084f }
            X.7L5 r10 = new X.7L5     // Catch:{ all -> 0x084f }
            r8 = r7
            r7 = r19
            r10.<init>(r5, r8, r7, r13)     // Catch:{ all -> 0x084f }
            r1.A00 = r10     // Catch:{ all -> 0x084f }
            java.lang.String r7 = "DirectThreadFragment.DIRECT_FRAGMENT_FIRST_MESSAGE_SENT"
            boolean r7 = r14.getBoolean(r7, r3)     // Catch:{ all -> 0x084f }
            if (r7 == 0) goto L_0x0191
            X.7L5 r7 = r1.A00     // Catch:{ all -> 0x084f }
            if (r7 == 0) goto L_0x083f
            r7.A00 = r3     // Catch:{ all -> 0x084f }
        L_0x0191:
            X.7Zj r29 = r11.BsD()     // Catch:{ all -> 0x084f }
            X.7L5 r7 = r1.A00     // Catch:{ all -> 0x084f }
            r22 = r7
            if (r7 == 0) goto L_0x0839
            r7 = 40
            X.9Lc r15 = new X.9Lc     // Catch:{ all -> 0x084f }
            r15.<init>(r11, r7)     // Catch:{ all -> 0x084f }
            r7 = 41
            X.9Lc r14 = new X.9Lc     // Catch:{ all -> 0x084f }
            r14.<init>(r11, r7)     // Catch:{ all -> 0x084f }
            r7 = 42
            X.9Lc r13 = new X.9Lc     // Catch:{ all -> 0x084f }
            r13.<init>(r11, r7)     // Catch:{ all -> 0x084f }
            r7 = 43
            X.9Lc r10 = new X.9Lc     // Catch:{ all -> 0x084f }
            r10.<init>(r1, r7)     // Catch:{ all -> 0x084f }
            r8 = 44
            X.9Lc r7 = new X.9Lc     // Catch:{ all -> 0x084f }
            r7.<init>(r1, r8)     // Catch:{ all -> 0x084f }
            X.OKL r8 = r1.A01     // Catch:{ all -> 0x084f }
            X.7L7 r21 = new X.7L7     // Catch:{ all -> 0x084f }
            r25 = r21
            r26 = r9
            r27 = r22
            r28 = r8
            r30 = r15
            r31 = r14
            r32 = r13
            r33 = r10
            r34 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x084f }
            r7 = r21
            r1.A02 = r7     // Catch:{ all -> 0x084f }
            X.0iw r7 = r12.A02     // Catch:{ all -> 0x084f }
            r27 = r7
            X.7UF r7 = r1.A0I     // Catch:{ all -> 0x084f }
            r29 = r7
            X.7L5 r15 = r1.A00     // Catch:{ all -> 0x084f }
            if (r15 == 0) goto L_0x0833
            X.OKL r7 = r1.A01     // Catch:{ all -> 0x084f }
            r32 = r7
            X.7UH r7 = r1.A0P     // Catch:{ all -> 0x084f }
            r22 = r7
            X.3tH r7 = r12.A07     // Catch:{ all -> 0x084f }
            boolean r41 = r7.A00()     // Catch:{ all -> 0x084f }
            X.0sa r7 = r12.A0C     // Catch:{ all -> 0x084f }
            java.lang.Object r7 = r7.invoke()     // Catch:{ all -> 0x084f }
            r42 = 0
            if (r7 == 0) goto L_0x0201
            r42 = 1
        L_0x0201:
            X.7L8 r14 = new X.7L8     // Catch:{ all -> 0x084f }
            r7 = r36
            r14.<init>(r7)     // Catch:{ all -> 0x084f }
            r7 = 45
            X.9Lc r13 = new X.9Lc     // Catch:{ all -> 0x084f }
            r13.<init>(r11, r7)     // Catch:{ all -> 0x084f }
            r7 = 46
            X.9Lc r12 = new X.9Lc     // Catch:{ all -> 0x084f }
            r12.<init>(r11, r7)     // Catch:{ all -> 0x084f }
            r7 = 21
            X.9Km r10 = new X.9Km     // Catch:{ all -> 0x084f }
            r10.<init>(r1, r7)     // Catch:{ all -> 0x084f }
            r7 = 39
            X.9Lc r8 = new X.9Lc     // Catch:{ all -> 0x084f }
            r8.<init>(r11, r7)     // Catch:{ all -> 0x084f }
            X.7L9 r7 = new X.7L9     // Catch:{ all -> 0x084f }
            r25 = r7
            r26 = r23
            r28 = r9
            r30 = r11
            r31 = r15
            r33 = r21
            r34 = r22
            r36 = r14
            r37 = r13
            r38 = r12
            r39 = r8
            r40 = r10
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x084f }
            r1.A03 = r7     // Catch:{ all -> 0x084f }
            X.1pL r12 = X.C66551pM.A00()     // Catch:{ all -> 0x084f }
            X.7L9 r11 = r1.A03     // Catch:{ all -> 0x084f }
            if (r11 == 0) goto L_0x0845
            X.1pK r12 = (X.1pK) r12     // Catch:{ all -> 0x084f }
            r7 = 2342166634264145233(0x20810c2500162d51, double:4.0686596155156675E-152)
            r10 = r20
            boolean r7 = X.182.A06(r10, r9, r7)     // Catch:{ all -> 0x084f }
            if (r7 == 0) goto L_0x0262
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x084f }
            r7.<init>(r11)     // Catch:{ all -> 0x084f }
            r12.A00 = r7     // Catch:{ all -> 0x084f }
            goto L_0x0267
        L_0x0262:
            java.lang.ref.WeakReference r7 = r12.A00     // Catch:{ all -> 0x084f }
            r7.clear()     // Catch:{ all -> 0x084f }
        L_0x0267:
            boolean r7 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r7 == 0) goto L_0x0273
            r7 = -23491184(0xfffffffffe998d90, float:-1.0205346E38)
            X.0fS.A00(r7)     // Catch:{ all -> 0x085d }
        L_0x0273:
            java.lang.String r8 = "CreateMessageListAdapterHolder"
            boolean r7 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r7 == 0) goto L_0x0281
            r7 = -1229130833(0xffffffffb6bcf3af, float:-5.631205E-6)
            X.0fS.A01(r8, r7)     // Catch:{ all -> 0x085d }
        L_0x0281:
            X.7Zg r7 = r0.A08     // Catch:{ all -> 0x0828 }
            java.lang.String r22 = "clientInfra"
            if (r7 == 0) goto L_0x030e
            X.7S9 r8 = r7.AvL()     // Catch:{ all -> 0x0828 }
            X.7S7 r7 = r7.C6l()     // Catch:{ all -> 0x0828 }
            X.7LA r13 = new X.7LA     // Catch:{ all -> 0x0828 }
            r13.<init>(r8, r7)     // Catch:{ all -> 0x0828 }
            boolean r21 = r43.A00()     // Catch:{ all -> 0x0828 }
            if (r21 == 0) goto L_0x02ec
            androidx.fragment.app.FragmentActivity r26 = r48.requireActivity()     // Catch:{ all -> 0x0828 }
            X.7Wl r15 = r0.A0t     // Catch:{ all -> 0x0828 }
            X.9HC r14 = r0.A0u     // Catch:{ all -> 0x0828 }
            X.4DU r12 = r0.A0y     // Catch:{ all -> 0x0828 }
            X.7L2 r11 = r6.A04     // Catch:{ all -> 0x0828 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x0828 }
            X.7Pg r10 = r1.A06     // Catch:{ all -> 0x0828 }
            if (r10 == 0) goto L_0x0339
            X.Acl r30 = new X.Acl     // Catch:{ all -> 0x0828 }
            r30.<init>()     // Catch:{ all -> 0x0828 }
            X.7L3 r9 = r1.A07     // Catch:{ all -> 0x0828 }
            if (r9 == 0) goto L_0x033c
            X.9HS r7 = r0.A0w     // Catch:{ all -> 0x0828 }
            r46 = r7
            java.lang.String r7 = r0.A0F     // Catch:{ all -> 0x0828 }
            r39 = 0
            if (r7 == 0) goto L_0x02c2
            r39 = 1
        L_0x02c2:
            X.7LC r8 = new X.7LC     // Catch:{ all -> 0x0828 }
            r8.<init>(r0)     // Catch:{ all -> 0x0828 }
            X.7Zg r7 = r0.A08     // Catch:{ all -> 0x0828 }
            if (r7 == 0) goto L_0x030e
            X.7S7 r35 = r7.C6l()     // Catch:{ all -> 0x0828 }
            X.7N4 r7 = new X.7N4     // Catch:{ all -> 0x0828 }
            r25 = r7
            r27 = r8
            r28 = r12
            r29 = r2
            r31 = r15
            r32 = r14
            r33 = r13
            r34 = r11
            r36 = r46
            r37 = r10
            r38 = r9
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0828 }
            goto L_0x036b
        L_0x02ec:
            androidx.fragment.app.FragmentActivity r26 = r48.requireActivity()     // Catch:{ all -> 0x0828 }
            android.content.Context r27 = r48.requireContext()     // Catch:{ all -> 0x0828 }
            X.7Wl r7 = r0.A0t     // Catch:{ all -> 0x0828 }
            r34 = r7
            X.7L3 r12 = r1.A07     // Catch:{ all -> 0x0828 }
            if (r12 == 0) goto L_0x033c
            X.7Pg r11 = r1.A06     // Catch:{ all -> 0x0828 }
            if (r11 == 0) goto L_0x0339
            X.7TO r7 = r0.A0q     // Catch:{ all -> 0x0828 }
            r32 = r7
            X.9HC r7 = r0.A0u     // Catch:{ all -> 0x0828 }
            r35 = r7
            java.lang.String r10 = r0.A0G     // Catch:{ all -> 0x0828 }
            if (r10 != 0) goto L_0x0316
            java.lang.String r22 = "expiringMessageReplaySessionId"
        L_0x030e:
            X.0qQ.A0F(r22)     // Catch:{ all -> 0x0828 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0828 }
            throw r0     // Catch:{ all -> 0x0828 }
        L_0x0316:
            X.0iw r7 = r0.A0V     // Catch:{ all -> 0x0828 }
            r30 = r7
            X.7L2 r7 = r6.A04     // Catch:{ all -> 0x0828 }
            r23 = r7
            X.0qQ.A07(r23)     // Catch:{ all -> 0x0828 }
            X.7LC r9 = new X.7LC     // Catch:{ all -> 0x0828 }
            r9.<init>(r0)     // Catch:{ all -> 0x0828 }
            X.7Zg r7 = r0.A08     // Catch:{ all -> 0x0828 }
            if (r7 == 0) goto L_0x030e
            X.7S7 r38 = r7.C6l()     // Catch:{ all -> 0x0828 }
            X.9HS r7 = r0.A0w     // Catch:{ all -> 0x0828 }
            r46 = r7
            java.lang.String r7 = r0.A0F     // Catch:{ all -> 0x0828 }
            r44 = 0
            if (r7 == 0) goto L_0x0341
            goto L_0x033f
        L_0x0339:
            java.lang.String r22 = "audioPlayer"
            goto L_0x030e
        L_0x033c:
            java.lang.String r22 = "videoPlayer"
            goto L_0x030e
        L_0x033f:
            r44 = 1
        L_0x0341:
            r7 = 16
            X.9Km r8 = new X.9Km     // Catch:{ all -> 0x0828 }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x0828 }
            boolean r15 = r0.A0L     // Catch:{ all -> 0x0828 }
            X.9HO r14 = r0.A0r     // Catch:{ all -> 0x0828 }
            X.4on r7 = new X.4on     // Catch:{ all -> 0x0828 }
            r25 = r7
            r28 = r9
            r29 = r48
            r31 = r2
            r33 = r14
            r36 = r13
            r37 = r23
            r39 = r46
            r40 = r11
            r41 = r12
            r42 = r10
            r43 = r8
            r45 = r15
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x0828 }
        L_0x036b:
            X.4oo r7 = (X.C274644oo) r7     // Catch:{ all -> 0x0828 }
            r0.A0A = r7     // Catch:{ all -> 0x0828 }
            boolean r7 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r7 == 0) goto L_0x037b
            r7 = 1765194494(0x6936bafe, float:1.3806722E25)
            X.0fS.A00(r7)     // Catch:{ all -> 0x085d }
        L_0x037b:
            java.lang.String r8 = "SetListAdapterHolder"
            boolean r7 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r7 == 0) goto L_0x0389
            r7 = -270461854(0xffffffffefe11462, float:-1.3931754E29)
            X.0fS.A01(r8, r7)     // Catch:{ all -> 0x085d }
        L_0x0389:
            X.7Zg r7 = r0.A08     // Catch:{ all -> 0x081d }
            if (r7 == 0) goto L_0x039c
            X.7ZY r9 = r7.BSN()     // Catch:{ all -> 0x081d }
            X.7L2 r8 = r6.A04     // Catch:{ all -> 0x081d }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x081d }
            X.4oo r7 = r0.A0A     // Catch:{ all -> 0x081d }
            if (r7 != 0) goto L_0x03a4
            java.lang.String r22 = "messageListAdapterHolder"
        L_0x039c:
            X.0qQ.A0F(r22)     // Catch:{ all -> 0x081d }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x081d }
            throw r0     // Catch:{ all -> 0x081d }
        L_0x03a4:
            r6 = r24
            r9.CNE(r6, r7, r8)     // Catch:{ all -> 0x081d }
            boolean r6 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r6 == 0) goto L_0x03b5
            r6 = -1702094883(0xffffffff9a8c17dd, float:-5.7941196E-23)
            X.0fS.A00(r6)     // Catch:{ all -> 0x085d }
        L_0x03b5:
            java.lang.String r7 = "ClientInfra.onCreate"
            boolean r6 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r6 == 0) goto L_0x03c3
            r6 = 1576185330(0x5df2adf2, float:2.18586238E18)
            X.0fS.A01(r7, r6)     // Catch:{ all -> 0x085d }
        L_0x03c3:
            X.7Zg r6 = r0.A08     // Catch:{ all -> 0x0812 }
            if (r6 != 0) goto L_0x03cf
            X.0qQ.A0F(r22)     // Catch:{ all -> 0x0812 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0812 }
            throw r0     // Catch:{ all -> 0x0812 }
        L_0x03cf:
            r6.onCreate()     // Catch:{ all -> 0x0812 }
            boolean r6 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r6 == 0) goto L_0x03de
            r6 = 1491640597(0x58e8a115, float:2.04622832E15)
            X.0fS.A00(r6)     // Catch:{ all -> 0x085d }
        L_0x03de:
            X.7Zg r6 = r0.A08     // Catch:{ all -> 0x085d }
            if (r6 == 0) goto L_0x07c9
            X.7S9 r7 = r6.AvL()     // Catch:{ all -> 0x085d }
            r6 = r47
            r7.D6W(r6)     // Catch:{ all -> 0x085d }
            boolean r6 = X.AnonymousClass7TI.A0H(r0)     // Catch:{ all -> 0x085d }
            X.0qQ.A0B(r2, r3)     // Catch:{ all -> 0x085d }
            boolean r6 = X.C66642MaB.A02(r2, r6)     // Catch:{ all -> 0x085d }
            r0.A0N = r6     // Catch:{ all -> 0x085d }
            X.7Sf r7 = r0.A0o     // Catch:{ all -> 0x085d }
            X.7Zg r11 = r0.A08     // Catch:{ all -> 0x085d }
            if (r11 == 0) goto L_0x07c9
            X.7UW r6 = r1.A0C     // Catch:{ all -> 0x085d }
            X.7Le r10 = r6.A01()     // Catch:{ all -> 0x085d }
            X.9H7 r6 = r7.A00     // Catch:{ all -> 0x085d }
            X.7S2 r9 = r6.A1I     // Catch:{ all -> 0x085d }
            java.lang.Class<X.7Rt> r8 = X.C331637Rt.class
            r7 = 7
            X.9M5 r6 = new X.9M5     // Catch:{ all -> 0x085d }
            r6.<init>(r7, r11, r10)     // Catch:{ all -> 0x085d }
            r9.A00(r8, r6)     // Catch:{ all -> 0x085d }
            r6 = r47
            boolean r6 = r6 instanceof X.C254773t1     // Catch:{ all -> 0x085d }
            if (r6 == 0) goto L_0x044c
            X.3t1 r6 = X.AnonymousClass6W3.A01(r47)     // Catch:{ all -> 0x085d }
            com.instagram.model.direct.DirectThreadKey r9 = X.AnonymousClass6W4.A01(r6)     // Catch:{ all -> 0x085d }
            X.2Dm r6 = X.2L2.A00(r2)     // Catch:{ all -> 0x085d }
            X.3U9 r7 = r6.B33(r9)     // Catch:{ all -> 0x085d }
            if (r7 == 0) goto L_0x0447
            boolean r6 = r7.Ca9()     // Catch:{ all -> 0x085d }
            if (r6 != 0) goto L_0x0447
            boolean r6 = r7.CVr()     // Catch:{ all -> 0x085d }
            if (r6 != 0) goto L_0x0447
            boolean r6 = r7.CVE()     // Catch:{ all -> 0x085d }
            if (r6 != 0) goto L_0x0447
            r6 = 36316448158650743(0x81059e00001177, double:3.0300062779053037E-306)
            r8 = r20
            X.182.A06(r8, r2, r6)     // Catch:{ all -> 0x085d }
        L_0x0447:
            X.2HN r7 = X.2HM.A00(r2)     // Catch:{ all -> 0x085d }
            goto L_0x044f
        L_0x044c:
            r9 = r19
            goto L_0x0447
        L_0x044f:
            if (r21 == 0) goto L_0x0466
            boolean r6 = r7.A01()     // Catch:{ all -> 0x085d }
            if (r6 == 0) goto L_0x0466
            X.2HR r6 = r7.A04     // Catch:{ all -> 0x085d }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x085d }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x085d }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x085d }
            r8 = 1
            if (r6 != 0) goto L_0x0467
        L_0x0466:
            r8 = 0
        L_0x0467:
            java.lang.String r7 = "DirectThreadFragment"
            r11 = 2
            X.2DU r6 = X.2DU.A00(r2)     // Catch:{ all -> 0x085d }
            r6.A0B(r8, r7)     // Catch:{ all -> 0x085d }
            X.7Zg r6 = r0.A08     // Catch:{ all -> 0x085d }
            if (r6 == 0) goto L_0x07c9
            X.7S7 r6 = r6.C6l()     // Catch:{ all -> 0x085d }
            boolean r8 = r6.CdE()     // Catch:{ all -> 0x085d }
            r7 = 1
            if (r8 == 0) goto L_0x049e
            X.7Zg r8 = r0.A08     // Catch:{ all -> 0x085d }
            if (r8 == 0) goto L_0x07c9
            X.7ZY r13 = r8.BSN()     // Catch:{ all -> 0x085d }
            X.3SZ r8 = r6.BrG(r7)     // Catch:{ all -> 0x085d }
            r13.EjZ(r8)     // Catch:{ all -> 0x085d }
            X.3t3 r12 = r6.CBU()     // Catch:{ all -> 0x085d }
            X.3SZ r10 = r6.BrG(r7)     // Catch:{ all -> 0x085d }
            X.3SZ r8 = r6.BrG(r3)     // Catch:{ all -> 0x085d }
            r13.Eja(r10, r8, r12)     // Catch:{ all -> 0x085d }
        L_0x049e:
            X.7Wa r8 = r0.A0p     // Catch:{ all -> 0x085d }
            r8.D6Y(r5, r4)     // Catch:{ all -> 0x085d }
            X.7UZ r10 = r1.A0E     // Catch:{ all -> 0x085d }
            androidx.fragment.app.Fragment r4 = r10.A01     // Catch:{ all -> 0x085d }
            android.content.Context r8 = r4.requireContext()     // Catch:{ all -> 0x085d }
            com.instagram.common.session.UserSession r4 = r10.A02     // Catch:{ all -> 0x085d }
            X.36U r4 = X.AnonymousClass36R.A00(r8, r4, r10)     // Catch:{ all -> 0x085d }
            r10.A00 = r4     // Catch:{ all -> 0x085d }
            r4.DfL(r5)     // Catch:{ all -> 0x085d }
            X.9H3 r10 = r0.A0x     // Catch:{ all -> 0x085d }
            java.lang.String r8 = "DIRECT_THREAD_FRAGMENT_CREATED"
            X.18g r5 = r10.A08     // Catch:{ all -> 0x085d }
            com.facebook.quicklog.LightweightQuickPerformanceLogger r4 = X.AnonymousClass9H3.A00(r10)     // Catch:{ all -> 0x085d }
            r5.A0M(r4, r10, r8)     // Catch:{ all -> 0x085d }
            r4 = r48
            X.0h9 r12 = r4.mLifecycleRegistry     // Catch:{ all -> 0x085d }
            X.7Zg r8 = r0.A08     // Catch:{ all -> 0x085d }
            if (r8 == 0) goto L_0x07c9
            X.7S7 r4 = r8.C6l()     // Catch:{ all -> 0x085d }
            boolean r5 = r4.COb()     // Catch:{ all -> 0x085d }
            X.7S7 r4 = r8.C6l()     // Catch:{ all -> 0x085d }
            java.lang.String r10 = r4.BY8()     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0500
            X.7SD r4 = r4.C6Q()     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x0500
            java.util.List r4 = r4.A0b     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x0500
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x085d }
        L_0x04eb:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x0500
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x085d }
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4     // Catch:{ all -> 0x085d }
            X.4Cl r4 = r4.A03     // Catch:{ all -> 0x085d }
            java.lang.String r4 = r4.AaU()     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x04eb
            r10 = r4
        L_0x0500:
            X.7MW r8 = X.AnonymousClass7MW.A00     // Catch:{ all -> 0x085d }
            X.72F r5 = new X.72F     // Catch:{ all -> 0x085d }
            r4 = r24
            r5.<init>(r4, r2, r10, r8)     // Catch:{ all -> 0x085d }
            r12.A09(r5)     // Catch:{ all -> 0x085d }
            X.7SD r4 = r6.C6Q()     // Catch:{ all -> 0x085d }
            X.3t3 r26 = r6.CBU()     // Catch:{ all -> 0x085d }
            if (r26 == 0) goto L_0x053b
            X.7OW r8 = X.AnonymousClass7OW.THREAD_VIEW_ENTRY     // Catch:{ all -> 0x085d }
            X.0sP r5 = r8.A00     // Catch:{ all -> 0x085d }
            java.lang.Object r5 = r5.invoke(r2)     // Catch:{ all -> 0x085d }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x085d }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x053b
            r5 = 34
            X.Ay7 r6 = new X.Ay7     // Catch:{ all -> 0x085d }
            r6.<init>(r2, r5)     // Catch:{ all -> 0x085d }
            java.lang.Class<X.7BU> r5 = X.AnonymousClass7BU.class
            java.lang.Object r5 = r2.A01(r5, r6)     // Catch:{ all -> 0x085d }
            X.7BU r5 = (X.AnonymousClass7BU) r5     // Catch:{ all -> 0x085d }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x085d }
            r5.A00(r8, r4)     // Catch:{ all -> 0x085d }
        L_0x053b:
            X.7Zg r5 = r0.A08     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x07c9
            X.7S7 r5 = r5.C6l()     // Catch:{ all -> 0x085d }
            X.7SD r5 = r5.C6Q()     // Catch:{ all -> 0x085d }
            X.3Tu r6 = r5.A0H     // Catch:{ all -> 0x085d }
            if (r26 == 0) goto L_0x0578
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x085d }
            X.0qQ.A0B(r4, r7)     // Catch:{ all -> 0x085d }
            boolean r5 = r4.A0x     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x06d6
            X.3Tu r5 = r4.A0H     // Catch:{ all -> 0x085d }
            boolean r5 = X.C308556Us.A0J(r2, r5)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x06d6
            X.7Zg r5 = r0.A08     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x07c9
            X.7ZA r23 = r5.C62()     // Catch:{ all -> 0x085d }
            r27 = 3
            X.7Kc r5 = r0.A0I(r3)     // Catch:{ all -> 0x085d }
            boolean r29 = r5.COV(r2, r4)     // Catch:{ all -> 0x085d }
            r24 = r2
            r25 = r6
            r28 = r7
            r23.FHH(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x085d }
        L_0x0578:
            int r5 = r4.A08     // Catch:{ all -> 0x085d }
            boolean r4 = X.AnonymousClass48O.A02(r5)     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x05db
            X.7TD r4 = r0.A0l     // Catch:{ all -> 0x085d }
            java.lang.String r5 = "csc_direct_thread"
            X.4md r4 = r4.A00     // Catch:{ all -> 0x085d }
            r4.setModuleNameV2(r5)     // Catch:{ all -> 0x085d }
        L_0x0589:
            X.1wY r9 = X.1wY.A00(r2)     // Catch:{ all -> 0x085d }
            X.4DU r8 = r0.A0y     // Catch:{ all -> 0x085d }
            java.lang.String r7 = r8.getModuleName()     // Catch:{ all -> 0x085d }
            java.lang.String r5 = r8.getModuleName()     // Catch:{ all -> 0x085d }
            X.34R r6 = new X.34R     // Catch:{ all -> 0x085d }
            r4 = r19
            r6.<init>(r2, r4, r5)     // Catch:{ all -> 0x085d }
            java.lang.String r5 = r8.getModuleName()     // Catch:{ all -> 0x085d }
            X.34L r4 = new X.34L     // Catch:{ all -> 0x085d }
            r4.<init>(r2, r5)     // Catch:{ all -> 0x085d }
            java.lang.Integer r2 = X.1wY.A0F     // Catch:{ all -> 0x085d }
            X.0qQ.A08(r2)     // Catch:{ all -> 0x085d }
            r9.A07(r4, r6, r7)     // Catch:{ all -> 0x085d }
            X.7UY r4 = r1.A0G     // Catch:{ all -> 0x085d }
            X.0sa r1 = r4.A06     // Catch:{ all -> 0x085d }
            java.lang.Object r2 = r1.invoke()     // Catch:{ all -> 0x085d }
            X.7Zg r2 = (X.C333517Zg) r2     // Catch:{ all -> 0x085d }
            X.0eM r4 = r4.A05     // Catch:{ all -> 0x085d }
            java.lang.Object r1 = r4.getValue()     // Catch:{ all -> 0x085d }
            X.4gS r1 = (X.C270264gS) r1     // Catch:{ all -> 0x085d }
            boolean r1 = r1.A00     // Catch:{ all -> 0x085d }
            if (r1 == 0) goto L_0x07d6
            X.7S7 r2 = r2.C6l()     // Catch:{ all -> 0x085d }
            boolean r1 = r2.CWe()     // Catch:{ all -> 0x085d }
            if (r1 == 0) goto L_0x07d6
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x085d }
            X.4gS r4 = (X.C270264gS) r4     // Catch:{ all -> 0x085d }
            java.lang.String r2 = r2.C6C()     // Catch:{ all -> 0x085d }
            goto L_0x07cd
        L_0x05db:
            r4 = 29
            if (r5 != r4) goto L_0x0695
            X.7TD r4 = r0.A0l     // Catch:{ all -> 0x085d }
            java.lang.String r5 = "broadcast_chat_thread"
            X.4md r4 = r4.A00     // Catch:{ all -> 0x085d }
            r4.setModuleNameV2(r5)     // Catch:{ all -> 0x085d }
            X.4kA r4 = X.AnonymousClass4k9.A00(r2)     // Catch:{ all -> 0x085d }
            r4.A07(r3)     // Catch:{ all -> 0x085d }
            r4 = 36319407393348919(0x81084f00221d37, double:3.031877709844312E-306)
            r6 = r20
            boolean r4 = X.182.A06(r6, r2, r4)     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x060a
            X.7Zg r4 = r0.A08     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x07c9
            X.7S9 r4 = r4.AvL()     // Catch:{ all -> 0x085d }
            boolean r4 = r4.CVO()     // Catch:{ all -> 0x085d }
            if (r4 != 0) goto L_0x0589
        L_0x060a:
            androidx.fragment.app.FragmentActivity r6 = r48.requireActivity()     // Catch:{ all -> 0x085d }
            X.7Zg r9 = r0.A08     // Catch:{ all -> 0x085d }
            if (r9 == 0) goto L_0x07c9
            X.7Ue r4 = r0.A0i     // Catch:{ all -> 0x085d }
            X.0eM r4 = r4.A0P     // Catch:{ all -> 0x085d }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x085d }
            X.7Vn r4 = (X.C332567Vn) r4     // Catch:{ all -> 0x085d }
            X.7Vp r8 = r4.A07     // Catch:{ all -> 0x085d }
            X.7S7 r13 = r9.C6l()     // Catch:{ all -> 0x085d }
            X.2Ep r4 = r13.Cms()     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x0692
            X.3U9 r4 = (X.AnonymousClass3U9) r4     // Catch:{ all -> 0x085d }
            X.3S9 r4 = r4.A01     // Catch:{ all -> 0x085d }
            X.3Te r4 = r4.A0s     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x0692
            java.lang.String r5 = r4.A07     // Catch:{ all -> 0x085d }
        L_0x0632:
            java.lang.String r4 = r2.A06     // Catch:{ all -> 0x085d }
            boolean r4 = X.0qQ.A0K(r5, r4)     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x065a
            boolean r4 = X.C347037wA.A05(r2)     // Catch:{ all -> 0x085d }
            if (r4 != 0) goto L_0x065a
            X.0xx r12 = X.AnonymousClass07a.A00(r6)     // Catch:{ all -> 0x085d }
            X.12T r6 = X.AnonymousClass12T.A00     // Catch:{ all -> 0x085d }
            r5 = 480314591(0x1ca104df, float:1.0655345E-21)
            r4 = 3
            X.0nV r10 = r6.CO6(r5, r4)     // Catch:{ all -> 0x085d }
            r6 = 9
            X.Pfm r5 = new X.Pfm     // Catch:{ all -> 0x085d }
            r4 = r19
            r5.<init>(r2, r4, r6)     // Catch:{ all -> 0x085d }
            X.1Eo.A05(r10, r5, r12)     // Catch:{ all -> 0x085d }
        L_0x065a:
            X.3t3 r4 = r13.CBU()     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x0589
            X.3t0 r4 = X.C300965yF.A02(r4)     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x0589
            java.lang.String r5 = r4.A00     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0589
            r4 = -2
            X.1NY r10 = new X.1NY     // Catch:{ all -> 0x085d }
            r10.<init>(r2, r4)     // Catch:{ all -> 0x085d }
            r10.A04()     // Catch:{ all -> 0x085d }
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch:{ all -> 0x085d }
            java.lang.String r4 = "direct_v2/threads/%s/opened/"
            r10.A0K(r4, r5)     // Catch:{ all -> 0x085d }
            java.lang.Class<X.1XP> r6 = X.1XP.class
            java.lang.Class<X.1XY> r5 = X.1XY.class
            r4 = r19
            r10.A0O(r4, r6, r5, r3)     // Catch:{ all -> 0x085d }
            X.1OC r5 = r10.A0M()     // Catch:{ all -> 0x085d }
            r4 = -5
            X.1ES.A05(r5, r4, r11, r7, r3)     // Catch:{ all -> 0x085d }
            X.C69927NuT.A00(r2, r8, r9)     // Catch:{ all -> 0x085d }
            goto L_0x0589
        L_0x0692:
            r5 = r19
            goto L_0x0632
        L_0x0695:
            r4 = 62
            if (r5 == r4) goto L_0x06ba
            r4 = 61
            if (r5 == r4) goto L_0x06ba
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x085d }
            boolean r4 = X.AnonymousClass48O.A06(r4)     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x0589
            r4 = 1014(0x3f6, float:1.421E-42)
            if (r5 != r4) goto L_0x06ac
            goto L_0x06af
        L_0x06ac:
            java.lang.String r5 = "agent_thread"
            goto L_0x06b1
        L_0x06af:
            java.lang.String r5 = "ugc_agent_thread"
        L_0x06b1:
            X.7TD r4 = r0.A0l     // Catch:{ all -> 0x085d }
            X.4md r4 = r4.A00     // Catch:{ all -> 0x085d }
            r4.setModuleNameV2(r5)     // Catch:{ all -> 0x085d }
            goto L_0x0589
        L_0x06ba:
            X.7Zg r4 = r0.A08     // Catch:{ all -> 0x085d }
            if (r4 == 0) goto L_0x07c9
            X.7S9 r4 = r4.AvL()     // Catch:{ all -> 0x085d }
            boolean r4 = r4.CVO()     // Catch:{ all -> 0x085d }
            if (r4 != 0) goto L_0x0589
            r48.requireActivity()     // Catch:{ all -> 0x085d }
            X.7Zg r5 = r0.A08     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x07c9
            r4 = r19
            X.C69927NuT.A00(r2, r4, r5)     // Catch:{ all -> 0x085d }
            goto L_0x0589
        L_0x06d6:
            X.7Zg r5 = r0.A08     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x07c9
            X.7S7 r5 = r5.C6l()     // Catch:{ all -> 0x085d }
            boolean r5 = X.C308556Us.A0R(r2, r5)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x06eb
            X.2Dm r5 = X.2L2.A00(r2)     // Catch:{ all -> 0x085d }
            r5.FI2(r9)     // Catch:{ all -> 0x085d }
        L_0x06eb:
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x085d }
            boolean r8 = X.C308556Us.A09(r2, r4)     // Catch:{ all -> 0x085d }
            boolean r5 = X.C308556Us.A08(r2, r4)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0790
            boolean r10 = X.AnonymousClass7TI.A0H(r0)     // Catch:{ all -> 0x085d }
            X.7Kc r5 = r0.A0I(r3)     // Catch:{ all -> 0x085d }
            boolean r9 = r5.COV(r2, r4)     // Catch:{ all -> 0x085d }
            X.OYw r5 = X.NK8.A03     // Catch:{ all -> 0x085d }
            boolean r5 = r5.A02(r2, r8, r10, r9)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x075a
            androidx.fragment.app.FragmentActivity r23 = r48.requireActivity()     // Catch:{ all -> 0x085d }
            java.lang.String r28 = X.C300965yF.A07(r26)     // Catch:{ all -> 0x085d }
            java.lang.Long r26 = r0.A0O()     // Catch:{ all -> 0x085d }
            X.4li r5 = r4.A0N     // Catch:{ all -> 0x085d }
            boolean r6 = r5.A08     // Catch:{ all -> 0x085d }
            java.lang.Integer r5 = r5.A03     // Catch:{ all -> 0x085d }
            if (r6 == 0) goto L_0x07b8
            if (r5 == 0) goto L_0x07b8
            int r5 = r5.intValue()     // Catch:{ all -> 0x085d }
            long r5 = (long) r5     // Catch:{ all -> 0x085d }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x085d }
            long r5 = r12.toMillis(r5)     // Catch:{ all -> 0x085d }
            java.lang.Long r27 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x085d }
            if (r27 == 0) goto L_0x07b8
            long r14 = r27.longValue()     // Catch:{ all -> 0x085d }
            r12 = -1
            int r5 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x07b8
        L_0x073d:
            X.7Kc r5 = r0.A0I(r7)     // Catch:{ all -> 0x085d }
            X.3tH r25 = r5.Axi()     // Catch:{ all -> 0x085d }
            boolean r29 = r0.A0W()     // Catch:{ all -> 0x085d }
            X.3Tu r5 = r4.A0H     // Catch:{ all -> 0x085d }
            boolean r30 = X.C308556Us.A0I(r2, r5)     // Catch:{ all -> 0x085d }
            r24 = r2
            r31 = r8
            r32 = r10
            r33 = r9
            X.C71021OYw.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x085d }
        L_0x075a:
            X.OVs r10 = X.C69881Ntj.A00(r2)     // Catch:{ all -> 0x085d }
            com.instagram.common.session.UserSession r12 = r10.A00     // Catch:{ all -> 0x085d }
            r5 = 2342163327141224734(0x208109230033211e, double:4.065855455814449E-152)
            r9 = r20
            boolean r5 = X.182.A06(r9, r12, r5)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0790
            boolean r5 = X.C308556Us.A08(r12, r4)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0790
            boolean r5 = X.C308556Us.A09(r12, r4)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0790
            X.4li r5 = r4.A0N     // Catch:{ all -> 0x085d }
            java.lang.Long r5 = r5.A04     // Catch:{ all -> 0x085d }
            if (r5 != 0) goto L_0x0790
            X.3t3 r5 = r4.A0P     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0790
            X.3t0 r5 = X.C300965yF.A02(r5)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0790
            java.lang.String r5 = r5.A00     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0790
            X.C70997OVs.A00(r10, r5, r3)     // Catch:{ all -> 0x085d }
        L_0x0790:
            boolean r5 = X.C308556Us.A0T(r2, r8)     // Catch:{ all -> 0x085d }
            if (r5 == 0) goto L_0x0578
            X.5Gf r5 = X.C283115Ge.A00(r2)     // Catch:{ all -> 0x085d }
            boolean r5 = r5.A01()     // Catch:{ all -> 0x085d }
            if (r5 != 0) goto L_0x0578
            X.5Gf r5 = X.C283115Ge.A00(r2)     // Catch:{ all -> 0x085d }
            X.0xa r5 = r5.A01     // Catch:{ all -> 0x085d }
            X.0xY r6 = r5.AR4()     // Catch:{ all -> 0x085d }
            r5 = 2310(0x906, float:3.237E-42)
            java.lang.String r5 = X.C273654mx.A00(r5)     // Catch:{ all -> 0x085d }
            r6.E5T(r5, r7)     // Catch:{ all -> 0x085d }
            r6.apply()     // Catch:{ all -> 0x085d }
            goto L_0x0578
        L_0x07b8:
            r27 = r19
            goto L_0x073d
        L_0x07bb:
            java.lang.String r1 = "DirectThreadFragment.ARGUMENT_VIEWER_SESSION_ID"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ all -> 0x085d }
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = r0.A0H     // Catch:{ all -> 0x085d }
            if (r1 != 0) goto L_0x008a
            java.lang.String r22 = "threadViewerSessionId"
        L_0x07c9:
            X.0qQ.A0F(r22)     // Catch:{ all -> 0x085d }
            goto L_0x080d
        L_0x07cd:
            if (r2 == 0) goto L_0x07d4
            java.util.Set r1 = r4.A02     // Catch:{ all -> 0x085d }
            r1.add(r2)     // Catch:{ all -> 0x085d }
        L_0x07d4:
            r4.A01 = r3     // Catch:{ all -> 0x085d }
        L_0x07d6:
            X.7Yf r0 = r0.A0k     // Catch:{ all -> 0x085d }
            X.7S2 r1 = r0.A09     // Catch:{ all -> 0x085d }
            r0 = r48
            X.0h9 r2 = r0.mLifecycleRegistry     // Catch:{ all -> 0x085d }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x085d }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x085d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x085d }
        L_0x07e7:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x085d }
            if (r0 == 0) goto L_0x07f7
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x085d }
            X.7Ru r0 = (X.C331647Ru) r0     // Catch:{ all -> 0x085d }
            r0.A06(r2)     // Catch:{ all -> 0x085d }
            goto L_0x07e7
        L_0x07f7:
            r0 = r46
            X.34p r0 = r0.A02     // Catch:{ all -> 0x085d }
            r0.A05()     // Catch:{ all -> 0x085d }
            r0 = 1573277772(0x5dc6504c, float:1.78625065E18)
            X.0fh.A00(r0)
            r1 = -1090978021(0xffffffffbef8ff1b, float:-0.4863213)
            r0 = r18
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x080d:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x085c
        L_0x0812:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r0 == 0) goto L_0x085c
            r0 = 528718836(0x1f839bf4, float:5.573866E-20)
            goto L_0x0859
        L_0x081d:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r0 == 0) goto L_0x085c
            r0 = -193911686(0xfffffffff471247a, float:-7.6421104E31)
            goto L_0x0859
        L_0x0828:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r0 == 0) goto L_0x085c
            r0 = 1503505735(0x599dad47, float:5.5477615E15)
            goto L_0x0859
        L_0x0833:
            java.lang.String r0 = "sendAttributionTracker"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x084f }
            goto L_0x084a
        L_0x0839:
            java.lang.String r0 = "sendAttributionTracker"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x084f }
            goto L_0x084a
        L_0x083f:
            java.lang.String r0 = "sendAttributionTracker"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x084f }
            goto L_0x084a
        L_0x0845:
            java.lang.String r0 = "directSendHelper"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x084f }
        L_0x084a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x084f }
            throw r0     // Catch:{ all -> 0x084f }
        L_0x084f:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)     // Catch:{ all -> 0x085d }
            if (r0 == 0) goto L_0x085c
            r0 = -474754688(0xffffffffe3b3d180, float:-6.6341265E21)
        L_0x0859:
            X.0fS.A00(r0)     // Catch:{ all -> 0x085d }
        L_0x085c:
            throw r1     // Catch:{ all -> 0x085d }
        L_0x085d:
            r1 = move-exception
            r0 = 1488801398(0x58bd4e76, float:1.66515748E15)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273474md.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: finally extract failed */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        0xG r12;
        String str;
        int A022 = AnonymousClass0fD.A02(1446340375);
        AnonymousClass9HS r0 = this.A01;
        if (r0 == null) {
            str = "navigationPerfLogger";
        } else {
            r0.A03.A08((String) null);
            AnonymousClass7TI r3 = this.A00;
            if (r3 == null) {
                str = "threadController";
            } else {
                0fh.A01("DirectThreadController.onCreateView", 857702404);
                try {
                    C226122ff r5 = C226112fe.A0B;
                    AnonymousClass4DH r6 = r3.A0U;
                    Activity rootActivity = r6.getRootActivity();
                    if (rootActivity != null) {
                        boolean z = false;
                        r5.A04(rootActivity, r3.A10, false);
                        if (r3.A0v == C254923tH.ACT) {
                            r12 = new 0xG("direct_secure_thread");
                        } else {
                            r12 = r3.A0V;
                        }
                        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        FragmentActivity requireActivity = r6.requireActivity();
                        UserSession userSession = r3.A0d;
                        AnonymousClass7MY r7 = new AnonymousClass7MY(r3);
                        if (r3.A0F != null) {
                            z = true;
                        }
                        C229402nK r10 = new C229402nK(requireActivity, r12, userSession, false, Boolean.valueOf(z), r7, AnonymousClass7MZ.A00, new C330247Ma(r3), new C330257Mb(r3), new C330267Mc(r3), new C330277Md(r3), 23592968);
                        r3.A0C = r10;
                        r6.registerLifecycleListener(r10);
                        C333517Zg r02 = r3.A08;
                        String str2 = "clientInfra";
                        if (r02 != null) {
                            r02.AvL().D6x();
                            LayoutInflater layoutInflater2 = r6.requireActivity().getLayoutInflater();
                            0qQ.A07(layoutInflater2);
                            View A012 = 2Su.A01(layoutInflater2, (ViewGroup.LayoutParams) null, viewGroup, R.layout.fragment_direct_message_thread, false, true);
                            if (r3.A12 == "follow_button") {
                                A012.setVisibility(8);
                            }
                            C332697Wa r1 = r3.A0p;
                            C333517Zg r03 = r3.A08;
                            if (r03 != null) {
                                r1.D70(r03);
                                C332157Tw r72 = r3.A0j;
                                AnonymousClass7UO r62 = r72.A0H;
                                0qQ.A0B(A012, 0);
                                r62.A04 = 2b1.A01(A012.requireViewById(R.id.direct_thread_new_message_indicator_avatar_view), false, false);
                                if (!182.A06(0Tu.A05, r62.A08, 36318058775451483L)) {
                                    C252063oV r04 = r62.A04;
                                    if (r04 == null) {
                                        str2 = "newMessageIndicatorContainerStub";
                                    } else {
                                        AnonymousClass7UO.A00(r04, r62);
                                    }
                                }
                                AnonymousClass7UW r73 = r72.A0C;
                                r73.A00 = new C330447Mu(r73.A03, r73.A04, r73.A06, (C333517Zg) r73.A07.get());
                                C333517Zg r05 = r3.A08;
                                if (r05 != null) {
                                    r10.A02 = Boolean.valueOf(r05.C6l().CUO());
                                    r3.A0w.A03.A05();
                                    0fh.A00(-1908779022);
                                    AnonymousClass0fD.A09(351583067, A022);
                                    return A012;
                                }
                            }
                        }
                        0qQ.A0F(str2);
                        th = AnonymousClass00P.createAndThrow();
                    } else {
                        th = new IllegalStateException("Required value was null.");
                    }
                    throw th;
                } catch (Throwable th2) {
                    0fh.A00(-1236524574);
                    throw th2;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: finally extract failed */
    public final void onDestroy() {
        ScheduledFuture scheduledFuture;
        int A022 = AnonymousClass0fD.A02(-576598005);
        super.onDestroy();
        AnonymousClass7TI r5 = this.A00;
        if (r5 == null) {
            0qQ.A0F("threadController");
            throw AnonymousClass00P.createAndThrow();
        }
        0fh.A01("DirectThreadController.onDestroy", -1584257124);
        try {
            C333517Zg r0 = r5.A08;
            if (r0 != null) {
                AnonymousClass7S7 C6l = r0.C6l();
                if (C6l.CdE()) {
                    C6l.C6O();
                    if (!C6l.C6O().isEmpty() && C6l.C6O().size() <= 1) {
                        String str = (String) C6l.C6O().get(0);
                        1Av A002 = 1Au.A00(r5.A0d);
                        0qQ.A0A(str);
                        0qQ.A0B(str, 0);
                        0xa r2 = A002.A01;
                        int i = r2.getInt(002.A0R("kindness_reminder_prefix/", str), 0);
                        0xY AR4 = r2.AR4();
                        AR4.E5Z(002.A0R("kindness_reminder_prefix/", str), i + 1);
                        AR4.apply();
                    }
                }
                boolean z = true;
                boolean z2 = false;
                if (!"direct_message_search".equals(r5.A12)) {
                    z2 = true;
                }
                C332157Tw r8 = r5.A0j;
                AnonymousClass7L2 r02 = r8.A0M.A04;
                if (r02 != null && z2 && r02.A0A) {
                    C331277Qg.A06.clear();
                }
                C333517Zg r03 = r5.A08;
                if (r03 != null) {
                    r03.onDestroy();
                    C333517Zg r04 = r5.A08;
                    if (r04 != null) {
                        r04.AvL().D8R(new C67536MpV(r5), r04.C6l().AfV());
                        C333517Zg r05 = r5.A08;
                        if (r05 != null) {
                            r05.C62().D8Q(AnonymousClass7TI.A02(r5));
                            C333517Zg r06 = r5.A08;
                            if (r06 != null) {
                                AnonymousClass7ZY BSN = r06.BSN();
                                BSN.Ehm(false);
                                BSN.EdY(false);
                                r5.A0S.removeCallbacksAndMessages((Object) null);
                                r5.A0c.A01();
                                r5.A0b.A01();
                                r5.A0p.onDestroy();
                                AnonymousClass7UH r12 = r8.A0P;
                                Set<String> set = r12.A04;
                                for (String hashCode : set) {
                                    r12.A01.markerEnd(r12.A00, hashCode.hashCode(), 4);
                                }
                                set.clear();
                                r12.A03.clear();
                                C333517Zg r07 = r5.A08;
                                if (r07 != null) {
                                    if (r07.C6l().C6Q().A0n) {
                                        UserSession userSession = r5.A0d;
                                        C72200OyM A003 = C72200OyM.A00(userSession);
                                        boolean z3 = false;
                                        if (A003.A00 != null) {
                                            z3 = true;
                                        }
                                        C72208OyY A004 = C72208OyY.A00(userSession);
                                        if (!z3) {
                                            A004.A07(C69495Nmd.ABANDON);
                                        } else {
                                            OO3 oo3 = A004.A01;
                                            if (!(oo3 == null || (scheduledFuture = oo3.A09) == null)) {
                                                scheduledFuture.cancel(true);
                                            }
                                        }
                                        C67089Mi7.A00(userSession, false).A03();
                                        A003.A02("thread_deeplinking");
                                    }
                                    r5.A0e.onDestroy();
                                    UserSession userSession2 = r5.A0d;
                                    userSession2.A03(C332807Wl.class);
                                    ExecutorService executorService = Q01.A00;
                                    if (executorService != null) {
                                        executorService.shutdownNow();
                                    }
                                    Q01.A00 = null;
                                    AnonymousClass7YT.A00(userSession2).A07();
                                    if (182.A06(0Tu.A06, userSession2, 36325287201354565L)) {
                                        C69843Nt7.A00(r5.A0V, userSession2).A00.clear();
                                    }
                                    AnonymousClass7S2 r1 = r5.A0k.A09;
                                    0h9 r7 = r5.A0U.mLifecycleRegistry;
                                    0qQ.A07(r7);
                                    for (C331647Ru A07 : r1.A00) {
                                        A07.A07(r7);
                                    }
                                    AnonymousClass7UY r72 = r8.A0G;
                                    AnonymousClass7S7 C6l2 = ((C333517Zg) r72.A06.invoke()).C6l();
                                    if (C6l2.CWe()) {
                                        C270264gS r08 = (C270264gS) r72.A05.getValue();
                                        String C6C = C6l2.C6C();
                                        if (C6C != null) {
                                            r08.A02.remove(C6C);
                                        }
                                    }
                                    C333517Zg r09 = r5.A08;
                                    if (r09 != null) {
                                        C254783t2 C6c = r09.C6l().C6c();
                                        0qQ.A07(C6c);
                                        if (AnonymousClass6W3.A07(C6c)) {
                                            z = false;
                                        }
                                        C63878LAh A005 = C331317Qk.A00(userSession2, z);
                                        if (A005 != null) {
                                            A005.A00 = null;
                                            AnonymousClass19S A023 = 19E.A02(AnonymousClass12T.A00.AOJ(837858400, 3));
                                            1Eo.A05(19B.A00, new MFR(A005, (AnonymousClass4D7) null, 15), A023);
                                        }
                                        r5.A0T.A01 = null;
                                        AnonymousClass7IC.A00(userSession2).AHU();
                                        C305926Kc.A00(r5);
                                        0fh.A00(-1886563064);
                                        AnonymousClass0fD.A09(255481381, A022);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        } catch (Throwable th) {
            0fh.A00(1127734494);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onDestroyView() {
        Throwable th;
        String str;
        RecyclerView recyclerView;
        int A022 = AnonymousClass0fD.A02(-1547185080);
        super.onDestroyView();
        AnonymousClass7TI r4 = this.A00;
        if (r4 == null) {
            0qQ.A0F("threadController");
            throw AnonymousClass00P.createAndThrow();
        }
        0fh.A01("DirectThreadController.onDestroyView", -1387147144);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("direct_thread_fragment_request_code", r4.A01);
            AnonymousClass4DH r5 = r4.A0U;
            r5.requireActivity().getSupportFragmentManager().A0z("direct_thread_exit_request_key", bundle);
            r4.A0p.onDestroyView();
            C333517Zg r0 = r4.A08;
            if (r0 == null) {
                str = "clientInfra";
            } else {
                r0.AvL().onDestroyView();
                C332157Tw r8 = r4.A0j;
                AnonymousClass7L7 r02 = r8.A02;
                if (r02 != null) {
                    r02.A00.A01();
                    r4.A0e.EEH(r4.A0g);
                    ViewGroup viewGroup = r4.A03;
                    if (viewGroup != null) {
                        C71392co r03 = C315596kB.A02;
                        C294975nL.A01(viewGroup, 0).A0G();
                        RecyclerView recyclerView2 = r4.A04;
                        str = "messageRecyclerView";
                        if (recyclerView2 != null) {
                            recyclerView2.setAdapter((2Rw) null);
                            UserSession userSession = r4.A0d;
                            1Ng A002 = AnonymousClass1Nd.A00(userSession);
                            A002.A02(r4.A0Z, AnonymousClass7O4.class);
                            A002.A02(r4.A0a, AnonymousClass7O5.class);
                            if (r4.A0J) {
                                AnonymousClass1Nd.A00(userSession).A02(r4.A0X, AY3.class);
                            }
                            AnonymousClass7UO r1 = r8.A0H;
                            2cs r04 = r1.A02;
                            if (r04 != null) {
                                r04.A00();
                            }
                            r1.A02 = null;
                            r1.A01 = null;
                            r1.A03 = null;
                            r1.A05 = null;
                            C229402nK r12 = r4.A0C;
                            if (r12 != null) {
                                RecyclerView recyclerView3 = r4.A04;
                                if (recyclerView3 != null) {
                                    recyclerView3.A16(r12);
                                }
                            }
                            r5.unregisterLifecycleListener(r4.A0C);
                            r4.A0C = null;
                            AnonymousClass7UW r10 = r8.A0C;
                            C330447Mu r13 = r10.A00;
                            if (r13 != null) {
                                r13.A0N.removeCallbacksAndMessages((Object) null);
                                r13.A0I = null;
                                r13.A0F = null;
                                r13.A0E = null;
                                r13.A0B = null;
                                r13.A08 = null;
                                r13.A0D = null;
                                r13.A0C = null;
                                r13.A0K = null;
                                r13.A02 = null;
                                r13.A0J = null;
                            }
                            r10.A00 = null;
                            C330437Mt r102 = r4.A07;
                            if (r102 != null) {
                                r102.A00();
                                r102.A0D.clear();
                                r102.A03 = null;
                                C249403jg r14 = r102.A00;
                                if (!(r14 == null || (recyclerView = r102.A01) == null)) {
                                    recyclerView.A16(r14);
                                }
                                r102.A01 = null;
                            }
                            if (AnonymousClass4AJ.A0E(userSession)) {
                                0xY AR4 = 1Au.A00(userSession).A01.AR4();
                                AR4.E5T(C66579MXk.A00(864), false);
                                AR4.apply();
                            }
                            0qQ.A0B(userSession, 0);
                            0Tu r11 = 0Tu.A05;
                            if (182.A06(r11, userSession, 36327739627813531L)) {
                                C3018660j.A01(userSession).A0B.clear();
                            }
                            AnonymousClass7UL r9 = r8.A0N;
                            C330737Nz r05 = r9.A01;
                            if (r05 != null) {
                                r05.A01();
                            }
                            r9.A01 = null;
                            r9.A04.removeCallbacksAndMessages((Object) null);
                            if (182.A06(r11, r9.A05, 36324677316325600L)) {
                                r9.A07.A08();
                                if (r9.A00 != null) {
                                    Choreographer.getInstance().removeFrameCallback(r9.A00);
                                    r9.A00 = null;
                                }
                            }
                            AnonymousClass5D7 A003 = AnonymousClass5D5.A00(userSession);
                            Map map = A003.A02;
                            for (Map.Entry value : map.entrySet()) {
                                A003.A01.markerEnd(814299525, ((C70688OGj) value.getValue()).A02, 4);
                            }
                            map.clear();
                            A003.A04.clear();
                            AnonymousClass7I4.A00(userSession).A01(AnonymousClass05K.A0C);
                            AnonymousClass7U1 r92 = r8.A0M;
                            C262424Dq r15 = r92.A02;
                            C262364Dk r06 = r92.A03;
                            if (!(r06 == null || r15 == null)) {
                                r06.A02(r15);
                                r92.A03 = null;
                            }
                            C331107Po.A00(userSession).onExitThreadView();
                            r8.A0G.A00 = null;
                            0Tu r7 = 0Tu.A06;
                            if (182.A06(r7, userSession, 36311569076126302L) && 182.A06(r7, userSession, 36311569077305968L)) {
                                Activity rootActivity = r5.getRootActivity();
                                if (rootActivity != null) {
                                    C226122ff.A02(rootActivity, r4.A10);
                                } else {
                                    th = new IllegalStateException("Required value was null.");
                                    throw th;
                                }
                            }
                            0fh.A00(1858677084);
                            AnonymousClass0fD.A09(727651896, A022);
                            return;
                        }
                    } else {
                        th = new IllegalStateException("Required value was null.");
                        throw th;
                    }
                } else {
                    str = "sendController";
                }
            }
            0qQ.A0F(str);
            th = AnonymousClass00P.createAndThrow();
            throw th;
        } catch (Throwable th2) {
            0fh.A00(1249542897);
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onPause() {
        boolean z;
        DirectMessageIdentifier directMessageIdentifier;
        String str;
        int A022 = AnonymousClass0fD.A02(-150126442);
        C273474md.super.onPause();
        AnonymousClass7TI r7 = this.A00;
        if (r7 == null) {
            0qQ.A0F("threadController");
            throw AnonymousClass00P.createAndThrow();
        }
        0fh.A01("DirectThreadController.onPause", -523755699);
        try {
            C333517Zg r0 = r7.A08;
            if (r0 != null) {
                r0.AvL().onPause();
                r7.A0p.onPause();
                AnonymousClass9H3 r3 = r7.A0x;
                18g r1 = r3.A08;
                C64331Jv r02 = r1.A05;
                if (r02 != null) {
                    z = r02.A0H;
                } else {
                    z = false;
                }
                if (!z) {
                    r3.A01(AnonymousClass9H3.A0B);
                    C64331Jv r03 = r1.A05;
                    if (r03 != null) {
                        r03.A0H = false;
                    }
                }
                UserSession userSession = r7.A0d;
                0qQ.A0B(userSession, 0);
                IGFOAMessagingThreadViewNavigationLogger logger = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE.getLogger(userSession);
                if (logger != null) {
                    DirectThreadKey A0N = r7.A0N();
                    if (A0N != null) {
                        str = A0N.A00;
                    } else {
                        str = null;
                    }
                    logger.maybeEndFlowCancel(str, "DirectThreadController.onPause");
                }
                RecyclerView recyclerView = r7.A04;
                String str2 = "messageRecyclerView";
                if (recyclerView != null) {
                    recyclerView.A16(r7.A0z);
                    C332157Tw r5 = r7.A0j;
                    AnonymousClass7UP r12 = r5.A0K;
                    RecyclerView recyclerView2 = r7.A04;
                    if (recyclerView2 != null) {
                        C252553pI r6 = recyclerView2.A0D;
                        if (r6 != null && (r6 instanceof DirectMessageListLinearLayoutManager)) {
                            AnonymousClass7UQ r13 = r12.A02;
                            0qQ.A0B(r13, 0);
                            ((DirectMessageListLinearLayoutManager) r6).A00.A03.add(r13);
                        }
                        AnonymousClass7UW r8 = r5.A0C;
                        C330447Mu r04 = r8.A00;
                        if (r04 != null) {
                            r04.A0N.removeCallbacksAndMessages((Object) null);
                        }
                        if (((Boolean) r8.A0B.getValue()).booleanValue()) {
                            AnonymousClass1Nd.A00(r8.A06).A02(r8.A05, AnonymousClass7QD.class);
                        }
                        2Dd.A00(userSession).A00.remove(r7);
                        if (r5.A01 != null) {
                            AnonymousClass1Nd.A00(userSession).A02(r7.A0Y, FWO.class);
                        }
                        C242853Wg.A00(userSession).A00(r7);
                        if (r7.A0v.A00()) {
                            C333517Zg r05 = r7.A08;
                            if (r05 != null) {
                                ((P27) r05).A01.A01();
                            }
                        }
                        C331037Pg r52 = r5.A06;
                        if (r52 != null) {
                            OFQ ofq = r52.A02;
                            if (ofq == null || (directMessageIdentifier = ofq.A01) == null || !r52.A0D() || !182.A06(0Tu.A05, userSession, 36319218412559383L)) {
                                r52.A0A("fragment_paused");
                            } else {
                                C333517Zg r06 = r7.A08;
                                if (r06 != null) {
                                    if (r06.BSN().CMC(directMessageIdentifier.A02) != -1) {
                                        Context requireContext = r7.A0U.requireContext();
                                        C333517Zg r07 = r7.A08;
                                        if (r07 != null) {
                                            String C6f = r07.C6l().C6f();
                                            C333517Zg r08 = r7.A08;
                                            if (r08 != null) {
                                                String A08 = AnonymousClass48N.A08(requireContext, userSession, C6f, r08.C6l().BRZ(), false);
                                                0qQ.A07(A08);
                                                C293025ju A002 = C293015jt.A00(userSession);
                                                A002.A02 = A08;
                                                A002.A00 = r52;
                                                C293025ju.A01(A002);
                                            }
                                        }
                                    }
                                }
                            }
                            0fh.A00(538485235);
                            AnonymousClass0fD.A09(-823789378, A022);
                            return;
                        }
                        str2 = "audioPlayer";
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        } catch (Throwable th) {
            0fh.A00(858524568);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03dc A[Catch:{ all -> 0x04a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0434 A[Catch:{ all -> 0x04a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0456 A[Catch:{ all -> 0x04a8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r18 = this;
            r0 = 1967973268(0x754ce394, float:2.5972763E32)
            int r11 = X.AnonymousClass0fD.A02(r0)
            r1 = r18
            X.9HS r0 = r1.A01
            r10 = 0
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "navigationPerfLogger"
        L_0x0010:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0018:
            X.34p r0 = r0.A05
            r0.A08(r10)
            super.onResume()
            X.7TI r6 = r1.A00
            if (r6 != 0) goto L_0x0027
            java.lang.String r0 = "threadController"
            goto L_0x0010
        L_0x0027:
            java.lang.String r1 = "DirectThreadController.onResume"
            r0 = -1804095440(0xffffffff9477b030, float:-1.250506E-26)
            X.0fh.A01(r1, r0)
            X.6ST r0 = r6.A0D     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0036
            r0.dismiss()     // Catch:{ all -> 0x04a8 }
        L_0x0036:
            X.7Tw r5 = r6.A0j     // Catch:{ all -> 0x04a8 }
            X.7UY r3 = r5.A0G     // Catch:{ all -> 0x04a8 }
            X.0sa r0 = r3.A06     // Catch:{ all -> 0x04a8 }
            java.lang.Object r7 = r0.invoke()     // Catch:{ all -> 0x04a8 }
            X.7Zg r7 = (X.C333517Zg) r7     // Catch:{ all -> 0x04a8 }
            com.instagram.common.session.UserSession r0 = r3.A03     // Catch:{ all -> 0x04a8 }
            r4 = 0
            boolean r0 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r0, r4)     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0092
            X.7S7 r8 = r7.C6l()     // Catch:{ all -> 0x04a8 }
            boolean r0 = r8.CWe()     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0092
            X.0eM r0 = r3.A05     // Catch:{ all -> 0x04a8 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x04a8 }
            X.4gS r1 = (X.C270264gS) r1     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = r8.C6C()     // Catch:{ all -> 0x04a8 }
            boolean r0 = r1.A00(r0)     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0092
            X.NIF r2 = r3.A00     // Catch:{ all -> 0x04a8 }
            if (r2 != 0) goto L_0x0087
            java.lang.String r1 = r3.A04     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = r8.C6C()     // Catch:{ all -> 0x04a8 }
            X.NIF r2 = X.C70001Nvf.A00(r1, r0)     // Catch:{ all -> 0x04a8 }
            r3.A00 = r2     // Catch:{ all -> 0x04a8 }
            r1 = 5
            X.PlY r0 = new X.PlY     // Catch:{ all -> 0x04a8 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x04a8 }
            r2.A04 = r0     // Catch:{ all -> 0x04a8 }
            r1 = 6
            X.Phe r0 = new X.Phe     // Catch:{ all -> 0x04a8 }
            r0.<init>(r1, r3, r7)     // Catch:{ all -> 0x04a8 }
            r2.A03 = r0     // Catch:{ all -> 0x04a8 }
        L_0x0087:
            android.app.Dialog r0 = r2.A01     // Catch:{ all -> 0x04a8 }
            r1 = 1
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.isShowing()     // Catch:{ all -> 0x04a8 }
            if (r0 != r1) goto L_0x0099
        L_0x0092:
            X.3tH r0 = r6.A0v     // Catch:{ all -> 0x04a8 }
            boolean r17 = r0.A00()     // Catch:{ all -> 0x04a8 }
            goto L_0x00a5
        L_0x0099:
            X.4DH r0 = r3.A01     // Catch:{ all -> 0x04a8 }
            X.0hq r1 = r0.getParentFragmentManager()     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = "lockedChat"
            r2.A0B(r1, r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x0092
        L_0x00a5:
            java.lang.String r16 = "clientInfra"
            if (r17 == 0) goto L_0x0132
            X.7Zg r2 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r2 == 0) goto L_0x043a
            X.P27 r2 = (X.P27) r2     // Catch:{ all -> 0x04a8 }
            r0 = 17
            X.9Km r14 = new X.9Km     // Catch:{ all -> 0x04a8 }
            r14.<init>(r6, r0)     // Catch:{ all -> 0x04a8 }
            r0 = 18
            X.9Km r13 = new X.9Km     // Catch:{ all -> 0x04a8 }
            r13.<init>(r6, r0)     // Catch:{ all -> 0x04a8 }
            r0 = 19
            X.9Km r9 = new X.9Km     // Catch:{ all -> 0x04a8 }
            r9.<init>(r6, r0)     // Catch:{ all -> 0x04a8 }
            r0 = 20
            X.9Km r3 = new X.9Km     // Catch:{ all -> 0x04a8 }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x04a8 }
            com.instagram.common.session.UserSession r8 = r2.A02     // Catch:{ all -> 0x04a8 }
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x04a8 }
            r0 = 36317994346944222(0x810706000116de, double:3.0309840936081003E-306)
            boolean r0 = X.182.A06(r7, r8, r0)     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x00ee
            X.1a8 r7 = r2.A01     // Catch:{ all -> 0x04a8 }
            X.7Rg r0 = r2.A04     // Catch:{ all -> 0x04a8 }
            X.1aU r1 = r0.BJJ()     // Catch:{ all -> 0x04a8 }
            X.1aV r0 = r2.A07     // Catch:{ all -> 0x04a8 }
            r7.A02(r1, r0)     // Catch:{ all -> 0x04a8 }
            X.PAS r1 = r2.A00     // Catch:{ all -> 0x04a8 }
            X.PCQ r0 = r2.A05     // Catch:{ all -> 0x04a8 }
            r1.A02(r7, r0)     // Catch:{ all -> 0x04a8 }
        L_0x00ee:
            X.1a8 r7 = r2.A01     // Catch:{ all -> 0x04a8 }
            X.7Rg r12 = r2.A04     // Catch:{ all -> 0x04a8 }
            X.1aS r8 = r12.A01     // Catch:{ all -> 0x04a8 }
            X.1aU r1 = r8.A0D()     // Catch:{ all -> 0x04a8 }
            X.Auq r0 = new X.Auq     // Catch:{ all -> 0x04a8 }
            r0.<init>(r14)     // Catch:{ all -> 0x04a8 }
            r7.A02(r1, r0)     // Catch:{ all -> 0x04a8 }
            X.1aU r1 = r12.C6S()     // Catch:{ all -> 0x04a8 }
            X.Auq r0 = new X.Auq     // Catch:{ all -> 0x04a8 }
            r0.<init>(r13)     // Catch:{ all -> 0x04a8 }
            r7.A02(r1, r0)     // Catch:{ all -> 0x04a8 }
            X.1aS r0 = r12.A06     // Catch:{ all -> 0x04a8 }
            X.1aU r1 = r0.A0D()     // Catch:{ all -> 0x04a8 }
            X.Auq r0 = new X.Auq     // Catch:{ all -> 0x04a8 }
            r0.<init>(r9)     // Catch:{ all -> 0x04a8 }
            r7.A02(r1, r0)     // Catch:{ all -> 0x04a8 }
            X.1aS r1 = r12.A03     // Catch:{ all -> 0x04a8 }
            X.Auq r0 = new X.Auq     // Catch:{ all -> 0x04a8 }
            r0.<init>(r3)     // Catch:{ all -> 0x04a8 }
            r7.A02(r1, r0)     // Catch:{ all -> 0x04a8 }
            X.1aU r3 = r8.A0D()     // Catch:{ all -> 0x04a8 }
            X.Acv r1 = r2.A03     // Catch:{ all -> 0x04a8 }
            X.Aur r0 = new X.Aur     // Catch:{ all -> 0x04a8 }
            r0.<init>(r1)     // Catch:{ all -> 0x04a8 }
            r7.A02(r3, r0)     // Catch:{ all -> 0x04a8 }
        L_0x0132:
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r7 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.7SD r1 = r7.C6Q()     // Catch:{ all -> 0x04a8 }
            com.instagram.common.session.UserSession r3 = r6.A0d     // Catch:{ all -> 0x04a8 }
            X.3t2 r0 = r7.C6c()     // Catch:{ all -> 0x04a8 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x04a8 }
            boolean r0 = r0 instanceof X.C254773t1     // Catch:{ all -> 0x04a8 }
            X.7Kc r0 = X.C329737Ka.A01(r3, r1, r0)     // Catch:{ all -> 0x04a8 }
            boolean r0 = r0.CdB(r3, r7)     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x016e
            X.1a8 r2 = r6.A0c     // Catch:{ all -> 0x04a8 }
            X.1aU r1 = r7.C6S()     // Catch:{ all -> 0x04a8 }
            X.AYX r0 = new X.AYX     // Catch:{ all -> 0x04a8 }
            r0.<init>(r6)     // Catch:{ all -> 0x04a8 }
            X.1aU r0 = r1.A0L(r0)     // Catch:{ all -> 0x04a8 }
            X.1aU r1 = r0.A0D()     // Catch:{ all -> 0x04a8 }
            X.Ahp r0 = new X.Ahp     // Catch:{ all -> 0x04a8 }
            r0.<init>(r6)     // Catch:{ all -> 0x04a8 }
            r2.A02(r1, r0)     // Catch:{ all -> 0x04a8 }
        L_0x016e:
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S9 r0 = r0.AvL()     // Catch:{ all -> 0x04a8 }
            r0.onResume()     // Catch:{ all -> 0x04a8 }
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7ZY r0 = r0.BSN()     // Catch:{ all -> 0x04a8 }
            r0.EEb()     // Catch:{ all -> 0x04a8 }
            X.2De r0 = X.2Dd.A00(r3)     // Catch:{ all -> 0x04a8 }
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x04a8 }
            boolean r0 = r1.contains(r6)     // Catch:{ all -> 0x04a8 }
            if (r0 != 0) goto L_0x0193
            r1.add(r6)     // Catch:{ all -> 0x04a8 }
        L_0x0193:
            java.lang.String r2 = r6.A0F     // Catch:{ all -> 0x04a8 }
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            java.lang.String r1 = r0.C6C()     // Catch:{ all -> 0x04a8 }
            if (r2 == 0) goto L_0x0226
            java.lang.String r0 = r6.A0F     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0226
            X.1aw r0 = X.1aw.A00     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x048f
            r0.A00(r3, r2)     // Catch:{ all -> 0x04a8 }
        L_0x01ae:
            X.OKL r0 = r5.A01     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x01bd
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)     // Catch:{ all -> 0x04a8 }
            java.lang.Class<X.FWO> r1 = X.FWO.class
            X.1wn r0 = r6.A0Y     // Catch:{ all -> 0x04a8 }
            r2.A01(r0, r1)     // Catch:{ all -> 0x04a8 }
        L_0x01bd:
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.7SD r0 = r0.C6Q()     // Catch:{ all -> 0x04a8 }
            boolean r0 = r0.A0o     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x026a
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.7SD r0 = r0.C6Q()     // Catch:{ all -> 0x04a8 }
            boolean r0 = r0.A13     // Catch:{ all -> 0x04a8 }
            if (r0 != 0) goto L_0x026a
            X.7TN r7 = r6.A0T     // Catch:{ all -> 0x04a8 }
            java.lang.String r13 = r6.A12     // Catch:{ all -> 0x04a8 }
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.7SD r8 = r0.C6Q()     // Catch:{ all -> 0x04a8 }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = r7.A01     // Catch:{ all -> 0x04a8 }
            if (r0 != 0) goto L_0x01fe
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04a8 }
            r7.A01 = r0     // Catch:{ all -> 0x04a8 }
        L_0x01fe:
            long r0 = r7.A00     // Catch:{ all -> 0x04a8 }
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0210
            r1 = 49
            X.MM7 r0 = new X.MM7     // Catch:{ all -> 0x04a8 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x04a8 }
            X.AnonymousClass7TN.A00(r7, r0)     // Catch:{ all -> 0x04a8 }
        L_0x0210:
            java.util.List r0 = r8.A0b     // Catch:{ all -> 0x04a8 }
            java.lang.Object r9 = X.00k.A0J(r0)     // Catch:{ all -> 0x04a8 }
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9     // Catch:{ all -> 0x04a8 }
            X.1QP r2 = r7.A02     // Catch:{ all -> 0x04a8 }
            r1 = 895693045(0x356330f5, float:8.463533E-7)
            java.lang.String r0 = "UGC_CHAT_FUNNEL"
            long r0 = r2.flowStartForMarker(r1, r0, r4)     // Catch:{ all -> 0x04a8 }
            r7.A00 = r0     // Catch:{ all -> 0x04a8 }
            goto L_0x0231
        L_0x0226:
            if (r1 == 0) goto L_0x01ae
            X.1aw r0 = X.1aw.A00     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x041d
            r0.A00(r3, r1)     // Catch:{ all -> 0x04a8 }
            goto L_0x01ae
        L_0x0231:
            if (r13 != 0) goto L_0x0235
            java.lang.String r13 = "unknown"
        L_0x0235:
            java.lang.String r12 = "thread_entry_point"
            r2.flowAnnotate(r0, r12, r13)     // Catch:{ all -> 0x04a8 }
            long r0 = r7.A00     // Catch:{ all -> 0x04a8 }
            java.lang.String r13 = r7.A01     // Catch:{ all -> 0x04a8 }
            java.lang.String r12 = "thread_viewer_session_id"
            r2.flowAnnotate(r0, r12, r13)     // Catch:{ all -> 0x04a8 }
            if (r9 == 0) goto L_0x0261
            long r0 = r7.A00     // Catch:{ all -> 0x04a8 }
            java.lang.String r13 = r9.getId()     // Catch:{ all -> 0x04a8 }
            java.lang.String r12 = "ai_agent_persona_id"
            r2.flowAnnotate(r0, r12, r13)     // Catch:{ all -> 0x04a8 }
            long r0 = r7.A00     // Catch:{ all -> 0x04a8 }
            X.4Cl r9 = r9.A03     // Catch:{ all -> 0x04a8 }
            com.instagram.api.schemas.IGAIAgentType r9 = r9.AaX()     // Catch:{ all -> 0x04a8 }
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04a8 }
            java.lang.String r9 = "ai_agent_type"
            r2.flowAnnotate(r0, r9, r12)     // Catch:{ all -> 0x04a8 }
        L_0x0261:
            long r0 = r7.A00     // Catch:{ all -> 0x04a8 }
            int r8 = r8.A08     // Catch:{ all -> 0x04a8 }
            java.lang.String r7 = "thread_subtype"
            r2.flowAnnotate(r0, r7, r8)     // Catch:{ all -> 0x04a8 }
        L_0x026a:
            androidx.recyclerview.widget.RecyclerView r1 = r6.A04     // Catch:{ all -> 0x04a8 }
            java.lang.String r2 = "messageRecyclerView"
            if (r1 == 0) goto L_0x0419
            X.3je r0 = r6.A0z     // Catch:{ all -> 0x04a8 }
            r1.A15(r0)     // Catch:{ all -> 0x04a8 }
            androidx.recyclerview.widget.RecyclerView r1 = r6.A04     // Catch:{ all -> 0x04a8 }
            if (r1 == 0) goto L_0x0419
            X.7On r0 = new X.7On     // Catch:{ all -> 0x04a8 }
            r0.<init>(r6)     // Catch:{ all -> 0x04a8 }
            r1.A15(r0)     // Catch:{ all -> 0x04a8 }
            X.7UP r1 = r5.A0K     // Catch:{ all -> 0x04a8 }
            androidx.recyclerview.widget.RecyclerView r0 = r6.A04     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0419
            X.3pI r2 = r0.A0D     // Catch:{ all -> 0x04a8 }
            if (r2 == 0) goto L_0x029d
            boolean r0 = r2 instanceof com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x029d
            com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager r2 = (com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager) r2     // Catch:{ all -> 0x04a8 }
            X.7UQ r1 = r1.A02     // Catch:{ all -> 0x04a8 }
            X.0qQ.A0B(r1, r4)     // Catch:{ all -> 0x04a8 }
            X.7N1 r0 = r2.A00     // Catch:{ all -> 0x04a8 }
            java.util.HashSet r0 = r0.A03     // Catch:{ all -> 0x04a8 }
            r0.add(r1)     // Catch:{ all -> 0x04a8 }
        L_0x029d:
            X.7Wa r0 = r6.A0p     // Catch:{ all -> 0x04a8 }
            r0.onResume()     // Catch:{ all -> 0x04a8 }
            X.7UW r7 = r5.A0C     // Catch:{ all -> 0x04a8 }
            X.0eM r0 = r7.A0B     // Catch:{ all -> 0x04a8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x04a8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x04a8 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x02bf
            com.instagram.common.session.UserSession r0 = r7.A06     // Catch:{ all -> 0x04a8 }
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)     // Catch:{ all -> 0x04a8 }
            java.lang.Class<X.7QD> r1 = X.AnonymousClass7QD.class
            X.1wn r0 = r7.A05     // Catch:{ all -> 0x04a8 }
            r2.A01(r0, r1)     // Catch:{ all -> 0x04a8 }
        L_0x02bf:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x04a8 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x04a8 }
            r1.<init>(r0)     // Catch:{ all -> 0x04a8 }
            X.7P5 r0 = new X.7P5     // Catch:{ all -> 0x04a8 }
            r0.<init>(r7)     // Catch:{ all -> 0x04a8 }
            r1.post(r0)     // Catch:{ all -> 0x04a8 }
            X.4DH r7 = r6.A0U     // Catch:{ all -> 0x04a8 }
            android.os.Bundle r0 = r7.requireArguments()     // Catch:{ all -> 0x04a8 }
            java.lang.String r1 = "DirectThreadFragment.ARGUMENT_OPEN_TO"
            int r9 = r0.getInt(r1, r4)     // Catch:{ all -> 0x04a8 }
            android.os.Bundle r0 = r7.requireArguments()     // Catch:{ all -> 0x04a8 }
            r0.remove(r1)     // Catch:{ all -> 0x04a8 }
            r12 = 3
            if (r9 == r12) goto L_0x02ec
            r0 = 4
            if (r9 == r0) goto L_0x02ec
            if (r9 == 0) goto L_0x0325
            goto L_0x031a
        L_0x02ec:
            X.7Ue r0 = r6.A0i     // Catch:{ all -> 0x04a8 }
            X.0eM r0 = r0.A0h     // Catch:{ all -> 0x04a8 }
            java.lang.Object r8 = r0.getValue()     // Catch:{ all -> 0x04a8 }
            X.7VX r8 = (X.AnonymousClass7VX) r8     // Catch:{ all -> 0x04a8 }
            X.4DH r13 = r8.A01     // Catch:{ all -> 0x04a8 }
            android.os.Bundle r1 = r13.requireArguments()     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = "DirectFragment.RTC_CALL_SOURCE"
            java.io.Serializable r2 = r1.getSerializable(r0)     // Catch:{ all -> 0x04a8 }
            if (r2 == 0) goto L_0x0410
            X.7Rj r2 = (X.C331537Rj) r2     // Catch:{ all -> 0x04a8 }
            android.os.Bundle r1 = r13.requireArguments()     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_COWATCH_ARGUMENTS"
            android.os.Parcelable r1 = r1.getParcelable(r0)     // Catch:{ all -> 0x04a8 }
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r1 = (com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments) r1     // Catch:{ all -> 0x04a8 }
            r0 = 0
            if (r9 != r12) goto L_0x0316
            r0 = 1
        L_0x0316:
            r8.A01(r10, r2, r1, r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x0325
        L_0x031a:
            java.lang.String r0 = "Invalid openToTarget target: "
            java.lang.String r1 = X.002.A0O(r0, r9)     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = "Invalid openToTarget"
            X.0wb.A03(r0, r1)     // Catch:{ all -> 0x04a8 }
        L_0x0325:
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.3t3 r1 = r0.CBU()     // Catch:{ all -> 0x04a8 }
            if (r1 == 0) goto L_0x0359
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            boolean r0 = r0.CWp()     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x034c
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7ZA r0 = r0.C62()     // Catch:{ all -> 0x04a8 }
            r0.Cm3(r1)     // Catch:{ all -> 0x04a8 }
        L_0x034c:
            if (r17 != 0) goto L_0x0359
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7ZA r0 = r0.C62()     // Catch:{ all -> 0x04a8 }
            r0.Cmn(r1)     // Catch:{ all -> 0x04a8 }
        L_0x0359:
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.3sy r0 = r0.AfV()     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x036a
            X.AnonymousClass7TI.A0B(r6, r0)     // Catch:{ all -> 0x04a8 }
        L_0x036a:
            X.2Dm r12 = X.2L2.A00(r3)     // Catch:{ all -> 0x04a8 }
            com.instagram.model.direct.DirectThreadKey r10 = r6.A0N()     // Catch:{ all -> 0x04a8 }
            X.2Dr r12 = (X.2Dr) r12     // Catch:{ all -> 0x04a8 }
            com.instagram.common.session.UserSession r9 = r12.A0A     // Catch:{ all -> 0x04a8 }
            r2 = 1
            if (r10 == 0) goto L_0x0390
            X.0Tu r8 = X.0Tu.A05     // Catch:{ all -> 0x04a8 }
            r0 = 36325579259458624(0x810dec00053440, double:3.0357808228241994E-306)
            boolean r0 = X.182.A06(r8, r9, r0)     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0390
            X.1aS r1 = r12.A07     // Catch:{ all -> 0x04a8 }
            X.JwK r0 = new X.JwK     // Catch:{ all -> 0x04a8 }
            r0.<init>((com.instagram.model.direct.DirectThreadKey) r10, (boolean) r4)     // Catch:{ all -> 0x04a8 }
            r1.accept(r0)     // Catch:{ all -> 0x04a8 }
        L_0x0390:
            X.3Wh r0 = X.C242853Wg.A00(r3)     // Catch:{ all -> 0x04a8 }
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x04a8 }
            r1.<init>(r6)     // Catch:{ all -> 0x04a8 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x04a8 }
            r0.add(r1)     // Catch:{ all -> 0x04a8 }
            androidx.fragment.app.FragmentActivity r7 = r7.requireActivity()     // Catch:{ all -> 0x04a8 }
            X.37E r0 = X.AnonymousClass37D.A00     // Catch:{ all -> 0x04a8 }
            X.37D r0 = r0.A01(r7)     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x03fd
            X.37F r0 = (X.AnonymousClass37F) r0     // Catch:{ all -> 0x04a8 }
            boolean r0 = r0.A0g     // Catch:{ all -> 0x04a8 }
            if (r0 != r2) goto L_0x03fd
            X.2Ep r0 = X.AnonymousClass7TI.A01(r6)     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x03ef
            boolean r0 = r0.COb()     // Catch:{ all -> 0x04a8 }
            if (r0 != r2) goto L_0x03ef
            X.0qQ.A0B(r3, r4)     // Catch:{ all -> 0x04a8 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x04a8 }
            r0 = 36324831935345040(0x810d3e00083190, double:3.035308212045536E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x03ef
            r0 = 2131100482(0x7f060342, float:1.7813347E38)
            int r0 = r7.getColor(r0)     // Catch:{ all -> 0x04a8 }
        L_0x03d3:
            X.AnonymousClass2uJ.A04(r7, r0)     // Catch:{ all -> 0x04a8 }
        L_0x03d6:
            X.7U1 r1 = r5.A0M     // Catch:{ all -> 0x04a8 }
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r5 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.7L2 r0 = r1.A04     // Catch:{ all -> 0x04a8 }
            r2 = 0
            if (r0 == 0) goto L_0x0405
            com.instagram.direct.model.DirectThreadThemeInfo r0 = r0.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x0405
            boolean r0 = r0.A0t     // Catch:{ all -> 0x04a8 }
            r1 = 0
            if (r0 != 0) goto L_0x0406
            goto L_0x0405
        L_0x03ef:
            X.7Ue r0 = r6.A0i     // Catch:{ all -> 0x04a8 }
            X.0eM r0 = r0.A0Q     // Catch:{ all -> 0x04a8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x04a8 }
            X.7Uf r0 = (X.C332247Uf) r0     // Catch:{ all -> 0x04a8 }
            r0.Cyt()     // Catch:{ all -> 0x04a8 }
            goto L_0x03d6
        L_0x03fd:
            r0 = 2131100482(0x7f060342, float:1.7813347E38)
            int r0 = r7.getColor(r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x03d3
        L_0x0405:
            r1 = 1
        L_0x0406:
            boolean r0 = r5.CVE()     // Catch:{ all -> 0x04a8 }
            if (r0 != 0) goto L_0x0429
            if (r1 == 0) goto L_0x0429
            r2 = 1
            goto L_0x0429
        L_0x0410:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x04a8 }
            r1.<init>(r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x049a
        L_0x0419:
            X.0qQ.A0F(r2)     // Catch:{ all -> 0x04a8 }
            goto L_0x048a
        L_0x041d:
            r0 = 982(0x3d6, float:1.376E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x04a8 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x04a8 }
            r1.<init>(r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x049a
        L_0x0429:
            X.AnonymousClass2uJ.A06(r7, r2)     // Catch:{ all -> 0x04a8 }
            X.7SM r0 = r6.A0n     // Catch:{ all -> 0x04a8 }
            X.9H7 r0 = r0.A00     // Catch:{ all -> 0x04a8 }
            X.LRE r1 = r0.A0A     // Catch:{ all -> 0x04a8 }
            if (r1 == 0) goto L_0x0441
            X.7L0 r0 = r1.A0B     // Catch:{ all -> 0x04a8 }
            if (r0 != 0) goto L_0x043e
            java.lang.String r16 = "theme"
        L_0x043a:
            X.0qQ.A0F(r16)     // Catch:{ all -> 0x04a8 }
            goto L_0x048a
        L_0x043e:
            r1.A02(r0)     // Catch:{ all -> 0x04a8 }
        L_0x0441:
            X.AnonymousClass7TI.A06(r6)     // Catch:{ all -> 0x04a8 }
            X.9HS r0 = r6.A0w     // Catch:{ all -> 0x04a8 }
            X.34p r0 = r0.A05     // Catch:{ all -> 0x04a8 }
            r0.A05()     // Catch:{ all -> 0x04a8 }
            X.0qQ.A0B(r3, r4)     // Catch:{ all -> 0x04a8 }
            com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController r0 = com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE     // Catch:{ all -> 0x04a8 }
            com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLogger r2 = r0.getLogger(r3)     // Catch:{ all -> 0x04a8 }
            if (r2 == 0) goto L_0x049b
            X.7Pi r1 = X.C331077Pk.A02     // Catch:{ all -> 0x04a8 }
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.7SD r0 = r0.C6Q()     // Catch:{ all -> 0x04a8 }
            X.3Tu r0 = r0.A0H     // Catch:{ all -> 0x04a8 }
            boolean r0 = r1.A03(r3, r0)     // Catch:{ all -> 0x04a8 }
            r2.annotateIsInstamadillo(r0)     // Catch:{ all -> 0x04a8 }
            X.3t2 r0 = X.AnonymousClass7TI.A02(r6)     // Catch:{ all -> 0x04a8 }
            java.lang.String r0 = X.AnonymousClass4KK.A02(r0)     // Catch:{ all -> 0x04a8 }
            r2.annotateOpenThreadId(r0)     // Catch:{ all -> 0x04a8 }
            X.7Zg r0 = r6.A08     // Catch:{ all -> 0x04a8 }
            if (r0 == 0) goto L_0x043a
            X.7S7 r0 = r0.C6l()     // Catch:{ all -> 0x04a8 }
            X.7SD r0 = r0.C6Q()     // Catch:{ all -> 0x04a8 }
            boolean r0 = r0.A0x     // Catch:{ all -> 0x04a8 }
            r2.annotateIsVm(r0)     // Catch:{ all -> 0x04a8 }
            goto L_0x049b
        L_0x048a:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x049a
        L_0x048f:
            r0 = 982(0x3d6, float:1.376E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x04a8 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x04a8 }
            r1.<init>(r0)     // Catch:{ all -> 0x04a8 }
        L_0x049a:
            throw r1     // Catch:{ all -> 0x04a8 }
        L_0x049b:
            r0 = 1962900334(0x74ff7b6e, float:1.6193105E32)
            X.0fh.A00(r0)
            r0 = 1553787152(0x5c9ce910, float:3.5333081E17)
            X.AnonymousClass0fD.A09(r0, r11)
            return
        L_0x04a8:
            r1 = move-exception
            r0 = -333906593(0xffffffffec18fd5f, float:-7.3981294E26)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273474md.onResume():void");
    }

    /* JADX INFO: finally extract failed */
    public final void onStop() {
        DirectThreadThemeInfo directThreadThemeInfo;
        int A022 = AnonymousClass0fD.A02(-1794203931);
        C273474md.super.onStop();
        AnonymousClass7TI r4 = this.A00;
        if (r4 == null) {
            0qQ.A0F("threadController");
            throw AnonymousClass00P.createAndThrow();
        }
        0fh.A01("DirectThreadController.onStop", 263856781);
        try {
            FragmentActivity requireActivity = r4.A0U.requireActivity();
            AnonymousClass7U1 r1 = r4.A0j.A0M;
            if (r4.A08 != null) {
                AnonymousClass7L2 r0 = r1.A04;
                boolean z = false;
                if (r0 == null || (directThreadThemeInfo = r0.A08) == null || !directThreadThemeInfo.A0t) {
                    z = true;
                }
                AnonymousClass2uJ.A06(requireActivity, z);
                C333517Zg r02 = r4.A08;
                if (r02 != null) {
                    if (r02.C6l().C6Q().A0o) {
                        C333517Zg r03 = r4.A08;
                        if (r03 != null) {
                            if (!r03.C6l().C6Q().A13) {
                                AnonymousClass7TN r2 = r4.A0T;
                                AnonymousClass7TN.A00(r2, new MM7(r2, 49));
                            }
                        }
                    }
                    r4.A0p.onStop();
                    0fh.A00(1912493913);
                    AnonymousClass0fD.A09(1986258474, A022);
                    return;
                }
            }
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        } catch (Throwable th) {
            0fh.A00(104493528);
            throw th;
        }
    }
}
