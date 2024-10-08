package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.Dm4  reason: case insensitive filesystem */
public final class C46828Dm4 extends 2Rw {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final ChannelCreationFlowExtraArgs A02;
    public final ChannelCreationSource A03;
    public final EV0[] A04 = EV0.values();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47000Dos(this.A01, this.A00, DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.interest_based_channel_chooser_item, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r12, int i) {
        int i2;
        int i3;
        int i4;
        1Ln A0J;
        String str;
        0Tu r2;
        long j;
        boolean A06;
        C47000Dos dos = (C47000Dos) r12;
        0qQ.A0B(dos, 0);
        UserSession userSession = dos.A02;
        int A002 = C48809EkX.A00(userSession, (Integer) null);
        EV0 ev0 = this.A04[i];
        0qQ.A0B(ev0, 0);
        int ordinal = ev0.ordinal();
        if (ordinal == 0) {
            i2 = R.drawable.instagram_channels_social_pano_outline_24;
            i3 = 2131959365;
            i4 = 2131959366;
            if (182.A06(0Tu.A05, userSession, 36315868343832198L)) {
                i4 = 2131959367;
            }
        } else if (ordinal == 1) {
            if (A002 == 1) {
                r2 = 0Tu.A05;
                j = 36316512583553453L;
                A06 = 182.A06(r2, userSession, j);
            } else if (A002 != 2) {
                A06 = false;
            } else {
                r2 = 0Tu.A05;
                j = 36316512584339897L;
                A06 = 182.A06(r2, userSession, j);
            }
            i2 = R.drawable.instagram_channels_broadcast_pano_outline_24;
            i3 = 2131959359;
            if (182.A06(0Tu.A05, userSession, 36315868343832198L)) {
                i4 = 2131959364;
            } else if (A06) {
                i4 = 2131959361;
                if (A002 == 2) {
                    i4 = 2131959363;
                }
            } else {
                i4 = 2131959360;
                if (A002 == 2) {
                    i4 = 2131959362;
                }
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        dos.A03.setImageResource(i2);
        dos.A00.setText(i3);
        dos.A01.setText(i4);
        if (ordinal == 1) {
            C313756gx A003 = C313746gw.A00(this.A01);
            A0J = DbT.A0J(A003);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, A003);
                Dba.A1D(A0J, "broadcast_chat_option_viewed");
                A0J.A0p("create_broadcast_chat_item");
                Dba.A1E(A0J, "create_channel");
                str = A003.A01;
            }
            FPE.A01(dos.itemView, 45, ev0, this);
        } else if (ordinal == 0) {
            C50338FYv A004 = C69866NtU.A00(this.A01);
            A0J = C50338FYv.A00(A004);
            if (DbT.A1Y(A0J)) {
                C50338FYv.A04(A0J, A004);
                Dba.A1D(A0J, "create_social_channel_button_rendered");
                A0J.A0p("create_public_chat_item");
                Dba.A1E(A0J, "create_channel");
                str = A004.A00;
            }
            FPE.A01(dos.itemView, 45, ev0, this);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A0J.A0v(str);
        A0J.Cgf();
        FPE.A01(dos.itemView, 45, ev0, this);
    }

    public C46828Dm4(FragmentActivity fragmentActivity, UserSession userSession, ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs, ChannelCreationSource channelCreationSource) {
        AnonymousClass7TG.A1Q(userSession, channelCreationSource);
        0qQ.A0B(channelCreationFlowExtraArgs, 5);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = channelCreationSource;
        this.A02 = channelCreationFlowExtraArgs;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1656231100);
        int length = this.A04.length;
        AnonymousClass0fD.A0A(315630908, A032);
        return length;
    }
}
