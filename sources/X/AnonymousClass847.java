package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: X.847  reason: invalid class name */
public final class AnonymousClass847 {
    public boolean A00;
    public List A01 = 0sn.A00;
    public final Activity A02;

    public AnonymousClass847(Activity activity) {
        0qQ.A0B(activity, 1);
        this.A02 = activity;
    }

    public static final User A00(UserSession userSession, String str, List list) {
        User A022;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        List A0a = 00k.A0a(C63213KtK.A00(str));
        17i A002 = 17h.A00(userSession);
        if (A0a.size() == 1) {
            A022 = (User) A002.A02.get(A0a.get(0));
        } else if (list == null || list.size() != 1) {
            return null;
        } else {
            A022 = A002.A02(((Tag) list.get(0)).getId());
        }
        if (A022 != null) {
            return A022;
        }
        return null;
    }

    public final List A01(UserSession userSession, String str, List list) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(list, 2);
        if (!C347037wA.A05(userSession) || !list.isEmpty() || this.A00 || str == null || str.length() == 0) {
            return 0sn.A00;
        }
        String lowerCase = str.toLowerCase(AnonymousClass1Q2.A02());
        0qQ.A07(lowerCase);
        HashSet hashSet = new HashSet();
        Set A0j = 00k.A0j(C39864ACk.A02);
        A0j.addAll(C39864ACk.A01);
        List A0a = 00k.A0a(A0j);
        Set A0j2 = 00k.A0j(C39864ACk.A04);
        A0j2.addAll(C39864ACk.A03);
        List<String> A0a2 = 00k.A0a(A0j2);
        Matcher matcher = C253063q9.A01().matcher(lowerCase);
        0qQ.A07(matcher);
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null && A0a.contains(group)) {
                hashSet.add(group);
            }
        }
        for (String str2 : A0a2) {
            if (00l.A0d(lowerCase, str2, false)) {
                hashSet.add(str2);
            }
        }
        List A0a3 = 00k.A0a(hashSet);
        this.A01 = A0a3;
        return A0a3;
    }

    public final List A02(UserSession userSession, String str, List list, List list2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(list2, 3);
        HashSet hashSet = new HashSet();
        Set A0j = 00k.A0j(C39864ACk.A02);
        A0j.addAll(C39864ACk.A01);
        List<String> A0a = 00k.A0a(A0j);
        Set A0j2 = 00k.A0j(C39864ACk.A04);
        A0j2.addAll(C39864ACk.A03);
        List<String> A0a2 = 00k.A0a(A0j2);
        if (C347037wA.A05(userSession) && list2.isEmpty() && !this.A00 && !C271404in.A0E(list)) {
            Iterator it = list.iterator();
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    C255783ui r3 = (C255783ui) it.next();
                    if (r3.A11 == AnonymousClass3WT.HASHTAG) {
                        HashtagImpl hashtagImpl = r3.A0k;
                        if (hashtagImpl != null) {
                            String str3 = hashtagImpl.A0D;
                            if (str3 != null) {
                                str2 = str3.toLowerCase(AnonymousClass1Q2.A02());
                                0qQ.A07(str2);
                            }
                            String A0D = 002.A0D(str2, '#');
                            if (A0a.contains(A0D)) {
                                hashSet.add(A0D);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else if (!(str == null || str.length() == 0)) {
                    String lowerCase = str.toLowerCase(AnonymousClass1Q2.A02());
                    0qQ.A07(lowerCase);
                    for (String str4 : A0a2) {
                        if (00l.A0d(lowerCase, str4, false)) {
                            hashSet.add(str4);
                        }
                    }
                    for (String str5 : A0a) {
                        if (00l.A0d(lowerCase, str5, false)) {
                            hashSet.add(str5);
                        }
                    }
                }
            }
        }
        List A0a3 = 00k.A0a(hashSet);
        this.A01 = A0a3;
        return A0a3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r5 = new X.0eP("reason", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r14 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = r14.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r5 = X.0Yt.A06(new X.0eP[]{r5, new X.0eP("keywords", r1), new X.0eP("media_type", r13)});
        X.JVF.A05(new X.0xG("BrandedContentTaggingUpsellController"), r11, X.AnonymousClass05K.A0h, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (X.AnonymousClass430.A03(r11, 36316126036627432L) == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r6 = X.AnonymousClass430.A03(r11, 36316126036889580L);
        r3 = r8.getString(2131954175);
        X.0qQ.A07(r3);
        r4 = new X.C358248ab(r8);
        r0 = 2131976077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        if (r6 == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        r0 = 2131976078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        r4.A09(r0);
        r1 = 2131976072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r6 == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        r1 = 2131976073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        r1 = r8.getString(r1, new java.lang.Object[]{r3});
        X.0qQ.A07(r1);
        r4.A0Z(new X.LUB(r7, r11), r1, r3);
        r4.A0i(r7.A02.getDrawable(com.instagram.android.R.drawable.ig_illustrations_illo_ads_tracking_refresh));
        r3 = r8.getString(2131976074);
        X.0qQ.A07(r3);
        r4.A0Y(new X.AKV(r9, r11, r5), X.C358278ae.A03, r3, true);
        r1 = 2131976075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bc, code lost:
        if (r6 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00be, code lost:
        r1 = 2131976076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c1, code lost:
        r4.A0G(new X.AKW(r10, r11, r5), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        X.AnonymousClass0fN.A00(r4.A02());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d1, code lost:
        r4 = new X.C358248ab(r8);
        r4.A09(2131952537);
        r4.A08(r6);
        r6 = r8.getString(2131976948);
        X.0qQ.A07(r6);
        r4.A0Y(new X.AKT(r9, r11, r5), X.C358278ae.A03, r6, true);
        r4.A0G(new X.AKU(r10, r11, r5), 2131968381);
        r2 = r7.A02.getString(2131972390);
        X.0qQ.A07(r2);
        r4.A0X(new X.LUA(r7, r11), X.C358278ae.A04, r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0115, code lost:
        r1 = "collab";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0119, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0143, code lost:
        if (r0 == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r12 == null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((1 - r12.intValue()) == 0) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = "keywords";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.content.Context r8, android.content.DialogInterface.OnClickListener r9, android.content.DialogInterface.OnClickListener r10, com.instagram.common.session.UserSession r11, java.lang.Integer r12, java.lang.String r13, java.util.List r14) {
        /*
            r7 = this;
            r2 = 1
            if (r11 == 0) goto L_0x00d0
            r7.A00 = r2
            int r0 = r13.hashCode()
            switch(r0) {
                case 3230752: goto L_0x011c;
                case 3322092: goto L_0x0126;
                case 3496474: goto L_0x0130;
                case 109770997: goto L_0x013a;
                default: goto L_0x000c;
            }
        L_0x000c:
            r6 = 2131952532(0x7f130394, float:1.954151E38)
        L_0x000f:
            java.lang.String r4 = ""
            if (r12 == 0) goto L_0x0119
            int r0 = r12.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0115
            java.lang.String r1 = "keywords"
        L_0x001d:
            java.lang.String r0 = "reason"
            X.0eP r5 = new X.0eP
            r5.<init>(r0, r1)
            r3 = 0
            if (r14 == 0) goto L_0x002d
            java.lang.String r1 = r14.toString()
            if (r1 != 0) goto L_0x002e
        L_0x002d:
            r1 = r4
        L_0x002e:
            java.lang.String r0 = "keywords"
            X.0eP r4 = new X.0eP
            r4.<init>(r0, r1)
            java.lang.String r1 = "media_type"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r13)
            X.0eP[] r0 = new X.0eP[]{r5, r4, r0}
            java.util.LinkedHashMap r5 = X.0Yt.A06(r0)
            java.lang.String r0 = "BrandedContentTaggingUpsellController"
            X.0xG r1 = new X.0xG
            r1.<init>(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0h
            X.JVF.A05(r1, r11, r0, r5)
            r0 = 36316126036627432(0x81055300080fe8, double:3.0298025666406805E-306)
            boolean r0 = X.AnonymousClass430.A03(r11, r0)
            if (r0 == 0) goto L_0x00d1
            r0 = 36316126036889580(0x810553000c0fec, double:3.029802566806464E-306)
            boolean r6 = X.AnonymousClass430.A03(r11, r0)
            r0 = 2131954175(0x7f1309ff, float:1.9544842E38)
            java.lang.String r3 = r8.getString(r0)
            X.0qQ.A07(r3)
            X.8ab r4 = new X.8ab
            r4.<init>((android.content.Context) r8)
            r0 = 2131976077(0x7f135f8d, float:1.9589264E38)
            if (r6 == 0) goto L_0x007b
            r0 = 2131976078(0x7f135f8e, float:1.9589266E38)
        L_0x007b:
            r4.A09(r0)
            r1 = 2131976072(0x7f135f88, float:1.9589254E38)
            if (r6 == 0) goto L_0x0086
            r1 = 2131976073(0x7f135f89, float:1.9589256E38)
        L_0x0086:
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.lang.String r1 = r8.getString(r1, r0)
            X.0qQ.A07(r1)
            X.LUB r0 = new X.LUB
            r0.<init>(r7, r11)
            r4.A0Z(r0, r1, r3)
            android.app.Activity r1 = r7.A02
            r0 = 2131237530(0x7f081a9a, float:1.8091313E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r4.A0i(r0)
            r0 = 2131976074(0x7f135f8a, float:1.9589258E38)
            java.lang.String r3 = r8.getString(r0)
            X.0qQ.A07(r3)
            X.AKV r1 = new X.AKV
            r1.<init>(r9, r11, r5)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r4.A0Y(r1, r0, r3, r2)
            r1 = 2131976075(0x7f135f8b, float:1.958926E38)
            if (r6 == 0) goto L_0x00c1
            r1 = 2131976076(0x7f135f8c, float:1.9589262E38)
        L_0x00c1:
            X.AKW r0 = new X.AKW
            r0.<init>(r10, r11, r5)
            r4.A0G(r0, r1)
        L_0x00c9:
            android.app.Dialog r0 = r4.A02()
            X.AnonymousClass0fN.A00(r0)
        L_0x00d0:
            return
        L_0x00d1:
            X.8ab r4 = new X.8ab
            r4.<init>((android.content.Context) r8)
            r0 = 2131952537(0x7f130399, float:1.954152E38)
            r4.A09(r0)
            r4.A08(r6)
            r0 = 2131976948(0x7f1362f4, float:1.959103E38)
            java.lang.String r6 = r8.getString(r0)
            X.0qQ.A07(r6)
            X.AKT r1 = new X.AKT
            r1.<init>(r9, r11, r5)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r4.A0Y(r1, r0, r6, r2)
            r1 = 2131968381(0x7f13417d, float:1.9573655E38)
            X.AKU r0 = new X.AKU
            r0.<init>(r10, r11, r5)
            r4.A0G(r0, r1)
            android.app.Activity r1 = r7.A02
            r0 = 2131972390(0x7f135126, float:1.9581786E38)
            java.lang.String r2 = r1.getString(r0)
            X.0qQ.A07(r2)
            X.LUA r1 = new X.LUA
            r1.<init>(r7, r11)
            X.8ae r0 = X.C358278ae.DEFAULT
            r4.A0X(r1, r0, r2, r3)
            goto L_0x00c9
        L_0x0115:
            java.lang.String r1 = "collab"
            goto L_0x001d
        L_0x0119:
            r1 = r4
            goto L_0x001d
        L_0x011c:
            java.lang.String r0 = "igtv"
            boolean r0 = r13.equals(r0)
            r6 = 2131952533(0x7f130395, float:1.9541511E38)
            goto L_0x0143
        L_0x0126:
            java.lang.String r0 = "live"
            boolean r0 = r13.equals(r0)
            r6 = 2131952534(0x7f130396, float:1.9541513E38)
            goto L_0x0143
        L_0x0130:
            java.lang.String r0 = "reel"
            boolean r0 = r13.equals(r0)
            r6 = 2131952535(0x7f130397, float:1.9541515E38)
            goto L_0x0143
        L_0x013a:
            java.lang.String r0 = "story"
            boolean r0 = r13.equals(r0)
            r6 = 2131952536(0x7f130398, float:1.9541518E38)
        L_0x0143:
            if (r0 != 0) goto L_0x000f
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass847.A03(android.content.Context, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.util.List):void");
    }

    public final boolean A04(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, UserSession userSession, String str, String str2, List list) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        String str3 = str;
        0qQ.A0B(str3, 2);
        List list2 = list;
        0qQ.A0B(list2, 3);
        if (AnonymousClass430.A00(userSession2)) {
            if (!this.A00) {
                List A012 = A01(userSession2, str3, list2);
                if (!A012.isEmpty()) {
                    A03(context, onClickListener, onClickListener2, userSession2, (Integer) null, str2, A012);
                    return true;
                }
            }
        }
        return false;
    }
}
