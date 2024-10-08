package com.instagram.debug.devoptions.modernarchitecture;

import X.0Yg;
import X.0fL;
import X.0sL;
import X.AnonymousClass5PI;
import X.AnonymousClass5RD;
import X.AnonymousClass5RM;
import X.AnonymousClass6FW;
import X.AnonymousClass7TE;
import X.C270284gU;
import X.C285245Qk;
import X.C286565Wx;
import X.C286575Wy;
import X.C287195Zj;
import X.C287215Zl;
import X.C287275Zs;
import X.C287425a7;
import X.C287435a8;
import X.C287485aD;
import X.C291495hO;
import X.C304846Fl;
import X.C51965G9l;
import X.C51966G9m;
import X.C51967G9n;
import X.C51971G9r;
import X.C51972G9s;
import X.C51973G9u;
import X.C56618I4t;
import X.C60340gF;
import androidx.compose.ui.Modifier;
import java.util.List;

public final class RepositoryInfoFragment$onCreateView$1 extends 0Yg implements 0sL {
    public final /* synthetic */ RepositoryInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragment$onCreateView$1(RepositoryInfoFragment repositoryInfoFragment) {
        super(2);
        this.this$0 = repositoryInfoFragment;
    }

    public final void invoke(C286575Wy r4, int i) {
        if ((i & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1811619311, "com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoFragment.onCreateView.<anonymous> (RepositoryInfoFragment.kt:62)");
            }
            final C270284gU A02 = AnonymousClass6FW.A02(r4, this.this$0.getViewModel().repositories, 0);
            C304846Fl.A04(r4, AnonymousClass5PI.A01(r4, new 0sL() {
                public final void invoke(C286575Wy r17, int i) {
                    C286575Wy r9 = r17;
                    if ((i & 3) != 2 || !r9.Bwn()) {
                        if (0fL.A02()) {
                            0fL.A01(-877867505, "com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoFragment.onCreateView.<anonymous>.<anonymous> (RepositoryInfoFragment.kt:64)");
                        }
                        C270284gU r5 = C270284gU.this;
                        C285245Qk r8 = Modifier.A00;
                        AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r9, C287215Zl.A02, 0);
                        int A00 = C287425a7.A00(r9);
                        C286565Wx r6 = (C286565Wx) r9;
                        AnonymousClass5RM A04 = C286565Wx.A04(r6);
                        Modifier A01 = C287435a8.A01(r9, r8);
                        C51973G9u.A0y(r9, r6);
                        C51971G9r.A12(r9, A02, A04);
                        0sL r1 = C287485aD.A02;
                        if (r6.A0K || !C51972G9s.A1Q(r9, A00)) {
                            C51971G9r.A13(r9, r1, A00);
                        }
                        C51965G9l.A18(r9, A01);
                        RepositoryInfoFragmentKt.Header(C287195Zj.A0B(C51966G9m.A0T(r8), 0.0f, 12.0f, 0.0f, 12.0f), r9, 6, 0);
                        C56618I4t.A02(r9, (Modifier) null, 1.0f, 384, 1, C51965G9l.A0A(r9));
                        RepositoryInfoFragmentKt.RepositoryList((List) r5.getValue(), (Modifier) null, r9, 0, 2);
                        if (C51967G9n.A1R(r9)) {
                            0fL.A00(-852885310);
                            return;
                        }
                        return;
                    }
                    r9.Evl();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C286575Wy) obj, AnonymousClass7TE.A0M(obj2));
                    return C60340gF.A00;
                }
            }, -1002835833));
            if (0fL.A02()) {
                0fL.A00(1276607497);
                return;
            }
            return;
        }
        r4.Evl();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C286575Wy) obj, AnonymousClass7TE.A0M(obj2));
        return C60340gF.A00;
    }
}
