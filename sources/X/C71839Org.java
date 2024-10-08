package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.Org  reason: case insensitive filesystem */
public final class C71839Org implements C267624bv {
    public final /* synthetic */ C314326i1 A00;
    public final /* synthetic */ AnonymousClass27H A01;
    public final /* synthetic */ C70798OLt A02;

    public final void CxF() {
    }

    public final /* synthetic */ void CxR() {
    }

    public C71839Org(C314326i1 r1, AnonymousClass27H r2, C70798OLt oLt) {
        this.A02 = oLt;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void CxD() {
        ArrayList arrayList;
        RecyclerView recyclerView;
        2Rw r0;
        Set A07 = 0sc.A07(new C327627Bo[]{C327627Bo.NUX_TYPE_AVATAR_QR, C327627Bo.NUX_TYPE_AVATAR_STICKER});
        WeakReference weakReference = this.A02.A0A;
        RecyclerView recyclerView2 = (RecyclerView) weakReference.get();
        if (recyclerView2 == null || recyclerView2.A0A == null) {
            arrayList = 0sn.A00;
        } else {
            2HY A0C = C229632nm.A0C(0, recyclerView2.getChildCount());
            arrayList = AnonymousClass7TE.A1C();
            0sh it = A0C.iterator();
            while (it.hasNext()) {
                C249703kE A0Z = recyclerView2.A0Z(recyclerView2.getChildAt(it.A00()));
                if (A0Z instanceof AnonymousClass7PL) {
                    AnonymousClass7PL r3 = (AnonymousClass7PL) A0Z;
                    C331837So r2 = r3.A00;
                    if (r2 instanceof AnonymousClass7LQ) {
                        String A002 = C273654mx.A00(26);
                        0qQ.A0C(r2, A002);
                        if (A07.contains(((AnonymousClass7LQ) r2).A03())) {
                            C331837So r02 = r3.A00;
                            0qQ.A0C(r02, A002);
                            if (r02 != null) {
                                arrayList.add(r02);
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0B(arrayList, 0);
        if (AnonymousClass7CX.A08(arrayList) && (recyclerView = (RecyclerView) weakReference.get()) != null && (r0 = recyclerView.A0A) != null) {
            r0.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (r1 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r4.A05.A00() != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CxG() {
        /*
            r10 = this;
            X.OLt r4 = r10.A02
            com.instagram.avatars.store.AvatarStore r0 = r4.A02
            X.27E r0 = r0.A01
            X.27H r3 = r0.A00
            X.27H r1 = r10.A01
            X.5rf r0 = X.C297385rf.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            r2 = 1
            if (r0 == 0) goto L_0x004e
            X.5vi r0 = X.C299715vi.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x004e
            r1 = 1
            X.OJR r0 = r4.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x004f
        L_0x0024:
            X.6i1 r3 = r10.A00
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x0053
            r0 = 26
            X.GA1 r7 = new X.GA1
            r7.<init>(r0, r4, r2)
            androidx.fragment.app.Fragment r0 = r4.A01
            X.07U r6 = X.07U.A05
            X.07Z r5 = r0.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r5)
            r8 = 0
            r9 = 34
            X.JUk r2 = new X.JUk
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9)
            X.AnonymousClass7TE.A1Z(r2, r0)
            r3.A00()
            return
        L_0x004e:
            r1 = 0
        L_0x004f:
            r2 = 0
            if (r1 == 0) goto L_0x0053
            goto L_0x0024
        L_0x0053:
            r4.A00(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71839Org.CxG():void");
    }
}
