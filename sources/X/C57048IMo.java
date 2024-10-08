package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IMo  reason: case insensitive filesystem */
public final class C57048IMo implements AnonymousClass32U {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public C57048IMo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DW8(int i, int i2) {
        Integer num;
        C230292pL r1;
        View view;
        int i3;
        switch (this.A00) {
            case 0:
                C227232is r2 = (C227232is) this.A01;
                AnonymousClass0eM r12 = r2.A0u;
                C230292pL r0 = (C230292pL) r12.getValue();
                if (r0 != null && (num = r0.A00) != null && num.intValue() == i2 && (r1 = (C230292pL) r12.getValue()) != null) {
                    GBE gbe = r2.A09;
                    if (gbe == null) {
                        0qQ.A0F("clipsViewerFragmentViewModel");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        r1.A01(gbe.A1D.A00);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                C52185GIb.A00((C52185GIb) this.A01, i);
                return;
            case 5:
                GDW gdw = ((GC7) this.A01).A01;
                if (gdw != null) {
                    if (i == 0 || i > i2) {
                        view = gdw.A02;
                        if (view != null) {
                            i3 = 8;
                        }
                        gdw.A01 = true;
                        return;
                    }
                    view = gdw.A02;
                    if (view != null) {
                        i3 = 0;
                    }
                    gdw.A01 = true;
                    return;
                    view.setVisibility(i3);
                    gdw.A01 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void DWA(int i, int i2) {
        switch (this.A00) {
            case 4:
                C52196GIn gIn = (C52196GIn) this.A01;
                UserSession userSession = gIn.A08;
                0Tu A0H = AnonymousClass7TF.A0H(userSession);
                boolean z = false;
                if ((182.A06(A0H, userSession, 36325918562465146L) || 182.A06(A0H, userSession, 36325918562530683L)) && i == 0) {
                    z = true;
                }
                if (!182.A06(A0H, userSession, 36323427480775835L) && (!182.A06(A0H, userSession, 36318509746690249L) || !gIn.A0E.A0D())) {
                    C52009GBg gBg = gIn.A0D.A0A;
                    if (i != gBg.A0A() - 2 || gBg.A0E(gBg.A0A() - 1).A01 != C295365o2.GHOST) {
                        return;
                    }
                    if (i <= 0) {
                        if (C52191GIi.A00.A00(gIn.A07, userSession, gIn.A0G, gIn.A0E.A0D()) || 182.A06(A0H, userSession, 36317861203285618L)) {
                            return;
                        }
                    }
                } else if (i == i2 + 1) {
                    C52009GBg gBg2 = gIn.A0D.A0A;
                    if (i == gBg2.A0A() - 1 && gBg2.A0E(gBg2.A0A() - 1).A01 == C295365o2.GHOST && i > 1) {
                        long A002 = (long) 182.A00(A0H, userSession, 37167852411027912L);
                        if (A002 > 0) {
                            C262204Co r0 = gIn.A01;
                            if (r0 == null || !r0.isActive()) {
                                gIn.A01 = C51966G9m.A1L(new MGJ(gIn, (AnonymousClass4D7) null, A002, z), gIn.A0K);
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                gIn.A0C((C62320sa) null, (C62320sa) null, z);
                return;
            case 6:
                C53067Gi0 gi0 = ((HK4) this.A01).A00;
                if (gi0 == null) {
                    0qQ.A0F("clipsViewerDebugOverlayAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                gi0.A00 = i;
                gi0.notifyDataSetChanged();
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void DWY() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r3 = X.AnonymousClass37D.A00;
        r2 = r2.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void DhG(float r7, float r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 2: goto L_0x0040;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r6.A01
            X.GC7 r0 = (X.GC7) r0
            X.GDW r1 = r0.A01
            if (r1 == 0) goto L_0x0005
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0005
            X.GDV r2 = r1.A03
            float r7 = r7 - r8
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A02
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r0.A0K
            if (r0 == 0) goto L_0x003e
            java.lang.Integer r1 = r0.A09
        L_0x001d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0005
            X.37E r3 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r2 = r2.A01
            X.37D r0 = r3.A01(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0005
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r1) goto L_0x0005
            X.37D r4 = r3.A01(r2)
            if (r4 == 0) goto L_0x0005
            double r2 = (double) r7
            double r0 = -r2
            r4.A0E(r0)
            return
        L_0x003e:
            r1 = 0
            goto L_0x001d
        L_0x0040:
            java.lang.Object r5 = r6.A01
            X.GE5 r5 = (X.GE5) r5
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0005
            r4 = 0
            r3 = 1
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            boolean r2 = X.AnonymousClass7TF.A1R(r0)
            int r1 = r5.A02
            int r0 = r5.A03
            if (r1 <= r0) goto L_0x0057
            r4 = 1
        L_0x0057:
            if (r2 == 0) goto L_0x0005
            if (r4 != 0) goto L_0x0005
            X.JwK r0 = r5.A0O
            java.lang.Object r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0005
            X.0sa r0 = r5.A0U
            java.lang.Object r1 = r0.invoke()
            X.GBj r1 = (X.C52012GBj) r1
            int r0 = r5.A02
            r1.A0I(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57048IMo.DhG(float, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r3 = X.AnonymousClass37D.A00;
        r2 = r2.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void DhU(java.lang.Integer r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 3: goto L_0x004b;
                case 4: goto L_0x0005;
                case 5: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r1 = 0
            int r0 = X.C51967G9n.A03(r6, r1)
            if (r0 != r1) goto L_0x0005
            java.lang.Object r0 = r5.A01
            X.GC7 r0 = (X.GC7) r0
            X.GDW r4 = r0.A01
            if (r4 == 0) goto L_0x0005
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0041
            X.GDV r2 = r4.A03
            com.instagram.clips.intf.ClipsViewerConfig r0 = r2.A02
            com.instagram.clips.intf.ClipsWatchAndBrowseData r0 = r0.A0K
            if (r0 == 0) goto L_0x0049
            java.lang.Integer r1 = r0.A09
        L_0x0023:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0041
            X.37E r3 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r2 = r2.A01
            X.37D r0 = r3.A01(r2)
            r1 = 1
            if (r0 == 0) goto L_0x0041
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r1) goto L_0x0041
            X.37D r0 = r3.A01(r2)
            if (r0 == 0) goto L_0x0041
            r0.A0A()
        L_0x0041:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0005
            r0 = 1
            r4.A00 = r0
            return
        L_0x0049:
            r1 = 0
            goto L_0x0023
        L_0x004b:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 == r0) goto L_0x0057
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r6 != r0) goto L_0x0005
        L_0x0057:
            java.lang.Object r2 = r5.A01
            X.GD0 r2 = (X.GD0) r2
            android.os.Handler r1 = r2.A02
            java.lang.Runnable r0 = r2.A06
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r2.A07
            r1.removeCallbacks(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57048IMo.DhU(java.lang.Integer):void");
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }
}
