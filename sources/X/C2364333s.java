package X;

import android.content.Context;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.TifuViewModel;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.33s  reason: invalid class name and case insensitive filesystem */
public abstract class C2364333s {
    public final C2364633v A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap(10);

    public final void A03(Object obj, Object obj2, Object obj3) {
        Object obj4 = obj;
        0qQ.A0B(obj, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("ComposePrepareBinder.prepare", -1565604060);
        }
        try {
            C262604Fd r0 = (C262604Fd) this.A01.get(obj);
            Object obj5 = obj3;
            if (r0 == null || !0qQ.A0K(r0.A01, obj3)) {
                this.A00.ATH(new AnonymousClass9MR(26, obj5, this, obj2, obj4));
            }
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(-1480263414);
            }
        }
    }

    public C2364333s(C2364633v r3) {
        0qQ.A0B(r3, 2);
        this.A00 = r3;
    }

    public final Object A01(Object obj) {
        Throwable th;
        int i;
        C299435v9 gXx;
        Object obj2 = obj;
        if (this instanceof C262584Fb) {
            C262584Fb r1 = (C262584Fb) this;
            C376459Ib r3 = (C376459Ib) obj2;
            0qQ.A0B(r3, 0);
            Context context = r1.A00;
            AnonymousClass4DU r8 = r1.A02;
            return ((C243273Yc) r3.A02).A02(context, new C246963fY(context), (1Xj) r3.A00, r8, (AnonymousClass3W1) r3.A01);
        }
        C2364233r r15 = (C2364233r) this;
        AnonymousClass9IV r32 = (AnonymousClass9IV) obj2;
        0qQ.A0B(r32, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("TifuNetegoComposeBinder.createPreparableForInput", -1463748435);
        }
        try {
            C274594oe r4 = (C274594oe) r32.A00;
            AnonymousClass5O4 r7 = (AnonymousClass5O4) r32.A01;
            Context context2 = r15.A00;
            if (Systrace.A0E(1)) {
                0fS.A01("TifuNetegoComposeBinder.createViewModel", -563474321);
            }
            try {
                UserSession userSession = r15.A02;
                AnonymousClass0iw r14 = r15.A01;
                AnonymousClass322 r33 = r15.A03;
                if (r4.B5J() == 1UQ.A0z) {
                    gXx = new C299425v8(r14, userSession);
                } else {
                    gXx = new C52572GXx(r14, userSession, 0oI.A0A(context2));
                }
                AnonymousClass0iw r20 = r14;
                TifuViewModel tifuViewModel = new TifuViewModel(context2, r20, userSession, r33, gXx, r4, r7, r15.A04);
                if (Systrace.A0E(1)) {
                    0fS.A00(-1780288082);
                }
                0sP r10 = new C377439Lv(3, tifuViewModel, r15);
                Object obj3 = new Object();
                if (Systrace.A0E(1)) {
                    0fS.A01("TifuNetegoComposeBinder.createPostNavigator", -195504707);
                }
                try {
                    AnonymousClass5vZ r82 = new AnonymousClass5vZ(r10, new AnonymousClass9MC(23, r15, obj3, tifuViewModel), new C377439Lv(2, tifuViewModel, r15));
                    if (Systrace.A0E(1)) {
                        0fS.A00(-1339519329);
                    }
                    if (Systrace.A0E(1)) {
                        0fS.A01("TifuNetegoComposeBinder.createEventHandler", -701410389);
                    }
                    Integer num = r4.A04;
                    0sP r12 = new C377259Ld(obj3, 28);
                    0sP r72 = new AnonymousClass9M5(46, r15, tifuViewModel);
                    0sP r6 = new AnonymousClass9M5(47, r15, tifuViewModel);
                    0sP r5 = new AnonymousClass9M5(48, r15, tifuViewModel);
                    0sP r42 = new AnonymousClass9M5(49, r15, tifuViewModel);
                    0sP r22 = r12;
                    0sP r23 = r72;
                    0sP r24 = r6;
                    0sP r25 = r5;
                    0sP r26 = r42;
                    AnonymousClass5vZ r19 = r82;
                    Integer num2 = num;
                    C299655vc r18 = new C299655vc(r19, r20, num2, r22, r23, r24, r25, r26, new C377439Lv(0, tifuViewModel, r15), new C377439Lv(1, tifuViewModel, r15), r10, new AnonymousClass9LZ(obj3, 31));
                    if (Systrace.A0E(1)) {
                        0fS.A00(-1409149923);
                    }
                    C376529Ii r13 = new C376529Ii(1, tifuViewModel, r82, r18, obj3, r10);
                    if (!Systrace.A0E(1)) {
                        return r13;
                    }
                    0fS.A00(1963902476);
                    return r13;
                } catch (Throwable th2) {
                    th = th2;
                    if (Systrace.A0E(1)) {
                        i = -1839332638;
                        0fS.A00(i);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (Systrace.A0E(1)) {
                    i = -1698922131;
                    0fS.A00(i);
                }
                throw th;
            }
        } catch (Throwable th4) {
            if (Systrace.A0E(1)) {
                0fS.A00(1756703051);
            }
            throw th4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x013e A[Catch:{ all -> 0x016d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.view.View r19, java.lang.Object r20, java.lang.Object r21, X.C62320sa r22) {
        /*
            r18 = this;
            r4 = r21
            r9 = r19
            r2 = 1
            r5 = r20
            X.0qQ.A0B(r5, r2)
            r6 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x001a
            r1 = -832239672(0xffffffffce6507c8, float:-9.606231E8)
            java.lang.String r0 = "ComposePrepareBinder.bind"
            X.0fS.A01(r0, r1)
        L_0x001a:
            r8 = r18
            java.util.concurrent.ConcurrentHashMap r3 = r8.A01     // Catch:{ all -> 0x016d }
            java.lang.Object r0 = r3.get(r5)     // Catch:{ all -> 0x016d }
            X.4Fd r0 = (X.C262604Fd) r0     // Catch:{ all -> 0x016d }
            if (r0 != 0) goto L_0x0076
            java.lang.Object r1 = r22.invoke()     // Catch:{ all -> 0x016d }
            java.lang.Object r15 = r8.A01(r4)     // Catch:{ all -> 0x016d }
            X.4Fd r0 = new X.4Fd     // Catch:{ all -> 0x016d }
            r0.<init>(r15, r1)     // Catch:{ all -> 0x016d }
            r3.put(r5, r0)     // Catch:{ all -> 0x016d }
        L_0x0036:
            r14 = r8
            boolean r0 = r8 instanceof X.C262584Fb     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x00c0
            X.4Fb r14 = (X.C262584Fb) r14     // Catch:{ all -> 0x016d }
            boolean r0 = r14.A07     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x00ab
            X.GWO r9 = (X.GWO) r9     // Catch:{ all -> 0x016d }
            boolean r0 = r14.A05     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0082
            X.0eM r0 = r14.A03     // Catch:{ all -> 0x016d }
            java.lang.Object r10 = r0.getValue()     // Catch:{ all -> 0x016d }
            android.view.Window r10 = (android.view.Window) r10     // Catch:{ all -> 0x016d }
            if (r10 == 0) goto L_0x0079
            androidx.fragment.app.Fragment r0 = r14.A01     // Catch:{ all -> 0x016d }
            X.07Z r11 = r0.getViewLifecycleOwner()     // Catch:{ all -> 0x016d }
            boolean r13 = r14.A06     // Catch:{ all -> 0x016d }
            X.07Z r12 = r0.getViewLifecycleOwner()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.savedstate.SavedStateRegistryOwner"
            X.0qQ.A0C(r12, r0)     // Catch:{ all -> 0x016d }
            X.0g9 r12 = (X.AnonymousClass0g9) r12     // Catch:{ all -> 0x016d }
            r3 = 922537067(0x36fccc6b, float:7.5339826E-6)
            r1 = 6
            X.9Lw r0 = new X.9Lw     // Catch:{ all -> 0x016d }
            r0.<init>(r1, r15, r14)     // Catch:{ all -> 0x016d }
            X.5PJ r14 = X.AnonymousClass5PI.A04(r0, r3, r2)     // Catch:{ all -> 0x016d }
            r9.setContentAllowingDetached(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x016d }
            goto L_0x0144
        L_0x0076:
            java.lang.Object r15 = r0.A00     // Catch:{ all -> 0x016d }
            goto L_0x0036
        L_0x0079:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x016d }
            r1.<init>(r0)     // Catch:{ all -> 0x016d }
            goto L_0x016c
        L_0x0082:
            boolean r0 = r14.A06     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0098
            r3 = 307014638(0x124cabee, float:6.458297E-28)
            r1 = 7
            X.9Lw r0 = new X.9Lw     // Catch:{ all -> 0x016d }
            r0.<init>(r1, r15, r14)     // Catch:{ all -> 0x016d }
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r3, r2)     // Catch:{ all -> 0x016d }
            r9.setContentWithReuse(r0)     // Catch:{ all -> 0x016d }
            goto L_0x0144
        L_0x0098:
            r3 = 1676932333(0x63f3f4ed, float:9.000415E21)
            r1 = 8
            X.9Lw r0 = new X.9Lw     // Catch:{ all -> 0x016d }
            r0.<init>(r1, r15, r14)     // Catch:{ all -> 0x016d }
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r3, r2)     // Catch:{ all -> 0x016d }
            r9.setContent(r0)     // Catch:{ all -> 0x016d }
            goto L_0x0144
        L_0x00ab:
            androidx.compose.ui.platform.ComposeView r9 = (androidx.compose.ui.platform.ComposeView) r9     // Catch:{ all -> 0x016d }
            r3 = 2003897548(0x77710ccc, float:4.8890746E33)
            r1 = 9
            X.9Lw r0 = new X.9Lw     // Catch:{ all -> 0x016d }
            r0.<init>(r1, r15, r14)     // Catch:{ all -> 0x016d }
            X.5PJ r0 = X.AnonymousClass5PI.A04(r0, r3, r2)     // Catch:{ all -> 0x016d }
            r9.setContent(r0)     // Catch:{ all -> 0x016d }
            goto L_0x0144
        L_0x00c0:
            X.33r r14 = (X.C2364233r) r14     // Catch:{ all -> 0x016d }
            X.9IV r4 = (X.AnonymousClass9IV) r4     // Catch:{ all -> 0x016d }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x00d2
            r1 = -1122972319(0xffffffffbd10cd61, float:-0.035352115)
            java.lang.String r0 = "TifuNetegoComposeBinder.bindToPreparable"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x016d }
        L_0x00d2:
            java.lang.Object r3 = r4.A00     // Catch:{ all -> 0x015f }
            X.4oe r3 = (X.C274594oe) r3     // Catch:{ all -> 0x015f }
            java.lang.Object r5 = r4.A01     // Catch:{ all -> 0x015f }
            X.5O4 r5 = (X.AnonymousClass5O4) r5     // Catch:{ all -> 0x015f }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x00e8
            r1 = -2120589363(0xffffffff819a5fcd, float:-5.6708133E-38)
            java.lang.String r0 = "TifuNetegoComposeBinder.bindTifuNetego"
            X.0fS.A01(r0, r1)     // Catch:{ all -> 0x015f }
        L_0x00e8:
            java.lang.Object r4 = r9.getTag()     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.tifu.TifuNetegoComposeBinder.Holder"
            X.0qQ.A0C(r4, r0)     // Catch:{ all -> 0x0151 }
            X.5lE r4 = (X.C293715lE) r4     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = r4.A00     // Catch:{ all -> 0x0151 }
            if (r1 == 0) goto L_0x0109
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x0151 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x0109
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x0138
            r0 = -415127962(0xffffffffe741a666, float:-9.1448624E23)
            goto L_0x0135
        L_0x0109:
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x0151 }
            r5.A02 = r0     // Catch:{ all -> 0x0151 }
            r4.A00 = r0     // Catch:{ all -> 0x0151 }
            X.0eE r1 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x0151 }
            com.instagram.common.session.UserSession r0 = r14.A02     // Catch:{ all -> 0x0151 }
            com.instagram.user.model.User r17 = r1.A01(r0)     // Catch:{ all -> 0x0151 }
            androidx.compose.ui.platform.ComposeView r1 = r4.A01     // Catch:{ all -> 0x0151 }
            r0 = 1537974596(0x5baba144, float:9.6619069E16)
            r13 = 9
            X.9MT r12 = new X.9MT     // Catch:{ all -> 0x0151 }
            r16 = r3
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0151 }
            X.5PJ r0 = X.AnonymousClass5PI.A04(r12, r0, r2)     // Catch:{ all -> 0x0151 }
            r1.setContent(r0)     // Catch:{ all -> 0x0151 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x0138
            r0 = -7867515(0xffffffffff87f385, float:NaN)
        L_0x0135:
            X.0fS.A00(r0)     // Catch:{ all -> 0x015f }
        L_0x0138:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0144
            r0 = 2058343737(0x7aafd539, float:4.564883E35)
            X.0fS.A00(r0)     // Catch:{ all -> 0x016d }
        L_0x0144:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x0150
            r0 = -2084009284(0xffffffff83c88abc, float:-1.1786795E-36)
            X.0fS.A00(r0)
        L_0x0150:
            return
        L_0x0151:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x015e
            r0 = -1773327067(0xffffffff964d2d25, float:-1.6574013E-25)
            X.0fS.A00(r0)     // Catch:{ all -> 0x015f }
        L_0x015e:
            throw r1     // Catch:{ all -> 0x015f }
        L_0x015f:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x016c
            r0 = -1011610700(0xffffffffc3b40bb4, float:-360.09143)
            X.0fS.A00(r0)     // Catch:{ all -> 0x016d }
        L_0x016c:
            throw r1     // Catch:{ all -> 0x016d }
        L_0x016d:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L_0x017a
            r0 = 1726464728(0x66e7c2d8, float:5.4723045E23)
            X.0fS.A00(r0)
        L_0x017a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2364333s.A02(android.view.View, java.lang.Object, java.lang.Object, X.0sa):void");
    }
}
