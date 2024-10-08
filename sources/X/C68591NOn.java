package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.NOn  reason: case insensitive filesystem */
public final class C68591NOn extends C232222tE {
    public C67077Mhs A00;
    public final AnonymousClass0iw A01;
    public final O6J A02;

    public C68591NOn(AnonymousClass0iw r2, O6J o6j) {
        0qQ.A0B(o6j, 2);
        this.A01 = r2;
        this.A02 = o6j;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67993MyL(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_row_item, false));
    }

    public static final void A00(C67993MyL myL, N63 n63) {
        IgView igView;
        int i;
        if (n63.A02 != AnonymousClass05K.A01 || !n63.A00) {
            TextView textView = myL.A01;
            Typeface typeface = Typeface.DEFAULT;
            textView.setTypeface(typeface);
            myL.A00.setTypeface(typeface);
            igView = myL.A02;
            i = 8;
        } else {
            TextView textView2 = myL.A01;
            Typeface typeface2 = Typeface.DEFAULT_BOLD;
            textView2.setTypeface(typeface2);
            myL.A00.setTypeface(typeface2);
            igView = myL.A02;
            i = 0;
        }
        igView.setVisibility(i);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        String str;
        String str2;
        N63 n63 = (N63) r9;
        C67993MyL myL = (C67993MyL) r10;
        boolean A1U = AnonymousClass7TF.A1U(0, n63, myL);
        Context A06 = JTQ.A06(myL);
        if (this.A00 == null) {
            this.A00 = new C67077Mhs(A06);
            int A03 = AnonymousClass7TF.A03(A06, R.attr.igds_color_list_badge);
            C67077Mhs mhs = this.A00;
            str = "threadStateIndicatorDrawable";
            if (mhs != null) {
                mhs.A00 = A03;
                mhs.A01 = A03;
                mhs.A02 = A1U;
                mhs.A03 = false;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        TextView textView = myL.A01;
        String str3 = n63.A07;
        int i = n63.A01;
        C61066Jw4 jw4 = null;
        if (i == 2) {
            jw4 = new C61066Jw4(AnonymousClass05K.A00);
        }
        C46334Dcc.A00(textView, jw4, str3, false);
        TextView textView2 = myL.A00;
        textView2.setText(C69914NuG.A00(AnonymousClass7TE.A0S(textView2), n63.A05, n63.A03, n63.A08));
        myL.A03.setUrl(DbS.A0V(n63.A04), this.A01);
        C71399Ojy.A00(myL.itemView, n63, this, myL, 6);
        IgView igView = myL.A02;
        C67077Mhs mhs2 = this.A00;
        if (mhs2 == null) {
            str = "threadStateIndicatorDrawable";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        igView.setBackground(mhs2);
        A00(myL, n63);
        O6J o6j = this.A02;
        String str4 = n63.A06;
        int absoluteAdapterPosition = myL.getAbsoluteAdapterPosition();
        boolean z = n63.A00;
        0qQ.A0B(str4, 0);
        C68492NKl nKl = o6j.A00;
        if (nKl.A00.add(str4)) {
            C70651OEy oEy = (C70651OEy) nKl.A02.getValue();
            boolean A1S = AnonymousClass7TF.A1S(i, 2);
            0Aj A0e = AnonymousClass7TE.A0e(oEy.A00, "igd_channels_client_actions");
            if (A0e.isSampled()) {
                A0e.AAJ("user_igid", oEy.A02);
                DbS.A1I(A0e, "channel_invitation_impression");
                DbS.A1M(A0e, "activity_feed");
                DbS.A1L(A0e, "channel_invite_item");
                DbS.A1J(A0e, "impression");
                A0e.A9F("suggestion_position", DbV.A0p(A0e, "ig_thread_id", str4, absoluteAdapterPosition));
                C66584MXp.A0u(A0e, oEy.A01);
                if (A1S) {
                    str2 = "subscriber_broadcast";
                } else {
                    str2 = "broadcast";
                }
                A0e.AAJ("channel_type", str2);
                C66583MXo.A18(A0e, AnonymousClass7TF.A0w("read", String.valueOf(!z)));
            }
        }
    }

    public final Class modelClass() {
        return N63.class;
    }
}
