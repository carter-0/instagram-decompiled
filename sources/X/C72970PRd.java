package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PRd  reason: case insensitive filesystem */
public final class C72970PRd implements C273404mW {
    public float A00;
    public int A01 = -1;
    public Integer A02;
    public List A03 = AnonymousClass7TE.A1C();
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final AnonymousClass52S A08;
    public final RecyclerView A09;
    public final C70482O8h A0A;
    public final C70748OJu A0B;
    public final C70484O8j A0C;
    public final AnonymousClass52S A0D;
    public final AnonymousClass52S A0E;
    public final C70747OJt A0F;

    public C72970PRd(Context context, View view, RecyclerView recyclerView, C70482O8h o8h, C70747OJt oJt, C70748OJu oJu, C70484O8j o8j) {
        0qQ.A0B(oJu, 4);
        C51974G9v.A1N(o8j, oJt, o8h);
        this.A06 = context;
        this.A09 = recyclerView;
        this.A07 = view;
        this.A0B = oJu;
        this.A0C = o8j;
        this.A0F = oJt;
        this.A0A = o8h;
        int A062 = (0nA.A06(context) / 2) - AnonymousClass7TG.A03(context);
        float millis = ((float) TimeUnit.SECONDS.toMillis(5)) / AnonymousClass7TE.A01(context.getResources(), R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        this.A0E = new C67785Mup(context, 25.0f, A062);
        this.A0D = new C67785Mup(context, millis * ((float) 0nA.A0H(context).densityDpi), A062);
        this.A08 = new C67785Mup(context, 25.0f, A062 - (C66582MXn.A01(context) / 2));
        recyclerView.A15(new C67837Mvh(this, 12));
        recyclerView.A13(new C67616Mqo(this, 0));
        C71439Oke.A01(recyclerView, 9, new GestureDetector(recyclerView.getContext(), new N1R(this, 0)));
    }

    private final int A00(int i) {
        int width;
        View view;
        View view2;
        RecyclerView recyclerView = this.A09;
        C249703kE A0W = recyclerView.A0W(i);
        if (A0W == null || (view2 = A0W.itemView) == null) {
            this.A06.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        } else {
            view2.getWidth();
        }
        int[] iArr = new int[2];
        C249703kE A0W2 = recyclerView.A0W(i);
        if (!(A0W2 == null || (view = A0W2.itemView) == null)) {
            view.getLocationOnScreen(iArr);
        }
        Integer num = this.A02;
        if (num != null) {
            width = num.intValue();
        } else {
            int[] iArr2 = new int[2];
            View view3 = this.A07;
            view3.getLocationOnScreen(iArr2);
            width = iArr2[0] + (view3.getWidth() / 2);
            this.A02 = Integer.valueOf(width);
        }
        return width - iArr[0];
    }

    private final int A01(C68167N3h n3h) {
        C68188N5d n5d;
        int i = 0;
        for (C232262tL r2 : this.A03) {
            String str = null;
            if ((r2 instanceof C68188N5d) && (n5d = (C68188N5d) r2) != null) {
                str = n5d.A01;
            }
            if (0qQ.A0K(str, n3h.A01())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void A02(int i) {
        AnonymousClass52S r1;
        if (i != this.A01 + 1 || this.A00 <= 0.7f) {
            r1 = this.A0E;
        } else {
            r1 = this.A0D;
        }
        r1.A00 = i;
        C252553pI r0 = this.A09.A0D;
        if (r0 != null) {
            r0.A0t(r1);
        }
        this.A01 = i;
        this.A00 = 0.0f;
    }

    public static final void A03(C72970PRd pRd) {
        int width;
        int A032;
        int dimensionPixelSize;
        DirectVisualMessageViewerController directVisualMessageViewerController;
        View view;
        Integer num = pRd.A02;
        if (num != null) {
            width = num.intValue();
        } else {
            int[] iArr = new int[2];
            View view2 = pRd.A07;
            view2.getLocationOnScreen(iArr);
            width = iArr[0] + (view2.getWidth() / 2);
            pRd.A02 = Integer.valueOf(width);
        }
        RecyclerView recyclerView = pRd.A09;
        C252553pI r10 = recyclerView.A0D;
        if (r10 != null) {
            int[] iArr2 = new int[2];
            int A0T = r10.A0T();
            for (int i = 0; i < A0T; i++) {
                View A0X = r10.A0X(i);
                if (A0X != null) {
                    A0X.getLocationOnScreen(iArr2);
                    int width2 = A0X.getWidth();
                    int i2 = iArr2[0];
                    if (i2 <= width && i2 + width2 > width && (A032 = RecyclerView.A03(A0X)) != -1) {
                        if (A032 < pRd.A03.size() && (pRd.A03.get(A032) instanceof C68188N5d)) {
                            C249703kE A0W = recyclerView.A0W(A032);
                            if (A0W == null || (view = A0W.itemView) == null) {
                                dimensionPixelSize = pRd.A06.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
                            } else {
                                dimensionPixelSize = view.getWidth();
                            }
                            float A002 = ((float) pRd.A00(A032)) / ((float) dimensionPixelSize);
                            if (A032 != pRd.A01) {
                                pRd.A01 = A032;
                                Object obj = pRd.A03.get(A032);
                                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.visual.timeline.view.DirectVisualTimelineMessageViewModel");
                                pRd.A0F.A00(((C68188N5d) obj).A01);
                            }
                            C68445NIi nIi = pRd.A0B.A00;
                            C68463NJb A0R = nIi.getChildFragmentManager().A0R(nIi.A06);
                            if (!(A0R == null || !A0R.isResumed() || (directVisualMessageViewerController = A0R.A01) == null)) {
                                C68167N3h A022 = DirectVisualMessageViewerController.A02(directVisualMessageViewerController);
                                if (A022 == null || !AnonymousClass7TF.A1W(A022.A0B, 1iA.A0a)) {
                                    AnonymousClass6g5 r0 = directVisualMessageViewerController.photoTimerController;
                                    if (r0 != null) {
                                        r0.A00 = A002;
                                    }
                                } else {
                                    C72980PRn pRn = directVisualMessageViewerController.videoPlayer;
                                    if (pRn != null) {
                                        pRn.A00(A002);
                                    }
                                }
                            }
                            pRd.A00 = A002;
                            return;
                        } else if ((A032 >= pRd.A03.size() || (pRd.A03.get(A032) instanceof NPI) || (pRd.A03.get(A032) instanceof C68598NOu)) && pRd.A01 != -1) {
                            C68445NIi.A00(pRd.A0A.A00);
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DaM(Object obj) {
        int i;
        C68167N3h n3h = (C68167N3h) obj;
        0qQ.A0B(n3h, 0);
        int A012 = A01(n3h);
        int i2 = -1;
        if (A012 != -1 && (i = A012 + 1) < this.A03.size()) {
            if (A012 == this.A01 && (this.A03.get(i) instanceof C68188N5d)) {
                A02(i);
            } else if (this.A05 && !this.A04) {
                ListIterator A18 = C51968G9o.A18(this.A03);
                while (true) {
                    if (A18.hasPrevious()) {
                        if (A18.previous() instanceof C68188N5d) {
                            i2 = A18.nextIndex();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (A012 == i2) {
                    C68445NIi.A01(this.A0B.A00);
                    C68445NIi.A00(this.A0A.A00);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DaO(Object obj) {
        C68167N3h n3h = (C68167N3h) obj;
        0qQ.A0B(n3h, 0);
        int A012 = A01(n3h);
        if (A012 != -1 && this.A01 != A012) {
            A02(A012);
        }
    }

    public final /* bridge */ /* synthetic */ void DaT(Object obj, float f) {
        int dimensionPixelSize;
        View view;
        C68167N3h n3h = (C68167N3h) obj;
        0qQ.A0B(n3h, 0);
        int A012 = A01(n3h);
        if (A012 != -1) {
            RecyclerView recyclerView = this.A09;
            C249703kE A0W = recyclerView.A0W(A012);
            if (A0W == null || (view = A0W.itemView) == null) {
                dimensionPixelSize = this.A06.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
            } else {
                dimensionPixelSize = view.getWidth();
            }
            int A002 = ((int) (((float) dimensionPixelSize) * f)) - A00(this.A01);
            C252553pI r0 = recyclerView.A0D;
            if (r0 != null) {
                AnonymousClass52T r02 = r0.A06;
                if ((r02 == null || !r02.A05) && !this.A04) {
                    this.A00 = f;
                    recyclerView.scrollBy(A002, 0);
                }
            }
        }
    }
}
