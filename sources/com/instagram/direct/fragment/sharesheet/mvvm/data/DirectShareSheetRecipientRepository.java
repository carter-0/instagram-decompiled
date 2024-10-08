package com.instagram.direct.fragment.sharesheet.mvvm.data;

import X.00k;
import X.2Dm;
import X.2IV;
import X.AnonymousClass2Ep;
import X.AnonymousClass43A;
import X.AnonymousClass4D7;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C66579MXk;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi;
import java.util.ArrayList;
import java.util.List;

public final class DirectShareSheetRecipientRepository extends C252733pa {
    public final UserSession A00;
    public final DirectShareSheetApi A01;
    public final 2Dm A02;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C48091EVj r9, java.lang.String r10, java.util.List r11, X.AnonymousClass4D7 r12) {
        /*
            r8 = this;
            r4 = 48
            boolean r0 = X.C66143MDv.A02(r4, r12)
            if (r0 == 0) goto L_0x0111
            r3 = r12
            X.MDv r3 = (X.C66143MDv) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0111
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r3.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r3.A00
            r7 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r7) goto L_0x0123
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0117
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CFo r0 = (X.C43848CFo) r0
            java.util.List r0 = r0.A01
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            X.KQs r4 = new X.KQs
            r4.<init>(r0)
            return r4
        L_0x003c:
            X.0eS.A00(r1)
            r6 = 10
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r11)
            java.util.Iterator r2 = r11.iterator()
        L_0x0049:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005f
            com.instagram.model.direct.DirectShareTarget r0 = X.DbT.A0f(r2)
            java.util.ArrayList r1 = r0.A0B()
            java.lang.String r0 = r0.A09()
            X.AnonymousClass7TF.A1I(r1, r0, r5)
            goto L_0x0049
        L_0x005f:
            int r0 = X.0Yv.A1E(r5, r6)
            java.util.ArrayList r2 = X.DbS.A0v(r0)
            java.util.ArrayList r6 = X.DbS.A0v(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x006f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r1 = r5.next()
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r0 = r1.A00
            r2.add(r0)
            java.lang.Object r0 = r1.A01
            r6.add(r0)
            goto L_0x006f
        L_0x0086:
            com.instagram.common.session.UserSession r0 = r8.A00
            r3.A00 = r7
            X.1NY r5 = X.DbU.A0N(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "direct_v2/ranked_recipients_by_item_id/%s/"
            X.DbU.A1P(r5, r0, r1)
            java.lang.Class<X.CFo> r1 = X.C43848CFo.class
            java.lang.Class<X.D18> r0 = X.D18.class
            r5.A0R(r1, r0)
            if (r9 != 0) goto L_0x00a2
            X.EVj r9 = X.C48091EVj.MEDIA
        L_0x00a2:
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "item_type"
            r5.A9m(r0, r1)
            java.lang.String r1 = X.C49755F5g.A01(r6)
            java.lang.String r0 = "ranked_thread_ids"
            r5.A9m(r0, r1)
            java.io.StringWriter r7 = new java.io.StringWriter     // Catch:{ IOException -> 0x00f4 }
            r7.<init>()     // Catch:{ IOException -> 0x00f4 }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x00f4 }
            X.17W r6 = r0.A0A(r7)     // Catch:{ IOException -> 0x00f4 }
            r6.A0b()     // Catch:{ IOException -> 0x00f4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x00f4 }
        L_0x00c4:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x00f4 }
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x00f4 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ IOException -> 0x00f4 }
            r6.A0b()     // Catch:{ IOException -> 0x00f4 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException -> 0x00f4 }
        L_0x00d7:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x00f4 }
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)     // Catch:{ IOException -> 0x00f4 }
            r6.A0t(r0)     // Catch:{ IOException -> 0x00f4 }
            goto L_0x00d7
        L_0x00e5:
            r6.A0Y()     // Catch:{ IOException -> 0x00f4 }
            goto L_0x00c4
        L_0x00e9:
            r6.A0Y()     // Catch:{ IOException -> 0x00f4 }
            r6.close()     // Catch:{ IOException -> 0x00f4 }
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x00f4 }
            goto L_0x0101
        L_0x00f4:
            r2 = move-exception
            java.lang.String r1 = "DirectRecipientsApi"
            r0 = 53
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0wb.A06(r1, r0, r2)
            r1 = 0
        L_0x0101:
            java.lang.String r0 = "ranked_users_in_threads"
            X.1OC r1 = X.DbT.A0T(r5, r0, r1)
            r0 = 679442208(0x287f7720, float:1.4181175E-14)
            java.lang.Object r1 = r1.A00(r0, r3)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0111:
            X.MDv r3 = X.C41847B3o.A1H(r8, r12, r4)
            goto L_0x0016
        L_0x0117:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x011e
            X.KQr r4 = X.C61898KQr.A00
            return r4
        L_0x011e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0123:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository.A00(X.EVj, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    public final Object A01(Integer num, Integer num2, String str, String str2, String str3, String str4, AnonymousClass4D7 r28, int i, int i2, boolean z, boolean z2) {
        String str5;
        DirectShareSheetApi directShareSheetApi = this.A01;
        UserSession userSession = this.A00;
        Boolean valueOf = Boolean.valueOf(z2);
        List<AnonymousClass2Ep> A0d = 00k.A0d(this.A02.A0C.A0F(AnonymousClass43A.A00), i2);
        ArrayList A0r = AnonymousClass7TG.A0r(A0d);
        for (AnonymousClass2Ep r4 : A0d) {
            2IV r2 = new 2IV();
            r2.A05(C66579MXk.A00(39), r4.BRX());
            r2.A09(String.valueOf(r4.BKd() / 1000), "last_activity_ts");
            if (r4.CVr()) {
                str5 = "XAC";
            } else {
                str5 = "IG";
            }
            r2.A09(str5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            r2.A09(String.valueOf(r4.BKd() / 1000), "thread_create_ts");
            r2.A09(r4.C6k(), ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            A0r.add(r2);
        }
        return directShareSheetApi.A00(userSession, valueOf, num, num2, str, str2, str3, str4, A0r, r28, i, z);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.List r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 49
            boolean r0 = X.C66143MDv.A02(r3, r9)
            if (r0 == 0) goto L_0x0067
            r5 = r9
            X.MDv r5 = (X.C66143MDv) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A01
            X.1Hj r6 = X.1Hj.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L_0x002f
            if (r1 != r0) goto L_0x007b
            X.0eS.A00(r2)
        L_0x0024:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006c
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            return r0
        L_0x002f:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r4 = r7.A00
            r5.A00 = r0
            java.lang.String r3 = X.DbV.A0s()
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r8.iterator()
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            com.instagram.model.direct.DirectShareTarget r0 = X.DbT.A0f(r1)
            java.util.ArrayList r0 = r0.A0B()
            X.018.A16(r0, r2)
            goto L_0x0042
        L_0x0054:
            java.util.List r1 = X.00k.A0W(r2)
            r0 = 0
            X.1OC r1 = com.instagram.direct.request.DirectThreadApi.A0D(r4, r3, r0, r1)
            r0 = 315964894(0x12d53dde, float:1.3457441E-27)
            java.lang.Object r2 = r1.A00(r0, r5)
            if (r2 != r6) goto L_0x0024
            return r6
        L_0x0067:
            X.MDv r5 = X.C41847B3o.A1H(r7, r9, r3)
            goto L_0x0016
        L_0x006c:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0076
            X.8wd r0 = new X.8wd
            r0.<init>()
            return r0
        L_0x0076:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository.A02(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DirectShareSheetRecipientRepository(com.instagram.common.session.UserSession r4, com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi r5) {
        /*
            r3 = this;
            X.2Dm r2 = X.1bJ.A00(r4)
            r0 = 1
            int r1 = X.DbW.A03(r0, r4, r2)
            r0 = 728032920(0x2b64e698, float:8.1321885E-13)
            X.19S r1 = X.AnonymousClass43D.A01(r0, r1)
            java.lang.String r0 = "DirectSharesheetRecipientRepository"
            r3.<init>(r0, r1)
            r3.A00 = r4
            r3.A01 = r5
            r3.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository.<init>(com.instagram.common.session.UserSession, com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi):void");
    }
}
