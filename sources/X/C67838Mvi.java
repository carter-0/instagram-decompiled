package X;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Mvi  reason: case insensitive filesystem */
public final class C67838Mvi extends C249403jg {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C67838Mvi(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.Ott} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x000a
            super.onScrollStateChanged(r8, r9)
            return
        L_0x000a:
            r0 = -207126620(0xfffffffff3a77fa4, float:-2.6541212E31)
            int r5 = X.AnonymousClass7TG.A0D(r8, r0)
            super.onScrollStateChanged(r8, r9)
            if (r9 != 0) goto L_0x00aa
            java.lang.Object r6 = r7.A02
            X.NJv r6 = (X.C68478NJv) r6
            int r1 = X.C68478NJv.A00(r6)
            int r0 = r6.A00
            if (r1 != r0) goto L_0x0047
            X.36N r0 = X.C68478NJv.A03(r6)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0040
            X.MzH r0 = X.C68478NJv.A02(r6)
            if (r0 == 0) goto L_0x0039
            X.NR1 r0 = r0.A00()
            if (r0 == 0) goto L_0x0039
            r0.A0H()
        L_0x0039:
            X.36N r0 = X.C68478NJv.A03(r6)
            r0.A00()
        L_0x0040:
            r0 = 1238352942(0x49cfc42e, float:1702021.8)
        L_0x0043:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0047:
            r6.A00 = r1
            X.2t9 r0 = r6.A0D
            r3 = 0
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "adapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0058:
            X.2tH r0 = r0.A04
            java.util.List r0 = r0.Au8()
            X.0qQ.A07(r0)
            java.lang.Object r1 = X.00k.A0O(r0, r1)
            boolean r0 = r1 instanceof X.C71968Ott
            if (r0 == 0) goto L_0x006c
            r3 = r1
            X.Ott r3 = (X.C71968Ott) r3
        L_0x006c:
            X.GnY r2 = X.C68478NJv.A01(r3, r6)
            X.36N r1 = X.C68478NJv.A03(r6)
            r4 = 0
            if (r3 == 0) goto L_0x00a1
            com.instagram.user.model.User r0 = r3.A00
        L_0x0079:
            r1.A02(r2, r0)
            java.lang.Object r0 = r7.A01
            X.3pI r0 = (X.C252553pI) r0
            int r3 = r0.A0T()
            r2 = 0
        L_0x0085:
            if (r2 >= r3) goto L_0x00a3
            android.view.View r0 = r8.getChildAt(r2)
            if (r0 == 0) goto L_0x009f
            java.lang.Object r1 = r0.getTag()
        L_0x0091:
            boolean r0 = r1 instanceof X.C68050MzH
            if (r0 == 0) goto L_0x009c
            X.MzH r1 = (X.C68050MzH) r1
            if (r1 == 0) goto L_0x009c
            r1.A01()
        L_0x009c:
            int r2 = r2 + 1
            goto L_0x0085
        L_0x009f:
            r1 = r4
            goto L_0x0091
        L_0x00a1:
            r0 = r4
            goto L_0x0079
        L_0x00a3:
            X.36N r0 = X.C68478NJv.A03(r6)
            r0.A00()
        L_0x00aa:
            r0 = -80582865(0xfffffffffb32672f, float:-9.2632165E35)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67838Mvi.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        LinearLayoutManager linearLayoutManager;
        Parcelable parcelable;
        switch (this.A00) {
            case 0:
                i3 = AnonymousClass7TG.A0D(recyclerView, 1723323466);
                super.onScrolled(recyclerView, i, i2);
                C252553pI r2 = recyclerView.A0D;
                if ((r2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r2) != null) {
                    PIF pif = ((C70799OLu) this.A02).A01;
                    if (pif != null) {
                        int itemCount = pif.A00.getItemCount();
                        if (itemCount > 0 && itemCount - linearLayoutManager.A1d() <= 3) {
                            ((C60261JiI) this.A01).A00();
                        }
                        i4 = -331181627;
                        break;
                    } else {
                        0qQ.A0F("userRowsAdapter");
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    i4 = 1388324497;
                    break;
                }
            case 1:
                i3 = AnonymousClass0fD.A03(1679013096);
                KUQ kuq = (KUQ) this.A01;
                C252553pI r0 = ((RecyclerView) this.A02).A0D;
                if (r0 != null) {
                    parcelable = r0.A1M();
                } else {
                    parcelable = null;
                }
                kuq.A00 = parcelable;
                i4 = -788385679;
                break;
            default:
                super.onScrolled(recyclerView, i, i2);
                return;
        }
        AnonymousClass0fD.A0A(i4, i3);
    }
}
