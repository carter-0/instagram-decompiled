package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.WZv  reason: case insensitive filesystem */
public final class C19447WZv implements X9R {
    public VYK A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final F35 A04;
    public final ReelDashboardFragment A05;
    public final C230222pE A06;
    public final AnonymousClass32A A07;
    public final C51031FnN A08;
    public final ReelDashboardFragment A09;
    public final String A0A;

    public final void Cun(VW6 vw6) {
        C309516Yo r4;
        Fragment fragment;
        C255773uh A0F;
        List Bkd;
        1Ns r2 = vw6.A02.A0W;
        r2.getClass();
        int intValue = r2.BVV().intValue();
        if (intValue == 2) {
            String id = r2.getId();
            r4 = new C309516Yo(this.A01.requireActivity(), this.A02);
            1Wr r0 = 1Wr.A00;
            r0.getClass();
            fragment = r0.getFragmentFactory().CrC(id);
        } else if (intValue == 3) {
            String id2 = r2.getId();
            FragmentActivity requireActivity = this.A01.requireActivity();
            UserSession userSession = this.A02;
            r4 = new C309516Yo(requireActivity, userSession);
            HashtagImpl A002 = C281965Ag.A00(id2);
            String moduleName = this.A03.getModuleName();
            fragment = W0l.A01(userSession);
            fragment.setArguments(W0l.A00(A002, moduleName, "DEFAULT"));
        } else if (intValue == 5 && (A0F = this.A05.A0F()) != null && (Bkd = A0F.Bkd(AnonymousClass3WT.PRODUCT)) != null && !Bkd.isEmpty()) {
            C255783ui r22 = (C255783ui) AnonymousClass7TE.A13(Bkd);
            WNN A0L = C249713kF.A00.A0L(this.A01.requireActivity(), this.A02, this.A03, r22.A0I(), AnonymousClass000.A00(3852), (String) null);
            A0L.A02(A0F.A0b, (Integer) null);
            A0L.A06 = r22;
            WNN.A01(A0L);
            return;
        } else {
            return;
        }
        r4.A0E(fragment);
        r4.A04();
    }

    public final void CyQ(C14631Tzd tzd) {
        this.A08.A01(tzd);
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        AnonymousClass4DH r2 = this.A01;
        0hq r0 = r2.mFragmentManager;
        FragmentActivity activity = r2.getActivity();
        if (AnonymousClass06S.A01(r0) && activity != null) {
            List singletonList = Collections.singletonList(reel);
            AnonymousClass32A r4 = this.A07;
            r4.A0C = this.A0A;
            r4.A05 = new C16165Upq((Activity) r2.getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), this.A06);
            r4.A09(reel, AnonymousClass3BQ.REEL_VIEWER_LIST, gradientSpinnerAvatarView, singletonList, singletonList, singletonList);
        }
    }

    public final void D8u(C14631Tzd tzd, C255773uh r10, User user, boolean z) {
        AnonymousClass3WT r4;
        String str;
        int i;
        String str2;
        int i2;
        AnonymousClass4DH r5 = this.A01;
        Context context = r5.getContext();
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(context);
        if (context != null && A022 != null) {
            boolean z2 = tzd.A0B;
            1ap r2 = 1as.A04.A02;
            UserSession userSession = this.A02;
            OOA A062 = r2.A06(this.A03, userSession, "reel_dashboard_viewer");
            A062.A03(r10.A0k);
            A062.A04(r10.A0j);
            Bundle bundle = A062.A01;
            bundle.putBoolean("DirectReplyModalFragment.is_archive_reel", z);
            A062.A06(user.getId());
            A062.A01(C66579MXk.A00(396));
            bundle.putBoolean(C66579MXk.A00(524), z2);
            String str3 = tzd.A09;
            if (str3 != null) {
                bundle.putString(C66579MXk.A00(532), str3);
                A062.A05(tzd.A09);
            } else {
                XA1 xa1 = tzd.A01;
                if (xa1 != null) {
                    str2 = ((UNU) xa1).A00;
                    0qQ.A0B(str2, 0);
                    i2 = 522;
                } else {
                    BBV bbv = tzd.A00;
                    if (bbv != null) {
                        str2 = bbv.A00;
                        0qQ.A0B(str2, 0);
                        i2 = 523;
                    } else if (!(tzd.A07 == null && tzd.A04 == null && tzd.A03 == null) && 182.A06(0Tu.A05, userSession, 36314816071076662L)) {
                        String str4 = tzd.A07;
                        if (str4 != null) {
                            r4 = AnonymousClass3WT.QUIZ;
                        } else if (tzd.A04 != null) {
                            r4 = AnonymousClass3WT.POLLING;
                        } else if (tzd.A03 != null) {
                            r4 = AnonymousClass3WT.SLIDER;
                        }
                        int ordinal = r4.ordinal();
                        if (ordinal == 29) {
                            C255773uh r0 = tzd.A0K;
                            r0.getClass();
                            C272024jy A002 = C297825sP.A00(r0);
                            A002.getClass();
                            String text = ((C272014jx) AnonymousClass9OX.A01(A002).get(C13988Tno.A0D(tzd.A04))).getText();
                            if (text == null) {
                                str = "";
                            } else {
                                str = text;
                            }
                            bundle.putString(C66579MXk.A00(526), str);
                            A062.A05(DbV.A0z(r5, text, 2131969556));
                            String str5 = tzd.A06;
                            str5.getClass();
                            A062.A07(str5, r4.A00);
                            i = 1149;
                        } else if (ordinal == 42) {
                            str4.getClass();
                            bundle.putString(C66579MXk.A00(529), str4);
                            A062.A05(DbV.A0z(r5, tzd.A07, 2131971241));
                            String str6 = tzd.A08;
                            str6.getClass();
                            A062.A07(str6, r4.A00);
                            i = 398;
                        } else if (ordinal == 45) {
                            Float f = tzd.A03;
                            f.getClass();
                            bundle.putFloat(C66579MXk.A00(531), f.floatValue());
                            A062.A05(r5.getString(2131974003));
                            String str7 = tzd.A0A;
                            str7.getClass();
                            A062.A07(str7, r4.A00);
                            i = 399;
                        }
                        A062.A01(C66579MXk.A00(i));
                    }
                }
                bundle.putString(C66579MXk.A00(i2), str2);
            }
            1Xj r1 = r10.A0b;
            if (r1 != null) {
                A062.A00 = new C70636OEh(r1, user, this);
            }
            A022.A0I(A062.A00());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d5, code lost:
        if (r8 != false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DRv(X.C14631Tzd r14, X.C255773uh r15, com.instagram.user.model.User r16) {
        /*
            r13 = this;
            com.instagram.common.session.UserSession r12 = r13.A02
            X.2Ix r0 = X.2Ix.A00(r12)
            java.lang.Integer r1 = r0.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r0 = r1.equals(r0)
            r8 = 1
            r3 = r16
            if (r0 == 0) goto L_0x0034
            X.4Cl r0 = r3.A03
            java.lang.Boolean r0 = r0.BBP()
            if (r0 == 0) goto L_0x0034
            X.4Cl r0 = r3.A03
            java.lang.Boolean r0 = r0.BBP()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r3.getFullName()
            r3.A0v(r0)
            r13.D8u(r14, r15, r3, r8)
        L_0x0033:
            return
        L_0x0034:
            X.4DH r0 = r13.A01
            android.content.Context r5 = r0.getContext()
            X.8jd r1 = X.C363388je.A00(r12)
            java.lang.String r0 = "DefaultReelDashboardViewersDelegateImpl"
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.5wF r0 = r1.A00(r0)
            java.lang.String r11 = r0.A03
            if (r5 == 0) goto L_0x0033
            X.7Pu r4 = X.DbW.A0T(r12)
            X.BBV r0 = r14.A00
            boolean r7 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r0 = r14.A09
            boolean r6 = X.AnonymousClass7TF.A1V(r0)
            X.XA1 r0 = r14.A01
            if (r0 != 0) goto L_0x0061
            r8 = 0
        L_0x0061:
            java.lang.String r1 = r3.B8Q()
            r2 = 0
            if (r7 == 0) goto L_0x00c8
            if (r6 == 0) goto L_0x00d7
            r0 = 2131959822(0x7f13200e, float:1.9556295E38)
            java.lang.String r8 = X.DbW.A0h(r5, r1, r0)
            X.0qQ.A0A(r8)
        L_0x0074:
            java.lang.String r10 = r3.getId()
            java.lang.String r9 = r3.B8Q()
            com.instagram.common.typedurl.ImageUrl r7 = r3.Bh3()
            X.BBV r1 = r14.A00
            java.lang.String r6 = r14.A09
            X.0qQ.A0B(r12, r2)
            X.UYv r3 = new X.UYv
            r3.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            X.AnonymousClass0Dg.A00(r2, r12)
            java.lang.String r0 = "args_media_owner_obid"
            r2.putString(r0, r11)
            r0 = 235(0xeb, float:3.3E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r10)
            java.lang.String r0 = "args_media_viewer_namme"
            r2.putString(r0, r9)
            java.lang.String r0 = "args_profile_pic_url"
            r2.putParcelable(r0, r7)
            java.lang.String r0 = "args_bottomsheet_title"
            r2.putString(r0, r8)
            if (r1 == 0) goto L_0x00c6
            java.lang.String r1 = r1.A00
        L_0x00b5:
            java.lang.String r0 = "args_emoji_unicode"
            r2.putString(r0, r1)
            java.lang.String r0 = "args_reply_text"
            r2.putString(r0, r6)
            r3.setArguments(r2)
            r4.A03(r5, r3)
            return
        L_0x00c6:
            r1 = 0
            goto L_0x00b5
        L_0x00c8:
            if (r6 == 0) goto L_0x00d2
            r0 = 2131959821(0x7f13200d, float:1.9556293E38)
        L_0x00cd:
            java.lang.String r8 = X.DbY.A0c(r5, r1, r0)
            goto L_0x0074
        L_0x00d2:
            r0 = 2131959818(0x7f13200a, float:1.9556287E38)
            if (r8 == 0) goto L_0x00cd
        L_0x00d7:
            r0 = 2131959820(0x7f13200c, float:1.9556291E38)
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19447WZv.DRv(X.Tzd, X.3uh, com.instagram.user.model.User):void");
    }

    public final void DVp(C14631Tzd tzd) {
        this.A08.A02(tzd);
    }

    public final void Drv(VW6 vw6) {
        String str;
        int i;
        C358248ab A0g;
        int i2;
        C255773uh A0F = this.A05.A0F();
        if (A0F != null) {
            VYK vyk = this.A00;
            if (vyk == null) {
                vyk = new VYK(this.A01, this.A02);
                this.A00 = vyk;
            }
            ReelDashboardFragment reelDashboardFragment = this.A09;
            VW6 vw62 = vw6;
            0qQ.A0B(vw6, 0);
            vyk.A00 = new WeakReference(reelDashboardFragment);
            1Ns r0 = vw6.A02.A0W;
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = null;
            }
            boolean A1m = A0F.A1m();
            boolean z = vw6.A00;
            C71189Of8 of8 = new C71189Of8(3, reelDashboardFragment, vyk, vw62, A0F);
            if (z) {
                Context context = vyk.A01;
                if (A1m) {
                    0qQ.A0A(context);
                    i2 = 2131975889;
                } else {
                    0qQ.A0A(context);
                    i2 = 2131975884;
                }
                String A0p = C51967G9n.A0p(context, i2);
                A0g = new C358248ab(context);
                A0g.A0l(vyk.A02, vyk.A03);
                A0g.A0e(of8, new CharSequence[]{A0p});
            } else {
                Context context2 = vyk.A01;
                if (A1m) {
                    0qQ.A0A(context2);
                    i = 2131963397;
                } else {
                    0qQ.A0A(context2);
                    i = 2131963383;
                }
                String A0h = DbW.A0h(context2, str, i);
                0qQ.A0A(A0h);
                int i3 = 2131963382;
                if (A1m) {
                    i3 = 2131963396;
                }
                String A0h2 = DbW.A0h(context2, str, i3);
                0qQ.A0A(A0h2);
                int i4 = 2131963371;
                if (vw6.A00) {
                    i4 = 2131968772;
                }
                A0g = DbX.A0g(context2, A0h2, A0h);
                A0g.A0C(new C49969FHc(12));
                A0g.A0I(of8, i4);
            }
            AnonymousClass7TH.A0a(A0g, true);
        }
    }

    public final void Drw(User user) {
        this.A08.A04(user);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r10.equals("") != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r10.equals("") != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DzU(X.C14631Tzd r12) {
        /*
            r11 = this;
            com.instagram.user.model.User r2 = r12.A0L
            if (r2 == 0) goto L_0x00c7
            X.F35 r5 = r11.A04
            X.3uh r4 = r12.A0K
            r7 = 0
            if (r4 == 0) goto L_0x003d
            X.1Xj r6 = r4.A0b
            if (r6 == 0) goto L_0x003d
            X.0wc r1 = r5.A00
            java.lang.String r0 = "reel_viewer_dashboard_profile_click"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r1 = ""
            java.lang.String r0 = "radio_type"
            r3.AAJ(r0, r1)
            java.lang.String r0 = r2.getId()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "target_id"
            r3.A9F(r0, r1)
            java.lang.String r0 = r6.A30()
            if (r0 == 0) goto L_0x00f0
            X.G9t.A1J(r3, r0)
            X.C13989Tnp.A1I(r3, r2)
            X.C51965G9l.A1K(r3, r7)
            r3.Cgf()
        L_0x003d:
            java.lang.String r10 = r12.A09
            r7 = 0
            r3 = 1
            if (r10 == 0) goto L_0x004c
            java.lang.String r0 = ""
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            X.BBV r9 = r12.A00
            if (r9 == 0) goto L_0x005a
            boolean r0 = r12.A0C
            if (r0 != 0) goto L_0x005a
            r7 = 1
        L_0x005a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            if (r4 == 0) goto L_0x00dc
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x00dc
        L_0x006c:
            X.4DU r8 = r11.A03
            r7 = 1
            if (r10 == 0) goto L_0x007a
            java.lang.String r0 = ""
            boolean r0 = r10.equals(r0)
            r6 = 1
            if (r0 == 0) goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            if (r9 == 0) goto L_0x00c8
            boolean r0 = r12.A0C
            if (r0 != 0) goto L_0x00c8
        L_0x0081:
            X.0wc r1 = r5.A00
            java.lang.String r0 = "reel_viewer_dashboard_expand_feedback"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbW.A15(r5, r8)
            java.lang.String r0 = r2.getId()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "target_user_id"
            r5.A9F(r0, r1)
            X.C13989Tnp.A1I(r5, r2)
            X.1Xj r0 = r4.A0b
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = r0.A30()
            if (r0 == 0) goto L_0x00d7
            X.G9t.A1J(r5, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "has_reaction"
            r5.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "has_reply"
            r5.A7p(r0, r1)
            r5.Cgf()
            int r0 = r2.BIW()
            if (r0 != r3) goto L_0x00ca
            r11.DRv(r12, r4, r2)
        L_0x00c7:
            return
        L_0x00c8:
            r7 = 0
            goto L_0x0081
        L_0x00ca:
            com.instagram.model.reels.Reel r0 = r12.A0J
            r0.getClass()
            boolean r0 = r0.A0b()
            r11.D8u(r12, r4, r2, r0)
            return
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00dc:
            int r0 = r2.BIW()
            X.FnN r1 = r11.A08
            if (r0 != r3) goto L_0x00e8
            r1.A03(r2)
            return
        L_0x00e8:
            java.lang.String r0 = r2.getId()
            r1.A05(r0)
            return
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19447WZv.DzU(X.Tzd):void");
    }

    public C19447WZv(AnonymousClass4DH r1, UserSession userSession, AnonymousClass4DU r3, C230222pE r4, AnonymousClass32A r5, F35 f35, C51031FnN fnN, ReelDashboardFragment reelDashboardFragment, ReelDashboardFragment reelDashboardFragment2, String str) {
        this.A02 = userSession;
        this.A01 = r1;
        this.A06 = r4;
        this.A05 = reelDashboardFragment;
        this.A07 = r5;
        this.A0A = str;
        this.A03 = r3;
        this.A09 = reelDashboardFragment2;
        this.A04 = f35;
        this.A08 = fnN;
    }
}
