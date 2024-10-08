package X;

import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.376  reason: invalid class name */
public final class AnonymousClass376 implements AnonymousClass1qK {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final 1OE A03;
    public final List A04;

    public AnonymousClass376(1OE r3, List list, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = -1;
        this.A03 = r3;
        arrayList.addAll(list);
        this.A01 = z;
        this.A00 = i;
    }

    public AnonymousClass376(Reel reel, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = -1;
        this.A03 = null;
        arrayList.add(reel);
        this.A02 = true;
    }

    public AnonymousClass376(Reel reel) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A00 = -1;
        this.A03 = null;
        arrayList.add(reel);
    }
}
