package X;

import java.util.ArrayList;
import java.util.List;

public final class NPF extends AnonymousClass4AA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass0iw A04;
    public final String A05;
    public final String A06 = "";
    public final ArrayList A07;
    public final List A08;
    public final List A09;

    public NPF(AnonymousClass0iw r3, String str, ArrayList arrayList, List list, List list2, int i, int i2, int i3) {
        this.A07 = arrayList;
        this.A08 = list;
        this.A09 = list2;
        this.A05 = str;
        this.A00 = 29;
        this.A01 = i;
        this.A02 = i3;
        this.A03 = i2;
        this.A04 = r3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        NPF npf = (NPF) obj;
        if (!this.A07.equals(npf.A07) || !this.A08.equals(npf.A08) || !this.A09.equals(npf.A09) || !2Ob.A00(this.A06, npf.A06) || !2Ob.A00(this.A05, npf.A05) || this.A00 != npf.A00 || this.A01 != npf.A01 || this.A03 != npf.A03 || this.A02 != npf.A02 || !this.A04.equals(npf.A04)) {
            return false;
        }
        return true;
    }
}
