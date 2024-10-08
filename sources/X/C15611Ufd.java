package X;

import android.os.Bundle;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.Ufd  reason: case insensitive filesystem */
public final class C15611Ufd extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C15327Uab A01;
    public final /* synthetic */ boolean A02;

    public C15611Ufd(C15327Uab uab, int i, boolean z) {
        this.A01 = uab;
        this.A00 = i;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0142, code lost:
        X.0qQ.A0F("adAccountId");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r16) {
        /*
            r15 = this;
            r2 = r16
            r0 = -1589850789(0xffffffffa13ccd5b, float:-6.3968663E-19)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.UXp r2 = (X.C15255UXp) r2
            r0 = -1952232790(0xffffffff8ba34aaa, float:-6.289766E-32)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r9 = 0
            X.0qQ.A0B(r2, r9)
            X.UKM r3 = r2.A03
            java.lang.String r14 = "adsManagerLogger"
            java.lang.String r7 = "past_promotion_list"
            r4 = 0
            if (r3 == 0) goto L_0x0065
            boolean r0 = r15.A02
            X.Uab r8 = r15.A01
            if (r0 == 0) goto L_0x002e
            X.VwK r1 = r8.A01
            if (r1 == 0) goto L_0x013e
            java.lang.String r0 = r3.A03
            r1.A02(r7, r0)
        L_0x002e:
            com.instagram.api.schemas.ErrorIdentifier r1 = r3.A01
            com.instagram.api.schemas.ErrorIdentifier r0 = com.instagram.api.schemas.ErrorIdentifier.ADVERTISER_SANCTIONED
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            r8.A0E = r1
            java.lang.String r0 = r3.A02
            r8.A09 = r0
            X.UKW r0 = r3.A00
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = r0.A03
        L_0x0042:
            r8.A0A = r0
            if (r1 != 0) goto L_0x0065
            X.C13990Tnq.A0h()
            android.os.Bundle r0 = X.C13992Tns.A04(r8)
            X.UZG r3 = new X.UZG
            r3.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r0, r3, r8)
            X.0eM r0 = r8.A0I
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            r0.A0G(r4, r9)
            r0.A0B(r4, r3)
            r0.A04()
        L_0x0065:
            X.UKM r0 = r2.A03
            if (r0 == 0) goto L_0x006f
            X.Uab r0 = r15.A01
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0131
        L_0x006f:
            X.Uab r8 = r15.A01
            boolean r0 = r2.A07
            r8.A0C = r0
            int r3 = r2.A00
            java.util.List r0 = r2.A05
            if (r0 == 0) goto L_0x00db
            java.util.Iterator r13 = r0.iterator()
        L_0x007f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r10 = r13.next()
            X.WOi r10 = (X.C19176WOi) r10
            java.lang.String r0 = r8.A07
            java.lang.String r12 = "adAccountId"
            if (r0 == 0) goto L_0x0142
            r10.A0B = r0
            java.lang.String r0 = r8.A0B
            java.lang.String r11 = "fbPageId"
            if (r0 == 0) goto L_0x011f
            r10.A0L = r0
            com.google.common.collect.ImmutableList r0 = r10.ByH()
            X.3kO r2 = X.C66580MXl.A0J(r0)
        L_0x00a3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ba
            X.WOi r1 = X.C13989Tnp.A0S(r2)
            java.lang.String r0 = r8.A07
            if (r0 == 0) goto L_0x0142
            r1.A0B = r0
            java.lang.String r0 = r8.A0B
            if (r0 == 0) goto L_0x011f
            r1.A0L = r0
            goto L_0x00a3
        L_0x00ba:
            java.util.List r0 = r8.A0G
            r0.add(r10)
            X.VwK r2 = r8.A01
            if (r2 == 0) goto L_0x013e
            com.google.common.collect.ImmutableList r0 = r10.ByH()
            java.lang.Object r0 = X.00k.A0J(r0)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r1 = "view_ad_comparison_insights"
        L_0x00cf:
            java.lang.String r0 = r8.A08
            r2.A06(r7, r1, r0)
            goto L_0x007f
        L_0x00d5:
            java.lang.String r1 = "view_insights"
            goto L_0x00cf
        L_0x00d8:
            r0 = r4
            goto L_0x0042
        L_0x00db:
            if (r3 != 0) goto L_0x00f0
            boolean r0 = r8.isAdded()
            if (r0 == 0) goto L_0x00f0
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            X.0eM r0 = r8.A0I
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            r0.A0G(r4, r9)
        L_0x00f0:
            int r1 = r8.A00
            int r0 = r15.A00
            int r1 = r1 + r0
            r8.A00 = r1
            java.util.List r10 = r8.A0H
            r10.clear()
            java.util.List r9 = r8.A0G
            int r3 = r9.size()
            r2 = 0
        L_0x0103:
            if (r2 >= r3) goto L_0x0119
            java.lang.Object r1 = r9.get(r2)
            if (r2 == 0) goto L_0x0113
            X.VAE r0 = new X.VAE
            r0.<init>()
            r10.add(r0)
        L_0x0113:
            r10.add(r1)
            int r2 = r2 + 1
            goto L_0x0103
        L_0x0119:
            X.UdV r0 = r8.A02
            if (r0 != 0) goto L_0x0123
            java.lang.String r11 = "pastPromotionsAdapter"
        L_0x011f:
            X.0qQ.A0F(r11)
            goto L_0x0145
        L_0x0123:
            r0.A01(r10)
            boolean r0 = r15.A02
            if (r0 == 0) goto L_0x0131
            X.VwK r0 = r8.A01
            if (r0 == 0) goto L_0x013e
            r0.A03(r7, r4)
        L_0x0131:
            r0 = 270290413(0x101c4ded, float:3.0825607E-29)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1187428463(0x46c6b86f, float:25436.217)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x013e:
            X.0qQ.A0F(r14)
            goto L_0x0145
        L_0x0142:
            X.0qQ.A0F(r12)
        L_0x0145:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15611Ufd.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r8) {
        String str;
        int A03 = AnonymousClass0fD.A03(-344639916);
        0qQ.A0B(r8, 0);
        if (this.A02) {
            Throwable A012 = r8.A01();
            if (A012 == null || (str = A012.getMessage()) == null) {
                str = "Unknown error";
            }
            C18662VwK vwK = this.A01.A01;
            if (vwK == null) {
                0qQ.A0F("adsManagerLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            vwK.A02("past_promotion_list", str);
        }
        C15327Uab uab = this.A01;
        if (uab.isAdded()) {
            C13990Tnq.A0h();
            Bundle A04 = C13992Tns.A04(uab);
            UZG uzg = new UZG();
            C309516Yo A0N = DbX.A0N(DbU.A0I(A04, uzg, uab), uab.A0I);
            A0N.A0G((String) null, 0);
            A0N.A0B((Bundle) null, uzg);
            A0N.A04();
        }
        AnonymousClass0fD.A0A(-1984105026, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1151173743);
        C15327Uab uab = this.A01;
        C238143As r0 = uab.A04;
        String str = "recyclerViewProxy";
        if (r0 != null) {
            r0.ARa();
            C238143As r02 = uab.A04;
            if (r02 != null) {
                r02.EaP(false);
                AnonymousClass3AD r03 = uab.A05;
                if (r03 == null) {
                    str = "pullToRefresh";
                } else {
                    r03.setIsLoading(false);
                    SpinnerImageView spinnerImageView = uab.A06;
                    if (spinnerImageView == null) {
                        str = "loadingSpinner";
                    } else {
                        JTO.A1X(spinnerImageView);
                        uab.A0D = false;
                        AnonymousClass0fD.A0A(918670711, A03);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1036855752);
        C15327Uab uab = this.A01;
        uab.A0C = false;
        C238143As r0 = uab.A04;
        String str = "recyclerViewProxy";
        if (r0 != null) {
            r0.APL();
            C238143As r02 = uab.A04;
            if (r02 != null) {
                r02.EaP(true);
                AnonymousClass3AD r03 = uab.A05;
                str = "pullToRefresh";
                if (r03 != null) {
                    r03.setIsLoading(true);
                    List list = uab.A0H;
                    if (list == null || list.isEmpty()) {
                        AnonymousClass3AD r04 = uab.A05;
                        if (r04 != null) {
                            if (!(r04 instanceof C19763Wf4)) {
                                SpinnerImageView spinnerImageView = uab.A06;
                                if (spinnerImageView == null) {
                                    str = "loadingSpinner";
                                } else {
                                    DbS.A1T(spinnerImageView);
                                }
                            }
                        }
                    }
                    AnonymousClass0fD.A0A(-893208078, A03);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
