package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.api.schemas.RIXUCoverChainingType;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5mg  reason: invalid class name and case insensitive filesystem */
public final class C294575mg implements AnonymousClass49Q {
    public AnonymousClass3Y6 A00;
    public C68154N2u A01;
    public final C292795jX A02;
    public final C231702s8 A03;
    public final UserSession A04;
    public final C294875nB A05;
    public final AnonymousClass2xS A06;
    public final C229332nD A07;

    public C294575mg(C231702s8 r6, UserSession userSession, C294875nB r8, AnonymousClass3Y6 r9, C292795jX r10, AnonymousClass2xS r11, C229332nD r12) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = r9;
        this.A07 = r12;
        this.A02 = r10;
        this.A03 = r6;
        this.A05 = r8;
        this.A06 = r11;
        String id = r9.getId();
        AnonymousClass9J0 r3 = r12.A02;
        String str = r3.A01;
        if (str != null) {
            if (!str.equals(id)) {
                C229352nF r1 = r12.A03;
                r1.A05(r12.A04, str);
                r1.A07(str);
            }
            r3.A01 = id;
        }
        r12.A03.A04(r12.A04, id);
        r3.A01 = id;
    }

    public final void D1A(C267324bN r29, C297595s1 r30) {
        List list;
        List list2;
        RIXUCoverChainingType rIXUCoverChainingType;
        int ordinal;
        Long l;
        C297595s1 r15 = r30;
        0qQ.A0B(r15, 1);
        C267324bN r7 = r29;
        1Xj r6 = r7.A02;
        if (r6 != null) {
            C231702s8 r10 = this.A03;
            AnonymousClass3Y6 r9 = this.A00;
            if (r9.A0P && r10.A03.add(r9.getId())) {
                UserSession userSession = r10.A02;
                String obj = r9.A03.toString();
                String id = r9.getId();
                Integer num = r9.A0D;
                if (num != null) {
                    l = Long.valueOf((long) num.intValue());
                } else {
                    l = null;
                }
                String str = r9.A0F;
                AnonymousClass0iw r2 = r10.A00;
                AnonymousClass0iw r16 = r2;
                VF8.A00(r16, r10.A01, userSession, l, obj, id, "cta_primary_click", str);
            }
            C68154N2u n2u = this.A01;
            C294875nB r12 = this.A05;
            if (!(r12 == null || n2u == null)) {
                int i = n2u.A00;
                int i2 = n2u.A01;
                int i3 = n2u.A04;
                int i4 = n2u.A03;
                C294875nB r162 = r12;
                r162.Dk6((C67058MhZ) null, n2u.A05, "inbox_search", i, i2, i3, i4, n2u.A02);
            }
            C229332nD r92 = this.A07;
            ClipsViewerSource A012 = this.A00.A01();
            String id2 = r6.getId();
            if (id2 != null) {
                AnonymousClass3Y6 r5 = this.A00;
                C376559Il r1 = r5.A00;
                RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition = null;
                if (r1 == null || (rIXUCoverChainingType = (RIXUCoverChainingType) r1.A01) == null || (ordinal = rIXUCoverChainingType.ordinal()) == -1 || ordinal == 0 || ordinal == 2) {
                    List A072 = C295325ny.A07(r5.A0M);
                    ArrayList arrayList = new ArrayList();
                    for (Object next : A072) {
                        if (((C267324bN) next).A01 == C295365o2.ORGANIC) {
                            arrayList.add(next);
                        }
                    }
                    list = arrayList;
                } else if (ordinal == 1) {
                    List singletonList = Collections.singletonList(r7);
                    0qQ.A07(singletonList);
                    list = singletonList;
                } else {
                    throw new RuntimeException();
                }
                C376559Il r13 = this.A00.A00;
                if (r13 == null || (list2 = C294595mi.A00(r13).A05) == null) {
                    list2 = 0sn.A00;
                }
                ArrayList A0S = 00k.A0S(list2, list);
                String id3 = this.A00.getId();
                AnonymousClass3Y6 r22 = this.A00;
                C276104sZ r11 = r22.A04;
                String str2 = r22.A0S;
                C292795jX r14 = this.A02;
                Integer valueOf = Integer.valueOf(r14.A00);
                boolean z = r22.A0N;
                boolean z2 = r22.A0Q;
                boolean z3 = false;
                if (r22.A01() == ClipsViewerSource.DIRECT_SEARCH) {
                    z3 = true;
                }
                C2605946h A1O = r6.A1O();
                String str3 = r14.A03;
                String str4 = r14.A02;
                C376559Il r17 = this.A00.A00;
                if (r17 != null) {
                    rIXUChainingBehaviorDefinition = C294595mi.A00(r17);
                }
                AnonymousClass3Y6 r4 = this.A00;
                r92.A00(r4.A00(), r11, A012, A1O, this.A06, r15, rIXUChainingBehaviorDefinition, valueOf, r4.A0D, id2, id3, str2, str3, str4, A0S, z, z2, z3);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean D1B(Context context, MotionEvent motionEvent, View view, C267324bN r10, AnonymousClass0iw r11, int i) {
        C232692uG r0;
        0qQ.A0B(view, 1);
        0qQ.A0B(motionEvent, 2);
        1Xj r4 = r10.A02;
        if (r4 == null) {
            return false;
        }
        boolean A062 = 182.A06(0Tu.A05, this.A04, 36311354327630335L);
        0qQ.A0A(Boolean.valueOf(A062));
        if (!A062 || (r0 = this.A07.A00) == null) {
            return false;
        }
        return r0.Dsa(motionEvent, view, r4, i);
    }

    public final void DZ9(C240983Nk r1, 1Xj r2) {
    }
}
