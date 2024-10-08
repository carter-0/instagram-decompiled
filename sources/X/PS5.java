package X;

import android.net.Uri;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PS5 implements 1aV {
    public final /* synthetic */ C70715OHk A00;

    public PS5(C70715OHk oHk) {
        this.A00 = oHk;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.0rk] */
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        boolean z;
        String str2;
        ReboundViewPager reboundViewPager;
        View.OnLayoutChangeListener onLayoutChangeListener;
        Long l;
        Object obj2;
        C61066Jw4 jw4 = (C61066Jw4) obj;
        C70715OHk oHk = this.A00;
        oHk.A03 = false;
        if (!jw4.A01) {
            List A002 = C73429PcU.A00((Iterable) jw4.A00, 15);
            oHk.A02 = jw4.A02;
            if (AnonymousClass7TE.A1b(A002)) {
                AnonymousClass7H6 r5 = oHk.A05.A00;
                if (r5.A0l) {
                    AnonymousClass77B A05 = AnonymousClass7H6.A05(r5);
                    if (A05 != null) {
                        str = A05.A0S;
                    } else {
                        str = null;
                    }
                    ? obj3 = new Object();
                    obj3.A00 = -1;
                    AnonymousClass77B A052 = AnonymousClass7H6.A05(r5);
                    if (A052 != null) {
                        z = A052.A0m;
                    } else {
                        z = false;
                    }
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    int size = A002.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            str2 = "viewPager";
                            if (AnonymousClass7H6.A0f(r5)) {
                                NR3 nr3 = r5.A0H;
                                if (nr3 != null) {
                                    nr3.A01 = AnonymousClass7H6.A09(r5.A0S);
                                    if (obj3.A00 >= 0) {
                                        reboundViewPager = r5.A0C;
                                        if (reboundViewPager != null) {
                                            if (!reboundViewPager.isLaidOut() || reboundViewPager.isLayoutRequested()) {
                                                onLayoutChangeListener = new C71415OkE(2, A1C, r5, obj3);
                                            } else {
                                                NR3 nr32 = r5.A0H;
                                                if (nr32 != null) {
                                                    nr32.A00 = obj3.A00;
                                                    nr32.A05 = true;
                                                    List list = nr32.A0D;
                                                    list.clear();
                                                    list.addAll(A1C);
                                                    ReboundViewPager reboundViewPager2 = r5.A0C;
                                                    if (reboundViewPager2 != null) {
                                                        float f = (float) obj3.A00;
                                                        reboundViewPager2.A02 = reboundViewPager2.A01;
                                                        reboundViewPager2.A0J(f, true, false);
                                                        reboundViewPager2.A02 = -1.0f;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        NR3 nr33 = r5.A0H;
                                        if (nr33 != null) {
                                            List list2 = nr33.A0D;
                                            list2.clear();
                                            list2.addAll(A1C);
                                            nr33.Cs4();
                                        }
                                    }
                                }
                                0qQ.A0F("pagerAdapter");
                            } else {
                                int i2 = obj3.A00;
                                ReboundViewPager reboundViewPager3 = r5.A0C;
                                if (reboundViewPager3 != null) {
                                    int currentDataIndex = reboundViewPager3.getCurrentDataIndex();
                                    NR3 nr34 = r5.A0H;
                                    if (i2 != currentDataIndex) {
                                        if (nr34 != null) {
                                            List list3 = nr34.A0D;
                                            list3.clear();
                                            list3.addAll(A1C);
                                            nr34.Cs4();
                                            NR3 nr35 = r5.A0H;
                                            if (nr35 != null) {
                                                nr35.A01 = AnonymousClass7H6.A09(r5.A0S);
                                                reboundViewPager = r5.A0C;
                                                if (reboundViewPager != null) {
                                                    if (!reboundViewPager.isLaidOut() || reboundViewPager.isLayoutRequested()) {
                                                        onLayoutChangeListener = new C71414OkD(1, r5, obj3);
                                                    } else {
                                                        ReboundViewPager reboundViewPager4 = r5.A0C;
                                                        if (reboundViewPager4 != null) {
                                                            reboundViewPager4.A0G((float) obj3.A00);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        0qQ.A0F("pagerAdapter");
                                    } else {
                                        if (nr34 != null) {
                                            ReboundViewPager reboundViewPager5 = r5.A0C;
                                            if (reboundViewPager5 != null) {
                                                nr34.A00 = reboundViewPager5.getCurrentDataIndex();
                                                nr34.A05 = true;
                                                NR3 nr36 = r5.A0H;
                                                if (nr36 != null) {
                                                    List list4 = nr36.A0D;
                                                    list4.clear();
                                                    list4.addAll(A1C);
                                                    nr36.Cs4();
                                                    NR3 nr37 = r5.A0H;
                                                    if (nr37 != null) {
                                                        nr37.A01 = AnonymousClass7H6.A09(r5.A0S);
                                                    }
                                                }
                                            }
                                        }
                                        0qQ.A0F("pagerAdapter");
                                    }
                                }
                            }
                            reboundViewPager.addOnLayoutChangeListener(onLayoutChangeListener);
                        } else {
                            C3262876d r11 = r5.A0F;
                            if (r11 == null) {
                                str2 = "viewModelFactory";
                                break;
                            }
                            UserSession userSession = r5.A0w;
                            C71039Oa5 oa5 = (C71039Oa5) A002.get(i);
                            AnonymousClass77B A053 = AnonymousClass7H6.A05(r5);
                            if (A053 != null) {
                                l = A053.A0K;
                            } else {
                                l = null;
                            }
                            AnonymousClass77B A03 = r11.A03(userSession, oa5, r5.A0S, l, ((C71039Oa5) A002.get(i)).A05(), (String) null, z);
                            AnonymousClass7H6.A0Q(r5, A03);
                            if (r5.A0V == AnonymousClass05K.A01 && !A03.A0l) {
                                Iterator it = r5.A1A.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    AnonymousClass77B r12 = (AnonymousClass77B) obj2;
                                    if (r12.A0l && 0qQ.A0K(r12.A0S, A03.A0S)) {
                                        break;
                                    }
                                }
                                AnonymousClass77B r112 = (AnonymousClass77B) obj2;
                                if (r112 != null) {
                                    boolean z2 = r112.A0l;
                                    String str3 = r112.A0R;
                                    String str4 = r112.A0O;
                                    UserSession userSession2 = A03.A0D;
                                    boolean z3 = A03.A0s;
                                    float f2 = A03.A02;
                                    1aU r71 = A03.A09;
                                    1aU r70 = A03.A0B;
                                    1aU r18 = A03.A0A;
                                    1aU r19 = A03.A0C;
                                    String str5 = A03.A0U;
                                    String str6 = A03.A0T;
                                    2FW r26 = A03.A0G;
                                    1iA r28 = A03.A0I;
                                    int i3 = A03.A03;
                                    int i4 = A03.A05;
                                    int i5 = A03.A06;
                                    C300925yB r25 = A03.A0F;
                                    1Xj r24 = A03.A0E;
                                    String str7 = A03.A0S;
                                    String str8 = A03.A0N;
                                    boolean z4 = A03.A0m;
                                    boolean z5 = A03.A0q;
                                    boolean z6 = A03.A0i;
                                    boolean z7 = A03.A0d;
                                    1aU r20 = A03.A08;
                                    List list5 = A03.A0b;
                                    boolean z8 = A03.A0j;
                                    Long l2 = A03.A0K;
                                    Boolean bool = A03.A0J;
                                    Long l3 = A03.A0L;
                                    PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = A03.A01;
                                    boolean z9 = A03.A0g;
                                    Long l4 = A03.A0M;
                                    AnonymousClass79H r22 = A03.A00;
                                    boolean z10 = A03.A0p;
                                    Uri uri = A03.A07;
                                    String str9 = A03.A0Y;
                                    boolean z11 = A03.A0k;
                                    C254793t3 r27 = A03.A0H;
                                    boolean z12 = A03.A0o;
                                    boolean z13 = A03.A0c;
                                    Uri uri2 = uri;
                                    1aU r16 = r71;
                                    1aU r17 = r70;
                                    A03 = new AnonymousClass77B(uri2, r16, r17, r18, r19, r20, userSession2, r22, privacyMediaOverlayViewModel, r24, r25, r26, r27, r28, bool, l2, l3, l4, str5, str6, str7, str8, (String) null, (String) null, str9, str3, str4, A03.A0V, A03.A0X, (String) null, A03.A0W, list5, f2, i3, i4, i5, 0, z3, false, z4, z5, z6, z7, false, z8, z9, z10, z2, z11, z12, z13, A03.A0e, A03.A0f, A03.A0r);
                                }
                            }
                            A1C.add(A03);
                            String str10 = A03.A0S;
                            if (str10 != null && str10.equals(str)) {
                                obj3.A00 = i;
                            }
                            i++;
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            int size2 = A002.size();
            C254743sy r3 = oHk.A00;
            if (r3 != null && !oHk.A01 && !oHk.A03 && oHk.A02 && size2 < 5) {
                oHk.A03 = true;
                oHk.A01 = true;
                oHk.A06.A0B(r3, Integer.valueOf(5 - size2));
            }
        }
    }
}
