package X;

import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class NVG extends C67759MuF {
    public C262204Co A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NVG(android.content.res.Resources r23, com.instagram.common.session.UserSession r24, com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r25, X.AnonymousClass9HC r26, X.AnonymousClass7L2 r27, X.AnonymousClass72Q r28, com.instagram.model.direct.DirectThreadKey r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.List r34, boolean r35) {
        /*
            r22 = this;
            r8 = r23
            r9 = r24
            r15 = r29
            X.AnonymousClass7TG.A1U(r8, r9, r15)
            r0 = 5
            r11 = r25
            r2 = r31
            r1 = r33
            X.C51973G9u.A0s(r0, r2, r1, r11)
            r12 = r26
            r14 = r28
            X.C51972G9s.A1F(r14, r12)
            r0 = 12
            r13 = r27
            X.0qQ.A0B(r13, r0)
            X.LP4 r10 = X.C69909NuB.A00(r9)
            r3 = 0
            r20 = r34
            r7 = r22
            r16 = r30
            r18 = r32
            r17 = r2
            r19 = r1
            r21 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r35
            r7.A03 = r0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r6 = 4
            X.N4R r0 = new X.N4R
            r0.<init>((int) r6, (java.lang.Object) r1, (java.lang.Object) r3)
            X.02z r5 = X.DbS.A10(r0)
            r7.A01 = r5
            r7.A02 = r5
        L_0x004b:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            X.N4R r1 = (X.N4R) r1
            X.2Ep r0 = X.C67759MuF.A01(r7)
            if (r0 == 0) goto L_0x006c
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.Ja7 r2 = r0.A0a
        L_0x005e:
            java.lang.Object r1 = r1.A02
            X.N4R r0 = new X.N4R
            r0.<init>((int) r6, (java.lang.Object) r1, (java.lang.Object) r2)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x004b
            return
        L_0x006c:
            r2 = r3
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NVG.<init>(android.content.res.Resources, com.instagram.common.session.UserSession, com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository, X.9HC, X.7L2, X.72Q, com.instagram.model.direct.DirectThreadKey, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void");
    }

    public final N3R A04(GMQ gmq, C69285Nil nil, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, ArrayList arrayList, List list, int i, boolean z) {
        C68193N5i n5i;
        Boolean bool5 = bool4;
        String str5 = str;
        C69285Nil nil2 = nil;
        String str6 = str2;
        N3R A04 = super.A04(gmq, nil2, user, bool, bool2, bool3, bool5, str5, str6, str3, str4, arrayList, list, i, z);
        if (str != null) {
            if (str2 == null) {
                str6 = "";
            }
            n5i = new C68193N5i(str5, Integer.valueOf(R.drawable.instagram_trophy_pano_outline_24), str6);
        } else {
            n5i = null;
        }
        if (AnonymousClass7TF.A1Y(bool5, true) && this.A03) {
            nil2 = C69285Nil.LOADING;
        }
        List list2 = A04.A0E;
        List list3 = A04.A0C;
        List list4 = A04.A0F;
        List list5 = A04.A0D;
        String str7 = A04.A0A;
        String str8 = A04.A09;
        User user2 = A04.A04;
        Boolean bool6 = A04.A06;
        Boolean bool7 = A04.A07;
        GMQ gmq2 = A04.A01;
        int i2 = A04.A00;
        boolean z2 = A04.A0G;
        boolean z3 = A04.A0H;
        Boolean bool8 = A04.A08;
        ArrayList arrayList2 = A04.A0B;
        Boolean bool9 = A04.A05;
        0qQ.A0B(list2, 0);
        AnonymousClass7TF.A1B(list3, 1, list4);
        String str9 = str8;
        String str10 = str7;
        return new N3R(gmq2, n5i, nil2, user2, bool6, bool7, bool8, bool9, str10, str9, arrayList2, list2, list3, list4, list5, i2, z2, z3);
    }
}
