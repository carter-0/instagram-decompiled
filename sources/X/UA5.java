package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public final class UA5 extends 2Rw {
    public List A00 = new ArrayList();
    public final Context A01;

    public final void onBindViewHolder(C249703kE r5, int i) {
        0qQ.A0B(r5, 0);
        VPM vpm = (VPM) this.A00.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            0qQ.A0C(vpm, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.debug.DebugHeaderItem");
            ((UCC) r5).A00.setText(((C16267UrU) vpm).A00);
        } else if (itemViewType != 1) {
            C14858UCm uCm = (C14858UCm) r5;
            0qQ.A0C(vpm, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.debug.DebugInfoItem");
            C16269UrW urW = (C16269UrW) vpm;
            uCm.A01.setText(urW.A01);
            uCm.A00.setText(urW.A00);
            uCm.itemView.setOnLongClickListener(new C18889WBg(2, this, urW));
        } else {
            UCB ucb = (UCB) r5;
            0qQ.A0C(vpm, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.debug.DebugActionItem");
            C16268UrV urV = (C16268UrV) vpm;
            ucb.A00.setText(urV.A00);
            WBC.A00(ucb.itemView, 36, urV);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        if (i == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UCC(DbT.A0D(A0F, viewGroup, R.layout.debug_header_item, false));
        } else if (i == 1) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UCB(DbT.A0D(A0F, viewGroup, R.layout.debug_action_item, false));
        } else if (i == 2) {
            int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C14858UCm(DbT.A0D(A0F, viewGroup, R.layout.debug_info_item, false));
        } else {
            throw new IllegalStateException(C273654mx.A00(62));
        }
    }

    public UA5(Context context) {
        this.A01 = context;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-61288167);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1622931709, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A03 = AnonymousClass0fD.A03(-621281218);
        int intValue = ((VPM) this.A00.get(i)).A00.intValue();
        int i3 = 0;
        if (intValue != 0) {
            i3 = 2;
            if (intValue != 1) {
                i2 = -1735685853;
            } else {
                AnonymousClass0fD.A0A(778922659, A03);
                return 1;
            }
        } else {
            i2 = 695388995;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return i3;
    }
}
