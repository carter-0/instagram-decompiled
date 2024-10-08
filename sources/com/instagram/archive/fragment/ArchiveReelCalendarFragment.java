package com.instagram.archive.fragment;

import X.0Tu;
import X.0hq;
import X.0nA;
import X.0qQ;
import X.182;
import X.1NK;
import X.1OC;
import X.1OP;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass32D;
import X.AnonymousClass34S;
import X.AnonymousClass3BQ;
import X.AnonymousClass3K2;
import X.AnonymousClass3PO;
import X.AnonymousClass3PP;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass6UY;
import X.AnonymousClass738;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C13989Tnp;
import X.C14910UEp;
import X.C15625Ufr;
import X.C15849UjZ;
import X.C16159Upk;
import X.C16517UwM;
import X.C17208VMm;
import X.C17335VRo;
import X.C18427VrW;
import X.C19214WPu;
import X.C20373WqD;
import X.C230222pE;
import X.C255773uh;
import X.C273374mT;
import X.C51914G7i;
import X.C60991Jun;
import X.C61065Jw3;
import X.C66580MXl;
import X.DbT;
import X.DbU;
import X.DbZ;
import X.UAJ;
import X.UB1;
import X.VVB;
import X.VVC;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.calendar.CalendarRecyclerView;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class ArchiveReelCalendarFragment extends C273374mT implements AnonymousClass4DR, AnonymousClass4DS, C230222pE {
    public C15849UjZ A00;
    public AnonymousClass3PP A01;
    public Long A02;
    public Runnable A03;
    public String A04;
    public Date A05;
    public Map A06 = Collections.emptyMap();
    public boolean A07;
    public boolean A08;
    public RectF A09;
    public AnonymousClass32A A0A;
    public String A0B;
    public boolean A0C;
    public final Handler A0D = AnonymousClass7TF.A0D();
    public final Set A0E = new HashSet();
    public final Set A0F = new HashSet();
    public CalendarRecyclerView mCalendar;
    public C14910UEp mLaunchingHolder;
    public View mLoadingSpinner;

    public static void A02(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        archiveReelCalendarFragment.A08 = false;
        C14910UEp uEp = archiveReelCalendarFragment.mLaunchingHolder;
        if (uEp != null) {
            ((ViewGroup) uEp.itemView).setLayoutTransition(new LayoutTransition());
            uEp.A02.setVisibility(0);
            uEp.A01.setVisibility(4);
            uEp.A06.stop();
            archiveReelCalendarFragment.mLaunchingHolder = null;
        }
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public final String getModuleName() {
        return "calendar_archive";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public static void A01(C14910UEp uEp, ArchiveReelCalendarFragment archiveReelCalendarFragment, Reel reel) {
        if (archiveReelCalendarFragment.A08 && A05(archiveReelCalendarFragment)) {
            Runnable runnable = archiveReelCalendarFragment.A03;
            if (runnable != null) {
                archiveReelCalendarFragment.A0D.removeCallbacks(runnable);
            }
            archiveReelCalendarFragment.A03 = null;
            if (archiveReelCalendarFragment.A0A == null) {
                archiveReelCalendarFragment.A0A = new AnonymousClass32A(archiveReelCalendarFragment, archiveReelCalendarFragment.getSession(), new AnonymousClass328(archiveReelCalendarFragment));
            }
            archiveReelCalendarFragment.A09 = 0nA.A0F(uEp.A00);
            AnonymousClass32A r4 = archiveReelCalendarFragment.A0A;
            r4.A0C = archiveReelCalendarFragment.A0B;
            AnonymousClass32D r1 = new AnonymousClass32D();
            r1.A06 = false;
            r4.A03 = new ReelViewerConfig(r1);
            r4.A05 = new C16159Upk(archiveReelCalendarFragment.getActivity(), archiveReelCalendarFragment.A00, archiveReelCalendarFragment.mCalendar, archiveReelCalendarFragment);
            r4.A0D = archiveReelCalendarFragment.getSession().A06;
            List list = archiveReelCalendarFragment.A00.A0B;
            Reel reel2 = reel;
            r4.A06(reel2, AnonymousClass3BQ.CALENDAR, uEp, list, list, 0);
            A02(archiveReelCalendarFragment);
        }
    }

    public static void A03(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        Date date;
        int i;
        int i2;
        int i3;
        ImageUrl imageUrl;
        ArchiveReelCalendarFragment archiveReelCalendarFragment2 = archiveReelCalendarFragment;
        if (archiveReelCalendarFragment2.A07) {
            ArrayList arrayList = new ArrayList();
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            Calendar instance2 = Calendar.getInstance();
            Iterator A0v = AnonymousClass7TF.A0v(archiveReelCalendarFragment2.A06);
            while (A0v.hasNext()) {
                AnonymousClass34S r0 = (AnonymousClass34S) A0v.next();
                Object obj = r0.A00;
                obj.getClass();
                C60991Jun jun = (C60991Jun) obj;
                Object obj2 = r0.A01;
                obj2.getClass();
                Reel reel = (Reel) obj2;
                if (!reel.A14(archiveReelCalendarFragment2.getSession())) {
                    long j = jun.A01;
                    if (j != 0) {
                        instance.setTime(C13989Tnp.A0t(j));
                        int i4 = instance.get(1);
                        int A062 = DbZ.A06(instance);
                        int A032 = DbU.A03(instance);
                        instance2.clear();
                        instance2.set(i4, A062, A032, 0, 0);
                        C61065Jw3 jw3 = jun.A02;
                        if (jw3 != null) {
                            imageUrl = (ImageUrl) jw3.A02;
                        } else {
                            imageUrl = null;
                        }
                        arrayList.add(new VVB(imageUrl, reel, instance2.getTime()));
                    }
                }
            }
            C15849UjZ ujZ = archiveReelCalendarFragment2.A00;
            Date date2 = archiveReelCalendarFragment2.A05;
            ArrayList arrayList2 = new ArrayList();
            List list = ujZ.A0B;
            list.clear();
            Map map = ujZ.A0C;
            map.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                VVB vvb = (VVB) it.next();
                Date date3 = vvb.A02;
                Reel reel2 = vvb.A01;
                arrayList2.add(new VVC(vvb.A00, reel2, date3));
                list.add(reel2);
                map.put(reel2.getId(), date3);
            }
            Collections.sort(arrayList2, new C20373WqD(7));
            Date date4 = new Date();
            if (!arrayList2.isEmpty()) {
                date = ((VVC) arrayList2.get(0)).A02;
            } else {
                date = date4;
            }
            if (date2 == null || !date2.before(date)) {
                date2 = date;
            }
            List list2 = ujZ.A02;
            list2.clear();
            Map map2 = ujZ.A03;
            map2.clear();
            Map map3 = ujZ.A04;
            map3.clear();
            Calendar calendar = ujZ.A01;
            calendar.clear();
            calendar.setTime(date2);
            calendar.clear();
            calendar.setTime(date4);
            int i5 = (calendar.get(1) * 12) + calendar.get(2);
            for (int i6 = (calendar.get(1) * 12) + calendar.get(2); i6 <= i5; i6++) {
                calendar.clear();
                calendar.set(1, i6 / 12);
                calendar.set(2, i6 % 12);
                Date time = calendar.getTime();
                calendar.clear();
                calendar.setTime(time);
                int firstDayOfWeek = calendar.getFirstDayOfWeek();
                int i7 = UAJ.A05;
                int i8 = (i7 - 1) + firstDayOfWeek;
                if (i8 > i7) {
                    i8 %= i7;
                }
                int i9 = calendar.get(1);
                int i10 = calendar.get(2);
                list2.add(new C17208VMm(ujZ.A00.format(time)));
                C66580MXl.A1T(UAJ.A00(i9, i10, -1), map2, DbT.A02(list2, 1));
                int i11 = firstDayOfWeek;
                while (true) {
                    i = i7 + firstDayOfWeek;
                    if (i11 >= i) {
                        break;
                    }
                    if (i11 > i7) {
                        i3 = i11 % i7;
                    } else {
                        i3 = i11;
                    }
                    list2.add(new C18427VrW(i3));
                    i11++;
                }
                int i12 = calendar.get(7);
                while (firstDayOfWeek < i) {
                    if (firstDayOfWeek > i7) {
                        i2 = firstDayOfWeek % i7;
                    } else {
                        i2 = firstDayOfWeek;
                    }
                    if (i2 == i12) {
                        break;
                    }
                    list2.add(new Object());
                    firstDayOfWeek++;
                }
                do {
                    int i13 = calendar.get(5);
                    list2.add(new C17335VRo(calendar.getTime()));
                    C66580MXl.A1T(UAJ.A00(i9, i10, i13), map2, DbT.A02(list2, 1));
                    calendar.add(5, 1);
                } while (calendar.get(2) == i10);
                calendar.add(5, -1);
                int i14 = calendar.get(7);
                if (i14 != i8) {
                    do {
                        i14++;
                        if (i14 > i7) {
                            i14 %= i7;
                        }
                        list2.add(new Object());
                    } while (i14 != i8);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                VVC vvc = (VVC) it2.next();
                String A012 = ujZ.A01(vvc.A02);
                Map map4 = map3;
                List A13 = C66580MXl.A13(A012, map4);
                if (A13 == null) {
                    A13 = new ArrayList();
                    map4.put(A012, A13);
                }
                A13.add(vvc);
            }
            ujZ.notifyDataSetChanged();
        }
    }

    public static void A00(C14910UEp uEp, ArchiveReelCalendarFragment archiveReelCalendarFragment, Reel reel) {
        ImageUrl A082;
        if (A05(archiveReelCalendarFragment)) {
            Context requireContext = archiveReelCalendarFragment.requireContext();
            C255773uh A092 = reel.A09(archiveReelCalendarFragment.getSession());
            if (A092 == null || A092.A08(requireContext) == null || (A082 = A092.A08(requireContext)) == null) {
                A01(uEp, archiveReelCalendarFragment, reel);
                return;
            }
            C19214WPu wPu = new C19214WPu(0, archiveReelCalendarFragment, reel, uEp);
            archiveReelCalendarFragment.A0E.add(wPu);
            C13989Tnp.A1P(wPu, 1NK.A00(), A082, "calendar_archive");
        }
    }

    public static void A04(ArchiveReelCalendarFragment archiveReelCalendarFragment, Integer num, String str, List list) {
        1OC A032 = AnonymousClass738.A03(archiveReelCalendarFragment.getSession(), AnonymousClass05K.A0Y, str, archiveReelCalendarFragment.A04, false);
        A032.A00 = new C15625Ufr(0, archiveReelCalendarFragment, list, num);
        archiveReelCalendarFragment.schedule(A032);
    }

    public static boolean A05(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        if (archiveReelCalendarFragment.getContext() == null || !archiveReelCalendarFragment.isResumed() || archiveReelCalendarFragment.mCalendar == null) {
            return false;
        }
        return true;
    }

    public final void configureActionBar(2da r2) {
        r2.Eom(2131954427);
        0hq r0 = this.mFragmentManager;
        r0.getClass();
        r2.Eu4(AnonymousClass7TF.A1R(r0.A0M()));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-727900766);
        ArchiveReelCalendarFragment.super.onCreate(bundle);
        this.A0B = AnonymousClass7TF.A0b();
        Typeface typeface = C15849UjZ.A0D;
        this.A00 = new C15849UjZ(requireContext(), this, this);
        UserSession session = getSession();
        1OP r0 = 1OP.$redex_init_class;
        0qQ.A0B(session, 0);
        this.A01 = AnonymousClass3PO.A00(session);
        boolean A1W = AnonymousClass7TF.A1W(requireArguments().get("archive_stories_tab"), C16517UwM.CALENDAR);
        if (!182.A06(0Tu.A05, getSession(), 36319849772752566L) || A1W) {
            A04(this, (Integer) null, (String) null, Collections.emptyList());
        }
        AnonymousClass0fD.A09(122313904, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-355874952);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_calendar);
        AnonymousClass0fD.A09(-1156819653, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2051839251);
        super.onDestroyView();
        this.A0E.clear();
        this.A0F.clear();
        ArchiveReelCalendarFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(2046447060, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(443248475);
        super.onResume();
        if (!this.A00.A0B.isEmpty()) {
            this.mLoadingSpinner.setVisibility(8);
        }
        AnonymousClass3K2 A0a = C13989Tnp.A0a(this);
        if (A0a != null && A0a.A0Z()) {
            RectF rectF = this.A09;
            A0a.A0W(rectF, rectF, this, (C51914G7i) null);
        }
        A03(this);
        AnonymousClass0fD.A09(168153590, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1764492549);
        ArchiveReelCalendarFragment.super.onStart();
        DbZ.A1P(this, 8);
        AnonymousClass0fD.A09(-1731453221, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(2084790397);
        ArchiveReelCalendarFragment.super.onStop();
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(1709620632, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A02 = C13988Tno.A0T(requireArguments(), AnonymousClass000.A00(3855));
        this.A04 = requireArguments().getString("reel_id");
        this.mCalendar = (CalendarRecyclerView) view.requireViewById(R.id.calendar);
        this.mLoadingSpinner = view.requireViewById(R.id.loading_spinner);
        this.mCalendar.setAdapter(this.A00);
        UB1.A00(this.mCalendar, this, 2);
    }

    public final void setMenuVisibility(boolean z) {
        ArchiveReelCalendarFragment.super.setMenuVisibility(z);
        if (182.A06(0Tu.A05, getSession(), 36319849772752566L) && z && !this.A0C) {
            A04(this, (Integer) null, (String) null, Collections.emptyList());
            this.A0C = true;
        }
    }

    public final void DcC(Reel reel) {
        A03(this);
    }
}
