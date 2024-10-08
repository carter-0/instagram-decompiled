package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.333  reason: invalid class name */
public final class AnonymousClass333 extends C249383je implements C252243on {
    public boolean A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A03;
    public final C228422le A04;
    public final UserSession A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9LP(this, 11));
    public final C231332rR A07;

    public AnonymousClass333(Fragment fragment, C228422le r4, UserSession userSession, C231332rR r6) {
        0qQ.A0B(r6, 1);
        this.A07 = r6;
        this.A03 = fragment;
        this.A05 = userSession;
        this.A04 = r4;
        this.A02 = fragment.getContext();
        this.A01 = fragment.getActivity();
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onPause() {
        if (this.A00 && !AnonymousClass1GD.A03()) {
            ((ValueAnimator) this.A06.getValue()).setCurrentPlayTime(0);
        }
    }

    public final void onResume() {
        if (this.A00 && !AnonymousClass1GD.A03()) {
            AnonymousClass0eM r0 = this.A06;
            ((ValueAnimator) r0.getValue()).setCurrentPlayTime(((Animator) r0.getValue()).getDuration());
        }
    }

    public final void onScroll(C238133Ar r10, int i, int i2, int i3, int i4, int i5) {
        int i6;
        ValueAnimator valueAnimator;
        long duration;
        int A032 = AnonymousClass0fD.A03(-368588224);
        0qQ.A0B(r10, 0);
        ViewGroup CEd = r10.CEd();
        0qQ.A0C(CEd, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) CEd;
        C252553pI r8 = recyclerView.A0D;
        if (r8 == null) {
            i6 = 2082667059;
        } else {
            AnonymousClass3W1 r5 = null;
            if (i != 0 || AnonymousClass1GD.A03() || !this.A00) {
                C231332rR r7 = this.A07;
                Object item = r7.getItem(i);
                if (item != null && (item instanceof 1Xl)) {
                    r5 = r7.BQr(((1Xl) item).BPf());
                }
                int i7 = i2 + i;
                while (true) {
                    if (i >= i7) {
                        break;
                    }
                    View A1D = r8.A1D(i);
                    if (A1D == null) {
                        i6 = -1929158160;
                        break;
                    }
                    float height = ((float) (recyclerView.getHeight() - A1D.getTop())) / ((float) A1D.getHeight());
                    Object item2 = r7.getItem(i);
                    if (item2 != null && (item2 instanceof 1Xl)) {
                        AnonymousClass3W1 BQr = r7.BQr(((1Xl) item2).BPf());
                        if (BQr.A2e) {
                            this.A00 = 0qQ.A0K(r5, BQr);
                            if (height >= 0.85f) {
                                if (i5 > 0 && item != null) {
                                    this.A04.A07(recyclerView);
                                }
                            } else if (i5 < 0 && r5 != null && !r5.A2e) {
                                this.A04.A07((RecyclerView) null);
                            }
                            if (!AnonymousClass1GD.A03()) {
                                if (0.6f > height || height > 1.0f) {
                                    int i8 = (height > 0.6f ? 1 : (height == 0.6f ? 0 : -1));
                                    AnonymousClass0eM r0 = this.A06;
                                    valueAnimator = (ValueAnimator) r0.getValue();
                                    if (i8 < 0) {
                                        duration = 0;
                                    } else {
                                        duration = ((Animator) r0.getValue()).getDuration();
                                    }
                                } else {
                                    AnonymousClass0eM r02 = this.A06;
                                    valueAnimator = (ValueAnimator) r02.getValue();
                                    duration = (long) (((height - 0.6f) / 0.39999998f) * ((float) ((Animator) r02.getValue()).getDuration()));
                                }
                                valueAnimator.setCurrentPlayTime(duration);
                            }
                        }
                    }
                    i++;
                }
                i6 = 836175539;
            } else {
                ((ValueAnimator) this.A06.getValue()).setCurrentPlayTime(0);
                this.A04.A07((RecyclerView) null);
                this.A00 = false;
                i6 = 1399832060;
            }
        }
        AnonymousClass0fD.A0A(i6, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(-1811936554, AnonymousClass0fD.A03(-364103816));
    }
}
