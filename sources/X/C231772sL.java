package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.feed.feeditem.SuggestedChannels;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: X.2sL  reason: invalid class name and case insensitive filesystem */
public final class C231772sL extends C231632rz {
    public final C230072os A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass2r8 A03;

    public C231772sL(Context context, UserSession userSession, AnonymousClass2r8 r4, C230072os r5) {
        0qQ.A0B(context, 2);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r4, 4);
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = r5;
        this.A03 = r4;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((SuggestedChannels) obj).getId().hashCode();
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        SuggestedChannels suggestedChannels = (SuggestedChannels) obj;
        C57245IUg iUg = (C57245IUg) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(suggestedChannels, 1);
        0qQ.A0B(iUg, 2);
        r3.A7U(0);
        this.A00.A9R(suggestedChannels, iUg);
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (i == 0) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        throw new IllegalStateException(002.A0O("Could not get ViewModel hash for item type ", i));
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(-352451405);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        SuggestedChannels suggestedChannels = (SuggestedChannels) obj;
        if (i == 0) {
            UserSession userSession = this.A02;
            Oy4 A002 = O15.A00(userSession);
            String id = suggestedChannels.getId();
            0qQ.A0B(id, 0);
            HashMap hashMap = A002.A02;
            if (!hashMap.containsKey(id)) {
                hashMap.put(id, new HashSet());
                0wc r4 = A002.A00;
                0Aj A003 = r4.A00(r4.A00, C66579MXk.A00(135));
                if (A003.isSampled()) {
                    String obj3 = UUID.randomUUID().toString();
                    0qQ.A07(obj3);
                    A003.AAJ("user_igid", A002.A01);
                    A003.AAJ("event", C66579MXk.A00(710));
                    A003.AAJ("surface", "feed_netego");
                    A003.AAJ("source", C66579MXk.A00(707));
                    A003.AAJ("action", "impression");
                    A003.AAJ(Dbf.A00(), obj3);
                    A003.Cgf();
                }
            }
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.channels.SuggestedChannelsViewBinder.Holder");
            C2614649r r5 = (C2614649r) tag;
            AnonymousClass2r8 r42 = this.A03;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r5, 1);
            0qQ.A0B(r42, 3);
            HorizontalRecyclerPager horizontalRecyclerPager = r5.A03;
            Context context = horizontalRecyclerPager.getContext();
            C67809MvD mvD = horizontalRecyclerPager.A0A;
            IgTextView igTextView = r5.A02;
            N33 n33 = suggestedChannels.A00;
            igTextView.setText(n33.A05);
            r5.A01.setText(n33.A04);
            if (mvD == null) {
                0qQ.A0A(context);
                mvD = new C67809MvD(context, userSession, r42);
                horizontalRecyclerPager.setAdapter(mvD);
                String str = n33.A03;
                if (str == null) {
                    str = "";
                }
                mvD.A00 = str;
                mvD.A01 = (ArrayList) n33.A07;
                mvD.A00();
            } else {
                C67809MvD mvD2 = mvD;
                String str2 = n33.A03;
                if (str2 == null) {
                    str2 = "";
                }
                mvD2.A00 = str2;
                mvD2.A01 = (ArrayList) n33.A07;
                mvD2.A00();
                mvD2.notifyDataSetChanged();
            }
            0qQ.A0B(mvD, 0);
            r42.A00 = new WeakReference(mvD);
            horizontalRecyclerPager.A15(new C67835Mvf(userSession, suggestedChannels));
            AnonymousClass0fU.A00(new C71326OiX(suggestedChannels, r42), r5.A00);
            this.A00.EBq(view, suggestedChannels);
            AnonymousClass0fD.A0A(-1262305642, A032);
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
        AnonymousClass0fD.A0A(337950187, A032);
        throw unsupportedOperationException;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(1586851243);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            Context context = this.A01;
            0qQ.A0B(context, 0);
            View inflate = LayoutInflater.from(context).inflate(R.layout.channels_netego_view, viewGroup, false);
            0qQ.A07(inflate);
            inflate.setTag(new C2614649r(inflate));
            AnonymousClass0fD.A0A(-963134858, A032);
            return inflate;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
        AnonymousClass0fD.A0A(-1314125543, A032);
        throw unsupportedOperationException;
    }
}
