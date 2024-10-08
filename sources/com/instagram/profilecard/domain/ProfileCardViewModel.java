package com.instagram.profilecard.domain;

import X.002;
import X.00l;
import X.02z;
import X.05G;
import X.0Yt;
import X.0qQ;
import X.0sm;
import X.0sn;
import X.10b;
import X.16V;
import X.19B;
import X.1Eo;
import X.1wn;
import X.2YL;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0iw;
import X.AnonymousClass0nB;
import X.AnonymousClass2Rc;
import X.AnonymousClass37D;
import X.AnonymousClass37F;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C234502xy;
import X.C242043Sk;
import X.C253353qe;
import X.C253443qn;
import X.C2609247o;
import X.C273654mx;
import X.C309516Yo;
import X.C318116oQ;
import X.C331127Pr;
import X.C331157Pu;
import X.C384949i9;
import X.C46322DUz;
import X.C46447Df9;
import X.C47696EDf;
import X.C49387Eup;
import X.C50343FZa;
import X.C51648Fy7;
import X.C53397GnU;
import X.C56532I0d;
import X.C65362Ls2;
import X.C65546LvL;
import X.DbS;
import X.DbT;
import X.DbU;
import X.Dc2;
import X.E5O;
import X.EVW;
import X.FX1;
import X.FYZ;
import X.FZZ;
import X.FmM;
import X.JVM;
import X.LQT;
import X.T7M;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.profilecard.data.ProfileCardRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ProfileCardViewModel extends 2YL implements AnonymousClass0iw {
    public LQT A00;
    public Dc2 A01;
    public JVM A02;
    public C234502xy A03;
    public C65362Ls2 A04;
    public User A05;
    public boolean A06;
    public boolean A07;
    public final Application A08;
    public final C65546LvL A09 = new C65546LvL(this, 0);
    public final FX1 A0A = FX1.A00(this, 26);
    public final FX1 A0B = FX1.A00(this, 27);
    public final FX1 A0C = FX1.A00(this, 28);
    public final C47696EDf A0D = new C47696EDf(this, 13);
    public final 1wn A0E = FX1.A00(this, 25);
    public final UserSession A0F;
    public final ProfileCardRepository A0G;
    public final C49387Eup A0H = new C49387Eup(this);
    public final T7M A0I;
    public final FYZ A0J;
    public final 05G A0K;
    public final AnonymousClass0Ud A0L;
    public final boolean A0M;

    public final void A08(Activity activity) {
        0qQ.A0B(activity, 0);
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            Window window = fragmentActivity.getWindow();
            if (window != null) {
                window.clearFlags(512);
            }
            C309516Yo A0Q = DbU.A0Q(fragmentActivity, this.A0F);
            A0Q.A0D(C46447Df9.A02().A04("profile"));
            A0Q.A04();
        }
    }

    public final String getModuleName() {
        return E5O.__redex_internal_original_name;
    }

    public ProfileCardViewModel(Application application, UserSession userSession, ProfileCardRepository profileCardRepository, T7M t7m, FYZ fyz, boolean z) {
        T7M t7m2 = t7m;
        FYZ fyz2 = fyz;
        AnonymousClass7TG.A1R(fyz2, t7m2);
        this.A0F = userSession;
        this.A08 = application;
        this.A0G = profileCardRepository;
        this.A0J = fyz2;
        this.A0I = t7m2;
        this.A0M = z;
        Integer num = AnonymousClass05K.A00;
        SimpleImageUrl A0V = DbS.A0V("");
        0sm A0E2 = 0Yt.A0E();
        boolean z2 = !AnonymousClass2Rc.A00;
        02z A10 = DbS.A10(new C53397GnU(A0V, (ImageUrl) null, new C56532I0d(0sn.A00, -1), num, "", "", "", "", "", A0E2, 0.0f, 1.0f, 200.0f, false, true, false, z2, z2, false, false, false, false, false));
        this.A0K = A10;
        this.A0L = 10b.A03(A10);
        1Eo.A03(num, 19B.A00, new C51648Fy7(this, (AnonymousClass4D7) null, 37), C318116oQ.A00(this));
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.profilecard.domain.ProfileCardViewModel r31, X.AnonymousClass4D7 r32) {
        /*
            r3 = r31
            r4 = 27
            r5 = r32
            boolean r0 = X.C66138MDq.A02(r4, r5)
            if (r0 == 0) goto L_0x00d9
            r6 = r5
            X.MDq r6 = (X.C66138MDq) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d9
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 == r2) goto L_0x007b
            if (r0 != r4) goto L_0x00e0
            java.lang.Object r3 = r6.A01
            com.instagram.profilecard.domain.ProfileCardViewModel r3 = (com.instagram.profilecard.domain.ProfileCardViewModel) r3
            X.0eS.A00(r1)
        L_0x002f:
            X.05G r3 = r3.A0K
        L_0x0031:
            java.lang.Object r1 = r3.getValue()
            r7 = r1
            X.GnU r7 = (X.C53397GnU) r7
            r4 = 0
            r19 = 0
            r15 = 0
            r17 = 1128792064(0x43480000, float:200.0)
            r18 = 8290303(0x7e7fff, float:1.1617189E-38)
            r5 = r4
            r6 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r16 = r15
            r20 = r19
            r21 = r19
            r22 = r19
            r23 = r2
            r24 = r19
            r25 = r19
            r26 = r19
            r27 = r19
            r28 = r19
            X.GnU r0 = X.C53397GnU.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = r3.AIY(r1, r0)
            if (r0 == 0) goto L_0x0031
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x006b:
            X.0eS.A00(r1)
            r0 = 100
            r6.A01 = r3
            r6.A00 = r2
            java.lang.Object r0 = X.C241603Pv.A01(r6, r0)
            if (r0 != r5) goto L_0x0082
            return r5
        L_0x007b:
            java.lang.Object r3 = r6.A01
            com.instagram.profilecard.domain.ProfileCardViewModel r3 = (com.instagram.profilecard.domain.ProfileCardViewModel) r3
            X.0eS.A00(r1)
        L_0x0082:
            X.05G r7 = r3.A0K
        L_0x0084:
            java.lang.Object r1 = r7.getValue()
            r11 = r1
            X.GnU r11 = (X.C53397GnU) r11
            r8 = 0
            r23 = 0
            r19 = 0
            r21 = 1112014848(0x42480000, float:50.0)
            r22 = 8306687(0x7ebfff, float:1.1640148E-38)
            r9 = r8
            r10 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r19
            r24 = r23
            r25 = r23
            r26 = r2
            r27 = r23
            r28 = r23
            r29 = r23
            r30 = r23
            r31 = r23
            r32 = r23
            X.GnU r0 = X.C53397GnU.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = r7.AIY(r1, r0)
            if (r0 == 0) goto L_0x0084
            boolean r0 = r3.A09()
            if (r0 == 0) goto L_0x00d5
            r3.A05()
        L_0x00c8:
            r0 = 400(0x190, double:1.976E-321)
            r6.A01 = r3
            r6.A00 = r4
            java.lang.Object r0 = X.C241603Pv.A01(r6, r0)
            if (r0 != r5) goto L_0x002f
            return r5
        L_0x00d5:
            r3.A06()
            goto L_0x00c8
        L_0x00d9:
            X.MDq r6 = new X.MDq
            r6.<init>(r3, r5, r4)
            goto L_0x001a
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profilecard.domain.ProfileCardViewModel.A00(com.instagram.profilecard.domain.ProfileCardViewModel, X.4D7):java.lang.Object");
    }

    public static final void A03(ProfileCardViewModel profileCardViewModel) {
        Object value;
        05G r2 = profileCardViewModel.A0K;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C53397GnU.A00((ImageUrl) null, (ImageUrl) null, (C56532I0d) null, (C53397GnU) value, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 0.0f, 1.0f, 0.0f, 8382463, false, true, false, false, false, false, false, false, false, false)));
    }

    public static final void A04(ProfileCardViewModel profileCardViewModel, boolean z) {
        Object value;
        05G r2 = profileCardViewModel.A0K;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C53397GnU.A00((ImageUrl) null, (ImageUrl) null, (C56532I0d) null, (C53397GnU) value, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 0.0f, 0.0f, 0.0f, 8388095, z, false, false, false, false, false, false, false, false, false)));
    }

    public final boolean A09() {
        float abs = Math.abs(((C53397GnU) this.A0L.getValue()).A00 % 360.0f);
        if (90.0f > abs || abs > 270.0f) {
            return false;
        }
        return true;
    }

    public final void onCleared() {
        this.A0F.A03(FYZ.class);
    }

    public static final ArrayList A01(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C253443qn r1 = (C253443qn) it.next();
                if (r1.getUrl().length() > 0) {
                    A1C.add(r1.getUrl());
                }
            }
        }
        return A1C;
    }

    public static final void A02(Activity activity, ProfileCardViewModel profileCardViewModel) {
        profileCardViewModel.A06();
        C331127Pr A0W = DbS.A0W(profileCardViewModel.A0F);
        DbS.A1S(A0W, true);
        A0W.A0k = true;
        A0W.A1O = true;
        A0W.A03 = 0.9f;
        C331157Pu A002 = A0W.A00();
        int A012 = AnonymousClass0nB.A01(profileCardViewModel.A08);
        FZZ fzz = new FZZ(activity, profileCardViewModel);
        C50343FZa fZa = new C50343FZa();
        C384949i9 r4 = new C384949i9();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt(C273654mx.A00(259), A012);
        r4.setArguments(A0a);
        r4.A00 = fzz;
        r4.A01 = fZa;
        AnonymousClass37D A0i = DbT.A0i(activity);
        if (A0i != null) {
            AnonymousClass37F r2 = (AnonymousClass37F) A0i;
            if (r2.A0g) {
                r2.A0H = new FmM(5, activity, r4, A002);
                A0i.A0B();
                return;
            }
        }
        A002.A02(activity, r4);
    }

    public final void A05() {
        Object value;
        if (A09()) {
            float f = ((C53397GnU) this.A0L.getValue()).A00;
            05G r5 = this.A0K;
            do {
                value = r5.getValue();
            } while (!r5.AIY(value, C53397GnU.A00((ImageUrl) null, (ImageUrl) null, (C56532I0d) null, (C53397GnU) value, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 0.0f + (((float) ((int) (f / 360.0f))) * 360.0f), 0.0f, 0.0f, 8387583, false, false, false, false, false, false, false, false, false, false)));
        }
    }

    public final void A06() {
        Object value;
        if (!A09()) {
            float f = ((C53397GnU) this.A0L.getValue()).A00;
            05G r5 = this.A0K;
            do {
                value = r5.getValue();
            } while (!r5.AIY(value, C53397GnU.A00((ImageUrl) null, (ImageUrl) null, (C56532I0d) null, (C53397GnU) value, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 180.0f + (((float) ((int) (f / 360.0f))) * 360.0f), 0.0f, 0.0f, 8387583, false, false, false, false, false, false, false, false, false, false)));
        }
    }

    public final void A07() {
        Object value;
        List<C2609247o> BcT;
        String category;
        MusicAssetModel musicAssetModel;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        User user = this.A05;
        if (user != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            JVM jvm = this.A02;
            List<C46322DUz> list = null;
            if (!(jvm == null || (musicAssetModel = jvm.A02) == null)) {
                String str = musicAssetModel.A0I;
                String str2 = musicAssetModel.A0D;
                if (!(str == null || str.length() == 0 || (str2 != null && str2.length() != 0 && (str = 002.A0g(str, " · ", str2)) == null))) {
                    A1C.add(str);
                }
            }
            A1H.put(EVW.MUSIC, A1C);
            String AXr = user.A03.AXr();
            boolean A1X = AnonymousClass7TG.A1X(user.A03.BuZ());
            if (AXr != null && !00l.A0W(AXr) && ((user.A0J() == 16V.A05 || user.A0J() == 16V.A06) && A1X && (category = user.A03.getCategory()) != null)) {
                A1H.put(EVW.CATEGORY, AnonymousClass7TE.A1I(category));
            }
            A1H.put(EVW.CUSTOM_LINK, A01(user.A03.Afp()));
            C242043Sk BcS = user.A03.BcS();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            if (!(BcS == null || (BcT = BcS.BcT()) == null)) {
                for (C2609247o title : BcT) {
                    String title2 = title.getTitle();
                    if (title2.length() > 0) {
                        A1C2.add(title2);
                    }
                }
            }
            A1H.put(EVW.BROADCAST, A1C2);
            C253353qe AYk = user.A03.AYk();
            if (AYk != null) {
                list = AYk.B8h();
            }
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            if (list != null) {
                for (C46322DUz fundraiserTitle : list) {
                    String fundraiserTitle2 = fundraiserTitle.getFundraiserTitle();
                    if (fundraiserTitle2.length() > 0) {
                        A1C3.add(fundraiserTitle2);
                    }
                }
            }
            A1H.put(EVW.FUNDRAISER, A1C3);
        }
        05G r2 = this.A0K;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C53397GnU.A00((ImageUrl) null, (ImageUrl) null, (C56532I0d) null, (C53397GnU) value, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, A1H, 0.0f, 0.0f, 0.0f, 8388591, false, false, false, false, false, false, false, false, false, false)));
    }
}
