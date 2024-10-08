package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Wf  reason: invalid class name and case insensitive filesystem */
public final class C357038Wf {
    public final Activity A00;
    public final C357028Wd A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final AnonymousClass8QN A04;
    public final AnonymousClass8BA A05;
    public final AnonymousClass80D A06;
    public final C3496481e A07;
    public final AnonymousClass8VZ A08;
    public final AnonymousClass8D8 A09;
    public final AnonymousClass0eK A0A;

    public C357038Wf(Activity activity, AnonymousClass0iw r3, UserSession userSession, AnonymousClass8QN r5, AnonymousClass8BA r6, AnonymousClass80D r7, C3496481e r8, C357028Wd r9, AnonymousClass8VZ r10, AnonymousClass8D8 r11, AnonymousClass0eK r12) {
        0qQ.A0B(userSession, 6);
        0qQ.A0B(activity, 8);
        this.A0A = r12;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A09 = r11;
        this.A03 = userSession;
        this.A04 = r5;
        this.A00 = activity;
        this.A08 = r10;
        this.A01 = r9;
        this.A02 = r3;
    }

    public final void A00(Exception exc) {
        0kD.A07(this.A02.getModuleName(), "Error importing media", exc);
        Number number = (Number) this.A0A.get();
        if (number == null || number.intValue() != 1) {
            new Handler(Looper.getMainLooper()).post(new C40825Ajv(this));
        }
    }

    public final void A01(List list, List list2) {
        Number number = (Number) this.A0A.get();
        if (number == null || number.intValue() != 1) {
            AnonymousClass80R r8 = this.A07.A00;
            28D r1 = r8.A01;
            AnonymousClass80D r7 = this.A06;
            int A002 = AnonymousClass9TT.A00(r1, r7, this.A09);
            this.A05.A04 = C365768ne.A0A.A00().A03;
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C352218Cl r12 = (C352218Cl) it.next();
                    AnonymousClass9TT.A01(r7, r12, A002);
                    arrayList.add(new C365798nh(r12));
                }
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C349307zv r9 = (C349307zv) it2.next();
                    0qQ.A0B(r9, 0);
                    r9.A0d = r7.A2H;
                    r9.A0o = r7.A2e;
                    r9.A0F = A002;
                    r9.A0m = r7.A2G;
                    boolean equals = r8.A01.equals(28D.A5D);
                    if (r7.A3M) {
                        C59796JYp A012 = C59796JYp.A01(r9.A0k, 0);
                        0qQ.A07(A012);
                        if (A012.A03 >= 15500 && !equals) {
                            Iterator it3 = C39820AAr.A01(r9, 4, 15000, 5000).iterator();
                            while (it3.hasNext()) {
                                arrayList.add(new C365798nh((C349307zv) it3.next()));
                            }
                        }
                    }
                    arrayList.add(new C365798nh(r9));
                }
            }
            01V.A1D(arrayList, AnonymousClass9UA.A00);
            int size = arrayList.size();
            List list3 = arrayList;
            if (size > 10) {
                List subList = arrayList.subList(0, 10);
                new Handler(Looper.getMainLooper()).post(new C40826Ajw(this));
                list3 = subList;
            }
            if (list3.size() > 1) {
                this.A04.A0B(list3);
            } else if (list3.size() == 1) {
                C365798nh r4 = (C365798nh) list3.get(0);
                C365758nd r13 = r4.A05;
                if (r13 == C365758nd.A04) {
                    AnonymousClass8VZ r14 = this.A08;
                    C352218Cl r0 = r4.A02;
                    if (r0 != null) {
                        r14.A03(r0, false);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                } else if (r13 == C365758nd.A07) {
                    AnonymousClass8VZ r2 = this.A08;
                    C349307zv r15 = r4.A03;
                    if (r15 != null) {
                        r2.A01(C365808ni.A00, r15, false);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }
}
