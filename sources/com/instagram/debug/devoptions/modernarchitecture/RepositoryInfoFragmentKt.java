package com.instagram.debug.devoptions.modernarchitecture;

import X.0fL;
import X.0sL;
import X.0sP;
import X.AnonymousClass5PI;
import X.AnonymousClass5RD;
import X.AnonymousClass5RM;
import X.AnonymousClass5XT;
import X.AnonymousClass5ZZ;
import X.AnonymousClass5aQ;
import X.AnonymousClass6FX;
import X.AnonymousClass6HY;
import X.C284945Oz;
import X.C285245Qk;
import X.C286565Wx;
import X.C286575Wy;
import X.C286625Xd;
import X.C287195Zj;
import X.C287215Zl;
import X.C287425a7;
import X.C287435a8;
import X.C287485aD;
import X.C287595aO;
import X.C287975bA;
import X.C288095bM;
import X.C288165bT;
import X.C304676Et;
import X.C304826Fj;
import X.C41848B3p;
import X.C51965G9l;
import X.C51966G9m;
import X.C51967G9n;
import X.C51968G9o;
import X.C51969G9p;
import X.C51971G9r;
import X.C51972G9s;
import X.C51973G9u;
import X.C51974G9v;
import X.C56151Htd;
import X.C56152Hte;
import X.C56164Htt;
import X.C56663I6s;
import X.C62320sa;
import X.G9t;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel;
import java.util.List;

public abstract class RepositoryInfoFragmentKt {
    public static final void Header(Modifier modifier, C286575Wy r10, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r4 = r10;
        r10.ExV(-1403885503);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r10, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !r10.Bwn()) {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-961245272, "com.instagram.debug.devoptions.modernarchitecture.Header (RepositoryInfoFragment.kt:75)");
            }
            AnonymousClass5ZZ.A0O(r4, modifier2, C51966G9m.A0e(r10), "UserSession scoped Repositories", ((i3 << 3) & 112) | 6, AnonymousClass5aQ.A00(r10).A0L);
            if (0fL.A02()) {
                0fL.A00(1793011538);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RepositoryInfoFragmentKt$Header$1(modifier2, i, i2);
        }
    }

    public static final void RepositoryList(List list, Modifier modifier, C286575Wy r13, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r5 = r13;
        r13.ExV(-311566224);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r13, list) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r13, modifier);
        }
        if ((i3 & 19) != 18 || !r13.Bwn()) {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(545956729, "com.instagram.debug.devoptions.modernarchitecture.RepositoryList (RepositoryInfoFragment.kt:87)");
            }
            C304826Fj r3 = new C304826Fj(0.0f, 4.0f, 0.0f, 4.0f);
            boolean A1Z = C51967G9n.A1Z(r13, list, -900790053);
            Object ECw = r13.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new RepositoryInfoFragmentKt$RepositoryList$1$1(list);
                r13.FLL(ECw);
            }
            C51965G9l.A1X(r13, false);
            AnonymousClass6HY.A03(r3, (LazyListState) null, r5, modifier2, (0sP) ECw, ((i3 >> 3) & 14) | 12583296, 122, true);
            if (0fL.A02()) {
                0fL.A00(308020498);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RepositoryInfoFragmentKt$RepositoryList$2(list, modifier2, i, i2);
        }
    }

    public static final void ExpandableColumn(String str, Modifier modifier, 0sL r26, C286575Wy r27, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r0 = r27;
        r0.ExV(-966988226);
        int i4 = i2;
        int i5 = i2 & 1;
        String str2 = str;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r0, str2) | i;
        } else {
            i3 = i6;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r0, modifier2);
        }
        0sL r28 = r26;
        if ((i4 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0G(r0, r28);
        }
        if ((i3 & 147) != 146 || !r0.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1740630753, "com.instagram.debug.devoptions.modernarchitecture.ExpandableColumn (RepositoryInfoFragment.kt:143)");
            }
            Object A0m = C51967G9n.A0m(r0, -1956361433);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r2 = (C284945Oz) C51974G9v.A0Z(r0, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C285245Qk r10 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, r10);
            C62320sa r9 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r9);
            0sL r8 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0Z, A04, r8);
            0sL r7 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r7, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C304676Et r19 = C304676Et.A00;
            Object A0m2 = C51967G9n.A0m(r0, -1326532576);
            if (A0m2 == obj) {
                A0m2 = new RepositoryInfoFragmentKt$ExpandableColumn$1$1$1(r2);
                r0.FLL(A0m2);
            }
            Modifier A0V = C51969G9p.A0V(A0H, r10, A0m2);
            AnonymousClass5RD A0V2 = C51968G9o.A0V(r0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, A0V);
            C51973G9u.A0z(r0, A0H, r9);
            C287595aO.A00(r0, A0V2, r8);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r7, A002);
            }
            C287595aO.A00(r0, A012, A1K);
            AnonymousClass6FX r6 = AnonymousClass6FX.A00;
            boolean A1W = C51971G9r.A1W(r2);
            int i8 = R.drawable.instagram_chevron_right_pano_outline_16;
            if (A1W) {
                i8 = R.drawable.instagram_chevron_down_outline_16;
            }
            C286575Wy r5 = r0;
            C288165bT.A06(r5, r6.AB1(C287215Zl.A04, r10), C287975bA.A00(r0, i8, 0), (C288095bM) null, "icon to signify whether the row item is expanded", 48, 24, 0);
            int i9 = i3 & 14;
            AnonymousClass5ZZ.A0c(r0, C287195Zj.A07(modifier2, 4.0f), str2, i9, 32764, 0);
            r0.ASN();
            C286575Wy r20 = r0;
            C56663I6s.A05((C56151Htd) null, (C56152Hte) null, r19, r20, C56164Htt.A00(modifier2, 20.0f, 0.0f), (String) null, AnonymousClass5PI.A01(r0, new RepositoryInfoFragmentKt$ExpandableColumn$1$3(r28), -347926608), 1572870, 28, C51971G9r.A1W(r2));
            if (C51967G9n.A1R(r0)) {
                0fL.A00(1154379214);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RepositoryInfoFragmentKt$ExpandableColumn$2(str2, modifier2, r28, i6, i4);
        }
    }

    public static final boolean ExpandableColumn$lambda$2(C284945Oz r0) {
        return C51971G9r.A1W(r0);
    }

    public static final void ExpandableColumn$lambda$3(C284945Oz r0, boolean z) {
        C51967G9n.A16(r0, z);
    }

    public static final void HeaderPreview(C286575Wy r3, int i) {
        r3.ExV(489554936);
        if (i != 0 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2025971415, "com.instagram.debug.devoptions.modernarchitecture.HeaderPreview (RepositoryInfoFragment.kt:166)");
            }
            Header((Modifier) null, r3, 0, 1);
            if (0fL.A02()) {
                0fL.A00(1340260924);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RepositoryInfoFragmentKt$HeaderPreview$1(i);
        }
    }

    public static final void MemoryCacheStats(RepositoryInfoViewModel.MemoryCacheStats memoryCacheStats, Modifier modifier, C286575Wy r9, int i, int i2) {
        int i3;
        C286575Wy r4 = r9;
        r9.ExV(-1258332538);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r9, memoryCacheStats) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r9, modifier);
        }
        if ((i3 & 19) != 18 || !r9.Bwn()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1707852052, "com.instagram.debug.devoptions.modernarchitecture.MemoryCacheStats (RepositoryInfoFragment.kt:112)");
            }
            ExpandableColumn("Memory Cache", (Modifier) null, AnonymousClass5PI.A01(r9, new RepositoryInfoFragmentKt$MemoryCacheStats$1(memoryCacheStats, modifier), -24091347), r4, 390, 2);
            if (0fL.A02()) {
                0fL.A00(1378999784);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RepositoryInfoFragmentKt$MemoryCacheStats$2(memoryCacheStats, modifier, i, i2);
        }
    }

    public static final void RepositoryItem(RepositoryInfoViewModel.RepositoryInfo repositoryInfo, Modifier modifier, C286575Wy r10, int i, int i2) {
        int i3;
        C286575Wy r5 = r10;
        r10.ExV(-1817237141);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r10, repositoryInfo) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r10, modifier);
        }
        if ((i3 & 19) != 18 || !r10.Bwn()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-230361885, "com.instagram.debug.devoptions.modernarchitecture.RepositoryItem (RepositoryInfoFragment.kt:99)");
            }
            ExpandableColumn(repositoryInfo.name, (Modifier) null, AnonymousClass5PI.A01(r10, new RepositoryInfoFragmentKt$RepositoryItem$1(repositoryInfo, modifier), 782474130), r5, 384, 2);
            if (0fL.A02()) {
                0fL.A00(-1871361761);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RepositoryInfoFragmentKt$RepositoryItem$2(repositoryInfo, modifier, i, i2);
        }
    }

    public static final void RepositoryItemPreview(C286575Wy r4, int i) {
        r4.ExV(-1030001432);
        if (i != 0 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1359702806, "com.instagram.debug.devoptions.modernarchitecture.RepositoryItemPreview (RepositoryInfoFragment.kt:172)");
            }
            RepositoryItem(new RepositoryInfoViewModel.RepositoryInfo("TestRepository", "Some extra info", (RepositoryInfoViewModel.MemoryCacheStats) null), (Modifier) null, r4, 0, 2);
            if (0fL.A02()) {
                0fL.A00(-628954269);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new RepositoryInfoFragmentKt$RepositoryItemPreview$1(i);
        }
    }
}
