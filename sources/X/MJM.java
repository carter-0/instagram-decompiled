package X;

import androidx.paging.AsyncPagingDataDiffer$differBase$1;
import java.util.List;

public final class MJM extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AsyncPagingDataDiffer$differBase$1 A02;
    public final /* synthetic */ MRP A03;
    public final /* synthetic */ LP3 A04;
    public final /* synthetic */ LP3 A05;
    public final /* synthetic */ C64332La7 A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ 0r1 A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJM(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, MRP mrp, LP3 lp3, LP3 lp32, C64332La7 la7, List list, 0r1 r8, int i, int i2) {
        super(0);
        this.A02 = asyncPagingDataDiffer$differBase$1;
        this.A06 = la7;
        this.A08 = r8;
        this.A03 = mrp;
        this.A04 = lp3;
        this.A07 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = lp32;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.A02;
        asyncPagingDataDiffer$differBase$1.A01 = this.A06;
        this.A08.A00 = true;
        MRP mrp = this.A03;
        asyncPagingDataDiffer$differBase$1.A00 = mrp;
        LP3 lp3 = this.A04;
        List list = this.A07;
        int i = this.A01;
        int i2 = this.A00;
        LP3 lp32 = this.A05;
        if (C62914KoS.A00 != null && JTO.A1b(3)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Presenting data:\n                            |   first item: ");
            LRX lrx = (LRX) 00k.A0J(list);
            Object obj2 = null;
            if (lrx != null) {
                obj = 00k.A0J(lrx.A01);
            } else {
                obj = null;
            }
            A1A.append(obj);
            A1A.append("\n                            |   last item: ");
            LRX lrx2 = (LRX) 00k.A0L(list);
            if (lrx2 != null) {
                obj2 = 00k.A0L(lrx2.A01);
            }
            A1A.append(obj2);
            A1A.append("\n                            |   placeholdersBefore: ");
            A1A.append(i);
            A1A.append("\n                            |   placeholdersAfter: ");
            A1A.append(i2);
            A1A.append("\n                            |   hintReceiver: ");
            A1A.append(mrp);
            A1A.append("\n                            |   sourceLoadStates: ");
            A1A.append(lp32);
            0rw.A0u(002.A0R(JTT.A0o(lp3, "\n                        ", A1A), "|)"), "|");
        }
        return C60340gF.A00;
    }
}
