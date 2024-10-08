package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.List;

/* renamed from: X.Jkk  reason: case insensitive filesystem */
public final class C60391Jkk extends 2Rw {
    public final List A00 = AnonymousClass7TE.A1C();
    public final AnonymousClass0iw A01;
    public final 0sL A02;

    public final void onBindViewHolder(C249703kE r9, int i) {
        float f;
        0qQ.A0B(r9, 0);
        C60605JoE joE = (C60605JoE) r9;
        C59832Ja7 ja7 = (C59832Ja7) this.A00.get(i);
        AnonymousClass0iw r5 = this.A01;
        0sL r4 = this.A02;
        AnonymousClass7TF.A1B(joE, 0, ja7);
        joE.A01.setText(ja7.A05);
        View view = joE.A00;
        boolean z = ja7.A06;
        if (!z || (ja7.A02 != null && !0qQ.A0K(ja7.A01, false) && !0qQ.A0K(ja7.A00, false))) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        view.setAlpha(f);
        CircularImageView circularImageView = joE.A02;
        String str = ja7.A02;
        if (z && str == null) {
            str = ja7.A03;
        }
        DbV.A1P(r5, circularImageView, str);
        LY9.A00(view, ja7, r4, i, 0);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbU.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.layout_avatars_mentionable_friend_item, false);
        A09.setTag(new C60605JoE(A09));
        Object tag = A09.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.avatars.mentions.adapter.AvatarMentionableFriendItemViewBinder.Holder");
        return (C249703kE) tag;
    }

    public C60391Jkk(AnonymousClass0iw r2, 0sL r3) {
        AnonymousClass7TG.A1O(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1464489352);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1351194364, A03);
        return size;
    }
}
