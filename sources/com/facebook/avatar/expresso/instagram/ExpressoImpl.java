package com.facebook.avatar.expresso.instagram;

import X.002;
import X.02m;
import X.05D;
import X.0V1;
import X.0V2;
import X.0qQ;
import X.0t0;
import X.10D;
import X.19E;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass11O;
import X.AnonymousClass12T;
import X.AnonymousClass19G;
import X.AnonymousClass19S;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C20617WwB;
import X.C262204Co;
import X.C262224Cq;
import X.C51965G9l;
import X.C58696Iw5;
import X.C61770pa;
import X.C62160rj;
import X.C64122LOq;
import X.C66191MHh;
import X.JTO;
import X.JTP;
import X.MH2;
import X.MHP;
import android.content.Context;
import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class ExpressoImpl {
    public static final String A0B = 002.A0R("ODR_", "ExpressoImpl");
    public final QuickPerformanceLogger A00;
    public final UserSession A01;
    public final HashMap A02;
    public final ConcurrentLinkedQueue A03 = new ConcurrentLinkedQueue();
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final C262224Cq A08;
    public final 0V2 A09;
    public final C61770pa A0A;

    public final C61770pa A02(C64122LOq lOq) {
        0qQ.A0B(lOq, 0);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        String str = lOq.A00;
        int hashCode = str.hashCode();
        quickPerformanceLogger.markerStart(252645496, hashCode);
        quickPerformanceLogger.markerAnnotate(252645496, hashCode, "sticker_pack_name", str);
        if (this.A05.compareAndSet(false, true)) {
            A01(lOq, this);
        } else {
            this.A03.add(lOq);
        }
        return this.A0A;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.avatar.expresso.instagram.ExpressoImpl r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 20
            boolean r0 = X.C66144MDw.A02(r3, r9)
            if (r0 == 0) goto L_0x0056
            r6 = r9
            X.MDw r6 = (X.C66144MDw) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0056
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r4) goto L_0x005c
            java.lang.Object r7 = r6.A01
            com.facebook.avatar.expresso.instagram.ExpressoImpl r7 = (com.facebook.avatar.expresso.instagram.ExpressoImpl) r7
            X.0eS.A00(r1)
        L_0x0028:
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A05
            r0 = 0
            r1.set(r0)
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0031:
            X.0eS.A00(r1)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r7.A03
            r0.clear()
            java.util.HashMap r1 = r7.A02
            java.lang.String r0 = "Timeout"
            r1.put(r8, r0)
            X.0V2 r3 = r7.A09
            java.lang.String r2 = "Sticker generation is taking more time"
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.JrD r0 = new X.JrD
            r0.<init>(r2, r1)
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L_0x0028
            return r5
        L_0x0056:
            X.MDw r6 = new X.MDw
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x005c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.instagram.ExpressoImpl.A00(com.facebook.avatar.expresso.instagram.ExpressoImpl, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final void A01(C64122LOq lOq, ExpressoImpl expressoImpl) {
        if (expressoImpl.A04.compareAndSet(false, true)) {
            AnonymousClass11O.A03(expressoImpl.A08, JTO.A1I(MHP.A01(expressoImpl, lOq, (AnonymousClass4D7) null, 34), new C62160rj(new C66191MHh(1, (AnonymousClass4D7) null), ((ODRController) expressoImpl.A07.getValue()).A0G)));
        }
        1Eo.A05(new ExpressoImpl$getExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key), new MH2((Object) expressoImpl, (Object) lOq, (AnonymousClass4D7) null, 41), expressoImpl.A08);
    }

    public ExpressoImpl(UserSession userSession, Context context) {
        02m A0l = C51965G9l.A0l();
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass19G((C262204Co) null).plus(JTP.A0U(AnonymousClass12T.A00, 637710289)));
        0t0 A012 = AnonymousClass0eN.A01(C20617WwB.A00);
        0t0 A013 = AnonymousClass0eN.A01(new C58696Iw5(7, context, A0l, userSession));
        this.A01 = userSession;
        this.A00 = A0l;
        this.A08 = A022;
        this.A07 = A013;
        this.A06 = A012;
        this.A05 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
        05D A014 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A09 = A014;
        this.A0A = new 0V1((C262204Co) null, A014);
        this.A02 = AnonymousClass7TE.A1E();
    }
}
