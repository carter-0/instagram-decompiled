package X;

import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Deprecated;

/* renamed from: X.2ku  reason: invalid class name and case insensitive filesystem */
public final class C228172ku extends C249383je {
    public final ArrayList A00 = new ArrayList();
    public final ArrayList A01 = new ArrayList();
    public final ArrayList A02 = new ArrayList();

    @Deprecated(message = "")
    public final void A01(AbsListView.OnScrollListener onScrollListener) {
        0qQ.A0B(onScrollListener, 0);
        ArrayList arrayList = this.A00;
        if (!arrayList.contains(onScrollListener)) {
            arrayList.add(onScrollListener);
        }
    }

    @Deprecated(message = "")
    public final void A02(C249403jg r3) {
        0qQ.A0B(r3, 0);
        ArrayList arrayList = this.A01;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    public final void A03(C249383je r3) {
        0qQ.A0B(r3, 0);
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    public final void A00() {
        this.A00.clear();
        this.A01.clear();
        this.A02.clear();
    }

    public final void onScroll(C238133Ar r24, int i, int i2, int i3, int i4, int i5) {
        int A03 = AnonymousClass0fD.A03(-751738089);
        C238133Ar r10 = r24;
        0qQ.A0B(r10, 0);
        ViewGroup CEd = r10.CEd();
        0qQ.A07(CEd);
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        if (r10.CWN()) {
            ArrayList arrayList = this.A00;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i11 = size - 1;
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) arrayList.get(size);
                    0qQ.A0A(onScrollListener);
                    Class<?> cls = onScrollListener.getClass();
                    String name = CEd.getClass().getName();
                    0qQ.A07(name);
                    0qQ.A0B(cls, 0);
                    int ExL = AnonymousClass2Rr.A00.ExL(cls, name);
                    onScrollListener.onScroll((AbsListView) CEd, i6, i7, i8);
                    AnonymousClass2Rr.A00.ASO(ExL);
                    if (i11 < 0) {
                        break;
                    }
                    size = i11;
                }
            }
        } else {
            ArrayList arrayList2 = this.A01;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i12 = size2 - 1;
                    Object obj = arrayList2.get(size2);
                    0qQ.A07(obj);
                    C249403jg r12 = (C249403jg) obj;
                    Class<?> cls2 = r12.getClass();
                    String name2 = CEd.getClass().getName();
                    0qQ.A07(name2);
                    0qQ.A0B(cls2, 0);
                    int ExL2 = AnonymousClass2Rr.A00.ExL(cls2, name2);
                    r12.onScrolled((RecyclerView) CEd, i9, i10);
                    AnonymousClass2Rr.A00.ASO(ExL2);
                    if (i12 < 0) {
                        break;
                    }
                    size2 = i12;
                }
            }
        }
        ArrayList arrayList3 = this.A02;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i13 = size3 - 1;
                Object obj2 = arrayList3.get(size3);
                0qQ.A07(obj2);
                C249383je r11 = (C249383je) obj2;
                Class<?> cls3 = r11.getClass();
                String name3 = CEd.getClass().getName();
                0qQ.A07(name3);
                0qQ.A0B(cls3, 0);
                int ExL3 = AnonymousClass2Rr.A00.ExL(cls3, name3);
                int i14 = i7;
                int i15 = i6;
                C238133Ar r17 = r10;
                C249383je r16 = r11;
                r16.onScroll(r17, i15, i14, i8, i9, i10);
                AnonymousClass2Rr.A00.ASO(ExL3);
                if (i13 < 0) {
                    break;
                }
                size3 = i13;
            }
        }
        AnonymousClass0fD.A0A(-1820687610, A03);
    }

    public final void onScrollStateChanged(C238133Ar r10, int i) {
        int A03 = AnonymousClass0fD.A03(305212597);
        0qQ.A0B(r10, 0);
        ViewGroup CEd = r10.CEd();
        0qQ.A07(CEd);
        if (r10.CWN()) {
            ArrayList arrayList = this.A00;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) arrayList.get(size);
                    0qQ.A0A(onScrollListener);
                    Class<?> cls = onScrollListener.getClass();
                    String name = CEd.getClass().getName();
                    0qQ.A07(name);
                    0qQ.A0B(cls, 0);
                    int ExM = AnonymousClass2Rr.A00.ExM(cls, name, i);
                    onScrollListener.onScrollStateChanged((AbsListView) CEd, i);
                    AnonymousClass2Rr.A00.ASP(ExM);
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
        } else {
            ArrayList arrayList2 = this.A01;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    Object obj = arrayList2.get(size2);
                    0qQ.A07(obj);
                    C249403jg r3 = (C249403jg) obj;
                    Class<?> cls2 = r3.getClass();
                    String name2 = CEd.getClass().getName();
                    0qQ.A07(name2);
                    0qQ.A0B(cls2, 0);
                    int ExM2 = AnonymousClass2Rr.A00.ExM(cls2, name2, i);
                    r3.onScrollStateChanged((RecyclerView) CEd, i);
                    AnonymousClass2Rr.A00.ASP(ExM2);
                    if (i3 < 0) {
                        break;
                    }
                    size2 = i3;
                }
            }
        }
        ArrayList arrayList3 = this.A02;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i4 = size3 - 1;
                Object obj2 = arrayList3.get(size3);
                0qQ.A07(obj2);
                Class<?> cls3 = obj2.getClass();
                String name3 = CEd.getClass().getName();
                0qQ.A07(name3);
                0qQ.A0B(cls3, 0);
                int ExM3 = AnonymousClass2Rr.A00.ExM(cls3, name3, i);
                ((C249383je) arrayList3.get(size3)).onScrollStateChanged(r10, i);
                AnonymousClass2Rr.A00.ASP(ExM3);
                if (i4 < 0) {
                    break;
                }
                size3 = i4;
            }
        }
        AnonymousClass0fD.A0A(-1268534572, A03);
    }
}
