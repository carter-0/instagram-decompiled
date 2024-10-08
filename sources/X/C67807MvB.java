package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.List;
import java.util.Random;

/* renamed from: X.MvB  reason: case insensitive filesystem */
public final class C67807MvB extends 2Rw {
    public final Context A00;
    public final UserSession A01;
    public final List A02 = AnonymousClass7TE.A1C();
    public final int A03;
    public final C70652OEz A04;

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 1 || i == 2) {
            View inflate = LayoutInflater.from(this.A00).inflate(R.layout.thread_gifs_drawer_item, viewGroup, false);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            UserSession userSession = this.A01;
            0qQ.A0A(inflate);
            return new C67970Mxu(inflate, userSession);
        } else if (i == 3) {
            return new C67901Mwj(DbU.A09(LayoutInflater.from(this.A00), viewGroup, R.layout.thread_gifs_drawer_random_item, false));
        } else {
            throw DbW.A0b("Unknown viewtype: ", i);
        }
    }

    public final void onBindViewHolder(C249703kE r19, int i) {
        C249703kE r8 = r19;
        0qQ.A0B(r8, 0);
        int i2 = r8.mItemViewType;
        if (i2 == 1 || i2 == 2) {
            C68137N2b n2b = (C68137N2b) this.A02.get(i);
            C67970Mxu mxu = (C67970Mxu) r8;
            C70652OEz oEz = this.A04;
            int i3 = this.A03;
            0qQ.A0B(n2b, 0);
            IgImageView igImageView = mxu.A02;
            Context context = igImageView.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            igImageView.setLayoutParams(layoutParams);
            View view = mxu.A00;
            view.setLayoutParams(layoutParams);
            DirectAnimatedMedia directAnimatedMedia = n2b.A01;
            GifUrlImpl gifUrlImpl = directAnimatedMedia.A02;
            0qQ.A0A(context);
            UserSession userSession = mxu.A01;
            String str = directAnimatedMedia.A05;
            float A08 = (float) JTR.A08(context);
            C321076tX A002 = C321066tW.A00(C69826Nsn.A00(gifUrlImpl), i3, 0, -1);
            int A032 = AnonymousClass7TF.A03(context, R.attr.stickerLoadingStartColor);
            int A033 = AnonymousClass7TF.A03(context, R.attr.stickerLoadingEndColor);
            Integer num = AnonymousClass05K.A01;
            igImageView.setImageDrawable(new C321016tR(context, userSession, A002, gifUrlImpl, num, str, A08, A032, A033));
            2eS.A04(igImageView, num);
            C68642NQw.A00(AnonymousClass7TE.A0m(view), oEz, n2b, 2);
            C71020OYv oYv = oEz.A02;
            UserSession userSession2 = oYv.A06;
            AnonymousClass0iw r2 = oEz.A00;
            String str2 = oYv.A0D;
            String str3 = n2b.A00.A05;
            String str4 = oYv.A04;
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = oEz.A03;
            0qQ.A0B(str3, 3);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession2), "giphy_gif_impression");
            if (A0e.isSampled()) {
                A0e.AAJ("gif_id", str3);
                if (str2 == null) {
                    str2 = "";
                }
                A0e.AAJ(C66654MaN.A00(), str2);
                A0e.A8D("timestamp", Double.valueOf((double) currentTimeMillis));
                A0e.AAJ("response_id", str4);
                C66581MXm.A1H(A0e, z);
                A0e.Cgf();
            }
        } else if (i2 == 3) {
            Random random = new Random();
            List list = this.A02;
            C68137N2b n2b2 = (C68137N2b) list.get(random.nextInt(DbT.A02(list, 1)));
            0qQ.A0B(n2b2, 0);
            C68137N2b n2b3 = new C68137N2b(AnonymousClass53I.A00(n2b2.A01), AnonymousClass53I.A00(n2b2.A00), false);
            C68642NQw.A00(AnonymousClass7TE.A0m(((C67901Mwj) r8).A00), this.A04, n2b3, 3);
        }
    }

    public C67807MvB(Context context, UserSession userSession, C70652OEz oEz, int i) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = oEz;
        this.A03 = i;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-156073584);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(799955968, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(1167586342, AnonymousClass0fD.A03(-1847529275));
        return 1;
    }
}
