package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LPm  reason: case insensitive filesystem */
public abstract class C64137LPm {
    public static final void A00(Context context, Fragment fragment, UserSession userSession, FilmstripTimelineView filmstripTimelineView, LA8 la8, String str, int i, int i2, int i3) {
        UserSession userSession2 = userSession;
        FilmstripTimelineView filmstripTimelineView2 = filmstripTimelineView;
        C51972G9s.A1B(userSession, filmstripTimelineView2);
        ArrayList A1C = AnonymousClass7TE.A1C();
        LA8 la82 = la8;
        long j = la82.A03;
        String str2 = la82.A05;
        if (str2 != null) {
            A1C.add(new C63814L7u(j, str2, 100, la82.A04));
            A01(context, fragment, userSession2, filmstripTimelineView2, la82, str, A1C, i, i2, i3);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(Context context, Fragment fragment, UserSession userSession, FilmstripTimelineView filmstripTimelineView, LA8 la8, String str, List list, int i, int i2, int i3) {
        ArrayList arrayList;
        int i4;
        double d;
        int i5 = i;
        Fragment fragment2 = fragment;
        UserSession userSession2 = userSession;
        C51973G9u.A1E(context, userSession2, fragment2);
        List list2 = list;
        String str2 = str;
        if (list2.isEmpty()) {
            0wb.A03("BitmapTimelineHelper", 002.A0R("Bitmaps requested for empty video for surface: ", str2));
            return;
        }
        C3516889w A01 = JTS.A0N(fragment2).A01(str2);
        FilmstripTimelineView filmstripTimelineView2 = filmstripTimelineView;
        if (filmstripTimelineView != null) {
            11Z.A02(new M9D(fragment2, filmstripTimelineView2, A01));
        }
        LA8 la82 = la8;
        if (i <= 0) {
            i5 = 10;
            try {
                0kD.A07("ClipsFilmstripFrameTimesCalculator", "requested thumbnails are less than zero", (Throwable) null);
            } catch (Throwable th) {
                arrayList = JTO.A1B(th);
            }
        }
        LA8 la83 = la82;
        int i6 = la83.A02;
        int i7 = la83.A01 - i6;
        long j = (long) (i7 / i5);
        arrayList = AnonymousClass7TE.A1C();
        int size = list2.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C63714L3y());
        }
        if (list2.size() > i5) {
            int i9 = i6;
            int i10 = 0;
            for (int i11 = 0; i11 < i5; i11++) {
                int i12 = ((int) ((C63814L7u) list2.get(i10)).A01) + i6;
                while (i10 < C51966G9m.A06(list2) && i9 >= i12) {
                    i10++;
                    i6 = i12;
                    i12 = ((int) ((C63814L7u) list2.get(i10)).A01) + i12;
                }
                A02(((C63714L3y) arrayList.get(i10)).A01, list2, ((double) i9) - ((double) i6), i10);
                i9 += (int) j;
            }
            i4 = i5;
        } else {
            int size2 = list2.size();
            i4 = 0;
            for (int i13 = 0; i13 < size2; i13++) {
                int i14 = (int) ((C63814L7u) list2.get(i13)).A01;
                if (j == 0) {
                    d = (((double) i14) / ((double) Math.max(i14, i7))) * ((double) i5);
                } else {
                    d = ((double) i14) / ((double) j);
                }
                int A00 = AnonymousClass1GB.A00(d);
                if (A00 < 0) {
                    A00 = 0;
                } else if (A00 > i5) {
                    A00 = i5;
                }
                if (d < 1.0d || A00 == 0) {
                    double d2 = 0.0d + (((double) i14) / 2.0d);
                    C63714L3y l3y = (C63714L3y) arrayList.get(i13);
                    A02(l3y.A01, list2, d2, i13);
                    l3y.A00 = d;
                    i4++;
                } else {
                    double d3 = (double) A00;
                    double d4 = ((double) i14) / d3;
                    C63714L3y l3y2 = (C63714L3y) arrayList.get(i13);
                    l3y2.A01.ensureCapacity(A00);
                    for (int i15 = 0; i15 < A00; i15++) {
                        A02(l3y2.A01, list2, 0.0d + (((double) i15) * d4), i13);
                        l3y2.A00 = d / d3;
                        i4++;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C63714L3y l3y3 = (C63714L3y) it.next();
            l3y3.A00 = (l3y3.A00 * ((double) i4)) / ((double) i5);
        }
        Throwable A002 = 0eR.A00(arrayList);
        if (A002 == null) {
            List<C63714L3y> list3 = arrayList;
            ArrayList A1C = AnonymousClass7TE.A1C();
            int i16 = 0;
            for (C63714L3y l3y4 : list3) {
                ArrayList arrayList2 = l3y4.A01;
                i16 += arrayList2.size();
                int size3 = arrayList2.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    A1C.add(Double.valueOf(l3y4.A00));
                }
            }
            int i18 = A01.A00 + 1;
            A01.A00 = i18;
            double[] dArr = new double[A1C.size()];
            int size4 = A1C.size();
            for (int i19 = 0; i19 < size4; i19++) {
                dArr[i19] = JTO.A00(A1C.get(i19));
            }
            int i20 = i2;
            int i21 = i3;
            A01.A06.A0A(new C60999Juv(dArr, i16, i20, i21, false));
            int size5 = list3.size();
            int i22 = 0;
            for (int i23 = 0; i23 < size5; i23++) {
                C63714L3y l3y5 = (C63714L3y) list3.get(i23);
                if (DbT.A1b(l3y5.A01)) {
                    ArrayList arrayList3 = l3y5.A01;
                    C379229Ta A003 = JYZ.A00(userSession2);
                    C63891LAu lAu = new C63891LAu(context, userSession2, (C63814L7u) list2.get(i23), new C63936LDw(A01, str2, i18, i22, i20, i21), A003, la82, arrayList3);
                    C63814L7u l7u = lAu.A04;
                    if (l7u.A03 != null) {
                        0nY.A00().ATE(new C61707KIx(lAu, i20, i21));
                    } else {
                        LP1 lp1 = lAu.A00;
                        if (lp1 != null) {
                            lp1.A03 = null;
                            lp1.A02 = null;
                            lp1.A04 = null;
                            try {
                                lp1.A00.release();
                            } catch (Exception unused) {
                            }
                            lp1.A08.removeCallbacksAndMessages((Object) null);
                            lp1.A09.evictAll();
                            lp1.A0A.evictAll();
                        }
                        try {
                            LP1 lp12 = new LP1(lAu.A03, lAu.A07, l7u.A02, i20, i21, 0, l7u.A01);
                            lAu.A00 = lp12;
                            lp12.A02 = new C65830M0w(lAu, i20, i21);
                            11Z.A03(new C65880M2v(lAu));
                        } catch (IOException e) {
                            0kD.A09("BitmapTimelineController", "Video frame generator setup failed", e);
                        }
                    }
                    i22 += arrayList3.size();
                }
            }
            return;
        }
        JTP.A1U("BitmapTimelineHelper:generateBitmapsAndRender: failed to generate frame info for filmstrip", A002);
    }

    public static void A02(AbstractCollection abstractCollection, List list, double d, int i) {
        abstractCollection.add(Double.valueOf((d * ((double) ((C63814L7u) list.get(i)).A00)) / 100.0d));
    }
}
