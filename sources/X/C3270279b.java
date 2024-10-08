package X;

import android.content.Context;
import android.os.Build;
import android.util.AndroidRuntimeException;
import com.instagram.common.session.UserSession;
import com.instagram.phonenumber.model.CountryCodeData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.79b  reason: invalid class name and case insensitive filesystem */
public abstract class C3270279b {
    public static final AnonymousClass5H7 A01(Context context, UserSession userSession, AnonymousClass9HO r10, String str, List list, boolean z) {
        0sn r0;
        String str2 = str;
        0qQ.A0B(str, 2);
        ArrayList arrayList = new ArrayList();
        UserSession userSession2 = userSession;
        if (182.A06(0Tu.A05, userSession, 36318058774337355L)) {
            r0 = 0sn.A00;
        } else {
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    r0 = C253053q8.A02(str);
                } else {
                    r0 = C253053q8.A01(context, str);
                }
            } catch (Exception unused) {
                r0 = 0sn.A00;
            }
        }
        arrayList.addAll(r0);
        return A02(userSession2, r10, str2, list, arrayList, (List) null, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r13.length() == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableStringBuilder A00(android.content.Context r7, X.AnonymousClass5FV r8, com.instagram.common.session.UserSession r9, X.AnonymousClass9HO r10, X.C329987Kz r11, X.AnonymousClass5H7 r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            java.lang.String r1 = "DirectMessageLinkifyHelper.linkify"
            r0 = -1923458420(0xffffffff8d5a5a8c, float:-6.728543E-31)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x00fe }
            if (r13 == 0) goto L_0x0011
            int r1 = r13.length()     // Catch:{ all -> 0x00fe }
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r5 = 0
            if (r0 != 0) goto L_0x00f7
            X.5FV r3 = X.AnonymousClass5FV.GiftWrap     // Catch:{ all -> 0x00fe }
            r1 = 0
            X.5FV r0 = X.AnonymousClass5FV.Fire     // Catch:{ all -> 0x00fe }
            r2 = 1
            X.5FV[] r0 = new X.AnonymousClass5FV[]{r3, r0}     // Catch:{ all -> 0x00fe }
            java.util.List r0 = X.0sr.A1P(r0)     // Catch:{ all -> 0x00fe }
            boolean r0 = X.00k.A0u(r0, r8)     // Catch:{ all -> 0x00fe }
            if (r0 != 0) goto L_0x002f
            if (r8 == 0) goto L_0x0030
            boolean r0 = r8.A01     // Catch:{ all -> 0x00fe }
            if (r0 != r2) goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            if (r1 == 0) goto L_0x0034
            r3 = -1
            goto L_0x0036
        L_0x0034:
            int r3 = r11.A02     // Catch:{ all -> 0x00fe }
        L_0x0036:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x00fe }
            r0.<init>(r13)     // Catch:{ all -> 0x00fe }
            X.3q3 r4 = new X.3q3     // Catch:{ all -> 0x00fe }
            r4.<init>(r0, r9, r12)     // Catch:{ all -> 0x00fe }
            X.0Tu r6 = X.0Tu.A05     // Catch:{ all -> 0x00fe }
            r0 = 36318058775320409(0x810715003c1759, double:3.031024838372633E-306)
            boolean r0 = X.182.A06(r6, r9, r0)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0057
            X.0eM r0 = r10.A00     // Catch:{ all -> 0x00fe }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00fe }
            com.instagram.phonenumber.model.CountryCodeData r0 = (com.instagram.phonenumber.model.CountryCodeData) r0     // Catch:{ all -> 0x00fe }
            r4.A0E = r0     // Catch:{ all -> 0x00fe }
        L_0x0057:
            if (r12 == 0) goto L_0x00c4
            java.util.List r0 = r12.A00     // Catch:{ all -> 0x00fe }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00fe }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0069
            r4.A0T = r2     // Catch:{ all -> 0x00fe }
            r4.A00 = r3     // Catch:{ all -> 0x00fe }
            r4.A0K = r14     // Catch:{ all -> 0x00fe }
        L_0x0069:
            java.util.List r0 = r12.A05     // Catch:{ all -> 0x00fe }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00fe }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007a
            r4.A02(r5)     // Catch:{ all -> 0x00fe }
            r4.A03 = r3     // Catch:{ all -> 0x00fe }
            r4.A0M = r14     // Catch:{ all -> 0x00fe }
        L_0x007a:
            java.util.List r0 = r12.A06     // Catch:{ all -> 0x00fe }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00fe }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008b
            r4.A03(r5)     // Catch:{ all -> 0x00fe }
            r4.A01 = r3     // Catch:{ all -> 0x00fe }
            r4.A0L = r14     // Catch:{ all -> 0x00fe }
        L_0x008b:
            java.util.List r0 = r12.A02     // Catch:{ all -> 0x00fe }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00fe }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a1
            android.content.Context r0 = r7.getApplicationContext()     // Catch:{ all -> 0x00fe }
            r4.A07 = r0     // Catch:{ all -> 0x00fe }
            r4.A0V = r2     // Catch:{ all -> 0x00fe }
            r4.A06 = r3     // Catch:{ all -> 0x00fe }
            r4.A0P = r14     // Catch:{ all -> 0x00fe }
        L_0x00a1:
            java.util.List r0 = r12.A07     // Catch:{ all -> 0x00fe }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00fe }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b1
            r4.A0Z = r2     // Catch:{ all -> 0x00fe }
            r4.A05 = r3     // Catch:{ all -> 0x00fe }
            r4.A0O = r14     // Catch:{ all -> 0x00fe }
        L_0x00b1:
            java.util.List r0 = r12.A08     // Catch:{ all -> 0x00fe }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00fe }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c1
            r4.A0a = r2     // Catch:{ all -> 0x00fe }
            r4.A04 = r3     // Catch:{ all -> 0x00fe }
            r4.A0N = r14     // Catch:{ all -> 0x00fe }
        L_0x00c1:
            r4.A0e = r15     // Catch:{ all -> 0x00fe }
            goto L_0x00ec
        L_0x00c4:
            r4.A02(r5)     // Catch:{ all -> 0x00fe }
            r4.A03 = r3     // Catch:{ all -> 0x00fe }
            r4.A0M = r14     // Catch:{ all -> 0x00fe }
            r4.A03(r5)     // Catch:{ all -> 0x00fe }
            r4.A01 = r3     // Catch:{ all -> 0x00fe }
            r4.A0L = r14     // Catch:{ all -> 0x00fe }
            android.content.Context r0 = r7.getApplicationContext()     // Catch:{ all -> 0x00fe }
            r4.A07 = r0     // Catch:{ all -> 0x00fe }
            r4.A0V = r2     // Catch:{ all -> 0x00fe }
            r4.A06 = r3     // Catch:{ all -> 0x00fe }
            r4.A0P = r14     // Catch:{ all -> 0x00fe }
            r4.A0T = r2     // Catch:{ all -> 0x00fe }
            r4.A00 = r3     // Catch:{ all -> 0x00fe }
            r4.A0K = r14     // Catch:{ all -> 0x00fe }
            r4.A0Z = r2     // Catch:{ all -> 0x00fe }
            r4.A05 = r3     // Catch:{ all -> 0x00fe }
            r4.A0O = r14     // Catch:{ all -> 0x00fe }
            r4.A0S = r2     // Catch:{ all -> 0x00fe }
        L_0x00ec:
            android.text.SpannableStringBuilder r1 = r4.A00()     // Catch:{ all -> 0x00fe }
            r0 = -1217744151(0xffffffffb76ab2e9, float:-1.3989143E-5)
            X.0fh.A00(r0)
            return r1
        L_0x00f7:
            r0 = 1115163394(0x42780b02, float:62.01075)
            X.0fh.A00(r0)
            return r5
        L_0x00fe:
            r1 = move-exception
            r0 = 987018090(0x3ad4b36a, float:0.0016227786)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3270279b.A00(android.content.Context, X.5FV, com.instagram.common.session.UserSession, X.9HO, X.7Kz, X.5H7, java.lang.String, boolean, boolean):android.text.SpannableStringBuilder");
    }

    public static final AnonymousClass5H7 A02(UserSession userSession, AnonymousClass9HO r11, String str, List list, List list2, List list3, boolean z) {
        int i;
        ArrayList arrayList;
        ArrayList A00;
        0qQ.A0B(str, 2);
        AnonymousClass5H7 r2 = new AnonymousClass5H7(511, (List) null, (List) null, (List) null);
        try {
            0fh.A01("DirectMessageLinkifyHelper.buildLinksInfo", 1999849799);
            Matcher matcher = 0mp.A00.matcher(str);
            0qQ.A07(matcher);
            ArrayList arrayList2 = new ArrayList();
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String group = matcher.group();
                0qQ.A07(group);
                arrayList2.add(new C255723uc(start, end, group));
            }
            r2.A03 = arrayList2;
            r2.A05 = C253053q8.A03(str);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            r2.A00 = list2;
            if (list3 == null) {
                list3 = new ArrayList();
            }
            r2.A04 = list3;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass9IY r0 = (AnonymousClass9IY) it.next();
                    int i2 = r0.A02;
                    int i3 = i2 + r0.A01;
                    if (i3 <= str.length()) {
                        String substring = str.substring(i2, i3);
                        0qQ.A07(substring);
                        arrayList.add(new C255723uc(i2, i3, substring));
                    }
                }
            } else {
                arrayList = 0sn.A00;
            }
            r2.A02 = arrayList;
            0Tu r6 = 0Tu.A05;
            if (182.A06(r6, userSession, 36318058775320409L)) {
                Context context = C60960kU.A00;
                0qQ.A07(context);
                A00 = C253053q8.A00(context, (CountryCodeData) r11.A00.getValue(), str);
            } else {
                Context context2 = C60960kU.A00;
                0qQ.A07(context2);
                A00 = C253053q8.A00(context2, C3270479e.A00(context2), str);
            }
            r2.A07 = A00;
            if (!182.A06(r6, userSession, 36320163305627723L) || !0mp.A06.matcher(str).find()) {
                r2.A06 = C253053q8.A05(str, false);
            }
            if (z) {
                r2.A08 = C253053q8.A07(str);
            }
            i = 1626426341;
        } catch (UnsatisfiedLinkError e) {
            0wb.A06("error_linkifying", "Unable to linkify", e);
            i = -1617397032;
        } catch (AndroidRuntimeException e2) {
            0wb.A06("error_linkifying", "Unable to linkify", e2);
            i = -974035996;
        } catch (Throwable th) {
            0fh.A00(-1159848540);
            throw th;
        }
        0fh.A00(i);
        return r2;
    }

    public static final List A03(List list, String str) {
        if (str == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C253053q8.A03(str).iterator();
        while (it.hasNext()) {
            C255723uc r4 = (C255723uc) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(r4);
                    break;
                }
                C255723uc r2 = (C255723uc) it2.next();
                if (r4.A01 >= r2.A01 && r4.A00 <= r2.A00) {
                    break;
                }
            }
        }
        return arrayList;
    }
}
