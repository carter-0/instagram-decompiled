package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;

/* renamed from: X.7Yu  reason: invalid class name and case insensitive filesystem */
public final class C333397Yu extends C249383je {
    public final /* synthetic */ AnonymousClass7TI A00;

    public C333397Yu(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    public final void onScroll(C238133Ar r13, int i, int i2, int i3, int i4, int i5) {
        String str;
        int i6;
        Integer num;
        int i7;
        int A03 = AnonymousClass0fD.A03(-964206379);
        0qQ.A0B(r13, 0);
        AnonymousClass7TI r8 = this.A00;
        C332157Tw r6 = r8.A0j;
        C234312xe r1 = r6.A08;
        if (r1 != null) {
            int i8 = i5;
            r1.A01(i8);
            if (!r13.CWN() && r1.A00() == AnonymousClass05K.A0C) {
                if (182.A06(0Tu.A05, r8.A0d, 36324677315997915L)) {
                    i6 = 187023954;
                    AnonymousClass0fD.A0A(i6, A03);
                    return;
                }
            }
            if (i5 < 0) {
                C274644oo r0 = r8.A0A;
                if (r0 == null) {
                    str = "messageListAdapterHolder";
                } else {
                    int itemCount = r0.AZJ().getItemCount();
                    MessageListLayoutManager messageListLayoutManager = r8.A0B;
                    if (messageListLayoutManager != null) {
                        i7 = messageListLayoutManager.A1b();
                    } else {
                        i7 = -1;
                    }
                    if (((long) (itemCount - i7)) <= 182.A01(0Tu.A05, r8.A0d, 36604511615194171L) && r8.A0h.A00()) {
                        C333517Zg r02 = r8.A08;
                        if (r02 == null) {
                            str = "clientInfra";
                        } else {
                            r02.AvL().CgQ();
                        }
                    }
                }
            }
            r6.A0L.A00();
            C332237Ue r7 = r8.A0i;
            ((AnonymousClass7VJ) r7.A0T.getValue()).A00();
            C330497Nb r62 = r7.A06;
            if (!(r62 == null || i5 == 0)) {
                if (i5 > 0) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A01;
                }
                r62.A01 = num;
                C234262xW r03 = r62.A0B;
                r03.A00(i8);
                if (Math.abs(r03.A04) < 10000) {
                    r62.A00(false);
                }
            }
            AnonymousClass7M6 r12 = r7.A05;
            if (r12 != null) {
                AnonymousClass7M6.A00(r8.A0U.requireActivity().getWindow(), r12);
                i6 = -445484322;
                AnonymousClass0fD.A0A(i6, A03);
                return;
            }
            str = "screenshotNotificationManager";
        } else {
            str = "directionTracker";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onScrollStateChanged(C238133Ar r5, int i) {
        C329067Hl r1;
        View view;
        int A03 = AnonymousClass0fD.A03(-87860309);
        AnonymousClass7TI r3 = this.A00;
        AnonymousClass7UO r12 = r3.A0j.A0H;
        if (i == 0 && r12.A09.A01() && (view = r12.A01) != null) {
            view.setVisibility(8);
        }
        RecyclerView recyclerView = r3.A04;
        if (recyclerView == null) {
            0qQ.A0F("messageRecyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        if (!recyclerView.canScrollVertically(1) && (r1 = r3.A0n.A00.A0R) != null && r1.A1U()) {
            C329067Hl.A0k(r1, r1.A1B);
        }
        AnonymousClass0fD.A0A(67311861, A03);
    }
}
