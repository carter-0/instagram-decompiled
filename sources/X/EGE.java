package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

public final class EGE extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final C49665F0x A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        IgImageView igImageView;
        FYL fyl = (FYL) r7;
        C46895DnB dnB = (C46895DnB) r8;
        ViewGroup viewGroup = dnB.A00;
        if (viewGroup != null) {
            03v.A0B(viewGroup, new U7M(this, 13));
            FP7.A00(viewGroup, 28, this, fyl);
            2eS.A01(viewGroup);
        }
        IgTextView igTextView = dnB.A03;
        if (igTextView != null) {
            igTextView.setText(fyl.A05);
        }
        IgTextView igTextView2 = dnB.A02;
        if (igTextView2 != null) {
            if (fyl.A01.A06) {
                igTextView2.setText(2131953886);
                igTextView2.setSingleLine(false);
            } else {
                String str = fyl.A03;
                if (str.isEmpty()) {
                    igTextView2.setVisibility(8);
                } else {
                    igTextView2.setText(str);
                    igTextView2.setSingleLine(true);
                }
            }
            igTextView2.setVisibility(0);
        }
        C71662eb r4 = dnB.A05;
        if (!(r4 == null || (igImageView = dnB.A04) == null)) {
            if (fyl.A01.A06) {
                igImageView.setVisibility(8);
                ((StackedAvatarView) r4.A01()).setUrls(fyl.A00, (ImageUrl) null, this.A01);
                r4.A03(0);
            } else {
                if (r4.A04()) {
                    r4.A03(8);
                }
                igImageView.setVisibility(0);
                igImageView.setUrl(fyl.A00, this.A01);
            }
        }
        IgTextView igTextView3 = dnB.A01;
        if (igTextView3 != null) {
            igTextView3.setText(fyl.A02);
            1QE.A0H(igTextView3, igTextView3);
            FP7.A00(igTextView3, 29, this, fyl);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3kE, X.DnB] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.blocked_list_row);
        ? r1 = new C249703kE(A0C);
        r1.A00 = DbU.A0C(A0C, R.id.blocked_list_container);
        r1.A03 = DbT.A0a(A0C, R.id.blocked_list_username);
        r1.A02 = DbT.A0a(A0C, R.id.blocked_list_subtitle);
        r1.A04 = DbU.A0X(A0C, R.id.blocked_list_user_imageview);
        r1.A01 = DbT.A0a(A0C, R.id.unblock_button);
        r1.A05 = DbY.A0T(A0C, R.id.blocked_list_user_stacked_avatar);
        return r1;
    }

    public final Class modelClass() {
        return FYL.class;
    }

    public EGE(Context context, AnonymousClass0iw r2, C49665F0x f0x) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = f0x;
    }
}
