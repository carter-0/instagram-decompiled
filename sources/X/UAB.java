package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class UAB extends 2Rw {
    public final WWM A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final C355638Qt A04 = new C355638Qt(2);
    public final UserSession A05;
    public final C229122ms A06;
    public final String A07;

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View inflate = DbV.A0D(viewGroup).inflate(R.layout.countdown_home_create_list_item, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.create_button);
            findViewById.getClass();
            AnonymousClass3NG r1 = new AnonymousClass3NG(findViewById);
            r1.A07 = true;
            C15848UjY.A00(r1, this, 26);
            return new C249703kE(inflate);
        } else if (i == 1) {
            return new UC1(LoadMoreButton.A00(viewGroup.getContext(), R.layout.countdown_home_empty_state_item, viewGroup));
        } else {
            if (i == 2) {
                return new UE0(DbV.A0D(viewGroup).inflate(R.layout.countdown_home_sticker_list_item, viewGroup, false), this.A05, this.A00);
            }
            throw new IllegalArgumentException("unsupported view type");
        }
    }

    public UAB(UserSession userSession, WWM wwm, C229122ms r6, String str) {
        this.A05 = userSession;
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A01 = new ArrayList();
        setHasStableIds(true);
        this.A06 = r6;
        this.A00 = wwm;
        this.A07 = str;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1777396908);
        int size = this.A01.size() + 1 + 1;
        AnonymousClass0fD.A0A(1586701833, A032);
        return size;
    }

    public final long getItemId(int i) {
        long A002;
        int i2;
        int A032 = AnonymousClass0fD.A03(-283831042);
        if (i == 0) {
            A002 = 0;
            i2 = 1238255657;
        } else if (i == getItemCount() - 1) {
            A002 = 1;
            i2 = 1494526216;
        } else {
            C355638Qt r1 = this.A04;
            String str = ((C19476WaO) this.A01.get(i - 1)).A00.A06;
            str.getClass();
            A002 = r1.A00(str);
            i2 = 1784156453;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return A002;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(389493472);
        if (i == 0) {
            i2 = 0;
            i3 = -1492856908;
        } else {
            i2 = 1;
            if (i == getItemCount() - 1) {
                i3 = -302147905;
            } else {
                i2 = 2;
                i3 = -852024603;
            }
        }
        AnonymousClass0fD.A0A(i3, A032);
        return i2;
    }

    public final void onBindViewHolder(C249703kE r7, int i) {
        if (getItemViewType(i) == 2) {
            UE0 ue0 = (UE0) r7;
            C19476WaO waO = (C19476WaO) this.A01.get(i - 1);
            String str = this.A07;
            ue0.A00 = waO;
            C389629pw r4 = new C389629pw(ue0.A01, ue0.A03, waO, str);
            C16146UpX upX = r4.A01;
            Drawable drawable = upX.A07.getDrawable(R.drawable.instagram_more_horizontal_pano_outline_24);
            if (drawable != null) {
                upX.A00 = drawable;
                upX.invalidateSelf();
                C68639NQs nQs = upX.A09;
                Date date = nQs.A03;
                if (date != null && date.before(new Date())) {
                    nQs.A02 = AnonymousClass05K.A01;
                    C68639NQs.A00(nQs);
                }
                upX.invalidateSelf();
                ImageView imageView = ue0.A02;
                imageView.setImageDrawable(r4);
                String str2 = ue0.A00.A00.A0B;
                if (str2 == null) {
                    str2 = "";
                }
                imageView.setContentDescription(str2);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (getItemViewType(i) == 1) {
            C229122ms r2 = this.A06;
            0qQ.A0B(r2, 0);
            ((UC1) r7).A00.A03(r2, (C230682q1) null);
        }
    }
}
