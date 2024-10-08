package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.hashtag.Hashtag;
import java.util.List;

/* renamed from: X.Jkh  reason: case insensitive filesystem */
public final class C60388Jkh extends 2Rw {
    public List A00;
    public final C63628L0q A01;

    public C60388Jkh(C63628L0q l0q, List list) {
        0qQ.A0B(l0q, 2);
        this.A00 = list;
        this.A01 = l0q;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60596Jo5(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.layout_clips_caption_suggestion_content_based_hashtag, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C60596Jo5 jo5 = (C60596Jo5) r5;
        0qQ.A0B(jo5, 0);
        Hashtag hashtag = (Hashtag) this.A00.get(i);
        String name = hashtag.getName();
        if (name != null) {
            jo5.A01.setText(name);
            IgTextView igTextView = jo5.A00;
            0qQ.A07(igTextView);
            C18767W0m.A02(igTextView, hashtag.B7j());
            AnonymousClass0fU.A00(new LXK(name, this, 11), jo5.itemView);
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(2028002971);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1920617425, A03);
        return size;
    }
}
