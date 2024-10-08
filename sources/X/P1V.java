package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;

public final class P1V implements C74448Pv3 {
    public final /* synthetic */ NJV A00;

    public P1V(NJV njv) {
        this.A00 = njv;
    }

    public final void DRl(DirectMessageSearchMessage directMessageSearchMessage, int i, int i2, int i3, int i4) {
        NJV njv = this.A00;
        C72200OyM oyM = njv.A05;
        if (oyM != null) {
            DirectMessageSearchMessage directMessageSearchMessage2 = directMessageSearchMessage;
            if (AnonymousClass7TF.A1V(oyM.A02)) {
                C72208OyY A002 = C72208OyY.A00(AnonymousClass7TE.A0l(njv.A0D));
                0qQ.A07(A002);
                String str = njv.A07;
                if (str != null) {
                    long j = (long) i;
                    long j2 = (long) i2;
                    A002.A0A(directMessageSearchMessage2, str, 25, j, j2);
                    A002.A08((PE1) null, directMessageSearchMessage2, 25, j, j2, (long) i3);
                    A002.A09(directMessageSearchMessage2);
                }
                0qQ.A0F("query");
                throw AnonymousClass00P.createAndThrow();
            }
            C72200OyM oyM2 = njv.A05;
            if (oyM2 != null) {
                String str2 = njv.A07;
                if (str2 != null) {
                    String str3 = directMessageSearchMessage2.A0A;
                    oyM2.A04(str2, str3, "thread_list", directMessageSearchMessage2.A02);
                    C72200OyM oyM3 = njv.A05;
                    if (oyM3 != null) {
                        String str4 = njv.A07;
                        if (str4 != null) {
                            oyM3.A03(str4, str3);
                            1pE A01 = 1pE.A01(njv.requireActivity(), njv, AnonymousClass7TE.A0l(njv.A0D), "direct_message_search");
                            DbZ.A1Z(A01, directMessageSearchMessage2.A09);
                            A01.A0Y = directMessageSearchMessage2.A07;
                            A01.A0J = Long.valueOf(directMessageSearchMessage2.A01);
                            A01.A0l = directMessageSearchMessage2.A03;
                            A01.A06();
                            return;
                        }
                    }
                }
                0qQ.A0F("query");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("messageSearchLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DRr(DirectMessageSearchThread directMessageSearchThread, int i, int i2, int i3, int i4) {
        NJV njv = this.A00;
        C72200OyM oyM = njv.A05;
        String str = "messageSearchLogger";
        if (oyM != null) {
            DirectMessageSearchThread directMessageSearchThread2 = directMessageSearchThread;
            int i5 = i3;
            if (oyM.A02 != null) {
                C72208OyY A002 = C72208OyY.A00(AnonymousClass7TE.A0l(njv.A0D));
                0qQ.A07(A002);
                A002.A08((PE1) null, directMessageSearchThread2, 25, (long) i, (long) i2, (long) i5);
            }
            C72200OyM oyM2 = njv.A05;
            if (oyM2 != null) {
                String str2 = njv.A07;
                str = "query";
                if (str2 != null) {
                    String str3 = directMessageSearchThread2.A0A;
                    oyM2.A03(str2, str3);
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", directMessageSearchThread2.A08);
                    A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME", directMessageSearchThread2.A09);
                    String str4 = njv.A07;
                    if (str4 != null) {
                        A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", str4);
                        A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE", str3);
                        A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY", directMessageSearchThread2.A07);
                        A0a.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i5);
                        DbU.A1K(njv, DbV.A0Y(njv.requireActivity(), A0a, DbT.A0X(njv.A0D), ModalActivity.class, "direct_message_search_message_list_fragment"));
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DfX(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        String str;
        NJV njv = this.A00;
        if (view != null) {
            if (directSearchResult instanceof DirectMessageSearchMessage) {
                str = ((DirectMessageSearchMessage) directSearchResult).A07;
            } else if (directSearchResult instanceof DirectMessageSearchThread) {
                str = ((DirectMessageSearchThread) directSearchResult).A08;
            } else {
                return;
            }
            AnonymousClass30Y A0a = DbU.A0a(new C72261OzW(njv.A0C), AnonymousClass30Y.A00(directSearchResult, (Object) null, str));
            2el r0 = njv.A04;
            if (r0 == null) {
                0qQ.A0F("viewpointManager");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A05(view, A0a);
            }
        }
    }
}
