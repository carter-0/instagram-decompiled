package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.I1p  reason: case insensitive filesystem */
public final class C56561I1p {
    public final FragmentActivity A00;
    public final 1Ng A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final String A04;
    public final C249763kK A05;

    public final void A01(Fragment fragment, 1Xj r10, int i, int i2) {
        1Xj r3 = r10;
        int i3 = i;
        A00(r10, i, i2);
        C54245H4o h4o = new C54245H4o(i, 2, r10, this);
        if (fragment != null) {
            Context applicationContext = this.A00.getApplicationContext();
            UserSession userSession = this.A02;
            AnonymousClass4DU r4 = this.A03;
            r4.getClass();
            I7Q.A02(applicationContext, h4o, userSession, r3, r4, C243373Ym.SAVED, this.A04, i3);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Hj6, java.lang.Object] */
    private void A00(1Xj r21, int i, int i2) {
        UserSession userSession = this.A02;
        1Xj r8 = r21;
        if (!SaveApiUtil.A09(userSession, r8)) {
            C340057kd A002 = C340057kd.A00(userSession);
            Integer num = AnonymousClass05K.A01;
            String A003 = AnonymousClass000.A00(3914);
            AnonymousClass4DU r9 = this.A03;
            r9.getClass();
            A002.A01(C297085r9.A02(r9, r8, num, A003, true));
            C243373Ym r11 = C243373Ym.SAVED;
            FragmentActivity fragmentActivity = this.A00;
            C249763kK r13 = this.A05;
            0qQ.A0B(userSession, 6);
            FragmentActivity fragmentActivity2 = fragmentActivity;
            SaveApiUtil.A04(fragmentActivity, fragmentActivity2, userSession, r8, r9, (JPV) null, r11, (SearchContext) null, r13, (String) null, (String) null, (String) null, i2, i, -1);
            1Ng r1 = this.A01;
            ? obj = new Object();
            obj.A00 = r8;
            r1.A00(C55120HcT.A00(obj));
            1Wj r12 = 1Wj.A00;
            if (r12 != null) {
                r12.A03(userSession, fragmentActivity, AnonymousClass000.A00(2069));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r5.isEmpty() != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(androidx.fragment.app.Fragment r34, X.1Xj r35, com.instagram.save.model.SavedCollection r36, java.lang.String r37, int r38, int r39) {
        /*
            r33 = this;
            r2 = r35
            java.util.List r3 = r2.A3i()
            r1 = r36
            java.lang.String r0 = r1.A0F
            boolean r0 = r3.contains(r0)
            java.lang.Integer r0 = X.C51967G9n.A0l(r0)
            X.HMw r5 = r1.A07
            X.HMw r4 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            r32 = 0
            r3 = r33
            r15 = r38
            if (r5 != r4) goto L_0x0161
            if (r34 == 0) goto L_0x0161
            com.instagram.common.session.UserSession r6 = r3.A02
            boolean r0 = X.I7Q.A09(r6, r2, r15)
            java.lang.Integer r0 = X.C51967G9n.A0l(r0)
            r14 = 1
            X.H4R r8 = new X.H4R
            r9 = r3
            r10 = r2
            r11 = r1
            r12 = r0
            r13 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            androidx.fragment.app.FragmentActivity r4 = r3.A00
            android.content.Context r7 = r4.getApplicationContext()
            X.4DU r5 = r3.A03
            r5.getClass()
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r0 != r4) goto L_0x015d
            X.3Ym r12 = X.C243373Ym.SAVED
        L_0x0046:
            java.lang.String r4 = r3.A04
            r13 = r4
            r14 = r15
            r9 = r6
            r11 = r5
            X.I7Q.A02(r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = 1
        L_0x0050:
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            if (r4 != 0) goto L_0x005b
            java.lang.String r4 = r1.A0F
            r14.add(r4)
        L_0x005b:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            androidx.fragment.app.FragmentActivity r13 = r3.A00
            r7 = 0
            r5 = r7
            if (r0 != r4) goto L_0x0064
            r5 = r14
        L_0x0064:
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            if (r0 == r9) goto L_0x0069
            r14 = r7
        L_0x0069:
            boolean r6 = r2.CcK()
            if (r6 == 0) goto L_0x0073
            java.lang.String r7 = r2.A2v()
        L_0x0073:
            r8 = 0
            X.0Ym r12 = new X.0Ym
            r12.<init>()
            java.lang.String r10 = X.C61970qY.A09(r13)
            java.lang.String r6 = "radio_type"
            r12.put(r6, r10)
            if (r7 == 0) goto L_0x008f
            int r6 = r7.length()
            if (r6 == 0) goto L_0x008f
            java.lang.String r6 = "tracking_token"
            r12.put(r6, r7)
        L_0x008f:
            if (r5 == 0) goto L_0x0099
            boolean r6 = r5.isEmpty()
            r16 = 0
            if (r6 == 0) goto L_0x009b
        L_0x0099:
            r16 = 1
        L_0x009b:
            java.lang.String r11 = "]"
            java.lang.String r10 = "["
            java.lang.String r7 = ","
            java.lang.String r6 = "added_collection_ids"
            if (r16 != 0) goto L_0x00ac
            java.lang.String r5 = X.00k.A0P(r7, r10, r11, r5, r8)
            r12.put(r6, r5)
        L_0x00ac:
            if (r14 == 0) goto L_0x00bb
            boolean r5 = r14.isEmpty()
            if (r5 != 0) goto L_0x00bb
            java.lang.String r5 = X.00k.A0P(r7, r10, r11, r14, r8)
            r12.put(r6, r5)
        L_0x00bb:
            X.0Ym r5 = X.0se.A0N(r12)
            java.util.LinkedHashMap r21 = X.0Yt.A03(r5)
            com.instagram.common.session.UserSession r7 = r3.A02
            java.lang.String r19 = r2.getId()
            r19.getClass()
            X.3Ym r23 = X.C243373Ym.SAVED
            X.4DU r6 = r3.A03
            r6.getClass()
            java.lang.String r20 = r6.getModuleName()
            r16 = r7
            r17 = r23
            r18 = r4
            X.1OC r11 = com.instagram.save.api.SaveApiUtil.A00(r16, r17, r18, r19, r20, r21)
            boolean r5 = com.instagram.save.api.SaveApiUtil.A09(r7, r2)
            if (r5 != 0) goto L_0x00eb
            if (r0 != r4) goto L_0x00eb
            r32 = 1
        L_0x00eb:
            java.lang.Integer r27 = java.lang.Integer.valueOf(r15)
            r12 = 1
            r10 = 0
            X.H4V r5 = new X.H4V
            r30 = r37
            r24 = r5
            r25 = r3
            r26 = r0
            r28 = r2
            r29 = r1
            r31 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)
            X.IX9 r4 = new X.IX9
            r4.<init>(r10, r5, r3)
            r27 = r39
            if (r32 == 0) goto L_0x015a
            X.7kd r10 = X.C340057kd.A00(r7)
            java.lang.String r5 = "save_to_collection"
            X.A7L r5 = X.C297085r9.A02(r6, r2, r9, r5, r12)
            r10.A01(r5)
            X.3kK r10 = r3.A05
            java.lang.String r9 = r3.A04
            r29 = -1
            r5 = 6
            X.0qQ.A0B(r7, r5)
            r17 = r13
            r24 = r8
            r25 = r10
            r26 = r9
            r28 = r15
            r18 = r11
            r19 = r7
            r20 = r2
            r21 = r6
            r22 = r4
            r16 = r13
            com.instagram.save.api.SaveApiUtil.A03(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x013d:
            java.lang.String r4 = r1.A0F
            X.3kK r1 = r3.A05
            r16 = r13
            r17 = r7
            r18 = r2
            r19 = r6
            r20 = r1
            r21 = r0
            r22 = r4
            r23 = r27
            r24 = r15
            X.I6U.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.1ES.A03(r11)
            return
        L_0x015a:
            r11.A00 = r5
            goto L_0x013d
        L_0x015d:
            X.3Ym r12 = X.C243373Ym.NOT_SAVED
            goto L_0x0046
        L_0x0161:
            r4 = 0
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56561I1p.A02(androidx.fragment.app.Fragment, X.1Xj, com.instagram.save.model.SavedCollection, java.lang.String, int, int):void");
    }

    public final void A03(Fragment fragment, 1Xj r31, String str, String str2, int i, int i2, int i3) {
        AnonymousClass4DU r7 = this.A03;
        r7.getClass();
        UserSession userSession = this.A02;
        1Xj r6 = r31;
        List asList = Arrays.asList(new 1Xj[]{r6});
        String str3 = str;
        DbZ.A0t(1, userSession, str3, asList);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            C254523sc A0c = C51967G9n.A0c(userSession, A0t, r7, "add_to_collection");
            A0c.A6q = str3;
            C233822wX.A0E(userSession, A0c, A0t, r7, 0);
        }
        int i4 = i;
        int i5 = i2;
        A00(r6, i4, i5);
        try {
            String moduleName = r7.getModuleName();
            List asList2 = Arrays.asList(new String[]{r6.getId()});
            H4X h4x = new H4X(fragment, r6, this, str2, str3, i4, i5, i3);
            1NY A002 = C56641I5w.A00((CollectionPrivacyModeEnum) null, userSession, (Boolean) null, false, str3, moduleName, (String) null, (String) null, (String) null, (String) null, asList2);
            A002.A0A("collections/create/");
            1OC A0M = A002.A0M();
            H51.A00(A0M, h4x, userSession, 12);
            1ES.A03(A0M);
        } catch (IOException unused) {
            FragmentActivity fragmentActivity = this.A00;
            C59689JTv.A00(fragmentActivity, AnonymousClass7TF.A0e(fragmentActivity.getResources(), str3, 2131956854), "create_collection_failure_notification", 1);
        }
    }

    public C56561I1p(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, C249763kK r5) {
        String str;
        this.A00 = fragment.requireActivity();
        this.A01 = AnonymousClass1Nd.A00(userSession);
        this.A03 = r4;
        this.A02 = userSession;
        this.A05 = r5;
        if (userSession == null || r4 == null) {
            str = null;
        } else {
            str = C228022kf.A00(fragment.mArguments);
        }
        this.A04 = str;
    }
}
