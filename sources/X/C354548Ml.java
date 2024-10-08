package X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Ml  reason: invalid class name and case insensitive filesystem */
public final class C354548Ml implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354548Ml(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C2802350v r5;
        AnonymousClass80U r1;
        Object obj2;
        Object obj3;
        C391959tx r52 = (C391959tx) obj;
        0qQ.A0B(r52, 0);
        AnonymousClass8ME r2 = this.A00;
        if (r52 instanceof C388519nx) {
            boolean z = r2.A0P;
            AnonymousClass80U r3 = r2.A1B;
            if (z) {
                r3.E3H(new Object());
                r2.A0P = false;
            } else {
                r3.E3H(new Object());
                View view = r2.A04;
                if (view != null) {
                    view.setVisibility(0);
                }
                Drawable A002 = r2.A1I.A00();
                if (A002 != null) {
                    r2.A1m.A0s(A002, false);
                }
            }
            AnonymousClass8ME.A0e(r2, false);
            return;
        }
        if (r52 instanceof C388529ny) {
            r2.A1B.E3H(new Object());
            View view2 = r2.A04;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            Drawable A003 = r2.A1I.A00();
            if (A003 != null) {
                r2.A1m.A0s(A003, true);
            }
        } else if (r52 instanceof C388539nz) {
            AnonymousClass80U r32 = r2.A1B;
            if (r32.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                r2.A0P = true;
            }
            r32.E3H(new Object());
            View view3 = r2.A04;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            if (r52 instanceof C388469ns) {
                r1 = r2.A1B;
                if (r1.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                    obj2 = new Object();
                } else {
                    obj2 = new Object();
                }
            } else if (r52 instanceof C388489nu) {
                AnonymousClass80U r4 = r2.A1B;
                if (r4.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                    r2.A1F(r2.A10());
                    return;
                } else if (r4.CQ0(AnonymousClass80V.CLIPS_EDITOR)) {
                    AnonymousClass8ME.A0e(r2, true);
                    Drawable drawable = ((C388489nu) r52).A00;
                    if (drawable != null) {
                        r2.A1m.A0s(drawable, true);
                        obj3 = new Object();
                    } else {
                        obj3 = new Object();
                    }
                    r4.E3H(obj3);
                    return;
                } else {
                    return;
                }
            } else if (r52 instanceof C388459nr) {
                AnonymousClass8ME.A0e(r2, true);
                r1 = r2.A1B;
                if (r1.CQ0(AnonymousClass80V.MEDIA_EDIT)) {
                    obj2 = new Object();
                } else {
                    obj2 = new Object();
                }
            } else if (r52 instanceof C388509nw) {
                C388509nw r53 = (C388509nw) r52;
                Drawable drawable2 = r53.A01;
                int i = r53.A00;
                boolean z2 = drawable2 instanceof AnonymousClass5MH;
                if (z2) {
                    r5 = ((AnonymousClass5MH) drawable2).BzV();
                } else {
                    r5 = null;
                }
                if (r5 instanceof AnonymousClass5JL) {
                    AnonymousClass5JL r54 = (AnonymousClass5JL) r5;
                    AnonymousClass513 r42 = r54.A02;
                    0qQ.A0A(r42);
                    C2802350v A004 = r42.A00();
                    if (A004 instanceof C2802250u) {
                        C306386Ly A02 = C39900AIi.A02(r2.A0f, r2.A0r, r2.A05, (C2802250u) A004);
                        C310416b1 r13 = new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, !(A02 instanceof AnonymousClass91c), true, true, true, true, true, false, false);
                        InteractiveDrawableContainer interactiveDrawableContainer = r2.A1m;
                        C369458un A0O = interactiveDrawableContainer.A0O(drawable2);
                        0qQ.A0C(drawable2, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.timedstickers.TimedStickerDrawable");
                        AnonymousClass5MH r33 = (AnonymousClass5MH) drawable2;
                        int i2 = r33.A01;
                        int i3 = r33.A00;
                        AnonymousClass5MH r6 = new AnonymousClass5MH(r33, r54, A02);
                        r6.Eog(i, i3);
                        r33.Eog(i2, i - 1);
                        if (z2) {
                            r6.A0A.setCallback(AnonymousClass8ME.A0C(r6, r2, r13));
                            int A0K = interactiveDrawableContainer.A0K(r6, r13, C306406Ma.A0A(r6), false, false);
                            if (A0O != null) {
                                AEV.A01(A0O, InteractiveDrawableContainer.A02(interactiveDrawableContainer, A0K));
                            }
                            AnonymousClass0eK r12 = r2.A1t;
                            r12.getClass();
                            ClipsCreationViewModel clipsCreationViewModel = ((C359318cb) r12.get()).A0s;
                            0eP r43 = new 0eP(r33, r6);
                            ClipsCreationViewModel.A03(C359548d5.STICKER_TEXT_SPLIT, clipsCreationViewModel, true);
                            C3500783d r34 = clipsCreationViewModel.A0N;
                            List list = r34.A02;
                            list.add(r43.A01);
                            r34.A0C.Epw(new ArrayList(list));
                            r34.A08.FIA(r43);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (r52 instanceof C388499nv) {
                Drawable drawable3 = ((C388499nv) r52).A00;
                if (drawable3 instanceof AnonymousClass5MH) {
                    AnonymousClass5MH r8 = (AnonymousClass5MH) drawable3;
                    if (r8.A0A instanceof C306386Ly) {
                        AnonymousClass5JL r7 = (AnonymousClass5JL) r8.BzV();
                        AnonymousClass513 r35 = r7.A02;
                        0qQ.A0A(r35);
                        C2802350v A005 = r35.A00();
                        if (A005 instanceof C2802250u) {
                            C306386Ly A022 = C39900AIi.A02(r2.A0f, r2.A0r, r2.A05, (C2802250u) A005);
                            C358368an r9 = (C358368an) r2.A1e.get();
                            r9.A1r.put(A022, Float.valueOf(1.0f));
                            r9.A1q.put(A022, new PointF(0.5f, 0.5f));
                            Integer num = AnonymousClass05K.A00;
                            C310416b1 r92 = new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) "StickerOverlayController", (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, !(A022 instanceof AnonymousClass91c), true, true, true, true, true, false, false);
                            InteractiveDrawableContainer interactiveDrawableContainer2 = r2.A1m;
                            C369458un A0O2 = interactiveDrawableContainer2.A0O(drawable3);
                            AnonymousClass5MH r55 = new AnonymousClass5MH(r8, r7, A022);
                            r55.A0A.setCallback(AnonymousClass8ME.A0C(r55, r2, r92));
                            AnonymousClass0eK r62 = r2.A1t;
                            r62.getClass();
                            C359318cb r82 = (C359318cb) r62.get();
                            ClipsCreationViewModel clipsCreationViewModel2 = r82.A0s;
                            ClipsCreationViewModel.A03(C359548d5.STICKER_TEXT_DUPLICATED, clipsCreationViewModel2, true);
                            clipsCreationViewModel2.A0N.A01(r55);
                            r82.A0T.removeCallbacksAndMessages((Object) null);
                            if (r2.A1B.CZe()) {
                                r2.A1q.add(r55);
                                if (r2.A1J.A0M()) {
                                    num = AnonymousClass05K.A0C;
                                }
                                r55.A03 = num;
                            }
                            int A0K2 = interactiveDrawableContainer2.A0K(r55, r92, C306406Ma.A0A(r55), false, false);
                            if (A0O2 != null) {
                                AEV.A01(A0O2, InteractiveDrawableContainer.A02(interactiveDrawableContainer2, A0K2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else {
                return;
            }
            r1.E3H(obj2);
            return;
        }
        AnonymousClass8ME.A0e(r2, true);
    }
}
