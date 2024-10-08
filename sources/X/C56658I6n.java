package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.I6n  reason: case insensitive filesystem */
public final class C56658I6n {
    public static final void A03(AnonymousClass0iw r5, UserSession userSession) {
        C57463Ib7 ib7;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, r5);
        if (!GBU.A08) {
            C55261Heq.A00(r5, userSession).A01.clear();
            C56132HtK htK = GBU.A05;
            if (htK != null) {
                htK.A00();
            }
            C56132HtK htK2 = GBU.A05;
            if (htK2 != null) {
                htK2.A04.clear();
                htK2.A02 = null;
                htK2.A01 = -1;
                1wS.A01(htK2.A03).A0C(htK2.A00);
            }
            GBU.A05 = null;
            GBU.A03 = 0;
            C55759Hmu hmu = GBU.A04;
            if (hmu != null) {
                hmu.A02.clear();
                hmu.A00 = 0;
            }
            GBU.A04 = null;
            GBU.A09 = false;
            GBU.A0A = false;
            return;
        }
        C56132HtK htK3 = GBU.A05;
        if (htK3 != null && (ib7 = htK3.A02) != null) {
            C14044Tol tol = ib7.A01;
            if (tol != null) {
                tol.A0A("user_paused_video");
            }
            C57463Ib7.A01(ib7, A1U);
        }
    }

    private final void A05(AnonymousClass0iw r12, UserSession userSession, LinkedHashMap linkedHashMap, boolean z) {
        AnonymousClass0iw r6 = r12;
        UserSession userSession2 = userSession;
        C55793HnS A00 = C55261Heq.A00(r12, userSession);
        JSONArray jSONArray = new JSONArray();
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Object A0a = AnonymousClass7TF.A0a(it);
            if (!A00.A01.containsKey(A0a)) {
                jSONArray.put(A0a);
            }
        }
        boolean z2 = z;
        if (z) {
            C56132HtK htK = GBU.A05;
            if (htK == null) {
                GBU.A05 = new C56132HtK(userSession);
            } else {
                htK.A04.clear();
                htK.A02 = null;
                htK.A01 = -1;
            }
        }
        if (jSONArray.length() != 0 || !z) {
            AnonymousClass1O8 r2 = new AnonymousClass1O8();
            1OC A03 = AnonymousClass93V.A03(r2.A00, userSession, jSONArray.toString());
            A03.A00 = new NM7(2, r6, userSession2, linkedHashMap2, A00, z2);
            GBU.A0C.add(r2);
            1ES.A05(A03, 1368380687, 2, true, false);
            return;
        }
        A04(r12, userSession, linkedHashMap);
    }

    public final void A06(Activity activity, AnonymousClass0iw r18, UserSession userSession, C54583HJs hJs, List list) {
        C55674HlX hlX;
        ExtendedImageUrl extendedImageUrl;
        User CCd;
        AnonymousClass0iw r8 = r18;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1Q(userSession2, r8);
        Activity activity2 = activity;
        0qQ.A0B(activity2, 4);
        C54583HJs hJs2 = hJs;
        List list2 = list;
        if (GBU.A08) {
            int i = GBU.A03 - 4;
            if (i < 0) {
                i = 0;
            }
            GBU.A03 = i;
            C56132HtK htK = GBU.A05;
            if (htK != null) {
                htK.A04.clear();
                htK.A02 = null;
            }
            int i2 = 0;
            do {
                LinkedList linkedList = hJs2.A01;
                C57457Ib1 ib1 = (C57457Ib1) linkedList.removeFirst();
                linkedList.add(ib1);
                0qQ.A0A(ib1);
                if (ib1.A01.getText().toString().length() == 0 && (CCd = ((AnonymousClass3UK) list2.get(GBU.A03)).CCd()) != null) {
                    A01(activity2, r8, userSession2, CCd, ib1, i2, GBU.A03, false, false);
                }
                C55793HnS A00 = C55261Heq.A00(r8, userSession2);
                String Bkl = ((AnonymousClass3UK) list2.get(GBU.A03)).Bkl();
                if (Bkl != null) {
                    IgImageView igImageView = ib1.A06;
                    if (!(igImageView.A0C != null || (hlX = (C55674HlX) A00.A01.get(Bkl)) == null || (extendedImageUrl = hlX.A00) == null)) {
                        igImageView.setUrl(extendedImageUrl, r8);
                    }
                    C55674HlX hlX2 = (C55674HlX) A00.A01.get(Bkl);
                    if (hlX2 != null) {
                        C57463Ib7 ib7 = new C57463Ib7(r8, userSession2, hlX2.A01, ib1);
                        ib7.A04(false);
                        C56132HtK htK2 = GBU.A05;
                        if (htK2 != null) {
                            ib7.A03 = htK2;
                            htK2.A04.add(ib7);
                        }
                    }
                }
                GBU.A03++;
                i2++;
            } while (i2 < 4);
            C56132HtK htK3 = GBU.A05;
            if (htK3 != null) {
                int i3 = htK3.A01;
                for (int i4 = -1; i4 < i3; i4++) {
                    LinkedList linkedList2 = htK3.A04;
                    C57463Ib7 ib72 = (C57463Ib7) linkedList2.removeFirst();
                    htK3.A02 = ib72;
                    if (ib72 != null) {
                        linkedList2.add(ib72);
                    }
                }
                htK3.A01();
            }
            GBU.A08 = false;
        } else {
            A02(activity2, r8, userSession2, this, hJs2, list2, true);
        }
        View view = hJs2.A00.A04;
        if (view != null) {
            AnonymousClass0fU.A00(new ICR(5, activity2, r8, userSession2, hJs2, list2), view);
        }
    }

    public static final void A00() {
        if (GBU.A07 && GBU.A06) {
            C56132HtK htK = GBU.A05;
            if (htK != null) {
                htK.A02();
            }
            GBU.A07 = false;
            GBU.A06 = false;
            GBU.A0A = true;
        }
    }

    public static final void A01(Activity activity, AnonymousClass0iw r11, UserSession userSession, User user, C57457Ib1 ib1, int i, int i2, boolean z, boolean z2) {
        AnonymousClass0iw r7 = r11;
        UserSession userSession2 = userSession;
        if (GBU.A04 == null) {
            GBU.A04 = new C55759Hmu(r11, userSession);
        }
        User user2 = user;
        int i3 = 8;
        ib1.A03.setVisibility(DbW.A01(user.isVerified() ? 1 : 0));
        DbU.A1H(ib1.A01, user);
        DbU.A1S(r11, ib1.A05, user);
        IgView igView = ib1.A04;
        igView.setAlpha(51.0f);
        if (182.A06(0Tu.A06, userSession, 36319480405695931L)) {
            i3 = 0;
        }
        igView.setVisibility(i3);
        Activity activity2 = activity;
        int i4 = i2;
        ICQ icq = new ICQ(activity2, r7, userSession2, user2, i4, 6);
        View view = ib1.A00;
        AnonymousClass0fU.A00(icq, view);
        DbY.A1O(user);
        FollowButton followButton = ib1.A08;
        DbU.A11(followButton.getContext(), followButton, R.color.grey_7_75_transparent);
        followButton.A07 = true;
        C267064at r1 = followButton.A0J;
        r1.A07(new HGJ(i4));
        r1.A03(r7, userSession2, user);
        IgImageView igImageView = ib1.A06;
        AnonymousClass3O0 r12 = new AnonymousClass3O0();
        r12.A03(new AnonymousClass3O3().A01());
        igImageView.setImageDrawable(r12);
        r12.A02();
        int i5 = i;
        if (z2) {
            view.setVisibility(4);
            new AnonymousClass6O3(view, (AnonymousClass6O2) null, new AnonymousClass6O9(userSession2, i5), (long) ((i * 100) + 150)).A00();
        } else {
            view.setVisibility(0);
            if (z) {
                C294975nL A01 = C294975nL.A01(view, 0);
                A01.A0G();
                C294975nL A0E = A01.A0E(C71392co.A03(0.5d, 0.5d));
                A0E.A0U(0.95f, 1.0f, -1.0f);
                A0E.A0V(0.95f, 1.0f, -1.0f);
                A0E.A05 = new IZR(i, 2, userSession2);
                A0E.A0H();
            }
        }
        C55759Hmu hmu = GBU.A04;
        if (hmu != null) {
            String id = user2.getId();
            if (hmu.A02.add(id)) {
                DbZ.A0H(hmu.A01, "suggested_creator_impression", id, i4).Cgf();
            }
        }
    }

    public static final void A02(Activity activity, AnonymousClass0iw r17, UserSession userSession, C56658I6n i6n, C54583HJs hJs, List list, boolean z) {
        int i;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        List list2 = list;
        int size = (GBU.A03 + 4) % (list2.size() - 1);
        while (true) {
            AnonymousClass0iw r8 = r17;
            UserSession userSession2 = userSession;
            if (A1H.size() < 4) {
                LinkedList linkedList = hJs.A01;
                C57457Ib1 ib1 = (C57457Ib1) linkedList.removeFirst();
                linkedList.add(ib1);
                0qQ.A0A(ib1);
                AnonymousClass3UK r0 = (AnonymousClass3UK) list2.get(GBU.A03);
                User CCd = r0.CCd();
                if (CCd != null) {
                    int size2 = A1H.size();
                    int i2 = GBU.A03;
                    Activity activity2 = activity;
                    A01(activity2, r8, userSession2, CCd, ib1, size2, i2, !z, z);
                }
                String Bkl = r0.Bkl();
                if (Bkl != null) {
                    A1H.put(Bkl, ib1);
                }
                String Bkl2 = ((AnonymousClass3UK) list2.get(size)).Bkl();
                if (Bkl2 != null) {
                    A1H2.put(Bkl2, ib1);
                }
                if (GBU.A03 == DbT.A02(list2, 1)) {
                    i = 0;
                } else {
                    i = GBU.A03 + 1;
                }
                GBU.A03 = i;
                int i3 = size;
                size++;
                if (i3 == DbT.A02(list2, 1)) {
                    size = 0;
                }
            } else {
                C56658I6n i6n2 = i6n;
                i6n2.A05(r8, userSession2, A1H, true);
                i6n2.A05(r8, userSession2, A1H2, false);
                return;
            }
        }
    }

    public static final void A04(AnonymousClass0iw r8, UserSession userSession, LinkedHashMap linkedHashMap) {
        ExtendedImageUrl extendedImageUrl;
        C55793HnS A00 = C55261Heq.A00(r8, userSession);
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Object A0a = AnonymousClass7TF.A0a(it);
            C57457Ib1 ib1 = (C57457Ib1) linkedHashMap.get(A0a);
            if (ib1 != null) {
                HashMap hashMap = A00.A01;
                C55674HlX hlX = (C55674HlX) hashMap.get(A0a);
                if (!(hlX == null || (extendedImageUrl = hlX.A00) == null)) {
                    ib1.A06.setUrl(extendedImageUrl, r8);
                }
                C55674HlX hlX2 = (C55674HlX) hashMap.get(A0a);
                if (hlX2 != null) {
                    C54506HGs hGs = hlX2.A01;
                    ib1.A07.setVideoSource(hGs.A00, r8);
                    C57463Ib7 ib7 = new C57463Ib7(r8, userSession, hGs, ib1);
                    ib7.A04(false);
                    C56132HtK htK = GBU.A05;
                    if (htK != null) {
                        ib7.A03 = htK;
                        htK.A04.add(ib7);
                    }
                }
            }
        }
        if (C55262Her.A00(userSession).booleanValue()) {
            GBU.A06 = true;
            A00();
            return;
        }
        C56132HtK htK2 = GBU.A05;
        if (htK2 != null) {
            htK2.A02();
        }
        GBU.A0A = true;
    }
}
