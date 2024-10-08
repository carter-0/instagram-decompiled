package com.instagram.igsignals.predictors.dcp;

import X.0eO;
import X.0qQ;
import X.19E;
import X.AnonymousClass0eM;
import X.AnonymousClass0vF;
import X.AnonymousClass12U;
import X.AnonymousClass19S;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C61480nO;
import X.C61610nw;
import X.C62943Kov;
import X.C63773L6f;
import X.JTP;
import X.MMJ;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class IgSignalsDcpPredictor extends C62943Kov {
    public final UserSession A00;
    public final C61480nO A01;
    public final C63773L6f A02;
    public final Integer A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final C262224Cq A07;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:24|25|26|27|28|(1:30)(1:55)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00ba */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c1 A[Catch:{ 9GL -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc A[Catch:{ 9GL -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd A[Catch:{ 9GL -> 0x0165 }, LOOP:1: B:37:0x00d7->B:39:0x00dd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d A[Catch:{ 9GL -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e A[Catch:{ 9GL -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C65380LsL r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r3 = 38
            r4 = r20
            boolean r0 = X.C66145MDx.A02(r3, r4)
            r6 = r18
            if (r0 == 0) goto L_0x002f
            r5 = r4
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r5.A03
            X.1Hj r0 = X.1Hj.A02
            int r3 = r5.A00
            r1 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r1) goto L_0x0035
            java.lang.Object r4 = r5.A02
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r5 = r5.A01
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r5 = (com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor) r5
            goto L_0x00c5
        L_0x002f:
            X.MDx r5 = new X.MDx
            r5.<init>(r6, r4, r3)
            goto L_0x001a
        L_0x0035:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003a:
            X.0eS.A00(r2)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()     // Catch:{ 9GL -> 0x0165 }
            r2 = r19
            java.util.List r2 = r2.A05     // Catch:{ 9GL -> 0x0165 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ 9GL -> 0x0165 }
        L_0x0049:
            boolean r2 = r7.hasNext()     // Catch:{ 9GL -> 0x0165 }
            if (r2 == 0) goto L_0x0070
            java.lang.Object r3 = r7.next()     // Catch:{ 9GL -> 0x0165 }
            com.instagram.igsignals.core.IgSignalsFeature r3 = (com.instagram.igsignals.core.IgSignalsFeature) r3     // Catch:{ 9GL -> 0x0165 }
            int r2 = r3.A01     // Catch:{ 9GL -> 0x0165 }
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch:{ 9GL -> 0x0165 }
            X.3uA[] r2 = com.facebook.odin.model.FeatureData.A0E     // Catch:{ 9GL -> 0x0165 }
            com.facebook.odin.model.Type r9 = com.facebook.odin.model.Type.DOUBLE     // Catch:{ 9GL -> 0x0165 }
            r16 = 0
            double r13 = r3.A00     // Catch:{ 9GL -> 0x0165 }
            r11 = 0
            r15 = 16372(0x3ff4, float:2.2942E-41)
            com.facebook.odin.model.FeatureData r8 = new com.facebook.odin.model.FeatureData     // Catch:{ 9GL -> 0x0165 }
            r12 = r11
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)     // Catch:{ 9GL -> 0x0165 }
            r4.put(r10, r8)     // Catch:{ 9GL -> 0x0165 }
            goto L_0x0049
        L_0x0070:
            java.util.List r2 = r6.A04     // Catch:{ 9GL -> 0x0165 }
            java.lang.Object r9 = X.00k.A0J(r2)     // Catch:{ 9GL -> 0x0165 }
            X.LDC r9 = (X.LDC) r9     // Catch:{ 9GL -> 0x0165 }
            if (r9 == 0) goto L_0x00c3
            com.instagram.common.session.UserSession r8 = r6.A00     // Catch:{ 9GL -> 0x0165 }
            X.0Tu r7 = X.AnonymousClass7TF.A0H(r8)     // Catch:{ 9GL -> 0x0165 }
            r2 = 36331072522306435(0x8112eb00004383, double:3.039254784368749E-306)
            boolean r2 = X.182.A06(r7, r8, r2)     // Catch:{ 9GL -> 0x0165 }
            if (r2 == 0) goto L_0x00c3
            r2 = 29
            X.MMJ r3 = new X.MMJ     // Catch:{ 9GL -> 0x0165 }
            r3.<init>(r8, r2)     // Catch:{ 9GL -> 0x0165 }
            java.lang.Class<X.Lgt> r2 = X.C64719Lgt.class
            java.lang.Object r2 = r8.A01(r2, r3)     // Catch:{ 9GL -> 0x0165 }
            X.Lgt r2 = (X.C64719Lgt) r2     // Catch:{ 9GL -> 0x0165 }
            if (r2 == 0) goto L_0x00c3
            X.C66145MDx.A00(r6, r4, r5, r1)     // Catch:{ 9GL -> 0x0165 }
            X.LN2 r9 = X.C64719Lgt.A00(r9, r2)     // Catch:{ 9GL -> 0x0165 }
            X.ObS r8 = new X.ObS     // Catch:{ 9GL -> 0x0165 }
            r8.<init>()     // Catch:{ 9GL -> 0x0165 }
            X.4Cq r7 = r9.A06     // Catch:{ 9GL -> 0x0165 }
            r5 = 0
            r3 = 30
            X.MfO r2 = new X.MfO     // Catch:{ 9GL -> 0x0165 }
            r2.<init>(r9, r8, r5, r3)     // Catch:{ 9GL -> 0x0165 }
            X.AnonymousClass7TE.A1Z(r2, r7)     // Catch:{ 9GL -> 0x0165 }
            java.util.concurrent.CountDownLatch r2 = r8.A01     // Catch:{ InterruptedException -> 0x00ba }
            r2.await()     // Catch:{ InterruptedException -> 0x00ba }
        L_0x00ba:
            java.lang.Object r2 = r8.A00     // Catch:{ 9GL -> 0x0165 }
            X.0qQ.A07(r2)     // Catch:{ 9GL -> 0x0165 }
            if (r2 == r0) goto L_0x0189
            r5 = r6
            goto L_0x00c8
        L_0x00c3:
            r5 = r6
            goto L_0x00cf
        L_0x00c5:
            X.0eS.A00(r2)     // Catch:{ 9GL -> 0x0165 }
        L_0x00c8:
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ 9GL -> 0x0165 }
            if (r2 == 0) goto L_0x00cf
            r4.putAll(r2)     // Catch:{ 9GL -> 0x0165 }
        L_0x00cf:
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()     // Catch:{ 9GL -> 0x0165 }
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r4)     // Catch:{ 9GL -> 0x0165 }
        L_0x00d7:
            boolean r0 = r3.hasNext()     // Catch:{ 9GL -> 0x0165 }
            if (r0 == 0) goto L_0x00f6
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)     // Catch:{ 9GL -> 0x0165 }
            r0.getKey()     // Catch:{ 9GL -> 0x0165 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ 9GL -> 0x0165 }
            java.lang.StringBuilder r2 = X.JTQ.A0d(r0)     // Catch:{ 9GL -> 0x0165 }
            java.lang.String r0 = "; "
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r2)     // Catch:{ 9GL -> 0x0165 }
            r6.append(r0)     // Catch:{ 9GL -> 0x0165 }
            goto L_0x00d7
        L_0x00f6:
            java.lang.String r0 = r6.toString()     // Catch:{ 9GL -> 0x0165 }
            X.0qQ.A07(r0)     // Catch:{ 9GL -> 0x0165 }
            X.3uA[] r0 = com.facebook.odin.model.Example.A04     // Catch:{ 9GL -> 0x0165 }
            java.lang.String r2 = "todo_we_need_to_set_id_in_igsignals_model"
            r6 = 0
            com.facebook.odin.model.ExampleContext r0 = com.facebook.odin.model.ExampleContext.A05     // Catch:{ 9GL -> 0x0165 }
            com.facebook.odin.model.Example r3 = new com.facebook.odin.model.Example     // Catch:{ 9GL -> 0x0165 }
            r3.<init>(r0, r2, r4)     // Catch:{ 9GL -> 0x0165 }
            X.0eM r0 = r5.A05     // Catch:{ 9GL -> 0x0165 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ 9GL -> 0x0165 }
            X.MUu r2 = (X.C66516MUu) r2     // Catch:{ 9GL -> 0x0165 }
            java.util.List r0 = X.AnonymousClass7TE.A1I(r3)     // Catch:{ 9GL -> 0x0165 }
            X.40G r2 = r2.EHa(r0)     // Catch:{ 9GL -> 0x0165 }
            boolean r0 = r2.A02     // Catch:{ 9GL -> 0x0165 }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r2 = r2.A00     // Catch:{ 9GL -> 0x0165 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ 9GL -> 0x0165 }
            boolean r0 = r2.isEmpty()     // Catch:{ 9GL -> 0x0165 }
            if (r0 == 0) goto L_0x0138
            java.lang.String r1 = "Prediction was successful, but result was empty"
            X.3uA[] r0 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07     // Catch:{ 9GL -> 0x0165 }
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ 9GL -> 0x0165 }
            r5 = 0
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = new com.instagram.igsignals.core.IgSignalsModelPrediction     // Catch:{ 9GL -> 0x0165 }
            r0.<init>(r1, r2, r3, r5)     // Catch:{ 9GL -> 0x0165 }
            return r0
        L_0x0138:
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r2)     // Catch:{ 9GL -> 0x0165 }
            double r8 = X.JTO.A00(r0)     // Catch:{ 9GL -> 0x0165 }
            X.3uA[] r0 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07     // Catch:{ 9GL -> 0x0165 }
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()     // Catch:{ 9GL -> 0x0165 }
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = new com.instagram.igsignals.core.IgSignalsModelPrediction     // Catch:{ 9GL -> 0x0165 }
            r5 = r0
            r10 = r1
            r5.<init>(r6, r7, r8, r10)     // Catch:{ 9GL -> 0x0165 }
            return r0
        L_0x014e:
            X.3uA[] r0 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07     // Catch:{ 9GL -> 0x0165 }
            java.lang.String r1 = "Prediction failed with error: "
            java.lang.String r0 = r2.A01     // Catch:{ 9GL -> 0x0165 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ 9GL -> 0x0165 }
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ 9GL -> 0x0165 }
            r5 = 0
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = new com.instagram.igsignals.core.IgSignalsModelPrediction     // Catch:{ 9GL -> 0x0165 }
            r0.<init>(r1, r2, r3, r5)     // Catch:{ 9GL -> 0x0165 }
            return r0
        L_0x0165:
            r2 = move-exception
            X.3uA[] r0 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 595(0x253, float:8.34E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.append(r0)
            java.lang.Throwable r0 = r2.getCause()
            java.lang.String r1 = X.AnonymousClass7TF.A0i(r0, r1)
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            r5 = 0
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = new com.instagram.igsignals.core.IgSignalsModelPrediction
            r0.<init>(r1, r2, r3, r5)
        L_0x0189:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor.A02(X.LsL, X.4D7):java.lang.Object");
    }

    public /* synthetic */ IgSignalsDcpPredictor(UserSession userSession, C63773L6f l6f, Integer num) {
        AnonymousClass0vF A0W = JTP.A0W(C61610nw.A00(), "IgSignalsDcpPredictor");
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U(A0W).AOJ(453931508, 3));
        0qQ.A0B(A022, 5);
        this.A00 = userSession;
        this.A03 = num;
        this.A02 = l6f;
        this.A01 = A0W;
        this.A07 = A022;
        0eO r1 = 0eO.A02;
        this.A06 = MMJ.A00(this, r1, 26);
        this.A05 = MMJ.A00(this, r1, 25);
    }
}
