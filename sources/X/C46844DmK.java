package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;

/* renamed from: X.DmK  reason: case insensitive filesystem */
public final class C46844DmK extends 2Rw {
    public int A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final String A02;
    public final C62320sa A03;

    public final void onBindViewHolder(C249703kE r12, int i) {
        PendingRecipient pendingRecipient;
        String valueOf;
        0qQ.A0B(r12, 0);
        if ((r12 instanceof C47002Dou) && (pendingRecipient = (PendingRecipient) 00k.A0O(this.A01, i)) != null) {
            C47002Dou dou = (C47002Dou) r12;
            ImageUrl imageUrl = pendingRecipient.A03;
            int i2 = this.A00;
            int i3 = 0;
            if (!imageUrl.equals(dou.A00)) {
                dou.A00 = imageUrl;
                ImageView imageView = dou.A01;
                if (imageView != null) {
                    Context A0S = AnonymousClass7TE.A0S(imageView);
                    imageView.setImageDrawable(FCA.A01(A0S, imageUrl, dou.A03, A0S.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material), 0, 0));
                }
            }
            TextView textView = dou.A02;
            if (textView != null) {
                if (i2 <= 3 || i != 0) {
                    i3 = 8;
                } else {
                    Resources A0A = AnonymousClass7TF.A0A(textView.getContext());
                    if (i2 > 9) {
                        valueOf = AnonymousClass7TF.A0e(A0A, 9, 2131960338);
                        0qQ.A07(valueOf);
                    } else {
                        valueOf = String.valueOf(i2);
                    }
                    textView.setText(valueOf);
                }
                textView.setVisibility(i3);
            }
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C47002Dou(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.direct_private_share_create_group_facepile_view, false), this.A02, this.A03);
    }

    public C46844DmK(String str, C62320sa r3) {
        this.A02 = str;
        this.A03 = r3;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-139665218);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-887519513, A032);
        return size;
    }

    public final long getItemId(int i) {
        int i2;
        Long A10;
        int A032 = AnonymousClass0fD.A03(-721563284);
        PendingRecipient pendingRecipient = (PendingRecipient) 00k.A0O(this.A01, i);
        long j = 0;
        if (pendingRecipient == null) {
            i2 = 1626660952;
        } else {
            String str = pendingRecipient.A0B;
            if (!(str == null || (A10 = AnonymousClass7TE.A10(str)) == null)) {
                j = A10.longValue();
            }
            i2 = -1260351485;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return j;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(310551374, AnonymousClass0fD.A03(1514179967));
        return 1;
    }
}
