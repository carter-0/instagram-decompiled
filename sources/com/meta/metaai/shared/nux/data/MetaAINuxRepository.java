package com.meta.metaai.shared.nux.data;

import X.0qQ;
import X.1Hj;
import X.1vo;
import X.2IS;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.C54639HLw;
import X.C55228HeJ;
import X.C56184HuD;
import X.C60340gF;
import X.IID;
import android.app.Application;
import com.facebook.pando.PandoGraphQLRequest;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.shared.nux.service.MetaAINuxNetworkService;
import java.lang.reflect.InvocationTargetException;

public final class MetaAINuxRepository {
    public final Application A00;
    public final FoaUserSession A01;
    public final MetaAINuxNetworkService A02;

    public final Object A00(C54639HLw hLw, String str, AnonymousClass4D7 r11) {
        String str2;
        0qQ.A0B(str, 0);
        this.A00.getSharedPreferences("MetaAINuxImpressionCache", 0).edit().putBoolean(str, true).commit();
        MetaAINuxNetworkService metaAINuxNetworkService = this.A02;
        String userId = this.A01.getUserId();
        if (userId != null) {
            1vo r4 = metaAINuxNetworkService.A01;
            try {
                IID iid = (IID) C41847B3o.A17(C56184HuD.class, "create", 0);
                2IS r2 = iid.A00;
                r2.A04("owner", userId);
                iid.A03 = true;
                int ordinal = hLw.ordinal();
                if (ordinal == 0 || ordinal == 3) {
                    str2 = "IMAGINE";
                } else if (ordinal == 1) {
                    str2 = "WRITE_WITH_AI";
                } else if (ordinal == 2) {
                    str2 = "WRITE_WITH_AI_MMLLM";
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                r2.A04("intent_card_type", str2);
                iid.A02 = true;
                r2.A02("has_seen", true);
                iid.A01 = true;
                PandoGraphQLRequest A002 = iid.build();
                0qQ.A07(A002);
                Object A003 = C55228HeJ.A00(r4, A002, r11);
                1Hj r0 = 1Hj.A02;
                if (A003 != r0) {
                    A003 = C60340gF.A00;
                }
                if (A003 != r0) {
                    return C60340gF.A00;
                }
                return A003;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Il7, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C54639HLw r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 6
            boolean r0 = X.C58075Il7.A02(r3, r7)
            if (r0 == 0) goto L_0x0075
            r4 = r7
            X.Il7 r4 = (X.C58075Il7) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 != r1) goto L_0x008b
            X.0eS.A00(r3)
        L_0x0023:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005e
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r4 = r3.A00
            X.3lr r4 = (X.C250663lr) r4
            java.lang.Class<X.BWU> r3 = X.BWU.class
            r2 = 0
            r0 = 4263(0x10a7, float:5.974E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1919619742(0xffffffff8d94ed62, float:-9.178352E-31)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x005c
            r0 = 3225(0xc99, float:4.519E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L_0x004b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0053:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007d
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            return r0
        L_0x005c:
            r0 = 0
            goto L_0x004b
        L_0x005e:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0053
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            X.0eS.A00(r3)
            com.meta.metaai.shared.nux.service.MetaAINuxNetworkService r0 = r5.A02
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r6, r4)
            if (r3 != r2) goto L_0x0023
            return r2
        L_0x0075:
            r0 = 42
            X.Il7 r4 = new X.Il7
            r4.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r7, (int) r3, (int) r0)
            goto L_0x0015
        L_0x007d:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0086
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            return r0
        L_0x0086:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.nux.data.MetaAINuxRepository.A01(X.HLw, X.4D7):java.lang.Object");
    }

    public /* synthetic */ MetaAINuxRepository(Application application, FoaUserSession foaUserSession) {
        MetaAINuxNetworkService metaAINuxNetworkService = new MetaAINuxNetworkService(application, foaUserSession);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A02 = metaAINuxNetworkService;
    }
}
