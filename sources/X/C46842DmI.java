package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DmI  reason: case insensitive filesystem */
public final class C46842DmI extends 2Rw {
    public boolean A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final ArrayList A03 = AnonymousClass7TE.A1C();
    public final ArrayList A04;
    public final List A05;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return new C46979DoX(DbT.A0D(LayoutInflater.from(this.A01), viewGroup, R.layout.layout_clips_preloaded_settings_bottom_sheet_item, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        C46979DoX doX = (C46979DoX) r7;
        0qQ.A0B(doX, 0);
        ClipsPreloadedSettingItem clipsPreloadedSettingItem = (ClipsPreloadedSettingItem) 00k.A0O(this.A05, i);
        if (clipsPreloadedSettingItem != null) {
            doX.A01.setText(clipsPreloadedSettingItem.A06);
            doX.A00.setText(clipsPreloadedSettingItem.A05);
            doX.A03.A0F((AnonymousClass9IV) null, this.A02, clipsPreloadedSettingItem.A04);
            if (this.A00) {
                doX.A02.setChecked(false);
            }
            FPH.A00(doX.itemView, doX, this, clipsPreloadedSettingItem, 18);
        }
    }

    public C46842DmI(Context context, AnonymousClass0iw r3, List list) {
        this.A01 = context;
        this.A02 = r3;
        this.A05 = list;
        this.A04 = AnonymousClass7TE.A1D(list);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(310457046);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(764457, A032);
        return size;
    }

    public final long getItemId(int i) {
        AnonymousClass0fD.A0A(949716301, AnonymousClass0fD.A03(-800633250));
        return 0;
    }
}
