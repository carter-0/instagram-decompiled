package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Jdh  reason: case insensitive filesystem */
public final class C60031Jdh extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ C60591Jo0 A02;
    public final /* synthetic */ C60956JuE A03;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C60031Jdh(ImageView imageView, C60591Jo0 jo0, C60956JuE juE, int i) {
        this.A02 = jo0;
        this.A00 = i;
        this.A03 = juE;
        this.A01 = imageView;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        ImageView imageView = this.A01;
        Bitmap A0B = AnonymousClass7TF.A0B(imageView.getWidth(), imageView.getHeight());
        imageView.draw(JTO.A0B(A0B));
        C60591Jo0 jo0 = this.A02;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        GiphyClipsBrowserFragment giphyClipsBrowserFragment = jo0.A01;
        C60956JuE juE = this.A03;
        int i2 = this.A00;
        C59725JVj jVj = giphyClipsBrowserFragment.A00;
        String str = "giphyBrowserViewModel";
        if (jVj != null) {
            27r A0g = C51971G9r.A0g(giphyClipsBrowserFragment.A09);
            C60306Jj5 jj5 = giphyClipsBrowserFragment.A03;
            if (jj5 != null) {
                String str2 = ((C61077JwF) jj5.A09.getValue()).A01;
                String str3 = juE.A05;
                29R r1 = A0g.A09;
                Dba.A0j(1, str2, str3);
                1Ln A0N = JTO.A0N(r1);
                if (DbT.A1Y(A0N)) {
                    JTO.A1V(A0N);
                    AnonymousClass283 A0N2 = JTT.A0N(A0N, r1, "THIRD_PARTY_CLIP_HUB_LONG_PRESS_PREVIEW");
                    A0N.A0d(jVj);
                    JTU.A15(A0N, A0N2);
                    A0N.A0R("gif_category", str2);
                    A0N.A0R("gif_id", str3);
                    A0N.A0Q("gif_index", DbS.A0j(i2));
                    A0N.A0R("composition_str_id", A0N2.A0M);
                    JTS.A1E(A0N);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C64289LYp lYp = giphyClipsBrowserFragment.A04;
        if (lYp == null) {
            str = "peekController";
        } else {
            String str4 = juE.A05;
            C63879LAi lAi = juE.A01;
            float f = lAi.A01;
            float f2 = lAi.A00;
            0qQ.A0B(str4, 1);
            2cs r8 = lYp.A0G;
            if (r8.A0C()) {
                lYp.A06 = str4;
                lYp.A08 = true;
                ViewGroup viewGroup = lYp.A0D;
                Activity activity = lYp.A0B;
                ViewGroup viewGroup2 = lYp.A0E;
                viewGroup.setBackgroundDrawable(C232972uk.A00(activity, viewGroup2));
                lYp.A04 = imageView;
                Rect rect = lYp.A0C;
                imageView.getDrawingRect(rect);
                try {
                    viewGroup2.offsetDescendantRectToMyCoords(lYp.A04, rect);
                    float f3 = f / f2;
                    int width = imageView.getWidth();
                    lYp.A03 = width;
                    lYp.A02 = JTO.A05((float) width, f3);
                    int A012 = AnonymousClass1GB.A01(Math.min(((float) (viewGroup2.getWidth() - (lYp.A0A * 2))) / f3, AnonymousClass7TE.A03(viewGroup) * 0.75f));
                    lYp.A00 = A012;
                    lYp.A01 = AnonymousClass7TE.A06((float) A012, f3);
                    r8.A03();
                    2cv r0 = lYp.A05;
                    if (r0 == null) {
                        r0 = C324286z2.A00(imageView);
                        lYp.A05 = r0;
                    }
                    if (r0 != null) {
                        r0.CNi(lYp);
                        r0.setFocusable(true);
                    }
                    ImageView imageView2 = lYp.A0F;
                    imageView2.setImageBitmap(A0B);
                    imageView2.setVisibility(0);
                    lYp.A0I.setVisibility(0);
                } catch (IllegalArgumentException unused) {
                    lYp.A00();
                }
            }
            C60306Jj5 jj52 = giphyClipsBrowserFragment.A03;
            if (jj52 != null) {
                jj52.A03(giphyClipsBrowserFragment.requireContext(), AnonymousClass7TE.A0l(giphyClipsBrowserFragment.A09), juE, new C66312MMv(49, juE, giphyClipsBrowserFragment));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        View view;
        int A04;
        C60591Jo0 jo0 = this.A02;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        GiphyClipsBrowserFragment giphyClipsBrowserFragment = jo0.A01;
        int i2 = this.A00;
        C60956JuE juE = this.A03;
        RecyclerView recyclerView = giphyClipsBrowserFragment.giphyClipsRecyclerView;
        Integer num = null;
        if (recyclerView != null) {
            C252553pI r5 = recyclerView.A0D;
            if ((r5 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) r5) != null) {
                int[] iArr = new int[staggeredGridLayoutManager.A06];
                for (int i3 = 0; i3 < staggeredGridLayoutManager.A06; i3++) {
                    AnonymousClass9ND r7 = staggeredGridLayoutManager.A0H[i3];
                    boolean z = r7.A05.A0D;
                    int size = r7.A03.size();
                    if (z) {
                        A04 = r7.A04(size - 1, -1);
                    } else {
                        A04 = r7.A04(0, size);
                    }
                    iArr[i3] = A04;
                }
                0qQ.A0A(iArr);
                int length = iArr.length;
                if (length != 0) {
                    int i4 = iArr[0];
                    int i5 = Integer.MAX_VALUE;
                    int[] iArr2 = new int[2];
                    int i6 = 0;
                    do {
                        int i7 = iArr[i6];
                        C249703kE A0X = recyclerView.A0X(i7, false);
                        if (!(A0X == null || (view = A0X.itemView) == null)) {
                            view.getLocationOnScreen(iArr2);
                            int i8 = iArr2[0];
                            if (i8 < i5) {
                                i4 = i7;
                                i5 = i8;
                            } else if (i8 == i5) {
                                i4 = Math.min(i4, i7);
                            }
                        }
                        i6++;
                    } while (i6 < length);
                    num = Integer.valueOf(i4);
                }
            }
        }
        giphyClipsBrowserFragment.A05 = num;
        C60306Jj5 jj5 = giphyClipsBrowserFragment.A03;
        if (jj5 == null) {
            0qQ.A0F("giphyBrowserViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        Context requireContext = giphyClipsBrowserFragment.requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(giphyClipsBrowserFragment.A09);
        Integer num2 = giphyClipsBrowserFragment.A06;
        0qQ.A0B(A0l, 1);
        C59725JVj jVj = jj5.A02;
        if (jVj != null) {
            27r A012 = 27p.A01(A0l);
            String str = ((C61077JwF) jj5.A07.getValue()).A01;
            String str2 = juE.A05;
            29R r1 = A012.A09;
            Dba.A0j(1, str, str2);
            1Ln A0N = JTO.A0N(r1);
            if (DbT.A1Y(A0N)) {
                JTO.A1V(A0N);
                AnonymousClass283 A0N2 = JTT.A0N(A0N, r1, "THIRD_PARTY_CLIP_HUB_VIDEO_CELL_TAP");
                A0N.A0d(jVj);
                JTU.A15(A0N, A0N2);
                A0N.A0R("gif_category", str);
                A0N.A0R("gif_id", str2);
                A0N.A0Q("gif_index", DbS.A0j(i2));
                A0N.A0R("composition_str_id", A0N2.A0M);
                JTS.A1E(A0N);
            }
        }
        jj5.A01 = true;
        05G r14 = jj5.A06;
        Collection collection = (Collection) ((C361278fx) r14.getValue()).A01;
        if (collection != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(collection);
            C60956JuE juE2 = (C60956JuE) A1D.get(i2);
            Integer num3 = AnonymousClass05K.A0C;
            String str3 = juE2.A05;
            String str4 = juE2.A07;
            String str5 = juE2.A06;
            int i9 = juE2.A00;
            C63879LAi lAi = juE2.A01;
            C63879LAi lAi2 = juE2.A02;
            C39723A6o a6o = juE2.A03;
            Dba.A0j(1, str3, str4);
            C51974G9v.A0d(2, str5, lAi, lAi2, a6o);
            C63879LAi lAi3 = lAi2;
            C39723A6o a6o2 = a6o;
            C63879LAi lAi4 = lAi;
            A1D.set(i2, new C60956JuE(lAi4, lAi3, a6o2, num3, str3, str4, str5, i9));
            r14.Epw(new AnonymousClass8Y4(A1D));
        }
        int i10 = i2;
        jj5.A03(requireContext, A0l, juE, new GA0(i10, 1, requireContext, A0l, juE, jj5, num2));
        return true;
    }
}
