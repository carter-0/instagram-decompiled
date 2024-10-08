package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Hi  reason: invalid class name and case insensitive filesystem */
public abstract class C353368Hi extends 2Rw {
    public int A00 = -1;
    public final Context A01;
    public final List A02 = new ArrayList();
    public final AnonymousClass8DG A03;

    public void A02(int i) {
        A04((String) null, false, false, i);
    }

    public final int A00(String str) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (2PP.A00(((AnonymousClass518) list.get(i)).getId(), str)) {
                return i;
            }
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final AnonymousClass518 A01(int i) {
        if (i < 0) {
            return null;
        }
        List list = this.A02;
        if (i < list.size()) {
            return (AnonymousClass518) list.get(i);
        }
        return null;
    }

    public final void A03(int i) {
        int i2 = this.A00;
        this.A00 = i;
        if (A06(i2) && A06(i)) {
            notifyItemChanged(i2);
            notifyItemChanged(i);
        }
    }

    public final void A04(String str, boolean z, boolean z2, int i) {
        if (z2 || i != this.A00) {
            int i2 = this.A00;
            this.A00 = i;
            if (A06(i2)) {
                notifyItemChanged(i2);
            }
            if (A06(i)) {
                notifyItemChanged(this.A00);
                this.A03.DBj((AnonymousClass518) this.A02.get(i), str, i, z);
                return;
            }
            0kD.A01("SelectableEffectAdapter", 002.A0O("New selected position is invalid newPosition=", i));
        }
    }

    public final void A05(List list) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public final boolean A06(int i) {
        if (this instanceof C353338Hf) {
            PickerConfiguration pickerConfiguration = ((C353338Hf) this).A00;
            if (pickerConfiguration == null || i < 0 || i >= pickerConfiguration.mItems.length) {
                return false;
            }
            return true;
        } else if (i == Integer.MIN_VALUE || i < 0 || i >= this.A02.size()) {
            return false;
        } else {
            return true;
        }
    }

    public C353368Hi(Context context, AnonymousClass8DG r3) {
        this.A03 = r3;
        this.A01 = context;
    }

    public int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1639645817);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-1545536640, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(-538096919);
        long parseLong = Long.parseLong(((AnonymousClass518) this.A02.get(i)).getId());
        AnonymousClass0fD.A0A(-587696357, A032);
        return parseLong;
    }
}
