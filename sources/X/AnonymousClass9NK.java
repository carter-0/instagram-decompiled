package X;

import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.9NK  reason: invalid class name */
public final class AnonymousClass9NK extends 03J implements C62320sa {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9NK(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001b;
                case 2: goto L_0x001b;
                case 3: goto L_0x001b;
                case 4: goto L_0x001b;
                case 5: goto L_0x0023;
                case 6: goto L_0x002b;
                case 7: goto L_0x0033;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.1Gs> r3 = X.1Gs.class
            r1 = 0
            java.lang.String r4 = "onFeedCacheRequestSucceeded"
            java.lang.String r5 = "onFeedCacheRequestSucceeded()V"
        L_0x000d:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.85x> r3 = X.C3507185x.class
            r1 = 0
            java.lang.String r4 = "toggleVideoOriginalAudioVolume"
            java.lang.String r5 = "toggleVideoOriginalAudioVolume()V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.8A0> r3 = X.AnonymousClass8A0.class
            r1 = 0
            java.lang.String r4 = "onCompleteRequest"
            java.lang.String r5 = "onCompleteRequest()V"
            goto L_0x000d
        L_0x0023:
            java.lang.Class<X.7Ty> r3 = X.C332177Ty.class
            r1 = 0
            java.lang.String r4 = "isModeActive"
            java.lang.String r5 = "isModeActive()Z"
            goto L_0x000d
        L_0x002b:
            java.lang.Class<X.41v> r3 = X.C2594741v.class
            r1 = 0
            java.lang.String r4 = "createStash"
            java.lang.String r5 = "createStash()Lcom/facebook/stash/extras/StashWithExtras;"
            goto L_0x000d
        L_0x0033:
            java.lang.Class<com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel> r3 = com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel.class
            r1 = 0
            java.lang.String r4 = "deleteSelectedQuickSnap"
            java.lang.String r5 = "deleteSelectedQuickSnap()V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9NK.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ClipsCreationViewModel clipsCreationViewModel;
        switch (this.A00) {
            case 0:
                C3507185x r1 = (C3507185x) this.receiver;
                ClipsAudioStore clipsAudioStore = r1.A01;
                if (AnonymousClass7TE.A04(clipsAudioStore.A0k.getValue()) == 0.0f) {
                    clipsAudioStore.A06(1.0f);
                    clipsCreationViewModel = r1.A02;
                } else {
                    clipsCreationViewModel = r1.A02;
                    ArrayList A05 = clipsCreationViewModel.A0G().A05();
                    if (!(A05 instanceof Collection) || !A05.isEmpty()) {
                        Iterator it = A05.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                AnonymousClass51N r12 = (AnonymousClass51N) it.next();
                                if (r12 instanceof AnonymousClass51M) {
                                    AnonymousClass51M r13 = (AnonymousClass51M) r12;
                                    if (!r13.A0F.A0K && r13.A01 > 0.0f) {
                                        clipsAudioStore.A06(0.0f);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                int size = ((AnonymousClass831) clipsCreationViewModel.A0c.getValue()).A01.size();
                int i = 0;
                while (true) {
                    AnonymousClass836 r0 = clipsCreationViewModel.A0O;
                    if (i >= size) {
                        r0.A02(A1C);
                        break;
                    } else {
                        AnonymousClass51N r02 = (AnonymousClass51N) ((AnonymousClass831) r0.A03.getValue()).A04(i);
                        if (r02 != null) {
                            AnonymousClass51N A06 = r02.A06();
                            if ((A06 instanceof AnonymousClass51M) && ((AnonymousClass51M) A06).A01 == 0.0f) {
                                ((AnonymousClass51M) A06).A01 = 1.0f;
                            }
                            A1C.add(A06);
                        }
                        i++;
                    }
                }
            case 5:
                return Boolean.valueOf(((C332177Ty) this.receiver).CXh());
            case 6:
                return 1L7.A01().A03(1L7.A01().A05(1533050740), "QPSDKCache");
            case 7:
                QuickSnapArchiveViewModel quickSnapArchiveViewModel = (QuickSnapArchiveViewModel) this.receiver;
                List A0a = 00k.A0a((LinkedHashSet) ((C61082JwK) quickSnapArchiveViewModel.A0G.getValue()).A00);
                QuickSnapArchiveViewModel.A02(quickSnapArchiveViewModel);
                AnonymousClass7TE.A1Z(new C66166MGd(quickSnapArchiveViewModel, A0a, (AnonymousClass4D7) null, 26), C318116oQ.A00(quickSnapArchiveViewModel));
                break;
            case 8:
                ((1Gs) this.receiver).A06();
                break;
            default:
                AnonymousClass8A0 r14 = (AnonymousClass8A0) this.receiver;
                r14.A00 = null;
                AnonymousClass8A0.A00(r14);
                break;
        }
        return C60340gF.A00;
    }
}
