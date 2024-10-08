package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Wab  reason: case insensitive filesystem */
public final class C19489Wab implements C230222pE {
    public final int A00;
    public final Object A01;

    public C19489Wab(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        X.0fE.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        r0 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DFj(com.instagram.model.reels.Reel r3, X.AnonymousClass6UY r4) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0039;
                case 2: goto L_0x0005;
                case 3: goto L_0x0078;
                case 4: goto L_0x0005;
                case 5: goto L_0x00a8;
                case 6: goto L_0x009e;
                case 7: goto L_0x0094;
                case 8: goto L_0x0045;
                case 9: goto L_0x002d;
                case 10: goto L_0x0021;
                case 11: goto L_0x0015;
                case 12: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r2.A01
            X.Ubu r0 = (X.C15391Ubu) r0
            X.7Ph r1 = r0.A00
            r0 = 836368774(0x31d9f986, float:6.3438987E-9)
            goto L_0x0054
        L_0x0015:
            java.lang.Object r0 = r2.A01
            X.Ubw r0 = (X.C15393Ubw) r0
            X.Ud8 r1 = r0.A06
            if (r1 == 0) goto L_0x008a
            r0 = -56017134(0xfffffffffca93f12, float:-7.030219E36)
            goto L_0x0054
        L_0x0021:
            java.lang.Object r0 = r2.A01
            X.Ubx r0 = (X.C15394Ubx) r0
            X.Ud7 r1 = r0.A06
            if (r1 == 0) goto L_0x008a
            r0 = -200687730(0xfffffffff409bf8e, float:-4.3654166E31)
            goto L_0x0054
        L_0x002d:
            java.lang.Object r0 = r2.A01
            X.Ubv r0 = (X.C15392Ubv) r0
            X.Ud5 r1 = r0.A05
            if (r1 == 0) goto L_0x008a
            r0 = 776050553(0x2e419779, float:4.4017654E-11)
            goto L_0x0054
        L_0x0039:
            java.lang.Object r0 = r2.A01
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r0 = (com.instagram.genericsurvey.fragment.GenericSurveyFragment) r0
            X.UdD r1 = r0.A05
            if (r1 == 0) goto L_0x008a
            r0 = 421440318(0x191eab3e, float:8.202991E-24)
            goto L_0x0054
        L_0x0045:
            java.lang.Object r1 = r2.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r1 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r1
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x000a
            X.TzX r1 = r1.mListAdapter
            r0 = 299764765(0x11de0c1d, float:3.503289E-28)
        L_0x0054:
            X.0fE.A00(r1, r0)
            return
        L_0x0058:
            java.lang.Object r1 = r2.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r1 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r1
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x000a
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment.A02(r1)
            X.Ugy r0 = r1.A01
            X.TsA r0 = r0.A03
            X.C14227TsA.A00(r0)
            androidx.fragment.app.Fragment r0 = r1.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r0
            X.WPk r0 = r0.mMapChromeController
            r0.A03()
            return
        L_0x0078:
            java.lang.Object r0 = r2.A01
            X.UbF r0 = (X.C15363UbF) r0
            X.UdQ r0 = r0.A02
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "searchAdapter"
            goto L_0x008c
        L_0x0083:
            r0.A01()
            r0.updateListView()
            return
        L_0x008a:
            java.lang.String r0 = "adapter"
        L_0x008c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0094:
            java.lang.Object r0 = r2.A01
            X.WZr r0 = (X.C19443WZr) r0
            X.UbD r0 = r0.A00
            X.C15361UbD.A00(r0)
            return
        L_0x009e:
            java.lang.Object r0 = r2.A01
            X.WZq r0 = (X.C19442WZq) r0
            X.UbE r0 = r0.A00
            X.C15362UbE.A00(r0)
            return
        L_0x00a8:
            java.lang.Object r0 = r2.A01
            X.Tqa r0 = (X.C14140Tqa) r0
            X.X42 r0 = r0.A02
            r0.Dcm()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19489Wab.DFj(com.instagram.model.reels.Reel, X.6UY):void");
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }
}
