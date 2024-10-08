package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Kak  reason: case insensitive filesystem */
public final class C62133Kak extends C68504NKx {
    public final Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62133Kak(Context context, 0lg r3, AnonymousClass0iw r4) {
        super(context, r3, r4);
        0qQ.A0B(r3, 2);
        this.A00 = context;
    }

    public final void onBindViewHolder(C249703kE r3, int i) {
        int A07 = JTP.A07(this, r3, 0, i);
        if (A07 != -2 && A07 != -1) {
            super.onBindViewHolder(r3, i);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        0qQ.A0B(viewGroup, 0);
        if (i == -2) {
            view = LayoutInflater.from(this.A00).inflate(R.layout.bloks_error_layout, viewGroup, false);
            i2 = 2;
        } else if (i != -1) {
            return super.onCreateViewHolder(viewGroup, i);
        } else {
            view = LayoutInflater.from(this.A00).inflate(R.layout.birthday_visibility_settings_loading_fragment, viewGroup, false);
            i2 = 1;
        }
        return new C60681JpS(view, i2);
    }

    public final int getItemViewType(int i) {
        int itemViewType;
        int A03 = AnonymousClass0fD.A03(880729561);
        Object item = getItem(i);
        if (item instanceof C49137Eq0) {
            itemViewType = -1;
        } else if (item instanceof C49136Epz) {
            itemViewType = -2;
        } else {
            itemViewType = super.getItemViewType(i);
        }
        AnonymousClass0fD.A0A(-1010721149, A03);
        return itemViewType;
    }

    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 2;
    }
}
