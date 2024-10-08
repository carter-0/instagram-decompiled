package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.viewer.GiphyAttributionFragment;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;

/* renamed from: X.FPd  reason: case insensitive filesystem */
public final class C50113FPd implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public C50113FPd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        switch (this.A00) {
            case 0:
                GiphyAttributionFragment giphyAttributionFragment = (GiphyAttributionFragment) this.A01;
                RecyclerView recyclerView2 = giphyAttributionFragment.recycler;
                if (recyclerView2 != null) {
                    C252553pI r1 = recyclerView2.A0D;
                    if ((!(r1 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) r1) == null || linearLayoutManager.A1c() != 0) && motionEvent.getAction() == 0 && (recyclerView = giphyAttributionFragment.recycler) != null) {
                        recyclerView.requestDisallowInterceptTouchEvent(true);
                        break;
                    }
                }
                break;
            case 1:
                if (view.getId() == R.id.additional_details_edittext) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    if ((motionEvent.getAction() & 255) == 2) {
                        view.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                    }
                }
                break;
            case 4:
                0qQ.A0B(motionEvent, 1);
                if (motionEvent.getAction() == 0) {
                    C46564Dh6 dh6 = (C46564Dh6) this.A01;
                    AnonymousClass92f A002 = C3727392e.A00(dh6.A01);
                    Context context = dh6.A00;
                    String str = dh6.A02;
                    if (182.A06(0Tu.A05, A002.A01, 36328216370101329L)) {
                        A002.A08(context, str, true, false);
                        break;
                    }
                }
                break;
            case 5:
                C64183LSq lSq = (C64183LSq) this.A01;
                C352838Ff r2 = (C352838Ff) lSq.A08.A0F.getValue();
                boolean z = r2.A02;
                if (!z) {
                    return z;
                }
                C352838Ff.A03(new FkD(false), r2);
                AnonymousClass7TH.A06(lSq.A0L).performClick();
                return z;
            case 6:
                if (motionEvent.getAction() == 1) {
                    C46723DkC dkC = (C46723DkC) this.A01;
                    if (!dkC.A01) {
                        dkC.A01 = true;
                        if (dkC.A02) {
                            dkC.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.token_delete, 0);
                        }
                        G6W g6w = dkC.A00;
                        if (g6w != null) {
                            0qQ.A0A(view);
                            C50423FbW fbW = ((C51009Fmw) g6w).A00;
                            if (fbW.A0A) {
                                SearchWithDeleteEditText searchWithDeleteEditText = fbW.A07;
                                searchWithDeleteEditText.requestFocus();
                                0nA.A0Q(searchWithDeleteEditText);
                                break;
                            }
                        }
                    } else {
                        G6W g6w2 = dkC.A00;
                        if (g6w2 == null) {
                            return true;
                        }
                        0qQ.A0A(view);
                        g6w2.D8H(view);
                        return true;
                    }
                }
                break;
            default:
                0qQ.A0A(view);
                0qQ.A0A(motionEvent);
                ((0sL) this.A01).invoke(view, motionEvent);
                break;
        }
        return false;
    }
}
