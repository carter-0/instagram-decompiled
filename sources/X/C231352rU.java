package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2rU  reason: invalid class name and case insensitive filesystem */
public final class C231352rU extends AnonymousClass2rV {
    public 1Xg A00;
    public String A01;
    public boolean A02;
    public final Object A03 = new Object();

    public final void A0F(C228392lb r12, String str, List list, boolean z) {
        List<Object> list2;
        0qQ.A0B(list, 0);
        0qQ.A0B(r12, 1);
        synchronized (this.A03) {
            if (str != null) {
                if (str.length() != 0) {
                    this.A01 = str;
                }
            }
            if (list.isEmpty()) {
                list2 = new ArrayList<>();
            } else {
                list2 = 0u4.A01(list);
            }
            if (str == null) {
                str = "";
            }
            if (((C242603Vd) C242603Vd.A01.get(str)) != null) {
                0wb.A03("MainFeedItemList", "pagination source exists when FeedItemGroupSet doesn't. Potentially delivering feed recs above EOF.");
            }
            int size = list2.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    1Xg r2 = (1Xg) list2.get(size);
                    if (1UQ.A0O != r2.A06) {
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } else {
                        AnonymousClass1Xn r7 = r2.A05;
                        0qQ.A0C(r7, "null cannot be cast to non-null type com.instagram.feed.feeditem.FeedItemGroupSet");
                        AnonymousClass4ZI r10 = (AnonymousClass4ZI) r7;
                        String str2 = ((C272714lF) r10.A00).A06;
                        if (str2 != null) {
                            HashMap hashMap = new HashMap();
                            for (AnonymousClass4ZJ r1 : r10.A01()) {
                                String str3 = r1.A03;
                                if (str3 != null) {
                                    hashMap.put(str3, r1);
                                }
                            }
                            String str4 = r10.A01;
                            if (str4 == null) {
                                str4 = "";
                            }
                            AnonymousClass4ZJ r0 = (AnonymousClass4ZJ) hashMap.get(str4);
                            if (r0 != null) {
                                this.A01 = r0.A01;
                            }
                        }
                        0qQ.A0C(r7, "null cannot be cast to non-null type com.instagram.feed.feeditem.FeedItemGroupSet");
                        Map map = r12.A08;
                        if (((C2804151s) map.get(str2)) == null) {
                            C2804151s r02 = new C2804151s();
                            if (str2 == null) {
                                str2 = "";
                            }
                            map.put(str2, r02);
                        }
                    }
                }
            }
            int size2 = list2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                1Xg r22 = (1Xg) list2.get(i2);
                if (r22.A06 == 1UQ.A0F) {
                    1sU r13 = r22.A05;
                    0qQ.A0C(r13, "null cannot be cast to non-null type com.instagram.feed.feeditem.EndOfFeedDemarcatorUnit");
                    1UQ r14 = r13.A00;
                    if (r14 == null) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (i3 >= list2.size() || ((1Xg) list2.get(i3)).A06 != r14) {
                        C48095EVn eVn = (C48095EVn) C48095EVn.A01.get(r14);
                        if (eVn == null) {
                            break;
                        }
                        C50437Fbk fbk = new C50437Fbk(eVn);
                        1Xg r03 = new 1Xg(fbk, 1UQ.A0X, fbk.getId());
                        this.A00 = r03;
                        list2.add(i3, r03);
                    } else {
                        1Xg r23 = (1Xg) list2.get(i3);
                        if (r23.A06 == 1UQ.A0C) {
                            AnonymousClass1Xn r15 = r23.A05;
                            0qQ.A0C(r15, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
                            r12.A01((AnonymousClass3Y6) r15).A04 = true;
                        }
                    }
                }
                i2++;
            }
            for (Object A012 : list2) {
                AnonymousClass2rW.A01(this, A012, this.A02.size(), z);
            }
        }
    }

    public final void A04() {
        synchronized (this.A03) {
            this.A00 = null;
            this.A01 = null;
            super.A04();
        }
    }

    public C231352rU(UserSession userSession) {
        super(userSession);
    }
}
