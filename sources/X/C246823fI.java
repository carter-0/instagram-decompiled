package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3fI  reason: invalid class name and case insensitive filesystem */
public final class C246823fI implements C246833fJ {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final C246793fF A03;
    public final C246803fG A04;
    public final C231332rR A05;
    public final 0rQ A06;
    public final AnonymousClass2xS A07;
    public final AnonymousClass32P A08;
    public final C2360132b A09;
    public final C249763kK A0A;

    public C246823fI(Fragment fragment, UserSession userSession, AnonymousClass311 r4, C246793fF r5, C246803fG r6, C231332rR r7, 0rQ r8, AnonymousClass2xS r9, AnonymousClass32P r10, C2360132b r11, C249763kK r12) {
        0qQ.A0B(r5, 6);
        0qQ.A0B(r6, 7);
        0qQ.A0B(r8, 8);
        0qQ.A0B(r10, 9);
        0qQ.A0B(r11, 10);
        0qQ.A0B(r12, 11);
        this.A02 = r4;
        this.A00 = fragment;
        this.A01 = userSession;
        this.A05 = r7;
        this.A07 = r9;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
        this.A08 = r10;
        this.A09 = r11;
        this.A0A = r12;
    }

    public final void D2S(1Xj r9, AnonymousClass3W1 r10) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        this.A09.A00((MotionEvent) null, (View) null, this.A00, r9, r10, 2EG.A1g, (String) null);
    }

    public final void D3b(AnonymousClass8ZN r2, C67231sQ r3, 1Xj r4, AnonymousClass3W1 r5) {
        0qQ.A0B(r5, 1);
        this.A02.BQE().D3b(r2, r3, r4, r5);
    }

    public final void DF5(1Xj r16, AnonymousClass4DU r17, AnonymousClass3W1 r18) {
        1Xj r9 = r16;
        0qQ.A0B(r9, 0);
        AnonymousClass3W1 r1 = r18;
        0qQ.A0B(r1, 1);
        AnonymousClass4DU r10 = r17;
        0qQ.A0B(r10, 2);
        UserSession userSession = this.A01;
        C254523sc A022 = C254513sb.A02(userSession, r9, r10, this.A0A, Integer.valueOf(r1.getPosition()), -1, C273654mx.A00(2370));
        if (A022 != null) {
            A022.A01 = r9.A0k();
            A022.A5K = "end_scene";
            0jB r6 = new 0jB();
            UserSession userSession2 = this.A06.A00;
            0Tu r4 = 0Tu.A05;
            Boolean valueOf = Boolean.valueOf(182.A06(r4, userSession2, 36329333061337145L));
            String A002 = C273654mx.A00(819);
            Map map = r6.A00;
            map.put(A002, valueOf);
            map.put(C273654mx.A00(818), Double.valueOf(182.A00(r4, userSession2, 37173757991518819L)));
            A022.A0E(r6);
            C233822wX.A0C(userSession, A022, r9, r10, (Integer) null);
        }
    }

    public final void DF9(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A05.Cs9(r2);
        this.A07.A0G.A0M();
    }

    public final void DN1(1Xj r9) {
        User CCd;
        String A002;
        0qQ.A0B(r9, 0);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && (CCd = r9.A0C.CCd()) != null && (A002 = AnonymousClass3ZA.A00(CCd)) != null) {
            1Yy A012 = FC8.A01();
            UserSession userSession = this.A01;
            Set set = C49280EsP.A00;
            A012.A04(activity, userSession, (Boolean) null, (Boolean) null, A002, AnonymousClass000.A00(2931));
        }
    }

    public final void DN3(View view, AnonymousClass0iw r11, 1Xj r12, AnonymousClass3W1 r13, String str) {
        0qQ.A0B(r12, 0);
        0qQ.A0B(r13, 1);
        0qQ.A0B(r11, 2);
        C246793fF r0 = this.A03;
        C270644h4 r3 = C270644h4.A04;
        AnonymousClass5OC r2 = AnonymousClass5OC.FEED_PREVIEW;
        View view2 = view;
        r0.A00(view2, r2, r3, r11, r12, r13, (List) null, true);
    }

    public final void DN5(AnonymousClass0iw r10, 1Xj r11, 1Xj r12, AnonymousClass3W1 r13) {
        0qQ.A0B(r11, 0);
        0qQ.A0B(r13, 1);
        0qQ.A0B(r10, 2);
        List asList = Arrays.asList(new C267324bN[]{C295375o3.A02(r11), C295375o3.A02(r12)});
        C246793fF r0 = this.A03;
        C270644h4 r3 = C270644h4.INSTANT;
        AnonymousClass5OC r2 = AnonymousClass5OC.FEED_PREVIEW_THUMBNAIL;
        r0.A00((View) null, r2, r3, r10, r11, r13, asList, false);
    }

    public final void DN6(1Xj r4, AnonymousClass3W1 r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        this.A04.A00(r4, r5, "endcard_reshare_button", r5.getPosition());
    }

    public final void DN8(View view, AnonymousClass0iw r11, 1Xj r12, AnonymousClass3W1 r13, boolean z) {
        AnonymousClass5OC r2;
        1Xj r5 = r12;
        0qQ.A0B(r12, 0);
        AnonymousClass3W1 r6 = r13;
        0qQ.A0B(r13, 1);
        AnonymousClass0iw r4 = r11;
        0qQ.A0B(r11, 2);
        if (z) {
            r2 = AnonymousClass5OC.BACKGROUND_TAP;
        } else {
            r2 = AnonymousClass5OC.WATCH_AGAIN;
        }
        this.A03.A00(view, r2, C270644h4.A04, r4, r5, r6, (List) null, false);
    }

    public final void DN9(View view, C270644h4 r11, AnonymousClass0iw r12, 1Xj r13, AnonymousClass3W1 r14) {
        C270644h4 r3 = r11;
        1Xj r5 = r13;
        0qQ.A0B(r13, 0);
        AnonymousClass3W1 r6 = r14;
        0qQ.A0B(r14, 1);
        AnonymousClass0iw r4 = r12;
        0qQ.A0B(r12, 2);
        C246793fF r0 = this.A03;
        if (r11 == null) {
            r3 = C270644h4.ANIMATE;
        }
        r0.A00(view, AnonymousClass5OC.WATCH_MORE_REELS, r3, r4, r5, r6, (List) null, false);
    }

    public final void EBx(View view, 1Xj r13, String str) {
        AnonymousClass32P r4 = this.A08;
        String A0R = 002.A0R("thumb_", r13.getId());
        C14196Trb trb = new C14196Trb(r13, (Integer) null, str, (String) null, true);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r1 = new C2354830a(trb, 0, A0R);
        r1.A00(r4.A01);
        r4.A00.A05(view, r1.A01());
    }
}
