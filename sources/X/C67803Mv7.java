package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Mv7  reason: case insensitive filesystem */
public final class C67803Mv7 extends 2Rw {
    public final Context A00;
    public final 0sL A01;
    public final String[] A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = R.layout.direct_emoji_quick_reply_tray_v2_text_item;
        if (i == 0) {
            i2 = R.layout.direct_emoji_quick_reply_tray_v2_emoji_item;
        }
        return new C67913Mwv(DbU.A09(LayoutInflater.from(this.A00), viewGroup, i2, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r3, int i) {
        C67913Mwv mwv = (C67913Mwv) r3;
        0qQ.A0B(mwv, 0);
        mwv.A00.setText(this.A02[i]);
        C71404Ok3.A01(mwv.itemView, this, i, 3);
    }

    public C67803Mv7(Context context, 0sL r5) {
        this.A00 = context;
        this.A01 = r5;
        String[] stringArray = context.getResources().getStringArray(R.array.direct_emoji_quick_reply_items_v2_emoji_1);
        0qQ.A07(stringArray);
        String[] stringArray2 = context.getResources().getStringArray(R.array.direct_emoji_quick_reply_items_v2_emoji_2);
        0qQ.A07(stringArray2);
        this.A02 = (String[]) 0Yw.A0a(stringArray, stringArray2);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1371581056);
        int length = this.A02.length;
        AnonymousClass0fD.A0A(1627612011, A03);
        return length;
    }

    public final int getItemViewType(int i) {
        int A03 = AnonymousClass0fD.A03(-605780661);
        int i2 = 1;
        if (0mp.A0D(this.A02[i])) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(54468810, A03);
        return i2;
    }
}
