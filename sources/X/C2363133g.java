package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.33g  reason: invalid class name and case insensitive filesystem */
public final class C2363133g implements C2363233h, C2363333i {
    public final Fragment A00;
    public final 0hq A01;
    public final UserSession A02;
    public final AnonymousClass311 A03;
    public final AnonymousClass4DU A04;
    public final C231332rR A05;
    public final C2363033f A06;
    public final C234172xD A07;
    public final C249763kK A08;

    public final void DkW(1Xj r4, AnonymousClass3W1 r5, String str, boolean z, boolean z2) {
        0qQ.A0B(r5, 1);
        C234172xD r0 = this.A07;
        if (r0 != null) {
            r0.A06.remove(r4);
        }
        AnonymousClass3WA r02 = AnonymousClass3WA.A0F;
        0qQ.A0B(r02, 0);
        r5.A0m = r02;
        UserSession userSession = this.A02;
        1sd.A00(userSession).A02(r4, false);
        1sd.A00(userSession).A01(r4, 22);
        AnonymousClass1Nd.A00(userSession).A00(new C45961DGq(r4));
        this.A05.Cs9(r4);
    }

    public final void E0t(Integer num) {
        0qQ.A0B(num, 0);
        C56313HwQ.A01(this.A00.requireActivity(), this.A02, num);
    }

    public final void EuJ(1Xj r10, AnonymousClass3W1 r11) {
        AnonymousClass3W1 r7 = r11;
        0qQ.A0B(r11, 1);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            UserSession userSession = this.A02;
            1Xj r6 = r10;
            User A2A = r10.A2A(userSession);
            if (A2A != null) {
                AnonymousClass4DU r3 = this.A04;
                C49175Eqg.A00(r3, userSession, A2A);
                if (A2A.A0N() == AnonymousClass05K.A0C) {
                    0wc A022 = AnonymousClass0kN.A02(userSession);
                    1Ln r2 = new 1Ln(A022.A00(A022.A00, "unfollow_dialog_impresssion"), 382);
                    r2.A0R("target_id", A2A.getId());
                    r2.A0n(1Rm.A00().A00);
                    r2.Cgf();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(activity.getString(2131975862, new Object[]{A2A.getUsername()}));
                    C358248ab r1 = new C358248ab((Activity) activity);
                    r1.A0n(A2A.Bh3(), r3);
                    FH6.A0C(spannableStringBuilder);
                    r1.A0q(spannableStringBuilder);
                    r1.A0I(new C49994FId(activity, this, r6, r7, A2A), 2131975854);
                    r1.A0C(new FI5(this, A2A));
                    r1.A0B(new FHV(this, A2A));
                    AnonymousClass0fN.A00(r1.A02());
                    return;
                }
                A00(activity, this, r10, r11);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void Ev8(1Xj r11, AnonymousClass3W1 r12, C16677UzD uzD, String str) {
        0qQ.A0B(uzD, 3);
        C2363033f r1 = this.A06;
        r1.A02(r11, uzD, new HH1(r1, r11, (C53157GjT) null, (JOG) null, r12), str, (String) null);
    }

    public final void EvA(1Xj r11, C53157GjT gjT, AnonymousClass3W1 r13, C16677UzD uzD, String str) {
        0qQ.A0B(r13, 1);
        0qQ.A0B(uzD, 3);
        C2363033f r1 = this.A06;
        r1.A02(r11, uzD, new HH1(r1, r11, gjT, (JOG) null, r13), str, "feed_hide");
    }

    public final void FIU(DHK dhk, C57247IUi iUi) {
        0qQ.A0B(iUi, 1);
        UserSession userSession = this.A02;
        C54998HaV.A00(C56923IHs.A00, new C56929IHy(this, iUi), userSession, true);
    }

    public final void FIV(C274594oe r14, AnonymousClass5O4 r15) {
        C299435v9 gXx;
        String str;
        String str2;
        Integer valueOf;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        List list = r14.A09;
        int size = list.size();
        int i = r15.A01;
        1Xj r4 = (1Xj) 00k.A0O(list, i);
        1UQ B5J = r14.B5J();
        1UQ r0 = 1UQ.A0z;
        UserSession userSession = this.A02;
        AnonymousClass4DU r1 = this.A04;
        if (B5J == r0) {
            gXx = new C299425v8(r1, userSession);
        } else {
            gXx = new C52572GXx(r1, userSession, 0oI.A0A(this.A00.requireContext()));
        }
        C299435v9 r5 = gXx;
        if (r4 != null) {
            str = r4.getId();
        } else {
            str = null;
        }
        String str3 = r14.A06;
        if (r4 != null) {
            str2 = r4.A0C.getLoggingInfoToken();
        } else {
            str2 = null;
        }
        String str4 = r14.A07;
        if (i >= size) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        r5.Cl4(valueOf, str, str3, str2, str4, C292845jc.A00(r14.A04), size);
        r15.EZ9(C266954ac.NONE);
        this.A05.Cs9((1Xj) null);
    }

    public C2363133g(Fragment fragment, 0hq r3, UserSession userSession, AnonymousClass311 r5, C2363033f r6, AnonymousClass4DU r7, C234172xD r8, C231332rR r9, C249763kK r10) {
        0qQ.A0B(r6, 8);
        0qQ.A0B(r10, 9);
        this.A03 = r5;
        this.A02 = userSession;
        this.A04 = r7;
        this.A00 = fragment;
        this.A01 = r3;
        this.A07 = r8;
        this.A05 = r9;
        this.A06 = r6;
        this.A08 = r10;
    }

    public static final void A00(Activity activity, C2363133g r9, 1Xj r10, AnonymousClass3W1 r11) {
        UserSession userSession = r9.A02;
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A("feed/hide_feed_post/");
        1Xj r5 = r10;
        r2.A9m("m_pk", r10.getId());
        User A2A = r10.A2A(userSession);
        if (A2A != null) {
            r2.A9m("a_pk", A2A.getId());
            r2.A0Q(1XP.class, 1XY.class);
            1ES.A03(r2.A0M());
            AnonymousClass3W1 r6 = r11;
            H4L h4l = new H4L(r9, r10, r11);
            0xF A002 = C18766W0k.A00(r10.A0C.B6n());
            int i = r11.A0W;
            if (i >= 0) {
                0xF.A00(A002, Integer.valueOf(i), "recs_ix");
            }
            User A2A2 = r10.A2A(userSession);
            if (A2A2 != null) {
                FH6.A00(activity, A002, h4l, userSession, r5, r6, A2A2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void Cfd(1Xj r4, String str) {
        C56313HwQ.A00(this.A00.requireActivity(), this.A02, r4, str, "feed");
    }

    public final void D9O(1Xj r4) {
        if (r4 != null) {
            C231332rR r2 = this.A05;
            r2.BQr(r4).A3C = false;
            r2.BQr(r4).A3B = false;
            r2.BQr(r4).A39 = false;
            r2.AV9();
        }
    }

    public final void D9c(1Xj r3) {
        C234172xD r0 = this.A07;
        if (r0 != null) {
            r0.A06.remove(r3);
        }
        1sd.A00(this.A02).A02(r3, true);
    }

    public final void DNC(1Xj r10, AnonymousClass3W1 r11) {
        UserSession userSession = this.A02;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
        Context requireContext = this.A00.requireContext();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        new BitSet(0);
        C46649DiU A062 = C46649DiU.A06(AnonymousClass000.A00(1186), C359608dC.A01(hashMap), hashMap2);
        A062.A00 = -1;
        A062.A05 = null;
        A062.A01 = 0;
        A062.A06 = null;
        A062.A03 = null;
        A062.A02 = null;
        A062.A04 = null;
        A062.A0H(hashMap3);
        A062.A0E(requireContext, igBloksScreenConfig);
        new C234012wq(userSession).A00();
    }

    public final void Ds5(1UQ r14, 1Xj r15, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str7 = str3;
        String str8 = str;
        0qQ.A0B(str8, 1);
        if (!(!AnonymousClass06S.A01(this.A01))) {
            int ordinal = r14.ordinal();
            String A002 = AnonymousClass000.A00(3341);
            String str9 = str2;
            if (ordinal == 1) {
                int i3 = i;
                if (str3 == null) {
                    C309516Yo r2 = new C309516Yo(this.A00.requireActivity(), this.A02);
                    IgFragmentFactoryImpl.A00();
                    Bundle bundle = new Bundle();
                    bundle.putString(Pxd.A00(347), str5);
                    bundle.putString(Pxd.A00(124), str8);
                    bundle.putString(Pxd.A00(125), str9);
                    bundle.putString(Pxd.A00(350), "hide_button");
                    bundle.putInt(Pxd.A00(349), i3);
                    R8V r8v = new R8V();
                    r8v.setArguments(bundle);
                    r2.A0D(r8v);
                    r2.A04();
                }
                if (r15 != null && r15.CcK()) {
                    UserSession userSession = this.A02;
                    AnonymousClass4DU r0 = this.A04;
                    if (str3 != null) {
                        0wc A012 = AnonymousClass0kN.A01(r0, userSession);
                        0Aj A003 = A012.A00(A012.A00, AnonymousClass000.A00(1075));
                        if (A003.isSampled()) {
                            A003.A8M(HON.WHY_HIDE_AD_SURVEY_SUBMIT, "event_type");
                            String C9L = r15.C9L();
                            if (C9L == null) {
                                C9L = "";
                            }
                            A003.AAJ("ad_client_token", C9L);
                            A003.AAJ("reason", str7);
                            A003.Cgf();
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                UserSession userSession2 = this.A02;
                AnonymousClass4DU r6 = this.A04;
                if (str3 == null) {
                    str7 = A002;
                }
                C233822wX.A0T(userSession2, r6, Boolean.valueOf(z2), str8, str9, str7, "hide_button", i3);
            } else if (ordinal == 16) {
                if (str3 == null) {
                    C309516Yo r22 = new C309516Yo(this.A00.requireActivity(), this.A02);
                    r22.A08();
                    IgFragmentFactoryImpl.A00();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(Pxd.A00(124), str8);
                    bundle2.putString(Pxd.A00(125), str9);
                    bundle2.putBoolean(Pxd.A00(348), true);
                    R8V r8v2 = new R8V();
                    r8v2.setArguments(bundle2);
                    r22.A0D(r8v2);
                    r22.A04();
                }
                UserSession userSession3 = this.A02;
                if (str3 == null) {
                    str7 = A002;
                }
                C55002HaZ.A00(userSession3, this.A04, str8, str7, str9);
            }
        }
    }

    public final void E12(1Xj r3, C53157GjT gjT, AnonymousClass3W1 r5) {
        this.A06.A01(r3, (JOG) null, r5);
    }

    public final void EuH(1Xj r3, AnonymousClass3W1 r4) {
        this.A06.A00(r3, (JOG) null);
    }

    public final void Eul(1Xj r9, AnonymousClass3W1 r10, String str) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A02;
        String moduleName = this.A04.getModuleName();
        HashMap hashMap = new HashMap();
        hashMap.put("event_source", str);
        String id = r9.getId();
        if (id != null) {
            hashMap.put("media_id", AnonymousClass3VO.A02(id));
            String id2 = r9.getId();
            if (id2 != null) {
                hashMap.put("author_id", AnonymousClass3VO.A03(id2));
                hashMap.put("inventory_source", r9.A0C.BIl());
                hashMap.put("ranking_session_id", r9.A0C.getLoggingInfoToken());
                hashMap.put("client_position", String.valueOf(r10.getPosition()));
                hashMap.put("feed_recs_post_position", String.valueOf(r10.A0W));
                if (moduleName != null) {
                    hashMap.put("container_module", moduleName);
                }
                C46649DiU A042 = C46649DiU.A04(AnonymousClass000.A00(2889), hashMap);
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) userSession);
                igBloksScreenConfig.A0U = requireActivity.getString(2131965837);
                igBloksScreenConfig.A0l = true;
                A042.A0D(requireActivity, igBloksScreenConfig);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
