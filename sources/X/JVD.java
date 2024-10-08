package X;

import android.text.TextUtils;
import java.util.AbstractCollection;

public final class JVD extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;

    public static MC0 A00(AnonymousClass0r6 r2, int i) {
        return JUM.A00(new JVD(i, (AnonymousClass4D7) null), r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JVD(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A02(JVE jve, Throwable th) {
        jve.A02("client_start_message_not_found", "auto_conf_client_start_query_failed", (String) null, th.getMessage(), TextUtils.join("\n", th.getStackTrace()), (String) null, (String) null);
    }

    public static void A03(Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C65488LuC(new FP6(obj, i), i2));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.JVD, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.JVD, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = new X.JVD(r0, r5);
        r2.A00 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        return new X.JVD(r1, r5, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r4, X.AnonymousClass4D7 r5) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x000f;
                case 2: goto L_0x0011;
                case 3: goto L_0x0013;
                case 4: goto L_0x0015;
                case 5: goto L_0x0017;
                case 6: goto L_0x0019;
                case 7: goto L_0x001b;
                case 8: goto L_0x001d;
                case 9: goto L_0x0020;
                case 10: goto L_0x0023;
                case 11: goto L_0x0026;
                case 12: goto L_0x0040;
                case 13: goto L_0x0046;
                case 14: goto L_0x004c;
                case 15: goto L_0x0052;
                case 16: goto L_0x0058;
                case 17: goto L_0x005e;
                case 18: goto L_0x0063;
                case 19: goto L_0x0068;
                case 20: goto L_0x006d;
                case 21: goto L_0x0072;
                case 22: goto L_0x0077;
                case 23: goto L_0x007c;
                case 24: goto L_0x0081;
                case 25: goto L_0x0086;
                case 26: goto L_0x008b;
                case 27: goto L_0x0090;
                case 28: goto L_0x0095;
                case 29: goto L_0x009a;
                case 30: goto L_0x009f;
                case 31: goto L_0x00a4;
                case 32: goto L_0x00a9;
                case 33: goto L_0x00ae;
                case 34: goto L_0x0029;
                case 35: goto L_0x002c;
                case 36: goto L_0x00b3;
                case 37: goto L_0x00b8;
                case 38: goto L_0x00bd;
                case 39: goto L_0x00c2;
                case 40: goto L_0x002f;
                case 41: goto L_0x0032;
                case 42: goto L_0x00c7;
                case 43: goto L_0x00cc;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d6;
                case 46: goto L_0x00db;
                case 47: goto L_0x0035;
                case 48: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 49
        L_0x0007:
            X.JVD r2 = new X.JVD
            r2.<init>(r0, r5)
            r2.A00 = r4
            return r2
        L_0x000f:
            r0 = 1
            goto L_0x0007
        L_0x0011:
            r0 = 2
            goto L_0x0007
        L_0x0013:
            r0 = 3
            goto L_0x0007
        L_0x0015:
            r0 = 4
            goto L_0x0007
        L_0x0017:
            r0 = 5
            goto L_0x0007
        L_0x0019:
            r0 = 6
            goto L_0x0007
        L_0x001b:
            r0 = 7
            goto L_0x0007
        L_0x001d:
            r0 = 8
            goto L_0x0007
        L_0x0020:
            r0 = 9
            goto L_0x0007
        L_0x0023:
            r0 = 10
            goto L_0x0007
        L_0x0026:
            r0 = 11
            goto L_0x0007
        L_0x0029:
            r0 = 34
            goto L_0x0007
        L_0x002c:
            r0 = 35
            goto L_0x0007
        L_0x002f:
            r0 = 40
            goto L_0x0007
        L_0x0032:
            r0 = 41
            goto L_0x0007
        L_0x0035:
            r0 = 47
            goto L_0x0007
        L_0x0038:
            r0 = 48
            goto L_0x0007
        L_0x003b:
            java.lang.Object r1 = r3.A00
            r0 = 0
            goto L_0x00df
        L_0x0040:
            java.lang.Object r1 = r3.A00
            r0 = 12
            goto L_0x00df
        L_0x0046:
            java.lang.Object r1 = r3.A00
            r0 = 13
            goto L_0x00df
        L_0x004c:
            java.lang.Object r1 = r3.A00
            r0 = 14
            goto L_0x00df
        L_0x0052:
            java.lang.Object r1 = r3.A00
            r0 = 15
            goto L_0x00df
        L_0x0058:
            java.lang.Object r1 = r3.A00
            r0 = 16
            goto L_0x00df
        L_0x005e:
            java.lang.Object r1 = r3.A00
            r0 = 17
            goto L_0x00df
        L_0x0063:
            java.lang.Object r1 = r3.A00
            r0 = 18
            goto L_0x00df
        L_0x0068:
            java.lang.Object r1 = r3.A00
            r0 = 19
            goto L_0x00df
        L_0x006d:
            java.lang.Object r1 = r3.A00
            r0 = 20
            goto L_0x00df
        L_0x0072:
            java.lang.Object r1 = r3.A00
            r0 = 21
            goto L_0x00df
        L_0x0077:
            java.lang.Object r1 = r3.A00
            r0 = 22
            goto L_0x00df
        L_0x007c:
            java.lang.Object r1 = r3.A00
            r0 = 23
            goto L_0x00df
        L_0x0081:
            java.lang.Object r1 = r3.A00
            r0 = 24
            goto L_0x00df
        L_0x0086:
            java.lang.Object r1 = r3.A00
            r0 = 25
            goto L_0x00df
        L_0x008b:
            java.lang.Object r1 = r3.A00
            r0 = 26
            goto L_0x00df
        L_0x0090:
            java.lang.Object r1 = r3.A00
            r0 = 27
            goto L_0x00df
        L_0x0095:
            java.lang.Object r1 = r3.A00
            r0 = 28
            goto L_0x00df
        L_0x009a:
            java.lang.Object r1 = r3.A00
            r0 = 29
            goto L_0x00df
        L_0x009f:
            java.lang.Object r1 = r3.A00
            r0 = 30
            goto L_0x00df
        L_0x00a4:
            java.lang.Object r1 = r3.A00
            r0 = 31
            goto L_0x00df
        L_0x00a9:
            java.lang.Object r1 = r3.A00
            r0 = 32
            goto L_0x00df
        L_0x00ae:
            java.lang.Object r1 = r3.A00
            r0 = 33
            goto L_0x00df
        L_0x00b3:
            java.lang.Object r1 = r3.A00
            r0 = 36
            goto L_0x00df
        L_0x00b8:
            java.lang.Object r1 = r3.A00
            r0 = 37
            goto L_0x00df
        L_0x00bd:
            java.lang.Object r1 = r3.A00
            r0 = 38
            goto L_0x00df
        L_0x00c2:
            java.lang.Object r1 = r3.A00
            r0 = 39
            goto L_0x00df
        L_0x00c7:
            java.lang.Object r1 = r3.A00
            r0 = 42
            goto L_0x00df
        L_0x00cc:
            java.lang.Object r1 = r3.A00
            r0 = 43
            goto L_0x00df
        L_0x00d1:
            java.lang.Object r1 = r3.A00
            r0 = 44
            goto L_0x00df
        L_0x00d6:
            java.lang.Object r1 = r3.A00
            r0 = 45
            goto L_0x00df
        L_0x00db:
            java.lang.Object r1 = r3.A00
            r0 = 46
        L_0x00df:
            X.JVD r2 = new X.JVD
            r2.<init>(r1, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVD.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass4D7 create;
        if (27 - this.A01 != 0) {
            create = AnonymousClass7TE.A1M(obj2, obj, this);
        } else {
            create = create(Integer.valueOf(AnonymousClass7TE.A0M(obj)), (AnonymousClass4D7) obj2);
        }
        return ((JVD) create).invokeSuspend(C60340gF.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.LuC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v119, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: X.LuC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v225, resolved type: X.LuC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v226, resolved type: X.LuC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: X.LuC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v227, resolved type: X.LuC} */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r4v39, types: [X.07Z, X.6Ky, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x028e, code lost:
        if (r3 == 0.0f) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0345, code lost:
        r4.ATL(r1, r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0354, code lost:
        r1.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x049f, code lost:
        r2 = r3.getOptionalTreeField(r4, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04a3, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04ae, code lost:
        return r2.reinterpretRequired(r4, X.C7Y.class, -1188148988);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0632, code lost:
        r30 = new X.C65488LuC(new X.LXK(r2, r0, 2), (X.C266444Yx) null, r33, r34, r35, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, X.ML9.A00, false, false, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x067f, code lost:
        r9 = new X.C65480Lu4(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0146, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x014d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x093a, code lost:
        if (X.LPL.A02(r6) != false) goto L_0x093d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0a27, code lost:
        if (r3 != null) goto L_0x08f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0ad5, code lost:
        return new X.C61042Jvg(X.AnonymousClass7TF.A1W(r1, r0), r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b4, code lost:
        if (r15 <= 0.0f) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c1, code lost:
        if (r7.A03 == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ce, code lost:
        if (r3 < 0.2f) goto L_0x01d0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            r46 = this;
            r2 = r46
            int r0 = r2.A01
            r1 = r47
            switch(r0) {
                case 0: goto L_0x0428;
                case 1: goto L_0x0b30;
                case 2: goto L_0x0b27;
                case 3: goto L_0x0b30;
                case 4: goto L_0x0b27;
                case 5: goto L_0x0ad6;
                case 6: goto L_0x0abe;
                case 7: goto L_0x0ab0;
                case 8: goto L_0x0aa2;
                case 9: goto L_0x0a94;
                case 10: goto L_0x0b27;
                case 11: goto L_0x0a81;
                case 12: goto L_0x041d;
                case 13: goto L_0x040b;
                case 14: goto L_0x03e5;
                case 15: goto L_0x03ae;
                case 16: goto L_0x0398;
                case 17: goto L_0x0383;
                case 18: goto L_0x0359;
                case 19: goto L_0x034a;
                case 20: goto L_0x02fa;
                case 21: goto L_0x0009;
                case 22: goto L_0x02ec;
                case 23: goto L_0x02ca;
                case 24: goto L_0x0009;
                case 25: goto L_0x0009;
                case 26: goto L_0x0009;
                case 27: goto L_0x0180;
                case 28: goto L_0x0a6d;
                case 29: goto L_0x0009;
                case 30: goto L_0x0009;
                case 31: goto L_0x0175;
                case 32: goto L_0x016a;
                case 33: goto L_0x014e;
                case 34: goto L_0x013a;
                case 35: goto L_0x0a5a;
                case 36: goto L_0x011e;
                case 37: goto L_0x04da;
                case 38: goto L_0x04cb;
                case 39: goto L_0x04b8;
                case 40: goto L_0x0b27;
                case 41: goto L_0x04af;
                case 42: goto L_0x0105;
                case 43: goto L_0x0079;
                case 44: goto L_0x0066;
                case 45: goto L_0x004d;
                case 46: goto L_0x0024;
                case 47: goto L_0x047c;
                case 48: goto L_0x0013;
                case 49: goto L_0x0454;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = A01(r1, r2)
            X.DbS.A1U(r0)
        L_0x0010:
            X.0gF r1 = X.C60340gF.A00
        L_0x0012:
            return r1
        L_0x0013:
            java.lang.Object r0 = A01(r1, r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x0012
        L_0x0021:
            java.lang.String r1 = "null response"
            return r1
        L_0x0024:
            java.lang.Object r3 = A01(r1, r2)
            com.instagram.casper.IgSignalsCasper r3 = (com.instagram.casper.IgSignalsCasper) r3
            r0 = 0
            r3.A00 = r0
            boolean r2 = com.instagram.casper.IgSignalsCasper.A09
            X.KSe r1 = r3.A04
            r0 = 5
            X.Iwj r4 = new X.Iwj
            r4.<init>(r0, r3, r2)
            java.lang.String r3 = "on_start"
            X.565 r2 = r1.A00
            if (r2 != 0) goto L_0x0041
            java.lang.String r0 = "productCore"
            goto L_0x0146
        L_0x0041:
            r1 = 1
            X.MBK r0 = new X.MBK
            r0.<init>(r4, r1)
            r2.A02(r3, r0)
            com.instagram.casper.IgSignalsCasper.A09 = r1
            goto L_0x0010
        L_0x004d:
            r4 = 0
            java.lang.Object r3 = A01(r1, r2)
            X.L8q r3 = (X.C63835L8q) r3
            X.JVE r5 = r3.A02
            java.lang.String r0 = "logger"
            r1 = 0
            if (r5 == 0) goto L_0x0146
            r0 = 1173(0x495, float:1.644E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A00(r0)
            goto L_0x0b3b
        L_0x0066:
            java.lang.Object r2 = A01(r1, r2)
            X.Dkz r2 = (X.C46772Dkz) r2
            X.2Fj r1 = r2.A01
            r0 = 1
            X.JTP.A1B(r1, r0)
            X.2Fj r1 = r2.A03
            r0 = 0
            X.JTP.A1B(r1, r0)
            goto L_0x0010
        L_0x0079:
            java.lang.Object r0 = A01(r1, r2)
            X.JgD r0 = (X.C60132JgD) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            r13 = 0
            java.lang.Integer r2 = X.C319116q4.A02(r1, r13)
            int r3 = r2.intValue()
            if (r3 == r13) goto L_0x00ca
            r2 = 1
            if (r3 == r2) goto L_0x0095
            X.05G r1 = r0.A01
            X.Ldc r0 = X.C64535Ldc.A00
            goto L_0x0354
        L_0x0095:
            r14 = 0
            X.2IS r3 = X.C41845B3m.A04()
            X.2IS r2 = X.C41845B3m.A04()
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r3.getParamsCopy()
            java.util.Map r11 = r2.getParamsCopy()
            java.lang.Class<X.Bmt> r12 = X.C42925Bmt.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "ContentSchedulingScheduledCountNumPerDayGenPopLinkedQuery"
            java.lang.String r17 = "xfb_scheduled_content_num_per_day"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r4 = X.1vm.A01(r1)
            r1 = 9
            X.LbE r3 = new X.LbE
            r3.<init>(r0, r1)
            r2 = 10
            goto L_0x00fe
        L_0x00ca:
            r14 = 0
            X.2IS r3 = X.C41845B3m.A04()
            X.2IS r2 = X.C41845B3m.A04()
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r3.getParamsCopy()
            java.util.Map r11 = r2.getParamsCopy()
            java.lang.Class<X.Bmu> r12 = X.C42926Bmu.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "ContentSchedulingScheduledCountNumPerDayQuery"
            java.lang.String r17 = "xfb_scheduled_content_num_per_day"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r4 = X.1vm.A01(r1)
            r1 = 8
            X.LbE r3 = new X.LbE
            r3.<init>(r0, r1)
            r2 = 9
        L_0x00fe:
            X.LbB r1 = new X.LbB
            r1.<init>(r0, r2)
            goto L_0x0345
        L_0x0105:
            java.lang.Object r4 = A01(r1, r2)
            X.6Ky r4 = (X.C306146Ky) r4
            X.U92 r0 = X.C306146Ky.A01(r4)
            X.0r6 r3 = r0.A08
            r2 = 0
            r1 = 32
            X.MGZ r0 = new X.MGZ
            r0.<init>(r4, r2, r1)
            X.JTS.A11(r4, r0, r3)
            goto L_0x0010
        L_0x011e:
            java.lang.Object r0 = A01(r1, r2)
            X.Jj4 r0 = (X.C60305Jj4) r0
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r3 = r0.A05
            X.1a8 r2 = r3.A03
            X.2Dm r0 = r3.A04
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r1 = r0.A0C
            X.2EN r0 = X.2EN.A04
            X.1aU r1 = r1.A09(r0)
            r0 = 0
            X.M1T.A00(r1, r2, r3, r0)
            goto L_0x0010
        L_0x013a:
            java.lang.Object r0 = A01(r1, r2)
            X.K0t r0 = (X.C61282K0t) r0
            X.MWZ r1 = r0.A00
            if (r1 != 0) goto L_0x0012
            java.lang.String r0 = "response"
        L_0x0146:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x014e:
            java.lang.Object r0 = A01(r1, r2)
            X.Jgu r0 = (X.C60175Jgu) r0
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r4 = r0.A01
            r3 = 20
            java.lang.String r2 = "DEAL_ACCEPTED"
            java.lang.String r1 = "COMPLETED_BY_CREATOR"
            java.lang.String r0 = "CLOSED"
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r2, r1, r0)
            X.0qQ.A07(r0)
            r4.A02(r0, r3)
            goto L_0x0010
        L_0x016a:
            java.lang.Object r0 = A01(r1, r2)
            X.K8W r0 = (X.K8W) r0
            X.K8W.A03(r0)
            goto L_0x0010
        L_0x0175:
            java.lang.Object r0 = A01(r1, r2)
            X.SP0 r0 = (X.SP0) r0
            r0.A01()
            goto L_0x0010
        L_0x0180:
            java.lang.Object r7 = A01(r1, r2)
            X.6C3 r7 = (X.AnonymousClass6C3) r7
            X.5Oz r6 = r7.A07
            java.lang.Object r2 = r6.getValue()
            r1 = 0
            if (r2 == 0) goto L_0x0293
            java.util.Map r0 = r7.A0B
            java.lang.Object r4 = r0.get(r2)
            X.GmR r4 = (X.C53341GmR) r4
        L_0x0197:
            java.lang.String r11 = r7.A02
            r0 = 0
            r5 = 0
            if (r11 == 0) goto L_0x0286
            if (r4 == 0) goto L_0x0283
            java.lang.String r10 = r4.A02
        L_0x01a1:
            int r9 = r7.A01
            java.util.Map r8 = r7.A0B
            java.lang.Object r4 = r8.get(r10)
            X.GmR r4 = (X.C53341GmR) r4
            if (r4 == 0) goto L_0x0280
            float r15 = r4.A00()
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            r2 = 1
            if (r3 > 0) goto L_0x01b7
        L_0x01b6:
            r2 = 0
        L_0x01b7:
            if (r2 == 0) goto L_0x0209
            if (r4 == 0) goto L_0x020a
            boolean r2 = r7.A04
            if (r2 == 0) goto L_0x020a
            boolean r2 = r7.A03
            if (r2 != 0) goto L_0x020a
        L_0x01c3:
            if (r4 == 0) goto L_0x01d0
            float r3 = r4.A00()
        L_0x01c9:
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0299
        L_0x01d0:
            java.lang.String r9 = r7.A02
            java.util.Map r2 = r7.A0B
            java.util.Iterator r12 = X.AnonymousClass7TF.A0u(r2)
            r11 = 0
            r10 = 0
        L_0x01da:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0296
            java.lang.Object r2 = r12.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r8 = r2.getValue()
            X.GmR r8 = (X.C53341GmR) r8
            if (r9 == 0) goto L_0x01f7
            java.lang.String r2 = r8.A01
            boolean r2 = X.0qQ.A0K(r2, r9)
            if (r2 == 0) goto L_0x01f7
            goto L_0x01da
        L_0x01f7:
            float r3 = r8.A00()
            int r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x01da
            r2 = 1053609165(0x3ecccccd, float:0.4)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x01da
            r11 = r8
            r10 = r3
            goto L_0x01da
        L_0x0209:
            r4 = r1
        L_0x020a:
            java.util.Iterator r14 = X.AnonymousClass7TF.A0u(r8)
            r13 = r15
        L_0x020f:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x01c3
            java.lang.Object r2 = r14.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r8 = r2.getValue()
            X.GmR r8 = (X.C53341GmR) r8
            java.lang.String r2 = r8.A01
            boolean r2 = X.0qQ.A0K(r2, r11)
            if (r2 == 0) goto L_0x020f
            boolean r2 = X.0qQ.A0K(r3, r10)
            if (r2 != 0) goto L_0x020f
            float r12 = r8.A00()
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x020f
            if (r4 == 0) goto L_0x027e
            java.lang.String r2 = r4.A02
        L_0x023f:
            boolean r2 = X.0qQ.A0K(r2, r10)
            if (r2 == 0) goto L_0x0252
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0252
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0252
        L_0x024f:
            r4 = r8
            r13 = r12
            goto L_0x020f
        L_0x0252:
            int r2 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x025f
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 + r15
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x025f
            goto L_0x020f
        L_0x025f:
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x024f
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x020f
            int r2 = r8.A00
            int r2 = r2 - r9
            int r3 = java.lang.Math.abs(r2)
            if (r4 == 0) goto L_0x027a
            int r2 = r4.A00
        L_0x0272:
            int r2 = r2 - r9
            int r2 = java.lang.Math.abs(r2)
            if (r3 >= r2) goto L_0x020f
            goto L_0x024f
        L_0x027a:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0272
        L_0x027e:
            r2 = r1
            goto L_0x023f
        L_0x0280:
            r15 = 0
            goto L_0x01b6
        L_0x0283:
            r10 = r1
            goto L_0x01a1
        L_0x0286:
            if (r4 == 0) goto L_0x0290
            float r3 = r4.A00()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x01c9
        L_0x0290:
            r4 = r1
            goto L_0x01d0
        L_0x0293:
            r4 = r1
            goto L_0x0197
        L_0x0296:
            if (r11 == 0) goto L_0x02c6
            r4 = r11
        L_0x0299:
            java.lang.String r3 = r4.A02
        L_0x029b:
            java.lang.Object r2 = r6.getValue()
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 != 0) goto L_0x02a7
            r7.A04 = r0
        L_0x02a7:
            if (r4 == 0) goto L_0x02c4
            java.lang.String r2 = r4.A02
        L_0x02ab:
            r6.Epw(r2)
            if (r4 == 0) goto L_0x02b2
            java.lang.String r1 = r4.A01
        L_0x02b2:
            r7.A02 = r1
            if (r4 == 0) goto L_0x02b8
            int r0 = r4.A00
        L_0x02b8:
            r7.A01 = r0
            if (r4 == 0) goto L_0x02c0
            float r5 = r4.A00()
        L_0x02c0:
            r7.A00 = r5
            goto L_0x0010
        L_0x02c4:
            r2 = r1
            goto L_0x02ab
        L_0x02c6:
            if (r4 != 0) goto L_0x0299
            r3 = r1
            goto L_0x029b
        L_0x02ca:
            java.lang.Object r4 = A01(r1, r2)
            X.GgM r4 = (X.C52969GgM) r4
            com.instagram.common.session.UserSession r3 = r4.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327632253499978(0x810fca00003a4a, double:3.037079144522695E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x0010
            X.1E8 r1 = r4.A05
            java.lang.String r0 = r4.A07
            X.1Xj r0 = r1.A02(r0)
            X.C52969GgM.A03(r4, r0)
            goto L_0x0010
        L_0x02ec:
            java.lang.Object r0 = A01(r1, r2)
            X.Hr5 r0 = (X.C55999Hr5) r0
            X.Ib5 r1 = r0.A05
            r0 = 0
            r1.A00(r0)
            goto L_0x0010
        L_0x02fa:
            java.lang.Object r0 = A01(r1, r2)
            X.Ddk r0 = (X.C46368Ddk) r0
            com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository r6 = r0.A00
            X.Kzf r5 = new X.Kzf
            r5.<init>(r0)
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "user_id"
            r4.A04(r0, r1)
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            java.lang.String r0 = "refresh_only"
            X.0Df r2 = X.C41845B3m.A03(r2, r1, r0)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "sticker_pack_id"
            X.0Df.A00(r2, r1, r0)
            java.lang.String r0 = "query_params"
            X.DbW.A18(r2, r4, r0)
            com.facebook.pando.PandoGraphQLRequest r0 = X.C64404LbL.A00(r4, r3)
            X.1Ef r7 = X.JTS.A0G(r0)
            X.1vn r4 = r6.A01
            r0 = 4
            X.LbE r3 = new X.LbE
            r3.<init>(r5, r0)
            X.LbB r1 = new X.LbB
            r1.<init>(r5, r0)
        L_0x0345:
            r4.ATL(r1, r3, r7)
            goto L_0x0010
        L_0x034a:
            java.lang.Object r0 = A01(r1, r2)
            X.Dkn r0 = (X.C46760Dkn) r0
            X.05G r1 = r0.A06
            X.3uy r0 = X.C255943uy.FAILED
        L_0x0354:
            r1.Epw(r0)
            goto L_0x0010
        L_0x0359:
            java.lang.Object r3 = A01(r1, r2)
            X.H0y r3 = (X.C54154H0y) r3
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L_0x0010
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            r0 = 2131976087(0x7f135f97, float:1.9589285E38)
            X.5Gt r0 = X.AnonymousClass7TG.A0e(r1, r0)
            r0.A03(r2)
            r0.A01()
            X.5Gv r1 = r0.A00()
            X.0eM r0 = r3.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r1.A07(r0)
            goto L_0x0010
        L_0x0383:
            java.lang.Object r0 = A01(r1, r2)
            X.K65 r0 = (X.K65) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Dbx r0 = (X.C46329Dbx) r0
            X.34p r0 = r0.A00
            r0.A05()
            goto L_0x0010
        L_0x0398:
            java.lang.Object r0 = A01(r1, r2)
            X.K65 r0 = (X.K65) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.Dbx r0 = (X.C46329Dbx) r0
            X.34p r1 = r0.A00
            r0 = 0
            r1.A08(r0)
            goto L_0x0010
        L_0x03ae:
            java.lang.Object r7 = A01(r1, r2)
            com.instagram.archive.data.HighlightsSettingsRepository r7 = (com.instagram.archive.data.HighlightsSettingsRepository) r7
            X.05G r6 = r7.A02
        L_0x03b6:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.6ws r0 = (X.C323056ws) r0
            java.lang.Object r4 = r0.A00
            X.9I8 r4 = (X.AnonymousClass9I8) r4
            com.instagram.common.session.UserSession r0 = r7.A01
            X.6wn r0 = X.C323006wm.A00(r0)
            X.0xa r2 = r0.A00
            java.lang.String r1 = "my_week_enabled"
            r0 = 0
            boolean r3 = r2.getBoolean(r1, r0)
            boolean r2 = r4.A01
            r0 = 1
            X.9I8 r1 = new X.9I8
            r1.<init>(r2, r3, r0)
            X.6wr r0 = new X.6wr
            r0.<init>(r1)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x03b6
            goto L_0x0010
        L_0x03e5:
            java.lang.Object r0 = A01(r1, r2)
            X.L7c r0 = (X.C63796L7c) r0
            X.L5r r1 = r0.A01
            java.lang.String r0 = r1.A01
            int r5 = r0.hashCode()
            java.lang.String r4 = r1.A02
            java.lang.String r3 = "effect_tab"
            X.02m r2 = X.02m.A0p
            r1 = 17629201(0x10d0011, float:2.5897658E-38)
            r2.markerStart(r1, r5)
            java.lang.String r0 = "product_surface"
            r2.markerAnnotate(r1, r5, r0, r3)
            java.lang.String r0 = "user_id"
            r2.markerAnnotate(r1, r5, r0, r4)
            goto L_0x0010
        L_0x040b:
            java.lang.Object r0 = A01(r1, r2)
            X.L3J r0 = (X.L3J) r0
            X.02m r2 = X.02m.A0p
            int r1 = r0.A00
            r0 = 17631975(0x10d0ae7, float:2.5905432E-38)
            r2.markerStart(r0, r1)
            goto L_0x0010
        L_0x041d:
            java.lang.Object r0 = A01(r1, r2)
            X.Jij r0 = (X.C60287Jij) r0
            r0.A01()
            goto L_0x0010
        L_0x0428:
            java.lang.Object r6 = A01(r1, r2)
            X.Jh4 r6 = (X.C60185Jh4) r6
            X.LTO r5 = r6.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A04
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r3 = r6.A01
            boolean r0 = r3.A01
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.util.Map r0 = r3.A00
            r5.A0B(r2, r1, r4, r0)
            X.JXt r0 = r6.A02
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "insights_viewed_first_time"
            X.DbW.A1L(r1, r0)
            goto L_0x0010
        L_0x0454:
            java.lang.Object r0 = A01(r1, r2)
            X.3JD r0 = (X.AnonymousClass3JD) r0
            if (r0 == 0) goto L_0x0b25
            X.3lr r3 = X.C41845B3m.A0U(r0)
            if (r3 == 0) goto L_0x0b25
            java.lang.Class<X.Bd6> r2 = X.Bd6.class
            r4 = 0
            r0 = 4248(0x1098, float:5.953E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1124235690(0xffffffffbcfd8656, float:-0.030947845)
            X.3lr r3 = r3.getRequiredTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0b25
            java.lang.Class<X.Bd5> r2 = X.Bd5.class
            java.lang.String r1 = "thread"
            r0 = 270860830(0x1025021e, float:3.2542143E-29)
            goto L_0x049f
        L_0x047c:
            java.lang.Object r0 = A01(r1, r2)
            X.3JD r0 = (X.AnonymousClass3JD) r0
            if (r0 == 0) goto L_0x0b25
            X.3lr r3 = X.C41845B3m.A0U(r0)
            if (r3 == 0) goto L_0x0b25
            java.lang.Class<X.Bcz> r2 = X.C42480Bcz.class
            r4 = 0
            java.lang.String r1 = "xdt_get_blend_membership(data:$data)"
            r0 = -813009301(0xffffffffcf8a766b, float:-4.6460329E9)
            X.3lr r3 = r3.getRequiredTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0b25
            java.lang.Class<X.Bcy> r2 = X.C42479Bcy.class
            java.lang.String r1 = "thread"
            r0 = -469599614(0xffffffffe4027a82, float:-9.627617E21)
        L_0x049f:
            X.3lr r2 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L_0x0b25
            java.lang.Class<X.C7Y> r1 = X.C7Y.class
            r0 = -1188148988(0xffffffffb92e4904, float:-1.6621134E-4)
            X.3lr r1 = r2.reinterpretRequired(r4, r1, r0)
            return r1
        L_0x04af:
            java.lang.Object r0 = A01(r1, r2)
            X.Gyd r0 = (X.C54054Gyd) r0
            java.util.List r1 = r0.A00
            return r1
        L_0x04b8:
            X.0eS.A00(r1)
            X.OVq r1 = X.C70995OVq.A00
            java.lang.Object r0 = r2.A00
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.Object r0 = r1.A00(r0)
            X.0eR r1 = new X.0eR
            r1.<init>(r0)
            return r1
        L_0x04cb:
            java.lang.Object r0 = A01(r1, r2)
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.delete()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x04da:
            java.lang.Object r0 = A01(r1, r2)
            X.Jj4 r0 = (X.C60305Jj4) r0
            r12 = 0
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r2 = r0.A05
            X.0Ud r1 = r2.A0D
            java.util.List r6 = X.JTO.A17(r1)
            X.0Ud r1 = r2.A0C
            java.lang.Object r13 = r1.getValue()
            X.4ol r13 = (X.C274624ol) r13
            X.0Ud r1 = r2.A0B
            boolean r29 = X.JTR.A1a(r1)
            X.0Ud r1 = r2.A0A
            boolean r28 = X.JTR.A1a(r1)
            X.0Ud r1 = r2.A09
            boolean r27 = X.JTR.A1a(r1)
            X.0Ud r1 = r2.A08
            java.lang.Object r26 = r1.getValue()
            r1 = r26
            X.Jvg r1 = (X.C61042Jvg) r1
            r26 = r1
            X.0Ud r1 = r0.A0F
            java.lang.Object r3 = r1.getValue()
            com.instagram.mediakit.repository.MediaKitRepository r1 = r0.A08
            X.0Ud r1 = r1.A0A
            java.lang.Object r7 = r1.getValue()
            X.0eP r7 = (X.0eP) r7
            r11 = 0
            r1 = r26
            X.DbW.A1N(r6, r11, r1)
            r1 = 7
            X.0qQ.A0B(r7, r1)
            java.util.Iterator r5 = r6.iterator()
        L_0x052d:
            boolean r1 = r5.hasNext()
            r4 = 1
            r23 = 0
            if (r1 == 0) goto L_0x05c8
            java.lang.Object r8 = r5.next()
            r1 = r8
            X.4lA r1 = (X.C272664lA) r1
            com.instagram.api.schemas.UserMonetizationProductType r2 = r1.A07
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            if (r2 != r1) goto L_0x052d
        L_0x0543:
            X.4lA r8 = (X.C272664lA) r8
            if (r8 == 0) goto L_0x05c6
            com.instagram.api.schemas.MonetizationEligibilityDecision r2 = r8.A05
        L_0x0549:
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x0564
            if (r2 == 0) goto L_0x0564
            com.instagram.common.session.UserSession r10 = r0.A07
            X.0iw r9 = r0.A06
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "status"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r1, r2)
            X.JVF.A05(r9, r10, r5, r1)
            r0.A03 = r4
        L_0x0564:
            java.util.Iterator r9 = r6.iterator()
        L_0x0568:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x05c3
            java.lang.Object r5 = r9.next()
            r1 = r5
            X.4lA r1 = (X.C272664lA) r1
            com.instagram.api.schemas.UserMonetizationProductType r2 = r1.A07
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND
            if (r2 != r1) goto L_0x0568
        L_0x057b:
            X.4lA r5 = (X.C272664lA) r5
            if (r5 != 0) goto L_0x0598
            java.util.Iterator r6 = r6.iterator()
        L_0x0583:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x05c0
            java.lang.Object r5 = r6.next()
            r1 = r5
            X.4lA r1 = (X.C272664lA) r1
            com.instagram.api.schemas.UserMonetizationProductType r2 = r1.A07
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR
            if (r2 != r1) goto L_0x0583
        L_0x0596:
            X.4lA r5 = (X.C272664lA) r5
        L_0x0598:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            if (r3 == 0) goto L_0x05a1
            r1.add(r3)
        L_0x05a1:
            if (r8 == 0) goto L_0x05bd
            com.instagram.api.schemas.MonetizationEligibilityDecision r6 = r8.A05
        L_0x05a5:
            r2 = 2131969171(0x7f134493, float:1.9575257E38)
            X.FOl r10 = X.C50095FOl.A00
            X.Lu9 r3 = new X.Lu9
            r3.<init>(r10, r12, r2, r11)
            if (r6 == 0) goto L_0x0611
            int r2 = r6.ordinal()
            switch(r2) {
                case -1: goto L_0x0611;
                case 0: goto L_0x0611;
                case 1: goto L_0x0617;
                case 2: goto L_0x05f9;
                case 3: goto L_0x05e4;
                case 4: goto L_0x05cc;
                case 5: goto L_0x05cc;
                case 6: goto L_0x0611;
                default: goto L_0x05b8;
            }
        L_0x05b8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x05bd:
            r6 = r23
            goto L_0x05a5
        L_0x05c0:
            r5 = r23
            goto L_0x0596
        L_0x05c3:
            r5 = r23
            goto L_0x057b
        L_0x05c6:
            r2 = 0
            goto L_0x0549
        L_0x05c8:
            r8 = r23
            goto L_0x0543
        L_0x05cc:
            r2 = 2131238125(0x7f081ced, float:1.809252E38)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)
            r2 = 2130970215(0x7f040667, float:1.7549134E38)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r2)
            r2 = 2131969164(0x7f13448c, float:1.9575243E38)
            java.lang.Integer r35 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "not_eligible"
            goto L_0x0632
        L_0x05e4:
            r14 = 2131973139(0x7f135413, float:1.9583305E38)
            r2 = 311(0x137, float:4.36E-43)
            java.lang.String r15 = X.C66579MXk.A00(r2)
            r2 = 2
            X.LXK r9 = new X.LXK
            r9.<init>(r15, r0, r2)
            X.LuC r2 = new X.LuC
            r2.<init>(r9, r14)
            goto L_0x0657
        L_0x05f9:
            r2 = 2131238110(0x7f081cde, float:1.809249E38)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)
            r2 = 2130970331(0x7f0406db, float:1.754937E38)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r2)
            r2 = 2131969163(0x7f13448b, float:1.9575241E38)
            java.lang.Integer r35 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "eligible"
            goto L_0x0632
        L_0x0611:
            X.Lu3 r2 = new X.Lu3
            r2.<init>()
            goto L_0x0657
        L_0x0617:
            r2 = 2131239007(0x7f08205f, float:1.8094309E38)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)
            r2 = 2131099673(0x7f060019, float:1.7811706E38)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r2)
            r2 = 2131969162(0x7f13448a, float:1.957524E38)
            java.lang.Integer r35 = java.lang.Integer.valueOf(r2)
            r2 = 255(0xff, float:3.57E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
        L_0x0632:
            r9 = 2
            X.LXK r14 = new X.LXK
            r14.<init>(r2, r0, r9)
            X.ML9 r41 = X.ML9.A00
            X.LuC r2 = new X.LuC
            r30 = r2
            r31 = r14
            r32 = r12
            r36 = r12
            r37 = r12
            r38 = r12
            r39 = r12
            r40 = r12
            r42 = r11
            r43 = r11
            r44 = r11
            r45 = r11
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
        L_0x0657:
            X.MSZ r2 = (X.MSZ) r2
            if (r6 == 0) goto L_0x0676
            int r6 = r6.ordinal()
            switch(r6) {
                case -1: goto L_0x0676;
                case 0: goto L_0x0676;
                case 1: goto L_0x067c;
                case 2: goto L_0x067c;
                case 3: goto L_0x0672;
                case 4: goto L_0x0667;
                case 5: goto L_0x0667;
                case 6: goto L_0x0676;
                default: goto L_0x0662;
            }
        L_0x0662:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0667:
            boolean r9 = r0.A0G
            r6 = 2131964333(0x7f1331ad, float:1.9565445E38)
            if (r9 == 0) goto L_0x067f
            r6 = 2131964332(0x7f1331ac, float:1.9565443E38)
            goto L_0x067f
        L_0x0672:
            r6 = 2131973140(0x7f135414, float:1.9583307E38)
            goto L_0x067f
        L_0x0676:
            X.Lu3 r9 = new X.Lu3
            r9.<init>()
            goto L_0x0684
        L_0x067c:
            r6 = 2131954720(0x7f130c20, float:1.9545947E38)
        L_0x067f:
            X.Lu4 r9 = new X.Lu4
            r9.<init>(r6)
        L_0x0684:
            r25 = 2
            X.MSZ r9 = (X.MSZ) r9
            X.MSZ[] r2 = new X.MSZ[]{r3, r2, r9}
            java.util.List r2 = X.0sr.A1P(r2)
            r1.addAll(r2)
            if (r5 == 0) goto L_0x079a
            java.util.ArrayList r24 = X.AnonymousClass7TE.A1C()
            com.instagram.monetization.repository.MonetizationRepository r9 = r0.A09
            r9.A01(r5)
            boolean r2 = r5.A09
            if (r2 == 0) goto L_0x0795
            com.instagram.common.session.UserSession r6 = r0.A07
            r2 = 36316808936034961(0x8105f200021291, double:3.030234434975817E-306)
            boolean r2 = X.AnonymousClass430.A03(r6, r2)
            if (r2 == 0) goto L_0x08d6
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r2 = 36312995005138507(0x81027a0003064b, double:3.0278224897194325E-306)
            boolean r18 = X.AnonymousClass430.A03(r6, r2)
            r2 = 36312995005072970(0x81027a0002064a, double:3.0278224896779866E-306)
            boolean r17 = X.AnonymousClass430.A03(r6, r2)
            boolean r16 = X.AnonymousClass430.A01(r6)
            com.instagram.api.schemas.UserMonetizationProductType r2 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_BRAND
            boolean r15 = r9.A05(r2)
            boolean r14 = X.JYR.A00(r6)
            r2 = 36312995005400654(0x81027a0007064e, double:3.0278224898852153E-306)
            boolean r9 = X.AnonymousClass430.A03(r6, r2)
            r2 = 36316808936100498(0x8105f200031292, double:3.030234435017263E-306)
            boolean r7 = X.AnonymousClass430.A03(r6, r2)
            if (r15 == 0) goto L_0x089d
            if (r14 == 0) goto L_0x0790
            if (r18 != 0) goto L_0x06f3
            if (r17 != 0) goto L_0x06f3
            if (r16 != 0) goto L_0x06f3
            if (r9 != 0) goto L_0x06f3
            if (r7 == 0) goto L_0x071a
        L_0x06f3:
            r2 = 2131953735(0x7f130847, float:1.954395E38)
            X.DbV.A1E(r10, r12, r5, r2, r4)
            boolean r2 = r0.A02
            if (r2 != 0) goto L_0x0706
            X.0iw r3 = r0.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            X.JVF.A01(r3, r6, r2)
            r0.A02 = r4
        L_0x0706:
            if (r18 == 0) goto L_0x0710
            r3 = 2131953744(0x7f130850, float:1.9543968E38)
            r2 = 63
            A03(r0, r5, r2, r3)
        L_0x0710:
            if (r17 == 0) goto L_0x071a
            r3 = 2131953751(0x7f130857, float:1.9543982E38)
            r2 = 64
            A03(r0, r5, r2, r3)
        L_0x071a:
            if (r29 == 0) goto L_0x0726
            if (r16 == 0) goto L_0x0726
            r3 = 2131953749(0x7f130855, float:1.9543978E38)
            r2 = 65
            A03(r0, r5, r2, r3)
        L_0x0726:
            if (r7 == 0) goto L_0x077c
            r2 = 2131953736(0x7f130848, float:1.9543951E38)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)
            X.1Am r3 = r0.A0A
            X.1An r2 = X.1An.A0Y
            X.0xa r3 = r3.A03(r2)
            java.lang.String r2 = "has_user_seen_desktop_tool"
            boolean r2 = r3.getBoolean(r2, r11)
            r40 = r2 ^ 1
            r2 = 10
            X.LY1 r3 = new X.LY1
            r3.<init>(r0, r2)
            r2 = 2131953737(0x7f130849, float:1.9543953E38)
            java.lang.Integer r32 = java.lang.Integer.valueOf(r2)
            X.ML9 r38 = X.ML9.A00
            X.LuC r2 = new X.LuC
            r27 = r2
            r28 = r3
            r29 = r12
            r30 = r12
            r31 = r12
            r34 = r12
            r35 = r12
            r36 = r12
            r37 = r12
            r39 = r11
            r41 = r11
            r42 = r11
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r5.add(r2)
            boolean r2 = r0.A01
            if (r2 != 0) goto L_0x077c
            X.0iw r3 = r0.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A09
            X.JVF.A01(r3, r6, r2)
            r0.A01 = r4
        L_0x077c:
            if (r9 == 0) goto L_0x0790
            r6 = 2131953741(0x7f13084d, float:1.9543962E38)
            r2 = 66
            X.FP6 r3 = new X.FP6
            r3.<init>((java.lang.Object) r0, (int) r2)
        L_0x0788:
            X.LuC r2 = new X.LuC
            r2.<init>(r3, r6)
            r5.add(r2)
        L_0x0790:
            r2 = r24
            r2.addAll(r5)
        L_0x0795:
            r2 = r24
            r1.addAll(r2)
        L_0x079a:
            if (r8 == 0) goto L_0x0899
            com.instagram.api.schemas.MonetizationEligibilityDecision r3 = r8.A05
        L_0x079e:
            com.instagram.api.schemas.MonetizationEligibilityDecision r2 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE
            if (r3 == r2) goto L_0x07af
            if (r8 == 0) goto L_0x07a8
            com.instagram.api.schemas.MonetizationEligibilityDecision r2 = r8.A05
            r23 = r2
        L_0x07a8:
            com.instagram.api.schemas.MonetizationEligibilityDecision r3 = com.instagram.api.schemas.MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE
            r2 = r23
            if (r2 == r3) goto L_0x07af
            r4 = 0
        L_0x07af:
            r2 = r26
            boolean r3 = r2.A01
            boolean r7 = r2.A00
            if (r3 != 0) goto L_0x0879
            if (r7 != 0) goto L_0x0879
            X.0sn r2 = X.0sn.A00
        L_0x07bb:
            r1.addAll(r2)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r4 != 0) goto L_0x07c8
            boolean r2 = r0.A0G
            if (r2 == 0) goto L_0x07d9
        L_0x07c8:
            r5 = 2131969134(0x7f13446e, float:1.9575182E38)
            r2 = 1
            X.DbV.A1E(r10, r12, r3, r5, r2)
            if (r4 == 0) goto L_0x07d9
            r4 = 2131972227(0x7f135083, float:1.9581456E38)
            r2 = 62
            A03(r0, r3, r2, r4)
        L_0x07d9:
            boolean r2 = r0.A0G
            if (r2 == 0) goto L_0x07ee
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            if (r13 != 0) goto L_0x0815
            X.Lu3 r2 = new X.Lu3
            r2.<init>()
        L_0x07e8:
            r4.add(r2)
        L_0x07eb:
            r3.addAll(r4)
        L_0x07ee:
            r1.addAll(r3)
            r3 = 2131969161(0x7f134489, float:1.9575237E38)
            r2 = 1
            X.Lu9 r5 = new X.Lu9
            r5.<init>(r10, r12, r3, r2)
            r4 = 2131969165(0x7f13448d, float:1.9575245E38)
            X.FPB r3 = new X.FPB
            r2 = r25
            r3.<init>((java.lang.Object) r0, (int) r2)
            X.LuC r0 = new X.LuC
            r0.<init>(r3, r4)
            X.MSZ[] r0 = new X.MSZ[]{r5, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r1.addAll(r0)
            return r1
        L_0x0815:
            X.JxM r13 = (X.C61110JxM) r13
            boolean r7 = r13.A02
            r6 = 3
            X.LsA r5 = new X.LsA
            r5.<init>(r0, r6)
            r17 = 2131429058(0x7f0b06c2, float:1.8479778E38)
            r18 = 2131953086(0x7f1305be, float:1.9542633E38)
            r20 = 1
            X.LuB r2 = new X.LuB
            r14 = r2
            r15 = r12
            r16 = r5
            r19 = r7
            r21 = r20
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r4.add(r2)
            r5 = 2131953085(0x7f1305bd, float:1.9542631E38)
            X.Lu4 r2 = new X.Lu4
            r2.<init>(r5)
            r4.add(r2)
            if (r7 == 0) goto L_0x07eb
            X.FPB r5 = new X.FPB
            r5.<init>((java.lang.Object) r0, (int) r6)
            int r2 = r13.A00
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)
            r2 = 2131953087(0x7f1305bf, float:1.9542635E38)
            java.lang.Integer r31 = java.lang.Integer.valueOf(r2)
            X.ML9 r37 = X.ML9.A00
            X.LuC r2 = new X.LuC
            r26 = r2
            r27 = r5
            r28 = r12
            r29 = r12
            r30 = r12
            r32 = r12
            r34 = r12
            r35 = r12
            r36 = r12
            r38 = r11
            r39 = r11
            r40 = r11
            r41 = r11
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x07e8
        L_0x0879:
            r3 = 2131957048(0x7f131538, float:1.9550669E38)
            r2 = 1
            X.Lu9 r6 = new X.Lu9
            r6.<init>(r10, r12, r3, r2)
            r5 = 2131957047(0x7f131537, float:1.9550667E38)
            X.FOq r3 = new X.FOq
            r3.<init>((int) r11, (java.lang.Object) r0, (boolean) r7)
            X.LuC r2 = new X.LuC
            r2.<init>(r3, r5)
            X.MSZ[] r2 = new X.MSZ[]{r6, r2}
            java.util.List r2 = X.0sr.A1P(r2)
            goto L_0x07bb
        L_0x0899:
            r3 = r23
            goto L_0x079e
        L_0x089d:
            r2 = 36316808936034961(0x8105f200021291, double:3.030234434975817E-306)
            boolean r2 = X.AnonymousClass430.A03(r6, r2)
            if (r2 == 0) goto L_0x0790
            r2 = 2131953735(0x7f130847, float:1.954395E38)
            X.DbV.A1E(r10, r12, r5, r2, r4)
            r9 = 2131953740(0x7f13084c, float:1.954396E38)
            r2 = 2131953739(0x7f13084b, float:1.9543957E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r2 = 67
            X.FP6 r3 = new X.FP6
            r3.<init>((java.lang.Object) r0, (int) r2)
            X.LuC r2 = new X.LuC
            r2.<init>((android.view.View.OnClickListener) r3, (java.lang.Integer) r7, (int) r9)
            r5.add(r2)
            boolean r2 = r0.A00
            if (r2 != 0) goto L_0x0790
            X.0iw r3 = r0.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A06
            X.JVF.A01(r3, r6, r2)
            r0.A00 = r4
            goto L_0x0790
        L_0x08d6:
            r2 = 36312995004941896(0x81027a00000648, double:3.027822489595095E-306)
            boolean r2 = X.AnonymousClass430.A03(r6, r2)
            if (r2 == 0) goto L_0x0795
            X.4l9 r3 = r5.A01
            if (r3 == 0) goto L_0x0a26
            r2 = r3
            X.4l8 r2 = (X.C272654l8) r2
            java.lang.Boolean r2 = r2.A01
            if (r2 == 0) goto L_0x0a26
            boolean r14 = r2.booleanValue()
        L_0x08f0:
            X.4l8 r3 = (X.C272654l8) r3
            java.lang.Boolean r2 = r3.A00
            if (r2 == 0) goto L_0x0a2b
            boolean r22 = r2.booleanValue()
        L_0x08fa:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            boolean r21 = X.LPL.A02(r6)
            r2 = 36312995005204044(0x81027a0004064c, double:3.0278224897608784E-306)
            boolean r20 = X.AnonymousClass430.A03(r6, r2)
            boolean r19 = X.AnonymousClass430.A01(r6)
            com.instagram.api.schemas.UserMonetizationProductType r2 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR
            boolean r18 = r9.A05(r2)
            boolean r17 = X.JYR.A01(r6)
            r2 = 36312995005335117(0x81027a0006064d, double:3.0278224898437695E-306)
            boolean r16 = X.AnonymousClass430.A03(r6, r2)
            r2 = 36315988597149530(0x81053300000f5a, double:3.029715649361431E-306)
            X.1AA r15 = X.182.A02(r6, r2)
            if (r15 == 0) goto L_0x093c
            X.0Tu r9 = X.0Tu.A04
            boolean r2 = r15.Ah0(r9, r2)
            if (r2 != r4) goto L_0x093c
            boolean r2 = X.LPL.A02(r6)
            r9 = 1
            if (r2 != 0) goto L_0x093d
        L_0x093c:
            r9 = 0
        L_0x093d:
            if (r18 == 0) goto L_0x0a2f
            if (r17 == 0) goto L_0x0790
            if (r21 != 0) goto L_0x0949
            if (r20 != 0) goto L_0x0949
            if (r19 != 0) goto L_0x0949
            if (r16 == 0) goto L_0x095c
        L_0x0949:
            r2 = 2131953735(0x7f130847, float:1.954395E38)
            X.DbV.A1E(r10, r12, r5, r2, r4)
            boolean r2 = r0.A02
            if (r2 != 0) goto L_0x095c
            X.0iw r3 = r0.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            X.JVF.A01(r3, r6, r2)
            r0.A02 = r4
        L_0x095c:
            if (r9 == 0) goto L_0x098e
            r15 = 2131961876(0x7f132814, float:1.9560461E38)
            X.1Am r3 = r0.A0A
            X.1An r2 = X.1An.A0Y
            X.0xa r3 = r3.A03(r2)
            r9 = 0
            if (r27 == 0) goto L_0x0975
            java.lang.String r2 = "has_user_seen_project_board"
            boolean r2 = r3.getBoolean(r2, r11)
            if (r2 != 0) goto L_0x0975
            r9 = 1
        L_0x0975:
            r2 = 11
            X.LY1 r3 = new X.LY1
            r3.<init>(r0, r2)
            X.LuC r2 = new X.LuC
            r2.<init>((android.view.View.OnClickListener) r3, (int) r15, (boolean) r9)
            r5.add(r2)
            if (r28 == 0) goto L_0x098e
            r3 = 2131965845(0x7f133795, float:1.9568511E38)
            r2 = 68
            A03(r0, r5, r2, r3)
        L_0x098e:
            java.lang.Object r2 = r7.A00
            boolean r2 = X.AnonymousClass7TE.A1a(r2)
            java.lang.Object r9 = r7.A01
            java.lang.String r9 = (java.lang.String) r9
            if (r2 != 0) goto L_0x09a9
            X.0Tu r7 = X.0Tu.A05
            if (r9 == 0) goto L_0x09f6
            r2 = 36316289244926153(0x810579000110c9, double:3.029905780225979E-306)
            boolean r2 = X.182.A06(r7, r6, r2)
            if (r2 != 0) goto L_0x0a01
        L_0x09a9:
            if (r20 == 0) goto L_0x09bd
            r7 = 2131953750(0x7f130856, float:1.954398E38)
            r2 = 69
            X.FP6 r3 = new X.FP6
            r3.<init>((java.lang.Object) r0, (int) r2)
            X.LuC r2 = new X.LuC
            r2.<init>((android.view.View.OnClickListener) r3, (int) r7, (boolean) r14)
            r5.add(r2)
        L_0x09bd:
            if (r29 == 0) goto L_0x09c9
            if (r19 == 0) goto L_0x09c9
            r3 = 2131953749(0x7f130855, float:1.9543978E38)
            r2 = 61
            A03(r0, r5, r2, r3)
        L_0x09c9:
            if (r16 == 0) goto L_0x0790
            r9 = 2131953745(0x7f130851, float:1.954397E38)
            r7 = r22 ^ 1
            r2 = 70
            X.FP6 r3 = new X.FP6
            r3.<init>((java.lang.Object) r0, (int) r2)
            X.LuC r2 = new X.LuC
            r2.<init>((android.view.View.OnClickListener) r3, (int) r9, (boolean) r7)
            r5.add(r2)
            X.0Tu r7 = X.0Tu.A05
            r2 = 36329539218981038(0x811186000040ae, double:3.038285117171651E-306)
            boolean r2 = X.182.A06(r7, r6, r2)
            if (r2 == 0) goto L_0x0790
            r6 = 2131953742(0x7f13084e, float:1.9543964E38)
            X.FPB r3 = new X.FPB
            r3.<init>((java.lang.Object) r0, (int) r11)
            goto L_0x0788
        L_0x09f6:
            r2 = 36316289244860616(0x810579000010c8, double:3.029905780184533E-306)
            boolean r2 = X.182.A06(r7, r6, r2)
            if (r2 == 0) goto L_0x09a9
        L_0x0a01:
            r15 = 2131965916(0x7f1337dc, float:1.9568655E38)
            r7 = 0
            if (r9 != 0) goto L_0x0a18
            X.0eM r2 = r0.A0B
            java.lang.Object r3 = r2.getValue()
            X.LC9 r3 = (X.LC9) r3
            X.KiA r2 = X.C62577KiA.MEDIA_KIT_INTRO
            boolean r2 = r3.A00(r2, r11)
            if (r2 == 0) goto L_0x0a18
            r7 = 1
        L_0x0a18:
            X.FOr r3 = new X.FOr
            r3.<init>((java.lang.String) r9, (java.lang.Object) r0, (int) r11)
            X.LuC r2 = new X.LuC
            r2.<init>((android.view.View.OnClickListener) r3, (int) r15, (boolean) r7)
            r5.add(r2)
            goto L_0x09a9
        L_0x0a26:
            r14 = 0
            if (r3 == 0) goto L_0x0a2b
            goto L_0x08f0
        L_0x0a2b:
            r22 = 1
            goto L_0x08fa
        L_0x0a2f:
            r2 = 2131953735(0x7f130847, float:1.954395E38)
            X.DbV.A1E(r10, r12, r5, r2, r4)
            r7 = 2131953740(0x7f13084c, float:1.954396E38)
            r2 = 2131953738(0x7f13084a, float:1.9543955E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            X.FPB r3 = new X.FPB
            r3.<init>((java.lang.Object) r0, (int) r4)
            X.LuC r2 = new X.LuC
            r2.<init>((android.view.View.OnClickListener) r3, (java.lang.Integer) r6, (int) r7)
            r5.add(r2)
            if (r29 == 0) goto L_0x0790
            if (r19 == 0) goto L_0x0790
            r3 = 2131953749(0x7f130855, float:1.9543978E38)
            r2 = 61
            A03(r0, r5, r2, r3)
            goto L_0x0790
        L_0x0a5a:
            java.lang.Object r0 = A01(r1, r2)
            X.MWZ r0 = (X.MWZ) r0
            X.Jxe r0 = (X.C61128Jxe) r0
            boolean r3 = r0.A02
            int r2 = r0.A00
            r0 = 0
            X.JxM r1 = new X.JxM
            r1.<init>(r0, r2, r3)
            return r1
        L_0x0a6d:
            X.0eS.A00(r1)
            java.lang.Object r3 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0a7f }
            X.6DR r3 = (X.AnonymousClass6DR) r3     // Catch:{ IllegalArgumentException -> 0x0a7f }
            byte[] r2 = r3.A0A     // Catch:{ IllegalArgumentException -> 0x0a7f }
            r1 = 0
            int r0 = r2.length     // Catch:{ IllegalArgumentException -> 0x0a7f }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0a7f }
            r3.A00 = r1     // Catch:{ IllegalArgumentException -> 0x0a7f }
            return r1
        L_0x0a7f:
            r1 = 0
            return r1
        L_0x0a81:
            java.lang.Object r0 = A01(r1, r2)
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r0 = r0.FH3()
            X.JtH r0 = (X.C60897JtH) r0
            int r0 = r0.A00
            java.lang.Integer r1 = X.JTO.A0w(r0)
            return r1
        L_0x0a94:
            java.lang.Object r3 = A01(r1, r2)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 1
            r0 = 2
            X.Jvk r1 = new X.Jvk
            r1.<init>((java.lang.String) r3, (boolean) r2, (int) r0)
            return r1
        L_0x0aa2:
            java.lang.Object r0 = A01(r1, r2)
            X.MWA r0 = (X.MWA) r0
            X.JxA r0 = (X.C61099JxA) r0
            com.instagram.api.schemas.ContentAppreciationFeatureStatus r1 = r0.A00
            com.instagram.api.schemas.ContentAppreciationFeatureStatus r0 = com.instagram.api.schemas.ContentAppreciationFeatureStatus.ON
            r3 = 1
            goto L_0x0acb
        L_0x0ab0:
            java.lang.Object r3 = A01(r1, r2)
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            r0 = 2
            X.Jvk r1 = new X.Jvk
            r1.<init>((java.lang.String) r3, (boolean) r2, (int) r0)
            return r1
        L_0x0abe:
            java.lang.Object r0 = A01(r1, r2)
            X.MWA r0 = (X.MWA) r0
            X.JxA r0 = (X.C61099JxA) r0
            com.instagram.api.schemas.ContentAppreciationFeatureStatus r1 = r0.A00
            com.instagram.api.schemas.ContentAppreciationFeatureStatus r0 = com.instagram.api.schemas.ContentAppreciationFeatureStatus.ON
            r3 = 0
        L_0x0acb:
            boolean r2 = X.AnonymousClass7TF.A1W(r1, r0)
            r0 = 2
            X.Jvg r1 = new X.Jvg
            r1.<init>((boolean) r2, (boolean) r3, (int) r0)
            return r1
        L_0x0ad6:
            java.lang.Object r3 = A01(r1, r2)
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<com.instagram.appreciation.graphql.FetchAppreciationCreatorLifetimeEarningsResponseImpl$Viewer> r2 = com.instagram.appreciation.graphql.FetchAppreciationCreatorLifetimeEarningsResponseImpl.Viewer.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -1780990833(0xffffffff95d83c8f, float:-8.733725E-26)
            r4 = 0
            java.lang.String r0 = "viewer"
            X.3lr r3 = r3.getOptionalTreeField(r4, r0, r2, r1)
            if (r3 == 0) goto L_0x0b25
            java.lang.Class<com.instagram.appreciation.graphql.FetchAppreciationCreatorLifetimeEarningsResponseImpl$Viewer$User> r2 = com.instagram.appreciation.graphql.FetchAppreciationCreatorLifetimeEarningsResponseImpl.Viewer.User.class
            r1 = -697973659(0xffffffffd665c465, float:-6.3157918E13)
            java.lang.String r0 = "user"
            X.3lr r3 = r3.getOptionalTreeField(r4, r0, r2, r1)
            if (r3 == 0) goto L_0x0b25
            java.lang.Class<com.instagram.appreciation.graphql.FetchAppreciationCreatorLifetimeEarningsResponseImpl$Viewer$User$ContentAppreciationInsights> r2 = com.instagram.appreciation.graphql.FetchAppreciationCreatorLifetimeEarningsResponseImpl.Viewer.User.ContentAppreciationInsights.class
            r1 = 684595534(0x28ce194e, float:2.2881568E-14)
            r0 = 569(0x239, float:7.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r3 = r3.getOptionalTreeField(r4, r0, r2, r1)
            if (r3 == 0) goto L_0x0b25
            java.lang.Class<com.instagram.appreciation.graphql.FetchAppreciationCreatorLifetimeEarningsResponseImpl$Viewer$User$ContentAppreciationInsights$LifetimeEstimatedEarnings> r2 = com.instagram.appreciation.graphql.FetchAppreciationCreatorLifetimeEarningsResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings.class
            r1 = -2006277420(0xffffffff886aa2d4, float:-7.0608217E-34)
            r0 = 690(0x2b2, float:9.67E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r2 = r3.getOptionalTreeField(r4, r0, r2, r1)
            if (r2 == 0) goto L_0x0b25
            java.lang.Class<com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl> r1 = com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl.class
            r0 = 1941391533(0x73b748ad, float:2.9042492E31)
            X.3lr r1 = r2.reinterpretRequired(r4, r1, r0)
            return r1
        L_0x0b25:
            r1 = 0
            return r1
        L_0x0b27:
            java.lang.Object r0 = A01(r1, r2)
            java.lang.String r1 = r0.toString()
            return r1
        L_0x0b30:
            java.lang.Object r0 = A01(r1, r2)
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r1 = r0.FH3()
            return r1
        L_0x0b3b:
            X.LQW r2 = r3.A01     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            if (r2 != 0) goto L_0x0b49
            java.lang.String r0 = "feO2Client"
            X.0qQ.A0F(r0)     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0b8a
        L_0x0b49:
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            X.LSS.A01(r0)     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            android.os.Bundle r0 = X.LQW.A01(r0, r2)     // Catch:{ Exception -> 0x0b83 }
            if (r0 != 0) goto L_0x0b57
            goto L_0x0b60
        L_0x0b57:
            android.os.Bundle r4 = r0.deepCopy()     // Catch:{ Exception -> 0x0b83 }
            X.C62990Kpg.A00(r4)     // Catch:{ Exception -> 0x0b83 }
            r0 = 1
            goto L_0x0b61
        L_0x0b60:
            r0 = 0
        L_0x0b61:
            if (r0 != 0) goto L_0x0b6b
            java.lang.String r2 = "client_start_message_not_found"
            java.lang.String r0 = "empty_auto_conf_start_query_result"
            r5.A01(r2, r0, r1)     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            return r1
        L_0x0b6b:
            java.lang.String r0 = "client_start_message_found"
            r5.A00(r0)     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            X.S6k r3 = r3.A04     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            java.lang.String r2 = "startMessage"
            boolean r0 = r4.containsKey(r2)     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            if (r0 == 0) goto L_0x0b85
            byte[] r0 = r4.getByteArray(r2)     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            java.lang.String r1 = r3.A02(r0)     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            return r1
        L_0x0b83:
            r0 = move-exception
            goto L_0x0b8a
        L_0x0b85:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
            r0.<init>()     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
        L_0x0b8a:
            throw r0     // Catch:{ RemoteException -> 0x0b95, SecurityException -> 0x0b90, 6GV -> 0x0b8b }
        L_0x0b8b:
            r0 = move-exception
            A02(r5, r0)
            return r1
        L_0x0b90:
            r0 = move-exception
            A02(r5, r0)
            return r1
        L_0x0b95:
            r0 = move-exception
            A02(r5, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A01(Object obj, JVD jvd) {
        0eS.A00(obj);
        return jvd.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JVD(int i, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A01 = i;
    }
}
