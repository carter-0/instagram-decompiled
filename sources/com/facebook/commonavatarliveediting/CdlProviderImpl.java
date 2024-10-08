package com.facebook.commonavatarliveediting;

import X.002;
import X.0KC;
import X.0Tu;
import X.0qQ;
import X.0sL;
import X.0sP;
import X.16f;
import X.1Hj;
import X.AnonymousClass05K;
import X.AnonymousClass0JR;
import X.AnonymousClass4CZ;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C15046UKz;
import X.C16540Uwl;
import X.C16546Uwt;
import X.C262204Co;
import X.C262224Cq;
import X.C273654mx;
import X.C51966G9m;
import X.C51974G9v;
import X.C53368Gms;
import X.C60340gF;
import X.C60801JrW;
import X.DbS;
import X.DbT;
import X.JTQ;
import X.L7W;
import X.LNu;
import X.MFo;
import X.MH6;
import X.MTM;
import X.VLB;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CdlProviderImpl implements MTM {
    public L7W A00;
    public C53368Gms A01;
    public 16f A02;
    public final AnonymousClass0JR A03;
    public final C15046UKz A04;
    public final HashMap A05;
    public final 0sL A06;
    public final AnonymousClass4CZ A07;
    public final AnonymousClass4CZ A08;
    public final C262224Cq A09;
    public final VLB A0A;

    public CdlProviderImpl(VLB vlb, AnonymousClass0JR r8, C15046UKz uKz, 0sL r10, AnonymousClass4CZ r11, AnonymousClass4CZ r12, C262224Cq r13) {
        C51974G9v.A0d(3, r11, r12, vlb, uKz);
        this.A03 = r8;
        this.A09 = r13;
        this.A07 = r11;
        this.A08 = r12;
        this.A0A = vlb;
        this.A04 = uKz;
        this.A06 = r10;
        UserSession userSession = vlb.A00;
        0Tu r4 = 0Tu.A05;
        if (DbS.A04(r4, userSession, 36599147201301947L) > 0 && uKz.A00 == C16540Uwl.NORMAL_MODE) {
            this.A02 = new 16f(DbS.A04(r4, userSession, 36599147201301947L), DbS.A04(r4, userSession, 36599147201301947L), 0);
        }
        this.A05 = AnonymousClass7TE.A1E();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C62699Kkz r11, com.facebook.commonavatarliveediting.CdlProviderImpl r12, java.lang.String r13, java.lang.String r14, X.AnonymousClass4D7 r15, X.0sL r16, long r17) {
        /*
            r5 = 0
            boolean r0 = X.JYA.A01(r5, r15)
            if (r0 == 0) goto L_0x009e
            r2 = r15
            X.JYA r2 = (X.JYA) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x009e
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0015:
            java.lang.Object r6 = r2.A04
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r1 = 1
            java.lang.String r4 = "CdlProviderImpl"
            if (r0 == 0) goto L_0x0031
            if (r0 != r1) goto L_0x00a5
            java.lang.Object r12 = r2.A02
            com.facebook.commonavatarliveediting.CdlProviderImpl r12 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r12
            X.0eS.A00(r6)
        L_0x0029:
            X.0JR r0 = r12.A03
            r0.now()
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0031:
            X.0eS.A00(r6)
            boolean r0 = r11 instanceof X.C60798JrT
            r10 = r14
            if (r0 == 0) goto L_0x0077
            X.16f r4 = r12.A02
            if (r4 == 0) goto L_0x0045
            r0 = r11
            X.JrT r0 = (X.C60798JrT) r0
            com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper r0 = r0.A00
            r4.A06(r14, r0)
        L_0x0045:
            X.JrT r11 = (X.C60798JrT) r11
            com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper r0 = r11.A00
            X.JrX r4 = new X.JrX
            r4.<init>(r0, r13, r5)
        L_0x004e:
            java.util.HashMap r5 = r12.A05
            boolean r0 = r5.containsKey(r13)
            if (r0 == 0) goto L_0x0029
            r5.remove(r13)
            if (r4 != 0) goto L_0x0064
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            java.lang.String r0 = "unknown error during CDL avatar generation"
            X.JrW r4 = new X.JrW
            r4.<init>(r13, r5, r0)
        L_0x0064:
            r2.A02 = r12
            r2.A03 = r13
            r5 = r17
            r2.A01 = r5
            r2.A00 = r1
            r0 = r16
            java.lang.Object r0 = r0.invoke(r4, r2)
            if (r0 != r3) goto L_0x0029
            return r3
        L_0x0077:
            boolean r0 = r11 instanceof X.C60797JrS
            if (r0 == 0) goto L_0x009c
            java.lang.String r5 = "cdl generateAvatar error w/ revisionId : "
            X.UKz r0 = r12.A04
            java.lang.String r6 = r0.A0B
            r0 = 188(0xbc, float:2.63E-43)
            java.lang.String r7 = X.C66579MXk.A00(r0)
            X.JrS r11 = (X.C60797JrS) r11
            java.lang.String r8 = r11.A00
            java.lang.String r9 = " config: "
            java.lang.String r0 = X.002.A13(r5, r6, r7, r8, r9, r10)
            X.0KC.A0C(r4, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.JrW r4 = new X.JrW
            r4.<init>(r13, r0, r8)
            goto L_0x004e
        L_0x009c:
            r4 = 0
            goto L_0x004e
        L_0x009e:
            X.JYA r2 = new X.JYA
            r2.<init>(r12, r15, r5)
            goto L_0x0015
        L_0x00a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.CdlProviderImpl.A00(X.Kkz, com.facebook.commonavatarliveediting.CdlProviderImpl, java.lang.String, java.lang.String, X.4D7, X.0sL, long):java.lang.Object");
    }

    public static final synchronized void A03(CdlProviderImpl cdlProviderImpl, String str) {
        synchronized (cdlProviderImpl) {
            C262204Co r1 = (C262204Co) cdlProviderImpl.A05.get(str);
            if (r1 != null) {
                r1.AG7((CancellationException) null);
            }
            L7W l7w = cdlProviderImpl.A00;
            if (l7w != null) {
                0qQ.A0B(str, 0);
                LNu lNu = l7w.A01;
                JSONObject A11 = DbS.A11();
                A11.put("requestId", str);
                LNu.A00(lNu, "cdl_cancel_any", A11);
                l7w.A00.cancelRequest(str);
            }
        }
    }

    public final synchronized void AWc(Boolean bool, Integer num, String str, Map map, 0sL r19) {
        GltfMemoryPointerWrapper gltfMemoryPointerWrapper;
        synchronized (this) {
            String str2 = str;
            0qQ.A0B(str2, 0);
            Map map2 = map;
            ArrayList A0f = JTQ.A0f(map2);
            Iterator A0u = AnonymousClass7TF.A0u(map2);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A0f.add(002.A0T(DbT.A13(A1J), DbS.A0s(A1J), ':'));
            }
            String A0z = DbT.A0z(", ", A0f, (0sP) null);
            16f r0 = this.A02;
            0sL r13 = r19;
            if (r0 == null || (gltfMemoryPointerWrapper = (GltfMemoryPointerWrapper) r0.A02(A0z)) == null) {
                this.A05.put(str2, C51966G9m.A1L(new MFo(this, bool, num, str2, A0z, map2, (AnonymousClass4D7) null, r13), this.A09));
            } else {
                AnonymousClass7TE.A1Z(new MH6((Object) r13, (Object) this, (Object) gltfMemoryPointerWrapper, str2, (AnonymousClass4D7) null, 0), this.A09);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebook.commonavatarliveediting.CdlProviderImpl r7, java.lang.String r8, X.AnonymousClass4D7 r9, X.0sL r10) {
        /*
            r3 = 26
            boolean r0 = X.C66144MDw.A02(r3, r9)
            if (r0 == 0) goto L_0x0064
            r5 = r9
            X.MDw r5 = (X.C66144MDw) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0064
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r3) goto L_0x0048
            if (r0 != r6) goto L_0x006a
            X.0eS.A00(r1)
        L_0x0027:
            r3 = 0
        L_0x0028:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L_0x002d:
            X.0eS.A00(r1)
            X.L7W r0 = r7.A00
            if (r0 != 0) goto L_0x0028
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            java.lang.String r1 = "CDL library is still not available"
            X.JrW r0 = new X.JrW
            r0.<init>(r8, r2, r1)
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r0 = r10.invoke(r0, r5)
            if (r0 != r4) goto L_0x004f
            return r4
        L_0x0048:
            java.lang.Object r7 = r5.A01
            com.facebook.commonavatarliveediting.CdlProviderImpl r7 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r7
            X.0eS.A00(r1)
        L_0x004f:
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            X.0sL r2 = r7.A06
            r1 = 13
            X.TY5 r0 = new X.TY5
            r0.<init>(r7, r1)
            java.lang.Object r0 = r2.invoke(r0, r5)
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x0064:
            X.MDw r5 = new X.MDw
            r5.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.CdlProviderImpl.A01(com.facebook.commonavatarliveediting.CdlProviderImpl, java.lang.String, X.4D7, X.0sL):java.lang.Object");
    }

    public static final Object A02(CdlProviderImpl cdlProviderImpl, String str, AnonymousClass4D7 r5, 0sL r6) {
        HashMap hashMap = cdlProviderImpl.A05;
        if (hashMap.containsKey(str)) {
            0KC.A0C("CdlProviderImpl", 002.A0R("handleRequestCancellation ", str));
            hashMap.remove(str);
            Object invoke = r6.invoke(new C60801JrW(str, AnonymousClass05K.A00, "request task has been cancelled"), r5);
            if (invoke == 1Hj.A02) {
                return invoke;
            }
        }
        return C60340gF.A00;
    }

    public final void Egm(List list, int i) {
        L7W l7w = this.A00;
        if (l7w != null) {
            LNu lNu = l7w.A01;
            JSONObject A11 = DbS.A11();
            for (C16546Uwt uwt : C16546Uwt.values()) {
                if (uwt.A00 == i) {
                    A11.put("priority", uwt.toString());
                    A11.put("choice_ids", new JSONArray(list));
                    LNu.A00(lNu, "set_priority", A11);
                    l7w.A00.setPriority(list, i);
                    return;
                }
            }
            throw new NoSuchElementException(C273654mx.A00(5));
        }
    }
}
