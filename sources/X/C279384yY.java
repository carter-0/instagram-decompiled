package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.privacy.zone.upf.nocton.AndroidPurposePolicyFlowsToEvaluator;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.NoSuchElementException;

/* renamed from: X.4yY  reason: invalid class name and case insensitive filesystem */
public final class C279384yY implements 2Rb {
    public final C279334yT A00;

    public final void A00(QOz qOz, QOz qOz2, String str) {
        String str2;
        String A16;
        Integer num;
        String str3;
        String str4;
        QOz qOz3 = qOz;
        0qQ.A0B(qOz3, 0);
        QOz qOz4 = qOz2;
        0qQ.A0B(qOz4, 1);
        CUE cue = AndroidPurposePolicyFlowsToEvaluator.Companion;
        ZonePolicy zonePolicy = qOz3.A00;
        String A002 = zonePolicy.A00();
        ZonePolicy zonePolicy2 = qOz4.A00;
        int flowsTo = AndroidPurposePolicyFlowsToEvaluator.flowsTo(A002, zonePolicy2.A00(), 0Yt.A0E());
        String str5 = str;
        if (flowsTo == 0 || flowsTo == 1) {
            if (flowsTo == 1) {
                str2 = "pass";
            } else {
                str2 = RealtimeConstants.SEND_FAIL;
            }
            A16 = 002.A16("FlowsTo ", str2, ": ", zonePolicy.A00(), " !--> ", zonePolicy2.A00(), " for ", str5);
            num = AnonymousClass05K.A0N;
        } else {
            A16 = 002.A13("FlowsTo evaluator error: ", zonePolicy.A00(), " !--> ", zonePolicy2.A00(), " for ", str5);
            num = AnonymousClass05K.A0C;
        }
        Integer num2 = zonePolicy.A00;
        Integer num3 = zonePolicy2.A00;
        0qQ.A0B(num2, 0);
        0qQ.A0B(num3, 1);
        for (Integer num4 : AnonymousClass05K.A00(2)) {
            if (CUD.A00(num4) == Math.min(CUD.A00(num2), CUD.A00(num3))) {
                C279334yT r21 = this.A00;
                0eP r12 = new 0eP("from", zonePolicy.A00());
                0eP r11 = new 0eP("to", zonePolicy2.A00());
                0eP r13 = new 0eP("fromAsid", qOz3.A01);
                0eP r14 = new 0eP("toAsid", qOz4.A01);
                if (1 - num4.intValue() != 0) {
                    str3 = "FULL_THROW";
                } else {
                    str3 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                }
                0eP r10 = new 0eP("enforcementMode", str3);
                0eP r15 = new 0eP("fromPolicyVersion", zonePolicy.A01());
                0eP r9 = new 0eP("toPolicyVersion", zonePolicy2.A01());
                if (flowsTo == 0) {
                    str4 = "False";
                } else if (flowsTo != 1) {
                    switch (flowsTo) {
                        case -100:
                            str4 = "UnknownPolicy";
                            break;
                        case -99:
                            str4 = "EvaluatorError";
                            break;
                        case -98:
                            str4 = "MissingConsent";
                            break;
                        default:
                            throw new IllegalArgumentException(002.A0O(Pxd.A00(519), flowsTo));
                    }
                } else {
                    str4 = "True";
                }
                0eP r5 = new 0eP("flowsToResult", str4);
                boolean z = true;
                if (!(flowsTo == 1 || num4 == AnonymousClass05K.A01)) {
                    z = false;
                }
                0eP r152 = r14;
                0eP r142 = r13;
                0eP r132 = r11;
                r21.EGq(num, A16, 0Yt.A06(new 0eP[]{r12, r132, r142, r152, r10, r15, r9, r5, new 0eP("finalResult", String.valueOf(z))}));
                if (flowsTo != 1 && num4 != AnonymousClass05K.A01) {
                    0KC.A0D("ZoneImpl", A16);
                    0qQ.A0B(A16, 1);
                    throw new RuntimeException(A16);
                }
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final boolean isEnabled() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C9011RLf EJX(X.C13564Tcd r8, com.facebook.privacy.zone.policy.ZonePolicy r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r6 = "UNKNOWN"
            r2 = 0
            X.QOz r5 = new X.QOz
            r5.<init>(r9, r6)
            X.4nV r4 = X.C273984nV.A02     // Catch:{ TQ7 -> 0x0055 }
            X.0LV r0 = X.0NT.A00()     // Catch:{ TQ7 -> 0x0055 }
            X.3xP r1 = r4.A00(r0)     // Catch:{ TQ7 -> 0x0055 }
            boolean r0 = r1.A06()     // Catch:{ TQ7 -> 0x0055 }
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r1.A03()     // Catch:{ TQ7 -> 0x0055 }
        L_0x001c:
            X.QOz r1 = (X.QOz) r1     // Catch:{ TQ7 -> 0x0055 }
            java.lang.String r0 = "Run"
            r7.A00(r1, r5, r0)     // Catch:{ TQ7 -> 0x0055 }
            goto L_0x0027
        L_0x0024:
            X.QOz r1 = X.QOz.A02     // Catch:{ TQ7 -> 0x0055 }
            goto L_0x001c
        L_0x0027:
            X.TY3 r3 = new X.TY3
            r3.<init>(r8, r9, r6, r2)
            java.lang.ThreadLocal r2 = r4.A00
            java.lang.Object r1 = r2.get()
            X.3xP r1 = (X.C257443xP) r1
            X.3xQ r0 = new X.3xQ
            r0.<init>(r5)
            r2.set(r0)
            X.0qQ.A0A(r1)
            X.T8q r2 = new X.T8q
            r2.<init>(r4, r1)
            java.lang.Object r0 = r3.invoke(r5)     // Catch:{ all -> 0x004e }
            r2.close()
            X.RLf r0 = (X.C9011RLf) r0
            return r0
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x0055:
            r1 = move-exception
            X.QYM r0 = new X.QYM
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C279384yY.EJX(X.Tcd, com.facebook.privacy.zone.policy.ZonePolicy, java.lang.String):X.RLf");
    }

    public final C9011RLf FJI(ZonedValue zonedValue) {
        Object obj;
        QOz qOz = new QOz(zonedValue.A00, zonedValue.A02);
        C257443xP A002 = C273984nV.A02.A00(0NT.A00());
        if (A002.A06()) {
            obj = A002.A03();
        } else {
            obj = QOz.A02;
        }
        QOz qOz2 = (QOz) obj;
        try {
            A00(qOz, qOz2, "Unwrap");
            this.A00.EFt(AnonymousClass05K.A01, 002.A0R("Unwrap ", "ZonedValue"), 0Yt.A06(new 0eP[]{new 0eP("from", qOz.A00.A00()), new 0eP("to", qOz2.A00.A00())}));
            return new QYN(zonedValue.A01);
        } catch (TQ7 e) {
            return new QYM(e);
        }
    }

    public final Object FJK(ZonedValue zonedValue, Integer num) {
        Object obj;
        0qQ.A0B(num, 1);
        C13818Thm B2F = this.A00.B2F(AnonymousClass05K.A00);
        ZonePolicy zonePolicy = zonedValue.A00;
        zonePolicy.A00();
        if (B2F.isSampled()) {
            C257443xP A002 = C273984nV.A02.A00(0NT.A00());
            if (A002.A06()) {
                obj = A002.A03();
            } else {
                obj = QOz.A02;
            }
            ZonePolicy zonePolicy2 = ((QOz) obj).A00;
            String A0g = 002.A0g("ZonedValue", " is unzoned for ", "IGD_OBC_LOGGING_OUT_OF_REFACTOR_SCOPE");
            0qQ.A0B(A0g, 1);
            B2F.A8R(new Exception(A0g));
            B2F.ABT("reason", "IGD_OBC_LOGGING_OUT_OF_REFACTOR_SCOPE");
            B2F.ABT("from", zonePolicy.A00());
            B2F.ABT("to", zonePolicy2.A00());
            B2F.ABT("fromAsid", zonedValue.A02);
            B2F.ABT("fromPolicyVersion", zonePolicy.A01());
            B2F.ABT("toPolicyVersion", zonePolicy2.A01());
            B2F.report();
        }
        return zonedValue.A01;
    }

    public C279384yY(C279334yT r1) {
        this.A00 = r1;
    }
}
