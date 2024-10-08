package X;

import com.facebook.common.draggableview.DraggableViewContainer;
import java.util.ArrayList;

/* renamed from: X.TtJ  reason: case insensitive filesystem */
public abstract class C14285TtJ implements C20991X8n {
    public final /* synthetic */ void Dtr(C14284TtI ttI, boolean z) {
        if (this instanceof UF1) {
            UF5 uf5 = ((UF1) this).A00;
            if (!uf5.A04) {
                uf5.A0K();
                uf5.A04 = true;
            }
        } else if (this instanceof UF2) {
            UF2 uf2 = (UF2) this;
            if (1 - uf2.A00 == 0) {
                ((DraggableViewContainer) uf2.A01).A06++;
            }
        } else if (this instanceof UF8) {
            UF8 uf8 = (UF8) this;
            Object obj = uf8.A01;
            if (obj != null) {
                uf8.A00.A0O(obj, uf8.A03, (ArrayList) null);
            }
            Object obj2 = uf8.A02;
            if (obj2 != null) {
                uf8.A00.A0O(obj2, uf8.A04, (ArrayList) null);
            }
        }
    }

    public void Dtl(C14284TtI ttI) {
        if (this instanceof UF2) {
            UF2 uf2 = (UF2) this;
            if (uf2.A00 != 0) {
                DraggableViewContainer draggableViewContainer = (DraggableViewContainer) uf2.A01;
                draggableViewContainer.A06--;
                DraggableViewContainer.A07(draggableViewContainer, false);
                return;
            }
            UF5 uf5 = (UF5) uf2.A01;
            uf5.A02.remove(ttI);
            if (!uf5.A0Z()) {
                C14284TtI.A04(XA8.A00, uf5, uf5, false);
                uf5.A0K = true;
                C14284TtI.A04(XA8.A01, uf5, uf5, false);
            }
        } else if (this instanceof UF7) {
            UF7 uf7 = (UF7) this;
            VJL.A00(uf7.A01, false);
            uf7.A00 = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.UF1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.UF3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.UF7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.UF3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.UF3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.UF3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.UF3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.UF3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.UF3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dtm(X.C14284TtI r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.UF7
            if (r0 == 0) goto L_0x0015
            r2 = r3
            X.UF7 r2 = (X.UF7) r2
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r2.A01
            r0 = 0
            X.VJL.A00(r1, r0)
        L_0x0011:
            r4.A0B(r2)
        L_0x0014:
            return
        L_0x0015:
            boolean r0 = r3 instanceof X.UF1
            if (r0 == 0) goto L_0x002d
            r2 = r3
            X.UF1 r2 = (X.UF1) r2
            X.UF5 r1 = r2.A00
            int r0 = r1.A01
            int r0 = r0 + -1
            r1.A01 = r0
            if (r0 != 0) goto L_0x0011
            r0 = 0
            r1.A04 = r0
            r1.A0J()
            goto L_0x0011
        L_0x002d:
            boolean r0 = r3 instanceof X.UF3
            if (r0 == 0) goto L_0x0054
            r2 = r3
            X.UF3 r2 = (X.UF3) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r2.A02
            X.TtI r0 = (X.C14284TtI) r0
            r0.A0H()
            goto L_0x0011
        L_0x0040:
            java.lang.Object r1 = r2.A02
            X.01r r1 = (X.01r) r1
            java.lang.Object r0 = r2.A01
            X.TtM r0 = (X.C14288TtM) r0
            android.view.ViewGroup r0 = r0.A00
            java.lang.Object r0 = r1.get(r0)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.remove(r4)
            goto L_0x0011
        L_0x0054:
            boolean r0 = r3 instanceof X.UF2
            if (r0 == 0) goto L_0x0070
            r1 = r3
            X.UF2 r1 = (X.UF2) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0014
            java.lang.Object r1 = r1.A01
            com.facebook.common.draggableview.DraggableViewContainer r1 = (com.facebook.common.draggableview.DraggableViewContainer) r1
            int r0 = r1.A06
            int r0 = r0 + -1
            r1.A06 = r0
            r0 = 0
            com.facebook.common.draggableview.DraggableViewContainer.A07(r1, r0)
            return
        L_0x0070:
            boolean r0 = r3 instanceof X.UF8
            if (r0 == 0) goto L_0x0014
            r4.A0B(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14285TtJ.Dtm(X.TtI):void");
    }

    public final void Dtn(C14284TtI ttI) {
        if (this instanceof UF7) {
            VJL.A00(((UF7) this).A01, false);
        }
    }

    public final void Dtp(C14284TtI ttI) {
        if (this instanceof UF7) {
            VJL.A00(((UF7) this).A01, true);
        }
    }
}
