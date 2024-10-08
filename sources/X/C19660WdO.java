package X;

import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.WdO  reason: case insensitive filesystem */
public final class C19660WdO implements C3493580b {
    public final int A00;
    public final Object A01;

    public C19660WdO(WUW wuw, int i) {
        this.A00 = i;
        this.A01 = wuw;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        String str;
        if (this.A00 == 0) {
            AnonymousClass80V r10 = (AnonymousClass80V) obj2;
            if (obj == AnonymousClass80V.POST_CAPTURE_BOOMERANG_EDIT) {
                WUW.A00((WUW) this.A01);
            }
            if (r10 != null) {
                int ordinal = r10.ordinal();
                if (ordinal == 7) {
                    WUW wuw = (WUW) this.A01;
                    AnonymousClass0eM r2 = wuw.A0J;
                    ((C387669ma) r2.getValue()).A03(wuw.A0L);
                    ((C353308Hc) r2.getValue()).A01(true);
                    I09 i09 = wuw.A09;
                    AnonymousClass8HJ r1 = wuw.A0K;
                    0qQ.A0B(r1, 0);
                    C39735A7b a7b = (C39735A7b) i09.A04.get(r1);
                    if (a7b != null) {
                        int i = a7b.A02;
                        if (i == 0) {
                            i = 40;
                        }
                        float f = 20.0f / ((float) i);
                        FilmstripTimelineView filmstripTimelineView = wuw.A05;
                        str = "trimmerTimelineView";
                        if (filmstripTimelineView != null) {
                            filmstripTimelineView.setTrimmerMinimumRange(Pxi.A01(f, 1.0f, 0.0f));
                            FilmstripTimelineView filmstripTimelineView2 = wuw.A05;
                            if (filmstripTimelineView2 != null) {
                                C294975nL.A07(new View[]{filmstripTimelineView2}, false);
                                FilmstripTimelineView filmstripTimelineView3 = wuw.A05;
                                if (filmstripTimelineView3 != null) {
                                    0nA.A0t(filmstripTimelineView3, new C41347AsU(9, wuw, a7b));
                                    FilmstripTimelineView filmstripTimelineView4 = wuw.A05;
                                    if (filmstripTimelineView4 != null) {
                                        if (filmstripTimelineView4.getParent() instanceof View) {
                                            FilmstripTimelineView filmstripTimelineView5 = wuw.A05;
                                            if (filmstripTimelineView5 != null) {
                                                0nA.A0m(filmstripTimelineView5, JTR.A0U(filmstripTimelineView5));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    wuw.A0E.DV9(wuw);
                    return;
                } else if (ordinal == 11) {
                    WUW.A00((WUW) this.A01);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (obj == AnonymousClass80X.POST_CAPTURE) {
            WUW wuw2 = (WUW) this.A01;
            TextureView textureView = wuw2.A03;
            str = "trimmerPreviewViewHolder";
            if (textureView != null) {
                FrameLayout frameLayout = wuw2.A04;
                if (frameLayout != null) {
                    frameLayout.removeView(textureView);
                    wuw2.A03 = null;
                }
            }
            wuw2.A01 = 0;
            wuw2.A00 = 0;
            FrameLayout frameLayout2 = wuw2.A04;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
                wuw2.A03 = null;
                FilmstripTimelineView filmstripTimelineView6 = wuw2.A05;
                str = "trimmerTimelineView";
                if (filmstripTimelineView6 != null) {
                    C355308Pm r12 = filmstripTimelineView6.A0B;
                    B2X b2x = r12.A09;
                    if (b2x != null) {
                        b2x.reset();
                        r12.A09 = null;
                    }
                    FilmstripTimelineView filmstripTimelineView7 = wuw2.A05;
                    if (filmstripTimelineView7 != null) {
                        filmstripTimelineView7.A00 = null;
                        AnonymousClass8HJ r7 = AnonymousClass8HJ.NORMAL;
                        wuw2.A0L = r7;
                        I09 i092 = wuw2.A09;
                        Map map = i092.A04;
                        Iterator A0u = AnonymousClass7TF.A0u(map);
                        while (A0u.hasNext()) {
                            C39735A7b a7b2 = (C39735A7b) C51971G9r.A0p(A0u);
                            C39735A7b.A00(a7b2.A04);
                            C39735A7b.A00(a7b2.A05);
                        }
                        map.clear();
                        File file = i092.A01;
                        if (file != null) {
                            0mb.A08(file.getPath());
                        }
                        i092.A09 = r7;
                        I09.A00(new C20609Wvq(i092, 5));
                        ((C353308Hc) wuw2.A0J.getValue()).CL9(true);
                        AnonymousClass80U r22 = wuw2.A0F;
                        C3493580b r13 = wuw2.A0G;
                        AnonymousClass80T r23 = (AnonymousClass80T) r22;
                        0qQ.A0B(r13, 0);
                        r23.A01.A02.remove(r13);
                        C3493580b r14 = wuw2.A0H;
                        0qQ.A0B(r14, 0);
                        r23.A02.A02.remove(r14);
                        return;
                    }
                }
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
