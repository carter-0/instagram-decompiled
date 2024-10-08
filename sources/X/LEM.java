package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class LEM {
    public DialogInterface.OnDismissListener A00;
    public Fragment A01;
    public BrandedContentGatingInfoIntf A02;
    public BrandedContentProjectMetadataIntf A03;
    public List A04;
    public boolean A05;
    public final Fragment A06;
    public final FragmentActivity A07;
    public final 0hq A08;
    public final AnonymousClass0iw A09;
    public final 1wn A0A = new LgJ(this, 9);
    public final UserSession A0B;
    public final C255773uh A0C;
    public final AnonymousClass6Z6 A0D;
    public final Context A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
        if (r1.A0b().isEmpty() != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.DialogInterface.OnDismissListener r14, boolean r15) {
        /*
            r13 = this;
            r13.A00 = r14
            com.instagram.common.session.UserSession r4 = r13.A0B
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.Lg6> r2 = X.C64679Lg6.class
            X.1wn r1 = r13.A0A
            java.lang.String r0 = "branded_content_tag_event_story_edit"
            r3.A03(r1, r2, r0)
            java.util.List r7 = r13.A04
            if (r7 != 0) goto L_0x0019
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0019:
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r3 = r13.A03
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r2 = r13.A02
            boolean r12 = r13.A05
            X.3uh r1 = r13.A0C
            X.1Xj r0 = r1.A0b
            r0.getClass()
            java.lang.String r5 = r0.getId()
            java.util.List r0 = r1.A0b()
            if (r0 == 0) goto L_0x003b
            java.util.List r0 = r1.A0b()
            boolean r0 = r0.isEmpty()
            r8 = 1
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r8 = 0
        L_0x003c:
            java.lang.String r6 = "story"
            X.AnonymousClass7TG.A1O(r4, r7)
            r9 = 0
            r10 = 1
            r11 = r15
            androidx.fragment.app.Fragment r0 = X.LLA.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A01 = r0
            androidx.fragment.app.FragmentActivity r0 = r13.A07
            X.6Yo r1 = X.DbS.A0M(r0, r4)
            androidx.fragment.app.Fragment r0 = r13.A01
            r1.A0E(r0)
            java.lang.String r0 = "disclosure_menu"
            r1.A0A = r0
            r1.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LEM.A00(android.content.DialogInterface$OnDismissListener, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0041, code lost:
        if (r6.A5l() == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LEM(androidx.fragment.app.Fragment r9, X.AnonymousClass0iw r10, com.instagram.common.session.UserSession r11, X.C255773uh r12, X.AnonymousClass6Z6 r13) {
        /*
            r8 = this;
            r8.<init>()
            r1 = 9
            X.LgJ r0 = new X.LgJ
            r0.<init>(r8, r1)
            r8.A0A = r0
            r8.A0C = r12
            r8.A0B = r11
            X.0hq r0 = r9.mFragmentManager
            r0.getClass()
            r8.A08 = r0
            android.content.Context r0 = r9.getContext()
            r0.getClass()
            r8.A0E = r0
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()
            r0.getClass()
            r8.A07 = r0
            r8.A06 = r9
            r8.A0D = r13
            r8.A09 = r10
            r1 = 15
            X.LV8 r0 = new X.LV8
            r0.<init>(r8, r1)
            r8.A00 = r0
            X.1Xj r6 = r12.A0b
            if (r6 == 0) goto L_0x0043
            boolean r1 = r6.A5l()
            r0 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r8.A05 = r0
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            if (r6 == 0) goto L_0x008f
            r6.A3j()
            java.util.List r0 = r6.A3j()
            java.util.Iterator r5 = r0.iterator()
        L_0x0057:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r4 = r5.next()
            X.536 r4 = (X.AnonymousClass536) r4
            com.instagram.user.model.User r3 = r4.ByI()
            java.lang.Boolean r0 = r4.Bbh()
            r2 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.Boolean r0 = r4.Bbh()
            boolean r1 = r0.booleanValue()
        L_0x0076:
            java.lang.Boolean r0 = r4.CYy()
            if (r0 == 0) goto L_0x0084
            java.lang.Boolean r0 = r4.CYy()
            boolean r2 = r0.booleanValue()
        L_0x0084:
            com.instagram.pendingmedia.model.BrandedContentTag r0 = new com.instagram.pendingmedia.model.BrandedContentTag
            r0.<init>(r3, r1, r2)
            r7.add(r0)
            goto L_0x0057
        L_0x008d:
            r1 = 0
            goto L_0x0076
        L_0x008f:
            r8.A04 = r7
            if (r6 == 0) goto L_0x00a8
            X.1Xy r0 = r6.A0C
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r0.Aho()
        L_0x0099:
            r8.A03 = r0
            if (r6 == 0) goto L_0x00a6
            X.1Xy r0 = r6.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r0.BQ3()
        L_0x00a3:
            r8.A02 = r0
            return
        L_0x00a6:
            r0 = 0
            goto L_0x00a3
        L_0x00a8:
            r0 = 0
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LEM.<init>(androidx.fragment.app.Fragment, X.0iw, com.instagram.common.session.UserSession, X.3uh, X.6Z6):void");
    }
}
