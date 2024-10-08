package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.GestureDetector;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ryl  reason: case insensitive filesystem */
public final class C10825Ryl {
    public Path A00;
    public PointF A01;
    public REI A02;
    public List A03;
    public List A04;
    public final GestureDetector A05;
    public final RQO A06;
    public final Set A07;
    public final C62320sa A08;
    public final Context A09;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.RQO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v20, types: [java.lang.Object, X.SO3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0171 A[Catch:{ NameNotFoundException -> 0x0159 }, LOOP:1: B:46:0x016b->B:48:0x0171, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10825Ryl(android.content.Context r23, X.C62320sa r24) {
        /*
            r22 = this;
            r10 = 1
            r9 = r22
            r9.<init>()
            r21 = r23
            r0 = r21
            r9.A09 = r0
            r0 = r24
            r9.A08 = r0
            r11 = 0
            r1 = 26
            X.JwI r19 = new X.JwI
            r0 = r19
            r0.<init>((X.SJS) r11, (kotlin.jvm.internal.DefaultConstructorMarker) r11, (int) r10, (int) r1)
            r8 = 2
            X.RQO r7 = new X.RQO
            r7.<init>()
            r6 = 0
            X.02m r1 = X.C51965G9l.A0l()     // Catch:{ all -> 0x026d }
            r0 = 391261414(0x17522ce6, float:6.791133E-25)
            r5 = 0
            r1.markerStart(r0, r5)     // Catch:{ all -> 0x026d }
            X.NhY r2 = X.C69821Nsi.A00()     // Catch:{ all -> 0x026d }
            java.lang.String r1 = "TextRecognizer"
            java.lang.String r0 = "module"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)     // Catch:{ all -> 0x026d }
            r4 = 269366478(0x100e34ce, float:2.804524E-29)
            r2.A02(r4, r5, r0)     // Catch:{ all -> 0x026d }
            X.02m r12 = X.C51965G9l.A0l()     // Catch:{ all -> 0x026d }
            r3 = 269363625(0x100e29a9, float:2.8036656E-29)
            X.0aQ r0 = r12.A0G     // Catch:{ all -> 0x026d }
            r0.E1U(r3, r10)     // Catch:{ all -> 0x026d }
            r0.E1U(r4, r10)     // Catch:{ all -> 0x026d }
            boolean r0 = X.C10029RlO.A00     // Catch:{ all -> 0x026d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x026d }
            java.lang.String r2 = "initialized"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r2, r0)     // Catch:{ all -> 0x026d }
            r12.markerStart(r3, r5)     // Catch:{ all -> 0x026d }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x026d }
            if (r0 != 0) goto L_0x0066
            X.C67571Mq5.A00(r12, r1, r3)     // Catch:{ all -> 0x026d }
        L_0x0066:
            boolean r0 = X.C10029RlO.A00     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x00d1
            boolean r0 = X.C10029RlO.A00()     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x00d1
            X.02m r12 = X.C51965G9l.A0l()     // Catch:{ all -> 0x026d }
            X.0aQ r0 = r12.A0G     // Catch:{ all -> 0x026d }
            r0.E1U(r3, r10)     // Catch:{ all -> 0x026d }
            r0.E1U(r4, r10)     // Catch:{ all -> 0x026d }
            boolean r1 = X.C10029RlO.A00     // Catch:{ all -> 0x026d }
            boolean r0 = X.C10029RlO.A00()     // Catch:{ all -> 0x026d }
            X.0eP r2 = X.C66581MXm.A14(r2, r1)     // Catch:{ all -> 0x026d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "mlkit_context_initialized"
            X.0eP[] r0 = X.JTQ.A1b(r0, r1, r2)     // Catch:{ all -> 0x026d }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ all -> 0x026d }
            X.0qQ.A0B(r0, r8)     // Catch:{ all -> 0x026d }
            X.C67571Mq5.A00(r12, r0, r3)     // Catch:{ all -> 0x026d }
            r12.markerEnd(r3, r5, r8)     // Catch:{ all -> 0x026d }
        L_0x009e:
            r0 = r19
            java.lang.Object r3 = r0.A00     // Catch:{ all -> 0x026d }
            X.SJS r3 = (X.SJS) r3     // Catch:{ all -> 0x026d }
            X.SO3 r1 = X.SO3.A00()     // Catch:{ all -> 0x026d }
            java.lang.Class<X.Rsu> r0 = X.C10479Rsu.class
            java.lang.Object r1 = r1.A01(r0)     // Catch:{ all -> 0x026d }
            X.Rsu r1 = (X.C10479Rsu) r1     // Catch:{ all -> 0x026d }
            X.R2u r0 = r1.A01     // Catch:{ all -> 0x026d }
            java.lang.Object r2 = r0.A00(r3)     // Catch:{ all -> 0x026d }
            X.R2v r2 = (X.R2v) r2     // Catch:{ all -> 0x026d }
            X.Rpc r0 = r1.A00     // Catch:{ all -> 0x026d }
            X.95k r0 = r0.A00     // Catch:{ all -> 0x026d }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x026d }
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1     // Catch:{ all -> 0x026d }
            java.lang.String r0 = r3.A00()     // Catch:{ all -> 0x026d }
            X.SNl r0 = X.C9998Rks.A00(r0)     // Catch:{ all -> 0x026d }
            X.T90 r12 = new X.T90     // Catch:{ all -> 0x026d }
            r12.<init>(r0, r2, r3, r1)     // Catch:{ all -> 0x026d }
            goto L_0x0272
        L_0x00d1:
            r20 = r21
            java.lang.Object r18 = X.SO3.A02     // Catch:{ all -> 0x01bc }
            monitor-enter(r18)     // Catch:{ all -> 0x01bc }
            X.SO3 r0 = X.SO3.A01     // Catch:{ all -> 0x01b9 }
            boolean r1 = X.DbW.A1a(r0)
            java.lang.String r0 = "MlKitContext is already initialized"
            X.AnonymousClass3Qk.A09(r1, r0)     // Catch:{ all -> 0x01b9 }
            X.SO3 r1 = new X.SO3     // Catch:{ all -> 0x01b9 }
            r1.<init>()     // Catch:{ all -> 0x01b9 }
            X.SO3.A01 = r1     // Catch:{ all -> 0x01b9 }
            android.content.Context r0 = r21.getApplicationContext()     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x00f0
            r20 = r0
        L_0x00f0:
            X.SA8 r0 = new X.SA8     // Catch:{ all -> 0x01b9 }
            r0.<init>()     // Catch:{ all -> 0x01b9 }
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01b9 }
            java.lang.String r13 = "ComponentDiscovery"
            android.content.pm.PackageManager r15 = r20.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0159 }
            if (r15 != 0) goto L_0x0107
            java.lang.String r0 = "Context has no PackageManager."
        L_0x0103:
            android.util.Log.w(r13, r0)     // Catch:{ NameNotFoundException -> 0x0159 }
            goto L_0x015e
        L_0x0107:
            java.lang.Class<com.google.mlkit.common.internal.MlKitComponentDiscoveryService> r16 = com.google.mlkit.common.internal.MlKitComponentDiscoveryService.class
            android.content.ComponentName r14 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0159 }
            r12 = r20
            r0 = r16
            r14.<init>(r12, r0)     // Catch:{ NameNotFoundException -> 0x0159 }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r0 = r15.getServiceInfo(r14, r0)     // Catch:{ NameNotFoundException -> 0x0159 }
            if (r0 != 0) goto L_0x0125
            java.lang.StringBuilder r12 = X.JTQ.A0d(r16)     // Catch:{ NameNotFoundException -> 0x0159 }
            java.lang.String r0 = " has no service info."
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r12)     // Catch:{ NameNotFoundException -> 0x0159 }
            goto L_0x0103
        L_0x0125:
            android.os.Bundle r12 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0159 }
            if (r12 == 0) goto L_0x015e
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01b9 }
            java.util.Iterator r16 = X.Pxf.A0t(r12)     // Catch:{ all -> 0x01b9 }
        L_0x0131:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x0167
            java.lang.String r14 = X.AnonymousClass7TE.A18(r16)     // Catch:{ all -> 0x01b9 }
            java.lang.Object r0 = r12.get(r14)     // Catch:{ all -> 0x01b9 }
            java.lang.String r15 = "com.google.firebase.components.ComponentRegistrar"
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "com.google.firebase.components:"
            boolean r0 = r14.startsWith(r0)     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x0131
            r0 = 31
            java.lang.String r0 = r14.substring(r0)     // Catch:{ all -> 0x01b9 }
            r13.add(r0)     // Catch:{ all -> 0x01b9 }
            goto L_0x0131
        L_0x0159:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r13, r0)     // Catch:{ all -> 0x01b9 }
        L_0x015e:
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r13, r0)     // Catch:{ all -> 0x01b9 }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x01b9 }
        L_0x0167:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x01b9 }
        L_0x016b:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x0180
            java.lang.String r0 = X.AnonymousClass7TE.A18(r13)     // Catch:{ all -> 0x01b9 }
            X.95j r12 = new X.95j     // Catch:{ all -> 0x01b9 }
            r12.<init>(r0)     // Catch:{ all -> 0x01b9 }
            r0 = r17
            r0.add(r12)     // Catch:{ all -> 0x01b9 }
            goto L_0x016b
        L_0x0180:
            java.util.concurrent.Executor r16 = X.AnonymousClass9GH.A00     // Catch:{ all -> 0x01b9 }
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01b9 }
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x01b9 }
            r0 = r17
            r13.addAll(r0)     // Catch:{ all -> 0x01b9 }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x01b9 }
            r0 = r20
            X.95n r0 = X.AnonymousClass95n.A00(r15, r0, r14)     // Catch:{ all -> 0x01b9 }
            r12.add(r0)     // Catch:{ all -> 0x01b9 }
            java.lang.Class<X.SO3> r14 = X.SO3.class
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ all -> 0x01b9 }
            X.95n r0 = X.AnonymousClass95n.A00(r14, r1, r0)     // Catch:{ all -> 0x01b9 }
            r12.add(r0)     // Catch:{ all -> 0x01b9 }
            X.95r r14 = new X.95r     // Catch:{ all -> 0x01b9 }
            r0 = r16
            r14.<init>(r13, r12, r0)     // Catch:{ all -> 0x01b9 }
            r1.A00 = r14     // Catch:{ all -> 0x01b9 }
            r14.A05(r10)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r18)     // Catch:{ all -> 0x01b9 }
            X.C10029RlO.A00 = r10     // Catch:{ all -> 0x01bc }
            X.0gF r13 = X.C60340gF.A00     // Catch:{ all -> 0x01bc }
            goto L_0x01c1
        L_0x01b9:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x01b9 }
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            X.0eQ r13 = X.JTO.A1B(r0)     // Catch:{ all -> 0x026d }
        L_0x01c1:
            boolean r0 = r13 instanceof X.0eQ     // Catch:{ all -> 0x026d }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01f5
            X.02m r12 = X.C51965G9l.A0l()     // Catch:{ all -> 0x026d }
            X.0aQ r0 = r12.A0G     // Catch:{ all -> 0x026d }
            r0.E1U(r3, r10)     // Catch:{ all -> 0x026d }
            r0.E1U(r4, r10)     // Catch:{ all -> 0x026d }
            boolean r1 = X.C10029RlO.A00     // Catch:{ all -> 0x026d }
            boolean r0 = X.C10029RlO.A00()     // Catch:{ all -> 0x026d }
            X.0eP r14 = X.C66581MXm.A14(r2, r1)     // Catch:{ all -> 0x026d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "mlkit_context_initialized"
            X.0eP[] r0 = X.JTQ.A1b(r0, r1, r14)     // Catch:{ all -> 0x026d }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ all -> 0x026d }
            X.0qQ.A0B(r0, r8)     // Catch:{ all -> 0x026d }
            X.C67571Mq5.A00(r12, r0, r3)     // Catch:{ all -> 0x026d }
            r12.markerEnd(r3, r5, r8)     // Catch:{ all -> 0x026d }
        L_0x01f5:
            java.lang.Throwable r13 = X.0eR.A00(r13)     // Catch:{ all -> 0x026d }
            if (r13 == 0) goto L_0x0268
            X.0wj r12 = X.0wj.A01     // Catch:{ all -> 0x026d }
            r1 = 269356669(0x100e0e7d, float:2.8015724E-29)
            java.lang.String r0 = "MlKit initializer failed"
            X.0f9 r12 = r12.AEf(r0, r1)     // Catch:{ all -> 0x026d }
            r12.ERJ(r13)     // Catch:{ all -> 0x026d }
            boolean r0 = X.C10029RlO.A00     // Catch:{ all -> 0x026d }
            r12.ABR(r2, r0)     // Catch:{ all -> 0x026d }
            boolean r1 = X.C10029RlO.A00()     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "MlKitContext"
            r12.ABR(r0, r1)     // Catch:{ all -> 0x026d }
            r12.report()     // Catch:{ all -> 0x026d }
            X.02m r12 = X.C51965G9l.A0l()     // Catch:{ all -> 0x026d }
            X.0aQ r0 = r12.A0G     // Catch:{ all -> 0x026d }
            r0.E1U(r3, r10)     // Catch:{ all -> 0x026d }
            r0.E1U(r4, r10)     // Catch:{ all -> 0x026d }
            boolean r1 = X.C10029RlO.A00     // Catch:{ all -> 0x026d }
            boolean r0 = X.C10029RlO.A00()     // Catch:{ all -> 0x026d }
            X.0eP r2 = X.C66581MXm.A14(r2, r1)     // Catch:{ all -> 0x026d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "mlkit_context_initialized"
            X.0eP[] r0 = X.JTQ.A1b(r0, r1, r2)     // Catch:{ all -> 0x026d }
            java.util.LinkedHashMap r2 = X.0Yt.A06(r0)     // Catch:{ all -> 0x026d }
            X.0qQ.A0B(r2, r8)     // Catch:{ all -> 0x026d }
            boolean r0 = r13 instanceof X.C8992RKk     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x0258
            r0 = r13
            X.RKk r0 = (X.C8992RKk) r0     // Catch:{ all -> 0x026d }
            int r0 = r0.A00     // Catch:{ all -> 0x026d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "error_code"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)     // Catch:{ all -> 0x026d }
            X.C67571Mq5.A00(r12, r0, r3)     // Catch:{ all -> 0x026d }
        L_0x0258:
            X.C67571Mq5.A00(r12, r2, r3)     // Catch:{ all -> 0x026d }
            java.lang.String r1 = r13.getMessage()     // Catch:{ all -> 0x026d }
            java.lang.String r0 = "error"
            r12.markerAnnotate(r3, r5, r0, r1)     // Catch:{ all -> 0x026d }
            r0 = 3
            r12.markerEnd(r3, r5, r0)     // Catch:{ all -> 0x026d }
        L_0x0268:
            X.C10029RlO.A00()     // Catch:{ all -> 0x026d }
            goto L_0x009e
        L_0x026d:
            r0 = move-exception
            X.0eQ r12 = X.JTO.A1B(r0)
        L_0x0272:
            boolean r10 = r12 instanceof X.0eQ
            r0 = r10 ^ 1
            if (r0 == 0) goto L_0x028d
            X.02m r1 = X.C51965G9l.A0l()
            r0 = 391261414(0x17522ce6, float:6.791133E-25)
            r2 = 0
            r1.markerEnd(r0, r2, r8)
            X.NhY r1 = X.C69821Nsi.A00()
            r0 = 269366478(0x100e34ce, float:2.804524E-29)
            r1.A03(r11, r0, r2)
        L_0x028d:
            java.lang.Throwable r5 = X.0eR.A00(r12)
            if (r5 == 0) goto L_0x02b2
            X.02m r4 = X.C51965G9l.A0l()
            r3 = 391261414(0x17522ce6, float:6.791133E-25)
            r2 = 0
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "error"
            r4.markerAnnotate(r3, r2, r0, r1)
            r0 = 3
            r4.markerEnd(r3, r2, r0)
            X.NhY r1 = X.C69821Nsi.A00()
            r0 = 269366478(0x100e34ce, float:2.804524E-29)
            r1.A03(r5, r0, r2)
        L_0x02b2:
            if (r10 != 0) goto L_0x02b5
            r6 = r12
        L_0x02b5:
            X.TmZ r6 = (X.C13971TmZ) r6
            r7.A00 = r6
            r9.A06 = r7
            X.REI r0 = X.REI.NONE
            r9.A02 = r0
            android.graphics.Path r0 = X.C51965G9l.A0C()
            r9.A00 = r0
            r1 = 0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r1, r1)
            r9.A01 = r0
            X.REI r0 = X.REI.DRAW
            X.REI[] r0 = new X.REI[]{r0}
            java.util.Set r1 = X.0sc.A06(r0)
            X.TmZ r0 = r7.A00
            if (r0 == 0) goto L_0x02e0
            X.REI r0 = X.REI.REDACT
            r1.add(r0)
        L_0x02e0:
            r9.A07 = r1
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r9.A03 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r9.A04 = r0
            X.Jdi r2 = new X.Jdi
            r2.<init>(r9, r8)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r0 = r21
            r1.<init>(r0, r2)
            r9.A05 = r1
            X.AnonymousClass2S0.A01(r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10825Ryl.<init>(android.content.Context, X.0sa):void");
    }
}
