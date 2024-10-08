package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class LSf {
    public static final LSf A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(androidx.fragment.app.FragmentActivity r6, X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, java.lang.String r9, java.lang.String r10, java.util.List r11, java.util.List r12) {
        /*
            r5 = 0
            r4 = 1
            X.DbW.A1O(r8, r4, r7)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = A01(r6, r11)
            r3.append(r1)
            if (r12 == 0) goto L_0x0057
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = X.002.A0B(r1)
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x002a
            java.lang.String r0 = ", "
            r3.append(r0)
        L_0x002a:
            android.content.res.Resources r2 = r6.getResources()
            r1 = 2131960309(0x7f1321f5, float:1.9557283E38)
            java.lang.String r0 = X.DcW.A01(r12)
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r3.append(r0)
        L_0x003c:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0057
            java.lang.Object r0 = r12.get(r5)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            X.0qQ.A0B(r0, r4)
            java.util.List r0 = r0.A0Q
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            com.instagram.common.typedurl.ImageUrl r0 = X.DcW.A00(r8, r0)
            if (r0 != 0) goto L_0x005f
        L_0x0057:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r8)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
        L_0x005f:
            X.Fcu r5 = new X.Fcu
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.2MD r4 = X.2MD.A01()
            java.lang.String r1 = r8.A06
            X.OIS r2 = X.OU0.A00(r1)
            java.lang.String r1 = "media_posted_notification_type"
            r2.A0G = r1
            java.lang.String r1 = r3.toString()
            r2.A0H = r1
            r2.A04 = r0
            r2.A08 = r5
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.LOCAL
            r2.A03 = r0
            X.JTT.A1O(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LSf.A02(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.List, java.util.List):void");
    }

    public static final String A01(FragmentActivity fragmentActivity, List list) {
        int i;
        if (list == null) {
            return "";
        }
        if (list.contains(UserStoryTarget.A01) || list.contains(UserStoryTarget.A09)) {
            i = 2131971552;
        } else if (list.contains(UserStoryTarget.A02)) {
            i = 2131971550;
        } else if ((list instanceof Collection) && list.isEmpty()) {
            return "";
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String CAh = ((UserStoryTarget) it.next()).CAh();
                if (CAh != null && CAh.equals("GROUP")) {
                    i = 2131971551;
                }
            }
            return "";
        }
        return fragmentActivity.getString(i);
    }

    public static final Intent A00(List list, List list2) {
        Intent A09 = DbS.A09();
        if (list != null) {
            A09.putParcelableArrayListExtra(AnonymousClass000.A00(123), AnonymousClass7TE.A1D(list));
        }
        if (list2 != null) {
            A09.putParcelableArrayListExtra(AnonymousClass000.A00(233), AnonymousClass7TE.A1D(list2));
        }
        return A09;
    }
}
