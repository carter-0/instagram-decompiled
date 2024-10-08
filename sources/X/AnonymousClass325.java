package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.325  reason: invalid class name */
public final class AnonymousClass325 {
    public final Fragment A00;
    public final AnonymousClass07i A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass326 A04;

    public static final void A00(1Xj r11, NHN nhn, AnonymousClass325 r13, String str, String str2, String str3) {
        Dialog dialog;
        String str4;
        String str5;
        1Xj r7 = r11;
        EyL eyL = nhn.A02;
        if (r11.A5D()) {
            r7 = r11.A1f(str);
            0qQ.A0A(r7);
        }
        AnonymousClass326 r6 = r13.A04;
        String valueOf = String.valueOf(nhn.A03);
        FeaturedProductPermissionStatus featuredProductPermissionStatus = FeaturedProductPermissionStatus.PENDING;
        UserSession userSession = r13.A03;
        r6.A01(r7, featuredProductPermissionStatus, valueOf, str3, userSession.A06, str2);
        Fragment fragment = r13.A00;
        Context requireContext = fragment.requireContext();
        if (eyL != null) {
            C358248ab r5 = new C358248ab(requireContext);
            String str6 = eyL.A01;
            if (str6 != null) {
                r5.A05 = str6;
                String str7 = eyL.A00;
                if (str7 != null) {
                    r5.A0q(str7);
                    List<EyK> list = eyL.A02;
                    if (list != null) {
                        for (EyK eyK : list) {
                            0qQ.A0B(eyK, 0);
                            C48102EVu eVu = eyK.A00;
                            if (eVu != null) {
                                int ordinal = eVu.ordinal();
                                if (ordinal == 0) {
                                    String str8 = eyK.A01;
                                    if (str8 != null) {
                                        r5.A0c((DialogInterface.OnClickListener) null, str8);
                                    }
                                } else if (ordinal == 2) {
                                    String str9 = eyK.A01;
                                    if (str9 != null) {
                                        r5.A0a(new FIE(eyK, r13), str9);
                                    }
                                } else if (ordinal == 1) {
                                    String str10 = eyK.A01;
                                    if (str10 != null) {
                                        r5.A0b(new C49984FHt(r13), str10);
                                    }
                                } else {
                                    throw new RuntimeException();
                                }
                                str5 = "buttonText";
                            } else {
                                str5 = "destination";
                            }
                        }
                        dialog = r5.A02();
                    } else {
                        str5 = "actions";
                    }
                } else {
                    str5 = "descriptionText";
                }
            } else {
                str5 = "titleText";
            }
            0qQ.A0F(str5);
            throw AnonymousClass00P.createAndThrow();
        }
        C358248ab r4 = new C358248ab(requireContext);
        r4.A09(2131962233);
        Context requireContext2 = fragment.requireContext();
        int i = 2131962235;
        if (r7.BR7() == 1iA.A0Q) {
            i = 2131962234;
        }
        User A2A = r7.A2A(userSession);
        if (A2A != null) {
            str4 = A2A.getUsername();
        } else {
            str4 = null;
        }
        r4.A0q(requireContext2.getString(i, new Object[]{str4}));
        r4.A0G((DialogInterface.OnClickListener) null, 2131968772);
        r4.A0H(new C49983FHs(r13), 2131962267);
        dialog = r4.A02();
        AnonymousClass0fN.A00(dialog);
    }

    public static final void A01(C70593OCq oCq, AnonymousClass325 r2) {
        String str;
        C358248ab r22 = new C358248ab(r2.A00.requireContext());
        String str2 = oCq.A01;
        if (str2 != null) {
            r22.A05 = str2;
            String str3 = oCq.A00;
            if (str3 != null) {
                r22.A0q(str3);
                r22.A0G((DialogInterface.OnClickListener) null, 2131968772);
                AnonymousClass0fN.A00(r22.A02());
                return;
            }
            str = "errorDescription";
        } else {
            str = "errorTitle";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(AnonymousClass325 r3) {
        1xC r2 = 1xC.A01;
        Resources resources = r3.A00.requireContext().getResources();
        0qQ.A07(resources);
        r2.A00(new AnonymousClass3GP(Dc5.A02(resources, (C51878G5q) null)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r1 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.1Xj r23, X.JQL r24, java.lang.String r25) {
        /*
            r22 = this;
            r18 = 0
            r3 = r23
            boolean r0 = r3.A5D()
            r8 = r22
            r4 = r24
            r2 = r25
            if (r0 == 0) goto L_0x0025
            X.H5J r1 = new X.H5J
            r1.<init>(r3, r8, r4, r2)
            androidx.fragment.app.Fragment r2 = r8.A00
            r0 = r2
            X.4DJ r0 = (X.AnonymousClass4DJ) r0
            r0.registerLifecycleListener(r1)
            X.3kF r1 = X.C249713kF.A00
            com.instagram.common.session.UserSession r0 = r8.A03
            r1.A0k(r2, r0, r3)
            return
        L_0x0025:
            X.H5K r1 = new X.H5K
            r1.<init>(r3, r8, r4, r2)
            androidx.fragment.app.Fragment r5 = r8.A00
            r0 = r5
            X.4DJ r0 = (X.AnonymousClass4DJ) r0
            r0.registerLifecycleListener(r1)
            X.1Xy r0 = r3.A0C
            X.DTn r0 = r0.B4x()
            r2 = 0
            if (r0 == 0) goto L_0x008a
            java.util.List r6 = r0.C2n()
            if (r6 == 0) goto L_0x0048
            boolean r1 = r6.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            r7 = 10
            if (r0 == 0) goto L_0x00b4
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r8.A03
            com.instagram.user.model.User r6 = r1.A01(r0)
            r0 = 1
            java.util.ArrayList r0 = r3.A3K(r0)
            if (r0 == 0) goto L_0x00b3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x0065:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            com.instagram.user.model.User r0 = r0.A0B
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
        L_0x007a:
            java.lang.String r0 = r6.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0065
            r9.add(r3)
            goto L_0x0065
        L_0x0088:
            r1 = r2
            goto L_0x007a
        L_0x008a:
            r6 = r2
            goto L_0x0048
        L_0x008c:
            int r0 = X.0Yv.A1E(r9, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r3 = r9.iterator()
        L_0x0099:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r3.next()
            com.instagram.user.model.Product r0 = (com.instagram.user.model.Product) r0
            java.lang.String r0 = r0.A0H
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.add(r0)
            goto L_0x0099
        L_0x00b3:
            r6 = r2
        L_0x00b4:
            X.3kF r4 = X.C249713kF.A00
            com.instagram.common.session.UserSession r3 = r8.A03
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            X.0iw r0 = r8.A02
            java.lang.String r10 = r0.getModuleName()
            r11 = 0
            r0 = 2
            X.0qQ.A0B(r10, r0)
            X.Uxb r8 = X.C16581Uxb.FEATURED_PRODUCT_MEDIA
            if (r6 == 0) goto L_0x00ee
            int r0 = X.0Yv.A1E(r6, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x00d6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x00d6
        L_0x00ee:
            r20 = 1
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r7 = new com.instagram.shopping.intf.productpicker.ProductPickerArguments
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r19 = r18
            r21 = r20
            r17 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4.A0l(r5, r3, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass325.A03(X.1Xj, X.JQL, java.lang.String):void");
    }

    public AnonymousClass325(Fragment fragment, AnonymousClass0iw r8, UserSession userSession) {
        this.A00 = fragment;
        this.A03 = userSession;
        this.A02 = r8;
        this.A01 = AnonymousClass07i.A00(fragment);
        this.A04 = new AnonymousClass326(r8, userSession, (String) null, (String) null, (String) null);
    }
}
